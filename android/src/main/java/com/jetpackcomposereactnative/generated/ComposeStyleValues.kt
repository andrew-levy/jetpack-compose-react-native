// Generated from Compose Foundation StyleScope by generate.mjs.
package com.jetpackcomposereactnative.generated

import androidx.compose.runtime.Composable
import androidx.compose.foundation.style.ExperimentalFoundationStyleApi
import androidx.compose.foundation.style.Style
import androidx.compose.foundation.style.StyleState
import androidx.compose.foundation.style.rememberUpdatedStyleState
import androidx.compose.foundation.style.disabled
import androidx.compose.foundation.style.checked
import androidx.compose.foundation.style.selected
import androidx.compose.foundation.style.focused
import androidx.compose.foundation.style.hovered
import androidx.compose.foundation.style.pressed
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.json.JSONArray
import org.json.JSONObject

@OptIn(ExperimentalFoundationStyleApi::class)
internal fun JSONObject.toComposeFoundationStyle(): Style {
  val args = ComposeModifierArguments(this) { _, _ -> }
  val alphaValue = if (args.isNull("alpha")) null else args.number("alpha").toFloat()
  val backgroundValue = if (args.isNull("background")) null else args.color("background")
  val baselineShiftValue = if (args.isNull("baselineShift")) null else args.jsonObject("baselineShift").decodeComposeBaselineShiftValue()
  val borderBrushValue = if (args.isNull("borderBrush")) null else args.brush("borderBrush")
  val borderColorValue = if (args.isNull("borderColor")) null else args.color("borderColor")
  val borderWidthValue = if (args.isNull("borderWidth")) null else args.number("borderWidth").dp
  val bottomValue = if (args.isNull("bottom")) null else args.number("bottom").dp
  val clipValue = if (args.isNull("clip")) null else args.boolean("clip")
  val contentBrushValue = if (args.isNull("contentBrush")) null else args.brush("contentBrush")
  val contentColorValue = if (args.isNull("contentColor")) null else args.color("contentColor")
  val contentPaddingValue = if (args.isNull("contentPadding")) null else args.number("contentPadding").dp
  val contentPaddingBottomValue = if (args.isNull("contentPaddingBottom")) null else args.number("contentPaddingBottom").dp
  val contentPaddingEndValue = if (args.isNull("contentPaddingEnd")) null else args.number("contentPaddingEnd").dp
  val contentPaddingHorizontalValue = if (args.isNull("contentPaddingHorizontal")) null else args.number("contentPaddingHorizontal").dp
  val contentPaddingStartValue = if (args.isNull("contentPaddingStart")) null else args.number("contentPaddingStart").dp
  val contentPaddingTopValue = if (args.isNull("contentPaddingTop")) null else args.number("contentPaddingTop").dp
  val contentPaddingVerticalValue = if (args.isNull("contentPaddingVertical")) null else args.number("contentPaddingVertical").dp
  val externalPaddingValue = if (args.isNull("externalPadding")) null else args.number("externalPadding").dp
  val externalPaddingBottomValue = if (args.isNull("externalPaddingBottom")) null else args.number("externalPaddingBottom").dp
  val externalPaddingEndValue = if (args.isNull("externalPaddingEnd")) null else args.number("externalPaddingEnd").dp
  val externalPaddingHorizontalValue = if (args.isNull("externalPaddingHorizontal")) null else args.number("externalPaddingHorizontal").dp
  val externalPaddingStartValue = if (args.isNull("externalPaddingStart")) null else args.number("externalPaddingStart").dp
  val externalPaddingTopValue = if (args.isNull("externalPaddingTop")) null else args.number("externalPaddingTop").dp
  val externalPaddingVerticalValue = if (args.isNull("externalPaddingVertical")) null else args.number("externalPaddingVertical").dp
  val fontSizeValue = if (args.isNull("fontSize")) null else args.number("fontSize").sp
  val fontStyleValue = if (args.isNull("fontStyle")) null else toComposeFontStyleValue(args.string("fontStyle"))
  val fontSynthesisValue = if (args.isNull("fontSynthesis")) null else toComposeFontSynthesisValue(args.string("fontSynthesis"))
  val fontWeightValue = if (args.isNull("fontWeight")) null else toComposeFontWeight(args.string("fontWeight"))
  val foregroundValue = if (args.isNull("foreground")) null else args.color("foreground")
  val heightValue = if (args.isNull("height")) null else args.number("height").dp
  val hyphensValue = if (args.isNull("hyphens")) null else toComposeHyphensValue(args.string("hyphens"))
  val leftValue = if (args.isNull("left")) null else args.number("left").dp
  val letterSpacingValue = if (args.isNull("letterSpacing")) null else args.number("letterSpacing").sp
  val lineBreakValue = if (args.isNull("lineBreak")) null else toComposeLineBreakValue(args.string("lineBreak"))
  val lineHeightValue = if (args.isNull("lineHeight")) null else args.number("lineHeight").sp
  val maxHeightValue = if (args.isNull("maxHeight")) null else args.number("maxHeight").dp
  val maxWidthValue = if (args.isNull("maxWidth")) null else args.number("maxWidth").dp
  val minHeightValue = if (args.isNull("minHeight")) null else args.number("minHeight").dp
  val minWidthValue = if (args.isNull("minWidth")) null else args.number("minWidth").dp
  val rightValue = if (args.isNull("right")) null else args.number("right").dp
  val rotationXValue = if (args.isNull("rotationX")) null else args.number("rotationX").toFloat()
  val rotationYValue = if (args.isNull("rotationY")) null else args.number("rotationY").toFloat()
  val rotationZValue = if (args.isNull("rotationZ")) null else args.number("rotationZ").toFloat()
  val scaleValue = if (args.isNull("scale")) null else args.number("scale").toFloat()
  val scaleXValue = if (args.isNull("scaleX")) null else args.number("scaleX").toFloat()
  val scaleYValue = if (args.isNull("scaleY")) null else args.number("scaleY").toFloat()
  val shapeValue = if (args.isNull("shape")) null else args.shape("shape")
  val sizeValue = if (args.isNull("size")) null else args.number("size").dp
  val textAlignValue = if (args.isNull("textAlign")) null else toComposeTextAlign(args.string("textAlign"))
  val textDecorationValue = if (args.isNull("textDecoration")) null else toComposeTextDecorationValue(args.string("textDecoration"))
  val textDirectionValue = if (args.isNull("textDirection")) null else toComposeTextDirectionValue(args.string("textDirection"))
  val textIndentValue = if (args.isNull("textIndent")) null else args.jsonObject("textIndent").decodeComposeTextIndentValue()
  val textStyleValue = if (args.isNull("textStyle")) null else args.jsonObject("textStyle").toTextStyle()
  val topValue = if (args.isNull("top")) null else args.number("top").dp
  val transformOriginValue = if (args.isNull("transformOrigin")) null else args.jsonObject("transformOrigin").decodeComposeTransformOrigin()
  val translationValue = if (args.isNull("translation")) null else args.jsonObject("translation").decodeComposeOffset()
  val translationXValue = if (args.isNull("translationX")) null else args.number("translationX").toFloat()
  val translationYValue = if (args.isNull("translationY")) null else args.number("translationY").toFloat()
  val widthValue = if (args.isNull("width")) null else args.number("width").dp
  val zIndexValue = if (args.isNull("zIndex")) null else args.number("zIndex").toFloat()
  val disabledValue = optJSONObject("whenDisabled")?.toComposeFoundationStyle()
  val checkedValue = optJSONObject("whenChecked")?.toComposeFoundationStyle()
  val selectedValue = optJSONObject("whenSelected")?.toComposeFoundationStyle()
  val focusedValue = optJSONObject("whenFocused")?.toComposeFoundationStyle()
  val hoveredValue = optJSONObject("whenHovered")?.toComposeFoundationStyle()
  val pressedValue = optJSONObject("whenPressed")?.toComposeFoundationStyle()
  val style = Style {
    alphaValue?.let { alpha(it) }
    backgroundValue?.let { background(it) }
    baselineShiftValue?.let { baselineShift(it) }
    borderBrushValue?.let { borderBrush(it) }
    borderColorValue?.let { borderColor(it) }
    borderWidthValue?.let { borderWidth(it) }
    bottomValue?.let { bottom(it) }
    clipValue?.let { clip(it) }
    contentBrushValue?.let { contentBrush(it) }
    contentColorValue?.let { contentColor(it) }
    contentPaddingValue?.let { contentPadding(it) }
    contentPaddingBottomValue?.let { contentPaddingBottom(it) }
    contentPaddingEndValue?.let { contentPaddingEnd(it) }
    contentPaddingHorizontalValue?.let { contentPaddingHorizontal(it) }
    contentPaddingStartValue?.let { contentPaddingStart(it) }
    contentPaddingTopValue?.let { contentPaddingTop(it) }
    contentPaddingVerticalValue?.let { contentPaddingVertical(it) }
    externalPaddingValue?.let { externalPadding(it) }
    externalPaddingBottomValue?.let { externalPaddingBottom(it) }
    externalPaddingEndValue?.let { externalPaddingEnd(it) }
    externalPaddingHorizontalValue?.let { externalPaddingHorizontal(it) }
    externalPaddingStartValue?.let { externalPaddingStart(it) }
    externalPaddingTopValue?.let { externalPaddingTop(it) }
    externalPaddingVerticalValue?.let { externalPaddingVertical(it) }
    fontSizeValue?.let { fontSize(it) }
    fontStyleValue?.let { fontStyle(it) }
    fontSynthesisValue?.let { fontSynthesis(it) }
    fontWeightValue?.let { fontWeight(it) }
    foregroundValue?.let { foreground(it) }
    heightValue?.let { height(it) }
    hyphensValue?.let { hyphens(it) }
    leftValue?.let { left(it) }
    letterSpacingValue?.let { letterSpacing(it) }
    lineBreakValue?.let { lineBreak(it) }
    lineHeightValue?.let { lineHeight(it) }
    maxHeightValue?.let { maxHeight(it) }
    maxWidthValue?.let { maxWidth(it) }
    minHeightValue?.let { minHeight(it) }
    minWidthValue?.let { minWidth(it) }
    rightValue?.let { right(it) }
    rotationXValue?.let { rotationX(it) }
    rotationYValue?.let { rotationY(it) }
    rotationZValue?.let { rotationZ(it) }
    scaleValue?.let { scale(it) }
    scaleXValue?.let { scaleX(it) }
    scaleYValue?.let { scaleY(it) }
    shapeValue?.let { shape(it) }
    sizeValue?.let { size(it) }
    textAlignValue?.let { textAlign(it) }
    textDecorationValue?.let { textDecoration(it) }
    textDirectionValue?.let { textDirection(it) }
    textIndentValue?.let { textIndent(it) }
    textStyleValue?.let { textStyle(it) }
    topValue?.let { top(it) }
    transformOriginValue?.let { transformOrigin(it) }
    translationValue?.let { translation(it) }
    translationXValue?.let { translationX(it) }
    translationYValue?.let { translationY(it) }
    widthValue?.let { width(it) }
    zIndexValue?.let { zIndex(it) }
    disabledValue?.let { disabled(it) }
    checkedValue?.let { checked(it) }
    selectedValue?.let { selected(it) }
    focusedValue?.let { focused(it) }
    hoveredValue?.let { hovered(it) }
    pressedValue?.let { pressed(it) }
  }
  val animation = optJSONObject("animationSpec")?.toComposeFloatAnimationSpec() ?: return style
  return Style { animate(animation, style) }
}

@OptIn(ExperimentalFoundationStyleApi::class)
internal fun JSONArray.toComposeFoundationStyles(): Array<Style> =
  Array(length()) { getJSONObject(it).toComposeFoundationStyle() }

@OptIn(ExperimentalFoundationStyleApi::class)
@Composable
internal fun JSONObject.rememberComposeFoundationStyleState(): StyleState {
  val source = optJSONObject("interactionSource")?.rememberComposeInteractionSource()
  return rememberUpdatedStyleState(source) { state ->
    state.isEnabled = optBoolean("enabled", true)
    state.isSelected = optBoolean("selected")
    state.isChecked = optBoolean("checked")
  }
}
