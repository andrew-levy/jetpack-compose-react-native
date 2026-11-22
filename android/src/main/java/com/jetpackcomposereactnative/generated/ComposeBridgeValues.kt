package com.jetpackcomposereactnative.generated

import androidx.compose.foundation.BasicTooltipState
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.rememberBasicTooltipState
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.text.input.TextFieldState
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.material3.DatePickerDefaults
import androidx.compose.material3.DatePickerFormatter
import androidx.compose.material3.DatePickerState
import androidx.compose.material3.DateRangePickerState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.SearchBarState
import androidx.compose.material3.SearchBarValue
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.TooltipDefaults
import androidx.compose.material3.TooltipState
import androidx.compose.material3.SwipeToDismissBoxState
import androidx.compose.material3.SwipeToDismissBoxValue
import androidx.compose.material3.TimePickerState
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.material3.rememberDateRangePickerState
import androidx.compose.material3.rememberSwipeToDismissBoxState
import androidx.compose.material3.rememberTimePickerState
import androidx.compose.material3.rememberSearchBarState
import androidx.compose.material3.rememberTooltipState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.focus.FocusProperties
import androidx.compose.ui.focus.FocusState
import androidx.compose.ui.semantics.CustomAccessibilityAction
import androidx.compose.ui.semantics.SemanticsPropertyReceiver
import androidx.compose.ui.semantics.customActions
import androidx.compose.ui.semantics.onClick
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.disabled
import androidx.compose.ui.semantics.heading
import androidx.compose.ui.semantics.role
import androidx.compose.ui.semantics.stateDescription
import androidx.compose.ui.spatial.RelativeLayoutBounds
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.ColorPainter
import androidx.compose.ui.layout.FirstBaseline
import androidx.compose.ui.layout.HorizontalAlignmentLine
import androidx.compose.ui.layout.LastBaseline
import androidx.compose.ui.layout.LayoutCoordinates
import androidx.compose.ui.window.PopupPositionProvider
import androidx.compose.ui.layout.positionInRoot
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.TextRange
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jetpackcomposereactnative.common.parseComposeColor
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

internal fun JSONObject.toDpSize(): DpSize = DpSize(getDouble("width").dp, getDouble("height").dp)

internal fun JSONObject.toAnnotatedString(): AnnotatedString {
  val text = getString("text")
  if (!has("spans") && !has("annotations")) return AnnotatedString(text)
  val builder = AnnotatedString.Builder(text)
  optJSONArray("spans")?.let { spans ->
    for (index in 0 until spans.length()) {
      val span = spans.getJSONObject(index)
      val (start, end) = span.textBounds(text.length)
      builder.addStyle(SpanStyle(
        color = span.textColor("color"),
        background = span.textColor("background"),
        fontSize = span.textUnit("fontSize"),
        fontWeight = span.optString("fontWeight").takeIf { it.isNotEmpty() }?.let(::toComposeFontWeight),
        fontStyle = if (span.has("italic")) {
          if (span.getBoolean("italic")) FontStyle.Italic else FontStyle.Normal
        } else null,
        textDecoration = when (span.optString("decoration")) {
          "underline" -> TextDecoration.Underline
          "lineThrough" -> TextDecoration.LineThrough
          "none" -> TextDecoration.None
          else -> null
        },
      ), start, end)
    }
  }
  optJSONArray("annotations")?.let { annotations ->
    for (index in 0 until annotations.length()) {
      val annotation = annotations.getJSONObject(index)
      val (start, end) = annotation.textBounds(text.length)
      builder.addStringAnnotation(annotation.getString("tag"), annotation.getString("value"), start, end)
    }
  }
  return builder.toAnnotatedString()
}

private fun JSONObject.textBounds(length: Int): Pair<Int, Int> {
  val start = getInt("start")
  val end = getInt("end")
  require(start in 0..length && end in start..length) { "Compose text span is outside the text" }
  return start to end
}

private fun JSONObject.textColor(name: String): Color =
  if (isNull(name)) Color.Unspecified else parseComposeColor(getString(name))

internal fun JSONObject.toTextStyle(): TextStyle = TextStyle(
  color = optString("color").takeIf { it.isNotEmpty() }?.let(::parseComposeColor) ?: Color.Unspecified,
  fontSize = textUnit("fontSize"),
  lineHeight = textUnit("lineHeight"),
  letterSpacing = textUnit("letterSpacing"),
)

