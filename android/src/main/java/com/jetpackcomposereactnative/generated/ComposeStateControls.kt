package com.jetpackcomposereactnative.generated

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.grid.LazyGridState
import androidx.compose.foundation.lazy.grid.rememberLazyGridState
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState
import androidx.compose.foundation.lazy.staggeredgrid.rememberLazyStaggeredGridState
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.BottomSheetScaffoldState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.SheetState
import androidx.compose.material3.rememberBottomSheetScaffoldState
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.material3.rememberStandardBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.key
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.snapshotFlow
import androidx.compose.runtime.withFrameNanos
import kotlinx.coroutines.flow.first
import org.json.JSONArray
import org.json.JSONObject

private data class StateCommand(val revision: Long, val operation: String, val target: Int, val offsetPx: Int)

@Composable
private fun <T : Any, S> JSONObject.controlledState(
  kind: String,
  args: ComposeModifierArguments,
  create: @Composable () -> T,
  snapshot: (T) -> S,
  encode: (S) -> JSONObject,
  execute: suspend (T, StateCommand) -> Unit,
): T = key(optString("token")) {
  val state = create()
  val options by rememberUpdatedState(this)
  val eventArgs by rememberUpdatedState(args)
  val listener = optString("onStateChange")
  if (listener.isNotEmpty()) {
    LaunchedEffect(state, listener) {
      snapshotFlow { snapshot(state) }.collect {
        eventArgs.emitValueEvent(options, "onStateChange", encode(it))
      }
    }
  }

  val command = optJSONObject("command")?.takeIf { optString("kind") == kind }?.let {
    StateCommand(it.getLong("revision"), it.getString("operation"), it.optInt("target"), it.optInt("offsetPx"))
  }
  if (command != null) {
    val token = getString("token")
    val handles = LocalComposeNativeHandles.current
    LaunchedEffect(state, command.revision) {
      withFrameNanos { }
      if (handles.claimControlCommand(kind, token, command.revision)) execute(state, command)
    }
  }
  state
}

private data class LazySnapshot(
  val index: Int,
  val offsetPx: Int,
  val indices: List<Int>,
  val count: Int,
  val scrolling: Boolean,
) {
  fun json(): JSONObject = JSONObject()
    .put("firstVisibleItemIndex", index).put("firstVisibleItemScrollOffsetPx", offsetPx)
    .put("visibleItemIndices", JSONArray(indices)).put("totalItemsCount", count)
    .put("isScrollInProgress", scrolling)
}

@Composable
private fun <T : Any> JSONObject.controlledLazyState(
  args: ComposeModifierArguments,
  create: @Composable () -> T,
  snapshot: (T) -> LazySnapshot,
  itemCount: (T) -> Int,
  scroll: suspend (T, Int, Int) -> Unit,
  animate: suspend (T, Int, Int) -> Unit,
): T = controlledState("lazy", args, create, snapshot, LazySnapshot::json) { state, command ->
  val count = snapshotFlow { itemCount(state) }.first { it > 0 }
  val index = command.target.coerceIn(0, count - 1)
  when (command.operation) {
    "scroll" -> scroll(state, index, command.offsetPx)
    "animate" -> animate(state, index, command.offsetPx)
  }
}

@Composable
internal fun JSONObject.rememberComposeLazyListState(args: ComposeModifierArguments): LazyListState =
  controlledLazyState(
    args, { rememberLazyListState(optInt("initialIndex"), optInt("initialOffsetPx")) },
    { state ->
      val layout = state.layoutInfo
      LazySnapshot(state.firstVisibleItemIndex, state.firstVisibleItemScrollOffset,
        layout.visibleItemsInfo.map { it.index }, layout.totalItemsCount, state.isScrollInProgress)
    },
    { it.layoutInfo.totalItemsCount }, LazyListState::scrollToItem, LazyListState::animateScrollToItem,
  )

@Composable
internal fun JSONObject.rememberComposeLazyGridState(args: ComposeModifierArguments): LazyGridState =
  controlledLazyState(
    args, { rememberLazyGridState(optInt("initialIndex"), optInt("initialOffsetPx")) },
    { state ->
      val layout = state.layoutInfo
      LazySnapshot(state.firstVisibleItemIndex, state.firstVisibleItemScrollOffset,
        layout.visibleItemsInfo.map { it.index }, layout.totalItemsCount, state.isScrollInProgress)
    },
    { it.layoutInfo.totalItemsCount }, LazyGridState::scrollToItem, LazyGridState::animateScrollToItem,
  )

