package com.jetpackcomposereactnative.generated

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.relocation.BringIntoViewRequester
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.RangeSliderState
import androidx.compose.material3.SliderState
import androidx.compose.material3.pulltorefresh.PullToRefreshState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.runtime.withFrameNanos
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.layout.LayoutBoundsHolder
import java.lang.ref.WeakReference
import org.json.JSONObject

internal class ComposeNativeHandles {
  private val entries = mutableMapOf<Pair<String, String>, WeakReference<Entry<*>>>()

  internal class Entry<T : Any>(val value: T) {
    private var revision = 0L

    fun claim(next: Long): Boolean {
      if (next <= revision) return false
      revision = next
      return true
    }
  }

  @Suppress("UNCHECKED_CAST")
  fun <T : Any> resolve(kind: String, token: String, factory: () -> T): Entry<T> {
    entries.entries.removeAll { it.value.get() == null }
    val key = kind to token
    val existing = entries[key]?.get()
    if (existing != null) return existing as Entry<T>
    return Entry(factory()).also { entries[key] = WeakReference(it) }
  }
}

internal val LocalComposeNativeHandles = staticCompositionLocalOf<ComposeNativeHandles> {
  error("Compose native handles must be used inside a Compose host")
}

@Composable
private fun <T : Any> JSONObject.rememberHandleEntry(
  kind: String,
  factory: () -> T,
): ComposeNativeHandles.Entry<T> {
  require(getString("kind") == kind) { "Expected Compose handle of kind $kind" }
  val token = getString("token")
  val store = LocalComposeNativeHandles.current
  return remember(store, kind, token) { store.resolve(kind, token, factory) }
}

@Composable
private fun <T : Any> JSONObject.rememberHandle(
  kind: String,
  factory: () -> T,
  execute: suspend (T, String) -> Unit,
): T {
  val entry = rememberHandleEntry(kind, factory)
  val command = optJSONObject("command")
  val revision = command?.getLong("revision")
  val operation = command?.getString("operation")
  LaunchedEffect(entry, revision) {
    if (revision != null && operation != null) {
      // Wait until modifier nodes from the same commit are attached.
      withFrameNanos { }
      if (entry.claim(revision)) execute(entry.value, operation)
    }
  }
  return entry.value
}

@Composable
internal fun JSONObject.rememberComposeFocusRequester(): FocusRequester =
  rememberHandle("focusRequester", { FocusRequester() }) { requester, operation ->
    when (operation) {
      "request" -> requester.requestFocus()
      "capture" -> requester.captureFocus()
      "free" -> requester.freeFocus()
    }
  }

@OptIn(ExperimentalFoundationApi::class)
@Composable
internal fun JSONObject.rememberComposeBringIntoViewRequester(): BringIntoViewRequester =
  rememberHandle("bringIntoViewRequester", { BringIntoViewRequester() }) { requester, operation ->
    if (operation == "bringIntoView") requester.bringIntoView()
  }

@Composable
internal fun JSONObject.rememberComposeInteractionSource(): MutableInteractionSource =
  rememberHandleEntry("interactionSource", { MutableInteractionSource() }).value

@Composable
internal fun JSONObject.rememberComposeLayoutBoundsHolder(): LayoutBoundsHolder =
  rememberHandleEntry("layoutBoundsHolder", ::LayoutBoundsHolder).value

@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun JSONObject.rememberComposePullToRefreshHandle(): PullToRefreshState =
  rememberHandleEntry("pullToRefreshState") { PullToRefreshState() }.value

@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun JSONObject.rememberComposeSliderHandle(): SliderState =
  rememberHandleEntry("sliderState") {
    val bounds = sliderRange("valueRange", 0f..1f)
    SliderState(
      value = optDouble("initialValue", bounds.start.toDouble()).toFloat().coerceIn(bounds),
      steps = optInt("steps"),
      valueRange = bounds,
    )
  }.value

@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun JSONObject.rememberComposeRangeSliderHandle(): RangeSliderState =
  rememberHandleEntry("rangeSliderState") {
    val bounds = sliderRange("valueRange", 0f..1f)
    val initial = sliderRange("initialRange", bounds)
    RangeSliderState(
      activeRangeStart = initial.start.coerceIn(bounds),
      activeRangeEnd = initial.endInclusive.coerceIn(bounds),
      steps = optInt("steps"),
      valueRange = bounds,
    )
  }.value

private fun JSONObject.sliderRange(name: String, default: ClosedFloatingPointRange<Float>): ClosedFloatingPointRange<Float> {
  val values = optJSONArray(name) ?: return default
  val start = values.getDouble(0).toFloat()
  val end = values.getDouble(1).toFloat()
  require(start.isFinite() && end.isFinite() && start <= end) { "Expected an ordered Compose slider range" }
  return start..end
}
