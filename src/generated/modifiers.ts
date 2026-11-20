// Generated from Compose declarations by generate.mjs.
import { createModifier, type ComposeBrush, type ComposeShape, type ModifierCompatibility, type ModifierPayload } from "../utils/modifier";
import type { ComposeAlignment, ComposeHorizontalAlignment, ComposeRole, ComposeVerticalAlignment } from "./values";

interface GeneratedModifiers {
  absoluteOffset(): ComposeChain;
  absoluteOffset(options: { x: number }): ComposeChain;
  absoluteOffset(x: number): ComposeChain;
  absoluteOffset(options: { y: number }): ComposeChain;
  absoluteOffset(y: number): ComposeChain;
  absoluteOffset(options: { x: number; y: number }): ComposeChain;
  absolutePadding(): ComposeChain;
  absolutePadding(options: { left: number }): ComposeChain;
  absolutePadding(left: number): ComposeChain;
  absolutePadding(options: { top: number }): ComposeChain;
  absolutePadding(top: number): ComposeChain;
  absolutePadding(options: { left: number; top: number }): ComposeChain;
  absolutePadding(options: { right: number }): ComposeChain;
  absolutePadding(right: number): ComposeChain;
  absolutePadding(options: { left: number; right: number }): ComposeChain;
  absolutePadding(options: { top: number; right: number }): ComposeChain;
  absolutePadding(options: { left: number; top: number; right: number }): ComposeChain;
  absolutePadding(options: { bottom: number }): ComposeChain;
  absolutePadding(bottom: number): ComposeChain;
  absolutePadding(options: { left: number; bottom: number }): ComposeChain;
  absolutePadding(options: { top: number; bottom: number }): ComposeChain;
  absolutePadding(options: { left: number; top: number; bottom: number }): ComposeChain;
  absolutePadding(options: { right: number; bottom: number }): ComposeChain;
  absolutePadding(options: { left: number; right: number; bottom: number }): ComposeChain;
  absolutePadding(options: { top: number; right: number; bottom: number }): ComposeChain;
  absolutePadding(options: { left: number; top: number; right: number; bottom: number }): ComposeChain;
  align(options: { alignment: ComposeAlignment }): ComposeChain;
  align(alignment: ComposeAlignment): ComposeChain;
  align(options: { alignment: ComposeHorizontalAlignment }): ComposeChain;
  align(alignment: ComposeHorizontalAlignment): ComposeChain;
  align(options: { alignment: ComposeVerticalAlignment }): ComposeChain;
  align(alignment: ComposeVerticalAlignment): ComposeChain;
  alignByBaseline(): ComposeChain;
  alpha(options: { alpha: number }): ComposeChain;
  alpha(alpha: number): ComposeChain;
  aspectRatio(options: { ratio: number }): ComposeChain;
  aspectRatio(ratio: number): ComposeChain;
  aspectRatio(options: { ratio: number; matchHeightConstraintsFirst: boolean }): ComposeChain;
  aspectRatio(ratio: number, options: { matchHeightConstraintsFirst: boolean }): ComposeChain;
  background(options: { brush: ComposeBrush }): ComposeChain;
  background(style: ComposeBrush): ComposeChain;
  background(options: { brush: ComposeBrush; shape: ComposeShape }): ComposeChain;
  background(style: ComposeBrush, options: { in: ComposeShape }): ComposeChain;
  background(options: { brush: ComposeBrush; alpha: number }): ComposeChain;
  background(style: ComposeBrush, options: { alpha: number }): ComposeChain;
  background(options: { brush: ComposeBrush; shape: ComposeShape; alpha: number }): ComposeChain;
  background(style: ComposeBrush, options: { in: ComposeShape; alpha: number }): ComposeChain;
  background(options: { color: string }): ComposeChain;
  background(style: string): ComposeChain;
  background(options: { color: string; shape: ComposeShape }): ComposeChain;
  background(style: string, options: { in: ComposeShape }): ComposeChain;
  basicMarquee(): ComposeChain;
  basicMarquee(options: { iterations: number }): ComposeChain;
  basicMarquee(iterations: number): ComposeChain;
  basicMarquee(options: { repeatDelayMillis: number }): ComposeChain;
  basicMarquee(repeatDelayMillis: number): ComposeChain;
  basicMarquee(options: { iterations: number; repeatDelayMillis: number }): ComposeChain;
  basicMarquee(options: { initialDelayMillis: number }): ComposeChain;
  basicMarquee(initialDelayMillis: number): ComposeChain;
  basicMarquee(options: { iterations: number; initialDelayMillis: number }): ComposeChain;
  basicMarquee(options: { repeatDelayMillis: number; initialDelayMillis: number }): ComposeChain;
  basicMarquee(options: { iterations: number; repeatDelayMillis: number; initialDelayMillis: number }): ComposeChain;
  basicMarquee(options: { velocity: number }): ComposeChain;
  basicMarquee(velocity: number): ComposeChain;
  basicMarquee(options: { iterations: number; velocity: number }): ComposeChain;
  basicMarquee(options: { repeatDelayMillis: number; velocity: number }): ComposeChain;
  basicMarquee(options: { iterations: number; repeatDelayMillis: number; velocity: number }): ComposeChain;
  basicMarquee(options: { initialDelayMillis: number; velocity: number }): ComposeChain;
  basicMarquee(options: { iterations: number; initialDelayMillis: number; velocity: number }): ComposeChain;
  basicMarquee(options: { repeatDelayMillis: number; initialDelayMillis: number; velocity: number }): ComposeChain;
  basicMarquee(options: { iterations: number; repeatDelayMillis: number; initialDelayMillis: number; velocity: number }): ComposeChain;
  blur(options: { radius: number }): ComposeChain;
  blur(radius: number): ComposeChain;
  blur(options: { radiusX: number; radiusY: number }): ComposeChain;
  border(options: { width: number; brush: ComposeBrush; shape: ComposeShape }): ComposeChain;
  border(content: ComposeBrush, options?: { width?: number; shape?: ComposeShape }): ComposeChain;
  border(options: { width: number; color: string }): ComposeChain;
  border(content: string, options?: { width?: number }): ComposeChain;
  border(options: { width: number; color: string; shape: ComposeShape }): ComposeChain;
  border(content: string, options: { width?: number; shape: ComposeShape }): ComposeChain;
  captionBarPadding(): ComposeChain;
  clickable(options: { onClick: () => void }): ComposeChain;
  clickable(onClick: () => void): ComposeChain;
  clickable(options: { enabled: boolean; onClick: () => void }): ComposeChain;
  clickable(onClick: () => void, options: { enabled: boolean }): ComposeChain;
  clickable(options: { onClickLabel: string | null; onClick: () => void }): ComposeChain;
  clickable(onClick: () => void, options: { onClickLabel: string | null }): ComposeChain;
  clickable(options: { enabled: boolean; onClickLabel: string | null; onClick: () => void }): ComposeChain;
  clickable(onClick: () => void, options: { enabled: boolean; onClickLabel: string | null }): ComposeChain;
  clickable(options: { role: ComposeRole | null; onClick: () => void }): ComposeChain;
  clickable(onClick: () => void, options: { role: ComposeRole | null }): ComposeChain;
  clickable(options: { enabled: boolean; role: ComposeRole | null; onClick: () => void }): ComposeChain;
  clickable(onClick: () => void, options: { enabled: boolean; role: ComposeRole | null }): ComposeChain;
  clickable(options: { onClickLabel: string | null; role: ComposeRole | null; onClick: () => void }): ComposeChain;
  clickable(onClick: () => void, options: { onClickLabel: string | null; role: ComposeRole | null }): ComposeChain;
  clickable(options: { enabled: boolean; onClickLabel: string | null; role: ComposeRole | null; onClick: () => void }): ComposeChain;
  clickable(onClick: () => void, options: { enabled: boolean; onClickLabel: string | null; role: ComposeRole | null }): ComposeChain;
  clip(options: { shape: ComposeShape }): ComposeChain;
  clip(shape: ComposeShape): ComposeChain;
  clipToBounds(): ComposeChain;
  combinedClickable(options: { onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void): ComposeChain;
  combinedClickable(options: { enabled: boolean; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { enabled: boolean }): ComposeChain;
  combinedClickable(options: { onClickLabel: string | null; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { onClickLabel: string | null }): ComposeChain;
  combinedClickable(options: { enabled: boolean; onClickLabel: string | null; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { enabled: boolean; onClickLabel: string | null }): ComposeChain;
  combinedClickable(options: { role: ComposeRole | null; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { role: ComposeRole | null }): ComposeChain;
  combinedClickable(options: { enabled: boolean; role: ComposeRole | null; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { enabled: boolean; role: ComposeRole | null }): ComposeChain;
  combinedClickable(options: { onClickLabel: string | null; role: ComposeRole | null; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { onClickLabel: string | null; role: ComposeRole | null }): ComposeChain;
  combinedClickable(options: { enabled: boolean; onClickLabel: string | null; role: ComposeRole | null; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { enabled: boolean; onClickLabel: string | null; role: ComposeRole | null }): ComposeChain;
  combinedClickable(options: { onLongClickLabel: string | null; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { onLongClickLabel: string | null }): ComposeChain;
  combinedClickable(options: { enabled: boolean; onLongClickLabel: string | null; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { enabled: boolean; onLongClickLabel: string | null }): ComposeChain;
  combinedClickable(options: { onClickLabel: string | null; onLongClickLabel: string | null; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { onClickLabel: string | null; onLongClickLabel: string | null }): ComposeChain;
  combinedClickable(options: { enabled: boolean; onClickLabel: string | null; onLongClickLabel: string | null; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { enabled: boolean; onClickLabel: string | null; onLongClickLabel: string | null }): ComposeChain;
  combinedClickable(options: { role: ComposeRole | null; onLongClickLabel: string | null; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { role: ComposeRole | null; onLongClickLabel: string | null }): ComposeChain;
  combinedClickable(options: { enabled: boolean; role: ComposeRole | null; onLongClickLabel: string | null; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { enabled: boolean; role: ComposeRole | null; onLongClickLabel: string | null }): ComposeChain;
  combinedClickable(options: { onClickLabel: string | null; role: ComposeRole | null; onLongClickLabel: string | null; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { onClickLabel: string | null; role: ComposeRole | null; onLongClickLabel: string | null }): ComposeChain;
  combinedClickable(options: { enabled: boolean; onClickLabel: string | null; role: ComposeRole | null; onLongClickLabel: string | null; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { enabled: boolean; onClickLabel: string | null; role: ComposeRole | null; onLongClickLabel: string | null }): ComposeChain;
  defaultMinSize(): ComposeChain;
  defaultMinSize(options: { minWidth: number }): ComposeChain;
  defaultMinSize(minWidth: number): ComposeChain;
  defaultMinSize(options: { minHeight: number }): ComposeChain;
  defaultMinSize(minHeight: number): ComposeChain;
  defaultMinSize(options: { minWidth: number; minHeight: number }): ComposeChain;
  displayCutoutPadding(): ComposeChain;
  fillMaxHeight(): ComposeChain;
  fillMaxHeight(options: { fraction: number }): ComposeChain;
  fillMaxHeight(fraction: number): ComposeChain;
  fillMaxSize(): ComposeChain;
  fillMaxSize(options: { fraction: number }): ComposeChain;
  fillMaxSize(fraction: number): ComposeChain;
  fillMaxWidth(): ComposeChain;
  fillMaxWidth(options: { fraction: number }): ComposeChain;
  fillMaxWidth(fraction: number): ComposeChain;
  focusable(): ComposeChain;
  focusable(options: { enabled: boolean }): ComposeChain;
  focusable(enabled: boolean): ComposeChain;
  focusGroup(): ComposeChain;
  graphicsLayer(): ComposeChain;
  graphicsLayer(options: { scaleX: number }): ComposeChain;
  graphicsLayer(scaleX: number): ComposeChain;
  graphicsLayer(options: { scaleY: number }): ComposeChain;
  graphicsLayer(scaleY: number): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number }): ComposeChain;
  graphicsLayer(options: { alpha: number }): ComposeChain;
  graphicsLayer(alpha: number): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number }): ComposeChain;
  graphicsLayer(options: { translationX: number }): ComposeChain;
  graphicsLayer(translationX: number): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationX: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationX: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationX: number }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationX: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationX: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationX: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationX: number }): ComposeChain;
  height(options: { height: number }): ComposeChain;
  height(height: number): ComposeChain;
  heightIn(): ComposeChain;
  heightIn(options: { min: number }): ComposeChain;
  heightIn(min: number): ComposeChain;
  heightIn(options: { max: number }): ComposeChain;
  heightIn(max: number): ComposeChain;
  heightIn(options: { min: number; max: number }): ComposeChain;
  imePadding(): ComposeChain;
  mandatorySystemGesturesPadding(): ComposeChain;
  matchParentSize(): ComposeChain;
  navigationBarsPadding(): ComposeChain;
  offset(): ComposeChain;
  offset(options: { x: number }): ComposeChain;
  offset(x: number): ComposeChain;
  offset(options: { y: number }): ComposeChain;
  offset(y: number): ComposeChain;
  offset(options: { x: number; y: number }): ComposeChain;
  padding(options: { all: number }): ComposeChain;
  padding(all: number): ComposeChain;
  padding(): ComposeChain;
  padding(options: { horizontal: number }): ComposeChain;
  padding(horizontal: number): ComposeChain;
  padding(options: { vertical: number }): ComposeChain;
  padding(vertical: number): ComposeChain;
  padding(options: { horizontal: number; vertical: number }): ComposeChain;
  padding(options: { start: number }): ComposeChain;
  padding(start: number): ComposeChain;
  padding(options: { top: number }): ComposeChain;
  padding(top: number): ComposeChain;
  padding(options: { start: number; top: number }): ComposeChain;
  padding(options: { end: number }): ComposeChain;
  padding(end: number): ComposeChain;
  padding(options: { start: number; end: number }): ComposeChain;
  padding(options: { top: number; end: number }): ComposeChain;
  padding(options: { start: number; top: number; end: number }): ComposeChain;
  padding(options: { bottom: number }): ComposeChain;
  padding(bottom: number): ComposeChain;
  padding(options: { start: number; bottom: number }): ComposeChain;
  padding(options: { top: number; bottom: number }): ComposeChain;
  padding(options: { start: number; top: number; bottom: number }): ComposeChain;
  padding(options: { end: number; bottom: number }): ComposeChain;
  padding(options: { start: number; end: number; bottom: number }): ComposeChain;
  padding(options: { top: number; end: number; bottom: number }): ComposeChain;
  padding(options: { start: number; top: number; end: number; bottom: number }): ComposeChain;
  paddingFromBaseline(options: { top: number }): ComposeChain;
  paddingFromBaseline(top: number): ComposeChain;
  paddingFromBaseline(options: { bottom: number }): ComposeChain;
  paddingFromBaseline(bottom: number): ComposeChain;
  paddingFromBaseline(options: { top: number; bottom: number }): ComposeChain;
  preferKeepClear(): ComposeChain;
  progressSemantics(): ComposeChain;
  progressSemantics(options: { value: number }): ComposeChain;
  progressSemantics(value: number): ComposeChain;
  progressSemantics(options: { value: number; steps: number }): ComposeChain;
  progressSemantics(value: number, options: { steps: number }): ComposeChain;
  recalculateWindowInsets(): ComposeChain;
  requiredHeight(options: { height: number }): ComposeChain;
  requiredHeight(height: number): ComposeChain;
  requiredHeightIn(): ComposeChain;
  requiredHeightIn(options: { min: number }): ComposeChain;
  requiredHeightIn(min: number): ComposeChain;
  requiredHeightIn(options: { max: number }): ComposeChain;
  requiredHeightIn(max: number): ComposeChain;
  requiredHeightIn(options: { min: number; max: number }): ComposeChain;
  requiredSize(options: { size: number }): ComposeChain;
  requiredSize(size: number): ComposeChain;
  requiredSize(options: { width: number; height: number }): ComposeChain;
  requiredSizeIn(): ComposeChain;
  requiredSizeIn(options: { minWidth: number }): ComposeChain;
  requiredSizeIn(minWidth: number): ComposeChain;
  requiredSizeIn(options: { minHeight: number }): ComposeChain;
  requiredSizeIn(minHeight: number): ComposeChain;
  requiredSizeIn(options: { minWidth: number; minHeight: number }): ComposeChain;
  requiredSizeIn(options: { maxWidth: number }): ComposeChain;
  requiredSizeIn(maxWidth: number): ComposeChain;
  requiredSizeIn(options: { minWidth: number; maxWidth: number }): ComposeChain;
  requiredSizeIn(options: { minHeight: number; maxWidth: number }): ComposeChain;
  requiredSizeIn(options: { minWidth: number; minHeight: number; maxWidth: number }): ComposeChain;
  requiredSizeIn(options: { maxHeight: number }): ComposeChain;
  requiredSizeIn(maxHeight: number): ComposeChain;
  requiredSizeIn(options: { minWidth: number; maxHeight: number }): ComposeChain;
  requiredSizeIn(options: { minHeight: number; maxHeight: number }): ComposeChain;
  requiredSizeIn(options: { minWidth: number; minHeight: number; maxHeight: number }): ComposeChain;
  requiredSizeIn(options: { maxWidth: number; maxHeight: number }): ComposeChain;
  requiredSizeIn(options: { minWidth: number; maxWidth: number; maxHeight: number }): ComposeChain;
  requiredSizeIn(options: { minHeight: number; maxWidth: number; maxHeight: number }): ComposeChain;
  requiredSizeIn(options: { minWidth: number; minHeight: number; maxWidth: number; maxHeight: number }): ComposeChain;
  requiredWidth(options: { width: number }): ComposeChain;
  requiredWidth(width: number): ComposeChain;
  requiredWidthIn(): ComposeChain;
  requiredWidthIn(options: { min: number }): ComposeChain;
  requiredWidthIn(min: number): ComposeChain;
  requiredWidthIn(options: { max: number }): ComposeChain;
  requiredWidthIn(max: number): ComposeChain;
  requiredWidthIn(options: { min: number; max: number }): ComposeChain;
  rotate(options: { degrees: number }): ComposeChain;
  rotate(degrees: number): ComposeChain;
  safeContentPadding(): ComposeChain;
  safeDrawingPadding(): ComposeChain;
  safeGesturesPadding(): ComposeChain;
  scale(options: { scale: number }): ComposeChain;
  scale(scale: number): ComposeChain;
  scale(options: { scaleX: number; scaleY: number }): ComposeChain;
  selectable(options: { selected: boolean; onClick: () => void }): ComposeChain;
  selectable(options: { selected: boolean; enabled: boolean; onClick: () => void }): ComposeChain;
  selectable(options: { selected: boolean; role: ComposeRole | null; onClick: () => void }): ComposeChain;
  selectable(options: { selected: boolean; enabled: boolean; role: ComposeRole | null; onClick: () => void }): ComposeChain;
  selectableGroup(): ComposeChain;
  sensitiveContent(): ComposeChain;
  sensitiveContent(options: { isContentSensitive: boolean }): ComposeChain;
  sensitiveContent(isContentSensitive: boolean): ComposeChain;
  shadow(options: { elevation: number }): ComposeChain;
  shadow(elevation: number): ComposeChain;
  shadow(options: { elevation: number; shape: ComposeShape }): ComposeChain;
  shadow(elevation: number, options: { shape: ComposeShape }): ComposeChain;
  shadow(options: { elevation: number; clip: boolean }): ComposeChain;
  shadow(elevation: number, options: { clip: boolean }): ComposeChain;
  shadow(options: { elevation: number; shape: ComposeShape; clip: boolean }): ComposeChain;
  shadow(elevation: number, options: { shape: ComposeShape; clip: boolean }): ComposeChain;
  shadow(options: { elevation: number; ambientColor: string }): ComposeChain;
  shadow(elevation: number, options: { ambientColor: string }): ComposeChain;
  shadow(options: { elevation: number; shape: ComposeShape; ambientColor: string }): ComposeChain;
  shadow(elevation: number, options: { shape: ComposeShape; ambientColor: string }): ComposeChain;
  shadow(options: { elevation: number; clip: boolean; ambientColor: string }): ComposeChain;
  shadow(elevation: number, options: { clip: boolean; ambientColor: string }): ComposeChain;
  shadow(options: { elevation: number; shape: ComposeShape; clip: boolean; ambientColor: string }): ComposeChain;
  shadow(elevation: number, options: { shape: ComposeShape; clip: boolean; ambientColor: string }): ComposeChain;
  shadow(options: { elevation: number; spotColor: string }): ComposeChain;
  shadow(elevation: number, options: { spotColor: string }): ComposeChain;
  shadow(options: { elevation: number; shape: ComposeShape; spotColor: string }): ComposeChain;
  shadow(elevation: number, options: { shape: ComposeShape; spotColor: string }): ComposeChain;
  shadow(options: { elevation: number; clip: boolean; spotColor: string }): ComposeChain;
  shadow(elevation: number, options: { clip: boolean; spotColor: string }): ComposeChain;
  shadow(options: { elevation: number; shape: ComposeShape; clip: boolean; spotColor: string }): ComposeChain;
  shadow(elevation: number, options: { shape: ComposeShape; clip: boolean; spotColor: string }): ComposeChain;
  shadow(options: { elevation: number; ambientColor: string; spotColor: string }): ComposeChain;
  shadow(elevation: number, options: { ambientColor: string; spotColor: string }): ComposeChain;
  shadow(options: { elevation: number; shape: ComposeShape; ambientColor: string; spotColor: string }): ComposeChain;
  shadow(elevation: number, options: { shape: ComposeShape; ambientColor: string; spotColor: string }): ComposeChain;
  shadow(options: { elevation: number; clip: boolean; ambientColor: string; spotColor: string }): ComposeChain;
  shadow(elevation: number, options: { clip: boolean; ambientColor: string; spotColor: string }): ComposeChain;
  shadow(options: { elevation: number; shape: ComposeShape; clip: boolean; ambientColor: string; spotColor: string }): ComposeChain;
  shadow(elevation: number, options: { shape: ComposeShape; clip: boolean; ambientColor: string; spotColor: string }): ComposeChain;
  size(options: { size: number }): ComposeChain;
  size(size: number): ComposeChain;
  size(options: { width: number; height: number }): ComposeChain;
  sizeIn(): ComposeChain;
  sizeIn(options: { minWidth: number }): ComposeChain;
  sizeIn(minWidth: number): ComposeChain;
  sizeIn(options: { minHeight: number }): ComposeChain;
  sizeIn(minHeight: number): ComposeChain;
  sizeIn(options: { minWidth: number; minHeight: number }): ComposeChain;
  sizeIn(options: { maxWidth: number }): ComposeChain;
  sizeIn(maxWidth: number): ComposeChain;
  sizeIn(options: { minWidth: number; maxWidth: number }): ComposeChain;
  sizeIn(options: { minHeight: number; maxWidth: number }): ComposeChain;
  sizeIn(options: { minWidth: number; minHeight: number; maxWidth: number }): ComposeChain;
  sizeIn(options: { maxHeight: number }): ComposeChain;
  sizeIn(maxHeight: number): ComposeChain;
  sizeIn(options: { minWidth: number; maxHeight: number }): ComposeChain;
  sizeIn(options: { minHeight: number; maxHeight: number }): ComposeChain;
  sizeIn(options: { minWidth: number; minHeight: number; maxHeight: number }): ComposeChain;
  sizeIn(options: { maxWidth: number; maxHeight: number }): ComposeChain;
  sizeIn(options: { minWidth: number; maxWidth: number; maxHeight: number }): ComposeChain;
  sizeIn(options: { minHeight: number; maxWidth: number; maxHeight: number }): ComposeChain;
  sizeIn(options: { minWidth: number; minHeight: number; maxWidth: number; maxHeight: number }): ComposeChain;
  statusBarsPadding(): ComposeChain;
  systemBarsPadding(): ComposeChain;
  systemGestureExclusion(): ComposeChain;
  systemGesturesPadding(): ComposeChain;
  testTag(options: { tag: string }): ComposeChain;
  testTag(tag: string): ComposeChain;
  toggleable(options: { value: boolean; onValueChange: (value: boolean) => void }): ComposeChain;
  toggleable(options: { value: boolean; enabled: boolean; onValueChange: (value: boolean) => void }): ComposeChain;
  toggleable(options: { value: boolean; role: ComposeRole | null; onValueChange: (value: boolean) => void }): ComposeChain;
  toggleable(options: { value: boolean; enabled: boolean; role: ComposeRole | null; onValueChange: (value: boolean) => void }): ComposeChain;
  toolingGraphicsLayer(): ComposeChain;
  waterfallPadding(): ComposeChain;
  weight(options: { weight: number }): ComposeChain;
  weight(weight: number): ComposeChain;
  weight(options: { weight: number; fill: boolean }): ComposeChain;
  weight(weight: number, options: { fill: boolean }): ComposeChain;
  width(options: { width: number }): ComposeChain;
  width(width: number): ComposeChain;
  widthIn(): ComposeChain;
  widthIn(options: { min: number }): ComposeChain;
  widthIn(min: number): ComposeChain;
  widthIn(options: { max: number }): ComposeChain;
  widthIn(max: number): ComposeChain;
  widthIn(options: { min: number; max: number }): ComposeChain;
  wrapContentHeight(): ComposeChain;
  wrapContentHeight(options: { align: ComposeVerticalAlignment }): ComposeChain;
  wrapContentHeight(align: ComposeVerticalAlignment): ComposeChain;
  wrapContentHeight(options: { unbounded: boolean }): ComposeChain;
  wrapContentHeight(unbounded: boolean): ComposeChain;
  wrapContentHeight(options: { align: ComposeVerticalAlignment; unbounded: boolean }): ComposeChain;
  wrapContentSize(): ComposeChain;
  wrapContentSize(options: { align: ComposeAlignment }): ComposeChain;
  wrapContentSize(align: ComposeAlignment): ComposeChain;
  wrapContentSize(options: { unbounded: boolean }): ComposeChain;
  wrapContentSize(unbounded: boolean): ComposeChain;
  wrapContentSize(options: { align: ComposeAlignment; unbounded: boolean }): ComposeChain;
  wrapContentWidth(): ComposeChain;
  wrapContentWidth(options: { align: ComposeHorizontalAlignment }): ComposeChain;
  wrapContentWidth(align: ComposeHorizontalAlignment): ComposeChain;
  wrapContentWidth(options: { unbounded: boolean }): ComposeChain;
  wrapContentWidth(unbounded: boolean): ComposeChain;
  wrapContentWidth(options: { align: ComposeHorizontalAlignment; unbounded: boolean }): ComposeChain;
  zIndex(options: { zIndex: number }): ComposeChain;
  zIndex(zIndex: number): ComposeChain;
}

export type ComposeChain = GeneratedModifiers & ModifierCompatibility<ComposeChain> & ModifierPayload;

export type Modifier = ComposeChain;

export const Modifier = createModifier({
  "background": [
    { id: 1, primary: "color", labels: {"shape":"in"}, forms: [[["color","string",false]],[["color","string",false],["shape","shape",false]]] },
    { id: 0, primary: "brush", labels: {"shape":"in"}, forms: [[["brush","brush",false]],[["brush","brush",false],["shape","shape",false]],[["brush","brush",false],["alpha","number",false]],[["brush","brush",false],["shape","shape",false],["alpha","number",false]]] },
  ],
  "basicMarquee": [
    { id: 2, forms: [[],[["iterations","number",false]],[["repeatDelayMillis","number",false]],[["iterations","number",false],["repeatDelayMillis","number",false]],[["initialDelayMillis","number",false]],[["iterations","number",false],["initialDelayMillis","number",false]],[["repeatDelayMillis","number",false],["initialDelayMillis","number",false]],[["iterations","number",false],["repeatDelayMillis","number",false],["initialDelayMillis","number",false]],[["velocity","number",false]],[["iterations","number",false],["velocity","number",false]],[["repeatDelayMillis","number",false],["velocity","number",false]],[["iterations","number",false],["repeatDelayMillis","number",false],["velocity","number",false]],[["initialDelayMillis","number",false],["velocity","number",false]],[["iterations","number",false],["initialDelayMillis","number",false],["velocity","number",false]],[["repeatDelayMillis","number",false],["initialDelayMillis","number",false],["velocity","number",false]],[["iterations","number",false],["repeatDelayMillis","number",false],["initialDelayMillis","number",false],["velocity","number",false]]] },
  ],
  "border": [
    { id: 4, primary: "color", forms: [[["width","number",false],["color","string",false]],[["width","number",false],["color","string",false],["shape","shape",false]]] },
    { id: 3, primary: "brush", forms: [[["width","number",false],["brush","brush",false],["shape","shape",false]]] },
  ],
  "clickable": [
    { id: 5, primary: "onClick", forms: [[["onClick","function",false]],[["enabled","boolean",false],["onClick","function",false]],[["onClickLabel","string",true],["onClick","function",false]],[["enabled","boolean",false],["onClickLabel","string",true],["onClick","function",false]],[["role","string",true],["onClick","function",false]],[["enabled","boolean",false],["role","string",true],["onClick","function",false]],[["onClickLabel","string",true],["role","string",true],["onClick","function",false]],[["enabled","boolean",false],["onClickLabel","string",true],["role","string",true],["onClick","function",false]]] },
  ],
  "combinedClickable": [
    { id: 6, primary: "onClick", forms: [[["onClick","function",false]],[["enabled","boolean",false],["onClick","function",false]],[["onClickLabel","string",true],["onClick","function",false]],[["enabled","boolean",false],["onClickLabel","string",true],["onClick","function",false]],[["role","string",true],["onClick","function",false]],[["enabled","boolean",false],["role","string",true],["onClick","function",false]],[["onClickLabel","string",true],["role","string",true],["onClick","function",false]],[["enabled","boolean",false],["onClickLabel","string",true],["role","string",true],["onClick","function",false]],[["onLongClickLabel","string",true],["onClick","function",false]],[["enabled","boolean",false],["onLongClickLabel","string",true],["onClick","function",false]],[["onClickLabel","string",true],["onLongClickLabel","string",true],["onClick","function",false]],[["enabled","boolean",false],["onClickLabel","string",true],["onLongClickLabel","string",true],["onClick","function",false]],[["role","string",true],["onLongClickLabel","string",true],["onClick","function",false]],[["enabled","boolean",false],["role","string",true],["onLongClickLabel","string",true],["onClick","function",false]],[["onClickLabel","string",true],["role","string",true],["onLongClickLabel","string",true],["onClick","function",false]],[["enabled","boolean",false],["onClickLabel","string",true],["role","string",true],["onLongClickLabel","string",true],["onClick","function",false]]] },
  ],
  "focusGroup": [
    { id: 7, forms: [[]] },
  ],
  "focusable": [
    { id: 8, forms: [[],[["enabled","boolean",false]]] },
  ],
  "align": [
    { id: 9, primary: "alignment", forms: [[["alignment","string",false]]] },
    { id: 11, primary: "alignment", forms: [[["alignment","string",false]]] },
    { id: 13, primary: "alignment", forms: [[["alignment","string",false]]] },
  ],
  "matchParentSize": [
    { id: 10, forms: [[]] },
  ],
  "weight": [
    { id: 12, primary: "weight", forms: [[["weight","number",false]],[["weight","number",false],["fill","boolean",false]]] },
    { id: 15, primary: "weight", forms: [[["weight","number",false]],[["weight","number",false],["fill","boolean",false]]] },
  ],
  "alignByBaseline": [
    { id: 14, forms: [[]] },
  ],
  "absoluteOffset": [
    { id: 16, forms: [[],[["x","number",false]],[["y","number",false]],[["x","number",false],["y","number",false]]] },
  ],
  "absolutePadding": [
    { id: 17, forms: [[],[["left","number",false]],[["top","number",false]],[["left","number",false],["top","number",false]],[["right","number",false]],[["left","number",false],["right","number",false]],[["top","number",false],["right","number",false]],[["left","number",false],["top","number",false],["right","number",false]],[["bottom","number",false]],[["left","number",false],["bottom","number",false]],[["top","number",false],["bottom","number",false]],[["left","number",false],["top","number",false],["bottom","number",false]],[["right","number",false],["bottom","number",false]],[["left","number",false],["right","number",false],["bottom","number",false]],[["top","number",false],["right","number",false],["bottom","number",false]],[["left","number",false],["top","number",false],["right","number",false],["bottom","number",false]]] },
  ],
  "aspectRatio": [
    { id: 18, primary: "ratio", forms: [[["ratio","number",false]],[["ratio","number",false],["matchHeightConstraintsFirst","boolean",false]]] },
  ],
  "captionBarPadding": [
    { id: 19, forms: [[]] },
  ],
  "defaultMinSize": [
    { id: 20, forms: [[],[["minWidth","number",false]],[["minHeight","number",false]],[["minWidth","number",false],["minHeight","number",false]]] },
  ],
  "displayCutoutPadding": [
    { id: 21, forms: [[]] },
  ],
  "fillMaxHeight": [
    { id: 22, forms: [[],[["fraction","number",false]]] },
  ],
  "fillMaxSize": [
    { id: 23, forms: [[],[["fraction","number",false]]] },
  ],
  "fillMaxWidth": [
    { id: 24, forms: [[],[["fraction","number",false]]] },
  ],
  "height": [
    { id: 25, primary: "height", forms: [[["height","number",false]]] },
  ],
  "heightIn": [
    { id: 26, forms: [[],[["min","number",false]],[["max","number",false]],[["min","number",false],["max","number",false]]] },
  ],
  "imePadding": [
    { id: 27, forms: [[]] },
  ],
  "mandatorySystemGesturesPadding": [
    { id: 28, forms: [[]] },
  ],
  "navigationBarsPadding": [
    { id: 29, forms: [[]] },
  ],
  "offset": [
    { id: 30, forms: [[],[["x","number",false]],[["y","number",false]],[["x","number",false],["y","number",false]]] },
  ],
  "padding": [
    { id: 31, primary: "all", forms: [[["all","number",false]]] },
    { id: 32, forms: [[],[["horizontal","number",false]],[["vertical","number",false]],[["horizontal","number",false],["vertical","number",false]]] },
    { id: 33, forms: [[["start","number",false]],[["top","number",false]],[["start","number",false],["top","number",false]],[["end","number",false]],[["start","number",false],["end","number",false]],[["top","number",false],["end","number",false]],[["start","number",false],["top","number",false],["end","number",false]],[["bottom","number",false]],[["start","number",false],["bottom","number",false]],[["top","number",false],["bottom","number",false]],[["start","number",false],["top","number",false],["bottom","number",false]],[["end","number",false],["bottom","number",false]],[["start","number",false],["end","number",false],["bottom","number",false]],[["top","number",false],["end","number",false],["bottom","number",false]],[["start","number",false],["top","number",false],["end","number",false],["bottom","number",false]]] },
  ],
  "paddingFromBaseline": [
    { id: 34, forms: [[["top","number",false]],[["bottom","number",false]],[["top","number",false],["bottom","number",false]]] },
    { id: 35, forms: [[["top","number",false]],[["bottom","number",false]],[["top","number",false],["bottom","number",false]]] },
  ],
  "recalculateWindowInsets": [
    { id: 36, forms: [[]] },
  ],
  "requiredHeight": [
    { id: 37, primary: "height", forms: [[["height","number",false]]] },
  ],
  "requiredHeightIn": [
    { id: 38, forms: [[],[["min","number",false]],[["max","number",false]],[["min","number",false],["max","number",false]]] },
  ],
  "requiredSize": [
    { id: 39, primary: "size", forms: [[["size","number",false]]] },
    { id: 40, forms: [[["width","number",false],["height","number",false]]] },
  ],
  "requiredSizeIn": [
    { id: 41, forms: [[],[["minWidth","number",false]],[["minHeight","number",false]],[["minWidth","number",false],["minHeight","number",false]],[["maxWidth","number",false]],[["minWidth","number",false],["maxWidth","number",false]],[["minHeight","number",false],["maxWidth","number",false]],[["minWidth","number",false],["minHeight","number",false],["maxWidth","number",false]],[["maxHeight","number",false]],[["minWidth","number",false],["maxHeight","number",false]],[["minHeight","number",false],["maxHeight","number",false]],[["minWidth","number",false],["minHeight","number",false],["maxHeight","number",false]],[["maxWidth","number",false],["maxHeight","number",false]],[["minWidth","number",false],["maxWidth","number",false],["maxHeight","number",false]],[["minHeight","number",false],["maxWidth","number",false],["maxHeight","number",false]],[["minWidth","number",false],["minHeight","number",false],["maxWidth","number",false],["maxHeight","number",false]]] },
  ],
  "requiredWidth": [
    { id: 42, primary: "width", forms: [[["width","number",false]]] },
  ],
  "requiredWidthIn": [
    { id: 43, forms: [[],[["min","number",false]],[["max","number",false]],[["min","number",false],["max","number",false]]] },
  ],
  "safeContentPadding": [
    { id: 44, forms: [[]] },
  ],
  "safeDrawingPadding": [
    { id: 45, forms: [[]] },
  ],
  "safeGesturesPadding": [
    { id: 46, forms: [[]] },
  ],
  "size": [
    { id: 47, primary: "size", forms: [[["size","number",false]]] },
    { id: 48, forms: [[["width","number",false],["height","number",false]]] },
  ],
  "sizeIn": [
    { id: 49, forms: [[],[["minWidth","number",false]],[["minHeight","number",false]],[["minWidth","number",false],["minHeight","number",false]],[["maxWidth","number",false]],[["minWidth","number",false],["maxWidth","number",false]],[["minHeight","number",false],["maxWidth","number",false]],[["minWidth","number",false],["minHeight","number",false],["maxWidth","number",false]],[["maxHeight","number",false]],[["minWidth","number",false],["maxHeight","number",false]],[["minHeight","number",false],["maxHeight","number",false]],[["minWidth","number",false],["minHeight","number",false],["maxHeight","number",false]],[["maxWidth","number",false],["maxHeight","number",false]],[["minWidth","number",false],["maxWidth","number",false],["maxHeight","number",false]],[["minHeight","number",false],["maxWidth","number",false],["maxHeight","number",false]],[["minWidth","number",false],["minHeight","number",false],["maxWidth","number",false],["maxHeight","number",false]]] },
  ],
  "statusBarsPadding": [
    { id: 50, forms: [[]] },
  ],
  "systemBarsPadding": [
    { id: 51, forms: [[]] },
  ],
  "systemGesturesPadding": [
    { id: 52, forms: [[]] },
  ],
  "waterfallPadding": [
    { id: 53, forms: [[]] },
  ],
  "width": [
    { id: 54, primary: "width", forms: [[["width","number",false]]] },
  ],
  "widthIn": [
    { id: 55, forms: [[],[["min","number",false]],[["max","number",false]],[["min","number",false],["max","number",false]]] },
  ],
  "wrapContentHeight": [
    { id: 56, forms: [[],[["align","string",false]],[["unbounded","boolean",false]],[["align","string",false],["unbounded","boolean",false]]] },
  ],
  "wrapContentSize": [
    { id: 57, forms: [[],[["align","string",false]],[["unbounded","boolean",false]],[["align","string",false],["unbounded","boolean",false]]] },
  ],
  "wrapContentWidth": [
    { id: 58, forms: [[],[["align","string",false]],[["unbounded","boolean",false]],[["align","string",false],["unbounded","boolean",false]]] },
  ],
  "preferKeepClear": [
    { id: 59, forms: [[]] },
  ],
  "progressSemantics": [
    { id: 60, forms: [[]] },
    { id: 61, primary: "value", forms: [[["value","number",false]],[["value","number",false],["steps","number",false]]] },
  ],
  "selectable": [
    { id: 62, forms: [[["selected","boolean",false],["onClick","function",false]],[["selected","boolean",false],["enabled","boolean",false],["onClick","function",false]],[["selected","boolean",false],["role","string",true],["onClick","function",false]],[["selected","boolean",false],["enabled","boolean",false],["role","string",true],["onClick","function",false]]] },
  ],
  "selectableGroup": [
    { id: 63, forms: [[]] },
  ],
  "toggleable": [
    { id: 64, forms: [[["value","boolean",false],["onValueChange","function",false]],[["value","boolean",false],["enabled","boolean",false],["onValueChange","function",false]],[["value","boolean",false],["role","string",true],["onValueChange","function",false]],[["value","boolean",false],["enabled","boolean",false],["role","string",true],["onValueChange","function",false]]] },
  ],
  "systemGestureExclusion": [
    { id: 65, forms: [[]] },
  ],
  "alpha": [
    { id: 66, primary: "alpha", forms: [[["alpha","number",false]]] },
  ],
  "blur": [
    { id: 67, primary: "radius", forms: [[["radius","number",false]]] },
    { id: 68, forms: [[["radiusX","number",false],["radiusY","number",false]]] },
  ],
  "clip": [
    { id: 69, primary: "shape", forms: [[["shape","shape",false]]] },
  ],
  "clipToBounds": [
    { id: 70, forms: [[]] },
  ],
  "rotate": [
    { id: 71, primary: "degrees", forms: [[["degrees","number",false]]] },
  ],
  "scale": [
    { id: 72, primary: "scale", forms: [[["scale","number",false]]] },
    { id: 73, forms: [[["scaleX","number",false],["scaleY","number",false]]] },
  ],
  "shadow": [
    { id: 74, primary: "elevation", forms: [[["elevation","number",false]],[["elevation","number",false],["shape","shape",false]],[["elevation","number",false],["clip","boolean",false]],[["elevation","number",false],["shape","shape",false],["clip","boolean",false]],[["elevation","number",false],["ambientColor","string",false]],[["elevation","number",false],["shape","shape",false],["ambientColor","string",false]],[["elevation","number",false],["clip","boolean",false],["ambientColor","string",false]],[["elevation","number",false],["shape","shape",false],["clip","boolean",false],["ambientColor","string",false]],[["elevation","number",false],["spotColor","string",false]],[["elevation","number",false],["shape","shape",false],["spotColor","string",false]],[["elevation","number",false],["clip","boolean",false],["spotColor","string",false]],[["elevation","number",false],["shape","shape",false],["clip","boolean",false],["spotColor","string",false]],[["elevation","number",false],["ambientColor","string",false],["spotColor","string",false]],[["elevation","number",false],["shape","shape",false],["ambientColor","string",false],["spotColor","string",false]],[["elevation","number",false],["clip","boolean",false],["ambientColor","string",false],["spotColor","string",false]],[["elevation","number",false],["shape","shape",false],["clip","boolean",false],["ambientColor","string",false],["spotColor","string",false]]] },
  ],
  "graphicsLayer": [
    { id: 75, forms: [[],[["scaleX","number",false]],[["scaleY","number",false]],[["scaleX","number",false],["scaleY","number",false]],[["alpha","number",false]],[["scaleX","number",false],["alpha","number",false]],[["scaleY","number",false],["alpha","number",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false]],[["translationX","number",false]],[["scaleX","number",false],["translationX","number",false]],[["scaleY","number",false],["translationX","number",false]],[["scaleX","number",false],["scaleY","number",false],["translationX","number",false]],[["alpha","number",false],["translationX","number",false]],[["scaleX","number",false],["alpha","number",false],["translationX","number",false]],[["scaleY","number",false],["alpha","number",false],["translationX","number",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationX","number",false]]] },
  ],
  "toolingGraphicsLayer": [
    { id: 76, forms: [[]] },
  ],
  "testTag": [
    { id: 77, primary: "tag", forms: [[["tag","string",false]]] },
  ],
  "sensitiveContent": [
    { id: 78, forms: [[],[["isContentSensitive","boolean",false]]] },
  ],
  "zIndex": [
    { id: 79, primary: "zIndex", forms: [[["zIndex","number",false]]] },
  ],
}) as Modifier;