@Composable
internal fun JSONObject.rememberComposeLazyStaggeredGridState(args: ComposeModifierArguments): LazyStaggeredGridState =
  controlledLazyState(
    args, { rememberLazyStaggeredGridState(optInt("initialIndex"), optInt("initialOffsetPx")) },
    { state ->
      val layout = state.layoutInfo
      LazySnapshot(state.firstVisibleItemIndex, state.firstVisibleItemScrollOffset,
        layout.visibleItemsInfo.map { it.index }, layout.totalItemsCount, state.isScrollInProgress)
    },
    { it.layoutInfo.totalItemsCount }, LazyStaggeredGridState::scrollToItem, LazyStaggeredGridState::animateScrollToItem,
  )

private data class PagerSnapshot(
  val currentPage: Int, val settledPage: Int, val targetPage: Int, val offset: Float, val scrolling: Boolean,
) {
  fun json(): JSONObject = JSONObject()
    .put("currentPage", currentPage).put("settledPage", settledPage).put("targetPage", targetPage)
    .put("currentPageOffsetFraction", offset.toDouble()).put("isScrollInProgress", scrolling)
}

@Composable
internal fun JSONObject.rememberComposePagerState(node: ComposeNode): PagerState =
  controlledState(
    "pager", node.arguments(), { rememberPagerState(initialPage = optInt("initialPage")) { node.children.size } },
    { PagerSnapshot(it.currentPage, it.settledPage, it.targetPage, it.currentPageOffsetFraction, it.isScrollInProgress) },
    PagerSnapshot::json,
  ) { state, command ->
    val count = snapshotFlow { state.pageCount }.first { it > 0 }
    val page = command.target.coerceIn(0, count - 1)
    when (command.operation) {
      "scroll" -> state.scrollToPage(page)
      "animate" -> state.animateScrollToPage(page)
    }
  }

private data class ScrollSnapshot(val offsetPx: Int, val maxOffsetPx: Int, val scrolling: Boolean) {
  fun json(): JSONObject = JSONObject()
    .put("offsetPx", offsetPx).put("maxOffsetPx", maxOffsetPx).put("isScrollInProgress", scrolling)
}

@Composable
internal fun JSONObject.rememberComposeScrollState(args: ComposeModifierArguments): ScrollState =
  controlledState(
    "scroll", args, { rememberScrollState(optInt("initialOffsetPx")) },
    { ScrollSnapshot(it.value, it.maxValue, it.isScrollInProgress) }, ScrollSnapshot::json,
  ) { state, command ->
    val max = snapshotFlow { state.maxValue }.first { it != Int.MAX_VALUE }
    val offset = command.target.coerceIn(0, max)
    when (command.operation) {
      "scroll" -> state.scrollTo(offset)
      "animate" -> state.animateScrollTo(offset)
    }
  }

private data class SheetSnapshot(val current: String, val target: String, val visible: Boolean) {
  fun json(): JSONObject = JSONObject()
    .put("currentValue", current).put("targetValue", target).put("isVisible", visible)
}

@OptIn(ExperimentalMaterial3Api::class)
private fun SheetState.snapshot() = SheetSnapshot(
  currentValue.name.replaceFirstChar { it.lowercaseChar() },
  targetValue.name.replaceFirstChar { it.lowercaseChar() },
  isVisible,
)

@OptIn(ExperimentalMaterial3Api::class)
private suspend fun SheetState.runCommand(command: StateCommand, allowHide: Boolean) {
  when (command.operation) {
    "show" -> show()
    "hide" -> if (allowHide) hide()
    "expand" -> if (hasExpandedState) expand()
    "partialExpand" -> if (hasPartiallyExpandedState) partialExpand()
  }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun JSONObject.rememberComposeSheetState(args: ComposeModifierArguments): SheetState =
  controlledState(
    "sheet", args, { rememberModalBottomSheetState(skipPartiallyExpanded = optBoolean("skipPartiallyExpanded")) },
    SheetState::snapshot, SheetSnapshot::json,
  ) { state, command -> state.runCommand(command, allowHide = true) }

@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun JSONObject.rememberComposeBottomSheetScaffoldState(args: ComposeModifierArguments): BottomSheetScaffoldState {
  val skipHiddenState = optBoolean("skipHiddenState", true)
  val sheet = controlledState(
    "sheetScaffold", args, { rememberStandardBottomSheetState(skipHiddenState = skipHiddenState) },
    SheetState::snapshot, SheetSnapshot::json,
  ) { state, command -> state.runCommand(command, allowHide = !skipHiddenState) }
  return rememberBottomSheetScaffoldState(bottomSheetState = sheet)
}
