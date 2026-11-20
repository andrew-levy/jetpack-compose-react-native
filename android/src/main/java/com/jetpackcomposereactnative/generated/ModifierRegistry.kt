// Generated from Compose declarations by generate.mjs.
@file:Suppress("UNUSED_PARAMETER")

package com.jetpackcomposereactnative.generated

import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.background as composeModifier0
import androidx.compose.foundation.basicMarquee as composeModifier1
import androidx.compose.foundation.border as composeModifier2
import androidx.compose.foundation.clickable as composeModifier3
import androidx.compose.foundation.combinedClickable as composeModifier4
import androidx.compose.foundation.focusGroup as composeModifier5
import androidx.compose.foundation.focusable as composeModifier6
import androidx.compose.foundation.layout.absoluteOffset as composeModifier7
import androidx.compose.foundation.layout.absolutePadding as composeModifier8
import androidx.compose.foundation.layout.aspectRatio as composeModifier9
import androidx.compose.foundation.layout.captionBarPadding as composeModifier10
import androidx.compose.foundation.layout.defaultMinSize as composeModifier11
import androidx.compose.foundation.layout.displayCutoutPadding as composeModifier12
import androidx.compose.foundation.layout.fillMaxHeight as composeModifier13
import androidx.compose.foundation.layout.fillMaxSize as composeModifier14
import androidx.compose.foundation.layout.fillMaxWidth as composeModifier15
import androidx.compose.foundation.layout.height as composeModifier16
import androidx.compose.foundation.layout.heightIn as composeModifier17
import androidx.compose.foundation.layout.imePadding as composeModifier18
import androidx.compose.foundation.layout.mandatorySystemGesturesPadding as composeModifier19
import androidx.compose.foundation.layout.navigationBarsPadding as composeModifier20
import androidx.compose.foundation.layout.offset as composeModifier21
import androidx.compose.foundation.layout.padding as composeModifier22
import androidx.compose.foundation.layout.paddingFromBaseline as composeModifier23
import androidx.compose.foundation.layout.recalculateWindowInsets as composeModifier24
import androidx.compose.foundation.layout.requiredHeight as composeModifier25
import androidx.compose.foundation.layout.requiredHeightIn as composeModifier26
import androidx.compose.foundation.layout.requiredSize as composeModifier27
import androidx.compose.foundation.layout.requiredSizeIn as composeModifier28
import androidx.compose.foundation.layout.requiredWidth as composeModifier29
import androidx.compose.foundation.layout.requiredWidthIn as composeModifier30
import androidx.compose.foundation.layout.safeContentPadding as composeModifier31
import androidx.compose.foundation.layout.safeDrawingPadding as composeModifier32
import androidx.compose.foundation.layout.safeGesturesPadding as composeModifier33
import androidx.compose.foundation.layout.size as composeModifier34
import androidx.compose.foundation.layout.sizeIn as composeModifier35
import androidx.compose.foundation.layout.statusBarsPadding as composeModifier36
import androidx.compose.foundation.layout.systemBarsPadding as composeModifier37
import androidx.compose.foundation.layout.systemGesturesPadding as composeModifier38
import androidx.compose.foundation.layout.waterfallPadding as composeModifier39
import androidx.compose.foundation.layout.width as composeModifier40
import androidx.compose.foundation.layout.widthIn as composeModifier41
import androidx.compose.foundation.layout.wrapContentHeight as composeModifier42
import androidx.compose.foundation.layout.wrapContentSize as composeModifier43
import androidx.compose.foundation.layout.wrapContentWidth as composeModifier44
import androidx.compose.foundation.preferKeepClear as composeModifier45
import androidx.compose.foundation.progressSemantics as composeModifier46
import androidx.compose.foundation.selection.selectable as composeModifier47
import androidx.compose.foundation.selection.selectableGroup as composeModifier48
import androidx.compose.foundation.selection.toggleable as composeModifier49
import androidx.compose.foundation.systemGestureExclusion as composeModifier50
import androidx.compose.ui.draw.alpha as composeModifier51
import androidx.compose.ui.draw.blur as composeModifier52
import androidx.compose.ui.draw.clip as composeModifier53
import androidx.compose.ui.draw.clipToBounds as composeModifier54
import androidx.compose.ui.draw.rotate as composeModifier55
import androidx.compose.ui.draw.scale as composeModifier56
import androidx.compose.ui.draw.shadow as composeModifier57
import androidx.compose.ui.graphics.graphicsLayer as composeModifier58
import androidx.compose.ui.graphics.toolingGraphicsLayer as composeModifier59
import androidx.compose.ui.platform.testTag as composeModifier60
import androidx.compose.ui.sensitiveContent as composeModifier61
import androidx.compose.ui.zIndex as composeModifier62

