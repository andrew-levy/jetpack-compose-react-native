package com.jetpackcomposereactnative.generated

import androidx.compose.foundation.layout.ExperimentalFlexBoxApi
import androidx.compose.foundation.layout.ExperimentalGridApi
import androidx.compose.foundation.layout.FlexBoxConfig
import androidx.compose.foundation.layout.FlexConfig
import androidx.compose.foundation.layout.FlexDirection
import androidx.compose.foundation.layout.FlexWrap
import androidx.compose.foundation.layout.GridConfigurationScope
import androidx.compose.foundation.layout.GridFlow
import androidx.compose.foundation.layout.GridTrackSize
import androidx.compose.foundation.pager.PageSize
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.input.TextFieldLineLimits
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.shadow.Shadow
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import com.jetpackcomposereactnative.common.parseComposeColor
import org.json.JSONObject

internal fun JSONObject.toComposeKeyboardOptions(): KeyboardOptions = KeyboardOptions(
  capitalization = when (optString("capitalization")) {
    "none" -> KeyboardCapitalization.None
    "characters" -> KeyboardCapitalization.Characters
    "words" -> KeyboardCapitalization.Words
    "sentences" -> KeyboardCapitalization.Sentences
    else -> KeyboardCapitalization.Unspecified
  },
  keyboardType = when (optString("keyboardType")) {
    "text" -> KeyboardType.Text
    "ascii" -> KeyboardType.Ascii
    "number" -> KeyboardType.Number
    "phone" -> KeyboardType.Phone
    "uri" -> KeyboardType.Uri
    "email" -> KeyboardType.Email
    "password" -> KeyboardType.Password
    "numberPassword" -> KeyboardType.NumberPassword
    "decimal" -> KeyboardType.Decimal
    else -> KeyboardType.Unspecified
  },
  imeAction = when (optString("imeAction")) {
    "default" -> ImeAction.Default
    "none" -> ImeAction.None
    "go" -> ImeAction.Go
    "search" -> ImeAction.Search
    "send" -> ImeAction.Send
    "previous" -> ImeAction.Previous
    "next" -> ImeAction.Next
    "done" -> ImeAction.Done
    else -> ImeAction.Unspecified
  },
  autoCorrectEnabled = if (isNull("autoCorrectEnabled")) null else getBoolean("autoCorrectEnabled"),
  showKeyboardOnFocus = if (isNull("showKeyboardOnFocus")) null else getBoolean("showKeyboardOnFocus"),
)

internal fun JSONObject.toComposeTextFieldLineLimits(): TextFieldLineLimits = when (getString("type")) {
  "singleLine" -> TextFieldLineLimits.SingleLine
  "multiLine" -> TextFieldLineLimits.MultiLine(
    minHeightInLines = optInt("minHeightInLines", 1),
    maxHeightInLines = optInt("maxHeightInLines", Int.MAX_VALUE),
  )
  else -> error("Unknown Compose text field line limits: " + getString("type"))
}

internal fun JSONObject.toComposePageSize(): PageSize = when (getString("type")) {
  "fill" -> PageSize.Fill
  "fixed" -> PageSize.Fixed(getDouble("size").dp)
  else -> error("Unknown Compose page size: " + getString("type"))
}

internal fun JSONObject.toComposeShadow(): Shadow = Shadow(
  radius = getDouble("radius").dp,
  color = if (isNull("color")) Color.Black else parseComposeColor(getString("color")),
  spread = optDouble("spread", 0.0).dp,
  offset = optJSONObject("offset")?.let { DpOffset(it.getDouble("x").dp, it.getDouble("y").dp) } ?: DpOffset.Zero,
  alpha = optDouble("alpha", 1.0).toFloat(),
)

@OptIn(ExperimentalGridApi::class)
internal fun JSONObject.toComposeGridConfig(): GridConfigurationScope.() -> Unit = {
  val columnTracks = getJSONArray("columns")
  val rowTracks = getJSONArray("rows")
  for (index in 0 until columnTracks.length()) column(decodeTrack(columnTracks.get(index)))
  for (index in 0 until rowTracks.length()) row(decodeTrack(rowTracks.get(index)))
  if (optString("flow") == "column") flow = GridFlow.Column
  if (!isNull("gap")) gap(getDouble("gap").dp)
  if (!isNull("rowGap")) rowGap(getDouble("rowGap").dp)
  if (!isNull("columnGap")) columnGap(getDouble("columnGap").dp)
}

@OptIn(ExperimentalGridApi::class)
private fun GridConfigurationScope.decodeTrack(track: Any): GridTrackSize = when (track) {
  "auto" -> GridTrackSize.Auto
  is Number -> GridTrackSize.Fixed(track.toDouble().dp)
  is JSONObject -> if (track.has("fr")) GridTrackSize.Flex(track.getDouble("fr").fr)
    else GridTrackSize.Percentage(track.getDouble("fraction").toFloat())
  else -> error("Unknown Compose grid track: $track")
}

@OptIn(ExperimentalFlexBoxApi::class)
internal fun JSONObject.toComposeFlexBoxConfig(): FlexBoxConfig = FlexBoxConfig {
  direction(when (optString("direction")) {
    "rowReverse" -> FlexDirection.RowReverse
    "column" -> FlexDirection.Column
    "columnReverse" -> FlexDirection.ColumnReverse
    else -> FlexDirection.Row
  })
  wrap(when (optString("wrap")) {
    "wrap" -> FlexWrap.Wrap
    "wrapReverse" -> FlexWrap.WrapReverse
    else -> FlexWrap.NoWrap
  })
  if (!isNull("gap")) gap(getDouble("gap").dp)
  if (!isNull("rowGap")) rowGap(getDouble("rowGap").dp)
  if (!isNull("columnGap")) columnGap(getDouble("columnGap").dp)
}

@OptIn(ExperimentalFlexBoxApi::class)
internal fun JSONObject.toComposeFlexConfig(): FlexConfig = FlexConfig {
  if (!isNull("grow")) grow(getDouble("grow").toFloat())
  if (!isNull("shrink")) shrink(getDouble("shrink").toFloat())
  if (!isNull("order")) order(getInt("order"))
  when (val value = opt("basis")) {
    is Number -> basis(value.toDouble().dp)
    is JSONObject -> basis(value.getDouble("fraction").toFloat())
  }
}

internal fun JSONObject.toComposeBorderStroke(): androidx.compose.foundation.BorderStroke =
  androidx.compose.foundation.BorderStroke(getDouble("width").dp, parseComposeColor(getString("color")))
