// Generated from Compose value factories by generate.mjs.
@file:OptIn(androidx.compose.foundation.style.ExperimentalFoundationStyleApi::class, androidx.compose.material3.ExperimentalMaterial3Api::class, androidx.compose.material3.adaptive.ExperimentalMaterial3AdaptiveApi::class)

package com.jetpackcomposereactnative.generated

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jetpackcomposereactnative.common.parseComposeColor
import org.json.JSONObject

internal fun JSONObject.decodeComposeSharedTransitionScopeOverlayClipValue(scope: androidx.compose.animation.SharedTransitionScope): androidx.compose.animation.SharedTransitionScope.OverlayClip = when (val factory = getString("factory")) {
  "OverlayClip" -> decodeComposeSharedTransitionScopeOverlayClipValueFactory0(scope)
  else -> error("Unknown ComposeSharedTransitionScopeOverlayClipValue factory: " + factory)
}

private fun JSONObject.decodeComposeSharedTransitionScopeOverlayClipValueFactory0(scope: androidx.compose.animation.SharedTransitionScope): androidx.compose.animation.SharedTransitionScope.OverlayClip = with(scope) { OverlayClip(
  `clipShape` = composeShape("clipShape"),
) }

internal fun JSONObject.decodeComposeMarqueeSpacingValue(): androidx.compose.foundation.MarqueeSpacing = androidx.compose.foundation.MarqueeSpacing(
  `spacing` = getDouble("spacing").dp,
)

internal fun JSONObject.decodeComposeLazyLayoutCacheWindowValue(): androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow = when (val factory = getString("factory")) {
  "LazyLayoutCacheWindow" -> when { has("ahead") || has("behind") -> decodeComposeLazyLayoutCacheWindowValueFactory0(); has("aheadFraction") || has("behindFraction") -> decodeComposeLazyLayoutCacheWindowValueFactory1(); else -> error("No LazyLayoutCacheWindow overload accepts these fields") }
  else -> error("Unknown ComposeLazyLayoutCacheWindowValue factory: " + factory)
}

private fun JSONObject.decodeComposeLazyLayoutCacheWindowValueFactory0(): androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow = when ((if (has("ahead")) 1 else 0) + (if (has("behind")) 2 else 0) + (if (has("isNonScrollCachingEnabled")) 4 else 0)) {
  1 -> androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow(`ahead` = getDouble("ahead").dp)
  2 -> androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow(`behind` = getDouble("behind").dp)
  3 -> androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow(`ahead` = getDouble("ahead").dp, `behind` = getDouble("behind").dp)
  5 -> androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow(`ahead` = getDouble("ahead").dp, `isNonScrollCachingEnabled` = getBoolean("isNonScrollCachingEnabled"))
  6 -> androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow(`behind` = getDouble("behind").dp, `isNonScrollCachingEnabled` = getBoolean("isNonScrollCachingEnabled"))
  7 -> androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow(`ahead` = getDouble("ahead").dp, `behind` = getDouble("behind").dp, `isNonScrollCachingEnabled` = getBoolean("isNonScrollCachingEnabled"))
  else -> error("Invalid generated arguments for androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow")
}

private fun JSONObject.decodeComposeLazyLayoutCacheWindowValueFactory1(): androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow = when ((if (has("aheadFraction")) 1 else 0) + (if (has("behindFraction")) 2 else 0) + (if (has("isNonScrollCachingEnabled")) 4 else 0)) {
  1 -> androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow(`aheadFraction` = getDouble("aheadFraction").toFloat())
  2 -> androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow(`behindFraction` = getDouble("behindFraction").toFloat())
  3 -> androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow(`aheadFraction` = getDouble("aheadFraction").toFloat(), `behindFraction` = getDouble("behindFraction").toFloat())
  5 -> androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow(`aheadFraction` = getDouble("aheadFraction").toFloat(), `isNonScrollCachingEnabled` = getBoolean("isNonScrollCachingEnabled"))
  6 -> androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow(`behindFraction` = getDouble("behindFraction").toFloat(), `isNonScrollCachingEnabled` = getBoolean("isNonScrollCachingEnabled"))
  7 -> androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow(`aheadFraction` = getDouble("aheadFraction").toFloat(), `behindFraction` = getDouble("behindFraction").toFloat(), `isNonScrollCachingEnabled` = getBoolean("isNonScrollCachingEnabled"))
  else -> error("Invalid generated arguments for androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow")
}

internal fun JSONObject.decodeComposeCornerBasedShapeValue(): androidx.compose.foundation.shape.CornerBasedShape = when (val factory = getString("factory")) {
  "AbsoluteCutCornerShape" -> when { has("corner") -> decodeComposeCornerBasedShapeValueFactory0(); has("size") -> decodeComposeCornerBasedShapeValueFactory1(); has("percent") -> decodeComposeCornerBasedShapeValueFactory2(); has("topLeft") || has("topRight") || has("bottomRight") || has("bottomLeft") -> decodeComposeCornerBasedShapeValueFactory3(); has("topLeftPercent") || has("topRightPercent") || has("bottomRightPercent") || has("bottomLeftPercent") -> decodeComposeCornerBasedShapeValueFactory4(); else -> error("No AbsoluteCutCornerShape overload accepts these fields") }
  "AbsoluteRoundedCornerShape" -> when { has("corner") -> decodeComposeCornerBasedShapeValueFactory5(); has("size") -> decodeComposeCornerBasedShapeValueFactory6(); has("percent") -> decodeComposeCornerBasedShapeValueFactory7(); has("topLeft") || has("topRight") || has("bottomRight") || has("bottomLeft") -> decodeComposeCornerBasedShapeValueFactory8(); has("topLeftPercent") || has("topRightPercent") || has("bottomRightPercent") || has("bottomLeftPercent") -> decodeComposeCornerBasedShapeValueFactory9(); else -> error("No AbsoluteRoundedCornerShape overload accepts these fields") }
  "CutCornerShape" -> when { has("corner") -> decodeComposeCornerBasedShapeValueFactory10(); has("size") -> decodeComposeCornerBasedShapeValueFactory11(); has("percent") -> decodeComposeCornerBasedShapeValueFactory12(); has("topStart") || has("topEnd") || has("bottomEnd") || has("bottomStart") -> decodeComposeCornerBasedShapeValueFactory13(); has("topStartPercent") || has("topEndPercent") || has("bottomEndPercent") || has("bottomStartPercent") -> decodeComposeCornerBasedShapeValueFactory14(); else -> error("No CutCornerShape overload accepts these fields") }
  "RoundedCornerShape" -> when { has("corner") -> decodeComposeCornerBasedShapeValueFactory15(); has("size") -> decodeComposeCornerBasedShapeValueFactory16(); has("percent") -> decodeComposeCornerBasedShapeValueFactory17(); has("topStart") || has("topEnd") || has("bottomEnd") || has("bottomStart") -> decodeComposeCornerBasedShapeValueFactory18(); has("topStartPercent") || has("topEndPercent") || has("bottomEndPercent") || has("bottomStartPercent") -> decodeComposeCornerBasedShapeValueFactory19(); else -> error("No RoundedCornerShape overload accepts these fields") }
  else -> error("Unknown ComposeCornerBasedShapeValue factory: " + factory)
}

private fun JSONObject.decodeComposeCornerBasedShapeValueFactory0(): androidx.compose.foundation.shape.CornerBasedShape = androidx.compose.foundation.shape.AbsoluteCutCornerShape(
  `corner` = getJSONObject("corner").decodeComposeCornerSizeValue(),
)

private fun JSONObject.decodeComposeCornerBasedShapeValueFactory1(): androidx.compose.foundation.shape.CornerBasedShape = androidx.compose.foundation.shape.AbsoluteCutCornerShape(
  `size` = getDouble("size").dp,
)

private fun JSONObject.decodeComposeCornerBasedShapeValueFactory2(): androidx.compose.foundation.shape.CornerBasedShape = androidx.compose.foundation.shape.AbsoluteCutCornerShape(
  `percent` = getInt("percent"),
)

private fun JSONObject.decodeComposeCornerBasedShapeValueFactory3(): androidx.compose.foundation.shape.CornerBasedShape = when ((if (has("topLeft")) 1 else 0) + (if (has("topRight")) 2 else 0) + (if (has("bottomRight")) 4 else 0) + (if (has("bottomLeft")) 8 else 0)) {
  1 -> androidx.compose.foundation.shape.AbsoluteCutCornerShape(`topLeft` = getDouble("topLeft").dp)
  2 -> androidx.compose.foundation.shape.AbsoluteCutCornerShape(`topRight` = getDouble("topRight").dp)
  3 -> androidx.compose.foundation.shape.AbsoluteCutCornerShape(`topLeft` = getDouble("topLeft").dp, `topRight` = getDouble("topRight").dp)
  4 -> androidx.compose.foundation.shape.AbsoluteCutCornerShape(`bottomRight` = getDouble("bottomRight").dp)
  5 -> androidx.compose.foundation.shape.AbsoluteCutCornerShape(`topLeft` = getDouble("topLeft").dp, `bottomRight` = getDouble("bottomRight").dp)
  6 -> androidx.compose.foundation.shape.AbsoluteCutCornerShape(`topRight` = getDouble("topRight").dp, `bottomRight` = getDouble("bottomRight").dp)
  7 -> androidx.compose.foundation.shape.AbsoluteCutCornerShape(`topLeft` = getDouble("topLeft").dp, `topRight` = getDouble("topRight").dp, `bottomRight` = getDouble("bottomRight").dp)
  8 -> androidx.compose.foundation.shape.AbsoluteCutCornerShape(`bottomLeft` = getDouble("bottomLeft").dp)
  9 -> androidx.compose.foundation.shape.AbsoluteCutCornerShape(`topLeft` = getDouble("topLeft").dp, `bottomLeft` = getDouble("bottomLeft").dp)
  10 -> androidx.compose.foundation.shape.AbsoluteCutCornerShape(`topRight` = getDouble("topRight").dp, `bottomLeft` = getDouble("bottomLeft").dp)
  11 -> androidx.compose.foundation.shape.AbsoluteCutCornerShape(`topLeft` = getDouble("topLeft").dp, `topRight` = getDouble("topRight").dp, `bottomLeft` = getDouble("bottomLeft").dp)
  12 -> androidx.compose.foundation.shape.AbsoluteCutCornerShape(`bottomRight` = getDouble("bottomRight").dp, `bottomLeft` = getDouble("bottomLeft").dp)
  13 -> androidx.compose.foundation.shape.AbsoluteCutCornerShape(`topLeft` = getDouble("topLeft").dp, `bottomRight` = getDouble("bottomRight").dp, `bottomLeft` = getDouble("bottomLeft").dp)
  14 -> androidx.compose.foundation.shape.AbsoluteCutCornerShape(`topRight` = getDouble("topRight").dp, `bottomRight` = getDouble("bottomRight").dp, `bottomLeft` = getDouble("bottomLeft").dp)
  15 -> androidx.compose.foundation.shape.AbsoluteCutCornerShape(`topLeft` = getDouble("topLeft").dp, `topRight` = getDouble("topRight").dp, `bottomRight` = getDouble("bottomRight").dp, `bottomLeft` = getDouble("bottomLeft").dp)
  else -> error("Invalid generated arguments for androidx.compose.foundation.shape.AbsoluteCutCornerShape")
}

private fun JSONObject.decodeComposeCornerBasedShapeValueFactory4(): androidx.compose.foundation.shape.CornerBasedShape = when ((if (has("topLeftPercent")) 1 else 0) + (if (has("topRightPercent")) 2 else 0) + (if (has("bottomRightPercent")) 4 else 0) + (if (has("bottomLeftPercent")) 8 else 0)) {
  1 -> androidx.compose.foundation.shape.AbsoluteCutCornerShape(`topLeftPercent` = getInt("topLeftPercent"))
  2 -> androidx.compose.foundation.shape.AbsoluteCutCornerShape(`topRightPercent` = getInt("topRightPercent"))
  3 -> androidx.compose.foundation.shape.AbsoluteCutCornerShape(`topLeftPercent` = getInt("topLeftPercent"), `topRightPercent` = getInt("topRightPercent"))
  4 -> androidx.compose.foundation.shape.AbsoluteCutCornerShape(`bottomRightPercent` = getInt("bottomRightPercent"))
  5 -> androidx.compose.foundation.shape.AbsoluteCutCornerShape(`topLeftPercent` = getInt("topLeftPercent"), `bottomRightPercent` = getInt("bottomRightPercent"))
  6 -> androidx.compose.foundation.shape.AbsoluteCutCornerShape(`topRightPercent` = getInt("topRightPercent"), `bottomRightPercent` = getInt("bottomRightPercent"))
  7 -> androidx.compose.foundation.shape.AbsoluteCutCornerShape(`topLeftPercent` = getInt("topLeftPercent"), `topRightPercent` = getInt("topRightPercent"), `bottomRightPercent` = getInt("bottomRightPercent"))
  8 -> androidx.compose.foundation.shape.AbsoluteCutCornerShape(`bottomLeftPercent` = getInt("bottomLeftPercent"))
  9 -> androidx.compose.foundation.shape.AbsoluteCutCornerShape(`topLeftPercent` = getInt("topLeftPercent"), `bottomLeftPercent` = getInt("bottomLeftPercent"))
  10 -> androidx.compose.foundation.shape.AbsoluteCutCornerShape(`topRightPercent` = getInt("topRightPercent"), `bottomLeftPercent` = getInt("bottomLeftPercent"))
  11 -> androidx.compose.foundation.shape.AbsoluteCutCornerShape(`topLeftPercent` = getInt("topLeftPercent"), `topRightPercent` = getInt("topRightPercent"), `bottomLeftPercent` = getInt("bottomLeftPercent"))
  12 -> androidx.compose.foundation.shape.AbsoluteCutCornerShape(`bottomRightPercent` = getInt("bottomRightPercent"), `bottomLeftPercent` = getInt("bottomLeftPercent"))
  13 -> androidx.compose.foundation.shape.AbsoluteCutCornerShape(`topLeftPercent` = getInt("topLeftPercent"), `bottomRightPercent` = getInt("bottomRightPercent"), `bottomLeftPercent` = getInt("bottomLeftPercent"))
  14 -> androidx.compose.foundation.shape.AbsoluteCutCornerShape(`topRightPercent` = getInt("topRightPercent"), `bottomRightPercent` = getInt("bottomRightPercent"), `bottomLeftPercent` = getInt("bottomLeftPercent"))
  15 -> androidx.compose.foundation.shape.AbsoluteCutCornerShape(`topLeftPercent` = getInt("topLeftPercent"), `topRightPercent` = getInt("topRightPercent"), `bottomRightPercent` = getInt("bottomRightPercent"), `bottomLeftPercent` = getInt("bottomLeftPercent"))
  else -> error("Invalid generated arguments for androidx.compose.foundation.shape.AbsoluteCutCornerShape")
}

private fun JSONObject.decodeComposeCornerBasedShapeValueFactory5(): androidx.compose.foundation.shape.CornerBasedShape = androidx.compose.foundation.shape.AbsoluteRoundedCornerShape(
  `corner` = getJSONObject("corner").decodeComposeCornerSizeValue(),
)

private fun JSONObject.decodeComposeCornerBasedShapeValueFactory6(): androidx.compose.foundation.shape.CornerBasedShape = androidx.compose.foundation.shape.AbsoluteRoundedCornerShape(
  `size` = getDouble("size").dp,
)

private fun JSONObject.decodeComposeCornerBasedShapeValueFactory7(): androidx.compose.foundation.shape.CornerBasedShape = androidx.compose.foundation.shape.AbsoluteRoundedCornerShape(
  `percent` = getInt("percent"),
)

private fun JSONObject.decodeComposeCornerBasedShapeValueFactory8(): androidx.compose.foundation.shape.CornerBasedShape = when ((if (has("topLeft")) 1 else 0) + (if (has("topRight")) 2 else 0) + (if (has("bottomRight")) 4 else 0) + (if (has("bottomLeft")) 8 else 0)) {
  1 -> androidx.compose.foundation.shape.AbsoluteRoundedCornerShape(`topLeft` = getDouble("topLeft").dp)
  2 -> androidx.compose.foundation.shape.AbsoluteRoundedCornerShape(`topRight` = getDouble("topRight").dp)
  3 -> androidx.compose.foundation.shape.AbsoluteRoundedCornerShape(`topLeft` = getDouble("topLeft").dp, `topRight` = getDouble("topRight").dp)
  4 -> androidx.compose.foundation.shape.AbsoluteRoundedCornerShape(`bottomRight` = getDouble("bottomRight").dp)
  5 -> androidx.compose.foundation.shape.AbsoluteRoundedCornerShape(`topLeft` = getDouble("topLeft").dp, `bottomRight` = getDouble("bottomRight").dp)
  6 -> androidx.compose.foundation.shape.AbsoluteRoundedCornerShape(`topRight` = getDouble("topRight").dp, `bottomRight` = getDouble("bottomRight").dp)
  7 -> androidx.compose.foundation.shape.AbsoluteRoundedCornerShape(`topLeft` = getDouble("topLeft").dp, `topRight` = getDouble("topRight").dp, `bottomRight` = getDouble("bottomRight").dp)
  8 -> androidx.compose.foundation.shape.AbsoluteRoundedCornerShape(`bottomLeft` = getDouble("bottomLeft").dp)
  9 -> androidx.compose.foundation.shape.AbsoluteRoundedCornerShape(`topLeft` = getDouble("topLeft").dp, `bottomLeft` = getDouble("bottomLeft").dp)
  10 -> androidx.compose.foundation.shape.AbsoluteRoundedCornerShape(`topRight` = getDouble("topRight").dp, `bottomLeft` = getDouble("bottomLeft").dp)
  11 -> androidx.compose.foundation.shape.AbsoluteRoundedCornerShape(`topLeft` = getDouble("topLeft").dp, `topRight` = getDouble("topRight").dp, `bottomLeft` = getDouble("bottomLeft").dp)
  12 -> androidx.compose.foundation.shape.AbsoluteRoundedCornerShape(`bottomRight` = getDouble("bottomRight").dp, `bottomLeft` = getDouble("bottomLeft").dp)
  13 -> androidx.compose.foundation.shape.AbsoluteRoundedCornerShape(`topLeft` = getDouble("topLeft").dp, `bottomRight` = getDouble("bottomRight").dp, `bottomLeft` = getDouble("bottomLeft").dp)
  14 -> androidx.compose.foundation.shape.AbsoluteRoundedCornerShape(`topRight` = getDouble("topRight").dp, `bottomRight` = getDouble("bottomRight").dp, `bottomLeft` = getDouble("bottomLeft").dp)
  15 -> androidx.compose.foundation.shape.AbsoluteRoundedCornerShape(`topLeft` = getDouble("topLeft").dp, `topRight` = getDouble("topRight").dp, `bottomRight` = getDouble("bottomRight").dp, `bottomLeft` = getDouble("bottomLeft").dp)
  else -> error("Invalid generated arguments for androidx.compose.foundation.shape.AbsoluteRoundedCornerShape")
}

private fun JSONObject.decodeComposeCornerBasedShapeValueFactory9(): androidx.compose.foundation.shape.CornerBasedShape = when ((if (has("topLeftPercent")) 1 else 0) + (if (has("topRightPercent")) 2 else 0) + (if (has("bottomRightPercent")) 4 else 0) + (if (has("bottomLeftPercent")) 8 else 0)) {
  1 -> androidx.compose.foundation.shape.AbsoluteRoundedCornerShape(`topLeftPercent` = getInt("topLeftPercent"))
  2 -> androidx.compose.foundation.shape.AbsoluteRoundedCornerShape(`topRightPercent` = getInt("topRightPercent"))
  3 -> androidx.compose.foundation.shape.AbsoluteRoundedCornerShape(`topLeftPercent` = getInt("topLeftPercent"), `topRightPercent` = getInt("topRightPercent"))
  4 -> androidx.compose.foundation.shape.AbsoluteRoundedCornerShape(`bottomRightPercent` = getInt("bottomRightPercent"))
  5 -> androidx.compose.foundation.shape.AbsoluteRoundedCornerShape(`topLeftPercent` = getInt("topLeftPercent"), `bottomRightPercent` = getInt("bottomRightPercent"))
  6 -> androidx.compose.foundation.shape.AbsoluteRoundedCornerShape(`topRightPercent` = getInt("topRightPercent"), `bottomRightPercent` = getInt("bottomRightPercent"))
  7 -> androidx.compose.foundation.shape.AbsoluteRoundedCornerShape(`topLeftPercent` = getInt("topLeftPercent"), `topRightPercent` = getInt("topRightPercent"), `bottomRightPercent` = getInt("bottomRightPercent"))
  8 -> androidx.compose.foundation.shape.AbsoluteRoundedCornerShape(`bottomLeftPercent` = getInt("bottomLeftPercent"))
  9 -> androidx.compose.foundation.shape.AbsoluteRoundedCornerShape(`topLeftPercent` = getInt("topLeftPercent"), `bottomLeftPercent` = getInt("bottomLeftPercent"))
  10 -> androidx.compose.foundation.shape.AbsoluteRoundedCornerShape(`topRightPercent` = getInt("topRightPercent"), `bottomLeftPercent` = getInt("bottomLeftPercent"))
  11 -> androidx.compose.foundation.shape.AbsoluteRoundedCornerShape(`topLeftPercent` = getInt("topLeftPercent"), `topRightPercent` = getInt("topRightPercent"), `bottomLeftPercent` = getInt("bottomLeftPercent"))
  12 -> androidx.compose.foundation.shape.AbsoluteRoundedCornerShape(`bottomRightPercent` = getInt("bottomRightPercent"), `bottomLeftPercent` = getInt("bottomLeftPercent"))
  13 -> androidx.compose.foundation.shape.AbsoluteRoundedCornerShape(`topLeftPercent` = getInt("topLeftPercent"), `bottomRightPercent` = getInt("bottomRightPercent"), `bottomLeftPercent` = getInt("bottomLeftPercent"))
  14 -> androidx.compose.foundation.shape.AbsoluteRoundedCornerShape(`topRightPercent` = getInt("topRightPercent"), `bottomRightPercent` = getInt("bottomRightPercent"), `bottomLeftPercent` = getInt("bottomLeftPercent"))
  15 -> androidx.compose.foundation.shape.AbsoluteRoundedCornerShape(`topLeftPercent` = getInt("topLeftPercent"), `topRightPercent` = getInt("topRightPercent"), `bottomRightPercent` = getInt("bottomRightPercent"), `bottomLeftPercent` = getInt("bottomLeftPercent"))
  else -> error("Invalid generated arguments for androidx.compose.foundation.shape.AbsoluteRoundedCornerShape")
}

private fun JSONObject.decodeComposeCornerBasedShapeValueFactory10(): androidx.compose.foundation.shape.CornerBasedShape = androidx.compose.foundation.shape.CutCornerShape(
  `corner` = getJSONObject("corner").decodeComposeCornerSizeValue(),
)

private fun JSONObject.decodeComposeCornerBasedShapeValueFactory11(): androidx.compose.foundation.shape.CornerBasedShape = androidx.compose.foundation.shape.CutCornerShape(
  `size` = getDouble("size").dp,
)

private fun JSONObject.decodeComposeCornerBasedShapeValueFactory12(): androidx.compose.foundation.shape.CornerBasedShape = androidx.compose.foundation.shape.CutCornerShape(
  `percent` = getInt("percent"),
)

private fun JSONObject.decodeComposeCornerBasedShapeValueFactory13(): androidx.compose.foundation.shape.CornerBasedShape = when ((if (has("topStart")) 1 else 0) + (if (has("topEnd")) 2 else 0) + (if (has("bottomEnd")) 4 else 0) + (if (has("bottomStart")) 8 else 0)) {
  1 -> androidx.compose.foundation.shape.CutCornerShape(`topStart` = getDouble("topStart").dp)
  2 -> androidx.compose.foundation.shape.CutCornerShape(`topEnd` = getDouble("topEnd").dp)
  3 -> androidx.compose.foundation.shape.CutCornerShape(`topStart` = getDouble("topStart").dp, `topEnd` = getDouble("topEnd").dp)
  4 -> androidx.compose.foundation.shape.CutCornerShape(`bottomEnd` = getDouble("bottomEnd").dp)
  5 -> androidx.compose.foundation.shape.CutCornerShape(`topStart` = getDouble("topStart").dp, `bottomEnd` = getDouble("bottomEnd").dp)
  6 -> androidx.compose.foundation.shape.CutCornerShape(`topEnd` = getDouble("topEnd").dp, `bottomEnd` = getDouble("bottomEnd").dp)
  7 -> androidx.compose.foundation.shape.CutCornerShape(`topStart` = getDouble("topStart").dp, `topEnd` = getDouble("topEnd").dp, `bottomEnd` = getDouble("bottomEnd").dp)
  8 -> androidx.compose.foundation.shape.CutCornerShape(`bottomStart` = getDouble("bottomStart").dp)
  9 -> androidx.compose.foundation.shape.CutCornerShape(`topStart` = getDouble("topStart").dp, `bottomStart` = getDouble("bottomStart").dp)
  10 -> androidx.compose.foundation.shape.CutCornerShape(`topEnd` = getDouble("topEnd").dp, `bottomStart` = getDouble("bottomStart").dp)
  11 -> androidx.compose.foundation.shape.CutCornerShape(`topStart` = getDouble("topStart").dp, `topEnd` = getDouble("topEnd").dp, `bottomStart` = getDouble("bottomStart").dp)
  12 -> androidx.compose.foundation.shape.CutCornerShape(`bottomEnd` = getDouble("bottomEnd").dp, `bottomStart` = getDouble("bottomStart").dp)
  13 -> androidx.compose.foundation.shape.CutCornerShape(`topStart` = getDouble("topStart").dp, `bottomEnd` = getDouble("bottomEnd").dp, `bottomStart` = getDouble("bottomStart").dp)
  14 -> androidx.compose.foundation.shape.CutCornerShape(`topEnd` = getDouble("topEnd").dp, `bottomEnd` = getDouble("bottomEnd").dp, `bottomStart` = getDouble("bottomStart").dp)
  15 -> androidx.compose.foundation.shape.CutCornerShape(`topStart` = getDouble("topStart").dp, `topEnd` = getDouble("topEnd").dp, `bottomEnd` = getDouble("bottomEnd").dp, `bottomStart` = getDouble("bottomStart").dp)
  else -> error("Invalid generated arguments for androidx.compose.foundation.shape.CutCornerShape")
}