internal fun applyComposeModifier(id: Int, modifier: Modifier, args: ComposeModifierArguments, scope: Any?): Modifier? = when (id) {
  0 -> apply0(modifier, args)
  1 -> apply1(modifier, args)
  2 -> apply2(modifier, args)
  3 -> apply3(modifier, args)
  4 -> apply4(modifier, args)
  5 -> apply5(modifier, args)
  6 -> apply6(modifier, args)
  7 -> apply7(modifier, args)
  8 -> apply8(modifier, args)
  9 -> if (scope is androidx.compose.foundation.layout.BoxScope) apply9(modifier, args, scope) else null
  10 -> if (scope is androidx.compose.foundation.layout.BoxScope) apply10(modifier, args, scope) else null
  11 -> if (scope is androidx.compose.foundation.layout.ColumnScope) apply11(modifier, args, scope) else null
  12 -> if (scope is androidx.compose.foundation.layout.ColumnScope) apply12(modifier, args, scope) else null
  13 -> if (scope is androidx.compose.foundation.layout.RowScope) apply13(modifier, args, scope) else null
  14 -> if (scope is androidx.compose.foundation.layout.RowScope) apply14(modifier, args, scope) else null
  15 -> if (scope is androidx.compose.foundation.layout.RowScope) apply15(modifier, args, scope) else null
  16 -> apply16(modifier, args)
  17 -> apply17(modifier, args)
  18 -> apply18(modifier, args)
  19 -> apply19(modifier, args)
  20 -> apply20(modifier, args)
  21 -> apply21(modifier, args)
  22 -> apply22(modifier, args)
  23 -> apply23(modifier, args)
  24 -> apply24(modifier, args)
  25 -> apply25(modifier, args)
  26 -> apply26(modifier, args)
  27 -> apply27(modifier, args)
  28 -> apply28(modifier, args)
  29 -> apply29(modifier, args)
  30 -> apply30(modifier, args)
  31 -> apply31(modifier, args)
  32 -> apply32(modifier, args)
  33 -> apply33(modifier, args)
  34 -> apply34(modifier, args)
  35 -> apply35(modifier, args)
  36 -> apply36(modifier, args)
  37 -> apply37(modifier, args)
  38 -> apply38(modifier, args)
  39 -> apply39(modifier, args)
  40 -> apply40(modifier, args)
  41 -> apply41(modifier, args)
  42 -> apply42(modifier, args)
  43 -> apply43(modifier, args)
  44 -> apply44(modifier, args)
  45 -> apply45(modifier, args)
  46 -> apply46(modifier, args)
  47 -> apply47(modifier, args)
  48 -> apply48(modifier, args)
  49 -> apply49(modifier, args)
  50 -> apply50(modifier, args)
  51 -> apply51(modifier, args)
  52 -> apply52(modifier, args)
  53 -> apply53(modifier, args)
  54 -> apply54(modifier, args)
  55 -> apply55(modifier, args)
  56 -> apply56(modifier, args)
  57 -> apply57(modifier, args)
  58 -> apply58(modifier, args)
  59 -> apply59(modifier, args)
  60 -> apply60(modifier, args)
  61 -> apply61(modifier, args)
  62 -> apply62(modifier, args)
  63 -> apply63(modifier, args)
  64 -> apply64(modifier, args)
  65 -> apply65(modifier, args)
  66 -> apply66(modifier, args)
  67 -> apply67(modifier, args)
  68 -> apply68(modifier, args)
  69 -> apply69(modifier, args)
  70 -> apply70(modifier, args)
  71 -> apply71(modifier, args)
  72 -> apply72(modifier, args)
  73 -> apply73(modifier, args)
  74 -> apply74(modifier, args)
  75 -> apply75(modifier, args)
  76 -> apply76(modifier, args)
  77 -> apply77(modifier, args)
  78 -> apply78(modifier, args)
  79 -> apply79(modifier, args)
  else -> error("Unknown generated Compose modifier: " + id)
}

