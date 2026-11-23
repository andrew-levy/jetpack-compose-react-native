// Generated from Compose declarations by generate.mjs.
package com.jetpackcomposereactnative.generated

import androidx.compose.ui.graphics.Color
import com.jetpackcomposereactnative.common.parseComposeColor
import org.json.JSONObject

internal fun JSONObject.toColorScheme(): androidx.compose.material3.ColorScheme {
  val colors = getJSONObject("colors")
  return when (val palette = getString("palette")) {
    "dark" -> decodeDarkColorScheme(colors)
    "expressiveLight" -> decodeExpressiveLightColorScheme()
    "light" -> decodeLightColorScheme(colors)
    else -> error("Unknown Compose factory palette: " + palette)
  }
}

private fun decodeDarkColorScheme(colors: JSONObject): androidx.compose.material3.ColorScheme {
  val base = androidx.compose.material3.darkColorScheme()
  val color0 = colors.colorOverride("primary")
  val color1 = colors.colorOverride("onPrimary")
  val color2 = colors.colorOverride("primaryContainer")
  val color3 = colors.colorOverride("onPrimaryContainer")
  val color4 = colors.colorOverride("inversePrimary")
  val color5 = colors.colorOverride("secondary")
  val color6 = colors.colorOverride("onSecondary")
  val color7 = colors.colorOverride("secondaryContainer")
  val color8 = colors.colorOverride("onSecondaryContainer")
  val color9 = colors.colorOverride("tertiary")
  val color10 = colors.colorOverride("onTertiary")
  val color11 = colors.colorOverride("tertiaryContainer")
  val color12 = colors.colorOverride("onTertiaryContainer")
  val color13 = colors.colorOverride("background")
  val color14 = colors.colorOverride("onBackground")
  val color15 = colors.colorOverride("surface")
  val color16 = colors.colorOverride("onSurface")
  val color17 = colors.colorOverride("surfaceVariant")
  val color18 = colors.colorOverride("onSurfaceVariant")
  val color19 = colors.colorOverride("surfaceTint")
  val color20 = colors.colorOverride("inverseSurface")
  val color21 = colors.colorOverride("inverseOnSurface")
  val color22 = colors.colorOverride("error")
  val color23 = colors.colorOverride("onError")
  val color24 = colors.colorOverride("errorContainer")
  val color25 = colors.colorOverride("onErrorContainer")
  val color26 = colors.colorOverride("outline")
  val color27 = colors.colorOverride("outlineVariant")
  val color28 = colors.colorOverride("scrim")
  val color29 = colors.colorOverride("surfaceBright")
  val color30 = colors.colorOverride("surfaceContainer")
  val color31 = colors.colorOverride("surfaceContainerHigh")
  val color32 = colors.colorOverride("surfaceContainerHighest")
  val color33 = colors.colorOverride("surfaceContainerLow")
  val color34 = colors.colorOverride("surfaceContainerLowest")
  val color35 = colors.colorOverride("surfaceDim")
  val color36 = colors.colorOverride("primaryFixed")
  val color37 = colors.colorOverride("primaryFixedDim")
  val color38 = colors.colorOverride("onPrimaryFixed")
  val color39 = colors.colorOverride("onPrimaryFixedVariant")
  val color40 = colors.colorOverride("secondaryFixed")
  val color41 = colors.colorOverride("secondaryFixedDim")
  val color42 = colors.colorOverride("onSecondaryFixed")
  val color43 = colors.colorOverride("onSecondaryFixedVariant")
  val color44 = colors.colorOverride("tertiaryFixed")
  val color45 = colors.colorOverride("tertiaryFixedDim")
  val color46 = colors.colorOverride("onTertiaryFixed")
  val color47 = colors.colorOverride("onTertiaryFixedVariant")
  // Let Kotlin supply defaults that depend on a color passed to the factory.
  val defaults = listOfNotNull(
    color0?.let { androidx.compose.material3.darkColorScheme(`primary` = it) },
    color1?.let { androidx.compose.material3.darkColorScheme(`onPrimary` = it) },
    color2?.let { androidx.compose.material3.darkColorScheme(`primaryContainer` = it) },
    color3?.let { androidx.compose.material3.darkColorScheme(`onPrimaryContainer` = it) },
    color4?.let { androidx.compose.material3.darkColorScheme(`inversePrimary` = it) },
    color5?.let { androidx.compose.material3.darkColorScheme(`secondary` = it) },
    color6?.let { androidx.compose.material3.darkColorScheme(`onSecondary` = it) },
    color7?.let { androidx.compose.material3.darkColorScheme(`secondaryContainer` = it) },
    color8?.let { androidx.compose.material3.darkColorScheme(`onSecondaryContainer` = it) },
    color9?.let { androidx.compose.material3.darkColorScheme(`tertiary` = it) },
    color10?.let { androidx.compose.material3.darkColorScheme(`onTertiary` = it) },
    color11?.let { androidx.compose.material3.darkColorScheme(`tertiaryContainer` = it) },
    color12?.let { androidx.compose.material3.darkColorScheme(`onTertiaryContainer` = it) },
    color13?.let { androidx.compose.material3.darkColorScheme(`background` = it) },
    color14?.let { androidx.compose.material3.darkColorScheme(`onBackground` = it) },
    color15?.let { androidx.compose.material3.darkColorScheme(`surface` = it) },
    color16?.let { androidx.compose.material3.darkColorScheme(`onSurface` = it) },
    color17?.let { androidx.compose.material3.darkColorScheme(`surfaceVariant` = it) },
    color18?.let { androidx.compose.material3.darkColorScheme(`onSurfaceVariant` = it) },
    color19?.let { androidx.compose.material3.darkColorScheme(`surfaceTint` = it) },
    color20?.let { androidx.compose.material3.darkColorScheme(`inverseSurface` = it) },
    color21?.let { androidx.compose.material3.darkColorScheme(`inverseOnSurface` = it) },
    color22?.let { androidx.compose.material3.darkColorScheme(`error` = it) },
    color23?.let { androidx.compose.material3.darkColorScheme(`onError` = it) },
    color24?.let { androidx.compose.material3.darkColorScheme(`errorContainer` = it) },
    color25?.let { androidx.compose.material3.darkColorScheme(`onErrorContainer` = it) },
    color26?.let { androidx.compose.material3.darkColorScheme(`outline` = it) },
    color27?.let { androidx.compose.material3.darkColorScheme(`outlineVariant` = it) },
    color28?.let { androidx.compose.material3.darkColorScheme(`scrim` = it) },
    color29?.let { androidx.compose.material3.darkColorScheme(`surfaceBright` = it) },
    color30?.let { androidx.compose.material3.darkColorScheme(`surfaceContainer` = it) },
    color31?.let { androidx.compose.material3.darkColorScheme(`surfaceContainerHigh` = it) },
    color32?.let { androidx.compose.material3.darkColorScheme(`surfaceContainerHighest` = it) },
    color33?.let { androidx.compose.material3.darkColorScheme(`surfaceContainerLow` = it) },
    color34?.let { androidx.compose.material3.darkColorScheme(`surfaceContainerLowest` = it) },
    color35?.let { androidx.compose.material3.darkColorScheme(`surfaceDim` = it) },
    color36?.let { androidx.compose.material3.darkColorScheme(`primaryFixed` = it) },
    color37?.let { androidx.compose.material3.darkColorScheme(`primaryFixedDim` = it) },
    color38?.let { androidx.compose.material3.darkColorScheme(`onPrimaryFixed` = it) },
    color39?.let { androidx.compose.material3.darkColorScheme(`onPrimaryFixedVariant` = it) },
    color40?.let { androidx.compose.material3.darkColorScheme(`secondaryFixed` = it) },
    color41?.let { androidx.compose.material3.darkColorScheme(`secondaryFixedDim` = it) },
    color42?.let { androidx.compose.material3.darkColorScheme(`onSecondaryFixed` = it) },
    color43?.let { androidx.compose.material3.darkColorScheme(`onSecondaryFixedVariant` = it) },
    color44?.let { androidx.compose.material3.darkColorScheme(`tertiaryFixed` = it) },
    color45?.let { androidx.compose.material3.darkColorScheme(`tertiaryFixedDim` = it) },
    color46?.let { androidx.compose.material3.darkColorScheme(`onTertiaryFixed` = it) },
    color47?.let { androidx.compose.material3.darkColorScheme(`onTertiaryFixedVariant` = it) },
  )
  if (defaults.isEmpty()) return base
  return base.copy(
    `primary` = color0 ?: defaults.lastOrNull { it.`primary` != base.`primary` }?.`primary` ?: base.`primary`,
    `onPrimary` = color1 ?: defaults.lastOrNull { it.`onPrimary` != base.`onPrimary` }?.`onPrimary` ?: base.`onPrimary`,
    `primaryContainer` = color2 ?: defaults.lastOrNull { it.`primaryContainer` != base.`primaryContainer` }?.`primaryContainer` ?: base.`primaryContainer`,
    `onPrimaryContainer` = color3 ?: defaults.lastOrNull { it.`onPrimaryContainer` != base.`onPrimaryContainer` }?.`onPrimaryContainer` ?: base.`onPrimaryContainer`,
    `inversePrimary` = color4 ?: defaults.lastOrNull { it.`inversePrimary` != base.`inversePrimary` }?.`inversePrimary` ?: base.`inversePrimary`,
    `secondary` = color5 ?: defaults.lastOrNull { it.`secondary` != base.`secondary` }?.`secondary` ?: base.`secondary`,
    `onSecondary` = color6 ?: defaults.lastOrNull { it.`onSecondary` != base.`onSecondary` }?.`onSecondary` ?: base.`onSecondary`,
    `secondaryContainer` = color7 ?: defaults.lastOrNull { it.`secondaryContainer` != base.`secondaryContainer` }?.`secondaryContainer` ?: base.`secondaryContainer`,
    `onSecondaryContainer` = color8 ?: defaults.lastOrNull { it.`onSecondaryContainer` != base.`onSecondaryContainer` }?.`onSecondaryContainer` ?: base.`onSecondaryContainer`,
    `tertiary` = color9 ?: defaults.lastOrNull { it.`tertiary` != base.`tertiary` }?.`tertiary` ?: base.`tertiary`,
    `onTertiary` = color10 ?: defaults.lastOrNull { it.`onTertiary` != base.`onTertiary` }?.`onTertiary` ?: base.`onTertiary`,
    `tertiaryContainer` = color11 ?: defaults.lastOrNull { it.`tertiaryContainer` != base.`tertiaryContainer` }?.`tertiaryContainer` ?: base.`tertiaryContainer`,
    `onTertiaryContainer` = color12 ?: defaults.lastOrNull { it.`onTertiaryContainer` != base.`onTertiaryContainer` }?.`onTertiaryContainer` ?: base.`onTertiaryContainer`,
    `background` = color13 ?: defaults.lastOrNull { it.`background` != base.`background` }?.`background` ?: base.`background`,
    `onBackground` = color14 ?: defaults.lastOrNull { it.`onBackground` != base.`onBackground` }?.`onBackground` ?: base.`onBackground`,
    `surface` = color15 ?: defaults.lastOrNull { it.`surface` != base.`surface` }?.`surface` ?: base.`surface`,
    `onSurface` = color16 ?: defaults.lastOrNull { it.`onSurface` != base.`onSurface` }?.`onSurface` ?: base.`onSurface`,
    `surfaceVariant` = color17 ?: defaults.lastOrNull { it.`surfaceVariant` != base.`surfaceVariant` }?.`surfaceVariant` ?: base.`surfaceVariant`,
    `onSurfaceVariant` = color18 ?: defaults.lastOrNull { it.`onSurfaceVariant` != base.`onSurfaceVariant` }?.`onSurfaceVariant` ?: base.`onSurfaceVariant`,
    `surfaceTint` = color19 ?: defaults.lastOrNull { it.`surfaceTint` != base.`surfaceTint` }?.`surfaceTint` ?: base.`surfaceTint`,
    `inverseSurface` = color20 ?: defaults.lastOrNull { it.`inverseSurface` != base.`inverseSurface` }?.`inverseSurface` ?: base.`inverseSurface`,
    `inverseOnSurface` = color21 ?: defaults.lastOrNull { it.`inverseOnSurface` != base.`inverseOnSurface` }?.`inverseOnSurface` ?: base.`inverseOnSurface`,
    `error` = color22 ?: defaults.lastOrNull { it.`error` != base.`error` }?.`error` ?: base.`error`,
    `onError` = color23 ?: defaults.lastOrNull { it.`onError` != base.`onError` }?.`onError` ?: base.`onError`,
    `errorContainer` = color24 ?: defaults.lastOrNull { it.`errorContainer` != base.`errorContainer` }?.`errorContainer` ?: base.`errorContainer`,
    `onErrorContainer` = color25 ?: defaults.lastOrNull { it.`onErrorContainer` != base.`onErrorContainer` }?.`onErrorContainer` ?: base.`onErrorContainer`,
    `outline` = color26 ?: defaults.lastOrNull { it.`outline` != base.`outline` }?.`outline` ?: base.`outline`,
    `outlineVariant` = color27 ?: defaults.lastOrNull { it.`outlineVariant` != base.`outlineVariant` }?.`outlineVariant` ?: base.`outlineVariant`,
    `scrim` = color28 ?: defaults.lastOrNull { it.`scrim` != base.`scrim` }?.`scrim` ?: base.`scrim`,
    `surfaceBright` = color29 ?: defaults.lastOrNull { it.`surfaceBright` != base.`surfaceBright` }?.`surfaceBright` ?: base.`surfaceBright`,
    `surfaceContainer` = color30 ?: defaults.lastOrNull { it.`surfaceContainer` != base.`surfaceContainer` }?.`surfaceContainer` ?: base.`surfaceContainer`,
    `surfaceContainerHigh` = color31 ?: defaults.lastOrNull { it.`surfaceContainerHigh` != base.`surfaceContainerHigh` }?.`surfaceContainerHigh` ?: base.`surfaceContainerHigh`,
    `surfaceContainerHighest` = color32 ?: defaults.lastOrNull { it.`surfaceContainerHighest` != base.`surfaceContainerHighest` }?.`surfaceContainerHighest` ?: base.`surfaceContainerHighest`,
    `surfaceContainerLow` = color33 ?: defaults.lastOrNull { it.`surfaceContainerLow` != base.`surfaceContainerLow` }?.`surfaceContainerLow` ?: base.`surfaceContainerLow`,
    `surfaceContainerLowest` = color34 ?: defaults.lastOrNull { it.`surfaceContainerLowest` != base.`surfaceContainerLowest` }?.`surfaceContainerLowest` ?: base.`surfaceContainerLowest`,
    `surfaceDim` = color35 ?: defaults.lastOrNull { it.`surfaceDim` != base.`surfaceDim` }?.`surfaceDim` ?: base.`surfaceDim`,
    `primaryFixed` = color36 ?: defaults.lastOrNull { it.`primaryFixed` != base.`primaryFixed` }?.`primaryFixed` ?: base.`primaryFixed`,
    `primaryFixedDim` = color37 ?: defaults.lastOrNull { it.`primaryFixedDim` != base.`primaryFixedDim` }?.`primaryFixedDim` ?: base.`primaryFixedDim`,
    `onPrimaryFixed` = color38 ?: defaults.lastOrNull { it.`onPrimaryFixed` != base.`onPrimaryFixed` }?.`onPrimaryFixed` ?: base.`onPrimaryFixed`,
    `onPrimaryFixedVariant` = color39 ?: defaults.lastOrNull { it.`onPrimaryFixedVariant` != base.`onPrimaryFixedVariant` }?.`onPrimaryFixedVariant` ?: base.`onPrimaryFixedVariant`,
    `secondaryFixed` = color40 ?: defaults.lastOrNull { it.`secondaryFixed` != base.`secondaryFixed` }?.`secondaryFixed` ?: base.`secondaryFixed`,
    `secondaryFixedDim` = color41 ?: defaults.lastOrNull { it.`secondaryFixedDim` != base.`secondaryFixedDim` }?.`secondaryFixedDim` ?: base.`secondaryFixedDim`,
    `onSecondaryFixed` = color42 ?: defaults.lastOrNull { it.`onSecondaryFixed` != base.`onSecondaryFixed` }?.`onSecondaryFixed` ?: base.`onSecondaryFixed`,
    `onSecondaryFixedVariant` = color43 ?: defaults.lastOrNull { it.`onSecondaryFixedVariant` != base.`onSecondaryFixedVariant` }?.`onSecondaryFixedVariant` ?: base.`onSecondaryFixedVariant`,
    `tertiaryFixed` = color44 ?: defaults.lastOrNull { it.`tertiaryFixed` != base.`tertiaryFixed` }?.`tertiaryFixed` ?: base.`tertiaryFixed`,
    `tertiaryFixedDim` = color45 ?: defaults.lastOrNull { it.`tertiaryFixedDim` != base.`tertiaryFixedDim` }?.`tertiaryFixedDim` ?: base.`tertiaryFixedDim`,
    `onTertiaryFixed` = color46 ?: defaults.lastOrNull { it.`onTertiaryFixed` != base.`onTertiaryFixed` }?.`onTertiaryFixed` ?: base.`onTertiaryFixed`,
    `onTertiaryFixedVariant` = color47 ?: defaults.lastOrNull { it.`onTertiaryFixedVariant` != base.`onTertiaryFixedVariant` }?.`onTertiaryFixedVariant` ?: base.`onTertiaryFixedVariant`,
  )
}

