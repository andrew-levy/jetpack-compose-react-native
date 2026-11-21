// Generated from Compose declarations by generate.mjs.
@file:Suppress("UNUSED_PARAMETER")

package com.jetpackcomposereactnative.generated

import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.animation.animateContentSize as composeModifier0
import androidx.compose.foundation.background as composeModifier1
import androidx.compose.foundation.basicMarquee as composeModifier2
import androidx.compose.foundation.border as composeModifier3
import androidx.compose.foundation.clickable as composeModifier4
import androidx.compose.foundation.clipScrollableContainer as composeModifier5
import androidx.compose.foundation.combinedClickable as composeModifier6
import androidx.compose.foundation.focusGroup as composeModifier7
import androidx.compose.foundation.focusable as composeModifier8
import androidx.compose.foundation.horizontalScroll as composeModifier9
import androidx.compose.foundation.layout.absoluteOffset as composeModifier10
import androidx.compose.foundation.layout.absolutePadding as composeModifier11
import androidx.compose.foundation.layout.aspectRatio as composeModifier12
import androidx.compose.foundation.layout.captionBarPadding as composeModifier13
import androidx.compose.foundation.layout.consumeWindowInsets as composeModifier14
import androidx.compose.foundation.layout.defaultMinSize as composeModifier15
import androidx.compose.foundation.layout.displayCutoutPadding as composeModifier16
import androidx.compose.foundation.layout.fillMaxHeight as composeModifier17
import androidx.compose.foundation.layout.fillMaxSize as composeModifier18
import androidx.compose.foundation.layout.fillMaxWidth as composeModifier19
import androidx.compose.foundation.layout.height as composeModifier20
import androidx.compose.foundation.layout.heightIn as composeModifier21
import androidx.compose.foundation.layout.imeNestedScroll as composeModifier22
import androidx.compose.foundation.layout.imePadding as composeModifier23
import androidx.compose.foundation.layout.mandatorySystemGesturesPadding as composeModifier24
import androidx.compose.foundation.layout.navigationBarsPadding as composeModifier25
import androidx.compose.foundation.layout.offset as composeModifier26
import androidx.compose.foundation.layout.padding as composeModifier27
import androidx.compose.foundation.layout.paddingFrom as composeModifier28
import androidx.compose.foundation.layout.paddingFromBaseline as composeModifier29
import androidx.compose.foundation.layout.recalculateWindowInsets as composeModifier30
import androidx.compose.foundation.layout.requiredHeight as composeModifier31
import androidx.compose.foundation.layout.requiredHeightIn as composeModifier32
import androidx.compose.foundation.layout.requiredSize as composeModifier33
import androidx.compose.foundation.layout.requiredSizeIn as composeModifier34
import androidx.compose.foundation.layout.requiredWidth as composeModifier35
import androidx.compose.foundation.layout.requiredWidthIn as composeModifier36
import androidx.compose.foundation.layout.safeContentPadding as composeModifier37
import androidx.compose.foundation.layout.safeDrawingPadding as composeModifier38
import androidx.compose.foundation.layout.safeGesturesPadding as composeModifier39
import androidx.compose.foundation.layout.size as composeModifier40
import androidx.compose.foundation.layout.sizeIn as composeModifier41
import androidx.compose.foundation.layout.statusBarsPadding as composeModifier42
import androidx.compose.foundation.layout.systemBarsPadding as composeModifier43
import androidx.compose.foundation.layout.systemGesturesPadding as composeModifier44
import androidx.compose.foundation.layout.waterfallPadding as composeModifier45
import androidx.compose.foundation.layout.width as composeModifier46
import androidx.compose.foundation.layout.widthIn as composeModifier47
import androidx.compose.foundation.layout.windowInsetsBottomHeight as composeModifier48
import androidx.compose.foundation.layout.windowInsetsEndWidth as composeModifier49
import androidx.compose.foundation.layout.windowInsetsPadding as composeModifier50
import androidx.compose.foundation.layout.windowInsetsStartWidth as composeModifier51
import androidx.compose.foundation.layout.windowInsetsTopHeight as composeModifier52
import androidx.compose.foundation.layout.wrapContentHeight as composeModifier53
import androidx.compose.foundation.layout.wrapContentSize as composeModifier54
import androidx.compose.foundation.layout.wrapContentWidth as composeModifier55
import androidx.compose.foundation.onFocusedBoundsChanged as composeModifier56
import androidx.compose.foundation.preferKeepClear as composeModifier57
import androidx.compose.foundation.progressSemantics as composeModifier58
import androidx.compose.foundation.selection.selectable as composeModifier59
import androidx.compose.foundation.selection.selectableGroup as composeModifier60
import androidx.compose.foundation.selection.toggleable as composeModifier61
import androidx.compose.foundation.selection.triStateToggleable as composeModifier62
import androidx.compose.foundation.systemGestureExclusion as composeModifier63
import androidx.compose.foundation.text.handwriting.handwritingDetector as composeModifier64
import androidx.compose.foundation.text.handwriting.handwritingHandler as composeModifier65
import androidx.compose.foundation.verticalScroll as composeModifier66
import androidx.compose.material3.animateFloatingActionButton as composeModifier67
import androidx.compose.material3.minimumInteractiveComponentSize as composeModifier68
import androidx.compose.ui.draw.alpha as composeModifier69
import androidx.compose.ui.draw.blur as composeModifier70
import androidx.compose.ui.draw.clip as composeModifier71
import androidx.compose.ui.draw.clipToBounds as composeModifier72
import androidx.compose.ui.draw.paint as composeModifier73
import androidx.compose.ui.draw.rotate as composeModifier74
import androidx.compose.ui.draw.scale as composeModifier75
import androidx.compose.ui.draw.shadow as composeModifier76
import androidx.compose.ui.focus.focusProperties as composeModifier77
import androidx.compose.ui.focus.focusRestorer as composeModifier78
import androidx.compose.ui.focus.focusTarget as composeModifier79
import androidx.compose.ui.focus.onFocusChanged as composeModifier80
import androidx.compose.ui.focus.onFocusEvent as composeModifier81
import androidx.compose.ui.graphics.graphicsLayer as composeModifier82
import androidx.compose.ui.graphics.toolingGraphicsLayer as composeModifier83
import androidx.compose.ui.input.pointer.pointerHoverIcon as composeModifier84
import androidx.compose.ui.input.pointer.stylusHoverIcon as composeModifier85
import androidx.compose.ui.layout.layoutId as composeModifier86
import androidx.compose.ui.layout.onGloballyPositioned as composeModifier87
import androidx.compose.ui.layout.onLayoutRectChanged as composeModifier88
import androidx.compose.ui.layout.onPlaced as composeModifier89
import androidx.compose.ui.layout.onSizeChanged as composeModifier90
import androidx.compose.ui.platform.testTag as composeModifier91
import androidx.compose.ui.semantics.clearAndSetSemantics as composeModifier92
import androidx.compose.ui.semantics.semantics as composeModifier93
import androidx.compose.ui.sensitiveContent as composeModifier94
import androidx.compose.ui.zIndex as composeModifier95

