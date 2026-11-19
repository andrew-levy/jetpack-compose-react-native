// Generated from Compose declarations by generate.mjs.
import { createModifier, type ComposeBrush, type ComposeShape, type ModifierCompatibility, type ModifierPayload } from "../utils/modifier";
import type { ComposeAlignment, ComposeHorizontalAlignment, ComposeRole, ComposeVerticalAlignment } from "./values";

interface GeneratedModifiers {
  absoluteOffset(): Modifier;
  absoluteOffset(options: { x: number }): Modifier;
  absoluteOffset(x: number): Modifier;
  absoluteOffset(options: { y: number }): Modifier;
  absoluteOffset(y: number): Modifier;
  absoluteOffset(options: { x: number; y: number }): Modifier;
  absolutePadding(): Modifier;
  absolutePadding(options: { left: number }): Modifier;
  absolutePadding(left: number): Modifier;
  absolutePadding(options: { top: number }): Modifier;
  absolutePadding(top: number): Modifier;
  absolutePadding(options: { left: number; top: number }): Modifier;
  absolutePadding(options: { right: number }): Modifier;
  absolutePadding(right: number): Modifier;
  absolutePadding(options: { left: number; right: number }): Modifier;
  absolutePadding(options: { top: number; right: number }): Modifier;
  absolutePadding(options: { left: number; top: number; right: number }): Modifier;
  absolutePadding(options: { bottom: number }): Modifier;
  absolutePadding(bottom: number): Modifier;
  absolutePadding(options: { left: number; bottom: number }): Modifier;
  absolutePadding(options: { top: number; bottom: number }): Modifier;
  absolutePadding(options: { left: number; top: number; bottom: number }): Modifier;
  absolutePadding(options: { right: number; bottom: number }): Modifier;
  absolutePadding(options: { left: number; right: number; bottom: number }): Modifier;
  absolutePadding(options: { top: number; right: number; bottom: number }): Modifier;
  absolutePadding(options: { left: number; top: number; right: number; bottom: number }): Modifier;
  align(options: { alignment: ComposeAlignment }): Modifier;
  align(alignment: ComposeAlignment): Modifier;
  align(options: { alignment: ComposeHorizontalAlignment }): Modifier;
  align(alignment: ComposeHorizontalAlignment): Modifier;
  align(options: { alignment: ComposeVerticalAlignment }): Modifier;
  align(alignment: ComposeVerticalAlignment): Modifier;
  alignByBaseline(): Modifier;
  alpha(options: { alpha: number }): Modifier;
  alpha(alpha: number): Modifier;
  aspectRatio(options: { ratio: number }): Modifier;
  aspectRatio(ratio: number): Modifier;
  aspectRatio(options: { ratio: number; matchHeightConstraintsFirst: boolean }): Modifier;
  background(options: { brush: ComposeBrush }): Modifier;
  background(options: { brush: ComposeBrush; shape: ComposeShape }): Modifier;
  background(options: { brush: ComposeBrush; alpha: number }): Modifier;
  background(options: { brush: ComposeBrush; shape: ComposeShape; alpha: number }): Modifier;
  background(options: { color: string }): Modifier;
  background(color: string): Modifier;
  background(options: { color: string; shape: ComposeShape }): Modifier;
  basicMarquee(): Modifier;
  basicMarquee(options: { iterations: number }): Modifier;
  basicMarquee(iterations: number): Modifier;
  basicMarquee(options: { repeatDelayMillis: number }): Modifier;
  basicMarquee(repeatDelayMillis: number): Modifier;
  basicMarquee(options: { iterations: number; repeatDelayMillis: number }): Modifier;
  basicMarquee(options: { initialDelayMillis: number }): Modifier;
  basicMarquee(initialDelayMillis: number): Modifier;
  basicMarquee(options: { iterations: number; initialDelayMillis: number }): Modifier;
  basicMarquee(options: { repeatDelayMillis: number; initialDelayMillis: number }): Modifier;
  basicMarquee(options: { iterations: number; repeatDelayMillis: number; initialDelayMillis: number }): Modifier;
  basicMarquee(options: { velocity: number }): Modifier;
  basicMarquee(velocity: number): Modifier;
  basicMarquee(options: { iterations: number; velocity: number }): Modifier;
  basicMarquee(options: { repeatDelayMillis: number; velocity: number }): Modifier;
  basicMarquee(options: { iterations: number; repeatDelayMillis: number; velocity: number }): Modifier;
  basicMarquee(options: { initialDelayMillis: number; velocity: number }): Modifier;
  basicMarquee(options: { iterations: number; initialDelayMillis: number; velocity: number }): Modifier;
  basicMarquee(options: { repeatDelayMillis: number; initialDelayMillis: number; velocity: number }): Modifier;
  basicMarquee(options: { iterations: number; repeatDelayMillis: number; initialDelayMillis: number; velocity: number }): Modifier;
  blur(options: { radius: number }): Modifier;
  blur(radius: number): Modifier;
  blur(options: { radiusX: number; radiusY: number }): Modifier;
  border(options: { width: number; brush: ComposeBrush; shape: ComposeShape }): Modifier;
  border(options: { width: number; color: string }): Modifier;
  border(options: { width: number; color: string; shape: ComposeShape }): Modifier;
  captionBarPadding(): Modifier;
  clickable(options: { onClick: () => void }): Modifier;
  clickable(onClick: () => void): Modifier;
  clickable(options: { enabled: boolean; onClick: () => void }): Modifier;
  clickable(options: { onClickLabel: string | null; onClick: () => void }): Modifier;
  clickable(options: { enabled: boolean; onClickLabel: string | null; onClick: () => void }): Modifier;
  clickable(options: { role: ComposeRole | null; onClick: () => void }): Modifier;
  clickable(options: { enabled: boolean; role: ComposeRole | null; onClick: () => void }): Modifier;
  clickable(options: { onClickLabel: string | null; role: ComposeRole | null; onClick: () => void }): Modifier;
  clickable(options: { enabled: boolean; onClickLabel: string | null; role: ComposeRole | null; onClick: () => void }): Modifier;
  clip(options: { shape: ComposeShape }): Modifier;
  clipToBounds(): Modifier;
  defaultMinSize(): Modifier;
  defaultMinSize(options: { minWidth: number }): Modifier;
  defaultMinSize(minWidth: number): Modifier;
  defaultMinSize(options: { minHeight: number }): Modifier;
  defaultMinSize(minHeight: number): Modifier;
  defaultMinSize(options: { minWidth: number; minHeight: number }): Modifier;
  displayCutoutPadding(): Modifier;
  fillMaxHeight(): Modifier;
  fillMaxHeight(options: { fraction: number }): Modifier;
  fillMaxHeight(fraction: number): Modifier;
  fillMaxSize(): Modifier;
  fillMaxSize(options: { fraction: number }): Modifier;
  fillMaxSize(fraction: number): Modifier;
  fillMaxWidth(): Modifier;
  fillMaxWidth(options: { fraction: number }): Modifier;
  fillMaxWidth(fraction: number): Modifier;
  focusable(): Modifier;
  focusable(options: { enabled: boolean }): Modifier;
  focusable(enabled: boolean): Modifier;
  focusGroup(): Modifier;
  graphicsLayer(): Modifier;
  graphicsLayer(options: { scaleX: number }): Modifier;
  graphicsLayer(scaleX: number): Modifier;
  graphicsLayer(options: { scaleY: number }): Modifier;
  graphicsLayer(scaleY: number): Modifier;
  graphicsLayer(options: { scaleX: number; scaleY: number }): Modifier;
  graphicsLayer(options: { alpha: number }): Modifier;
  graphicsLayer(alpha: number): Modifier;
  graphicsLayer(options: { scaleX: number; alpha: number }): Modifier;
  graphicsLayer(options: { scaleY: number; alpha: number }): Modifier;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number }): Modifier;
  graphicsLayer(options: { translationX: number }): Modifier;
  graphicsLayer(translationX: number): Modifier;
  graphicsLayer(options: { scaleX: number; translationX: number }): Modifier;
  graphicsLayer(options: { scaleY: number; translationX: number }): Modifier;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationX: number }): Modifier;
  graphicsLayer(options: { alpha: number; translationX: number }): Modifier;
  graphicsLayer(options: { scaleX: number; alpha: number; translationX: number }): Modifier;
  graphicsLayer(options: { scaleY: number; alpha: number; translationX: number }): Modifier;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationX: number }): Modifier;
  height(options: { height: number }): Modifier;
  height(height: number): Modifier;
  heightIn(): Modifier;
  heightIn(options: { min: number }): Modifier;
  heightIn(min: number): Modifier;
  heightIn(options: { max: number }): Modifier;
  heightIn(max: number): Modifier;
  heightIn(options: { min: number; max: number }): Modifier;
  imePadding(): Modifier;
  mandatorySystemGesturesPadding(): Modifier;
  matchParentSize(): Modifier;
  navigationBarsPadding(): Modifier;
  offset(): Modifier;
  offset(options: { x: number }): Modifier;
  offset(x: number): Modifier;
  offset(options: { y: number }): Modifier;
  offset(y: number): Modifier;
  offset(options: { x: number; y: number }): Modifier;
  padding(options: { all: number }): Modifier;
  padding(all: number): Modifier;
  padding(): Modifier;
  padding(options: { horizontal: number }): Modifier;
  padding(horizontal: number): Modifier;
  padding(options: { vertical: number }): Modifier;
  padding(vertical: number): Modifier;
  padding(options: { horizontal: number; vertical: number }): Modifier;
  padding(options: { start: number }): Modifier;
  padding(start: number): Modifier;
  padding(options: { top: number }): Modifier;
  padding(top: number): Modifier;
  padding(options: { start: number; top: number }): Modifier;
  padding(options: { end: number }): Modifier;
  padding(end: number): Modifier;
  padding(options: { start: number; end: number }): Modifier;
  padding(options: { top: number; end: number }): Modifier;
  padding(options: { start: number; top: number; end: number }): Modifier;
  padding(options: { bottom: number }): Modifier;
  padding(bottom: number): Modifier;
  padding(options: { start: number; bottom: number }): Modifier;
  padding(options: { top: number; bottom: number }): Modifier;
  padding(options: { start: number; top: number; bottom: number }): Modifier;
  padding(options: { end: number; bottom: number }): Modifier;
  padding(options: { start: number; end: number; bottom: number }): Modifier;
  padding(options: { top: number; end: number; bottom: number }): Modifier;
  padding(options: { start: number; top: number; end: number; bottom: number }): Modifier;
  paddingFromBaseline(options: { top: number }): Modifier;
  paddingFromBaseline(top: number): Modifier;
  paddingFromBaseline(options: { bottom: number }): Modifier;
  paddingFromBaseline(bottom: number): Modifier;
  paddingFromBaseline(options: { top: number; bottom: number }): Modifier;
  preferKeepClear(): Modifier;
  progressSemantics(): Modifier;
  progressSemantics(options: { value: number }): Modifier;
  progressSemantics(value: number): Modifier;
  progressSemantics(options: { value: number; steps: number }): Modifier;
  requiredHeight(options: { height: number }): Modifier;
  requiredHeight(height: number): Modifier;
  requiredHeightIn(): Modifier;
  requiredHeightIn(options: { min: number }): Modifier;
  requiredHeightIn(min: number): Modifier;
  requiredHeightIn(options: { max: number }): Modifier;
  requiredHeightIn(max: number): Modifier;
  requiredHeightIn(options: { min: number; max: number }): Modifier;
  requiredSize(options: { size: number }): Modifier;
  requiredSize(size: number): Modifier;
  requiredSize(options: { width: number; height: number }): Modifier;
  requiredSizeIn(): Modifier;
  requiredSizeIn(options: { minWidth: number }): Modifier;
  requiredSizeIn(minWidth: number): Modifier;
  requiredSizeIn(options: { minHeight: number }): Modifier;
  requiredSizeIn(minHeight: number): Modifier;
  requiredSizeIn(options: { minWidth: number; minHeight: number }): Modifier;
  requiredSizeIn(options: { maxWidth: number }): Modifier;
  requiredSizeIn(maxWidth: number): Modifier;
  requiredSizeIn(options: { minWidth: number; maxWidth: number }): Modifier;
  requiredSizeIn(options: { minHeight: number; maxWidth: number }): Modifier;
  requiredSizeIn(options: { minWidth: number; minHeight: number; maxWidth: number }): Modifier;
  requiredSizeIn(options: { maxHeight: number }): Modifier;
  requiredSizeIn(maxHeight: number): Modifier;
  requiredSizeIn(options: { minWidth: number; maxHeight: number }): Modifier;
  requiredSizeIn(options: { minHeight: number; maxHeight: number }): Modifier;
  requiredSizeIn(options: { minWidth: number; minHeight: number; maxHeight: number }): Modifier;
  requiredSizeIn(options: { maxWidth: number; maxHeight: number }): Modifier;
  requiredSizeIn(options: { minWidth: number; maxWidth: number; maxHeight: number }): Modifier;
  requiredSizeIn(options: { minHeight: number; maxWidth: number; maxHeight: number }): Modifier;
  requiredSizeIn(options: { minWidth: number; minHeight: number; maxWidth: number; maxHeight: number }): Modifier;
  requiredWidth(options: { width: number }): Modifier;
  requiredWidth(width: number): Modifier;
  requiredWidthIn(): Modifier;
  requiredWidthIn(options: { min: number }): Modifier;
  requiredWidthIn(min: number): Modifier;
  requiredWidthIn(options: { max: number }): Modifier;
  requiredWidthIn(max: number): Modifier;
  requiredWidthIn(options: { min: number; max: number }): Modifier;
  rotate(options: { degrees: number }): Modifier;
  rotate(degrees: number): Modifier;
  safeContentPadding(): Modifier;
  safeDrawingPadding(): Modifier;
  safeGesturesPadding(): Modifier;
  scale(options: { scale: number }): Modifier;
  scale(scale: number): Modifier;
  scale(options: { scaleX: number; scaleY: number }): Modifier;
  selectable(options: { selected: boolean; onClick: () => void }): Modifier;
  selectable(options: { selected: boolean; enabled: boolean; onClick: () => void }): Modifier;
  selectable(options: { selected: boolean; role: ComposeRole | null; onClick: () => void }): Modifier;
  selectable(options: { selected: boolean; enabled: boolean; role: ComposeRole | null; onClick: () => void }): Modifier;
  selectableGroup(): Modifier;
  shadow(options: { elevation: number }): Modifier;
  shadow(elevation: number): Modifier;
  shadow(options: { elevation: number; shape: ComposeShape }): Modifier;
  shadow(options: { elevation: number; clip: boolean }): Modifier;
  shadow(options: { elevation: number; shape: ComposeShape; clip: boolean }): Modifier;
  shadow(options: { elevation: number; ambientColor: string }): Modifier;
  shadow(options: { elevation: number; shape: ComposeShape; ambientColor: string }): Modifier;
  shadow(options: { elevation: number; clip: boolean; ambientColor: string }): Modifier;
  shadow(options: { elevation: number; shape: ComposeShape; clip: boolean; ambientColor: string }): Modifier;
  shadow(options: { elevation: number; spotColor: string }): Modifier;
  shadow(options: { elevation: number; shape: ComposeShape; spotColor: string }): Modifier;
  shadow(options: { elevation: number; clip: boolean; spotColor: string }): Modifier;
  shadow(options: { elevation: number; shape: ComposeShape; clip: boolean; spotColor: string }): Modifier;
  shadow(options: { elevation: number; ambientColor: string; spotColor: string }): Modifier;
  shadow(options: { elevation: number; shape: ComposeShape; ambientColor: string; spotColor: string }): Modifier;
  shadow(options: { elevation: number; clip: boolean; ambientColor: string; spotColor: string }): Modifier;
  shadow(options: { elevation: number; shape: ComposeShape; clip: boolean; ambientColor: string; spotColor: string }): Modifier;
  size(options: { size: number }): Modifier;
  size(size: number): Modifier;
  size(options: { width: number; height: number }): Modifier;
  sizeIn(): Modifier;
  sizeIn(options: { minWidth: number }): Modifier;
  sizeIn(minWidth: number): Modifier;
  sizeIn(options: { minHeight: number }): Modifier;
  sizeIn(minHeight: number): Modifier;
  sizeIn(options: { minWidth: number; minHeight: number }): Modifier;
  sizeIn(options: { maxWidth: number }): Modifier;
  sizeIn(maxWidth: number): Modifier;
  sizeIn(options: { minWidth: number; maxWidth: number }): Modifier;
  sizeIn(options: { minHeight: number; maxWidth: number }): Modifier;
  sizeIn(options: { minWidth: number; minHeight: number; maxWidth: number }): Modifier;
  sizeIn(options: { maxHeight: number }): Modifier;
  sizeIn(maxHeight: number): Modifier;
  sizeIn(options: { minWidth: number; maxHeight: number }): Modifier;
  sizeIn(options: { minHeight: number; maxHeight: number }): Modifier;
  sizeIn(options: { minWidth: number; minHeight: number; maxHeight: number }): Modifier;
  sizeIn(options: { maxWidth: number; maxHeight: number }): Modifier;
  sizeIn(options: { minWidth: number; maxWidth: number; maxHeight: number }): Modifier;
  sizeIn(options: { minHeight: number; maxWidth: number; maxHeight: number }): Modifier;
  sizeIn(options: { minWidth: number; minHeight: number; maxWidth: number; maxHeight: number }): Modifier;
  statusBarsPadding(): Modifier;
  systemBarsPadding(): Modifier;
  systemGestureExclusion(): Modifier;
  systemGesturesPadding(): Modifier;
  testTag(options: { tag: string }): Modifier;
  testTag(tag: string): Modifier;
  toggleable(options: { value: boolean; onValueChange: (value: boolean) => void }): Modifier;
  toggleable(options: { value: boolean; enabled: boolean; onValueChange: (value: boolean) => void }): Modifier;
  toggleable(options: { value: boolean; role: ComposeRole | null; onValueChange: (value: boolean) => void }): Modifier;
  toggleable(options: { value: boolean; enabled: boolean; role: ComposeRole | null; onValueChange: (value: boolean) => void }): Modifier;
  toolingGraphicsLayer(): Modifier;
  waterfallPadding(): Modifier;
  weight(options: { weight: number }): Modifier;
  weight(weight: number): Modifier;
  weight(options: { weight: number; fill: boolean }): Modifier;
  width(options: { width: number }): Modifier;
  width(width: number): Modifier;
  widthIn(): Modifier;
  widthIn(options: { min: number }): Modifier;
  widthIn(min: number): Modifier;
  widthIn(options: { max: number }): Modifier;
  widthIn(max: number): Modifier;
  widthIn(options: { min: number; max: number }): Modifier;
  wrapContentHeight(): Modifier;
  wrapContentHeight(options: { align: ComposeVerticalAlignment }): Modifier;
  wrapContentHeight(align: ComposeVerticalAlignment): Modifier;
  wrapContentHeight(options: { unbounded: boolean }): Modifier;
  wrapContentHeight(unbounded: boolean): Modifier;
  wrapContentHeight(options: { align: ComposeVerticalAlignment; unbounded: boolean }): Modifier;
  wrapContentSize(): Modifier;
  wrapContentSize(options: { align: ComposeAlignment }): Modifier;
  wrapContentSize(align: ComposeAlignment): Modifier;
  wrapContentSize(options: { unbounded: boolean }): Modifier;
  wrapContentSize(unbounded: boolean): Modifier;
  wrapContentSize(options: { align: ComposeAlignment; unbounded: boolean }): Modifier;
  wrapContentWidth(): Modifier;
  wrapContentWidth(options: { align: ComposeHorizontalAlignment }): Modifier;
  wrapContentWidth(align: ComposeHorizontalAlignment): Modifier;
  wrapContentWidth(options: { unbounded: boolean }): Modifier;
  wrapContentWidth(unbounded: boolean): Modifier;
  wrapContentWidth(options: { align: ComposeHorizontalAlignment; unbounded: boolean }): Modifier;
  zIndex(options: { zIndex: number }): Modifier;
  zIndex(zIndex: number): Modifier;
}

