package com.jetpackcomposereactnative.generated

import androidx.compose.animation.ContentTransform
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
import androidx.compose.animation.core.keyframes
import androidx.compose.animation.core.snap
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.scaleIn
import androidx.compose.animation.scaleOut
import androidx.compose.animation.slideIn
import androidx.compose.animation.slideOut
import androidx.compose.animation.togetherWith
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.IntSize
import kotlin.math.roundToInt
import org.json.JSONArray
import org.json.JSONObject

internal fun JSONObject.toComposeFloatAnimationSpec(): FiniteAnimationSpec<Float> =
  toComposeAnimationSpec { it.getDouble("value").toFloat() }

internal fun JSONObject.toComposeSizeAnimationSpec(): FiniteAnimationSpec<IntSize> =
  toComposeAnimationSpec {
    val size = it.getJSONObject("value")
    IntSize(size.getInt("width"), size.getInt("height"))
  }

internal fun JSONObject.toComposeOffsetAnimationSpec(): FiniteAnimationSpec<IntOffset> =
  toComposeAnimationSpec {
    val point = it.getJSONObject("value")
    IntOffset(point.getInt("x"), point.getInt("y"))
  }

internal fun JSONObject.toComposeRectAnimationSpec(): FiniteAnimationSpec<Rect> =
  toComposeAnimationSpec {
    val rect = it.getJSONObject("value")
    Rect(rect.getDouble("left").toFloat(), rect.getDouble("top").toFloat(),
      rect.getDouble("right").toFloat(), rect.getDouble("bottom").toFloat())
  }

private fun <T> JSONObject.toComposeAnimationSpec(decode: (JSONObject) -> T): FiniteAnimationSpec<T> =
  when (val kind = getString("type")) {
    "spring" -> spring(
      dampingRatio = optDouble("dampingRatio", Spring.DampingRatioNoBouncy.toDouble()).toFloat(),
      stiffness = optDouble("stiffness", Spring.StiffnessMedium.toDouble()).toFloat(),
    )
    "tween" -> tween(durationMillis = optInt("durationMillis", 300), delayMillis = optInt("delayMillis"), easing = composeEasing())
    "snap" -> snap(delayMillis = optInt("delayMillis"))
    "keyframes" -> keyframes {
      durationMillis = getInt("durationMillis")
      delayMillis = optInt("delayMillis")
      require(durationMillis >= 0 && delayMillis >= 0) { "Compose keyframe duration and delay must be nonnegative" }
      val frames = getJSONArray("frames")
      val timestamps = mutableSetOf<Int>()
      for (index in 0 until frames.length()) {
        val frame = frames.getJSONObject(index)
        val time = frame.getInt("atMillis")
        require(time in 0..durationMillis && timestamps.add(time)) { "Invalid or duplicate Compose keyframe time: $time" }
        val keyframe = decode(frame) at time
        if (frame.has("easing")) keyframe using frame.composeEasing()
      }
    }
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
      if (spec == null) fadeIn(initialAlpha = alpha) else fadeIn(spec.toComposeFloatAnimationSpec(), alpha)
    }
    "scale" -> {
      val scale = optDouble("scale", 0.8).toFloat()
      val spec = optJSONObject("animationSpec")
      if (spec == null) scaleIn(initialScale = scale) else scaleIn(spec.toComposeFloatAnimationSpec(), scale)
    }
    "slide" -> {
      val spec = optJSONObject("animationSpec")
      val offset = slideOffset()
      if (spec == null) slideIn(initialOffset = offset) else slideIn(spec.toComposeOffsetAnimationSpec(), offset)
    }
    else -> error("Unknown Compose enter transition: $kind")
  }

internal fun JSONObject.toComposeExitTransition(): ExitTransition =
  when (val kind = getString("type")) {
    "none" -> ExitTransition.None
    "fade" -> {
      val alpha = optDouble("alpha", 0.0).toFloat()
      val spec = optJSONObject("animationSpec")
      if (spec == null) fadeOut(targetAlpha = alpha) else fadeOut(spec.toComposeFloatAnimationSpec(), alpha)
    }
    "scale" -> {
      val scale = optDouble("scale", 0.8).toFloat()
      val spec = optJSONObject("animationSpec")
      if (spec == null) scaleOut(targetScale = scale) else scaleOut(spec.toComposeFloatAnimationSpec(), scale)
    }
    "slide" -> {
      val spec = optJSONObject("animationSpec")
      val offset = slideOffset()
      if (spec == null) slideOut(targetOffset = offset) else slideOut(spec.toComposeOffsetAnimationSpec(), offset)
    }
    else -> error("Unknown Compose exit transition: $kind")
  }

private fun JSONObject.slideOffset(): (IntSize) -> IntOffset {
  val fraction = optDouble("fraction", 1.0)
  require(fraction.isFinite() && fraction >= 0) { "Compose slide fraction must be finite and nonnegative" }
  return when (val direction = getString("direction")) {
    "up" -> { size -> IntOffset(0, (-size.height * fraction).roundToInt()) }
    "down" -> { size -> IntOffset(0, (size.height * fraction).roundToInt()) }
    "left" -> { size -> IntOffset((-size.width * fraction).roundToInt(), 0) }
    "right" -> { size -> IntOffset((size.width * fraction).roundToInt(), 0) }
    else -> error("Unknown Compose slide direction: $direction")
  }
}

internal fun JSONObject.toComposeContentTransition(): ContentTransform =
  getJSONObject("enter").toComposeEnterTransition() togetherWith getJSONObject("exit").toComposeExitTransition()