@OptIn(androidx.compose.animation.ExperimentalSharedTransitionApi::class, androidx.compose.foundation.layout.ExperimentalLayoutApi::class, androidx.compose.material3.ExperimentalMaterial3Api::class, androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
internal fun applyComposeModifier(id: Int, modifier: Modifier, args: ComposeModifierArguments, scope: Any?): Modifier? = when (id) {
  0 -> if (scope is androidx.compose.animation.AnimatedVisibilityScope) apply0(modifier, args, scope) else null
  1 -> if (scope is androidx.compose.animation.SharedTransitionScope) apply1(modifier, args, scope) else null
  2 -> if (scope is androidx.compose.animation.SharedTransitionScope) apply2(modifier, args, scope) else null
  3 -> apply3(modifier, args)
  4 -> apply4(modifier, args)
  5 -> apply5(modifier, args)
  6 -> apply6(modifier, args)
  7 -> apply7(modifier, args)
  8 -> apply8(modifier, args)
  9 -> apply9(modifier, args)
  10 -> apply10(modifier, args)
  11 -> apply11(modifier, args)
  12 -> apply12(modifier, args)
  13 -> apply13(modifier, args)
  14 -> apply14(modifier, args)
  15 -> apply15(modifier, args)
  16 -> if (scope is androidx.compose.foundation.layout.BoxScope) apply16(modifier, args, scope) else null
  17 -> if (scope is androidx.compose.foundation.layout.BoxScope) apply17(modifier, args, scope) else null
  18 -> if (scope is androidx.compose.foundation.layout.ColumnScope) apply18(modifier, args, scope) else null
  19 -> if (scope is androidx.compose.foundation.layout.ColumnScope) apply19(modifier, args, scope) else null
  20 -> if (scope is androidx.compose.foundation.layout.FlowColumnScope) apply20(modifier, args, scope) else null
  21 -> if (scope is androidx.compose.foundation.layout.FlowRowScope) apply21(modifier, args, scope) else null
  22 -> if (scope is androidx.compose.foundation.layout.RowScope) apply22(modifier, args, scope) else null
  23 -> if (scope is androidx.compose.foundation.layout.RowScope) apply23(modifier, args, scope) else null
  24 -> if (scope is androidx.compose.foundation.layout.RowScope) apply24(modifier, args, scope) else null
  25 -> if (scope is androidx.compose.foundation.layout.RowScope) apply25(modifier, args, scope) else null
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
  80 -> apply80(modifier, args)
  81 -> apply81(modifier, args)
  82 -> apply82(modifier, args)
  83 -> apply83(modifier, args)
  84 -> apply84(modifier, args)
  85 -> apply85(modifier, args)
  86 -> if (scope is androidx.compose.foundation.lazy.LazyItemScope) apply86(modifier, args, scope) else null
  87 -> if (scope is androidx.compose.foundation.lazy.LazyItemScope) apply87(modifier, args, scope) else null
  88 -> if (scope is androidx.compose.foundation.lazy.LazyItemScope) apply88(modifier, args, scope) else null
  89 -> if (scope is androidx.compose.foundation.lazy.LazyItemScope) apply89(modifier, args, scope) else null
  90 -> if (scope is androidx.compose.foundation.lazy.grid.LazyGridItemScope) apply90(modifier, args, scope) else null
  91 -> if (scope is androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemScope) apply91(modifier, args, scope) else null
  92 -> apply92(modifier, args)
  93 -> apply93(modifier, args)
  94 -> apply94(modifier, args)
  95 -> apply95(modifier, args)
  96 -> apply96(modifier, args)
  97 -> apply97(modifier, args)
  98 -> apply98(modifier, args)
  99 -> apply99(modifier, args)
  100 -> apply100(modifier, args)
  101 -> apply101(modifier, args)
  102 -> apply102(modifier, args)
  103 -> apply103(modifier, args)
  104 -> if (scope is androidx.compose.material3.ExposedDropdownMenuBoxScope) apply104(modifier, args, scope) else null
  105 -> apply105(modifier, args)
  106 -> apply106(modifier, args)
  107 -> apply107(modifier, args)
  108 -> apply108(modifier, args)
  109 -> apply109(modifier, args)
  110 -> apply110(modifier, args)
  111 -> apply111(modifier, args)
  112 -> apply112(modifier, args)
  113 -> apply113(modifier, args)
  114 -> apply114(modifier, args)
  115 -> apply115(modifier, args)
  116 -> apply116(modifier, args)
  117 -> apply117(modifier, args)
  118 -> apply118(modifier, args)
  119 -> apply119(modifier, args)
  120 -> apply120(modifier, args)
  121 -> apply121(modifier, args)
  122 -> apply122(modifier, args)
  123 -> apply123(modifier, args)
  124 -> apply124(modifier, args)
  125 -> apply125(modifier, args)
  126 -> apply126(modifier, args)
  127 -> apply127(modifier, args)
  128 -> apply128(modifier, args)
  129 -> apply129(modifier, args)
  130 -> apply130(modifier, args)
  131 -> apply131(modifier, args)
  132 -> apply132(modifier, args)
  133 -> apply133(modifier, args)
  134 -> apply134(modifier, args)
  135 -> apply135(modifier, args)
  else -> error("Unknown generated Compose modifier: " + id)
}

// androidx.compose.animation.AnimatedVisibilityScope.animateEnterExit [receiver: androidx.compose.ui.Modifier](enter: androidx.compose.animation.EnterTransition, exit: androidx.compose.animation.ExitTransition, label: kotlin.String)
private fun apply0(modifier: Modifier, args: ComposeModifierArguments, scope: androidx.compose.animation.AnimatedVisibilityScope): Modifier {
  val mask = (if (args.has("label")) 1 else 0)
  return when (mask) {
    0 -> with(scope) { modifier.animateEnterExit() }
    1 -> with(scope) { modifier.animateEnterExit(`label` = args.string("label")) }
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

// androidx.compose.animation.SharedTransitionScope.renderInSharedTransitionScopeOverlay [receiver: androidx.compose.ui.Modifier](renderInOverlay: kotlin.Function0<kotlin.Boolean>, zIndexInOverlay: kotlin.Float, clipInOverlayDuringTransition: kotlin.Function2<androidx.compose.ui.unit.LayoutDirection, androidx.compose.ui.unit.Density, androidx.compose.ui.graphics.Path?>)
@OptIn(androidx.compose.animation.ExperimentalSharedTransitionApi::class)
private fun apply1(modifier: Modifier, args: ComposeModifierArguments, scope: androidx.compose.animation.SharedTransitionScope): Modifier {
  val mask = (if (args.has("zIndexInOverlay")) 1 else 0)
  return when (mask) {
    0 -> with(scope) { modifier.renderInSharedTransitionScopeOverlay() }
    1 -> with(scope) { modifier.renderInSharedTransitionScopeOverlay(`zIndexInOverlay` = args.number("zIndexInOverlay").toFloat()) }
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

// androidx.compose.animation.SharedTransitionScope.skipToLookaheadSize [receiver: androidx.compose.ui.Modifier]()
@OptIn(androidx.compose.animation.ExperimentalSharedTransitionApi::class)
private fun apply2(modifier: Modifier, args: ComposeModifierArguments, scope: androidx.compose.animation.SharedTransitionScope): Modifier =
  with(scope) { modifier.skipToLookaheadSize() }

// androidx.compose.animation.animateContentSize [receiver: androidx.compose.ui.Modifier](animationSpec: androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntSize>, finishedListener: kotlin.Function2<androidx.compose.ui.unit.IntSize, androidx.compose.ui.unit.IntSize, kotlin.Unit>?)
private fun apply3(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier0()

// androidx.compose.animation.animateContentSize [receiver: androidx.compose.ui.Modifier](animationSpec: androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntSize>, alignment: androidx.compose.ui.Alignment, finishedListener: kotlin.Function2<androidx.compose.ui.unit.IntSize, androidx.compose.ui.unit.IntSize, kotlin.Unit>?)
private fun apply4(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier0(`alignment` = toComposeAlignment(args.string("alignment")))

// androidx.compose.foundation.background [receiver: androidx.compose.ui.Modifier](brush: androidx.compose.ui.graphics.Brush, shape: androidx.compose.ui.graphics.Shape, alpha: kotlin.Float)
private fun apply5(modifier: Modifier, args: ComposeModifierArguments): Modifier {
  val mask = (if (args.has("shape")) 1 else 0) +
    (if (args.has("alpha")) 2 else 0)
  return when (mask) {
    0 -> modifier.composeModifier1(`brush` = args.brush("brush"))
    1 -> modifier.composeModifier1(`brush` = args.brush("brush"), `shape` = args.shape("shape"))
    2 -> modifier.composeModifier1(`brush` = args.brush("brush"), `alpha` = args.number("alpha").toFloat())
    3 -> modifier.composeModifier1(`brush` = args.brush("brush"), `shape` = args.shape("shape"), `alpha` = args.number("alpha").toFloat())
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

// androidx.compose.foundation.background [receiver: androidx.compose.ui.Modifier](color: androidx.compose.ui.graphics.Color, shape: androidx.compose.ui.graphics.Shape)
private fun apply6(modifier: Modifier, args: ComposeModifierArguments): Modifier {
  val mask = (if (args.has("shape")) 1 else 0)
  return when (mask) {
    0 -> modifier.composeModifier1(`color` = args.color("color"))
    1 -> modifier.composeModifier1(`color` = args.color("color"), `shape` = args.shape("shape"))
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

// androidx.compose.foundation.basicMarquee [receiver: androidx.compose.ui.Modifier](iterations: kotlin.Int, animationMode: androidx.compose.foundation.MarqueeAnimationMode, repeatDelayMillis: kotlin.Int, initialDelayMillis: kotlin.Int, spacing: androidx.compose.foundation.MarqueeSpacing, velocity: androidx.compose.ui.unit.Dp)
private fun apply7(modifier: Modifier, args: ComposeModifierArguments): Modifier {
  val mask = (if (args.has("iterations")) 1 else 0) +
    (if (args.has("repeatDelayMillis")) 2 else 0) +
    (if (args.has("initialDelayMillis")) 4 else 0) +
    (if (args.has("velocity")) 8 else 0)
  return when (mask) {
    0 -> modifier.composeModifier2()
    1 -> modifier.composeModifier2(`iterations` = args.number("iterations").toInt())
    2 -> modifier.composeModifier2(`repeatDelayMillis` = args.number("repeatDelayMillis").toInt())
    3 -> modifier.composeModifier2(`iterations` = args.number("iterations").toInt(), `repeatDelayMillis` = args.number("repeatDelayMillis").toInt())
    4 -> modifier.composeModifier2(`initialDelayMillis` = args.number("initialDelayMillis").toInt())
    5 -> modifier.composeModifier2(`iterations` = args.number("iterations").toInt(), `initialDelayMillis` = args.number("initialDelayMillis").toInt())
    6 -> modifier.composeModifier2(`repeatDelayMillis` = args.number("repeatDelayMillis").toInt(), `initialDelayMillis` = args.number("initialDelayMillis").toInt())
    7 -> modifier.composeModifier2(`iterations` = args.number("iterations").toInt(), `repeatDelayMillis` = args.number("repeatDelayMillis").toInt(), `initialDelayMillis` = args.number("initialDelayMillis").toInt())
    8 -> modifier.composeModifier2(`velocity` = args.number("velocity").dp)
    9 -> modifier.composeModifier2(`iterations` = args.number("iterations").toInt(), `velocity` = args.number("velocity").dp)
    10 -> modifier.composeModifier2(`repeatDelayMillis` = args.number("repeatDelayMillis").toInt(), `velocity` = args.number("velocity").dp)
    11 -> modifier.composeModifier2(`iterations` = args.number("iterations").toInt(), `repeatDelayMillis` = args.number("repeatDelayMillis").toInt(), `velocity` = args.number("velocity").dp)
    12 -> modifier.composeModifier2(`initialDelayMillis` = args.number("initialDelayMillis").toInt(), `velocity` = args.number("velocity").dp)
    13 -> modifier.composeModifier2(`iterations` = args.number("iterations").toInt(), `initialDelayMillis` = args.number("initialDelayMillis").toInt(), `velocity` = args.number("velocity").dp)
    14 -> modifier.composeModifier2(`repeatDelayMillis` = args.number("repeatDelayMillis").toInt(), `initialDelayMillis` = args.number("initialDelayMillis").toInt(), `velocity` = args.number("velocity").dp)
    15 -> modifier.composeModifier2(`iterations` = args.number("iterations").toInt(), `repeatDelayMillis` = args.number("repeatDelayMillis").toInt(), `initialDelayMillis` = args.number("initialDelayMillis").toInt(), `velocity` = args.number("velocity").dp)
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

// androidx.compose.foundation.border [receiver: androidx.compose.ui.Modifier](width: androidx.compose.ui.unit.Dp, brush: androidx.compose.ui.graphics.Brush, shape: androidx.compose.ui.graphics.Shape)
private fun apply8(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier3(`width` = args.number("width").dp, `brush` = args.brush("brush"), `shape` = args.shape("shape"))

// androidx.compose.foundation.border [receiver: androidx.compose.ui.Modifier](width: androidx.compose.ui.unit.Dp, color: androidx.compose.ui.graphics.Color, shape: androidx.compose.ui.graphics.Shape)
private fun apply9(modifier: Modifier, args: ComposeModifierArguments): Modifier {
  val mask = (if (args.has("shape")) 1 else 0)
  return when (mask) {
    0 -> modifier.composeModifier3(`width` = args.number("width").dp, `color` = args.color("color"))
    1 -> modifier.composeModifier3(`width` = args.number("width").dp, `color` = args.color("color"), `shape` = args.shape("shape"))
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

// androidx.compose.foundation.clickable [receiver: androidx.compose.ui.Modifier](enabled: kotlin.Boolean, onClickLabel: kotlin.String?, role: androidx.compose.ui.semantics.Role?, onClick: kotlin.Function0<kotlin.Unit>)
private fun apply10(modifier: Modifier, args: ComposeModifierArguments): Modifier {
  val mask = (if (args.has("enabled")) 1 else 0) +
    (if (args.has("onClickLabel")) 2 else 0) +
    (if (args.has("role")) 4 else 0)
  return when (mask) {
    0 -> modifier.composeModifier4(`onClick` = { args.emit("onClick") })
    1 -> modifier.composeModifier4(`enabled` = args.boolean("enabled"), `onClick` = { args.emit("onClick") })
    2 -> modifier.composeModifier4(`onClickLabel` = if (args.isNull("onClickLabel")) null else (args.string("onClickLabel")), `onClick` = { args.emit("onClick") })
    3 -> modifier.composeModifier4(`enabled` = args.boolean("enabled"), `onClickLabel` = if (args.isNull("onClickLabel")) null else (args.string("onClickLabel")), `onClick` = { args.emit("onClick") })
    4 -> modifier.composeModifier4(`role` = if (args.isNull("role")) null else (toComposeRole(args.string("role"))), `onClick` = { args.emit("onClick") })
    5 -> modifier.composeModifier4(`enabled` = args.boolean("enabled"), `role` = if (args.isNull("role")) null else (toComposeRole(args.string("role"))), `onClick` = { args.emit("onClick") })
    6 -> modifier.composeModifier4(`onClickLabel` = if (args.isNull("onClickLabel")) null else (args.string("onClickLabel")), `role` = if (args.isNull("role")) null else (toComposeRole(args.string("role"))), `onClick` = { args.emit("onClick") })
    7 -> modifier.composeModifier4(`enabled` = args.boolean("enabled"), `onClickLabel` = if (args.isNull("onClickLabel")) null else (args.string("onClickLabel")), `role` = if (args.isNull("role")) null else (toComposeRole(args.string("role"))), `onClick` = { args.emit("onClick") })
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

// androidx.compose.foundation.clipScrollableContainer [receiver: androidx.compose.ui.Modifier](orientation: androidx.compose.foundation.gestures.Orientation)
private fun apply11(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier5(`orientation` = toComposeOrientation(args.string("orientation")))

// androidx.compose.foundation.combinedClickable [receiver: androidx.compose.ui.Modifier](enabled: kotlin.Boolean, onClickLabel: kotlin.String?, role: androidx.compose.ui.semantics.Role?, onLongClickLabel: kotlin.String?, onLongClick: kotlin.Function0<kotlin.Unit>?, onDoubleClick: kotlin.Function0<kotlin.Unit>?, hapticFeedbackEnabled: kotlin.Boolean, onClick: kotlin.Function0<kotlin.Unit>)
private fun apply12(modifier: Modifier, args: ComposeModifierArguments): Modifier {
  val mask = (if (args.has("enabled")) 1 else 0) +
    (if (args.has("onClickLabel")) 2 else 0) +
    (if (args.has("role")) 4 else 0) +
    (if (args.has("onLongClickLabel")) 8 else 0) +
    (if (args.has("onLongClick")) 16 else 0) +
    (if (args.has("onDoubleClick")) 32 else 0) +
    (if (args.has("hapticFeedbackEnabled")) 64 else 0)
  return when (mask / 32) {
    0 -> apply12Group0(modifier, args, mask)
    1 -> apply12Group1(modifier, args, mask)
    2 -> apply12Group2(modifier, args, mask)
    3 -> apply12Group3(modifier, args, mask)
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

private fun apply12Group0(modifier: Modifier, args: ComposeModifierArguments, mask: Int): Modifier = when (mask) {
    0 -> modifier.composeModifier6(`onClick` = { args.emit("onClick") })
    1 -> modifier.composeModifier6(`enabled` = args.boolean("enabled"), `onClick` = { args.emit("onClick") })
    2 -> modifier.composeModifier6(`onClickLabel` = if (args.isNull("onClickLabel")) null else (args.string("onClickLabel")), `onClick` = { args.emit("onClick") })
    3 -> modifier.composeModifier6(`enabled` = args.boolean("enabled"), `onClickLabel` = if (args.isNull("onClickLabel")) null else (args.string("onClickLabel")), `onClick` = { args.emit("onClick") })
    4 -> modifier.composeModifier6(`role` = if (args.isNull("role")) null else (toComposeRole(args.string("role"))), `onClick` = { args.emit("onClick") })
    5 -> modifier.composeModifier6(`enabled` = args.boolean("enabled"), `role` = if (args.isNull("role")) null else (toComposeRole(args.string("role"))), `onClick` = { args.emit("onClick") })
    6 -> modifier.composeModifier6(`onClickLabel` = if (args.isNull("onClickLabel")) null else (args.string("onClickLabel")), `role` = if (args.isNull("role")) null else (toComposeRole(args.string("role"))), `onClick` = { args.emit("onClick") })
    7 -> modifier.composeModifier6(`enabled` = args.boolean("enabled"), `onClickLabel` = if (args.isNull("onClickLabel")) null else (args.string("onClickLabel")), `role` = if (args.isNull("role")) null else (toComposeRole(args.string("role"))), `onClick` = { args.emit("onClick") })
    8 -> modifier.composeModifier6(`onLongClickLabel` = if (args.isNull("onLongClickLabel")) null else (args.string("onLongClickLabel")), `onClick` = { args.emit("onClick") })
    9 -> modifier.composeModifier6(`enabled` = args.boolean("enabled"), `onLongClickLabel` = if (args.isNull("onLongClickLabel")) null else (args.string("onLongClickLabel")), `onClick` = { args.emit("onClick") })
    10 -> modifier.composeModifier6(`onClickLabel` = if (args.isNull("onClickLabel")) null else (args.string("onClickLabel")), `onLongClickLabel` = if (args.isNull("onLongClickLabel")) null else (args.string("onLongClickLabel")), `onClick` = { args.emit("onClick") })
    11 -> modifier.composeModifier6(`enabled` = args.boolean("enabled"), `onClickLabel` = if (args.isNull("onClickLabel")) null else (args.string("onClickLabel")), `onLongClickLabel` = if (args.isNull("onLongClickLabel")) null else (args.string("onLongClickLabel")), `onClick` = { args.emit("onClick") })
    12 -> modifier.composeModifier6(`role` = if (args.isNull("role")) null else (toComposeRole(args.string("role"))), `onLongClickLabel` = if (args.isNull("onLongClickLabel")) null else (args.string("onLongClickLabel")), `onClick` = { args.emit("onClick") })
    13 -> modifier.composeModifier6(`enabled` = args.boolean("enabled"), `role` = if (args.isNull("role")) null else (toComposeRole(args.string("role"))), `onLongClickLabel` = if (args.isNull("onLongClickLabel")) null else (args.string("onLongClickLabel")), `onClick` = { args.emit("onClick") })
    14 -> modifier.composeModifier6(`onClickLabel` = if (args.isNull("onClickLabel")) null else (args.string("onClickLabel")), `role` = if (args.isNull("role")) null else (toComposeRole(args.string("role"))), `onLongClickLabel` = if (args.isNull("onLongClickLabel")) null else (args.string("onLongClickLabel")), `onClick` = { args.emit("onClick") })
    15 -> modifier.composeModifier6(`enabled` = args.boolean("enabled"), `onClickLabel` = if (args.isNull("onClickLabel")) null else (args.string("onClickLabel")), `role` = if (args.isNull("role")) null else (toComposeRole(args.string("role"))), `onLongClickLabel` = if (args.isNull("onLongClickLabel")) null else (args.string("onLongClickLabel")), `onClick` = { args.emit("onClick") })
    16 -> modifier.composeModifier6(`onLongClick` = if (args.isNull("onLongClick")) null else ({ args.emit("onLongClick") }), `onClick` = { args.emit("onClick") })
    17 -> modifier.composeModifier6(`enabled` = args.boolean("enabled"), `onLongClick` = if (args.isNull("onLongClick")) null else ({ args.emit("onLongClick") }), `onClick` = { args.emit("onClick") })
    18 -> modifier.composeModifier6(`onClickLabel` = if (args.isNull("onClickLabel")) null else (args.string("onClickLabel")), `onLongClick` = if (args.isNull("onLongClick")) null else ({ args.emit("onLongClick") }), `onClick` = { args.emit("onClick") })
    19 -> modifier.composeModifier6(`enabled` = args.boolean("enabled"), `onClickLabel` = if (args.isNull("onClickLabel")) null else (args.string("onClickLabel")), `onLongClick` = if (args.isNull("onLongClick")) null else ({ args.emit("onLongClick") }), `onClick` = { args.emit("onClick") })
    20 -> modifier.composeModifier6(`role` = if (args.isNull("role")) null else (toComposeRole(args.string("role"))), `onLongClick` = if (args.isNull("onLongClick")) null else ({ args.emit("onLongClick") }), `onClick` = { args.emit("onClick") })
    21 -> modifier.composeModifier6(`enabled` = args.boolean("enabled"), `role` = if (args.isNull("role")) null else (toComposeRole(args.string("role"))), `onLongClick` = if (args.isNull("onLongClick")) null else ({ args.emit("onLongClick") }), `onClick` = { args.emit("onClick") })
    22 -> modifier.composeModifier6(`onClickLabel` = if (args.isNull("onClickLabel")) null else (args.string("onClickLabel")), `role` = if (args.isNull("role")) null else (toComposeRole(args.string("role"))), `onLongClick` = if (args.isNull("onLongClick")) null else ({ args.emit("onLongClick") }), `onClick` = { args.emit("onClick") })
    23 -> modifier.composeModifier6(`enabled` = args.boolean("enabled"), `onClickLabel` = if (args.isNull("onClickLabel")) null else (args.string("onClickLabel")), `role` = if (args.isNull("role")) null else (toComposeRole(args.string("role"))), `onLongClick` = if (args.isNull("onLongClick")) null else ({ args.emit("onLongClick") }), `onClick` = { args.emit("onClick") })
    24 -> modifier.composeModifier6(`onLongClickLabel` = if (args.isNull("onLongClickLabel")) null else (args.string("onLongClickLabel")), `onLongClick` = if (args.isNull("onLongClick")) null else ({ args.emit("onLongClick") }), `onClick` = { args.emit("onClick") })
    25 -> modifier.composeModifier6(`enabled` = args.boolean("enabled"), `onLongClickLabel` = if (args.isNull("onLongClickLabel")) null else (args.string("onLongClickLabel")), `onLongClick` = if (args.isNull("onLongClick")) null else ({ args.emit("onLongClick") }), `onClick` = { args.emit("onClick") })
    26 -> modifier.composeModifier6(`onClickLabel` = if (args.isNull("onClickLabel")) null else (args.string("onClickLabel")), `onLongClickLabel` = if (args.isNull("onLongClickLabel")) null else (args.string("onLongClickLabel")), `onLongClick` = if (args.isNull("onLongClick")) null else ({ args.emit("onLongClick") }), `onClick` = { args.emit("onClick") })
    27 -> modifier.composeModifier6(`enabled` = args.boolean("enabled"), `onClickLabel` = if (args.isNull("onClickLabel")) null else (args.string("onClickLabel")), `onLongClickLabel` = if (args.isNull("onLongClickLabel")) null else (args.string("onLongClickLabel")), `onLongClick` = if (args.isNull("onLongClick")) null else ({ args.emit("onLongClick") }), `onClick` = { args.emit("onClick") })
    28 -> modifier.composeModifier6(`role` = if (args.isNull("role")) null else (toComposeRole(args.string("role"))), `onLongClickLabel` = if (args.isNull("onLongClickLabel")) null else (args.string("onLongClickLabel")), `onLongClick` = if (args.isNull("onLongClick")) null else ({ args.emit("onLongClick") }), `onClick` = { args.emit("onClick") })
    29 -> modifier.composeModifier6(`enabled` = args.boolean("enabled"), `role` = if (args.isNull("role")) null else (toComposeRole(args.string("role"))), `onLongClickLabel` = if (args.isNull("onLongClickLabel")) null else (args.string("onLongClickLabel")), `onLongClick` = if (args.isNull("onLongClick")) null else ({ args.emit("onLongClick") }), `onClick` = { args.emit("onClick") })
    30 -> modifier.composeModifier6(`onClickLabel` = if (args.isNull("onClickLabel")) null else (args.string("onClickLabel")), `role` = if (args.isNull("role")) null else (toComposeRole(args.string("role"))), `onLongClickLabel` = if (args.isNull("onLongClickLabel")) null else (args.string("onLongClickLabel")), `onLongClick` = if (args.isNull("onLongClick")) null else ({ args.emit("onLongClick") }), `onClick` = { args.emit("onClick") })
    31 -> modifier.composeModifier6(`enabled` = args.boolean("enabled"), `onClickLabel` = if (args.isNull("onClickLabel")) null else (args.string("onClickLabel")), `role` = if (args.isNull("role")) null else (toComposeRole(args.string("role"))), `onLongClickLabel` = if (args.isNull("onLongClickLabel")) null else (args.string("onLongClickLabel")), `onLongClick` = if (args.isNull("onLongClick")) null else ({ args.emit("onLongClick") }), `onClick` = { args.emit("onClick") })
    else -> error("Invalid generated modifier arguments: " + args)
  }

private fun apply12Group1(modifier: Modifier, args: ComposeModifierArguments, mask: Int): Modifier = when (mask) {
    32 -> modifier.composeModifier6(`onDoubleClick` = if (args.isNull("onDoubleClick")) null else ({ args.emit("onDoubleClick") }), `onClick` = { args.emit("onClick") })
    33 -> modifier.composeModifier6(`enabled` = args.boolean("enabled"), `onDoubleClick` = if (args.isNull("onDoubleClick")) null else ({ args.emit("onDoubleClick") }), `onClick` = { args.emit("onClick") })
    34 -> modifier.composeModifier6(`onClickLabel` = if (args.isNull("onClickLabel")) null else (args.string("onClickLabel")), `onDoubleClick` = if (args.isNull("onDoubleClick")) null else ({ args.emit("onDoubleClick") }), `onClick` = { args.emit("onClick") })
    35 -> modifier.composeModifier6(`enabled` = args.boolean("enabled"), `onClickLabel` = if (args.isNull("onClickLabel")) null else (args.string("onClickLabel")), `onDoubleClick` = if (args.isNull("onDoubleClick")) null else ({ args.emit("onDoubleClick") }), `onClick` = { args.emit("onClick") })
    36 -> modifier.composeModifier6(`role` = if (args.isNull("role")) null else (toComposeRole(args.string("role"))), `onDoubleClick` = if (args.isNull("onDoubleClick")) null else ({ args.emit("onDoubleClick") }), `onClick` = { args.emit("onClick") })
    37 -> modifier.composeModifier6(`enabled` = args.boolean("enabled"), `role` = if (args.isNull("role")) null else (toComposeRole(args.string("role"))), `onDoubleClick` = if (args.isNull("onDoubleClick")) null else ({ args.emit("onDoubleClick") }), `onClick` = { args.emit("onClick") })
    38 -> modifier.composeModifier6(`onClickLabel` = if (args.isNull("onClickLabel")) null else (args.string("onClickLabel")), `role` = if (args.isNull("role")) null else (toComposeRole(args.string("role"))), `onDoubleClick` = if (args.isNull("onDoubleClick")) null else ({ args.emit("onDoubleClick") }), `onClick` = { args.emit("onClick") })
    39 -> modifier.composeModifier6(`enabled` = args.boolean("enabled"), `onClickLabel` = if (args.isNull("onClickLabel")) null else (args.string("onClickLabel")), `role` = if (args.isNull("role")) null else (toComposeRole(args.string("role"))), `onDoubleClick` = if (args.isNull("onDoubleClick")) null else ({ args.emit("onDoubleClick") }), `onClick` = { args.emit("onClick") })
    40 -> modifier.composeModifier6(`onLongClickLabel` = if (args.isNull("onLongClickLabel")) null else (args.string("onLongClickLabel")), `onDoubleClick` = if (args.isNull("onDoubleClick")) null else ({ args.emit("onDoubleClick") }), `onClick` = { args.emit("onClick") })
    41 -> modifier.composeModifier6(`enabled` = args.boolean("enabled"), `onLongClickLabel` = if (args.isNull("onLongClickLabel")) null else (args.string("onLongClickLabel")), `onDoubleClick` = if (args.isNull("onDoubleClick")) null else ({ args.emit("onDoubleClick") }), `onClick` = { args.emit("onClick") })
    42 -> modifier.composeModifier6(`onClickLabel` = if (args.isNull("onClickLabel")) null else (args.string("onClickLabel")), `onLongClickLabel` = if (args.isNull("onLongClickLabel")) null else (args.string("onLongClickLabel")), `onDoubleClick` = if (args.isNull("onDoubleClick")) null else ({ args.emit("onDoubleClick") }), `onClick` = { args.emit("onClick") })
    43 -> modifier.composeModifier6(`enabled` = args.boolean("enabled"), `onClickLabel` = if (args.isNull("onClickLabel")) null else (args.string("onClickLabel")), `onLongClickLabel` = if (args.isNull("onLongClickLabel")) null else (args.string("onLongClickLabel")), `onDoubleClick` = if (args.isNull("onDoubleClick")) null else ({ args.emit("onDoubleClick") }), `onClick` = { args.emit("onClick") })
    44 -> modifier.composeModifier6(`role` = if (args.isNull("role")) null else (toComposeRole(args.string("role"))), `onLongClickLabel` = if (args.isNull("onLongClickLabel")) null else (args.string("onLongClickLabel")), `onDoubleClick` = if (args.isNull("onDoubleClick")) null else ({ args.emit("onDoubleClick") }), `onClick` = { args.emit("onClick") })
    45 -> modifier.composeModifier6(`enabled` = args.boolean("enabled"), `role` = if (args.isNull("role")) null else (toComposeRole(args.string("role"))), `onLongClickLabel` = if (args.isNull("onLongClickLabel")) null else (args.string("onLongClickLabel")), `onDoubleClick` = if (args.isNull("onDoubleClick")) null else ({ args.emit("onDoubleClick") }), `onClick` = { args.emit("onClick") })
    46 -> modifier.composeModifier6(`onClickLabel` = if (args.isNull("onClickLabel")) null else (args.string("onClickLabel")), `role` = if (args.isNull("role")) null else (toComposeRole(args.string("role"))), `onLongClickLabel` = if (args.isNull("onLongClickLabel")) null else (args.string("onLongClickLabel")), `onDoubleClick` = if (args.isNull("onDoubleClick")) null else ({ args.emit("onDoubleClick") }), `onClick` = { args.emit("onClick") })
    47 -> modifier.composeModifier6(`enabled` = args.boolean("enabled"), `onClickLabel` = if (args.isNull("onClickLabel")) null else (args.string("onClickLabel")), `role` = if (args.isNull("role")) null else (toComposeRole(args.string("role"))), `onLongClickLabel` = if (args.isNull("onLongClickLabel")) null else (args.string("onLongClickLabel")), `onDoubleClick` = if (args.isNull("onDoubleClick")) null else ({ args.emit("onDoubleClick") }), `onClick` = { args.emit("onClick") })
    48 -> modifier.composeModifier6(`onLongClick` = if (args.isNull("onLongClick")) null else ({ args.emit("onLongClick") }), `onDoubleClick` = if (args.isNull("onDoubleClick")) null else ({ args.emit("onDoubleClick") }), `onClick` = { args.emit("onClick") })
    49 -> modifier.composeModifier6(`enabled` = args.boolean("enabled"), `onLongClick` = if (args.isNull("onLongClick")) null else ({ args.emit("onLongClick") }), `onDoubleClick` = if (args.isNull("onDoubleClick")) null else ({ args.emit("onDoubleClick") }), `onClick` = { args.emit("onClick") })
    50 -> modifier.composeModifier6(`onClickLabel` = if (args.isNull("onClickLabel")) null else (args.string("onClickLabel")), `onLongClick` = if (args.isNull("onLongClick")) null else ({ args.emit("onLongClick") }), `onDoubleClick` = if (args.isNull("onDoubleClick")) null else ({ args.emit("onDoubleClick") }), `onClick` = { args.emit("onClick") })
    51 -> modifier.composeModifier6(`enabled` = args.boolean("enabled"), `onClickLabel` = if (args.isNull("onClickLabel")) null else (args.string("onClickLabel")), `onLongClick` = if (args.isNull("onLongClick")) null else ({ args.emit("onLongClick") }), `onDoubleClick` = if (args.isNull("onDoubleClick")) null else ({ args.emit("onDoubleClick") }), `onClick` = { args.emit("onClick") })
    52 -> modifier.composeModifier6(`role` = if (args.isNull("role")) null else (toComposeRole(args.string("role"))), `onLongClick` = if (args.isNull("onLongClick")) null else ({ args.emit("onLongClick") }), `onDoubleClick` = if (args.isNull("onDoubleClick")) null else ({ args.emit("onDoubleClick") }), `onClick` = { args.emit("onClick") })
    53 -> modifier.composeModifier6(`enabled` = args.boolean("enabled"), `role` = if (args.isNull("role")) null else (toComposeRole(args.string("role"))), `onLongClick` = if (args.isNull("onLongClick")) null else ({ args.emit("onLongClick") }), `onDoubleClick` = if (args.isNull("onDoubleClick")) null else ({ args.emit("onDoubleClick") }), `onClick` = { args.emit("onClick") })
    54 -> modifier.composeModifier6(`onClickLabel` = if (args.isNull("onClickLabel")) null else (args.string("onClickLabel")), `role` = if (args.isNull("role")) null else (toComposeRole(args.string("role"))), `onLongClick` = if (args.isNull("onLongClick")) null else ({ args.emit("onLongClick") }), `onDoubleClick` = if (args.isNull("onDoubleClick")) null else ({ args.emit("onDoubleClick") }), `onClick` = { args.emit("onClick") })
    55 -> modifier.composeModifier6(`enabled` = args.boolean("enabled"), `onClickLabel` = if (args.isNull("onClickLabel")) null else (args.string("onClickLabel")), `role` = if (args.isNull("role")) null else (toComposeRole(args.string("role"))), `onLongClick` = if (args.isNull("onLongClick")) null else ({ args.emit("onLongClick") }), `onDoubleClick` = if (args.isNull("onDoubleClick")) null else ({ args.emit("onDoubleClick") }), `onClick` = { args.emit("onClick") })
    56 -> modifier.composeModifier6(`onLongClickLabel` = if (args.isNull("onLongClickLabel")) null else (args.string("onLongClickLabel")), `onLongClick` = if (args.isNull("onLongClick")) null else ({ args.emit("onLongClick") }), `onDoubleClick` = if (args.isNull("onDoubleClick")) null else ({ args.emit("onDoubleClick") }), `onClick` = { args.emit("onClick") })
    57 -> modifier.composeModifier6(`enabled` = args.boolean("enabled"), `onLongClickLabel` = if (args.isNull("onLongClickLabel")) null else (args.string("onLongClickLabel")), `onLongClick` = if (args.isNull("onLongClick")) null else ({ args.emit("onLongClick") }), `onDoubleClick` = if (args.isNull("onDoubleClick")) null else ({ args.emit("onDoubleClick") }), `onClick` = { args.emit("onClick") })
    58 -> modifier.composeModifier6(`onClickLabel` = if (args.isNull("onClickLabel")) null else (args.string("onClickLabel")), `onLongClickLabel` = if (args.isNull("onLongClickLabel")) null else (args.string("onLongClickLabel")), `onLongClick` = if (args.isNull("onLongClick")) null else ({ args.emit("onLongClick") }), `onDoubleClick` = if (args.isNull("onDoubleClick")) null else ({ args.emit("onDoubleClick") }), `onClick` = { args.emit("onClick") })
    59 -> modifier.composeModifier6(`enabled` = args.boolean("enabled"), `onClickLabel` = if (args.isNull("onClickLabel")) null else (args.string("onClickLabel")), `onLongClickLabel` = if (args.isNull("onLongClickLabel")) null else (args.string("onLongClickLabel")), `onLongClick` = if (args.isNull("onLongClick")) null else ({ args.emit("onLongClick") }), `onDoubleClick` = if (args.isNull("onDoubleClick")) null else ({ args.emit("onDoubleClick") }), `onClick` = { args.emit("onClick") })
    60 -> modifier.composeModifier6(`role` = if (args.isNull("role")) null else (toComposeRole(args.string("role"))), `onLongClickLabel` = if (args.isNull("onLongClickLabel")) null else (args.string("onLongClickLabel")), `onLongClick` = if (args.isNull("onLongClick")) null else ({ args.emit("onLongClick") }), `onDoubleClick` = if (args.isNull("onDoubleClick")) null else ({ args.emit("onDoubleClick") }), `onClick` = { args.emit("onClick") })
    61 -> modifier.composeModifier6(`enabled` = args.boolean("enabled"), `role` = if (args.isNull("role")) null else (toComposeRole(args.string("role"))), `onLongClickLabel` = if (args.isNull("onLongClickLabel")) null else (args.string("onLongClickLabel")), `onLongClick` = if (args.isNull("onLongClick")) null else ({ args.emit("onLongClick") }), `onDoubleClick` = if (args.isNull("onDoubleClick")) null else ({ args.emit("onDoubleClick") }), `onClick` = { args.emit("onClick") })
    62 -> modifier.composeModifier6(`onClickLabel` = if (args.isNull("onClickLabel")) null else (args.string("onClickLabel")), `role` = if (args.isNull("role")) null else (toComposeRole(args.string("role"))), `onLongClickLabel` = if (args.isNull("onLongClickLabel")) null else (args.string("onLongClickLabel")), `onLongClick` = if (args.isNull("onLongClick")) null else ({ args.emit("onLongClick") }), `onDoubleClick` = if (args.isNull("onDoubleClick")) null else ({ args.emit("onDoubleClick") }), `onClick` = { args.emit("onClick") })
    63 -> modifier.composeModifier6(`enabled` = args.boolean("enabled"), `onClickLabel` = if (args.isNull("onClickLabel")) null else (args.string("onClickLabel")), `role` = if (args.isNull("role")) null else (toComposeRole(args.string("role"))), `onLongClickLabel` = if (args.isNull("onLongClickLabel")) null else (args.string("onLongClickLabel")), `onLongClick` = if (args.isNull("onLongClick")) null else ({ args.emit("onLongClick") }), `onDoubleClick` = if (args.isNull("onDoubleClick")) null else ({ args.emit("onDoubleClick") }), `onClick` = { args.emit("onClick") })
    else -> error("Invalid generated modifier arguments: " + args)
  }

private fun apply12Group2(modifier: Modifier, args: ComposeModifierArguments, mask: Int): Modifier = when (mask) {
    64 -> modifier.composeModifier6(`hapticFeedbackEnabled` = args.boolean("hapticFeedbackEnabled"), `onClick` = { args.emit("onClick") })
    65 -> modifier.composeModifier6(`enabled` = args.boolean("enabled"), `hapticFeedbackEnabled` = args.boolean("hapticFeedbackEnabled"), `onClick` = { args.emit("onClick") })
    66 -> modifier.composeModifier6(`onClickLabel` = if (args.isNull("onClickLabel")) null else (args.string("onClickLabel")), `hapticFeedbackEnabled` = args.boolean("hapticFeedbackEnabled"), `onClick` = { args.emit("onClick") })
    67 -> modifier.composeModifier6(`enabled` = args.boolean("enabled"), `onClickLabel` = if (args.isNull("onClickLabel")) null else (args.string("onClickLabel")), `hapticFeedbackEnabled` = args.boolean("hapticFeedbackEnabled"), `onClick` = { args.emit("onClick") })
    68 -> modifier.composeModifier6(`role` = if (args.isNull("role")) null else (toComposeRole(args.string("role"))), `hapticFeedbackEnabled` = args.boolean("hapticFeedbackEnabled"), `onClick` = { args.emit("onClick") })
    69 -> modifier.composeModifier6(`enabled` = args.boolean("enabled"), `role` = if (args.isNull("role")) null else (toComposeRole(args.string("role"))), `hapticFeedbackEnabled` = args.boolean("hapticFeedbackEnabled"), `onClick` = { args.emit("onClick") })
    70 -> modifier.composeModifier6(`onClickLabel` = if (args.isNull("onClickLabel")) null else (args.string("onClickLabel")), `role` = if (args.isNull("role")) null else (toComposeRole(args.string("role"))), `hapticFeedbackEnabled` = args.boolean("hapticFeedbackEnabled"), `onClick` = { args.emit("onClick") })
    71 -> modifier.composeModifier6(`enabled` = args.boolean("enabled"), `onClickLabel` = if (args.isNull("onClickLabel")) null else (args.string("onClickLabel")), `role` = if (args.isNull("role")) null else (toComposeRole(args.string("role"))), `hapticFeedbackEnabled` = args.boolean("hapticFeedbackEnabled"), `onClick` = { args.emit("onClick") })
    72 -> modifier.composeModifier6(`onLongClickLabel` = if (args.isNull("onLongClickLabel")) null else (args.string("onLongClickLabel")), `hapticFeedbackEnabled` = args.boolean("hapticFeedbackEnabled"), `onClick` = { args.emit("onClick") })
    73 -> modifier.composeModifier6(`enabled` = args.boolean("enabled"), `onLongClickLabel` = if (args.isNull("onLongClickLabel")) null else (args.string("onLongClickLabel")), `hapticFeedbackEnabled` = args.boolean("hapticFeedbackEnabled"), `onClick` = { args.emit("onClick") })
    74 -> modifier.composeModifier6(`onClickLabel` = if (args.isNull("onClickLabel")) null else (args.string("onClickLabel")), `onLongClickLabel` = if (args.isNull("onLongClickLabel")) null else (args.string("onLongClickLabel")), `hapticFeedbackEnabled` = args.boolean("hapticFeedbackEnabled"), `onClick` = { args.emit("onClick") })
    75 -> modifier.composeModifier6(`enabled` = args.boolean("enabled"), `onClickLabel` = if (args.isNull("onClickLabel")) null else (args.string("onClickLabel")), `onLongClickLabel` = if (args.isNull("onLongClickLabel")) null else (args.string("onLongClickLabel")), `hapticFeedbackEnabled` = args.boolean("hapticFeedbackEnabled"), `onClick` = { args.emit("onClick") })
    76 -> modifier.composeModifier6(`role` = if (args.isNull("role")) null else (toComposeRole(args.string("role"))), `onLongClickLabel` = if (args.isNull("onLongClickLabel")) null else (args.string("onLongClickLabel")), `hapticFeedbackEnabled` = args.boolean("hapticFeedbackEnabled"), `onClick` = { args.emit("onClick") })
    77 -> modifier.composeModifier6(`enabled` = args.boolean("enabled"), `role` = if (args.isNull("role")) null else (toComposeRole(args.string("role"))), `onLongClickLabel` = if (args.isNull("onLongClickLabel")) null else (args.string("onLongClickLabel")), `hapticFeedbackEnabled` = args.boolean("hapticFeedbackEnabled"), `onClick` = { args.emit("onClick") })
    78 -> modifier.composeModifier6(`onClickLabel` = if (args.isNull("onClickLabel")) null else (args.string("onClickLabel")), `role` = if (args.isNull("role")) null else (toComposeRole(args.string("role"))), `onLongClickLabel` = if (args.isNull("onLongClickLabel")) null else (args.string("onLongClickLabel")), `hapticFeedbackEnabled` = args.boolean("hapticFeedbackEnabled"), `onClick` = { args.emit("onClick") })
    79 -> modifier.composeModifier6(`enabled` = args.boolean("enabled"), `onClickLabel` = if (args.isNull("onClickLabel")) null else (args.string("onClickLabel")), `role` = if (args.isNull("role")) null else (toComposeRole(args.string("role"))), `onLongClickLabel` = if (args.isNull("onLongClickLabel")) null else (args.string("onLongClickLabel")), `hapticFeedbackEnabled` = args.boolean("hapticFeedbackEnabled"), `onClick` = { args.emit("onClick") })
    80 -> modifier.composeModifier6(`onLongClick` = if (args.isNull("onLongClick")) null else ({ args.emit("onLongClick") }), `hapticFeedbackEnabled` = args.boolean("hapticFeedbackEnabled"), `onClick` = { args.emit("onClick") })
    81 -> modifier.composeModifier6(`enabled` = args.boolean("enabled"), `onLongClick` = if (args.isNull("onLongClick")) null else ({ args.emit("onLongClick") }), `hapticFeedbackEnabled` = args.boolean("hapticFeedbackEnabled"), `onClick` = { args.emit("onClick") })
    82 -> modifier.composeModifier6(`onClickLabel` = if (args.isNull("onClickLabel")) null else (args.string("onClickLabel")), `onLongClick` = if (args.isNull("onLongClick")) null else ({ args.emit("onLongClick") }), `hapticFeedbackEnabled` = args.boolean("hapticFeedbackEnabled"), `onClick` = { args.emit("onClick") })
    83 -> modifier.composeModifier6(`enabled` = args.boolean("enabled"), `onClickLabel` = if (args.isNull("onClickLabel")) null else (args.string("onClickLabel")), `onLongClick` = if (args.isNull("onLongClick")) null else ({ args.emit("onLongClick") }), `hapticFeedbackEnabled` = args.boolean("hapticFeedbackEnabled"), `onClick` = { args.emit("onClick") })
    84 -> modifier.composeModifier6(`role` = if (args.isNull("role")) null else (toComposeRole(args.string("role"))), `onLongClick` = if (args.isNull("onLongClick")) null else ({ args.emit("onLongClick") }), `hapticFeedbackEnabled` = args.boolean("hapticFeedbackEnabled"), `onClick` = { args.emit("onClick") })
    85 -> modifier.composeModifier6(`enabled` = args.boolean("enabled"), `role` = if (args.isNull("role")) null else (toComposeRole(args.string("role"))), `onLongClick` = if (args.isNull("onLongClick")) null else ({ args.emit("onLongClick") }), `hapticFeedbackEnabled` = args.boolean("hapticFeedbackEnabled"), `onClick` = { args.emit("onClick") })
    86 -> modifier.composeModifier6(`onClickLabel` = if (args.isNull("onClickLabel")) null else (args.string("onClickLabel")), `role` = if (args.isNull("role")) null else (toComposeRole(args.string("role"))), `onLongClick` = if (args.isNull("onLongClick")) null else ({ args.emit("onLongClick") }), `hapticFeedbackEnabled` = args.boolean("hapticFeedbackEnabled"), `onClick` = { args.emit("onClick") })
    87 -> modifier.composeModifier6(`enabled` = args.boolean("enabled"), `onClickLabel` = if (args.isNull("onClickLabel")) null else (args.string("onClickLabel")), `role` = if (args.isNull("role")) null else (toComposeRole(args.string("role"))), `onLongClick` = if (args.isNull("onLongClick")) null else ({ args.emit("onLongClick") }), `hapticFeedbackEnabled` = args.boolean("hapticFeedbackEnabled"), `onClick` = { args.emit("onClick") })
    88 -> modifier.composeModifier6(`onLongClickLabel` = if (args.isNull("onLongClickLabel")) null else (args.string("onLongClickLabel")), `onLongClick` = if (args.isNull("onLongClick")) null else ({ args.emit("onLongClick") }), `hapticFeedbackEnabled` = args.boolean("hapticFeedbackEnabled"), `onClick` = { args.emit("onClick") })
    89 -> modifier.composeModifier6(`enabled` = args.boolean("enabled"), `onLongClickLabel` = if (args.isNull("onLongClickLabel")) null else (args.string("onLongClickLabel")), `onLongClick` = if (args.isNull("onLongClick")) null else ({ args.emit("onLongClick") }), `hapticFeedbackEnabled` = args.boolean("hapticFeedbackEnabled"), `onClick` = { args.emit("onClick") })
    90 -> modifier.composeModifier6(`onClickLabel` = if (args.isNull("onClickLabel")) null else (args.string("onClickLabel")), `onLongClickLabel` = if (args.isNull("onLongClickLabel")) null else (args.string("onLongClickLabel")), `onLongClick` = if (args.isNull("onLongClick")) null else ({ args.emit("onLongClick") }), `hapticFeedbackEnabled` = args.boolean("hapticFeedbackEnabled"), `onClick` = { args.emit("onClick") })
    91 -> modifier.composeModifier6(`enabled` = args.boolean("enabled"), `onClickLabel` = if (args.isNull("onClickLabel")) null else (args.string("onClickLabel")), `onLongClickLabel` = if (args.isNull("onLongClickLabel")) null else (args.string("onLongClickLabel")), `onLongClick` = if (args.isNull("onLongClick")) null else ({ args.emit("onLongClick") }), `hapticFeedbackEnabled` = args.boolean("hapticFeedbackEnabled"), `onClick` = { args.emit("onClick") })
    92 -> modifier.composeModifier6(`role` = if (args.isNull("role")) null else (toComposeRole(args.string("role"))), `onLongClickLabel` = if (args.isNull("onLongClickLabel")) null else (args.string("onLongClickLabel")), `onLongClick` = if (args.isNull("onLongClick")) null else ({ args.emit("onLongClick") }), `hapticFeedbackEnabled` = args.boolean("hapticFeedbackEnabled"), `onClick` = { args.emit("onClick") })
    93 -> modifier.composeModifier6(`enabled` = args.boolean("enabled"), `role` = if (args.isNull("role")) null else (toComposeRole(args.string("role"))), `onLongClickLabel` = if (args.isNull("onLongClickLabel")) null else (args.string("onLongClickLabel")), `onLongClick` = if (args.isNull("onLongClick")) null else ({ args.emit("onLongClick") }), `hapticFeedbackEnabled` = args.boolean("hapticFeedbackEnabled"), `onClick` = { args.emit("onClick") })
    94 -> modifier.composeModifier6(`onClickLabel` = if (args.isNull("onClickLabel")) null else (args.string("onClickLabel")), `role` = if (args.isNull("role")) null else (toComposeRole(args.string("role"))), `onLongClickLabel` = if (args.isNull("onLongClickLabel")) null else (args.string("onLongClickLabel")), `onLongClick` = if (args.isNull("onLongClick")) null else ({ args.emit("onLongClick") }), `hapticFeedbackEnabled` = args.boolean("hapticFeedbackEnabled"), `onClick` = { args.emit("onClick") })
    95 -> modifier.composeModifier6(`enabled` = args.boolean("enabled"), `onClickLabel` = if (args.isNull("onClickLabel")) null else (args.string("onClickLabel")), `role` = if (args.isNull("role")) null else (toComposeRole(args.string("role"))), `onLongClickLabel` = if (args.isNull("onLongClickLabel")) null else (args.string("onLongClickLabel")), `onLongClick` = if (args.isNull("onLongClick")) null else ({ args.emit("onLongClick") }), `hapticFeedbackEnabled` = args.boolean("hapticFeedbackEnabled"), `onClick` = { args.emit("onClick") })
    else -> error("Invalid generated modifier arguments: " + args)
  }

private fun apply12Group3(modifier: Modifier, args: ComposeModifierArguments, mask: Int): Modifier = when (mask) {
    96 -> modifier.composeModifier6(`onDoubleClick` = if (args.isNull("onDoubleClick")) null else ({ args.emit("onDoubleClick") }), `hapticFeedbackEnabled` = args.boolean("hapticFeedbackEnabled"), `onClick` = { args.emit("onClick") })
    97 -> modifier.composeModifier6(`enabled` = args.boolean("enabled"), `onDoubleClick` = if (args.isNull("onDoubleClick")) null else ({ args.emit("onDoubleClick") }), `hapticFeedbackEnabled` = args.boolean("hapticFeedbackEnabled"), `onClick` = { args.emit("onClick") })
    98 -> modifier.composeModifier6(`onClickLabel` = if (args.isNull("onClickLabel")) null else (args.string("onClickLabel")), `onDoubleClick` = if (args.isNull("onDoubleClick")) null else ({ args.emit("onDoubleClick") }), `hapticFeedbackEnabled` = args.boolean("hapticFeedbackEnabled"), `onClick` = { args.emit("onClick") })
    99 -> modifier.composeModifier6(`enabled` = args.boolean("enabled"), `onClickLabel` = if (args.isNull("onClickLabel")) null else (args.string("onClickLabel")), `onDoubleClick` = if (args.isNull("onDoubleClick")) null else ({ args.emit("onDoubleClick") }), `hapticFeedbackEnabled` = args.boolean("hapticFeedbackEnabled"), `onClick` = { args.emit("onClick") })
    100 -> modifier.composeModifier6(`role` = if (args.isNull("role")) null else (toComposeRole(args.string("role"))), `onDoubleClick` = if (args.isNull("onDoubleClick")) null else ({ args.emit("onDoubleClick") }), `hapticFeedbackEnabled` = args.boolean("hapticFeedbackEnabled"), `onClick` = { args.emit("onClick") })
    101 -> modifier.composeModifier6(`enabled` = args.boolean("enabled"), `role` = if (args.isNull("role")) null else (toComposeRole(args.string("role"))), `onDoubleClick` = if (args.isNull("onDoubleClick")) null else ({ args.emit("onDoubleClick") }), `hapticFeedbackEnabled` = args.boolean("hapticFeedbackEnabled"), `onClick` = { args.emit("onClick") })
    102 -> modifier.composeModifier6(`onClickLabel` = if (args.isNull("onClickLabel")) null else (args.string("onClickLabel")), `role` = if (args.isNull("role")) null else (toComposeRole(args.string("role"))), `onDoubleClick` = if (args.isNull("onDoubleClick")) null else ({ args.emit("onDoubleClick") }), `hapticFeedbackEnabled` = args.boolean("hapticFeedbackEnabled"), `onClick` = { args.emit("onClick") })
    103 -> modifier.composeModifier6(`enabled` = args.boolean("enabled"), `onClickLabel` = if (args.isNull("onClickLabel")) null else (args.string("onClickLabel")), `role` = if (args.isNull("role")) null else (toComposeRole(args.string("role"))), `onDoubleClick` = if (args.isNull("onDoubleClick")) null else ({ args.emit("onDoubleClick") }), `hapticFeedbackEnabled` = args.boolean("hapticFeedbackEnabled"), `onClick` = { args.emit("onClick") })
    104 -> modifier.composeModifier6(`onLongClickLabel` = if (args.isNull("onLongClickLabel")) null else (args.string("onLongClickLabel")), `onDoubleClick` = if (args.isNull("onDoubleClick")) null else ({ args.emit("onDoubleClick") }), `hapticFeedbackEnabled` = args.boolean("hapticFeedbackEnabled"), `onClick` = { args.emit("onClick") })
    105 -> modifier.composeModifier6(`enabled` = args.boolean("enabled"), `onLongClickLabel` = if (args.isNull("onLongClickLabel")) null else (args.string("onLongClickLabel")), `onDoubleClick` = if (args.isNull("onDoubleClick")) null else ({ args.emit("onDoubleClick") }), `hapticFeedbackEnabled` = args.boolean("hapticFeedbackEnabled"), `onClick` = { args.emit("onClick") })
    106 -> modifier.composeModifier6(`onClickLabel` = if (args.isNull("onClickLabel")) null else (args.string("onClickLabel")), `onLongClickLabel` = if (args.isNull("onLongClickLabel")) null else (args.string("onLongClickLabel")), `onDoubleClick` = if (args.isNull("onDoubleClick")) null else ({ args.emit("onDoubleClick") }), `hapticFeedbackEnabled` = args.boolean("hapticFeedbackEnabled"), `onClick` = { args.emit("onClick") })
    107 -> modifier.composeModifier6(`enabled` = args.boolean("enabled"), `onClickLabel` = if (args.isNull("onClickLabel")) null else (args.string("onClickLabel")), `onLongClickLabel` = if (args.isNull("onLongClickLabel")) null else (args.string("onLongClickLabel")), `onDoubleClick` = if (args.isNull("onDoubleClick")) null else ({ args.emit("onDoubleClick") }), `hapticFeedbackEnabled` = args.boolean("hapticFeedbackEnabled"), `onClick` = { args.emit("onClick") })
    108 -> modifier.composeModifier6(`role` = if (args.isNull("role")) null else (toComposeRole(args.string("role"))), `onLongClickLabel` = if (args.isNull("onLongClickLabel")) null else (args.string("onLongClickLabel")), `onDoubleClick` = if (args.isNull("onDoubleClick")) null else ({ args.emit("onDoubleClick") }), `hapticFeedbackEnabled` = args.boolean("hapticFeedbackEnabled"), `onClick` = { args.emit("onClick") })
    109 -> modifier.composeModifier6(`enabled` = args.boolean("enabled"), `role` = if (args.isNull("role")) null else (toComposeRole(args.string("role"))), `onLongClickLabel` = if (args.isNull("onLongClickLabel")) null else (args.string("onLongClickLabel")), `onDoubleClick` = if (args.isNull("onDoubleClick")) null else ({ args.emit("onDoubleClick") }), `hapticFeedbackEnabled` = args.boolean("hapticFeedbackEnabled"), `onClick` = { args.emit("onClick") })
    110 -> modifier.composeModifier6(`onClickLabel` = if (args.isNull("onClickLabel")) null else (args.string("onClickLabel")), `role` = if (args.isNull("role")) null else (toComposeRole(args.string("role"))), `onLongClickLabel` = if (args.isNull("onLongClickLabel")) null else (args.string("onLongClickLabel")), `onDoubleClick` = if (args.isNull("onDoubleClick")) null else ({ args.emit("onDoubleClick") }), `hapticFeedbackEnabled` = args.boolean("hapticFeedbackEnabled"), `onClick` = { args.emit("onClick") })
    111 -> modifier.composeModifier6(`enabled` = args.boolean("enabled"), `onClickLabel` = if (args.isNull("onClickLabel")) null else (args.string("onClickLabel")), `role` = if (args.isNull("role")) null else (toComposeRole(args.string("role"))), `onLongClickLabel` = if (args.isNull("onLongClickLabel")) null else (args.string("onLongClickLabel")), `onDoubleClick` = if (args.isNull("onDoubleClick")) null else ({ args.emit("onDoubleClick") }), `hapticFeedbackEnabled` = args.boolean("hapticFeedbackEnabled"), `onClick` = { args.emit("onClick") })
    112 -> modifier.composeModifier6(`onLongClick` = if (args.isNull("onLongClick")) null else ({ args.emit("onLongClick") }), `onDoubleClick` = if (args.isNull("onDoubleClick")) null else ({ args.emit("onDoubleClick") }), `hapticFeedbackEnabled` = args.boolean("hapticFeedbackEnabled"), `onClick` = { args.emit("onClick") })
    113 -> modifier.composeModifier6(`enabled` = args.boolean("enabled"), `onLongClick` = if (args.isNull("onLongClick")) null else ({ args.emit("onLongClick") }), `onDoubleClick` = if (args.isNull("onDoubleClick")) null else ({ args.emit("onDoubleClick") }), `hapticFeedbackEnabled` = args.boolean("hapticFeedbackEnabled"), `onClick` = { args.emit("onClick") })
    114 -> modifier.composeModifier6(`onClickLabel` = if (args.isNull("onClickLabel")) null else (args.string("onClickLabel")), `onLongClick` = if (args.isNull("onLongClick")) null else ({ args.emit("onLongClick") }), `onDoubleClick` = if (args.isNull("onDoubleClick")) null else ({ args.emit("onDoubleClick") }), `hapticFeedbackEnabled` = args.boolean("hapticFeedbackEnabled"), `onClick` = { args.emit("onClick") })
    115 -> modifier.composeModifier6(`enabled` = args.boolean("enabled"), `onClickLabel` = if (args.isNull("onClickLabel")) null else (args.string("onClickLabel")), `onLongClick` = if (args.isNull("onLongClick")) null else ({ args.emit("onLongClick") }), `onDoubleClick` = if (args.isNull("onDoubleClick")) null else ({ args.emit("onDoubleClick") }), `hapticFeedbackEnabled` = args.boolean("hapticFeedbackEnabled"), `onClick` = { args.emit("onClick") })
    116 -> modifier.composeModifier6(`role` = if (args.isNull("role")) null else (toComposeRole(args.string("role"))), `onLongClick` = if (args.isNull("onLongClick")) null else ({ args.emit("onLongClick") }), `onDoubleClick` = if (args.isNull("onDoubleClick")) null else ({ args.emit("onDoubleClick") }), `hapticFeedbackEnabled` = args.boolean("hapticFeedbackEnabled"), `onClick` = { args.emit("onClick") })
    117 -> modifier.composeModifier6(`enabled` = args.boolean("enabled"), `role` = if (args.isNull("role")) null else (toComposeRole(args.string("role"))), `onLongClick` = if (args.isNull("onLongClick")) null else ({ args.emit("onLongClick") }), `onDoubleClick` = if (args.isNull("onDoubleClick")) null else ({ args.emit("onDoubleClick") }), `hapticFeedbackEnabled` = args.boolean("hapticFeedbackEnabled"), `onClick` = { args.emit("onClick") })
    118 -> modifier.composeModifier6(`onClickLabel` = if (args.isNull("onClickLabel")) null else (args.string("onClickLabel")), `role` = if (args.isNull("role")) null else (toComposeRole(args.string("role"))), `onLongClick` = if (args.isNull("onLongClick")) null else ({ args.emit("onLongClick") }), `onDoubleClick` = if (args.isNull("onDoubleClick")) null else ({ args.emit("onDoubleClick") }), `hapticFeedbackEnabled` = args.boolean("hapticFeedbackEnabled"), `onClick` = { args.emit("onClick") })
    119 -> modifier.composeModifier6(`enabled` = args.boolean("enabled"), `onClickLabel` = if (args.isNull("onClickLabel")) null else (args.string("onClickLabel")), `role` = if (args.isNull("role")) null else (toComposeRole(args.string("role"))), `onLongClick` = if (args.isNull("onLongClick")) null else ({ args.emit("onLongClick") }), `onDoubleClick` = if (args.isNull("onDoubleClick")) null else ({ args.emit("onDoubleClick") }), `hapticFeedbackEnabled` = args.boolean("hapticFeedbackEnabled"), `onClick` = { args.emit("onClick") })
    120 -> modifier.composeModifier6(`onLongClickLabel` = if (args.isNull("onLongClickLabel")) null else (args.string("onLongClickLabel")), `onLongClick` = if (args.isNull("onLongClick")) null else ({ args.emit("onLongClick") }), `onDoubleClick` = if (args.isNull("onDoubleClick")) null else ({ args.emit("onDoubleClick") }), `hapticFeedbackEnabled` = args.boolean("hapticFeedbackEnabled"), `onClick` = { args.emit("onClick") })
    121 -> modifier.composeModifier6(`enabled` = args.boolean("enabled"), `onLongClickLabel` = if (args.isNull("onLongClickLabel")) null else (args.string("onLongClickLabel")), `onLongClick` = if (args.isNull("onLongClick")) null else ({ args.emit("onLongClick") }), `onDoubleClick` = if (args.isNull("onDoubleClick")) null else ({ args.emit("onDoubleClick") }), `hapticFeedbackEnabled` = args.boolean("hapticFeedbackEnabled"), `onClick` = { args.emit("onClick") })
    122 -> modifier.composeModifier6(`onClickLabel` = if (args.isNull("onClickLabel")) null else (args.string("onClickLabel")), `onLongClickLabel` = if (args.isNull("onLongClickLabel")) null else (args.string("onLongClickLabel")), `onLongClick` = if (args.isNull("onLongClick")) null else ({ args.emit("onLongClick") }), `onDoubleClick` = if (args.isNull("onDoubleClick")) null else ({ args.emit("onDoubleClick") }), `hapticFeedbackEnabled` = args.boolean("hapticFeedbackEnabled"), `onClick` = { args.emit("onClick") })
    123 -> modifier.composeModifier6(`enabled` = args.boolean("enabled"), `onClickLabel` = if (args.isNull("onClickLabel")) null else (args.string("onClickLabel")), `onLongClickLabel` = if (args.isNull("onLongClickLabel")) null else (args.string("onLongClickLabel")), `onLongClick` = if (args.isNull("onLongClick")) null else ({ args.emit("onLongClick") }), `onDoubleClick` = if (args.isNull("onDoubleClick")) null else ({ args.emit("onDoubleClick") }), `hapticFeedbackEnabled` = args.boolean("hapticFeedbackEnabled"), `onClick` = { args.emit("onClick") })
    124 -> modifier.composeModifier6(`role` = if (args.isNull("role")) null else (toComposeRole(args.string("role"))), `onLongClickLabel` = if (args.isNull("onLongClickLabel")) null else (args.string("onLongClickLabel")), `onLongClick` = if (args.isNull("onLongClick")) null else ({ args.emit("onLongClick") }), `onDoubleClick` = if (args.isNull("onDoubleClick")) null else ({ args.emit("onDoubleClick") }), `hapticFeedbackEnabled` = args.boolean("hapticFeedbackEnabled"), `onClick` = { args.emit("onClick") })
    125 -> modifier.composeModifier6(`enabled` = args.boolean("enabled"), `role` = if (args.isNull("role")) null else (toComposeRole(args.string("role"))), `onLongClickLabel` = if (args.isNull("onLongClickLabel")) null else (args.string("onLongClickLabel")), `onLongClick` = if (args.isNull("onLongClick")) null else ({ args.emit("onLongClick") }), `onDoubleClick` = if (args.isNull("onDoubleClick")) null else ({ args.emit("onDoubleClick") }), `hapticFeedbackEnabled` = args.boolean("hapticFeedbackEnabled"), `onClick` = { args.emit("onClick") })
    126 -> modifier.composeModifier6(`onClickLabel` = if (args.isNull("onClickLabel")) null else (args.string("onClickLabel")), `role` = if (args.isNull("role")) null else (toComposeRole(args.string("role"))), `onLongClickLabel` = if (args.isNull("onLongClickLabel")) null else (args.string("onLongClickLabel")), `onLongClick` = if (args.isNull("onLongClick")) null else ({ args.emit("onLongClick") }), `onDoubleClick` = if (args.isNull("onDoubleClick")) null else ({ args.emit("onDoubleClick") }), `hapticFeedbackEnabled` = args.boolean("hapticFeedbackEnabled"), `onClick` = { args.emit("onClick") })
    127 -> modifier.composeModifier6(`enabled` = args.boolean("enabled"), `onClickLabel` = if (args.isNull("onClickLabel")) null else (args.string("onClickLabel")), `role` = if (args.isNull("role")) null else (toComposeRole(args.string("role"))), `onLongClickLabel` = if (args.isNull("onLongClickLabel")) null else (args.string("onLongClickLabel")), `onLongClick` = if (args.isNull("onLongClick")) null else ({ args.emit("onLongClick") }), `onDoubleClick` = if (args.isNull("onDoubleClick")) null else ({ args.emit("onDoubleClick") }), `hapticFeedbackEnabled` = args.boolean("hapticFeedbackEnabled"), `onClick` = { args.emit("onClick") })
    else -> error("Invalid generated modifier arguments: " + args)
  }

// androidx.compose.foundation.focusGroup [receiver: androidx.compose.ui.Modifier]()
private fun apply13(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier7()

// androidx.compose.foundation.focusable [receiver: androidx.compose.ui.Modifier](enabled: kotlin.Boolean, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?)
private fun apply14(modifier: Modifier, args: ComposeModifierArguments): Modifier {
  val mask = (if (args.has("enabled")) 1 else 0)
  return when (mask) {
    0 -> modifier.composeModifier8()
    1 -> modifier.composeModifier8(`enabled` = args.boolean("enabled"))
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

// androidx.compose.foundation.horizontalScroll [receiver: androidx.compose.ui.Modifier](state: androidx.compose.foundation.ScrollState, enabled: kotlin.Boolean, flingBehavior: androidx.compose.foundation.gestures.FlingBehavior?, reverseScrolling: kotlin.Boolean)
private fun apply15(modifier: Modifier, args: ComposeModifierArguments): Modifier {
  val mask = (if (args.has("enabled")) 1 else 0) +
    (if (args.has("reverseScrolling")) 2 else 0)
  return when (mask) {
    0 -> modifier.composed { val scrollState = args.jsonObject("state").rememberComposeScrollState(); composeModifier9(`state` = scrollState) }
    1 -> modifier.composed { val scrollState = args.jsonObject("state").rememberComposeScrollState(); composeModifier9(`state` = scrollState, `enabled` = args.boolean("enabled")) }
    2 -> modifier.composed { val scrollState = args.jsonObject("state").rememberComposeScrollState(); composeModifier9(`state` = scrollState, `reverseScrolling` = args.boolean("reverseScrolling")) }
    3 -> modifier.composed { val scrollState = args.jsonObject("state").rememberComposeScrollState(); composeModifier9(`state` = scrollState, `enabled` = args.boolean("enabled"), `reverseScrolling` = args.boolean("reverseScrolling")) }
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

// androidx.compose.foundation.layout.BoxScope.align [receiver: androidx.compose.ui.Modifier](alignment: androidx.compose.ui.Alignment)
private fun apply16(modifier: Modifier, args: ComposeModifierArguments, scope: androidx.compose.foundation.layout.BoxScope): Modifier =
  with(scope) { modifier.align(`alignment` = toComposeAlignment(args.string("alignment"))) }

// androidx.compose.foundation.layout.BoxScope.matchParentSize [receiver: androidx.compose.ui.Modifier]()
private fun apply17(modifier: Modifier, args: ComposeModifierArguments, scope: androidx.compose.foundation.layout.BoxScope): Modifier =
  with(scope) { modifier.matchParentSize() }

// androidx.compose.foundation.layout.ColumnScope.align [receiver: androidx.compose.ui.Modifier](alignment: androidx.compose.ui.Alignment.Horizontal)
private fun apply18(modifier: Modifier, args: ComposeModifierArguments, scope: androidx.compose.foundation.layout.ColumnScope): Modifier =
  with(scope) { modifier.align(`alignment` = toComposeHorizontalAlignment(args.string("alignment"))) }

// androidx.compose.foundation.layout.ColumnScope.weight [receiver: androidx.compose.ui.Modifier](weight: kotlin.Float, fill: kotlin.Boolean)
private fun apply19(modifier: Modifier, args: ComposeModifierArguments, scope: androidx.compose.foundation.layout.ColumnScope): Modifier {
  val mask = (if (args.has("fill")) 1 else 0)
  return when (mask) {
    0 -> with(scope) { modifier.weight(`weight` = args.number("weight").toFloat()) }
    1 -> with(scope) { modifier.weight(`weight` = args.number("weight").toFloat(), `fill` = args.boolean("fill")) }
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

// androidx.compose.foundation.layout.FlowColumnScope.fillMaxColumnWidth [receiver: androidx.compose.ui.Modifier](fraction: kotlin.Float)
@OptIn(androidx.compose.foundation.layout.ExperimentalLayoutApi::class)
private fun apply20(modifier: Modifier, args: ComposeModifierArguments, scope: androidx.compose.foundation.layout.FlowColumnScope): Modifier {
  val mask = (if (args.has("fraction")) 1 else 0)
  return when (mask) {
    0 -> with(scope) { modifier.fillMaxColumnWidth() }
    1 -> with(scope) { modifier.fillMaxColumnWidth(`fraction` = args.number("fraction").toFloat()) }
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

// androidx.compose.foundation.layout.FlowRowScope.fillMaxRowHeight [receiver: androidx.compose.ui.Modifier](fraction: kotlin.Float)
@OptIn(androidx.compose.foundation.layout.ExperimentalLayoutApi::class)
private fun apply21(modifier: Modifier, args: ComposeModifierArguments, scope: androidx.compose.foundation.layout.FlowRowScope): Modifier {
  val mask = (if (args.has("fraction")) 1 else 0)
  return when (mask) {
    0 -> with(scope) { modifier.fillMaxRowHeight() }
    1 -> with(scope) { modifier.fillMaxRowHeight(`fraction` = args.number("fraction").toFloat()) }
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

// androidx.compose.foundation.layout.RowScope.align [receiver: androidx.compose.ui.Modifier](alignment: androidx.compose.ui.Alignment.Vertical)
private fun apply22(modifier: Modifier, args: ComposeModifierArguments, scope: androidx.compose.foundation.layout.RowScope): Modifier =
  with(scope) { modifier.align(`alignment` = toComposeVerticalAlignment(args.string("alignment"))) }

// androidx.compose.foundation.layout.RowScope.alignBy [receiver: androidx.compose.ui.Modifier](alignmentLine: androidx.compose.ui.layout.HorizontalAlignmentLine)
private fun apply23(modifier: Modifier, args: ComposeModifierArguments, scope: androidx.compose.foundation.layout.RowScope): Modifier =
  with(scope) { modifier.alignBy(`alignmentLine` = toComposeAlignmentLine(args.string("alignmentLine"))) }

// androidx.compose.foundation.layout.RowScope.alignByBaseline [receiver: androidx.compose.ui.Modifier]()
private fun apply24(modifier: Modifier, args: ComposeModifierArguments, scope: androidx.compose.foundation.layout.RowScope): Modifier =
  with(scope) { modifier.alignByBaseline() }

// androidx.compose.foundation.layout.RowScope.weight [receiver: androidx.compose.ui.Modifier](weight: kotlin.Float, fill: kotlin.Boolean)
private fun apply25(modifier: Modifier, args: ComposeModifierArguments, scope: androidx.compose.foundation.layout.RowScope): Modifier {
  val mask = (if (args.has("fill")) 1 else 0)
  return when (mask) {
    0 -> with(scope) { modifier.weight(`weight` = args.number("weight").toFloat()) }
    1 -> with(scope) { modifier.weight(`weight` = args.number("weight").toFloat(), `fill` = args.boolean("fill")) }
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

// androidx.compose.foundation.layout.absoluteOffset [receiver: androidx.compose.ui.Modifier](x: androidx.compose.ui.unit.Dp, y: androidx.compose.ui.unit.Dp)
private fun apply26(modifier: Modifier, args: ComposeModifierArguments): Modifier {
  val mask = (if (args.has("x")) 1 else 0) +
    (if (args.has("y")) 2 else 0)
  return when (mask) {
    0 -> modifier.composeModifier10()
    1 -> modifier.composeModifier10(`x` = args.number("x").dp)
    2 -> modifier.composeModifier10(`y` = args.number("y").dp)
    3 -> modifier.composeModifier10(`x` = args.number("x").dp, `y` = args.number("y").dp)
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

// androidx.compose.foundation.layout.absolutePadding [receiver: androidx.compose.ui.Modifier](left: androidx.compose.ui.unit.Dp, top: androidx.compose.ui.unit.Dp, right: androidx.compose.ui.unit.Dp, bottom: androidx.compose.ui.unit.Dp)
private fun apply27(modifier: Modifier, args: ComposeModifierArguments): Modifier {
  val mask = (if (args.has("left")) 1 else 0) +
    (if (args.has("top")) 2 else 0) +
    (if (args.has("right")) 4 else 0) +
    (if (args.has("bottom")) 8 else 0)
  return when (mask) {
    0 -> modifier.composeModifier11()
    1 -> modifier.composeModifier11(`left` = args.number("left").dp)
    2 -> modifier.composeModifier11(`top` = args.number("top").dp)
    3 -> modifier.composeModifier11(`left` = args.number("left").dp, `top` = args.number("top").dp)
    4 -> modifier.composeModifier11(`right` = args.number("right").dp)
    5 -> modifier.composeModifier11(`left` = args.number("left").dp, `right` = args.number("right").dp)
    6 -> modifier.composeModifier11(`top` = args.number("top").dp, `right` = args.number("right").dp)
    7 -> modifier.composeModifier11(`left` = args.number("left").dp, `top` = args.number("top").dp, `right` = args.number("right").dp)
    8 -> modifier.composeModifier11(`bottom` = args.number("bottom").dp)
    9 -> modifier.composeModifier11(`left` = args.number("left").dp, `bottom` = args.number("bottom").dp)
    10 -> modifier.composeModifier11(`top` = args.number("top").dp, `bottom` = args.number("bottom").dp)
    11 -> modifier.composeModifier11(`left` = args.number("left").dp, `top` = args.number("top").dp, `bottom` = args.number("bottom").dp)
    12 -> modifier.composeModifier11(`right` = args.number("right").dp, `bottom` = args.number("bottom").dp)
    13 -> modifier.composeModifier11(`left` = args.number("left").dp, `right` = args.number("right").dp, `bottom` = args.number("bottom").dp)
    14 -> modifier.composeModifier11(`top` = args.number("top").dp, `right` = args.number("right").dp, `bottom` = args.number("bottom").dp)
    15 -> modifier.composeModifier11(`left` = args.number("left").dp, `top` = args.number("top").dp, `right` = args.number("right").dp, `bottom` = args.number("bottom").dp)
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

// androidx.compose.foundation.layout.aspectRatio [receiver: androidx.compose.ui.Modifier](ratio: kotlin.Float, matchHeightConstraintsFirst: kotlin.Boolean)
private fun apply28(modifier: Modifier, args: ComposeModifierArguments): Modifier {
  val mask = (if (args.has("matchHeightConstraintsFirst")) 1 else 0)
  return when (mask) {
    0 -> modifier.composeModifier12(`ratio` = args.number("ratio").toFloat())
    1 -> modifier.composeModifier12(`ratio` = args.number("ratio").toFloat(), `matchHeightConstraintsFirst` = args.boolean("matchHeightConstraintsFirst"))
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

// androidx.compose.foundation.layout.captionBarPadding [receiver: androidx.compose.ui.Modifier]()
private fun apply29(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier13()

// androidx.compose.foundation.layout.consumeWindowInsets [receiver: androidx.compose.ui.Modifier](insets: androidx.compose.foundation.layout.WindowInsets)
private fun apply30(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier14(`insets` = args.jsonObject("insets").toWindowInsets())

// androidx.compose.foundation.layout.consumeWindowInsets [receiver: androidx.compose.ui.Modifier](paddingValues: androidx.compose.foundation.layout.PaddingValues)
private fun apply31(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier14(`paddingValues` = args.jsonObject("paddingValues").toPaddingValues())

// androidx.compose.foundation.layout.defaultMinSize [receiver: androidx.compose.ui.Modifier](minWidth: androidx.compose.ui.unit.Dp, minHeight: androidx.compose.ui.unit.Dp)
private fun apply32(modifier: Modifier, args: ComposeModifierArguments): Modifier {
  val mask = (if (args.has("minWidth")) 1 else 0) +
    (if (args.has("minHeight")) 2 else 0)
  return when (mask) {
    0 -> modifier.composeModifier15()
    1 -> modifier.composeModifier15(`minWidth` = args.number("minWidth").dp)
    2 -> modifier.composeModifier15(`minHeight` = args.number("minHeight").dp)
    3 -> modifier.composeModifier15(`minWidth` = args.number("minWidth").dp, `minHeight` = args.number("minHeight").dp)
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

// androidx.compose.foundation.layout.displayCutoutPadding [receiver: androidx.compose.ui.Modifier]()
private fun apply33(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier16()

// androidx.compose.foundation.layout.fillMaxHeight [receiver: androidx.compose.ui.Modifier](fraction: kotlin.Float)
private fun apply34(modifier: Modifier, args: ComposeModifierArguments): Modifier {
  val mask = (if (args.has("fraction")) 1 else 0)
  return when (mask) {
    0 -> modifier.composeModifier17()
    1 -> modifier.composeModifier17(`fraction` = args.number("fraction").toFloat())
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

// androidx.compose.foundation.layout.fillMaxSize [receiver: androidx.compose.ui.Modifier](fraction: kotlin.Float)
private fun apply35(modifier: Modifier, args: ComposeModifierArguments): Modifier {
  val mask = (if (args.has("fraction")) 1 else 0)
  return when (mask) {
    0 -> modifier.composeModifier18()
    1 -> modifier.composeModifier18(`fraction` = args.number("fraction").toFloat())
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

// androidx.compose.foundation.layout.fillMaxWidth [receiver: androidx.compose.ui.Modifier](fraction: kotlin.Float)
private fun apply36(modifier: Modifier, args: ComposeModifierArguments): Modifier {
  val mask = (if (args.has("fraction")) 1 else 0)
  return when (mask) {
    0 -> modifier.composeModifier19()
    1 -> modifier.composeModifier19(`fraction` = args.number("fraction").toFloat())
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

// androidx.compose.foundation.layout.height [receiver: androidx.compose.ui.Modifier](height: androidx.compose.ui.unit.Dp)
private fun apply37(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier20(`height` = args.number("height").dp)

// androidx.compose.foundation.layout.height [receiver: androidx.compose.ui.Modifier](intrinsicSize: androidx.compose.foundation.layout.IntrinsicSize)
private fun apply38(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier20(`intrinsicSize` = toComposeIntrinsicSize(args.string("intrinsicSize")))

// androidx.compose.foundation.layout.heightIn [receiver: androidx.compose.ui.Modifier](min: androidx.compose.ui.unit.Dp, max: androidx.compose.ui.unit.Dp)
private fun apply39(modifier: Modifier, args: ComposeModifierArguments): Modifier {
  val mask = (if (args.has("min")) 1 else 0) +
    (if (args.has("max")) 2 else 0)
  return when (mask) {
    0 -> modifier.composeModifier21()
    1 -> modifier.composeModifier21(`min` = args.number("min").dp)
    2 -> modifier.composeModifier21(`max` = args.number("max").dp)
    3 -> modifier.composeModifier21(`min` = args.number("min").dp, `max` = args.number("max").dp)
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

// androidx.compose.foundation.layout.imeNestedScroll [receiver: androidx.compose.ui.Modifier]()
@OptIn(androidx.compose.foundation.layout.ExperimentalLayoutApi::class)
private fun apply40(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier22()

// androidx.compose.foundation.layout.imePadding [receiver: androidx.compose.ui.Modifier]()
private fun apply41(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier23()

// androidx.compose.foundation.layout.mandatorySystemGesturesPadding [receiver: androidx.compose.ui.Modifier]()
private fun apply42(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier24()

// androidx.compose.foundation.layout.navigationBarsPadding [receiver: androidx.compose.ui.Modifier]()
private fun apply43(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier25()

// androidx.compose.foundation.layout.offset [receiver: androidx.compose.ui.Modifier](x: androidx.compose.ui.unit.Dp, y: androidx.compose.ui.unit.Dp)
private fun apply44(modifier: Modifier, args: ComposeModifierArguments): Modifier {
  val mask = (if (args.has("x")) 1 else 0) +
    (if (args.has("y")) 2 else 0)
  return when (mask) {
    0 -> modifier.composeModifier26()
    1 -> modifier.composeModifier26(`x` = args.number("x").dp)
    2 -> modifier.composeModifier26(`y` = args.number("y").dp)
    3 -> modifier.composeModifier26(`x` = args.number("x").dp, `y` = args.number("y").dp)
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

// androidx.compose.foundation.layout.padding [receiver: androidx.compose.ui.Modifier](all: androidx.compose.ui.unit.Dp)
private fun apply45(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier27(`all` = args.number("all").dp)

// androidx.compose.foundation.layout.padding [receiver: androidx.compose.ui.Modifier](horizontal: androidx.compose.ui.unit.Dp, vertical: androidx.compose.ui.unit.Dp)
private fun apply46(modifier: Modifier, args: ComposeModifierArguments): Modifier {
  val mask = (if (args.has("horizontal")) 1 else 0) +
    (if (args.has("vertical")) 2 else 0)
  return when (mask) {
    0 -> modifier.composeModifier27()
    1 -> modifier.composeModifier27(`horizontal` = args.number("horizontal").dp)
    2 -> modifier.composeModifier27(`vertical` = args.number("vertical").dp)
    3 -> modifier.composeModifier27(`horizontal` = args.number("horizontal").dp, `vertical` = args.number("vertical").dp)
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

// androidx.compose.foundation.layout.padding [receiver: androidx.compose.ui.Modifier](paddingValues: androidx.compose.foundation.layout.PaddingValues)
private fun apply47(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier27(`paddingValues` = args.jsonObject("paddingValues").toPaddingValues())

// androidx.compose.foundation.layout.padding [receiver: androidx.compose.ui.Modifier](start: androidx.compose.ui.unit.Dp, top: androidx.compose.ui.unit.Dp, end: androidx.compose.ui.unit.Dp, bottom: androidx.compose.ui.unit.Dp)
private fun apply48(modifier: Modifier, args: ComposeModifierArguments): Modifier {
  val mask = (if (args.has("start")) 1 else 0) +
    (if (args.has("top")) 2 else 0) +
    (if (args.has("end")) 4 else 0) +
    (if (args.has("bottom")) 8 else 0)
  return when (mask) {
    1 -> modifier.composeModifier27(`start` = args.number("start").dp)
    2 -> modifier.composeModifier27(`top` = args.number("top").dp)
    3 -> modifier.composeModifier27(`start` = args.number("start").dp, `top` = args.number("top").dp)
    4 -> modifier.composeModifier27(`end` = args.number("end").dp)
    5 -> modifier.composeModifier27(`start` = args.number("start").dp, `end` = args.number("end").dp)
    6 -> modifier.composeModifier27(`top` = args.number("top").dp, `end` = args.number("end").dp)
    7 -> modifier.composeModifier27(`start` = args.number("start").dp, `top` = args.number("top").dp, `end` = args.number("end").dp)
    8 -> modifier.composeModifier27(`bottom` = args.number("bottom").dp)
    9 -> modifier.composeModifier27(`start` = args.number("start").dp, `bottom` = args.number("bottom").dp)
    10 -> modifier.composeModifier27(`top` = args.number("top").dp, `bottom` = args.number("bottom").dp)
    11 -> modifier.composeModifier27(`start` = args.number("start").dp, `top` = args.number("top").dp, `bottom` = args.number("bottom").dp)
    12 -> modifier.composeModifier27(`end` = args.number("end").dp, `bottom` = args.number("bottom").dp)
    13 -> modifier.composeModifier27(`start` = args.number("start").dp, `end` = args.number("end").dp, `bottom` = args.number("bottom").dp)
    14 -> modifier.composeModifier27(`top` = args.number("top").dp, `end` = args.number("end").dp, `bottom` = args.number("bottom").dp)
    15 -> modifier.composeModifier27(`start` = args.number("start").dp, `top` = args.number("top").dp, `end` = args.number("end").dp, `bottom` = args.number("bottom").dp)
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

// androidx.compose.foundation.layout.paddingFrom [receiver: androidx.compose.ui.Modifier](alignmentLine: androidx.compose.ui.layout.AlignmentLine, before: androidx.compose.ui.unit.Dp, after: androidx.compose.ui.unit.Dp)
private fun apply49(modifier: Modifier, args: ComposeModifierArguments): Modifier {
  val mask = (if (args.has("before")) 1 else 0) +
    (if (args.has("after")) 2 else 0)
  return when (mask) {
    1 -> modifier.composeModifier28(`alignmentLine` = toComposeAlignmentLine(args.string("alignmentLine")), `before` = args.number("before").dp)
    2 -> modifier.composeModifier28(`alignmentLine` = toComposeAlignmentLine(args.string("alignmentLine")), `after` = args.number("after").dp)
    3 -> modifier.composeModifier28(`alignmentLine` = toComposeAlignmentLine(args.string("alignmentLine")), `before` = args.number("before").dp, `after` = args.number("after").dp)
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

// androidx.compose.foundation.layout.paddingFrom [receiver: androidx.compose.ui.Modifier](alignmentLine: androidx.compose.ui.layout.AlignmentLine, before: androidx.compose.ui.unit.TextUnit, after: androidx.compose.ui.unit.TextUnit)
private fun apply50(modifier: Modifier, args: ComposeModifierArguments): Modifier {
  val mask = (if (args.has("before")) 1 else 0) +
    (if (args.has("after")) 2 else 0)
  return when (mask) {
    1 -> modifier.composeModifier28(`alignmentLine` = toComposeAlignmentLine(args.string("alignmentLine")), `before` = args.number("before").sp)
    2 -> modifier.composeModifier28(`alignmentLine` = toComposeAlignmentLine(args.string("alignmentLine")), `after` = args.number("after").sp)
    3 -> modifier.composeModifier28(`alignmentLine` = toComposeAlignmentLine(args.string("alignmentLine")), `before` = args.number("before").sp, `after` = args.number("after").sp)
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

// androidx.compose.foundation.layout.paddingFromBaseline [receiver: androidx.compose.ui.Modifier](top: androidx.compose.ui.unit.Dp, bottom: androidx.compose.ui.unit.Dp)
private fun apply51(modifier: Modifier, args: ComposeModifierArguments): Modifier {
  val mask = (if (args.has("top")) 1 else 0) +
    (if (args.has("bottom")) 2 else 0)
  return when (mask) {
    1 -> modifier.composeModifier29(`top` = args.number("top").dp)
    2 -> modifier.composeModifier29(`bottom` = args.number("bottom").dp)
    3 -> modifier.composeModifier29(`top` = args.number("top").dp, `bottom` = args.number("bottom").dp)
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

// androidx.compose.foundation.layout.paddingFromBaseline [receiver: androidx.compose.ui.Modifier](top: androidx.compose.ui.unit.TextUnit, bottom: androidx.compose.ui.unit.TextUnit)
private fun apply52(modifier: Modifier, args: ComposeModifierArguments): Modifier {
  val mask = (if (args.has("top")) 1 else 0) +
    (if (args.has("bottom")) 2 else 0)
  return when (mask) {
    1 -> modifier.composeModifier29(`top` = args.number("top").sp)
    2 -> modifier.composeModifier29(`bottom` = args.number("bottom").sp)
    3 -> modifier.composeModifier29(`top` = args.number("top").sp, `bottom` = args.number("bottom").sp)
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

// androidx.compose.foundation.layout.recalculateWindowInsets [receiver: androidx.compose.ui.Modifier]()
private fun apply53(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier30()

// androidx.compose.foundation.layout.requiredHeight [receiver: androidx.compose.ui.Modifier](height: androidx.compose.ui.unit.Dp)
private fun apply54(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier31(`height` = args.number("height").dp)

// androidx.compose.foundation.layout.requiredHeight [receiver: androidx.compose.ui.Modifier](intrinsicSize: androidx.compose.foundation.layout.IntrinsicSize)
private fun apply55(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier31(`intrinsicSize` = toComposeIntrinsicSize(args.string("intrinsicSize")))

// androidx.compose.foundation.layout.requiredHeightIn [receiver: androidx.compose.ui.Modifier](min: androidx.compose.ui.unit.Dp, max: androidx.compose.ui.unit.Dp)
private fun apply56(modifier: Modifier, args: ComposeModifierArguments): Modifier {
  val mask = (if (args.has("min")) 1 else 0) +
    (if (args.has("max")) 2 else 0)
  return when (mask) {
    0 -> modifier.composeModifier32()
    1 -> modifier.composeModifier32(`min` = args.number("min").dp)
    2 -> modifier.composeModifier32(`max` = args.number("max").dp)
    3 -> modifier.composeModifier32(`min` = args.number("min").dp, `max` = args.number("max").dp)
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

// androidx.compose.foundation.layout.requiredSize [receiver: androidx.compose.ui.Modifier](size: androidx.compose.ui.unit.Dp)
private fun apply57(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier33(`size` = args.number("size").dp)

// androidx.compose.foundation.layout.requiredSize [receiver: androidx.compose.ui.Modifier](size: androidx.compose.ui.unit.DpSize)
private fun apply58(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier33(`size` = args.jsonObject("size").toDpSize())

// androidx.compose.foundation.layout.requiredSize [receiver: androidx.compose.ui.Modifier](width: androidx.compose.ui.unit.Dp, height: androidx.compose.ui.unit.Dp)
private fun apply59(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier33(`width` = args.number("width").dp, `height` = args.number("height").dp)

// androidx.compose.foundation.layout.requiredSizeIn [receiver: androidx.compose.ui.Modifier](minWidth: androidx.compose.ui.unit.Dp, minHeight: androidx.compose.ui.unit.Dp, maxWidth: androidx.compose.ui.unit.Dp, maxHeight: androidx.compose.ui.unit.Dp)
private fun apply60(modifier: Modifier, args: ComposeModifierArguments): Modifier {
  val mask = (if (args.has("minWidth")) 1 else 0) +
    (if (args.has("minHeight")) 2 else 0) +
    (if (args.has("maxWidth")) 4 else 0) +
    (if (args.has("maxHeight")) 8 else 0)
  return when (mask) {
    0 -> modifier.composeModifier34()
    1 -> modifier.composeModifier34(`minWidth` = args.number("minWidth").dp)
    2 -> modifier.composeModifier34(`minHeight` = args.number("minHeight").dp)
    3 -> modifier.composeModifier34(`minWidth` = args.number("minWidth").dp, `minHeight` = args.number("minHeight").dp)
    4 -> modifier.composeModifier34(`maxWidth` = args.number("maxWidth").dp)
    5 -> modifier.composeModifier34(`minWidth` = args.number("minWidth").dp, `maxWidth` = args.number("maxWidth").dp)
    6 -> modifier.composeModifier34(`minHeight` = args.number("minHeight").dp, `maxWidth` = args.number("maxWidth").dp)
    7 -> modifier.composeModifier34(`minWidth` = args.number("minWidth").dp, `minHeight` = args.number("minHeight").dp, `maxWidth` = args.number("maxWidth").dp)
    8 -> modifier.composeModifier34(`maxHeight` = args.number("maxHeight").dp)
    9 -> modifier.composeModifier34(`minWidth` = args.number("minWidth").dp, `maxHeight` = args.number("maxHeight").dp)
    10 -> modifier.composeModifier34(`minHeight` = args.number("minHeight").dp, `maxHeight` = args.number("maxHeight").dp)
    11 -> modifier.composeModifier34(`minWidth` = args.number("minWidth").dp, `minHeight` = args.number("minHeight").dp, `maxHeight` = args.number("maxHeight").dp)
    12 -> modifier.composeModifier34(`maxWidth` = args.number("maxWidth").dp, `maxHeight` = args.number("maxHeight").dp)
    13 -> modifier.composeModifier34(`minWidth` = args.number("minWidth").dp, `maxWidth` = args.number("maxWidth").dp, `maxHeight` = args.number("maxHeight").dp)
    14 -> modifier.composeModifier34(`minHeight` = args.number("minHeight").dp, `maxWidth` = args.number("maxWidth").dp, `maxHeight` = args.number("maxHeight").dp)
    15 -> modifier.composeModifier34(`minWidth` = args.number("minWidth").dp, `minHeight` = args.number("minHeight").dp, `maxWidth` = args.number("maxWidth").dp, `maxHeight` = args.number("maxHeight").dp)
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

// androidx.compose.foundation.layout.requiredWidth [receiver: androidx.compose.ui.Modifier](intrinsicSize: androidx.compose.foundation.layout.IntrinsicSize)
private fun apply61(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier35(`intrinsicSize` = toComposeIntrinsicSize(args.string("intrinsicSize")))

// androidx.compose.foundation.layout.requiredWidth [receiver: androidx.compose.ui.Modifier](width: androidx.compose.ui.unit.Dp)
private fun apply62(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier35(`width` = args.number("width").dp)

// androidx.compose.foundation.layout.requiredWidthIn [receiver: androidx.compose.ui.Modifier](min: androidx.compose.ui.unit.Dp, max: androidx.compose.ui.unit.Dp)
private fun apply63(modifier: Modifier, args: ComposeModifierArguments): Modifier {
  val mask = (if (args.has("min")) 1 else 0) +
    (if (args.has("max")) 2 else 0)
  return when (mask) {
    0 -> modifier.composeModifier36()
    1 -> modifier.composeModifier36(`min` = args.number("min").dp)
    2 -> modifier.composeModifier36(`max` = args.number("max").dp)
    3 -> modifier.composeModifier36(`min` = args.number("min").dp, `max` = args.number("max").dp)
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

// androidx.compose.foundation.layout.safeContentPadding [receiver: androidx.compose.ui.Modifier]()
private fun apply64(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier37()

// androidx.compose.foundation.layout.safeDrawingPadding [receiver: androidx.compose.ui.Modifier]()
private fun apply65(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier38()

// androidx.compose.foundation.layout.safeGesturesPadding [receiver: androidx.compose.ui.Modifier]()
private fun apply66(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier39()

// androidx.compose.foundation.layout.size [receiver: androidx.compose.ui.Modifier](size: androidx.compose.ui.unit.Dp)
private fun apply67(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier40(`size` = args.number("size").dp)

// androidx.compose.foundation.layout.size [receiver: androidx.compose.ui.Modifier](size: androidx.compose.ui.unit.DpSize)
private fun apply68(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier40(`size` = args.jsonObject("size").toDpSize())

// androidx.compose.foundation.layout.size [receiver: androidx.compose.ui.Modifier](width: androidx.compose.ui.unit.Dp, height: androidx.compose.ui.unit.Dp)
private fun apply69(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier40(`width` = args.number("width").dp, `height` = args.number("height").dp)

// androidx.compose.foundation.layout.sizeIn [receiver: androidx.compose.ui.Modifier](minWidth: androidx.compose.ui.unit.Dp, minHeight: androidx.compose.ui.unit.Dp, maxWidth: androidx.compose.ui.unit.Dp, maxHeight: androidx.compose.ui.unit.Dp)
private fun apply70(modifier: Modifier, args: ComposeModifierArguments): Modifier {
  val mask = (if (args.has("minWidth")) 1 else 0) +
    (if (args.has("minHeight")) 2 else 0) +
    (if (args.has("maxWidth")) 4 else 0) +
    (if (args.has("maxHeight")) 8 else 0)
  return when (mask) {
    0 -> modifier.composeModifier41()
    1 -> modifier.composeModifier41(`minWidth` = args.number("minWidth").dp)
    2 -> modifier.composeModifier41(`minHeight` = args.number("minHeight").dp)
    3 -> modifier.composeModifier41(`minWidth` = args.number("minWidth").dp, `minHeight` = args.number("minHeight").dp)
    4 -> modifier.composeModifier41(`maxWidth` = args.number("maxWidth").dp)
    5 -> modifier.composeModifier41(`minWidth` = args.number("minWidth").dp, `maxWidth` = args.number("maxWidth").dp)
    6 -> modifier.composeModifier41(`minHeight` = args.number("minHeight").dp, `maxWidth` = args.number("maxWidth").dp)
    7 -> modifier.composeModifier41(`minWidth` = args.number("minWidth").dp, `minHeight` = args.number("minHeight").dp, `maxWidth` = args.number("maxWidth").dp)
    8 -> modifier.composeModifier41(`maxHeight` = args.number("maxHeight").dp)
    9 -> modifier.composeModifier41(`minWidth` = args.number("minWidth").dp, `maxHeight` = args.number("maxHeight").dp)
    10 -> modifier.composeModifier41(`minHeight` = args.number("minHeight").dp, `maxHeight` = args.number("maxHeight").dp)
    11 -> modifier.composeModifier41(`minWidth` = args.number("minWidth").dp, `minHeight` = args.number("minHeight").dp, `maxHeight` = args.number("maxHeight").dp)
    12 -> modifier.composeModifier41(`maxWidth` = args.number("maxWidth").dp, `maxHeight` = args.number("maxHeight").dp)
    13 -> modifier.composeModifier41(`minWidth` = args.number("minWidth").dp, `maxWidth` = args.number("maxWidth").dp, `maxHeight` = args.number("maxHeight").dp)
    14 -> modifier.composeModifier41(`minHeight` = args.number("minHeight").dp, `maxWidth` = args.number("maxWidth").dp, `maxHeight` = args.number("maxHeight").dp)
    15 -> modifier.composeModifier41(`minWidth` = args.number("minWidth").dp, `minHeight` = args.number("minHeight").dp, `maxWidth` = args.number("maxWidth").dp, `maxHeight` = args.number("maxHeight").dp)
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

// androidx.compose.foundation.layout.statusBarsPadding [receiver: androidx.compose.ui.Modifier]()
private fun apply71(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier42()

// androidx.compose.foundation.layout.systemBarsPadding [receiver: androidx.compose.ui.Modifier]()
private fun apply72(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier43()

// androidx.compose.foundation.layout.systemGesturesPadding [receiver: androidx.compose.ui.Modifier]()
private fun apply73(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier44()

// androidx.compose.foundation.layout.waterfallPadding [receiver: androidx.compose.ui.Modifier]()
private fun apply74(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier45()

// androidx.compose.foundation.layout.width [receiver: androidx.compose.ui.Modifier](intrinsicSize: androidx.compose.foundation.layout.IntrinsicSize)
private fun apply75(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier46(`intrinsicSize` = toComposeIntrinsicSize(args.string("intrinsicSize")))

// androidx.compose.foundation.layout.width [receiver: androidx.compose.ui.Modifier](width: androidx.compose.ui.unit.Dp)
private fun apply76(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier46(`width` = args.number("width").dp)

// androidx.compose.foundation.layout.widthIn [receiver: androidx.compose.ui.Modifier](min: androidx.compose.ui.unit.Dp, max: androidx.compose.ui.unit.Dp)
private fun apply77(modifier: Modifier, args: ComposeModifierArguments): Modifier {
  val mask = (if (args.has("min")) 1 else 0) +
    (if (args.has("max")) 2 else 0)
  return when (mask) {
    0 -> modifier.composeModifier47()
    1 -> modifier.composeModifier47(`min` = args.number("min").dp)
    2 -> modifier.composeModifier47(`max` = args.number("max").dp)
    3 -> modifier.composeModifier47(`min` = args.number("min").dp, `max` = args.number("max").dp)
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

// androidx.compose.foundation.layout.windowInsetsBottomHeight [receiver: androidx.compose.ui.Modifier](insets: androidx.compose.foundation.layout.WindowInsets)
private fun apply78(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier48(`insets` = args.jsonObject("insets").toWindowInsets())

// androidx.compose.foundation.layout.windowInsetsEndWidth [receiver: androidx.compose.ui.Modifier](insets: androidx.compose.foundation.layout.WindowInsets)
private fun apply79(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier49(`insets` = args.jsonObject("insets").toWindowInsets())

// androidx.compose.foundation.layout.windowInsetsPadding [receiver: androidx.compose.ui.Modifier](insets: androidx.compose.foundation.layout.WindowInsets)
private fun apply80(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier50(`insets` = args.jsonObject("insets").toWindowInsets())

// androidx.compose.foundation.layout.windowInsetsStartWidth [receiver: androidx.compose.ui.Modifier](insets: androidx.compose.foundation.layout.WindowInsets)
private fun apply81(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier51(`insets` = args.jsonObject("insets").toWindowInsets())

// androidx.compose.foundation.layout.windowInsetsTopHeight [receiver: androidx.compose.ui.Modifier](insets: androidx.compose.foundation.layout.WindowInsets)
private fun apply82(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier52(`insets` = args.jsonObject("insets").toWindowInsets())

// androidx.compose.foundation.layout.wrapContentHeight [receiver: androidx.compose.ui.Modifier](align: androidx.compose.ui.Alignment.Vertical, unbounded: kotlin.Boolean)
private fun apply83(modifier: Modifier, args: ComposeModifierArguments): Modifier {
  val mask = (if (args.has("align")) 1 else 0) +
    (if (args.has("unbounded")) 2 else 0)
  return when (mask) {
    0 -> modifier.composeModifier53()
    1 -> modifier.composeModifier53(`align` = toComposeVerticalAlignment(args.string("align")))
    2 -> modifier.composeModifier53(`unbounded` = args.boolean("unbounded"))
    3 -> modifier.composeModifier53(`align` = toComposeVerticalAlignment(args.string("align")), `unbounded` = args.boolean("unbounded"))
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

// androidx.compose.foundation.layout.wrapContentSize [receiver: androidx.compose.ui.Modifier](align: androidx.compose.ui.Alignment, unbounded: kotlin.Boolean)
private fun apply84(modifier: Modifier, args: ComposeModifierArguments): Modifier {
  val mask = (if (args.has("align")) 1 else 0) +
    (if (args.has("unbounded")) 2 else 0)
  return when (mask) {
    0 -> modifier.composeModifier54()
    1 -> modifier.composeModifier54(`align` = toComposeAlignment(args.string("align")))
    2 -> modifier.composeModifier54(`unbounded` = args.boolean("unbounded"))
    3 -> modifier.composeModifier54(`align` = toComposeAlignment(args.string("align")), `unbounded` = args.boolean("unbounded"))
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

// androidx.compose.foundation.layout.wrapContentWidth [receiver: androidx.compose.ui.Modifier](align: androidx.compose.ui.Alignment.Horizontal, unbounded: kotlin.Boolean)
private fun apply85(modifier: Modifier, args: ComposeModifierArguments): Modifier {
  val mask = (if (args.has("align")) 1 else 0) +
    (if (args.has("unbounded")) 2 else 0)
  return when (mask) {
    0 -> modifier.composeModifier55()
    1 -> modifier.composeModifier55(`align` = toComposeHorizontalAlignment(args.string("align")))
    2 -> modifier.composeModifier55(`unbounded` = args.boolean("unbounded"))
    3 -> modifier.composeModifier55(`align` = toComposeHorizontalAlignment(args.string("align")), `unbounded` = args.boolean("unbounded"))
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

// androidx.compose.foundation.lazy.LazyItemScope.animateItem [receiver: androidx.compose.ui.Modifier](fadeInSpec: androidx.compose.animation.core.FiniteAnimationSpec<kotlin.Float>?, placementSpec: androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntOffset>?, fadeOutSpec: androidx.compose.animation.core.FiniteAnimationSpec<kotlin.Float>?)
private fun apply86(modifier: Modifier, args: ComposeModifierArguments, scope: androidx.compose.foundation.lazy.LazyItemScope): Modifier =
  with(scope) { modifier.animateItem() }

// androidx.compose.foundation.lazy.LazyItemScope.fillParentMaxHeight [receiver: androidx.compose.ui.Modifier](fraction: kotlin.Float)
private fun apply87(modifier: Modifier, args: ComposeModifierArguments, scope: androidx.compose.foundation.lazy.LazyItemScope): Modifier {
  val mask = (if (args.has("fraction")) 1 else 0)
  return when (mask) {
    0 -> with(scope) { modifier.fillParentMaxHeight() }
    1 -> with(scope) { modifier.fillParentMaxHeight(`fraction` = args.number("fraction").toFloat()) }
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

// androidx.compose.foundation.lazy.LazyItemScope.fillParentMaxSize [receiver: androidx.compose.ui.Modifier](fraction: kotlin.Float)
private fun apply88(modifier: Modifier, args: ComposeModifierArguments, scope: androidx.compose.foundation.lazy.LazyItemScope): Modifier {
  val mask = (if (args.has("fraction")) 1 else 0)
  return when (mask) {
    0 -> with(scope) { modifier.fillParentMaxSize() }
    1 -> with(scope) { modifier.fillParentMaxSize(`fraction` = args.number("fraction").toFloat()) }
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

// androidx.compose.foundation.lazy.LazyItemScope.fillParentMaxWidth [receiver: androidx.compose.ui.Modifier](fraction: kotlin.Float)
private fun apply89(modifier: Modifier, args: ComposeModifierArguments, scope: androidx.compose.foundation.lazy.LazyItemScope): Modifier {
  val mask = (if (args.has("fraction")) 1 else 0)
  return when (mask) {
    0 -> with(scope) { modifier.fillParentMaxWidth() }
    1 -> with(scope) { modifier.fillParentMaxWidth(`fraction` = args.number("fraction").toFloat()) }
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

// androidx.compose.foundation.lazy.grid.LazyGridItemScope.animateItem [receiver: androidx.compose.ui.Modifier](fadeInSpec: androidx.compose.animation.core.FiniteAnimationSpec<kotlin.Float>?, placementSpec: androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntOffset>?, fadeOutSpec: androidx.compose.animation.core.FiniteAnimationSpec<kotlin.Float>?)
private fun apply90(modifier: Modifier, args: ComposeModifierArguments, scope: androidx.compose.foundation.lazy.grid.LazyGridItemScope): Modifier =
  with(scope) { modifier.animateItem() }

// androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemScope.animateItem [receiver: androidx.compose.ui.Modifier](fadeInSpec: androidx.compose.animation.core.FiniteAnimationSpec<kotlin.Float>?, placementSpec: androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntOffset>?, fadeOutSpec: androidx.compose.animation.core.FiniteAnimationSpec<kotlin.Float>?)
private fun apply91(modifier: Modifier, args: ComposeModifierArguments, scope: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemScope): Modifier =
  with(scope) { modifier.animateItem() }

// androidx.compose.foundation.onFocusedBoundsChanged [receiver: androidx.compose.ui.Modifier](onPositioned: kotlin.Function1<androidx.compose.ui.layout.LayoutCoordinates?, kotlin.Unit>)
private fun apply92(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier56(`onPositioned` = { value: androidx.compose.ui.layout.LayoutCoordinates? -> args.emit("onPositioned", value?.toComposeSnapshot() ?: org.json.JSONObject.NULL) })

// androidx.compose.foundation.preferKeepClear [receiver: androidx.compose.ui.Modifier]()
private fun apply93(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier57()

// androidx.compose.foundation.progressSemantics [receiver: androidx.compose.ui.Modifier]()
private fun apply94(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier58()

// androidx.compose.foundation.progressSemantics [receiver: androidx.compose.ui.Modifier](value: kotlin.Float, valueRange: kotlin.ranges.ClosedFloatingPointRange<kotlin.Float>, steps: kotlin.Int)
private fun apply95(modifier: Modifier, args: ComposeModifierArguments): Modifier {
  val mask = (if (args.has("valueRange")) 1 else 0) +
    (if (args.has("steps")) 2 else 0)
  return when (mask) {
    0 -> modifier.composeModifier58(`value` = args.number("value").toFloat())
    1 -> modifier.composeModifier58(`value` = args.number("value").toFloat(), `valueRange` = args.floatRange("valueRange"))
    2 -> modifier.composeModifier58(`value` = args.number("value").toFloat(), `steps` = args.number("steps").toInt())
    3 -> modifier.composeModifier58(`value` = args.number("value").toFloat(), `valueRange` = args.floatRange("valueRange"), `steps` = args.number("steps").toInt())
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

// androidx.compose.foundation.selection.selectable [receiver: androidx.compose.ui.Modifier](selected: kotlin.Boolean, enabled: kotlin.Boolean, role: androidx.compose.ui.semantics.Role?, onClick: kotlin.Function0<kotlin.Unit>)
private fun apply96(modifier: Modifier, args: ComposeModifierArguments): Modifier {
  val mask = (if (args.has("enabled")) 1 else 0) +
    (if (args.has("role")) 2 else 0)
  return when (mask) {
    0 -> modifier.composeModifier59(`selected` = args.boolean("selected"), `onClick` = { args.emit("onClick") })
    1 -> modifier.composeModifier59(`selected` = args.boolean("selected"), `enabled` = args.boolean("enabled"), `onClick` = { args.emit("onClick") })
    2 -> modifier.composeModifier59(`selected` = args.boolean("selected"), `role` = if (args.isNull("role")) null else (toComposeRole(args.string("role"))), `onClick` = { args.emit("onClick") })
    3 -> modifier.composeModifier59(`selected` = args.boolean("selected"), `enabled` = args.boolean("enabled"), `role` = if (args.isNull("role")) null else (toComposeRole(args.string("role"))), `onClick` = { args.emit("onClick") })
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

// androidx.compose.foundation.selection.selectableGroup [receiver: androidx.compose.ui.Modifier]()
private fun apply97(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier60()

// androidx.compose.foundation.selection.toggleable [receiver: androidx.compose.ui.Modifier](value: kotlin.Boolean, enabled: kotlin.Boolean, role: androidx.compose.ui.semantics.Role?, onValueChange: kotlin.Function1<kotlin.Boolean, kotlin.Unit>)
private fun apply98(modifier: Modifier, args: ComposeModifierArguments): Modifier {
  val mask = (if (args.has("enabled")) 1 else 0) +
    (if (args.has("role")) 2 else 0)
  return when (mask) {
    0 -> modifier.composeModifier61(`value` = args.boolean("value"), `onValueChange` = { value: Boolean -> args.emit("onValueChange", value) })
    1 -> modifier.composeModifier61(`value` = args.boolean("value"), `enabled` = args.boolean("enabled"), `onValueChange` = { value: Boolean -> args.emit("onValueChange", value) })
    2 -> modifier.composeModifier61(`value` = args.boolean("value"), `role` = if (args.isNull("role")) null else (toComposeRole(args.string("role"))), `onValueChange` = { value: Boolean -> args.emit("onValueChange", value) })
    3 -> modifier.composeModifier61(`value` = args.boolean("value"), `enabled` = args.boolean("enabled"), `role` = if (args.isNull("role")) null else (toComposeRole(args.string("role"))), `onValueChange` = { value: Boolean -> args.emit("onValueChange", value) })
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

// androidx.compose.foundation.selection.triStateToggleable [receiver: androidx.compose.ui.Modifier](state: androidx.compose.ui.state.ToggleableState, enabled: kotlin.Boolean, role: androidx.compose.ui.semantics.Role?, onClick: kotlin.Function0<kotlin.Unit>)
private fun apply99(modifier: Modifier, args: ComposeModifierArguments): Modifier {
  val mask = (if (args.has("enabled")) 1 else 0) +
    (if (args.has("role")) 2 else 0)
  return when (mask) {
    0 -> modifier.composeModifier62(`state` = toComposeToggleableState(args.string("state")), `onClick` = { args.emit("onClick") })
    1 -> modifier.composeModifier62(`state` = toComposeToggleableState(args.string("state")), `enabled` = args.boolean("enabled"), `onClick` = { args.emit("onClick") })
    2 -> modifier.composeModifier62(`state` = toComposeToggleableState(args.string("state")), `role` = if (args.isNull("role")) null else (toComposeRole(args.string("role"))), `onClick` = { args.emit("onClick") })
    3 -> modifier.composeModifier62(`state` = toComposeToggleableState(args.string("state")), `enabled` = args.boolean("enabled"), `role` = if (args.isNull("role")) null else (toComposeRole(args.string("role"))), `onClick` = { args.emit("onClick") })
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

// androidx.compose.foundation.systemGestureExclusion [receiver: androidx.compose.ui.Modifier]()
private fun apply100(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier63()

// androidx.compose.foundation.text.handwriting.handwritingDetector [receiver: androidx.compose.ui.Modifier](callback: kotlin.Function0<kotlin.Unit>)
private fun apply101(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier64(`callback` = { args.emit("callback") })

// androidx.compose.foundation.text.handwriting.handwritingHandler [receiver: androidx.compose.ui.Modifier]()
private fun apply102(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier65()

// androidx.compose.foundation.verticalScroll [receiver: androidx.compose.ui.Modifier](state: androidx.compose.foundation.ScrollState, enabled: kotlin.Boolean, flingBehavior: androidx.compose.foundation.gestures.FlingBehavior?, reverseScrolling: kotlin.Boolean)
private fun apply103(modifier: Modifier, args: ComposeModifierArguments): Modifier {
  val mask = (if (args.has("enabled")) 1 else 0) +
    (if (args.has("reverseScrolling")) 2 else 0)
  return when (mask) {
    0 -> modifier.composed { val scrollState = args.jsonObject("state").rememberComposeScrollState(); composeModifier66(`state` = scrollState) }
    1 -> modifier.composed { val scrollState = args.jsonObject("state").rememberComposeScrollState(); composeModifier66(`state` = scrollState, `enabled` = args.boolean("enabled")) }
    2 -> modifier.composed { val scrollState = args.jsonObject("state").rememberComposeScrollState(); composeModifier66(`state` = scrollState, `reverseScrolling` = args.boolean("reverseScrolling")) }
    3 -> modifier.composed { val scrollState = args.jsonObject("state").rememberComposeScrollState(); composeModifier66(`state` = scrollState, `enabled` = args.boolean("enabled"), `reverseScrolling` = args.boolean("reverseScrolling")) }
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

// androidx.compose.material3.ExposedDropdownMenuBoxScope.exposedDropdownSize [receiver: androidx.compose.ui.Modifier](matchAnchorWidth: kotlin.Boolean)
@OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
private fun apply104(modifier: Modifier, args: ComposeModifierArguments, scope: androidx.compose.material3.ExposedDropdownMenuBoxScope): Modifier {
  val mask = (if (args.has("matchAnchorWidth")) 1 else 0)
  return when (mask) {
    0 -> with(scope) { modifier.exposedDropdownSize() }
    1 -> with(scope) { modifier.exposedDropdownSize(`matchAnchorWidth` = args.boolean("matchAnchorWidth")) }
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

// androidx.compose.material3.animateFloatingActionButton [receiver: androidx.compose.ui.Modifier](visible: kotlin.Boolean, alignment: androidx.compose.ui.Alignment, targetScale: kotlin.Float, scaleAnimationSpec: androidx.compose.animation.core.AnimationSpec<kotlin.Float>?, alphaAnimationSpec: androidx.compose.animation.core.AnimationSpec<kotlin.Float>?)
@OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
private fun apply105(modifier: Modifier, args: ComposeModifierArguments): Modifier {
  val mask = (if (args.has("targetScale")) 1 else 0)
  return when (mask) {
    0 -> modifier.composeModifier67(`visible` = args.boolean("visible"), `alignment` = toComposeAlignment(args.string("alignment")))
    1 -> modifier.composeModifier67(`visible` = args.boolean("visible"), `alignment` = toComposeAlignment(args.string("alignment")), `targetScale` = args.number("targetScale").toFloat())
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

// androidx.compose.material3.minimumInteractiveComponentSize [receiver: androidx.compose.ui.Modifier]()
private fun apply106(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier68()

// androidx.compose.ui.draw.alpha [receiver: androidx.compose.ui.Modifier](alpha: kotlin.Float)
private fun apply107(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier69(`alpha` = args.number("alpha").toFloat())

// androidx.compose.ui.draw.blur [receiver: androidx.compose.ui.Modifier](radius: androidx.compose.ui.unit.Dp, edgeTreatment: androidx.compose.ui.draw.BlurredEdgeTreatment)
private fun apply108(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier70(`radius` = args.number("radius").dp)

// androidx.compose.ui.draw.blur [receiver: androidx.compose.ui.Modifier](radiusX: androidx.compose.ui.unit.Dp, radiusY: androidx.compose.ui.unit.Dp, edgeTreatment: androidx.compose.ui.draw.BlurredEdgeTreatment)
private fun apply109(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier70(`radiusX` = args.number("radiusX").dp, `radiusY` = args.number("radiusY").dp)

// androidx.compose.ui.draw.clip [receiver: androidx.compose.ui.Modifier](shape: androidx.compose.ui.graphics.Shape)
private fun apply110(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier71(`shape` = args.shape("shape"))

// androidx.compose.ui.draw.clipToBounds [receiver: androidx.compose.ui.Modifier]()
private fun apply111(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier72()

// androidx.compose.ui.draw.paint [receiver: androidx.compose.ui.Modifier](painter: androidx.compose.ui.graphics.painter.Painter, sizeToIntrinsics: kotlin.Boolean, alignment: androidx.compose.ui.Alignment, contentScale: androidx.compose.ui.layout.ContentScale, alpha: kotlin.Float, colorFilter: androidx.compose.ui.graphics.ColorFilter?)
private fun apply112(modifier: Modifier, args: ComposeModifierArguments): Modifier {
  val mask = (if (args.has("sizeToIntrinsics")) 1 else 0) +
    (if (args.has("alignment")) 2 else 0) +
    (if (args.has("contentScale")) 4 else 0) +
    (if (args.has("alpha")) 8 else 0)
  return when (mask) {
    0 -> modifier.composed { val painter = args.jsonObject("painter").rememberComposePainter(); composeModifier73(`painter` = painter) }
    1 -> modifier.composed { val painter = args.jsonObject("painter").rememberComposePainter(); composeModifier73(`painter` = painter, `sizeToIntrinsics` = args.boolean("sizeToIntrinsics")) }
    2 -> modifier.composed { val painter = args.jsonObject("painter").rememberComposePainter(); composeModifier73(`painter` = painter, `alignment` = toComposeAlignment(args.string("alignment"))) }
    3 -> modifier.composed { val painter = args.jsonObject("painter").rememberComposePainter(); composeModifier73(`painter` = painter, `sizeToIntrinsics` = args.boolean("sizeToIntrinsics"), `alignment` = toComposeAlignment(args.string("alignment"))) }
    4 -> modifier.composed { val painter = args.jsonObject("painter").rememberComposePainter(); composeModifier73(`painter` = painter, `contentScale` = toComposeContentScale(args.string("contentScale"))) }
    5 -> modifier.composed { val painter = args.jsonObject("painter").rememberComposePainter(); composeModifier73(`painter` = painter, `sizeToIntrinsics` = args.boolean("sizeToIntrinsics"), `contentScale` = toComposeContentScale(args.string("contentScale"))) }
    6 -> modifier.composed { val painter = args.jsonObject("painter").rememberComposePainter(); composeModifier73(`painter` = painter, `alignment` = toComposeAlignment(args.string("alignment")), `contentScale` = toComposeContentScale(args.string("contentScale"))) }
    7 -> modifier.composed { val painter = args.jsonObject("painter").rememberComposePainter(); composeModifier73(`painter` = painter, `sizeToIntrinsics` = args.boolean("sizeToIntrinsics"), `alignment` = toComposeAlignment(args.string("alignment")), `contentScale` = toComposeContentScale(args.string("contentScale"))) }
    8 -> modifier.composed { val painter = args.jsonObject("painter").rememberComposePainter(); composeModifier73(`painter` = painter, `alpha` = args.number("alpha").toFloat()) }
    9 -> modifier.composed { val painter = args.jsonObject("painter").rememberComposePainter(); composeModifier73(`painter` = painter, `sizeToIntrinsics` = args.boolean("sizeToIntrinsics"), `alpha` = args.number("alpha").toFloat()) }
    10 -> modifier.composed { val painter = args.jsonObject("painter").rememberComposePainter(); composeModifier73(`painter` = painter, `alignment` = toComposeAlignment(args.string("alignment")), `alpha` = args.number("alpha").toFloat()) }
    11 -> modifier.composed { val painter = args.jsonObject("painter").rememberComposePainter(); composeModifier73(`painter` = painter, `sizeToIntrinsics` = args.boolean("sizeToIntrinsics"), `alignment` = toComposeAlignment(args.string("alignment")), `alpha` = args.number("alpha").toFloat()) }
    12 -> modifier.composed { val painter = args.jsonObject("painter").rememberComposePainter(); composeModifier73(`painter` = painter, `contentScale` = toComposeContentScale(args.string("contentScale")), `alpha` = args.number("alpha").toFloat()) }
    13 -> modifier.composed { val painter = args.jsonObject("painter").rememberComposePainter(); composeModifier73(`painter` = painter, `sizeToIntrinsics` = args.boolean("sizeToIntrinsics"), `contentScale` = toComposeContentScale(args.string("contentScale")), `alpha` = args.number("alpha").toFloat()) }
    14 -> modifier.composed { val painter = args.jsonObject("painter").rememberComposePainter(); composeModifier73(`painter` = painter, `alignment` = toComposeAlignment(args.string("alignment")), `contentScale` = toComposeContentScale(args.string("contentScale")), `alpha` = args.number("alpha").toFloat()) }
    15 -> modifier.composed { val painter = args.jsonObject("painter").rememberComposePainter(); composeModifier73(`painter` = painter, `sizeToIntrinsics` = args.boolean("sizeToIntrinsics"), `alignment` = toComposeAlignment(args.string("alignment")), `contentScale` = toComposeContentScale(args.string("contentScale")), `alpha` = args.number("alpha").toFloat()) }
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

// androidx.compose.ui.draw.rotate [receiver: androidx.compose.ui.Modifier](degrees: kotlin.Float)
private fun apply113(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier74(`degrees` = args.number("degrees").toFloat())

// androidx.compose.ui.draw.scale [receiver: androidx.compose.ui.Modifier](scale: kotlin.Float)
private fun apply114(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier75(`scale` = args.number("scale").toFloat())

// androidx.compose.ui.draw.scale [receiver: androidx.compose.ui.Modifier](scaleX: kotlin.Float, scaleY: kotlin.Float)
private fun apply115(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier75(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat())

// androidx.compose.ui.draw.shadow [receiver: androidx.compose.ui.Modifier](elevation: androidx.compose.ui.unit.Dp, shape: androidx.compose.ui.graphics.Shape, clip: kotlin.Boolean, ambientColor: androidx.compose.ui.graphics.Color, spotColor: androidx.compose.ui.graphics.Color)
private fun apply116(modifier: Modifier, args: ComposeModifierArguments): Modifier {
  val mask = (if (args.has("shape")) 1 else 0) +
    (if (args.has("clip")) 2 else 0) +
    (if (args.has("ambientColor")) 4 else 0) +
    (if (args.has("spotColor")) 8 else 0)
  return when (mask) {
    0 -> modifier.composeModifier76(`elevation` = args.number("elevation").dp)
    1 -> modifier.composeModifier76(`elevation` = args.number("elevation").dp, `shape` = args.shape("shape"))
    2 -> modifier.composeModifier76(`elevation` = args.number("elevation").dp, `clip` = args.boolean("clip"))
    3 -> modifier.composeModifier76(`elevation` = args.number("elevation").dp, `shape` = args.shape("shape"), `clip` = args.boolean("clip"))
    4 -> modifier.composeModifier76(`elevation` = args.number("elevation").dp, `ambientColor` = args.color("ambientColor"))
    5 -> modifier.composeModifier76(`elevation` = args.number("elevation").dp, `shape` = args.shape("shape"), `ambientColor` = args.color("ambientColor"))
    6 -> modifier.composeModifier76(`elevation` = args.number("elevation").dp, `clip` = args.boolean("clip"), `ambientColor` = args.color("ambientColor"))
    7 -> modifier.composeModifier76(`elevation` = args.number("elevation").dp, `shape` = args.shape("shape"), `clip` = args.boolean("clip"), `ambientColor` = args.color("ambientColor"))
    8 -> modifier.composeModifier76(`elevation` = args.number("elevation").dp, `spotColor` = args.color("spotColor"))
    9 -> modifier.composeModifier76(`elevation` = args.number("elevation").dp, `shape` = args.shape("shape"), `spotColor` = args.color("spotColor"))
    10 -> modifier.composeModifier76(`elevation` = args.number("elevation").dp, `clip` = args.boolean("clip"), `spotColor` = args.color("spotColor"))
    11 -> modifier.composeModifier76(`elevation` = args.number("elevation").dp, `shape` = args.shape("shape"), `clip` = args.boolean("clip"), `spotColor` = args.color("spotColor"))
    12 -> modifier.composeModifier76(`elevation` = args.number("elevation").dp, `ambientColor` = args.color("ambientColor"), `spotColor` = args.color("spotColor"))
    13 -> modifier.composeModifier76(`elevation` = args.number("elevation").dp, `shape` = args.shape("shape"), `ambientColor` = args.color("ambientColor"), `spotColor` = args.color("spotColor"))
    14 -> modifier.composeModifier76(`elevation` = args.number("elevation").dp, `clip` = args.boolean("clip"), `ambientColor` = args.color("ambientColor"), `spotColor` = args.color("spotColor"))
    15 -> modifier.composeModifier76(`elevation` = args.number("elevation").dp, `shape` = args.shape("shape"), `clip` = args.boolean("clip"), `ambientColor` = args.color("ambientColor"), `spotColor` = args.color("spotColor"))
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

// androidx.compose.ui.focus.focusProperties [receiver: androidx.compose.ui.Modifier](scope: kotlin.Function1<androidx.compose.ui.focus.FocusProperties, kotlin.Unit>)
private fun apply117(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier77(`scope` = args.jsonObject("scope").toFocusProperties())

// androidx.compose.ui.focus.focusRestorer [receiver: androidx.compose.ui.Modifier](fallback: androidx.compose.ui.focus.FocusRequester)
private fun apply118(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier78()

// androidx.compose.ui.focus.focusTarget [receiver: androidx.compose.ui.Modifier]()
private fun apply119(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier79()

// androidx.compose.ui.focus.onFocusChanged [receiver: androidx.compose.ui.Modifier](onFocusChanged: kotlin.Function1<androidx.compose.ui.focus.FocusState, kotlin.Unit>)
private fun apply120(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier80(`onFocusChanged` = { value: androidx.compose.ui.focus.FocusState -> args.emit("onFocusChanged", value.toComposeSnapshot()) })

// androidx.compose.ui.focus.onFocusEvent [receiver: androidx.compose.ui.Modifier](onFocusEvent: kotlin.Function1<androidx.compose.ui.focus.FocusState, kotlin.Unit>)
private fun apply121(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier81(`onFocusEvent` = { value: androidx.compose.ui.focus.FocusState -> args.emit("onFocusEvent", value.toComposeSnapshot()) })

// androidx.compose.ui.graphics.graphicsLayer [receiver: androidx.compose.ui.Modifier](scaleX: kotlin.Float, scaleY: kotlin.Float, alpha: kotlin.Float, translationX: kotlin.Float, translationY: kotlin.Float, shadowElevation: kotlin.Float, rotationX: kotlin.Float, rotationY: kotlin.Float, rotationZ: kotlin.Float, cameraDistance: kotlin.Float, transformOrigin: androidx.compose.ui.graphics.TransformOrigin, shape: androidx.compose.ui.graphics.Shape, clip: kotlin.Boolean, renderEffect: androidx.compose.ui.graphics.RenderEffect?, ambientShadowColor: androidx.compose.ui.graphics.Color, spotShadowColor: androidx.compose.ui.graphics.Color, compositingStrategy: androidx.compose.ui.graphics.CompositingStrategy)
private fun apply122(modifier: Modifier, args: ComposeModifierArguments): Modifier {
  val mask = (if (args.has("scaleX")) 1 else 0) +
    (if (args.has("scaleY")) 2 else 0) +
    (if (args.has("alpha")) 4 else 0) +
    (if (args.has("translationX")) 8 else 0) +
    (if (args.has("translationY")) 16 else 0) +
    (if (args.has("shadowElevation")) 32 else 0) +
    (if (args.has("rotationX")) 64 else 0) +
    (if (args.has("rotationY")) 128 else 0) +
    (if (args.has("rotationZ")) 256 else 0) +
    (if (args.has("cameraDistance")) 512 else 0) +
    (if (args.has("shape")) 1024 else 0) +
    (if (args.has("clip")) 2048 else 0) +
    (if (args.has("ambientShadowColor")) 4096 else 0) +
    (if (args.has("spotShadowColor")) 8192 else 0)
  return when (mask / 32) {
    0 -> apply122Group0(modifier, args, mask)
    1 -> apply122Group1(modifier, args, mask)
    2 -> apply122Group2(modifier, args, mask)
    3 -> apply122Group3(modifier, args, mask)
    4 -> apply122Group4(modifier, args, mask)
    5 -> apply122Group5(modifier, args, mask)
    6 -> apply122Group6(modifier, args, mask)
    7 -> apply122Group7(modifier, args, mask)
    8 -> apply122Group8(modifier, args, mask)
    9 -> apply122Group9(modifier, args, mask)
    10 -> apply122Group10(modifier, args, mask)
    11 -> apply122Group11(modifier, args, mask)
    16 -> apply122Group16(modifier, args, mask)
    17 -> apply122Group17(modifier, args, mask)
    18 -> apply122Group18(modifier, args, mask)
    19 -> apply122Group19(modifier, args, mask)
    32 -> apply122Group32(modifier, args, mask)
    33 -> apply122Group33(modifier, args, mask)
    34 -> apply122Group34(modifier, args, mask)
    35 -> apply122Group35(modifier, args, mask)
    64 -> apply122Group64(modifier, args, mask)
    65 -> apply122Group65(modifier, args, mask)
    66 -> apply122Group66(modifier, args, mask)
    67 -> apply122Group67(modifier, args, mask)
    128 -> apply122Group128(modifier, args, mask)
    129 -> apply122Group129(modifier, args, mask)
    130 -> apply122Group130(modifier, args, mask)
    131 -> apply122Group131(modifier, args, mask)
    256 -> apply122Group256(modifier, args, mask)
    257 -> apply122Group257(modifier, args, mask)
    258 -> apply122Group258(modifier, args, mask)
    259 -> apply122Group259(modifier, args, mask)
    511 -> apply122Group511(modifier, args, mask)
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

private fun apply122Group0(modifier: Modifier, args: ComposeModifierArguments, mask: Int): Modifier = when (mask) {
    0 -> modifier.composeModifier82()
    1 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat())
    2 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat())
    3 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat())
    4 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat())
    5 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat())
    6 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat())
    7 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat())
    8 -> modifier.composeModifier82(`translationX` = args.number("translationX").toFloat())
    9 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationX` = args.number("translationX").toFloat())
    10 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat())
    11 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat())
    12 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat())
    13 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat())
    14 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat())
    15 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat())
    16 -> modifier.composeModifier82(`translationY` = args.number("translationY").toFloat())
    17 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationY` = args.number("translationY").toFloat())
    18 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationY` = args.number("translationY").toFloat())
    19 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationY` = args.number("translationY").toFloat())
    20 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat())
    21 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat())
    22 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat())
    23 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat())
    24 -> modifier.composeModifier82(`translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat())
    25 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat())
    26 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat())
    27 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat())
    28 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat())
    29 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat())
    30 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat())
    31 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat())
    else -> error("Invalid generated modifier arguments: " + args)
  }

private fun apply122Group1(modifier: Modifier, args: ComposeModifierArguments, mask: Int): Modifier = when (mask) {
    32 -> modifier.composeModifier82(`shadowElevation` = args.number("shadowElevation").toFloat())
    33 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat())
    34 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat())
    35 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat())
    36 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat())
    37 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat())
    38 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat())
    39 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat())
    40 -> modifier.composeModifier82(`translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat())
    41 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat())
    42 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat())
    43 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat())
    44 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat())
    45 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat())
    46 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat())
    47 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat())
    48 -> modifier.composeModifier82(`translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat())
    49 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat())
    50 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat())
    51 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat())
    52 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat())
    53 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat())
    54 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat())
    55 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat())
    56 -> modifier.composeModifier82(`translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat())
    57 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat())
    58 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat())
    59 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat())
    60 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat())
    61 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat())
    62 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat())
    63 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat())
    else -> error("Invalid generated modifier arguments: " + args)
  }

private fun apply122Group2(modifier: Modifier, args: ComposeModifierArguments, mask: Int): Modifier = when (mask) {
    64 -> modifier.composeModifier82(`rotationX` = args.number("rotationX").toFloat())
    65 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `rotationX` = args.number("rotationX").toFloat())
    66 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `rotationX` = args.number("rotationX").toFloat())
    67 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `rotationX` = args.number("rotationX").toFloat())
    68 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `rotationX` = args.number("rotationX").toFloat())
    69 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `rotationX` = args.number("rotationX").toFloat())
    70 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `rotationX` = args.number("rotationX").toFloat())
    71 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `rotationX` = args.number("rotationX").toFloat())
    72 -> modifier.composeModifier82(`translationX` = args.number("translationX").toFloat(), `rotationX` = args.number("rotationX").toFloat())
    73 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationX` = args.number("translationX").toFloat(), `rotationX` = args.number("rotationX").toFloat())
    74 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `rotationX` = args.number("rotationX").toFloat())
    75 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `rotationX` = args.number("rotationX").toFloat())
    76 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `rotationX` = args.number("rotationX").toFloat())
    77 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `rotationX` = args.number("rotationX").toFloat())
    78 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `rotationX` = args.number("rotationX").toFloat())
    79 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `rotationX` = args.number("rotationX").toFloat())
    80 -> modifier.composeModifier82(`translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat())
    81 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat())
    82 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat())
    83 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat())
    84 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat())
    85 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat())
    86 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat())
    87 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat())
    88 -> modifier.composeModifier82(`translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat())
    89 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat())
    90 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat())
    91 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat())
    92 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat())
    93 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat())
    94 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat())
    95 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat())
    else -> error("Invalid generated modifier arguments: " + args)
  }

private fun apply122Group3(modifier: Modifier, args: ComposeModifierArguments, mask: Int): Modifier = when (mask) {
    96 -> modifier.composeModifier82(`shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat())
    97 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat())
    98 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat())
    99 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat())
    100 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat())
    101 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat())
    102 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat())
    103 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat())
    104 -> modifier.composeModifier82(`translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat())
    105 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat())
    106 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat())
    107 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat())
    108 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat())
    109 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat())
    110 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat())
    111 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat())
    112 -> modifier.composeModifier82(`translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat())
    113 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat())
    114 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat())
    115 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat())
    116 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat())
    117 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat())
    118 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat())
    119 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat())
    120 -> modifier.composeModifier82(`translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat())
    121 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat())
    122 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat())
    123 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat())
    124 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat())
    125 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat())
    126 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat())
    127 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat())
    else -> error("Invalid generated modifier arguments: " + args)
  }

private fun apply122Group4(modifier: Modifier, args: ComposeModifierArguments, mask: Int): Modifier = when (mask) {
    128 -> modifier.composeModifier82(`rotationY` = args.number("rotationY").toFloat())
    129 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    130 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    131 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    132 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    133 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    134 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    135 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    136 -> modifier.composeModifier82(`translationX` = args.number("translationX").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    137 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationX` = args.number("translationX").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    138 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    139 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    140 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    141 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    142 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    143 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    144 -> modifier.composeModifier82(`translationY` = args.number("translationY").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    145 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    146 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    147 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    148 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    149 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    150 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    151 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    152 -> modifier.composeModifier82(`translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    153 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    154 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    155 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    156 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    157 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    158 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    159 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    else -> error("Invalid generated modifier arguments: " + args)
  }

private fun apply122Group5(modifier: Modifier, args: ComposeModifierArguments, mask: Int): Modifier = when (mask) {
    160 -> modifier.composeModifier82(`shadowElevation` = args.number("shadowElevation").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    161 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    162 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    163 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    164 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    165 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    166 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    167 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    168 -> modifier.composeModifier82(`translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    169 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    170 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    171 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    172 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    173 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    174 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    175 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    176 -> modifier.composeModifier82(`translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    177 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    178 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    179 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    180 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    181 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    182 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    183 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    184 -> modifier.composeModifier82(`translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    185 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    186 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    187 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    188 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    189 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    190 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    191 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    else -> error("Invalid generated modifier arguments: " + args)
  }

private fun apply122Group6(modifier: Modifier, args: ComposeModifierArguments, mask: Int): Modifier = when (mask) {
    192 -> modifier.composeModifier82(`rotationX` = args.number("rotationX").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    193 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    194 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    195 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    196 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    197 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    198 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    199 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    200 -> modifier.composeModifier82(`translationX` = args.number("translationX").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    201 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationX` = args.number("translationX").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    202 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    203 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    204 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    205 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    206 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    207 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    208 -> modifier.composeModifier82(`translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    209 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    210 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    211 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    212 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    213 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    214 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    215 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    216 -> modifier.composeModifier82(`translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    217 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    218 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    219 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    220 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    221 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    222 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    223 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    else -> error("Invalid generated modifier arguments: " + args)
  }

private fun apply122Group7(modifier: Modifier, args: ComposeModifierArguments, mask: Int): Modifier = when (mask) {
    224 -> modifier.composeModifier82(`shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    225 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    226 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    227 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    228 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    229 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    230 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    231 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    232 -> modifier.composeModifier82(`translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    233 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    234 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    235 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    236 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    237 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    238 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    239 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    240 -> modifier.composeModifier82(`translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    241 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    242 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    243 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    244 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    245 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    246 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    247 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    248 -> modifier.composeModifier82(`translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    249 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    250 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    251 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    252 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    253 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    254 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    255 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationY` = args.number("rotationY").toFloat())
    else -> error("Invalid generated modifier arguments: " + args)
  }

private fun apply122Group8(modifier: Modifier, args: ComposeModifierArguments, mask: Int): Modifier = when (mask) {
    256 -> modifier.composeModifier82(`rotationZ` = args.number("rotationZ").toFloat())
    257 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    258 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    259 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    260 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    261 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    262 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    263 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    264 -> modifier.composeModifier82(`translationX` = args.number("translationX").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    265 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationX` = args.number("translationX").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    266 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    267 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    268 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    269 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    270 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    271 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    272 -> modifier.composeModifier82(`translationY` = args.number("translationY").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    273 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    274 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    275 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    276 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    277 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    278 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    279 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    280 -> modifier.composeModifier82(`translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    281 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    282 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    283 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    284 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    285 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    286 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    287 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    else -> error("Invalid generated modifier arguments: " + args)
  }

private fun apply122Group9(modifier: Modifier, args: ComposeModifierArguments, mask: Int): Modifier = when (mask) {
    288 -> modifier.composeModifier82(`shadowElevation` = args.number("shadowElevation").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    289 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    290 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    291 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    292 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    293 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    294 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    295 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    296 -> modifier.composeModifier82(`translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    297 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    298 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    299 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    300 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    301 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    302 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    303 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    304 -> modifier.composeModifier82(`translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    305 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    306 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    307 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    308 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    309 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    310 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    311 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    312 -> modifier.composeModifier82(`translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    313 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    314 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    315 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    316 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    317 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    318 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    319 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    else -> error("Invalid generated modifier arguments: " + args)
  }

private fun apply122Group10(modifier: Modifier, args: ComposeModifierArguments, mask: Int): Modifier = when (mask) {
    320 -> modifier.composeModifier82(`rotationX` = args.number("rotationX").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    321 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    322 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    323 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    324 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    325 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    326 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    327 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    328 -> modifier.composeModifier82(`translationX` = args.number("translationX").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    329 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationX` = args.number("translationX").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    330 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    331 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    332 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    333 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    334 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    335 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    336 -> modifier.composeModifier82(`translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    337 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    338 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    339 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    340 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    341 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    342 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    343 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    344 -> modifier.composeModifier82(`translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    345 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    346 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    347 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    348 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    349 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    350 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    351 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    else -> error("Invalid generated modifier arguments: " + args)
  }

private fun apply122Group11(modifier: Modifier, args: ComposeModifierArguments, mask: Int): Modifier = when (mask) {
    352 -> modifier.composeModifier82(`shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    353 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    354 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    355 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    356 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    357 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    358 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    359 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    360 -> modifier.composeModifier82(`translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    361 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    362 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    363 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    364 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    365 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    366 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    367 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    368 -> modifier.composeModifier82(`translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    369 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    370 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    371 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    372 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    373 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    374 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    375 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    376 -> modifier.composeModifier82(`translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    377 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    378 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    379 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    380 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    381 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    382 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    383 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationZ` = args.number("rotationZ").toFloat())
    else -> error("Invalid generated modifier arguments: " + args)
  }

private fun apply122Group16(modifier: Modifier, args: ComposeModifierArguments, mask: Int): Modifier = when (mask) {
    512 -> modifier.composeModifier82(`cameraDistance` = args.number("cameraDistance").toFloat())
    513 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    514 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    515 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    516 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    517 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    518 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    519 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    520 -> modifier.composeModifier82(`translationX` = args.number("translationX").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    521 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationX` = args.number("translationX").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    522 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    523 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    524 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    525 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    526 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    527 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    528 -> modifier.composeModifier82(`translationY` = args.number("translationY").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    529 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationY` = args.number("translationY").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    530 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationY` = args.number("translationY").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    531 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationY` = args.number("translationY").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    532 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    533 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    534 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    535 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    536 -> modifier.composeModifier82(`translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    537 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    538 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    539 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    540 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    541 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    542 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    543 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    else -> error("Invalid generated modifier arguments: " + args)
  }

private fun apply122Group17(modifier: Modifier, args: ComposeModifierArguments, mask: Int): Modifier = when (mask) {
    544 -> modifier.composeModifier82(`shadowElevation` = args.number("shadowElevation").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    545 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    546 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    547 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    548 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    549 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    550 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    551 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    552 -> modifier.composeModifier82(`translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    553 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    554 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    555 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    556 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    557 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    558 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    559 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    560 -> modifier.composeModifier82(`translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    561 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    562 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    563 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    564 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    565 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    566 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    567 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    568 -> modifier.composeModifier82(`translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    569 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    570 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    571 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    572 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    573 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    574 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    575 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    else -> error("Invalid generated modifier arguments: " + args)
  }

private fun apply122Group18(modifier: Modifier, args: ComposeModifierArguments, mask: Int): Modifier = when (mask) {
    576 -> modifier.composeModifier82(`rotationX` = args.number("rotationX").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    577 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    578 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    579 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    580 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    581 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    582 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    583 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    584 -> modifier.composeModifier82(`translationX` = args.number("translationX").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    585 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationX` = args.number("translationX").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    586 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    587 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    588 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    589 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    590 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    591 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    592 -> modifier.composeModifier82(`translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    593 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    594 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    595 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    596 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    597 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    598 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    599 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    600 -> modifier.composeModifier82(`translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    601 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    602 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    603 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    604 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    605 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    606 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    607 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    else -> error("Invalid generated modifier arguments: " + args)
  }

private fun apply122Group19(modifier: Modifier, args: ComposeModifierArguments, mask: Int): Modifier = when (mask) {
    608 -> modifier.composeModifier82(`shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    609 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    610 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    611 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    612 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    613 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    614 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    615 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    616 -> modifier.composeModifier82(`translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    617 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    618 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    619 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    620 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    621 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    622 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    623 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    624 -> modifier.composeModifier82(`translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    625 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    626 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    627 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    628 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    629 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    630 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    631 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    632 -> modifier.composeModifier82(`translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    633 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    634 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    635 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    636 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    637 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    638 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    639 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat())
    else -> error("Invalid generated modifier arguments: " + args)
  }

private fun apply122Group32(modifier: Modifier, args: ComposeModifierArguments, mask: Int): Modifier = when (mask) {
    1024 -> modifier.composeModifier82(`shape` = args.shape("shape"))
    1025 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `shape` = args.shape("shape"))
    1026 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `shape` = args.shape("shape"))
    1027 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `shape` = args.shape("shape"))
    1028 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `shape` = args.shape("shape"))
    1029 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `shape` = args.shape("shape"))
    1030 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `shape` = args.shape("shape"))
    1031 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `shape` = args.shape("shape"))
    1032 -> modifier.composeModifier82(`translationX` = args.number("translationX").toFloat(), `shape` = args.shape("shape"))
    1033 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationX` = args.number("translationX").toFloat(), `shape` = args.shape("shape"))
    1034 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `shape` = args.shape("shape"))
    1035 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `shape` = args.shape("shape"))
    1036 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `shape` = args.shape("shape"))
    1037 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `shape` = args.shape("shape"))
    1038 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `shape` = args.shape("shape"))
    1039 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `shape` = args.shape("shape"))
    1040 -> modifier.composeModifier82(`translationY` = args.number("translationY").toFloat(), `shape` = args.shape("shape"))
    1041 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shape` = args.shape("shape"))
    1042 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationY` = args.number("translationY").toFloat(), `shape` = args.shape("shape"))
    1043 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationY` = args.number("translationY").toFloat(), `shape` = args.shape("shape"))
    1044 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `shape` = args.shape("shape"))
    1045 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `shape` = args.shape("shape"))
    1046 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `shape` = args.shape("shape"))
    1047 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `shape` = args.shape("shape"))
    1048 -> modifier.composeModifier82(`translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shape` = args.shape("shape"))
    1049 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shape` = args.shape("shape"))
    1050 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shape` = args.shape("shape"))
    1051 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shape` = args.shape("shape"))
    1052 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shape` = args.shape("shape"))
    1053 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shape` = args.shape("shape"))
    1054 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shape` = args.shape("shape"))
    1055 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shape` = args.shape("shape"))
    else -> error("Invalid generated modifier arguments: " + args)
  }

private fun apply122Group33(modifier: Modifier, args: ComposeModifierArguments, mask: Int): Modifier = when (mask) {
    1056 -> modifier.composeModifier82(`shadowElevation` = args.number("shadowElevation").toFloat(), `shape` = args.shape("shape"))
    1057 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `shape` = args.shape("shape"))
    1058 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `shape` = args.shape("shape"))
    1059 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `shape` = args.shape("shape"))
    1060 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `shape` = args.shape("shape"))
    1061 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `shape` = args.shape("shape"))
    1062 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `shape` = args.shape("shape"))
    1063 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `shape` = args.shape("shape"))
    1064 -> modifier.composeModifier82(`translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `shape` = args.shape("shape"))
    1065 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `shape` = args.shape("shape"))
    1066 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `shape` = args.shape("shape"))
    1067 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `shape` = args.shape("shape"))
    1068 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `shape` = args.shape("shape"))
    1069 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `shape` = args.shape("shape"))
    1070 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `shape` = args.shape("shape"))
    1071 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `shape` = args.shape("shape"))
    1072 -> modifier.composeModifier82(`translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `shape` = args.shape("shape"))
    1073 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `shape` = args.shape("shape"))
    1074 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `shape` = args.shape("shape"))
    1075 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `shape` = args.shape("shape"))
    1076 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `shape` = args.shape("shape"))
    1077 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `shape` = args.shape("shape"))
    1078 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `shape` = args.shape("shape"))
    1079 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `shape` = args.shape("shape"))
    1080 -> modifier.composeModifier82(`translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `shape` = args.shape("shape"))
    1081 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `shape` = args.shape("shape"))
    1082 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `shape` = args.shape("shape"))
    1083 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `shape` = args.shape("shape"))
    1084 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `shape` = args.shape("shape"))
    1085 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `shape` = args.shape("shape"))
    1086 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `shape` = args.shape("shape"))
    1087 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `shape` = args.shape("shape"))
    else -> error("Invalid generated modifier arguments: " + args)
  }

private fun apply122Group34(modifier: Modifier, args: ComposeModifierArguments, mask: Int): Modifier = when (mask) {
    1088 -> modifier.composeModifier82(`rotationX` = args.number("rotationX").toFloat(), `shape` = args.shape("shape"))
    1089 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `shape` = args.shape("shape"))
    1090 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `shape` = args.shape("shape"))
    1091 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `shape` = args.shape("shape"))
    1092 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `shape` = args.shape("shape"))
    1093 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `shape` = args.shape("shape"))
    1094 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `shape` = args.shape("shape"))
    1095 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `shape` = args.shape("shape"))
    1096 -> modifier.composeModifier82(`translationX` = args.number("translationX").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `shape` = args.shape("shape"))
    1097 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationX` = args.number("translationX").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `shape` = args.shape("shape"))
    1098 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `shape` = args.shape("shape"))
    1099 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `shape` = args.shape("shape"))
    1100 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `shape` = args.shape("shape"))
    1101 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `shape` = args.shape("shape"))
    1102 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `shape` = args.shape("shape"))
    1103 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `shape` = args.shape("shape"))
    1104 -> modifier.composeModifier82(`translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `shape` = args.shape("shape"))
    1105 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `shape` = args.shape("shape"))
    1106 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `shape` = args.shape("shape"))
    1107 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `shape` = args.shape("shape"))
    1108 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `shape` = args.shape("shape"))
    1109 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `shape` = args.shape("shape"))
    1110 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `shape` = args.shape("shape"))
    1111 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `shape` = args.shape("shape"))
    1112 -> modifier.composeModifier82(`translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `shape` = args.shape("shape"))
    1113 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `shape` = args.shape("shape"))
    1114 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `shape` = args.shape("shape"))
    1115 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `shape` = args.shape("shape"))
    1116 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `shape` = args.shape("shape"))
    1117 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `shape` = args.shape("shape"))
    1118 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `shape` = args.shape("shape"))
    1119 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `shape` = args.shape("shape"))
    else -> error("Invalid generated modifier arguments: " + args)
  }

private fun apply122Group35(modifier: Modifier, args: ComposeModifierArguments, mask: Int): Modifier = when (mask) {
    1120 -> modifier.composeModifier82(`shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `shape` = args.shape("shape"))
    1121 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `shape` = args.shape("shape"))
    1122 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `shape` = args.shape("shape"))
    1123 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `shape` = args.shape("shape"))
    1124 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `shape` = args.shape("shape"))
    1125 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `shape` = args.shape("shape"))
    1126 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `shape` = args.shape("shape"))
    1127 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `shape` = args.shape("shape"))
    1128 -> modifier.composeModifier82(`translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `shape` = args.shape("shape"))
    1129 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `shape` = args.shape("shape"))
    1130 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `shape` = args.shape("shape"))
    1131 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `shape` = args.shape("shape"))
    1132 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `shape` = args.shape("shape"))
    1133 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `shape` = args.shape("shape"))
    1134 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `shape` = args.shape("shape"))
    1135 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `shape` = args.shape("shape"))
    1136 -> modifier.composeModifier82(`translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `shape` = args.shape("shape"))
    1137 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `shape` = args.shape("shape"))
    1138 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `shape` = args.shape("shape"))
    1139 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `shape` = args.shape("shape"))
    1140 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `shape` = args.shape("shape"))
    1141 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `shape` = args.shape("shape"))
    1142 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `shape` = args.shape("shape"))
    1143 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `shape` = args.shape("shape"))
    1144 -> modifier.composeModifier82(`translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `shape` = args.shape("shape"))
    1145 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `shape` = args.shape("shape"))
    1146 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `shape` = args.shape("shape"))
    1147 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `shape` = args.shape("shape"))
    1148 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `shape` = args.shape("shape"))
    1149 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `shape` = args.shape("shape"))
    1150 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `shape` = args.shape("shape"))
    1151 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `shape` = args.shape("shape"))
    else -> error("Invalid generated modifier arguments: " + args)
  }

private fun apply122Group64(modifier: Modifier, args: ComposeModifierArguments, mask: Int): Modifier = when (mask) {
    2048 -> modifier.composeModifier82(`clip` = args.boolean("clip"))
    2049 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `clip` = args.boolean("clip"))
    2050 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `clip` = args.boolean("clip"))
    2051 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `clip` = args.boolean("clip"))
    2052 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `clip` = args.boolean("clip"))
    2053 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `clip` = args.boolean("clip"))
    2054 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `clip` = args.boolean("clip"))
    2055 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `clip` = args.boolean("clip"))
    2056 -> modifier.composeModifier82(`translationX` = args.number("translationX").toFloat(), `clip` = args.boolean("clip"))
    2057 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationX` = args.number("translationX").toFloat(), `clip` = args.boolean("clip"))
    2058 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `clip` = args.boolean("clip"))
    2059 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `clip` = args.boolean("clip"))
    2060 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `clip` = args.boolean("clip"))
    2061 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `clip` = args.boolean("clip"))
    2062 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `clip` = args.boolean("clip"))
    2063 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `clip` = args.boolean("clip"))
    2064 -> modifier.composeModifier82(`translationY` = args.number("translationY").toFloat(), `clip` = args.boolean("clip"))
    2065 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationY` = args.number("translationY").toFloat(), `clip` = args.boolean("clip"))
    2066 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationY` = args.number("translationY").toFloat(), `clip` = args.boolean("clip"))
    2067 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationY` = args.number("translationY").toFloat(), `clip` = args.boolean("clip"))
    2068 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `clip` = args.boolean("clip"))
    2069 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `clip` = args.boolean("clip"))
    2070 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `clip` = args.boolean("clip"))
    2071 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `clip` = args.boolean("clip"))
    2072 -> modifier.composeModifier82(`translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `clip` = args.boolean("clip"))
    2073 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `clip` = args.boolean("clip"))
    2074 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `clip` = args.boolean("clip"))
    2075 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `clip` = args.boolean("clip"))
    2076 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `clip` = args.boolean("clip"))
    2077 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `clip` = args.boolean("clip"))
    2078 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `clip` = args.boolean("clip"))
    2079 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `clip` = args.boolean("clip"))
    else -> error("Invalid generated modifier arguments: " + args)
  }

private fun apply122Group65(modifier: Modifier, args: ComposeModifierArguments, mask: Int): Modifier = when (mask) {
    2080 -> modifier.composeModifier82(`shadowElevation` = args.number("shadowElevation").toFloat(), `clip` = args.boolean("clip"))
    2081 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `clip` = args.boolean("clip"))
    2082 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `clip` = args.boolean("clip"))
    2083 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `clip` = args.boolean("clip"))
    2084 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `clip` = args.boolean("clip"))
    2085 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `clip` = args.boolean("clip"))
    2086 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `clip` = args.boolean("clip"))
    2087 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `clip` = args.boolean("clip"))
    2088 -> modifier.composeModifier82(`translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `clip` = args.boolean("clip"))
    2089 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `clip` = args.boolean("clip"))
    2090 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `clip` = args.boolean("clip"))
    2091 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `clip` = args.boolean("clip"))
    2092 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `clip` = args.boolean("clip"))
    2093 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `clip` = args.boolean("clip"))
    2094 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `clip` = args.boolean("clip"))
    2095 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `clip` = args.boolean("clip"))
    2096 -> modifier.composeModifier82(`translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `clip` = args.boolean("clip"))
    2097 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `clip` = args.boolean("clip"))
    2098 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `clip` = args.boolean("clip"))
    2099 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `clip` = args.boolean("clip"))
    2100 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `clip` = args.boolean("clip"))
    2101 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `clip` = args.boolean("clip"))
    2102 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `clip` = args.boolean("clip"))
    2103 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `clip` = args.boolean("clip"))
    2104 -> modifier.composeModifier82(`translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `clip` = args.boolean("clip"))
    2105 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `clip` = args.boolean("clip"))
    2106 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `clip` = args.boolean("clip"))
    2107 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `clip` = args.boolean("clip"))
    2108 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `clip` = args.boolean("clip"))
    2109 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `clip` = args.boolean("clip"))
    2110 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `clip` = args.boolean("clip"))
    2111 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `clip` = args.boolean("clip"))
    else -> error("Invalid generated modifier arguments: " + args)
  }

private fun apply122Group66(modifier: Modifier, args: ComposeModifierArguments, mask: Int): Modifier = when (mask) {
    2112 -> modifier.composeModifier82(`rotationX` = args.number("rotationX").toFloat(), `clip` = args.boolean("clip"))
    2113 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `clip` = args.boolean("clip"))
    2114 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `clip` = args.boolean("clip"))
    2115 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `clip` = args.boolean("clip"))
    2116 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `clip` = args.boolean("clip"))
    2117 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `clip` = args.boolean("clip"))
    2118 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `clip` = args.boolean("clip"))
    2119 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `clip` = args.boolean("clip"))
    2120 -> modifier.composeModifier82(`translationX` = args.number("translationX").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `clip` = args.boolean("clip"))
    2121 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationX` = args.number("translationX").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `clip` = args.boolean("clip"))
    2122 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `clip` = args.boolean("clip"))
    2123 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `clip` = args.boolean("clip"))
    2124 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `clip` = args.boolean("clip"))
    2125 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `clip` = args.boolean("clip"))
    2126 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `clip` = args.boolean("clip"))
    2127 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `clip` = args.boolean("clip"))
    2128 -> modifier.composeModifier82(`translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `clip` = args.boolean("clip"))
    2129 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `clip` = args.boolean("clip"))
    2130 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `clip` = args.boolean("clip"))
    2131 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `clip` = args.boolean("clip"))
    2132 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `clip` = args.boolean("clip"))
    2133 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `clip` = args.boolean("clip"))
    2134 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `clip` = args.boolean("clip"))
    2135 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `clip` = args.boolean("clip"))
    2136 -> modifier.composeModifier82(`translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `clip` = args.boolean("clip"))
    2137 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `clip` = args.boolean("clip"))
    2138 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `clip` = args.boolean("clip"))
    2139 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `clip` = args.boolean("clip"))
    2140 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `clip` = args.boolean("clip"))
    2141 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `clip` = args.boolean("clip"))
    2142 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `clip` = args.boolean("clip"))
    2143 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `clip` = args.boolean("clip"))
    else -> error("Invalid generated modifier arguments: " + args)
  }

private fun apply122Group67(modifier: Modifier, args: ComposeModifierArguments, mask: Int): Modifier = when (mask) {
    2144 -> modifier.composeModifier82(`shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `clip` = args.boolean("clip"))
    2145 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `clip` = args.boolean("clip"))
    2146 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `clip` = args.boolean("clip"))
    2147 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `clip` = args.boolean("clip"))
    2148 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `clip` = args.boolean("clip"))
    2149 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `clip` = args.boolean("clip"))
    2150 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `clip` = args.boolean("clip"))
    2151 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `clip` = args.boolean("clip"))
    2152 -> modifier.composeModifier82(`translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `clip` = args.boolean("clip"))
    2153 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `clip` = args.boolean("clip"))
    2154 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `clip` = args.boolean("clip"))
    2155 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `clip` = args.boolean("clip"))
    2156 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `clip` = args.boolean("clip"))
    2157 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `clip` = args.boolean("clip"))
    2158 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `clip` = args.boolean("clip"))
    2159 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `clip` = args.boolean("clip"))
    2160 -> modifier.composeModifier82(`translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `clip` = args.boolean("clip"))
    2161 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `clip` = args.boolean("clip"))
    2162 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `clip` = args.boolean("clip"))
    2163 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `clip` = args.boolean("clip"))
    2164 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `clip` = args.boolean("clip"))
    2165 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `clip` = args.boolean("clip"))
    2166 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `clip` = args.boolean("clip"))
    2167 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `clip` = args.boolean("clip"))
    2168 -> modifier.composeModifier82(`translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `clip` = args.boolean("clip"))
    2169 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `clip` = args.boolean("clip"))
    2170 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `clip` = args.boolean("clip"))
    2171 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `clip` = args.boolean("clip"))
    2172 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `clip` = args.boolean("clip"))
    2173 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `clip` = args.boolean("clip"))
    2174 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `clip` = args.boolean("clip"))
    2175 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `clip` = args.boolean("clip"))
    else -> error("Invalid generated modifier arguments: " + args)
  }

private fun apply122Group128(modifier: Modifier, args: ComposeModifierArguments, mask: Int): Modifier = when (mask) {
    4096 -> modifier.composeModifier82(`ambientShadowColor` = args.color("ambientShadowColor"))
    4097 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4098 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4099 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4100 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4101 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4102 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4103 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4104 -> modifier.composeModifier82(`translationX` = args.number("translationX").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4105 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationX` = args.number("translationX").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4106 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4107 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4108 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4109 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4110 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4111 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4112 -> modifier.composeModifier82(`translationY` = args.number("translationY").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4113 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationY` = args.number("translationY").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4114 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationY` = args.number("translationY").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4115 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationY` = args.number("translationY").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4116 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4117 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4118 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4119 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4120 -> modifier.composeModifier82(`translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4121 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4122 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4123 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4124 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4125 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4126 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4127 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    else -> error("Invalid generated modifier arguments: " + args)
  }

private fun apply122Group129(modifier: Modifier, args: ComposeModifierArguments, mask: Int): Modifier = when (mask) {
    4128 -> modifier.composeModifier82(`shadowElevation` = args.number("shadowElevation").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4129 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4130 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4131 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4132 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4133 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4134 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4135 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4136 -> modifier.composeModifier82(`translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4137 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4138 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4139 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4140 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4141 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4142 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4143 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4144 -> modifier.composeModifier82(`translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4145 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4146 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4147 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4148 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4149 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4150 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4151 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4152 -> modifier.composeModifier82(`translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4153 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4154 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4155 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4156 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4157 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4158 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4159 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    else -> error("Invalid generated modifier arguments: " + args)
  }

private fun apply122Group130(modifier: Modifier, args: ComposeModifierArguments, mask: Int): Modifier = when (mask) {
    4160 -> modifier.composeModifier82(`rotationX` = args.number("rotationX").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4161 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4162 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4163 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4164 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4165 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4166 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4167 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4168 -> modifier.composeModifier82(`translationX` = args.number("translationX").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4169 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationX` = args.number("translationX").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4170 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4171 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4172 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4173 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4174 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4175 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4176 -> modifier.composeModifier82(`translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4177 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4178 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4179 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4180 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4181 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4182 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4183 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4184 -> modifier.composeModifier82(`translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4185 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4186 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4187 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4188 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4189 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4190 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4191 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    else -> error("Invalid generated modifier arguments: " + args)
  }

private fun apply122Group131(modifier: Modifier, args: ComposeModifierArguments, mask: Int): Modifier = when (mask) {
    4192 -> modifier.composeModifier82(`shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4193 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4194 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4195 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4196 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4197 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4198 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4199 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4200 -> modifier.composeModifier82(`translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4201 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4202 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4203 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4204 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4205 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4206 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4207 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4208 -> modifier.composeModifier82(`translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4209 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4210 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4211 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4212 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4213 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4214 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4215 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4216 -> modifier.composeModifier82(`translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4217 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4218 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4219 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4220 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4221 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4222 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    4223 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `ambientShadowColor` = args.color("ambientShadowColor"))
    else -> error("Invalid generated modifier arguments: " + args)
  }

private fun apply122Group256(modifier: Modifier, args: ComposeModifierArguments, mask: Int): Modifier = when (mask) {
    8192 -> modifier.composeModifier82(`spotShadowColor` = args.color("spotShadowColor"))
    8193 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8194 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8195 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8196 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8197 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8198 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8199 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8200 -> modifier.composeModifier82(`translationX` = args.number("translationX").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8201 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationX` = args.number("translationX").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8202 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8203 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8204 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8205 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8206 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8207 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8208 -> modifier.composeModifier82(`translationY` = args.number("translationY").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8209 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationY` = args.number("translationY").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8210 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationY` = args.number("translationY").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8211 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationY` = args.number("translationY").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8212 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8213 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8214 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8215 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8216 -> modifier.composeModifier82(`translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8217 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8218 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8219 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8220 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8221 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8222 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8223 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    else -> error("Invalid generated modifier arguments: " + args)
  }

private fun apply122Group257(modifier: Modifier, args: ComposeModifierArguments, mask: Int): Modifier = when (mask) {
    8224 -> modifier.composeModifier82(`shadowElevation` = args.number("shadowElevation").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8225 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8226 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8227 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8228 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8229 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8230 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8231 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8232 -> modifier.composeModifier82(`translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8233 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8234 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8235 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8236 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8237 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8238 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8239 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8240 -> modifier.composeModifier82(`translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8241 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8242 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8243 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8244 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8245 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8246 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8247 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8248 -> modifier.composeModifier82(`translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8249 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8250 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8251 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8252 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8253 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8254 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8255 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    else -> error("Invalid generated modifier arguments: " + args)
  }

private fun apply122Group258(modifier: Modifier, args: ComposeModifierArguments, mask: Int): Modifier = when (mask) {
    8256 -> modifier.composeModifier82(`rotationX` = args.number("rotationX").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8257 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8258 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8259 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8260 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8261 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8262 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8263 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8264 -> modifier.composeModifier82(`translationX` = args.number("translationX").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8265 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationX` = args.number("translationX").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8266 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8267 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8268 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8269 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8270 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8271 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8272 -> modifier.composeModifier82(`translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8273 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8274 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8275 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8276 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8277 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8278 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8279 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8280 -> modifier.composeModifier82(`translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8281 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8282 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8283 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8284 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8285 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8286 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8287 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    else -> error("Invalid generated modifier arguments: " + args)
  }

private fun apply122Group259(modifier: Modifier, args: ComposeModifierArguments, mask: Int): Modifier = when (mask) {
    8288 -> modifier.composeModifier82(`shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8289 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8290 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8291 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8292 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8293 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8294 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8295 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8296 -> modifier.composeModifier82(`translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8297 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8298 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8299 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8300 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8301 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8302 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8303 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8304 -> modifier.composeModifier82(`translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8305 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8306 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8307 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8308 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8309 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8310 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8311 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8312 -> modifier.composeModifier82(`translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8313 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8314 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8315 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8316 -> modifier.composeModifier82(`alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8317 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8318 -> modifier.composeModifier82(`scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    8319 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `spotShadowColor` = args.color("spotShadowColor"))
    else -> error("Invalid generated modifier arguments: " + args)
  }

private fun apply122Group511(modifier: Modifier, args: ComposeModifierArguments, mask: Int): Modifier = when (mask) {
    16383 -> modifier.composeModifier82(`scaleX` = args.number("scaleX").toFloat(), `scaleY` = args.number("scaleY").toFloat(), `alpha` = args.number("alpha").toFloat(), `translationX` = args.number("translationX").toFloat(), `translationY` = args.number("translationY").toFloat(), `shadowElevation` = args.number("shadowElevation").toFloat(), `rotationX` = args.number("rotationX").toFloat(), `rotationY` = args.number("rotationY").toFloat(), `rotationZ` = args.number("rotationZ").toFloat(), `cameraDistance` = args.number("cameraDistance").toFloat(), `shape` = args.shape("shape"), `clip` = args.boolean("clip"), `ambientShadowColor` = args.color("ambientShadowColor"), `spotShadowColor` = args.color("spotShadowColor"))
    else -> error("Invalid generated modifier arguments: " + args)
  }

// androidx.compose.ui.graphics.toolingGraphicsLayer [receiver: androidx.compose.ui.Modifier]()
private fun apply123(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier83()

// androidx.compose.ui.input.pointer.pointerHoverIcon [receiver: androidx.compose.ui.Modifier](icon: androidx.compose.ui.input.pointer.PointerIcon, overrideDescendants: kotlin.Boolean)
private fun apply124(modifier: Modifier, args: ComposeModifierArguments): Modifier {
  val mask = (if (args.has("overrideDescendants")) 1 else 0)
  return when (mask) {
    0 -> modifier.composeModifier84(`icon` = toComposePointerIcon(args.string("icon")))
    1 -> modifier.composeModifier84(`icon` = toComposePointerIcon(args.string("icon")), `overrideDescendants` = args.boolean("overrideDescendants"))
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

// androidx.compose.ui.input.pointer.stylusHoverIcon [receiver: androidx.compose.ui.Modifier](icon: androidx.compose.ui.input.pointer.PointerIcon, overrideDescendants: kotlin.Boolean, touchBoundsExpansion: androidx.compose.ui.node.DpTouchBoundsExpansion?)
private fun apply125(modifier: Modifier, args: ComposeModifierArguments): Modifier {
  val mask = (if (args.has("overrideDescendants")) 1 else 0)
  return when (mask) {
    0 -> modifier.composeModifier85(`icon` = toComposePointerIcon(args.string("icon")))
    1 -> modifier.composeModifier85(`icon` = toComposePointerIcon(args.string("icon")), `overrideDescendants` = args.boolean("overrideDescendants"))
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

// androidx.compose.ui.layout.layoutId [receiver: androidx.compose.ui.Modifier](layoutId: kotlin.Any)
private fun apply126(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier86(`layoutId` = args.string("layoutId"))

// androidx.compose.ui.layout.onGloballyPositioned [receiver: androidx.compose.ui.Modifier](onGloballyPositioned: kotlin.Function1<androidx.compose.ui.layout.LayoutCoordinates, kotlin.Unit>)
private fun apply127(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier87(`onGloballyPositioned` = { value: androidx.compose.ui.layout.LayoutCoordinates -> args.emit("onGloballyPositioned", value.toComposeSnapshot()) })

// androidx.compose.ui.layout.onLayoutRectChanged [receiver: androidx.compose.ui.Modifier](throttleMillis: kotlin.Long, debounceMillis: kotlin.Long, callback: kotlin.Function1<androidx.compose.ui.spatial.RelativeLayoutBounds, kotlin.Unit>)
private fun apply128(modifier: Modifier, args: ComposeModifierArguments): Modifier {
  val mask = (if (args.has("throttleMillis")) 1 else 0) +
    (if (args.has("debounceMillis")) 2 else 0)
  return when (mask) {
    0 -> modifier.composeModifier88(`callback` = { value: androidx.compose.ui.spatial.RelativeLayoutBounds -> args.emit("callback", value.toComposeSnapshot()) })
    1 -> modifier.composeModifier88(`throttleMillis` = args.number("throttleMillis").toLong(), `callback` = { value: androidx.compose.ui.spatial.RelativeLayoutBounds -> args.emit("callback", value.toComposeSnapshot()) })
    2 -> modifier.composeModifier88(`debounceMillis` = args.number("debounceMillis").toLong(), `callback` = { value: androidx.compose.ui.spatial.RelativeLayoutBounds -> args.emit("callback", value.toComposeSnapshot()) })
    3 -> modifier.composeModifier88(`throttleMillis` = args.number("throttleMillis").toLong(), `debounceMillis` = args.number("debounceMillis").toLong(), `callback` = { value: androidx.compose.ui.spatial.RelativeLayoutBounds -> args.emit("callback", value.toComposeSnapshot()) })
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

// androidx.compose.ui.layout.onPlaced [receiver: androidx.compose.ui.Modifier](onPlaced: kotlin.Function1<androidx.compose.ui.layout.LayoutCoordinates, kotlin.Unit>)
private fun apply129(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier89(`onPlaced` = { value: androidx.compose.ui.layout.LayoutCoordinates -> args.emit("onPlaced", value.toComposeSnapshot()) })

// androidx.compose.ui.layout.onSizeChanged [receiver: androidx.compose.ui.Modifier](onSizeChanged: kotlin.Function1<androidx.compose.ui.unit.IntSize, kotlin.Unit>)
private fun apply130(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier90(`onSizeChanged` = { value: androidx.compose.ui.unit.IntSize -> args.emit("onSizeChanged", value.toComposeSnapshot()) })

// androidx.compose.ui.platform.testTag [receiver: androidx.compose.ui.Modifier](tag: kotlin.String)
private fun apply131(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier91(`tag` = args.string("tag"))

// androidx.compose.ui.semantics.clearAndSetSemantics [receiver: androidx.compose.ui.Modifier](properties: kotlin.Function1<androidx.compose.ui.semantics.SemanticsPropertyReceiver, kotlin.Unit>)
private fun apply132(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier92(`properties` = args.jsonObject("properties").toSemantics())

// androidx.compose.ui.semantics.semantics [receiver: androidx.compose.ui.Modifier](mergeDescendants: kotlin.Boolean, properties: kotlin.Function1<androidx.compose.ui.semantics.SemanticsPropertyReceiver, kotlin.Unit>)
private fun apply133(modifier: Modifier, args: ComposeModifierArguments): Modifier {
  val mask = (if (args.has("mergeDescendants")) 1 else 0)
  return when (mask) {
    0 -> modifier.composeModifier93(`properties` = args.jsonObject("properties").toSemantics())
    1 -> modifier.composeModifier93(`mergeDescendants` = args.boolean("mergeDescendants"), `properties` = args.jsonObject("properties").toSemantics())
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

// androidx.compose.ui.sensitiveContent [receiver: androidx.compose.ui.Modifier](isContentSensitive: kotlin.Boolean)
private fun apply134(modifier: Modifier, args: ComposeModifierArguments): Modifier {
  val mask = (if (args.has("isContentSensitive")) 1 else 0)
  return when (mask) {
    0 -> modifier.composeModifier94()
    1 -> modifier.composeModifier94(`isContentSensitive` = args.boolean("isContentSensitive"))
    else -> error("Invalid generated modifier arguments: " + args)
  }
}

// androidx.compose.ui.zIndex [receiver: androidx.compose.ui.Modifier](zIndex: kotlin.Float)
private fun apply135(modifier: Modifier, args: ComposeModifierArguments): Modifier =
  modifier.composeModifier95(`zIndex` = args.number("zIndex").toFloat())