private fun decodeExpressiveLightColorScheme(): androidx.compose.material3.ColorScheme = androidx.compose.material3.expressiveLightColorScheme()

private fun decodeLightColorScheme(colors: JSONObject): androidx.compose.material3.ColorScheme {
  val base = androidx.compose.material3.lightColorScheme()
  val color0 = colors.colorOverride("primary")
  val color1 = colors.colorOverride("onPrimary")
  val color2 = colors.colorOverride("primaryContainer")
  val color3 = colors.colorOverride("onPrimaryContainer")
  val color4 = colors.colorOverride("inversePrimary")
  val color5 = colors.colorOverride("secondary")
  val color6 = colors.colorOverride("onSecondary")
  val color7 = colors.colorOverride("secondaryContainer")
  val color8 = colors.colorOverride("onSecondaryContainer")
  val color9 = colors.colorOverride("tertiary")
  val color10 = colors.colorOverride("onTertiary")
  val color11 = colors.colorOverride("tertiaryContainer")
  val color12 = colors.colorOverride("onTertiaryContainer")
  val color13 = colors.colorOverride("background")
  val color14 = colors.colorOverride("onBackground")
  val color15 = colors.colorOverride("surface")
  val color16 = colors.colorOverride("onSurface")
  val color17 = colors.colorOverride("surfaceVariant")
  val color18 = colors.colorOverride("onSurfaceVariant")
  val color19 = colors.colorOverride("surfaceTint")
  val color20 = colors.colorOverride("inverseSurface")
  val color21 = colors.colorOverride("inverseOnSurface")
  val color22 = colors.colorOverride("error")
  val color23 = colors.colorOverride("onError")
  val color24 = colors.colorOverride("errorContainer")
  val color25 = colors.colorOverride("onErrorContainer")
  val color26 = colors.colorOverride("outline")
  val color27 = colors.colorOverride("outlineVariant")
  val color28 = colors.colorOverride("scrim")
  val color29 = colors.colorOverride("surfaceBright")
  val color30 = colors.colorOverride("surfaceContainer")
  val color31 = colors.colorOverride("surfaceContainerHigh")
  val color32 = colors.colorOverride("surfaceContainerHighest")
  val color33 = colors.colorOverride("surfaceContainerLow")
  val color34 = colors.colorOverride("surfaceContainerLowest")
  val color35 = colors.colorOverride("surfaceDim")
  val color36 = colors.colorOverride("primaryFixed")
  val color37 = colors.colorOverride("primaryFixedDim")
  val color38 = colors.colorOverride("onPrimaryFixed")
  val color39 = colors.colorOverride("onPrimaryFixedVariant")
  val color40 = colors.colorOverride("secondaryFixed")
  val color41 = colors.colorOverride("secondaryFixedDim")
  val color42 = colors.colorOverride("onSecondaryFixed")
  val color43 = colors.colorOverride("onSecondaryFixedVariant")
  val color44 = colors.colorOverride("tertiaryFixed")
  val color45 = colors.colorOverride("tertiaryFixedDim")
  val color46 = colors.colorOverride("onTertiaryFixed")
  val color47 = colors.colorOverride("onTertiaryFixedVariant")
  // Let Kotlin supply defaults that depend on a color passed to the factory.
  val defaults = listOfNotNull(
    color0?.let { androidx.compose.material3.lightColorScheme(`primary` = it) },
    color1?.let { androidx.compose.material3.lightColorScheme(`onPrimary` = it) },
    color2?.let { androidx.compose.material3.lightColorScheme(`primaryContainer` = it) },
    color3?.let { androidx.compose.material3.lightColorScheme(`onPrimaryContainer` = it) },
    color4?.let { androidx.compose.material3.lightColorScheme(`inversePrimary` = it) },
    color5?.let { androidx.compose.material3.lightColorScheme(`secondary` = it) },
    color6?.let { androidx.compose.material3.lightColorScheme(`onSecondary` = it) },
    color7?.let { androidx.compose.material3.lightColorScheme(`secondaryContainer` = it) },
    color8?.let { androidx.compose.material3.lightColorScheme(`onSecondaryContainer` = it) },
    color9?.let { androidx.compose.material3.lightColorScheme(`tertiary` = it) },
    color10?.let { androidx.compose.material3.lightColorScheme(`onTertiary` = it) },
    color11?.let { androidx.compose.material3.lightColorScheme(`tertiaryContainer` = it) },
    color12?.let { androidx.compose.material3.lightColorScheme(`onTertiaryContainer` = it) },
    color13?.let { androidx.compose.material3.lightColorScheme(`background` = it) },
    color14?.let { androidx.compose.material3.lightColorScheme(`onBackground` = it) },
    color15?.let { androidx.compose.material3.lightColorScheme(`surface` = it) },
    color16?.let { androidx.compose.material3.lightColorScheme(`onSurface` = it) },
    color17?.let { androidx.compose.material3.lightColorScheme(`surfaceVariant` = it) },
    color18?.let { androidx.compose.material3.lightColorScheme(`onSurfaceVariant` = it) },
    color19?.let { androidx.compose.material3.lightColorScheme(`surfaceTint` = it) },
    color20?.let { androidx.compose.material3.lightColorScheme(`inverseSurface` = it) },
    color21?.let { androidx.compose.material3.lightColorScheme(`inverseOnSurface` = it) },
    color22?.let { androidx.compose.material3.lightColorScheme(`error` = it) },
    color23?.let { androidx.compose.material3.lightColorScheme(`onError` = it) },
    color24?.let { androidx.compose.material3.lightColorScheme(`errorContainer` = it) },
    color25?.let { androidx.compose.material3.lightColorScheme(`onErrorContainer` = it) },
    color26?.let { androidx.compose.material3.lightColorScheme(`outline` = it) },
    color27?.let { androidx.compose.material3.lightColorScheme(`outlineVariant` = it) },
    color28?.let { androidx.compose.material3.lightColorScheme(`scrim` = it) },
    color29?.let { androidx.compose.material3.lightColorScheme(`surfaceBright` = it) },
    color30?.let { androidx.compose.material3.lightColorScheme(`surfaceContainer` = it) },
    color31?.let { androidx.compose.material3.lightColorScheme(`surfaceContainerHigh` = it) },
    color32?.let { androidx.compose.material3.lightColorScheme(`surfaceContainerHighest` = it) },
    color33?.let { androidx.compose.material3.lightColorScheme(`surfaceContainerLow` = it) },
    color34?.let { androidx.compose.material3.lightColorScheme(`surfaceContainerLowest` = it) },
    color35?.let { androidx.compose.material3.lightColorScheme(`surfaceDim` = it) },
    color36?.let { androidx.compose.material3.lightColorScheme(`primaryFixed` = it) },
    color37?.let { androidx.compose.material3.lightColorScheme(`primaryFixedDim` = it) },
    color38?.let { androidx.compose.material3.lightColorScheme(`onPrimaryFixed` = it) },
    color39?.let { androidx.compose.material3.lightColorScheme(`onPrimaryFixedVariant` = it) },
    color40?.let { androidx.compose.material3.lightColorScheme(`secondaryFixed` = it) },
    color41?.let { androidx.compose.material3.lightColorScheme(`secondaryFixedDim` = it) },
    color42?.let { androidx.compose.material3.lightColorScheme(`onSecondaryFixed` = it) },
    color43?.let { androidx.compose.material3.lightColorScheme(`onSecondaryFixedVariant` = it) },
    color44?.let { androidx.compose.material3.lightColorScheme(`tertiaryFixed` = it) },
    color45?.let { androidx.compose.material3.lightColorScheme(`tertiaryFixedDim` = it) },
    color46?.let { androidx.compose.material3.lightColorScheme(`onTertiaryFixed` = it) },
    color47?.let { androidx.compose.material3.lightColorScheme(`onTertiaryFixedVariant` = it) },
  )
  if (defaults.isEmpty()) return base
  return base.copy(
    `primary` = color0 ?: defaults.lastOrNull { it.`primary` != base.`primary` }?.`primary` ?: base.`primary`,
    `onPrimary` = color1 ?: defaults.lastOrNull { it.`onPrimary` != base.`onPrimary` }?.`onPrimary` ?: base.`onPrimary`,
    `primaryContainer` = color2 ?: defaults.lastOrNull { it.`primaryContainer` != base.`primaryContainer` }?.`primaryContainer` ?: base.`primaryContainer`,
    `onPrimaryContainer` = color3 ?: defaults.lastOrNull { it.`onPrimaryContainer` != base.`onPrimaryContainer` }?.`onPrimaryContainer` ?: base.`onPrimaryContainer`,
    `inversePrimary` = color4 ?: defaults.lastOrNull { it.`inversePrimary` != base.`inversePrimary` }?.`inversePrimary` ?: base.`inversePrimary`,
    `secondary` = color5 ?: defaults.lastOrNull { it.`secondary` != base.`secondary` }?.`secondary` ?: base.`secondary`,
    `onSecondary` = color6 ?: defaults.lastOrNull { it.`onSecondary` != base.`onSecondary` }?.`onSecondary` ?: base.`onSecondary`,
    `secondaryContainer` = color7 ?: defaults.lastOrNull { it.`secondaryContainer` != base.`secondaryContainer` }?.`secondaryContainer` ?: base.`secondaryContainer`,
    `onSecondaryContainer` = color8 ?: defaults.lastOrNull { it.`onSecondaryContainer` != base.`onSecondaryContainer` }?.`onSecondaryContainer` ?: base.`onSecondaryContainer`,
    `tertiary` = color9 ?: defaults.lastOrNull { it.`tertiary` != base.`tertiary` }?.`tertiary` ?: base.`tertiary`,
    `onTertiary` = color10 ?: defaults.lastOrNull { it.`onTertiary` != base.`onTertiary` }?.`onTertiary` ?: base.`onTertiary`,
    `tertiaryContainer` = color11 ?: defaults.lastOrNull { it.`tertiaryContainer` != base.`tertiaryContainer` }?.`tertiaryContainer` ?: base.`tertiaryContainer`,
    `onTertiaryContainer` = color12 ?: defaults.lastOrNull { it.`onTertiaryContainer` != base.`onTertiaryContainer` }?.`onTertiaryContainer` ?: base.`onTertiaryContainer`,
    `background` = color13 ?: defaults.lastOrNull { it.`background` != base.`background` }?.`background` ?: base.`background`,
    `onBackground` = color14 ?: defaults.lastOrNull { it.`onBackground` != base.`onBackground` }?.`onBackground` ?: base.`onBackground`,
    `surface` = color15 ?: defaults.lastOrNull { it.`surface` != base.`surface` }?.`surface` ?: base.`surface`,
    `onSurface` = color16 ?: defaults.lastOrNull { it.`onSurface` != base.`onSurface` }?.`onSurface` ?: base.`onSurface`,
    `surfaceVariant` = color17 ?: defaults.lastOrNull { it.`surfaceVariant` != base.`surfaceVariant` }?.`surfaceVariant` ?: base.`surfaceVariant`,
    `onSurfaceVariant` = color18 ?: defaults.lastOrNull { it.`onSurfaceVariant` != base.`onSurfaceVariant` }?.`onSurfaceVariant` ?: base.`onSurfaceVariant`,
    `surfaceTint` = color19 ?: defaults.lastOrNull { it.`surfaceTint` != base.`surfaceTint` }?.`surfaceTint` ?: base.`surfaceTint`,
    `inverseSurface` = color20 ?: defaults.lastOrNull { it.`inverseSurface` != base.`inverseSurface` }?.`inverseSurface` ?: base.`inverseSurface`,
    `inverseOnSurface` = color21 ?: defaults.lastOrNull { it.`inverseOnSurface` != base.`inverseOnSurface` }?.`inverseOnSurface` ?: base.`inverseOnSurface`,
    `error` = color22 ?: defaults.lastOrNull { it.`error` != base.`error` }?.`error` ?: base.`error`,
    `onError` = color23 ?: defaults.lastOrNull { it.`onError` != base.`onError` }?.`onError` ?: base.`onError`,
    `errorContainer` = color24 ?: defaults.lastOrNull { it.`errorContainer` != base.`errorContainer` }?.`errorContainer` ?: base.`errorContainer`,
    `onErrorContainer` = color25 ?: defaults.lastOrNull { it.`onErrorContainer` != base.`onErrorContainer` }?.`onErrorContainer` ?: base.`onErrorContainer`,
    `outline` = color26 ?: defaults.lastOrNull { it.`outline` != base.`outline` }?.`outline` ?: base.`outline`,
    `outlineVariant` = color27 ?: defaults.lastOrNull { it.`outlineVariant` != base.`outlineVariant` }?.`outlineVariant` ?: base.`outlineVariant`,
    `scrim` = color28 ?: defaults.lastOrNull { it.`scrim` != base.`scrim` }?.`scrim` ?: base.`scrim`,
    `surfaceBright` = color29 ?: defaults.lastOrNull { it.`surfaceBright` != base.`surfaceBright` }?.`surfaceBright` ?: base.`surfaceBright`,
    `surfaceContainer` = color30 ?: defaults.lastOrNull { it.`surfaceContainer` != base.`surfaceContainer` }?.`surfaceContainer` ?: base.`surfaceContainer`,
    `surfaceContainerHigh` = color31 ?: defaults.lastOrNull { it.`surfaceContainerHigh` != base.`surfaceContainerHigh` }?.`surfaceContainerHigh` ?: base.`surfaceContainerHigh`,
    `surfaceContainerHighest` = color32 ?: defaults.lastOrNull { it.`surfaceContainerHighest` != base.`surfaceContainerHighest` }?.`surfaceContainerHighest` ?: base.`surfaceContainerHighest`,
    `surfaceContainerLow` = color33 ?: defaults.lastOrNull { it.`surfaceContainerLow` != base.`surfaceContainerLow` }?.`surfaceContainerLow` ?: base.`surfaceContainerLow`,
    `surfaceContainerLowest` = color34 ?: defaults.lastOrNull { it.`surfaceContainerLowest` != base.`surfaceContainerLowest` }?.`surfaceContainerLowest` ?: base.`surfaceContainerLowest`,
    `surfaceDim` = color35 ?: defaults.lastOrNull { it.`surfaceDim` != base.`surfaceDim` }?.`surfaceDim` ?: base.`surfaceDim`,
    `primaryFixed` = color36 ?: defaults.lastOrNull { it.`primaryFixed` != base.`primaryFixed` }?.`primaryFixed` ?: base.`primaryFixed`,
    `primaryFixedDim` = color37 ?: defaults.lastOrNull { it.`primaryFixedDim` != base.`primaryFixedDim` }?.`primaryFixedDim` ?: base.`primaryFixedDim`,
    `onPrimaryFixed` = color38 ?: defaults.lastOrNull { it.`onPrimaryFixed` != base.`onPrimaryFixed` }?.`onPrimaryFixed` ?: base.`onPrimaryFixed`,
    `onPrimaryFixedVariant` = color39 ?: defaults.lastOrNull { it.`onPrimaryFixedVariant` != base.`onPrimaryFixedVariant` }?.`onPrimaryFixedVariant` ?: base.`onPrimaryFixedVariant`,
    `secondaryFixed` = color40 ?: defaults.lastOrNull { it.`secondaryFixed` != base.`secondaryFixed` }?.`secondaryFixed` ?: base.`secondaryFixed`,
    `secondaryFixedDim` = color41 ?: defaults.lastOrNull { it.`secondaryFixedDim` != base.`secondaryFixedDim` }?.`secondaryFixedDim` ?: base.`secondaryFixedDim`,
    `onSecondaryFixed` = color42 ?: defaults.lastOrNull { it.`onSecondaryFixed` != base.`onSecondaryFixed` }?.`onSecondaryFixed` ?: base.`onSecondaryFixed`,
    `onSecondaryFixedVariant` = color43 ?: defaults.lastOrNull { it.`onSecondaryFixedVariant` != base.`onSecondaryFixedVariant` }?.`onSecondaryFixedVariant` ?: base.`onSecondaryFixedVariant`,
    `tertiaryFixed` = color44 ?: defaults.lastOrNull { it.`tertiaryFixed` != base.`tertiaryFixed` }?.`tertiaryFixed` ?: base.`tertiaryFixed`,
    `tertiaryFixedDim` = color45 ?: defaults.lastOrNull { it.`tertiaryFixedDim` != base.`tertiaryFixedDim` }?.`tertiaryFixedDim` ?: base.`tertiaryFixedDim`,
    `onTertiaryFixed` = color46 ?: defaults.lastOrNull { it.`onTertiaryFixed` != base.`onTertiaryFixed` }?.`onTertiaryFixed` ?: base.`onTertiaryFixed`,
    `onTertiaryFixedVariant` = color47 ?: defaults.lastOrNull { it.`onTertiaryFixedVariant` != base.`onTertiaryFixedVariant` }?.`onTertiaryFixedVariant` ?: base.`onTertiaryFixedVariant`,
  )
}

private fun JSONObject.colorOverride(role: String): Color? =
  (opt(role) as? String)?.let(::parseComposeColor)?.takeUnless { it == Color.Unspecified }