private fun JSONObject.decodeComposeCornerBasedShapeValueFactory14(): androidx.compose.foundation.shape.CornerBasedShape = when ((if (has("topStartPercent")) 1 else 0) + (if (has("topEndPercent")) 2 else 0) + (if (has("bottomEndPercent")) 4 else 0) + (if (has("bottomStartPercent")) 8 else 0)) {
  1 -> androidx.compose.foundation.shape.CutCornerShape(`topStartPercent` = getInt("topStartPercent"))
  2 -> androidx.compose.foundation.shape.CutCornerShape(`topEndPercent` = getInt("topEndPercent"))
  3 -> androidx.compose.foundation.shape.CutCornerShape(`topStartPercent` = getInt("topStartPercent"), `topEndPercent` = getInt("topEndPercent"))
  4 -> androidx.compose.foundation.shape.CutCornerShape(`bottomEndPercent` = getInt("bottomEndPercent"))
  5 -> androidx.compose.foundation.shape.CutCornerShape(`topStartPercent` = getInt("topStartPercent"), `bottomEndPercent` = getInt("bottomEndPercent"))
  6 -> androidx.compose.foundation.shape.CutCornerShape(`topEndPercent` = getInt("topEndPercent"), `bottomEndPercent` = getInt("bottomEndPercent"))
  7 -> androidx.compose.foundation.shape.CutCornerShape(`topStartPercent` = getInt("topStartPercent"), `topEndPercent` = getInt("topEndPercent"), `bottomEndPercent` = getInt("bottomEndPercent"))
  8 -> androidx.compose.foundation.shape.CutCornerShape(`bottomStartPercent` = getInt("bottomStartPercent"))
  9 -> androidx.compose.foundation.shape.CutCornerShape(`topStartPercent` = getInt("topStartPercent"), `bottomStartPercent` = getInt("bottomStartPercent"))
  10 -> androidx.compose.foundation.shape.CutCornerShape(`topEndPercent` = getInt("topEndPercent"), `bottomStartPercent` = getInt("bottomStartPercent"))
  11 -> androidx.compose.foundation.shape.CutCornerShape(`topStartPercent` = getInt("topStartPercent"), `topEndPercent` = getInt("topEndPercent"), `bottomStartPercent` = getInt("bottomStartPercent"))
  12 -> androidx.compose.foundation.shape.CutCornerShape(`bottomEndPercent` = getInt("bottomEndPercent"), `bottomStartPercent` = getInt("bottomStartPercent"))
  13 -> androidx.compose.foundation.shape.CutCornerShape(`topStartPercent` = getInt("topStartPercent"), `bottomEndPercent` = getInt("bottomEndPercent"), `bottomStartPercent` = getInt("bottomStartPercent"))
  14 -> androidx.compose.foundation.shape.CutCornerShape(`topEndPercent` = getInt("topEndPercent"), `bottomEndPercent` = getInt("bottomEndPercent"), `bottomStartPercent` = getInt("bottomStartPercent"))
  15 -> androidx.compose.foundation.shape.CutCornerShape(`topStartPercent` = getInt("topStartPercent"), `topEndPercent` = getInt("topEndPercent"), `bottomEndPercent` = getInt("bottomEndPercent"), `bottomStartPercent` = getInt("bottomStartPercent"))
  else -> error("Invalid generated arguments for androidx.compose.foundation.shape.CutCornerShape")
}

private fun JSONObject.decodeComposeCornerBasedShapeValueFactory15(): androidx.compose.foundation.shape.CornerBasedShape = androidx.compose.foundation.shape.RoundedCornerShape(
  `corner` = getJSONObject("corner").decodeComposeCornerSizeValue(),
)

private fun JSONObject.decodeComposeCornerBasedShapeValueFactory16(): androidx.compose.foundation.shape.CornerBasedShape = androidx.compose.foundation.shape.RoundedCornerShape(
  `size` = getDouble("size").dp,
)

private fun JSONObject.decodeComposeCornerBasedShapeValueFactory17(): androidx.compose.foundation.shape.CornerBasedShape = androidx.compose.foundation.shape.RoundedCornerShape(
  `percent` = getInt("percent"),
)

private fun JSONObject.decodeComposeCornerBasedShapeValueFactory18(): androidx.compose.foundation.shape.CornerBasedShape = when ((if (has("topStart")) 1 else 0) + (if (has("topEnd")) 2 else 0) + (if (has("bottomEnd")) 4 else 0) + (if (has("bottomStart")) 8 else 0)) {
  1 -> androidx.compose.foundation.shape.RoundedCornerShape(`topStart` = getDouble("topStart").dp)
  2 -> androidx.compose.foundation.shape.RoundedCornerShape(`topEnd` = getDouble("topEnd").dp)
  3 -> androidx.compose.foundation.shape.RoundedCornerShape(`topStart` = getDouble("topStart").dp, `topEnd` = getDouble("topEnd").dp)
  4 -> androidx.compose.foundation.shape.RoundedCornerShape(`bottomEnd` = getDouble("bottomEnd").dp)
  5 -> androidx.compose.foundation.shape.RoundedCornerShape(`topStart` = getDouble("topStart").dp, `bottomEnd` = getDouble("bottomEnd").dp)
  6 -> androidx.compose.foundation.shape.RoundedCornerShape(`topEnd` = getDouble("topEnd").dp, `bottomEnd` = getDouble("bottomEnd").dp)
  7 -> androidx.compose.foundation.shape.RoundedCornerShape(`topStart` = getDouble("topStart").dp, `topEnd` = getDouble("topEnd").dp, `bottomEnd` = getDouble("bottomEnd").dp)
  8 -> androidx.compose.foundation.shape.RoundedCornerShape(`bottomStart` = getDouble("bottomStart").dp)
  9 -> androidx.compose.foundation.shape.RoundedCornerShape(`topStart` = getDouble("topStart").dp, `bottomStart` = getDouble("bottomStart").dp)
  10 -> androidx.compose.foundation.shape.RoundedCornerShape(`topEnd` = getDouble("topEnd").dp, `bottomStart` = getDouble("bottomStart").dp)
  11 -> androidx.compose.foundation.shape.RoundedCornerShape(`topStart` = getDouble("topStart").dp, `topEnd` = getDouble("topEnd").dp, `bottomStart` = getDouble("bottomStart").dp)
  12 -> androidx.compose.foundation.shape.RoundedCornerShape(`bottomEnd` = getDouble("bottomEnd").dp, `bottomStart` = getDouble("bottomStart").dp)
  13 -> androidx.compose.foundation.shape.RoundedCornerShape(`topStart` = getDouble("topStart").dp, `bottomEnd` = getDouble("bottomEnd").dp, `bottomStart` = getDouble("bottomStart").dp)
  14 -> androidx.compose.foundation.shape.RoundedCornerShape(`topEnd` = getDouble("topEnd").dp, `bottomEnd` = getDouble("bottomEnd").dp, `bottomStart` = getDouble("bottomStart").dp)
  15 -> androidx.compose.foundation.shape.RoundedCornerShape(`topStart` = getDouble("topStart").dp, `topEnd` = getDouble("topEnd").dp, `bottomEnd` = getDouble("bottomEnd").dp, `bottomStart` = getDouble("bottomStart").dp)
  else -> error("Invalid generated arguments for androidx.compose.foundation.shape.RoundedCornerShape")
}

private fun JSONObject.decodeComposeCornerBasedShapeValueFactory19(): androidx.compose.foundation.shape.CornerBasedShape = when ((if (has("topStartPercent")) 1 else 0) + (if (has("topEndPercent")) 2 else 0) + (if (has("bottomEndPercent")) 4 else 0) + (if (has("bottomStartPercent")) 8 else 0)) {
  1 -> androidx.compose.foundation.shape.RoundedCornerShape(`topStartPercent` = getInt("topStartPercent"))
  2 -> androidx.compose.foundation.shape.RoundedCornerShape(`topEndPercent` = getInt("topEndPercent"))
  3 -> androidx.compose.foundation.shape.RoundedCornerShape(`topStartPercent` = getInt("topStartPercent"), `topEndPercent` = getInt("topEndPercent"))
  4 -> androidx.compose.foundation.shape.RoundedCornerShape(`bottomEndPercent` = getInt("bottomEndPercent"))
  5 -> androidx.compose.foundation.shape.RoundedCornerShape(`topStartPercent` = getInt("topStartPercent"), `bottomEndPercent` = getInt("bottomEndPercent"))
  6 -> androidx.compose.foundation.shape.RoundedCornerShape(`topEndPercent` = getInt("topEndPercent"), `bottomEndPercent` = getInt("bottomEndPercent"))
  7 -> androidx.compose.foundation.shape.RoundedCornerShape(`topStartPercent` = getInt("topStartPercent"), `topEndPercent` = getInt("topEndPercent"), `bottomEndPercent` = getInt("bottomEndPercent"))
  8 -> androidx.compose.foundation.shape.RoundedCornerShape(`bottomStartPercent` = getInt("bottomStartPercent"))
  9 -> androidx.compose.foundation.shape.RoundedCornerShape(`topStartPercent` = getInt("topStartPercent"), `bottomStartPercent` = getInt("bottomStartPercent"))
  10 -> androidx.compose.foundation.shape.RoundedCornerShape(`topEndPercent` = getInt("topEndPercent"), `bottomStartPercent` = getInt("bottomStartPercent"))
  11 -> androidx.compose.foundation.shape.RoundedCornerShape(`topStartPercent` = getInt("topStartPercent"), `topEndPercent` = getInt("topEndPercent"), `bottomStartPercent` = getInt("bottomStartPercent"))
  12 -> androidx.compose.foundation.shape.RoundedCornerShape(`bottomEndPercent` = getInt("bottomEndPercent"), `bottomStartPercent` = getInt("bottomStartPercent"))
  13 -> androidx.compose.foundation.shape.RoundedCornerShape(`topStartPercent` = getInt("topStartPercent"), `bottomEndPercent` = getInt("bottomEndPercent"), `bottomStartPercent` = getInt("bottomStartPercent"))
  14 -> androidx.compose.foundation.shape.RoundedCornerShape(`topEndPercent` = getInt("topEndPercent"), `bottomEndPercent` = getInt("bottomEndPercent"), `bottomStartPercent` = getInt("bottomStartPercent"))
  15 -> androidx.compose.foundation.shape.RoundedCornerShape(`topStartPercent` = getInt("topStartPercent"), `topEndPercent` = getInt("topEndPercent"), `bottomEndPercent` = getInt("bottomEndPercent"), `bottomStartPercent` = getInt("bottomStartPercent"))
  else -> error("Invalid generated arguments for androidx.compose.foundation.shape.RoundedCornerShape")
}

internal fun JSONObject.decodeComposeCornerSizeValue(): androidx.compose.foundation.shape.CornerSize = when (val factory = getString("factory")) {
  "CornerSize" -> when { has("size") -> decodeComposeCornerSizeValueFactory0(); has("percent") -> decodeComposeCornerSizeValueFactory1(); else -> error("No CornerSize overload accepts these fields") }
  else -> error("Unknown ComposeCornerSizeValue factory: " + factory)
}

private fun JSONObject.decodeComposeCornerSizeValueFactory0(): androidx.compose.foundation.shape.CornerSize = androidx.compose.foundation.shape.CornerSize(
  `size` = getDouble("size").dp,
)

private fun JSONObject.decodeComposeCornerSizeValueFactory1(): androidx.compose.foundation.shape.CornerSize = androidx.compose.foundation.shape.CornerSize(
  `percent` = getInt("percent"),
)

internal fun JSONObject.decodeComposeAppearanceScopeBlock(): androidx.compose.foundation.style.AppearanceScope.() -> Unit {
  val hasBackground = has("background")
  val `background` = if (has("background")) toComposeFillValue(getString("background")) else null
  val hasBorder = has("border")
  val `border` = if (has("border")) toComposeFillValue(getString("border")) else null
  val hasBorderWidth = has("borderWidth")
  val `borderWidth` = if (has("borderWidth")) getDouble("borderWidth").dp else null
  val hasDropShadow = has("dropShadow")
  val `dropShadow` = if (has("dropShadow")) toComposeShadowsValue(getString("dropShadow")) else null
  val hasForeground = has("foreground")
  val `foreground` = if (has("foreground")) toComposeFillValue(getString("foreground")) else null
  val hasInnerShadow = has("innerShadow")
  val `innerShadow` = if (has("innerShadow")) toComposeShadowsValue(getString("innerShadow")) else null
  val hasShape = has("shape")
  val `shape` = if (has("shape")) composeShape("shape") else null
  return {
    if (hasBackground) this.`background` = `background`!!
    if (hasBorder) this.`border` = `border`!!
    if (hasBorderWidth) this.`borderWidth` = `borderWidth`!!
    if (hasDropShadow) this.`dropShadow` = `dropShadow`!!
    if (hasForeground) this.`foreground` = `foreground`!!
    if (hasInnerShadow) this.`innerShadow` = `innerShadow`!!
    if (hasShape) this.`shape` = `shape`!!
  }
}

internal fun JSONObject.decodeComposePlacementModifierScopeBlock(): androidx.compose.foundation.style.PlacementModifierScope.() -> Unit {
  val hasBottom = has("bottom")
  val `bottom` = if (has("bottom")) getDouble("bottom").dp else null
  val hasHeight = has("height")
  val `height` = if (has("height")) toComposeBreadthValue(getString("height")) else null
  val hasLeft = has("left")
  val `left` = if (has("left")) getDouble("left").dp else null
  val hasMaxHeight = has("maxHeight")
  val `maxHeight` = if (has("maxHeight")) getDouble("maxHeight").dp else null
  val hasMaxWidth = has("maxWidth")
  val `maxWidth` = if (has("maxWidth")) getDouble("maxWidth").dp else null
  val hasMinHeight = has("minHeight")
  val `minHeight` = if (has("minHeight")) getDouble("minHeight").dp else null
  val hasMinWidth = has("minWidth")
  val `minWidth` = if (has("minWidth")) getDouble("minWidth").dp else null
  val hasRight = has("right")
  val `right` = if (has("right")) getDouble("right").dp else null
  val hasTop = has("top")
  val `top` = if (has("top")) getDouble("top").dp else null
  val hasWidth = has("width")
  val `width` = if (has("width")) toComposeBreadthValue(getString("width")) else null
  return {
    if (hasBottom) this.`bottom` = `bottom`!!
    if (hasHeight) this.`height` = `height`!!
    if (hasLeft) this.`left` = `left`!!
    if (hasMaxHeight) this.`maxHeight` = `maxHeight`!!
    if (hasMaxWidth) this.`maxWidth` = `maxWidth`!!
    if (hasMinHeight) this.`minHeight` = `minHeight`!!
    if (hasMinWidth) this.`minWidth` = `minWidth`!!
    if (hasRight) this.`right` = `right`!!
    if (hasTop) this.`top` = `top`!!
    if (hasWidth) this.`width` = `width`!!
  }
}

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

@Composable
internal fun JSONObject.decodeComposeSelectionStateValue(): androidx.compose.foundation.text.selection.SelectionState = when (val factory = getString("factory")) {
  "rememberSelectionState" -> decodeComposeSelectionStateValueFactory0()
  else -> error("Unknown ComposeSelectionStateValue factory: " + factory)
}

@Composable
private fun JSONObject.decodeComposeSelectionStateValueFactory0(): androidx.compose.foundation.text.selection.SelectionState = androidx.compose.foundation.text.selection.rememberSelectionState(
)

internal fun JSONObject.decodeComposeTextSelectionColorsValue(): androidx.compose.foundation.text.selection.TextSelectionColors = androidx.compose.foundation.text.selection.TextSelectionColors(
  `handleColor` = parseComposeColor(getString("handleColor")),
  `backgroundColor` = parseComposeColor(getString("backgroundColor")),
)

internal fun JSONObject.decodeComposeAppBarWithSearchColorsValue(): androidx.compose.material3.AppBarWithSearchColors = androidx.compose.material3.AppBarWithSearchColors(
  `searchBarColors` = getJSONObject("searchBarColors").decodeComposeSearchBarColorsValue(),
  `scrolledSearchBarContainerColor` = parseComposeColor(getString("scrolledSearchBarContainerColor")),
  `appBarContainerColor` = parseComposeColor(getString("appBarContainerColor")),
  `scrolledAppBarContainerColor` = parseComposeColor(getString("scrolledAppBarContainerColor")),
  `appBarNavigationIconColor` = parseComposeColor(getString("appBarNavigationIconColor")),
  `appBarActionIconColor` = parseComposeColor(getString("appBarActionIconColor")),
)

@Composable
internal fun JSONObject.decodeComposeBottomAppBarScrollBehaviorValue(): androidx.compose.material3.BottomAppBarScrollBehavior = when (val factory = getString("factory")) {
  "BottomAppBarDefaults.exitAlwaysScrollBehavior" -> decodeComposeBottomAppBarScrollBehaviorValueFactory0()
  else -> error("Unknown ComposeBottomAppBarScrollBehaviorValue factory: " + factory)
}

@Composable
private fun JSONObject.decodeComposeBottomAppBarScrollBehaviorValueFactory0(): androidx.compose.material3.BottomAppBarScrollBehavior = when ((if (has("state")) 1 else 0)) {
  0 -> androidx.compose.material3.BottomAppBarDefaults.exitAlwaysScrollBehavior()
  1 -> androidx.compose.material3.BottomAppBarDefaults.exitAlwaysScrollBehavior(`state` = getJSONObject("state").decodeComposeBottomAppBarStateValue())
  else -> error("Invalid generated arguments for androidx.compose.material3.BottomAppBarDefaults.exitAlwaysScrollBehavior")
}

internal fun JSONObject.decodeComposeBottomAppBarStateValue(): androidx.compose.material3.BottomAppBarState = when ((if (has("initialHeightOffsetLimit")) 1 else 0) + (if (has("initialHeightOffset")) 2 else 0) + (if (has("initialContentOffset")) 4 else 0)) {
  0 -> androidx.compose.material3.BottomAppBarState()
  1 -> androidx.compose.material3.BottomAppBarState(`initialHeightOffsetLimit` = getDouble("initialHeightOffsetLimit").toFloat())
  2 -> androidx.compose.material3.BottomAppBarState(`initialHeightOffset` = getDouble("initialHeightOffset").toFloat())
  3 -> androidx.compose.material3.BottomAppBarState(`initialHeightOffsetLimit` = getDouble("initialHeightOffsetLimit").toFloat(), `initialHeightOffset` = getDouble("initialHeightOffset").toFloat())
  4 -> androidx.compose.material3.BottomAppBarState(`initialContentOffset` = getDouble("initialContentOffset").toFloat())
  5 -> androidx.compose.material3.BottomAppBarState(`initialHeightOffsetLimit` = getDouble("initialHeightOffsetLimit").toFloat(), `initialContentOffset` = getDouble("initialContentOffset").toFloat())
  6 -> androidx.compose.material3.BottomAppBarState(`initialHeightOffset` = getDouble("initialHeightOffset").toFloat(), `initialContentOffset` = getDouble("initialContentOffset").toFloat())
  7 -> androidx.compose.material3.BottomAppBarState(`initialHeightOffsetLimit` = getDouble("initialHeightOffsetLimit").toFloat(), `initialHeightOffset` = getDouble("initialHeightOffset").toFloat(), `initialContentOffset` = getDouble("initialContentOffset").toFloat())
  else -> error("Invalid generated arguments for ComposeBottomAppBarStateValue")
}

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

