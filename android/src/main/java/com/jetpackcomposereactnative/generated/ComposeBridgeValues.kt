package com.jetpackcomposereactnative.generated

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.SheetState
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import org.json.JSONObject

internal fun JSONObject.toPaddingValues(): PaddingValues {
  val horizontal = optDouble("horizontal", optDouble("all", 0.0))
  val vertical = optDouble("vertical", optDouble("all", 0.0))
  return PaddingValues(
    start = optDouble("start", horizontal).dp,
    top = optDouble("top", vertical).dp,
    end = optDouble("end", horizontal).dp,
    bottom = optDouble("bottom", vertical).dp,
  )
}

internal fun JSONObject.toWindowInsets(): WindowInsets = WindowInsets(
  left = optDouble("left", 0.0).dp,
  top = optDouble("top", 0.0).dp,
  right = optDouble("right", 0.0).dp,
  bottom = optDouble("bottom", 0.0).dp,
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun JSONObject.rememberComposeSheetState(): SheetState =
  rememberModalBottomSheetState(skipPartiallyExpanded = optBoolean("skipPartiallyExpanded"))
