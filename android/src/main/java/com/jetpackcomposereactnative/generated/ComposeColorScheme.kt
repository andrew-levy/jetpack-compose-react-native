package com.jetpackcomposereactnative.generated

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color
import com.jetpackcomposereactnative.common.parseComposeColor
import org.json.JSONObject

internal fun JSONObject.toColorScheme(): ColorScheme {
  val base = when (val palette = getString("palette")) {
    "light" -> lightColorScheme()
    "dark" -> darkColorScheme()
    else -> error("Unknown Material color palette: " + palette)
  }
  val colors = getJSONObject("colors")
  val primary = colors.color("primary", base.primary)
  return base.copy(
    primary = primary,
    onPrimary = colors.color("onPrimary", base.onPrimary),
    primaryContainer = colors.color("primaryContainer", base.primaryContainer),
    onPrimaryContainer = colors.color("onPrimaryContainer", base.onPrimaryContainer),
    inversePrimary = colors.color("inversePrimary", base.inversePrimary),
    secondary = colors.color("secondary", base.secondary),
    onSecondary = colors.color("onSecondary", base.onSecondary),
    secondaryContainer = colors.color("secondaryContainer", base.secondaryContainer),
    onSecondaryContainer = colors.color("onSecondaryContainer", base.onSecondaryContainer),
    tertiary = colors.color("tertiary", base.tertiary),
    onTertiary = colors.color("onTertiary", base.onTertiary),
    tertiaryContainer = colors.color("tertiaryContainer", base.tertiaryContainer),
    onTertiaryContainer = colors.color("onTertiaryContainer", base.onTertiaryContainer),
    background = colors.color("background", base.background),
    onBackground = colors.color("onBackground", base.onBackground),
    surface = colors.color("surface", base.surface),
    onSurface = colors.color("onSurface", base.onSurface),
    surfaceVariant = colors.color("surfaceVariant", base.surfaceVariant),
    onSurfaceVariant = colors.color("onSurfaceVariant", base.onSurfaceVariant),
    surfaceTint = colors.color("surfaceTint", primary),
    inverseSurface = colors.color("inverseSurface", base.inverseSurface),
    inverseOnSurface = colors.color("inverseOnSurface", base.inverseOnSurface),
    error = colors.color("error", base.error),
    onError = colors.color("onError", base.onError),
    errorContainer = colors.color("errorContainer", base.errorContainer),
    onErrorContainer = colors.color("onErrorContainer", base.onErrorContainer),
    outline = colors.color("outline", base.outline),
    outlineVariant = colors.color("outlineVariant", base.outlineVariant),
    scrim = colors.color("scrim", base.scrim),
    surfaceBright = colors.color("surfaceBright", base.surfaceBright),
    surfaceContainer = colors.color("surfaceContainer", base.surfaceContainer),
    surfaceContainerHigh = colors.color("surfaceContainerHigh", base.surfaceContainerHigh),
    surfaceContainerHighest = colors.color("surfaceContainerHighest", base.surfaceContainerHighest),
    surfaceContainerLow = colors.color("surfaceContainerLow", base.surfaceContainerLow),
    surfaceContainerLowest = colors.color("surfaceContainerLowest", base.surfaceContainerLowest),
    surfaceDim = colors.color("surfaceDim", base.surfaceDim),
  )
}

private fun JSONObject.color(role: String, fallback: Color): Color =
  (opt(role) as? String)?.let(::parseComposeColor)?.takeUnless { it == Color.Unspecified } ?: fallback