internal fun JSONObject.decodeComposeButtonShapesValue(): androidx.compose.material3.ButtonShapes = androidx.compose.material3.ButtonShapes(
  `shape` = composeShape("shape"),
  `pressedShape` = composeShape("pressedShape"),
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
  `disabledCheckmarkColor` = parseComposeColor(getString("disabledCheckmarkColor")),
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

internal fun JSONObject.decodeComposeChipShapesValue(): androidx.compose.material3.ChipShapes = when ((if (has("pressedShape")) 1 else 0)) {
  0 -> androidx.compose.material3.ChipShapes(`shape` = composeShape("shape"), `selectedShape` = composeShape("selectedShape"))
  1 -> androidx.compose.material3.ChipShapes(`shape` = composeShape("shape"), `selectedShape` = composeShape("selectedShape"), `pressedShape` = composeShape("pressedShape"))
  else -> error("Invalid generated arguments for ComposeChipShapesValue")
}

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

internal fun JSONObject.decodeComposeDragHandleShapesValue(): androidx.compose.material3.DragHandleShapes = androidx.compose.material3.DragHandleShapes(
  `shape` = composeShape("shape"),
  `pressedShape` = composeShape("pressedShape"),
  `draggedShape` = composeShape("draggedShape"),
)

internal fun JSONObject.decodeComposeDragHandleSizesValue(): androidx.compose.material3.DragHandleSizes = androidx.compose.material3.DragHandleSizes(
  `size` = getJSONObject("size").toDpSize(),
  `pressedSize` = getJSONObject("pressedSize").toDpSize(),
  `draggedSize` = getJSONObject("draggedSize").toDpSize(),
)

@Composable
internal fun JSONObject.decodeComposeDropdownMenuPopupPositionProviderValue(): androidx.compose.material3.DropdownMenuPopupPositionProvider = when (val factory = getString("factory")) {
  "MenuDefaults.rememberDropdownMenuPopupPositionProvider" -> decodeComposeDropdownMenuPopupPositionProviderValueFactory0()
  else -> error("Unknown ComposeDropdownMenuPopupPositionProviderValue factory: " + factory)
}

@Composable
private fun JSONObject.decodeComposeDropdownMenuPopupPositionProviderValueFactory0(): androidx.compose.material3.DropdownMenuPopupPositionProvider = when ((if (has("offset")) 1 else 0)) {
  0 -> androidx.compose.material3.MenuDefaults.rememberDropdownMenuPopupPositionProvider(`dropdownMenuAnchorPosition` = toComposeMenuAnchorPositionValue(getString("dropdownMenuAnchorPosition")))
  1 -> androidx.compose.material3.MenuDefaults.rememberDropdownMenuPopupPositionProvider(`dropdownMenuAnchorPosition` = toComposeMenuAnchorPositionValue(getString("dropdownMenuAnchorPosition")), `offset` = getJSONObject("offset").decodeComposeDpOffset())
  else -> error("Invalid generated arguments for androidx.compose.material3.MenuDefaults.rememberDropdownMenuPopupPositionProvider")
}

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

@Composable
internal fun JSONObject.decodeComposeFloatingToolbarScrollBehaviorValue(): androidx.compose.material3.FloatingToolbarScrollBehavior = when (val factory = getString("factory")) {
  "FloatingToolbarDefaults.exitAlwaysScrollBehavior" -> decodeComposeFloatingToolbarScrollBehaviorValueFactory0()
  else -> error("Unknown ComposeFloatingToolbarScrollBehaviorValue factory: " + factory)
}

@Composable
private fun JSONObject.decodeComposeFloatingToolbarScrollBehaviorValueFactory0(): androidx.compose.material3.FloatingToolbarScrollBehavior = when ((if (has("state")) 1 else 0)) {
  0 -> androidx.compose.material3.FloatingToolbarDefaults.exitAlwaysScrollBehavior(`exitDirection` = toComposeFloatingToolbarExitDirectionValue(getString("exitDirection")))
  1 -> androidx.compose.material3.FloatingToolbarDefaults.exitAlwaysScrollBehavior(`exitDirection` = toComposeFloatingToolbarExitDirectionValue(getString("exitDirection")), `state` = getJSONObject("state").decodeComposeFloatingToolbarStateValue())
  else -> error("Invalid generated arguments for androidx.compose.material3.FloatingToolbarDefaults.exitAlwaysScrollBehavior")
}

internal fun JSONObject.decodeComposeFloatingToolbarStateValue(): androidx.compose.material3.FloatingToolbarState = androidx.compose.material3.FloatingToolbarState(
  `initialOffsetLimit` = getDouble("initialOffsetLimit").toFloat(),
  `initialOffset` = getDouble("initialOffset").toFloat(),
  `initialContentOffset` = getDouble("initialContentOffset").toFloat(),
)

internal fun JSONObject.decodeComposeIconButtonColorsValue(): androidx.compose.material3.IconButtonColors = androidx.compose.material3.IconButtonColors(
  `containerColor` = parseComposeColor(getString("containerColor")),
  `contentColor` = parseComposeColor(getString("contentColor")),
  `disabledContainerColor` = parseComposeColor(getString("disabledContainerColor")),
  `disabledContentColor` = parseComposeColor(getString("disabledContentColor")),
)

internal fun JSONObject.decodeComposeIconButtonShapesValue(): androidx.compose.material3.IconButtonShapes = when ((if (has("pressedShape")) 1 else 0)) {
  0 -> androidx.compose.material3.IconButtonShapes(`shape` = composeShape("shape"))
  1 -> androidx.compose.material3.IconButtonShapes(`shape` = composeShape("shape"), `pressedShape` = composeShape("pressedShape"))
  else -> error("Invalid generated arguments for ComposeIconButtonShapesValue")
}

internal fun JSONObject.decodeComposeIconToggleButtonColorsValue(): androidx.compose.material3.IconToggleButtonColors = androidx.compose.material3.IconToggleButtonColors(
  `containerColor` = parseComposeColor(getString("containerColor")),
  `contentColor` = parseComposeColor(getString("contentColor")),
  `disabledContainerColor` = parseComposeColor(getString("disabledContainerColor")),
  `disabledContentColor` = parseComposeColor(getString("disabledContentColor")),
  `checkedContainerColor` = parseComposeColor(getString("checkedContainerColor")),
  `checkedContentColor` = parseComposeColor(getString("checkedContentColor")),
)

internal fun JSONObject.decodeComposeIconToggleButtonShapesValue(): androidx.compose.material3.IconToggleButtonShapes = when ((if (has("pressedShape")) 1 else 0) + (if (has("checkedShape")) 2 else 0)) {
  0 -> androidx.compose.material3.IconToggleButtonShapes(`shape` = composeShape("shape"))
  1 -> androidx.compose.material3.IconToggleButtonShapes(`shape` = composeShape("shape"), `pressedShape` = composeShape("pressedShape"))
  2 -> androidx.compose.material3.IconToggleButtonShapes(`shape` = composeShape("shape"), `checkedShape` = composeShape("checkedShape"))
  3 -> androidx.compose.material3.IconToggleButtonShapes(`shape` = composeShape("shape"), `pressedShape` = composeShape("pressedShape"), `checkedShape` = composeShape("checkedShape"))
  else -> error("Invalid generated arguments for ComposeIconToggleButtonShapesValue")
}

internal fun JSONObject.decodeComposeListItemColorsValue(): androidx.compose.material3.ListItemColors = androidx.compose.material3.ListItemColors(
  `containerColor` = parseComposeColor(getString("containerColor")),
  `contentColor` = parseComposeColor(getString("contentColor")),
  `leadingContentColor` = parseComposeColor(getString("leadingContentColor")),
  `trailingContentColor` = parseComposeColor(getString("trailingContentColor")),
  `overlineContentColor` = parseComposeColor(getString("overlineContentColor")),
  `supportingContentColor` = parseComposeColor(getString("supportingContentColor")),
  `disabledContainerColor` = parseComposeColor(getString("disabledContainerColor")),
  `disabledContentColor` = parseComposeColor(getString("disabledContentColor")),
  `disabledLeadingContentColor` = parseComposeColor(getString("disabledLeadingContentColor")),
  `disabledTrailingContentColor` = parseComposeColor(getString("disabledTrailingContentColor")),
  `disabledOverlineContentColor` = parseComposeColor(getString("disabledOverlineContentColor")),
  `disabledSupportingContentColor` = parseComposeColor(getString("disabledSupportingContentColor")),
  `selectedContainerColor` = parseComposeColor(getString("selectedContainerColor")),
  `selectedContentColor` = parseComposeColor(getString("selectedContentColor")),
  `selectedLeadingContentColor` = parseComposeColor(getString("selectedLeadingContentColor")),
  `selectedTrailingContentColor` = parseComposeColor(getString("selectedTrailingContentColor")),
  `selectedOverlineContentColor` = parseComposeColor(getString("selectedOverlineContentColor")),
  `selectedSupportingContentColor` = parseComposeColor(getString("selectedSupportingContentColor")),
  `draggedContainerColor` = parseComposeColor(getString("draggedContainerColor")),
  `draggedContentColor` = parseComposeColor(getString("draggedContentColor")),
  `draggedLeadingContentColor` = parseComposeColor(getString("draggedLeadingContentColor")),
  `draggedTrailingContentColor` = parseComposeColor(getString("draggedTrailingContentColor")),
  `draggedOverlineContentColor` = parseComposeColor(getString("draggedOverlineContentColor")),
  `draggedSupportingContentColor` = parseComposeColor(getString("draggedSupportingContentColor")),
)

internal fun JSONObject.decodeComposeListItemElevationValue(): androidx.compose.material3.ListItemElevation = androidx.compose.material3.ListItemElevation(
  `elevation` = getDouble("elevation").dp,
  `draggedElevation` = getDouble("draggedElevation").dp,
)

internal fun JSONObject.decodeComposeListItemShapesValue(): androidx.compose.material3.ListItemShapes = androidx.compose.material3.ListItemShapes(
  `shape` = composeShape("shape"),
  `selectedShape` = composeShape("selectedShape"),
  `pressedShape` = composeShape("pressedShape"),
  `focusedShape` = composeShape("focusedShape"),
  `hoveredShape` = composeShape("hoveredShape"),
  `draggedShape` = composeShape("draggedShape"),
)

internal fun JSONObject.decodeComposeMenuGroupShapesValue(): androidx.compose.material3.MenuGroupShapes = androidx.compose.material3.MenuGroupShapes(
  `shape` = composeShape("shape"),
  `inactiveShape` = composeShape("inactiveShape"),
)

@Composable
internal fun JSONObject.decodeComposeMenuItemColorsValue(): androidx.compose.material3.MenuItemColors = when (val factory = getString("factory")) {
  "MenuDefaults.itemColors" -> decodeComposeMenuItemColorsValueFactory0()
  "MenuDefaults.itemVibrantColors" -> decodeComposeMenuItemColorsValueFactory1()
  else -> error("Unknown ComposeMenuItemColorsValue factory: " + factory)
}

@Composable
private fun JSONObject.decodeComposeMenuItemColorsValueFactory0(): androidx.compose.material3.MenuItemColors = when ((if (has("textColor")) 1 else 0) + (if (has("leadingIconColor")) 2 else 0) + (if (has("trailingIconColor")) 4 else 0) + (if (has("disabledTextColor")) 8 else 0) + (if (has("disabledLeadingIconColor")) 16 else 0) + (if (has("disabledTrailingIconColor")) 32 else 0)) {
  0 -> androidx.compose.material3.MenuDefaults.itemColors()
  1 -> androidx.compose.material3.MenuDefaults.itemColors(`textColor` = parseComposeColor(getString("textColor")))
  2 -> androidx.compose.material3.MenuDefaults.itemColors(`leadingIconColor` = parseComposeColor(getString("leadingIconColor")))
  3 -> androidx.compose.material3.MenuDefaults.itemColors(`textColor` = parseComposeColor(getString("textColor")), `leadingIconColor` = parseComposeColor(getString("leadingIconColor")))
  4 -> androidx.compose.material3.MenuDefaults.itemColors(`trailingIconColor` = parseComposeColor(getString("trailingIconColor")))
  5 -> androidx.compose.material3.MenuDefaults.itemColors(`textColor` = parseComposeColor(getString("textColor")), `trailingIconColor` = parseComposeColor(getString("trailingIconColor")))
  6 -> androidx.compose.material3.MenuDefaults.itemColors(`leadingIconColor` = parseComposeColor(getString("leadingIconColor")), `trailingIconColor` = parseComposeColor(getString("trailingIconColor")))
  7 -> androidx.compose.material3.MenuDefaults.itemColors(`textColor` = parseComposeColor(getString("textColor")), `leadingIconColor` = parseComposeColor(getString("leadingIconColor")), `trailingIconColor` = parseComposeColor(getString("trailingIconColor")))
  8 -> androidx.compose.material3.MenuDefaults.itemColors(`disabledTextColor` = parseComposeColor(getString("disabledTextColor")))
  9 -> androidx.compose.material3.MenuDefaults.itemColors(`textColor` = parseComposeColor(getString("textColor")), `disabledTextColor` = parseComposeColor(getString("disabledTextColor")))
  10 -> androidx.compose.material3.MenuDefaults.itemColors(`leadingIconColor` = parseComposeColor(getString("leadingIconColor")), `disabledTextColor` = parseComposeColor(getString("disabledTextColor")))
  11 -> androidx.compose.material3.MenuDefaults.itemColors(`textColor` = parseComposeColor(getString("textColor")), `leadingIconColor` = parseComposeColor(getString("leadingIconColor")), `disabledTextColor` = parseComposeColor(getString("disabledTextColor")))
  12 -> androidx.compose.material3.MenuDefaults.itemColors(`trailingIconColor` = parseComposeColor(getString("trailingIconColor")), `disabledTextColor` = parseComposeColor(getString("disabledTextColor")))
  13 -> androidx.compose.material3.MenuDefaults.itemColors(`textColor` = parseComposeColor(getString("textColor")), `trailingIconColor` = parseComposeColor(getString("trailingIconColor")), `disabledTextColor` = parseComposeColor(getString("disabledTextColor")))
  14 -> androidx.compose.material3.MenuDefaults.itemColors(`leadingIconColor` = parseComposeColor(getString("leadingIconColor")), `trailingIconColor` = parseComposeColor(getString("trailingIconColor")), `disabledTextColor` = parseComposeColor(getString("disabledTextColor")))
  15 -> androidx.compose.material3.MenuDefaults.itemColors(`textColor` = parseComposeColor(getString("textColor")), `leadingIconColor` = parseComposeColor(getString("leadingIconColor")), `trailingIconColor` = parseComposeColor(getString("trailingIconColor")), `disabledTextColor` = parseComposeColor(getString("disabledTextColor")))
  16 -> androidx.compose.material3.MenuDefaults.itemColors(`disabledLeadingIconColor` = parseComposeColor(getString("disabledLeadingIconColor")))
  17 -> androidx.compose.material3.MenuDefaults.itemColors(`textColor` = parseComposeColor(getString("textColor")), `disabledLeadingIconColor` = parseComposeColor(getString("disabledLeadingIconColor")))
  18 -> androidx.compose.material3.MenuDefaults.itemColors(`leadingIconColor` = parseComposeColor(getString("leadingIconColor")), `disabledLeadingIconColor` = parseComposeColor(getString("disabledLeadingIconColor")))
  19 -> androidx.compose.material3.MenuDefaults.itemColors(`textColor` = parseComposeColor(getString("textColor")), `leadingIconColor` = parseComposeColor(getString("leadingIconColor")), `disabledLeadingIconColor` = parseComposeColor(getString("disabledLeadingIconColor")))
  20 -> androidx.compose.material3.MenuDefaults.itemColors(`trailingIconColor` = parseComposeColor(getString("trailingIconColor")), `disabledLeadingIconColor` = parseComposeColor(getString("disabledLeadingIconColor")))
  21 -> androidx.compose.material3.MenuDefaults.itemColors(`textColor` = parseComposeColor(getString("textColor")), `trailingIconColor` = parseComposeColor(getString("trailingIconColor")), `disabledLeadingIconColor` = parseComposeColor(getString("disabledLeadingIconColor")))
  22 -> androidx.compose.material3.MenuDefaults.itemColors(`leadingIconColor` = parseComposeColor(getString("leadingIconColor")), `trailingIconColor` = parseComposeColor(getString("trailingIconColor")), `disabledLeadingIconColor` = parseComposeColor(getString("disabledLeadingIconColor")))
  23 -> androidx.compose.material3.MenuDefaults.itemColors(`textColor` = parseComposeColor(getString("textColor")), `leadingIconColor` = parseComposeColor(getString("leadingIconColor")), `trailingIconColor` = parseComposeColor(getString("trailingIconColor")), `disabledLeadingIconColor` = parseComposeColor(getString("disabledLeadingIconColor")))
  24 -> androidx.compose.material3.MenuDefaults.itemColors(`disabledTextColor` = parseComposeColor(getString("disabledTextColor")), `disabledLeadingIconColor` = parseComposeColor(getString("disabledLeadingIconColor")))
  25 -> androidx.compose.material3.MenuDefaults.itemColors(`textColor` = parseComposeColor(getString("textColor")), `disabledTextColor` = parseComposeColor(getString("disabledTextColor")), `disabledLeadingIconColor` = parseComposeColor(getString("disabledLeadingIconColor")))
  26 -> androidx.compose.material3.MenuDefaults.itemColors(`leadingIconColor` = parseComposeColor(getString("leadingIconColor")), `disabledTextColor` = parseComposeColor(getString("disabledTextColor")), `disabledLeadingIconColor` = parseComposeColor(getString("disabledLeadingIconColor")))
  27 -> androidx.compose.material3.MenuDefaults.itemColors(`textColor` = parseComposeColor(getString("textColor")), `leadingIconColor` = parseComposeColor(getString("leadingIconColor")), `disabledTextColor` = parseComposeColor(getString("disabledTextColor")), `disabledLeadingIconColor` = parseComposeColor(getString("disabledLeadingIconColor")))
  28 -> androidx.compose.material3.MenuDefaults.itemColors(`trailingIconColor` = parseComposeColor(getString("trailingIconColor")), `disabledTextColor` = parseComposeColor(getString("disabledTextColor")), `disabledLeadingIconColor` = parseComposeColor(getString("disabledLeadingIconColor")))
  29 -> androidx.compose.material3.MenuDefaults.itemColors(`textColor` = parseComposeColor(getString("textColor")), `trailingIconColor` = parseComposeColor(getString("trailingIconColor")), `disabledTextColor` = parseComposeColor(getString("disabledTextColor")), `disabledLeadingIconColor` = parseComposeColor(getString("disabledLeadingIconColor")))
  30 -> androidx.compose.material3.MenuDefaults.itemColors(`leadingIconColor` = parseComposeColor(getString("leadingIconColor")), `trailingIconColor` = parseComposeColor(getString("trailingIconColor")), `disabledTextColor` = parseComposeColor(getString("disabledTextColor")), `disabledLeadingIconColor` = parseComposeColor(getString("disabledLeadingIconColor")))
  31 -> androidx.compose.material3.MenuDefaults.itemColors(`textColor` = parseComposeColor(getString("textColor")), `leadingIconColor` = parseComposeColor(getString("leadingIconColor")), `trailingIconColor` = parseComposeColor(getString("trailingIconColor")), `disabledTextColor` = parseComposeColor(getString("disabledTextColor")), `disabledLeadingIconColor` = parseComposeColor(getString("disabledLeadingIconColor")))
  32 -> androidx.compose.material3.MenuDefaults.itemColors(`disabledTrailingIconColor` = parseComposeColor(getString("disabledTrailingIconColor")))
  33 -> androidx.compose.material3.MenuDefaults.itemColors(`textColor` = parseComposeColor(getString("textColor")), `disabledTrailingIconColor` = parseComposeColor(getString("disabledTrailingIconColor")))
  34 -> androidx.compose.material3.MenuDefaults.itemColors(`leadingIconColor` = parseComposeColor(getString("leadingIconColor")), `disabledTrailingIconColor` = parseComposeColor(getString("disabledTrailingIconColor")))
  35 -> androidx.compose.material3.MenuDefaults.itemColors(`textColor` = parseComposeColor(getString("textColor")), `leadingIconColor` = parseComposeColor(getString("leadingIconColor")), `disabledTrailingIconColor` = parseComposeColor(getString("disabledTrailingIconColor")))
  36 -> androidx.compose.material3.MenuDefaults.itemColors(`trailingIconColor` = parseComposeColor(getString("trailingIconColor")), `disabledTrailingIconColor` = parseComposeColor(getString("disabledTrailingIconColor")))
  37 -> androidx.compose.material3.MenuDefaults.itemColors(`textColor` = parseComposeColor(getString("textColor")), `trailingIconColor` = parseComposeColor(getString("trailingIconColor")), `disabledTrailingIconColor` = parseComposeColor(getString("disabledTrailingIconColor")))
  38 -> androidx.compose.material3.MenuDefaults.itemColors(`leadingIconColor` = parseComposeColor(getString("leadingIconColor")), `trailingIconColor` = parseComposeColor(getString("trailingIconColor")), `disabledTrailingIconColor` = parseComposeColor(getString("disabledTrailingIconColor")))
  39 -> androidx.compose.material3.MenuDefaults.itemColors(`textColor` = parseComposeColor(getString("textColor")), `leadingIconColor` = parseComposeColor(getString("leadingIconColor")), `trailingIconColor` = parseComposeColor(getString("trailingIconColor")), `disabledTrailingIconColor` = parseComposeColor(getString("disabledTrailingIconColor")))
  40 -> androidx.compose.material3.MenuDefaults.itemColors(`disabledTextColor` = parseComposeColor(getString("disabledTextColor")), `disabledTrailingIconColor` = parseComposeColor(getString("disabledTrailingIconColor")))
  41 -> androidx.compose.material3.MenuDefaults.itemColors(`textColor` = parseComposeColor(getString("textColor")), `disabledTextColor` = parseComposeColor(getString("disabledTextColor")), `disabledTrailingIconColor` = parseComposeColor(getString("disabledTrailingIconColor")))
  42 -> androidx.compose.material3.MenuDefaults.itemColors(`leadingIconColor` = parseComposeColor(getString("leadingIconColor")), `disabledTextColor` = parseComposeColor(getString("disabledTextColor")), `disabledTrailingIconColor` = parseComposeColor(getString("disabledTrailingIconColor")))
  43 -> androidx.compose.material3.MenuDefaults.itemColors(`textColor` = parseComposeColor(getString("textColor")), `leadingIconColor` = parseComposeColor(getString("leadingIconColor")), `disabledTextColor` = parseComposeColor(getString("disabledTextColor")), `disabledTrailingIconColor` = parseComposeColor(getString("disabledTrailingIconColor")))
  44 -> androidx.compose.material3.MenuDefaults.itemColors(`trailingIconColor` = parseComposeColor(getString("trailingIconColor")), `disabledTextColor` = parseComposeColor(getString("disabledTextColor")), `disabledTrailingIconColor` = parseComposeColor(getString("disabledTrailingIconColor")))
  45 -> androidx.compose.material3.MenuDefaults.itemColors(`textColor` = parseComposeColor(getString("textColor")), `trailingIconColor` = parseComposeColor(getString("trailingIconColor")), `disabledTextColor` = parseComposeColor(getString("disabledTextColor")), `disabledTrailingIconColor` = parseComposeColor(getString("disabledTrailingIconColor")))
  46 -> androidx.compose.material3.MenuDefaults.itemColors(`leadingIconColor` = parseComposeColor(getString("leadingIconColor")), `trailingIconColor` = parseComposeColor(getString("trailingIconColor")), `disabledTextColor` = parseComposeColor(getString("disabledTextColor")), `disabledTrailingIconColor` = parseComposeColor(getString("disabledTrailingIconColor")))
  47 -> androidx.compose.material3.MenuDefaults.itemColors(`textColor` = parseComposeColor(getString("textColor")), `leadingIconColor` = parseComposeColor(getString("leadingIconColor")), `trailingIconColor` = parseComposeColor(getString("trailingIconColor")), `disabledTextColor` = parseComposeColor(getString("disabledTextColor")), `disabledTrailingIconColor` = parseComposeColor(getString("disabledTrailingIconColor")))
  48 -> androidx.compose.material3.MenuDefaults.itemColors(`disabledLeadingIconColor` = parseComposeColor(getString("disabledLeadingIconColor")), `disabledTrailingIconColor` = parseComposeColor(getString("disabledTrailingIconColor")))
  49 -> androidx.compose.material3.MenuDefaults.itemColors(`textColor` = parseComposeColor(getString("textColor")), `disabledLeadingIconColor` = parseComposeColor(getString("disabledLeadingIconColor")), `disabledTrailingIconColor` = parseComposeColor(getString("disabledTrailingIconColor")))
  50 -> androidx.compose.material3.MenuDefaults.itemColors(`leadingIconColor` = parseComposeColor(getString("leadingIconColor")), `disabledLeadingIconColor` = parseComposeColor(getString("disabledLeadingIconColor")), `disabledTrailingIconColor` = parseComposeColor(getString("disabledTrailingIconColor")))
  51 -> androidx.compose.material3.MenuDefaults.itemColors(`textColor` = parseComposeColor(getString("textColor")), `leadingIconColor` = parseComposeColor(getString("leadingIconColor")), `disabledLeadingIconColor` = parseComposeColor(getString("disabledLeadingIconColor")), `disabledTrailingIconColor` = parseComposeColor(getString("disabledTrailingIconColor")))
  52 -> androidx.compose.material3.MenuDefaults.itemColors(`trailingIconColor` = parseComposeColor(getString("trailingIconColor")), `disabledLeadingIconColor` = parseComposeColor(getString("disabledLeadingIconColor")), `disabledTrailingIconColor` = parseComposeColor(getString("disabledTrailingIconColor")))
  53 -> androidx.compose.material3.MenuDefaults.itemColors(`textColor` = parseComposeColor(getString("textColor")), `trailingIconColor` = parseComposeColor(getString("trailingIconColor")), `disabledLeadingIconColor` = parseComposeColor(getString("disabledLeadingIconColor")), `disabledTrailingIconColor` = parseComposeColor(getString("disabledTrailingIconColor")))
  54 -> androidx.compose.material3.MenuDefaults.itemColors(`leadingIconColor` = parseComposeColor(getString("leadingIconColor")), `trailingIconColor` = parseComposeColor(getString("trailingIconColor")), `disabledLeadingIconColor` = parseComposeColor(getString("disabledLeadingIconColor")), `disabledTrailingIconColor` = parseComposeColor(getString("disabledTrailingIconColor")))
  55 -> androidx.compose.material3.MenuDefaults.itemColors(`textColor` = parseComposeColor(getString("textColor")), `leadingIconColor` = parseComposeColor(getString("leadingIconColor")), `trailingIconColor` = parseComposeColor(getString("trailingIconColor")), `disabledLeadingIconColor` = parseComposeColor(getString("disabledLeadingIconColor")), `disabledTrailingIconColor` = parseComposeColor(getString("disabledTrailingIconColor")))
  56 -> androidx.compose.material3.MenuDefaults.itemColors(`disabledTextColor` = parseComposeColor(getString("disabledTextColor")), `disabledLeadingIconColor` = parseComposeColor(getString("disabledLeadingIconColor")), `disabledTrailingIconColor` = parseComposeColor(getString("disabledTrailingIconColor")))
  57 -> androidx.compose.material3.MenuDefaults.itemColors(`textColor` = parseComposeColor(getString("textColor")), `disabledTextColor` = parseComposeColor(getString("disabledTextColor")), `disabledLeadingIconColor` = parseComposeColor(getString("disabledLeadingIconColor")), `disabledTrailingIconColor` = parseComposeColor(getString("disabledTrailingIconColor")))
  58 -> androidx.compose.material3.MenuDefaults.itemColors(`leadingIconColor` = parseComposeColor(getString("leadingIconColor")), `disabledTextColor` = parseComposeColor(getString("disabledTextColor")), `disabledLeadingIconColor` = parseComposeColor(getString("disabledLeadingIconColor")), `disabledTrailingIconColor` = parseComposeColor(getString("disabledTrailingIconColor")))
  59 -> androidx.compose.material3.MenuDefaults.itemColors(`textColor` = parseComposeColor(getString("textColor")), `leadingIconColor` = parseComposeColor(getString("leadingIconColor")), `disabledTextColor` = parseComposeColor(getString("disabledTextColor")), `disabledLeadingIconColor` = parseComposeColor(getString("disabledLeadingIconColor")), `disabledTrailingIconColor` = parseComposeColor(getString("disabledTrailingIconColor")))
  60 -> androidx.compose.material3.MenuDefaults.itemColors(`trailingIconColor` = parseComposeColor(getString("trailingIconColor")), `disabledTextColor` = parseComposeColor(getString("disabledTextColor")), `disabledLeadingIconColor` = parseComposeColor(getString("disabledLeadingIconColor")), `disabledTrailingIconColor` = parseComposeColor(getString("disabledTrailingIconColor")))
  61 -> androidx.compose.material3.MenuDefaults.itemColors(`textColor` = parseComposeColor(getString("textColor")), `trailingIconColor` = parseComposeColor(getString("trailingIconColor")), `disabledTextColor` = parseComposeColor(getString("disabledTextColor")), `disabledLeadingIconColor` = parseComposeColor(getString("disabledLeadingIconColor")), `disabledTrailingIconColor` = parseComposeColor(getString("disabledTrailingIconColor")))
  62 -> androidx.compose.material3.MenuDefaults.itemColors(`leadingIconColor` = parseComposeColor(getString("leadingIconColor")), `trailingIconColor` = parseComposeColor(getString("trailingIconColor")), `disabledTextColor` = parseComposeColor(getString("disabledTextColor")), `disabledLeadingIconColor` = parseComposeColor(getString("disabledLeadingIconColor")), `disabledTrailingIconColor` = parseComposeColor(getString("disabledTrailingIconColor")))
  63 -> androidx.compose.material3.MenuDefaults.itemColors(`textColor` = parseComposeColor(getString("textColor")), `leadingIconColor` = parseComposeColor(getString("leadingIconColor")), `trailingIconColor` = parseComposeColor(getString("trailingIconColor")), `disabledTextColor` = parseComposeColor(getString("disabledTextColor")), `disabledLeadingIconColor` = parseComposeColor(getString("disabledLeadingIconColor")), `disabledTrailingIconColor` = parseComposeColor(getString("disabledTrailingIconColor")))
  else -> error("Invalid generated arguments for androidx.compose.material3.MenuDefaults.itemColors")
}

@Composable
private fun JSONObject.decodeComposeMenuItemColorsValueFactory1(): androidx.compose.material3.MenuItemColors = when ((if (has("textColor")) 1 else 0) + (if (has("leadingIconColor")) 2 else 0) + (if (has("trailingIconColor")) 4 else 0) + (if (has("disabledTextColor")) 8 else 0) + (if (has("disabledLeadingIconColor")) 16 else 0) + (if (has("disabledTrailingIconColor")) 32 else 0)) {
  0 -> androidx.compose.material3.MenuDefaults.itemVibrantColors()
  1 -> androidx.compose.material3.MenuDefaults.itemVibrantColors(`textColor` = parseComposeColor(getString("textColor")))
  2 -> androidx.compose.material3.MenuDefaults.itemVibrantColors(`leadingIconColor` = parseComposeColor(getString("leadingIconColor")))
  3 -> androidx.compose.material3.MenuDefaults.itemVibrantColors(`textColor` = parseComposeColor(getString("textColor")), `leadingIconColor` = parseComposeColor(getString("leadingIconColor")))
  4 -> androidx.compose.material3.MenuDefaults.itemVibrantColors(`trailingIconColor` = parseComposeColor(getString("trailingIconColor")))
  5 -> androidx.compose.material3.MenuDefaults.itemVibrantColors(`textColor` = parseComposeColor(getString("textColor")), `trailingIconColor` = parseComposeColor(getString("trailingIconColor")))
  6 -> androidx.compose.material3.MenuDefaults.itemVibrantColors(`leadingIconColor` = parseComposeColor(getString("leadingIconColor")), `trailingIconColor` = parseComposeColor(getString("trailingIconColor")))
  7 -> androidx.compose.material3.MenuDefaults.itemVibrantColors(`textColor` = parseComposeColor(getString("textColor")), `leadingIconColor` = parseComposeColor(getString("leadingIconColor")), `trailingIconColor` = parseComposeColor(getString("trailingIconColor")))
  8 -> androidx.compose.material3.MenuDefaults.itemVibrantColors(`disabledTextColor` = parseComposeColor(getString("disabledTextColor")))
  9 -> androidx.compose.material3.MenuDefaults.itemVibrantColors(`textColor` = parseComposeColor(getString("textColor")), `disabledTextColor` = parseComposeColor(getString("disabledTextColor")))
  10 -> androidx.compose.material3.MenuDefaults.itemVibrantColors(`leadingIconColor` = parseComposeColor(getString("leadingIconColor")), `disabledTextColor` = parseComposeColor(getString("disabledTextColor")))
  11 -> androidx.compose.material3.MenuDefaults.itemVibrantColors(`textColor` = parseComposeColor(getString("textColor")), `leadingIconColor` = parseComposeColor(getString("leadingIconColor")), `disabledTextColor` = parseComposeColor(getString("disabledTextColor")))
  12 -> androidx.compose.material3.MenuDefaults.itemVibrantColors(`trailingIconColor` = parseComposeColor(getString("trailingIconColor")), `disabledTextColor` = parseComposeColor(getString("disabledTextColor")))
  13 -> androidx.compose.material3.MenuDefaults.itemVibrantColors(`textColor` = parseComposeColor(getString("textColor")), `trailingIconColor` = parseComposeColor(getString("trailingIconColor")), `disabledTextColor` = parseComposeColor(getString("disabledTextColor")))
  14 -> androidx.compose.material3.MenuDefaults.itemVibrantColors(`leadingIconColor` = parseComposeColor(getString("leadingIconColor")), `trailingIconColor` = parseComposeColor(getString("trailingIconColor")), `disabledTextColor` = parseComposeColor(getString("disabledTextColor")))
  15 -> androidx.compose.material3.MenuDefaults.itemVibrantColors(`textColor` = parseComposeColor(getString("textColor")), `leadingIconColor` = parseComposeColor(getString("leadingIconColor")), `trailingIconColor` = parseComposeColor(getString("trailingIconColor")), `disabledTextColor` = parseComposeColor(getString("disabledTextColor")))
  16 -> androidx.compose.material3.MenuDefaults.itemVibrantColors(`disabledLeadingIconColor` = parseComposeColor(getString("disabledLeadingIconColor")))
  17 -> androidx.compose.material3.MenuDefaults.itemVibrantColors(`textColor` = parseComposeColor(getString("textColor")), `disabledLeadingIconColor` = parseComposeColor(getString("disabledLeadingIconColor")))
  18 -> androidx.compose.material3.MenuDefaults.itemVibrantColors(`leadingIconColor` = parseComposeColor(getString("leadingIconColor")), `disabledLeadingIconColor` = parseComposeColor(getString("disabledLeadingIconColor")))
  19 -> androidx.compose.material3.MenuDefaults.itemVibrantColors(`textColor` = parseComposeColor(getString("textColor")), `leadingIconColor` = parseComposeColor(getString("leadingIconColor")), `disabledLeadingIconColor` = parseComposeColor(getString("disabledLeadingIconColor")))
  20 -> androidx.compose.material3.MenuDefaults.itemVibrantColors(`trailingIconColor` = parseComposeColor(getString("trailingIconColor")), `disabledLeadingIconColor` = parseComposeColor(getString("disabledLeadingIconColor")))
  21 -> androidx.compose.material3.MenuDefaults.itemVibrantColors(`textColor` = parseComposeColor(getString("textColor")), `trailingIconColor` = parseComposeColor(getString("trailingIconColor")), `disabledLeadingIconColor` = parseComposeColor(getString("disabledLeadingIconColor")))
  22 -> androidx.compose.material3.MenuDefaults.itemVibrantColors(`leadingIconColor` = parseComposeColor(getString("leadingIconColor")), `trailingIconColor` = parseComposeColor(getString("trailingIconColor")), `disabledLeadingIconColor` = parseComposeColor(getString("disabledLeadingIconColor")))
  23 -> androidx.compose.material3.MenuDefaults.itemVibrantColors(`textColor` = parseComposeColor(getString("textColor")), `leadingIconColor` = parseComposeColor(getString("leadingIconColor")), `trailingIconColor` = parseComposeColor(getString("trailingIconColor")), `disabledLeadingIconColor` = parseComposeColor(getString("disabledLeadingIconColor")))
  24 -> androidx.compose.material3.MenuDefaults.itemVibrantColors(`disabledTextColor` = parseComposeColor(getString("disabledTextColor")), `disabledLeadingIconColor` = parseComposeColor(getString("disabledLeadingIconColor")))
  25 -> androidx.compose.material3.MenuDefaults.itemVibrantColors(`textColor` = parseComposeColor(getString("textColor")), `disabledTextColor` = parseComposeColor(getString("disabledTextColor")), `disabledLeadingIconColor` = parseComposeColor(getString("disabledLeadingIconColor")))
  26 -> androidx.compose.material3.MenuDefaults.itemVibrantColors(`leadingIconColor` = parseComposeColor(getString("leadingIconColor")), `disabledTextColor` = parseComposeColor(getString("disabledTextColor")), `disabledLeadingIconColor` = parseComposeColor(getString("disabledLeadingIconColor")))
  27 -> androidx.compose.material3.MenuDefaults.itemVibrantColors(`textColor` = parseComposeColor(getString("textColor")), `leadingIconColor` = parseComposeColor(getString("leadingIconColor")), `disabledTextColor` = parseComposeColor(getString("disabledTextColor")), `disabledLeadingIconColor` = parseComposeColor(getString("disabledLeadingIconColor")))
  28 -> androidx.compose.material3.MenuDefaults.itemVibrantColors(`trailingIconColor` = parseComposeColor(getString("trailingIconColor")), `disabledTextColor` = parseComposeColor(getString("disabledTextColor")), `disabledLeadingIconColor` = parseComposeColor(getString("disabledLeadingIconColor")))
  29 -> androidx.compose.material3.MenuDefaults.itemVibrantColors(`textColor` = parseComposeColor(getString("textColor")), `trailingIconColor` = parseComposeColor(getString("trailingIconColor")), `disabledTextColor` = parseComposeColor(getString("disabledTextColor")), `disabledLeadingIconColor` = parseComposeColor(getString("disabledLeadingIconColor")))
  30 -> androidx.compose.material3.MenuDefaults.itemVibrantColors(`leadingIconColor` = parseComposeColor(getString("leadingIconColor")), `trailingIconColor` = parseComposeColor(getString("trailingIconColor")), `disabledTextColor` = parseComposeColor(getString("disabledTextColor")), `disabledLeadingIconColor` = parseComposeColor(getString("disabledLeadingIconColor")))
  31 -> androidx.compose.material3.MenuDefaults.itemVibrantColors(`textColor` = parseComposeColor(getString("textColor")), `leadingIconColor` = parseComposeColor(getString("leadingIconColor")), `trailingIconColor` = parseComposeColor(getString("trailingIconColor")), `disabledTextColor` = parseComposeColor(getString("disabledTextColor")), `disabledLeadingIconColor` = parseComposeColor(getString("disabledLeadingIconColor")))
  32 -> androidx.compose.material3.MenuDefaults.itemVibrantColors(`disabledTrailingIconColor` = parseComposeColor(getString("disabledTrailingIconColor")))
  33 -> androidx.compose.material3.MenuDefaults.itemVibrantColors(`textColor` = parseComposeColor(getString("textColor")), `disabledTrailingIconColor` = parseComposeColor(getString("disabledTrailingIconColor")))
  34 -> androidx.compose.material3.MenuDefaults.itemVibrantColors(`leadingIconColor` = parseComposeColor(getString("leadingIconColor")), `disabledTrailingIconColor` = parseComposeColor(getString("disabledTrailingIconColor")))
  35 -> androidx.compose.material3.MenuDefaults.itemVibrantColors(`textColor` = parseComposeColor(getString("textColor")), `leadingIconColor` = parseComposeColor(getString("leadingIconColor")), `disabledTrailingIconColor` = parseComposeColor(getString("disabledTrailingIconColor")))
  36 -> androidx.compose.material3.MenuDefaults.itemVibrantColors(`trailingIconColor` = parseComposeColor(getString("trailingIconColor")), `disabledTrailingIconColor` = parseComposeColor(getString("disabledTrailingIconColor")))
  37 -> androidx.compose.material3.MenuDefaults.itemVibrantColors(`textColor` = parseComposeColor(getString("textColor")), `trailingIconColor` = parseComposeColor(getString("trailingIconColor")), `disabledTrailingIconColor` = parseComposeColor(getString("disabledTrailingIconColor")))
  38 -> androidx.compose.material3.MenuDefaults.itemVibrantColors(`leadingIconColor` = parseComposeColor(getString("leadingIconColor")), `trailingIconColor` = parseComposeColor(getString("trailingIconColor")), `disabledTrailingIconColor` = parseComposeColor(getString("disabledTrailingIconColor")))
  39 -> androidx.compose.material3.MenuDefaults.itemVibrantColors(`textColor` = parseComposeColor(getString("textColor")), `leadingIconColor` = parseComposeColor(getString("leadingIconColor")), `trailingIconColor` = parseComposeColor(getString("trailingIconColor")), `disabledTrailingIconColor` = parseComposeColor(getString("disabledTrailingIconColor")))
  40 -> androidx.compose.material3.MenuDefaults.itemVibrantColors(`disabledTextColor` = parseComposeColor(getString("disabledTextColor")), `disabledTrailingIconColor` = parseComposeColor(getString("disabledTrailingIconColor")))
  41 -> androidx.compose.material3.MenuDefaults.itemVibrantColors(`textColor` = parseComposeColor(getString("textColor")), `disabledTextColor` = parseComposeColor(getString("disabledTextColor")), `disabledTrailingIconColor` = parseComposeColor(getString("disabledTrailingIconColor")))
  42 -> androidx.compose.material3.MenuDefaults.itemVibrantColors(`leadingIconColor` = parseComposeColor(getString("leadingIconColor")), `disabledTextColor` = parseComposeColor(getString("disabledTextColor")), `disabledTrailingIconColor` = parseComposeColor(getString("disabledTrailingIconColor")))
  43 -> androidx.compose.material3.MenuDefaults.itemVibrantColors(`textColor` = parseComposeColor(getString("textColor")), `leadingIconColor` = parseComposeColor(getString("leadingIconColor")), `disabledTextColor` = parseComposeColor(getString("disabledTextColor")), `disabledTrailingIconColor` = parseComposeColor(getString("disabledTrailingIconColor")))
  44 -> androidx.compose.material3.MenuDefaults.itemVibrantColors(`trailingIconColor` = parseComposeColor(getString("trailingIconColor")), `disabledTextColor` = parseComposeColor(getString("disabledTextColor")), `disabledTrailingIconColor` = parseComposeColor(getString("disabledTrailingIconColor")))
  45 -> androidx.compose.material3.MenuDefaults.itemVibrantColors(`textColor` = parseComposeColor(getString("textColor")), `trailingIconColor` = parseComposeColor(getString("trailingIconColor")), `disabledTextColor` = parseComposeColor(getString("disabledTextColor")), `disabledTrailingIconColor` = parseComposeColor(getString("disabledTrailingIconColor")))
  46 -> androidx.compose.material3.MenuDefaults.itemVibrantColors(`leadingIconColor` = parseComposeColor(getString("leadingIconColor")), `trailingIconColor` = parseComposeColor(getString("trailingIconColor")), `disabledTextColor` = parseComposeColor(getString("disabledTextColor")), `disabledTrailingIconColor` = parseComposeColor(getString("disabledTrailingIconColor")))
  47 -> androidx.compose.material3.MenuDefaults.itemVibrantColors(`textColor` = parseComposeColor(getString("textColor")), `leadingIconColor` = parseComposeColor(getString("leadingIconColor")), `trailingIconColor` = parseComposeColor(getString("trailingIconColor")), `disabledTextColor` = parseComposeColor(getString("disabledTextColor")), `disabledTrailingIconColor` = parseComposeColor(getString("disabledTrailingIconColor")))
  48 -> androidx.compose.material3.MenuDefaults.itemVibrantColors(`disabledLeadingIconColor` = parseComposeColor(getString("disabledLeadingIconColor")), `disabledTrailingIconColor` = parseComposeColor(getString("disabledTrailingIconColor")))
  49 -> androidx.compose.material3.MenuDefaults.itemVibrantColors(`textColor` = parseComposeColor(getString("textColor")), `disabledLeadingIconColor` = parseComposeColor(getString("disabledLeadingIconColor")), `disabledTrailingIconColor` = parseComposeColor(getString("disabledTrailingIconColor")))
  50 -> androidx.compose.material3.MenuDefaults.itemVibrantColors(`leadingIconColor` = parseComposeColor(getString("leadingIconColor")), `disabledLeadingIconColor` = parseComposeColor(getString("disabledLeadingIconColor")), `disabledTrailingIconColor` = parseComposeColor(getString("disabledTrailingIconColor")))
  51 -> androidx.compose.material3.MenuDefaults.itemVibrantColors(`textColor` = parseComposeColor(getString("textColor")), `leadingIconColor` = parseComposeColor(getString("leadingIconColor")), `disabledLeadingIconColor` = parseComposeColor(getString("disabledLeadingIconColor")), `disabledTrailingIconColor` = parseComposeColor(getString("disabledTrailingIconColor")))
  52 -> androidx.compose.material3.MenuDefaults.itemVibrantColors(`trailingIconColor` = parseComposeColor(getString("trailingIconColor")), `disabledLeadingIconColor` = parseComposeColor(getString("disabledLeadingIconColor")), `disabledTrailingIconColor` = parseComposeColor(getString("disabledTrailingIconColor")))
  53 -> androidx.compose.material3.MenuDefaults.itemVibrantColors(`textColor` = parseComposeColor(getString("textColor")), `trailingIconColor` = parseComposeColor(getString("trailingIconColor")), `disabledLeadingIconColor` = parseComposeColor(getString("disabledLeadingIconColor")), `disabledTrailingIconColor` = parseComposeColor(getString("disabledTrailingIconColor")))
  54 -> androidx.compose.material3.MenuDefaults.itemVibrantColors(`leadingIconColor` = parseComposeColor(getString("leadingIconColor")), `trailingIconColor` = parseComposeColor(getString("trailingIconColor")), `disabledLeadingIconColor` = parseComposeColor(getString("disabledLeadingIconColor")), `disabledTrailingIconColor` = parseComposeColor(getString("disabledTrailingIconColor")))
  55 -> androidx.compose.material3.MenuDefaults.itemVibrantColors(`textColor` = parseComposeColor(getString("textColor")), `leadingIconColor` = parseComposeColor(getString("leadingIconColor")), `trailingIconColor` = parseComposeColor(getString("trailingIconColor")), `disabledLeadingIconColor` = parseComposeColor(getString("disabledLeadingIconColor")), `disabledTrailingIconColor` = parseComposeColor(getString("disabledTrailingIconColor")))
  56 -> androidx.compose.material3.MenuDefaults.itemVibrantColors(`disabledTextColor` = parseComposeColor(getString("disabledTextColor")), `disabledLeadingIconColor` = parseComposeColor(getString("disabledLeadingIconColor")), `disabledTrailingIconColor` = parseComposeColor(getString("disabledTrailingIconColor")))
  57 -> androidx.compose.material3.MenuDefaults.itemVibrantColors(`textColor` = parseComposeColor(getString("textColor")), `disabledTextColor` = parseComposeColor(getString("disabledTextColor")), `disabledLeadingIconColor` = parseComposeColor(getString("disabledLeadingIconColor")), `disabledTrailingIconColor` = parseComposeColor(getString("disabledTrailingIconColor")))
  58 -> androidx.compose.material3.MenuDefaults.itemVibrantColors(`leadingIconColor` = parseComposeColor(getString("leadingIconColor")), `disabledTextColor` = parseComposeColor(getString("disabledTextColor")), `disabledLeadingIconColor` = parseComposeColor(getString("disabledLeadingIconColor")), `disabledTrailingIconColor` = parseComposeColor(getString("disabledTrailingIconColor")))
  59 -> androidx.compose.material3.MenuDefaults.itemVibrantColors(`textColor` = parseComposeColor(getString("textColor")), `leadingIconColor` = parseComposeColor(getString("leadingIconColor")), `disabledTextColor` = parseComposeColor(getString("disabledTextColor")), `disabledLeadingIconColor` = parseComposeColor(getString("disabledLeadingIconColor")), `disabledTrailingIconColor` = parseComposeColor(getString("disabledTrailingIconColor")))
  60 -> androidx.compose.material3.MenuDefaults.itemVibrantColors(`trailingIconColor` = parseComposeColor(getString("trailingIconColor")), `disabledTextColor` = parseComposeColor(getString("disabledTextColor")), `disabledLeadingIconColor` = parseComposeColor(getString("disabledLeadingIconColor")), `disabledTrailingIconColor` = parseComposeColor(getString("disabledTrailingIconColor")))
  61 -> androidx.compose.material3.MenuDefaults.itemVibrantColors(`textColor` = parseComposeColor(getString("textColor")), `trailingIconColor` = parseComposeColor(getString("trailingIconColor")), `disabledTextColor` = parseComposeColor(getString("disabledTextColor")), `disabledLeadingIconColor` = parseComposeColor(getString("disabledLeadingIconColor")), `disabledTrailingIconColor` = parseComposeColor(getString("disabledTrailingIconColor")))
  62 -> androidx.compose.material3.MenuDefaults.itemVibrantColors(`leadingIconColor` = parseComposeColor(getString("leadingIconColor")), `trailingIconColor` = parseComposeColor(getString("trailingIconColor")), `disabledTextColor` = parseComposeColor(getString("disabledTextColor")), `disabledLeadingIconColor` = parseComposeColor(getString("disabledLeadingIconColor")), `disabledTrailingIconColor` = parseComposeColor(getString("disabledTrailingIconColor")))
  63 -> androidx.compose.material3.MenuDefaults.itemVibrantColors(`textColor` = parseComposeColor(getString("textColor")), `leadingIconColor` = parseComposeColor(getString("leadingIconColor")), `trailingIconColor` = parseComposeColor(getString("trailingIconColor")), `disabledTextColor` = parseComposeColor(getString("disabledTextColor")), `disabledLeadingIconColor` = parseComposeColor(getString("disabledLeadingIconColor")), `disabledTrailingIconColor` = parseComposeColor(getString("disabledTrailingIconColor")))
  else -> error("Invalid generated arguments for androidx.compose.material3.MenuDefaults.itemVibrantColors")
}

internal fun JSONObject.decodeComposeMenuItemShapesValue(): androidx.compose.material3.MenuItemShapes = androidx.compose.material3.MenuItemShapes(
  `shape` = composeShape("shape"),
  `selectedShape` = composeShape("selectedShape"),
)

internal fun JSONObject.decodeComposeModalBottomSheetPropertiesValue(): androidx.compose.material3.ModalBottomSheetProperties = when ((if (has("securePolicy")) 1 else 0) + (if (has("shouldDismissOnBackPress")) 2 else 0) + (if (has("shouldDismissOnClickOutside")) 4 else 0)) {
  0 -> androidx.compose.material3.ModalBottomSheetProperties(`isAppearanceLightStatusBars` = getBoolean("isAppearanceLightStatusBars"), `isAppearanceLightNavigationBars` = getBoolean("isAppearanceLightNavigationBars"))
  1 -> androidx.compose.material3.ModalBottomSheetProperties(`isAppearanceLightStatusBars` = getBoolean("isAppearanceLightStatusBars"), `isAppearanceLightNavigationBars` = getBoolean("isAppearanceLightNavigationBars"), `securePolicy` = toComposeSecureFlagPolicyOption(getString("securePolicy")))
  2 -> androidx.compose.material3.ModalBottomSheetProperties(`isAppearanceLightStatusBars` = getBoolean("isAppearanceLightStatusBars"), `isAppearanceLightNavigationBars` = getBoolean("isAppearanceLightNavigationBars"), `shouldDismissOnBackPress` = getBoolean("shouldDismissOnBackPress"))
  3 -> androidx.compose.material3.ModalBottomSheetProperties(`isAppearanceLightStatusBars` = getBoolean("isAppearanceLightStatusBars"), `isAppearanceLightNavigationBars` = getBoolean("isAppearanceLightNavigationBars"), `securePolicy` = toComposeSecureFlagPolicyOption(getString("securePolicy")), `shouldDismissOnBackPress` = getBoolean("shouldDismissOnBackPress"))
  4 -> androidx.compose.material3.ModalBottomSheetProperties(`isAppearanceLightStatusBars` = getBoolean("isAppearanceLightStatusBars"), `isAppearanceLightNavigationBars` = getBoolean("isAppearanceLightNavigationBars"), `shouldDismissOnClickOutside` = getBoolean("shouldDismissOnClickOutside"))
  5 -> androidx.compose.material3.ModalBottomSheetProperties(`isAppearanceLightStatusBars` = getBoolean("isAppearanceLightStatusBars"), `isAppearanceLightNavigationBars` = getBoolean("isAppearanceLightNavigationBars"), `securePolicy` = toComposeSecureFlagPolicyOption(getString("securePolicy")), `shouldDismissOnClickOutside` = getBoolean("shouldDismissOnClickOutside"))
  6 -> androidx.compose.material3.ModalBottomSheetProperties(`isAppearanceLightStatusBars` = getBoolean("isAppearanceLightStatusBars"), `isAppearanceLightNavigationBars` = getBoolean("isAppearanceLightNavigationBars"), `shouldDismissOnBackPress` = getBoolean("shouldDismissOnBackPress"), `shouldDismissOnClickOutside` = getBoolean("shouldDismissOnClickOutside"))
  7 -> androidx.compose.material3.ModalBottomSheetProperties(`isAppearanceLightStatusBars` = getBoolean("isAppearanceLightStatusBars"), `isAppearanceLightNavigationBars` = getBoolean("isAppearanceLightNavigationBars"), `securePolicy` = toComposeSecureFlagPolicyOption(getString("securePolicy")), `shouldDismissOnBackPress` = getBoolean("shouldDismissOnBackPress"), `shouldDismissOnClickOutside` = getBoolean("shouldDismissOnClickOutside"))
  else -> error("Invalid generated arguments for ComposeModalBottomSheetPropertiesValue")
}

internal fun JSONObject.decodeComposeModalWideNavigationRailPropertiesValue(): androidx.compose.material3.ModalWideNavigationRailProperties = when ((if (has("securePolicy")) 1 else 0) + (if (has("shouldDismissOnBackPress")) 2 else 0)) {
  0 -> androidx.compose.material3.ModalWideNavigationRailProperties()
  1 -> androidx.compose.material3.ModalWideNavigationRailProperties(`securePolicy` = toComposeSecureFlagPolicyOption(getString("securePolicy")))
  2 -> androidx.compose.material3.ModalWideNavigationRailProperties(`shouldDismissOnBackPress` = getBoolean("shouldDismissOnBackPress"))
  3 -> androidx.compose.material3.ModalWideNavigationRailProperties(`securePolicy` = toComposeSecureFlagPolicyOption(getString("securePolicy")), `shouldDismissOnBackPress` = getBoolean("shouldDismissOnBackPress"))
  else -> error("Invalid generated arguments for ComposeModalWideNavigationRailPropertiesValue")
}

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
  `selectedTextColorTopIconPosition` = parseComposeColor(getString("selectedTextColorTopIconPosition")),
  `selectedTextColorStartIconPosition` = parseComposeColor(getString("selectedTextColorStartIconPosition")),
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

internal fun JSONObject.decodeComposeRippleConfigurationValue(): androidx.compose.material3.RippleConfiguration = when ((if (has("color")) 1 else 0)) {
  0 -> androidx.compose.material3.RippleConfiguration()
  1 -> androidx.compose.material3.RippleConfiguration(`color` = parseComposeColor(getString("color")))
  else -> error("Invalid generated arguments for ComposeRippleConfigurationValue")
}

internal fun JSONObject.decodeComposeScrollFieldColorsValue(): androidx.compose.material3.ScrollFieldColors = androidx.compose.material3.ScrollFieldColors(
  `containerColor` = parseComposeColor(getString("containerColor")),
  `contentColor` = parseComposeColor(getString("contentColor")),
  `selectedContentColor` = parseComposeColor(getString("selectedContentColor")),
  `disabledContainerColor` = parseComposeColor(getString("disabledContainerColor")),
  `disabledContentColor` = parseComposeColor(getString("disabledContentColor")),
  `disabledSelectedContentColor` = parseComposeColor(getString("disabledSelectedContentColor")),
)

@Composable
internal fun JSONObject.decodeComposeScrollFieldStateValue(): androidx.compose.material3.ScrollFieldState = when (val factory = getString("factory")) {
  "rememberScrollFieldState" -> decodeComposeScrollFieldStateValueFactory0()
  else -> error("Unknown ComposeScrollFieldStateValue factory: " + factory)
}

@Composable
private fun JSONObject.decodeComposeScrollFieldStateValueFactory0(): androidx.compose.material3.ScrollFieldState = when ((if (has("index")) 1 else 0)) {
  0 -> androidx.compose.material3.rememberScrollFieldState(`itemCount` = getInt("itemCount"))
  1 -> androidx.compose.material3.rememberScrollFieldState(`itemCount` = getInt("itemCount"), `index` = getInt("index"))
  else -> error("Invalid generated arguments for androidx.compose.material3.rememberScrollFieldState")
}

internal fun JSONObject.decodeComposeSearchBarColorsValue(): androidx.compose.material3.SearchBarColors = androidx.compose.material3.SearchBarColors(
  `containerColor` = parseComposeColor(getString("containerColor")),
  `dividerColor` = parseComposeColor(getString("dividerColor")),
  `inputFieldColors` = getJSONObject("inputFieldColors").decodeComposeTextFieldColorsValue(),
)

@Composable
internal fun JSONObject.decodeComposeSearchBarScrollBehaviorValue(): androidx.compose.material3.SearchBarScrollBehavior = when (val factory = getString("factory")) {
  "SearchBarDefaults.enterAlwaysSearchBarScrollBehavior" -> decodeComposeSearchBarScrollBehaviorValueFactory0()
  else -> error("Unknown ComposeSearchBarScrollBehaviorValue factory: " + factory)
}

@Composable
private fun JSONObject.decodeComposeSearchBarScrollBehaviorValueFactory0(): androidx.compose.material3.SearchBarScrollBehavior = when ((if (has("reverseLayout")) 1 else 0)) {
  0 -> androidx.compose.material3.SearchBarDefaults.enterAlwaysSearchBarScrollBehavior()
  1 -> androidx.compose.material3.SearchBarDefaults.enterAlwaysSearchBarScrollBehavior(`reverseLayout` = getBoolean("reverseLayout"))
  else -> error("Invalid generated arguments for androidx.compose.material3.SearchBarDefaults.enterAlwaysSearchBarScrollBehavior")
}

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

internal fun JSONObject.decodeComposeSelectableChipColorsValue(): androidx.compose.material3.SelectableChipColors = androidx.compose.material3.SelectableChipColors(
  `containerColor` = parseComposeColor(getString("containerColor")),
  `labelColor` = parseComposeColor(getString("labelColor")),
  `leadingIconColor` = parseComposeColor(getString("leadingIconColor")),
  `trailingIconColor` = parseComposeColor(getString("trailingIconColor")),
  `disabledContainerColor` = parseComposeColor(getString("disabledContainerColor")),
  `disabledLabelColor` = parseComposeColor(getString("disabledLabelColor")),
  `disabledLeadingIconColor` = parseComposeColor(getString("disabledLeadingIconColor")),
  `disabledTrailingIconColor` = parseComposeColor(getString("disabledTrailingIconColor")),
  `selectedContainerColor` = parseComposeColor(getString("selectedContainerColor")),
  `disabledSelectedContainerColor` = parseComposeColor(getString("disabledSelectedContainerColor")),
  `selectedLabelColor` = parseComposeColor(getString("selectedLabelColor")),
  `selectedLeadingIconColor` = parseComposeColor(getString("selectedLeadingIconColor")),
  `selectedTrailingIconColor` = parseComposeColor(getString("selectedTrailingIconColor")),
)

internal fun JSONObject.decodeComposeSelectableChipElevationValue(): androidx.compose.material3.SelectableChipElevation = androidx.compose.material3.SelectableChipElevation(
  `elevation` = getDouble("elevation").dp,
  `pressedElevation` = getDouble("pressedElevation").dp,
  `focusedElevation` = getDouble("focusedElevation").dp,
  `hoveredElevation` = getDouble("hoveredElevation").dp,
  `draggedElevation` = getDouble("draggedElevation").dp,
  `disabledElevation` = getDouble("disabledElevation").dp,
)

internal fun JSONObject.decodeComposeSelectableMenuItemColorsValue(): androidx.compose.material3.SelectableMenuItemColors = androidx.compose.material3.SelectableMenuItemColors(
  `textColor` = parseComposeColor(getString("textColor")),
  `containerColor` = parseComposeColor(getString("containerColor")),
  `leadingIconColor` = parseComposeColor(getString("leadingIconColor")),
  `trailingContentColor` = parseComposeColor(getString("trailingContentColor")),
  `disabledTextColor` = parseComposeColor(getString("disabledTextColor")),
  `disabledContainerColor` = parseComposeColor(getString("disabledContainerColor")),
  `disabledLeadingIconColor` = parseComposeColor(getString("disabledLeadingIconColor")),
  `disabledTrailingContentColor` = parseComposeColor(getString("disabledTrailingContentColor")),
  `selectedTextColor` = parseComposeColor(getString("selectedTextColor")),
  `selectedContainerColor` = parseComposeColor(getString("selectedContainerColor")),
  `selectedLeadingIconColor` = parseComposeColor(getString("selectedLeadingIconColor")),
  `selectedTrailingContentColor` = parseComposeColor(getString("selectedTrailingContentColor")),
)

internal fun JSONObject.decodeComposeShapesValue(): androidx.compose.material3.Shapes {
  var value = androidx.compose.material3.Shapes()
  if (has("extraSmall")) value = value.copy(`extraSmall` = getJSONObject("extraSmall").decodeComposeCornerBasedShapeValue())
  if (has("small")) value = value.copy(`small` = getJSONObject("small").decodeComposeCornerBasedShapeValue())
  if (has("medium")) value = value.copy(`medium` = getJSONObject("medium").decodeComposeCornerBasedShapeValue())
  if (has("large")) value = value.copy(`large` = getJSONObject("large").decodeComposeCornerBasedShapeValue())
  if (has("extraLarge")) value = value.copy(`extraLarge` = getJSONObject("extraLarge").decodeComposeCornerBasedShapeValue())
  if (has("largeIncreased")) value = value.copy(`largeIncreased` = getJSONObject("largeIncreased").decodeComposeCornerBasedShapeValue())
  if (has("extraLargeIncreased")) value = value.copy(`extraLargeIncreased` = getJSONObject("extraLargeIncreased").decodeComposeCornerBasedShapeValue())
  if (has("extraExtraLarge")) value = value.copy(`extraExtraLarge` = getJSONObject("extraExtraLarge").decodeComposeCornerBasedShapeValue())
  return value
}

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

internal fun JSONObject.decodeComposeSplitButtonShapesValue(): androidx.compose.material3.SplitButtonShapes = androidx.compose.material3.SplitButtonShapes(
  `shape` = composeShape("shape"),
  `pressedShape` = if (get("pressedShape") === JSONObject.NULL) null else composeShape("pressedShape"),
  `checkedShape` = if (get("checkedShape") === JSONObject.NULL) null else composeShape("checkedShape"),
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
  "TextFieldLabelPosition.Cutout" -> decodeComposeTextFieldLabelPositionValueFactory1()
  "TextFieldLabelPosition.Inside" -> decodeComposeTextFieldLabelPositionValueFactory2()
  else -> error("Unknown ComposeTextFieldLabelPositionValue factory: " + factory)
}

private fun JSONObject.decodeComposeTextFieldLabelPositionValueFactory0(): androidx.compose.material3.TextFieldLabelPosition = when ((if (has("alignment")) 1 else 0)) {
  0 -> androidx.compose.material3.TextFieldLabelPosition.Above()
  1 -> androidx.compose.material3.TextFieldLabelPosition.Above(`alignment` = toComposeHorizontalAlignment(getString("alignment")))
  else -> error("Invalid generated arguments for androidx.compose.material3.TextFieldLabelPosition.Above")
}

private fun JSONObject.decodeComposeTextFieldLabelPositionValueFactory1(): androidx.compose.material3.TextFieldLabelPosition = when ((if (has("isAlwaysMinimized")) 1 else 0) + (if (has("minimizedAlignment")) 2 else 0) + (if (has("expandedAlignment")) 4 else 0)) {
  0 -> androidx.compose.material3.TextFieldLabelPosition.Cutout()
  1 -> androidx.compose.material3.TextFieldLabelPosition.Cutout(`isAlwaysMinimized` = getBoolean("isAlwaysMinimized"))
  2 -> androidx.compose.material3.TextFieldLabelPosition.Cutout(`minimizedAlignment` = toComposeHorizontalAlignment(getString("minimizedAlignment")))
  3 -> androidx.compose.material3.TextFieldLabelPosition.Cutout(`isAlwaysMinimized` = getBoolean("isAlwaysMinimized"), `minimizedAlignment` = toComposeHorizontalAlignment(getString("minimizedAlignment")))
  4 -> androidx.compose.material3.TextFieldLabelPosition.Cutout(`expandedAlignment` = toComposeHorizontalAlignment(getString("expandedAlignment")))
  5 -> androidx.compose.material3.TextFieldLabelPosition.Cutout(`isAlwaysMinimized` = getBoolean("isAlwaysMinimized"), `expandedAlignment` = toComposeHorizontalAlignment(getString("expandedAlignment")))
  6 -> androidx.compose.material3.TextFieldLabelPosition.Cutout(`minimizedAlignment` = toComposeHorizontalAlignment(getString("minimizedAlignment")), `expandedAlignment` = toComposeHorizontalAlignment(getString("expandedAlignment")))
  7 -> androidx.compose.material3.TextFieldLabelPosition.Cutout(`isAlwaysMinimized` = getBoolean("isAlwaysMinimized"), `minimizedAlignment` = toComposeHorizontalAlignment(getString("minimizedAlignment")), `expandedAlignment` = toComposeHorizontalAlignment(getString("expandedAlignment")))
  else -> error("Invalid generated arguments for androidx.compose.material3.TextFieldLabelPosition.Cutout")
}

private fun JSONObject.decodeComposeTextFieldLabelPositionValueFactory2(): androidx.compose.material3.TextFieldLabelPosition = when ((if (has("isAlwaysMinimized")) 1 else 0) + (if (has("minimizedAlignment")) 2 else 0) + (if (has("expandedAlignment")) 4 else 0)) {
  0 -> androidx.compose.material3.TextFieldLabelPosition.Inside()
  1 -> androidx.compose.material3.TextFieldLabelPosition.Inside(`isAlwaysMinimized` = getBoolean("isAlwaysMinimized"))
  2 -> androidx.compose.material3.TextFieldLabelPosition.Inside(`minimizedAlignment` = toComposeHorizontalAlignment(getString("minimizedAlignment")))
  3 -> androidx.compose.material3.TextFieldLabelPosition.Inside(`isAlwaysMinimized` = getBoolean("isAlwaysMinimized"), `minimizedAlignment` = toComposeHorizontalAlignment(getString("minimizedAlignment")))
  4 -> androidx.compose.material3.TextFieldLabelPosition.Inside(`expandedAlignment` = toComposeHorizontalAlignment(getString("expandedAlignment")))
  5 -> androidx.compose.material3.TextFieldLabelPosition.Inside(`isAlwaysMinimized` = getBoolean("isAlwaysMinimized"), `expandedAlignment` = toComposeHorizontalAlignment(getString("expandedAlignment")))
  6 -> androidx.compose.material3.TextFieldLabelPosition.Inside(`minimizedAlignment` = toComposeHorizontalAlignment(getString("minimizedAlignment")), `expandedAlignment` = toComposeHorizontalAlignment(getString("expandedAlignment")))
  7 -> androidx.compose.material3.TextFieldLabelPosition.Inside(`isAlwaysMinimized` = getBoolean("isAlwaysMinimized"), `minimizedAlignment` = toComposeHorizontalAlignment(getString("minimizedAlignment")), `expandedAlignment` = toComposeHorizontalAlignment(getString("expandedAlignment")))
  else -> error("Invalid generated arguments for androidx.compose.material3.TextFieldLabelPosition.Inside")
}

internal fun JSONObject.decodeComposeTimeInputColorsValue(): androidx.compose.material3.TimeInputColors = androidx.compose.material3.TimeInputColors(
  `containerColor` = parseComposeColor(getString("containerColor")),
  `periodSelectorBorderColor` = parseComposeColor(getString("periodSelectorBorderColor")),
  `periodSelectorSelectedContainerColor` = parseComposeColor(getString("periodSelectorSelectedContainerColor")),
  `periodSelectorContainerColor` = parseComposeColor(getString("periodSelectorContainerColor")),
  `periodSelectorSelectedContentColor` = parseComposeColor(getString("periodSelectorSelectedContentColor")),
  `periodSelectorContentColor` = parseComposeColor(getString("periodSelectorContentColor")),
  `timeTextFieldColors` = getJSONObject("timeTextFieldColors").decodeComposeTextFieldColorsValue(),
)

internal fun JSONObject.decodeComposeTimePickerColorsValue(): androidx.compose.material3.TimePickerColors = androidx.compose.material3.TimePickerColors(
  `clockDialColor` = parseComposeColor(getString("clockDialColor")),
  `selectorColor` = parseComposeColor(getString("selectorColor")),
  `containerColor` = parseComposeColor(getString("containerColor")),
  `periodSelectorBorderColor` = parseComposeColor(getString("periodSelectorBorderColor")),
  `clockDialSelectedContentColor` = parseComposeColor(getString("clockDialSelectedContentColor")),
  `clockDialContentColor` = parseComposeColor(getString("clockDialContentColor")),
  `periodSelectorSelectedContainerColor` = parseComposeColor(getString("periodSelectorSelectedContainerColor")),
  `periodSelectorContainerColor` = parseComposeColor(getString("periodSelectorContainerColor")),
  `periodSelectorSelectedContentColor` = parseComposeColor(getString("periodSelectorSelectedContentColor")),
  `periodSelectorContentColor` = parseComposeColor(getString("periodSelectorContentColor")),
  `timeSelectorSelectedContainerColor` = parseComposeColor(getString("timeSelectorSelectedContainerColor")),
  `timeSelectorContainerColor` = parseComposeColor(getString("timeSelectorContainerColor")),
  `timeSelectorSelectedContentColor` = parseComposeColor(getString("timeSelectorSelectedContentColor")),
  `timeSelectorContentColor` = parseComposeColor(getString("timeSelectorContentColor")),
)

internal fun JSONObject.decodeComposeTimePickerShapesValue(): androidx.compose.material3.TimePickerShapes = androidx.compose.material3.TimePickerShapes(
  `timeFieldShape` = composeShape("timeFieldShape"),
  `periodSelectorShape` = composeShape("periodSelectorShape"),
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
internal fun JSONObject.decodeComposeToggleButtonElevationValue(): androidx.compose.material3.ToggleButtonElevation = when (val factory = getString("factory")) {
  "ElevatedToggleButtonDefaults.elevation" -> decodeComposeToggleButtonElevationValueFactory0()
  "FilledTonalToggleButtonDefaults.elevation" -> decodeComposeToggleButtonElevationValueFactory1()
  "ToggleButtonDefaults.elevation" -> decodeComposeToggleButtonElevationValueFactory2()
  else -> error("Unknown ComposeToggleButtonElevationValue factory: " + factory)
}

@Composable
private fun JSONObject.decodeComposeToggleButtonElevationValueFactory0(): androidx.compose.material3.ToggleButtonElevation = when ((if (has("defaultElevation")) 1 else 0) + (if (has("pressedElevation")) 2 else 0) + (if (has("focusedElevation")) 4 else 0) + (if (has("hoveredElevation")) 8 else 0) + (if (has("disabledElevation")) 16 else 0)) {
  0 -> androidx.compose.material3.ElevatedToggleButtonDefaults.elevation()
  1 -> androidx.compose.material3.ElevatedToggleButtonDefaults.elevation(`defaultElevation` = getDouble("defaultElevation").dp)
  2 -> androidx.compose.material3.ElevatedToggleButtonDefaults.elevation(`pressedElevation` = getDouble("pressedElevation").dp)
  3 -> androidx.compose.material3.ElevatedToggleButtonDefaults.elevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp)
  4 -> androidx.compose.material3.ElevatedToggleButtonDefaults.elevation(`focusedElevation` = getDouble("focusedElevation").dp)
  5 -> androidx.compose.material3.ElevatedToggleButtonDefaults.elevation(`defaultElevation` = getDouble("defaultElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp)
  6 -> androidx.compose.material3.ElevatedToggleButtonDefaults.elevation(`pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp)
  7 -> androidx.compose.material3.ElevatedToggleButtonDefaults.elevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp)
  8 -> androidx.compose.material3.ElevatedToggleButtonDefaults.elevation(`hoveredElevation` = getDouble("hoveredElevation").dp)
  9 -> androidx.compose.material3.ElevatedToggleButtonDefaults.elevation(`defaultElevation` = getDouble("defaultElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp)
  10 -> androidx.compose.material3.ElevatedToggleButtonDefaults.elevation(`pressedElevation` = getDouble("pressedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp)
  11 -> androidx.compose.material3.ElevatedToggleButtonDefaults.elevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp)
  12 -> androidx.compose.material3.ElevatedToggleButtonDefaults.elevation(`focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp)
  13 -> androidx.compose.material3.ElevatedToggleButtonDefaults.elevation(`defaultElevation` = getDouble("defaultElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp)
  14 -> androidx.compose.material3.ElevatedToggleButtonDefaults.elevation(`pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp)
  15 -> androidx.compose.material3.ElevatedToggleButtonDefaults.elevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp)
  16 -> androidx.compose.material3.ElevatedToggleButtonDefaults.elevation(`disabledElevation` = getDouble("disabledElevation").dp)
  17 -> androidx.compose.material3.ElevatedToggleButtonDefaults.elevation(`defaultElevation` = getDouble("defaultElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  18 -> androidx.compose.material3.ElevatedToggleButtonDefaults.elevation(`pressedElevation` = getDouble("pressedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  19 -> androidx.compose.material3.ElevatedToggleButtonDefaults.elevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  20 -> androidx.compose.material3.ElevatedToggleButtonDefaults.elevation(`focusedElevation` = getDouble("focusedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  21 -> androidx.compose.material3.ElevatedToggleButtonDefaults.elevation(`defaultElevation` = getDouble("defaultElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  22 -> androidx.compose.material3.ElevatedToggleButtonDefaults.elevation(`pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  23 -> androidx.compose.material3.ElevatedToggleButtonDefaults.elevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  24 -> androidx.compose.material3.ElevatedToggleButtonDefaults.elevation(`hoveredElevation` = getDouble("hoveredElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  25 -> androidx.compose.material3.ElevatedToggleButtonDefaults.elevation(`defaultElevation` = getDouble("defaultElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  26 -> androidx.compose.material3.ElevatedToggleButtonDefaults.elevation(`pressedElevation` = getDouble("pressedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  27 -> androidx.compose.material3.ElevatedToggleButtonDefaults.elevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  28 -> androidx.compose.material3.ElevatedToggleButtonDefaults.elevation(`focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  29 -> androidx.compose.material3.ElevatedToggleButtonDefaults.elevation(`defaultElevation` = getDouble("defaultElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  30 -> androidx.compose.material3.ElevatedToggleButtonDefaults.elevation(`pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  31 -> androidx.compose.material3.ElevatedToggleButtonDefaults.elevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  else -> error("Invalid generated arguments for androidx.compose.material3.ElevatedToggleButtonDefaults.elevation")
}

@Composable
private fun JSONObject.decodeComposeToggleButtonElevationValueFactory1(): androidx.compose.material3.ToggleButtonElevation = when ((if (has("defaultElevation")) 1 else 0) + (if (has("pressedElevation")) 2 else 0) + (if (has("focusedElevation")) 4 else 0) + (if (has("hoveredElevation")) 8 else 0) + (if (has("disabledElevation")) 16 else 0)) {
  0 -> androidx.compose.material3.FilledTonalToggleButtonDefaults.elevation()
  1 -> androidx.compose.material3.FilledTonalToggleButtonDefaults.elevation(`defaultElevation` = getDouble("defaultElevation").dp)
  2 -> androidx.compose.material3.FilledTonalToggleButtonDefaults.elevation(`pressedElevation` = getDouble("pressedElevation").dp)
  3 -> androidx.compose.material3.FilledTonalToggleButtonDefaults.elevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp)
  4 -> androidx.compose.material3.FilledTonalToggleButtonDefaults.elevation(`focusedElevation` = getDouble("focusedElevation").dp)
  5 -> androidx.compose.material3.FilledTonalToggleButtonDefaults.elevation(`defaultElevation` = getDouble("defaultElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp)
  6 -> androidx.compose.material3.FilledTonalToggleButtonDefaults.elevation(`pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp)
  7 -> androidx.compose.material3.FilledTonalToggleButtonDefaults.elevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp)
  8 -> androidx.compose.material3.FilledTonalToggleButtonDefaults.elevation(`hoveredElevation` = getDouble("hoveredElevation").dp)
  9 -> androidx.compose.material3.FilledTonalToggleButtonDefaults.elevation(`defaultElevation` = getDouble("defaultElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp)
  10 -> androidx.compose.material3.FilledTonalToggleButtonDefaults.elevation(`pressedElevation` = getDouble("pressedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp)
  11 -> androidx.compose.material3.FilledTonalToggleButtonDefaults.elevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp)
  12 -> androidx.compose.material3.FilledTonalToggleButtonDefaults.elevation(`focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp)
  13 -> androidx.compose.material3.FilledTonalToggleButtonDefaults.elevation(`defaultElevation` = getDouble("defaultElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp)
  14 -> androidx.compose.material3.FilledTonalToggleButtonDefaults.elevation(`pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp)
  15 -> androidx.compose.material3.FilledTonalToggleButtonDefaults.elevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp)
  16 -> androidx.compose.material3.FilledTonalToggleButtonDefaults.elevation(`disabledElevation` = getDouble("disabledElevation").dp)
  17 -> androidx.compose.material3.FilledTonalToggleButtonDefaults.elevation(`defaultElevation` = getDouble("defaultElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  18 -> androidx.compose.material3.FilledTonalToggleButtonDefaults.elevation(`pressedElevation` = getDouble("pressedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  19 -> androidx.compose.material3.FilledTonalToggleButtonDefaults.elevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  20 -> androidx.compose.material3.FilledTonalToggleButtonDefaults.elevation(`focusedElevation` = getDouble("focusedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  21 -> androidx.compose.material3.FilledTonalToggleButtonDefaults.elevation(`defaultElevation` = getDouble("defaultElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  22 -> androidx.compose.material3.FilledTonalToggleButtonDefaults.elevation(`pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  23 -> androidx.compose.material3.FilledTonalToggleButtonDefaults.elevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  24 -> androidx.compose.material3.FilledTonalToggleButtonDefaults.elevation(`hoveredElevation` = getDouble("hoveredElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  25 -> androidx.compose.material3.FilledTonalToggleButtonDefaults.elevation(`defaultElevation` = getDouble("defaultElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  26 -> androidx.compose.material3.FilledTonalToggleButtonDefaults.elevation(`pressedElevation` = getDouble("pressedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  27 -> androidx.compose.material3.FilledTonalToggleButtonDefaults.elevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  28 -> androidx.compose.material3.FilledTonalToggleButtonDefaults.elevation(`focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  29 -> androidx.compose.material3.FilledTonalToggleButtonDefaults.elevation(`defaultElevation` = getDouble("defaultElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  30 -> androidx.compose.material3.FilledTonalToggleButtonDefaults.elevation(`pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  31 -> androidx.compose.material3.FilledTonalToggleButtonDefaults.elevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  else -> error("Invalid generated arguments for androidx.compose.material3.FilledTonalToggleButtonDefaults.elevation")
}

@Composable
private fun JSONObject.decodeComposeToggleButtonElevationValueFactory2(): androidx.compose.material3.ToggleButtonElevation = when ((if (has("defaultElevation")) 1 else 0) + (if (has("pressedElevation")) 2 else 0) + (if (has("focusedElevation")) 4 else 0) + (if (has("hoveredElevation")) 8 else 0) + (if (has("disabledElevation")) 16 else 0)) {
  0 -> androidx.compose.material3.ToggleButtonDefaults.elevation()
  1 -> androidx.compose.material3.ToggleButtonDefaults.elevation(`defaultElevation` = getDouble("defaultElevation").dp)
  2 -> androidx.compose.material3.ToggleButtonDefaults.elevation(`pressedElevation` = getDouble("pressedElevation").dp)
  3 -> androidx.compose.material3.ToggleButtonDefaults.elevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp)
  4 -> androidx.compose.material3.ToggleButtonDefaults.elevation(`focusedElevation` = getDouble("focusedElevation").dp)
  5 -> androidx.compose.material3.ToggleButtonDefaults.elevation(`defaultElevation` = getDouble("defaultElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp)
  6 -> androidx.compose.material3.ToggleButtonDefaults.elevation(`pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp)
  7 -> androidx.compose.material3.ToggleButtonDefaults.elevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp)
  8 -> androidx.compose.material3.ToggleButtonDefaults.elevation(`hoveredElevation` = getDouble("hoveredElevation").dp)
  9 -> androidx.compose.material3.ToggleButtonDefaults.elevation(`defaultElevation` = getDouble("defaultElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp)
  10 -> androidx.compose.material3.ToggleButtonDefaults.elevation(`pressedElevation` = getDouble("pressedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp)
  11 -> androidx.compose.material3.ToggleButtonDefaults.elevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp)
  12 -> androidx.compose.material3.ToggleButtonDefaults.elevation(`focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp)
  13 -> androidx.compose.material3.ToggleButtonDefaults.elevation(`defaultElevation` = getDouble("defaultElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp)
  14 -> androidx.compose.material3.ToggleButtonDefaults.elevation(`pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp)
  15 -> androidx.compose.material3.ToggleButtonDefaults.elevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp)
  16 -> androidx.compose.material3.ToggleButtonDefaults.elevation(`disabledElevation` = getDouble("disabledElevation").dp)
  17 -> androidx.compose.material3.ToggleButtonDefaults.elevation(`defaultElevation` = getDouble("defaultElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  18 -> androidx.compose.material3.ToggleButtonDefaults.elevation(`pressedElevation` = getDouble("pressedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  19 -> androidx.compose.material3.ToggleButtonDefaults.elevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  20 -> androidx.compose.material3.ToggleButtonDefaults.elevation(`focusedElevation` = getDouble("focusedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  21 -> androidx.compose.material3.ToggleButtonDefaults.elevation(`defaultElevation` = getDouble("defaultElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  22 -> androidx.compose.material3.ToggleButtonDefaults.elevation(`pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  23 -> androidx.compose.material3.ToggleButtonDefaults.elevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  24 -> androidx.compose.material3.ToggleButtonDefaults.elevation(`hoveredElevation` = getDouble("hoveredElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  25 -> androidx.compose.material3.ToggleButtonDefaults.elevation(`defaultElevation` = getDouble("defaultElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  26 -> androidx.compose.material3.ToggleButtonDefaults.elevation(`pressedElevation` = getDouble("pressedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  27 -> androidx.compose.material3.ToggleButtonDefaults.elevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  28 -> androidx.compose.material3.ToggleButtonDefaults.elevation(`focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  29 -> androidx.compose.material3.ToggleButtonDefaults.elevation(`defaultElevation` = getDouble("defaultElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  30 -> androidx.compose.material3.ToggleButtonDefaults.elevation(`pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  31 -> androidx.compose.material3.ToggleButtonDefaults.elevation(`defaultElevation` = getDouble("defaultElevation").dp, `pressedElevation` = getDouble("pressedElevation").dp, `focusedElevation` = getDouble("focusedElevation").dp, `hoveredElevation` = getDouble("hoveredElevation").dp, `disabledElevation` = getDouble("disabledElevation").dp)
  else -> error("Invalid generated arguments for androidx.compose.material3.ToggleButtonDefaults.elevation")
}

internal fun JSONObject.decodeComposeToggleButtonShapesValue(): androidx.compose.material3.ToggleButtonShapes = androidx.compose.material3.ToggleButtonShapes(
  `shape` = composeShape("shape"),
  `pressedShape` = composeShape("pressedShape"),
  `checkedShape` = composeShape("checkedShape"),
)

internal fun JSONObject.decodeComposeTopAppBarColorsValue(): androidx.compose.material3.TopAppBarColors = androidx.compose.material3.TopAppBarColors(
  `containerColor` = parseComposeColor(getString("containerColor")),
  `scrolledContainerColor` = parseComposeColor(getString("scrolledContainerColor")),
  `navigationIconContentColor` = parseComposeColor(getString("navigationIconContentColor")),
  `titleContentColor` = parseComposeColor(getString("titleContentColor")),
  `actionIconContentColor` = parseComposeColor(getString("actionIconContentColor")),
  `subtitleContentColor` = parseComposeColor(getString("subtitleContentColor")),
)

internal fun JSONObject.decodeComposeTypographyValue(): androidx.compose.material3.Typography {
  var value = androidx.compose.material3.Typography()
  if (has("displayLarge")) value = value.copy(`displayLarge` = getJSONObject("displayLarge").toTextStyle())
  if (has("displayMedium")) value = value.copy(`displayMedium` = getJSONObject("displayMedium").toTextStyle())
  if (has("displaySmall")) value = value.copy(`displaySmall` = getJSONObject("displaySmall").toTextStyle())
  if (has("headlineLarge")) value = value.copy(`headlineLarge` = getJSONObject("headlineLarge").toTextStyle())
  if (has("headlineMedium")) value = value.copy(`headlineMedium` = getJSONObject("headlineMedium").toTextStyle())
  if (has("headlineSmall")) value = value.copy(`headlineSmall` = getJSONObject("headlineSmall").toTextStyle())
  if (has("titleLarge")) value = value.copy(`titleLarge` = getJSONObject("titleLarge").toTextStyle())
  if (has("titleMedium")) value = value.copy(`titleMedium` = getJSONObject("titleMedium").toTextStyle())
  if (has("titleSmall")) value = value.copy(`titleSmall` = getJSONObject("titleSmall").toTextStyle())
  if (has("bodyLarge")) value = value.copy(`bodyLarge` = getJSONObject("bodyLarge").toTextStyle())
  if (has("bodyMedium")) value = value.copy(`bodyMedium` = getJSONObject("bodyMedium").toTextStyle())
  if (has("bodySmall")) value = value.copy(`bodySmall` = getJSONObject("bodySmall").toTextStyle())
  if (has("labelLarge")) value = value.copy(`labelLarge` = getJSONObject("labelLarge").toTextStyle())
  if (has("labelMedium")) value = value.copy(`labelMedium` = getJSONObject("labelMedium").toTextStyle())
  if (has("labelSmall")) value = value.copy(`labelSmall` = getJSONObject("labelSmall").toTextStyle())
  if (has("displayLargeEmphasized")) value = value.copy(`displayLargeEmphasized` = getJSONObject("displayLargeEmphasized").toTextStyle())
  if (has("displayMediumEmphasized")) value = value.copy(`displayMediumEmphasized` = getJSONObject("displayMediumEmphasized").toTextStyle())
  if (has("displaySmallEmphasized")) value = value.copy(`displaySmallEmphasized` = getJSONObject("displaySmallEmphasized").toTextStyle())
  if (has("headlineLargeEmphasized")) value = value.copy(`headlineLargeEmphasized` = getJSONObject("headlineLargeEmphasized").toTextStyle())
  if (has("headlineMediumEmphasized")) value = value.copy(`headlineMediumEmphasized` = getJSONObject("headlineMediumEmphasized").toTextStyle())
  if (has("headlineSmallEmphasized")) value = value.copy(`headlineSmallEmphasized` = getJSONObject("headlineSmallEmphasized").toTextStyle())
  if (has("titleLargeEmphasized")) value = value.copy(`titleLargeEmphasized` = getJSONObject("titleLargeEmphasized").toTextStyle())
  if (has("titleMediumEmphasized")) value = value.copy(`titleMediumEmphasized` = getJSONObject("titleMediumEmphasized").toTextStyle())
  if (has("titleSmallEmphasized")) value = value.copy(`titleSmallEmphasized` = getJSONObject("titleSmallEmphasized").toTextStyle())
  if (has("bodyLargeEmphasized")) value = value.copy(`bodyLargeEmphasized` = getJSONObject("bodyLargeEmphasized").toTextStyle())
  if (has("bodyMediumEmphasized")) value = value.copy(`bodyMediumEmphasized` = getJSONObject("bodyMediumEmphasized").toTextStyle())
  if (has("bodySmallEmphasized")) value = value.copy(`bodySmallEmphasized` = getJSONObject("bodySmallEmphasized").toTextStyle())
  if (has("labelLargeEmphasized")) value = value.copy(`labelLargeEmphasized` = getJSONObject("labelLargeEmphasized").toTextStyle())
  if (has("labelMediumEmphasized")) value = value.copy(`labelMediumEmphasized` = getJSONObject("labelMediumEmphasized").toTextStyle())
  if (has("labelSmallEmphasized")) value = value.copy(`labelSmallEmphasized` = getJSONObject("labelSmallEmphasized").toTextStyle())
  return value
}

internal fun JSONObject.decodeComposeWideNavigationRailColorsValue(): androidx.compose.material3.WideNavigationRailColors = androidx.compose.material3.WideNavigationRailColors(
  `containerColor` = parseComposeColor(getString("containerColor")),
  `contentColor` = parseComposeColor(getString("contentColor")),
  `modalContainerColor` = parseComposeColor(getString("modalContainerColor")),
  `modalScrimColor` = parseComposeColor(getString("modalScrimColor")),
  `modalContentColor` = parseComposeColor(getString("modalContentColor")),
)

@Composable
internal fun JSONObject.decodeComposePaneExpansionStateValue(): androidx.compose.material3.adaptive.layout.PaneExpansionState = when (val factory = getString("factory")) {
  "rememberPaneExpansionState" -> decodeComposePaneExpansionStateValueFactory0()
  else -> error("Unknown ComposePaneExpansionStateValue factory: " + factory)
}

@Composable
private fun JSONObject.decodeComposePaneExpansionStateValueFactory0(): androidx.compose.material3.adaptive.layout.PaneExpansionState = when ((if (has("key")) 1 else 0) + (if (has("initialAnchoredIndex")) 2 else 0)) {
  0 -> androidx.compose.material3.adaptive.layout.rememberPaneExpansionState()
  1 -> androidx.compose.material3.adaptive.layout.rememberPaneExpansionState(`key` = toComposePaneExpansionStateKeyValue(getString("key")))
  2 -> androidx.compose.material3.adaptive.layout.rememberPaneExpansionState(`initialAnchoredIndex` = getInt("initialAnchoredIndex"))
  3 -> androidx.compose.material3.adaptive.layout.rememberPaneExpansionState(`key` = toComposePaneExpansionStateKeyValue(getString("key")), `initialAnchoredIndex` = getInt("initialAnchoredIndex"))
  else -> error("Invalid generated arguments for androidx.compose.material3.adaptive.layout.rememberPaneExpansionState")
}

internal fun JSONObject.decodeComposePaneScaffoldDirectiveValue(): androidx.compose.material3.adaptive.layout.PaneScaffoldDirective = androidx.compose.material3.adaptive.layout.PaneScaffoldDirective(
  `maxHorizontalPartitions` = getInt("maxHorizontalPartitions"),
  `horizontalPartitionSpacerSize` = getDouble("horizontalPartitionSpacerSize").dp,
  `maxVerticalPartitions` = getInt("maxVerticalPartitions"),
  `verticalPartitionSpacerSize` = getDouble("verticalPartitionSpacerSize").dp,
  `defaultPanePreferredWidth` = getDouble("defaultPanePreferredWidth").dp,
  `defaultPanePreferredHeight` = getDouble("defaultPanePreferredHeight").dp,
  `excludedBounds` = getJSONArray("excludedBounds").let { items -> List(items.length()) { index -> with(items) { getJSONObject(index).decodeComposeRectValue() } } },
  `shouldAutoFocusCurrentDestination` = getBoolean("shouldAutoFocusCurrentDestination"),
)

internal fun JSONObject.decodeComposeThreePaneScaffoldValueValue(): androidx.compose.material3.adaptive.layout.ThreePaneScaffoldValue = androidx.compose.material3.adaptive.layout.ThreePaneScaffoldValue(
  `primary` = toComposePaneAdaptedValueValue(getString("primary")),
  `secondary` = toComposePaneAdaptedValueValue(getString("secondary")),
  `tertiary` = toComposePaneAdaptedValueValue(getString("tertiary")),
)

@Composable
internal fun JSONObject.decodeComposeNavigationSuiteScaffoldStateValue(): androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffoldState = when (val factory = getString("factory")) {
  "rememberNavigationSuiteScaffoldState" -> decodeComposeNavigationSuiteScaffoldStateValueFactory0()
  else -> error("Unknown ComposeNavigationSuiteScaffoldStateValue factory: " + factory)
}

@Composable
private fun JSONObject.decodeComposeNavigationSuiteScaffoldStateValueFactory0(): androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffoldState = when ((if (has("initialValue")) 1 else 0)) {
  0 -> androidx.compose.material3.adaptive.navigationsuite.rememberNavigationSuiteScaffoldState()
  1 -> androidx.compose.material3.adaptive.navigationsuite.rememberNavigationSuiteScaffoldState(`initialValue` = toComposeNavigationSuiteScaffoldValueOption(getString("initialValue")))
  else -> error("Invalid generated arguments for androidx.compose.material3.adaptive.navigationsuite.rememberNavigationSuiteScaffoldState")
}

internal fun JSONObject.decodeComposeBlurScopeBlock(): androidx.compose.ui.draw.BlurScope.() -> Unit {
  val hasAlpha = has("alpha")
  val `alpha` = if (has("alpha")) getDouble("alpha").toFloat() else null
  val hasBlurRadiusSpec = has("blurRadiusSpec")
  val `blurRadiusSpec` = if (has("blurRadiusSpec")) getJSONObject("blurRadiusSpec").decodeComposeBlurRadiusSpecValue() else null
  val hasEdgeTreatment = has("edgeTreatment")
  val `edgeTreatment` = if (has("edgeTreatment")) toComposeBlurredEdgeTreatmentValue(getString("edgeTreatment")) else null
  return {
    if (hasAlpha) this.`alpha` = `alpha`!!
    if (hasBlurRadiusSpec) this.`blurRadiusSpec` = `blurRadiusSpec`!!
    if (hasEdgeTreatment) this.`edgeTreatment` = `edgeTreatment`!!
  }
}

internal fun JSONObject.decodeComposeDropShadowScopeBlock(): androidx.compose.ui.draw.DropShadowScope.() -> Unit {
  val hasAlpha = has("alpha")
  val `alpha` = if (has("alpha")) getDouble("alpha").toFloat() else null
  val hasBlendMode = has("blendMode")
  val `blendMode` = if (has("blendMode")) toComposeBlendModeValue(getString("blendMode")) else null
  val hasBrush = has("brush")
  val `brush` = if (has("brush")) if (get("brush") === JSONObject.NULL) null else composeBrush("brush") else null
  val hasColor = has("color")
  val `color` = if (has("color")) parseComposeColor(getString("color")) else null
  val hasOffset = has("offset")
  val `offset` = if (has("offset")) getJSONObject("offset").decodeComposeOffset() else null
  val hasRadius = has("radius")
  val `radius` = if (has("radius")) getDouble("radius").toFloat() else null
  val hasSpread = has("spread")
  val `spread` = if (has("spread")) getDouble("spread").toFloat() else null
  return {
    if (hasAlpha) this.`alpha` = `alpha`!!
    if (hasBlendMode) this.`blendMode` = `blendMode`!!
    if (hasBrush) this.`brush` = `brush`
    if (hasColor) this.`color` = `color`!!
    if (hasOffset) this.`offset` = `offset`!!
    if (hasRadius) this.`radius` = `radius`!!
    if (hasSpread) this.`spread` = `spread`!!
  }
}

internal fun JSONObject.decodeComposeInnerShadowScopeBlock(): androidx.compose.ui.draw.InnerShadowScope.() -> Unit {
  val hasAlpha = has("alpha")
  val `alpha` = if (has("alpha")) getDouble("alpha").toFloat() else null
  val hasBlendMode = has("blendMode")
  val `blendMode` = if (has("blendMode")) toComposeBlendModeValue(getString("blendMode")) else null
  val hasBrush = has("brush")
  val `brush` = if (has("brush")) if (get("brush") === JSONObject.NULL) null else composeBrush("brush") else null
  val hasColor = has("color")
  val `color` = if (has("color")) parseComposeColor(getString("color")) else null
  val hasOffset = has("offset")
  val `offset` = if (has("offset")) getJSONObject("offset").decodeComposeOffset() else null
  val hasRadius = has("radius")
  val `radius` = if (has("radius")) getDouble("radius").toFloat() else null
  val hasSpread = has("spread")
  val `spread` = if (has("spread")) getDouble("spread").toFloat() else null
  return {
    if (hasAlpha) this.`alpha` = `alpha`!!
    if (hasBlendMode) this.`blendMode` = `blendMode`!!
    if (hasBrush) this.`brush` = `brush`
    if (hasColor) this.`color` = `color`!!
    if (hasOffset) this.`offset` = `offset`!!
    if (hasRadius) this.`radius` = `radius`!!
    if (hasSpread) this.`spread` = `spread`!!
  }
}

internal fun JSONObject.decodeComposeOffset(): androidx.compose.ui.geometry.Offset = androidx.compose.ui.geometry.Offset(
  `x` = getDouble("x").toFloat(),
  `y` = getDouble("y").toFloat(),
)

internal fun JSONObject.decodeComposeRectValue(): androidx.compose.ui.geometry.Rect = androidx.compose.ui.geometry.Rect(
  `left` = getDouble("left").toFloat(),
  `top` = getDouble("top").toFloat(),
  `right` = getDouble("right").toFloat(),
  `bottom` = getDouble("bottom").toFloat(),
)

internal fun JSONObject.decodeComposeBrushValue(): androidx.compose.ui.graphics.Brush = when (val factory = getString("factory")) {
  "Brush.composite" -> decodeComposeBrushValueFactory0()
  "Brush.horizontalGradient" -> decodeComposeBrushValueFactory1()
  "Brush.linearGradient" -> decodeComposeBrushValueFactory2()
  "Brush.radialGradient" -> decodeComposeBrushValueFactory3()
  "Brush.sweepGradient" -> decodeComposeBrushValueFactory4()
  "Brush.verticalGradient" -> decodeComposeBrushValueFactory5()
  else -> error("Unknown ComposeBrushValue factory: " + factory)
}

private fun JSONObject.decodeComposeBrushValueFactory0(): androidx.compose.ui.graphics.Brush = androidx.compose.ui.graphics.Brush.Companion.composite(
  `dstBrush` = composeBrush("dstBrush"),
  `srcBrush` = composeBrush("srcBrush"),
  `blendMode` = toComposeBlendModeValue(getString("blendMode")),
)

private fun JSONObject.decodeComposeBrushValueFactory1(): androidx.compose.ui.graphics.Brush = when ((if (has("startX")) 1 else 0) + (if (has("endX")) 2 else 0) + (if (has("tileMode")) 4 else 0)) {
  0 -> androidx.compose.ui.graphics.Brush.Companion.horizontalGradient(`colors` = getJSONArray("colors").let { items -> List(items.length()) { index -> with(items) { parseComposeColor(getString(index)) } } })
  1 -> androidx.compose.ui.graphics.Brush.Companion.horizontalGradient(`colors` = getJSONArray("colors").let { items -> List(items.length()) { index -> with(items) { parseComposeColor(getString(index)) } } }, `startX` = getDouble("startX").toFloat())
  2 -> androidx.compose.ui.graphics.Brush.Companion.horizontalGradient(`colors` = getJSONArray("colors").let { items -> List(items.length()) { index -> with(items) { parseComposeColor(getString(index)) } } }, `endX` = getDouble("endX").toFloat())
  3 -> androidx.compose.ui.graphics.Brush.Companion.horizontalGradient(`colors` = getJSONArray("colors").let { items -> List(items.length()) { index -> with(items) { parseComposeColor(getString(index)) } } }, `startX` = getDouble("startX").toFloat(), `endX` = getDouble("endX").toFloat())
  4 -> androidx.compose.ui.graphics.Brush.Companion.horizontalGradient(`colors` = getJSONArray("colors").let { items -> List(items.length()) { index -> with(items) { parseComposeColor(getString(index)) } } }, `tileMode` = toComposeTileModeValue(getString("tileMode")))
  5 -> androidx.compose.ui.graphics.Brush.Companion.horizontalGradient(`colors` = getJSONArray("colors").let { items -> List(items.length()) { index -> with(items) { parseComposeColor(getString(index)) } } }, `startX` = getDouble("startX").toFloat(), `tileMode` = toComposeTileModeValue(getString("tileMode")))
  6 -> androidx.compose.ui.graphics.Brush.Companion.horizontalGradient(`colors` = getJSONArray("colors").let { items -> List(items.length()) { index -> with(items) { parseComposeColor(getString(index)) } } }, `endX` = getDouble("endX").toFloat(), `tileMode` = toComposeTileModeValue(getString("tileMode")))
  7 -> androidx.compose.ui.graphics.Brush.Companion.horizontalGradient(`colors` = getJSONArray("colors").let { items -> List(items.length()) { index -> with(items) { parseComposeColor(getString(index)) } } }, `startX` = getDouble("startX").toFloat(), `endX` = getDouble("endX").toFloat(), `tileMode` = toComposeTileModeValue(getString("tileMode")))
  else -> error("Invalid generated arguments for androidx.compose.ui.graphics.Brush.Companion.horizontalGradient")
}

private fun JSONObject.decodeComposeBrushValueFactory2(): androidx.compose.ui.graphics.Brush = when ((if (has("start")) 1 else 0) + (if (has("end")) 2 else 0) + (if (has("tileMode")) 4 else 0)) {
  0 -> androidx.compose.ui.graphics.Brush.Companion.linearGradient(`colors` = getJSONArray("colors").let { items -> List(items.length()) { index -> with(items) { parseComposeColor(getString(index)) } } })
  1 -> androidx.compose.ui.graphics.Brush.Companion.linearGradient(`colors` = getJSONArray("colors").let { items -> List(items.length()) { index -> with(items) { parseComposeColor(getString(index)) } } }, `start` = getJSONObject("start").decodeComposeOffset())
  2 -> androidx.compose.ui.graphics.Brush.Companion.linearGradient(`colors` = getJSONArray("colors").let { items -> List(items.length()) { index -> with(items) { parseComposeColor(getString(index)) } } }, `end` = getJSONObject("end").decodeComposeOffset())
  3 -> androidx.compose.ui.graphics.Brush.Companion.linearGradient(`colors` = getJSONArray("colors").let { items -> List(items.length()) { index -> with(items) { parseComposeColor(getString(index)) } } }, `start` = getJSONObject("start").decodeComposeOffset(), `end` = getJSONObject("end").decodeComposeOffset())
  4 -> androidx.compose.ui.graphics.Brush.Companion.linearGradient(`colors` = getJSONArray("colors").let { items -> List(items.length()) { index -> with(items) { parseComposeColor(getString(index)) } } }, `tileMode` = toComposeTileModeValue(getString("tileMode")))
  5 -> androidx.compose.ui.graphics.Brush.Companion.linearGradient(`colors` = getJSONArray("colors").let { items -> List(items.length()) { index -> with(items) { parseComposeColor(getString(index)) } } }, `start` = getJSONObject("start").decodeComposeOffset(), `tileMode` = toComposeTileModeValue(getString("tileMode")))
  6 -> androidx.compose.ui.graphics.Brush.Companion.linearGradient(`colors` = getJSONArray("colors").let { items -> List(items.length()) { index -> with(items) { parseComposeColor(getString(index)) } } }, `end` = getJSONObject("end").decodeComposeOffset(), `tileMode` = toComposeTileModeValue(getString("tileMode")))
  7 -> androidx.compose.ui.graphics.Brush.Companion.linearGradient(`colors` = getJSONArray("colors").let { items -> List(items.length()) { index -> with(items) { parseComposeColor(getString(index)) } } }, `start` = getJSONObject("start").decodeComposeOffset(), `end` = getJSONObject("end").decodeComposeOffset(), `tileMode` = toComposeTileModeValue(getString("tileMode")))
  else -> error("Invalid generated arguments for androidx.compose.ui.graphics.Brush.Companion.linearGradient")
}

private fun JSONObject.decodeComposeBrushValueFactory3(): androidx.compose.ui.graphics.Brush = when ((if (has("center")) 1 else 0) + (if (has("radius")) 2 else 0) + (if (has("tileMode")) 4 else 0)) {
  0 -> androidx.compose.ui.graphics.Brush.Companion.radialGradient(`colors` = getJSONArray("colors").let { items -> List(items.length()) { index -> with(items) { parseComposeColor(getString(index)) } } })
  1 -> androidx.compose.ui.graphics.Brush.Companion.radialGradient(`colors` = getJSONArray("colors").let { items -> List(items.length()) { index -> with(items) { parseComposeColor(getString(index)) } } }, `center` = getJSONObject("center").decodeComposeOffset())
  2 -> androidx.compose.ui.graphics.Brush.Companion.radialGradient(`colors` = getJSONArray("colors").let { items -> List(items.length()) { index -> with(items) { parseComposeColor(getString(index)) } } }, `radius` = getDouble("radius").toFloat())
  3 -> androidx.compose.ui.graphics.Brush.Companion.radialGradient(`colors` = getJSONArray("colors").let { items -> List(items.length()) { index -> with(items) { parseComposeColor(getString(index)) } } }, `center` = getJSONObject("center").decodeComposeOffset(), `radius` = getDouble("radius").toFloat())
  4 -> androidx.compose.ui.graphics.Brush.Companion.radialGradient(`colors` = getJSONArray("colors").let { items -> List(items.length()) { index -> with(items) { parseComposeColor(getString(index)) } } }, `tileMode` = toComposeTileModeValue(getString("tileMode")))
  5 -> androidx.compose.ui.graphics.Brush.Companion.radialGradient(`colors` = getJSONArray("colors").let { items -> List(items.length()) { index -> with(items) { parseComposeColor(getString(index)) } } }, `center` = getJSONObject("center").decodeComposeOffset(), `tileMode` = toComposeTileModeValue(getString("tileMode")))
  6 -> androidx.compose.ui.graphics.Brush.Companion.radialGradient(`colors` = getJSONArray("colors").let { items -> List(items.length()) { index -> with(items) { parseComposeColor(getString(index)) } } }, `radius` = getDouble("radius").toFloat(), `tileMode` = toComposeTileModeValue(getString("tileMode")))
  7 -> androidx.compose.ui.graphics.Brush.Companion.radialGradient(`colors` = getJSONArray("colors").let { items -> List(items.length()) { index -> with(items) { parseComposeColor(getString(index)) } } }, `center` = getJSONObject("center").decodeComposeOffset(), `radius` = getDouble("radius").toFloat(), `tileMode` = toComposeTileModeValue(getString("tileMode")))
  else -> error("Invalid generated arguments for androidx.compose.ui.graphics.Brush.Companion.radialGradient")
}

private fun JSONObject.decodeComposeBrushValueFactory4(): androidx.compose.ui.graphics.Brush = when ((if (has("center")) 1 else 0)) {
  0 -> androidx.compose.ui.graphics.Brush.Companion.sweepGradient(`colors` = getJSONArray("colors").let { items -> List(items.length()) { index -> with(items) { parseComposeColor(getString(index)) } } })
  1 -> androidx.compose.ui.graphics.Brush.Companion.sweepGradient(`colors` = getJSONArray("colors").let { items -> List(items.length()) { index -> with(items) { parseComposeColor(getString(index)) } } }, `center` = getJSONObject("center").decodeComposeOffset())
  else -> error("Invalid generated arguments for androidx.compose.ui.graphics.Brush.Companion.sweepGradient")
}

private fun JSONObject.decodeComposeBrushValueFactory5(): androidx.compose.ui.graphics.Brush = when ((if (has("startY")) 1 else 0) + (if (has("endY")) 2 else 0) + (if (has("tileMode")) 4 else 0)) {
  0 -> androidx.compose.ui.graphics.Brush.Companion.verticalGradient(`colors` = getJSONArray("colors").let { items -> List(items.length()) { index -> with(items) { parseComposeColor(getString(index)) } } })
  1 -> androidx.compose.ui.graphics.Brush.Companion.verticalGradient(`colors` = getJSONArray("colors").let { items -> List(items.length()) { index -> with(items) { parseComposeColor(getString(index)) } } }, `startY` = getDouble("startY").toFloat())
  2 -> androidx.compose.ui.graphics.Brush.Companion.verticalGradient(`colors` = getJSONArray("colors").let { items -> List(items.length()) { index -> with(items) { parseComposeColor(getString(index)) } } }, `endY` = getDouble("endY").toFloat())
  3 -> androidx.compose.ui.graphics.Brush.Companion.verticalGradient(`colors` = getJSONArray("colors").let { items -> List(items.length()) { index -> with(items) { parseComposeColor(getString(index)) } } }, `startY` = getDouble("startY").toFloat(), `endY` = getDouble("endY").toFloat())
  4 -> androidx.compose.ui.graphics.Brush.Companion.verticalGradient(`colors` = getJSONArray("colors").let { items -> List(items.length()) { index -> with(items) { parseComposeColor(getString(index)) } } }, `tileMode` = toComposeTileModeValue(getString("tileMode")))
  5 -> androidx.compose.ui.graphics.Brush.Companion.verticalGradient(`colors` = getJSONArray("colors").let { items -> List(items.length()) { index -> with(items) { parseComposeColor(getString(index)) } } }, `startY` = getDouble("startY").toFloat(), `tileMode` = toComposeTileModeValue(getString("tileMode")))
  6 -> androidx.compose.ui.graphics.Brush.Companion.verticalGradient(`colors` = getJSONArray("colors").let { items -> List(items.length()) { index -> with(items) { parseComposeColor(getString(index)) } } }, `endY` = getDouble("endY").toFloat(), `tileMode` = toComposeTileModeValue(getString("tileMode")))
  7 -> androidx.compose.ui.graphics.Brush.Companion.verticalGradient(`colors` = getJSONArray("colors").let { items -> List(items.length()) { index -> with(items) { parseComposeColor(getString(index)) } } }, `startY` = getDouble("startY").toFloat(), `endY` = getDouble("endY").toFloat(), `tileMode` = toComposeTileModeValue(getString("tileMode")))
  else -> error("Invalid generated arguments for androidx.compose.ui.graphics.Brush.Companion.verticalGradient")
}

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

internal fun JSONObject.decodeComposeGraphicsLayerScopeBlock(): androidx.compose.ui.graphics.GraphicsLayerScope.() -> Unit {
  val hasAlpha = has("alpha")
  val `alpha` = if (has("alpha")) getDouble("alpha").toFloat() else null
  val hasAmbientShadowColor = has("ambientShadowColor")
  val `ambientShadowColor` = if (has("ambientShadowColor")) parseComposeColor(getString("ambientShadowColor")) else null
  val hasBlendMode = has("blendMode")
  val `blendMode` = if (has("blendMode")) toComposeBlendModeValue(getString("blendMode")) else null
  val hasCameraDistance = has("cameraDistance")
  val `cameraDistance` = if (has("cameraDistance")) getDouble("cameraDistance").toFloat() else null
  val hasClip = has("clip")
  val `clip` = if (has("clip")) getBoolean("clip") else null
  val hasColorFilter = has("colorFilter")
  val `colorFilter` = if (has("colorFilter")) if (get("colorFilter") === JSONObject.NULL) null else getJSONObject("colorFilter").decodeComposeColorFilterValue() else null
  val hasCompositingStrategy = has("compositingStrategy")
  val `compositingStrategy` = if (has("compositingStrategy")) toComposeCompositingStrategyValue(getString("compositingStrategy")) else null
  val hasOutsets = has("outsets")
  val `outsets` = if (has("outsets")) getJSONObject("outsets").decodeComposeLayerOutsetsValue() else null
  val hasRotationX = has("rotationX")
  val `rotationX` = if (has("rotationX")) getDouble("rotationX").toFloat() else null
  val hasRotationY = has("rotationY")
  val `rotationY` = if (has("rotationY")) getDouble("rotationY").toFloat() else null
  val hasRotationZ = has("rotationZ")
  val `rotationZ` = if (has("rotationZ")) getDouble("rotationZ").toFloat() else null
  val hasScaleX = has("scaleX")
  val `scaleX` = if (has("scaleX")) getDouble("scaleX").toFloat() else null
  val hasScaleY = has("scaleY")
  val `scaleY` = if (has("scaleY")) getDouble("scaleY").toFloat() else null
  val hasShadowElevation = has("shadowElevation")
  val `shadowElevation` = if (has("shadowElevation")) getDouble("shadowElevation").toFloat() else null
  val hasShape = has("shape")
  val `shape` = if (has("shape")) composeShape("shape") else null
  val hasSpotShadowColor = has("spotShadowColor")
  val `spotShadowColor` = if (has("spotShadowColor")) parseComposeColor(getString("spotShadowColor")) else null
  val hasTransformOrigin = has("transformOrigin")
  val `transformOrigin` = if (has("transformOrigin")) getJSONObject("transformOrigin").decodeComposeTransformOrigin() else null
  val hasTranslationX = has("translationX")
  val `translationX` = if (has("translationX")) getDouble("translationX").toFloat() else null
  val hasTranslationY = has("translationY")
  val `translationY` = if (has("translationY")) getDouble("translationY").toFloat() else null
  return {
    if (hasAlpha) this.`alpha` = `alpha`!!
    if (hasAmbientShadowColor) this.`ambientShadowColor` = `ambientShadowColor`!!
    if (hasBlendMode) this.`blendMode` = `blendMode`!!
    if (hasCameraDistance) this.`cameraDistance` = `cameraDistance`!!
    if (hasClip) this.`clip` = `clip`!!
    if (hasColorFilter) this.`colorFilter` = `colorFilter`
    if (hasCompositingStrategy) this.`compositingStrategy` = `compositingStrategy`!!
    if (hasOutsets) this.`outsets` = `outsets`!!
    if (hasRotationX) this.`rotationX` = `rotationX`!!
    if (hasRotationY) this.`rotationY` = `rotationY`!!
    if (hasRotationZ) this.`rotationZ` = `rotationZ`!!
    if (hasScaleX) this.`scaleX` = `scaleX`!!
    if (hasScaleY) this.`scaleY` = `scaleY`!!
    if (hasShadowElevation) this.`shadowElevation` = `shadowElevation`!!
    if (hasShape) this.`shape` = `shape`!!
    if (hasSpotShadowColor) this.`spotShadowColor` = `spotShadowColor`!!
    if (hasTransformOrigin) this.`transformOrigin` = `transformOrigin`!!
    if (hasTranslationX) this.`translationX` = `translationX`!!
    if (hasTranslationY) this.`translationY` = `translationY`!!
  }
}

internal fun JSONObject.decodeComposeImageBitmapValue(): androidx.compose.ui.graphics.ImageBitmap = when ((if (has("config")) 1 else 0) + (if (has("hasAlpha")) 2 else 0)) {
  0 -> androidx.compose.ui.graphics.ImageBitmap(`width` = getInt("width"), `height` = getInt("height"))
  1 -> androidx.compose.ui.graphics.ImageBitmap(`width` = getInt("width"), `height` = getInt("height"), `config` = toComposeImageBitmapConfigValue(getString("config")))
  2 -> androidx.compose.ui.graphics.ImageBitmap(`width` = getInt("width"), `height` = getInt("height"), `hasAlpha` = getBoolean("hasAlpha"))
  3 -> androidx.compose.ui.graphics.ImageBitmap(`width` = getInt("width"), `height` = getInt("height"), `config` = toComposeImageBitmapConfigValue(getString("config")), `hasAlpha` = getBoolean("hasAlpha"))
  else -> error("Invalid generated arguments for ComposeImageBitmapValue")
}

internal fun JSONObject.decodeComposeLayerOutsetsValue(): androidx.compose.ui.graphics.LayerOutsets = when ((if (has("left")) 1 else 0) + (if (has("top")) 2 else 0) + (if (has("right")) 4 else 0) + (if (has("bottom")) 8 else 0)) {
  0 -> androidx.compose.ui.graphics.LayerOutsets()
  1 -> androidx.compose.ui.graphics.LayerOutsets(`left` = getDouble("left").dp)
  2 -> androidx.compose.ui.graphics.LayerOutsets(`top` = getDouble("top").dp)
  3 -> androidx.compose.ui.graphics.LayerOutsets(`left` = getDouble("left").dp, `top` = getDouble("top").dp)
  4 -> androidx.compose.ui.graphics.LayerOutsets(`right` = getDouble("right").dp)
  5 -> androidx.compose.ui.graphics.LayerOutsets(`left` = getDouble("left").dp, `right` = getDouble("right").dp)
  6 -> androidx.compose.ui.graphics.LayerOutsets(`top` = getDouble("top").dp, `right` = getDouble("right").dp)
  7 -> androidx.compose.ui.graphics.LayerOutsets(`left` = getDouble("left").dp, `top` = getDouble("top").dp, `right` = getDouble("right").dp)
  8 -> androidx.compose.ui.graphics.LayerOutsets(`bottom` = getDouble("bottom").dp)
  9 -> androidx.compose.ui.graphics.LayerOutsets(`left` = getDouble("left").dp, `bottom` = getDouble("bottom").dp)
  10 -> androidx.compose.ui.graphics.LayerOutsets(`top` = getDouble("top").dp, `bottom` = getDouble("bottom").dp)
  11 -> androidx.compose.ui.graphics.LayerOutsets(`left` = getDouble("left").dp, `top` = getDouble("top").dp, `bottom` = getDouble("bottom").dp)
  12 -> androidx.compose.ui.graphics.LayerOutsets(`right` = getDouble("right").dp, `bottom` = getDouble("bottom").dp)
  13 -> androidx.compose.ui.graphics.LayerOutsets(`left` = getDouble("left").dp, `right` = getDouble("right").dp, `bottom` = getDouble("bottom").dp)
  14 -> androidx.compose.ui.graphics.LayerOutsets(`top` = getDouble("top").dp, `right` = getDouble("right").dp, `bottom` = getDouble("bottom").dp)
  15 -> androidx.compose.ui.graphics.LayerOutsets(`left` = getDouble("left").dp, `top` = getDouble("top").dp, `right` = getDouble("right").dp, `bottom` = getDouble("bottom").dp)
  else -> error("Invalid generated arguments for ComposeLayerOutsetsValue")
}

internal fun JSONObject.decodeComposeShadowValue(): androidx.compose.ui.graphics.Shadow = when ((if (has("color")) 1 else 0) + (if (has("offset")) 2 else 0) + (if (has("blurRadius")) 4 else 0)) {
  0 -> androidx.compose.ui.graphics.Shadow()
  1 -> androidx.compose.ui.graphics.Shadow(`color` = parseComposeColor(getString("color")))
  2 -> androidx.compose.ui.graphics.Shadow(`offset` = getJSONObject("offset").decodeComposeOffset())
  3 -> androidx.compose.ui.graphics.Shadow(`color` = parseComposeColor(getString("color")), `offset` = getJSONObject("offset").decodeComposeOffset())
  4 -> androidx.compose.ui.graphics.Shadow(`blurRadius` = getDouble("blurRadius").toFloat())
  5 -> androidx.compose.ui.graphics.Shadow(`color` = parseComposeColor(getString("color")), `blurRadius` = getDouble("blurRadius").toFloat())
  6 -> androidx.compose.ui.graphics.Shadow(`offset` = getJSONObject("offset").decodeComposeOffset(), `blurRadius` = getDouble("blurRadius").toFloat())
  7 -> androidx.compose.ui.graphics.Shadow(`color` = parseComposeColor(getString("color")), `offset` = getJSONObject("offset").decodeComposeOffset(), `blurRadius` = getDouble("blurRadius").toFloat())
  else -> error("Invalid generated arguments for ComposeShadowValue")
}

internal fun JSONObject.decodeComposeShapeValue(): androidx.compose.ui.graphics.Shape = when (val factory = getString("factory")) {
  "AbsoluteCutCornerShape" -> when { has("corner") -> decodeComposeShapeValueFactory0(); has("size") -> decodeComposeShapeValueFactory1(); has("percent") -> decodeComposeShapeValueFactory2(); has("topLeft") || has("topRight") || has("bottomRight") || has("bottomLeft") -> decodeComposeShapeValueFactory3(); has("topLeftPercent") || has("topRightPercent") || has("bottomRightPercent") || has("bottomLeftPercent") -> decodeComposeShapeValueFactory4(); else -> error("No AbsoluteCutCornerShape overload accepts these fields") }
  "AbsoluteRoundedCornerShape" -> when { has("corner") -> decodeComposeShapeValueFactory5(); has("size") -> decodeComposeShapeValueFactory6(); has("percent") -> decodeComposeShapeValueFactory7(); has("topLeft") || has("topRight") || has("bottomRight") || has("bottomLeft") -> decodeComposeShapeValueFactory8(); has("topLeftPercent") || has("topRightPercent") || has("bottomRightPercent") || has("bottomLeftPercent") -> decodeComposeShapeValueFactory9(); else -> error("No AbsoluteRoundedCornerShape overload accepts these fields") }
  "CutCornerShape" -> when { has("corner") -> decodeComposeShapeValueFactory10(); has("size") -> decodeComposeShapeValueFactory11(); has("percent") -> decodeComposeShapeValueFactory12(); has("topStart") || has("topEnd") || has("bottomEnd") || has("bottomStart") -> decodeComposeShapeValueFactory13(); has("topStartPercent") || has("topEndPercent") || has("bottomEndPercent") || has("bottomStartPercent") -> decodeComposeShapeValueFactory14(); else -> error("No CutCornerShape overload accepts these fields") }
  "RoundedCornerShape" -> when { has("corner") -> decodeComposeShapeValueFactory15(); has("size") -> decodeComposeShapeValueFactory16(); has("percent") -> decodeComposeShapeValueFactory17(); has("topStart") || has("topEnd") || has("bottomEnd") || has("bottomStart") -> decodeComposeShapeValueFactory18(); has("topStartPercent") || has("topEndPercent") || has("bottomEndPercent") || has("bottomStartPercent") -> decodeComposeShapeValueFactory19(); else -> error("No RoundedCornerShape overload accepts these fields") }
  else -> error("Unknown ComposeShapeValue factory: " + factory)
}

private fun JSONObject.decodeComposeShapeValueFactory0(): androidx.compose.ui.graphics.Shape = androidx.compose.foundation.shape.AbsoluteCutCornerShape(
  `corner` = getJSONObject("corner").decodeComposeCornerSizeValue(),
)

private fun JSONObject.decodeComposeShapeValueFactory1(): androidx.compose.ui.graphics.Shape = androidx.compose.foundation.shape.AbsoluteCutCornerShape(
  `size` = getDouble("size").dp,
)

private fun JSONObject.decodeComposeShapeValueFactory2(): androidx.compose.ui.graphics.Shape = androidx.compose.foundation.shape.AbsoluteCutCornerShape(
  `percent` = getInt("percent"),
)

private fun JSONObject.decodeComposeShapeValueFactory3(): androidx.compose.ui.graphics.Shape = when ((if (has("topLeft")) 1 else 0) + (if (has("topRight")) 2 else 0) + (if (has("bottomRight")) 4 else 0) + (if (has("bottomLeft")) 8 else 0)) {
  1 -> androidx.compose.foundation.shape.AbsoluteCutCornerShape(`topLeft` = getDouble("topLeft").dp)
  2 -> androidx.compose.foundation.shape.AbsoluteCutCornerShape(`topRight` = getDouble("topRight").dp)
  3 -> androidx.compose.foundation.shape.AbsoluteCutCornerShape(`topLeft` = getDouble("topLeft").dp, `topRight` = getDouble("topRight").dp)
  4 -> androidx.compose.foundation.shape.AbsoluteCutCornerShape(`bottomRight` = getDouble("bottomRight").dp)
  5 -> androidx.compose.foundation.shape.AbsoluteCutCornerShape(`topLeft` = getDouble("topLeft").dp, `bottomRight` = getDouble("bottomRight").dp)
  6 -> androidx.compose.foundation.shape.AbsoluteCutCornerShape(`topRight` = getDouble("topRight").dp, `bottomRight` = getDouble("bottomRight").dp)
  7 -> androidx.compose.foundation.shape.AbsoluteCutCornerShape(`topLeft` = getDouble("topLeft").dp, `topRight` = getDouble("topRight").dp, `bottomRight` = getDouble("bottomRight").dp)
  8 -> androidx.compose.foundation.shape.AbsoluteCutCornerShape(`bottomLeft` = getDouble("bottomLeft").dp)
  9 -> androidx.compose.foundation.shape.AbsoluteCutCornerShape(`topLeft` = getDouble("topLeft").dp, `bottomLeft` = getDouble("bottomLeft").dp)
  10 -> androidx.compose.foundation.shape.AbsoluteCutCornerShape(`topRight` = getDouble("topRight").dp, `bottomLeft` = getDouble("bottomLeft").dp)
  11 -> androidx.compose.foundation.shape.AbsoluteCutCornerShape(`topLeft` = getDouble("topLeft").dp, `topRight` = getDouble("topRight").dp, `bottomLeft` = getDouble("bottomLeft").dp)
  12 -> androidx.compose.foundation.shape.AbsoluteCutCornerShape(`bottomRight` = getDouble("bottomRight").dp, `bottomLeft` = getDouble("bottomLeft").dp)
  13 -> androidx.compose.foundation.shape.AbsoluteCutCornerShape(`topLeft` = getDouble("topLeft").dp, `bottomRight` = getDouble("bottomRight").dp, `bottomLeft` = getDouble("bottomLeft").dp)
  14 -> androidx.compose.foundation.shape.AbsoluteCutCornerShape(`topRight` = getDouble("topRight").dp, `bottomRight` = getDouble("bottomRight").dp, `bottomLeft` = getDouble("bottomLeft").dp)
  15 -> androidx.compose.foundation.shape.AbsoluteCutCornerShape(`topLeft` = getDouble("topLeft").dp, `topRight` = getDouble("topRight").dp, `bottomRight` = getDouble("bottomRight").dp, `bottomLeft` = getDouble("bottomLeft").dp)
  else -> error("Invalid generated arguments for androidx.compose.foundation.shape.AbsoluteCutCornerShape")
}

private fun JSONObject.decodeComposeShapeValueFactory4(): androidx.compose.ui.graphics.Shape = when ((if (has("topLeftPercent")) 1 else 0) + (if (has("topRightPercent")) 2 else 0) + (if (has("bottomRightPercent")) 4 else 0) + (if (has("bottomLeftPercent")) 8 else 0)) {
  1 -> androidx.compose.foundation.shape.AbsoluteCutCornerShape(`topLeftPercent` = getInt("topLeftPercent"))
  2 -> androidx.compose.foundation.shape.AbsoluteCutCornerShape(`topRightPercent` = getInt("topRightPercent"))
  3 -> androidx.compose.foundation.shape.AbsoluteCutCornerShape(`topLeftPercent` = getInt("topLeftPercent"), `topRightPercent` = getInt("topRightPercent"))
  4 -> androidx.compose.foundation.shape.AbsoluteCutCornerShape(`bottomRightPercent` = getInt("bottomRightPercent"))
  5 -> androidx.compose.foundation.shape.AbsoluteCutCornerShape(`topLeftPercent` = getInt("topLeftPercent"), `bottomRightPercent` = getInt("bottomRightPercent"))
  6 -> androidx.compose.foundation.shape.AbsoluteCutCornerShape(`topRightPercent` = getInt("topRightPercent"), `bottomRightPercent` = getInt("bottomRightPercent"))
  7 -> androidx.compose.foundation.shape.AbsoluteCutCornerShape(`topLeftPercent` = getInt("topLeftPercent"), `topRightPercent` = getInt("topRightPercent"), `bottomRightPercent` = getInt("bottomRightPercent"))
  8 -> androidx.compose.foundation.shape.AbsoluteCutCornerShape(`bottomLeftPercent` = getInt("bottomLeftPercent"))
  9 -> androidx.compose.foundation.shape.AbsoluteCutCornerShape(`topLeftPercent` = getInt("topLeftPercent"), `bottomLeftPercent` = getInt("bottomLeftPercent"))
  10 -> androidx.compose.foundation.shape.AbsoluteCutCornerShape(`topRightPercent` = getInt("topRightPercent"), `bottomLeftPercent` = getInt("bottomLeftPercent"))
  11 -> androidx.compose.foundation.shape.AbsoluteCutCornerShape(`topLeftPercent` = getInt("topLeftPercent"), `topRightPercent` = getInt("topRightPercent"), `bottomLeftPercent` = getInt("bottomLeftPercent"))
  12 -> androidx.compose.foundation.shape.AbsoluteCutCornerShape(`bottomRightPercent` = getInt("bottomRightPercent"), `bottomLeftPercent` = getInt("bottomLeftPercent"))
  13 -> androidx.compose.foundation.shape.AbsoluteCutCornerShape(`topLeftPercent` = getInt("topLeftPercent"), `bottomRightPercent` = getInt("bottomRightPercent"), `bottomLeftPercent` = getInt("bottomLeftPercent"))
  14 -> androidx.compose.foundation.shape.AbsoluteCutCornerShape(`topRightPercent` = getInt("topRightPercent"), `bottomRightPercent` = getInt("bottomRightPercent"), `bottomLeftPercent` = getInt("bottomLeftPercent"))
  15 -> androidx.compose.foundation.shape.AbsoluteCutCornerShape(`topLeftPercent` = getInt("topLeftPercent"), `topRightPercent` = getInt("topRightPercent"), `bottomRightPercent` = getInt("bottomRightPercent"), `bottomLeftPercent` = getInt("bottomLeftPercent"))
  else -> error("Invalid generated arguments for androidx.compose.foundation.shape.AbsoluteCutCornerShape")
}

private fun JSONObject.decodeComposeShapeValueFactory5(): androidx.compose.ui.graphics.Shape = androidx.compose.foundation.shape.AbsoluteRoundedCornerShape(
  `corner` = getJSONObject("corner").decodeComposeCornerSizeValue(),
)

private fun JSONObject.decodeComposeShapeValueFactory6(): androidx.compose.ui.graphics.Shape = androidx.compose.foundation.shape.AbsoluteRoundedCornerShape(
  `size` = getDouble("size").dp,
)

private fun JSONObject.decodeComposeShapeValueFactory7(): androidx.compose.ui.graphics.Shape = androidx.compose.foundation.shape.AbsoluteRoundedCornerShape(
  `percent` = getInt("percent"),
)

private fun JSONObject.decodeComposeShapeValueFactory8(): androidx.compose.ui.graphics.Shape = when ((if (has("topLeft")) 1 else 0) + (if (has("topRight")) 2 else 0) + (if (has("bottomRight")) 4 else 0) + (if (has("bottomLeft")) 8 else 0)) {
  1 -> androidx.compose.foundation.shape.AbsoluteRoundedCornerShape(`topLeft` = getDouble("topLeft").dp)
  2 -> androidx.compose.foundation.shape.AbsoluteRoundedCornerShape(`topRight` = getDouble("topRight").dp)
  3 -> androidx.compose.foundation.shape.AbsoluteRoundedCornerShape(`topLeft` = getDouble("topLeft").dp, `topRight` = getDouble("topRight").dp)
  4 -> androidx.compose.foundation.shape.AbsoluteRoundedCornerShape(`bottomRight` = getDouble("bottomRight").dp)
  5 -> androidx.compose.foundation.shape.AbsoluteRoundedCornerShape(`topLeft` = getDouble("topLeft").dp, `bottomRight` = getDouble("bottomRight").dp)
  6 -> androidx.compose.foundation.shape.AbsoluteRoundedCornerShape(`topRight` = getDouble("topRight").dp, `bottomRight` = getDouble("bottomRight").dp)
  7 -> androidx.compose.foundation.shape.AbsoluteRoundedCornerShape(`topLeft` = getDouble("topLeft").dp, `topRight` = getDouble("topRight").dp, `bottomRight` = getDouble("bottomRight").dp)
  8 -> androidx.compose.foundation.shape.AbsoluteRoundedCornerShape(`bottomLeft` = getDouble("bottomLeft").dp)
  9 -> androidx.compose.foundation.shape.AbsoluteRoundedCornerShape(`topLeft` = getDouble("topLeft").dp, `bottomLeft` = getDouble("bottomLeft").dp)
  10 -> androidx.compose.foundation.shape.AbsoluteRoundedCornerShape(`topRight` = getDouble("topRight").dp, `bottomLeft` = getDouble("bottomLeft").dp)
  11 -> androidx.compose.foundation.shape.AbsoluteRoundedCornerShape(`topLeft` = getDouble("topLeft").dp, `topRight` = getDouble("topRight").dp, `bottomLeft` = getDouble("bottomLeft").dp)
  12 -> androidx.compose.foundation.shape.AbsoluteRoundedCornerShape(`bottomRight` = getDouble("bottomRight").dp, `bottomLeft` = getDouble("bottomLeft").dp)
  13 -> androidx.compose.foundation.shape.AbsoluteRoundedCornerShape(`topLeft` = getDouble("topLeft").dp, `bottomRight` = getDouble("bottomRight").dp, `bottomLeft` = getDouble("bottomLeft").dp)
  14 -> androidx.compose.foundation.shape.AbsoluteRoundedCornerShape(`topRight` = getDouble("topRight").dp, `bottomRight` = getDouble("bottomRight").dp, `bottomLeft` = getDouble("bottomLeft").dp)
  15 -> androidx.compose.foundation.shape.AbsoluteRoundedCornerShape(`topLeft` = getDouble("topLeft").dp, `topRight` = getDouble("topRight").dp, `bottomRight` = getDouble("bottomRight").dp, `bottomLeft` = getDouble("bottomLeft").dp)
  else -> error("Invalid generated arguments for androidx.compose.foundation.shape.AbsoluteRoundedCornerShape")
}

private fun JSONObject.decodeComposeShapeValueFactory9(): androidx.compose.ui.graphics.Shape = when ((if (has("topLeftPercent")) 1 else 0) + (if (has("topRightPercent")) 2 else 0) + (if (has("bottomRightPercent")) 4 else 0) + (if (has("bottomLeftPercent")) 8 else 0)) {
  1 -> androidx.compose.foundation.shape.AbsoluteRoundedCornerShape(`topLeftPercent` = getInt("topLeftPercent"))
  2 -> androidx.compose.foundation.shape.AbsoluteRoundedCornerShape(`topRightPercent` = getInt("topRightPercent"))
  3 -> androidx.compose.foundation.shape.AbsoluteRoundedCornerShape(`topLeftPercent` = getInt("topLeftPercent"), `topRightPercent` = getInt("topRightPercent"))
  4 -> androidx.compose.foundation.shape.AbsoluteRoundedCornerShape(`bottomRightPercent` = getInt("bottomRightPercent"))
  5 -> androidx.compose.foundation.shape.AbsoluteRoundedCornerShape(`topLeftPercent` = getInt("topLeftPercent"), `bottomRightPercent` = getInt("bottomRightPercent"))
  6 -> androidx.compose.foundation.shape.AbsoluteRoundedCornerShape(`topRightPercent` = getInt("topRightPercent"), `bottomRightPercent` = getInt("bottomRightPercent"))
  7 -> androidx.compose.foundation.shape.AbsoluteRoundedCornerShape(`topLeftPercent` = getInt("topLeftPercent"), `topRightPercent` = getInt("topRightPercent"), `bottomRightPercent` = getInt("bottomRightPercent"))
  8 -> androidx.compose.foundation.shape.AbsoluteRoundedCornerShape(`bottomLeftPercent` = getInt("bottomLeftPercent"))
  9 -> androidx.compose.foundation.shape.AbsoluteRoundedCornerShape(`topLeftPercent` = getInt("topLeftPercent"), `bottomLeftPercent` = getInt("bottomLeftPercent"))
  10 -> androidx.compose.foundation.shape.AbsoluteRoundedCornerShape(`topRightPercent` = getInt("topRightPercent"), `bottomLeftPercent` = getInt("bottomLeftPercent"))
  11 -> androidx.compose.foundation.shape.AbsoluteRoundedCornerShape(`topLeftPercent` = getInt("topLeftPercent"), `topRightPercent` = getInt("topRightPercent"), `bottomLeftPercent` = getInt("bottomLeftPercent"))
  12 -> androidx.compose.foundation.shape.AbsoluteRoundedCornerShape(`bottomRightPercent` = getInt("bottomRightPercent"), `bottomLeftPercent` = getInt("bottomLeftPercent"))
  13 -> androidx.compose.foundation.shape.AbsoluteRoundedCornerShape(`topLeftPercent` = getInt("topLeftPercent"), `bottomRightPercent` = getInt("bottomRightPercent"), `bottomLeftPercent` = getInt("bottomLeftPercent"))
  14 -> androidx.compose.foundation.shape.AbsoluteRoundedCornerShape(`topRightPercent` = getInt("topRightPercent"), `bottomRightPercent` = getInt("bottomRightPercent"), `bottomLeftPercent` = getInt("bottomLeftPercent"))
  15 -> androidx.compose.foundation.shape.AbsoluteRoundedCornerShape(`topLeftPercent` = getInt("topLeftPercent"), `topRightPercent` = getInt("topRightPercent"), `bottomRightPercent` = getInt("bottomRightPercent"), `bottomLeftPercent` = getInt("bottomLeftPercent"))
  else -> error("Invalid generated arguments for androidx.compose.foundation.shape.AbsoluteRoundedCornerShape")
}

private fun JSONObject.decodeComposeShapeValueFactory10(): androidx.compose.ui.graphics.Shape = androidx.compose.foundation.shape.CutCornerShape(
  `corner` = getJSONObject("corner").decodeComposeCornerSizeValue(),
)

private fun JSONObject.decodeComposeShapeValueFactory11(): androidx.compose.ui.graphics.Shape = androidx.compose.foundation.shape.CutCornerShape(
  `size` = getDouble("size").dp,
)

private fun JSONObject.decodeComposeShapeValueFactory12(): androidx.compose.ui.graphics.Shape = androidx.compose.foundation.shape.CutCornerShape(
  `percent` = getInt("percent"),
)

private fun JSONObject.decodeComposeShapeValueFactory13(): androidx.compose.ui.graphics.Shape = when ((if (has("topStart")) 1 else 0) + (if (has("topEnd")) 2 else 0) + (if (has("bottomEnd")) 4 else 0) + (if (has("bottomStart")) 8 else 0)) {
  1 -> androidx.compose.foundation.shape.CutCornerShape(`topStart` = getDouble("topStart").dp)
  2 -> androidx.compose.foundation.shape.CutCornerShape(`topEnd` = getDouble("topEnd").dp)
  3 -> androidx.compose.foundation.shape.CutCornerShape(`topStart` = getDouble("topStart").dp, `topEnd` = getDouble("topEnd").dp)
  4 -> androidx.compose.foundation.shape.CutCornerShape(`bottomEnd` = getDouble("bottomEnd").dp)
  5 -> androidx.compose.foundation.shape.CutCornerShape(`topStart` = getDouble("topStart").dp, `bottomEnd` = getDouble("bottomEnd").dp)
  6 -> androidx.compose.foundation.shape.CutCornerShape(`topEnd` = getDouble("topEnd").dp, `bottomEnd` = getDouble("bottomEnd").dp)
  7 -> androidx.compose.foundation.shape.CutCornerShape(`topStart` = getDouble("topStart").dp, `topEnd` = getDouble("topEnd").dp, `bottomEnd` = getDouble("bottomEnd").dp)
  8 -> androidx.compose.foundation.shape.CutCornerShape(`bottomStart` = getDouble("bottomStart").dp)
  9 -> androidx.compose.foundation.shape.CutCornerShape(`topStart` = getDouble("topStart").dp, `bottomStart` = getDouble("bottomStart").dp)
  10 -> androidx.compose.foundation.shape.CutCornerShape(`topEnd` = getDouble("topEnd").dp, `bottomStart` = getDouble("bottomStart").dp)
  11 -> androidx.compose.foundation.shape.CutCornerShape(`topStart` = getDouble("topStart").dp, `topEnd` = getDouble("topEnd").dp, `bottomStart` = getDouble("bottomStart").dp)
  12 -> androidx.compose.foundation.shape.CutCornerShape(`bottomEnd` = getDouble("bottomEnd").dp, `bottomStart` = getDouble("bottomStart").dp)
  13 -> androidx.compose.foundation.shape.CutCornerShape(`topStart` = getDouble("topStart").dp, `bottomEnd` = getDouble("bottomEnd").dp, `bottomStart` = getDouble("bottomStart").dp)
  14 -> androidx.compose.foundation.shape.CutCornerShape(`topEnd` = getDouble("topEnd").dp, `bottomEnd` = getDouble("bottomEnd").dp, `bottomStart` = getDouble("bottomStart").dp)
  15 -> androidx.compose.foundation.shape.CutCornerShape(`topStart` = getDouble("topStart").dp, `topEnd` = getDouble("topEnd").dp, `bottomEnd` = getDouble("bottomEnd").dp, `bottomStart` = getDouble("bottomStart").dp)
  else -> error("Invalid generated arguments for androidx.compose.foundation.shape.CutCornerShape")
}

private fun JSONObject.decodeComposeShapeValueFactory14(): androidx.compose.ui.graphics.Shape = when ((if (has("topStartPercent")) 1 else 0) + (if (has("topEndPercent")) 2 else 0) + (if (has("bottomEndPercent")) 4 else 0) + (if (has("bottomStartPercent")) 8 else 0)) {
  1 -> androidx.compose.foundation.shape.CutCornerShape(`topStartPercent` = getInt("topStartPercent"))
  2 -> androidx.compose.foundation.shape.CutCornerShape(`topEndPercent` = getInt("topEndPercent"))
  3 -> androidx.compose.foundation.shape.CutCornerShape(`topStartPercent` = getInt("topStartPercent"), `topEndPercent` = getInt("topEndPercent"))
  4 -> androidx.compose.foundation.shape.CutCornerShape(`bottomEndPercent` = getInt("bottomEndPercent"))
  5 -> androidx.compose.foundation.shape.CutCornerShape(`topStartPercent` = getInt("topStartPercent"), `bottomEndPercent` = getInt("bottomEndPercent"))
  6 -> androidx.compose.foundation.shape.CutCornerShape(`topEndPercent` = getInt("topEndPercent"), `bottomEndPercent` = getInt("bottomEndPercent"))
  7 -> androidx.compose.foundation.shape.CutCornerShape(`topStartPercent` = getInt("topStartPercent"), `topEndPercent` = getInt("topEndPercent"), `bottomEndPercent` = getInt("bottomEndPercent"))
  8 -> androidx.compose.foundation.shape.CutCornerShape(`bottomStartPercent` = getInt("bottomStartPercent"))
  9 -> androidx.compose.foundation.shape.CutCornerShape(`topStartPercent` = getInt("topStartPercent"), `bottomStartPercent` = getInt("bottomStartPercent"))
  10 -> androidx.compose.foundation.shape.CutCornerShape(`topEndPercent` = getInt("topEndPercent"), `bottomStartPercent` = getInt("bottomStartPercent"))
  11 -> androidx.compose.foundation.shape.CutCornerShape(`topStartPercent` = getInt("topStartPercent"), `topEndPercent` = getInt("topEndPercent"), `bottomStartPercent` = getInt("bottomStartPercent"))
  12 -> androidx.compose.foundation.shape.CutCornerShape(`bottomEndPercent` = getInt("bottomEndPercent"), `bottomStartPercent` = getInt("bottomStartPercent"))
  13 -> androidx.compose.foundation.shape.CutCornerShape(`topStartPercent` = getInt("topStartPercent"), `bottomEndPercent` = getInt("bottomEndPercent"), `bottomStartPercent` = getInt("bottomStartPercent"))
  14 -> androidx.compose.foundation.shape.CutCornerShape(`topEndPercent` = getInt("topEndPercent"), `bottomEndPercent` = getInt("bottomEndPercent"), `bottomStartPercent` = getInt("bottomStartPercent"))
  15 -> androidx.compose.foundation.shape.CutCornerShape(`topStartPercent` = getInt("topStartPercent"), `topEndPercent` = getInt("topEndPercent"), `bottomEndPercent` = getInt("bottomEndPercent"), `bottomStartPercent` = getInt("bottomStartPercent"))
  else -> error("Invalid generated arguments for androidx.compose.foundation.shape.CutCornerShape")
}

private fun JSONObject.decodeComposeShapeValueFactory15(): androidx.compose.ui.graphics.Shape = androidx.compose.foundation.shape.RoundedCornerShape(
  `corner` = getJSONObject("corner").decodeComposeCornerSizeValue(),
)

private fun JSONObject.decodeComposeShapeValueFactory16(): androidx.compose.ui.graphics.Shape = androidx.compose.foundation.shape.RoundedCornerShape(
  `size` = getDouble("size").dp,
)

private fun JSONObject.decodeComposeShapeValueFactory17(): androidx.compose.ui.graphics.Shape = androidx.compose.foundation.shape.RoundedCornerShape(
  `percent` = getInt("percent"),
)

private fun JSONObject.decodeComposeShapeValueFactory18(): androidx.compose.ui.graphics.Shape = when ((if (has("topStart")) 1 else 0) + (if (has("topEnd")) 2 else 0) + (if (has("bottomEnd")) 4 else 0) + (if (has("bottomStart")) 8 else 0)) {
  1 -> androidx.compose.foundation.shape.RoundedCornerShape(`topStart` = getDouble("topStart").dp)
  2 -> androidx.compose.foundation.shape.RoundedCornerShape(`topEnd` = getDouble("topEnd").dp)
  3 -> androidx.compose.foundation.shape.RoundedCornerShape(`topStart` = getDouble("topStart").dp, `topEnd` = getDouble("topEnd").dp)
  4 -> androidx.compose.foundation.shape.RoundedCornerShape(`bottomEnd` = getDouble("bottomEnd").dp)
  5 -> androidx.compose.foundation.shape.RoundedCornerShape(`topStart` = getDouble("topStart").dp, `bottomEnd` = getDouble("bottomEnd").dp)
  6 -> androidx.compose.foundation.shape.RoundedCornerShape(`topEnd` = getDouble("topEnd").dp, `bottomEnd` = getDouble("bottomEnd").dp)
  7 -> androidx.compose.foundation.shape.RoundedCornerShape(`topStart` = getDouble("topStart").dp, `topEnd` = getDouble("topEnd").dp, `bottomEnd` = getDouble("bottomEnd").dp)
  8 -> androidx.compose.foundation.shape.RoundedCornerShape(`bottomStart` = getDouble("bottomStart").dp)
  9 -> androidx.compose.foundation.shape.RoundedCornerShape(`topStart` = getDouble("topStart").dp, `bottomStart` = getDouble("bottomStart").dp)
  10 -> androidx.compose.foundation.shape.RoundedCornerShape(`topEnd` = getDouble("topEnd").dp, `bottomStart` = getDouble("bottomStart").dp)
  11 -> androidx.compose.foundation.shape.RoundedCornerShape(`topStart` = getDouble("topStart").dp, `topEnd` = getDouble("topEnd").dp, `bottomStart` = getDouble("bottomStart").dp)
  12 -> androidx.compose.foundation.shape.RoundedCornerShape(`bottomEnd` = getDouble("bottomEnd").dp, `bottomStart` = getDouble("bottomStart").dp)
  13 -> androidx.compose.foundation.shape.RoundedCornerShape(`topStart` = getDouble("topStart").dp, `bottomEnd` = getDouble("bottomEnd").dp, `bottomStart` = getDouble("bottomStart").dp)
  14 -> androidx.compose.foundation.shape.RoundedCornerShape(`topEnd` = getDouble("topEnd").dp, `bottomEnd` = getDouble("bottomEnd").dp, `bottomStart` = getDouble("bottomStart").dp)
  15 -> androidx.compose.foundation.shape.RoundedCornerShape(`topStart` = getDouble("topStart").dp, `topEnd` = getDouble("topEnd").dp, `bottomEnd` = getDouble("bottomEnd").dp, `bottomStart` = getDouble("bottomStart").dp)
  else -> error("Invalid generated arguments for androidx.compose.foundation.shape.RoundedCornerShape")
}

private fun JSONObject.decodeComposeShapeValueFactory19(): androidx.compose.ui.graphics.Shape = when ((if (has("topStartPercent")) 1 else 0) + (if (has("topEndPercent")) 2 else 0) + (if (has("bottomEndPercent")) 4 else 0) + (if (has("bottomStartPercent")) 8 else 0)) {
  1 -> androidx.compose.foundation.shape.RoundedCornerShape(`topStartPercent` = getInt("topStartPercent"))
  2 -> androidx.compose.foundation.shape.RoundedCornerShape(`topEndPercent` = getInt("topEndPercent"))
  3 -> androidx.compose.foundation.shape.RoundedCornerShape(`topStartPercent` = getInt("topStartPercent"), `topEndPercent` = getInt("topEndPercent"))
  4 -> androidx.compose.foundation.shape.RoundedCornerShape(`bottomEndPercent` = getInt("bottomEndPercent"))
  5 -> androidx.compose.foundation.shape.RoundedCornerShape(`topStartPercent` = getInt("topStartPercent"), `bottomEndPercent` = getInt("bottomEndPercent"))
  6 -> androidx.compose.foundation.shape.RoundedCornerShape(`topEndPercent` = getInt("topEndPercent"), `bottomEndPercent` = getInt("bottomEndPercent"))
  7 -> androidx.compose.foundation.shape.RoundedCornerShape(`topStartPercent` = getInt("topStartPercent"), `topEndPercent` = getInt("topEndPercent"), `bottomEndPercent` = getInt("bottomEndPercent"))
  8 -> androidx.compose.foundation.shape.RoundedCornerShape(`bottomStartPercent` = getInt("bottomStartPercent"))
  9 -> androidx.compose.foundation.shape.RoundedCornerShape(`topStartPercent` = getInt("topStartPercent"), `bottomStartPercent` = getInt("bottomStartPercent"))
  10 -> androidx.compose.foundation.shape.RoundedCornerShape(`topEndPercent` = getInt("topEndPercent"), `bottomStartPercent` = getInt("bottomStartPercent"))
  11 -> androidx.compose.foundation.shape.RoundedCornerShape(`topStartPercent` = getInt("topStartPercent"), `topEndPercent` = getInt("topEndPercent"), `bottomStartPercent` = getInt("bottomStartPercent"))
  12 -> androidx.compose.foundation.shape.RoundedCornerShape(`bottomEndPercent` = getInt("bottomEndPercent"), `bottomStartPercent` = getInt("bottomStartPercent"))
  13 -> androidx.compose.foundation.shape.RoundedCornerShape(`topStartPercent` = getInt("topStartPercent"), `bottomEndPercent` = getInt("bottomEndPercent"), `bottomStartPercent` = getInt("bottomStartPercent"))
  14 -> androidx.compose.foundation.shape.RoundedCornerShape(`topEndPercent` = getInt("topEndPercent"), `bottomEndPercent` = getInt("bottomEndPercent"), `bottomStartPercent` = getInt("bottomStartPercent"))
  15 -> androidx.compose.foundation.shape.RoundedCornerShape(`topStartPercent` = getInt("topStartPercent"), `topEndPercent` = getInt("topEndPercent"), `bottomEndPercent` = getInt("bottomEndPercent"), `bottomStartPercent` = getInt("bottomStartPercent"))
  else -> error("Invalid generated arguments for androidx.compose.foundation.shape.RoundedCornerShape")
}

internal fun JSONObject.decodeComposeTransformOrigin(): androidx.compose.ui.graphics.TransformOrigin = androidx.compose.ui.graphics.TransformOrigin(
  `pivotFractionX` = getDouble("pivotFractionX").toFloat(),
  `pivotFractionY` = getDouble("pivotFractionY").toFloat(),
)

internal fun JSONObject.decodeComposeBlurRadiusSpecValue(): androidx.compose.ui.graphics.blur.BlurRadiusSpec = when (val factory = getString("factory")) {
  "BlurRadiusSpec.horizontalGradient" -> when { has("startRadius") || has("endRadius") -> decodeComposeBlurRadiusSpecValueFactory0(); has("stops") -> decodeComposeBlurRadiusSpecValueFactory1(); else -> error("No BlurRadiusSpec.horizontalGradient overload accepts these fields") }
  "BlurRadiusSpec.linearGradient" -> when { has("startRadius") || has("endRadius") -> decodeComposeBlurRadiusSpecValueFactory2(); has("stops") -> decodeComposeBlurRadiusSpecValueFactory3(); else -> error("No BlurRadiusSpec.linearGradient overload accepts these fields") }
  "BlurRadiusSpec.radialGradient" -> when { has("startRadius") || has("endRadius") -> decodeComposeBlurRadiusSpecValueFactory4(); has("stops") -> decodeComposeBlurRadiusSpecValueFactory5(); else -> error("No BlurRadiusSpec.radialGradient overload accepts these fields") }
  "BlurRadiusSpec.uniform" -> decodeComposeBlurRadiusSpecValueFactory6()
  "BlurRadiusSpec.verticalGradient" -> when { has("startRadius") || has("endRadius") -> decodeComposeBlurRadiusSpecValueFactory7(); has("stops") -> decodeComposeBlurRadiusSpecValueFactory8(); else -> error("No BlurRadiusSpec.verticalGradient overload accepts these fields") }
  else -> error("Unknown ComposeBlurRadiusSpecValue factory: " + factory)
}

private fun JSONObject.decodeComposeBlurRadiusSpecValueFactory0(): androidx.compose.ui.graphics.blur.BlurRadiusSpec = androidx.compose.ui.graphics.blur.BlurRadiusSpec.Companion.horizontalGradient(
  `startRadius` = getDouble("startRadius").dp,
  `endRadius` = getDouble("endRadius").dp,
)

private fun JSONObject.decodeComposeBlurRadiusSpecValueFactory1(): androidx.compose.ui.graphics.blur.BlurRadiusSpec = androidx.compose.ui.graphics.blur.BlurRadiusSpec.Companion.horizontalGradient(
  `stops` = getJSONArray("stops").let { items -> List(items.length()) { index -> with(items) { getJSONObject(index).decodeComposeBlurStopValue() } } },
)

private fun JSONObject.decodeComposeBlurRadiusSpecValueFactory2(): androidx.compose.ui.graphics.blur.BlurRadiusSpec = androidx.compose.ui.graphics.blur.BlurRadiusSpec.Companion.linearGradient(
  `start` = getJSONObject("start").decodeComposeDpOffset(),
  `end` = getJSONObject("end").decodeComposeDpOffset(),
  `startRadius` = getDouble("startRadius").dp,
  `endRadius` = getDouble("endRadius").dp,
)

private fun JSONObject.decodeComposeBlurRadiusSpecValueFactory3(): androidx.compose.ui.graphics.blur.BlurRadiusSpec = androidx.compose.ui.graphics.blur.BlurRadiusSpec.Companion.linearGradient(
  `start` = getJSONObject("start").decodeComposeDpOffset(),
  `end` = getJSONObject("end").decodeComposeDpOffset(),
  `stops` = getJSONArray("stops").let { items -> List(items.length()) { index -> with(items) { getJSONObject(index).decodeComposeBlurStopValue() } } },
)

private fun JSONObject.decodeComposeBlurRadiusSpecValueFactory4(): androidx.compose.ui.graphics.blur.BlurRadiusSpec = when ((if (has("center")) 1 else 0) + (if (has("fallOffRadius")) 2 else 0)) {
  0 -> androidx.compose.ui.graphics.blur.BlurRadiusSpec.Companion.radialGradient(`startRadius` = getDouble("startRadius").dp, `endRadius` = getDouble("endRadius").dp)
  1 -> androidx.compose.ui.graphics.blur.BlurRadiusSpec.Companion.radialGradient(`startRadius` = getDouble("startRadius").dp, `endRadius` = getDouble("endRadius").dp, `center` = getJSONObject("center").decodeComposeDpOffset())
  2 -> androidx.compose.ui.graphics.blur.BlurRadiusSpec.Companion.radialGradient(`startRadius` = getDouble("startRadius").dp, `endRadius` = getDouble("endRadius").dp, `fallOffRadius` = getDouble("fallOffRadius").dp)
  3 -> androidx.compose.ui.graphics.blur.BlurRadiusSpec.Companion.radialGradient(`startRadius` = getDouble("startRadius").dp, `endRadius` = getDouble("endRadius").dp, `center` = getJSONObject("center").decodeComposeDpOffset(), `fallOffRadius` = getDouble("fallOffRadius").dp)
  else -> error("Invalid generated arguments for androidx.compose.ui.graphics.blur.BlurRadiusSpec.Companion.radialGradient")
}

private fun JSONObject.decodeComposeBlurRadiusSpecValueFactory5(): androidx.compose.ui.graphics.blur.BlurRadiusSpec = when ((if (has("center")) 1 else 0) + (if (has("fallOffRadius")) 2 else 0)) {
  0 -> androidx.compose.ui.graphics.blur.BlurRadiusSpec.Companion.radialGradient(`stops` = getJSONArray("stops").let { items -> List(items.length()) { index -> with(items) { getJSONObject(index).decodeComposeBlurStopValue() } } })
  1 -> androidx.compose.ui.graphics.blur.BlurRadiusSpec.Companion.radialGradient(`stops` = getJSONArray("stops").let { items -> List(items.length()) { index -> with(items) { getJSONObject(index).decodeComposeBlurStopValue() } } }, `center` = getJSONObject("center").decodeComposeDpOffset())
  2 -> androidx.compose.ui.graphics.blur.BlurRadiusSpec.Companion.radialGradient(`stops` = getJSONArray("stops").let { items -> List(items.length()) { index -> with(items) { getJSONObject(index).decodeComposeBlurStopValue() } } }, `fallOffRadius` = getDouble("fallOffRadius").dp)
  3 -> androidx.compose.ui.graphics.blur.BlurRadiusSpec.Companion.radialGradient(`stops` = getJSONArray("stops").let { items -> List(items.length()) { index -> with(items) { getJSONObject(index).decodeComposeBlurStopValue() } } }, `center` = getJSONObject("center").decodeComposeDpOffset(), `fallOffRadius` = getDouble("fallOffRadius").dp)
  else -> error("Invalid generated arguments for androidx.compose.ui.graphics.blur.BlurRadiusSpec.Companion.radialGradient")
}

private fun JSONObject.decodeComposeBlurRadiusSpecValueFactory6(): androidx.compose.ui.graphics.blur.BlurRadiusSpec = androidx.compose.ui.graphics.blur.BlurRadiusSpec.Companion.uniform(
  `radius` = getDouble("radius").dp,
)

private fun JSONObject.decodeComposeBlurRadiusSpecValueFactory7(): androidx.compose.ui.graphics.blur.BlurRadiusSpec = androidx.compose.ui.graphics.blur.BlurRadiusSpec.Companion.verticalGradient(
  `startRadius` = getDouble("startRadius").dp,
  `endRadius` = getDouble("endRadius").dp,
)

private fun JSONObject.decodeComposeBlurRadiusSpecValueFactory8(): androidx.compose.ui.graphics.blur.BlurRadiusSpec = androidx.compose.ui.graphics.blur.BlurRadiusSpec.Companion.verticalGradient(
  `stops` = getJSONArray("stops").let { items -> List(items.length()) { index -> with(items) { getJSONObject(index).decodeComposeBlurStopValue() } } },
)

internal fun JSONObject.decodeComposeBlurStopValue(): androidx.compose.ui.graphics.blur.BlurStop = androidx.compose.ui.graphics.blur.BlurStop(
  `fraction` = getDouble("fraction").toFloat(),
  `radius` = getDouble("radius").dp,
)

internal fun JSONObject.decodeComposeStrokeValue(): androidx.compose.ui.graphics.drawscope.Stroke = when ((if (has("width")) 1 else 0) + (if (has("miter")) 2 else 0) + (if (has("cap")) 4 else 0) + (if (has("join")) 8 else 0)) {
  0 -> androidx.compose.ui.graphics.drawscope.Stroke()
  1 -> androidx.compose.ui.graphics.drawscope.Stroke(`width` = getDouble("width").toFloat())
  2 -> androidx.compose.ui.graphics.drawscope.Stroke(`miter` = getDouble("miter").toFloat())
  3 -> androidx.compose.ui.graphics.drawscope.Stroke(`width` = getDouble("width").toFloat(), `miter` = getDouble("miter").toFloat())
  4 -> androidx.compose.ui.graphics.drawscope.Stroke(`cap` = toComposeStrokeCapValue(getString("cap")))
  5 -> androidx.compose.ui.graphics.drawscope.Stroke(`width` = getDouble("width").toFloat(), `cap` = toComposeStrokeCapValue(getString("cap")))
  6 -> androidx.compose.ui.graphics.drawscope.Stroke(`miter` = getDouble("miter").toFloat(), `cap` = toComposeStrokeCapValue(getString("cap")))
  7 -> androidx.compose.ui.graphics.drawscope.Stroke(`width` = getDouble("width").toFloat(), `miter` = getDouble("miter").toFloat(), `cap` = toComposeStrokeCapValue(getString("cap")))
  8 -> androidx.compose.ui.graphics.drawscope.Stroke(`join` = toComposeStrokeJoinValue(getString("join")))
  9 -> androidx.compose.ui.graphics.drawscope.Stroke(`width` = getDouble("width").toFloat(), `join` = toComposeStrokeJoinValue(getString("join")))
  10 -> androidx.compose.ui.graphics.drawscope.Stroke(`miter` = getDouble("miter").toFloat(), `join` = toComposeStrokeJoinValue(getString("join")))
  11 -> androidx.compose.ui.graphics.drawscope.Stroke(`width` = getDouble("width").toFloat(), `miter` = getDouble("miter").toFloat(), `join` = toComposeStrokeJoinValue(getString("join")))
  12 -> androidx.compose.ui.graphics.drawscope.Stroke(`cap` = toComposeStrokeCapValue(getString("cap")), `join` = toComposeStrokeJoinValue(getString("join")))
  13 -> androidx.compose.ui.graphics.drawscope.Stroke(`width` = getDouble("width").toFloat(), `cap` = toComposeStrokeCapValue(getString("cap")), `join` = toComposeStrokeJoinValue(getString("join")))
  14 -> androidx.compose.ui.graphics.drawscope.Stroke(`miter` = getDouble("miter").toFloat(), `cap` = toComposeStrokeCapValue(getString("cap")), `join` = toComposeStrokeJoinValue(getString("join")))
  15 -> androidx.compose.ui.graphics.drawscope.Stroke(`width` = getDouble("width").toFloat(), `miter` = getDouble("miter").toFloat(), `cap` = toComposeStrokeCapValue(getString("cap")), `join` = toComposeStrokeJoinValue(getString("join")))
  else -> error("Invalid generated arguments for ComposeStrokeValue")
}

internal fun JSONObject.decodeComposeDpTouchBoundsExpansionValue(): androidx.compose.ui.node.DpTouchBoundsExpansion = androidx.compose.ui.node.DpTouchBoundsExpansion(
  `start` = getDouble("start").dp,
  `top` = getDouble("top").dp,
  `end` = getDouble("end").dp,
  `bottom` = getDouble("bottom").dp,
  `isLayoutDirectionAware` = getBoolean("isLayoutDirectionAware"),
)

internal fun JSONObject.decodeComposeParagraphStyleValue(): androidx.compose.ui.text.ParagraphStyle {
  var value = androidx.compose.ui.text.ParagraphStyle()
  if (has("textAlign")) value = value.copy(`textAlign` = toComposeTextAlign(getString("textAlign")))
  if (has("textDirection")) value = value.copy(`textDirection` = toComposeTextDirectionValue(getString("textDirection")))
  if (has("lineHeight")) value = value.copy(`lineHeight` = getDouble("lineHeight").sp)
  if (has("textIndent")) value = value.copy(`textIndent` = if (get("textIndent") === JSONObject.NULL) null else getJSONObject("textIndent").decodeComposeTextIndentValue())
  if (has("platformStyle")) value = value.copy(`platformStyle` = if (get("platformStyle") === JSONObject.NULL) null else toComposePlatformParagraphStyleValue(getString("platformStyle")))
  if (has("lineHeightStyle")) value = value.copy(`lineHeightStyle` = if (get("lineHeightStyle") === JSONObject.NULL) null else getJSONObject("lineHeightStyle").decodeComposeLineHeightStyleValue())
  if (has("lineBreak")) value = value.copy(`lineBreak` = toComposeLineBreakValue(getString("lineBreak")))
  if (has("hyphens")) value = value.copy(`hyphens` = toComposeHyphensValue(getString("hyphens")))
  if (has("textMotion")) value = value.copy(`textMotion` = if (get("textMotion") === JSONObject.NULL) null else toComposeTextMotionValue(getString("textMotion")))
  return value
}

internal fun JSONObject.decodeComposePlatformTextStyleValue(): androidx.compose.ui.text.PlatformTextStyle = androidx.compose.ui.text.PlatformTextStyle(
  `spanStyle` = if (get("spanStyle") === JSONObject.NULL) null else toComposePlatformSpanStyleValue(getString("spanStyle")),
  `paragraphStyle` = if (get("paragraphStyle") === JSONObject.NULL) null else toComposePlatformParagraphStyleValue(getString("paragraphStyle")),
)

internal fun JSONObject.decodeComposeSpanStyleValue(): androidx.compose.ui.text.SpanStyle {
  var value = androidx.compose.ui.text.SpanStyle()
  if (has("color")) value = value.copy(`color` = parseComposeColor(getString("color")))
  if (has("fontSize")) value = value.copy(`fontSize` = getDouble("fontSize").sp)
  if (has("fontWeight")) value = value.copy(`fontWeight` = if (get("fontWeight") === JSONObject.NULL) null else toComposeFontWeight(getString("fontWeight")))
  if (has("fontStyle")) value = value.copy(`fontStyle` = if (get("fontStyle") === JSONObject.NULL) null else toComposeFontStyleValue(getString("fontStyle")))
  if (has("fontSynthesis")) value = value.copy(`fontSynthesis` = if (get("fontSynthesis") === JSONObject.NULL) null else toComposeFontSynthesisValue(getString("fontSynthesis")))
  if (has("fontFamily")) value = value.copy(`fontFamily` = if (get("fontFamily") === JSONObject.NULL) null else getJSONObject("fontFamily").decodeComposeFontFamilyValue())
  if (has("fontFeatureSettings")) value = value.copy(`fontFeatureSettings` = if (get("fontFeatureSettings") === JSONObject.NULL) null else getString("fontFeatureSettings"))
  if (has("letterSpacing")) value = value.copy(`letterSpacing` = getDouble("letterSpacing").sp)
  if (has("baselineShift")) value = value.copy(`baselineShift` = if (get("baselineShift") === JSONObject.NULL) null else getJSONObject("baselineShift").decodeComposeBaselineShiftValue())
  if (has("textGeometricTransform")) value = value.copy(`textGeometricTransform` = if (get("textGeometricTransform") === JSONObject.NULL) null else getJSONObject("textGeometricTransform").decodeComposeTextGeometricTransformValue())
  if (has("localeList")) value = value.copy(`localeList` = if (get("localeList") === JSONObject.NULL) null else getJSONObject("localeList").decodeComposeLocaleListValue())
  if (has("background")) value = value.copy(`background` = parseComposeColor(getString("background")))
  if (has("textDecoration")) value = value.copy(`textDecoration` = if (get("textDecoration") === JSONObject.NULL) null else toComposeTextDecorationValue(getString("textDecoration")))
  if (has("shadow")) value = value.copy(`shadow` = if (get("shadow") === JSONObject.NULL) null else getJSONObject("shadow").decodeComposeShadowValue())
  if (has("platformStyle")) value = value.copy(`platformStyle` = if (get("platformStyle") === JSONObject.NULL) null else toComposePlatformSpanStyleValue(getString("platformStyle")))
  return value
}

internal fun JSONObject.decodeComposeTextStyleValue(): androidx.compose.ui.text.TextStyle {
  var value = androidx.compose.ui.text.TextStyle()
  if (has("color")) value = value.copy(`color` = parseComposeColor(getString("color")))
  if (has("fontSize")) value = value.copy(`fontSize` = getDouble("fontSize").sp)
  if (has("fontWeight")) value = value.copy(`fontWeight` = if (get("fontWeight") === JSONObject.NULL) null else toComposeFontWeight(getString("fontWeight")))
  if (has("fontStyle")) value = value.copy(`fontStyle` = if (get("fontStyle") === JSONObject.NULL) null else toComposeFontStyleValue(getString("fontStyle")))
  if (has("fontSynthesis")) value = value.copy(`fontSynthesis` = if (get("fontSynthesis") === JSONObject.NULL) null else toComposeFontSynthesisValue(getString("fontSynthesis")))
  if (has("fontFamily")) value = value.copy(`fontFamily` = if (get("fontFamily") === JSONObject.NULL) null else getJSONObject("fontFamily").decodeComposeFontFamilyValue())
  if (has("fontFeatureSettings")) value = value.copy(`fontFeatureSettings` = if (get("fontFeatureSettings") === JSONObject.NULL) null else getString("fontFeatureSettings"))
  if (has("letterSpacing")) value = value.copy(`letterSpacing` = getDouble("letterSpacing").sp)
  if (has("baselineShift")) value = value.copy(`baselineShift` = if (get("baselineShift") === JSONObject.NULL) null else getJSONObject("baselineShift").decodeComposeBaselineShiftValue())
  if (has("textGeometricTransform")) value = value.copy(`textGeometricTransform` = if (get("textGeometricTransform") === JSONObject.NULL) null else getJSONObject("textGeometricTransform").decodeComposeTextGeometricTransformValue())
  if (has("localeList")) value = value.copy(`localeList` = if (get("localeList") === JSONObject.NULL) null else getJSONObject("localeList").decodeComposeLocaleListValue())
  if (has("background")) value = value.copy(`background` = parseComposeColor(getString("background")))
  if (has("textDecoration")) value = value.copy(`textDecoration` = if (get("textDecoration") === JSONObject.NULL) null else toComposeTextDecorationValue(getString("textDecoration")))
  if (has("shadow")) value = value.copy(`shadow` = if (get("shadow") === JSONObject.NULL) null else getJSONObject("shadow").decodeComposeShadowValue())
  if (has("textAlign")) value = value.copy(`textAlign` = toComposeTextAlign(getString("textAlign")))
  if (has("textDirection")) value = value.copy(`textDirection` = toComposeTextDirectionValue(getString("textDirection")))
  if (has("lineHeight")) value = value.copy(`lineHeight` = getDouble("lineHeight").sp)
  if (has("textIndent")) value = value.copy(`textIndent` = if (get("textIndent") === JSONObject.NULL) null else getJSONObject("textIndent").decodeComposeTextIndentValue())
  if (has("platformStyle")) value = value.copy(`platformStyle` = if (get("platformStyle") === JSONObject.NULL) null else getJSONObject("platformStyle").decodeComposePlatformTextStyleValue())
  if (has("lineHeightStyle")) value = value.copy(`lineHeightStyle` = if (get("lineHeightStyle") === JSONObject.NULL) null else getJSONObject("lineHeightStyle").decodeComposeLineHeightStyleValue())
  if (has("lineBreak")) value = value.copy(`lineBreak` = toComposeLineBreakValue(getString("lineBreak")))
  if (has("hyphens")) value = value.copy(`hyphens` = toComposeHyphensValue(getString("hyphens")))
  if (has("textMotion")) value = value.copy(`textMotion` = if (get("textMotion") === JSONObject.NULL) null else toComposeTextMotionValue(getString("textMotion")))
  return value
}

internal fun JSONObject.decodeComposeDeviceFontFamilyNameValue(): androidx.compose.ui.text.font.DeviceFontFamilyName = androidx.compose.ui.text.font.DeviceFontFamilyName(
  `name` = getString("name"),
)

internal fun JSONObject.decodeComposeFontValue(): androidx.compose.ui.text.font.Font = when ((if (has("weight")) 1 else 0) + (if (has("style")) 2 else 0)) {
  0 -> androidx.compose.ui.text.font.Font(`familyName` = getJSONObject("familyName").decodeComposeDeviceFontFamilyNameValue())
  1 -> androidx.compose.ui.text.font.Font(`familyName` = getJSONObject("familyName").decodeComposeDeviceFontFamilyNameValue(), `weight` = toComposeFontWeight(getString("weight")))
  2 -> androidx.compose.ui.text.font.Font(`familyName` = getJSONObject("familyName").decodeComposeDeviceFontFamilyNameValue(), `style` = toComposeFontStyleValue(getString("style")))
  3 -> androidx.compose.ui.text.font.Font(`familyName` = getJSONObject("familyName").decodeComposeDeviceFontFamilyNameValue(), `weight` = toComposeFontWeight(getString("weight")), `style` = toComposeFontStyleValue(getString("style")))
  else -> error("Invalid generated arguments for ComposeFontValue")
}

internal fun JSONObject.decodeComposeFontFamilyValue(): androidx.compose.ui.text.font.FontFamily = androidx.compose.ui.text.font.FontFamily(
  `fonts` = getJSONArray("fonts").let { items -> List(items.length()) { index -> with(items) { getJSONObject(index).decodeComposeFontValue() } } },
)

internal fun JSONObject.decodeComposeLocaleValue(): androidx.compose.ui.text.intl.Locale = androidx.compose.ui.text.intl.Locale(
  `languageTag` = getString("languageTag"),
)

internal fun JSONObject.decodeComposeLocaleListValue(): androidx.compose.ui.text.intl.LocaleList = androidx.compose.ui.text.intl.LocaleList(
  `localeList` = getJSONArray("localeList").let { items -> List(items.length()) { index -> with(items) { getJSONObject(index).decodeComposeLocaleValue() } } },
)

internal fun JSONObject.decodeComposeBaselineShiftValue(): androidx.compose.ui.text.style.BaselineShift = androidx.compose.ui.text.style.BaselineShift(
  `multiplier` = getDouble("multiplier").toFloat(),
)

internal fun JSONObject.decodeComposeLineHeightStyleValue(): androidx.compose.ui.text.style.LineHeightStyle = androidx.compose.ui.text.style.LineHeightStyle(
  `alignment` = getJSONObject("alignment").decodeComposeLineHeightStyleAlignmentValue(),
  `trim` = toComposeLineHeightStyleTrimValue(getString("trim")),
  `mode` = toComposeLineHeightStyleModeValue(getString("mode")),
)

internal fun JSONObject.decodeComposeLineHeightStyleAlignmentValue(): androidx.compose.ui.text.style.LineHeightStyle.Alignment = androidx.compose.ui.text.style.LineHeightStyle.Alignment(
  `topRatio` = getDouble("topRatio").toFloat(),
)

internal fun JSONObject.decodeComposeTextGeometricTransformValue(): androidx.compose.ui.text.style.TextGeometricTransform = when ((if (has("scaleX")) 1 else 0) + (if (has("skewX")) 2 else 0)) {
  0 -> androidx.compose.ui.text.style.TextGeometricTransform()
  1 -> androidx.compose.ui.text.style.TextGeometricTransform(`scaleX` = getDouble("scaleX").toFloat())
  2 -> androidx.compose.ui.text.style.TextGeometricTransform(`skewX` = getDouble("skewX").toFloat())
  3 -> androidx.compose.ui.text.style.TextGeometricTransform(`scaleX` = getDouble("scaleX").toFloat(), `skewX` = getDouble("skewX").toFloat())
  else -> error("Invalid generated arguments for ComposeTextGeometricTransformValue")
}

internal fun JSONObject.decodeComposeTextIndentValue(): androidx.compose.ui.text.style.TextIndent = when ((if (has("firstLine")) 1 else 0) + (if (has("restLine")) 2 else 0)) {
  0 -> androidx.compose.ui.text.style.TextIndent()
  1 -> androidx.compose.ui.text.style.TextIndent(`firstLine` = getDouble("firstLine").sp)
  2 -> androidx.compose.ui.text.style.TextIndent(`restLine` = getDouble("restLine").sp)
  3 -> androidx.compose.ui.text.style.TextIndent(`firstLine` = getDouble("firstLine").sp, `restLine` = getDouble("restLine").sp)
  else -> error("Invalid generated arguments for ComposeTextIndentValue")
}

internal fun JSONObject.decodeComposeDensityValue(): androidx.compose.ui.unit.Density = when ((if (has("fontScale")) 1 else 0)) {
  0 -> androidx.compose.ui.unit.Density(`density` = getDouble("density").toFloat())
  1 -> androidx.compose.ui.unit.Density(`density` = getDouble("density").toFloat(), `fontScale` = getDouble("fontScale").toFloat())
  else -> error("Invalid generated arguments for ComposeDensityValue")
}

internal fun JSONObject.decodeComposeDpOffset(): androidx.compose.ui.unit.DpOffset = androidx.compose.ui.unit.DpOffset(
  `x` = getDouble("x").dp,
  `y` = getDouble("y").dp,
)

internal fun JSONObject.decodeComposeIntOffset(): androidx.compose.ui.unit.IntOffset = androidx.compose.ui.unit.IntOffset(
  `x` = getInt("x"),
  `y` = getInt("y"),
)