private fun JSONObject.textUnit(name: String): TextUnit =
  if (isNull(name)) TextUnit.Unspecified else getDouble(name).sp

@Composable
internal fun JSONObject.rememberComposePainter(): Painter {
  if (has("icon")) return rememberVectorPainter(
    composeMaterialIcon(optString("style", "filled"), getString("icon")),
  )
  if (has("color")) {
    val color = getString("color")
    return remember(color) { ColorPainter(parseComposeColor(color)) }
  }
  val context = LocalContext.current
  val drawable = getString("drawable")
  val id = remember(context, drawable) {
    context.resources.getIdentifier(drawable, "drawable", context.packageName)
  }
  require(id != 0) { "Unknown Android drawable: " + drawable }
  return painterResource(id)
}

@Composable
internal fun JSONObject.rememberComposeTextFieldState(): TextFieldState =
  rememberTextFieldState(initialText = optString("initialText"))

internal fun IntSize.toComposeSnapshot(): JSONObject =
  JSONObject().put("width", width).put("height", height)

internal fun LayoutCoordinates.toComposeSnapshot(): JSONObject {
  val position = positionInRoot()
  return size.toComposeSnapshot().put("x", position.x.toDouble()).put("y", position.y.toDouble())
}

internal fun FocusState.toComposeSnapshot(): JSONObject =
  JSONObject().put("isFocused", isFocused).put("hasFocus", hasFocus).put("isCaptured", isCaptured)

