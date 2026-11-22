// Generated from Compose declarations by generate.mjs.
package com.jetpackcomposereactnative.generated

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.animation.AnimatedVisibility as composeScoped0
import androidx.compose.material3.FloatingActionButtonMenuItem as composeScoped1
import androidx.compose.material3.NavigationBarItem as composeScoped2
import androidx.compose.material3.PlainTooltip as composeScoped3
import androidx.compose.material3.RichTooltip as composeScoped4
import androidx.compose.material3.SegmentedButton as composeScoped5

// androidx.compose.material3.RangeSlider(value: kotlin.ranges.ClosedFloatingPointRange<kotlin.Float>, onValueChange: kotlin.Function1<kotlin.ranges.ClosedFloatingPointRange<kotlin.Float>, kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, valueRange: kotlin.ranges.ClosedFloatingPointRange<kotlin.Float>, onValueChangeFinished: kotlin.Function0<kotlin.Unit>?, colors: androidx.compose.material3.SliderColors, startInteractionSource: androidx.compose.foundation.interaction.MutableInteractionSource, endInteractionSource: androidx.compose.foundation.interaction.MutableInteractionSource, startThumb: kotlin.Function1<androidx.compose.material3.RangeSliderState, kotlin.Unit>, endThumb: kotlin.Function1<androidx.compose.material3.RangeSliderState, kotlin.Unit>, track: kotlin.Function1<androidx.compose.material3.RangeSliderState, kotlin.Unit>, steps: kotlin.Int)
internal object RendererRangeSlider_2 {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("valueRange")) 2 else 0) +
      (if (node.has("onValueChangeFinished")) 4 else 0) +
      (if (node.has("startInteractionSource")) 8 else 0) +
      (if (node.has("endInteractionSource")) 16 else 0) +
      (if (node.has("steps")) 32 else 0)
    when (mask / 32) {
      0 -> renderRangeSlider_2Group0(node, scope, mask)
      1 -> renderRangeSlider_2Group1(node, scope, mask)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderRangeSlider_2Group0(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      8 -> androidx.compose.material3.RangeSlider(
        `value` = node.arguments().floatRange("value"),
        `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) },
        `modifier` = node.modifier("modifier", scope),
        `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(),
      )
      9 -> androidx.compose.material3.RangeSlider(
        `value` = node.arguments().floatRange("value"),
        `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(),
      )
      10 -> androidx.compose.material3.RangeSlider(
        `value` = node.arguments().floatRange("value"),
        `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) },
        `modifier` = node.modifier("modifier", scope),
        `valueRange` = node.arguments().floatRange("valueRange"),
        `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(),
      )
      11 -> androidx.compose.material3.RangeSlider(
        `value` = node.arguments().floatRange("value"),
        `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `valueRange` = node.arguments().floatRange("valueRange"),
        `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(),
      )
      12 -> androidx.compose.material3.RangeSlider(
        `value` = node.arguments().floatRange("value"),
        `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) },
        `modifier` = node.modifier("modifier", scope),
        `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }),
        `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(),
      )
      13 -> androidx.compose.material3.RangeSlider(
        `value` = node.arguments().floatRange("value"),
        `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }),
        `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(),
      )
      14 -> androidx.compose.material3.RangeSlider(
        `value` = node.arguments().floatRange("value"),
        `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) },
        `modifier` = node.modifier("modifier", scope),
        `valueRange` = node.arguments().floatRange("valueRange"),
        `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }),
        `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(),
      )
      15 -> androidx.compose.material3.RangeSlider(
        `value` = node.arguments().floatRange("value"),
        `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `valueRange` = node.arguments().floatRange("valueRange"),
        `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }),
        `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(),
      )
      16 -> androidx.compose.material3.RangeSlider(
        `value` = node.arguments().floatRange("value"),
        `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) },
        `modifier` = node.modifier("modifier", scope),
        `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource(),
      )
      17 -> androidx.compose.material3.RangeSlider(
        `value` = node.arguments().floatRange("value"),
        `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource(),
      )
      18 -> androidx.compose.material3.RangeSlider(
        `value` = node.arguments().floatRange("value"),
        `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) },
        `modifier` = node.modifier("modifier", scope),
        `valueRange` = node.arguments().floatRange("valueRange"),
        `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource(),
      )
      19 -> androidx.compose.material3.RangeSlider(
        `value` = node.arguments().floatRange("value"),
        `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `valueRange` = node.arguments().floatRange("valueRange"),
        `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource(),
      )
      20 -> androidx.compose.material3.RangeSlider(
        `value` = node.arguments().floatRange("value"),
        `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) },
        `modifier` = node.modifier("modifier", scope),
        `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }),
        `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource(),
      )
      21 -> androidx.compose.material3.RangeSlider(
        `value` = node.arguments().floatRange("value"),
        `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }),
        `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource(),
      )
      22 -> androidx.compose.material3.RangeSlider(
        `value` = node.arguments().floatRange("value"),
        `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) },
        `modifier` = node.modifier("modifier", scope),
        `valueRange` = node.arguments().floatRange("valueRange"),
        `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }),
        `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource(),
      )
      23 -> androidx.compose.material3.RangeSlider(
        `value` = node.arguments().floatRange("value"),
        `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `valueRange` = node.arguments().floatRange("valueRange"),
        `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }),
        `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource(),
      )
      24 -> androidx.compose.material3.RangeSlider(
        `value` = node.arguments().floatRange("value"),
        `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) },
        `modifier` = node.modifier("modifier", scope),
        `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(),
        `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource(),
      )
      25 -> androidx.compose.material3.RangeSlider(
        `value` = node.arguments().floatRange("value"),
        `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(),
        `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource(),
      )
      26 -> androidx.compose.material3.RangeSlider(
        `value` = node.arguments().floatRange("value"),
        `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) },
        `modifier` = node.modifier("modifier", scope),
        `valueRange` = node.arguments().floatRange("valueRange"),
        `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(),
        `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource(),
      )
      27 -> androidx.compose.material3.RangeSlider(
        `value` = node.arguments().floatRange("value"),
        `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `valueRange` = node.arguments().floatRange("valueRange"),
        `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(),
        `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource(),
      )
      28 -> androidx.compose.material3.RangeSlider(
        `value` = node.arguments().floatRange("value"),
        `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) },
        `modifier` = node.modifier("modifier", scope),
        `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }),
        `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(),
        `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource(),
      )
      29 -> androidx.compose.material3.RangeSlider(
        `value` = node.arguments().floatRange("value"),
        `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }),
        `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(),
        `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource(),
      )
      30 -> androidx.compose.material3.RangeSlider(
        `value` = node.arguments().floatRange("value"),
        `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) },
        `modifier` = node.modifier("modifier", scope),
        `valueRange` = node.arguments().floatRange("valueRange"),
        `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }),
        `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(),
        `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource(),
      )
      31 -> androidx.compose.material3.RangeSlider(
        `value` = node.arguments().floatRange("value"),
        `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `valueRange` = node.arguments().floatRange("valueRange"),
        `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }),
        `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(),
        `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderRangeSlider_2Group1(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      40 -> androidx.compose.material3.RangeSlider(
        `value` = node.arguments().floatRange("value"),
        `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) },
        `modifier` = node.modifier("modifier", scope),
        `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(),
        `steps` = node.number("steps").toInt(),
      )
      41 -> androidx.compose.material3.RangeSlider(
        `value` = node.arguments().floatRange("value"),
        `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(),
        `steps` = node.number("steps").toInt(),
      )
      42 -> androidx.compose.material3.RangeSlider(
        `value` = node.arguments().floatRange("value"),
        `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) },
        `modifier` = node.modifier("modifier", scope),
        `valueRange` = node.arguments().floatRange("valueRange"),
        `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(),
        `steps` = node.number("steps").toInt(),
      )
      43 -> androidx.compose.material3.RangeSlider(
        `value` = node.arguments().floatRange("value"),
        `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `valueRange` = node.arguments().floatRange("valueRange"),
        `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(),
        `steps` = node.number("steps").toInt(),
      )
      44 -> androidx.compose.material3.RangeSlider(
        `value` = node.arguments().floatRange("value"),
        `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) },
        `modifier` = node.modifier("modifier", scope),
        `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }),
        `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(),
        `steps` = node.number("steps").toInt(),
      )
      45 -> androidx.compose.material3.RangeSlider(
        `value` = node.arguments().floatRange("value"),
        `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }),
        `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(),
        `steps` = node.number("steps").toInt(),
      )
      46 -> androidx.compose.material3.RangeSlider(
        `value` = node.arguments().floatRange("value"),
        `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) },
        `modifier` = node.modifier("modifier", scope),
        `valueRange` = node.arguments().floatRange("valueRange"),
        `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }),
        `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(),
        `steps` = node.number("steps").toInt(),
      )
      47 -> androidx.compose.material3.RangeSlider(
        `value` = node.arguments().floatRange("value"),
        `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `valueRange` = node.arguments().floatRange("valueRange"),
        `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }),
        `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(),
        `steps` = node.number("steps").toInt(),
      )
      48 -> androidx.compose.material3.RangeSlider(
        `value` = node.arguments().floatRange("value"),
        `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) },
        `modifier` = node.modifier("modifier", scope),
        `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource(),
        `steps` = node.number("steps").toInt(),
      )
      49 -> androidx.compose.material3.RangeSlider(
        `value` = node.arguments().floatRange("value"),
        `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource(),
        `steps` = node.number("steps").toInt(),
      )
      50 -> androidx.compose.material3.RangeSlider(
        `value` = node.arguments().floatRange("value"),
        `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) },
        `modifier` = node.modifier("modifier", scope),
        `valueRange` = node.arguments().floatRange("valueRange"),
        `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource(),
        `steps` = node.number("steps").toInt(),
      )
      51 -> androidx.compose.material3.RangeSlider(
        `value` = node.arguments().floatRange("value"),
        `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `valueRange` = node.arguments().floatRange("valueRange"),
        `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource(),
        `steps` = node.number("steps").toInt(),
      )
      52 -> androidx.compose.material3.RangeSlider(
        `value` = node.arguments().floatRange("value"),
        `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) },
        `modifier` = node.modifier("modifier", scope),
        `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }),
        `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource(),
        `steps` = node.number("steps").toInt(),
      )
      53 -> androidx.compose.material3.RangeSlider(
        `value` = node.arguments().floatRange("value"),
        `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }),
        `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource(),
        `steps` = node.number("steps").toInt(),
      )
      54 -> androidx.compose.material3.RangeSlider(
        `value` = node.arguments().floatRange("value"),
        `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) },
        `modifier` = node.modifier("modifier", scope),
        `valueRange` = node.arguments().floatRange("valueRange"),
        `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }),
        `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource(),
        `steps` = node.number("steps").toInt(),
      )
      55 -> androidx.compose.material3.RangeSlider(
        `value` = node.arguments().floatRange("value"),
        `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `valueRange` = node.arguments().floatRange("valueRange"),
        `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }),
        `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource(),
        `steps` = node.number("steps").toInt(),
      )
      56 -> androidx.compose.material3.RangeSlider(
        `value` = node.arguments().floatRange("value"),
        `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) },
        `modifier` = node.modifier("modifier", scope),
        `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(),
        `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource(),
        `steps` = node.number("steps").toInt(),
      )
      57 -> androidx.compose.material3.RangeSlider(
        `value` = node.arguments().floatRange("value"),
        `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(),
        `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource(),
        `steps` = node.number("steps").toInt(),
      )
      58 -> androidx.compose.material3.RangeSlider(
        `value` = node.arguments().floatRange("value"),
        `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) },
        `modifier` = node.modifier("modifier", scope),
        `valueRange` = node.arguments().floatRange("valueRange"),
        `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(),
        `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource(),
        `steps` = node.number("steps").toInt(),
      )
      59 -> androidx.compose.material3.RangeSlider(
        `value` = node.arguments().floatRange("value"),
        `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `valueRange` = node.arguments().floatRange("valueRange"),
        `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(),
        `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource(),
        `steps` = node.number("steps").toInt(),
      )
      60 -> androidx.compose.material3.RangeSlider(
        `value` = node.arguments().floatRange("value"),
        `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) },
        `modifier` = node.modifier("modifier", scope),
        `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }),
        `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(),
        `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource(),
        `steps` = node.number("steps").toInt(),
      )
      61 -> androidx.compose.material3.RangeSlider(
        `value` = node.arguments().floatRange("value"),
        `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }),
        `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(),
        `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource(),
        `steps` = node.number("steps").toInt(),
      )
      62 -> androidx.compose.material3.RangeSlider(
        `value` = node.arguments().floatRange("value"),
        `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) },
        `modifier` = node.modifier("modifier", scope),
        `valueRange` = node.arguments().floatRange("valueRange"),
        `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }),
        `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(),
        `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource(),
        `steps` = node.number("steps").toInt(),
      )
      63 -> androidx.compose.material3.RangeSlider(
        `value` = node.arguments().floatRange("value"),
        `onValueChange` = { value: ClosedFloatingPointRange<Float> -> node.emit("onValueChange", org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `valueRange` = node.arguments().floatRange("valueRange"),
        `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }),
        `startInteractionSource` = node.jsonObject("startInteractionSource").rememberComposeInteractionSource(),
        `endInteractionSource` = node.jsonObject("endInteractionSource").rememberComposeInteractionSource(),
        `steps` = node.number("steps").toInt(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.runtime.ReusableContentHost(active: kotlin.Boolean, content: kotlin.Function0<kotlin.Unit>)
internal object RendererReusableContentHost {
  @Composable
  fun render(node: ComposeNode) {
    androidx.compose.runtime.ReusableContentHost(
      `active` = node.boolean("active"),
      content = { RenderComposeChildren(node.children) },
    )
  }
}

// androidx.compose.material3.RichTooltip [receiver: androidx.compose.material3.TooltipScope](modifier: androidx.compose.ui.Modifier, title: kotlin.Function0<kotlin.Unit>?, action: kotlin.Function0<kotlin.Unit>?, caretSize: androidx.compose.ui.unit.DpSize, maxWidth: androidx.compose.ui.unit.Dp, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.RichTooltipColors, tonalElevation: androidx.compose.ui.unit.Dp, shadowElevation: androidx.compose.ui.unit.Dp, text: kotlin.Function0<kotlin.Unit>)
internal object RendererRichTooltip {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  fun render(node: ComposeNode, scope: androidx.compose.material3.TooltipScope) {
    val mask = (if (node.has("title")) 1 else 0) +
      (if (node.has("action")) 2 else 0) +
      (if (node.has("caretSize")) 4 else 0) +
      (if (node.has("maxWidth")) 8 else 0) +
      (if (node.has("shape")) 16 else 0) +
      (if (node.has("tonalElevation")) 32 else 0) +
      (if (node.has("shadowElevation")) 64 else 0)
    when (mask / 32) {
      0 -> renderRichTooltipGroup0(node, scope, mask)
      1 -> renderRichTooltipGroup1(node, scope, mask)
      2 -> renderRichTooltipGroup2(node, scope, mask)
      3 -> renderRichTooltipGroup3(node, scope, mask)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderRichTooltipGroup0(node: ComposeNode, scope: androidx.compose.material3.TooltipScope, mask: Int) {
    when (mask) {
      0 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      1 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      2 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      3 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      4 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      5 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      6 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      7 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      8 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `maxWidth` = node.number("maxWidth").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      9 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `maxWidth` = node.number("maxWidth").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      10 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `maxWidth` = node.number("maxWidth").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      11 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `maxWidth` = node.number("maxWidth").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      12 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `maxWidth` = node.number("maxWidth").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      13 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `maxWidth` = node.number("maxWidth").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      14 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `maxWidth` = node.number("maxWidth").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      15 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `maxWidth` = node.number("maxWidth").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      16 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      17 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      18 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `shape` = node.arguments().shape("shape"),
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      19 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `shape` = node.arguments().shape("shape"),
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      20 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `shape` = node.arguments().shape("shape"),
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      21 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `shape` = node.arguments().shape("shape"),
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      22 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `shape` = node.arguments().shape("shape"),
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      23 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `shape` = node.arguments().shape("shape"),
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      24 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `maxWidth` = node.number("maxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      25 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `maxWidth` = node.number("maxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      26 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `maxWidth` = node.number("maxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      27 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `maxWidth` = node.number("maxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      28 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `maxWidth` = node.number("maxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      29 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `maxWidth` = node.number("maxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      30 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `maxWidth` = node.number("maxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      31 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `maxWidth` = node.number("maxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderRichTooltipGroup1(node: ComposeNode, scope: androidx.compose.material3.TooltipScope, mask: Int) {
    when (mask) {
      32 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      33 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      34 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      35 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      36 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `tonalElevation` = node.number("tonalElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      37 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `tonalElevation` = node.number("tonalElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      38 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `tonalElevation` = node.number("tonalElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      39 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `tonalElevation` = node.number("tonalElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      40 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `maxWidth` = node.number("maxWidth").dp,
        `tonalElevation` = node.number("tonalElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      41 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `maxWidth` = node.number("maxWidth").dp,
        `tonalElevation` = node.number("tonalElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      42 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `maxWidth` = node.number("maxWidth").dp,
        `tonalElevation` = node.number("tonalElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      43 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `maxWidth` = node.number("maxWidth").dp,
        `tonalElevation` = node.number("tonalElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      44 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `maxWidth` = node.number("maxWidth").dp,
        `tonalElevation` = node.number("tonalElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      45 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `maxWidth` = node.number("maxWidth").dp,
        `tonalElevation` = node.number("tonalElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      46 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `maxWidth` = node.number("maxWidth").dp,
        `tonalElevation` = node.number("tonalElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      47 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `maxWidth` = node.number("maxWidth").dp,
        `tonalElevation` = node.number("tonalElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      48 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      49 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      50 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      51 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      52 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      53 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      54 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      55 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      56 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `maxWidth` = node.number("maxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      57 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `maxWidth` = node.number("maxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      58 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `maxWidth` = node.number("maxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      59 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `maxWidth` = node.number("maxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      60 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `maxWidth` = node.number("maxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      61 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `maxWidth` = node.number("maxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      62 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `maxWidth` = node.number("maxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      63 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `maxWidth` = node.number("maxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderRichTooltipGroup2(node: ComposeNode, scope: androidx.compose.material3.TooltipScope, mask: Int) {
    when (mask) {
      64 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `shadowElevation` = node.number("shadowElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      65 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shadowElevation` = node.number("shadowElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      66 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `shadowElevation` = node.number("shadowElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      67 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `shadowElevation` = node.number("shadowElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      68 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `shadowElevation` = node.number("shadowElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      69 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `shadowElevation` = node.number("shadowElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      70 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `shadowElevation` = node.number("shadowElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      71 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `shadowElevation` = node.number("shadowElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      72 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `maxWidth` = node.number("maxWidth").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      73 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `maxWidth` = node.number("maxWidth").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      74 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `maxWidth` = node.number("maxWidth").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      75 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `maxWidth` = node.number("maxWidth").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      76 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `maxWidth` = node.number("maxWidth").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      77 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `maxWidth` = node.number("maxWidth").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      78 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `maxWidth` = node.number("maxWidth").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      79 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `maxWidth` = node.number("maxWidth").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      80 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `shadowElevation` = node.number("shadowElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      81 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `shadowElevation` = node.number("shadowElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      82 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `shape` = node.arguments().shape("shape"),
        `shadowElevation` = node.number("shadowElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      83 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `shape` = node.arguments().shape("shape"),
        `shadowElevation` = node.number("shadowElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      84 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `shape` = node.arguments().shape("shape"),
        `shadowElevation` = node.number("shadowElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      85 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `shape` = node.arguments().shape("shape"),
        `shadowElevation` = node.number("shadowElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      86 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `shape` = node.arguments().shape("shape"),
        `shadowElevation` = node.number("shadowElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      87 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `shape` = node.arguments().shape("shape"),
        `shadowElevation` = node.number("shadowElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      88 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `maxWidth` = node.number("maxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `shadowElevation` = node.number("shadowElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      89 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `maxWidth` = node.number("maxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `shadowElevation` = node.number("shadowElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      90 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `maxWidth` = node.number("maxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `shadowElevation` = node.number("shadowElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      91 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `maxWidth` = node.number("maxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `shadowElevation` = node.number("shadowElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      92 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `maxWidth` = node.number("maxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `shadowElevation` = node.number("shadowElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      93 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `maxWidth` = node.number("maxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `shadowElevation` = node.number("shadowElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      94 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `maxWidth` = node.number("maxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `shadowElevation` = node.number("shadowElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      95 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `maxWidth` = node.number("maxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `shadowElevation` = node.number("shadowElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  private fun renderRichTooltipGroup3(node: ComposeNode, scope: androidx.compose.material3.TooltipScope, mask: Int) {
    when (mask) {
      96 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      97 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      98 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      99 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      100 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      101 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      102 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      103 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      104 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `maxWidth` = node.number("maxWidth").dp,
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      105 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `maxWidth` = node.number("maxWidth").dp,
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      106 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `maxWidth` = node.number("maxWidth").dp,
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      107 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `maxWidth` = node.number("maxWidth").dp,
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      108 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `maxWidth` = node.number("maxWidth").dp,
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      109 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `maxWidth` = node.number("maxWidth").dp,
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      110 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `maxWidth` = node.number("maxWidth").dp,
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      111 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `maxWidth` = node.number("maxWidth").dp,
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      112 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      113 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      114 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      115 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      116 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      117 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      118 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      119 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      120 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `maxWidth` = node.number("maxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      121 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `maxWidth` = node.number("maxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      122 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `maxWidth` = node.number("maxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      123 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `maxWidth` = node.number("maxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      124 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `maxWidth` = node.number("maxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      125 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `maxWidth` = node.number("maxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      126 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `maxWidth` = node.number("maxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      127 -> scope.composeScoped4(
        `modifier` = node.modifier("modifier", scope),
        `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `caretSize` = node.jsonObject("caretSize").toDpSize(),
        `maxWidth` = node.number("maxWidth").dp,
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `text` = { RenderComposeChildren(node.slot("text")) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.foundation.layout.Row(modifier: androidx.compose.ui.Modifier, horizontalArrangement: androidx.compose.foundation.layout.Arrangement.Horizontal, verticalAlignment: androidx.compose.ui.Alignment.Vertical, content: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>)
internal object RendererRow {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("horizontalArrangement")) 1 else 0) +
      (if (node.has("verticalAlignment")) 2 else 0)
    when (mask) {
      0 -> androidx.compose.foundation.layout.Row(
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.foundation.layout.Row(
        `modifier` = node.modifier("modifier", scope),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        content = { RenderComposeChildren(node.children, this) },
      )
      2 -> androidx.compose.foundation.layout.Row(
        `modifier` = node.modifier("modifier", scope),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.foundation.layout.Row(
        `modifier` = node.modifier("modifier", scope),
        `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
        `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.Scaffold(modifier: androidx.compose.ui.Modifier, topBar: kotlin.Function0<kotlin.Unit>, bottomBar: kotlin.Function0<kotlin.Unit>, snackbarHost: kotlin.Function0<kotlin.Unit>, floatingActionButton: kotlin.Function0<kotlin.Unit>, floatingActionButtonPosition: androidx.compose.material3.FabPosition, containerColor: androidx.compose.ui.graphics.Color, contentColor: androidx.compose.ui.graphics.Color, contentWindowInsets: androidx.compose.foundation.layout.WindowInsets, content: kotlin.Function1<androidx.compose.foundation.layout.PaddingValues, kotlin.Unit>)
internal object RendererScaffold {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("topBar")) 1 else 0) +
      (if (node.has("bottomBar")) 2 else 0) +
      (if (node.has("snackbarHost")) 4 else 0) +
      (if (node.has("floatingActionButton")) 8 else 0) +
      (if (node.has("containerColor")) 16 else 0) +
      (if (node.has("contentColor")) 32 else 0) +
      (if (node.has("contentWindowInsets")) 64 else 0)
    when (mask / 32) {
      0 -> renderScaffoldGroup0(node, scope, mask)
      1 -> renderScaffoldGroup1(node, scope, mask)
      2 -> renderScaffoldGroup2(node, scope, mask)
      3 -> renderScaffoldGroup3(node, scope, mask)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderScaffoldGroup0(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      0 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      1 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `topBar` = { RenderComposeChildren(node.slot("topBar")) },
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      2 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `bottomBar` = { RenderComposeChildren(node.slot("bottomBar")) },
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      3 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `topBar` = { RenderComposeChildren(node.slot("topBar")) },
        `bottomBar` = { RenderComposeChildren(node.slot("bottomBar")) },
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      4 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `snackbarHost` = { RenderComposeChildren(node.slot("snackbarHost")) },
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      5 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `topBar` = { RenderComposeChildren(node.slot("topBar")) },
        `snackbarHost` = { RenderComposeChildren(node.slot("snackbarHost")) },
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      6 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `bottomBar` = { RenderComposeChildren(node.slot("bottomBar")) },
        `snackbarHost` = { RenderComposeChildren(node.slot("snackbarHost")) },
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      7 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `topBar` = { RenderComposeChildren(node.slot("topBar")) },
        `bottomBar` = { RenderComposeChildren(node.slot("bottomBar")) },
        `snackbarHost` = { RenderComposeChildren(node.slot("snackbarHost")) },
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      8 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      9 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `topBar` = { RenderComposeChildren(node.slot("topBar")) },
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      10 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `bottomBar` = { RenderComposeChildren(node.slot("bottomBar")) },
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      11 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `topBar` = { RenderComposeChildren(node.slot("topBar")) },
        `bottomBar` = { RenderComposeChildren(node.slot("bottomBar")) },
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      12 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `snackbarHost` = { RenderComposeChildren(node.slot("snackbarHost")) },
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      13 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `topBar` = { RenderComposeChildren(node.slot("topBar")) },
        `snackbarHost` = { RenderComposeChildren(node.slot("snackbarHost")) },
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      14 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `bottomBar` = { RenderComposeChildren(node.slot("bottomBar")) },
        `snackbarHost` = { RenderComposeChildren(node.slot("snackbarHost")) },
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      15 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `topBar` = { RenderComposeChildren(node.slot("topBar")) },
        `bottomBar` = { RenderComposeChildren(node.slot("bottomBar")) },
        `snackbarHost` = { RenderComposeChildren(node.slot("snackbarHost")) },
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      16 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      17 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `topBar` = { RenderComposeChildren(node.slot("topBar")) },
        `containerColor` = node.color("containerColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      18 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `bottomBar` = { RenderComposeChildren(node.slot("bottomBar")) },
        `containerColor` = node.color("containerColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      19 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `topBar` = { RenderComposeChildren(node.slot("topBar")) },
        `bottomBar` = { RenderComposeChildren(node.slot("bottomBar")) },
        `containerColor` = node.color("containerColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      20 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `snackbarHost` = { RenderComposeChildren(node.slot("snackbarHost")) },
        `containerColor` = node.color("containerColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      21 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `topBar` = { RenderComposeChildren(node.slot("topBar")) },
        `snackbarHost` = { RenderComposeChildren(node.slot("snackbarHost")) },
        `containerColor` = node.color("containerColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      22 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `bottomBar` = { RenderComposeChildren(node.slot("bottomBar")) },
        `snackbarHost` = { RenderComposeChildren(node.slot("snackbarHost")) },
        `containerColor` = node.color("containerColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      23 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `topBar` = { RenderComposeChildren(node.slot("topBar")) },
        `bottomBar` = { RenderComposeChildren(node.slot("bottomBar")) },
        `snackbarHost` = { RenderComposeChildren(node.slot("snackbarHost")) },
        `containerColor` = node.color("containerColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      24 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `containerColor` = node.color("containerColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      25 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `topBar` = { RenderComposeChildren(node.slot("topBar")) },
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `containerColor` = node.color("containerColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      26 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `bottomBar` = { RenderComposeChildren(node.slot("bottomBar")) },
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `containerColor` = node.color("containerColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      27 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `topBar` = { RenderComposeChildren(node.slot("topBar")) },
        `bottomBar` = { RenderComposeChildren(node.slot("bottomBar")) },
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `containerColor` = node.color("containerColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      28 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `snackbarHost` = { RenderComposeChildren(node.slot("snackbarHost")) },
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `containerColor` = node.color("containerColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      29 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `topBar` = { RenderComposeChildren(node.slot("topBar")) },
        `snackbarHost` = { RenderComposeChildren(node.slot("snackbarHost")) },
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `containerColor` = node.color("containerColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      30 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `bottomBar` = { RenderComposeChildren(node.slot("bottomBar")) },
        `snackbarHost` = { RenderComposeChildren(node.slot("snackbarHost")) },
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `containerColor` = node.color("containerColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      31 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `topBar` = { RenderComposeChildren(node.slot("topBar")) },
        `bottomBar` = { RenderComposeChildren(node.slot("bottomBar")) },
        `snackbarHost` = { RenderComposeChildren(node.slot("snackbarHost")) },
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `containerColor` = node.color("containerColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderScaffoldGroup1(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      33 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `topBar` = { RenderComposeChildren(node.slot("topBar")) },
        `contentColor` = node.color("contentColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      34 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `bottomBar` = { RenderComposeChildren(node.slot("bottomBar")) },
        `contentColor` = node.color("contentColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      35 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `topBar` = { RenderComposeChildren(node.slot("topBar")) },
        `bottomBar` = { RenderComposeChildren(node.slot("bottomBar")) },
        `contentColor` = node.color("contentColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      36 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `snackbarHost` = { RenderComposeChildren(node.slot("snackbarHost")) },
        `contentColor` = node.color("contentColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      37 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `topBar` = { RenderComposeChildren(node.slot("topBar")) },
        `snackbarHost` = { RenderComposeChildren(node.slot("snackbarHost")) },
        `contentColor` = node.color("contentColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      38 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `bottomBar` = { RenderComposeChildren(node.slot("bottomBar")) },
        `snackbarHost` = { RenderComposeChildren(node.slot("snackbarHost")) },
        `contentColor` = node.color("contentColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      39 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `topBar` = { RenderComposeChildren(node.slot("topBar")) },
        `bottomBar` = { RenderComposeChildren(node.slot("bottomBar")) },
        `snackbarHost` = { RenderComposeChildren(node.slot("snackbarHost")) },
        `contentColor` = node.color("contentColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      40 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `contentColor` = node.color("contentColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      41 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `topBar` = { RenderComposeChildren(node.slot("topBar")) },
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `contentColor` = node.color("contentColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      42 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `bottomBar` = { RenderComposeChildren(node.slot("bottomBar")) },
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `contentColor` = node.color("contentColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      43 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `topBar` = { RenderComposeChildren(node.slot("topBar")) },
        `bottomBar` = { RenderComposeChildren(node.slot("bottomBar")) },
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `contentColor` = node.color("contentColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      44 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `snackbarHost` = { RenderComposeChildren(node.slot("snackbarHost")) },
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `contentColor` = node.color("contentColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      45 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `topBar` = { RenderComposeChildren(node.slot("topBar")) },
        `snackbarHost` = { RenderComposeChildren(node.slot("snackbarHost")) },
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `contentColor` = node.color("contentColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      46 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `bottomBar` = { RenderComposeChildren(node.slot("bottomBar")) },
        `snackbarHost` = { RenderComposeChildren(node.slot("snackbarHost")) },
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `contentColor` = node.color("contentColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      47 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `topBar` = { RenderComposeChildren(node.slot("topBar")) },
        `bottomBar` = { RenderComposeChildren(node.slot("bottomBar")) },
        `snackbarHost` = { RenderComposeChildren(node.slot("snackbarHost")) },
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `contentColor` = node.color("contentColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      48 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      49 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `topBar` = { RenderComposeChildren(node.slot("topBar")) },
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      50 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `bottomBar` = { RenderComposeChildren(node.slot("bottomBar")) },
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      51 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `topBar` = { RenderComposeChildren(node.slot("topBar")) },
        `bottomBar` = { RenderComposeChildren(node.slot("bottomBar")) },
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      52 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `snackbarHost` = { RenderComposeChildren(node.slot("snackbarHost")) },
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      53 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `topBar` = { RenderComposeChildren(node.slot("topBar")) },
        `snackbarHost` = { RenderComposeChildren(node.slot("snackbarHost")) },
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      54 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `bottomBar` = { RenderComposeChildren(node.slot("bottomBar")) },
        `snackbarHost` = { RenderComposeChildren(node.slot("snackbarHost")) },
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      55 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `topBar` = { RenderComposeChildren(node.slot("topBar")) },
        `bottomBar` = { RenderComposeChildren(node.slot("bottomBar")) },
        `snackbarHost` = { RenderComposeChildren(node.slot("snackbarHost")) },
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      56 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      57 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `topBar` = { RenderComposeChildren(node.slot("topBar")) },
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      58 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `bottomBar` = { RenderComposeChildren(node.slot("bottomBar")) },
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      59 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `topBar` = { RenderComposeChildren(node.slot("topBar")) },
        `bottomBar` = { RenderComposeChildren(node.slot("bottomBar")) },
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      60 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `snackbarHost` = { RenderComposeChildren(node.slot("snackbarHost")) },
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      61 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `topBar` = { RenderComposeChildren(node.slot("topBar")) },
        `snackbarHost` = { RenderComposeChildren(node.slot("snackbarHost")) },
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      62 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `bottomBar` = { RenderComposeChildren(node.slot("bottomBar")) },
        `snackbarHost` = { RenderComposeChildren(node.slot("snackbarHost")) },
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      63 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `topBar` = { RenderComposeChildren(node.slot("topBar")) },
        `bottomBar` = { RenderComposeChildren(node.slot("bottomBar")) },
        `snackbarHost` = { RenderComposeChildren(node.slot("snackbarHost")) },
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderScaffoldGroup2(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      64 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      65 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `topBar` = { RenderComposeChildren(node.slot("topBar")) },
        `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      66 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `bottomBar` = { RenderComposeChildren(node.slot("bottomBar")) },
        `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      67 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `topBar` = { RenderComposeChildren(node.slot("topBar")) },
        `bottomBar` = { RenderComposeChildren(node.slot("bottomBar")) },
        `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      68 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `snackbarHost` = { RenderComposeChildren(node.slot("snackbarHost")) },
        `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      69 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `topBar` = { RenderComposeChildren(node.slot("topBar")) },
        `snackbarHost` = { RenderComposeChildren(node.slot("snackbarHost")) },
        `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      70 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `bottomBar` = { RenderComposeChildren(node.slot("bottomBar")) },
        `snackbarHost` = { RenderComposeChildren(node.slot("snackbarHost")) },
        `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      71 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `topBar` = { RenderComposeChildren(node.slot("topBar")) },
        `bottomBar` = { RenderComposeChildren(node.slot("bottomBar")) },
        `snackbarHost` = { RenderComposeChildren(node.slot("snackbarHost")) },
        `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      72 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      73 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `topBar` = { RenderComposeChildren(node.slot("topBar")) },
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      74 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `bottomBar` = { RenderComposeChildren(node.slot("bottomBar")) },
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      75 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `topBar` = { RenderComposeChildren(node.slot("topBar")) },
        `bottomBar` = { RenderComposeChildren(node.slot("bottomBar")) },
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      76 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `snackbarHost` = { RenderComposeChildren(node.slot("snackbarHost")) },
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      77 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `topBar` = { RenderComposeChildren(node.slot("topBar")) },
        `snackbarHost` = { RenderComposeChildren(node.slot("snackbarHost")) },
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      78 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `bottomBar` = { RenderComposeChildren(node.slot("bottomBar")) },
        `snackbarHost` = { RenderComposeChildren(node.slot("snackbarHost")) },
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      79 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `topBar` = { RenderComposeChildren(node.slot("topBar")) },
        `bottomBar` = { RenderComposeChildren(node.slot("bottomBar")) },
        `snackbarHost` = { RenderComposeChildren(node.slot("snackbarHost")) },
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      80 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      81 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `topBar` = { RenderComposeChildren(node.slot("topBar")) },
        `containerColor` = node.color("containerColor"),
        `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      82 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `bottomBar` = { RenderComposeChildren(node.slot("bottomBar")) },
        `containerColor` = node.color("containerColor"),
        `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      83 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `topBar` = { RenderComposeChildren(node.slot("topBar")) },
        `bottomBar` = { RenderComposeChildren(node.slot("bottomBar")) },
        `containerColor` = node.color("containerColor"),
        `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      84 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `snackbarHost` = { RenderComposeChildren(node.slot("snackbarHost")) },
        `containerColor` = node.color("containerColor"),
        `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      85 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `topBar` = { RenderComposeChildren(node.slot("topBar")) },
        `snackbarHost` = { RenderComposeChildren(node.slot("snackbarHost")) },
        `containerColor` = node.color("containerColor"),
        `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      86 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `bottomBar` = { RenderComposeChildren(node.slot("bottomBar")) },
        `snackbarHost` = { RenderComposeChildren(node.slot("snackbarHost")) },
        `containerColor` = node.color("containerColor"),
        `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      87 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `topBar` = { RenderComposeChildren(node.slot("topBar")) },
        `bottomBar` = { RenderComposeChildren(node.slot("bottomBar")) },
        `snackbarHost` = { RenderComposeChildren(node.slot("snackbarHost")) },
        `containerColor` = node.color("containerColor"),
        `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      88 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `containerColor` = node.color("containerColor"),
        `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      89 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `topBar` = { RenderComposeChildren(node.slot("topBar")) },
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `containerColor` = node.color("containerColor"),
        `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      90 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `bottomBar` = { RenderComposeChildren(node.slot("bottomBar")) },
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `containerColor` = node.color("containerColor"),
        `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      91 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `topBar` = { RenderComposeChildren(node.slot("topBar")) },
        `bottomBar` = { RenderComposeChildren(node.slot("bottomBar")) },
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `containerColor` = node.color("containerColor"),
        `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      92 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `snackbarHost` = { RenderComposeChildren(node.slot("snackbarHost")) },
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `containerColor` = node.color("containerColor"),
        `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      93 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `topBar` = { RenderComposeChildren(node.slot("topBar")) },
        `snackbarHost` = { RenderComposeChildren(node.slot("snackbarHost")) },
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `containerColor` = node.color("containerColor"),
        `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      94 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `bottomBar` = { RenderComposeChildren(node.slot("bottomBar")) },
        `snackbarHost` = { RenderComposeChildren(node.slot("snackbarHost")) },
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `containerColor` = node.color("containerColor"),
        `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      95 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `topBar` = { RenderComposeChildren(node.slot("topBar")) },
        `bottomBar` = { RenderComposeChildren(node.slot("bottomBar")) },
        `snackbarHost` = { RenderComposeChildren(node.slot("snackbarHost")) },
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `containerColor` = node.color("containerColor"),
        `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderScaffoldGroup3(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      96 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      97 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `topBar` = { RenderComposeChildren(node.slot("topBar")) },
        `contentColor` = node.color("contentColor"),
        `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      98 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `bottomBar` = { RenderComposeChildren(node.slot("bottomBar")) },
        `contentColor` = node.color("contentColor"),
        `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      99 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `topBar` = { RenderComposeChildren(node.slot("topBar")) },
        `bottomBar` = { RenderComposeChildren(node.slot("bottomBar")) },
        `contentColor` = node.color("contentColor"),
        `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      100 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `snackbarHost` = { RenderComposeChildren(node.slot("snackbarHost")) },
        `contentColor` = node.color("contentColor"),
        `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      101 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `topBar` = { RenderComposeChildren(node.slot("topBar")) },
        `snackbarHost` = { RenderComposeChildren(node.slot("snackbarHost")) },
        `contentColor` = node.color("contentColor"),
        `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      102 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `bottomBar` = { RenderComposeChildren(node.slot("bottomBar")) },
        `snackbarHost` = { RenderComposeChildren(node.slot("snackbarHost")) },
        `contentColor` = node.color("contentColor"),
        `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      103 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `topBar` = { RenderComposeChildren(node.slot("topBar")) },
        `bottomBar` = { RenderComposeChildren(node.slot("bottomBar")) },
        `snackbarHost` = { RenderComposeChildren(node.slot("snackbarHost")) },
        `contentColor` = node.color("contentColor"),
        `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      104 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `contentColor` = node.color("contentColor"),
        `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      105 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `topBar` = { RenderComposeChildren(node.slot("topBar")) },
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `contentColor` = node.color("contentColor"),
        `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      106 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `bottomBar` = { RenderComposeChildren(node.slot("bottomBar")) },
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `contentColor` = node.color("contentColor"),
        `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      107 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `topBar` = { RenderComposeChildren(node.slot("topBar")) },
        `bottomBar` = { RenderComposeChildren(node.slot("bottomBar")) },
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `contentColor` = node.color("contentColor"),
        `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      108 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `snackbarHost` = { RenderComposeChildren(node.slot("snackbarHost")) },
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `contentColor` = node.color("contentColor"),
        `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      109 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `topBar` = { RenderComposeChildren(node.slot("topBar")) },
        `snackbarHost` = { RenderComposeChildren(node.slot("snackbarHost")) },
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `contentColor` = node.color("contentColor"),
        `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      110 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `bottomBar` = { RenderComposeChildren(node.slot("bottomBar")) },
        `snackbarHost` = { RenderComposeChildren(node.slot("snackbarHost")) },
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `contentColor` = node.color("contentColor"),
        `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      111 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `topBar` = { RenderComposeChildren(node.slot("topBar")) },
        `bottomBar` = { RenderComposeChildren(node.slot("bottomBar")) },
        `snackbarHost` = { RenderComposeChildren(node.slot("snackbarHost")) },
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `contentColor` = node.color("contentColor"),
        `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      112 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      113 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `topBar` = { RenderComposeChildren(node.slot("topBar")) },
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      114 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `bottomBar` = { RenderComposeChildren(node.slot("bottomBar")) },
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      115 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `topBar` = { RenderComposeChildren(node.slot("topBar")) },
        `bottomBar` = { RenderComposeChildren(node.slot("bottomBar")) },
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      116 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `snackbarHost` = { RenderComposeChildren(node.slot("snackbarHost")) },
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      117 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `topBar` = { RenderComposeChildren(node.slot("topBar")) },
        `snackbarHost` = { RenderComposeChildren(node.slot("snackbarHost")) },
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      118 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `bottomBar` = { RenderComposeChildren(node.slot("bottomBar")) },
        `snackbarHost` = { RenderComposeChildren(node.slot("snackbarHost")) },
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      119 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `topBar` = { RenderComposeChildren(node.slot("topBar")) },
        `bottomBar` = { RenderComposeChildren(node.slot("bottomBar")) },
        `snackbarHost` = { RenderComposeChildren(node.slot("snackbarHost")) },
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      120 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      121 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `topBar` = { RenderComposeChildren(node.slot("topBar")) },
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      122 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `bottomBar` = { RenderComposeChildren(node.slot("bottomBar")) },
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      123 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `topBar` = { RenderComposeChildren(node.slot("topBar")) },
        `bottomBar` = { RenderComposeChildren(node.slot("bottomBar")) },
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      124 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `snackbarHost` = { RenderComposeChildren(node.slot("snackbarHost")) },
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      125 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `topBar` = { RenderComposeChildren(node.slot("topBar")) },
        `snackbarHost` = { RenderComposeChildren(node.slot("snackbarHost")) },
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      126 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `bottomBar` = { RenderComposeChildren(node.slot("bottomBar")) },
        `snackbarHost` = { RenderComposeChildren(node.slot("snackbarHost")) },
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      127 -> androidx.compose.material3.Scaffold(
        `modifier` = node.modifier("modifier", scope),
        `topBar` = { RenderComposeChildren(node.slot("topBar")) },
        `bottomBar` = { RenderComposeChildren(node.slot("bottomBar")) },
        `snackbarHost` = { RenderComposeChildren(node.slot("snackbarHost")) },
        `floatingActionButton` = { RenderComposeChildren(node.slot("floatingActionButton")) },
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(),
        content = { padding -> RenderPaddedComposeChildren(node.children, padding) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.ScrollableTabRow(selectedTabIndex: kotlin.Int, modifier: androidx.compose.ui.Modifier, containerColor: androidx.compose.ui.graphics.Color, contentColor: androidx.compose.ui.graphics.Color, edgePadding: androidx.compose.ui.unit.Dp, indicator: kotlin.Function1<kotlin.collections.List<androidx.compose.material3.TabPosition>, kotlin.Unit>, divider: kotlin.Function0<kotlin.Unit>, tabs: kotlin.Function0<kotlin.Unit>)
internal object RendererScrollableTabRow {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("containerColor")) 1 else 0) +
      (if (node.has("contentColor")) 2 else 0) +
      (if (node.has("edgePadding")) 4 else 0) +
      (if (node.has("divider")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.material3.ScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      1 -> androidx.compose.material3.ScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      2 -> androidx.compose.material3.ScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      3 -> androidx.compose.material3.ScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      4 -> androidx.compose.material3.ScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `edgePadding` = node.number("edgePadding").dp,
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      5 -> androidx.compose.material3.ScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `edgePadding` = node.number("edgePadding").dp,
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      6 -> androidx.compose.material3.ScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `edgePadding` = node.number("edgePadding").dp,
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      7 -> androidx.compose.material3.ScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `edgePadding` = node.number("edgePadding").dp,
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      8 -> androidx.compose.material3.ScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      9 -> androidx.compose.material3.ScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      10 -> androidx.compose.material3.ScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      11 -> androidx.compose.material3.ScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      12 -> androidx.compose.material3.ScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `edgePadding` = node.number("edgePadding").dp,
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      13 -> androidx.compose.material3.ScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `edgePadding` = node.number("edgePadding").dp,
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      14 -> androidx.compose.material3.ScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `edgePadding` = node.number("edgePadding").dp,
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      15 -> androidx.compose.material3.ScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `edgePadding` = node.number("edgePadding").dp,
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.SearchBar(state: androidx.compose.material3.SearchBarState, inputField: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.SearchBarColors, tonalElevation: androidx.compose.ui.unit.Dp, shadowElevation: androidx.compose.ui.unit.Dp)
internal object RendererSearchBar {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val stateValue = if (node.has("state") && !node.isNull("state")) node.jsonObject("state").rememberComposeSearchBarState() else null
    val mask = (if (node.has("shape")) 1 else 0) +
      (if (node.has("tonalElevation")) 2 else 0) +
      (if (node.has("shadowElevation")) 4 else 0)
    when (mask) {
      0 -> androidx.compose.material3.SearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.SearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
      )
      2 -> androidx.compose.material3.SearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      3 -> androidx.compose.material3.SearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      4 -> androidx.compose.material3.SearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      5 -> androidx.compose.material3.SearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      6 -> androidx.compose.material3.SearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      7 -> androidx.compose.material3.SearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.SearchBar(inputField: kotlin.Function0<kotlin.Unit>, expanded: kotlin.Boolean, onExpandedChange: kotlin.Function1<kotlin.Boolean, kotlin.Unit>, modifier: androidx.compose.ui.Modifier, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.SearchBarColors, tonalElevation: androidx.compose.ui.unit.Dp, shadowElevation: androidx.compose.ui.unit.Dp, windowInsets: androidx.compose.foundation.layout.WindowInsets, content: kotlin.Function1<androidx.compose.foundation.layout.ColumnScope, kotlin.Unit>)
internal object RendererSearchBar_1 {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("shape")) 1 else 0) +
      (if (node.has("tonalElevation")) 2 else 0) +
      (if (node.has("shadowElevation")) 4 else 0) +
      (if (node.has("windowInsets")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      2 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      4 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      8 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      9 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      10 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      11 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      12 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shadowElevation` = node.number("shadowElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      13 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `shadowElevation` = node.number("shadowElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      14 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      15 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.TabRowDefaults.SecondaryIndicator(modifier: androidx.compose.ui.Modifier, height: androidx.compose.ui.unit.Dp, color: androidx.compose.ui.graphics.Color)
internal object RendererSecondaryIndicator {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("height")) 1 else 0) +
      (if (node.has("color")) 2 else 0)
    when (mask) {
      0 -> androidx.compose.material3.TabRowDefaults.SecondaryIndicator(
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.TabRowDefaults.SecondaryIndicator(
        `modifier` = node.modifier("modifier", scope),
        `height` = node.number("height").dp,
      )
      2 -> androidx.compose.material3.TabRowDefaults.SecondaryIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
      )
      3 -> androidx.compose.material3.TabRowDefaults.SecondaryIndicator(
        `modifier` = node.modifier("modifier", scope),
        `height` = node.number("height").dp,
        `color` = node.color("color"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.SecondaryScrollableTabRow(selectedTabIndex: kotlin.Int, modifier: androidx.compose.ui.Modifier, scrollState: androidx.compose.foundation.ScrollState, containerColor: androidx.compose.ui.graphics.Color, contentColor: androidx.compose.ui.graphics.Color, edgePadding: androidx.compose.ui.unit.Dp, indicator: kotlin.Function1<androidx.compose.material3.TabIndicatorScope, kotlin.Unit>, divider: kotlin.Function0<kotlin.Unit>, minTabWidth: androidx.compose.ui.unit.Dp, tabs: kotlin.Function0<kotlin.Unit>)
internal object RendererSecondaryScrollableTabRow {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("containerColor")) 1 else 0) +
      (if (node.has("contentColor")) 2 else 0) +
      (if (node.has("edgePadding")) 4 else 0) +
      (if (node.has("indicator")) 8 else 0) +
      (if (node.has("divider")) 16 else 0) +
      (if (node.has("minTabWidth")) 32 else 0)
    when (mask / 32) {
      0 -> renderSecondaryScrollableTabRowGroup0(node, scope, mask)
      1 -> renderSecondaryScrollableTabRowGroup1(node, scope, mask)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecondaryScrollableTabRowGroup0(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      0 -> androidx.compose.material3.SecondaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      1 -> androidx.compose.material3.SecondaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      2 -> androidx.compose.material3.SecondaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      3 -> androidx.compose.material3.SecondaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      4 -> androidx.compose.material3.SecondaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `edgePadding` = node.number("edgePadding").dp,
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      5 -> androidx.compose.material3.SecondaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `edgePadding` = node.number("edgePadding").dp,
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      6 -> androidx.compose.material3.SecondaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `edgePadding` = node.number("edgePadding").dp,
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      7 -> androidx.compose.material3.SecondaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `edgePadding` = node.number("edgePadding").dp,
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      8 -> androidx.compose.material3.SecondaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      9 -> androidx.compose.material3.SecondaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      10 -> androidx.compose.material3.SecondaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      11 -> androidx.compose.material3.SecondaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      12 -> androidx.compose.material3.SecondaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `edgePadding` = node.number("edgePadding").dp,
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      13 -> androidx.compose.material3.SecondaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `edgePadding` = node.number("edgePadding").dp,
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      14 -> androidx.compose.material3.SecondaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `edgePadding` = node.number("edgePadding").dp,
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      15 -> androidx.compose.material3.SecondaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `edgePadding` = node.number("edgePadding").dp,
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      16 -> androidx.compose.material3.SecondaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      17 -> androidx.compose.material3.SecondaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      18 -> androidx.compose.material3.SecondaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      19 -> androidx.compose.material3.SecondaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      20 -> androidx.compose.material3.SecondaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `edgePadding` = node.number("edgePadding").dp,
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      21 -> androidx.compose.material3.SecondaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `edgePadding` = node.number("edgePadding").dp,
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      22 -> androidx.compose.material3.SecondaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `edgePadding` = node.number("edgePadding").dp,
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      23 -> androidx.compose.material3.SecondaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `edgePadding` = node.number("edgePadding").dp,
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      24 -> androidx.compose.material3.SecondaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      25 -> androidx.compose.material3.SecondaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      26 -> androidx.compose.material3.SecondaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      27 -> androidx.compose.material3.SecondaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      28 -> androidx.compose.material3.SecondaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `edgePadding` = node.number("edgePadding").dp,
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      29 -> androidx.compose.material3.SecondaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `edgePadding` = node.number("edgePadding").dp,
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      30 -> androidx.compose.material3.SecondaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `edgePadding` = node.number("edgePadding").dp,
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      31 -> androidx.compose.material3.SecondaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `edgePadding` = node.number("edgePadding").dp,
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecondaryScrollableTabRowGroup1(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32 -> androidx.compose.material3.SecondaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `minTabWidth` = node.number("minTabWidth").dp,
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      33 -> androidx.compose.material3.SecondaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `minTabWidth` = node.number("minTabWidth").dp,
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      34 -> androidx.compose.material3.SecondaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `minTabWidth` = node.number("minTabWidth").dp,
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      35 -> androidx.compose.material3.SecondaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `minTabWidth` = node.number("minTabWidth").dp,
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      36 -> androidx.compose.material3.SecondaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `edgePadding` = node.number("edgePadding").dp,
        `minTabWidth` = node.number("minTabWidth").dp,
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      37 -> androidx.compose.material3.SecondaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `edgePadding` = node.number("edgePadding").dp,
        `minTabWidth` = node.number("minTabWidth").dp,
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      38 -> androidx.compose.material3.SecondaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `edgePadding` = node.number("edgePadding").dp,
        `minTabWidth` = node.number("minTabWidth").dp,
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      39 -> androidx.compose.material3.SecondaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `edgePadding` = node.number("edgePadding").dp,
        `minTabWidth` = node.number("minTabWidth").dp,
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      40 -> androidx.compose.material3.SecondaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `minTabWidth` = node.number("minTabWidth").dp,
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      41 -> androidx.compose.material3.SecondaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `minTabWidth` = node.number("minTabWidth").dp,
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      42 -> androidx.compose.material3.SecondaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `minTabWidth` = node.number("minTabWidth").dp,
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      43 -> androidx.compose.material3.SecondaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `minTabWidth` = node.number("minTabWidth").dp,
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      44 -> androidx.compose.material3.SecondaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `edgePadding` = node.number("edgePadding").dp,
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `minTabWidth` = node.number("minTabWidth").dp,
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      45 -> androidx.compose.material3.SecondaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `edgePadding` = node.number("edgePadding").dp,
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `minTabWidth` = node.number("minTabWidth").dp,
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      46 -> androidx.compose.material3.SecondaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `edgePadding` = node.number("edgePadding").dp,
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `minTabWidth` = node.number("minTabWidth").dp,
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      47 -> androidx.compose.material3.SecondaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `edgePadding` = node.number("edgePadding").dp,
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `minTabWidth` = node.number("minTabWidth").dp,
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      48 -> androidx.compose.material3.SecondaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `minTabWidth` = node.number("minTabWidth").dp,
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      49 -> androidx.compose.material3.SecondaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `minTabWidth` = node.number("minTabWidth").dp,
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      50 -> androidx.compose.material3.SecondaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `minTabWidth` = node.number("minTabWidth").dp,
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      51 -> androidx.compose.material3.SecondaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `minTabWidth` = node.number("minTabWidth").dp,
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      52 -> androidx.compose.material3.SecondaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `edgePadding` = node.number("edgePadding").dp,
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `minTabWidth` = node.number("minTabWidth").dp,
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      53 -> androidx.compose.material3.SecondaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `edgePadding` = node.number("edgePadding").dp,
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `minTabWidth` = node.number("minTabWidth").dp,
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      54 -> androidx.compose.material3.SecondaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `edgePadding` = node.number("edgePadding").dp,
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `minTabWidth` = node.number("minTabWidth").dp,
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      55 -> androidx.compose.material3.SecondaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `edgePadding` = node.number("edgePadding").dp,
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `minTabWidth` = node.number("minTabWidth").dp,
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      56 -> androidx.compose.material3.SecondaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `minTabWidth` = node.number("minTabWidth").dp,
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      57 -> androidx.compose.material3.SecondaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `minTabWidth` = node.number("minTabWidth").dp,
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      58 -> androidx.compose.material3.SecondaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `minTabWidth` = node.number("minTabWidth").dp,
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      59 -> androidx.compose.material3.SecondaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `minTabWidth` = node.number("minTabWidth").dp,
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      60 -> androidx.compose.material3.SecondaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `edgePadding` = node.number("edgePadding").dp,
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `minTabWidth` = node.number("minTabWidth").dp,
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      61 -> androidx.compose.material3.SecondaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `edgePadding` = node.number("edgePadding").dp,
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `minTabWidth` = node.number("minTabWidth").dp,
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      62 -> androidx.compose.material3.SecondaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `edgePadding` = node.number("edgePadding").dp,
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `minTabWidth` = node.number("minTabWidth").dp,
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      63 -> androidx.compose.material3.SecondaryScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `edgePadding` = node.number("edgePadding").dp,
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `minTabWidth` = node.number("minTabWidth").dp,
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.SecondaryTabRow(selectedTabIndex: kotlin.Int, modifier: androidx.compose.ui.Modifier, containerColor: androidx.compose.ui.graphics.Color, contentColor: androidx.compose.ui.graphics.Color, indicator: kotlin.Function1<androidx.compose.material3.TabIndicatorScope, kotlin.Unit>, divider: kotlin.Function0<kotlin.Unit>, tabs: kotlin.Function0<kotlin.Unit>)
internal object RendererSecondaryTabRow {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("containerColor")) 1 else 0) +
      (if (node.has("contentColor")) 2 else 0) +
      (if (node.has("indicator")) 4 else 0) +
      (if (node.has("divider")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.material3.SecondaryTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      1 -> androidx.compose.material3.SecondaryTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      2 -> androidx.compose.material3.SecondaryTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      3 -> androidx.compose.material3.SecondaryTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      4 -> androidx.compose.material3.SecondaryTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      5 -> androidx.compose.material3.SecondaryTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      6 -> androidx.compose.material3.SecondaryTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      7 -> androidx.compose.material3.SecondaryTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      8 -> androidx.compose.material3.SecondaryTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      9 -> androidx.compose.material3.SecondaryTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      10 -> androidx.compose.material3.SecondaryTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      11 -> androidx.compose.material3.SecondaryTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      12 -> androidx.compose.material3.SecondaryTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      13 -> androidx.compose.material3.SecondaryTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      14 -> androidx.compose.material3.SecondaryTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      15 -> androidx.compose.material3.SecondaryTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.SecureTextField(state: androidx.compose.foundation.text.input.TextFieldState, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, textStyle: androidx.compose.ui.text.TextStyle, labelPosition: androidx.compose.material3.TextFieldLabelPosition, label: kotlin.Function1<androidx.compose.material3.TextFieldLabelScope, kotlin.Unit>?, placeholder: kotlin.Function0<kotlin.Unit>?, leadingIcon: kotlin.Function0<kotlin.Unit>?, trailingIcon: kotlin.Function0<kotlin.Unit>?, prefix: kotlin.Function0<kotlin.Unit>?, suffix: kotlin.Function0<kotlin.Unit>?, supportingText: kotlin.Function0<kotlin.Unit>?, isError: kotlin.Boolean, inputTransformation: androidx.compose.foundation.text.input.InputTransformation?, textObfuscationMode: androidx.compose.foundation.text.input.TextObfuscationMode, textObfuscationCharacter: kotlin.Char, keyboardOptions: androidx.compose.foundation.text.KeyboardOptions, onKeyboardAction: androidx.compose.foundation.text.input.KeyboardActionHandler?, onTextLayout: kotlin.Function2<androidx.compose.ui.unit.Density, kotlin.Function0<androidx.compose.ui.text.TextLayoutResult?>, kotlin.Unit>?, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.TextFieldColors, contentPadding: androidx.compose.foundation.layout.PaddingValues, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?)
internal object RendererSecureTextField {
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
      (if (node.has("keyboardOptions")) 512 else 0) +
      (if (node.has("onKeyboardAction")) 1024 else 0) +
      (if (node.has("shape")) 2048 else 0) +
      (if (node.has("contentPadding")) 4096 else 0) +
      (if (node.has("interactionSource")) 8192 else 0)
    when (mask / 32) {
      0 -> renderSecureTextFieldGroup0(node, scope, mask, stateValue)
      1 -> renderSecureTextFieldGroup1(node, scope, mask, stateValue)
      2 -> renderSecureTextFieldGroup2(node, scope, mask, stateValue)
      4 -> renderSecureTextFieldGroup4(node, scope, mask, stateValue)
      8 -> renderSecureTextFieldGroup8(node, scope, mask, stateValue)
      16 -> renderSecureTextFieldGroup16(node, scope, mask, stateValue)
      32 -> renderSecureTextFieldGroup32(node, scope, mask, stateValue)
      48 -> renderSecureTextFieldGroup48(node, scope, mask, stateValue)
      64 -> renderSecureTextFieldGroup64(node, scope, mask, stateValue)
      128 -> renderSecureTextFieldGroup128(node, scope, mask, stateValue)
      207 -> renderSecureTextFieldGroup207(node, scope, mask, stateValue)
      256 -> renderSecureTextFieldGroup256(node, scope, mask, stateValue)
      257 -> renderSecureTextFieldGroup257(node, scope, mask, stateValue)
      463 -> renderSecureTextFieldGroup463(node, scope, mask, stateValue)
      479 -> renderSecureTextFieldGroup479(node, scope, mask, stateValue)
      495 -> renderSecureTextFieldGroup495(node, scope, mask, stateValue)
      511 -> renderSecureTextFieldGroup511(node, scope, mask, stateValue)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup0(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      0 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
      )
      2 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
      )
      3 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
      )
      4 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
      )
      5 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
      )
      6 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
      )
      7 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
      )
      8 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      9 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      10 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      11 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      12 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      13 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      14 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      15 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      16 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      17 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      18 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      19 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      20 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      21 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      22 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      23 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      24 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      25 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      26 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      27 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      28 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      29 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      30 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      31 -> androidx.compose.material3.SecureTextField(
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
  private fun renderSecureTextFieldGroup1(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      32 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      33 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      36 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      37 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      40 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      41 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      44 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      45 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      48 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      49 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      52 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      53 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      56 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      57 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      60 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      61 -> androidx.compose.material3.SecureTextField(
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
  private fun renderSecureTextFieldGroup2(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      64 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      65 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      68 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      69 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      72 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      73 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      76 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      77 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      80 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      81 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      84 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      85 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      88 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      89 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      92 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      93 -> androidx.compose.material3.SecureTextField(
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
  private fun renderSecureTextFieldGroup4(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      128 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      129 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      132 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      133 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      136 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      137 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      140 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      141 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      144 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      145 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      148 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      149 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      152 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      153 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      156 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      157 -> androidx.compose.material3.SecureTextField(
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
  private fun renderSecureTextFieldGroup8(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      256 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `isError` = node.boolean("isError"),
      )
      257 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
      )
      260 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `isError` = node.boolean("isError"),
      )
      261 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `isError` = node.boolean("isError"),
      )
      264 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      265 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      268 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      269 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      272 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      273 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      276 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      277 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      280 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      281 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      284 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      285 -> androidx.compose.material3.SecureTextField(
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
  private fun renderSecureTextFieldGroup16(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      512 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
      )
      513 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
      )
      516 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
      )
      517 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
      )
      520 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
      )
      521 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
      )
      524 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
      )
      525 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
      )
      528 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
      )
      529 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
      )
      532 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
      )
      533 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
      )
      536 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
      )
      537 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
      )
      540 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
      )
      541 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup32(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      1024 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }),
      )
      1025 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }),
      )
      1028 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }),
      )
      1029 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }),
      )
      1032 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }),
      )
      1033 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }),
      )
      1036 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }),
      )
      1037 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }),
      )
      1040 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }),
      )
      1041 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }),
      )
      1044 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }),
      )
      1045 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }),
      )
      1048 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }),
      )
      1049 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }),
      )
      1052 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }),
      )
      1053 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup48(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      1536 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
        `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup64(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      2048 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
      )
      2049 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
      )
      2052 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `shape` = node.arguments().shape("shape"),
      )
      2053 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `shape` = node.arguments().shape("shape"),
      )
      2056 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      2057 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      2060 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      2061 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      2064 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      2065 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      2068 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      2069 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      2072 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      2073 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      2076 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      2077 -> androidx.compose.material3.SecureTextField(
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
  private fun renderSecureTextFieldGroup128(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      4096 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      4097 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      4100 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      4101 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      4104 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      4105 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      4108 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      4109 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      4112 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      4113 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      4116 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      4117 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      4120 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      4121 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      4124 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      4125 -> androidx.compose.material3.SecureTextField(
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
  private fun renderSecureTextFieldGroup207(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      6655 -> androidx.compose.material3.SecureTextField(
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

  @Composable
  private fun renderSecureTextFieldGroup256(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      8192 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      8193 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      8194 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      8195 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      8196 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      8197 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      8198 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      8199 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      8200 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      8201 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      8202 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      8203 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      8204 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      8205 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      8206 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      8207 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      8208 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      8209 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      8210 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      8211 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      8212 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      8213 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      8214 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      8215 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      8216 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      8217 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      8218 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      8219 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      8220 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      8221 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      8222 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      8223 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup257(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      8224 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      8225 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      8226 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      8227 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      8228 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      8229 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      8230 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      8231 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      8232 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      8233 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      8234 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      8235 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      8236 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      8237 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      8238 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      8239 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      8240 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      8241 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      8242 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      8243 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      8244 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      8245 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      8246 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      8247 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      8248 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      8249 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      8250 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      8251 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      8252 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      8253 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      8254 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      8255 -> androidx.compose.material3.SecureTextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup463(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      14847 -> androidx.compose.material3.SecureTextField(
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
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup479(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      15359 -> androidx.compose.material3.SecureTextField(
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
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
        `shape` = node.arguments().shape("shape"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup495(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      15871 -> androidx.compose.material3.SecureTextField(
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
        `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }),
        `shape` = node.arguments().shape("shape"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup511(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      16383 -> androidx.compose.material3.SecureTextField(
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
        `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(),
        `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }),
        `shape` = node.arguments().shape("shape"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.SegmentedButton [receiver: androidx.compose.material3.MultiChoiceSegmentedButtonRowScope](checked: kotlin.Boolean, onCheckedChange: kotlin.Function1<kotlin.Boolean, kotlin.Unit>, shape: androidx.compose.ui.graphics.Shape, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, colors: androidx.compose.material3.SegmentedButtonColors, border: androidx.compose.foundation.BorderStroke, contentPadding: androidx.compose.foundation.layout.PaddingValues, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, icon: kotlin.Function0<kotlin.Unit>, label: kotlin.Function0<kotlin.Unit>)
internal object RendererSegmentedButton {
  @Composable
  fun render(node: ComposeNode, scope: androidx.compose.material3.MultiChoiceSegmentedButtonRowScope) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("border")) 2 else 0) +
      (if (node.has("contentPadding")) 4 else 0) +
      (if (node.has("interactionSource")) 8 else 0) +
      (if (node.has("icon")) 16 else 0)
    when (mask) {
      0 -> scope.composeScoped5(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `shape` = node.arguments().shape("shape"),
        `modifier` = node.modifier("modifier", scope),
        `label` = { RenderComposeChildren(node.slot("label")) },
      )
      1 -> scope.composeScoped5(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `shape` = node.arguments().shape("shape"),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = { RenderComposeChildren(node.slot("label")) },
      )
      2 -> scope.composeScoped5(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `shape` = node.arguments().shape("shape"),
        `modifier` = node.modifier("modifier", scope),
        `border` = node.jsonObject("border").toComposeBorderStroke(),
        `label` = { RenderComposeChildren(node.slot("label")) },
      )
      3 -> scope.composeScoped5(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `shape` = node.arguments().shape("shape"),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = node.jsonObject("border").toComposeBorderStroke(),
        `label` = { RenderComposeChildren(node.slot("label")) },
      )
      4 -> scope.composeScoped5(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `shape` = node.arguments().shape("shape"),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `label` = { RenderComposeChildren(node.slot("label")) },
      )
      5 -> scope.composeScoped5(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `shape` = node.arguments().shape("shape"),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `label` = { RenderComposeChildren(node.slot("label")) },
      )
      6 -> scope.composeScoped5(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `shape` = node.arguments().shape("shape"),
        `modifier` = node.modifier("modifier", scope),
        `border` = node.jsonObject("border").toComposeBorderStroke(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `label` = { RenderComposeChildren(node.slot("label")) },
      )
      7 -> scope.composeScoped5(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `shape` = node.arguments().shape("shape"),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = node.jsonObject("border").toComposeBorderStroke(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `label` = { RenderComposeChildren(node.slot("label")) },
      )
      8 -> scope.composeScoped5(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `shape` = node.arguments().shape("shape"),
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `label` = { RenderComposeChildren(node.slot("label")) },
      )
      9 -> scope.composeScoped5(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `shape` = node.arguments().shape("shape"),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `label` = { RenderComposeChildren(node.slot("label")) },
      )
      10 -> scope.composeScoped5(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `shape` = node.arguments().shape("shape"),
        `modifier` = node.modifier("modifier", scope),
        `border` = node.jsonObject("border").toComposeBorderStroke(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `label` = { RenderComposeChildren(node.slot("label")) },
      )
      11 -> scope.composeScoped5(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `shape` = node.arguments().shape("shape"),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = node.jsonObject("border").toComposeBorderStroke(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `label` = { RenderComposeChildren(node.slot("label")) },
      )
      12 -> scope.composeScoped5(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `shape` = node.arguments().shape("shape"),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `label` = { RenderComposeChildren(node.slot("label")) },
      )
      13 -> scope.composeScoped5(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `shape` = node.arguments().shape("shape"),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `label` = { RenderComposeChildren(node.slot("label")) },
      )
      14 -> scope.composeScoped5(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `shape` = node.arguments().shape("shape"),
        `modifier` = node.modifier("modifier", scope),
        `border` = node.jsonObject("border").toComposeBorderStroke(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `label` = { RenderComposeChildren(node.slot("label")) },
      )
      15 -> scope.composeScoped5(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `shape` = node.arguments().shape("shape"),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = node.jsonObject("border").toComposeBorderStroke(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `label` = { RenderComposeChildren(node.slot("label")) },
      )
      16 -> scope.composeScoped5(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `shape` = node.arguments().shape("shape"),
        `modifier` = node.modifier("modifier", scope),
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = { RenderComposeChildren(node.slot("label")) },
      )
      17 -> scope.composeScoped5(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `shape` = node.arguments().shape("shape"),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = { RenderComposeChildren(node.slot("label")) },
      )
      18 -> scope.composeScoped5(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `shape` = node.arguments().shape("shape"),
        `modifier` = node.modifier("modifier", scope),
        `border` = node.jsonObject("border").toComposeBorderStroke(),
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = { RenderComposeChildren(node.slot("label")) },
      )
      19 -> scope.composeScoped5(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `shape` = node.arguments().shape("shape"),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = node.jsonObject("border").toComposeBorderStroke(),
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = { RenderComposeChildren(node.slot("label")) },
      )
      20 -> scope.composeScoped5(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `shape` = node.arguments().shape("shape"),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = { RenderComposeChildren(node.slot("label")) },
      )
      21 -> scope.composeScoped5(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `shape` = node.arguments().shape("shape"),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = { RenderComposeChildren(node.slot("label")) },
      )
      22 -> scope.composeScoped5(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `shape` = node.arguments().shape("shape"),
        `modifier` = node.modifier("modifier", scope),
        `border` = node.jsonObject("border").toComposeBorderStroke(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = { RenderComposeChildren(node.slot("label")) },
      )
      23 -> scope.composeScoped5(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `shape` = node.arguments().shape("shape"),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = node.jsonObject("border").toComposeBorderStroke(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = { RenderComposeChildren(node.slot("label")) },
      )
      24 -> scope.composeScoped5(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `shape` = node.arguments().shape("shape"),
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = { RenderComposeChildren(node.slot("label")) },
      )
      25 -> scope.composeScoped5(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `shape` = node.arguments().shape("shape"),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = { RenderComposeChildren(node.slot("label")) },
      )
      26 -> scope.composeScoped5(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `shape` = node.arguments().shape("shape"),
        `modifier` = node.modifier("modifier", scope),
        `border` = node.jsonObject("border").toComposeBorderStroke(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = { RenderComposeChildren(node.slot("label")) },
      )
      27 -> scope.composeScoped5(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `shape` = node.arguments().shape("shape"),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = node.jsonObject("border").toComposeBorderStroke(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = { RenderComposeChildren(node.slot("label")) },
      )
      28 -> scope.composeScoped5(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `shape` = node.arguments().shape("shape"),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = { RenderComposeChildren(node.slot("label")) },
      )
      29 -> scope.composeScoped5(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `shape` = node.arguments().shape("shape"),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = { RenderComposeChildren(node.slot("label")) },
      )
      30 -> scope.composeScoped5(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `shape` = node.arguments().shape("shape"),
        `modifier` = node.modifier("modifier", scope),
        `border` = node.jsonObject("border").toComposeBorderStroke(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = { RenderComposeChildren(node.slot("label")) },
      )
      31 -> scope.composeScoped5(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `shape` = node.arguments().shape("shape"),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = node.jsonObject("border").toComposeBorderStroke(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = { RenderComposeChildren(node.slot("label")) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.SegmentedButton [receiver: androidx.compose.material3.SingleChoiceSegmentedButtonRowScope](selected: kotlin.Boolean, onClick: kotlin.Function0<kotlin.Unit>, shape: androidx.compose.ui.graphics.Shape, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, colors: androidx.compose.material3.SegmentedButtonColors, border: androidx.compose.foundation.BorderStroke, contentPadding: androidx.compose.foundation.layout.PaddingValues, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, icon: kotlin.Function0<kotlin.Unit>, label: kotlin.Function0<kotlin.Unit>)
internal object RendererSegmentedButton_1 {
  @Composable
  fun render(node: ComposeNode, scope: androidx.compose.material3.SingleChoiceSegmentedButtonRowScope) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("border")) 2 else 0) +
      (if (node.has("contentPadding")) 4 else 0) +
      (if (node.has("interactionSource")) 8 else 0) +
      (if (node.has("icon")) 16 else 0)
    when (mask) {
      0 -> scope.composeScoped5(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `shape` = node.arguments().shape("shape"),
        `modifier` = node.modifier("modifier", scope),
        `label` = { RenderComposeChildren(node.slot("label")) },
      )
      1 -> scope.composeScoped5(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `shape` = node.arguments().shape("shape"),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = { RenderComposeChildren(node.slot("label")) },
      )
      2 -> scope.composeScoped5(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `shape` = node.arguments().shape("shape"),
        `modifier` = node.modifier("modifier", scope),
        `border` = node.jsonObject("border").toComposeBorderStroke(),
        `label` = { RenderComposeChildren(node.slot("label")) },
      )
      3 -> scope.composeScoped5(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `shape` = node.arguments().shape("shape"),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = node.jsonObject("border").toComposeBorderStroke(),
        `label` = { RenderComposeChildren(node.slot("label")) },
      )
      4 -> scope.composeScoped5(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `shape` = node.arguments().shape("shape"),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `label` = { RenderComposeChildren(node.slot("label")) },
      )
      5 -> scope.composeScoped5(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `shape` = node.arguments().shape("shape"),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `label` = { RenderComposeChildren(node.slot("label")) },
      )
      6 -> scope.composeScoped5(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `shape` = node.arguments().shape("shape"),
        `modifier` = node.modifier("modifier", scope),
        `border` = node.jsonObject("border").toComposeBorderStroke(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `label` = { RenderComposeChildren(node.slot("label")) },
      )
      7 -> scope.composeScoped5(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `shape` = node.arguments().shape("shape"),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = node.jsonObject("border").toComposeBorderStroke(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `label` = { RenderComposeChildren(node.slot("label")) },
      )
      8 -> scope.composeScoped5(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `shape` = node.arguments().shape("shape"),
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `label` = { RenderComposeChildren(node.slot("label")) },
      )
      9 -> scope.composeScoped5(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `shape` = node.arguments().shape("shape"),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `label` = { RenderComposeChildren(node.slot("label")) },
      )
      10 -> scope.composeScoped5(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `shape` = node.arguments().shape("shape"),
        `modifier` = node.modifier("modifier", scope),
        `border` = node.jsonObject("border").toComposeBorderStroke(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `label` = { RenderComposeChildren(node.slot("label")) },
      )
      11 -> scope.composeScoped5(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `shape` = node.arguments().shape("shape"),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = node.jsonObject("border").toComposeBorderStroke(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `label` = { RenderComposeChildren(node.slot("label")) },
      )
      12 -> scope.composeScoped5(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `shape` = node.arguments().shape("shape"),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `label` = { RenderComposeChildren(node.slot("label")) },
      )
      13 -> scope.composeScoped5(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `shape` = node.arguments().shape("shape"),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `label` = { RenderComposeChildren(node.slot("label")) },
      )
      14 -> scope.composeScoped5(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `shape` = node.arguments().shape("shape"),
        `modifier` = node.modifier("modifier", scope),
        `border` = node.jsonObject("border").toComposeBorderStroke(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `label` = { RenderComposeChildren(node.slot("label")) },
      )
      15 -> scope.composeScoped5(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `shape` = node.arguments().shape("shape"),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = node.jsonObject("border").toComposeBorderStroke(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `label` = { RenderComposeChildren(node.slot("label")) },
      )
      16 -> scope.composeScoped5(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `shape` = node.arguments().shape("shape"),
        `modifier` = node.modifier("modifier", scope),
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = { RenderComposeChildren(node.slot("label")) },
      )
      17 -> scope.composeScoped5(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `shape` = node.arguments().shape("shape"),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = { RenderComposeChildren(node.slot("label")) },
      )
      18 -> scope.composeScoped5(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `shape` = node.arguments().shape("shape"),
        `modifier` = node.modifier("modifier", scope),
        `border` = node.jsonObject("border").toComposeBorderStroke(),
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = { RenderComposeChildren(node.slot("label")) },
      )
      19 -> scope.composeScoped5(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `shape` = node.arguments().shape("shape"),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = node.jsonObject("border").toComposeBorderStroke(),
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = { RenderComposeChildren(node.slot("label")) },
      )
      20 -> scope.composeScoped5(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `shape` = node.arguments().shape("shape"),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = { RenderComposeChildren(node.slot("label")) },
      )
      21 -> scope.composeScoped5(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `shape` = node.arguments().shape("shape"),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = { RenderComposeChildren(node.slot("label")) },
      )
      22 -> scope.composeScoped5(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `shape` = node.arguments().shape("shape"),
        `modifier` = node.modifier("modifier", scope),
        `border` = node.jsonObject("border").toComposeBorderStroke(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = { RenderComposeChildren(node.slot("label")) },
      )
      23 -> scope.composeScoped5(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `shape` = node.arguments().shape("shape"),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = node.jsonObject("border").toComposeBorderStroke(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = { RenderComposeChildren(node.slot("label")) },
      )
      24 -> scope.composeScoped5(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `shape` = node.arguments().shape("shape"),
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = { RenderComposeChildren(node.slot("label")) },
      )
      25 -> scope.composeScoped5(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `shape` = node.arguments().shape("shape"),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = { RenderComposeChildren(node.slot("label")) },
      )
      26 -> scope.composeScoped5(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `shape` = node.arguments().shape("shape"),
        `modifier` = node.modifier("modifier", scope),
        `border` = node.jsonObject("border").toComposeBorderStroke(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = { RenderComposeChildren(node.slot("label")) },
      )
      27 -> scope.composeScoped5(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `shape` = node.arguments().shape("shape"),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = node.jsonObject("border").toComposeBorderStroke(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = { RenderComposeChildren(node.slot("label")) },
      )
      28 -> scope.composeScoped5(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `shape` = node.arguments().shape("shape"),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = { RenderComposeChildren(node.slot("label")) },
      )
      29 -> scope.composeScoped5(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `shape` = node.arguments().shape("shape"),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = { RenderComposeChildren(node.slot("label")) },
      )
      30 -> scope.composeScoped5(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `shape` = node.arguments().shape("shape"),
        `modifier` = node.modifier("modifier", scope),
        `border` = node.jsonObject("border").toComposeBorderStroke(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = { RenderComposeChildren(node.slot("label")) },
      )
      31 -> scope.composeScoped5(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `shape` = node.arguments().shape("shape"),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = node.jsonObject("border").toComposeBorderStroke(),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = { RenderComposeChildren(node.slot("label")) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.foundation.text.selection.SelectionContainer(modifier: androidx.compose.ui.Modifier, content: kotlin.Function0<kotlin.Unit>)
internal object RendererSelectionContainer {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    androidx.compose.foundation.text.selection.SelectionContainer(
      `modifier` = node.modifier("modifier", scope),
      content = { RenderComposeChildren(node.children) },
    )
  }
}

// androidx.compose.animation.SharedTransitionLayout(modifier: androidx.compose.ui.Modifier, content: kotlin.Function1<androidx.compose.animation.SharedTransitionScope, kotlin.Unit>)
internal object RendererSharedTransitionLayout {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    androidx.compose.animation.SharedTransitionLayout(
      `modifier` = node.modifier("modifier", scope),
      content = { RenderComposeChildren(node.children, this) },
    )
  }
}

// androidx.compose.material3.ShortNavigationBar(modifier: androidx.compose.ui.Modifier, containerColor: androidx.compose.ui.graphics.Color, contentColor: androidx.compose.ui.graphics.Color, windowInsets: androidx.compose.foundation.layout.WindowInsets, arrangement: androidx.compose.material3.ShortNavigationBarArrangement, content: kotlin.Function0<kotlin.Unit>)
internal object RendererShortNavigationBar {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("containerColor")) 1 else 0) +
      (if (node.has("contentColor")) 2 else 0) +
      (if (node.has("windowInsets")) 4 else 0)
    when (mask) {
      0 -> androidx.compose.material3.ShortNavigationBar(
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children) },
      )
      1 -> androidx.compose.material3.ShortNavigationBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children) },
      )
      2 -> androidx.compose.material3.ShortNavigationBar(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      3 -> androidx.compose.material3.ShortNavigationBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      4 -> androidx.compose.material3.ShortNavigationBar(
        `modifier` = node.modifier("modifier", scope),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children) },
      )
      5 -> androidx.compose.material3.ShortNavigationBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children) },
      )
      6 -> androidx.compose.material3.ShortNavigationBar(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children) },
      )
      7 -> androidx.compose.material3.ShortNavigationBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.ShortNavigationBarItem(selected: kotlin.Boolean, onClick: kotlin.Function0<kotlin.Unit>, icon: kotlin.Function0<kotlin.Unit>, label: kotlin.Function0<kotlin.Unit>?, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, iconPosition: androidx.compose.material3.NavigationItemIconPosition, colors: androidx.compose.material3.NavigationItemColors, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?)
internal object RendererShortNavigationBarItem {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("interactionSource")) 2 else 0)
    when (mask) {
      0 -> androidx.compose.material3.ShortNavigationBarItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.ShortNavigationBarItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
      )
      2 -> androidx.compose.material3.ShortNavigationBarItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      3 -> androidx.compose.material3.ShortNavigationBarItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.SingleChoiceSegmentedButtonRow(modifier: androidx.compose.ui.Modifier, space: androidx.compose.ui.unit.Dp, content: kotlin.Function1<androidx.compose.material3.SingleChoiceSegmentedButtonRowScope, kotlin.Unit>)
internal object RendererSingleChoiceSegmentedButtonRow {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("space")) 1 else 0)
    when (mask) {
      0 -> androidx.compose.material3.SingleChoiceSegmentedButtonRow(
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.material3.SingleChoiceSegmentedButtonRow(
        `modifier` = node.modifier("modifier", scope),
        `space` = node.number("space").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.Slider(state: androidx.compose.material3.SliderState, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, colors: androidx.compose.material3.SliderColors, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource, thumb: kotlin.Function1<androidx.compose.material3.SliderState, kotlin.Unit>, track: kotlin.Function1<androidx.compose.material3.SliderState, kotlin.Unit>)
internal object RendererSlider {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("interactionSource")) 2 else 0)
    when (mask) {
      0 -> androidx.compose.material3.Slider(
        `state` = node.jsonObject("state").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.Slider(
        `state` = node.jsonObject("state").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
      )
      2 -> androidx.compose.material3.Slider(
        `state` = node.jsonObject("state").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
      )
      3 -> androidx.compose.material3.Slider(
        `state` = node.jsonObject("state").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.Slider(value: kotlin.Float, onValueChange: kotlin.Function1<kotlin.Float, kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, valueRange: kotlin.ranges.ClosedFloatingPointRange<kotlin.Float>, steps: kotlin.Int, onValueChangeFinished: kotlin.Function0<kotlin.Unit>?, colors: androidx.compose.material3.SliderColors, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource)
internal object RendererSlider_1 {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("valueRange")) 2 else 0) +
      (if (node.has("steps")) 4 else 0) +
      (if (node.has("onValueChangeFinished")) 8 else 0) +
      (if (node.has("interactionSource")) 16 else 0)
    when (mask) {
      0 -> androidx.compose.material3.Slider(
        `value` = node.number("value").toFloat(),
        `onValueChange` = { value: Float -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.Slider(
        `value` = node.number("value").toFloat(),
        `onValueChange` = { value: Float -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
      )
      2 -> androidx.compose.material3.Slider(
        `value` = node.number("value").toFloat(),
        `onValueChange` = { value: Float -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `valueRange` = node.arguments().floatRange("valueRange"),
      )
      3 -> androidx.compose.material3.Slider(
        `value` = node.number("value").toFloat(),
        `onValueChange` = { value: Float -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `valueRange` = node.arguments().floatRange("valueRange"),
      )
      4 -> androidx.compose.material3.Slider(
        `value` = node.number("value").toFloat(),
        `onValueChange` = { value: Float -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `steps` = node.number("steps").toInt(),
      )
      5 -> androidx.compose.material3.Slider(
        `value` = node.number("value").toFloat(),
        `onValueChange` = { value: Float -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `steps` = node.number("steps").toInt(),
      )
      6 -> androidx.compose.material3.Slider(
        `value` = node.number("value").toFloat(),
        `onValueChange` = { value: Float -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `valueRange` = node.arguments().floatRange("valueRange"),
        `steps` = node.number("steps").toInt(),
      )
      7 -> androidx.compose.material3.Slider(
        `value` = node.number("value").toFloat(),
        `onValueChange` = { value: Float -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `valueRange` = node.arguments().floatRange("valueRange"),
        `steps` = node.number("steps").toInt(),
      )
      8 -> androidx.compose.material3.Slider(
        `value` = node.number("value").toFloat(),
        `onValueChange` = { value: Float -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }),
      )
      9 -> androidx.compose.material3.Slider(
        `value` = node.number("value").toFloat(),
        `onValueChange` = { value: Float -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }),
      )
      10 -> androidx.compose.material3.Slider(
        `value` = node.number("value").toFloat(),
        `onValueChange` = { value: Float -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `valueRange` = node.arguments().floatRange("valueRange"),
        `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }),
      )
      11 -> androidx.compose.material3.Slider(
        `value` = node.number("value").toFloat(),
        `onValueChange` = { value: Float -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `valueRange` = node.arguments().floatRange("valueRange"),
        `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }),
      )
      12 -> androidx.compose.material3.Slider(
        `value` = node.number("value").toFloat(),
        `onValueChange` = { value: Float -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `steps` = node.number("steps").toInt(),
        `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }),
      )
      13 -> androidx.compose.material3.Slider(
        `value` = node.number("value").toFloat(),
        `onValueChange` = { value: Float -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `steps` = node.number("steps").toInt(),
        `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }),
      )
      14 -> androidx.compose.material3.Slider(
        `value` = node.number("value").toFloat(),
        `onValueChange` = { value: Float -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `valueRange` = node.arguments().floatRange("valueRange"),
        `steps` = node.number("steps").toInt(),
        `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }),
      )
      15 -> androidx.compose.material3.Slider(
        `value` = node.number("value").toFloat(),
        `onValueChange` = { value: Float -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `valueRange` = node.arguments().floatRange("valueRange"),
        `steps` = node.number("steps").toInt(),
        `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }),
      )
      16 -> androidx.compose.material3.Slider(
        `value` = node.number("value").toFloat(),
        `onValueChange` = { value: Float -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
      )
      17 -> androidx.compose.material3.Slider(
        `value` = node.number("value").toFloat(),
        `onValueChange` = { value: Float -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
      )
      18 -> androidx.compose.material3.Slider(
        `value` = node.number("value").toFloat(),
        `onValueChange` = { value: Float -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `valueRange` = node.arguments().floatRange("valueRange"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
      )
      19 -> androidx.compose.material3.Slider(
        `value` = node.number("value").toFloat(),
        `onValueChange` = { value: Float -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `valueRange` = node.arguments().floatRange("valueRange"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
      )
      20 -> androidx.compose.material3.Slider(
        `value` = node.number("value").toFloat(),
        `onValueChange` = { value: Float -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `steps` = node.number("steps").toInt(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
      )
      21 -> androidx.compose.material3.Slider(
        `value` = node.number("value").toFloat(),
        `onValueChange` = { value: Float -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `steps` = node.number("steps").toInt(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
      )
      22 -> androidx.compose.material3.Slider(
        `value` = node.number("value").toFloat(),
        `onValueChange` = { value: Float -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `valueRange` = node.arguments().floatRange("valueRange"),
        `steps` = node.number("steps").toInt(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
      )
      23 -> androidx.compose.material3.Slider(
        `value` = node.number("value").toFloat(),
        `onValueChange` = { value: Float -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `valueRange` = node.arguments().floatRange("valueRange"),
        `steps` = node.number("steps").toInt(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
      )
      24 -> androidx.compose.material3.Slider(
        `value` = node.number("value").toFloat(),
        `onValueChange` = { value: Float -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
      )
      25 -> androidx.compose.material3.Slider(
        `value` = node.number("value").toFloat(),
        `onValueChange` = { value: Float -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
      )
      26 -> androidx.compose.material3.Slider(
        `value` = node.number("value").toFloat(),
        `onValueChange` = { value: Float -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `valueRange` = node.arguments().floatRange("valueRange"),
        `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
      )
      27 -> androidx.compose.material3.Slider(
        `value` = node.number("value").toFloat(),
        `onValueChange` = { value: Float -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `valueRange` = node.arguments().floatRange("valueRange"),
        `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
      )
      28 -> androidx.compose.material3.Slider(
        `value` = node.number("value").toFloat(),
        `onValueChange` = { value: Float -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `steps` = node.number("steps").toInt(),
        `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
      )
      29 -> androidx.compose.material3.Slider(
        `value` = node.number("value").toFloat(),
        `onValueChange` = { value: Float -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `steps` = node.number("steps").toInt(),
        `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
      )
      30 -> androidx.compose.material3.Slider(
        `value` = node.number("value").toFloat(),
        `onValueChange` = { value: Float -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `valueRange` = node.arguments().floatRange("valueRange"),
        `steps` = node.number("steps").toInt(),
        `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
      )
      31 -> androidx.compose.material3.Slider(
        `value` = node.number("value").toFloat(),
        `onValueChange` = { value: Float -> node.emit("onValueChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `valueRange` = node.arguments().floatRange("valueRange"),
        `steps` = node.number("steps").toInt(),
        `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.SmallExtendedFloatingActionButton(onClick: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, shape: androidx.compose.ui.graphics.Shape, containerColor: androidx.compose.ui.graphics.Color, contentColor: androidx.compose.ui.graphics.Color, elevation: androidx.compose.material3.FloatingActionButtonElevation, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>)
internal object RendererSmallExtendedFloatingActionButton {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("shape")) 1 else 0) +
      (if (node.has("containerColor")) 2 else 0) +
      (if (node.has("contentColor")) 4 else 0) +
      (if (node.has("interactionSource")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      2 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      4 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      8 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      9 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      10 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      11 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      12 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      13 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      14 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      15 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
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

// androidx.compose.material3.SmallExtendedFloatingActionButton(text: kotlin.Function0<kotlin.Unit>, icon: kotlin.Function0<kotlin.Unit>, onClick: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, expanded: kotlin.Boolean, shape: androidx.compose.ui.graphics.Shape, containerColor: androidx.compose.ui.graphics.Color, contentColor: androidx.compose.ui.graphics.Color, elevation: androidx.compose.material3.FloatingActionButtonElevation, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?)
internal object RendererSmallExtendedFloatingActionButton_1 {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("expanded")) 1 else 0) +
      (if (node.has("shape")) 2 else 0) +
      (if (node.has("containerColor")) 4 else 0) +
      (if (node.has("contentColor")) 8 else 0) +
      (if (node.has("interactionSource")) 16 else 0)
    when (mask) {
      0 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
      )
      2 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
      )
      3 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
        `shape` = node.arguments().shape("shape"),
      )
      4 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
      )
      5 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
        `containerColor` = node.color("containerColor"),
      )
      6 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
      )
      7 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
      )
      8 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
      )
      9 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
        `contentColor` = node.color("contentColor"),
      )
      10 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
      )
      11 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
      )
      12 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
      )
      13 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
      )
      14 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
      )
      15 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
      )
      16 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      17 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      18 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      19 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      20 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      21 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
        `containerColor` = node.color("containerColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      22 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      23 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      24 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      25 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      26 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      27 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      28 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      29 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `expanded` = node.boolean("expanded"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      30 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `text` = { RenderComposeChildren(node.slot("text")) },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      31 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
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

// androidx.compose.material3.SmallFloatingActionButton(onClick: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, shape: androidx.compose.ui.graphics.Shape, containerColor: androidx.compose.ui.graphics.Color, contentColor: androidx.compose.ui.graphics.Color, elevation: androidx.compose.material3.FloatingActionButtonElevation, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function0<kotlin.Unit>)
internal object RendererSmallFloatingActionButton {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("shape")) 1 else 0) +
      (if (node.has("containerColor")) 2 else 0) +
      (if (node.has("contentColor")) 4 else 0) +
      (if (node.has("interactionSource")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.material3.SmallFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children) },
      )
      1 -> androidx.compose.material3.SmallFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      2 -> androidx.compose.material3.SmallFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children) },
      )
      3 -> androidx.compose.material3.SmallFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children) },
      )
      4 -> androidx.compose.material3.SmallFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      5 -> androidx.compose.material3.SmallFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      6 -> androidx.compose.material3.SmallFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      7 -> androidx.compose.material3.SmallFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      8 -> androidx.compose.material3.SmallFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      9 -> androidx.compose.material3.SmallFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      10 -> androidx.compose.material3.SmallFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      11 -> androidx.compose.material3.SmallFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      12 -> androidx.compose.material3.SmallFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      13 -> androidx.compose.material3.SmallFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      14 -> androidx.compose.material3.SmallFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      15 -> androidx.compose.material3.SmallFloatingActionButton(
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

// androidx.compose.material3.Snackbar(modifier: androidx.compose.ui.Modifier, action: kotlin.Function0<kotlin.Unit>?, dismissAction: kotlin.Function0<kotlin.Unit>?, actionOnNewLine: kotlin.Boolean, shape: androidx.compose.ui.graphics.Shape, containerColor: androidx.compose.ui.graphics.Color, contentColor: androidx.compose.ui.graphics.Color, actionContentColor: androidx.compose.ui.graphics.Color, dismissActionContentColor: androidx.compose.ui.graphics.Color, content: kotlin.Function0<kotlin.Unit>)
internal object RendererSnackbar {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("action")) 1 else 0) +
      (if (node.has("dismissAction")) 2 else 0) +
      (if (node.has("actionOnNewLine")) 4 else 0) +
      (if (node.has("shape")) 8 else 0) +
      (if (node.has("containerColor")) 16 else 0) +
      (if (node.has("contentColor")) 32 else 0) +
      (if (node.has("actionContentColor")) 64 else 0) +
      (if (node.has("dismissActionContentColor")) 128 else 0)
    when (mask / 32) {
      0 -> renderSnackbarGroup0(node, scope, mask)
      1 -> renderSnackbarGroup1(node, scope, mask)
      2 -> renderSnackbarGroup2(node, scope, mask)
      3 -> renderSnackbarGroup3(node, scope, mask)
      4 -> renderSnackbarGroup4(node, scope, mask)
      5 -> renderSnackbarGroup5(node, scope, mask)
      6 -> renderSnackbarGroup6(node, scope, mask)
      7 -> renderSnackbarGroup7(node, scope, mask)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSnackbarGroup0(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      0 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children) },
      )
      1 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        content = { RenderComposeChildren(node.children) },
      )
      2 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        content = { RenderComposeChildren(node.children) },
      )
      3 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        content = { RenderComposeChildren(node.children) },
      )
      4 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        content = { RenderComposeChildren(node.children) },
      )
      5 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        content = { RenderComposeChildren(node.children) },
      )
      6 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        content = { RenderComposeChildren(node.children) },
      )
      7 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        content = { RenderComposeChildren(node.children) },
      )
      8 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      9 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      10 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      11 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      12 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      13 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      14 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      15 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      16 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children) },
      )
      17 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children) },
      )
      18 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children) },
      )
      19 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children) },
      )
      20 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children) },
      )
      21 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children) },
      )
      22 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children) },
      )
      23 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children) },
      )
      24 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children) },
      )
      25 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children) },
      )
      26 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children) },
      )
      27 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children) },
      )
      28 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children) },
      )
      29 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children) },
      )
      30 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children) },
      )
      31 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSnackbarGroup1(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      33 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      34 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      35 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      36 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      37 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      38 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      39 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      40 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      41 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      42 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      43 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      44 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      45 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      46 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      47 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      48 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      49 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      50 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      51 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      52 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      53 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      54 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      55 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      56 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      57 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      58 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      59 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      60 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      61 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      62 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      63 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSnackbarGroup2(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      64 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `actionContentColor` = node.color("actionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      65 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `actionContentColor` = node.color("actionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      66 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `actionContentColor` = node.color("actionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      67 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `actionContentColor` = node.color("actionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      68 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `actionContentColor` = node.color("actionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      69 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `actionContentColor` = node.color("actionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      70 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `actionContentColor` = node.color("actionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      71 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `actionContentColor` = node.color("actionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      72 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `actionContentColor` = node.color("actionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      73 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `shape` = node.arguments().shape("shape"),
        `actionContentColor` = node.color("actionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      74 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `shape` = node.arguments().shape("shape"),
        `actionContentColor` = node.color("actionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      75 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `shape` = node.arguments().shape("shape"),
        `actionContentColor` = node.color("actionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      76 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `shape` = node.arguments().shape("shape"),
        `actionContentColor` = node.color("actionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      77 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `shape` = node.arguments().shape("shape"),
        `actionContentColor` = node.color("actionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      78 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `shape` = node.arguments().shape("shape"),
        `actionContentColor` = node.color("actionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      79 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `shape` = node.arguments().shape("shape"),
        `actionContentColor` = node.color("actionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      80 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `actionContentColor` = node.color("actionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      81 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `containerColor` = node.color("containerColor"),
        `actionContentColor` = node.color("actionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      82 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `containerColor` = node.color("containerColor"),
        `actionContentColor` = node.color("actionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      83 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `containerColor` = node.color("containerColor"),
        `actionContentColor` = node.color("actionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      84 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `containerColor` = node.color("containerColor"),
        `actionContentColor` = node.color("actionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      85 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `containerColor` = node.color("containerColor"),
        `actionContentColor` = node.color("actionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      86 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `containerColor` = node.color("containerColor"),
        `actionContentColor` = node.color("actionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      87 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `containerColor` = node.color("containerColor"),
        `actionContentColor` = node.color("actionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      88 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `actionContentColor` = node.color("actionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      89 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `actionContentColor` = node.color("actionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      90 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `actionContentColor` = node.color("actionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      91 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `actionContentColor` = node.color("actionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      92 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `actionContentColor` = node.color("actionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      93 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `actionContentColor` = node.color("actionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      94 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `actionContentColor` = node.color("actionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      95 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `actionContentColor` = node.color("actionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSnackbarGroup3(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      96 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `actionContentColor` = node.color("actionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      97 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `contentColor` = node.color("contentColor"),
        `actionContentColor` = node.color("actionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      98 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `contentColor` = node.color("contentColor"),
        `actionContentColor` = node.color("actionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      99 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `contentColor` = node.color("contentColor"),
        `actionContentColor` = node.color("actionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      100 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `contentColor` = node.color("contentColor"),
        `actionContentColor` = node.color("actionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      101 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `contentColor` = node.color("contentColor"),
        `actionContentColor` = node.color("actionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      102 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `contentColor` = node.color("contentColor"),
        `actionContentColor` = node.color("actionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      103 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `contentColor` = node.color("contentColor"),
        `actionContentColor` = node.color("actionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      104 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `actionContentColor` = node.color("actionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      105 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `actionContentColor` = node.color("actionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      106 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `actionContentColor` = node.color("actionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      107 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `actionContentColor` = node.color("actionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      108 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `actionContentColor` = node.color("actionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      109 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `actionContentColor` = node.color("actionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      110 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `actionContentColor` = node.color("actionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      111 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `actionContentColor` = node.color("actionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      112 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `actionContentColor` = node.color("actionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      113 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `actionContentColor` = node.color("actionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      114 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `actionContentColor` = node.color("actionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      115 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `actionContentColor` = node.color("actionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      116 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `actionContentColor` = node.color("actionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      117 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `actionContentColor` = node.color("actionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      118 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `actionContentColor` = node.color("actionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      119 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `actionContentColor` = node.color("actionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      120 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `actionContentColor` = node.color("actionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      121 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `actionContentColor` = node.color("actionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      122 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `actionContentColor` = node.color("actionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      123 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `actionContentColor` = node.color("actionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      124 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `actionContentColor` = node.color("actionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      125 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `actionContentColor` = node.color("actionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      126 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `actionContentColor` = node.color("actionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      127 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `actionContentColor` = node.color("actionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSnackbarGroup4(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      128 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      129 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      130 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      131 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      132 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      133 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      134 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      135 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      136 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      137 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `shape` = node.arguments().shape("shape"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      138 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `shape` = node.arguments().shape("shape"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      139 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `shape` = node.arguments().shape("shape"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      140 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `shape` = node.arguments().shape("shape"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      141 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `shape` = node.arguments().shape("shape"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      142 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `shape` = node.arguments().shape("shape"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      143 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `shape` = node.arguments().shape("shape"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      144 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      145 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `containerColor` = node.color("containerColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      146 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `containerColor` = node.color("containerColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      147 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `containerColor` = node.color("containerColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      148 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `containerColor` = node.color("containerColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      149 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `containerColor` = node.color("containerColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      150 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `containerColor` = node.color("containerColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      151 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `containerColor` = node.color("containerColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      152 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      153 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      154 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      155 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      156 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      157 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      158 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      159 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSnackbarGroup5(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      160 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      161 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `contentColor` = node.color("contentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      162 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `contentColor` = node.color("contentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      163 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `contentColor` = node.color("contentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      164 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `contentColor` = node.color("contentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      165 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `contentColor` = node.color("contentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      166 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `contentColor` = node.color("contentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      167 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `contentColor` = node.color("contentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      168 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      169 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      170 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      171 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      172 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      173 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      174 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      175 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      176 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      177 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      178 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      179 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      180 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      181 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      182 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      183 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      184 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      185 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      186 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      187 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      188 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      189 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      190 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      191 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSnackbarGroup6(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      192 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `actionContentColor` = node.color("actionContentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      193 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `actionContentColor` = node.color("actionContentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      194 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `actionContentColor` = node.color("actionContentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      195 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `actionContentColor` = node.color("actionContentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      196 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `actionContentColor` = node.color("actionContentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      197 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `actionContentColor` = node.color("actionContentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      198 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `actionContentColor` = node.color("actionContentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      199 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `actionContentColor` = node.color("actionContentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      200 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `actionContentColor` = node.color("actionContentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      201 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `shape` = node.arguments().shape("shape"),
        `actionContentColor` = node.color("actionContentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      202 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `shape` = node.arguments().shape("shape"),
        `actionContentColor` = node.color("actionContentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      203 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `shape` = node.arguments().shape("shape"),
        `actionContentColor` = node.color("actionContentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      204 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `shape` = node.arguments().shape("shape"),
        `actionContentColor` = node.color("actionContentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      205 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `shape` = node.arguments().shape("shape"),
        `actionContentColor` = node.color("actionContentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      206 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `shape` = node.arguments().shape("shape"),
        `actionContentColor` = node.color("actionContentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      207 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `shape` = node.arguments().shape("shape"),
        `actionContentColor` = node.color("actionContentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      208 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `actionContentColor` = node.color("actionContentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      209 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `containerColor` = node.color("containerColor"),
        `actionContentColor` = node.color("actionContentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      210 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `containerColor` = node.color("containerColor"),
        `actionContentColor` = node.color("actionContentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      211 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `containerColor` = node.color("containerColor"),
        `actionContentColor` = node.color("actionContentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      212 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `containerColor` = node.color("containerColor"),
        `actionContentColor` = node.color("actionContentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      213 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `containerColor` = node.color("containerColor"),
        `actionContentColor` = node.color("actionContentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      214 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `containerColor` = node.color("containerColor"),
        `actionContentColor` = node.color("actionContentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      215 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `containerColor` = node.color("containerColor"),
        `actionContentColor` = node.color("actionContentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      216 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `actionContentColor` = node.color("actionContentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      217 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `actionContentColor` = node.color("actionContentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      218 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `actionContentColor` = node.color("actionContentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      219 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `actionContentColor` = node.color("actionContentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      220 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `actionContentColor` = node.color("actionContentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      221 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `actionContentColor` = node.color("actionContentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      222 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `actionContentColor` = node.color("actionContentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      223 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `actionContentColor` = node.color("actionContentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSnackbarGroup7(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      224 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `actionContentColor` = node.color("actionContentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      225 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `contentColor` = node.color("contentColor"),
        `actionContentColor` = node.color("actionContentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      226 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `contentColor` = node.color("contentColor"),
        `actionContentColor` = node.color("actionContentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      227 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `contentColor` = node.color("contentColor"),
        `actionContentColor` = node.color("actionContentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      228 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `contentColor` = node.color("contentColor"),
        `actionContentColor` = node.color("actionContentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      229 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `contentColor` = node.color("contentColor"),
        `actionContentColor` = node.color("actionContentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      230 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `contentColor` = node.color("contentColor"),
        `actionContentColor` = node.color("actionContentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      231 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `contentColor` = node.color("contentColor"),
        `actionContentColor` = node.color("actionContentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      232 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `actionContentColor` = node.color("actionContentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      233 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `actionContentColor` = node.color("actionContentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      234 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `actionContentColor` = node.color("actionContentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      235 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `actionContentColor` = node.color("actionContentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      236 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `actionContentColor` = node.color("actionContentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      237 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `actionContentColor` = node.color("actionContentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      238 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `actionContentColor` = node.color("actionContentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      239 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `actionContentColor` = node.color("actionContentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      240 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `actionContentColor` = node.color("actionContentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      241 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `actionContentColor` = node.color("actionContentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      242 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `actionContentColor` = node.color("actionContentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      243 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `actionContentColor` = node.color("actionContentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      244 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `actionContentColor` = node.color("actionContentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      245 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `actionContentColor` = node.color("actionContentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      246 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `actionContentColor` = node.color("actionContentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      247 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `actionContentColor` = node.color("actionContentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      248 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `actionContentColor` = node.color("actionContentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      249 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `actionContentColor` = node.color("actionContentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      250 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `actionContentColor` = node.color("actionContentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      251 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `actionContentColor` = node.color("actionContentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      252 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `actionContentColor` = node.color("actionContentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      253 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `actionContentColor` = node.color("actionContentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      254 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `actionContentColor` = node.color("actionContentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      255 -> androidx.compose.material3.Snackbar(
        `modifier` = node.modifier("modifier", scope),
        `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
        `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
        `actionOnNewLine` = node.boolean("actionOnNewLine"),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `actionContentColor` = node.color("actionContentColor"),
        `dismissActionContentColor` = node.color("dismissActionContentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.SnackbarHost(hostState: androidx.compose.material3.SnackbarHostState, modifier: androidx.compose.ui.Modifier, snackbar: kotlin.Function1<androidx.compose.material3.SnackbarData, kotlin.Unit>)
internal object RendererSnackbarHost {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val hostStateValue = if (node.has("hostState") && !node.isNull("hostState")) node.jsonObject("hostState").rememberComposeSnackbarHostState() else null
    androidx.compose.material3.SnackbarHost(
      `hostState` = requireNotNull(hostStateValue),
      `modifier` = node.modifier("modifier", scope),
    )
  }
}

// androidx.compose.foundation.layout.Spacer(modifier: androidx.compose.ui.Modifier)
internal object RendererSpacer {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    androidx.compose.foundation.layout.Spacer(
      `modifier` = node.modifier("modifier", scope),
    )
  }
}

// androidx.compose.material3.SplitButtonLayout(leadingButton: kotlin.Function0<kotlin.Unit>, trailingButton: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, spacing: androidx.compose.ui.unit.Dp)
internal object RendererSplitButtonLayout {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("spacing")) 1 else 0)
    when (mask) {
      0 -> androidx.compose.material3.SplitButtonLayout(
        `leadingButton` = { RenderComposeChildren(node.slot("leadingButton")) },
        `trailingButton` = { RenderComposeChildren(node.slot("trailingButton")) },
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.SplitButtonLayout(
        `leadingButton` = { RenderComposeChildren(node.slot("leadingButton")) },
        `trailingButton` = { RenderComposeChildren(node.slot("trailingButton")) },
        `modifier` = node.modifier("modifier", scope),
        `spacing` = node.number("spacing").dp,
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.FloatingToolbarDefaults.StandardFloatingActionButton(onClick: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, shape: androidx.compose.ui.graphics.Shape, containerColor: androidx.compose.ui.graphics.Color, contentColor: androidx.compose.ui.graphics.Color, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function0<kotlin.Unit>)
internal object RendererStandardFloatingActionButton {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("shape")) 1 else 0) +
      (if (node.has("containerColor")) 2 else 0) +
      (if (node.has("contentColor")) 4 else 0) +
      (if (node.has("interactionSource")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.material3.FloatingToolbarDefaults.StandardFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children) },
      )
      1 -> androidx.compose.material3.FloatingToolbarDefaults.StandardFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      2 -> androidx.compose.material3.FloatingToolbarDefaults.StandardFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children) },
      )
      3 -> androidx.compose.material3.FloatingToolbarDefaults.StandardFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children) },
      )
      4 -> androidx.compose.material3.FloatingToolbarDefaults.StandardFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      5 -> androidx.compose.material3.FloatingToolbarDefaults.StandardFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      6 -> androidx.compose.material3.FloatingToolbarDefaults.StandardFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      7 -> androidx.compose.material3.FloatingToolbarDefaults.StandardFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      8 -> androidx.compose.material3.FloatingToolbarDefaults.StandardFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      9 -> androidx.compose.material3.FloatingToolbarDefaults.StandardFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      10 -> androidx.compose.material3.FloatingToolbarDefaults.StandardFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      11 -> androidx.compose.material3.FloatingToolbarDefaults.StandardFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      12 -> androidx.compose.material3.FloatingToolbarDefaults.StandardFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      13 -> androidx.compose.material3.FloatingToolbarDefaults.StandardFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      14 -> androidx.compose.material3.FloatingToolbarDefaults.StandardFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      15 -> androidx.compose.material3.FloatingToolbarDefaults.StandardFloatingActionButton(
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

// androidx.compose.material3.SuggestionChip(onClick: kotlin.Function0<kotlin.Unit>, label: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, icon: kotlin.Function0<kotlin.Unit>?, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.ChipColors, elevation: androidx.compose.material3.ChipElevation?, border: androidx.compose.foundation.BorderStroke?, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?)
internal object RendererSuggestionChip {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("icon")) 2 else 0) +
      (if (node.has("shape")) 4 else 0) +
      (if (node.has("border")) 8 else 0) +
      (if (node.has("interactionSource")) 16 else 0)
    when (mask) {
      0 -> androidx.compose.material3.SuggestionChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.SuggestionChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
      )
      2 -> androidx.compose.material3.SuggestionChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
      )
      3 -> androidx.compose.material3.SuggestionChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
      )
      4 -> androidx.compose.material3.SuggestionChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
      )
      5 -> androidx.compose.material3.SuggestionChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
      )
      6 -> androidx.compose.material3.SuggestionChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      7 -> androidx.compose.material3.SuggestionChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      8 -> androidx.compose.material3.SuggestionChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
      )
      9 -> androidx.compose.material3.SuggestionChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
      )
      10 -> androidx.compose.material3.SuggestionChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
      )
      11 -> androidx.compose.material3.SuggestionChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
      )
      12 -> androidx.compose.material3.SuggestionChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
      )
      13 -> androidx.compose.material3.SuggestionChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
      )
      14 -> androidx.compose.material3.SuggestionChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
      )
      15 -> androidx.compose.material3.SuggestionChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
      )
      16 -> androidx.compose.material3.SuggestionChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      17 -> androidx.compose.material3.SuggestionChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      18 -> androidx.compose.material3.SuggestionChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      19 -> androidx.compose.material3.SuggestionChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      20 -> androidx.compose.material3.SuggestionChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      21 -> androidx.compose.material3.SuggestionChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      22 -> androidx.compose.material3.SuggestionChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      23 -> androidx.compose.material3.SuggestionChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      24 -> androidx.compose.material3.SuggestionChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      25 -> androidx.compose.material3.SuggestionChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      26 -> androidx.compose.material3.SuggestionChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      27 -> androidx.compose.material3.SuggestionChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      28 -> androidx.compose.material3.SuggestionChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      29 -> androidx.compose.material3.SuggestionChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      30 -> androidx.compose.material3.SuggestionChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      31 -> androidx.compose.material3.SuggestionChip(
        `onClick` = { node.emit("onClick") },
        `label` = { RenderComposeChildren(node.slot("label")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.Surface(modifier: androidx.compose.ui.Modifier, shape: androidx.compose.ui.graphics.Shape, color: androidx.compose.ui.graphics.Color, contentColor: androidx.compose.ui.graphics.Color, tonalElevation: androidx.compose.ui.unit.Dp, shadowElevation: androidx.compose.ui.unit.Dp, border: androidx.compose.foundation.BorderStroke?, content: kotlin.Function0<kotlin.Unit>)
internal object RendererSurface {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("shape")) 1 else 0) +
      (if (node.has("color")) 2 else 0) +
      (if (node.has("contentColor")) 4 else 0) +
      (if (node.has("tonalElevation")) 8 else 0) +
      (if (node.has("shadowElevation")) 16 else 0) +
      (if (node.has("border")) 32 else 0)
    when (mask / 32) {
      0 -> renderSurfaceGroup0(node, scope, mask)
      1 -> renderSurfaceGroup1(node, scope, mask)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSurfaceGroup0(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      0 -> androidx.compose.material3.Surface(
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children) },
      )
      1 -> androidx.compose.material3.Surface(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      2 -> androidx.compose.material3.Surface(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        content = { RenderComposeChildren(node.children) },
      )
      3 -> androidx.compose.material3.Surface(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        content = { RenderComposeChildren(node.children) },
      )
      4 -> androidx.compose.material3.Surface(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      5 -> androidx.compose.material3.Surface(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      6 -> androidx.compose.material3.Surface(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      7 -> androidx.compose.material3.Surface(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      8 -> androidx.compose.material3.Surface(
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      9 -> androidx.compose.material3.Surface(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      10 -> androidx.compose.material3.Surface(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      11 -> androidx.compose.material3.Surface(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      12 -> androidx.compose.material3.Surface(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      13 -> androidx.compose.material3.Surface(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      14 -> androidx.compose.material3.Surface(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      15 -> androidx.compose.material3.Surface(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      16 -> androidx.compose.material3.Surface(
        `modifier` = node.modifier("modifier", scope),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      17 -> androidx.compose.material3.Surface(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      18 -> androidx.compose.material3.Surface(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      19 -> androidx.compose.material3.Surface(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      20 -> androidx.compose.material3.Surface(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      21 -> androidx.compose.material3.Surface(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      22 -> androidx.compose.material3.Surface(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      23 -> androidx.compose.material3.Surface(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      24 -> androidx.compose.material3.Surface(
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      25 -> androidx.compose.material3.Surface(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      26 -> androidx.compose.material3.Surface(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      27 -> androidx.compose.material3.Surface(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      28 -> androidx.compose.material3.Surface(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      29 -> androidx.compose.material3.Surface(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      30 -> androidx.compose.material3.Surface(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      31 -> androidx.compose.material3.Surface(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSurfaceGroup1(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32 -> androidx.compose.material3.Surface(
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      33 -> androidx.compose.material3.Surface(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      34 -> androidx.compose.material3.Surface(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      35 -> androidx.compose.material3.Surface(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      36 -> androidx.compose.material3.Surface(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      37 -> androidx.compose.material3.Surface(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      38 -> androidx.compose.material3.Surface(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      39 -> androidx.compose.material3.Surface(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      40 -> androidx.compose.material3.Surface(
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      41 -> androidx.compose.material3.Surface(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      42 -> androidx.compose.material3.Surface(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      43 -> androidx.compose.material3.Surface(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      44 -> androidx.compose.material3.Surface(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      45 -> androidx.compose.material3.Surface(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      46 -> androidx.compose.material3.Surface(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      47 -> androidx.compose.material3.Surface(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      48 -> androidx.compose.material3.Surface(
        `modifier` = node.modifier("modifier", scope),
        `shadowElevation` = node.number("shadowElevation").dp,
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      49 -> androidx.compose.material3.Surface(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `shadowElevation` = node.number("shadowElevation").dp,
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      50 -> androidx.compose.material3.Surface(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `shadowElevation` = node.number("shadowElevation").dp,
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      51 -> androidx.compose.material3.Surface(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `shadowElevation` = node.number("shadowElevation").dp,
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      52 -> androidx.compose.material3.Surface(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      53 -> androidx.compose.material3.Surface(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      54 -> androidx.compose.material3.Surface(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      55 -> androidx.compose.material3.Surface(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      56 -> androidx.compose.material3.Surface(
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      57 -> androidx.compose.material3.Surface(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      58 -> androidx.compose.material3.Surface(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      59 -> androidx.compose.material3.Surface(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      60 -> androidx.compose.material3.Surface(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      61 -> androidx.compose.material3.Surface(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      62 -> androidx.compose.material3.Surface(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      63 -> androidx.compose.material3.Surface(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.Surface(onClick: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, shape: androidx.compose.ui.graphics.Shape, color: androidx.compose.ui.graphics.Color, contentColor: androidx.compose.ui.graphics.Color, tonalElevation: androidx.compose.ui.unit.Dp, shadowElevation: androidx.compose.ui.unit.Dp, border: androidx.compose.foundation.BorderStroke?, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function0<kotlin.Unit>)
internal object RendererSurface_1 {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("shape")) 2 else 0) +
      (if (node.has("color")) 4 else 0) +
      (if (node.has("contentColor")) 8 else 0) +
      (if (node.has("tonalElevation")) 16 else 0) +
      (if (node.has("shadowElevation")) 32 else 0) +
      (if (node.has("border")) 64 else 0) +
      (if (node.has("interactionSource")) 128 else 0)
    when (mask / 32) {
      0 -> renderSurface_1Group0(node, scope, mask)
      1 -> renderSurface_1Group1(node, scope, mask)
      2 -> renderSurface_1Group2(node, scope, mask)
      4 -> renderSurface_1Group4(node, scope, mask)
      5 -> renderSurface_1Group5(node, scope, mask)
      7 -> renderSurface_1Group7(node, scope, mask)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSurface_1Group0(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      0 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children) },
      )
      1 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        content = { RenderComposeChildren(node.children) },
      )
      2 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      3 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      4 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        content = { RenderComposeChildren(node.children) },
      )
      5 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `color` = node.color("color"),
        content = { RenderComposeChildren(node.children) },
      )
      6 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        content = { RenderComposeChildren(node.children) },
      )
      7 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        content = { RenderComposeChildren(node.children) },
      )
      8 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      9 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      10 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      11 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      12 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      13 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      14 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      15 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      16 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      17 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      18 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      19 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      20 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      21 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `color` = node.color("color"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      22 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      23 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      24 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      25 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      26 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      27 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      28 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      29 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      30 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      31 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSurface_1Group1(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      33 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      34 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      35 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      36 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      37 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `color` = node.color("color"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      38 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      39 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      40 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      41 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentColor` = node.color("contentColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      42 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      43 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      44 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      45 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      46 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      47 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      48 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      49 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      50 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      51 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      52 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      53 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `color` = node.color("color"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      54 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      55 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      56 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      57 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      58 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      59 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      60 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      61 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      62 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      63 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSurface_1Group2(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      64 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      65 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      68 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      69 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `color` = node.color("color"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      72 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      73 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentColor` = node.color("contentColor"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      76 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      77 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      80 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      81 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      84 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      85 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `color` = node.color("color"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      88 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      89 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      92 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      93 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSurface_1Group4(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      128 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      129 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      130 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      131 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      132 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      133 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `color` = node.color("color"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      134 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      135 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      136 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      137 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      138 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      139 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      140 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      141 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      142 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      143 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      144 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      145 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      146 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      147 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      148 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      149 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `color` = node.color("color"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      150 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      151 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      152 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      153 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      154 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      155 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      156 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      157 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      158 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      159 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSurface_1Group5(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      160 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      161 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      162 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      163 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      164 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      165 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `color` = node.color("color"),
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      166 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      167 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      168 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      169 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentColor` = node.color("contentColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      170 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      171 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      172 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      173 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      174 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      175 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      176 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      177 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      178 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      179 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      180 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      181 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `color` = node.color("color"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      182 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      183 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      184 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      185 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      186 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      187 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      188 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      189 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      190 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      191 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSurface_1Group7(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      255 -> androidx.compose.material3.Surface(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.Surface(checked: kotlin.Boolean, onCheckedChange: kotlin.Function1<kotlin.Boolean, kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, shape: androidx.compose.ui.graphics.Shape, color: androidx.compose.ui.graphics.Color, contentColor: androidx.compose.ui.graphics.Color, tonalElevation: androidx.compose.ui.unit.Dp, shadowElevation: androidx.compose.ui.unit.Dp, border: androidx.compose.foundation.BorderStroke?, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function0<kotlin.Unit>)
internal object RendererSurface_2 {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("shape")) 2 else 0) +
      (if (node.has("color")) 4 else 0) +
      (if (node.has("contentColor")) 8 else 0) +
      (if (node.has("tonalElevation")) 16 else 0) +
      (if (node.has("shadowElevation")) 32 else 0) +
      (if (node.has("border")) 64 else 0) +
      (if (node.has("interactionSource")) 128 else 0)
    when (mask / 32) {
      0 -> renderSurface_2Group0(node, scope, mask)
      1 -> renderSurface_2Group1(node, scope, mask)
      2 -> renderSurface_2Group2(node, scope, mask)
      4 -> renderSurface_2Group4(node, scope, mask)
      5 -> renderSurface_2Group5(node, scope, mask)
      7 -> renderSurface_2Group7(node, scope, mask)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSurface_2Group0(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      0 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children) },
      )
      1 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        content = { RenderComposeChildren(node.children) },
      )
      2 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      3 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      4 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        content = { RenderComposeChildren(node.children) },
      )
      5 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `color` = node.color("color"),
        content = { RenderComposeChildren(node.children) },
      )
      6 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        content = { RenderComposeChildren(node.children) },
      )
      7 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        content = { RenderComposeChildren(node.children) },
      )
      8 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      9 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      10 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      11 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      12 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      13 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      14 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      15 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      16 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      17 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      18 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      19 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      20 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      21 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `color` = node.color("color"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      22 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      23 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      24 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      25 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      26 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      27 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      28 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      29 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      30 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      31 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSurface_2Group1(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      33 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      34 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      35 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      36 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      37 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `color` = node.color("color"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      38 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      39 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      40 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      41 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentColor` = node.color("contentColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      42 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      43 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      44 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      45 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      46 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      47 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      48 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      49 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      50 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      51 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      52 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      53 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `color` = node.color("color"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      54 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      55 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      56 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      57 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      58 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      59 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      60 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      61 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      62 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      63 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSurface_2Group2(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      64 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      65 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      68 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      69 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `color` = node.color("color"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      72 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      73 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentColor` = node.color("contentColor"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      76 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      77 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      80 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      81 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      84 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      85 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `color` = node.color("color"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      88 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      89 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      92 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      93 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSurface_2Group4(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      128 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      129 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      130 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      131 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      132 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      133 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `color` = node.color("color"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      134 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      135 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      136 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      137 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      138 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      139 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      140 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      141 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      142 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      143 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      144 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      145 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      146 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      147 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      148 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      149 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `color` = node.color("color"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      150 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      151 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      152 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      153 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      154 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      155 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      156 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      157 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      158 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      159 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSurface_2Group5(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      160 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      161 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      162 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      163 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      164 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      165 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `color` = node.color("color"),
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      166 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      167 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      168 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      169 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentColor` = node.color("contentColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      170 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      171 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      172 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      173 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      174 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      175 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      176 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      177 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      178 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      179 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      180 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      181 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `color` = node.color("color"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      182 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      183 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      184 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      185 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      186 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      187 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      188 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      189 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      190 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      191 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSurface_2Group7(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      255 -> androidx.compose.material3.Surface(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.Surface(selected: kotlin.Boolean, onClick: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, shape: androidx.compose.ui.graphics.Shape, color: androidx.compose.ui.graphics.Color, contentColor: androidx.compose.ui.graphics.Color, tonalElevation: androidx.compose.ui.unit.Dp, shadowElevation: androidx.compose.ui.unit.Dp, border: androidx.compose.foundation.BorderStroke?, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function0<kotlin.Unit>)
internal object RendererSurface_3 {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("shape")) 2 else 0) +
      (if (node.has("color")) 4 else 0) +
      (if (node.has("contentColor")) 8 else 0) +
      (if (node.has("tonalElevation")) 16 else 0) +
      (if (node.has("shadowElevation")) 32 else 0) +
      (if (node.has("border")) 64 else 0) +
      (if (node.has("interactionSource")) 128 else 0)
    when (mask / 32) {
      0 -> renderSurface_3Group0(node, scope, mask)
      1 -> renderSurface_3Group1(node, scope, mask)
      2 -> renderSurface_3Group2(node, scope, mask)
      4 -> renderSurface_3Group4(node, scope, mask)
      5 -> renderSurface_3Group5(node, scope, mask)
      7 -> renderSurface_3Group7(node, scope, mask)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSurface_3Group0(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      0 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children) },
      )
      1 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        content = { RenderComposeChildren(node.children) },
      )
      2 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      3 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      4 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        content = { RenderComposeChildren(node.children) },
      )
      5 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `color` = node.color("color"),
        content = { RenderComposeChildren(node.children) },
      )
      6 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        content = { RenderComposeChildren(node.children) },
      )
      7 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        content = { RenderComposeChildren(node.children) },
      )
      8 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      9 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      10 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      11 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      12 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      13 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      14 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      15 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      16 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      17 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      18 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      19 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      20 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      21 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `color` = node.color("color"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      22 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      23 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      24 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      25 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      26 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      27 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      28 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      29 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      30 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      31 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSurface_3Group1(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      33 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      34 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      35 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      36 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      37 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `color` = node.color("color"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      38 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      39 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      40 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      41 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentColor` = node.color("contentColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      42 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      43 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      44 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      45 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      46 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      47 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      48 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      49 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      50 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      51 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      52 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      53 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `color` = node.color("color"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      54 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      55 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      56 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      57 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      58 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      59 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      60 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      61 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      62 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      63 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSurface_3Group2(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      64 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      65 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      68 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      69 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `color` = node.color("color"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      72 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      73 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentColor` = node.color("contentColor"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      76 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      77 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      80 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      81 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      84 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      85 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `color` = node.color("color"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      88 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      89 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      92 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      93 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSurface_3Group4(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      128 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      129 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      130 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      131 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      132 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      133 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `color` = node.color("color"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      134 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      135 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      136 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      137 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      138 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      139 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      140 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      141 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      142 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      143 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      144 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      145 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      146 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      147 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      148 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      149 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `color` = node.color("color"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      150 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      151 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      152 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      153 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      154 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      155 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      156 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      157 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      158 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      159 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSurface_3Group5(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      160 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      161 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      162 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      163 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      164 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      165 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `color` = node.color("color"),
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      166 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      167 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      168 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      169 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentColor` = node.color("contentColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      170 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      171 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      172 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      173 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      174 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      175 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      176 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      177 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      178 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      179 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      180 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      181 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `color` = node.color("color"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      182 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      183 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      184 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      185 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      186 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      187 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      188 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      189 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      190 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      191 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSurface_3Group7(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      255 -> androidx.compose.material3.Surface(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `color` = node.color("color"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.SwipeToDismissBox(state: androidx.compose.material3.SwipeToDismissBoxState, backgroundContent: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enableDismissFromStartToEnd: kotlin.Boolean, enableDismissFromEndToStart: kotlin.Boolean, gesturesEnabled: kotlin.Boolean, content: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>)
internal object RendererSwipeToDismissBox {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val stateValue = if (node.has("state") && !node.isNull("state")) node.jsonObject("state").rememberComposeSwipeToDismissState() else null
    val mask = (if (node.has("enableDismissFromStartToEnd")) 1 else 0) +
      (if (node.has("enableDismissFromEndToStart")) 2 else 0) +
      (if (node.has("gesturesEnabled")) 4 else 0)
    when (mask) {
      0 -> androidx.compose.material3.SwipeToDismissBox(
        `state` = requireNotNull(stateValue),
        `backgroundContent` = { RenderComposeChildren(node.slot("backgroundContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.material3.SwipeToDismissBox(
        `state` = requireNotNull(stateValue),
        `backgroundContent` = { RenderComposeChildren(node.slot("backgroundContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `enableDismissFromStartToEnd` = node.boolean("enableDismissFromStartToEnd"),
        content = { RenderComposeChildren(node.children, this) },
      )
      2 -> androidx.compose.material3.SwipeToDismissBox(
        `state` = requireNotNull(stateValue),
        `backgroundContent` = { RenderComposeChildren(node.slot("backgroundContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `enableDismissFromEndToStart` = node.boolean("enableDismissFromEndToStart"),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.SwipeToDismissBox(
        `state` = requireNotNull(stateValue),
        `backgroundContent` = { RenderComposeChildren(node.slot("backgroundContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `enableDismissFromStartToEnd` = node.boolean("enableDismissFromStartToEnd"),
        `enableDismissFromEndToStart` = node.boolean("enableDismissFromEndToStart"),
        content = { RenderComposeChildren(node.children, this) },
      )
      4 -> androidx.compose.material3.SwipeToDismissBox(
        `state` = requireNotNull(stateValue),
        `backgroundContent` = { RenderComposeChildren(node.slot("backgroundContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `gesturesEnabled` = node.boolean("gesturesEnabled"),
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.material3.SwipeToDismissBox(
        `state` = requireNotNull(stateValue),
        `backgroundContent` = { RenderComposeChildren(node.slot("backgroundContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `enableDismissFromStartToEnd` = node.boolean("enableDismissFromStartToEnd"),
        `gesturesEnabled` = node.boolean("gesturesEnabled"),
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.material3.SwipeToDismissBox(
        `state` = requireNotNull(stateValue),
        `backgroundContent` = { RenderComposeChildren(node.slot("backgroundContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `enableDismissFromEndToStart` = node.boolean("enableDismissFromEndToStart"),
        `gesturesEnabled` = node.boolean("gesturesEnabled"),
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.material3.SwipeToDismissBox(
        `state` = requireNotNull(stateValue),
        `backgroundContent` = { RenderComposeChildren(node.slot("backgroundContent"), this) },
        `modifier` = node.modifier("modifier", scope),
        `enableDismissFromStartToEnd` = node.boolean("enableDismissFromStartToEnd"),
        `enableDismissFromEndToStart` = node.boolean("enableDismissFromEndToStart"),
        `gesturesEnabled` = node.boolean("gesturesEnabled"),
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.Switch(checked: kotlin.Boolean, onCheckedChange: kotlin.Function1<kotlin.Boolean, kotlin.Unit>?, modifier: androidx.compose.ui.Modifier, thumbContent: kotlin.Function0<kotlin.Unit>?, enabled: kotlin.Boolean, colors: androidx.compose.material3.SwitchColors, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?)
internal object RendererSwitch {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("thumbContent")) 1 else 0) +
      (if (node.has("enabled")) 2 else 0) +
      (if (node.has("interactionSource")) 4 else 0)
    when (mask) {
      0 -> androidx.compose.material3.Switch(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = if (node.isNull("onCheckedChange")) null else ({ value: Boolean -> node.emit("onCheckedChange", value) }),
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.Switch(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = if (node.isNull("onCheckedChange")) null else ({ value: Boolean -> node.emit("onCheckedChange", value) }),
        `modifier` = node.modifier("modifier", scope),
        `thumbContent` = if (node.isNull("thumbContent")) null else ({ RenderComposeChildren(node.slot("thumbContent")) }),
      )
      2 -> androidx.compose.material3.Switch(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = if (node.isNull("onCheckedChange")) null else ({ value: Boolean -> node.emit("onCheckedChange", value) }),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
      )
      3 -> androidx.compose.material3.Switch(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = if (node.isNull("onCheckedChange")) null else ({ value: Boolean -> node.emit("onCheckedChange", value) }),
        `modifier` = node.modifier("modifier", scope),
        `thumbContent` = if (node.isNull("thumbContent")) null else ({ RenderComposeChildren(node.slot("thumbContent")) }),
        `enabled` = node.boolean("enabled"),
      )
      4 -> androidx.compose.material3.Switch(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = if (node.isNull("onCheckedChange")) null else ({ value: Boolean -> node.emit("onCheckedChange", value) }),
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      5 -> androidx.compose.material3.Switch(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = if (node.isNull("onCheckedChange")) null else ({ value: Boolean -> node.emit("onCheckedChange", value) }),
        `modifier` = node.modifier("modifier", scope),
        `thumbContent` = if (node.isNull("thumbContent")) null else ({ RenderComposeChildren(node.slot("thumbContent")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      6 -> androidx.compose.material3.Switch(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = if (node.isNull("onCheckedChange")) null else ({ value: Boolean -> node.emit("onCheckedChange", value) }),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      7 -> androidx.compose.material3.Switch(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = if (node.isNull("onCheckedChange")) null else ({ value: Boolean -> node.emit("onCheckedChange", value) }),
        `modifier` = node.modifier("modifier", scope),
        `thumbContent` = if (node.isNull("thumbContent")) null else ({ RenderComposeChildren(node.slot("thumbContent")) }),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.Tab(selected: kotlin.Boolean, onClick: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, text: kotlin.Function0<kotlin.Unit>?, icon: kotlin.Function0<kotlin.Unit>?, selectedContentColor: androidx.compose.ui.graphics.Color, unselectedContentColor: androidx.compose.ui.graphics.Color, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?)
internal object RendererTab {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("text")) 2 else 0) +
      (if (node.has("icon")) 4 else 0) +
      (if (node.has("selectedContentColor")) 8 else 0) +
      (if (node.has("unselectedContentColor")) 16 else 0) +
      (if (node.has("interactionSource")) 32 else 0)
    when (mask / 32) {
      0 -> renderTabGroup0(node, scope, mask)
      1 -> renderTabGroup1(node, scope, mask)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderTabGroup0(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      0 -> androidx.compose.material3.Tab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.Tab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
      )
      2 -> androidx.compose.material3.Tab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
      )
      3 -> androidx.compose.material3.Tab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
      )
      4 -> androidx.compose.material3.Tab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
      )
      5 -> androidx.compose.material3.Tab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
      )
      6 -> androidx.compose.material3.Tab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
      )
      7 -> androidx.compose.material3.Tab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
      )
      8 -> androidx.compose.material3.Tab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `selectedContentColor` = node.color("selectedContentColor"),
      )
      9 -> androidx.compose.material3.Tab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `selectedContentColor` = node.color("selectedContentColor"),
      )
      10 -> androidx.compose.material3.Tab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `selectedContentColor` = node.color("selectedContentColor"),
      )
      11 -> androidx.compose.material3.Tab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `selectedContentColor` = node.color("selectedContentColor"),
      )
      12 -> androidx.compose.material3.Tab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `selectedContentColor` = node.color("selectedContentColor"),
      )
      13 -> androidx.compose.material3.Tab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `selectedContentColor` = node.color("selectedContentColor"),
      )
      14 -> androidx.compose.material3.Tab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `selectedContentColor` = node.color("selectedContentColor"),
      )
      15 -> androidx.compose.material3.Tab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `selectedContentColor` = node.color("selectedContentColor"),
      )
      16 -> androidx.compose.material3.Tab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `unselectedContentColor` = node.color("unselectedContentColor"),
      )
      17 -> androidx.compose.material3.Tab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `unselectedContentColor` = node.color("unselectedContentColor"),
      )
      18 -> androidx.compose.material3.Tab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `unselectedContentColor` = node.color("unselectedContentColor"),
      )
      19 -> androidx.compose.material3.Tab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `unselectedContentColor` = node.color("unselectedContentColor"),
      )
      20 -> androidx.compose.material3.Tab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `unselectedContentColor` = node.color("unselectedContentColor"),
      )
      21 -> androidx.compose.material3.Tab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `unselectedContentColor` = node.color("unselectedContentColor"),
      )
      22 -> androidx.compose.material3.Tab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `unselectedContentColor` = node.color("unselectedContentColor"),
      )
      23 -> androidx.compose.material3.Tab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `unselectedContentColor` = node.color("unselectedContentColor"),
      )
      24 -> androidx.compose.material3.Tab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `selectedContentColor` = node.color("selectedContentColor"),
        `unselectedContentColor` = node.color("unselectedContentColor"),
      )
      25 -> androidx.compose.material3.Tab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `selectedContentColor` = node.color("selectedContentColor"),
        `unselectedContentColor` = node.color("unselectedContentColor"),
      )
      26 -> androidx.compose.material3.Tab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `selectedContentColor` = node.color("selectedContentColor"),
        `unselectedContentColor` = node.color("unselectedContentColor"),
      )
      27 -> androidx.compose.material3.Tab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `selectedContentColor` = node.color("selectedContentColor"),
        `unselectedContentColor` = node.color("unselectedContentColor"),
      )
      28 -> androidx.compose.material3.Tab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `selectedContentColor` = node.color("selectedContentColor"),
        `unselectedContentColor` = node.color("unselectedContentColor"),
      )
      29 -> androidx.compose.material3.Tab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `selectedContentColor` = node.color("selectedContentColor"),
        `unselectedContentColor` = node.color("unselectedContentColor"),
      )
      30 -> androidx.compose.material3.Tab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `selectedContentColor` = node.color("selectedContentColor"),
        `unselectedContentColor` = node.color("unselectedContentColor"),
      )
      31 -> androidx.compose.material3.Tab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `selectedContentColor` = node.color("selectedContentColor"),
        `unselectedContentColor` = node.color("unselectedContentColor"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderTabGroup1(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32 -> androidx.compose.material3.Tab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      33 -> androidx.compose.material3.Tab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      34 -> androidx.compose.material3.Tab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      35 -> androidx.compose.material3.Tab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      36 -> androidx.compose.material3.Tab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      37 -> androidx.compose.material3.Tab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      38 -> androidx.compose.material3.Tab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      39 -> androidx.compose.material3.Tab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      40 -> androidx.compose.material3.Tab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `selectedContentColor` = node.color("selectedContentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      41 -> androidx.compose.material3.Tab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `selectedContentColor` = node.color("selectedContentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      42 -> androidx.compose.material3.Tab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `selectedContentColor` = node.color("selectedContentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      43 -> androidx.compose.material3.Tab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `selectedContentColor` = node.color("selectedContentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      44 -> androidx.compose.material3.Tab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `selectedContentColor` = node.color("selectedContentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      45 -> androidx.compose.material3.Tab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `selectedContentColor` = node.color("selectedContentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      46 -> androidx.compose.material3.Tab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `selectedContentColor` = node.color("selectedContentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      47 -> androidx.compose.material3.Tab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `selectedContentColor` = node.color("selectedContentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      48 -> androidx.compose.material3.Tab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `unselectedContentColor` = node.color("unselectedContentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      49 -> androidx.compose.material3.Tab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `unselectedContentColor` = node.color("unselectedContentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      50 -> androidx.compose.material3.Tab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `unselectedContentColor` = node.color("unselectedContentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      51 -> androidx.compose.material3.Tab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `unselectedContentColor` = node.color("unselectedContentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      52 -> androidx.compose.material3.Tab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `unselectedContentColor` = node.color("unselectedContentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      53 -> androidx.compose.material3.Tab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `unselectedContentColor` = node.color("unselectedContentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      54 -> androidx.compose.material3.Tab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `unselectedContentColor` = node.color("unselectedContentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      55 -> androidx.compose.material3.Tab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `unselectedContentColor` = node.color("unselectedContentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      56 -> androidx.compose.material3.Tab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `selectedContentColor` = node.color("selectedContentColor"),
        `unselectedContentColor` = node.color("unselectedContentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      57 -> androidx.compose.material3.Tab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `selectedContentColor` = node.color("selectedContentColor"),
        `unselectedContentColor` = node.color("unselectedContentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      58 -> androidx.compose.material3.Tab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `selectedContentColor` = node.color("selectedContentColor"),
        `unselectedContentColor` = node.color("unselectedContentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      59 -> androidx.compose.material3.Tab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `selectedContentColor` = node.color("selectedContentColor"),
        `unselectedContentColor` = node.color("unselectedContentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      60 -> androidx.compose.material3.Tab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `selectedContentColor` = node.color("selectedContentColor"),
        `unselectedContentColor` = node.color("unselectedContentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      61 -> androidx.compose.material3.Tab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `selectedContentColor` = node.color("selectedContentColor"),
        `unselectedContentColor` = node.color("unselectedContentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      62 -> androidx.compose.material3.Tab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `selectedContentColor` = node.color("selectedContentColor"),
        `unselectedContentColor` = node.color("unselectedContentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      63 -> androidx.compose.material3.Tab(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `selectedContentColor` = node.color("selectedContentColor"),
        `unselectedContentColor` = node.color("unselectedContentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.TabRow(selectedTabIndex: kotlin.Int, modifier: androidx.compose.ui.Modifier, containerColor: androidx.compose.ui.graphics.Color, contentColor: androidx.compose.ui.graphics.Color, indicator: kotlin.Function1<kotlin.collections.List<androidx.compose.material3.TabPosition>, kotlin.Unit>, divider: kotlin.Function0<kotlin.Unit>, tabs: kotlin.Function0<kotlin.Unit>)
internal object RendererTabRow {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("containerColor")) 1 else 0) +
      (if (node.has("contentColor")) 2 else 0) +
      (if (node.has("divider")) 4 else 0)
    when (mask) {
      0 -> androidx.compose.material3.TabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      1 -> androidx.compose.material3.TabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      2 -> androidx.compose.material3.TabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      3 -> androidx.compose.material3.TabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      4 -> androidx.compose.material3.TabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      5 -> androidx.compose.material3.TabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      6 -> androidx.compose.material3.TabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      7 -> androidx.compose.material3.TabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}
