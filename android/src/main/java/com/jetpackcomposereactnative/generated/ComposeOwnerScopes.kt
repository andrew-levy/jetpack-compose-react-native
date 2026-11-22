package com.jetpackcomposereactnative.generated

import androidx.compose.animation.AnimatedVisibilityScope
import androidx.compose.animation.BoundsTransform
import androidx.compose.animation.SharedTransitionScope
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.layout.LookaheadScope
import org.json.JSONObject

private data class OwnerScopes(
  val shared: SharedTransitionScope? = null,
  val visibility: AnimatedVisibilityScope? = null,
  val lookahead: LookaheadScope? = null,
)

private val LocalOwnerScopes = compositionLocalOf { OwnerScopes() }

@Composable
internal fun WithComposeOwners(scope: Any?, content: @Composable () -> Unit) {
  val previous = LocalOwnerScopes.current
  val next = when (scope) {
    is SharedTransitionScope -> previous.copy(shared = scope, lookahead = scope)
    is AnimatedVisibilityScope -> previous.copy(visibility = scope)
    is LookaheadScope -> previous.copy(lookahead = scope)
    else -> previous
  }
  if (previous == next) content() else CompositionLocalProvider(LocalOwnerScopes provides next, content = content)
}

@Composable
internal fun currentComposeSharedTransitionScope(): SharedTransitionScope =
  checkNotNull(LocalOwnerScopes.current.shared) { "Shared content requires SharedTransitionLayout" }

@Composable
internal fun JSONObject.rememberComposeSharedContentState(): SharedTransitionScope.SharedContentState =
  currentComposeSharedTransitionScope().rememberSharedContentState(getString("key"))

@Composable
internal fun currentComposeVisibilityScope(): AnimatedVisibilityScope =
  checkNotNull(LocalOwnerScopes.current.visibility) { "A shared transition requires AnimatedContent or AnimatedVisibility" }

@Composable
internal fun currentComposeLookaheadScope(): LookaheadScope =
  checkNotNull(LocalOwnerScopes.current.lookahead) { "animateBounds requires a LookaheadScope or SharedTransitionLayout" }

internal fun JSONObject.toComposeBoundsTransform(): BoundsTransform = BoundsTransform { _, _ ->
  toComposeAnimationSpec<Rect>()
}