private fun JSONObject.longOrNull(name: String): Long? = if (isNull(name)) null else getLong(name)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun JSONObject.rememberComposeDatePickerState(): DatePickerState {
  val initialDate = longOrNull("initialSelectedDateMillis")
  return rememberDatePickerState(
    initialSelectedDateMillis = initialDate,
    initialDisplayedMonthMillis = longOrNull("initialDisplayedMonthMillis") ?: initialDate,
  )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun JSONObject.rememberComposeDateRangePickerState(): DateRangePickerState {
  val initialStart = longOrNull("initialSelectedStartDateMillis")
  return rememberDateRangePickerState(
    initialSelectedStartDateMillis = initialStart,
    initialSelectedEndDateMillis = longOrNull("initialSelectedEndDateMillis"),
    initialDisplayedMonthMillis = longOrNull("initialDisplayedMonthMillis") ?: initialStart,
  )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun JSONObject.rememberComposeTimePickerState(): TimePickerState =
  rememberTimePickerState(
    initialHour = optInt("initialHour"),
    initialMinute = optInt("initialMinute"),
    is24Hour = optBoolean("is24Hour"),
  )

@Composable
internal fun JSONObject.rememberComposeSwipeToDismissState(): SwipeToDismissBoxState =
  rememberSwipeToDismissBoxState(
    initialValue = when (val value = optString("initialValue", "settled")) {
      "settled" -> SwipeToDismissBoxValue.Settled
      "startToEnd" -> SwipeToDismissBoxValue.StartToEnd
      "endToStart" -> SwipeToDismissBoxValue.EndToStart
      else -> error("Unknown swipe-to-dismiss state: " + value)
    },
  )

internal fun JSONObject.toGridCells(): GridCells =
  if (has("count")) GridCells.Fixed(getInt("count")) else GridCells.Adaptive(getDouble("minSize").dp)

internal fun JSONObject.toStaggeredGridCells(): StaggeredGridCells =
  if (has("count")) StaggeredGridCells.Fixed(getInt("count")) else StaggeredGridCells.Adaptive(getDouble("minSize").dp)

internal fun RelativeLayoutBounds.toComposeSnapshot(): JSONObject = JSONObject()
  .put("width", boundsInRoot.width).put("height", boundsInRoot.height)
  .put("x", boundsInRoot.left).put("y", boundsInRoot.top)

internal fun JSONObject.toFocusProperties(): FocusProperties.() -> Unit = {
  canFocus = getBoolean("canFocus")
}

internal fun JSONObject.toSemantics(args: ComposeModifierArguments): SemanticsPropertyReceiver.() -> Unit = {
  if (this@toSemantics.has("contentDescription")) contentDescription = getString("contentDescription")
  if (this@toSemantics.has("stateDescription")) stateDescription = getString("stateDescription")
  if (this@toSemantics.has("role")) role = toComposeRole(getString("role"))
  if (optBoolean("heading")) heading()
  if (optBoolean("disabled")) disabled()
  if (!isNull("onClick")) onClick(optString("onClickLabel").takeIf { it.isNotEmpty() }) {
    args.emitValueEvent(this@toSemantics, "onClick", null)
    true
  }
  optJSONArray("customActions")?.let { actions ->
    customActions = List(actions.length()) { index ->
      val action = actions.getJSONObject(index)
      CustomAccessibilityAction(action.getString("label")) {
        args.emitValueEvent(action, "onAction", null)
        true
      }
    }
  }
}

internal fun toComposeAlignmentLine(value: String): HorizontalAlignmentLine = when (value) {
  "firstBaseline" -> FirstBaseline
  "lastBaseline" -> LastBaseline
  else -> error("Unknown alignment line: " + value)
}

@OptIn(ExperimentalMaterial3Api::class)
internal fun JSONObject.toDatePickerFormatter(): DatePickerFormatter = DatePickerDefaults.dateFormatter(
  yearSelectionSkeleton = optString("yearSelectionSkeleton", DatePickerDefaults.YearMonthSkeleton),
  selectedDateSkeleton = optString("selectedDateSkeleton", DatePickerDefaults.YearAbbrMonthDaySkeleton),
  selectedDateDescriptionSkeleton = optString("selectedDateDescriptionSkeleton", DatePickerDefaults.YearMonthWeekdayDaySkeleton),
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun JSONObject.rememberComposeSearchBarState(): SearchBarState = rememberSearchBarState(
  initialValue = if (optBoolean("initiallyExpanded")) SearchBarValue.Expanded else SearchBarValue.Collapsed,
)

@OptIn(ExperimentalFoundationApi::class)
@Composable
internal fun JSONObject.rememberComposeBasicTooltipState(): BasicTooltipState = rememberBasicTooltipState(
  initialIsVisible = optBoolean("initiallyVisible"),
  isPersistent = optBoolean("persistent", true),
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun JSONObject.rememberComposeTooltipState(): TooltipState = rememberTooltipState(
  initialIsVisible = optBoolean("initiallyVisible"),
  isPersistent = optBoolean("persistent"),
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun JSONObject.rememberComposePopupPosition(): PopupPositionProvider = if (isNull("spacing")) {
  TooltipDefaults.rememberTooltipPositionProvider()
} else {
  TooltipDefaults.rememberTooltipPositionProvider(spacingBetweenTooltipAndAnchor = getDouble("spacing").dp)
}

@Composable
internal fun JSONObject.rememberComposeSnackbarHostState(): SnackbarHostState {
  val state = remember { SnackbarHostState() }
  val message = optString("message")
  LaunchedEffect(state, message) {
    if (message.isNotEmpty()) state.showSnackbar(message)
  }
  return state
}

internal fun JSONObject.toComposeTextFieldValue(): TextFieldValue = TextFieldValue(
  text = getString("text"),
  selection = optJSONObject("selection")?.toComposeTextRange() ?: TextRange.Zero,
  composition = optJSONObject("composition")?.toComposeTextRange(),
)

private fun JSONObject.toComposeTextRange() = TextRange(getInt("start"), getInt("end"))

internal fun TextFieldValue.toComposeSnapshot(): JSONObject = JSONObject()
  .put("text", text)
  .put("selection", selection.toComposeSnapshot())
  .put("composition", composition?.toComposeSnapshot() ?: JSONObject.NULL)

private fun TextRange.toComposeSnapshot() = JSONObject().put("start", start).put("end", end)

@OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
@Composable
internal fun JSONObject.rememberComposeCarouselState(node: ComposeNode): androidx.compose.material3.carousel.CarouselState =
  androidx.compose.material3.carousel.rememberCarouselState(initialItem = optInt("initialItem")) { node.children.size }

internal fun TextLayoutResult.toComposeSnapshot(): JSONObject = JSONObject()
  .put("width", size.width).put("height", size.height).put("lineCount", lineCount)
  .put("didOverflowWidth", didOverflowWidth).put("didOverflowHeight", didOverflowHeight)
