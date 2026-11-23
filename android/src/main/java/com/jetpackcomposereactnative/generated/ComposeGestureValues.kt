package com.jetpackcomposereactnative.generated

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.gestures.AnchoredDraggableState
import androidx.compose.foundation.gestures.Draggable2DState
import androidx.compose.foundation.gestures.DraggableAnchors
import androidx.compose.foundation.gestures.DraggableState
import androidx.compose.foundation.gestures.Scrollable2DState
import androidx.compose.foundation.gestures.ScrollableState
import androidx.compose.foundation.gestures.TransformableState
import androidx.compose.foundation.gestures.rememberDraggable2DState
import androidx.compose.foundation.gestures.rememberDraggableState
import androidx.compose.foundation.gestures.rememberScrollable2DState
import androidx.compose.foundation.gestures.rememberScrollableState
import androidx.compose.foundation.gestures.rememberTransformableState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.isSpecified
import androidx.compose.ui.unit.Velocity
import org.json.JSONObject

internal fun Offset.toComposeSnapshot(): JSONObject =
  JSONObject().put("x", x.toDouble()).put("y", y.toDouble())

internal fun Velocity.toComposeSnapshot(): JSONObject =
  JSONObject().put("x", x.toDouble()).put("y", y.toDouble())

@Composable
internal fun JSONObject.rememberComposeDragState(args: ComposeModifierArguments): DraggableState =
  rememberDraggableState { delta -> args.emitValueEvent(this, "onDelta", delta.toDouble()) }

@OptIn(ExperimentalFoundationApi::class)
@Composable
internal fun JSONObject.rememberComposeDrag2DState(args: ComposeModifierArguments): Draggable2DState =
  rememberDraggable2DState { delta -> args.emitValueEvent(this, "onDelta", delta.toComposeSnapshot()) }

@Composable
internal fun JSONObject.rememberComposeScrollableState(args: ComposeModifierArguments): ScrollableState {
  val fraction = consumptionFraction("consumeFraction")
  return rememberScrollableState { delta ->
    val consumed = delta * fraction
    args.emitValueEvent(this, "onDelta", consumed.toDouble())
    consumed
  }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
internal fun JSONObject.rememberComposeScrollable2DState(args: ComposeModifierArguments): Scrollable2DState {
  val fractions = optJSONObject("consumeFraction")
  val x = fractions?.consumptionFraction("x") ?: 1f
  val y = fractions?.consumptionFraction("y") ?: 1f
  return rememberScrollable2DState { delta ->
    val consumed = Offset(delta.x * x, delta.y * y)
    args.emitValueEvent(this, "onDelta", consumed.toComposeSnapshot())
    consumed
  }
}

@Composable
internal fun JSONObject.rememberComposeTransformableState(args: ComposeModifierArguments): TransformableState =
  rememberTransformableState { centroid, zoom, pan, rotation ->
    args.emitValueEvent(this, "onTransform", JSONObject()
      .put("centroid", if (centroid.isSpecified) centroid.toComposeSnapshot() else JSONObject.NULL)
      .put("zoom", zoom.toDouble())
      .put("pan", pan.toComposeSnapshot())
      .put("rotation", rotation.toDouble()))
  }

@OptIn(ExperimentalFoundationApi::class)
@Composable
internal fun JSONObject.rememberComposeAnchoredDragState(args: ComposeModifierArguments): AnchoredDraggableState<String> {
  val positions = getJSONObject("anchors")
  val initial = getString("initialValue")
  val coordinates = positions.keys().asSequence().associateWith { positions.getDouble(it).toFloat() }
  require(initial in coordinates && coordinates.values.all(Float::isFinite)) { "Invalid Compose drag anchors" }
  val anchors = remember(coordinates) {
    DraggableAnchors { coordinates.forEach { (name, position) -> name at position } }
  }
  val state = remember { AnchoredDraggableState(initial).also { it.updateAnchors(anchors) } }
  SideEffect { state.updateAnchors(anchors) }
  val configuration = rememberUpdatedState(this)
  val currentArgs = rememberUpdatedState(args)
  LaunchedEffect(state) {
    snapshotFlow { state.offset }.collect { offset ->
      if (offset.isFinite()) currentArgs.value.emitValueEvent(configuration.value, "onOffsetChange", offset.toDouble())
    }
  }
  LaunchedEffect(state) {
    snapshotFlow { state.settledValue }.collect { value ->
      currentArgs.value.emitValueEvent(configuration.value, "onSettled", value)
    }
  }
  return state
}

private fun JSONObject.consumptionFraction(name: String): Float =
  optDouble(name, 1.0).coerceIn(0.0, 1.0).toFloat()

@Composable
internal fun JSONObject.rememberComposeOverscrollEffect(): androidx.compose.foundation.OverscrollEffect? =
  androidx.compose.foundation.rememberOverscrollEffect()

private object NoFling : androidx.compose.foundation.gestures.FlingBehavior {
  override suspend fun androidx.compose.foundation.gestures.ScrollScope.performFling(initialVelocity: Float): Float =
    initialVelocity
}

@Composable
internal fun JSONObject.rememberComposeFlingBehavior(): androidx.compose.foundation.gestures.FlingBehavior =
  if (getString("type") == "none") NoFling else androidx.compose.foundation.gestures.ScrollableDefaults.flingBehavior()
