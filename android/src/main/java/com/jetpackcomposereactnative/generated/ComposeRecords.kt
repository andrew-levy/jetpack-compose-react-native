// Generated from Compose value factories by generate.mjs.
@file:OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class, androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)

package com.jetpackcomposereactnative.generated

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jetpackcomposereactnative.common.parseComposeColor
import org.json.JSONObject

internal fun JSONObject.decodeComposeMarqueeSpacingValue(): androidx.compose.foundation.MarqueeSpacing = androidx.compose.foundation.MarqueeSpacing(
  `spacing` = getDouble("spacing").dp,
)

internal fun JSONObject.decodeComposeTextAutoSizeValue(): androidx.compose.foundation.text.TextAutoSize = when (val factory = getString("factory")) {
  "TextAutoSize.StepBased" -> decodeComposeTextAutoSizeValueFactory0()
  else -> error("Unknown ComposeTextAutoSizeValue factory: " + factory)
}

private fun JSONObject.decodeComposeTextAutoSizeValueFactory0(): androidx.compose.foundation.text.TextAutoSize = when ((if (has("minFontSize")) 1 else 0) + (if (has("maxFontSize")) 2 else 0) + (if (has("stepSize")) 4 else 0)) {
  0 -> androidx.compose.foundation.text.TextAutoSize.Companion.StepBased()
  1 -> androidx.compose.foundation.text.TextAutoSize.Companion.StepBased(`minFontSize` = getDouble("minFontSize").sp)
  2 -> androidx.compose.foundation.text.TextAutoSize.Companion.StepBased(`maxFontSize` = getDouble("maxFontSize").sp)
  3 -> androidx.compose.foundation.text.TextAutoSize.Companion.StepBased(`minFontSize` = getDouble("minFontSize").sp, `maxFontSize` = getDouble("maxFontSize").sp)
  4 -> androidx.compose.foundation.text.TextAutoSize.Companion.StepBased(`stepSize` = getDouble("stepSize").sp)
  5 -> androidx.compose.foundation.text.TextAutoSize.Companion.StepBased(`minFontSize` = getDouble("minFontSize").sp, `stepSize` = getDouble("stepSize").sp)
  6 -> androidx.compose.foundation.text.TextAutoSize.Companion.StepBased(`maxFontSize` = getDouble("maxFontSize").sp, `stepSize` = getDouble("stepSize").sp)
  7 -> androidx.compose.foundation.text.TextAutoSize.Companion.StepBased(`minFontSize` = getDouble("minFontSize").sp, `maxFontSize` = getDouble("maxFontSize").sp, `stepSize` = getDouble("stepSize").sp)
  else -> error("Invalid generated arguments for androidx.compose.foundation.text.TextAutoSize.Companion.StepBased")
}

internal fun JSONObject.decodeComposeTextSelectionColorsValue(): androidx.compose.foundation.text.selection.TextSelectionColors = androidx.compose.foundation.text.selection.TextSelectionColors(
  `handleColor` = parseComposeColor(getString("handleColor")),
  `backgroundColor` = parseComposeColor(getString("backgroundColor")),
)

internal fun JSONObject.decodeComposeButtonColorsValue(): androidx.compose.material3.ButtonColors = androidx.compose.material3.ButtonColors(
  `containerColor` = parseComposeColor(getString("containerColor")),
  `contentColor` = parseComposeColor(getString("contentColor")),
  `disabledContainerColor` = parseComposeColor(getString("disabledContainerColor")),
  `disabledContentColor` = parseComposeColor(getString("disabledContentColor")),
)

@Composable
internal fun JSONObject.decodeComposeButtonElevationValue(): androidx.compose.material3.ButtonElevation = when (val factory = getString("factory")) {
  "ButtonDefaults.buttonElevation" -> decodeComposeButtonElevationValueFactory0()
  "ButtonDefaults.elevatedButtonElevation" -> decodeComposeButtonElevationValueFactory1()
  "ButtonDefaults.filledTonalButtonElevation" -> decodeComposeButtonElevationValueFactory2()
  else -> error("Unknown ComposeButtonElevationValue factory: " + factory)
}