private fun apply0(modifier: Modifier, args: ComposeModifierArguments): Modifier {
  val mask = (if (args.has("shape")) 1 else 0) +
    (if (args.has("alpha")) 2 else 0)
  return when (mask) {
    0 -> modifier.composeModifier0(`brush` = args.brush("brush"))
    1 -> modifier.composeModifier0(`brush` = args.brush("brush"), `shape` = args.shape("shape"))
    2 -> modifier.composeModifier0(`brush` = args.brush("brush"), `alpha` = args.number("alpha").toFloat())
    3 -> modifier.composeModifier0(`brush` = args.brush("brush"), `shape` = args.shape("shape"), `alpha` = args.number("alpha").toFloat())
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

private fun apply1(modifier: Modifier, args: ComposeModifierArguments): Modifier {
  val mask = (if (args.has("shape")) 1 else 0)
  return when (mask) {
    0 -> modifier.composeModifier0(`color` = args.color("color"))
    1 -> modifier.composeModifier0(`color` = args.color("color"), `shape` = args.shape("shape"))
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

private fun apply2(modifier: Modifier, args: ComposeModifierArguments): Modifier {
  val mask = (if (args.has("iterations")) 1 else 0) +
    (if (args.has("repeatDelayMillis")) 2 else 0) +
    (if (args.has("initialDelayMillis")) 4 else 0) +
    (if (args.has("velocity")) 8 else 0)
  return when (mask) {
    0 -> modifier.composeModifier1()
    1 -> modifier.composeModifier1(`iterations` = args.number("iterations").toInt())
    2 -> modifier.composeModifier1(`repeatDelayMillis` = args.number("repeatDelayMillis").toInt())
    3 -> modifier.composeModifier1(`iterations` = args.number("iterations").toInt(), `repeatDelayMillis` = args.number("repeatDelayMillis").toInt())
    4 -> modifier.composeModifier1(`initialDelayMillis` = args.number("initialDelayMillis").toInt())
    5 -> modifier.composeModifier1(`iterations` = args.number("iterations").toInt(), `initialDelayMillis` = args.number("initialDelayMillis").toInt())
    6 -> modifier.composeModifier1(`repeatDelayMillis` = args.number("repeatDelayMillis").toInt(), `initialDelayMillis` = args.number("initialDelayMillis").toInt())
    7 -> modifier.composeModifier1(`iterations` = args.number("iterations").toInt(), `repeatDelayMillis` = args.number("repeatDelayMillis").toInt(), `initialDelayMillis` = args.number("initialDelayMillis").toInt())
    8 -> modifier.composeModifier1(`velocity` = args.number("velocity").dp)
    9 -> modifier.composeModifier1(`iterations` = args.number("iterations").toInt(), `velocity` = args.number("velocity").dp)
    10 -> modifier.composeModifier1(`repeatDelayMillis` = args.number("repeatDelayMillis").toInt(), `velocity` = args.number("velocity").dp)
    11 -> modifier.composeModifier1(`iterations` = args.number("iterations").toInt(), `repeatDelayMillis` = args.number("repeatDelayMillis").toInt(), `velocity` = args.number("velocity").dp)
    12 -> modifier.composeModifier1(`initialDelayMillis` = args.number("initialDelayMillis").toInt(), `velocity` = args.number("velocity").dp)
    13 -> modifier.composeModifier1(`iterations` = args.number("iterations").toInt(), `initialDelayMillis` = args.number("initialDelayMillis").toInt(), `velocity` = args.number("velocity").dp)
    14 -> modifier.composeModifier1(`repeatDelayMillis` = args.number("repeatDelayMillis").toInt(), `initialDelayMillis` = args.number("initialDelayMillis").toInt(), `velocity` = args.number("velocity").dp)
    15 -> modifier.composeModifier1(`iterations` = args.number("iterations").toInt(), `repeatDelayMillis` = args.number("repeatDelayMillis").toInt(), `initialDelayMillis` = args.number("initialDelayMillis").toInt(), `velocity` = args.number("velocity").dp)
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

private fun apply3(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier2(`width` = args.number("width").dp, `brush` = args.brush("brush"), `shape` = args.shape("shape"))

private fun apply4(modifier: Modifier, args: ComposeModifierArguments): Modifier {
  val mask = (if (args.has("shape")) 1 else 0)
  return when (mask) {
    0 -> modifier.composeModifier2(`width` = args.number("width").dp, `color` = args.color("color"))
    1 -> modifier.composeModifier2(`width` = args.number("width").dp, `color` = args.color("color"), `shape` = args.shape("shape"))
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

private fun apply5(modifier: Modifier, args: ComposeModifierArguments): Modifier {
  val mask = (if (args.has("enabled")) 1 else 0) +
    (if (args.has("onClickLabel")) 2 else 0) +
    (if (args.has("role")) 4 else 0)
  return when (mask) {
    0 -> modifier.composeModifier3(`onClick` = { args.emit("onClick") })
    1 -> modifier.composeModifier3(`enabled` = args.boolean("enabled"), `onClick` = { args.emit("onClick") })
    2 -> modifier.composeModifier3(`onClickLabel` = if (args.isNull("onClickLabel")) null else args.string("onClickLabel"), `onClick` = { args.emit("onClick") })
    3 -> modifier.composeModifier3(`enabled` = args.boolean("enabled"), `onClickLabel` = if (args.isNull("onClickLabel")) null else args.string("onClickLabel"), `onClick` = { args.emit("onClick") })
    4 -> modifier.composeModifier3(`role` = if (args.isNull("role")) null else toComposeRole(args.string("role")), `onClick` = { args.emit("onClick") })
    5 -> modifier.composeModifier3(`enabled` = args.boolean("enabled"), `role` = if (args.isNull("role")) null else toComposeRole(args.string("role")), `onClick` = { args.emit("onClick") })
    6 -> modifier.composeModifier3(`onClickLabel` = if (args.isNull("onClickLabel")) null else args.string("onClickLabel"), `role` = if (args.isNull("role")) null else toComposeRole(args.string("role")), `onClick` = { args.emit("onClick") })
    7 -> modifier.composeModifier3(`enabled` = args.boolean("enabled"), `onClickLabel` = if (args.isNull("onClickLabel")) null else args.string("onClickLabel"), `role` = if (args.isNull("role")) null else toComposeRole(args.string("role")), `onClick` = { args.emit("onClick") })
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

private fun apply6(modifier: Modifier, args: ComposeModifierArguments): Modifier {
  val mask = (if (args.has("enabled")) 1 else 0) +
    (if (args.has("onClickLabel")) 2 else 0) +
    (if (args.has("role")) 4 else 0) +
    (if (args.has("onLongClickLabel")) 8 else 0)
  return when (mask) {
    0 -> modifier.composeModifier4(`onClick` = { args.emit("onClick") })
    1 -> modifier.composeModifier4(`enabled` = args.boolean("enabled"), `onClick` = { args.emit("onClick") })
    2 -> modifier.composeModifier4(`onClickLabel` = if (args.isNull("onClickLabel")) null else args.string("onClickLabel"), `onClick` = { args.emit("onClick") })
    3 -> modifier.composeModifier4(`enabled` = args.boolean("enabled"), `onClickLabel` = if (args.isNull("onClickLabel")) null else args.string("onClickLabel"), `onClick` = { args.emit("onClick") })
    4 -> modifier.composeModifier4(`role` = if (args.isNull("role")) null else toComposeRole(args.string("role")), `onClick` = { args.emit("onClick") })
    5 -> modifier.composeModifier4(`enabled` = args.boolean("enabled"), `role` = if (args.isNull("role")) null else toComposeRole(args.string("role")), `onClick` = { args.emit("onClick") })
    6 -> modifier.composeModifier4(`onClickLabel` = if (args.isNull("onClickLabel")) null else args.string("onClickLabel"), `role` = if (args.isNull("role")) null else toComposeRole(args.string("role")), `onClick` = { args.emit("onClick") })
    7 -> modifier.composeModifier4(`enabled` = args.boolean("enabled"), `onClickLabel` = if (args.isNull("onClickLabel")) null else args.string("onClickLabel"), `role` = if (args.isNull("role")) null else toComposeRole(args.string("role")), `onClick` = { args.emit("onClick") })
    8 -> modifier.composeModifier4(`onLongClickLabel` = if (args.isNull("onLongClickLabel")) null else args.string("onLongClickLabel"), `onClick` = { args.emit("onClick") })
    9 -> modifier.composeModifier4(`enabled` = args.boolean("enabled"), `onLongClickLabel` = if (args.isNull("onLongClickLabel")) null else args.string("onLongClickLabel"), `onClick` = { args.emit("onClick") })
    10 -> modifier.composeModifier4(`onClickLabel` = if (args.isNull("onClickLabel")) null else args.string("onClickLabel"), `onLongClickLabel` = if (args.isNull("onLongClickLabel")) null else args.string("onLongClickLabel"), `onClick` = { args.emit("onClick") })
    11 -> modifier.composeModifier4(`enabled` = args.boolean("enabled"), `onClickLabel` = if (args.isNull("onClickLabel")) null else args.string("onClickLabel"), `onLongClickLabel` = if (args.isNull("onLongClickLabel")) null else args.string("onLongClickLabel"), `onClick` = { args.emit("onClick") })
    12 -> modifier.composeModifier4(`role` = if (args.isNull("role")) null else toComposeRole(args.string("role")), `onLongClickLabel` = if (args.isNull("onLongClickLabel")) null else args.string("onLongClickLabel"), `onClick` = { args.emit("onClick") })
    13 -> modifier.composeModifier4(`enabled` = args.boolean("enabled"), `role` = if (args.isNull("role")) null else toComposeRole(args.string("role")), `onLongClickLabel` = if (args.isNull("onLongClickLabel")) null else args.string("onLongClickLabel"), `onClick` = { args.emit("onClick") })
    14 -> modifier.composeModifier4(`onClickLabel` = if (args.isNull("onClickLabel")) null else args.string("onClickLabel"), `role` = if (args.isNull("role")) null else toComposeRole(args.string("role")), `onLongClickLabel` = if (args.isNull("onLongClickLabel")) null else args.string("onLongClickLabel"), `onClick` = { args.emit("onClick") })
    15 -> modifier.composeModifier4(`enabled` = args.boolean("enabled"), `onClickLabel` = if (args.isNull("onClickLabel")) null else args.string("onClickLabel"), `role` = if (args.isNull("role")) null else toComposeRole(args.string("role")), `onLongClickLabel` = if (args.isNull("onLongClickLabel")) null else args.string("onLongClickLabel"), `onClick` = { args.emit("onClick") })
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

private fun apply7(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier5()

private fun apply8(modifier: Modifier, args: ComposeModifierArguments): Modifier {
  val mask = (if (args.has("enabled")) 1 else 0)
  return when (mask) {
    0 -> modifier.composeModifier6()
    1 -> modifier.composeModifier6(`enabled` = args.boolean("enabled"))
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

private fun apply9(modifier: Modifier, args: ComposeModifierArguments, scope: androidx.compose.foundation.layout.BoxScope): Modifier =
  with(scope) { modifier.align(`alignment` = toComposeAlignment(args.string("alignment"))) }

private fun apply10(modifier: Modifier, args: ComposeModifierArguments, scope: androidx.compose.foundation.layout.BoxScope): Modifier =
  with(scope) { modifier.matchParentSize() }

private fun apply11(modifier: Modifier, args: ComposeModifierArguments, scope: androidx.compose.foundation.layout.ColumnScope): Modifier =
  with(scope) { modifier.align(`alignment` = toComposeHorizontalAlignment(args.string("alignment"))) }

private fun apply12(modifier: Modifier, args: ComposeModifierArguments, scope: androidx.compose.foundation.layout.ColumnScope): Modifier {
  val mask = (if (args.has("fill")) 1 else 0)
  return when (mask) {
    0 -> with(scope) { modifier.weight(`weight` = args.number("weight").toFloat()) }
    1 -> with(scope) { modifier.weight(`weight` = args.number("weight").toFloat(), `fill` = args.boolean("fill")) }
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

private fun apply13(modifier: Modifier, args: ComposeModifierArguments, scope: androidx.compose.foundation.layout.RowScope): Modifier =
  with(scope) { modifier.align(`alignment` = toComposeVerticalAlignment(args.string("alignment"))) }

private fun apply14(modifier: Modifier, args: ComposeModifierArguments, scope: androidx.compose.foundation.layout.RowScope): Modifier =
  with(scope) { modifier.alignByBaseline() }

private fun apply15(modifier: Modifier, args: ComposeModifierArguments, scope: androidx.compose.foundation.layout.RowScope): Modifier {
  val mask = (if (args.has("fill")) 1 else 0)
  return when (mask) {
    0 -> with(scope) { modifier.weight(`weight` = args.number("weight").toFloat()) }
    1 -> with(scope) { modifier.weight(`weight` = args.number("weight").toFloat(), `fill` = args.boolean("fill")) }
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

private fun apply16(modifier: Modifier, args: ComposeModifierArguments): Modifier {
  val mask = (if (args.has("x")) 1 else 0) +
    (if (args.has("y")) 2 else 0)
  return when (mask) {
    0 -> modifier.composeModifier7()
    1 -> modifier.composeModifier7(`x` = args.number("x").dp)
    2 -> modifier.composeModifier7(`y` = args.number("y").dp)
    3 -> modifier.composeModifier7(`x` = args.number("x").dp, `y` = args.number("y").dp)
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

private fun apply17(modifier: Modifier, args: ComposeModifierArguments): Modifier {
  val mask = (if (args.has("left")) 1 else 0) +
    (if (args.has("top")) 2 else 0) +
    (if (args.has("right")) 4 else 0) +
    (if (args.has("bottom")) 8 else 0)
  return when (mask) {
    0 -> modifier.composeModifier8()
    1 -> modifier.composeModifier8(`left` = args.number("left").dp)
    2 -> modifier.composeModifier8(`top` = args.number("top").dp)
    3 -> modifier.composeModifier8(`left` = args.number("left").dp, `top` = args.number("top").dp)
    4 -> modifier.composeModifier8(`right` = args.number("right").dp)
    5 -> modifier.composeModifier8(`left` = args.number("left").dp, `right` = args.number("right").dp)
    6 -> modifier.composeModifier8(`top` = args.number("top").dp, `right` = args.number("right").dp)
    7 -> modifier.composeModifier8(`left` = args.number("left").dp, `top` = args.number("top").dp, `right` = args.number("right").dp)
    8 -> modifier.composeModifier8(`bottom` = args.number("bottom").dp)
    9 -> modifier.composeModifier8(`left` = args.number("left").dp, `bottom` = args.number("bottom").dp)
    10 -> modifier.composeModifier8(`top` = args.number("top").dp, `bottom` = args.number("bottom").dp)
    11 -> modifier.composeModifier8(`left` = args.number("left").dp, `top` = args.number("top").dp, `bottom` = args.number("bottom").dp)
    12 -> modifier.composeModifier8(`right` = args.number("right").dp, `bottom` = args.number("bottom").dp)
    13 -> modifier.composeModifier8(`left` = args.number("left").dp, `right` = args.number("right").dp, `bottom` = args.number("bottom").dp)
    14 -> modifier.composeModifier8(`top` = args.number("top").dp, `right` = args.number("right").dp, `bottom` = args.number("bottom").dp)
    15 -> modifier.composeModifier8(`left` = args.number("left").dp, `top` = args.number("top").dp, `right` = args.number("right").dp, `bottom` = args.number("bottom").dp)
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

private fun apply18(modifier: Modifier, args: ComposeModifierArguments): Modifier {
  val mask = (if (args.has("matchHeightConstraintsFirst")) 1 else 0)
  return when (mask) {
    0 -> modifier.composeModifier9(`ratio` = args.number("ratio").toFloat())
    1 -> modifier.composeModifier9(`ratio` = args.number("ratio").toFloat(), `matchHeightConstraintsFirst` = args.boolean("matchHeightConstraintsFirst"))
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

private fun apply19(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier10()

private fun apply20(modifier: Modifier, args: ComposeModifierArguments): Modifier {
  val mask = (if (args.has("minWidth")) 1 else 0) +
    (if (args.has("minHeight")) 2 else 0)
  return when (mask) {
    0 -> modifier.composeModifier11()
    1 -> modifier.composeModifier11(`minWidth` = args.number("minWidth").dp)
    2 -> modifier.composeModifier11(`minHeight` = args.number("minHeight").dp)
    3 -> modifier.composeModifier11(`minWidth` = args.number("minWidth").dp, `minHeight` = args.number("minHeight").dp)
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

private fun apply21(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier12()

private fun apply22(modifier: Modifier, args: ComposeModifierArguments): Modifier {
  val mask = (if (args.has("fraction")) 1 else 0)
  return when (mask) {
    0 -> modifier.composeModifier13()
    1 -> modifier.composeModifier13(`fraction` = args.number("fraction").toFloat())
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

private fun apply23(modifier: Modifier, args: ComposeModifierArguments): Modifier {
  val mask = (if (args.has("fraction")) 1 else 0)
  return when (mask) {
    0 -> modifier.composeModifier14()
    1 -> modifier.composeModifier14(`fraction` = args.number("fraction").toFloat())
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

private fun apply24(modifier: Modifier, args: ComposeModifierArguments): Modifier {
  val mask = (if (args.has("fraction")) 1 else 0)
  return when (mask) {
    0 -> modifier.composeModifier15()
    1 -> modifier.composeModifier15(`fraction` = args.number("fraction").toFloat())
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

private fun apply25(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier16(`height` = args.number("height").dp)

private fun apply26(modifier: Modifier, args: ComposeModifierArguments): Modifier {
  val mask = (if (args.has("min")) 1 else 0) +
    (if (args.has("max")) 2 else 0)
  return when (mask) {
    0 -> modifier.composeModifier17()
    1 -> modifier.composeModifier17(`min` = args.number("min").dp)
    2 -> modifier.composeModifier17(`max` = args.number("max").dp)
    3 -> modifier.composeModifier17(`min` = args.number("min").dp, `max` = args.number("max").dp)
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

private fun apply27(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier18()

private fun apply28(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier19()

private fun apply29(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier20()

private fun apply30(modifier: Modifier, args: ComposeModifierArguments): Modifier {
  val mask = (if (args.has("x")) 1 else 0) +
    (if (args.has("y")) 2 else 0)
  return when (mask) {
    0 -> modifier.composeModifier21()
    1 -> modifier.composeModifier21(`x` = args.number("x").dp)
    2 -> modifier.composeModifier21(`y` = args.number("y").dp)
    3 -> modifier.composeModifier21(`x` = args.number("x").dp, `y` = args.number("y").dp)
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

private fun apply31(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier22(`all` = args.number("all").dp)

private fun apply32(modifier: Modifier, args: ComposeModifierArguments): Modifier {
  val mask = (if (args.has("horizontal")) 1 else 0) +
    (if (args.has("vertical")) 2 else 0)
  return when (mask) {
    0 -> modifier.composeModifier22()
    1 -> modifier.composeModifier22(`horizontal` = args.number("horizontal").dp)
    2 -> modifier.composeModifier22(`vertical` = args.number("vertical").dp)
    3 -> modifier.composeModifier22(`horizontal` = args.number("horizontal").dp, `vertical` = args.number("vertical").dp)
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

private fun apply33(modifier: Modifier, args: ComposeModifierArguments): Modifier {
  val mask = (if (args.has("start")) 1 else 0) +
    (if (args.has("top")) 2 else 0) +
    (if (args.has("end")) 4 else 0) +
    (if (args.has("bottom")) 8 else 0)
  return when (mask) {
    1 -> modifier.composeModifier22(`start` = args.number("start").dp)
    2 -> modifier.composeModifier22(`top` = args.number("top").dp)
    3 -> modifier.composeModifier22(`start` = args.number("start").dp, `top` = args.number("top").dp)
    4 -> modifier.composeModifier22(`end` = args.number("end").dp)
    5 -> modifier.composeModifier22(`start` = args.number("start").dp, `end` = args.number("end").dp)
    6 -> modifier.composeModifier22(`top` = args.number("top").dp, `end` = args.number("end").dp)
    7 -> modifier.composeModifier22(`start` = args.number("start").dp, `top` = args.number("top").dp, `end` = args.number("end").dp)
    8 -> modifier.composeModifier22(`bottom` = args.number("bottom").dp)
    9 -> modifier.composeModifier22(`start` = args.number("start").dp, `bottom` = args.number("bottom").dp)
    10 -> modifier.composeModifier22(`top` = args.number("top").dp, `bottom` = args.number("bottom").dp)
    11 -> modifier.composeModifier22(`start` = args.number("start").dp, `top` = args.number("top").dp, `bottom` = args.number("bottom").dp)
    12 -> modifier.composeModifier22(`end` = args.number("end").dp, `bottom` = args.number("bottom").dp)
    13 -> modifier.composeModifier22(`start` = args.number("start").dp, `end` = args.number("end").dp, `bottom` = args.number("bottom").dp)
    14 -> modifier.composeModifier22(`top` = args.number("top").dp, `end` = args.number("end").dp, `bottom` = args.number("bottom").dp)
    15 -> modifier.composeModifier22(`start` = args.number("start").dp, `top` = args.number("top").dp, `end` = args.number("end").dp, `bottom` = args.number("bottom").dp)
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

private fun apply34(modifier: Modifier, args: ComposeModifierArguments): Modifier {
  val mask = (if (args.has("top")) 1 else 0) +
    (if (args.has("bottom")) 2 else 0)
  return when (mask) {
    1 -> modifier.composeModifier23(`top` = args.number("top").dp)
    2 -> modifier.composeModifier23(`bottom` = args.number("bottom").dp)
    3 -> modifier.composeModifier23(`top` = args.number("top").dp, `bottom` = args.number("bottom").dp)
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

private fun apply35(modifier: Modifier, args: ComposeModifierArguments): Modifier {
  val mask = (if (args.has("top")) 1 else 0) +
    (if (args.has("bottom")) 2 else 0)
  return when (mask) {
    1 -> modifier.composeModifier23(`top` = args.number("top").sp)
    2 -> modifier.composeModifier23(`bottom` = args.number("bottom").sp)
    3 -> modifier.composeModifier23(`top` = args.number("top").sp, `bottom` = args.number("bottom").sp)
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

private fun apply36(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier24()

private fun apply37(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier25(`height` = args.number("height").dp)

private fun apply38(modifier: Modifier, args: ComposeModifierArguments): Modifier {
  val mask = (if (args.has("min")) 1 else 0) +
    (if (args.has("max")) 2 else 0)
  return when (mask) {
    0 -> modifier.composeModifier26()
    1 -> modifier.composeModifier26(`min` = args.number("min").dp)
    2 -> modifier.composeModifier26(`max` = args.number("max").dp)
    3 -> modifier.composeModifier26(`min` = args.number("min").dp, `max` = args.number("max").dp)
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

private fun apply39(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier27(`size` = args.number("size").dp)

private fun apply40(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier27(`width` = args.number("width").dp, `height` = args.number("height").dp)

private fun apply41(modifier: Modifier, args: ComposeModifierArguments): Modifier {
  val mask = (if (args.has("minWidth")) 1 else 0) +
    (if (args.has("minHeight")) 2 else 0) +
    (if (args.has("maxWidth")) 4 else 0) +
    (if (args.has("maxHeight")) 8 else 0)
  return when (mask) {
    0 -> modifier.composeModifier28()
    1 -> modifier.composeModifier28(`minWidth` = args.number("minWidth").dp)
    2 -> modifier.composeModifier28(`minHeight` = args.number("minHeight").dp)
    3 -> modifier.composeModifier28(`minWidth` = args.number("minWidth").dp, `minHeight` = args.number("minHeight").dp)
    4 -> modifier.composeModifier28(`maxWidth` = args.number("maxWidth").dp)
    5 -> modifier.composeModifier28(`minWidth` = args.number("minWidth").dp, `maxWidth` = args.number("maxWidth").dp)
    6 -> modifier.composeModifier28(`minHeight` = args.number("minHeight").dp, `maxWidth` = args.number("maxWidth").dp)
    7 -> modifier.composeModifier28(`minWidth` = args.number("minWidth").dp, `minHeight` = args.number("minHeight").dp, `maxWidth` = args.number("maxWidth").dp)
    8 -> modifier.composeModifier28(`maxHeight` = args.number("maxHeight").dp)
    9 -> modifier.composeModifier28(`minWidth` = args.number("minWidth").dp, `maxHeight` = args.number("maxHeight").dp)
    10 -> modifier.composeModifier28(`minHeight` = args.number("minHeight").dp, `maxHeight` = args.number("maxHeight").dp)
    11 -> modifier.composeModifier28(`minWidth` = args.number("minWidth").dp, `minHeight` = args.number("minHeight").dp, `maxHeight` = args.number("maxHeight").dp)
    12 -> modifier.composeModifier28(`maxWidth` = args.number("maxWidth").dp, `maxHeight` = args.number("maxHeight").dp)
    13 -> modifier.composeModifier28(`minWidth` = args.number("minWidth").dp, `maxWidth` = args.number("maxWidth").dp, `maxHeight` = args.number("maxHeight").dp)
    14 -> modifier.composeModifier28(`minHeight` = args.number("minHeight").dp, `maxWidth` = args.number("maxWidth").dp, `maxHeight` = args.number("maxHeight").dp)
    15 -> modifier.composeModifier28(`minWidth` = args.number("minWidth").dp, `minHeight` = args.number("minHeight").dp, `maxWidth` = args.number("maxWidth").dp, `maxHeight` = args.number("maxHeight").dp)
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

private fun apply42(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier29(`width` = args.number("width").dp)

private fun apply43(modifier: Modifier, args: ComposeModifierArguments): Modifier {
  val mask = (if (args.has("min")) 1 else 0) +
    (if (args.has("max")) 2 else 0)
  return when (mask) {
    0 -> modifier.composeModifier30()
    1 -> modifier.composeModifier30(`min` = args.number("min").dp)
    2 -> modifier.composeModifier30(`max` = args.number("max").dp)
    3 -> modifier.composeModifier30(`min` = args.number("min").dp, `max` = args.number("max").dp)
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

private fun apply44(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier31()

private fun apply45(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier32()

private fun apply46(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier33()

private fun apply47(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier34(`size` = args.number("size").dp)

private fun apply48(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier34(`width` = args.number("width").dp, `height` = args.number("height").dp)

private fun apply49(modifier: Modifier, args: ComposeModifierArguments): Modifier {
  val mask = (if (args.has("minWidth")) 1 else 0) +
    (if (args.has("minHeight")) 2 else 0) +
    (if (args.has("maxWidth")) 4 else 0) +
    (if (args.has("maxHeight")) 8 else 0)
  return when (mask) {
    0 -> modifier.composeModifier35()
    1 -> modifier.composeModifier35(`minWidth` = args.number("minWidth").dp)
    2 -> modifier.composeModifier35(`minHeight` = args.number("minHeight").dp)
    3 -> modifier.composeModifier35(`minWidth` = args.number("minWidth").dp, `minHeight` = args.number("minHeight").dp)
    4 -> modifier.composeModifier35(`maxWidth` = args.number("maxWidth").dp)
    5 -> modifier.composeModifier35(`minWidth` = args.number("minWidth").dp, `maxWidth` = args.number("maxWidth").dp)
    6 -> modifier.composeModifier35(`minHeight` = args.number("minHeight").dp, `maxWidth` = args.number("maxWidth").dp)
    7 -> modifier.composeModifier35(`minWidth` = args.number("minWidth").dp, `minHeight` = args.number("minHeight").dp, `maxWidth` = args.number("maxWidth").dp)
    8 -> modifier.composeModifier35(`maxHeight` = args.number("maxHeight").dp)
    9 -> modifier.composeModifier35(`minWidth` = args.number("minWidth").dp, `maxHeight` = args.number("maxHeight").dp)
    10 -> modifier.composeModifier35(`minHeight` = args.number("minHeight").dp, `maxHeight` = args.number("maxHeight").dp)
    11 -> modifier.composeModifier35(`minWidth` = args.number("minWidth").dp, `minHeight` = args.number("minHeight").dp, `maxHeight` = args.number("maxHeight").dp)
    12 -> modifier.composeModifier35(`maxWidth` = args.number("maxWidth").dp, `maxHeight` = args.number("maxHeight").dp)
    13 -> modifier.composeModifier35(`minWidth` = args.number("minWidth").dp, `maxWidth` = args.number("maxWidth").dp, `maxHeight` = args.number("maxHeight").dp)
    14 -> modifier.composeModifier35(`minHeight` = args.number("minHeight").dp, `maxWidth` = args.number("maxWidth").dp, `maxHeight` = args.number("maxHeight").dp)
    15 -> modifier.composeModifier35(`minWidth` = args.number("minWidth").dp, `minHeight` = args.number("minHeight").dp, `maxWidth` = args.number("maxWidth").dp, `maxHeight` = args.number("maxHeight").dp)
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

private fun apply50(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier36()

private fun apply51(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier37()

private fun apply52(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier38()

private fun apply53(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier39()

private fun apply54(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier40(`width` = args.number("width").dp)

private fun apply55(modifier: Modifier, args: ComposeModifierArguments): Modifier {
  val mask = (if (args.has("min")) 1 else 0) +
    (if (args.has("max")) 2 else 0)
  return when (mask) {
    0 -> modifier.composeModifier41()
    1 -> modifier.composeModifier41(`min` = args.number("min").dp)
    2 -> modifier.composeModifier41(`max` = args.number("max").dp)
    3 -> modifier.composeModifier41(`min` = args.number("min").dp, `max` = args.number("max").dp)
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

private fun apply56(modifier: Modifier, args: ComposeModifierArguments): Modifier {
  val mask = (if (args.has("align")) 1 else 0) +
    (if (args.has("unbounded")) 2 else 0)
  return when (mask) {
    0 -> modifier.composeModifier42()
    1 -> modifier.composeModifier42(`align` = toComposeVerticalAlignment(args.string("align")))
    2 -> modifier.composeModifier42(`unbounded` = args.boolean("unbounded"))
    3 -> modifier.composeModifier42(`align` = toComposeVerticalAlignment(args.string("align")), `unbounded` = args.boolean("unbounded"))
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

private fun apply57(modifier: Modifier, args: ComposeModifierArguments): Modifier {
  val mask = (if (args.has("align")) 1 else 0) +
    (if (args.has("unbounded")) 2 else 0)
  return when (mask) {
    0 -> modifier.composeModifier43()
    1 -> modifier.composeModifier43(`align` = toComposeAlignment(args.string("align")))
    2 -> modifier.composeModifier43(`unbounded` = args.boolean("unbounded"))
    3 -> modifier.composeModifier43(`align` = toComposeAlignment(args.string("align")), `unbounded` = args.boolean("unbounded"))
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

private fun apply58(modifier: Modifier, args: ComposeModifierArguments): Modifier {
  val mask = (if (args.has("align")) 1 else 0) +
    (if (args.has("unbounded")) 2 else 0)
  return when (mask) {
    0 -> modifier.composeModifier44()
    1 -> modifier.composeModifier44(`align` = toComposeHorizontalAlignment(args.string("align")))
    2 -> modifier.composeModifier44(`unbounded` = args.boolean("unbounded"))
    3 -> modifier.composeModifier44(`align` = toComposeHorizontalAlignment(args.string("align")), `unbounded` = args.boolean("unbounded"))
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

private fun apply59(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier45()

private fun apply60(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier46()

private fun apply61(modifier: Modifier, args: ComposeModifierArguments): Modifier {
  val mask = (if (args.has("steps")) 1 else 0)
  return when (mask) {
    0 -> modifier.composeModifier46(`value` = args.number("value").toFloat())
    1 -> modifier.composeModifier46(`value` = args.number("value").toFloat(), `steps` = args.number("steps").toInt())
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

private fun apply62(modifier: Modifier, args: ComposeModifierArguments): Modifier {
  val mask = (if (args.has("enabled")) 1 else 0) +
    (if (args.has("role")) 2 else 0)
  return when (mask) {
    0 -> modifier.composeModifier47(`selected` = args.boolean("selected"), `onClick` = { args.emit("onClick") })
    1 -> modifier.composeModifier47(`selected` = args.boolean("selected"), `enabled` = args.boolean("enabled"), `onClick` = { args.emit("onClick") })
    2 -> modifier.composeModifier47(`selected` = args.boolean("selected"), `role` = if (args.isNull("role")) null else toComposeRole(args.string("role")), `onClick` = { args.emit("onClick") })
    3 -> modifier.composeModifier47(`selected` = args.boolean("selected"), `enabled` = args.boolean("enabled"), `role` = if (args.isNull("role")) null else toComposeRole(args.string("role")), `onClick` = { args.emit("onClick") })
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

private fun apply63(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier48()

private fun apply64(modifier: Modifier, args: ComposeModifierArguments): Modifier {
  val mask = (if (args.has("enabled")) 1 else 0) +
    (if (args.has("role")) 2 else 0)
  return when (mask) {
    0 -> modifier.composeModifier49(`value` = args.boolean("value"), `onValueChange` = { value: Boolean -> args.emit("onValueChange", value) })
    1 -> modifier.composeModifier49(`value` = args.boolean("value"), `enabled` = args.boolean("enabled"), `onValueChange` = { value: Boolean -> args.emit("onValueChange", value) })
    2 -> modifier.composeModifier49(`value` = args.boolean("value"), `role` = if (args.isNull("role")) null else toComposeRole(args.string("role")), `onValueChange` = { value: Boolean -> args.emit("onValueChange", value) })
    3 -> modifier.composeModifier49(`value` = args.boolean("value"), `enabled` = args.boolean("enabled"), `role` = if (args.isNull("role")) null else toComposeRole(args.string("role")), `onValueChange` = { value: Boolean -> args.emit("onValueChange", value) })
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

private fun apply65(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier50()

private fun apply66(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier51(`alpha` = args.number("alpha").toFloat())

private fun apply67(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier52(`radius` = args.number("radius").dp)

private fun apply68(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier52(`radiusX` = args.number("radiusX").dp, `radiusY` = args.number("radiusY").dp)

private fun apply69(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier53(`shape` = args.shape("shape"))

private fun apply70(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier54()

private fun apply71(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier55(`degrees` = args.number("degrees").toFloat())

private fun apply72(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier56(`scale` = args.number("scale").toFloat())

private fun apply73(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier56(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat())

private fun apply74(modifier: Modifier, args: ComposeModifierArguments): Modifier {
  val mask = (if (args.has("shape")) 1 else 0) +
    (if (args.has("clip")) 2 else 0) +
    (if (args.has("ambientColor")) 4 else 0) +
    (if (args.has("spotColor")) 8 else 0)
  return when (mask) {
    0 -> modifier.composeModifier57(`elevation` = args.number("elevation").dp)
    1 -> modifier.composeModifier57(`elevation` = args.number("elevation").dp, `shape` = args.shape("shape"))
    2 -> modifier.composeModifier57(`elevation` = args.number("elevation").dp, `clip` = args.boolean("clip"))
    3 -> modifier.composeModifier57(`elevation` = args.number("elevation").dp, `shape` = args.shape("shape"), `clip` = args.boolean("clip"))
    4 -> modifier.composeModifier57(`elevation` = args.number("elevation").dp, `ambientColor` = args.color("ambientColor"))
    5 -> modifier.composeModifier57(`elevation` = args.number("elevation").dp, `shape` = args.shape("shape"), `ambientColor` = args.color("ambientColor"))
    6 -> modifier.composeModifier57(`elevation` = args.number("elevation").dp, `clip` = args.boolean("clip"), `ambientColor` = args.color("ambientColor"))
    7 -> modifier.composeModifier57(`elevation` = args.number("elevation").dp, `shape` = args.shape("shape"), `clip` = args.boolean("clip"), `ambientColor` = args.color("ambientColor"))
    8 -> modifier.composeModifier57(`elevation` = args.number("elevation").dp, `spotColor` = args.color("spotColor"))
    9 -> modifier.composeModifier57(`elevation` = args.number("elevation").dp, `shape` = args.shape("shape"), `spotColor` = args.color("spotColor"))
    10 -> modifier.composeModifier57(`elevation` = args.number("elevation").dp, `clip` = args.boolean("clip"), `spotColor` = args.color("spotColor"))
    11 -> modifier.composeModifier57(`elevation` = args.number("elevation").dp, `shape` = args.shape("shape"), `clip` = args.boolean("clip"), `spotColor` = args.color("spotColor"))
    12 -> modifier.composeModifier57(`elevation` = args.number("elevation").dp, `ambientColor` = args.color("ambientColor"), `spotColor` = args.color("spotColor"))
    13 -> modifier.composeModifier57(`elevation` = args.number("elevation").dp, `shape` = args.shape("shape"), `ambientColor` = args.color("ambientColor"), `spotColor` = args.color("spotColor"))
    14 -> modifier.composeModifier57(`elevation` = args.number("elevation").dp, `clip` = args.boolean("clip"), `ambientColor` = args.color("ambientColor"), `spotColor` = args.color("spotColor"))
    15 -> modifier.composeModifier57(`elevation` = args.number("elevation").dp, `shape` = args.shape("shape"), `clip` = args.boolean("clip"), `ambientColor` = args.color("ambientColor"), `spotColor` = args.color("spotColor"))
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

private fun apply75(modifier: Modifier, args: ComposeModifierArguments): Modifier {
  val mask = (if (args.has("scaleX")) 1 else 0) +
    (if (args.has("scaleY")) 2 else 0) +
    (if (args.has("alpha")) 4 else 0) +
    (if (args.has("translationX")) 8 else 0)
  return when (mask) {
    0 -> modifier.composeModifier58()
    1 -> modifier.composeModifier58(`scaleX` = args.number("scaleX").toFloat())
    2 -> modifier.composeModifier58(`scaleY` = args.number("scaleY").toFloat())
    3 -> modifier.composeModifier58(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat())
    4 -> modifier.composeModifier58(`alpha` = args.number("alpha").toFloat())
    5 -> modifier.composeModifier58(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat())
    6 -> modifier.composeModifier58(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat())
    7 -> modifier.composeModifier58(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat())
    8 -> modifier.composeModifier58(`translationX` = args.number("translationX").toFloat())
    9 -> modifier.composeModifier58(`scaleX` = args.number("scaleX").toFloat(), `translationX` = args.number("translationX").toFloat())
    10 -> modifier.composeModifier58(`scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat())
    11 -> modifier.composeModifier58(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat())
    12 -> modifier.composeModifier58(`alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat())
    13 -> modifier.composeModifier58(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat())
    14 -> modifier.composeModifier58(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat())
    15 -> modifier.composeModifier58(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat())
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

private fun apply76(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier59()

private fun apply77(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier60(`tag` = args.string("tag"))

private fun apply78(modifier: Modifier, args: ComposeModifierArguments): Modifier {
  val mask = (if (args.has("isContentSensitive")) 1 else 0)
  return when (mask) {
    0 -> modifier.composeModifier61()
    1 -> modifier.composeModifier61(`isContentSensitive` = args.boolean("isContentSensitive"))
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

private fun apply79(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier62(`zIndex` = args.number("zIndex").toFloat())
