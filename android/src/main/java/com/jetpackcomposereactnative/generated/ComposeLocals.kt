// Generated from Compose CompositionLocals by generate.mjs.
package com.jetpackcomposereactnative.generated

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ProvidedValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jetpackcomposereactnative.common.parseComposeColor
import org.json.JSONArray
import org.json.JSONObject

@Composable
internal fun JSONObject.toComposeProvidedValue(): ProvidedValue<*> = when (val local = getString("local")) {
  "LocalTextSelectionColors" -> androidx.compose.foundation.text.selection.LocalTextSelectionColors provides getJSONObject("value").decodeComposeTextSelectionColorsValue()
  "LocalAbsoluteTonalElevation" -> androidx.compose.material3.LocalAbsoluteTonalElevation provides getDouble("value").dp
  "LocalContentColor" -> androidx.compose.material3.LocalContentColor provides parseComposeColor(getString("value"))
  "LocalMinimumInteractiveComponentSize" -> androidx.compose.material3.LocalMinimumInteractiveComponentSize provides getDouble("value").dp
  "LocalRippleConfiguration" -> androidx.compose.material3.LocalRippleConfiguration provides if (isNull("value")) null else getJSONObject("value").decodeComposeRippleConfigurationValue()
  "LocalTextStyle" -> androidx.compose.material3.LocalTextStyle provides getJSONObject("value").toTextStyle()
  "LocalTonalElevationEnabled" -> androidx.compose.material3.LocalTonalElevationEnabled provides getBoolean("value")
  "LocalCursorBlinkEnabled" -> androidx.compose.ui.platform.LocalCursorBlinkEnabled provides getBoolean("value")
  "LocalDensity" -> androidx.compose.ui.platform.LocalDensity provides getJSONObject("value").decodeComposeDensityValue()
  "LocalInspectionMode" -> androidx.compose.ui.platform.LocalInspectionMode provides getBoolean("value")
  "LocalLayoutDirection" -> androidx.compose.ui.platform.LocalLayoutDirection provides toComposeLayoutDirectionOption(getString("value"))
  "LocalProvidableLocaleList" -> androidx.compose.ui.platform.LocalProvidableLocaleList provides getJSONObject("value").decodeComposeLocaleListValue()
  else -> error("Unknown CompositionLocal: $local")
}

@Composable
internal fun JSONArray.toComposeProvidedValues(): Array<ProvidedValue<*>> =
  List(length()) { index -> getJSONObject(index).toComposeProvidedValue() }.toTypedArray()
