package com.jetpackcomposereactnative.generated

import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.animation.core.CubicBezierEasing
import androidx.compose.animation.core.Easing
import androidx.compose.animation.core.FastOutLinearInEasing
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.FiniteAnimationSpec
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.snap
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import org.json.JSONArray
import org.json.JSONObject

internal fun <T> JSONObject.toComposeAnimationSpec(): FiniteAnimationSpec<T> =
  when (val kind = getString("type")) {
    "spring" -> spring(
      dampingRatio = optDouble("dampingRatio", Spring.DampingRatioNoBouncy.toDouble()).toFloat(),
      stiffness = optDouble("stiffness", Spring.StiffnessMedium.toDouble()).toFloat(),
    )
    "tween" -> tween(durationMillis = optInt("durationMillis", 300), delayMillis = optInt("delayMillis"), easing = composeEasing())
    "snap" -> snap(delayMillis = optInt("delayMillis"))
    else -> error("Unknown Compose animation spec: $kind")
  }

private fun JSONObject.composeEasing(): Easing = when (val value = opt("easing")) {
  null, "fastOutSlowIn" -> FastOutSlowInEasing
  "linear" -> LinearEasing
  "linearOutSlowIn" -> LinearOutSlowInEasing
  "fastOutLinearIn" -> FastOutLinearInEasing
  is JSONArray -> CubicBezierEasing(
    value.getDouble(0).toFloat(), value.getDouble(1).toFloat(),
    value.getDouble(2).toFloat(), value.getDouble(3).toFloat(),
  )
  else -> error("Unknown Compose easing: $value")
}

internal fun JSONObject.toComposeEnterTransition(): EnterTransition =
  when (val kind = getString("type")) {
    "none" -> EnterTransition.None
    "fade" -> {
      val alpha = optDouble("alpha", 0.0).toFloat()
      val spec = optJSONObject("animationSpec")
      if (spec == null) fadeIn(initialAlpha = alpha) else fadeIn(spec.toComposeAnimationSpec(), alpha)
    }
    else -> error("Unknown Compose enter transition: $kind")
  }

internal fun JSONObject.toComposeExitTransition(): ExitTransition =
  when (val kind = getString("type")) {
    "none" -> ExitTransition.None
    "fade" -> {
      val alpha = optDouble("alpha", 0.0).toFloat()
      val spec = optJSONObject("animationSpec")
      if (spec == null) fadeOut(targetAlpha = alpha) else fadeOut(spec.toComposeAnimationSpec(), alpha)
    }
    else -> error("Unknown Compose exit transition: $kind")
  }