export type Modifier = GeneratedModifiers & ModifierCompatibility<Modifier> & ModifierPayload;

export const Modifier = createModifier({
  "background": [
    { id: 0, forms: [[["brush","stringOrObject",false]],[["brush","stringOrObject",false],["shape","stringOrObject",false]],[["brush","stringOrObject",false],["alpha","number",false]],[["brush","stringOrObject",false],["shape","stringOrObject",false],["alpha","number",false]]] },
    { id: 1, forms: [[["color","string",false]],[["color","string",false],["shape","stringOrObject",false]]] },
  ],
  "basicMarquee": [
    { id: 2, forms: [[],[["iterations","number",false]],[["repeatDelayMillis","number",false]],[["iterations","number",false],["repeatDelayMillis","number",false]],[["initialDelayMillis","number",false]],[["iterations","number",false],["initialDelayMillis","number",false]],[["repeatDelayMillis","number",false],["initialDelayMillis","number",false]],[["iterations","number",false],["repeatDelayMillis","number",false],["initialDelayMillis","number",false]],[["velocity","number",false]],[["iterations","number",false],["velocity","number",false]],[["repeatDelayMillis","number",false],["velocity","number",false]],[["iterations","number",false],["repeatDelayMillis","number",false],["velocity","number",false]],[["initialDelayMillis","number",false],["velocity","number",false]],[["iterations","number",false],["initialDelayMillis","number",false],["velocity","number",false]],[["repeatDelayMillis","number",false],["initialDelayMillis","number",false],["velocity","number",false]],[["iterations","number",false],["repeatDelayMillis","number",false],["initialDelayMillis","number",false],["velocity","number",false]]] },
  ],
  "border": [
    { id: 3, forms: [[["width","number",false],["brush","stringOrObject",false],["shape","stringOrObject",false]]] },
    { id: 4, forms: [[["width","number",false],["color","string",false]],[["width","number",false],["color","string",false],["shape","stringOrObject",false]]] },
  ],
  "clickable": [
    { id: 5, forms: [[["onClick","function",false]],[["enabled","boolean",false],["onClick","function",false]],[["onClickLabel","string",true],["onClick","function",false]],[["enabled","boolean",false],["onClickLabel","string",true],["onClick","function",false]],[["role","string",true],["onClick","function",false]],[["enabled","boolean",false],["role","string",true],["onClick","function",false]],[["onClickLabel","string",true],["role","string",true],["onClick","function",false]],[["enabled","boolean",false],["onClickLabel","string",true],["role","string",true],["onClick","function",false]]] },
  ],
  "focusGroup": [
    { id: 6, forms: [[]] },
  ],
  "focusable": [
    { id: 7, forms: [[],[["enabled","boolean",false]]] },
  ],
  "align": [
    { id: 8, forms: [[["alignment","string",false]]] },
    { id: 10, forms: [[["alignment","string",false]]] },
    { id: 12, forms: [[["alignment","string",false]]] },
  ],
  "matchParentSize": [
    { id: 9, forms: [[]] },
  ],
  "weight": [
    { id: 11, forms: [[["weight","number",false]],[["weight","number",false],["fill","boolean",false]]] },
    { id: 14, forms: [[["weight","number",false]],[["weight","number",false],["fill","boolean",false]]] },
  ],
  "alignByBaseline": [
    { id: 13, forms: [[]] },
  ],
  "absoluteOffset": [
    { id: 15, forms: [[],[["x","number",false]],[["y","number",false]],[["x","number",false],["y","number",false]]] },
  ],
  "absolutePadding": [
    { id: 16, forms: [[],[["left","number",false]],[["top","number",false]],[["left","number",false],["top","number",false]],[["right","number",false]],[["left","number",false],["right","number",false]],[["top","number",false],["right","number",false]],[["left","number",false],["top","number",false],["right","number",false]],[["bottom","number",false]],[["left","number",false],["bottom","number",false]],[["top","number",false],["bottom","number",false]],[["left","number",false],["top","number",false],["bottom","number",false]],[["right","number",false],["bottom","number",false]],[["left","number",false],["right","number",false],["bottom","number",false]],[["top","number",false],["right","number",false],["bottom","number",false]],[["left","number",false],["top","number",false],["right","number",false],["bottom","number",false]]] },
  ],
  "aspectRatio": [
    { id: 17, forms: [[["ratio","number",false]],[["ratio","number",false],["matchHeightConstraintsFirst","boolean",false]]] },
  ],
  "captionBarPadding": [
    { id: 18, forms: [[]] },
  ],
  "defaultMinSize": [
    { id: 19, forms: [[],[["minWidth","number",false]],[["minHeight","number",false]],[["minWidth","number",false],["minHeight","number",false]]] },
  ],
  "displayCutoutPadding": [
    { id: 20, forms: [[]] },
  ],
  "fillMaxHeight": [
    { id: 21, forms: [[],[["fraction","number",false]]] },
  ],
  "fillMaxSize": [
    { id: 22, forms: [[],[["fraction","number",false]]] },
  ],
  "fillMaxWidth": [
    { id: 23, forms: [[],[["fraction","number",false]]] },
  ],
  "height": [
    { id: 24, forms: [[["height","number",false]]] },
  ],
  "heightIn": [
    { id: 25, forms: [[],[["min","number",false]],[["max","number",false]],[["min","number",false],["max","number",false]]] },
  ],
  "imePadding": [
    { id: 26, forms: [[]] },
  ],
  "mandatorySystemGesturesPadding": [
    { id: 27, forms: [[]] },
  ],
  "navigationBarsPadding": [
    { id: 28, forms: [[]] },
  ],
  "offset": [
    { id: 29, forms: [[],[["x","number",false]],[["y","number",false]],[["x","number",false],["y","number",false]]] },
  ],
  "padding": [
    { id: 30, forms: [[["all","number",false]]] },
    { id: 31, forms: [[],[["horizontal","number",false]],[["vertical","number",false]],[["horizontal","number",false],["vertical","number",false]]] },
    { id: 32, forms: [[["start","number",false]],[["top","number",false]],[["start","number",false],["top","number",false]],[["end","number",false]],[["start","number",false],["end","number",false]],[["top","number",false],["end","number",false]],[["start","number",false],["top","number",false],["end","number",false]],[["bottom","number",false]],[["start","number",false],["bottom","number",false]],[["top","number",false],["bottom","number",false]],[["start","number",false],["top","number",false],["bottom","number",false]],[["end","number",false],["bottom","number",false]],[["start","number",false],["end","number",false],["bottom","number",false]],[["top","number",false],["end","number",false],["bottom","number",false]],[["start","number",false],["top","number",false],["end","number",false],["bottom","number",false]]] },
  ],
  "paddingFromBaseline": [
    { id: 33, forms: [[["top","number",false]],[["bottom","number",false]],[["top","number",false],["bottom","number",false]]] },
    { id: 34, forms: [[["top","number",false]],[["bottom","number",false]],[["top","number",false],["bottom","number",false]]] },
  ],
  "requiredHeight": [
    { id: 35, forms: [[["height","number",false]]] },
  ],
  "requiredHeightIn": [
    { id: 36, forms: [[],[["min","number",false]],[["max","number",false]],[["min","number",false],["max","number",false]]] },
  ],
  "requiredSize": [
    { id: 37, forms: [[["size","number",false]]] },
    { id: 38, forms: [[["width","number",false],["height","number",false]]] },
  ],
  "requiredSizeIn": [
    { id: 39, forms: [[],[["minWidth","number",false]],[["minHeight","number",false]],[["minWidth","number",false],["minHeight","number",false]],[["maxWidth","number",false]],[["minWidth","number",false],["maxWidth","number",false]],[["minHeight","number",false],["maxWidth","number",false]],[["minWidth","number",false],["minHeight","number",false],["maxWidth","number",false]],[["maxHeight","number",false]],[["minWidth","number",false],["maxHeight","number",false]],[["minHeight","number",false],["maxHeight","number",false]],[["minWidth","number",false],["minHeight","number",false],["maxHeight","number",false]],[["maxWidth","number",false],["maxHeight","number",false]],[["minWidth","number",false],["maxWidth","number",false],["maxHeight","number",false]],[["minHeight","number",false],["maxWidth","number",false],["maxHeight","number",false]],[["minWidth","number",false],["minHeight","number",false],["maxWidth","number",false],["maxHeight","number",false]]] },
  ],
  "requiredWidth": [
    { id: 40, forms: [[["width","number",false]]] },
  ],
  "requiredWidthIn": [
    { id: 41, forms: [[],[["min","number",false]],[["max","number",false]],[["min","number",false],["max","number",false]]] },
  ],
  "safeContentPadding": [
    { id: 42, forms: [[]] },
  ],
  "safeDrawingPadding": [
    { id: 43, forms: [[]] },
  ],
  "safeGesturesPadding": [
    { id: 44, forms: [[]] },
  ],
  "size": [
    { id: 45, forms: [[["size","number",false]]] },
    { id: 46, forms: [[["width","number",false],["height","number",false]]] },
  ],
  "sizeIn": [
    { id: 47, forms: [[],[["minWidth","number",false]],[["minHeight","number",false]],[["minWidth","number",false],["minHeight","number",false]],[["maxWidth","number",false]],[["minWidth","number",false],["maxWidth","number",false]],[["minHeight","number",false],["maxWidth","number",false]],[["minWidth","number",false],["minHeight","number",false],["maxWidth","number",false]],[["maxHeight","number",false]],[["minWidth","number",false],["maxHeight","number",false]],[["minHeight","number",false],["maxHeight","number",false]],[["minWidth","number",false],["minHeight","number",false],["maxHeight","number",false]],[["maxWidth","number",false],["maxHeight","number",false]],[["minWidth","number",false],["maxWidth","number",false],["maxHeight","number",false]],[["minHeight","number",false],["maxWidth","number",false],["maxHeight","number",false]],[["minWidth","number",false],["minHeight","number",false],["maxWidth","number",false],["maxHeight","number",false]]] },
  ],
  "statusBarsPadding": [
    { id: 48, forms: [[]] },
  ],
  "systemBarsPadding": [
    { id: 49, forms: [[]] },
  ],
  "systemGesturesPadding": [
    { id: 50, forms: [[]] },
  ],
  "waterfallPadding": [
    { id: 51, forms: [[]] },
  ],
  "width": [
    { id: 52, forms: [[["width","number",false]]] },
  ],
  "widthIn": [
    { id: 53, forms: [[],[["min","number",false]],[["max","number",false]],[["min","number",false],["max","number",false]]] },
  ],
  "wrapContentHeight": [
    { id: 54, forms: [[],[["align","string",false]],[["unbounded","boolean",false]],[["align","string",false],["unbounded","boolean",false]]] },
  ],
  "wrapContentSize": [
    { id: 55, forms: [[],[["align","string",false]],[["unbounded","boolean",false]],[["align","string",false],["unbounded","boolean",false]]] },
  ],
  "wrapContentWidth": [
    { id: 56, forms: [[],[["align","string",false]],[["unbounded","boolean",false]],[["align","string",false],["unbounded","boolean",false]]] },
  ],
  "preferKeepClear": [
    { id: 57, forms: [[]] },
  ],
  "progressSemantics": [
    { id: 58, forms: [[]] },
    { id: 59, forms: [[["value","number",false]],[["value","number",false],["steps","number",false]]] },
  ],
  "selectable": [
    { id: 60, forms: [[["selected","boolean",false],["onClick","function",false]],[["selected","boolean",false],["enabled","boolean",false],["onClick","function",false]],[["selected","boolean",false],["role","string",true],["onClick","function",false]],[["selected","boolean",false],["enabled","boolean",false],["role","string",true],["onClick","function",false]]] },
  ],
  "selectableGroup": [
    { id: 61, forms: [[]] },
  ],
  "toggleable": [
    { id: 62, forms: [[["value","boolean",false],["onValueChange","function",false]],[["value","boolean",false],["enabled","boolean",false],["onValueChange","function",false]],[["value","boolean",false],["role","string",true],["onValueChange","function",false]],[["value","boolean",false],["enabled","boolean",false],["role","string",true],["onValueChange","function",false]]] },
  ],
  "systemGestureExclusion": [
    { id: 63, forms: [[]] },
  ],
  "alpha": [
    { id: 64, forms: [[["alpha","number",false]]] },
  ],
  "blur": [
    { id: 65, forms: [[["radius","number",false]]] },
    { id: 66, forms: [[["radiusX","number",false],["radiusY","number",false]]] },
  ],
  "clip": [
    { id: 67, forms: [[["shape","stringOrObject",false]]] },
  ],
  "clipToBounds": [
    { id: 68, forms: [[]] },
  ],
  "rotate": [
    { id: 69, forms: [[["degrees","number",false]]] },
  ],
  "scale": [
    { id: 70, forms: [[["scale","number",false]]] },
    { id: 71, forms: [[["scaleX","number",false],["scaleY","number",false]]] },
  ],
  "shadow": [
    { id: 72, forms: [[["elevation","number",false]],[["elevation","number",false],["shape","stringOrObject",false]],[["elevation","number",false],["clip","boolean",false]],[["elevation","number",false],["shape","stringOrObject",false],["clip","boolean",false]],[["elevation","number",false],["ambientColor","string",false]],[["elevation","number",false],["shape","stringOrObject",false],["ambientColor","string",false]],[["elevation","number",false],["clip","boolean",false],["ambientColor","string",false]],[["elevation","number",false],["shape","stringOrObject",false],["clip","boolean",false],["ambientColor","string",false]],[["elevation","number",false],["spotColor","string",false]],[["elevation","number",false],["shape","stringOrObject",false],["spotColor","string",false]],[["elevation","number",false],["clip","boolean",false],["spotColor","string",false]],[["elevation","number",false],["shape","stringOrObject",false],["clip","boolean",false],["spotColor","string",false]],[["elevation","number",false],["ambientColor","string",false],["spotColor","string",false]],[["elevation","number",false],["shape","stringOrObject",false],["ambientColor","string",false],["spotColor","string",false]],[["elevation","number",false],["clip","boolean",false],["ambientColor","string",false],["spotColor","string",false]],[["elevation","number",false],["shape","stringOrObject",false],["clip","boolean",false],["ambientColor","string",false],["spotColor","string",false]]] },
  ],
  "graphicsLayer": [
    { id: 73, forms: [[],[["scaleX","number",false]],[["scaleY","number",false]],[["scaleX","number",false],["scaleY","number",false]],[["alpha","number",false]],[["scaleX","number",false],["alpha","number",false]],[["scaleY","number",false],["alpha","number",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false]],[["translationX","number",false]],[["scaleX","number",false],["translationX","number",false]],[["scaleY","number",false],["translationX","number",false]],[["scaleX","number",false],["scaleY","number",false],["translationX","number",false]],[["alpha","number",false],["translationX","number",false]],[["scaleX","number",false],["alpha","number",false],["translationX","number",false]],[["scaleY","number",false],["alpha","number",false],["translationX","number",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationX","number",false]]] },
  ],
  "toolingGraphicsLayer": [
    { id: 74, forms: [[]] },
  ],
  "testTag": [
    { id: 75, forms: [[["tag","string",false]]] },
  ],
  "zIndex": [
    { id: 76, forms: [[["zIndex","number",false]]] },
  ],
}) as Modifier;