@Composable
private fun JSONObject.decodeComposeButtonElevationValueFactory0(): androidx.compose.material3.ButtonElevation = when ((if (has("defaultElevation")) 1 else 0) + (if (has("pressedElevation")) 2 else 0) + (if (has("focusedElevation")) 4 else 0) + (if (has("hoveredElevation")) 8 else 0) + (if (has("disabledElevation")) 16 else 0)) {
  0 -> androidx.compose.material3.ButtonDefaults.buttonElevation()
  1 -> androidx.compose.material3.ButtonDefaults.buttonElevation(`defaultElevation` = getDouble("defaultElevation").dp)
  2 -> androidx.compose.material3.ButtonDefaults.buttonElevation(`pressedElevation` = getDouble("pressedElevation").dp)
  3 -> androidx.compose.material3.ButtonDefaults.buttonElevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp)
  4 -> androidx.compose.material3.ButtonDefaults.buttonElevation(`focusedElevation` = getDouble("focusedElevation").dp)
  5 -> androidx.compose.material3.ButtonDefaults.buttonElevation(`defaultElevation` = getDouble("defaultElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp)
  6 -> androidx.compose.material3.ButtonDefaults.buttonElevation(`pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp)
  7 -> androidx.compose.material3.ButtonDefaults.buttonElevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp)
  8 -> androidx.compose.material3.ButtonDefaults.buttonElevation(`hoveredElevation` = getDouble("hoveredElevation").dp)
  9 -> androidx.compose.material3.ButtonDefaults.buttonElevation(`defaultElevation` = getDouble("defaultElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp)
  10 -> androidx.compose.material3.ButtonDefaults.buttonElevation(`pressedElevation` = getDouble("pressedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp)
  11 -> androidx.compose.material3.ButtonDefaults.buttonElevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp)
  12 -> androidx.compose.material3.ButtonDefaults.buttonElevation(`focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp)
  13 -> androidx.compose.material3.ButtonDefaults.buttonElevation(`defaultElevation` = getDouble("defaultElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp)
  14 -> androidx.compose.material3.ButtonDefaults.buttonElevation(`pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp)
  15 -> androidx.compose.material3.ButtonDefaults.buttonElevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp)
  16 -> androidx.compose.material3.ButtonDefaults.buttonElevation(`disabledElevation` = getDouble("disabledElevation").dp)
  17 -> androidx.compose.material3.ButtonDefaults.buttonElevation(`defaultElevation` = getDouble("defaultElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  18 -> androidx.compose.material3.ButtonDefaults.buttonElevation(`pressedElevation` = getDouble("pressedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  19 -> androidx.compose.material3.ButtonDefaults.buttonElevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  20 -> androidx.compose.material3.ButtonDefaults.buttonElevation(`focusedElevation` = getDouble("focusedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  21 -> androidx.compose.material3.ButtonDefaults.buttonElevation(`defaultElevation` = getDouble("defaultElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  22 -> androidx.compose.material3.ButtonDefaults.buttonElevation(`pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  23 -> androidx.compose.material3.ButtonDefaults.buttonElevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  24 -> androidx.compose.material3.ButtonDefaults.buttonElevation(`hoveredElevation` = getDouble("hoveredElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  25 -> androidx.compose.material3.ButtonDefaults.buttonElevation(`defaultElevation` = getDouble("defaultElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  26 -> androidx.compose.material3.ButtonDefaults.buttonElevation(`pressedElevation` = getDouble("pressedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  27 -> androidx.compose.material3.ButtonDefaults.buttonElevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  28 -> androidx.compose.material3.ButtonDefaults.buttonElevation(`focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  29 -> androidx.compose.material3.ButtonDefaults.buttonElevation(`defaultElevation` = getDouble("defaultElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  30 -> androidx.compose.material3.ButtonDefaults.buttonElevation(`pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  31 -> androidx.compose.material3.ButtonDefaults.buttonElevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  else -> error("Invalid generated arguments for androidx.compose.material3.ButtonDefaults.buttonElevation")
}

@Composable
private fun JSONObject.decodeComposeButtonElevationValueFactory1(): androidx.compose.material3.ButtonElevation = when ((if (has("defaultElevation")) 1 else 0) + (if (has("pressedElevation")) 2 else 0) + (if (has("focusedElevation")) 4 else 0) + (if (has("hoveredElevation")) 8 else 0) + (if (has("disabledElevation")) 16 else 0)) {
  0 -> androidx.compose.material3.ButtonDefaults.elevatedButtonElevation()
  1 -> androidx.compose.material3.ButtonDefaults.elevatedButtonElevation(`defaultElevation` = getDouble("defaultElevation").dp)
  2 -> androidx.compose.material3.ButtonDefaults.elevatedButtonElevation(`pressedElevation` = getDouble("pressedElevation").dp)
  3 -> androidx.compose.material3.ButtonDefaults.elevatedButtonElevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp)
  4 -> androidx.compose.material3.ButtonDefaults.elevatedButtonElevation(`focusedElevation` = getDouble("focusedElevation").dp)
  5 -> androidx.compose.material3.ButtonDefaults.elevatedButtonElevation(`defaultElevation` = getDouble("defaultElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp)
  6 -> androidx.compose.material3.ButtonDefaults.elevatedButtonElevation(`pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp)
  7 -> androidx.compose.material3.ButtonDefaults.elevatedButtonElevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp)
  8 -> androidx.compose.material3.ButtonDefaults.elevatedButtonElevation(`hoveredElevation` = getDouble("hoveredElevation").dp)
  9 -> androidx.compose.material3.ButtonDefaults.elevatedButtonElevation(`defaultElevation` = getDouble("defaultElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp)
  10 -> androidx.compose.material3.ButtonDefaults.elevatedButtonElevation(`pressedElevation` = getDouble("pressedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp)
  11 -> androidx.compose.material3.ButtonDefaults.elevatedButtonElevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp)
  12 -> androidx.compose.material3.ButtonDefaults.elevatedButtonElevation(`focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp)
  13 -> androidx.compose.material3.ButtonDefaults.elevatedButtonElevation(`defaultElevation` = getDouble("defaultElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp)
  14 -> androidx.compose.material3.ButtonDefaults.elevatedButtonElevation(`pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp)
  15 -> androidx.compose.material3.ButtonDefaults.elevatedButtonElevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp)
  16 -> androidx.compose.material3.ButtonDefaults.elevatedButtonElevation(`disabledElevation` = getDouble("disabledElevation").dp)
  17 -> androidx.compose.material3.ButtonDefaults.elevatedButtonElevation(`defaultElevation` = getDouble("defaultElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  18 -> androidx.compose.material3.ButtonDefaults.elevatedButtonElevation(`pressedElevation` = getDouble("pressedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  19 -> androidx.compose.material3.ButtonDefaults.elevatedButtonElevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  20 -> androidx.compose.material3.ButtonDefaults.elevatedButtonElevation(`focusedElevation` = getDouble("focusedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  21 -> androidx.compose.material3.ButtonDefaults.elevatedButtonElevation(`defaultElevation` = getDouble("defaultElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  22 -> androidx.compose.material3.ButtonDefaults.elevatedButtonElevation(`pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  23 -> androidx.compose.material3.ButtonDefaults.elevatedButtonElevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  24 -> androidx.compose.material3.ButtonDefaults.elevatedButtonElevation(`hoveredElevation` = getDouble("hoveredElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  25 -> androidx.compose.material3.ButtonDefaults.elevatedButtonElevation(`defaultElevation` = getDouble("defaultElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  26 -> androidx.compose.material3.ButtonDefaults.elevatedButtonElevation(`pressedElevation` = getDouble("pressedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  27 -> androidx.compose.material3.ButtonDefaults.elevatedButtonElevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  28 -> androidx.compose.material3.ButtonDefaults.elevatedButtonElevation(`focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  29 -> androidx.compose.material3.ButtonDefaults.elevatedButtonElevation(`defaultElevation` = getDouble("defaultElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  30 -> androidx.compose.material3.ButtonDefaults.elevatedButtonElevation(`pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  31 -> androidx.compose.material3.ButtonDefaults.elevatedButtonElevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  else -> error("Invalid generated arguments for androidx.compose.material3.ButtonDefaults.elevatedButtonElevation")
}

@Composable
private fun JSONObject.decodeComposeButtonElevationValueFactory2(): androidx.compose.material3.ButtonElevation = when ((if (has("defaultElevation")) 1 else 0) + (if (has("pressedElevation")) 2 else 0) + (if (has("focusedElevation")) 4 else 0) + (if (has("hoveredElevation")) 8 else 0) + (if (has("disabledElevation")) 16 else 0)) {
  0 -> androidx.compose.material3.ButtonDefaults.filledTonalButtonElevation()
  1 -> androidx.compose.material3.ButtonDefaults.filledTonalButtonElevation(`defaultElevation` = getDouble("defaultElevation").dp)
  2 -> androidx.compose.material3.ButtonDefaults.filledTonalButtonElevation(`pressedElevation` = getDouble("pressedElevation").dp)
  3 -> androidx.compose.material3.ButtonDefaults.filledTonalButtonElevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp)
  4 -> androidx.compose.material3.ButtonDefaults.filledTonalButtonElevation(`focusedElevation` = getDouble("focusedElevation").dp)
  5 -> androidx.compose.material3.ButtonDefaults.filledTonalButtonElevation(`defaultElevation` = getDouble("defaultElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp)
  6 -> androidx.compose.material3.ButtonDefaults.filledTonalButtonElevation(`pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp)
  7 -> androidx.compose.material3.ButtonDefaults.filledTonalButtonElevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp)
  8 -> androidx.compose.material3.ButtonDefaults.filledTonalButtonElevation(`hoveredElevation` = getDouble("hoveredElevation").dp)
  9 -> androidx.compose.material3.ButtonDefaults.filledTonalButtonElevation(`defaultElevation` = getDouble("defaultElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp)
  10 -> androidx.compose.material3.ButtonDefaults.filledTonalButtonElevation(`pressedElevation` = getDouble("pressedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp)
  11 -> androidx.compose.material3.ButtonDefaults.filledTonalButtonElevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp)
  12 -> androidx.compose.material3.ButtonDefaults.filledTonalButtonElevation(`focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp)
  13 -> androidx.compose.material3.ButtonDefaults.filledTonalButtonElevation(`defaultElevation` = getDouble("defaultElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp)
  14 -> androidx.compose.material3.ButtonDefaults.filledTonalButtonElevation(`pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp)
  15 -> androidx.compose.material3.ButtonDefaults.filledTonalButtonElevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp)
  16 -> androidx.compose.material3.ButtonDefaults.filledTonalButtonElevation(`disabledElevation` = getDouble("disabledElevation").dp)
  17 -> androidx.compose.material3.ButtonDefaults.filledTonalButtonElevation(`defaultElevation` = getDouble("defaultElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  18 -> androidx.compose.material3.ButtonDefaults.filledTonalButtonElevation(`pressedElevation` = getDouble("pressedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  19 -> androidx.compose.material3.ButtonDefaults.filledTonalButtonElevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  20 -> androidx.compose.material3.ButtonDefaults.filledTonalButtonElevation(`focusedElevation` = getDouble("focusedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  21 -> androidx.compose.material3.ButtonDefaults.filledTonalButtonElevation(`defaultElevation` = getDouble("defaultElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  22 -> androidx.compose.material3.ButtonDefaults.filledTonalButtonElevation(`pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  23 -> androidx.compose.material3.ButtonDefaults.filledTonalButtonElevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  24 -> androidx.compose.material3.ButtonDefaults.filledTonalButtonElevation(`hoveredElevation` = getDouble("hoveredElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  25 -> androidx.compose.material3.ButtonDefaults.filledTonalButtonElevation(`defaultElevation` = getDouble("defaultElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  26 -> androidx.compose.material3.ButtonDefaults.filledTonalButtonElevation(`pressedElevation` = getDouble("pressedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  27 -> androidx.compose.material3.ButtonDefaults.filledTonalButtonElevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  28 -> androidx.compose.material3.ButtonDefaults.filledTonalButtonElevation(`focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  29 -> androidx.compose.material3.ButtonDefaults.filledTonalButtonElevation(`defaultElevation` = getDouble("defaultElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  30 -> androidx.compose.material3.ButtonDefaults.filledTonalButtonElevation(`pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  31 -> androidx.compose.material3.ButtonDefaults.filledTonalButtonElevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  else -> error("Invalid generated arguments for androidx.compose.material3.ButtonDefaults.filledTonalButtonElevation")
}

@Composable
internal fun JSONObject.decodeComposeButtonShapesValue(): androidx.compose.material3.ButtonShapes = when (val factory = getString("factory")) {
  "ButtonDefaults.shapesFor" -> decodeComposeButtonShapesValueFactory0()
  else -> error("Unknown ComposeButtonShapesValue factory: " + factory)
}

@Composable
private fun JSONObject.decodeComposeButtonShapesValueFactory0(): androidx.compose.material3.ButtonShapes = androidx.compose.material3.ButtonDefaults.shapesFor(
  `buttonHeight` = getDouble("buttonHeight").dp,
)

internal fun JSONObject.decodeComposeCardColorsValue(): androidx.compose.material3.CardColors = androidx.compose.material3.CardColors(
  `containerColor` = parseComposeColor(getString("containerColor")),
  `contentColor` = parseComposeColor(getString("contentColor")),
  `disabledContainerColor` = parseComposeColor(getString("disabledContainerColor")),
  `disabledContentColor` = parseComposeColor(getString("disabledContentColor")),
)

@Composable
internal fun JSONObject.decodeComposeCardElevationValue(): androidx.compose.material3.CardElevation = when (val factory = getString("factory")) {
  "CardDefaults.cardElevation" -> decodeComposeCardElevationValueFactory0()
  "CardDefaults.elevatedCardElevation" -> decodeComposeCardElevationValueFactory1()
  "CardDefaults.outlinedCardElevation" -> decodeComposeCardElevationValueFactory2()
  else -> error("Unknown ComposeCardElevationValue factory: " + factory)
}

@Composable
private fun JSONObject.decodeComposeCardElevationValueFactory0(): androidx.compose.material3.CardElevation = when ((if (has("defaultElevation")) 1 else 0) + (if (has("pressedElevation")) 2 else 0) + (if (has("focusedElevation")) 4 else 0) + (if (has("hoveredElevation")) 8 else 0) + (if (has("draggedElevation")) 16 else 0) + (if (has("disabledElevation")) 32 else 0)) {
  0 -> androidx.compose.material3.CardDefaults.cardElevation()
  1 -> androidx.compose.material3.CardDefaults.cardElevation(`defaultElevation` = getDouble("defaultElevation").dp)
  2 -> androidx.compose.material3.CardDefaults.cardElevation(`pressedElevation` = getDouble("pressedElevation").dp)
  3 -> androidx.compose.material3.CardDefaults.cardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp)
  4 -> androidx.compose.material3.CardDefaults.cardElevation(`focusedElevation` = getDouble("focusedElevation").dp)
  5 -> androidx.compose.material3.CardDefaults.cardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp)
  6 -> androidx.compose.material3.CardDefaults.cardElevation(`pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp)
  7 -> androidx.compose.material3.CardDefaults.cardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp)
  8 -> androidx.compose.material3.CardDefaults.cardElevation(`hoveredElevation` = getDouble("hoveredElevation").dp)
  9 -> androidx.compose.material3.CardDefaults.cardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp)
  10 -> androidx.compose.material3.CardDefaults.cardElevation(`pressedElevation` = getDouble("pressedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp)
  11 -> androidx.compose.material3.CardDefaults.cardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp)
  12 -> androidx.compose.material3.CardDefaults.cardElevation(`focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp)
  13 -> androidx.compose.material3.CardDefaults.cardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp)
  14 -> androidx.compose.material3.CardDefaults.cardElevation(`pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp)
  15 -> androidx.compose.material3.CardDefaults.cardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp)
  16 -> androidx.compose.material3.CardDefaults.cardElevation(`draggedElevation` = getDouble("draggedElevation").dp)
  17 -> androidx.compose.material3.CardDefaults.cardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp)
  18 -> androidx.compose.material3.CardDefaults.cardElevation(`pressedElevation` = getDouble("pressedElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp)
  19 -> androidx.compose.material3.CardDefaults.cardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp)
  20 -> androidx.compose.material3.CardDefaults.cardElevation(`focusedElevation` = getDouble("focusedElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp)
  21 -> androidx.compose.material3.CardDefaults.cardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp)
  22 -> androidx.compose.material3.CardDefaults.cardElevation(`pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp)
  23 -> androidx.compose.material3.CardDefaults.cardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp)
  24 -> androidx.compose.material3.CardDefaults.cardElevation(`hoveredElevation` = getDouble("hoveredElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp)
  25 -> androidx.compose.material3.CardDefaults.cardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp)
  26 -> androidx.compose.material3.CardDefaults.cardElevation(`pressedElevation` = getDouble("pressedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp)
  27 -> androidx.compose.material3.CardDefaults.cardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp)
  28 -> androidx.compose.material3.CardDefaults.cardElevation(`focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp)
  29 -> androidx.compose.material3.CardDefaults.cardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp)
  30 -> androidx.compose.material3.CardDefaults.cardElevation(`pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp)
  31 -> androidx.compose.material3.CardDefaults.cardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp)
  32 -> androidx.compose.material3.CardDefaults.cardElevation(`disabledElevation` = getDouble("disabledElevation").dp)
  33 -> androidx.compose.material3.CardDefaults.cardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  34 -> androidx.compose.material3.CardDefaults.cardElevation(`pressedElevation` = getDouble("pressedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  35 -> androidx.compose.material3.CardDefaults.cardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  36 -> androidx.compose.material3.CardDefaults.cardElevation(`focusedElevation` = getDouble("focusedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  37 -> androidx.compose.material3.CardDefaults.cardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  38 -> androidx.compose.material3.CardDefaults.cardElevation(`pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  39 -> androidx.compose.material3.CardDefaults.cardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  40 -> androidx.compose.material3.CardDefaults.cardElevation(`hoveredElevation` = getDouble("hoveredElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  41 -> androidx.compose.material3.CardDefaults.cardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  42 -> androidx.compose.material3.CardDefaults.cardElevation(`pressedElevation` = getDouble("pressedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  43 -> androidx.compose.material3.CardDefaults.cardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  44 -> androidx.compose.material3.CardDefaults.cardElevation(`focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  45 -> androidx.compose.material3.CardDefaults.cardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  46 -> androidx.compose.material3.CardDefaults.cardElevation(`pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  47 -> androidx.compose.material3.CardDefaults.cardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  48 -> androidx.compose.material3.CardDefaults.cardElevation(`draggedElevation` = getDouble("draggedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  49 -> androidx.compose.material3.CardDefaults.cardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  50 -> androidx.compose.material3.CardDefaults.cardElevation(`pressedElevation` = getDouble("pressedElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  51 -> androidx.compose.material3.CardDefaults.cardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  52 -> androidx.compose.material3.CardDefaults.cardElevation(`focusedElevation` = getDouble("focusedElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  53 -> androidx.compose.material3.CardDefaults.cardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  54 -> androidx.compose.material3.CardDefaults.cardElevation(`pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  55 -> androidx.compose.material3.CardDefaults.cardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  56 -> androidx.compose.material3.CardDefaults.cardElevation(`hoveredElevation` = getDouble("hoveredElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  57 -> androidx.compose.material3.CardDefaults.cardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  58 -> androidx.compose.material3.CardDefaults.cardElevation(`pressedElevation` = getDouble("pressedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  59 -> androidx.compose.material3.CardDefaults.cardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  60 -> androidx.compose.material3.CardDefaults.cardElevation(`focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  61 -> androidx.compose.material3.CardDefaults.cardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  62 -> androidx.compose.material3.CardDefaults.cardElevation(`pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  63 -> androidx.compose.material3.CardDefaults.cardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  else -> error("Invalid generated arguments for androidx.compose.material3.CardDefaults.cardElevation")
}

@Composable
private fun JSONObject.decodeComposeCardElevationValueFactory1(): androidx.compose.material3.CardElevation = when ((if (has("defaultElevation")) 1 else 0) + (if (has("pressedElevation")) 2 else 0) + (if (has("focusedElevation")) 4 else 0) + (if (has("hoveredElevation")) 8 else 0) + (if (has("draggedElevation")) 16 else 0) + (if (has("disabledElevation")) 32 else 0)) {
  0 -> androidx.compose.material3.CardDefaults.elevatedCardElevation()
  1 -> androidx.compose.material3.CardDefaults.elevatedCardElevation(`defaultElevation` = getDouble("defaultElevation").dp)
  2 -> androidx.compose.material3.CardDefaults.elevatedCardElevation(`pressedElevation` = getDouble("pressedElevation").dp)
  3 -> androidx.compose.material3.CardDefaults.elevatedCardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp)
  4 -> androidx.compose.material3.CardDefaults.elevatedCardElevation(`focusedElevation` = getDouble("focusedElevation").dp)
  5 -> androidx.compose.material3.CardDefaults.elevatedCardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp)
  6 -> androidx.compose.material3.CardDefaults.elevatedCardElevation(`pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp)
  7 -> androidx.compose.material3.CardDefaults.elevatedCardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp)
  8 -> androidx.compose.material3.CardDefaults.elevatedCardElevation(`hoveredElevation` = getDouble("hoveredElevation").dp)
  9 -> androidx.compose.material3.CardDefaults.elevatedCardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp)
  10 -> androidx.compose.material3.CardDefaults.elevatedCardElevation(`pressedElevation` = getDouble("pressedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp)
  11 -> androidx.compose.material3.CardDefaults.elevatedCardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp)
  12 -> androidx.compose.material3.CardDefaults.elevatedCardElevation(`focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp)
  13 -> androidx.compose.material3.CardDefaults.elevatedCardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp)
  14 -> androidx.compose.material3.CardDefaults.elevatedCardElevation(`pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp)
  15 -> androidx.compose.material3.CardDefaults.elevatedCardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp)
  16 -> androidx.compose.material3.CardDefaults.elevatedCardElevation(`draggedElevation` = getDouble("draggedElevation").dp)
  17 -> androidx.compose.material3.CardDefaults.elevatedCardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp)
  18 -> androidx.compose.material3.CardDefaults.elevatedCardElevation(`pressedElevation` = getDouble("pressedElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp)
  19 -> androidx.compose.material3.CardDefaults.elevatedCardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp)
  20 -> androidx.compose.material3.CardDefaults.elevatedCardElevation(`focusedElevation` = getDouble("focusedElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp)
  21 -> androidx.compose.material3.CardDefaults.elevatedCardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp)
  22 -> androidx.compose.material3.CardDefaults.elevatedCardElevation(`pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp)
  23 -> androidx.compose.material3.CardDefaults.elevatedCardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp)
  24 -> androidx.compose.material3.CardDefaults.elevatedCardElevation(`hoveredElevation` = getDouble("hoveredElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp)
  25 -> androidx.compose.material3.CardDefaults.elevatedCardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp)
  26 -> androidx.compose.material3.CardDefaults.elevatedCardElevation(`pressedElevation` = getDouble("pressedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp)
  27 -> androidx.compose.material3.CardDefaults.elevatedCardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp)
  28 -> androidx.compose.material3.CardDefaults.elevatedCardElevation(`focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp)
  29 -> androidx.compose.material3.CardDefaults.elevatedCardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp)
  30 -> androidx.compose.material3.CardDefaults.elevatedCardElevation(`pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp)
  31 -> androidx.compose.material3.CardDefaults.elevatedCardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp)
  32 -> androidx.compose.material3.CardDefaults.elevatedCardElevation(`disabledElevation` = getDouble("disabledElevation").dp)
  33 -> androidx.compose.material3.CardDefaults.elevatedCardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  34 -> androidx.compose.material3.CardDefaults.elevatedCardElevation(`pressedElevation` = getDouble("pressedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  35 -> androidx.compose.material3.CardDefaults.elevatedCardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  36 -> androidx.compose.material3.CardDefaults.elevatedCardElevation(`focusedElevation` = getDouble("focusedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  37 -> androidx.compose.material3.CardDefaults.elevatedCardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  38 -> androidx.compose.material3.CardDefaults.elevatedCardElevation(`pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  39 -> androidx.compose.material3.CardDefaults.elevatedCardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  40 -> androidx.compose.material3.CardDefaults.elevatedCardElevation(`hoveredElevation` = getDouble("hoveredElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  41 -> androidx.compose.material3.CardDefaults.elevatedCardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  42 -> androidx.compose.material3.CardDefaults.elevatedCardElevation(`pressedElevation` = getDouble("pressedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  43 -> androidx.compose.material3.CardDefaults.elevatedCardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  44 -> androidx.compose.material3.CardDefaults.elevatedCardElevation(`focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  45 -> androidx.compose.material3.CardDefaults.elevatedCardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  46 -> androidx.compose.material3.CardDefaults.elevatedCardElevation(`pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  47 -> androidx.compose.material3.CardDefaults.elevatedCardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  48 -> androidx.compose.material3.CardDefaults.elevatedCardElevation(`draggedElevation` = getDouble("draggedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  49 -> androidx.compose.material3.CardDefaults.elevatedCardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  50 -> androidx.compose.material3.CardDefaults.elevatedCardElevation(`pressedElevation` = getDouble("pressedElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  51 -> androidx.compose.material3.CardDefaults.elevatedCardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  52 -> androidx.compose.material3.CardDefaults.elevatedCardElevation(`focusedElevation` = getDouble("focusedElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  53 -> androidx.compose.material3.CardDefaults.elevatedCardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  54 -> androidx.compose.material3.CardDefaults.elevatedCardElevation(`pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  55 -> androidx.compose.material3.CardDefaults.elevatedCardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  56 -> androidx.compose.material3.CardDefaults.elevatedCardElevation(`hoveredElevation` = getDouble("hoveredElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  57 -> androidx.compose.material3.CardDefaults.elevatedCardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  58 -> androidx.compose.material3.CardDefaults.elevatedCardElevation(`pressedElevation` = getDouble("pressedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  59 -> androidx.compose.material3.CardDefaults.elevatedCardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  60 -> androidx.compose.material3.CardDefaults.elevatedCardElevation(`focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  61 -> androidx.compose.material3.CardDefaults.elevatedCardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  62 -> androidx.compose.material3.CardDefaults.elevatedCardElevation(`pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  63 -> androidx.compose.material3.CardDefaults.elevatedCardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  else -> error("Invalid generated arguments for androidx.compose.material3.CardDefaults.elevatedCardElevation")
}

@Composable
private fun JSONObject.decodeComposeCardElevationValueFactory2(): androidx.compose.material3.CardElevation = when ((if (has("defaultElevation")) 1 else 0) + (if (has("pressedElevation")) 2 else 0) + (if (has("focusedElevation")) 4 else 0) + (if (has("hoveredElevation")) 8 else 0) + (if (has("draggedElevation")) 16 else 0) + (if (has("disabledElevation")) 32 else 0)) {
  0 -> androidx.compose.material3.CardDefaults.outlinedCardElevation()
  1 -> androidx.compose.material3.CardDefaults.outlinedCardElevation(`defaultElevation` = getDouble("defaultElevation").dp)
  2 -> androidx.compose.material3.CardDefaults.outlinedCardElevation(`pressedElevation` = getDouble("pressedElevation").dp)
  3 -> androidx.compose.material3.CardDefaults.outlinedCardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp)
  4 -> androidx.compose.material3.CardDefaults.outlinedCardElevation(`focusedElevation` = getDouble("focusedElevation").dp)
  5 -> androidx.compose.material3.CardDefaults.outlinedCardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp)
  6 -> androidx.compose.material3.CardDefaults.outlinedCardElevation(`pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp)
  7 -> androidx.compose.material3.CardDefaults.outlinedCardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp)
  8 -> androidx.compose.material3.CardDefaults.outlinedCardElevation(`hoveredElevation` = getDouble("hoveredElevation").dp)
  9 -> androidx.compose.material3.CardDefaults.outlinedCardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp)
  10 -> androidx.compose.material3.CardDefaults.outlinedCardElevation(`pressedElevation` = getDouble("pressedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp)
  11 -> androidx.compose.material3.CardDefaults.outlinedCardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp)
  12 -> androidx.compose.material3.CardDefaults.outlinedCardElevation(`focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp)
  13 -> androidx.compose.material3.CardDefaults.outlinedCardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp)
  14 -> androidx.compose.material3.CardDefaults.outlinedCardElevation(`pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp)
  15 -> androidx.compose.material3.CardDefaults.outlinedCardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp)
  16 -> androidx.compose.material3.CardDefaults.outlinedCardElevation(`draggedElevation` = getDouble("draggedElevation").dp)
  17 -> androidx.compose.material3.CardDefaults.outlinedCardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp)
  18 -> androidx.compose.material3.CardDefaults.outlinedCardElevation(`pressedElevation` = getDouble("pressedElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp)
  19 -> androidx.compose.material3.CardDefaults.outlinedCardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp)
  20 -> androidx.compose.material3.CardDefaults.outlinedCardElevation(`focusedElevation` = getDouble("focusedElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp)
  21 -> androidx.compose.material3.CardDefaults.outlinedCardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp)
  22 -> androidx.compose.material3.CardDefaults.outlinedCardElevation(`pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp)
  23 -> androidx.compose.material3.CardDefaults.outlinedCardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp)
  24 -> androidx.compose.material3.CardDefaults.outlinedCardElevation(`hoveredElevation` = getDouble("hoveredElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp)
  25 -> androidx.compose.material3.CardDefaults.outlinedCardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp)
  26 -> androidx.compose.material3.CardDefaults.outlinedCardElevation(`pressedElevation` = getDouble("pressedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp)
  27 -> androidx.compose.material3.CardDefaults.outlinedCardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp)
  28 -> androidx.compose.material3.CardDefaults.outlinedCardElevation(`focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp)
  29 -> androidx.compose.material3.CardDefaults.outlinedCardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp)
  30 -> androidx.compose.material3.CardDefaults.outlinedCardElevation(`pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp)
  31 -> androidx.compose.material3.CardDefaults.outlinedCardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp)
  32 -> androidx.compose.material3.CardDefaults.outlinedCardElevation(`disabledElevation` = getDouble("disabledElevation").dp)
  33 -> androidx.compose.material3.CardDefaults.outlinedCardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  34 -> androidx.compose.material3.CardDefaults.outlinedCardElevation(`pressedElevation` = getDouble("pressedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  35 -> androidx.compose.material3.CardDefaults.outlinedCardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  36 -> androidx.compose.material3.CardDefaults.outlinedCardElevation(`focusedElevation` = getDouble("focusedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  37 -> androidx.compose.material3.CardDefaults.outlinedCardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  38 -> androidx.compose.material3.CardDefaults.outlinedCardElevation(`pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  39 -> androidx.compose.material3.CardDefaults.outlinedCardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  40 -> androidx.compose.material3.CardDefaults.outlinedCardElevation(`hoveredElevation` = getDouble("hoveredElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  41 -> androidx.compose.material3.CardDefaults.outlinedCardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  42 -> androidx.compose.material3.CardDefaults.outlinedCardElevation(`pressedElevation` = getDouble("pressedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  43 -> androidx.compose.material3.CardDefaults.outlinedCardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  44 -> androidx.compose.material3.CardDefaults.outlinedCardElevation(`focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  45 -> androidx.compose.material3.CardDefaults.outlinedCardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  46 -> androidx.compose.material3.CardDefaults.outlinedCardElevation(`pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  47 -> androidx.compose.material3.CardDefaults.outlinedCardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  48 -> androidx.compose.material3.CardDefaults.outlinedCardElevation(`draggedElevation` = getDouble("draggedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  49 -> androidx.compose.material3.CardDefaults.outlinedCardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  50 -> androidx.compose.material3.CardDefaults.outlinedCardElevation(`pressedElevation` = getDouble("pressedElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  51 -> androidx.compose.material3.CardDefaults.outlinedCardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  52 -> androidx.compose.material3.CardDefaults.outlinedCardElevation(`focusedElevation` = getDouble("focusedElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  53 -> androidx.compose.material3.CardDefaults.outlinedCardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  54 -> androidx.compose.material3.CardDefaults.outlinedCardElevation(`pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  55 -> androidx.compose.material3.CardDefaults.outlinedCardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  56 -> androidx.compose.material3.CardDefaults.outlinedCardElevation(`hoveredElevation` = getDouble("hoveredElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  57 -> androidx.compose.material3.CardDefaults.outlinedCardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  58 -> androidx.compose.material3.CardDefaults.outlinedCardElevation(`pressedElevation` = getDouble("pressedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  59 -> androidx.compose.material3.CardDefaults.outlinedCardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  60 -> androidx.compose.material3.CardDefaults.outlinedCardElevation(`focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  61 -> androidx.compose.material3.CardDefaults.outlinedCardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  62 -> androidx.compose.material3.CardDefaults.outlinedCardElevation(`pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  63 -> androidx.compose.material3.CardDefaults.outlinedCardElevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `draggedElevation` = getDouble("draggedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  else -> error("Invalid generated arguments for androidx.compose.material3.CardDefaults.outlinedCardElevation")
}

internal fun JSONObject.decodeComposeCheckboxColorsValue(): androidx.compose.material3.CheckboxColors = androidx.compose.material3.CheckboxColors(
  `checkedCheckmarkColor` = parseComposeColor(getString("checkedCheckmarkColor")),
  `uncheckedCheckmarkColor` = parseComposeColor(getString("uncheckedCheckmarkColor")),
  `checkedBoxColor` = parseComposeColor(getString("checkedBoxColor")),
  `uncheckedBoxColor` = parseComposeColor(getString("uncheckedBoxColor")),
  `disabledCheckedBoxColor` = parseComposeColor(getString("disabledCheckedBoxColor")),
  `disabledUncheckedBoxColor` = parseComposeColor(getString("disabledUncheckedBoxColor")),
  `disabledIndeterminateBoxColor` = parseComposeColor(getString("disabledIndeterminateBoxColor")),
  `checkedBorderColor` = parseComposeColor(getString("checkedBorderColor")),
  `uncheckedBorderColor` = parseComposeColor(getString("uncheckedBorderColor")),
  `disabledBorderColor` = parseComposeColor(getString("disabledBorderColor")),
  `disabledUncheckedBorderColor` = parseComposeColor(getString("disabledUncheckedBorderColor")),
  `disabledIndeterminateBorderColor` = parseComposeColor(getString("disabledIndeterminateBorderColor")),
)

internal fun JSONObject.decodeComposeChipColorsValue(): androidx.compose.material3.ChipColors = androidx.compose.material3.ChipColors(
  `containerColor` = parseComposeColor(getString("containerColor")),
  `labelColor` = parseComposeColor(getString("labelColor")),
  `leadingIconContentColor` = parseComposeColor(getString("leadingIconContentColor")),
  `trailingIconContentColor` = parseComposeColor(getString("trailingIconContentColor")),
  `disabledContainerColor` = parseComposeColor(getString("disabledContainerColor")),
  `disabledLabelColor` = parseComposeColor(getString("disabledLabelColor")),
  `disabledLeadingIconContentColor` = parseComposeColor(getString("disabledLeadingIconContentColor")),
  `disabledTrailingIconContentColor` = parseComposeColor(getString("disabledTrailingIconContentColor")),
)

internal fun JSONObject.decodeComposeChipElevationValue(): androidx.compose.material3.ChipElevation = androidx.compose.material3.ChipElevation(
  `elevation` = getDouble("elevation").dp,
  `pressedElevation` = getDouble("pressedElevation").dp,
  `focusedElevation` = getDouble("focusedElevation").dp,
  `hoveredElevation` = getDouble("hoveredElevation").dp,
  `draggedElevation` = getDouble("draggedElevation").dp,
  `disabledElevation` = getDouble("disabledElevation").dp,
)

internal fun JSONObject.decodeComposeDatePickerColorsValue(): androidx.compose.material3.DatePickerColors = androidx.compose.material3.DatePickerColors(
  `containerColor` = parseComposeColor(getString("containerColor")),
  `titleContentColor` = parseComposeColor(getString("titleContentColor")),
  `headlineContentColor` = parseComposeColor(getString("headlineContentColor")),
  `weekdayContentColor` = parseComposeColor(getString("weekdayContentColor")),
  `subheadContentColor` = parseComposeColor(getString("subheadContentColor")),
  `navigationContentColor` = parseComposeColor(getString("navigationContentColor")),
  `yearContentColor` = parseComposeColor(getString("yearContentColor")),
  `disabledYearContentColor` = parseComposeColor(getString("disabledYearContentColor")),
  `currentYearContentColor` = parseComposeColor(getString("currentYearContentColor")),
  `selectedYearContentColor` = parseComposeColor(getString("selectedYearContentColor")),
  `disabledSelectedYearContentColor` = parseComposeColor(getString("disabledSelectedYearContentColor")),
  `selectedYearContainerColor` = parseComposeColor(getString("selectedYearContainerColor")),
  `disabledSelectedYearContainerColor` = parseComposeColor(getString("disabledSelectedYearContainerColor")),
  `dayContentColor` = parseComposeColor(getString("dayContentColor")),
  `disabledDayContentColor` = parseComposeColor(getString("disabledDayContentColor")),
  `selectedDayContentColor` = parseComposeColor(getString("selectedDayContentColor")),
  `disabledSelectedDayContentColor` = parseComposeColor(getString("disabledSelectedDayContentColor")),
  `selectedDayContainerColor` = parseComposeColor(getString("selectedDayContainerColor")),
  `disabledSelectedDayContainerColor` = parseComposeColor(getString("disabledSelectedDayContainerColor")),
  `todayContentColor` = parseComposeColor(getString("todayContentColor")),
  `todayDateBorderColor` = parseComposeColor(getString("todayDateBorderColor")),
  `dayInSelectionRangeContainerColor` = parseComposeColor(getString("dayInSelectionRangeContainerColor")),
  `dayInSelectionRangeContentColor` = parseComposeColor(getString("dayInSelectionRangeContentColor")),
  `dividerColor` = parseComposeColor(getString("dividerColor")),
  `dateTextFieldColors` = getJSONObject("dateTextFieldColors").decodeComposeTextFieldColorsValue(),
)

internal fun JSONObject.decodeComposeDragHandleColorsValue(): androidx.compose.material3.DragHandleColors = androidx.compose.material3.DragHandleColors(
  `color` = parseComposeColor(getString("color")),
  `pressedColor` = parseComposeColor(getString("pressedColor")),
  `draggedColor` = parseComposeColor(getString("draggedColor")),
)

@Composable
internal fun JSONObject.decodeComposeFloatingActionButtonElevationValue(): androidx.compose.material3.FloatingActionButtonElevation = when (val factory = getString("factory")) {
  "FloatingActionButtonDefaults.bottomAppBarFabElevation" -> decodeComposeFloatingActionButtonElevationValueFactory0()
  "FloatingActionButtonDefaults.elevation" -> decodeComposeFloatingActionButtonElevationValueFactory1()
  "FloatingActionButtonDefaults.loweredElevation" -> decodeComposeFloatingActionButtonElevationValueFactory2()
  else -> error("Unknown ComposeFloatingActionButtonElevationValue factory: " + factory)
}

private fun JSONObject.decodeComposeFloatingActionButtonElevationValueFactory0(): androidx.compose.material3.FloatingActionButtonElevation = when ((if (has("defaultElevation")) 1 else 0) + (if (has("pressedElevation")) 2 else 0) + (if (has("focusedElevation")) 4 else 0) + (if (has("hoveredElevation")) 8 else 0)) {
  0 -> androidx.compose.material3.FloatingActionButtonDefaults.bottomAppBarFabElevation()
  1 -> androidx.compose.material3.FloatingActionButtonDefaults.bottomAppBarFabElevation(`defaultElevation` = getDouble("defaultElevation").dp)
  2 -> androidx.compose.material3.FloatingActionButtonDefaults.bottomAppBarFabElevation(`pressedElevation` = getDouble("pressedElevation").dp)
  3 -> androidx.compose.material3.FloatingActionButtonDefaults.bottomAppBarFabElevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp)
  4 -> androidx.compose.material3.FloatingActionButtonDefaults.bottomAppBarFabElevation(`focusedElevation` = getDouble("focusedElevation").dp)
  5 -> androidx.compose.material3.FloatingActionButtonDefaults.bottomAppBarFabElevation(`defaultElevation` = getDouble("defaultElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp)
  6 -> androidx.compose.material3.FloatingActionButtonDefaults.bottomAppBarFabElevation(`pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp)
  7 -> androidx.compose.material3.FloatingActionButtonDefaults.bottomAppBarFabElevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp)
  8 -> androidx.compose.material3.FloatingActionButtonDefaults.bottomAppBarFabElevation(`hoveredElevation` = getDouble("hoveredElevation").dp)
  9 -> androidx.compose.material3.FloatingActionButtonDefaults.bottomAppBarFabElevation(`defaultElevation` = getDouble("defaultElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp)
  10 -> androidx.compose.material3.FloatingActionButtonDefaults.bottomAppBarFabElevation(`pressedElevation` = getDouble("pressedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp)
  11 -> androidx.compose.material3.FloatingActionButtonDefaults.bottomAppBarFabElevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp)
  12 -> androidx.compose.material3.FloatingActionButtonDefaults.bottomAppBarFabElevation(`focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp)
  13 -> androidx.compose.material3.FloatingActionButtonDefaults.bottomAppBarFabElevation(`defaultElevation` = getDouble("defaultElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp)
  14 -> androidx.compose.material3.FloatingActionButtonDefaults.bottomAppBarFabElevation(`pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp)
  15 -> androidx.compose.material3.FloatingActionButtonDefaults.bottomAppBarFabElevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp)
  else -> error("Invalid generated arguments for androidx.compose.material3.FloatingActionButtonDefaults.bottomAppBarFabElevation")
}

@Composable
private fun JSONObject.decodeComposeFloatingActionButtonElevationValueFactory1(): androidx.compose.material3.FloatingActionButtonElevation = when ((if (has("defaultElevation")) 1 else 0) + (if (has("pressedElevation")) 2 else 0) + (if (has("focusedElevation")) 4 else 0) + (if (has("hoveredElevation")) 8 else 0)) {
  0 -> androidx.compose.material3.FloatingActionButtonDefaults.elevation()
  1 -> androidx.compose.material3.FloatingActionButtonDefaults.elevation(`defaultElevation` = getDouble("defaultElevation").dp)
  2 -> androidx.compose.material3.FloatingActionButtonDefaults.elevation(`pressedElevation` = getDouble("pressedElevation").dp)
  3 -> androidx.compose.material3.FloatingActionButtonDefaults.elevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp)
  4 -> androidx.compose.material3.FloatingActionButtonDefaults.elevation(`focusedElevation` = getDouble("focusedElevation").dp)
  5 -> androidx.compose.material3.FloatingActionButtonDefaults.elevation(`defaultElevation` = getDouble("defaultElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp)
  6 -> androidx.compose.material3.FloatingActionButtonDefaults.elevation(`pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp)
  7 -> androidx.compose.material3.FloatingActionButtonDefaults.elevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp)
  8 -> androidx.compose.material3.FloatingActionButtonDefaults.elevation(`hoveredElevation` = getDouble("hoveredElevation").dp)
  9 -> androidx.compose.material3.FloatingActionButtonDefaults.elevation(`defaultElevation` = getDouble("defaultElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp)
  10 -> androidx.compose.material3.FloatingActionButtonDefaults.elevation(`pressedElevation` = getDouble("pressedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp)
  11 -> androidx.compose.material3.FloatingActionButtonDefaults.elevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp)
  12 -> androidx.compose.material3.FloatingActionButtonDefaults.elevation(`focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp)
  13 -> androidx.compose.material3.FloatingActionButtonDefaults.elevation(`defaultElevation` = getDouble("defaultElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp)
  14 -> androidx.compose.material3.FloatingActionButtonDefaults.elevation(`pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp)
  15 -> androidx.compose.material3.FloatingActionButtonDefaults.elevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp)
  else -> error("Invalid generated arguments for androidx.compose.material3.FloatingActionButtonDefaults.elevation")
}

@Composable
private fun JSONObject.decodeComposeFloatingActionButtonElevationValueFactory2(): androidx.compose.material3.FloatingActionButtonElevation = when ((if (has("defaultElevation")) 1 else 0) + (if (has("pressedElevation")) 2 else 0) + (if (has("focusedElevation")) 4 else 0) + (if (has("hoveredElevation")) 8 else 0)) {
  0 -> androidx.compose.material3.FloatingActionButtonDefaults.loweredElevation()
  1 -> androidx.compose.material3.FloatingActionButtonDefaults.loweredElevation(`defaultElevation` = getDouble("defaultElevation").dp)
  2 -> androidx.compose.material3.FloatingActionButtonDefaults.loweredElevation(`pressedElevation` = getDouble("pressedElevation").dp)
  3 -> androidx.compose.material3.FloatingActionButtonDefaults.loweredElevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp)
  4 -> androidx.compose.material3.FloatingActionButtonDefaults.loweredElevation(`focusedElevation` = getDouble("focusedElevation").dp)
  5 -> androidx.compose.material3.FloatingActionButtonDefaults.loweredElevation(`defaultElevation` = getDouble("defaultElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp)
  6 -> androidx.compose.material3.FloatingActionButtonDefaults.loweredElevation(`pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp)
  7 -> androidx.compose.material3.FloatingActionButtonDefaults.loweredElevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp)
  8 -> androidx.compose.material3.FloatingActionButtonDefaults.loweredElevation(`hoveredElevation` = getDouble("hoveredElevation").dp)
  9 -> androidx.compose.material3.FloatingActionButtonDefaults.loweredElevation(`defaultElevation` = getDouble("defaultElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp)
  10 -> androidx.compose.material3.FloatingActionButtonDefaults.loweredElevation(`pressedElevation` = getDouble("pressedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp)
  11 -> androidx.compose.material3.FloatingActionButtonDefaults.loweredElevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp)
  12 -> androidx.compose.material3.FloatingActionButtonDefaults.loweredElevation(`focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp)
  13 -> androidx.compose.material3.FloatingActionButtonDefaults.loweredElevation(`defaultElevation` = getDouble("defaultElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp)
  14 -> androidx.compose.material3.FloatingActionButtonDefaults.loweredElevation(`pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp)
  15 -> androidx.compose.material3.FloatingActionButtonDefaults.loweredElevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp)
  else -> error("Invalid generated arguments for androidx.compose.material3.FloatingActionButtonDefaults.loweredElevation")
}

internal fun JSONObject.decodeComposeFloatingToolbarColorsValue(): androidx.compose.material3.FloatingToolbarColors = androidx.compose.material3.FloatingToolbarColors(
  `toolbarContainerColor` = parseComposeColor(getString("toolbarContainerColor")),
  `toolbarContentColor` = parseComposeColor(getString("toolbarContentColor")),
  `fabContainerColor` = parseComposeColor(getString("fabContainerColor")),
  `fabContentColor` = parseComposeColor(getString("fabContentColor")),
)

internal fun JSONObject.decodeComposeIconButtonColorsValue(): androidx.compose.material3.IconButtonColors = androidx.compose.material3.IconButtonColors(
  `containerColor` = parseComposeColor(getString("containerColor")),
  `contentColor` = parseComposeColor(getString("contentColor")),
  `disabledContainerColor` = parseComposeColor(getString("disabledContainerColor")),
  `disabledContentColor` = parseComposeColor(getString("disabledContentColor")),
)

internal fun JSONObject.decodeComposeIconToggleButtonColorsValue(): androidx.compose.material3.IconToggleButtonColors = androidx.compose.material3.IconToggleButtonColors(
  `containerColor` = parseComposeColor(getString("containerColor")),
  `contentColor` = parseComposeColor(getString("contentColor")),
  `disabledContainerColor` = parseComposeColor(getString("disabledContainerColor")),
  `disabledContentColor` = parseComposeColor(getString("disabledContentColor")),
  `checkedContainerColor` = parseComposeColor(getString("checkedContainerColor")),
  `checkedContentColor` = parseComposeColor(getString("checkedContentColor")),
)

internal fun JSONObject.decodeComposeListItemColorsValue(): androidx.compose.material3.ListItemColors = androidx.compose.material3.ListItemColors(
  `containerColor` = parseComposeColor(getString("containerColor")),
  `headlineColor` = parseComposeColor(getString("headlineColor")),
  `leadingIconColor` = parseComposeColor(getString("leadingIconColor")),
  `overlineColor` = parseComposeColor(getString("overlineColor")),
  `supportingTextColor` = parseComposeColor(getString("supportingTextColor")),
  `trailingIconColor` = parseComposeColor(getString("trailingIconColor")),
  `disabledHeadlineColor` = parseComposeColor(getString("disabledHeadlineColor")),
  `disabledLeadingIconColor` = parseComposeColor(getString("disabledLeadingIconColor")),
  `disabledTrailingIconColor` = parseComposeColor(getString("disabledTrailingIconColor")),
)

internal fun JSONObject.decodeComposeMenuItemColorsValue(): androidx.compose.material3.MenuItemColors = androidx.compose.material3.MenuItemColors(
  `textColor` = parseComposeColor(getString("textColor")),
  `leadingIconColor` = parseComposeColor(getString("leadingIconColor")),
  `trailingIconColor` = parseComposeColor(getString("trailingIconColor")),
  `disabledTextColor` = parseComposeColor(getString("disabledTextColor")),
  `disabledLeadingIconColor` = parseComposeColor(getString("disabledLeadingIconColor")),
  `disabledTrailingIconColor` = parseComposeColor(getString("disabledTrailingIconColor")),
)

internal fun JSONObject.decodeComposeMotionSchemeValue(): androidx.compose.material3.MotionScheme = when (val factory = getString("factory")) {
  "MotionScheme.expressive" -> decodeComposeMotionSchemeValueFactory0()
  "MotionScheme.standard" -> decodeComposeMotionSchemeValueFactory1()
  else -> error("Unknown ComposeMotionSchemeValue factory: " + factory)
}

private fun JSONObject.decodeComposeMotionSchemeValueFactory0(): androidx.compose.material3.MotionScheme = androidx.compose.material3.MotionScheme.Companion.expressive(
)

private fun JSONObject.decodeComposeMotionSchemeValueFactory1(): androidx.compose.material3.MotionScheme = androidx.compose.material3.MotionScheme.Companion.standard(
)

internal fun JSONObject.decodeComposeNavigationBarItemColorsValue(): androidx.compose.material3.NavigationBarItemColors = androidx.compose.material3.NavigationBarItemColors(
  `selectedIconColor` = parseComposeColor(getString("selectedIconColor")),
  `selectedTextColor` = parseComposeColor(getString("selectedTextColor")),
  `selectedIndicatorColor` = parseComposeColor(getString("selectedIndicatorColor")),
  `unselectedIconColor` = parseComposeColor(getString("unselectedIconColor")),
  `unselectedTextColor` = parseComposeColor(getString("unselectedTextColor")),
  `disabledIconColor` = parseComposeColor(getString("disabledIconColor")),
  `disabledTextColor` = parseComposeColor(getString("disabledTextColor")),
)

internal fun JSONObject.decodeComposeNavigationItemColorsValue(): androidx.compose.material3.NavigationItemColors = androidx.compose.material3.NavigationItemColors(
  `selectedIconColor` = parseComposeColor(getString("selectedIconColor")),
  `selectedTextColor` = parseComposeColor(getString("selectedTextColor")),
  `selectedIndicatorColor` = parseComposeColor(getString("selectedIndicatorColor")),
  `unselectedIconColor` = parseComposeColor(getString("unselectedIconColor")),
  `unselectedTextColor` = parseComposeColor(getString("unselectedTextColor")),
  `disabledIconColor` = parseComposeColor(getString("disabledIconColor")),
  `disabledTextColor` = parseComposeColor(getString("disabledTextColor")),
)

internal fun JSONObject.decodeComposeNavigationRailItemColorsValue(): androidx.compose.material3.NavigationRailItemColors = androidx.compose.material3.NavigationRailItemColors(
  `selectedIconColor` = parseComposeColor(getString("selectedIconColor")),
  `selectedTextColor` = parseComposeColor(getString("selectedTextColor")),
  `selectedIndicatorColor` = parseComposeColor(getString("selectedIndicatorColor")),
  `unselectedIconColor` = parseComposeColor(getString("unselectedIconColor")),
  `unselectedTextColor` = parseComposeColor(getString("unselectedTextColor")),
  `disabledIconColor` = parseComposeColor(getString("disabledIconColor")),
  `disabledTextColor` = parseComposeColor(getString("disabledTextColor")),
)

internal fun JSONObject.decodeComposeRadioButtonColorsValue(): androidx.compose.material3.RadioButtonColors = androidx.compose.material3.RadioButtonColors(
  `selectedColor` = parseComposeColor(getString("selectedColor")),
  `unselectedColor` = parseComposeColor(getString("unselectedColor")),
  `disabledSelectedColor` = parseComposeColor(getString("disabledSelectedColor")),
  `disabledUnselectedColor` = parseComposeColor(getString("disabledUnselectedColor")),
)

internal fun JSONObject.decodeComposeRichTooltipColorsValue(): androidx.compose.material3.RichTooltipColors = androidx.compose.material3.RichTooltipColors(
  `containerColor` = parseComposeColor(getString("containerColor")),
  `contentColor` = parseComposeColor(getString("contentColor")),
  `titleContentColor` = parseComposeColor(getString("titleContentColor")),
  `actionContentColor` = parseComposeColor(getString("actionContentColor")),
)

internal fun JSONObject.decodeComposeSearchBarColorsValue(): androidx.compose.material3.SearchBarColors = androidx.compose.material3.SearchBarColors(
  `containerColor` = parseComposeColor(getString("containerColor")),
  `dividerColor` = parseComposeColor(getString("dividerColor")),
  `inputFieldColors` = getJSONObject("inputFieldColors").decodeComposeTextFieldColorsValue(),
)

internal fun JSONObject.decodeComposeSegmentedButtonColorsValue(): androidx.compose.material3.SegmentedButtonColors = androidx.compose.material3.SegmentedButtonColors(
  `activeContainerColor` = parseComposeColor(getString("activeContainerColor")),
  `activeContentColor` = parseComposeColor(getString("activeContentColor")),
  `activeBorderColor` = parseComposeColor(getString("activeBorderColor")),
  `inactiveContainerColor` = parseComposeColor(getString("inactiveContainerColor")),
  `inactiveContentColor` = parseComposeColor(getString("inactiveContentColor")),
  `inactiveBorderColor` = parseComposeColor(getString("inactiveBorderColor")),
  `disabledActiveContainerColor` = parseComposeColor(getString("disabledActiveContainerColor")),
  `disabledActiveContentColor` = parseComposeColor(getString("disabledActiveContentColor")),
  `disabledActiveBorderColor` = parseComposeColor(getString("disabledActiveBorderColor")),
  `disabledInactiveContainerColor` = parseComposeColor(getString("disabledInactiveContainerColor")),
  `disabledInactiveContentColor` = parseComposeColor(getString("disabledInactiveContentColor")),
  `disabledInactiveBorderColor` = parseComposeColor(getString("disabledInactiveBorderColor")),
)

internal fun JSONObject.decodeComposeSelectableChipElevationValue(): androidx.compose.material3.SelectableChipElevation = androidx.compose.material3.SelectableChipElevation(
  `elevation` = getDouble("elevation").dp,
  `pressedElevation` = getDouble("pressedElevation").dp,
  `focusedElevation` = getDouble("focusedElevation").dp,
  `hoveredElevation` = getDouble("hoveredElevation").dp,
  `draggedElevation` = getDouble("draggedElevation").dp,
  `disabledElevation` = getDouble("disabledElevation").dp,
)

internal fun JSONObject.decodeComposeSliderColorsValue(): androidx.compose.material3.SliderColors = androidx.compose.material3.SliderColors(
  `thumbColor` = parseComposeColor(getString("thumbColor")),
  `activeTrackColor` = parseComposeColor(getString("activeTrackColor")),
  `activeTickColor` = parseComposeColor(getString("activeTickColor")),
  `inactiveTrackColor` = parseComposeColor(getString("inactiveTrackColor")),
  `inactiveTickColor` = parseComposeColor(getString("inactiveTickColor")),
  `disabledThumbColor` = parseComposeColor(getString("disabledThumbColor")),
  `disabledActiveTrackColor` = parseComposeColor(getString("disabledActiveTrackColor")),
  `disabledActiveTickColor` = parseComposeColor(getString("disabledActiveTickColor")),
  `disabledInactiveTrackColor` = parseComposeColor(getString("disabledInactiveTrackColor")),
  `disabledInactiveTickColor` = parseComposeColor(getString("disabledInactiveTickColor")),
)

@Composable
internal fun JSONObject.decodeComposeSplitButtonShapesValue(): androidx.compose.material3.SplitButtonShapes = when (val factory = getString("factory")) {
  "SplitButtonDefaults.leadingButtonShapesFor" -> decodeComposeSplitButtonShapesValueFactory0()
  "SplitButtonDefaults.trailingButtonShapesFor" -> decodeComposeSplitButtonShapesValueFactory1()
  else -> error("Unknown ComposeSplitButtonShapesValue factory: " + factory)
}

@Composable
private fun JSONObject.decodeComposeSplitButtonShapesValueFactory0(): androidx.compose.material3.SplitButtonShapes = androidx.compose.material3.SplitButtonDefaults.leadingButtonShapesFor(
  `buttonHeight` = getDouble("buttonHeight").dp,
)

@Composable
private fun JSONObject.decodeComposeSplitButtonShapesValueFactory1(): androidx.compose.material3.SplitButtonShapes = androidx.compose.material3.SplitButtonDefaults.trailingButtonShapesFor(
  `buttonHeight` = getDouble("buttonHeight").dp,
)

internal fun JSONObject.decodeComposeSwitchColorsValue(): androidx.compose.material3.SwitchColors = androidx.compose.material3.SwitchColors(
  `checkedThumbColor` = parseComposeColor(getString("checkedThumbColor")),
  `checkedTrackColor` = parseComposeColor(getString("checkedTrackColor")),
  `checkedBorderColor` = parseComposeColor(getString("checkedBorderColor")),
  `checkedIconColor` = parseComposeColor(getString("checkedIconColor")),
  `uncheckedThumbColor` = parseComposeColor(getString("uncheckedThumbColor")),
  `uncheckedTrackColor` = parseComposeColor(getString("uncheckedTrackColor")),
  `uncheckedBorderColor` = parseComposeColor(getString("uncheckedBorderColor")),
  `uncheckedIconColor` = parseComposeColor(getString("uncheckedIconColor")),
  `disabledCheckedThumbColor` = parseComposeColor(getString("disabledCheckedThumbColor")),
  `disabledCheckedTrackColor` = parseComposeColor(getString("disabledCheckedTrackColor")),
  `disabledCheckedBorderColor` = parseComposeColor(getString("disabledCheckedBorderColor")),
  `disabledCheckedIconColor` = parseComposeColor(getString("disabledCheckedIconColor")),
  `disabledUncheckedThumbColor` = parseComposeColor(getString("disabledUncheckedThumbColor")),
  `disabledUncheckedTrackColor` = parseComposeColor(getString("disabledUncheckedTrackColor")),
  `disabledUncheckedBorderColor` = parseComposeColor(getString("disabledUncheckedBorderColor")),
  `disabledUncheckedIconColor` = parseComposeColor(getString("disabledUncheckedIconColor")),
)

internal fun JSONObject.decodeComposeTextFieldColorsValue(): androidx.compose.material3.TextFieldColors = androidx.compose.material3.TextFieldColors(
  `focusedTextColor` = parseComposeColor(getString("focusedTextColor")),
  `unfocusedTextColor` = parseComposeColor(getString("unfocusedTextColor")),
  `disabledTextColor` = parseComposeColor(getString("disabledTextColor")),
  `errorTextColor` = parseComposeColor(getString("errorTextColor")),
  `focusedContainerColor` = parseComposeColor(getString("focusedContainerColor")),
  `unfocusedContainerColor` = parseComposeColor(getString("unfocusedContainerColor")),
  `disabledContainerColor` = parseComposeColor(getString("disabledContainerColor")),
  `errorContainerColor` = parseComposeColor(getString("errorContainerColor")),
  `cursorColor` = parseComposeColor(getString("cursorColor")),
  `errorCursorColor` = parseComposeColor(getString("errorCursorColor")),
  `textSelectionColors` = getJSONObject("textSelectionColors").decodeComposeTextSelectionColorsValue(),
  `focusedIndicatorColor` = parseComposeColor(getString("focusedIndicatorColor")),
  `unfocusedIndicatorColor` = parseComposeColor(getString("unfocusedIndicatorColor")),
  `disabledIndicatorColor` = parseComposeColor(getString("disabledIndicatorColor")),
  `errorIndicatorColor` = parseComposeColor(getString("errorIndicatorColor")),
  `focusedLeadingIconColor` = parseComposeColor(getString("focusedLeadingIconColor")),
  `unfocusedLeadingIconColor` = parseComposeColor(getString("unfocusedLeadingIconColor")),
  `disabledLeadingIconColor` = parseComposeColor(getString("disabledLeadingIconColor")),
  `errorLeadingIconColor` = parseComposeColor(getString("errorLeadingIconColor")),
  `focusedTrailingIconColor` = parseComposeColor(getString("focusedTrailingIconColor")),
  `unfocusedTrailingIconColor` = parseComposeColor(getString("unfocusedTrailingIconColor")),
  `disabledTrailingIconColor` = parseComposeColor(getString("disabledTrailingIconColor")),
  `errorTrailingIconColor` = parseComposeColor(getString("errorTrailingIconColor")),
  `focusedLabelColor` = parseComposeColor(getString("focusedLabelColor")),
  `unfocusedLabelColor` = parseComposeColor(getString("unfocusedLabelColor")),
  `disabledLabelColor` = parseComposeColor(getString("disabledLabelColor")),
  `errorLabelColor` = parseComposeColor(getString("errorLabelColor")),
  `focusedPlaceholderColor` = parseComposeColor(getString("focusedPlaceholderColor")),
  `unfocusedPlaceholderColor` = parseComposeColor(getString("unfocusedPlaceholderColor")),
  `disabledPlaceholderColor` = parseComposeColor(getString("disabledPlaceholderColor")),
  `errorPlaceholderColor` = parseComposeColor(getString("errorPlaceholderColor")),
  `focusedSupportingTextColor` = parseComposeColor(getString("focusedSupportingTextColor")),
  `unfocusedSupportingTextColor` = parseComposeColor(getString("unfocusedSupportingTextColor")),
  `disabledSupportingTextColor` = parseComposeColor(getString("disabledSupportingTextColor")),
  `errorSupportingTextColor` = parseComposeColor(getString("errorSupportingTextColor")),
  `focusedPrefixColor` = parseComposeColor(getString("focusedPrefixColor")),
  `unfocusedPrefixColor` = parseComposeColor(getString("unfocusedPrefixColor")),
  `disabledPrefixColor` = parseComposeColor(getString("disabledPrefixColor")),
  `errorPrefixColor` = parseComposeColor(getString("errorPrefixColor")),
  `focusedSuffixColor` = parseComposeColor(getString("focusedSuffixColor")),
  `unfocusedSuffixColor` = parseComposeColor(getString("unfocusedSuffixColor")),
  `disabledSuffixColor` = parseComposeColor(getString("disabledSuffixColor")),
  `errorSuffixColor` = parseComposeColor(getString("errorSuffixColor")),
)

internal fun JSONObject.decodeComposeTextFieldLabelPositionValue(): androidx.compose.material3.TextFieldLabelPosition = when (val factory = getString("factory")) {
  "TextFieldLabelPosition.Above" -> decodeComposeTextFieldLabelPositionValueFactory0()
  "TextFieldLabelPosition.Attached" -> decodeComposeTextFieldLabelPositionValueFactory1()
  else -> error("Unknown ComposeTextFieldLabelPositionValue factory: " + factory)
}

private fun JSONObject.decodeComposeTextFieldLabelPositionValueFactory0(): androidx.compose.material3.TextFieldLabelPosition = when ((if (has("alignment")) 1 else 0)) {
  0 -> androidx.compose.material3.TextFieldLabelPosition.Above()
  1 -> androidx.compose.material3.TextFieldLabelPosition.Above(`alignment` = toComposeHorizontalAlignment(getString("alignment")))
  else -> error("Invalid generated arguments for androidx.compose.material3.TextFieldLabelPosition.Above")
}

private fun JSONObject.decodeComposeTextFieldLabelPositionValueFactory1(): androidx.compose.material3.TextFieldLabelPosition = when ((if (has("alwaysMinimize")) 1 else 0) + (if (has("minimizedAlignment")) 2 else 0) + (if (has("expandedAlignment")) 4 else 0)) {
  0 -> androidx.compose.material3.TextFieldLabelPosition.Attached()
  1 -> androidx.compose.material3.TextFieldLabelPosition.Attached(`alwaysMinimize` = getBoolean("alwaysMinimize"))
  2 -> androidx.compose.material3.TextFieldLabelPosition.Attached(`minimizedAlignment` = toComposeHorizontalAlignment(getString("minimizedAlignment")))
  3 -> androidx.compose.material3.TextFieldLabelPosition.Attached(`alwaysMinimize` = getBoolean("alwaysMinimize"), `minimizedAlignment` = toComposeHorizontalAlignment(getString("minimizedAlignment")))
  4 -> androidx.compose.material3.TextFieldLabelPosition.Attached(`expandedAlignment` = toComposeHorizontalAlignment(getString("expandedAlignment")))
  5 -> androidx.compose.material3.TextFieldLabelPosition.Attached(`alwaysMinimize` = getBoolean("alwaysMinimize"), `expandedAlignment` = toComposeHorizontalAlignment(getString("expandedAlignment")))
  6 -> androidx.compose.material3.TextFieldLabelPosition.Attached(`minimizedAlignment` = toComposeHorizontalAlignment(getString("minimizedAlignment")), `expandedAlignment` = toComposeHorizontalAlignment(getString("expandedAlignment")))
  7 -> androidx.compose.material3.TextFieldLabelPosition.Attached(`alwaysMinimize` = getBoolean("alwaysMinimize"), `minimizedAlignment` = toComposeHorizontalAlignment(getString("minimizedAlignment")), `expandedAlignment` = toComposeHorizontalAlignment(getString("expandedAlignment")))
  else -> error("Invalid generated arguments for androidx.compose.material3.TextFieldLabelPosition.Attached")
}

internal fun JSONObject.decodeComposeTimePickerColorsValue(): androidx.compose.material3.TimePickerColors = androidx.compose.material3.TimePickerColors(
  `clockDialColor` = parseComposeColor(getString("clockDialColor")),
  `selectorColor` = parseComposeColor(getString("selectorColor")),
  `containerColor` = parseComposeColor(getString("containerColor")),
  `periodSelectorBorderColor` = parseComposeColor(getString("periodSelectorBorderColor")),
  `clockDialSelectedContentColor` = parseComposeColor(getString("clockDialSelectedContentColor")),
  `clockDialUnselectedContentColor` = parseComposeColor(getString("clockDialUnselectedContentColor")),
  `periodSelectorSelectedContainerColor` = parseComposeColor(getString("periodSelectorSelectedContainerColor")),
  `periodSelectorUnselectedContainerColor` = parseComposeColor(getString("periodSelectorUnselectedContainerColor")),
  `periodSelectorSelectedContentColor` = parseComposeColor(getString("periodSelectorSelectedContentColor")),
  `periodSelectorUnselectedContentColor` = parseComposeColor(getString("periodSelectorUnselectedContentColor")),
  `timeSelectorSelectedContainerColor` = parseComposeColor(getString("timeSelectorSelectedContainerColor")),
  `timeSelectorUnselectedContainerColor` = parseComposeColor(getString("timeSelectorUnselectedContainerColor")),
  `timeSelectorSelectedContentColor` = parseComposeColor(getString("timeSelectorSelectedContentColor")),
  `timeSelectorUnselectedContentColor` = parseComposeColor(getString("timeSelectorUnselectedContentColor")),
)

internal fun JSONObject.decodeComposeToggleButtonColorsValue(): androidx.compose.material3.ToggleButtonColors = androidx.compose.material3.ToggleButtonColors(
  `containerColor` = parseComposeColor(getString("containerColor")),
  `contentColor` = parseComposeColor(getString("contentColor")),
  `disabledContainerColor` = parseComposeColor(getString("disabledContainerColor")),
  `disabledContentColor` = parseComposeColor(getString("disabledContentColor")),
  `checkedContainerColor` = parseComposeColor(getString("checkedContainerColor")),
  `checkedContentColor` = parseComposeColor(getString("checkedContentColor")),
)

@Composable
internal fun JSONObject.decodeComposeToggleButtonShapesValue(): androidx.compose.material3.ToggleButtonShapes = when (val factory = getString("factory")) {
  "ToggleButtonDefaults.shapesFor" -> decodeComposeToggleButtonShapesValueFactory0()
  else -> error("Unknown ComposeToggleButtonShapesValue factory: " + factory)
}

@Composable
private fun JSONObject.decodeComposeToggleButtonShapesValueFactory0(): androidx.compose.material3.ToggleButtonShapes = androidx.compose.material3.ToggleButtonDefaults.shapesFor(
  `buttonHeight` = getDouble("buttonHeight").dp,
)

internal fun JSONObject.decodeComposeTopAppBarColorsValue(): androidx.compose.material3.TopAppBarColors = androidx.compose.material3.TopAppBarColors(
  `containerColor` = parseComposeColor(getString("containerColor")),
  `scrolledContainerColor` = parseComposeColor(getString("scrolledContainerColor")),
  `navigationIconContentColor` = parseComposeColor(getString("navigationIconContentColor")),
  `titleContentColor` = parseComposeColor(getString("titleContentColor")),
  `actionIconContentColor` = parseComposeColor(getString("actionIconContentColor")),
  `subtitleContentColor` = parseComposeColor(getString("subtitleContentColor")),
)

internal fun JSONObject.decodeComposeWideNavigationRailColorsValue(): androidx.compose.material3.WideNavigationRailColors = androidx.compose.material3.WideNavigationRailColors(
  `containerColor` = parseComposeColor(getString("containerColor")),
  `contentColor` = parseComposeColor(getString("contentColor")),
  `modalContainerColor` = parseComposeColor(getString("modalContainerColor")),
  `modalScrimColor` = parseComposeColor(getString("modalScrimColor")),
)

internal fun JSONObject.decodeComposeOffset(): androidx.compose.ui.geometry.Offset = androidx.compose.ui.geometry.Offset(
  `x` = getDouble("x").toFloat(),
  `y` = getDouble("y").toFloat(),
)

internal fun JSONObject.decodeComposeColorFilterValue(): androidx.compose.ui.graphics.ColorFilter = when (val factory = getString("factory")) {
  "ColorFilter.lighting" -> decodeComposeColorFilterValueFactory0()
  "ColorFilter.tint" -> decodeComposeColorFilterValueFactory1()
  else -> error("Unknown ComposeColorFilterValue factory: " + factory)
}

private fun JSONObject.decodeComposeColorFilterValueFactory0(): androidx.compose.ui.graphics.ColorFilter = androidx.compose.ui.graphics.ColorFilter.Companion.lighting(
  `multiply` = parseComposeColor(getString("multiply")),
  `add` = parseComposeColor(getString("add")),
)

private fun JSONObject.decodeComposeColorFilterValueFactory1(): androidx.compose.ui.graphics.ColorFilter = when ((if (has("blendMode")) 1 else 0)) {
  0 -> androidx.compose.ui.graphics.ColorFilter.Companion.tint(`color` = parseComposeColor(getString("color")))
  1 -> androidx.compose.ui.graphics.ColorFilter.Companion.tint(`color` = parseComposeColor(getString("color")), `blendMode` = toComposeBlendModeValue(getString("blendMode")))
  else -> error("Invalid generated arguments for androidx.compose.ui.graphics.ColorFilter.Companion.tint")
}

internal fun JSONObject.decodeComposeTransformOrigin(): androidx.compose.ui.graphics.TransformOrigin = androidx.compose.ui.graphics.TransformOrigin(
  `pivotFractionX` = getDouble("pivotFractionX").toFloat(),
  `pivotFractionY` = getDouble("pivotFractionY").toFloat(),
)

internal fun JSONObject.decodeComposeDpTouchBoundsExpansionValue(): androidx.compose.ui.node.DpTouchBoundsExpansion = androidx.compose.ui.node.DpTouchBoundsExpansion(
  `start` = getDouble("start").dp,
  `top` = getDouble("top").dp,
  `end` = getDouble("end").dp,
  `bottom` = getDouble("bottom").dp,
  `isLayoutDirectionAware` = getBoolean("isLayoutDirectionAware"),
)

internal fun JSONObject.decodeComposeBaselineShiftValue(): androidx.compose.ui.text.style.BaselineShift = androidx.compose.ui.text.style.BaselineShift(
  `multiplier` = getDouble("multiplier").toFloat(),
)

internal fun JSONObject.decodeComposeTextIndentValue(): androidx.compose.ui.text.style.TextIndent = when ((if (has("firstLine")) 1 else 0) + (if (has("restLine")) 2 else 0)) {
  0 -> androidx.compose.ui.text.style.TextIndent()
  1 -> androidx.compose.ui.text.style.TextIndent(`firstLine` = getDouble("firstLine").sp)
  2 -> androidx.compose.ui.text.style.TextIndent(`restLine` = getDouble("restLine").sp)
  3 -> androidx.compose.ui.text.style.TextIndent(`firstLine` = getDouble("firstLine").sp, `restLine` = getDouble("restLine").sp)
  else -> error("Invalid generated arguments for ComposeTextIndentValue")
}

internal fun JSONObject.decodeComposeDpOffset(): androidx.compose.ui.unit.DpOffset = androidx.compose.ui.unit.DpOffset(
  `x` = getDouble("x").dp,
  `y` = getDouble("y").dp,
)

internal fun JSONObject.decodeComposeIntOffset(): androidx.compose.ui.unit.IntOffset = androidx.compose.ui.unit.IntOffset(
  `x` = getInt("x"),
  `y` = getInt("y"),
)
