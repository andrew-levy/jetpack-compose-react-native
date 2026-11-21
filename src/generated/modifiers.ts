// Generated from Compose declarations by generate.mjs.
import { createModifier, type ComposeBrush, type ComposeShape, type ModifierCompatibility, type ModifierPayload } from "../utils/modifier";
import type { ComposeAlignmentLine, ComposeAnimationSpec, ComposeDpSize, ComposeFocusProperties, ComposeFocusState, ComposeKeyPolicy, ComposeLayoutPosition, ComposeLayoutSize, ComposeNestedScrollConnection, ComposePaddingValues, ComposePainter, ComposeScrollState, ComposeSemantics, ComposeVisibilityTransition, ComposeWindowInsets } from "../utils/composeValues";
import type { ComposeFloatRange } from "./components";
import type { ComposeBringIntoViewRequester, ComposeFocusRequester } from "../utils/nativeHandles";
import type { ComposeTransformOrigin } from "./records";
import type { ComposeAlignment, ComposeContentScale, ComposeHorizontalAlignment, ComposeIntrinsicSize, ComposeOrientation, ComposePointerIcon, ComposeRole, ComposeToggleableState, ComposeVerticalAlignment } from "./values";

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
  alignBy(options: { alignmentLine: ComposeAlignmentLine }): ComposeChain;
  alignBy(alignmentLine: ComposeAlignmentLine): ComposeChain;
  alignByBaseline(): ComposeChain;
  alpha(options: { alpha: number }): ComposeChain;
  alpha(alpha: number): ComposeChain;
  animateContentSize(): ComposeChain;
  animateContentSize(options: { animationSpec: ComposeAnimationSpec }): ComposeChain;
  animateContentSize(animationSpec: ComposeAnimationSpec): ComposeChain;
  animateContentSize(options: { alignment: ComposeAlignment }): ComposeChain;
  animateContentSize(alignment: ComposeAlignment): ComposeChain;
  animateContentSize(options: { animationSpec: ComposeAnimationSpec; alignment: ComposeAlignment }): ComposeChain;
  animateEnterExit(): ComposeChain;
  animateEnterExit(options: { enter: ComposeVisibilityTransition }): ComposeChain;
  animateEnterExit(enter: ComposeVisibilityTransition): ComposeChain;
  animateEnterExit(options: { exit: ComposeVisibilityTransition }): ComposeChain;
  animateEnterExit(exit: ComposeVisibilityTransition): ComposeChain;
  animateEnterExit(options: { enter: ComposeVisibilityTransition; exit: ComposeVisibilityTransition }): ComposeChain;
  animateEnterExit(options: { label: string }): ComposeChain;
  animateEnterExit(label: string): ComposeChain;
  animateEnterExit(options: { enter: ComposeVisibilityTransition; label: string }): ComposeChain;
  animateEnterExit(options: { exit: ComposeVisibilityTransition; label: string }): ComposeChain;
  animateEnterExit(options: { enter: ComposeVisibilityTransition; exit: ComposeVisibilityTransition; label: string }): ComposeChain;
  animateFloatingActionButton(options: { visible: boolean; alignment: ComposeAlignment }): ComposeChain;
  animateFloatingActionButton(options: { visible: boolean; alignment: ComposeAlignment; targetScale: number }): ComposeChain;
  animateFloatingActionButton(options: { visible: boolean; alignment: ComposeAlignment; scaleAnimationSpec: ComposeAnimationSpec | null }): ComposeChain;
  animateFloatingActionButton(options: { visible: boolean; alignment: ComposeAlignment; targetScale: number; scaleAnimationSpec: ComposeAnimationSpec | null }): ComposeChain;
  animateFloatingActionButton(options: { visible: boolean; alignment: ComposeAlignment; alphaAnimationSpec: ComposeAnimationSpec | null }): ComposeChain;
  animateFloatingActionButton(options: { visible: boolean; alignment: ComposeAlignment; targetScale: number; alphaAnimationSpec: ComposeAnimationSpec | null }): ComposeChain;
  animateFloatingActionButton(options: { visible: boolean; alignment: ComposeAlignment; scaleAnimationSpec: ComposeAnimationSpec | null; alphaAnimationSpec: ComposeAnimationSpec | null }): ComposeChain;
  animateFloatingActionButton(options: { visible: boolean; alignment: ComposeAlignment; targetScale: number; scaleAnimationSpec: ComposeAnimationSpec | null; alphaAnimationSpec: ComposeAnimationSpec | null }): ComposeChain;
  animateItem(): ComposeChain;
  animateItem(options: { fadeInSpec: ComposeAnimationSpec | null }): ComposeChain;
  animateItem(fadeInSpec: ComposeAnimationSpec | null): ComposeChain;
  animateItem(options: { placementSpec: ComposeAnimationSpec | null }): ComposeChain;
  animateItem(placementSpec: ComposeAnimationSpec | null): ComposeChain;
  animateItem(options: { fadeInSpec: ComposeAnimationSpec | null; placementSpec: ComposeAnimationSpec | null }): ComposeChain;
  animateItem(options: { fadeOutSpec: ComposeAnimationSpec | null }): ComposeChain;
  animateItem(fadeOutSpec: ComposeAnimationSpec | null): ComposeChain;
  animateItem(options: { fadeInSpec: ComposeAnimationSpec | null; fadeOutSpec: ComposeAnimationSpec | null }): ComposeChain;
  animateItem(options: { placementSpec: ComposeAnimationSpec | null; fadeOutSpec: ComposeAnimationSpec | null }): ComposeChain;
  animateItem(options: { fadeInSpec: ComposeAnimationSpec | null; placementSpec: ComposeAnimationSpec | null; fadeOutSpec: ComposeAnimationSpec | null }): ComposeChain;
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
  bringIntoViewRequester(options: { bringIntoViewRequester: ComposeBringIntoViewRequester }): ComposeChain;
  bringIntoViewRequester(bringIntoViewRequester: ComposeBringIntoViewRequester): ComposeChain;
  captionBarPadding(): ComposeChain;
  clearAndSetSemantics(options: { properties: ComposeSemantics }): ComposeChain;
  clearAndSetSemantics(properties: ComposeSemantics): ComposeChain;
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
  clipScrollableContainer(options: { orientation: ComposeOrientation }): ComposeChain;
  clipScrollableContainer(orientation: ComposeOrientation): ComposeChain;
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
  combinedClickable(options: { onLongClick: (() => void) | null; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { onLongClick: (() => void) | null }): ComposeChain;
  combinedClickable(options: { enabled: boolean; onLongClick: (() => void) | null; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { enabled: boolean; onLongClick: (() => void) | null }): ComposeChain;
  combinedClickable(options: { onClickLabel: string | null; onLongClick: (() => void) | null; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { onClickLabel: string | null; onLongClick: (() => void) | null }): ComposeChain;
  combinedClickable(options: { enabled: boolean; onClickLabel: string | null; onLongClick: (() => void) | null; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { enabled: boolean; onClickLabel: string | null; onLongClick: (() => void) | null }): ComposeChain;
  combinedClickable(options: { role: ComposeRole | null; onLongClick: (() => void) | null; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { role: ComposeRole | null; onLongClick: (() => void) | null }): ComposeChain;
  combinedClickable(options: { enabled: boolean; role: ComposeRole | null; onLongClick: (() => void) | null; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { enabled: boolean; role: ComposeRole | null; onLongClick: (() => void) | null }): ComposeChain;
  combinedClickable(options: { onClickLabel: string | null; role: ComposeRole | null; onLongClick: (() => void) | null; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { onClickLabel: string | null; role: ComposeRole | null; onLongClick: (() => void) | null }): ComposeChain;
  combinedClickable(options: { enabled: boolean; onClickLabel: string | null; role: ComposeRole | null; onLongClick: (() => void) | null; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { enabled: boolean; onClickLabel: string | null; role: ComposeRole | null; onLongClick: (() => void) | null }): ComposeChain;
  combinedClickable(options: { onLongClickLabel: string | null; onLongClick: (() => void) | null; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { onLongClickLabel: string | null; onLongClick: (() => void) | null }): ComposeChain;
  combinedClickable(options: { enabled: boolean; onLongClickLabel: string | null; onLongClick: (() => void) | null; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { enabled: boolean; onLongClickLabel: string | null; onLongClick: (() => void) | null }): ComposeChain;
  combinedClickable(options: { onClickLabel: string | null; onLongClickLabel: string | null; onLongClick: (() => void) | null; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { onClickLabel: string | null; onLongClickLabel: string | null; onLongClick: (() => void) | null }): ComposeChain;
  combinedClickable(options: { enabled: boolean; onClickLabel: string | null; onLongClickLabel: string | null; onLongClick: (() => void) | null; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { enabled: boolean; onClickLabel: string | null; onLongClickLabel: string | null; onLongClick: (() => void) | null }): ComposeChain;
  combinedClickable(options: { role: ComposeRole | null; onLongClickLabel: string | null; onLongClick: (() => void) | null; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { role: ComposeRole | null; onLongClickLabel: string | null; onLongClick: (() => void) | null }): ComposeChain;
  combinedClickable(options: { enabled: boolean; role: ComposeRole | null; onLongClickLabel: string | null; onLongClick: (() => void) | null; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { enabled: boolean; role: ComposeRole | null; onLongClickLabel: string | null; onLongClick: (() => void) | null }): ComposeChain;
  combinedClickable(options: { onClickLabel: string | null; role: ComposeRole | null; onLongClickLabel: string | null; onLongClick: (() => void) | null; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { onClickLabel: string | null; role: ComposeRole | null; onLongClickLabel: string | null; onLongClick: (() => void) | null }): ComposeChain;
  combinedClickable(options: { enabled: boolean; onClickLabel: string | null; role: ComposeRole | null; onLongClickLabel: string | null; onLongClick: (() => void) | null; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { enabled: boolean; onClickLabel: string | null; role: ComposeRole | null; onLongClickLabel: string | null; onLongClick: (() => void) | null }): ComposeChain;
  combinedClickable(options: { onDoubleClick: (() => void) | null; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { onDoubleClick: (() => void) | null }): ComposeChain;
  combinedClickable(options: { enabled: boolean; onDoubleClick: (() => void) | null; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { enabled: boolean; onDoubleClick: (() => void) | null }): ComposeChain;
  combinedClickable(options: { onClickLabel: string | null; onDoubleClick: (() => void) | null; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { onClickLabel: string | null; onDoubleClick: (() => void) | null }): ComposeChain;
  combinedClickable(options: { enabled: boolean; onClickLabel: string | null; onDoubleClick: (() => void) | null; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { enabled: boolean; onClickLabel: string | null; onDoubleClick: (() => void) | null }): ComposeChain;
  combinedClickable(options: { role: ComposeRole | null; onDoubleClick: (() => void) | null; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { role: ComposeRole | null; onDoubleClick: (() => void) | null }): ComposeChain;
  combinedClickable(options: { enabled: boolean; role: ComposeRole | null; onDoubleClick: (() => void) | null; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { enabled: boolean; role: ComposeRole | null; onDoubleClick: (() => void) | null }): ComposeChain;
  combinedClickable(options: { onClickLabel: string | null; role: ComposeRole | null; onDoubleClick: (() => void) | null; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { onClickLabel: string | null; role: ComposeRole | null; onDoubleClick: (() => void) | null }): ComposeChain;
  combinedClickable(options: { enabled: boolean; onClickLabel: string | null; role: ComposeRole | null; onDoubleClick: (() => void) | null; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { enabled: boolean; onClickLabel: string | null; role: ComposeRole | null; onDoubleClick: (() => void) | null }): ComposeChain;
  combinedClickable(options: { onLongClickLabel: string | null; onDoubleClick: (() => void) | null; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { onLongClickLabel: string | null; onDoubleClick: (() => void) | null }): ComposeChain;
  combinedClickable(options: { enabled: boolean; onLongClickLabel: string | null; onDoubleClick: (() => void) | null; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { enabled: boolean; onLongClickLabel: string | null; onDoubleClick: (() => void) | null }): ComposeChain;
  combinedClickable(options: { onClickLabel: string | null; onLongClickLabel: string | null; onDoubleClick: (() => void) | null; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { onClickLabel: string | null; onLongClickLabel: string | null; onDoubleClick: (() => void) | null }): ComposeChain;
  combinedClickable(options: { enabled: boolean; onClickLabel: string | null; onLongClickLabel: string | null; onDoubleClick: (() => void) | null; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { enabled: boolean; onClickLabel: string | null; onLongClickLabel: string | null; onDoubleClick: (() => void) | null }): ComposeChain;
  combinedClickable(options: { role: ComposeRole | null; onLongClickLabel: string | null; onDoubleClick: (() => void) | null; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { role: ComposeRole | null; onLongClickLabel: string | null; onDoubleClick: (() => void) | null }): ComposeChain;
  combinedClickable(options: { enabled: boolean; role: ComposeRole | null; onLongClickLabel: string | null; onDoubleClick: (() => void) | null; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { enabled: boolean; role: ComposeRole | null; onLongClickLabel: string | null; onDoubleClick: (() => void) | null }): ComposeChain;
  combinedClickable(options: { onClickLabel: string | null; role: ComposeRole | null; onLongClickLabel: string | null; onDoubleClick: (() => void) | null; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { onClickLabel: string | null; role: ComposeRole | null; onLongClickLabel: string | null; onDoubleClick: (() => void) | null }): ComposeChain;
  combinedClickable(options: { enabled: boolean; onClickLabel: string | null; role: ComposeRole | null; onLongClickLabel: string | null; onDoubleClick: (() => void) | null; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { enabled: boolean; onClickLabel: string | null; role: ComposeRole | null; onLongClickLabel: string | null; onDoubleClick: (() => void) | null }): ComposeChain;
  combinedClickable(options: { onLongClick: (() => void) | null; onDoubleClick: (() => void) | null; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { onLongClick: (() => void) | null; onDoubleClick: (() => void) | null }): ComposeChain;
  combinedClickable(options: { enabled: boolean; onLongClick: (() => void) | null; onDoubleClick: (() => void) | null; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { enabled: boolean; onLongClick: (() => void) | null; onDoubleClick: (() => void) | null }): ComposeChain;
  combinedClickable(options: { onClickLabel: string | null; onLongClick: (() => void) | null; onDoubleClick: (() => void) | null; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { onClickLabel: string | null; onLongClick: (() => void) | null; onDoubleClick: (() => void) | null }): ComposeChain;
  combinedClickable(options: { enabled: boolean; onClickLabel: string | null; onLongClick: (() => void) | null; onDoubleClick: (() => void) | null; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { enabled: boolean; onClickLabel: string | null; onLongClick: (() => void) | null; onDoubleClick: (() => void) | null }): ComposeChain;
  combinedClickable(options: { role: ComposeRole | null; onLongClick: (() => void) | null; onDoubleClick: (() => void) | null; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { role: ComposeRole | null; onLongClick: (() => void) | null; onDoubleClick: (() => void) | null }): ComposeChain;
  combinedClickable(options: { enabled: boolean; role: ComposeRole | null; onLongClick: (() => void) | null; onDoubleClick: (() => void) | null; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { enabled: boolean; role: ComposeRole | null; onLongClick: (() => void) | null; onDoubleClick: (() => void) | null }): ComposeChain;
  combinedClickable(options: { onClickLabel: string | null; role: ComposeRole | null; onLongClick: (() => void) | null; onDoubleClick: (() => void) | null; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { onClickLabel: string | null; role: ComposeRole | null; onLongClick: (() => void) | null; onDoubleClick: (() => void) | null }): ComposeChain;
  combinedClickable(options: { enabled: boolean; onClickLabel: string | null; role: ComposeRole | null; onLongClick: (() => void) | null; onDoubleClick: (() => void) | null; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { enabled: boolean; onClickLabel: string | null; role: ComposeRole | null; onLongClick: (() => void) | null; onDoubleClick: (() => void) | null }): ComposeChain;
  combinedClickable(options: { onLongClickLabel: string | null; onLongClick: (() => void) | null; onDoubleClick: (() => void) | null; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { onLongClickLabel: string | null; onLongClick: (() => void) | null; onDoubleClick: (() => void) | null }): ComposeChain;
  combinedClickable(options: { enabled: boolean; onLongClickLabel: string | null; onLongClick: (() => void) | null; onDoubleClick: (() => void) | null; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { enabled: boolean; onLongClickLabel: string | null; onLongClick: (() => void) | null; onDoubleClick: (() => void) | null }): ComposeChain;
  combinedClickable(options: { onClickLabel: string | null; onLongClickLabel: string | null; onLongClick: (() => void) | null; onDoubleClick: (() => void) | null; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { onClickLabel: string | null; onLongClickLabel: string | null; onLongClick: (() => void) | null; onDoubleClick: (() => void) | null }): ComposeChain;
  combinedClickable(options: { enabled: boolean; onClickLabel: string | null; onLongClickLabel: string | null; onLongClick: (() => void) | null; onDoubleClick: (() => void) | null; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { enabled: boolean; onClickLabel: string | null; onLongClickLabel: string | null; onLongClick: (() => void) | null; onDoubleClick: (() => void) | null }): ComposeChain;
  combinedClickable(options: { role: ComposeRole | null; onLongClickLabel: string | null; onLongClick: (() => void) | null; onDoubleClick: (() => void) | null; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { role: ComposeRole | null; onLongClickLabel: string | null; onLongClick: (() => void) | null; onDoubleClick: (() => void) | null }): ComposeChain;
  combinedClickable(options: { enabled: boolean; role: ComposeRole | null; onLongClickLabel: string | null; onLongClick: (() => void) | null; onDoubleClick: (() => void) | null; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { enabled: boolean; role: ComposeRole | null; onLongClickLabel: string | null; onLongClick: (() => void) | null; onDoubleClick: (() => void) | null }): ComposeChain;
  combinedClickable(options: { onClickLabel: string | null; role: ComposeRole | null; onLongClickLabel: string | null; onLongClick: (() => void) | null; onDoubleClick: (() => void) | null; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { onClickLabel: string | null; role: ComposeRole | null; onLongClickLabel: string | null; onLongClick: (() => void) | null; onDoubleClick: (() => void) | null }): ComposeChain;
  combinedClickable(options: { enabled: boolean; onClickLabel: string | null; role: ComposeRole | null; onLongClickLabel: string | null; onLongClick: (() => void) | null; onDoubleClick: (() => void) | null; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { enabled: boolean; onClickLabel: string | null; role: ComposeRole | null; onLongClickLabel: string | null; onLongClick: (() => void) | null; onDoubleClick: (() => void) | null }): ComposeChain;
  combinedClickable(options: { hapticFeedbackEnabled: boolean; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { hapticFeedbackEnabled: boolean }): ComposeChain;
  combinedClickable(options: { enabled: boolean; hapticFeedbackEnabled: boolean; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { enabled: boolean; hapticFeedbackEnabled: boolean }): ComposeChain;
  combinedClickable(options: { onClickLabel: string | null; hapticFeedbackEnabled: boolean; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { onClickLabel: string | null; hapticFeedbackEnabled: boolean }): ComposeChain;
  combinedClickable(options: { enabled: boolean; onClickLabel: string | null; hapticFeedbackEnabled: boolean; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { enabled: boolean; onClickLabel: string | null; hapticFeedbackEnabled: boolean }): ComposeChain;
  combinedClickable(options: { role: ComposeRole | null; hapticFeedbackEnabled: boolean; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { role: ComposeRole | null; hapticFeedbackEnabled: boolean }): ComposeChain;
  combinedClickable(options: { enabled: boolean; role: ComposeRole | null; hapticFeedbackEnabled: boolean; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { enabled: boolean; role: ComposeRole | null; hapticFeedbackEnabled: boolean }): ComposeChain;
  combinedClickable(options: { onClickLabel: string | null; role: ComposeRole | null; hapticFeedbackEnabled: boolean; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { onClickLabel: string | null; role: ComposeRole | null; hapticFeedbackEnabled: boolean }): ComposeChain;
  combinedClickable(options: { enabled: boolean; onClickLabel: string | null; role: ComposeRole | null; hapticFeedbackEnabled: boolean; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { enabled: boolean; onClickLabel: string | null; role: ComposeRole | null; hapticFeedbackEnabled: boolean }): ComposeChain;
  combinedClickable(options: { onLongClickLabel: string | null; hapticFeedbackEnabled: boolean; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { onLongClickLabel: string | null; hapticFeedbackEnabled: boolean }): ComposeChain;
  combinedClickable(options: { enabled: boolean; onLongClickLabel: string | null; hapticFeedbackEnabled: boolean; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { enabled: boolean; onLongClickLabel: string | null; hapticFeedbackEnabled: boolean }): ComposeChain;
  combinedClickable(options: { onClickLabel: string | null; onLongClickLabel: string | null; hapticFeedbackEnabled: boolean; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { onClickLabel: string | null; onLongClickLabel: string | null; hapticFeedbackEnabled: boolean }): ComposeChain;
  combinedClickable(options: { enabled: boolean; onClickLabel: string | null; onLongClickLabel: string | null; hapticFeedbackEnabled: boolean; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { enabled: boolean; onClickLabel: string | null; onLongClickLabel: string | null; hapticFeedbackEnabled: boolean }): ComposeChain;
  combinedClickable(options: { role: ComposeRole | null; onLongClickLabel: string | null; hapticFeedbackEnabled: boolean; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { role: ComposeRole | null; onLongClickLabel: string | null; hapticFeedbackEnabled: boolean }): ComposeChain;
  combinedClickable(options: { enabled: boolean; role: ComposeRole | null; onLongClickLabel: string | null; hapticFeedbackEnabled: boolean; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { enabled: boolean; role: ComposeRole | null; onLongClickLabel: string | null; hapticFeedbackEnabled: boolean }): ComposeChain;
  combinedClickable(options: { onClickLabel: string | null; role: ComposeRole | null; onLongClickLabel: string | null; hapticFeedbackEnabled: boolean; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { onClickLabel: string | null; role: ComposeRole | null; onLongClickLabel: string | null; hapticFeedbackEnabled: boolean }): ComposeChain;
  combinedClickable(options: { enabled: boolean; onClickLabel: string | null; role: ComposeRole | null; onLongClickLabel: string | null; hapticFeedbackEnabled: boolean; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { enabled: boolean; onClickLabel: string | null; role: ComposeRole | null; onLongClickLabel: string | null; hapticFeedbackEnabled: boolean }): ComposeChain;
  combinedClickable(options: { onLongClick: (() => void) | null; hapticFeedbackEnabled: boolean; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { onLongClick: (() => void) | null; hapticFeedbackEnabled: boolean }): ComposeChain;
  combinedClickable(options: { enabled: boolean; onLongClick: (() => void) | null; hapticFeedbackEnabled: boolean; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { enabled: boolean; onLongClick: (() => void) | null; hapticFeedbackEnabled: boolean }): ComposeChain;
  combinedClickable(options: { onClickLabel: string | null; onLongClick: (() => void) | null; hapticFeedbackEnabled: boolean; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { onClickLabel: string | null; onLongClick: (() => void) | null; hapticFeedbackEnabled: boolean }): ComposeChain;
  combinedClickable(options: { enabled: boolean; onClickLabel: string | null; onLongClick: (() => void) | null; hapticFeedbackEnabled: boolean; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { enabled: boolean; onClickLabel: string | null; onLongClick: (() => void) | null; hapticFeedbackEnabled: boolean }): ComposeChain;
  combinedClickable(options: { role: ComposeRole | null; onLongClick: (() => void) | null; hapticFeedbackEnabled: boolean; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { role: ComposeRole | null; onLongClick: (() => void) | null; hapticFeedbackEnabled: boolean }): ComposeChain;
  combinedClickable(options: { enabled: boolean; role: ComposeRole | null; onLongClick: (() => void) | null; hapticFeedbackEnabled: boolean; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { enabled: boolean; role: ComposeRole | null; onLongClick: (() => void) | null; hapticFeedbackEnabled: boolean }): ComposeChain;
  combinedClickable(options: { onClickLabel: string | null; role: ComposeRole | null; onLongClick: (() => void) | null; hapticFeedbackEnabled: boolean; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { onClickLabel: string | null; role: ComposeRole | null; onLongClick: (() => void) | null; hapticFeedbackEnabled: boolean }): ComposeChain;
  combinedClickable(options: { enabled: boolean; onClickLabel: string | null; role: ComposeRole | null; onLongClick: (() => void) | null; hapticFeedbackEnabled: boolean; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { enabled: boolean; onClickLabel: string | null; role: ComposeRole | null; onLongClick: (() => void) | null; hapticFeedbackEnabled: boolean }): ComposeChain;
  combinedClickable(options: { onLongClickLabel: string | null; onLongClick: (() => void) | null; hapticFeedbackEnabled: boolean; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { onLongClickLabel: string | null; onLongClick: (() => void) | null; hapticFeedbackEnabled: boolean }): ComposeChain;
  combinedClickable(options: { enabled: boolean; onLongClickLabel: string | null; onLongClick: (() => void) | null; hapticFeedbackEnabled: boolean; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { enabled: boolean; onLongClickLabel: string | null; onLongClick: (() => void) | null; hapticFeedbackEnabled: boolean }): ComposeChain;
  combinedClickable(options: { onClickLabel: string | null; onLongClickLabel: string | null; onLongClick: (() => void) | null; hapticFeedbackEnabled: boolean; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { onClickLabel: string | null; onLongClickLabel: string | null; onLongClick: (() => void) | null; hapticFeedbackEnabled: boolean }): ComposeChain;
  combinedClickable(options: { enabled: boolean; onClickLabel: string | null; onLongClickLabel: string | null; onLongClick: (() => void) | null; hapticFeedbackEnabled: boolean; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { enabled: boolean; onClickLabel: string | null; onLongClickLabel: string | null; onLongClick: (() => void) | null; hapticFeedbackEnabled: boolean }): ComposeChain;
  combinedClickable(options: { role: ComposeRole | null; onLongClickLabel: string | null; onLongClick: (() => void) | null; hapticFeedbackEnabled: boolean; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { role: ComposeRole | null; onLongClickLabel: string | null; onLongClick: (() => void) | null; hapticFeedbackEnabled: boolean }): ComposeChain;
  combinedClickable(options: { enabled: boolean; role: ComposeRole | null; onLongClickLabel: string | null; onLongClick: (() => void) | null; hapticFeedbackEnabled: boolean; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { enabled: boolean; role: ComposeRole | null; onLongClickLabel: string | null; onLongClick: (() => void) | null; hapticFeedbackEnabled: boolean }): ComposeChain;
  combinedClickable(options: { onClickLabel: string | null; role: ComposeRole | null; onLongClickLabel: string | null; onLongClick: (() => void) | null; hapticFeedbackEnabled: boolean; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { onClickLabel: string | null; role: ComposeRole | null; onLongClickLabel: string | null; onLongClick: (() => void) | null; hapticFeedbackEnabled: boolean }): ComposeChain;
  combinedClickable(options: { enabled: boolean; onClickLabel: string | null; role: ComposeRole | null; onLongClickLabel: string | null; onLongClick: (() => void) | null; hapticFeedbackEnabled: boolean; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { enabled: boolean; onClickLabel: string | null; role: ComposeRole | null; onLongClickLabel: string | null; onLongClick: (() => void) | null; hapticFeedbackEnabled: boolean }): ComposeChain;
  combinedClickable(options: { onDoubleClick: (() => void) | null; hapticFeedbackEnabled: boolean; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { onDoubleClick: (() => void) | null; hapticFeedbackEnabled: boolean }): ComposeChain;
  combinedClickable(options: { enabled: boolean; onDoubleClick: (() => void) | null; hapticFeedbackEnabled: boolean; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { enabled: boolean; onDoubleClick: (() => void) | null; hapticFeedbackEnabled: boolean }): ComposeChain;
  combinedClickable(options: { onClickLabel: string | null; onDoubleClick: (() => void) | null; hapticFeedbackEnabled: boolean; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { onClickLabel: string | null; onDoubleClick: (() => void) | null; hapticFeedbackEnabled: boolean }): ComposeChain;
  combinedClickable(options: { enabled: boolean; onClickLabel: string | null; onDoubleClick: (() => void) | null; hapticFeedbackEnabled: boolean; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { enabled: boolean; onClickLabel: string | null; onDoubleClick: (() => void) | null; hapticFeedbackEnabled: boolean }): ComposeChain;
  combinedClickable(options: { role: ComposeRole | null; onDoubleClick: (() => void) | null; hapticFeedbackEnabled: boolean; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { role: ComposeRole | null; onDoubleClick: (() => void) | null; hapticFeedbackEnabled: boolean }): ComposeChain;
  combinedClickable(options: { enabled: boolean; role: ComposeRole | null; onDoubleClick: (() => void) | null; hapticFeedbackEnabled: boolean; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { enabled: boolean; role: ComposeRole | null; onDoubleClick: (() => void) | null; hapticFeedbackEnabled: boolean }): ComposeChain;
  combinedClickable(options: { onClickLabel: string | null; role: ComposeRole | null; onDoubleClick: (() => void) | null; hapticFeedbackEnabled: boolean; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { onClickLabel: string | null; role: ComposeRole | null; onDoubleClick: (() => void) | null; hapticFeedbackEnabled: boolean }): ComposeChain;
  combinedClickable(options: { enabled: boolean; onClickLabel: string | null; role: ComposeRole | null; onDoubleClick: (() => void) | null; hapticFeedbackEnabled: boolean; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { enabled: boolean; onClickLabel: string | null; role: ComposeRole | null; onDoubleClick: (() => void) | null; hapticFeedbackEnabled: boolean }): ComposeChain;
  combinedClickable(options: { onLongClickLabel: string | null; onDoubleClick: (() => void) | null; hapticFeedbackEnabled: boolean; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { onLongClickLabel: string | null; onDoubleClick: (() => void) | null; hapticFeedbackEnabled: boolean }): ComposeChain;
  combinedClickable(options: { enabled: boolean; onLongClickLabel: string | null; onDoubleClick: (() => void) | null; hapticFeedbackEnabled: boolean; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { enabled: boolean; onLongClickLabel: string | null; onDoubleClick: (() => void) | null; hapticFeedbackEnabled: boolean }): ComposeChain;
  combinedClickable(options: { onClickLabel: string | null; onLongClickLabel: string | null; onDoubleClick: (() => void) | null; hapticFeedbackEnabled: boolean; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { onClickLabel: string | null; onLongClickLabel: string | null; onDoubleClick: (() => void) | null; hapticFeedbackEnabled: boolean }): ComposeChain;
  combinedClickable(options: { enabled: boolean; onClickLabel: string | null; onLongClickLabel: string | null; onDoubleClick: (() => void) | null; hapticFeedbackEnabled: boolean; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { enabled: boolean; onClickLabel: string | null; onLongClickLabel: string | null; onDoubleClick: (() => void) | null; hapticFeedbackEnabled: boolean }): ComposeChain;
  combinedClickable(options: { role: ComposeRole | null; onLongClickLabel: string | null; onDoubleClick: (() => void) | null; hapticFeedbackEnabled: boolean; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { role: ComposeRole | null; onLongClickLabel: string | null; onDoubleClick: (() => void) | null; hapticFeedbackEnabled: boolean }): ComposeChain;
  combinedClickable(options: { enabled: boolean; role: ComposeRole | null; onLongClickLabel: string | null; onDoubleClick: (() => void) | null; hapticFeedbackEnabled: boolean; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { enabled: boolean; role: ComposeRole | null; onLongClickLabel: string | null; onDoubleClick: (() => void) | null; hapticFeedbackEnabled: boolean }): ComposeChain;
  combinedClickable(options: { onClickLabel: string | null; role: ComposeRole | null; onLongClickLabel: string | null; onDoubleClick: (() => void) | null; hapticFeedbackEnabled: boolean; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { onClickLabel: string | null; role: ComposeRole | null; onLongClickLabel: string | null; onDoubleClick: (() => void) | null; hapticFeedbackEnabled: boolean }): ComposeChain;
  combinedClickable(options: { enabled: boolean; onClickLabel: string | null; role: ComposeRole | null; onLongClickLabel: string | null; onDoubleClick: (() => void) | null; hapticFeedbackEnabled: boolean; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { enabled: boolean; onClickLabel: string | null; role: ComposeRole | null; onLongClickLabel: string | null; onDoubleClick: (() => void) | null; hapticFeedbackEnabled: boolean }): ComposeChain;
  combinedClickable(options: { onLongClick: (() => void) | null; onDoubleClick: (() => void) | null; hapticFeedbackEnabled: boolean; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { onLongClick: (() => void) | null; onDoubleClick: (() => void) | null; hapticFeedbackEnabled: boolean }): ComposeChain;
  combinedClickable(options: { enabled: boolean; onLongClick: (() => void) | null; onDoubleClick: (() => void) | null; hapticFeedbackEnabled: boolean; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { enabled: boolean; onLongClick: (() => void) | null; onDoubleClick: (() => void) | null; hapticFeedbackEnabled: boolean }): ComposeChain;
  combinedClickable(options: { onClickLabel: string | null; onLongClick: (() => void) | null; onDoubleClick: (() => void) | null; hapticFeedbackEnabled: boolean; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { onClickLabel: string | null; onLongClick: (() => void) | null; onDoubleClick: (() => void) | null; hapticFeedbackEnabled: boolean }): ComposeChain;
  combinedClickable(options: { enabled: boolean; onClickLabel: string | null; onLongClick: (() => void) | null; onDoubleClick: (() => void) | null; hapticFeedbackEnabled: boolean; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { enabled: boolean; onClickLabel: string | null; onLongClick: (() => void) | null; onDoubleClick: (() => void) | null; hapticFeedbackEnabled: boolean }): ComposeChain;
  combinedClickable(options: { role: ComposeRole | null; onLongClick: (() => void) | null; onDoubleClick: (() => void) | null; hapticFeedbackEnabled: boolean; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { role: ComposeRole | null; onLongClick: (() => void) | null; onDoubleClick: (() => void) | null; hapticFeedbackEnabled: boolean }): ComposeChain;
  combinedClickable(options: { enabled: boolean; role: ComposeRole | null; onLongClick: (() => void) | null; onDoubleClick: (() => void) | null; hapticFeedbackEnabled: boolean; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { enabled: boolean; role: ComposeRole | null; onLongClick: (() => void) | null; onDoubleClick: (() => void) | null; hapticFeedbackEnabled: boolean }): ComposeChain;
  combinedClickable(options: { onClickLabel: string | null; role: ComposeRole | null; onLongClick: (() => void) | null; onDoubleClick: (() => void) | null; hapticFeedbackEnabled: boolean; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { onClickLabel: string | null; role: ComposeRole | null; onLongClick: (() => void) | null; onDoubleClick: (() => void) | null; hapticFeedbackEnabled: boolean }): ComposeChain;
  combinedClickable(options: { enabled: boolean; onClickLabel: string | null; role: ComposeRole | null; onLongClick: (() => void) | null; onDoubleClick: (() => void) | null; hapticFeedbackEnabled: boolean; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { enabled: boolean; onClickLabel: string | null; role: ComposeRole | null; onLongClick: (() => void) | null; onDoubleClick: (() => void) | null; hapticFeedbackEnabled: boolean }): ComposeChain;
  combinedClickable(options: { onLongClickLabel: string | null; onLongClick: (() => void) | null; onDoubleClick: (() => void) | null; hapticFeedbackEnabled: boolean; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { onLongClickLabel: string | null; onLongClick: (() => void) | null; onDoubleClick: (() => void) | null; hapticFeedbackEnabled: boolean }): ComposeChain;
  combinedClickable(options: { enabled: boolean; onLongClickLabel: string | null; onLongClick: (() => void) | null; onDoubleClick: (() => void) | null; hapticFeedbackEnabled: boolean; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { enabled: boolean; onLongClickLabel: string | null; onLongClick: (() => void) | null; onDoubleClick: (() => void) | null; hapticFeedbackEnabled: boolean }): ComposeChain;
  combinedClickable(options: { onClickLabel: string | null; onLongClickLabel: string | null; onLongClick: (() => void) | null; onDoubleClick: (() => void) | null; hapticFeedbackEnabled: boolean; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { onClickLabel: string | null; onLongClickLabel: string | null; onLongClick: (() => void) | null; onDoubleClick: (() => void) | null; hapticFeedbackEnabled: boolean }): ComposeChain;
  combinedClickable(options: { enabled: boolean; onClickLabel: string | null; onLongClickLabel: string | null; onLongClick: (() => void) | null; onDoubleClick: (() => void) | null; hapticFeedbackEnabled: boolean; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { enabled: boolean; onClickLabel: string | null; onLongClickLabel: string | null; onLongClick: (() => void) | null; onDoubleClick: (() => void) | null; hapticFeedbackEnabled: boolean }): ComposeChain;
  combinedClickable(options: { role: ComposeRole | null; onLongClickLabel: string | null; onLongClick: (() => void) | null; onDoubleClick: (() => void) | null; hapticFeedbackEnabled: boolean; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { role: ComposeRole | null; onLongClickLabel: string | null; onLongClick: (() => void) | null; onDoubleClick: (() => void) | null; hapticFeedbackEnabled: boolean }): ComposeChain;
  combinedClickable(options: { enabled: boolean; role: ComposeRole | null; onLongClickLabel: string | null; onLongClick: (() => void) | null; onDoubleClick: (() => void) | null; hapticFeedbackEnabled: boolean; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { enabled: boolean; role: ComposeRole | null; onLongClickLabel: string | null; onLongClick: (() => void) | null; onDoubleClick: (() => void) | null; hapticFeedbackEnabled: boolean }): ComposeChain;
  combinedClickable(options: { onClickLabel: string | null; role: ComposeRole | null; onLongClickLabel: string | null; onLongClick: (() => void) | null; onDoubleClick: (() => void) | null; hapticFeedbackEnabled: boolean; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { onClickLabel: string | null; role: ComposeRole | null; onLongClickLabel: string | null; onLongClick: (() => void) | null; onDoubleClick: (() => void) | null; hapticFeedbackEnabled: boolean }): ComposeChain;
  combinedClickable(options: { enabled: boolean; onClickLabel: string | null; role: ComposeRole | null; onLongClickLabel: string | null; onLongClick: (() => void) | null; onDoubleClick: (() => void) | null; hapticFeedbackEnabled: boolean; onClick: () => void }): ComposeChain;
  combinedClickable(onClick: () => void, options: { enabled: boolean; onClickLabel: string | null; role: ComposeRole | null; onLongClickLabel: string | null; onLongClick: (() => void) | null; onDoubleClick: (() => void) | null; hapticFeedbackEnabled: boolean }): ComposeChain;
  consumeWindowInsets(options: { insets: ComposeWindowInsets }): ComposeChain;
  consumeWindowInsets(insets: ComposeWindowInsets): ComposeChain;
  consumeWindowInsets(options: { paddingValues: ComposePaddingValues }): ComposeChain;
  consumeWindowInsets(paddingValues: ComposePaddingValues): ComposeChain;
  defaultMinSize(): ComposeChain;
  defaultMinSize(options: { minWidth: number }): ComposeChain;
  defaultMinSize(minWidth: number): ComposeChain;
  defaultMinSize(options: { minHeight: number }): ComposeChain;
  defaultMinSize(minHeight: number): ComposeChain;
  defaultMinSize(options: { minWidth: number; minHeight: number }): ComposeChain;
  displayCutoutPadding(): ComposeChain;
  exposedDropdownSize(): ComposeChain;
  exposedDropdownSize(options: { matchAnchorWidth: boolean }): ComposeChain;
  exposedDropdownSize(matchAnchorWidth: boolean): ComposeChain;
  fillMaxColumnWidth(): ComposeChain;
  fillMaxColumnWidth(options: { fraction: number }): ComposeChain;
  fillMaxColumnWidth(fraction: number): ComposeChain;
  fillMaxHeight(): ComposeChain;
  fillMaxHeight(options: { fraction: number }): ComposeChain;
  fillMaxHeight(fraction: number): ComposeChain;
  fillMaxRowHeight(): ComposeChain;
  fillMaxRowHeight(options: { fraction: number }): ComposeChain;
  fillMaxRowHeight(fraction: number): ComposeChain;
  fillMaxSize(): ComposeChain;
  fillMaxSize(options: { fraction: number }): ComposeChain;
  fillMaxSize(fraction: number): ComposeChain;
  fillMaxWidth(): ComposeChain;
  fillMaxWidth(options: { fraction: number }): ComposeChain;
  fillMaxWidth(fraction: number): ComposeChain;
  fillParentMaxHeight(): ComposeChain;
  fillParentMaxHeight(options: { fraction: number }): ComposeChain;
  fillParentMaxHeight(fraction: number): ComposeChain;
  fillParentMaxSize(): ComposeChain;
  fillParentMaxSize(options: { fraction: number }): ComposeChain;
  fillParentMaxSize(fraction: number): ComposeChain;
  fillParentMaxWidth(): ComposeChain;
  fillParentMaxWidth(options: { fraction: number }): ComposeChain;
  fillParentMaxWidth(fraction: number): ComposeChain;
  focusable(): ComposeChain;
  focusable(options: { enabled: boolean }): ComposeChain;
  focusable(enabled: boolean): ComposeChain;
  focusGroup(): ComposeChain;
  focusProperties(options: { scope: ComposeFocusProperties }): ComposeChain;
  focusProperties(scope: ComposeFocusProperties): ComposeChain;
  focusRequester(options: { focusRequester: ComposeFocusRequester }): ComposeChain;
  focusRequester(focusRequester: ComposeFocusRequester): ComposeChain;
  focusRestorer(): ComposeChain;
  focusRestorer(options: { fallback: ComposeFocusRequester }): ComposeChain;
  focusRestorer(fallback: ComposeFocusRequester): ComposeChain;
  focusTarget(): ComposeChain;
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
  graphicsLayer(options: { translationY: number }): ComposeChain;
  graphicsLayer(translationY: number): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationY: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationY: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationY: number }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationY: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationY: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationY: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationY: number }): ComposeChain;
  graphicsLayer(options: { translationX: number; translationY: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationX: number; translationY: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationX: number; translationY: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationX: number; translationY: number }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationX: number; translationY: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationX: number; translationY: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationX: number; translationY: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationX: number; translationY: number }): ComposeChain;
  graphicsLayer(options: { shadowElevation: number }): ComposeChain;
  graphicsLayer(shadowElevation: number): ComposeChain;
  graphicsLayer(options: { scaleX: number; shadowElevation: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; shadowElevation: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; shadowElevation: number }): ComposeChain;
  graphicsLayer(options: { alpha: number; shadowElevation: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; shadowElevation: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; shadowElevation: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; shadowElevation: number }): ComposeChain;
  graphicsLayer(options: { translationX: number; shadowElevation: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationX: number; shadowElevation: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationX: number; shadowElevation: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationX: number; shadowElevation: number }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationX: number; shadowElevation: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationX: number; shadowElevation: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationX: number; shadowElevation: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationX: number; shadowElevation: number }): ComposeChain;
  graphicsLayer(options: { translationY: number; shadowElevation: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationY: number; shadowElevation: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationY: number; shadowElevation: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationY: number; shadowElevation: number }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationY: number; shadowElevation: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationY: number; shadowElevation: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationY: number; shadowElevation: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationY: number; shadowElevation: number }): ComposeChain;
  graphicsLayer(options: { translationX: number; translationY: number; shadowElevation: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationX: number; translationY: number; shadowElevation: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationX: number; translationY: number; shadowElevation: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationX: number; translationY: number; shadowElevation: number }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationX: number; translationY: number; shadowElevation: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationX: number; translationY: number; shadowElevation: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationX: number; translationY: number; shadowElevation: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationX: number; translationY: number; shadowElevation: number }): ComposeChain;
  graphicsLayer(options: { rotationX: number }): ComposeChain;
  graphicsLayer(rotationX: number): ComposeChain;
  graphicsLayer(options: { scaleX: number; rotationX: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; rotationX: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; rotationX: number }): ComposeChain;
  graphicsLayer(options: { alpha: number; rotationX: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; rotationX: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; rotationX: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; rotationX: number }): ComposeChain;
  graphicsLayer(options: { translationX: number; rotationX: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationX: number; rotationX: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationX: number; rotationX: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationX: number; rotationX: number }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationX: number; rotationX: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationX: number; rotationX: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationX: number; rotationX: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationX: number; rotationX: number }): ComposeChain;
  graphicsLayer(options: { translationY: number; rotationX: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationY: number; rotationX: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationY: number; rotationX: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationY: number; rotationX: number }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationY: number; rotationX: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationY: number; rotationX: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationY: number; rotationX: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationY: number; rotationX: number }): ComposeChain;
  graphicsLayer(options: { translationX: number; translationY: number; rotationX: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationX: number; translationY: number; rotationX: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationX: number; translationY: number; rotationX: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationX: number; translationY: number; rotationX: number }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationX: number; translationY: number; rotationX: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationX: number; translationY: number; rotationX: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationX: number; translationY: number; rotationX: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationX: number; translationY: number; rotationX: number }): ComposeChain;
  graphicsLayer(options: { shadowElevation: number; rotationX: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; shadowElevation: number; rotationX: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; shadowElevation: number; rotationX: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; shadowElevation: number; rotationX: number }): ComposeChain;
  graphicsLayer(options: { alpha: number; shadowElevation: number; rotationX: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; shadowElevation: number; rotationX: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; shadowElevation: number; rotationX: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; shadowElevation: number; rotationX: number }): ComposeChain;
  graphicsLayer(options: { translationX: number; shadowElevation: number; rotationX: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationX: number; shadowElevation: number; rotationX: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationX: number; shadowElevation: number; rotationX: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationX: number; shadowElevation: number; rotationX: number }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationX: number; shadowElevation: number; rotationX: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationX: number; shadowElevation: number; rotationX: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationX: number; shadowElevation: number; rotationX: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationX: number; shadowElevation: number; rotationX: number }): ComposeChain;
  graphicsLayer(options: { translationY: number; shadowElevation: number; rotationX: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationY: number; shadowElevation: number; rotationX: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationY: number; shadowElevation: number; rotationX: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationY: number; shadowElevation: number; rotationX: number }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationY: number; shadowElevation: number; rotationX: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationY: number; shadowElevation: number; rotationX: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationY: number; shadowElevation: number; rotationX: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationY: number; shadowElevation: number; rotationX: number }): ComposeChain;
  graphicsLayer(options: { translationX: number; translationY: number; shadowElevation: number; rotationX: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationX: number; translationY: number; shadowElevation: number; rotationX: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationX: number; translationY: number; shadowElevation: number; rotationX: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationX: number; translationY: number; shadowElevation: number; rotationX: number }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationX: number; translationY: number; shadowElevation: number; rotationX: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationX: number; translationY: number; shadowElevation: number; rotationX: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationX: number; translationY: number; shadowElevation: number; rotationX: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationX: number; translationY: number; shadowElevation: number; rotationX: number }): ComposeChain;
  graphicsLayer(options: { rotationY: number }): ComposeChain;
  graphicsLayer(rotationY: number): ComposeChain;
  graphicsLayer(options: { scaleX: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { alpha: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { translationX: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationX: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationX: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationX: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationX: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationX: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationX: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationX: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { translationY: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationY: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationY: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationY: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationY: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationY: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationY: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationY: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { translationX: number; translationY: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationX: number; translationY: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationX: number; translationY: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationX: number; translationY: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationX: number; translationY: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationX: number; translationY: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationX: number; translationY: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationX: number; translationY: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { shadowElevation: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; shadowElevation: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; shadowElevation: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; shadowElevation: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { alpha: number; shadowElevation: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; shadowElevation: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; shadowElevation: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; shadowElevation: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { translationX: number; shadowElevation: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationX: number; shadowElevation: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationX: number; shadowElevation: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationX: number; shadowElevation: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationX: number; shadowElevation: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationX: number; shadowElevation: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationX: number; shadowElevation: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationX: number; shadowElevation: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { translationY: number; shadowElevation: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationY: number; shadowElevation: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationY: number; shadowElevation: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationY: number; shadowElevation: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationY: number; shadowElevation: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationY: number; shadowElevation: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationY: number; shadowElevation: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationY: number; shadowElevation: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { translationX: number; translationY: number; shadowElevation: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationX: number; translationY: number; shadowElevation: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationX: number; translationY: number; shadowElevation: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationX: number; translationY: number; shadowElevation: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationX: number; translationY: number; shadowElevation: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationX: number; translationY: number; shadowElevation: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationX: number; translationY: number; shadowElevation: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationX: number; translationY: number; shadowElevation: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { rotationX: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; rotationX: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; rotationX: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; rotationX: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { alpha: number; rotationX: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; rotationX: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; rotationX: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; rotationX: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { translationX: number; rotationX: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationX: number; rotationX: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationX: number; rotationX: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationX: number; rotationX: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationX: number; rotationX: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationX: number; rotationX: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationX: number; rotationX: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationX: number; rotationX: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { translationY: number; rotationX: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationY: number; rotationX: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationY: number; rotationX: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationY: number; rotationX: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationY: number; rotationX: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationY: number; rotationX: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationY: number; rotationX: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationY: number; rotationX: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { translationX: number; translationY: number; rotationX: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationX: number; translationY: number; rotationX: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationX: number; translationY: number; rotationX: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationX: number; translationY: number; rotationX: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationX: number; translationY: number; rotationX: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationX: number; translationY: number; rotationX: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationX: number; translationY: number; rotationX: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationX: number; translationY: number; rotationX: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { shadowElevation: number; rotationX: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; shadowElevation: number; rotationX: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; shadowElevation: number; rotationX: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; shadowElevation: number; rotationX: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { alpha: number; shadowElevation: number; rotationX: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; shadowElevation: number; rotationX: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; shadowElevation: number; rotationX: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; shadowElevation: number; rotationX: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { translationX: number; shadowElevation: number; rotationX: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationX: number; shadowElevation: number; rotationX: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationX: number; shadowElevation: number; rotationX: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationX: number; shadowElevation: number; rotationX: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationX: number; shadowElevation: number; rotationX: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationX: number; shadowElevation: number; rotationX: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationX: number; shadowElevation: number; rotationX: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationX: number; shadowElevation: number; rotationX: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { translationY: number; shadowElevation: number; rotationX: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationY: number; shadowElevation: number; rotationX: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationY: number; shadowElevation: number; rotationX: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationY: number; shadowElevation: number; rotationX: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationY: number; shadowElevation: number; rotationX: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationY: number; shadowElevation: number; rotationX: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationY: number; shadowElevation: number; rotationX: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationY: number; shadowElevation: number; rotationX: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { translationX: number; translationY: number; shadowElevation: number; rotationX: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationX: number; translationY: number; shadowElevation: number; rotationX: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationX: number; translationY: number; shadowElevation: number; rotationX: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationX: number; translationY: number; shadowElevation: number; rotationX: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationX: number; translationY: number; shadowElevation: number; rotationX: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationX: number; translationY: number; shadowElevation: number; rotationX: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationX: number; translationY: number; shadowElevation: number; rotationX: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationX: number; translationY: number; shadowElevation: number; rotationX: number; rotationY: number }): ComposeChain;
  graphicsLayer(options: { rotationZ: number }): ComposeChain;
  graphicsLayer(rotationZ: number): ComposeChain;
  graphicsLayer(options: { scaleX: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { alpha: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { translationX: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationX: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationX: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationX: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationX: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationX: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationX: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationX: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { translationY: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationY: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationY: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationY: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationY: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationY: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationY: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationY: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { translationX: number; translationY: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationX: number; translationY: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationX: number; translationY: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationX: number; translationY: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationX: number; translationY: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationX: number; translationY: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationX: number; translationY: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationX: number; translationY: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { shadowElevation: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; shadowElevation: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; shadowElevation: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; shadowElevation: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { alpha: number; shadowElevation: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; shadowElevation: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; shadowElevation: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; shadowElevation: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { translationX: number; shadowElevation: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationX: number; shadowElevation: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationX: number; shadowElevation: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationX: number; shadowElevation: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationX: number; shadowElevation: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationX: number; shadowElevation: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationX: number; shadowElevation: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationX: number; shadowElevation: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { translationY: number; shadowElevation: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationY: number; shadowElevation: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationY: number; shadowElevation: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationY: number; shadowElevation: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationY: number; shadowElevation: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationY: number; shadowElevation: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationY: number; shadowElevation: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationY: number; shadowElevation: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { translationX: number; translationY: number; shadowElevation: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationX: number; translationY: number; shadowElevation: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationX: number; translationY: number; shadowElevation: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationX: number; translationY: number; shadowElevation: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationX: number; translationY: number; shadowElevation: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationX: number; translationY: number; shadowElevation: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationX: number; translationY: number; shadowElevation: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationX: number; translationY: number; shadowElevation: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { rotationX: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; rotationX: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; rotationX: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; rotationX: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { alpha: number; rotationX: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; rotationX: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; rotationX: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; rotationX: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { translationX: number; rotationX: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationX: number; rotationX: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationX: number; rotationX: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationX: number; rotationX: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationX: number; rotationX: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationX: number; rotationX: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationX: number; rotationX: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationX: number; rotationX: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { translationY: number; rotationX: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationY: number; rotationX: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationY: number; rotationX: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationY: number; rotationX: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationY: number; rotationX: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationY: number; rotationX: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationY: number; rotationX: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationY: number; rotationX: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { translationX: number; translationY: number; rotationX: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationX: number; translationY: number; rotationX: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationX: number; translationY: number; rotationX: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationX: number; translationY: number; rotationX: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationX: number; translationY: number; rotationX: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationX: number; translationY: number; rotationX: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationX: number; translationY: number; rotationX: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationX: number; translationY: number; rotationX: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { shadowElevation: number; rotationX: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; shadowElevation: number; rotationX: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; shadowElevation: number; rotationX: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; shadowElevation: number; rotationX: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { alpha: number; shadowElevation: number; rotationX: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; shadowElevation: number; rotationX: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; shadowElevation: number; rotationX: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; shadowElevation: number; rotationX: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { translationX: number; shadowElevation: number; rotationX: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationX: number; shadowElevation: number; rotationX: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationX: number; shadowElevation: number; rotationX: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationX: number; shadowElevation: number; rotationX: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationX: number; shadowElevation: number; rotationX: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationX: number; shadowElevation: number; rotationX: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationX: number; shadowElevation: number; rotationX: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationX: number; shadowElevation: number; rotationX: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { translationY: number; shadowElevation: number; rotationX: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationY: number; shadowElevation: number; rotationX: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationY: number; shadowElevation: number; rotationX: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationY: number; shadowElevation: number; rotationX: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationY: number; shadowElevation: number; rotationX: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationY: number; shadowElevation: number; rotationX: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationY: number; shadowElevation: number; rotationX: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationY: number; shadowElevation: number; rotationX: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { translationX: number; translationY: number; shadowElevation: number; rotationX: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationX: number; translationY: number; shadowElevation: number; rotationX: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationX: number; translationY: number; shadowElevation: number; rotationX: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationX: number; translationY: number; shadowElevation: number; rotationX: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationX: number; translationY: number; shadowElevation: number; rotationX: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationX: number; translationY: number; shadowElevation: number; rotationX: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationX: number; translationY: number; shadowElevation: number; rotationX: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationX: number; translationY: number; shadowElevation: number; rotationX: number; rotationZ: number }): ComposeChain;
  graphicsLayer(options: { cameraDistance: number }): ComposeChain;
  graphicsLayer(cameraDistance: number): ComposeChain;
  graphicsLayer(options: { scaleX: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { alpha: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { translationX: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationX: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationX: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationX: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationX: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationX: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationX: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationX: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { translationY: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationY: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationY: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationY: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationY: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationY: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationY: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationY: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { translationX: number; translationY: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationX: number; translationY: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationX: number; translationY: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationX: number; translationY: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationX: number; translationY: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationX: number; translationY: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationX: number; translationY: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationX: number; translationY: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { shadowElevation: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; shadowElevation: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; shadowElevation: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; shadowElevation: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { alpha: number; shadowElevation: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; shadowElevation: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; shadowElevation: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; shadowElevation: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { translationX: number; shadowElevation: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationX: number; shadowElevation: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationX: number; shadowElevation: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationX: number; shadowElevation: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationX: number; shadowElevation: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationX: number; shadowElevation: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationX: number; shadowElevation: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationX: number; shadowElevation: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { translationY: number; shadowElevation: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationY: number; shadowElevation: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationY: number; shadowElevation: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationY: number; shadowElevation: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationY: number; shadowElevation: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationY: number; shadowElevation: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationY: number; shadowElevation: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationY: number; shadowElevation: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { translationX: number; translationY: number; shadowElevation: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationX: number; translationY: number; shadowElevation: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationX: number; translationY: number; shadowElevation: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationX: number; translationY: number; shadowElevation: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationX: number; translationY: number; shadowElevation: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationX: number; translationY: number; shadowElevation: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationX: number; translationY: number; shadowElevation: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationX: number; translationY: number; shadowElevation: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { rotationX: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; rotationX: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; rotationX: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; rotationX: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { alpha: number; rotationX: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; rotationX: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; rotationX: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; rotationX: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { translationX: number; rotationX: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationX: number; rotationX: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationX: number; rotationX: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationX: number; rotationX: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationX: number; rotationX: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationX: number; rotationX: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationX: number; rotationX: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationX: number; rotationX: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { translationY: number; rotationX: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationY: number; rotationX: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationY: number; rotationX: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationY: number; rotationX: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationY: number; rotationX: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationY: number; rotationX: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationY: number; rotationX: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationY: number; rotationX: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { translationX: number; translationY: number; rotationX: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationX: number; translationY: number; rotationX: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationX: number; translationY: number; rotationX: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationX: number; translationY: number; rotationX: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationX: number; translationY: number; rotationX: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationX: number; translationY: number; rotationX: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationX: number; translationY: number; rotationX: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationX: number; translationY: number; rotationX: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { shadowElevation: number; rotationX: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; shadowElevation: number; rotationX: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; shadowElevation: number; rotationX: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; shadowElevation: number; rotationX: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { alpha: number; shadowElevation: number; rotationX: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; shadowElevation: number; rotationX: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; shadowElevation: number; rotationX: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; shadowElevation: number; rotationX: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { translationX: number; shadowElevation: number; rotationX: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationX: number; shadowElevation: number; rotationX: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationX: number; shadowElevation: number; rotationX: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationX: number; shadowElevation: number; rotationX: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationX: number; shadowElevation: number; rotationX: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationX: number; shadowElevation: number; rotationX: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationX: number; shadowElevation: number; rotationX: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationX: number; shadowElevation: number; rotationX: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { translationY: number; shadowElevation: number; rotationX: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationY: number; shadowElevation: number; rotationX: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationY: number; shadowElevation: number; rotationX: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationY: number; shadowElevation: number; rotationX: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationY: number; shadowElevation: number; rotationX: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationY: number; shadowElevation: number; rotationX: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationY: number; shadowElevation: number; rotationX: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationY: number; shadowElevation: number; rotationX: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { translationX: number; translationY: number; shadowElevation: number; rotationX: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationX: number; translationY: number; shadowElevation: number; rotationX: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationX: number; translationY: number; shadowElevation: number; rotationX: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationX: number; translationY: number; shadowElevation: number; rotationX: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationX: number; translationY: number; shadowElevation: number; rotationX: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationX: number; translationY: number; shadowElevation: number; rotationX: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationX: number; translationY: number; shadowElevation: number; rotationX: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationX: number; translationY: number; shadowElevation: number; rotationX: number; cameraDistance: number }): ComposeChain;
  graphicsLayer(options: { transformOrigin: ComposeTransformOrigin }): ComposeChain;
  graphicsLayer(transformOrigin: ComposeTransformOrigin): ComposeChain;
  graphicsLayer(options: { scaleX: number; transformOrigin: ComposeTransformOrigin }): ComposeChain;
  graphicsLayer(options: { scaleY: number; transformOrigin: ComposeTransformOrigin }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; transformOrigin: ComposeTransformOrigin }): ComposeChain;
  graphicsLayer(options: { alpha: number; transformOrigin: ComposeTransformOrigin }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; transformOrigin: ComposeTransformOrigin }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; transformOrigin: ComposeTransformOrigin }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; transformOrigin: ComposeTransformOrigin }): ComposeChain;
  graphicsLayer(options: { translationX: number; transformOrigin: ComposeTransformOrigin }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationX: number; transformOrigin: ComposeTransformOrigin }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationX: number; transformOrigin: ComposeTransformOrigin }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationX: number; transformOrigin: ComposeTransformOrigin }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationX: number; transformOrigin: ComposeTransformOrigin }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationX: number; transformOrigin: ComposeTransformOrigin }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationX: number; transformOrigin: ComposeTransformOrigin }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationX: number; transformOrigin: ComposeTransformOrigin }): ComposeChain;
  graphicsLayer(options: { translationY: number; transformOrigin: ComposeTransformOrigin }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationY: number; transformOrigin: ComposeTransformOrigin }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationY: number; transformOrigin: ComposeTransformOrigin }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationY: number; transformOrigin: ComposeTransformOrigin }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationY: number; transformOrigin: ComposeTransformOrigin }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationY: number; transformOrigin: ComposeTransformOrigin }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationY: number; transformOrigin: ComposeTransformOrigin }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationY: number; transformOrigin: ComposeTransformOrigin }): ComposeChain;
  graphicsLayer(options: { translationX: number; translationY: number; transformOrigin: ComposeTransformOrigin }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationX: number; translationY: number; transformOrigin: ComposeTransformOrigin }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationX: number; translationY: number; transformOrigin: ComposeTransformOrigin }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationX: number; translationY: number; transformOrigin: ComposeTransformOrigin }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationX: number; translationY: number; transformOrigin: ComposeTransformOrigin }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationX: number; translationY: number; transformOrigin: ComposeTransformOrigin }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationX: number; translationY: number; transformOrigin: ComposeTransformOrigin }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationX: number; translationY: number; transformOrigin: ComposeTransformOrigin }): ComposeChain;
  graphicsLayer(options: { shadowElevation: number; transformOrigin: ComposeTransformOrigin }): ComposeChain;
  graphicsLayer(options: { scaleX: number; shadowElevation: number; transformOrigin: ComposeTransformOrigin }): ComposeChain;
  graphicsLayer(options: { scaleY: number; shadowElevation: number; transformOrigin: ComposeTransformOrigin }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; shadowElevation: number; transformOrigin: ComposeTransformOrigin }): ComposeChain;
  graphicsLayer(options: { alpha: number; shadowElevation: number; transformOrigin: ComposeTransformOrigin }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; shadowElevation: number; transformOrigin: ComposeTransformOrigin }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; shadowElevation: number; transformOrigin: ComposeTransformOrigin }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; shadowElevation: number; transformOrigin: ComposeTransformOrigin }): ComposeChain;
  graphicsLayer(options: { translationX: number; shadowElevation: number; transformOrigin: ComposeTransformOrigin }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationX: number; shadowElevation: number; transformOrigin: ComposeTransformOrigin }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationX: number; shadowElevation: number; transformOrigin: ComposeTransformOrigin }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationX: number; shadowElevation: number; transformOrigin: ComposeTransformOrigin }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationX: number; shadowElevation: number; transformOrigin: ComposeTransformOrigin }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationX: number; shadowElevation: number; transformOrigin: ComposeTransformOrigin }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationX: number; shadowElevation: number; transformOrigin: ComposeTransformOrigin }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationX: number; shadowElevation: number; transformOrigin: ComposeTransformOrigin }): ComposeChain;
  graphicsLayer(options: { translationY: number; shadowElevation: number; transformOrigin: ComposeTransformOrigin }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationY: number; shadowElevation: number; transformOrigin: ComposeTransformOrigin }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationY: number; shadowElevation: number; transformOrigin: ComposeTransformOrigin }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationY: number; shadowElevation: number; transformOrigin: ComposeTransformOrigin }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationY: number; shadowElevation: number; transformOrigin: ComposeTransformOrigin }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationY: number; shadowElevation: number; transformOrigin: ComposeTransformOrigin }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationY: number; shadowElevation: number; transformOrigin: ComposeTransformOrigin }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationY: number; shadowElevation: number; transformOrigin: ComposeTransformOrigin }): ComposeChain;
  graphicsLayer(options: { translationX: number; translationY: number; shadowElevation: number; transformOrigin: ComposeTransformOrigin }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationX: number; translationY: number; shadowElevation: number; transformOrigin: ComposeTransformOrigin }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationX: number; translationY: number; shadowElevation: number; transformOrigin: ComposeTransformOrigin }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationX: number; translationY: number; shadowElevation: number; transformOrigin: ComposeTransformOrigin }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationX: number; translationY: number; shadowElevation: number; transformOrigin: ComposeTransformOrigin }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationX: number; translationY: number; shadowElevation: number; transformOrigin: ComposeTransformOrigin }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationX: number; translationY: number; shadowElevation: number; transformOrigin: ComposeTransformOrigin }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationX: number; translationY: number; shadowElevation: number; transformOrigin: ComposeTransformOrigin }): ComposeChain;
  graphicsLayer(options: { shape: ComposeShape }): ComposeChain;
  graphicsLayer(shape: ComposeShape): ComposeChain;
  graphicsLayer(options: { scaleX: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleY: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { alpha: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { translationX: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationX: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationX: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationX: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationX: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationX: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationX: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationX: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { translationY: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationY: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationY: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationY: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationY: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationY: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationY: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationY: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { translationX: number; translationY: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationX: number; translationY: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationX: number; translationY: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationX: number; translationY: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationX: number; translationY: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationX: number; translationY: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationX: number; translationY: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationX: number; translationY: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { shadowElevation: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleX: number; shadowElevation: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleY: number; shadowElevation: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; shadowElevation: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { alpha: number; shadowElevation: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; shadowElevation: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; shadowElevation: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; shadowElevation: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { translationX: number; shadowElevation: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationX: number; shadowElevation: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationX: number; shadowElevation: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationX: number; shadowElevation: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationX: number; shadowElevation: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationX: number; shadowElevation: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationX: number; shadowElevation: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationX: number; shadowElevation: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { translationY: number; shadowElevation: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationY: number; shadowElevation: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationY: number; shadowElevation: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationY: number; shadowElevation: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationY: number; shadowElevation: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationY: number; shadowElevation: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationY: number; shadowElevation: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationY: number; shadowElevation: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { translationX: number; translationY: number; shadowElevation: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationX: number; translationY: number; shadowElevation: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationX: number; translationY: number; shadowElevation: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationX: number; translationY: number; shadowElevation: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationX: number; translationY: number; shadowElevation: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationX: number; translationY: number; shadowElevation: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationX: number; translationY: number; shadowElevation: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationX: number; translationY: number; shadowElevation: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { rotationX: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleX: number; rotationX: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleY: number; rotationX: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; rotationX: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { alpha: number; rotationX: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; rotationX: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; rotationX: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; rotationX: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { translationX: number; rotationX: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationX: number; rotationX: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationX: number; rotationX: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationX: number; rotationX: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationX: number; rotationX: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationX: number; rotationX: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationX: number; rotationX: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationX: number; rotationX: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { translationY: number; rotationX: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationY: number; rotationX: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationY: number; rotationX: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationY: number; rotationX: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationY: number; rotationX: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationY: number; rotationX: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationY: number; rotationX: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationY: number; rotationX: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { translationX: number; translationY: number; rotationX: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationX: number; translationY: number; rotationX: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationX: number; translationY: number; rotationX: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationX: number; translationY: number; rotationX: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationX: number; translationY: number; rotationX: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationX: number; translationY: number; rotationX: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationX: number; translationY: number; rotationX: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationX: number; translationY: number; rotationX: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { shadowElevation: number; rotationX: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleX: number; shadowElevation: number; rotationX: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleY: number; shadowElevation: number; rotationX: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; shadowElevation: number; rotationX: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { alpha: number; shadowElevation: number; rotationX: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; shadowElevation: number; rotationX: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; shadowElevation: number; rotationX: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; shadowElevation: number; rotationX: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { translationX: number; shadowElevation: number; rotationX: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationX: number; shadowElevation: number; rotationX: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationX: number; shadowElevation: number; rotationX: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationX: number; shadowElevation: number; rotationX: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationX: number; shadowElevation: number; rotationX: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationX: number; shadowElevation: number; rotationX: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationX: number; shadowElevation: number; rotationX: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationX: number; shadowElevation: number; rotationX: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { translationY: number; shadowElevation: number; rotationX: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationY: number; shadowElevation: number; rotationX: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationY: number; shadowElevation: number; rotationX: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationY: number; shadowElevation: number; rotationX: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationY: number; shadowElevation: number; rotationX: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationY: number; shadowElevation: number; rotationX: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationY: number; shadowElevation: number; rotationX: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationY: number; shadowElevation: number; rotationX: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { translationX: number; translationY: number; shadowElevation: number; rotationX: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationX: number; translationY: number; shadowElevation: number; rotationX: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationX: number; translationY: number; shadowElevation: number; rotationX: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationX: number; translationY: number; shadowElevation: number; rotationX: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationX: number; translationY: number; shadowElevation: number; rotationX: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationX: number; translationY: number; shadowElevation: number; rotationX: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationX: number; translationY: number; shadowElevation: number; rotationX: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationX: number; translationY: number; shadowElevation: number; rotationX: number; shape: ComposeShape }): ComposeChain;
  graphicsLayer(options: { clip: boolean }): ComposeChain;
  graphicsLayer(clip: boolean): ComposeChain;
  graphicsLayer(options: { scaleX: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleY: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { alpha: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { translationX: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationX: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationX: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationX: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationX: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationX: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationX: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationX: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { translationY: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationY: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationY: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationY: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationY: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationY: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationY: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationY: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { translationX: number; translationY: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationX: number; translationY: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationX: number; translationY: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationX: number; translationY: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationX: number; translationY: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationX: number; translationY: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationX: number; translationY: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationX: number; translationY: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { shadowElevation: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleX: number; shadowElevation: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleY: number; shadowElevation: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; shadowElevation: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { alpha: number; shadowElevation: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; shadowElevation: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; shadowElevation: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; shadowElevation: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { translationX: number; shadowElevation: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationX: number; shadowElevation: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationX: number; shadowElevation: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationX: number; shadowElevation: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationX: number; shadowElevation: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationX: number; shadowElevation: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationX: number; shadowElevation: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationX: number; shadowElevation: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { translationY: number; shadowElevation: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationY: number; shadowElevation: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationY: number; shadowElevation: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationY: number; shadowElevation: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationY: number; shadowElevation: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationY: number; shadowElevation: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationY: number; shadowElevation: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationY: number; shadowElevation: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { translationX: number; translationY: number; shadowElevation: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationX: number; translationY: number; shadowElevation: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationX: number; translationY: number; shadowElevation: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationX: number; translationY: number; shadowElevation: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationX: number; translationY: number; shadowElevation: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationX: number; translationY: number; shadowElevation: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationX: number; translationY: number; shadowElevation: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationX: number; translationY: number; shadowElevation: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { rotationX: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleX: number; rotationX: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleY: number; rotationX: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; rotationX: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { alpha: number; rotationX: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; rotationX: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; rotationX: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; rotationX: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { translationX: number; rotationX: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationX: number; rotationX: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationX: number; rotationX: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationX: number; rotationX: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationX: number; rotationX: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationX: number; rotationX: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationX: number; rotationX: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationX: number; rotationX: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { translationY: number; rotationX: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationY: number; rotationX: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationY: number; rotationX: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationY: number; rotationX: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationY: number; rotationX: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationY: number; rotationX: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationY: number; rotationX: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationY: number; rotationX: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { translationX: number; translationY: number; rotationX: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationX: number; translationY: number; rotationX: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationX: number; translationY: number; rotationX: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationX: number; translationY: number; rotationX: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationX: number; translationY: number; rotationX: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationX: number; translationY: number; rotationX: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationX: number; translationY: number; rotationX: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationX: number; translationY: number; rotationX: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { shadowElevation: number; rotationX: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleX: number; shadowElevation: number; rotationX: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleY: number; shadowElevation: number; rotationX: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; shadowElevation: number; rotationX: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { alpha: number; shadowElevation: number; rotationX: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; shadowElevation: number; rotationX: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; shadowElevation: number; rotationX: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; shadowElevation: number; rotationX: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { translationX: number; shadowElevation: number; rotationX: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationX: number; shadowElevation: number; rotationX: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationX: number; shadowElevation: number; rotationX: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationX: number; shadowElevation: number; rotationX: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationX: number; shadowElevation: number; rotationX: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationX: number; shadowElevation: number; rotationX: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationX: number; shadowElevation: number; rotationX: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationX: number; shadowElevation: number; rotationX: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { translationY: number; shadowElevation: number; rotationX: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationY: number; shadowElevation: number; rotationX: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationY: number; shadowElevation: number; rotationX: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationY: number; shadowElevation: number; rotationX: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationY: number; shadowElevation: number; rotationX: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationY: number; shadowElevation: number; rotationX: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationY: number; shadowElevation: number; rotationX: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationY: number; shadowElevation: number; rotationX: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { translationX: number; translationY: number; shadowElevation: number; rotationX: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationX: number; translationY: number; shadowElevation: number; rotationX: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationX: number; translationY: number; shadowElevation: number; rotationX: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationX: number; translationY: number; shadowElevation: number; rotationX: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationX: number; translationY: number; shadowElevation: number; rotationX: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationX: number; translationY: number; shadowElevation: number; rotationX: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationX: number; translationY: number; shadowElevation: number; rotationX: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationX: number; translationY: number; shadowElevation: number; rotationX: number; clip: boolean }): ComposeChain;
  graphicsLayer(options: { ambientShadowColor: string }): ComposeChain;
  graphicsLayer(ambientShadowColor: string): ComposeChain;
  graphicsLayer(options: { scaleX: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleY: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { alpha: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { translationX: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationX: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationX: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationX: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationX: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationX: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationX: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationX: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { translationY: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationY: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationY: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationY: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationY: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationY: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationY: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationY: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { translationX: number; translationY: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationX: number; translationY: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationX: number; translationY: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationX: number; translationY: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationX: number; translationY: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationX: number; translationY: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationX: number; translationY: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationX: number; translationY: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { shadowElevation: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; shadowElevation: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleY: number; shadowElevation: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; shadowElevation: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { alpha: number; shadowElevation: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; shadowElevation: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; shadowElevation: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; shadowElevation: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { translationX: number; shadowElevation: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationX: number; shadowElevation: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationX: number; shadowElevation: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationX: number; shadowElevation: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationX: number; shadowElevation: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationX: number; shadowElevation: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationX: number; shadowElevation: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationX: number; shadowElevation: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { translationY: number; shadowElevation: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationY: number; shadowElevation: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationY: number; shadowElevation: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationY: number; shadowElevation: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationY: number; shadowElevation: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationY: number; shadowElevation: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationY: number; shadowElevation: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationY: number; shadowElevation: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { translationX: number; translationY: number; shadowElevation: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationX: number; translationY: number; shadowElevation: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationX: number; translationY: number; shadowElevation: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationX: number; translationY: number; shadowElevation: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationX: number; translationY: number; shadowElevation: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationX: number; translationY: number; shadowElevation: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationX: number; translationY: number; shadowElevation: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationX: number; translationY: number; shadowElevation: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { rotationX: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; rotationX: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleY: number; rotationX: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; rotationX: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { alpha: number; rotationX: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; rotationX: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; rotationX: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; rotationX: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { translationX: number; rotationX: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationX: number; rotationX: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationX: number; rotationX: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationX: number; rotationX: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationX: number; rotationX: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationX: number; rotationX: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationX: number; rotationX: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationX: number; rotationX: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { translationY: number; rotationX: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationY: number; rotationX: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationY: number; rotationX: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationY: number; rotationX: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationY: number; rotationX: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationY: number; rotationX: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationY: number; rotationX: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationY: number; rotationX: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { translationX: number; translationY: number; rotationX: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationX: number; translationY: number; rotationX: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationX: number; translationY: number; rotationX: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationX: number; translationY: number; rotationX: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationX: number; translationY: number; rotationX: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationX: number; translationY: number; rotationX: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationX: number; translationY: number; rotationX: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationX: number; translationY: number; rotationX: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { shadowElevation: number; rotationX: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; shadowElevation: number; rotationX: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleY: number; shadowElevation: number; rotationX: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; shadowElevation: number; rotationX: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { alpha: number; shadowElevation: number; rotationX: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; shadowElevation: number; rotationX: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; shadowElevation: number; rotationX: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; shadowElevation: number; rotationX: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { translationX: number; shadowElevation: number; rotationX: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationX: number; shadowElevation: number; rotationX: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationX: number; shadowElevation: number; rotationX: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationX: number; shadowElevation: number; rotationX: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationX: number; shadowElevation: number; rotationX: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationX: number; shadowElevation: number; rotationX: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationX: number; shadowElevation: number; rotationX: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationX: number; shadowElevation: number; rotationX: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { translationY: number; shadowElevation: number; rotationX: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationY: number; shadowElevation: number; rotationX: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationY: number; shadowElevation: number; rotationX: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationY: number; shadowElevation: number; rotationX: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationY: number; shadowElevation: number; rotationX: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationY: number; shadowElevation: number; rotationX: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationY: number; shadowElevation: number; rotationX: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationY: number; shadowElevation: number; rotationX: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { translationX: number; translationY: number; shadowElevation: number; rotationX: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationX: number; translationY: number; shadowElevation: number; rotationX: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationX: number; translationY: number; shadowElevation: number; rotationX: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationX: number; translationY: number; shadowElevation: number; rotationX: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationX: number; translationY: number; shadowElevation: number; rotationX: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationX: number; translationY: number; shadowElevation: number; rotationX: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationX: number; translationY: number; shadowElevation: number; rotationX: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationX: number; translationY: number; shadowElevation: number; rotationX: number; ambientShadowColor: string }): ComposeChain;
  graphicsLayer(options: { spotShadowColor: string }): ComposeChain;
  graphicsLayer(spotShadowColor: string): ComposeChain;
  graphicsLayer(options: { scaleX: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleY: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { alpha: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { translationX: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationX: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationX: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationX: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationX: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationX: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationX: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationX: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { translationY: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationY: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationY: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationY: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationY: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationY: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationY: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationY: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { translationX: number; translationY: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationX: number; translationY: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationX: number; translationY: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationX: number; translationY: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationX: number; translationY: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationX: number; translationY: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationX: number; translationY: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationX: number; translationY: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { shadowElevation: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; shadowElevation: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleY: number; shadowElevation: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; shadowElevation: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { alpha: number; shadowElevation: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; shadowElevation: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; shadowElevation: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; shadowElevation: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { translationX: number; shadowElevation: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationX: number; shadowElevation: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationX: number; shadowElevation: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationX: number; shadowElevation: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationX: number; shadowElevation: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationX: number; shadowElevation: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationX: number; shadowElevation: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationX: number; shadowElevation: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { translationY: number; shadowElevation: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationY: number; shadowElevation: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationY: number; shadowElevation: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationY: number; shadowElevation: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationY: number; shadowElevation: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationY: number; shadowElevation: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationY: number; shadowElevation: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationY: number; shadowElevation: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { translationX: number; translationY: number; shadowElevation: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationX: number; translationY: number; shadowElevation: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationX: number; translationY: number; shadowElevation: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationX: number; translationY: number; shadowElevation: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationX: number; translationY: number; shadowElevation: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationX: number; translationY: number; shadowElevation: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationX: number; translationY: number; shadowElevation: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationX: number; translationY: number; shadowElevation: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { rotationX: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; rotationX: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleY: number; rotationX: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; rotationX: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { alpha: number; rotationX: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; rotationX: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; rotationX: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; rotationX: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { translationX: number; rotationX: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationX: number; rotationX: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationX: number; rotationX: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationX: number; rotationX: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationX: number; rotationX: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationX: number; rotationX: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationX: number; rotationX: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationX: number; rotationX: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { translationY: number; rotationX: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationY: number; rotationX: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationY: number; rotationX: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationY: number; rotationX: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationY: number; rotationX: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationY: number; rotationX: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationY: number; rotationX: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationY: number; rotationX: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { translationX: number; translationY: number; rotationX: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationX: number; translationY: number; rotationX: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationX: number; translationY: number; rotationX: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationX: number; translationY: number; rotationX: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationX: number; translationY: number; rotationX: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationX: number; translationY: number; rotationX: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationX: number; translationY: number; rotationX: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationX: number; translationY: number; rotationX: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { shadowElevation: number; rotationX: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; shadowElevation: number; rotationX: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleY: number; shadowElevation: number; rotationX: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; shadowElevation: number; rotationX: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { alpha: number; shadowElevation: number; rotationX: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; shadowElevation: number; rotationX: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; shadowElevation: number; rotationX: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; shadowElevation: number; rotationX: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { translationX: number; shadowElevation: number; rotationX: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationX: number; shadowElevation: number; rotationX: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationX: number; shadowElevation: number; rotationX: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationX: number; shadowElevation: number; rotationX: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationX: number; shadowElevation: number; rotationX: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationX: number; shadowElevation: number; rotationX: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationX: number; shadowElevation: number; rotationX: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationX: number; shadowElevation: number; rotationX: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { translationY: number; shadowElevation: number; rotationX: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationY: number; shadowElevation: number; rotationX: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationY: number; shadowElevation: number; rotationX: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationY: number; shadowElevation: number; rotationX: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationY: number; shadowElevation: number; rotationX: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationY: number; shadowElevation: number; rotationX: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationY: number; shadowElevation: number; rotationX: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationY: number; shadowElevation: number; rotationX: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { translationX: number; translationY: number; shadowElevation: number; rotationX: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; translationX: number; translationY: number; shadowElevation: number; rotationX: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleY: number; translationX: number; translationY: number; shadowElevation: number; rotationX: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; translationX: number; translationY: number; shadowElevation: number; rotationX: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { alpha: number; translationX: number; translationY: number; shadowElevation: number; rotationX: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; alpha: number; translationX: number; translationY: number; shadowElevation: number; rotationX: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleY: number; alpha: number; translationX: number; translationY: number; shadowElevation: number; rotationX: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationX: number; translationY: number; shadowElevation: number; rotationX: number; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationX: number; translationY: number; shadowElevation: number; rotationX: number; rotationY: number; rotationZ: number; cameraDistance: number; shape: ComposeShape; clip: boolean; ambientShadowColor: string; spotShadowColor: string }): ComposeChain;
  graphicsLayer(options: { scaleX: number; scaleY: number; alpha: number; translationX: number; translationY: number; shadowElevation: number; rotationX: number; rotationY: number; rotationZ: number; cameraDistance: number; transformOrigin: ComposeTransformOrigin; shape: ComposeShape; clip: boolean; ambientShadowColor: string; spotShadowColor: string }): ComposeChain;
  handwritingDetector(options: { callback: () => void }): ComposeChain;
  handwritingDetector(callback: () => void): ComposeChain;
  handwritingHandler(): ComposeChain;
  height(options: { height: number }): ComposeChain;
  height(height: number): ComposeChain;
  height(options: { intrinsicSize: ComposeIntrinsicSize }): ComposeChain;
  height(intrinsicSize: ComposeIntrinsicSize): ComposeChain;
  heightIn(): ComposeChain;
  heightIn(options: { min: number }): ComposeChain;
  heightIn(min: number): ComposeChain;
  heightIn(options: { max: number }): ComposeChain;
  heightIn(max: number): ComposeChain;
  heightIn(options: { min: number; max: number }): ComposeChain;
  horizontalScroll(options: { state: ComposeScrollState }): ComposeChain;
  horizontalScroll(state: ComposeScrollState): ComposeChain;
  horizontalScroll(options: { state: ComposeScrollState; enabled: boolean }): ComposeChain;
  horizontalScroll(state: ComposeScrollState, options: { enabled: boolean }): ComposeChain;
  horizontalScroll(options: { state: ComposeScrollState; reverseScrolling: boolean }): ComposeChain;
  horizontalScroll(state: ComposeScrollState, options: { reverseScrolling: boolean }): ComposeChain;
  horizontalScroll(options: { state: ComposeScrollState; enabled: boolean; reverseScrolling: boolean }): ComposeChain;
  horizontalScroll(state: ComposeScrollState, options: { enabled: boolean; reverseScrolling: boolean }): ComposeChain;
  imeNestedScroll(): ComposeChain;
  imePadding(): ComposeChain;
  layoutId(options: { layoutId: string }): ComposeChain;
  layoutId(layoutId: string): ComposeChain;
  mandatorySystemGesturesPadding(): ComposeChain;
  matchParentSize(): ComposeChain;
  minimumInteractiveComponentSize(): ComposeChain;
  navigationBarsPadding(): ComposeChain;
  nestedScroll(options: { connection: ComposeNestedScrollConnection }): ComposeChain;
  nestedScroll(connection: ComposeNestedScrollConnection): ComposeChain;
  offset(): ComposeChain;
  offset(options: { x: number }): ComposeChain;
  offset(x: number): ComposeChain;
  offset(options: { y: number }): ComposeChain;
  offset(y: number): ComposeChain;
  offset(options: { x: number; y: number }): ComposeChain;
  onFocusChanged(options: { onFocusChanged: (value: ComposeFocusState) => void }): ComposeChain;
  onFocusChanged(onFocusChanged: (value: ComposeFocusState) => void): ComposeChain;
  onFocusedBoundsChanged(options: { onPositioned: (value: ComposeLayoutPosition | null) => void }): ComposeChain;
  onFocusedBoundsChanged(onPositioned: (value: ComposeLayoutPosition | null) => void): ComposeChain;
  onFocusEvent(options: { onFocusEvent: (value: ComposeFocusState) => void }): ComposeChain;
  onFocusEvent(onFocusEvent: (value: ComposeFocusState) => void): ComposeChain;
  onGloballyPositioned(options: { onGloballyPositioned: (value: ComposeLayoutPosition) => void }): ComposeChain;
  onGloballyPositioned(onGloballyPositioned: (value: ComposeLayoutPosition) => void): ComposeChain;
  onInterceptKeyBeforeSoftKeyboard(options: { onInterceptKeyBeforeSoftKeyboard: ComposeKeyPolicy }): ComposeChain;
  onInterceptKeyBeforeSoftKeyboard(onInterceptKeyBeforeSoftKeyboard: ComposeKeyPolicy): ComposeChain;
  onKeyEvent(options: { onKeyEvent: ComposeKeyPolicy }): ComposeChain;
  onKeyEvent(onKeyEvent: ComposeKeyPolicy): ComposeChain;
  onLayoutRectChanged(options: { callback: (value: ComposeLayoutPosition) => void }): ComposeChain;
  onLayoutRectChanged(callback: (value: ComposeLayoutPosition) => void): ComposeChain;
  onLayoutRectChanged(options: { throttleMillis: number; callback: (value: ComposeLayoutPosition) => void }): ComposeChain;
  onLayoutRectChanged(callback: (value: ComposeLayoutPosition) => void, options: { throttleMillis: number }): ComposeChain;
  onLayoutRectChanged(options: { debounceMillis: number; callback: (value: ComposeLayoutPosition) => void }): ComposeChain;
  onLayoutRectChanged(callback: (value: ComposeLayoutPosition) => void, options: { debounceMillis: number }): ComposeChain;
  onLayoutRectChanged(options: { throttleMillis: number; debounceMillis: number; callback: (value: ComposeLayoutPosition) => void }): ComposeChain;
  onLayoutRectChanged(callback: (value: ComposeLayoutPosition) => void, options: { throttleMillis: number; debounceMillis: number }): ComposeChain;
  onPlaced(options: { onPlaced: (value: ComposeLayoutPosition) => void }): ComposeChain;
  onPlaced(onPlaced: (value: ComposeLayoutPosition) => void): ComposeChain;
  onPreInterceptKeyBeforeSoftKeyboard(options: { onPreInterceptKeyBeforeSoftKeyboard: ComposeKeyPolicy }): ComposeChain;
  onPreInterceptKeyBeforeSoftKeyboard(onPreInterceptKeyBeforeSoftKeyboard: ComposeKeyPolicy): ComposeChain;
  onPreviewKeyEvent(options: { onPreviewKeyEvent: ComposeKeyPolicy }): ComposeChain;
  onPreviewKeyEvent(onPreviewKeyEvent: ComposeKeyPolicy): ComposeChain;
  onSizeChanged(options: { onSizeChanged: (value: ComposeLayoutSize) => void }): ComposeChain;
  onSizeChanged(onSizeChanged: (value: ComposeLayoutSize) => void): ComposeChain;
  padding(options: { all: number }): ComposeChain;
  padding(all: number): ComposeChain;
  padding(): ComposeChain;
  padding(options: { horizontal: number }): ComposeChain;
  padding(horizontal: number): ComposeChain;
  padding(options: { vertical: number }): ComposeChain;
  padding(vertical: number): ComposeChain;
  padding(options: { horizontal: number; vertical: number }): ComposeChain;
  padding(options: { paddingValues: ComposePaddingValues }): ComposeChain;
  padding(paddingValues: ComposePaddingValues): ComposeChain;
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
  paddingFrom(options: { alignmentLine: ComposeAlignmentLine; before: number }): ComposeChain;
  paddingFrom(alignmentLine: ComposeAlignmentLine, options: { before: number }): ComposeChain;
  paddingFrom(options: { alignmentLine: ComposeAlignmentLine; after: number }): ComposeChain;
  paddingFrom(alignmentLine: ComposeAlignmentLine, options: { after: number }): ComposeChain;
  paddingFrom(options: { alignmentLine: ComposeAlignmentLine; before: number; after: number }): ComposeChain;
  paddingFrom(alignmentLine: ComposeAlignmentLine, options: { before: number; after: number }): ComposeChain;
  paddingFromBaseline(options: { top: number }): ComposeChain;
  paddingFromBaseline(top: number): ComposeChain;
  paddingFromBaseline(options: { bottom: number }): ComposeChain;
  paddingFromBaseline(bottom: number): ComposeChain;
  paddingFromBaseline(options: { top: number; bottom: number }): ComposeChain;
  paint(options: { painter: ComposePainter }): ComposeChain;
  paint(painter: ComposePainter): ComposeChain;
  paint(options: { painter: ComposePainter; sizeToIntrinsics: boolean }): ComposeChain;
  paint(painter: ComposePainter, options: { sizeToIntrinsics: boolean }): ComposeChain;
  paint(options: { painter: ComposePainter; alignment: ComposeAlignment }): ComposeChain;
  paint(painter: ComposePainter, options: { alignment: ComposeAlignment }): ComposeChain;
  paint(options: { painter: ComposePainter; sizeToIntrinsics: boolean; alignment: ComposeAlignment }): ComposeChain;
  paint(painter: ComposePainter, options: { sizeToIntrinsics: boolean; alignment: ComposeAlignment }): ComposeChain;
  paint(options: { painter: ComposePainter; contentScale: ComposeContentScale }): ComposeChain;
  paint(painter: ComposePainter, options: { contentScale: ComposeContentScale }): ComposeChain;
  paint(options: { painter: ComposePainter; sizeToIntrinsics: boolean; contentScale: ComposeContentScale }): ComposeChain;
  paint(painter: ComposePainter, options: { sizeToIntrinsics: boolean; contentScale: ComposeContentScale }): ComposeChain;
  paint(options: { painter: ComposePainter; alignment: ComposeAlignment; contentScale: ComposeContentScale }): ComposeChain;
  paint(painter: ComposePainter, options: { alignment: ComposeAlignment; contentScale: ComposeContentScale }): ComposeChain;
  paint(options: { painter: ComposePainter; sizeToIntrinsics: boolean; alignment: ComposeAlignment; contentScale: ComposeContentScale }): ComposeChain;
  paint(painter: ComposePainter, options: { sizeToIntrinsics: boolean; alignment: ComposeAlignment; contentScale: ComposeContentScale }): ComposeChain;
  paint(options: { painter: ComposePainter; alpha: number }): ComposeChain;
  paint(painter: ComposePainter, options: { alpha: number }): ComposeChain;
  paint(options: { painter: ComposePainter; sizeToIntrinsics: boolean; alpha: number }): ComposeChain;
  paint(painter: ComposePainter, options: { sizeToIntrinsics: boolean; alpha: number }): ComposeChain;
  paint(options: { painter: ComposePainter; alignment: ComposeAlignment; alpha: number }): ComposeChain;
  paint(painter: ComposePainter, options: { alignment: ComposeAlignment; alpha: number }): ComposeChain;
  paint(options: { painter: ComposePainter; sizeToIntrinsics: boolean; alignment: ComposeAlignment; alpha: number }): ComposeChain;
  paint(painter: ComposePainter, options: { sizeToIntrinsics: boolean; alignment: ComposeAlignment; alpha: number }): ComposeChain;
  paint(options: { painter: ComposePainter; contentScale: ComposeContentScale; alpha: number }): ComposeChain;
  paint(painter: ComposePainter, options: { contentScale: ComposeContentScale; alpha: number }): ComposeChain;
  paint(options: { painter: ComposePainter; sizeToIntrinsics: boolean; contentScale: ComposeContentScale; alpha: number }): ComposeChain;
  paint(painter: ComposePainter, options: { sizeToIntrinsics: boolean; contentScale: ComposeContentScale; alpha: number }): ComposeChain;
  paint(options: { painter: ComposePainter; alignment: ComposeAlignment; contentScale: ComposeContentScale; alpha: number }): ComposeChain;
  paint(painter: ComposePainter, options: { alignment: ComposeAlignment; contentScale: ComposeContentScale; alpha: number }): ComposeChain;
  paint(options: { painter: ComposePainter; sizeToIntrinsics: boolean; alignment: ComposeAlignment; contentScale: ComposeContentScale; alpha: number }): ComposeChain;
  paint(painter: ComposePainter, options: { sizeToIntrinsics: boolean; alignment: ComposeAlignment; contentScale: ComposeContentScale; alpha: number }): ComposeChain;
  pointerHoverIcon(options: { icon: ComposePointerIcon }): ComposeChain;
  pointerHoverIcon(icon: ComposePointerIcon): ComposeChain;
  pointerHoverIcon(options: { icon: ComposePointerIcon; overrideDescendants: boolean }): ComposeChain;
  pointerHoverIcon(icon: ComposePointerIcon, options: { overrideDescendants: boolean }): ComposeChain;
  preferKeepClear(): ComposeChain;
  progressSemantics(): ComposeChain;
  progressSemantics(options: { value: number }): ComposeChain;
  progressSemantics(value: number): ComposeChain;
  progressSemantics(options: { value: number; valueRange: ComposeFloatRange }): ComposeChain;
  progressSemantics(value: number, options: { valueRange: ComposeFloatRange }): ComposeChain;
  progressSemantics(options: { value: number; steps: number }): ComposeChain;
  progressSemantics(value: number, options: { steps: number }): ComposeChain;
  progressSemantics(options: { value: number; valueRange: ComposeFloatRange; steps: number }): ComposeChain;
  progressSemantics(value: number, options: { valueRange: ComposeFloatRange; steps: number }): ComposeChain;
  recalculateWindowInsets(): ComposeChain;
  renderInSharedTransitionScopeOverlay(): ComposeChain;
  renderInSharedTransitionScopeOverlay(options: { zIndexInOverlay: number }): ComposeChain;
  renderInSharedTransitionScopeOverlay(zIndexInOverlay: number): ComposeChain;
  requiredHeight(options: { height: number }): ComposeChain;
  requiredHeight(height: number): ComposeChain;
  requiredHeight(options: { intrinsicSize: ComposeIntrinsicSize }): ComposeChain;
  requiredHeight(intrinsicSize: ComposeIntrinsicSize): ComposeChain;
  requiredHeightIn(): ComposeChain;
  requiredHeightIn(options: { min: number }): ComposeChain;
  requiredHeightIn(min: number): ComposeChain;
  requiredHeightIn(options: { max: number }): ComposeChain;
  requiredHeightIn(max: number): ComposeChain;
  requiredHeightIn(options: { min: number; max: number }): ComposeChain;
  requiredSize(options: { size: number }): ComposeChain;
  requiredSize(size: number): ComposeChain;
  requiredSize(options: { size: ComposeDpSize }): ComposeChain;
  requiredSize(size: ComposeDpSize): ComposeChain;
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
  requiredWidth(options: { intrinsicSize: ComposeIntrinsicSize }): ComposeChain;
  requiredWidth(intrinsicSize: ComposeIntrinsicSize): ComposeChain;
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
  semantics(options: { properties: ComposeSemantics }): ComposeChain;
  semantics(properties: ComposeSemantics): ComposeChain;
  semantics(options: { mergeDescendants: boolean; properties: ComposeSemantics }): ComposeChain;
  semantics(properties: ComposeSemantics, options: { mergeDescendants: boolean }): ComposeChain;
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
  size(options: { size: ComposeDpSize }): ComposeChain;
  size(size: ComposeDpSize): ComposeChain;
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
  skipToLookaheadSize(): ComposeChain;
  statusBarsPadding(): ComposeChain;
  stylusHoverIcon(options: { icon: ComposePointerIcon }): ComposeChain;
  stylusHoverIcon(icon: ComposePointerIcon): ComposeChain;
  stylusHoverIcon(options: { icon: ComposePointerIcon; overrideDescendants: boolean }): ComposeChain;
  stylusHoverIcon(icon: ComposePointerIcon, options: { overrideDescendants: boolean }): ComposeChain;
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
  triStateToggleable(options: { state: ComposeToggleableState; onClick: () => void }): ComposeChain;
  triStateToggleable(options: { state: ComposeToggleableState; enabled: boolean; onClick: () => void }): ComposeChain;
  triStateToggleable(options: { state: ComposeToggleableState; role: ComposeRole | null; onClick: () => void }): ComposeChain;
  triStateToggleable(options: { state: ComposeToggleableState; enabled: boolean; role: ComposeRole | null; onClick: () => void }): ComposeChain;
  verticalScroll(options: { state: ComposeScrollState }): ComposeChain;
  verticalScroll(state: ComposeScrollState): ComposeChain;
  verticalScroll(options: { state: ComposeScrollState; enabled: boolean }): ComposeChain;
  verticalScroll(state: ComposeScrollState, options: { enabled: boolean }): ComposeChain;
  verticalScroll(options: { state: ComposeScrollState; reverseScrolling: boolean }): ComposeChain;
  verticalScroll(state: ComposeScrollState, options: { reverseScrolling: boolean }): ComposeChain;
  verticalScroll(options: { state: ComposeScrollState; enabled: boolean; reverseScrolling: boolean }): ComposeChain;
  verticalScroll(state: ComposeScrollState, options: { enabled: boolean; reverseScrolling: boolean }): ComposeChain;
  waterfallPadding(): ComposeChain;
  weight(options: { weight: number }): ComposeChain;
  weight(weight: number): ComposeChain;
  weight(options: { weight: number; fill: boolean }): ComposeChain;
  weight(weight: number, options: { fill: boolean }): ComposeChain;
  width(options: { intrinsicSize: ComposeIntrinsicSize }): ComposeChain;
  width(intrinsicSize: ComposeIntrinsicSize): ComposeChain;
  width(options: { width: number }): ComposeChain;
  width(width: number): ComposeChain;
  widthIn(): ComposeChain;
  widthIn(options: { min: number }): ComposeChain;
  widthIn(min: number): ComposeChain;
  widthIn(options: { max: number }): ComposeChain;
  widthIn(max: number): ComposeChain;
  widthIn(options: { min: number; max: number }): ComposeChain;
  windowInsetsBottomHeight(options: { insets: ComposeWindowInsets }): ComposeChain;
  windowInsetsBottomHeight(insets: ComposeWindowInsets): ComposeChain;
  windowInsetsEndWidth(options: { insets: ComposeWindowInsets }): ComposeChain;
  windowInsetsEndWidth(insets: ComposeWindowInsets): ComposeChain;
  windowInsetsPadding(options: { insets: ComposeWindowInsets }): ComposeChain;
  windowInsetsPadding(insets: ComposeWindowInsets): ComposeChain;
  windowInsetsStartWidth(options: { insets: ComposeWindowInsets }): ComposeChain;
  windowInsetsStartWidth(insets: ComposeWindowInsets): ComposeChain;
  windowInsetsTopHeight(options: { insets: ComposeWindowInsets }): ComposeChain;
  windowInsetsTopHeight(insets: ComposeWindowInsets): ComposeChain;
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
  "animateEnterExit": [
    { id: 0, forms: [[],[["enter","object",false]],[["exit","object",false]],[["enter","object",false],["exit","object",false]],[["label","string",false]],[["enter","object",false],["label","string",false]],[["exit","object",false],["label","string",false]],[["enter","object",false],["exit","object",false],["label","string",false]]] },
  ],
  "renderInSharedTransitionScopeOverlay": [
    { id: 1, forms: [[],[["zIndexInOverlay","number",false]]] },
  ],
  "skipToLookaheadSize": [
    { id: 2, forms: [[]] },
  ],
  "animateContentSize": [
    { id: 3, forms: [[],[["animationSpec","object",false]]] },
    { id: 4, forms: [[["alignment","string",false]],[["animationSpec","object",false],["alignment","string",false]]] },
  ],
  "background": [
    { id: 6, primary: "color", labels: {"shape":"in"}, forms: [[["color","string",false]],[["color","string",false],["shape","shape",false]]] },
    { id: 5, primary: "brush", labels: {"shape":"in"}, forms: [[["brush","brush",false]],[["brush","brush",false],["shape","shape",false]],[["brush","brush",false],["alpha","number",false]],[["brush","brush",false],["shape","shape",false],["alpha","number",false]]] },
  ],
  "basicMarquee": [
    { id: 7, forms: [[],[["iterations","number",false]],[["repeatDelayMillis","number",false]],[["iterations","number",false],["repeatDelayMillis","number",false]],[["initialDelayMillis","number",false]],[["iterations","number",false],["initialDelayMillis","number",false]],[["repeatDelayMillis","number",false],["initialDelayMillis","number",false]],[["iterations","number",false],["repeatDelayMillis","number",false],["initialDelayMillis","number",false]],[["velocity","number",false]],[["iterations","number",false],["velocity","number",false]],[["repeatDelayMillis","number",false],["velocity","number",false]],[["iterations","number",false],["repeatDelayMillis","number",false],["velocity","number",false]],[["initialDelayMillis","number",false],["velocity","number",false]],[["iterations","number",false],["initialDelayMillis","number",false],["velocity","number",false]],[["repeatDelayMillis","number",false],["initialDelayMillis","number",false],["velocity","number",false]],[["iterations","number",false],["repeatDelayMillis","number",false],["initialDelayMillis","number",false],["velocity","number",false]]] },
  ],
  "border": [
    { id: 9, primary: "color", forms: [[["width","number",false],["color","string",false]],[["width","number",false],["color","string",false],["shape","shape",false]]] },
    { id: 8, primary: "brush", forms: [[["width","number",false],["brush","brush",false],["shape","shape",false]]] },
  ],
  "clickable": [
    { id: 10, primary: "onClick", forms: [[["onClick","function",false]],[["enabled","boolean",false],["onClick","function",false]],[["onClickLabel","string",true],["onClick","function",false]],[["enabled","boolean",false],["onClickLabel","string",true],["onClick","function",false]],[["role","string",true],["onClick","function",false]],[["enabled","boolean",false],["role","string",true],["onClick","function",false]],[["onClickLabel","string",true],["role","string",true],["onClick","function",false]],[["enabled","boolean",false],["onClickLabel","string",true],["role","string",true],["onClick","function",false]]] },
  ],
  "clipScrollableContainer": [
    { id: 11, primary: "orientation", forms: [[["orientation","string",false]]] },
  ],
  "combinedClickable": [
    { id: 12, primary: "onClick", forms: [[["onClick","function",false]],[["enabled","boolean",false],["onClick","function",false]],[["onClickLabel","string",true],["onClick","function",false]],[["enabled","boolean",false],["onClickLabel","string",true],["onClick","function",false]],[["role","string",true],["onClick","function",false]],[["enabled","boolean",false],["role","string",true],["onClick","function",false]],[["onClickLabel","string",true],["role","string",true],["onClick","function",false]],[["enabled","boolean",false],["onClickLabel","string",true],["role","string",true],["onClick","function",false]],[["onLongClickLabel","string",true],["onClick","function",false]],[["enabled","boolean",false],["onLongClickLabel","string",true],["onClick","function",false]],[["onClickLabel","string",true],["onLongClickLabel","string",true],["onClick","function",false]],[["enabled","boolean",false],["onClickLabel","string",true],["onLongClickLabel","string",true],["onClick","function",false]],[["role","string",true],["onLongClickLabel","string",true],["onClick","function",false]],[["enabled","boolean",false],["role","string",true],["onLongClickLabel","string",true],["onClick","function",false]],[["onClickLabel","string",true],["role","string",true],["onLongClickLabel","string",true],["onClick","function",false]],[["enabled","boolean",false],["onClickLabel","string",true],["role","string",true],["onLongClickLabel","string",true],["onClick","function",false]],[["onLongClick","function",true],["onClick","function",false]],[["enabled","boolean",false],["onLongClick","function",true],["onClick","function",false]],[["onClickLabel","string",true],["onLongClick","function",true],["onClick","function",false]],[["enabled","boolean",false],["onClickLabel","string",true],["onLongClick","function",true],["onClick","function",false]],[["role","string",true],["onLongClick","function",true],["onClick","function",false]],[["enabled","boolean",false],["role","string",true],["onLongClick","function",true],["onClick","function",false]],[["onClickLabel","string",true],["role","string",true],["onLongClick","function",true],["onClick","function",false]],[["enabled","boolean",false],["onClickLabel","string",true],["role","string",true],["onLongClick","function",true],["onClick","function",false]],[["onLongClickLabel","string",true],["onLongClick","function",true],["onClick","function",false]],[["enabled","boolean",false],["onLongClickLabel","string",true],["onLongClick","function",true],["onClick","function",false]],[["onClickLabel","string",true],["onLongClickLabel","string",true],["onLongClick","function",true],["onClick","function",false]],[["enabled","boolean",false],["onClickLabel","string",true],["onLongClickLabel","string",true],["onLongClick","function",true],["onClick","function",false]],[["role","string",true],["onLongClickLabel","string",true],["onLongClick","function",true],["onClick","function",false]],[["enabled","boolean",false],["role","string",true],["onLongClickLabel","string",true],["onLongClick","function",true],["onClick","function",false]],[["onClickLabel","string",true],["role","string",true],["onLongClickLabel","string",true],["onLongClick","function",true],["onClick","function",false]],[["enabled","boolean",false],["onClickLabel","string",true],["role","string",true],["onLongClickLabel","string",true],["onLongClick","function",true],["onClick","function",false]],[["onDoubleClick","function",true],["onClick","function",false]],[["enabled","boolean",false],["onDoubleClick","function",true],["onClick","function",false]],[["onClickLabel","string",true],["onDoubleClick","function",true],["onClick","function",false]],[["enabled","boolean",false],["onClickLabel","string",true],["onDoubleClick","function",true],["onClick","function",false]],[["role","string",true],["onDoubleClick","function",true],["onClick","function",false]],[["enabled","boolean",false],["role","string",true],["onDoubleClick","function",true],["onClick","function",false]],[["onClickLabel","string",true],["role","string",true],["onDoubleClick","function",true],["onClick","function",false]],[["enabled","boolean",false],["onClickLabel","string",true],["role","string",true],["onDoubleClick","function",true],["onClick","function",false]],[["onLongClickLabel","string",true],["onDoubleClick","function",true],["onClick","function",false]],[["enabled","boolean",false],["onLongClickLabel","string",true],["onDoubleClick","function",true],["onClick","function",false]],[["onClickLabel","string",true],["onLongClickLabel","string",true],["onDoubleClick","function",true],["onClick","function",false]],[["enabled","boolean",false],["onClickLabel","string",true],["onLongClickLabel","string",true],["onDoubleClick","function",true],["onClick","function",false]],[["role","string",true],["onLongClickLabel","string",true],["onDoubleClick","function",true],["onClick","function",false]],[["enabled","boolean",false],["role","string",true],["onLongClickLabel","string",true],["onDoubleClick","function",true],["onClick","function",false]],[["onClickLabel","string",true],["role","string",true],["onLongClickLabel","string",true],["onDoubleClick","function",true],["onClick","function",false]],[["enabled","boolean",false],["onClickLabel","string",true],["role","string",true],["onLongClickLabel","string",true],["onDoubleClick","function",true],["onClick","function",false]],[["onLongClick","function",true],["onDoubleClick","function",true],["onClick","function",false]],[["enabled","boolean",false],["onLongClick","function",true],["onDoubleClick","function",true],["onClick","function",false]],[["onClickLabel","string",true],["onLongClick","function",true],["onDoubleClick","function",true],["onClick","function",false]],[["enabled","boolean",false],["onClickLabel","string",true],["onLongClick","function",true],["onDoubleClick","function",true],["onClick","function",false]],[["role","string",true],["onLongClick","function",true],["onDoubleClick","function",true],["onClick","function",false]],[["enabled","boolean",false],["role","string",true],["onLongClick","function",true],["onDoubleClick","function",true],["onClick","function",false]],[["onClickLabel","string",true],["role","string",true],["onLongClick","function",true],["onDoubleClick","function",true],["onClick","function",false]],[["enabled","boolean",false],["onClickLabel","string",true],["role","string",true],["onLongClick","function",true],["onDoubleClick","function",true],["onClick","function",false]],[["onLongClickLabel","string",true],["onLongClick","function",true],["onDoubleClick","function",true],["onClick","function",false]],[["enabled","boolean",false],["onLongClickLabel","string",true],["onLongClick","function",true],["onDoubleClick","function",true],["onClick","function",false]],[["onClickLabel","string",true],["onLongClickLabel","string",true],["onLongClick","function",true],["onDoubleClick","function",true],["onClick","function",false]],[["enabled","boolean",false],["onClickLabel","string",true],["onLongClickLabel","string",true],["onLongClick","function",true],["onDoubleClick","function",true],["onClick","function",false]],[["role","string",true],["onLongClickLabel","string",true],["onLongClick","function",true],["onDoubleClick","function",true],["onClick","function",false]],[["enabled","boolean",false],["role","string",true],["onLongClickLabel","string",true],["onLongClick","function",true],["onDoubleClick","function",true],["onClick","function",false]],[["onClickLabel","string",true],["role","string",true],["onLongClickLabel","string",true],["onLongClick","function",true],["onDoubleClick","function",true],["onClick","function",false]],[["enabled","boolean",false],["onClickLabel","string",true],["role","string",true],["onLongClickLabel","string",true],["onLongClick","function",true],["onDoubleClick","function",true],["onClick","function",false]],[["hapticFeedbackEnabled","boolean",false],["onClick","function",false]],[["enabled","boolean",false],["hapticFeedbackEnabled","boolean",false],["onClick","function",false]],[["onClickLabel","string",true],["hapticFeedbackEnabled","boolean",false],["onClick","function",false]],[["enabled","boolean",false],["onClickLabel","string",true],["hapticFeedbackEnabled","boolean",false],["onClick","function",false]],[["role","string",true],["hapticFeedbackEnabled","boolean",false],["onClick","function",false]],[["enabled","boolean",false],["role","string",true],["hapticFeedbackEnabled","boolean",false],["onClick","function",false]],[["onClickLabel","string",true],["role","string",true],["hapticFeedbackEnabled","boolean",false],["onClick","function",false]],[["enabled","boolean",false],["onClickLabel","string",true],["role","string",true],["hapticFeedbackEnabled","boolean",false],["onClick","function",false]],[["onLongClickLabel","string",true],["hapticFeedbackEnabled","boolean",false],["onClick","function",false]],[["enabled","boolean",false],["onLongClickLabel","string",true],["hapticFeedbackEnabled","boolean",false],["onClick","function",false]],[["onClickLabel","string",true],["onLongClickLabel","string",true],["hapticFeedbackEnabled","boolean",false],["onClick","function",false]],[["enabled","boolean",false],["onClickLabel","string",true],["onLongClickLabel","string",true],["hapticFeedbackEnabled","boolean",false],["onClick","function",false]],[["role","string",true],["onLongClickLabel","string",true],["hapticFeedbackEnabled","boolean",false],["onClick","function",false]],[["enabled","boolean",false],["role","string",true],["onLongClickLabel","string",true],["hapticFeedbackEnabled","boolean",false],["onClick","function",false]],[["onClickLabel","string",true],["role","string",true],["onLongClickLabel","string",true],["hapticFeedbackEnabled","boolean",false],["onClick","function",false]],[["enabled","boolean",false],["onClickLabel","string",true],["role","string",true],["onLongClickLabel","string",true],["hapticFeedbackEnabled","boolean",false],["onClick","function",false]],[["onLongClick","function",true],["hapticFeedbackEnabled","boolean",false],["onClick","function",false]],[["enabled","boolean",false],["onLongClick","function",true],["hapticFeedbackEnabled","boolean",false],["onClick","function",false]],[["onClickLabel","string",true],["onLongClick","function",true],["hapticFeedbackEnabled","boolean",false],["onClick","function",false]],[["enabled","boolean",false],["onClickLabel","string",true],["onLongClick","function",true],["hapticFeedbackEnabled","boolean",false],["onClick","function",false]],[["role","string",true],["onLongClick","function",true],["hapticFeedbackEnabled","boolean",false],["onClick","function",false]],[["enabled","boolean",false],["role","string",true],["onLongClick","function",true],["hapticFeedbackEnabled","boolean",false],["onClick","function",false]],[["onClickLabel","string",true],["role","string",true],["onLongClick","function",true],["hapticFeedbackEnabled","boolean",false],["onClick","function",false]],[["enabled","boolean",false],["onClickLabel","string",true],["role","string",true],["onLongClick","function",true],["hapticFeedbackEnabled","boolean",false],["onClick","function",false]],[["onLongClickLabel","string",true],["onLongClick","function",true],["hapticFeedbackEnabled","boolean",false],["onClick","function",false]],[["enabled","boolean",false],["onLongClickLabel","string",true],["onLongClick","function",true],["hapticFeedbackEnabled","boolean",false],["onClick","function",false]],[["onClickLabel","string",true],["onLongClickLabel","string",true],["onLongClick","function",true],["hapticFeedbackEnabled","boolean",false],["onClick","function",false]],[["enabled","boolean",false],["onClickLabel","string",true],["onLongClickLabel","string",true],["onLongClick","function",true],["hapticFeedbackEnabled","boolean",false],["onClick","function",false]],[["role","string",true],["onLongClickLabel","string",true],["onLongClick","function",true],["hapticFeedbackEnabled","boolean",false],["onClick","function",false]],[["enabled","boolean",false],["role","string",true],["onLongClickLabel","string",true],["onLongClick","function",true],["hapticFeedbackEnabled","boolean",false],["onClick","function",false]],[["onClickLabel","string",true],["role","string",true],["onLongClickLabel","string",true],["onLongClick","function",true],["hapticFeedbackEnabled","boolean",false],["onClick","function",false]],[["enabled","boolean",false],["onClickLabel","string",true],["role","string",true],["onLongClickLabel","string",true],["onLongClick","function",true],["hapticFeedbackEnabled","boolean",false],["onClick","function",false]],[["onDoubleClick","function",true],["hapticFeedbackEnabled","boolean",false],["onClick","function",false]],[["enabled","boolean",false],["onDoubleClick","function",true],["hapticFeedbackEnabled","boolean",false],["onClick","function",false]],[["onClickLabel","string",true],["onDoubleClick","function",true],["hapticFeedbackEnabled","boolean",false],["onClick","function",false]],[["enabled","boolean",false],["onClickLabel","string",true],["onDoubleClick","function",true],["hapticFeedbackEnabled","boolean",false],["onClick","function",false]],[["role","string",true],["onDoubleClick","function",true],["hapticFeedbackEnabled","boolean",false],["onClick","function",false]],[["enabled","boolean",false],["role","string",true],["onDoubleClick","function",true],["hapticFeedbackEnabled","boolean",false],["onClick","function",false]],[["onClickLabel","string",true],["role","string",true],["onDoubleClick","function",true],["hapticFeedbackEnabled","boolean",false],["onClick","function",false]],[["enabled","boolean",false],["onClickLabel","string",true],["role","string",true],["onDoubleClick","function",true],["hapticFeedbackEnabled","boolean",false],["onClick","function",false]],[["onLongClickLabel","string",true],["onDoubleClick","function",true],["hapticFeedbackEnabled","boolean",false],["onClick","function",false]],[["enabled","boolean",false],["onLongClickLabel","string",true],["onDoubleClick","function",true],["hapticFeedbackEnabled","boolean",false],["onClick","function",false]],[["onClickLabel","string",true],["onLongClickLabel","string",true],["onDoubleClick","function",true],["hapticFeedbackEnabled","boolean",false],["onClick","function",false]],[["enabled","boolean",false],["onClickLabel","string",true],["onLongClickLabel","string",true],["onDoubleClick","function",true],["hapticFeedbackEnabled","boolean",false],["onClick","function",false]],[["role","string",true],["onLongClickLabel","string",true],["onDoubleClick","function",true],["hapticFeedbackEnabled","boolean",false],["onClick","function",false]],[["enabled","boolean",false],["role","string",true],["onLongClickLabel","string",true],["onDoubleClick","function",true],["hapticFeedbackEnabled","boolean",false],["onClick","function",false]],[["onClickLabel","string",true],["role","string",true],["onLongClickLabel","string",true],["onDoubleClick","function",true],["hapticFeedbackEnabled","boolean",false],["onClick","function",false]],[["enabled","boolean",false],["onClickLabel","string",true],["role","string",true],["onLongClickLabel","string",true],["onDoubleClick","function",true],["hapticFeedbackEnabled","boolean",false],["onClick","function",false]],[["onLongClick","function",true],["onDoubleClick","function",true],["hapticFeedbackEnabled","boolean",false],["onClick","function",false]],[["enabled","boolean",false],["onLongClick","function",true],["onDoubleClick","function",true],["hapticFeedbackEnabled","boolean",false],["onClick","function",false]],[["onClickLabel","string",true],["onLongClick","function",true],["onDoubleClick","function",true],["hapticFeedbackEnabled","boolean",false],["onClick","function",false]],[["enabled","boolean",false],["onClickLabel","string",true],["onLongClick","function",true],["onDoubleClick","function",true],["hapticFeedbackEnabled","boolean",false],["onClick","function",false]],[["role","string",true],["onLongClick","function",true],["onDoubleClick","function",true],["hapticFeedbackEnabled","boolean",false],["onClick","function",false]],[["enabled","boolean",false],["role","string",true],["onLongClick","function",true],["onDoubleClick","function",true],["hapticFeedbackEnabled","boolean",false],["onClick","function",false]],[["onClickLabel","string",true],["role","string",true],["onLongClick","function",true],["onDoubleClick","function",true],["hapticFeedbackEnabled","boolean",false],["onClick","function",false]],[["enabled","boolean",false],["onClickLabel","string",true],["role","string",true],["onLongClick","function",true],["onDoubleClick","function",true],["hapticFeedbackEnabled","boolean",false],["onClick","function",false]],[["onLongClickLabel","string",true],["onLongClick","function",true],["onDoubleClick","function",true],["hapticFeedbackEnabled","boolean",false],["onClick","function",false]],[["enabled","boolean",false],["onLongClickLabel","string",true],["onLongClick","function",true],["onDoubleClick","function",true],["hapticFeedbackEnabled","boolean",false],["onClick","function",false]],[["onClickLabel","string",true],["onLongClickLabel","string",true],["onLongClick","function",true],["onDoubleClick","function",true],["hapticFeedbackEnabled","boolean",false],["onClick","function",false]],[["enabled","boolean",false],["onClickLabel","string",true],["onLongClickLabel","string",true],["onLongClick","function",true],["onDoubleClick","function",true],["hapticFeedbackEnabled","boolean",false],["onClick","function",false]],[["role","string",true],["onLongClickLabel","string",true],["onLongClick","function",true],["onDoubleClick","function",true],["hapticFeedbackEnabled","boolean",false],["onClick","function",false]],[["enabled","boolean",false],["role","string",true],["onLongClickLabel","string",true],["onLongClick","function",true],["onDoubleClick","function",true],["hapticFeedbackEnabled","boolean",false],["onClick","function",false]],[["onClickLabel","string",true],["role","string",true],["onLongClickLabel","string",true],["onLongClick","function",true],["onDoubleClick","function",true],["hapticFeedbackEnabled","boolean",false],["onClick","function",false]],[["enabled","boolean",false],["onClickLabel","string",true],["role","string",true],["onLongClickLabel","string",true],["onLongClick","function",true],["onDoubleClick","function",true],["hapticFeedbackEnabled","boolean",false],["onClick","function",false]]] },
  ],
  "focusGroup": [
    { id: 13, forms: [[]] },
  ],
  "focusable": [
    { id: 14, forms: [[],[["enabled","boolean",false]]] },
  ],
  "horizontalScroll": [
    { id: 15, primary: "state", forms: [[["state","object",false]],[["state","object",false],["enabled","boolean",false]],[["state","object",false],["reverseScrolling","boolean",false]],[["state","object",false],["enabled","boolean",false],["reverseScrolling","boolean",false]]] },
  ],
  "align": [
    { id: 16, primary: "alignment", forms: [[["alignment","string",false]]] },
    { id: 18, primary: "alignment", forms: [[["alignment","string",false]]] },
    { id: 22, primary: "alignment", forms: [[["alignment","string",false]]] },
  ],
  "matchParentSize": [
    { id: 17, forms: [[]] },
  ],
  "weight": [
    { id: 19, primary: "weight", forms: [[["weight","number",false]],[["weight","number",false],["fill","boolean",false]]] },
    { id: 25, primary: "weight", forms: [[["weight","number",false]],[["weight","number",false],["fill","boolean",false]]] },
  ],
  "fillMaxColumnWidth": [
    { id: 20, forms: [[],[["fraction","number",false]]] },
  ],
  "fillMaxRowHeight": [
    { id: 21, forms: [[],[["fraction","number",false]]] },
  ],
  "alignBy": [
    { id: 23, primary: "alignmentLine", forms: [[["alignmentLine","string",false]]] },
  ],
  "alignByBaseline": [
    { id: 24, forms: [[]] },
  ],
  "absoluteOffset": [
    { id: 26, forms: [[],[["x","number",false]],[["y","number",false]],[["x","number",false],["y","number",false]]] },
  ],
  "absolutePadding": [
    { id: 27, forms: [[],[["left","number",false]],[["top","number",false]],[["left","number",false],["top","number",false]],[["right","number",false]],[["left","number",false],["right","number",false]],[["top","number",false],["right","number",false]],[["left","number",false],["top","number",false],["right","number",false]],[["bottom","number",false]],[["left","number",false],["bottom","number",false]],[["top","number",false],["bottom","number",false]],[["left","number",false],["top","number",false],["bottom","number",false]],[["right","number",false],["bottom","number",false]],[["left","number",false],["right","number",false],["bottom","number",false]],[["top","number",false],["right","number",false],["bottom","number",false]],[["left","number",false],["top","number",false],["right","number",false],["bottom","number",false]]] },
  ],
  "aspectRatio": [
    { id: 28, primary: "ratio", forms: [[["ratio","number",false]],[["ratio","number",false],["matchHeightConstraintsFirst","boolean",false]]] },
  ],
  "captionBarPadding": [
    { id: 29, forms: [[]] },
  ],
  "consumeWindowInsets": [
    { id: 30, primary: "insets", forms: [[["insets","windowInsets",false]]] },
    { id: 31, primary: "paddingValues", forms: [[["paddingValues","paddingValues",false]]] },
  ],
  "defaultMinSize": [
    { id: 32, forms: [[],[["minWidth","number",false]],[["minHeight","number",false]],[["minWidth","number",false],["minHeight","number",false]]] },
  ],
  "displayCutoutPadding": [
    { id: 33, forms: [[]] },
  ],
  "fillMaxHeight": [
    { id: 34, forms: [[],[["fraction","number",false]]] },
  ],
  "fillMaxSize": [
    { id: 35, forms: [[],[["fraction","number",false]]] },
  ],
  "fillMaxWidth": [
    { id: 36, forms: [[],[["fraction","number",false]]] },
  ],
  "height": [
    { id: 37, primary: "height", forms: [[["height","number",false]]] },
    { id: 38, primary: "intrinsicSize", forms: [[["intrinsicSize","string",false]]] },
  ],
  "heightIn": [
    { id: 39, forms: [[],[["min","number",false]],[["max","number",false]],[["min","number",false],["max","number",false]]] },
  ],
  "imeNestedScroll": [
    { id: 40, forms: [[]] },
  ],
  "imePadding": [
    { id: 41, forms: [[]] },
  ],
  "mandatorySystemGesturesPadding": [
    { id: 42, forms: [[]] },
  ],
  "navigationBarsPadding": [
    { id: 43, forms: [[]] },
  ],
  "offset": [
    { id: 44, forms: [[],[["x","number",false]],[["y","number",false]],[["x","number",false],["y","number",false]]] },
  ],
  "padding": [
    { id: 45, primary: "all", forms: [[["all","number",false]]] },
    { id: 46, forms: [[],[["horizontal","number",false]],[["vertical","number",false]],[["horizontal","number",false],["vertical","number",false]]] },
    { id: 47, primary: "paddingValues", forms: [[["paddingValues","paddingValues",false]]] },
    { id: 48, forms: [[["start","number",false]],[["top","number",false]],[["start","number",false],["top","number",false]],[["end","number",false]],[["start","number",false],["end","number",false]],[["top","number",false],["end","number",false]],[["start","number",false],["top","number",false],["end","number",false]],[["bottom","number",false]],[["start","number",false],["bottom","number",false]],[["top","number",false],["bottom","number",false]],[["start","number",false],["top","number",false],["bottom","number",false]],[["end","number",false],["bottom","number",false]],[["start","number",false],["end","number",false],["bottom","number",false]],[["top","number",false],["end","number",false],["bottom","number",false]],[["start","number",false],["top","number",false],["end","number",false],["bottom","number",false]]] },
  ],
  "paddingFrom": [
    { id: 49, primary: "alignmentLine", forms: [[["alignmentLine","string",false],["before","number",false]],[["alignmentLine","string",false],["after","number",false]],[["alignmentLine","string",false],["before","number",false],["after","number",false]]] },
    { id: 50, primary: "alignmentLine", forms: [[["alignmentLine","string",false],["before","number",false]],[["alignmentLine","string",false],["after","number",false]],[["alignmentLine","string",false],["before","number",false],["after","number",false]]] },
  ],
  "paddingFromBaseline": [
    { id: 51, forms: [[["top","number",false]],[["bottom","number",false]],[["top","number",false],["bottom","number",false]]] },
    { id: 52, forms: [[["top","number",false]],[["bottom","number",false]],[["top","number",false],["bottom","number",false]]] },
  ],
  "recalculateWindowInsets": [
    { id: 53, forms: [[]] },
  ],
  "requiredHeight": [
    { id: 54, primary: "height", forms: [[["height","number",false]]] },
    { id: 55, primary: "intrinsicSize", forms: [[["intrinsicSize","string",false]]] },
  ],
  "requiredHeightIn": [
    { id: 56, forms: [[],[["min","number",false]],[["max","number",false]],[["min","number",false],["max","number",false]]] },
  ],
  "requiredSize": [
    { id: 57, primary: "size", forms: [[["size","number",false]]] },
    { id: 58, primary: "size", forms: [[["size","object",false]]] },
    { id: 59, forms: [[["width","number",false],["height","number",false]]] },
  ],
  "requiredSizeIn": [
    { id: 60, forms: [[],[["minWidth","number",false]],[["minHeight","number",false]],[["minWidth","number",false],["minHeight","number",false]],[["maxWidth","number",false]],[["minWidth","number",false],["maxWidth","number",false]],[["minHeight","number",false],["maxWidth","number",false]],[["minWidth","number",false],["minHeight","number",false],["maxWidth","number",false]],[["maxHeight","number",false]],[["minWidth","number",false],["maxHeight","number",false]],[["minHeight","number",false],["maxHeight","number",false]],[["minWidth","number",false],["minHeight","number",false],["maxHeight","number",false]],[["maxWidth","number",false],["maxHeight","number",false]],[["minWidth","number",false],["maxWidth","number",false],["maxHeight","number",false]],[["minHeight","number",false],["maxWidth","number",false],["maxHeight","number",false]],[["minWidth","number",false],["minHeight","number",false],["maxWidth","number",false],["maxHeight","number",false]]] },
  ],
  "requiredWidth": [
    { id: 61, primary: "intrinsicSize", forms: [[["intrinsicSize","string",false]]] },
    { id: 62, primary: "width", forms: [[["width","number",false]]] },
  ],
  "requiredWidthIn": [
    { id: 63, forms: [[],[["min","number",false]],[["max","number",false]],[["min","number",false],["max","number",false]]] },
  ],
  "safeContentPadding": [
    { id: 64, forms: [[]] },
  ],
  "safeDrawingPadding": [
    { id: 65, forms: [[]] },
  ],
  "safeGesturesPadding": [
    { id: 66, forms: [[]] },
  ],
  "size": [
    { id: 67, primary: "size", forms: [[["size","number",false]]] },
    { id: 68, primary: "size", forms: [[["size","object",false]]] },
    { id: 69, forms: [[["width","number",false],["height","number",false]]] },
  ],
  "sizeIn": [
    { id: 70, forms: [[],[["minWidth","number",false]],[["minHeight","number",false]],[["minWidth","number",false],["minHeight","number",false]],[["maxWidth","number",false]],[["minWidth","number",false],["maxWidth","number",false]],[["minHeight","number",false],["maxWidth","number",false]],[["minWidth","number",false],["minHeight","number",false],["maxWidth","number",false]],[["maxHeight","number",false]],[["minWidth","number",false],["maxHeight","number",false]],[["minHeight","number",false],["maxHeight","number",false]],[["minWidth","number",false],["minHeight","number",false],["maxHeight","number",false]],[["maxWidth","number",false],["maxHeight","number",false]],[["minWidth","number",false],["maxWidth","number",false],["maxHeight","number",false]],[["minHeight","number",false],["maxWidth","number",false],["maxHeight","number",false]],[["minWidth","number",false],["minHeight","number",false],["maxWidth","number",false],["maxHeight","number",false]]] },
  ],
  "statusBarsPadding": [
    { id: 71, forms: [[]] },
  ],
  "systemBarsPadding": [
    { id: 72, forms: [[]] },
  ],
  "systemGesturesPadding": [
    { id: 73, forms: [[]] },
  ],
  "waterfallPadding": [
    { id: 74, forms: [[]] },
  ],
  "width": [
    { id: 75, primary: "intrinsicSize", forms: [[["intrinsicSize","string",false]]] },
    { id: 76, primary: "width", forms: [[["width","number",false]]] },
  ],
  "widthIn": [
    { id: 77, forms: [[],[["min","number",false]],[["max","number",false]],[["min","number",false],["max","number",false]]] },
  ],
  "windowInsetsBottomHeight": [
    { id: 78, primary: "insets", forms: [[["insets","windowInsets",false]]] },
  ],
  "windowInsetsEndWidth": [
    { id: 79, primary: "insets", forms: [[["insets","windowInsets",false]]] },
  ],
  "windowInsetsPadding": [
    { id: 80, primary: "insets", forms: [[["insets","windowInsets",false]]] },
  ],
  "windowInsetsStartWidth": [
    { id: 81, primary: "insets", forms: [[["insets","windowInsets",false]]] },
  ],
  "windowInsetsTopHeight": [
    { id: 82, primary: "insets", forms: [[["insets","windowInsets",false]]] },
  ],
  "wrapContentHeight": [
    { id: 83, forms: [[],[["align","string",false]],[["unbounded","boolean",false]],[["align","string",false],["unbounded","boolean",false]]] },
  ],
  "wrapContentSize": [
    { id: 84, forms: [[],[["align","string",false]],[["unbounded","boolean",false]],[["align","string",false],["unbounded","boolean",false]]] },
  ],
  "wrapContentWidth": [
    { id: 85, forms: [[],[["align","string",false]],[["unbounded","boolean",false]],[["align","string",false],["unbounded","boolean",false]]] },
  ],
  "animateItem": [
    { id: 86, forms: [[],[["fadeInSpec","object",true]],[["placementSpec","object",true]],[["fadeInSpec","object",true],["placementSpec","object",true]],[["fadeOutSpec","object",true]],[["fadeInSpec","object",true],["fadeOutSpec","object",true]],[["placementSpec","object",true],["fadeOutSpec","object",true]],[["fadeInSpec","object",true],["placementSpec","object",true],["fadeOutSpec","object",true]]] },
    { id: 90, forms: [[],[["fadeInSpec","object",true]],[["placementSpec","object",true]],[["fadeInSpec","object",true],["placementSpec","object",true]],[["fadeOutSpec","object",true]],[["fadeInSpec","object",true],["fadeOutSpec","object",true]],[["placementSpec","object",true],["fadeOutSpec","object",true]],[["fadeInSpec","object",true],["placementSpec","object",true],["fadeOutSpec","object",true]]] },
    { id: 91, forms: [[],[["fadeInSpec","object",true]],[["placementSpec","object",true]],[["fadeInSpec","object",true],["placementSpec","object",true]],[["fadeOutSpec","object",true]],[["fadeInSpec","object",true],["fadeOutSpec","object",true]],[["placementSpec","object",true],["fadeOutSpec","object",true]],[["fadeInSpec","object",true],["placementSpec","object",true],["fadeOutSpec","object",true]]] },
  ],
  "fillParentMaxHeight": [
    { id: 87, forms: [[],[["fraction","number",false]]] },
  ],
  "fillParentMaxSize": [
    { id: 88, forms: [[],[["fraction","number",false]]] },
  ],
  "fillParentMaxWidth": [
    { id: 89, forms: [[],[["fraction","number",false]]] },
  ],
  "onFocusedBoundsChanged": [
    { id: 92, primary: "onPositioned", forms: [[["onPositioned","function",false]]] },
  ],
  "preferKeepClear": [
    { id: 93, forms: [[]] },
  ],
  "progressSemantics": [
    { id: 94, forms: [[]] },
    { id: 95, primary: "value", forms: [[["value","number",false]],[["value","number",false],["valueRange","tuple",false]],[["value","number",false],["steps","number",false]],[["value","number",false],["valueRange","tuple",false],["steps","number",false]]] },
  ],
  "bringIntoViewRequester": [
    { id: 96, primary: "bringIntoViewRequester", forms: [[["bringIntoViewRequester","object",false]]] },
  ],
  "selectable": [
    { id: 97, forms: [[["selected","boolean",false],["onClick","function",false]],[["selected","boolean",false],["enabled","boolean",false],["onClick","function",false]],[["selected","boolean",false],["role","string",true],["onClick","function",false]],[["selected","boolean",false],["enabled","boolean",false],["role","string",true],["onClick","function",false]]] },
  ],
  "selectableGroup": [
    { id: 98, forms: [[]] },
  ],
  "toggleable": [
    { id: 99, forms: [[["value","boolean",false],["onValueChange","function",false]],[["value","boolean",false],["enabled","boolean",false],["onValueChange","function",false]],[["value","boolean",false],["role","string",true],["onValueChange","function",false]],[["value","boolean",false],["enabled","boolean",false],["role","string",true],["onValueChange","function",false]]] },
  ],
  "triStateToggleable": [
    { id: 100, forms: [[["state","string",false],["onClick","function",false]],[["state","string",false],["enabled","boolean",false],["onClick","function",false]],[["state","string",false],["role","string",true],["onClick","function",false]],[["state","string",false],["enabled","boolean",false],["role","string",true],["onClick","function",false]]] },
  ],
  "systemGestureExclusion": [
    { id: 101, forms: [[]] },
  ],
  "handwritingDetector": [
    { id: 102, primary: "callback", forms: [[["callback","function",false]]] },
  ],
  "handwritingHandler": [
    { id: 103, forms: [[]] },
  ],
  "verticalScroll": [
    { id: 104, primary: "state", forms: [[["state","object",false]],[["state","object",false],["enabled","boolean",false]],[["state","object",false],["reverseScrolling","boolean",false]],[["state","object",false],["enabled","boolean",false],["reverseScrolling","boolean",false]]] },
  ],
  "exposedDropdownSize": [
    { id: 105, forms: [[],[["matchAnchorWidth","boolean",false]]] },
  ],
  "animateFloatingActionButton": [
    { id: 106, forms: [[["visible","boolean",false],["alignment","string",false]],[["visible","boolean",false],["alignment","string",false],["targetScale","number",false]],[["visible","boolean",false],["alignment","string",false],["scaleAnimationSpec","object",true]],[["visible","boolean",false],["alignment","string",false],["targetScale","number",false],["scaleAnimationSpec","object",true]],[["visible","boolean",false],["alignment","string",false],["alphaAnimationSpec","object",true]],[["visible","boolean",false],["alignment","string",false],["targetScale","number",false],["alphaAnimationSpec","object",true]],[["visible","boolean",false],["alignment","string",false],["scaleAnimationSpec","object",true],["alphaAnimationSpec","object",true]],[["visible","boolean",false],["alignment","string",false],["targetScale","number",false],["scaleAnimationSpec","object",true],["alphaAnimationSpec","object",true]]] },
  ],
  "minimumInteractiveComponentSize": [
    { id: 107, forms: [[]] },
  ],
  "alpha": [
    { id: 108, primary: "alpha", forms: [[["alpha","number",false]]] },
  ],
  "blur": [
    { id: 109, primary: "radius", forms: [[["radius","number",false]]] },
    { id: 110, forms: [[["radiusX","number",false],["radiusY","number",false]]] },
  ],
  "clip": [
    { id: 111, primary: "shape", forms: [[["shape","shape",false]]] },
  ],
  "clipToBounds": [
    { id: 112, forms: [[]] },
  ],
  "paint": [
    { id: 113, primary: "painter", forms: [[["painter","object",false]],[["painter","object",false],["sizeToIntrinsics","boolean",false]],[["painter","object",false],["alignment","string",false]],[["painter","object",false],["sizeToIntrinsics","boolean",false],["alignment","string",false]],[["painter","object",false],["contentScale","string",false]],[["painter","object",false],["sizeToIntrinsics","boolean",false],["contentScale","string",false]],[["painter","object",false],["alignment","string",false],["contentScale","string",false]],[["painter","object",false],["sizeToIntrinsics","boolean",false],["alignment","string",false],["contentScale","string",false]],[["painter","object",false],["alpha","number",false]],[["painter","object",false],["sizeToIntrinsics","boolean",false],["alpha","number",false]],[["painter","object",false],["alignment","string",false],["alpha","number",false]],[["painter","object",false],["sizeToIntrinsics","boolean",false],["alignment","string",false],["alpha","number",false]],[["painter","object",false],["contentScale","string",false],["alpha","number",false]],[["painter","object",false],["sizeToIntrinsics","boolean",false],["contentScale","string",false],["alpha","number",false]],[["painter","object",false],["alignment","string",false],["contentScale","string",false],["alpha","number",false]],[["painter","object",false],["sizeToIntrinsics","boolean",false],["alignment","string",false],["contentScale","string",false],["alpha","number",false]]] },
  ],
  "rotate": [
    { id: 114, primary: "degrees", forms: [[["degrees","number",false]]] },
  ],
  "scale": [
    { id: 115, primary: "scale", forms: [[["scale","number",false]]] },
    { id: 116, forms: [[["scaleX","number",false],["scaleY","number",false]]] },
  ],
  "shadow": [
    { id: 117, primary: "elevation", forms: [[["elevation","number",false]],[["elevation","number",false],["shape","shape",false]],[["elevation","number",false],["clip","boolean",false]],[["elevation","number",false],["shape","shape",false],["clip","boolean",false]],[["elevation","number",false],["ambientColor","string",false]],[["elevation","number",false],["shape","shape",false],["ambientColor","string",false]],[["elevation","number",false],["clip","boolean",false],["ambientColor","string",false]],[["elevation","number",false],["shape","shape",false],["clip","boolean",false],["ambientColor","string",false]],[["elevation","number",false],["spotColor","string",false]],[["elevation","number",false],["shape","shape",false],["spotColor","string",false]],[["elevation","number",false],["clip","boolean",false],["spotColor","string",false]],[["elevation","number",false],["shape","shape",false],["clip","boolean",false],["spotColor","string",false]],[["elevation","number",false],["ambientColor","string",false],["spotColor","string",false]],[["elevation","number",false],["shape","shape",false],["ambientColor","string",false],["spotColor","string",false]],[["elevation","number",false],["clip","boolean",false],["ambientColor","string",false],["spotColor","string",false]],[["elevation","number",false],["shape","shape",false],["clip","boolean",false],["ambientColor","string",false],["spotColor","string",false]]] },
  ],
  "focusProperties": [
    { id: 118, primary: "scope", forms: [[["scope","object",false]]] },
  ],
  "focusRequester": [
    { id: 119, primary: "focusRequester", forms: [[["focusRequester","object",false]]] },
  ],
  "focusRestorer": [
    { id: 120, forms: [[],[["fallback","object",false]]] },
  ],
  "focusTarget": [
    { id: 121, forms: [[]] },
  ],
  "onFocusChanged": [
    { id: 122, primary: "onFocusChanged", forms: [[["onFocusChanged","function",false]]] },
  ],
  "onFocusEvent": [
    { id: 123, primary: "onFocusEvent", forms: [[["onFocusEvent","function",false]]] },
  ],
  "graphicsLayer": [
    { id: 124, forms: [[],[["scaleX","number",false]],[["scaleY","number",false]],[["scaleX","number",false],["scaleY","number",false]],[["alpha","number",false]],[["scaleX","number",false],["alpha","number",false]],[["scaleY","number",false],["alpha","number",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false]],[["translationX","number",false]],[["scaleX","number",false],["translationX","number",false]],[["scaleY","number",false],["translationX","number",false]],[["scaleX","number",false],["scaleY","number",false],["translationX","number",false]],[["alpha","number",false],["translationX","number",false]],[["scaleX","number",false],["alpha","number",false],["translationX","number",false]],[["scaleY","number",false],["alpha","number",false],["translationX","number",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationX","number",false]],[["translationY","number",false]],[["scaleX","number",false],["translationY","number",false]],[["scaleY","number",false],["translationY","number",false]],[["scaleX","number",false],["scaleY","number",false],["translationY","number",false]],[["alpha","number",false],["translationY","number",false]],[["scaleX","number",false],["alpha","number",false],["translationY","number",false]],[["scaleY","number",false],["alpha","number",false],["translationY","number",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationY","number",false]],[["translationX","number",false],["translationY","number",false]],[["scaleX","number",false],["translationX","number",false],["translationY","number",false]],[["scaleY","number",false],["translationX","number",false],["translationY","number",false]],[["scaleX","number",false],["scaleY","number",false],["translationX","number",false],["translationY","number",false]],[["alpha","number",false],["translationX","number",false],["translationY","number",false]],[["scaleX","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false]],[["scaleY","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false]],[["shadowElevation","number",false]],[["scaleX","number",false],["shadowElevation","number",false]],[["scaleY","number",false],["shadowElevation","number",false]],[["scaleX","number",false],["scaleY","number",false],["shadowElevation","number",false]],[["alpha","number",false],["shadowElevation","number",false]],[["scaleX","number",false],["alpha","number",false],["shadowElevation","number",false]],[["scaleY","number",false],["alpha","number",false],["shadowElevation","number",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["shadowElevation","number",false]],[["translationX","number",false],["shadowElevation","number",false]],[["scaleX","number",false],["translationX","number",false],["shadowElevation","number",false]],[["scaleY","number",false],["translationX","number",false],["shadowElevation","number",false]],[["scaleX","number",false],["scaleY","number",false],["translationX","number",false],["shadowElevation","number",false]],[["alpha","number",false],["translationX","number",false],["shadowElevation","number",false]],[["scaleX","number",false],["alpha","number",false],["translationX","number",false],["shadowElevation","number",false]],[["scaleY","number",false],["alpha","number",false],["translationX","number",false],["shadowElevation","number",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationX","number",false],["shadowElevation","number",false]],[["translationY","number",false],["shadowElevation","number",false]],[["scaleX","number",false],["translationY","number",false],["shadowElevation","number",false]],[["scaleY","number",false],["translationY","number",false],["shadowElevation","number",false]],[["scaleX","number",false],["scaleY","number",false],["translationY","number",false],["shadowElevation","number",false]],[["alpha","number",false],["translationY","number",false],["shadowElevation","number",false]],[["scaleX","number",false],["alpha","number",false],["translationY","number",false],["shadowElevation","number",false]],[["scaleY","number",false],["alpha","number",false],["translationY","number",false],["shadowElevation","number",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationY","number",false],["shadowElevation","number",false]],[["translationX","number",false],["translationY","number",false],["shadowElevation","number",false]],[["scaleX","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false]],[["scaleY","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false]],[["scaleX","number",false],["scaleY","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false]],[["alpha","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false]],[["scaleX","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false]],[["scaleY","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false]],[["rotationX","number",false]],[["scaleX","number",false],["rotationX","number",false]],[["scaleY","number",false],["rotationX","number",false]],[["scaleX","number",false],["scaleY","number",false],["rotationX","number",false]],[["alpha","number",false],["rotationX","number",false]],[["scaleX","number",false],["alpha","number",false],["rotationX","number",false]],[["scaleY","number",false],["alpha","number",false],["rotationX","number",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["rotationX","number",false]],[["translationX","number",false],["rotationX","number",false]],[["scaleX","number",false],["translationX","number",false],["rotationX","number",false]],[["scaleY","number",false],["translationX","number",false],["rotationX","number",false]],[["scaleX","number",false],["scaleY","number",false],["translationX","number",false],["rotationX","number",false]],[["alpha","number",false],["translationX","number",false],["rotationX","number",false]],[["scaleX","number",false],["alpha","number",false],["translationX","number",false],["rotationX","number",false]],[["scaleY","number",false],["alpha","number",false],["translationX","number",false],["rotationX","number",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationX","number",false],["rotationX","number",false]],[["translationY","number",false],["rotationX","number",false]],[["scaleX","number",false],["translationY","number",false],["rotationX","number",false]],[["scaleY","number",false],["translationY","number",false],["rotationX","number",false]],[["scaleX","number",false],["scaleY","number",false],["translationY","number",false],["rotationX","number",false]],[["alpha","number",false],["translationY","number",false],["rotationX","number",false]],[["scaleX","number",false],["alpha","number",false],["translationY","number",false],["rotationX","number",false]],[["scaleY","number",false],["alpha","number",false],["translationY","number",false],["rotationX","number",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationY","number",false],["rotationX","number",false]],[["translationX","number",false],["translationY","number",false],["rotationX","number",false]],[["scaleX","number",false],["translationX","number",false],["translationY","number",false],["rotationX","number",false]],[["scaleY","number",false],["translationX","number",false],["translationY","number",false],["rotationX","number",false]],[["scaleX","number",false],["scaleY","number",false],["translationX","number",false],["translationY","number",false],["rotationX","number",false]],[["alpha","number",false],["translationX","number",false],["translationY","number",false],["rotationX","number",false]],[["scaleX","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["rotationX","number",false]],[["scaleY","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["rotationX","number",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["rotationX","number",false]],[["shadowElevation","number",false],["rotationX","number",false]],[["scaleX","number",false],["shadowElevation","number",false],["rotationX","number",false]],[["scaleY","number",false],["shadowElevation","number",false],["rotationX","number",false]],[["scaleX","number",false],["scaleY","number",false],["shadowElevation","number",false],["rotationX","number",false]],[["alpha","number",false],["shadowElevation","number",false],["rotationX","number",false]],[["scaleX","number",false],["alpha","number",false],["shadowElevation","number",false],["rotationX","number",false]],[["scaleY","number",false],["alpha","number",false],["shadowElevation","number",false],["rotationX","number",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["shadowElevation","number",false],["rotationX","number",false]],[["translationX","number",false],["shadowElevation","number",false],["rotationX","number",false]],[["scaleX","number",false],["translationX","number",false],["shadowElevation","number",false],["rotationX","number",false]],[["scaleY","number",false],["translationX","number",false],["shadowElevation","number",false],["rotationX","number",false]],[["scaleX","number",false],["scaleY","number",false],["translationX","number",false],["shadowElevation","number",false],["rotationX","number",false]],[["alpha","number",false],["translationX","number",false],["shadowElevation","number",false],["rotationX","number",false]],[["scaleX","number",false],["alpha","number",false],["translationX","number",false],["shadowElevation","number",false],["rotationX","number",false]],[["scaleY","number",false],["alpha","number",false],["translationX","number",false],["shadowElevation","number",false],["rotationX","number",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationX","number",false],["shadowElevation","number",false],["rotationX","number",false]],[["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false]],[["scaleX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false]],[["scaleY","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false]],[["scaleX","number",false],["scaleY","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false]],[["alpha","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false]],[["scaleX","number",false],["alpha","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false]],[["scaleY","number",false],["alpha","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false]],[["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false]],[["scaleX","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false]],[["scaleY","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false]],[["scaleX","number",false],["scaleY","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false]],[["alpha","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false]],[["scaleX","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false]],[["scaleY","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false]],[["rotationY","number",false]],[["scaleX","number",false],["rotationY","number",false]],[["scaleY","number",false],["rotationY","number",false]],[["scaleX","number",false],["scaleY","number",false],["rotationY","number",false]],[["alpha","number",false],["rotationY","number",false]],[["scaleX","number",false],["alpha","number",false],["rotationY","number",false]],[["scaleY","number",false],["alpha","number",false],["rotationY","number",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["rotationY","number",false]],[["translationX","number",false],["rotationY","number",false]],[["scaleX","number",false],["translationX","number",false],["rotationY","number",false]],[["scaleY","number",false],["translationX","number",false],["rotationY","number",false]],[["scaleX","number",false],["scaleY","number",false],["translationX","number",false],["rotationY","number",false]],[["alpha","number",false],["translationX","number",false],["rotationY","number",false]],[["scaleX","number",false],["alpha","number",false],["translationX","number",false],["rotationY","number",false]],[["scaleY","number",false],["alpha","number",false],["translationX","number",false],["rotationY","number",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationX","number",false],["rotationY","number",false]],[["translationY","number",false],["rotationY","number",false]],[["scaleX","number",false],["translationY","number",false],["rotationY","number",false]],[["scaleY","number",false],["translationY","number",false],["rotationY","number",false]],[["scaleX","number",false],["scaleY","number",false],["translationY","number",false],["rotationY","number",false]],[["alpha","number",false],["translationY","number",false],["rotationY","number",false]],[["scaleX","number",false],["alpha","number",false],["translationY","number",false],["rotationY","number",false]],[["scaleY","number",false],["alpha","number",false],["translationY","number",false],["rotationY","number",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationY","number",false],["rotationY","number",false]],[["translationX","number",false],["translationY","number",false],["rotationY","number",false]],[["scaleX","number",false],["translationX","number",false],["translationY","number",false],["rotationY","number",false]],[["scaleY","number",false],["translationX","number",false],["translationY","number",false],["rotationY","number",false]],[["scaleX","number",false],["scaleY","number",false],["translationX","number",false],["translationY","number",false],["rotationY","number",false]],[["alpha","number",false],["translationX","number",false],["translationY","number",false],["rotationY","number",false]],[["scaleX","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["rotationY","number",false]],[["scaleY","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["rotationY","number",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["rotationY","number",false]],[["shadowElevation","number",false],["rotationY","number",false]],[["scaleX","number",false],["shadowElevation","number",false],["rotationY","number",false]],[["scaleY","number",false],["shadowElevation","number",false],["rotationY","number",false]],[["scaleX","number",false],["scaleY","number",false],["shadowElevation","number",false],["rotationY","number",false]],[["alpha","number",false],["shadowElevation","number",false],["rotationY","number",false]],[["scaleX","number",false],["alpha","number",false],["shadowElevation","number",false],["rotationY","number",false]],[["scaleY","number",false],["alpha","number",false],["shadowElevation","number",false],["rotationY","number",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["shadowElevation","number",false],["rotationY","number",false]],[["translationX","number",false],["shadowElevation","number",false],["rotationY","number",false]],[["scaleX","number",false],["translationX","number",false],["shadowElevation","number",false],["rotationY","number",false]],[["scaleY","number",false],["translationX","number",false],["shadowElevation","number",false],["rotationY","number",false]],[["scaleX","number",false],["scaleY","number",false],["translationX","number",false],["shadowElevation","number",false],["rotationY","number",false]],[["alpha","number",false],["translationX","number",false],["shadowElevation","number",false],["rotationY","number",false]],[["scaleX","number",false],["alpha","number",false],["translationX","number",false],["shadowElevation","number",false],["rotationY","number",false]],[["scaleY","number",false],["alpha","number",false],["translationX","number",false],["shadowElevation","number",false],["rotationY","number",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationX","number",false],["shadowElevation","number",false],["rotationY","number",false]],[["translationY","number",false],["shadowElevation","number",false],["rotationY","number",false]],[["scaleX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationY","number",false]],[["scaleY","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationY","number",false]],[["scaleX","number",false],["scaleY","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationY","number",false]],[["alpha","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationY","number",false]],[["scaleX","number",false],["alpha","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationY","number",false]],[["scaleY","number",false],["alpha","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationY","number",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationY","number",false]],[["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationY","number",false]],[["scaleX","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationY","number",false]],[["scaleY","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationY","number",false]],[["scaleX","number",false],["scaleY","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationY","number",false]],[["alpha","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationY","number",false]],[["scaleX","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationY","number",false]],[["scaleY","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationY","number",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationY","number",false]],[["rotationX","number",false],["rotationY","number",false]],[["scaleX","number",false],["rotationX","number",false],["rotationY","number",false]],[["scaleY","number",false],["rotationX","number",false],["rotationY","number",false]],[["scaleX","number",false],["scaleY","number",false],["rotationX","number",false],["rotationY","number",false]],[["alpha","number",false],["rotationX","number",false],["rotationY","number",false]],[["scaleX","number",false],["alpha","number",false],["rotationX","number",false],["rotationY","number",false]],[["scaleY","number",false],["alpha","number",false],["rotationX","number",false],["rotationY","number",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["rotationX","number",false],["rotationY","number",false]],[["translationX","number",false],["rotationX","number",false],["rotationY","number",false]],[["scaleX","number",false],["translationX","number",false],["rotationX","number",false],["rotationY","number",false]],[["scaleY","number",false],["translationX","number",false],["rotationX","number",false],["rotationY","number",false]],[["scaleX","number",false],["scaleY","number",false],["translationX","number",false],["rotationX","number",false],["rotationY","number",false]],[["alpha","number",false],["translationX","number",false],["rotationX","number",false],["rotationY","number",false]],[["scaleX","number",false],["alpha","number",false],["translationX","number",false],["rotationX","number",false],["rotationY","number",false]],[["scaleY","number",false],["alpha","number",false],["translationX","number",false],["rotationX","number",false],["rotationY","number",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationX","number",false],["rotationX","number",false],["rotationY","number",false]],[["translationY","number",false],["rotationX","number",false],["rotationY","number",false]],[["scaleX","number",false],["translationY","number",false],["rotationX","number",false],["rotationY","number",false]],[["scaleY","number",false],["translationY","number",false],["rotationX","number",false],["rotationY","number",false]],[["scaleX","number",false],["scaleY","number",false],["translationY","number",false],["rotationX","number",false],["rotationY","number",false]],[["alpha","number",false],["translationY","number",false],["rotationX","number",false],["rotationY","number",false]],[["scaleX","number",false],["alpha","number",false],["translationY","number",false],["rotationX","number",false],["rotationY","number",false]],[["scaleY","number",false],["alpha","number",false],["translationY","number",false],["rotationX","number",false],["rotationY","number",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationY","number",false],["rotationX","number",false],["rotationY","number",false]],[["translationX","number",false],["translationY","number",false],["rotationX","number",false],["rotationY","number",false]],[["scaleX","number",false],["translationX","number",false],["translationY","number",false],["rotationX","number",false],["rotationY","number",false]],[["scaleY","number",false],["translationX","number",false],["translationY","number",false],["rotationX","number",false],["rotationY","number",false]],[["scaleX","number",false],["scaleY","number",false],["translationX","number",false],["translationY","number",false],["rotationX","number",false],["rotationY","number",false]],[["alpha","number",false],["translationX","number",false],["translationY","number",false],["rotationX","number",false],["rotationY","number",false]],[["scaleX","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["rotationX","number",false],["rotationY","number",false]],[["scaleY","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["rotationX","number",false],["rotationY","number",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["rotationX","number",false],["rotationY","number",false]],[["shadowElevation","number",false],["rotationX","number",false],["rotationY","number",false]],[["scaleX","number",false],["shadowElevation","number",false],["rotationX","number",false],["rotationY","number",false]],[["scaleY","number",false],["shadowElevation","number",false],["rotationX","number",false],["rotationY","number",false]],[["scaleX","number",false],["scaleY","number",false],["shadowElevation","number",false],["rotationX","number",false],["rotationY","number",false]],[["alpha","number",false],["shadowElevation","number",false],["rotationX","number",false],["rotationY","number",false]],[["scaleX","number",false],["alpha","number",false],["shadowElevation","number",false],["rotationX","number",false],["rotationY","number",false]],[["scaleY","number",false],["alpha","number",false],["shadowElevation","number",false],["rotationX","number",false],["rotationY","number",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["shadowElevation","number",false],["rotationX","number",false],["rotationY","number",false]],[["translationX","number",false],["shadowElevation","number",false],["rotationX","number",false],["rotationY","number",false]],[["scaleX","number",false],["translationX","number",false],["shadowElevation","number",false],["rotationX","number",false],["rotationY","number",false]],[["scaleY","number",false],["translationX","number",false],["shadowElevation","number",false],["rotationX","number",false],["rotationY","number",false]],[["scaleX","number",false],["scaleY","number",false],["translationX","number",false],["shadowElevation","number",false],["rotationX","number",false],["rotationY","number",false]],[["alpha","number",false],["translationX","number",false],["shadowElevation","number",false],["rotationX","number",false],["rotationY","number",false]],[["scaleX","number",false],["alpha","number",false],["translationX","number",false],["shadowElevation","number",false],["rotationX","number",false],["rotationY","number",false]],[["scaleY","number",false],["alpha","number",false],["translationX","number",false],["shadowElevation","number",false],["rotationX","number",false],["rotationY","number",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationX","number",false],["shadowElevation","number",false],["rotationX","number",false],["rotationY","number",false]],[["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["rotationY","number",false]],[["scaleX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["rotationY","number",false]],[["scaleY","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["rotationY","number",false]],[["scaleX","number",false],["scaleY","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["rotationY","number",false]],[["alpha","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["rotationY","number",false]],[["scaleX","number",false],["alpha","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["rotationY","number",false]],[["scaleY","number",false],["alpha","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["rotationY","number",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["rotationY","number",false]],[["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["rotationY","number",false]],[["scaleX","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["rotationY","number",false]],[["scaleY","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["rotationY","number",false]],[["scaleX","number",false],["scaleY","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["rotationY","number",false]],[["alpha","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["rotationY","number",false]],[["scaleX","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["rotationY","number",false]],[["scaleY","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["rotationY","number",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["rotationY","number",false]],[["rotationZ","number",false]],[["scaleX","number",false],["rotationZ","number",false]],[["scaleY","number",false],["rotationZ","number",false]],[["scaleX","number",false],["scaleY","number",false],["rotationZ","number",false]],[["alpha","number",false],["rotationZ","number",false]],[["scaleX","number",false],["alpha","number",false],["rotationZ","number",false]],[["scaleY","number",false],["alpha","number",false],["rotationZ","number",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["rotationZ","number",false]],[["translationX","number",false],["rotationZ","number",false]],[["scaleX","number",false],["translationX","number",false],["rotationZ","number",false]],[["scaleY","number",false],["translationX","number",false],["rotationZ","number",false]],[["scaleX","number",false],["scaleY","number",false],["translationX","number",false],["rotationZ","number",false]],[["alpha","number",false],["translationX","number",false],["rotationZ","number",false]],[["scaleX","number",false],["alpha","number",false],["translationX","number",false],["rotationZ","number",false]],[["scaleY","number",false],["alpha","number",false],["translationX","number",false],["rotationZ","number",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationX","number",false],["rotationZ","number",false]],[["translationY","number",false],["rotationZ","number",false]],[["scaleX","number",false],["translationY","number",false],["rotationZ","number",false]],[["scaleY","number",false],["translationY","number",false],["rotationZ","number",false]],[["scaleX","number",false],["scaleY","number",false],["translationY","number",false],["rotationZ","number",false]],[["alpha","number",false],["translationY","number",false],["rotationZ","number",false]],[["scaleX","number",false],["alpha","number",false],["translationY","number",false],["rotationZ","number",false]],[["scaleY","number",false],["alpha","number",false],["translationY","number",false],["rotationZ","number",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationY","number",false],["rotationZ","number",false]],[["translationX","number",false],["translationY","number",false],["rotationZ","number",false]],[["scaleX","number",false],["translationX","number",false],["translationY","number",false],["rotationZ","number",false]],[["scaleY","number",false],["translationX","number",false],["translationY","number",false],["rotationZ","number",false]],[["scaleX","number",false],["scaleY","number",false],["translationX","number",false],["translationY","number",false],["rotationZ","number",false]],[["alpha","number",false],["translationX","number",false],["translationY","number",false],["rotationZ","number",false]],[["scaleX","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["rotationZ","number",false]],[["scaleY","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["rotationZ","number",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["rotationZ","number",false]],[["shadowElevation","number",false],["rotationZ","number",false]],[["scaleX","number",false],["shadowElevation","number",false],["rotationZ","number",false]],[["scaleY","number",false],["shadowElevation","number",false],["rotationZ","number",false]],[["scaleX","number",false],["scaleY","number",false],["shadowElevation","number",false],["rotationZ","number",false]],[["alpha","number",false],["shadowElevation","number",false],["rotationZ","number",false]],[["scaleX","number",false],["alpha","number",false],["shadowElevation","number",false],["rotationZ","number",false]],[["scaleY","number",false],["alpha","number",false],["shadowElevation","number",false],["rotationZ","number",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["shadowElevation","number",false],["rotationZ","number",false]],[["translationX","number",false],["shadowElevation","number",false],["rotationZ","number",false]],[["scaleX","number",false],["translationX","number",false],["shadowElevation","number",false],["rotationZ","number",false]],[["scaleY","number",false],["translationX","number",false],["shadowElevation","number",false],["rotationZ","number",false]],[["scaleX","number",false],["scaleY","number",false],["translationX","number",false],["shadowElevation","number",false],["rotationZ","number",false]],[["alpha","number",false],["translationX","number",false],["shadowElevation","number",false],["rotationZ","number",false]],[["scaleX","number",false],["alpha","number",false],["translationX","number",false],["shadowElevation","number",false],["rotationZ","number",false]],[["scaleY","number",false],["alpha","number",false],["translationX","number",false],["shadowElevation","number",false],["rotationZ","number",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationX","number",false],["shadowElevation","number",false],["rotationZ","number",false]],[["translationY","number",false],["shadowElevation","number",false],["rotationZ","number",false]],[["scaleX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationZ","number",false]],[["scaleY","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationZ","number",false]],[["scaleX","number",false],["scaleY","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationZ","number",false]],[["alpha","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationZ","number",false]],[["scaleX","number",false],["alpha","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationZ","number",false]],[["scaleY","number",false],["alpha","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationZ","number",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationZ","number",false]],[["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationZ","number",false]],[["scaleX","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationZ","number",false]],[["scaleY","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationZ","number",false]],[["scaleX","number",false],["scaleY","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationZ","number",false]],[["alpha","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationZ","number",false]],[["scaleX","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationZ","number",false]],[["scaleY","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationZ","number",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationZ","number",false]],[["rotationX","number",false],["rotationZ","number",false]],[["scaleX","number",false],["rotationX","number",false],["rotationZ","number",false]],[["scaleY","number",false],["rotationX","number",false],["rotationZ","number",false]],[["scaleX","number",false],["scaleY","number",false],["rotationX","number",false],["rotationZ","number",false]],[["alpha","number",false],["rotationX","number",false],["rotationZ","number",false]],[["scaleX","number",false],["alpha","number",false],["rotationX","number",false],["rotationZ","number",false]],[["scaleY","number",false],["alpha","number",false],["rotationX","number",false],["rotationZ","number",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["rotationX","number",false],["rotationZ","number",false]],[["translationX","number",false],["rotationX","number",false],["rotationZ","number",false]],[["scaleX","number",false],["translationX","number",false],["rotationX","number",false],["rotationZ","number",false]],[["scaleY","number",false],["translationX","number",false],["rotationX","number",false],["rotationZ","number",false]],[["scaleX","number",false],["scaleY","number",false],["translationX","number",false],["rotationX","number",false],["rotationZ","number",false]],[["alpha","number",false],["translationX","number",false],["rotationX","number",false],["rotationZ","number",false]],[["scaleX","number",false],["alpha","number",false],["translationX","number",false],["rotationX","number",false],["rotationZ","number",false]],[["scaleY","number",false],["alpha","number",false],["translationX","number",false],["rotationX","number",false],["rotationZ","number",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationX","number",false],["rotationX","number",false],["rotationZ","number",false]],[["translationY","number",false],["rotationX","number",false],["rotationZ","number",false]],[["scaleX","number",false],["translationY","number",false],["rotationX","number",false],["rotationZ","number",false]],[["scaleY","number",false],["translationY","number",false],["rotationX","number",false],["rotationZ","number",false]],[["scaleX","number",false],["scaleY","number",false],["translationY","number",false],["rotationX","number",false],["rotationZ","number",false]],[["alpha","number",false],["translationY","number",false],["rotationX","number",false],["rotationZ","number",false]],[["scaleX","number",false],["alpha","number",false],["translationY","number",false],["rotationX","number",false],["rotationZ","number",false]],[["scaleY","number",false],["alpha","number",false],["translationY","number",false],["rotationX","number",false],["rotationZ","number",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationY","number",false],["rotationX","number",false],["rotationZ","number",false]],[["translationX","number",false],["translationY","number",false],["rotationX","number",false],["rotationZ","number",false]],[["scaleX","number",false],["translationX","number",false],["translationY","number",false],["rotationX","number",false],["rotationZ","number",false]],[["scaleY","number",false],["translationX","number",false],["translationY","number",false],["rotationX","number",false],["rotationZ","number",false]],[["scaleX","number",false],["scaleY","number",false],["translationX","number",false],["translationY","number",false],["rotationX","number",false],["rotationZ","number",false]],[["alpha","number",false],["translationX","number",false],["translationY","number",false],["rotationX","number",false],["rotationZ","number",false]],[["scaleX","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["rotationX","number",false],["rotationZ","number",false]],[["scaleY","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["rotationX","number",false],["rotationZ","number",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["rotationX","number",false],["rotationZ","number",false]],[["shadowElevation","number",false],["rotationX","number",false],["rotationZ","number",false]],[["scaleX","number",false],["shadowElevation","number",false],["rotationX","number",false],["rotationZ","number",false]],[["scaleY","number",false],["shadowElevation","number",false],["rotationX","number",false],["rotationZ","number",false]],[["scaleX","number",false],["scaleY","number",false],["shadowElevation","number",false],["rotationX","number",false],["rotationZ","number",false]],[["alpha","number",false],["shadowElevation","number",false],["rotationX","number",false],["rotationZ","number",false]],[["scaleX","number",false],["alpha","number",false],["shadowElevation","number",false],["rotationX","number",false],["rotationZ","number",false]],[["scaleY","number",false],["alpha","number",false],["shadowElevation","number",false],["rotationX","number",false],["rotationZ","number",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["shadowElevation","number",false],["rotationX","number",false],["rotationZ","number",false]],[["translationX","number",false],["shadowElevation","number",false],["rotationX","number",false],["rotationZ","number",false]],[["scaleX","number",false],["translationX","number",false],["shadowElevation","number",false],["rotationX","number",false],["rotationZ","number",false]],[["scaleY","number",false],["translationX","number",false],["shadowElevation","number",false],["rotationX","number",false],["rotationZ","number",false]],[["scaleX","number",false],["scaleY","number",false],["translationX","number",false],["shadowElevation","number",false],["rotationX","number",false],["rotationZ","number",false]],[["alpha","number",false],["translationX","number",false],["shadowElevation","number",false],["rotationX","number",false],["rotationZ","number",false]],[["scaleX","number",false],["alpha","number",false],["translationX","number",false],["shadowElevation","number",false],["rotationX","number",false],["rotationZ","number",false]],[["scaleY","number",false],["alpha","number",false],["translationX","number",false],["shadowElevation","number",false],["rotationX","number",false],["rotationZ","number",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationX","number",false],["shadowElevation","number",false],["rotationX","number",false],["rotationZ","number",false]],[["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["rotationZ","number",false]],[["scaleX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["rotationZ","number",false]],[["scaleY","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["rotationZ","number",false]],[["scaleX","number",false],["scaleY","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["rotationZ","number",false]],[["alpha","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["rotationZ","number",false]],[["scaleX","number",false],["alpha","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["rotationZ","number",false]],[["scaleY","number",false],["alpha","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["rotationZ","number",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["rotationZ","number",false]],[["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["rotationZ","number",false]],[["scaleX","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["rotationZ","number",false]],[["scaleY","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["rotationZ","number",false]],[["scaleX","number",false],["scaleY","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["rotationZ","number",false]],[["alpha","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["rotationZ","number",false]],[["scaleX","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["rotationZ","number",false]],[["scaleY","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["rotationZ","number",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["rotationZ","number",false]],[["cameraDistance","number",false]],[["scaleX","number",false],["cameraDistance","number",false]],[["scaleY","number",false],["cameraDistance","number",false]],[["scaleX","number",false],["scaleY","number",false],["cameraDistance","number",false]],[["alpha","number",false],["cameraDistance","number",false]],[["scaleX","number",false],["alpha","number",false],["cameraDistance","number",false]],[["scaleY","number",false],["alpha","number",false],["cameraDistance","number",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["cameraDistance","number",false]],[["translationX","number",false],["cameraDistance","number",false]],[["scaleX","number",false],["translationX","number",false],["cameraDistance","number",false]],[["scaleY","number",false],["translationX","number",false],["cameraDistance","number",false]],[["scaleX","number",false],["scaleY","number",false],["translationX","number",false],["cameraDistance","number",false]],[["alpha","number",false],["translationX","number",false],["cameraDistance","number",false]],[["scaleX","number",false],["alpha","number",false],["translationX","number",false],["cameraDistance","number",false]],[["scaleY","number",false],["alpha","number",false],["translationX","number",false],["cameraDistance","number",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationX","number",false],["cameraDistance","number",false]],[["translationY","number",false],["cameraDistance","number",false]],[["scaleX","number",false],["translationY","number",false],["cameraDistance","number",false]],[["scaleY","number",false],["translationY","number",false],["cameraDistance","number",false]],[["scaleX","number",false],["scaleY","number",false],["translationY","number",false],["cameraDistance","number",false]],[["alpha","number",false],["translationY","number",false],["cameraDistance","number",false]],[["scaleX","number",false],["alpha","number",false],["translationY","number",false],["cameraDistance","number",false]],[["scaleY","number",false],["alpha","number",false],["translationY","number",false],["cameraDistance","number",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationY","number",false],["cameraDistance","number",false]],[["translationX","number",false],["translationY","number",false],["cameraDistance","number",false]],[["scaleX","number",false],["translationX","number",false],["translationY","number",false],["cameraDistance","number",false]],[["scaleY","number",false],["translationX","number",false],["translationY","number",false],["cameraDistance","number",false]],[["scaleX","number",false],["scaleY","number",false],["translationX","number",false],["translationY","number",false],["cameraDistance","number",false]],[["alpha","number",false],["translationX","number",false],["translationY","number",false],["cameraDistance","number",false]],[["scaleX","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["cameraDistance","number",false]],[["scaleY","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["cameraDistance","number",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["cameraDistance","number",false]],[["shadowElevation","number",false],["cameraDistance","number",false]],[["scaleX","number",false],["shadowElevation","number",false],["cameraDistance","number",false]],[["scaleY","number",false],["shadowElevation","number",false],["cameraDistance","number",false]],[["scaleX","number",false],["scaleY","number",false],["shadowElevation","number",false],["cameraDistance","number",false]],[["alpha","number",false],["shadowElevation","number",false],["cameraDistance","number",false]],[["scaleX","number",false],["alpha","number",false],["shadowElevation","number",false],["cameraDistance","number",false]],[["scaleY","number",false],["alpha","number",false],["shadowElevation","number",false],["cameraDistance","number",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["shadowElevation","number",false],["cameraDistance","number",false]],[["translationX","number",false],["shadowElevation","number",false],["cameraDistance","number",false]],[["scaleX","number",false],["translationX","number",false],["shadowElevation","number",false],["cameraDistance","number",false]],[["scaleY","number",false],["translationX","number",false],["shadowElevation","number",false],["cameraDistance","number",false]],[["scaleX","number",false],["scaleY","number",false],["translationX","number",false],["shadowElevation","number",false],["cameraDistance","number",false]],[["alpha","number",false],["translationX","number",false],["shadowElevation","number",false],["cameraDistance","number",false]],[["scaleX","number",false],["alpha","number",false],["translationX","number",false],["shadowElevation","number",false],["cameraDistance","number",false]],[["scaleY","number",false],["alpha","number",false],["translationX","number",false],["shadowElevation","number",false],["cameraDistance","number",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationX","number",false],["shadowElevation","number",false],["cameraDistance","number",false]],[["translationY","number",false],["shadowElevation","number",false],["cameraDistance","number",false]],[["scaleX","number",false],["translationY","number",false],["shadowElevation","number",false],["cameraDistance","number",false]],[["scaleY","number",false],["translationY","number",false],["shadowElevation","number",false],["cameraDistance","number",false]],[["scaleX","number",false],["scaleY","number",false],["translationY","number",false],["shadowElevation","number",false],["cameraDistance","number",false]],[["alpha","number",false],["translationY","number",false],["shadowElevation","number",false],["cameraDistance","number",false]],[["scaleX","number",false],["alpha","number",false],["translationY","number",false],["shadowElevation","number",false],["cameraDistance","number",false]],[["scaleY","number",false],["alpha","number",false],["translationY","number",false],["shadowElevation","number",false],["cameraDistance","number",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationY","number",false],["shadowElevation","number",false],["cameraDistance","number",false]],[["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["cameraDistance","number",false]],[["scaleX","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["cameraDistance","number",false]],[["scaleY","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["cameraDistance","number",false]],[["scaleX","number",false],["scaleY","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["cameraDistance","number",false]],[["alpha","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["cameraDistance","number",false]],[["scaleX","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["cameraDistance","number",false]],[["scaleY","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["cameraDistance","number",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["cameraDistance","number",false]],[["rotationX","number",false],["cameraDistance","number",false]],[["scaleX","number",false],["rotationX","number",false],["cameraDistance","number",false]],[["scaleY","number",false],["rotationX","number",false],["cameraDistance","number",false]],[["scaleX","number",false],["scaleY","number",false],["rotationX","number",false],["cameraDistance","number",false]],[["alpha","number",false],["rotationX","number",false],["cameraDistance","number",false]],[["scaleX","number",false],["alpha","number",false],["rotationX","number",false],["cameraDistance","number",false]],[["scaleY","number",false],["alpha","number",false],["rotationX","number",false],["cameraDistance","number",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["rotationX","number",false],["cameraDistance","number",false]],[["translationX","number",false],["rotationX","number",false],["cameraDistance","number",false]],[["scaleX","number",false],["translationX","number",false],["rotationX","number",false],["cameraDistance","number",false]],[["scaleY","number",false],["translationX","number",false],["rotationX","number",false],["cameraDistance","number",false]],[["scaleX","number",false],["scaleY","number",false],["translationX","number",false],["rotationX","number",false],["cameraDistance","number",false]],[["alpha","number",false],["translationX","number",false],["rotationX","number",false],["cameraDistance","number",false]],[["scaleX","number",false],["alpha","number",false],["translationX","number",false],["rotationX","number",false],["cameraDistance","number",false]],[["scaleY","number",false],["alpha","number",false],["translationX","number",false],["rotationX","number",false],["cameraDistance","number",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationX","number",false],["rotationX","number",false],["cameraDistance","number",false]],[["translationY","number",false],["rotationX","number",false],["cameraDistance","number",false]],[["scaleX","number",false],["translationY","number",false],["rotationX","number",false],["cameraDistance","number",false]],[["scaleY","number",false],["translationY","number",false],["rotationX","number",false],["cameraDistance","number",false]],[["scaleX","number",false],["scaleY","number",false],["translationY","number",false],["rotationX","number",false],["cameraDistance","number",false]],[["alpha","number",false],["translationY","number",false],["rotationX","number",false],["cameraDistance","number",false]],[["scaleX","number",false],["alpha","number",false],["translationY","number",false],["rotationX","number",false],["cameraDistance","number",false]],[["scaleY","number",false],["alpha","number",false],["translationY","number",false],["rotationX","number",false],["cameraDistance","number",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationY","number",false],["rotationX","number",false],["cameraDistance","number",false]],[["translationX","number",false],["translationY","number",false],["rotationX","number",false],["cameraDistance","number",false]],[["scaleX","number",false],["translationX","number",false],["translationY","number",false],["rotationX","number",false],["cameraDistance","number",false]],[["scaleY","number",false],["translationX","number",false],["translationY","number",false],["rotationX","number",false],["cameraDistance","number",false]],[["scaleX","number",false],["scaleY","number",false],["translationX","number",false],["translationY","number",false],["rotationX","number",false],["cameraDistance","number",false]],[["alpha","number",false],["translationX","number",false],["translationY","number",false],["rotationX","number",false],["cameraDistance","number",false]],[["scaleX","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["rotationX","number",false],["cameraDistance","number",false]],[["scaleY","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["rotationX","number",false],["cameraDistance","number",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["rotationX","number",false],["cameraDistance","number",false]],[["shadowElevation","number",false],["rotationX","number",false],["cameraDistance","number",false]],[["scaleX","number",false],["shadowElevation","number",false],["rotationX","number",false],["cameraDistance","number",false]],[["scaleY","number",false],["shadowElevation","number",false],["rotationX","number",false],["cameraDistance","number",false]],[["scaleX","number",false],["scaleY","number",false],["shadowElevation","number",false],["rotationX","number",false],["cameraDistance","number",false]],[["alpha","number",false],["shadowElevation","number",false],["rotationX","number",false],["cameraDistance","number",false]],[["scaleX","number",false],["alpha","number",false],["shadowElevation","number",false],["rotationX","number",false],["cameraDistance","number",false]],[["scaleY","number",false],["alpha","number",false],["shadowElevation","number",false],["rotationX","number",false],["cameraDistance","number",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["shadowElevation","number",false],["rotationX","number",false],["cameraDistance","number",false]],[["translationX","number",false],["shadowElevation","number",false],["rotationX","number",false],["cameraDistance","number",false]],[["scaleX","number",false],["translationX","number",false],["shadowElevation","number",false],["rotationX","number",false],["cameraDistance","number",false]],[["scaleY","number",false],["translationX","number",false],["shadowElevation","number",false],["rotationX","number",false],["cameraDistance","number",false]],[["scaleX","number",false],["scaleY","number",false],["translationX","number",false],["shadowElevation","number",false],["rotationX","number",false],["cameraDistance","number",false]],[["alpha","number",false],["translationX","number",false],["shadowElevation","number",false],["rotationX","number",false],["cameraDistance","number",false]],[["scaleX","number",false],["alpha","number",false],["translationX","number",false],["shadowElevation","number",false],["rotationX","number",false],["cameraDistance","number",false]],[["scaleY","number",false],["alpha","number",false],["translationX","number",false],["shadowElevation","number",false],["rotationX","number",false],["cameraDistance","number",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationX","number",false],["shadowElevation","number",false],["rotationX","number",false],["cameraDistance","number",false]],[["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["cameraDistance","number",false]],[["scaleX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["cameraDistance","number",false]],[["scaleY","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["cameraDistance","number",false]],[["scaleX","number",false],["scaleY","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["cameraDistance","number",false]],[["alpha","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["cameraDistance","number",false]],[["scaleX","number",false],["alpha","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["cameraDistance","number",false]],[["scaleY","number",false],["alpha","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["cameraDistance","number",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["cameraDistance","number",false]],[["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["cameraDistance","number",false]],[["scaleX","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["cameraDistance","number",false]],[["scaleY","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["cameraDistance","number",false]],[["scaleX","number",false],["scaleY","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["cameraDistance","number",false]],[["alpha","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["cameraDistance","number",false]],[["scaleX","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["cameraDistance","number",false]],[["scaleY","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["cameraDistance","number",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["cameraDistance","number",false]],[["transformOrigin","object",false]],[["scaleX","number",false],["transformOrigin","object",false]],[["scaleY","number",false],["transformOrigin","object",false]],[["scaleX","number",false],["scaleY","number",false],["transformOrigin","object",false]],[["alpha","number",false],["transformOrigin","object",false]],[["scaleX","number",false],["alpha","number",false],["transformOrigin","object",false]],[["scaleY","number",false],["alpha","number",false],["transformOrigin","object",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["transformOrigin","object",false]],[["translationX","number",false],["transformOrigin","object",false]],[["scaleX","number",false],["translationX","number",false],["transformOrigin","object",false]],[["scaleY","number",false],["translationX","number",false],["transformOrigin","object",false]],[["scaleX","number",false],["scaleY","number",false],["translationX","number",false],["transformOrigin","object",false]],[["alpha","number",false],["translationX","number",false],["transformOrigin","object",false]],[["scaleX","number",false],["alpha","number",false],["translationX","number",false],["transformOrigin","object",false]],[["scaleY","number",false],["alpha","number",false],["translationX","number",false],["transformOrigin","object",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationX","number",false],["transformOrigin","object",false]],[["translationY","number",false],["transformOrigin","object",false]],[["scaleX","number",false],["translationY","number",false],["transformOrigin","object",false]],[["scaleY","number",false],["translationY","number",false],["transformOrigin","object",false]],[["scaleX","number",false],["scaleY","number",false],["translationY","number",false],["transformOrigin","object",false]],[["alpha","number",false],["translationY","number",false],["transformOrigin","object",false]],[["scaleX","number",false],["alpha","number",false],["translationY","number",false],["transformOrigin","object",false]],[["scaleY","number",false],["alpha","number",false],["translationY","number",false],["transformOrigin","object",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationY","number",false],["transformOrigin","object",false]],[["translationX","number",false],["translationY","number",false],["transformOrigin","object",false]],[["scaleX","number",false],["translationX","number",false],["translationY","number",false],["transformOrigin","object",false]],[["scaleY","number",false],["translationX","number",false],["translationY","number",false],["transformOrigin","object",false]],[["scaleX","number",false],["scaleY","number",false],["translationX","number",false],["translationY","number",false],["transformOrigin","object",false]],[["alpha","number",false],["translationX","number",false],["translationY","number",false],["transformOrigin","object",false]],[["scaleX","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["transformOrigin","object",false]],[["scaleY","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["transformOrigin","object",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["transformOrigin","object",false]],[["shadowElevation","number",false],["transformOrigin","object",false]],[["scaleX","number",false],["shadowElevation","number",false],["transformOrigin","object",false]],[["scaleY","number",false],["shadowElevation","number",false],["transformOrigin","object",false]],[["scaleX","number",false],["scaleY","number",false],["shadowElevation","number",false],["transformOrigin","object",false]],[["alpha","number",false],["shadowElevation","number",false],["transformOrigin","object",false]],[["scaleX","number",false],["alpha","number",false],["shadowElevation","number",false],["transformOrigin","object",false]],[["scaleY","number",false],["alpha","number",false],["shadowElevation","number",false],["transformOrigin","object",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["shadowElevation","number",false],["transformOrigin","object",false]],[["translationX","number",false],["shadowElevation","number",false],["transformOrigin","object",false]],[["scaleX","number",false],["translationX","number",false],["shadowElevation","number",false],["transformOrigin","object",false]],[["scaleY","number",false],["translationX","number",false],["shadowElevation","number",false],["transformOrigin","object",false]],[["scaleX","number",false],["scaleY","number",false],["translationX","number",false],["shadowElevation","number",false],["transformOrigin","object",false]],[["alpha","number",false],["translationX","number",false],["shadowElevation","number",false],["transformOrigin","object",false]],[["scaleX","number",false],["alpha","number",false],["translationX","number",false],["shadowElevation","number",false],["transformOrigin","object",false]],[["scaleY","number",false],["alpha","number",false],["translationX","number",false],["shadowElevation","number",false],["transformOrigin","object",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationX","number",false],["shadowElevation","number",false],["transformOrigin","object",false]],[["translationY","number",false],["shadowElevation","number",false],["transformOrigin","object",false]],[["scaleX","number",false],["translationY","number",false],["shadowElevation","number",false],["transformOrigin","object",false]],[["scaleY","number",false],["translationY","number",false],["shadowElevation","number",false],["transformOrigin","object",false]],[["scaleX","number",false],["scaleY","number",false],["translationY","number",false],["shadowElevation","number",false],["transformOrigin","object",false]],[["alpha","number",false],["translationY","number",false],["shadowElevation","number",false],["transformOrigin","object",false]],[["scaleX","number",false],["alpha","number",false],["translationY","number",false],["shadowElevation","number",false],["transformOrigin","object",false]],[["scaleY","number",false],["alpha","number",false],["translationY","number",false],["shadowElevation","number",false],["transformOrigin","object",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationY","number",false],["shadowElevation","number",false],["transformOrigin","object",false]],[["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["transformOrigin","object",false]],[["scaleX","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["transformOrigin","object",false]],[["scaleY","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["transformOrigin","object",false]],[["scaleX","number",false],["scaleY","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["transformOrigin","object",false]],[["alpha","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["transformOrigin","object",false]],[["scaleX","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["transformOrigin","object",false]],[["scaleY","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["transformOrigin","object",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["transformOrigin","object",false]],[["shape","shape",false]],[["scaleX","number",false],["shape","shape",false]],[["scaleY","number",false],["shape","shape",false]],[["scaleX","number",false],["scaleY","number",false],["shape","shape",false]],[["alpha","number",false],["shape","shape",false]],[["scaleX","number",false],["alpha","number",false],["shape","shape",false]],[["scaleY","number",false],["alpha","number",false],["shape","shape",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["shape","shape",false]],[["translationX","number",false],["shape","shape",false]],[["scaleX","number",false],["translationX","number",false],["shape","shape",false]],[["scaleY","number",false],["translationX","number",false],["shape","shape",false]],[["scaleX","number",false],["scaleY","number",false],["translationX","number",false],["shape","shape",false]],[["alpha","number",false],["translationX","number",false],["shape","shape",false]],[["scaleX","number",false],["alpha","number",false],["translationX","number",false],["shape","shape",false]],[["scaleY","number",false],["alpha","number",false],["translationX","number",false],["shape","shape",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationX","number",false],["shape","shape",false]],[["translationY","number",false],["shape","shape",false]],[["scaleX","number",false],["translationY","number",false],["shape","shape",false]],[["scaleY","number",false],["translationY","number",false],["shape","shape",false]],[["scaleX","number",false],["scaleY","number",false],["translationY","number",false],["shape","shape",false]],[["alpha","number",false],["translationY","number",false],["shape","shape",false]],[["scaleX","number",false],["alpha","number",false],["translationY","number",false],["shape","shape",false]],[["scaleY","number",false],["alpha","number",false],["translationY","number",false],["shape","shape",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationY","number",false],["shape","shape",false]],[["translationX","number",false],["translationY","number",false],["shape","shape",false]],[["scaleX","number",false],["translationX","number",false],["translationY","number",false],["shape","shape",false]],[["scaleY","number",false],["translationX","number",false],["translationY","number",false],["shape","shape",false]],[["scaleX","number",false],["scaleY","number",false],["translationX","number",false],["translationY","number",false],["shape","shape",false]],[["alpha","number",false],["translationX","number",false],["translationY","number",false],["shape","shape",false]],[["scaleX","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["shape","shape",false]],[["scaleY","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["shape","shape",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["shape","shape",false]],[["shadowElevation","number",false],["shape","shape",false]],[["scaleX","number",false],["shadowElevation","number",false],["shape","shape",false]],[["scaleY","number",false],["shadowElevation","number",false],["shape","shape",false]],[["scaleX","number",false],["scaleY","number",false],["shadowElevation","number",false],["shape","shape",false]],[["alpha","number",false],["shadowElevation","number",false],["shape","shape",false]],[["scaleX","number",false],["alpha","number",false],["shadowElevation","number",false],["shape","shape",false]],[["scaleY","number",false],["alpha","number",false],["shadowElevation","number",false],["shape","shape",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["shadowElevation","number",false],["shape","shape",false]],[["translationX","number",false],["shadowElevation","number",false],["shape","shape",false]],[["scaleX","number",false],["translationX","number",false],["shadowElevation","number",false],["shape","shape",false]],[["scaleY","number",false],["translationX","number",false],["shadowElevation","number",false],["shape","shape",false]],[["scaleX","number",false],["scaleY","number",false],["translationX","number",false],["shadowElevation","number",false],["shape","shape",false]],[["alpha","number",false],["translationX","number",false],["shadowElevation","number",false],["shape","shape",false]],[["scaleX","number",false],["alpha","number",false],["translationX","number",false],["shadowElevation","number",false],["shape","shape",false]],[["scaleY","number",false],["alpha","number",false],["translationX","number",false],["shadowElevation","number",false],["shape","shape",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationX","number",false],["shadowElevation","number",false],["shape","shape",false]],[["translationY","number",false],["shadowElevation","number",false],["shape","shape",false]],[["scaleX","number",false],["translationY","number",false],["shadowElevation","number",false],["shape","shape",false]],[["scaleY","number",false],["translationY","number",false],["shadowElevation","number",false],["shape","shape",false]],[["scaleX","number",false],["scaleY","number",false],["translationY","number",false],["shadowElevation","number",false],["shape","shape",false]],[["alpha","number",false],["translationY","number",false],["shadowElevation","number",false],["shape","shape",false]],[["scaleX","number",false],["alpha","number",false],["translationY","number",false],["shadowElevation","number",false],["shape","shape",false]],[["scaleY","number",false],["alpha","number",false],["translationY","number",false],["shadowElevation","number",false],["shape","shape",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationY","number",false],["shadowElevation","number",false],["shape","shape",false]],[["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["shape","shape",false]],[["scaleX","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["shape","shape",false]],[["scaleY","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["shape","shape",false]],[["scaleX","number",false],["scaleY","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["shape","shape",false]],[["alpha","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["shape","shape",false]],[["scaleX","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["shape","shape",false]],[["scaleY","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["shape","shape",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["shape","shape",false]],[["rotationX","number",false],["shape","shape",false]],[["scaleX","number",false],["rotationX","number",false],["shape","shape",false]],[["scaleY","number",false],["rotationX","number",false],["shape","shape",false]],[["scaleX","number",false],["scaleY","number",false],["rotationX","number",false],["shape","shape",false]],[["alpha","number",false],["rotationX","number",false],["shape","shape",false]],[["scaleX","number",false],["alpha","number",false],["rotationX","number",false],["shape","shape",false]],[["scaleY","number",false],["alpha","number",false],["rotationX","number",false],["shape","shape",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["rotationX","number",false],["shape","shape",false]],[["translationX","number",false],["rotationX","number",false],["shape","shape",false]],[["scaleX","number",false],["translationX","number",false],["rotationX","number",false],["shape","shape",false]],[["scaleY","number",false],["translationX","number",false],["rotationX","number",false],["shape","shape",false]],[["scaleX","number",false],["scaleY","number",false],["translationX","number",false],["rotationX","number",false],["shape","shape",false]],[["alpha","number",false],["translationX","number",false],["rotationX","number",false],["shape","shape",false]],[["scaleX","number",false],["alpha","number",false],["translationX","number",false],["rotationX","number",false],["shape","shape",false]],[["scaleY","number",false],["alpha","number",false],["translationX","number",false],["rotationX","number",false],["shape","shape",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationX","number",false],["rotationX","number",false],["shape","shape",false]],[["translationY","number",false],["rotationX","number",false],["shape","shape",false]],[["scaleX","number",false],["translationY","number",false],["rotationX","number",false],["shape","shape",false]],[["scaleY","number",false],["translationY","number",false],["rotationX","number",false],["shape","shape",false]],[["scaleX","number",false],["scaleY","number",false],["translationY","number",false],["rotationX","number",false],["shape","shape",false]],[["alpha","number",false],["translationY","number",false],["rotationX","number",false],["shape","shape",false]],[["scaleX","number",false],["alpha","number",false],["translationY","number",false],["rotationX","number",false],["shape","shape",false]],[["scaleY","number",false],["alpha","number",false],["translationY","number",false],["rotationX","number",false],["shape","shape",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationY","number",false],["rotationX","number",false],["shape","shape",false]],[["translationX","number",false],["translationY","number",false],["rotationX","number",false],["shape","shape",false]],[["scaleX","number",false],["translationX","number",false],["translationY","number",false],["rotationX","number",false],["shape","shape",false]],[["scaleY","number",false],["translationX","number",false],["translationY","number",false],["rotationX","number",false],["shape","shape",false]],[["scaleX","number",false],["scaleY","number",false],["translationX","number",false],["translationY","number",false],["rotationX","number",false],["shape","shape",false]],[["alpha","number",false],["translationX","number",false],["translationY","number",false],["rotationX","number",false],["shape","shape",false]],[["scaleX","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["rotationX","number",false],["shape","shape",false]],[["scaleY","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["rotationX","number",false],["shape","shape",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["rotationX","number",false],["shape","shape",false]],[["shadowElevation","number",false],["rotationX","number",false],["shape","shape",false]],[["scaleX","number",false],["shadowElevation","number",false],["rotationX","number",false],["shape","shape",false]],[["scaleY","number",false],["shadowElevation","number",false],["rotationX","number",false],["shape","shape",false]],[["scaleX","number",false],["scaleY","number",false],["shadowElevation","number",false],["rotationX","number",false],["shape","shape",false]],[["alpha","number",false],["shadowElevation","number",false],["rotationX","number",false],["shape","shape",false]],[["scaleX","number",false],["alpha","number",false],["shadowElevation","number",false],["rotationX","number",false],["shape","shape",false]],[["scaleY","number",false],["alpha","number",false],["shadowElevation","number",false],["rotationX","number",false],["shape","shape",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["shadowElevation","number",false],["rotationX","number",false],["shape","shape",false]],[["translationX","number",false],["shadowElevation","number",false],["rotationX","number",false],["shape","shape",false]],[["scaleX","number",false],["translationX","number",false],["shadowElevation","number",false],["rotationX","number",false],["shape","shape",false]],[["scaleY","number",false],["translationX","number",false],["shadowElevation","number",false],["rotationX","number",false],["shape","shape",false]],[["scaleX","number",false],["scaleY","number",false],["translationX","number",false],["shadowElevation","number",false],["rotationX","number",false],["shape","shape",false]],[["alpha","number",false],["translationX","number",false],["shadowElevation","number",false],["rotationX","number",false],["shape","shape",false]],[["scaleX","number",false],["alpha","number",false],["translationX","number",false],["shadowElevation","number",false],["rotationX","number",false],["shape","shape",false]],[["scaleY","number",false],["alpha","number",false],["translationX","number",false],["shadowElevation","number",false],["rotationX","number",false],["shape","shape",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationX","number",false],["shadowElevation","number",false],["rotationX","number",false],["shape","shape",false]],[["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["shape","shape",false]],[["scaleX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["shape","shape",false]],[["scaleY","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["shape","shape",false]],[["scaleX","number",false],["scaleY","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["shape","shape",false]],[["alpha","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["shape","shape",false]],[["scaleX","number",false],["alpha","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["shape","shape",false]],[["scaleY","number",false],["alpha","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["shape","shape",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["shape","shape",false]],[["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["shape","shape",false]],[["scaleX","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["shape","shape",false]],[["scaleY","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["shape","shape",false]],[["scaleX","number",false],["scaleY","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["shape","shape",false]],[["alpha","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["shape","shape",false]],[["scaleX","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["shape","shape",false]],[["scaleY","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["shape","shape",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["shape","shape",false]],[["clip","boolean",false]],[["scaleX","number",false],["clip","boolean",false]],[["scaleY","number",false],["clip","boolean",false]],[["scaleX","number",false],["scaleY","number",false],["clip","boolean",false]],[["alpha","number",false],["clip","boolean",false]],[["scaleX","number",false],["alpha","number",false],["clip","boolean",false]],[["scaleY","number",false],["alpha","number",false],["clip","boolean",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["clip","boolean",false]],[["translationX","number",false],["clip","boolean",false]],[["scaleX","number",false],["translationX","number",false],["clip","boolean",false]],[["scaleY","number",false],["translationX","number",false],["clip","boolean",false]],[["scaleX","number",false],["scaleY","number",false],["translationX","number",false],["clip","boolean",false]],[["alpha","number",false],["translationX","number",false],["clip","boolean",false]],[["scaleX","number",false],["alpha","number",false],["translationX","number",false],["clip","boolean",false]],[["scaleY","number",false],["alpha","number",false],["translationX","number",false],["clip","boolean",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationX","number",false],["clip","boolean",false]],[["translationY","number",false],["clip","boolean",false]],[["scaleX","number",false],["translationY","number",false],["clip","boolean",false]],[["scaleY","number",false],["translationY","number",false],["clip","boolean",false]],[["scaleX","number",false],["scaleY","number",false],["translationY","number",false],["clip","boolean",false]],[["alpha","number",false],["translationY","number",false],["clip","boolean",false]],[["scaleX","number",false],["alpha","number",false],["translationY","number",false],["clip","boolean",false]],[["scaleY","number",false],["alpha","number",false],["translationY","number",false],["clip","boolean",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationY","number",false],["clip","boolean",false]],[["translationX","number",false],["translationY","number",false],["clip","boolean",false]],[["scaleX","number",false],["translationX","number",false],["translationY","number",false],["clip","boolean",false]],[["scaleY","number",false],["translationX","number",false],["translationY","number",false],["clip","boolean",false]],[["scaleX","number",false],["scaleY","number",false],["translationX","number",false],["translationY","number",false],["clip","boolean",false]],[["alpha","number",false],["translationX","number",false],["translationY","number",false],["clip","boolean",false]],[["scaleX","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["clip","boolean",false]],[["scaleY","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["clip","boolean",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["clip","boolean",false]],[["shadowElevation","number",false],["clip","boolean",false]],[["scaleX","number",false],["shadowElevation","number",false],["clip","boolean",false]],[["scaleY","number",false],["shadowElevation","number",false],["clip","boolean",false]],[["scaleX","number",false],["scaleY","number",false],["shadowElevation","number",false],["clip","boolean",false]],[["alpha","number",false],["shadowElevation","number",false],["clip","boolean",false]],[["scaleX","number",false],["alpha","number",false],["shadowElevation","number",false],["clip","boolean",false]],[["scaleY","number",false],["alpha","number",false],["shadowElevation","number",false],["clip","boolean",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["shadowElevation","number",false],["clip","boolean",false]],[["translationX","number",false],["shadowElevation","number",false],["clip","boolean",false]],[["scaleX","number",false],["translationX","number",false],["shadowElevation","number",false],["clip","boolean",false]],[["scaleY","number",false],["translationX","number",false],["shadowElevation","number",false],["clip","boolean",false]],[["scaleX","number",false],["scaleY","number",false],["translationX","number",false],["shadowElevation","number",false],["clip","boolean",false]],[["alpha","number",false],["translationX","number",false],["shadowElevation","number",false],["clip","boolean",false]],[["scaleX","number",false],["alpha","number",false],["translationX","number",false],["shadowElevation","number",false],["clip","boolean",false]],[["scaleY","number",false],["alpha","number",false],["translationX","number",false],["shadowElevation","number",false],["clip","boolean",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationX","number",false],["shadowElevation","number",false],["clip","boolean",false]],[["translationY","number",false],["shadowElevation","number",false],["clip","boolean",false]],[["scaleX","number",false],["translationY","number",false],["shadowElevation","number",false],["clip","boolean",false]],[["scaleY","number",false],["translationY","number",false],["shadowElevation","number",false],["clip","boolean",false]],[["scaleX","number",false],["scaleY","number",false],["translationY","number",false],["shadowElevation","number",false],["clip","boolean",false]],[["alpha","number",false],["translationY","number",false],["shadowElevation","number",false],["clip","boolean",false]],[["scaleX","number",false],["alpha","number",false],["translationY","number",false],["shadowElevation","number",false],["clip","boolean",false]],[["scaleY","number",false],["alpha","number",false],["translationY","number",false],["shadowElevation","number",false],["clip","boolean",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationY","number",false],["shadowElevation","number",false],["clip","boolean",false]],[["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["clip","boolean",false]],[["scaleX","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["clip","boolean",false]],[["scaleY","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["clip","boolean",false]],[["scaleX","number",false],["scaleY","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["clip","boolean",false]],[["alpha","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["clip","boolean",false]],[["scaleX","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["clip","boolean",false]],[["scaleY","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["clip","boolean",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["clip","boolean",false]],[["rotationX","number",false],["clip","boolean",false]],[["scaleX","number",false],["rotationX","number",false],["clip","boolean",false]],[["scaleY","number",false],["rotationX","number",false],["clip","boolean",false]],[["scaleX","number",false],["scaleY","number",false],["rotationX","number",false],["clip","boolean",false]],[["alpha","number",false],["rotationX","number",false],["clip","boolean",false]],[["scaleX","number",false],["alpha","number",false],["rotationX","number",false],["clip","boolean",false]],[["scaleY","number",false],["alpha","number",false],["rotationX","number",false],["clip","boolean",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["rotationX","number",false],["clip","boolean",false]],[["translationX","number",false],["rotationX","number",false],["clip","boolean",false]],[["scaleX","number",false],["translationX","number",false],["rotationX","number",false],["clip","boolean",false]],[["scaleY","number",false],["translationX","number",false],["rotationX","number",false],["clip","boolean",false]],[["scaleX","number",false],["scaleY","number",false],["translationX","number",false],["rotationX","number",false],["clip","boolean",false]],[["alpha","number",false],["translationX","number",false],["rotationX","number",false],["clip","boolean",false]],[["scaleX","number",false],["alpha","number",false],["translationX","number",false],["rotationX","number",false],["clip","boolean",false]],[["scaleY","number",false],["alpha","number",false],["translationX","number",false],["rotationX","number",false],["clip","boolean",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationX","number",false],["rotationX","number",false],["clip","boolean",false]],[["translationY","number",false],["rotationX","number",false],["clip","boolean",false]],[["scaleX","number",false],["translationY","number",false],["rotationX","number",false],["clip","boolean",false]],[["scaleY","number",false],["translationY","number",false],["rotationX","number",false],["clip","boolean",false]],[["scaleX","number",false],["scaleY","number",false],["translationY","number",false],["rotationX","number",false],["clip","boolean",false]],[["alpha","number",false],["translationY","number",false],["rotationX","number",false],["clip","boolean",false]],[["scaleX","number",false],["alpha","number",false],["translationY","number",false],["rotationX","number",false],["clip","boolean",false]],[["scaleY","number",false],["alpha","number",false],["translationY","number",false],["rotationX","number",false],["clip","boolean",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationY","number",false],["rotationX","number",false],["clip","boolean",false]],[["translationX","number",false],["translationY","number",false],["rotationX","number",false],["clip","boolean",false]],[["scaleX","number",false],["translationX","number",false],["translationY","number",false],["rotationX","number",false],["clip","boolean",false]],[["scaleY","number",false],["translationX","number",false],["translationY","number",false],["rotationX","number",false],["clip","boolean",false]],[["scaleX","number",false],["scaleY","number",false],["translationX","number",false],["translationY","number",false],["rotationX","number",false],["clip","boolean",false]],[["alpha","number",false],["translationX","number",false],["translationY","number",false],["rotationX","number",false],["clip","boolean",false]],[["scaleX","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["rotationX","number",false],["clip","boolean",false]],[["scaleY","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["rotationX","number",false],["clip","boolean",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["rotationX","number",false],["clip","boolean",false]],[["shadowElevation","number",false],["rotationX","number",false],["clip","boolean",false]],[["scaleX","number",false],["shadowElevation","number",false],["rotationX","number",false],["clip","boolean",false]],[["scaleY","number",false],["shadowElevation","number",false],["rotationX","number",false],["clip","boolean",false]],[["scaleX","number",false],["scaleY","number",false],["shadowElevation","number",false],["rotationX","number",false],["clip","boolean",false]],[["alpha","number",false],["shadowElevation","number",false],["rotationX","number",false],["clip","boolean",false]],[["scaleX","number",false],["alpha","number",false],["shadowElevation","number",false],["rotationX","number",false],["clip","boolean",false]],[["scaleY","number",false],["alpha","number",false],["shadowElevation","number",false],["rotationX","number",false],["clip","boolean",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["shadowElevation","number",false],["rotationX","number",false],["clip","boolean",false]],[["translationX","number",false],["shadowElevation","number",false],["rotationX","number",false],["clip","boolean",false]],[["scaleX","number",false],["translationX","number",false],["shadowElevation","number",false],["rotationX","number",false],["clip","boolean",false]],[["scaleY","number",false],["translationX","number",false],["shadowElevation","number",false],["rotationX","number",false],["clip","boolean",false]],[["scaleX","number",false],["scaleY","number",false],["translationX","number",false],["shadowElevation","number",false],["rotationX","number",false],["clip","boolean",false]],[["alpha","number",false],["translationX","number",false],["shadowElevation","number",false],["rotationX","number",false],["clip","boolean",false]],[["scaleX","number",false],["alpha","number",false],["translationX","number",false],["shadowElevation","number",false],["rotationX","number",false],["clip","boolean",false]],[["scaleY","number",false],["alpha","number",false],["translationX","number",false],["shadowElevation","number",false],["rotationX","number",false],["clip","boolean",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationX","number",false],["shadowElevation","number",false],["rotationX","number",false],["clip","boolean",false]],[["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["clip","boolean",false]],[["scaleX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["clip","boolean",false]],[["scaleY","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["clip","boolean",false]],[["scaleX","number",false],["scaleY","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["clip","boolean",false]],[["alpha","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["clip","boolean",false]],[["scaleX","number",false],["alpha","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["clip","boolean",false]],[["scaleY","number",false],["alpha","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["clip","boolean",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["clip","boolean",false]],[["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["clip","boolean",false]],[["scaleX","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["clip","boolean",false]],[["scaleY","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["clip","boolean",false]],[["scaleX","number",false],["scaleY","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["clip","boolean",false]],[["alpha","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["clip","boolean",false]],[["scaleX","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["clip","boolean",false]],[["scaleY","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["clip","boolean",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["clip","boolean",false]],[["ambientShadowColor","string",false]],[["scaleX","number",false],["ambientShadowColor","string",false]],[["scaleY","number",false],["ambientShadowColor","string",false]],[["scaleX","number",false],["scaleY","number",false],["ambientShadowColor","string",false]],[["alpha","number",false],["ambientShadowColor","string",false]],[["scaleX","number",false],["alpha","number",false],["ambientShadowColor","string",false]],[["scaleY","number",false],["alpha","number",false],["ambientShadowColor","string",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["ambientShadowColor","string",false]],[["translationX","number",false],["ambientShadowColor","string",false]],[["scaleX","number",false],["translationX","number",false],["ambientShadowColor","string",false]],[["scaleY","number",false],["translationX","number",false],["ambientShadowColor","string",false]],[["scaleX","number",false],["scaleY","number",false],["translationX","number",false],["ambientShadowColor","string",false]],[["alpha","number",false],["translationX","number",false],["ambientShadowColor","string",false]],[["scaleX","number",false],["alpha","number",false],["translationX","number",false],["ambientShadowColor","string",false]],[["scaleY","number",false],["alpha","number",false],["translationX","number",false],["ambientShadowColor","string",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationX","number",false],["ambientShadowColor","string",false]],[["translationY","number",false],["ambientShadowColor","string",false]],[["scaleX","number",false],["translationY","number",false],["ambientShadowColor","string",false]],[["scaleY","number",false],["translationY","number",false],["ambientShadowColor","string",false]],[["scaleX","number",false],["scaleY","number",false],["translationY","number",false],["ambientShadowColor","string",false]],[["alpha","number",false],["translationY","number",false],["ambientShadowColor","string",false]],[["scaleX","number",false],["alpha","number",false],["translationY","number",false],["ambientShadowColor","string",false]],[["scaleY","number",false],["alpha","number",false],["translationY","number",false],["ambientShadowColor","string",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationY","number",false],["ambientShadowColor","string",false]],[["translationX","number",false],["translationY","number",false],["ambientShadowColor","string",false]],[["scaleX","number",false],["translationX","number",false],["translationY","number",false],["ambientShadowColor","string",false]],[["scaleY","number",false],["translationX","number",false],["translationY","number",false],["ambientShadowColor","string",false]],[["scaleX","number",false],["scaleY","number",false],["translationX","number",false],["translationY","number",false],["ambientShadowColor","string",false]],[["alpha","number",false],["translationX","number",false],["translationY","number",false],["ambientShadowColor","string",false]],[["scaleX","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["ambientShadowColor","string",false]],[["scaleY","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["ambientShadowColor","string",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["ambientShadowColor","string",false]],[["shadowElevation","number",false],["ambientShadowColor","string",false]],[["scaleX","number",false],["shadowElevation","number",false],["ambientShadowColor","string",false]],[["scaleY","number",false],["shadowElevation","number",false],["ambientShadowColor","string",false]],[["scaleX","number",false],["scaleY","number",false],["shadowElevation","number",false],["ambientShadowColor","string",false]],[["alpha","number",false],["shadowElevation","number",false],["ambientShadowColor","string",false]],[["scaleX","number",false],["alpha","number",false],["shadowElevation","number",false],["ambientShadowColor","string",false]],[["scaleY","number",false],["alpha","number",false],["shadowElevation","number",false],["ambientShadowColor","string",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["shadowElevation","number",false],["ambientShadowColor","string",false]],[["translationX","number",false],["shadowElevation","number",false],["ambientShadowColor","string",false]],[["scaleX","number",false],["translationX","number",false],["shadowElevation","number",false],["ambientShadowColor","string",false]],[["scaleY","number",false],["translationX","number",false],["shadowElevation","number",false],["ambientShadowColor","string",false]],[["scaleX","number",false],["scaleY","number",false],["translationX","number",false],["shadowElevation","number",false],["ambientShadowColor","string",false]],[["alpha","number",false],["translationX","number",false],["shadowElevation","number",false],["ambientShadowColor","string",false]],[["scaleX","number",false],["alpha","number",false],["translationX","number",false],["shadowElevation","number",false],["ambientShadowColor","string",false]],[["scaleY","number",false],["alpha","number",false],["translationX","number",false],["shadowElevation","number",false],["ambientShadowColor","string",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationX","number",false],["shadowElevation","number",false],["ambientShadowColor","string",false]],[["translationY","number",false],["shadowElevation","number",false],["ambientShadowColor","string",false]],[["scaleX","number",false],["translationY","number",false],["shadowElevation","number",false],["ambientShadowColor","string",false]],[["scaleY","number",false],["translationY","number",false],["shadowElevation","number",false],["ambientShadowColor","string",false]],[["scaleX","number",false],["scaleY","number",false],["translationY","number",false],["shadowElevation","number",false],["ambientShadowColor","string",false]],[["alpha","number",false],["translationY","number",false],["shadowElevation","number",false],["ambientShadowColor","string",false]],[["scaleX","number",false],["alpha","number",false],["translationY","number",false],["shadowElevation","number",false],["ambientShadowColor","string",false]],[["scaleY","number",false],["alpha","number",false],["translationY","number",false],["shadowElevation","number",false],["ambientShadowColor","string",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationY","number",false],["shadowElevation","number",false],["ambientShadowColor","string",false]],[["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["ambientShadowColor","string",false]],[["scaleX","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["ambientShadowColor","string",false]],[["scaleY","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["ambientShadowColor","string",false]],[["scaleX","number",false],["scaleY","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["ambientShadowColor","string",false]],[["alpha","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["ambientShadowColor","string",false]],[["scaleX","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["ambientShadowColor","string",false]],[["scaleY","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["ambientShadowColor","string",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["ambientShadowColor","string",false]],[["rotationX","number",false],["ambientShadowColor","string",false]],[["scaleX","number",false],["rotationX","number",false],["ambientShadowColor","string",false]],[["scaleY","number",false],["rotationX","number",false],["ambientShadowColor","string",false]],[["scaleX","number",false],["scaleY","number",false],["rotationX","number",false],["ambientShadowColor","string",false]],[["alpha","number",false],["rotationX","number",false],["ambientShadowColor","string",false]],[["scaleX","number",false],["alpha","number",false],["rotationX","number",false],["ambientShadowColor","string",false]],[["scaleY","number",false],["alpha","number",false],["rotationX","number",false],["ambientShadowColor","string",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["rotationX","number",false],["ambientShadowColor","string",false]],[["translationX","number",false],["rotationX","number",false],["ambientShadowColor","string",false]],[["scaleX","number",false],["translationX","number",false],["rotationX","number",false],["ambientShadowColor","string",false]],[["scaleY","number",false],["translationX","number",false],["rotationX","number",false],["ambientShadowColor","string",false]],[["scaleX","number",false],["scaleY","number",false],["translationX","number",false],["rotationX","number",false],["ambientShadowColor","string",false]],[["alpha","number",false],["translationX","number",false],["rotationX","number",false],["ambientShadowColor","string",false]],[["scaleX","number",false],["alpha","number",false],["translationX","number",false],["rotationX","number",false],["ambientShadowColor","string",false]],[["scaleY","number",false],["alpha","number",false],["translationX","number",false],["rotationX","number",false],["ambientShadowColor","string",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationX","number",false],["rotationX","number",false],["ambientShadowColor","string",false]],[["translationY","number",false],["rotationX","number",false],["ambientShadowColor","string",false]],[["scaleX","number",false],["translationY","number",false],["rotationX","number",false],["ambientShadowColor","string",false]],[["scaleY","number",false],["translationY","number",false],["rotationX","number",false],["ambientShadowColor","string",false]],[["scaleX","number",false],["scaleY","number",false],["translationY","number",false],["rotationX","number",false],["ambientShadowColor","string",false]],[["alpha","number",false],["translationY","number",false],["rotationX","number",false],["ambientShadowColor","string",false]],[["scaleX","number",false],["alpha","number",false],["translationY","number",false],["rotationX","number",false],["ambientShadowColor","string",false]],[["scaleY","number",false],["alpha","number",false],["translationY","number",false],["rotationX","number",false],["ambientShadowColor","string",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationY","number",false],["rotationX","number",false],["ambientShadowColor","string",false]],[["translationX","number",false],["translationY","number",false],["rotationX","number",false],["ambientShadowColor","string",false]],[["scaleX","number",false],["translationX","number",false],["translationY","number",false],["rotationX","number",false],["ambientShadowColor","string",false]],[["scaleY","number",false],["translationX","number",false],["translationY","number",false],["rotationX","number",false],["ambientShadowColor","string",false]],[["scaleX","number",false],["scaleY","number",false],["translationX","number",false],["translationY","number",false],["rotationX","number",false],["ambientShadowColor","string",false]],[["alpha","number",false],["translationX","number",false],["translationY","number",false],["rotationX","number",false],["ambientShadowColor","string",false]],[["scaleX","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["rotationX","number",false],["ambientShadowColor","string",false]],[["scaleY","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["rotationX","number",false],["ambientShadowColor","string",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["rotationX","number",false],["ambientShadowColor","string",false]],[["shadowElevation","number",false],["rotationX","number",false],["ambientShadowColor","string",false]],[["scaleX","number",false],["shadowElevation","number",false],["rotationX","number",false],["ambientShadowColor","string",false]],[["scaleY","number",false],["shadowElevation","number",false],["rotationX","number",false],["ambientShadowColor","string",false]],[["scaleX","number",false],["scaleY","number",false],["shadowElevation","number",false],["rotationX","number",false],["ambientShadowColor","string",false]],[["alpha","number",false],["shadowElevation","number",false],["rotationX","number",false],["ambientShadowColor","string",false]],[["scaleX","number",false],["alpha","number",false],["shadowElevation","number",false],["rotationX","number",false],["ambientShadowColor","string",false]],[["scaleY","number",false],["alpha","number",false],["shadowElevation","number",false],["rotationX","number",false],["ambientShadowColor","string",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["shadowElevation","number",false],["rotationX","number",false],["ambientShadowColor","string",false]],[["translationX","number",false],["shadowElevation","number",false],["rotationX","number",false],["ambientShadowColor","string",false]],[["scaleX","number",false],["translationX","number",false],["shadowElevation","number",false],["rotationX","number",false],["ambientShadowColor","string",false]],[["scaleY","number",false],["translationX","number",false],["shadowElevation","number",false],["rotationX","number",false],["ambientShadowColor","string",false]],[["scaleX","number",false],["scaleY","number",false],["translationX","number",false],["shadowElevation","number",false],["rotationX","number",false],["ambientShadowColor","string",false]],[["alpha","number",false],["translationX","number",false],["shadowElevation","number",false],["rotationX","number",false],["ambientShadowColor","string",false]],[["scaleX","number",false],["alpha","number",false],["translationX","number",false],["shadowElevation","number",false],["rotationX","number",false],["ambientShadowColor","string",false]],[["scaleY","number",false],["alpha","number",false],["translationX","number",false],["shadowElevation","number",false],["rotationX","number",false],["ambientShadowColor","string",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationX","number",false],["shadowElevation","number",false],["rotationX","number",false],["ambientShadowColor","string",false]],[["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["ambientShadowColor","string",false]],[["scaleX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["ambientShadowColor","string",false]],[["scaleY","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["ambientShadowColor","string",false]],[["scaleX","number",false],["scaleY","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["ambientShadowColor","string",false]],[["alpha","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["ambientShadowColor","string",false]],[["scaleX","number",false],["alpha","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["ambientShadowColor","string",false]],[["scaleY","number",false],["alpha","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["ambientShadowColor","string",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["ambientShadowColor","string",false]],[["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["ambientShadowColor","string",false]],[["scaleX","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["ambientShadowColor","string",false]],[["scaleY","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["ambientShadowColor","string",false]],[["scaleX","number",false],["scaleY","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["ambientShadowColor","string",false]],[["alpha","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["ambientShadowColor","string",false]],[["scaleX","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["ambientShadowColor","string",false]],[["scaleY","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["ambientShadowColor","string",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["ambientShadowColor","string",false]],[["spotShadowColor","string",false]],[["scaleX","number",false],["spotShadowColor","string",false]],[["scaleY","number",false],["spotShadowColor","string",false]],[["scaleX","number",false],["scaleY","number",false],["spotShadowColor","string",false]],[["alpha","number",false],["spotShadowColor","string",false]],[["scaleX","number",false],["alpha","number",false],["spotShadowColor","string",false]],[["scaleY","number",false],["alpha","number",false],["spotShadowColor","string",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["spotShadowColor","string",false]],[["translationX","number",false],["spotShadowColor","string",false]],[["scaleX","number",false],["translationX","number",false],["spotShadowColor","string",false]],[["scaleY","number",false],["translationX","number",false],["spotShadowColor","string",false]],[["scaleX","number",false],["scaleY","number",false],["translationX","number",false],["spotShadowColor","string",false]],[["alpha","number",false],["translationX","number",false],["spotShadowColor","string",false]],[["scaleX","number",false],["alpha","number",false],["translationX","number",false],["spotShadowColor","string",false]],[["scaleY","number",false],["alpha","number",false],["translationX","number",false],["spotShadowColor","string",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationX","number",false],["spotShadowColor","string",false]],[["translationY","number",false],["spotShadowColor","string",false]],[["scaleX","number",false],["translationY","number",false],["spotShadowColor","string",false]],[["scaleY","number",false],["translationY","number",false],["spotShadowColor","string",false]],[["scaleX","number",false],["scaleY","number",false],["translationY","number",false],["spotShadowColor","string",false]],[["alpha","number",false],["translationY","number",false],["spotShadowColor","string",false]],[["scaleX","number",false],["alpha","number",false],["translationY","number",false],["spotShadowColor","string",false]],[["scaleY","number",false],["alpha","number",false],["translationY","number",false],["spotShadowColor","string",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationY","number",false],["spotShadowColor","string",false]],[["translationX","number",false],["translationY","number",false],["spotShadowColor","string",false]],[["scaleX","number",false],["translationX","number",false],["translationY","number",false],["spotShadowColor","string",false]],[["scaleY","number",false],["translationX","number",false],["translationY","number",false],["spotShadowColor","string",false]],[["scaleX","number",false],["scaleY","number",false],["translationX","number",false],["translationY","number",false],["spotShadowColor","string",false]],[["alpha","number",false],["translationX","number",false],["translationY","number",false],["spotShadowColor","string",false]],[["scaleX","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["spotShadowColor","string",false]],[["scaleY","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["spotShadowColor","string",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["spotShadowColor","string",false]],[["shadowElevation","number",false],["spotShadowColor","string",false]],[["scaleX","number",false],["shadowElevation","number",false],["spotShadowColor","string",false]],[["scaleY","number",false],["shadowElevation","number",false],["spotShadowColor","string",false]],[["scaleX","number",false],["scaleY","number",false],["shadowElevation","number",false],["spotShadowColor","string",false]],[["alpha","number",false],["shadowElevation","number",false],["spotShadowColor","string",false]],[["scaleX","number",false],["alpha","number",false],["shadowElevation","number",false],["spotShadowColor","string",false]],[["scaleY","number",false],["alpha","number",false],["shadowElevation","number",false],["spotShadowColor","string",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["shadowElevation","number",false],["spotShadowColor","string",false]],[["translationX","number",false],["shadowElevation","number",false],["spotShadowColor","string",false]],[["scaleX","number",false],["translationX","number",false],["shadowElevation","number",false],["spotShadowColor","string",false]],[["scaleY","number",false],["translationX","number",false],["shadowElevation","number",false],["spotShadowColor","string",false]],[["scaleX","number",false],["scaleY","number",false],["translationX","number",false],["shadowElevation","number",false],["spotShadowColor","string",false]],[["alpha","number",false],["translationX","number",false],["shadowElevation","number",false],["spotShadowColor","string",false]],[["scaleX","number",false],["alpha","number",false],["translationX","number",false],["shadowElevation","number",false],["spotShadowColor","string",false]],[["scaleY","number",false],["alpha","number",false],["translationX","number",false],["shadowElevation","number",false],["spotShadowColor","string",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationX","number",false],["shadowElevation","number",false],["spotShadowColor","string",false]],[["translationY","number",false],["shadowElevation","number",false],["spotShadowColor","string",false]],[["scaleX","number",false],["translationY","number",false],["shadowElevation","number",false],["spotShadowColor","string",false]],[["scaleY","number",false],["translationY","number",false],["shadowElevation","number",false],["spotShadowColor","string",false]],[["scaleX","number",false],["scaleY","number",false],["translationY","number",false],["shadowElevation","number",false],["spotShadowColor","string",false]],[["alpha","number",false],["translationY","number",false],["shadowElevation","number",false],["spotShadowColor","string",false]],[["scaleX","number",false],["alpha","number",false],["translationY","number",false],["shadowElevation","number",false],["spotShadowColor","string",false]],[["scaleY","number",false],["alpha","number",false],["translationY","number",false],["shadowElevation","number",false],["spotShadowColor","string",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationY","number",false],["shadowElevation","number",false],["spotShadowColor","string",false]],[["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["spotShadowColor","string",false]],[["scaleX","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["spotShadowColor","string",false]],[["scaleY","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["spotShadowColor","string",false]],[["scaleX","number",false],["scaleY","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["spotShadowColor","string",false]],[["alpha","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["spotShadowColor","string",false]],[["scaleX","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["spotShadowColor","string",false]],[["scaleY","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["spotShadowColor","string",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["spotShadowColor","string",false]],[["rotationX","number",false],["spotShadowColor","string",false]],[["scaleX","number",false],["rotationX","number",false],["spotShadowColor","string",false]],[["scaleY","number",false],["rotationX","number",false],["spotShadowColor","string",false]],[["scaleX","number",false],["scaleY","number",false],["rotationX","number",false],["spotShadowColor","string",false]],[["alpha","number",false],["rotationX","number",false],["spotShadowColor","string",false]],[["scaleX","number",false],["alpha","number",false],["rotationX","number",false],["spotShadowColor","string",false]],[["scaleY","number",false],["alpha","number",false],["rotationX","number",false],["spotShadowColor","string",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["rotationX","number",false],["spotShadowColor","string",false]],[["translationX","number",false],["rotationX","number",false],["spotShadowColor","string",false]],[["scaleX","number",false],["translationX","number",false],["rotationX","number",false],["spotShadowColor","string",false]],[["scaleY","number",false],["translationX","number",false],["rotationX","number",false],["spotShadowColor","string",false]],[["scaleX","number",false],["scaleY","number",false],["translationX","number",false],["rotationX","number",false],["spotShadowColor","string",false]],[["alpha","number",false],["translationX","number",false],["rotationX","number",false],["spotShadowColor","string",false]],[["scaleX","number",false],["alpha","number",false],["translationX","number",false],["rotationX","number",false],["spotShadowColor","string",false]],[["scaleY","number",false],["alpha","number",false],["translationX","number",false],["rotationX","number",false],["spotShadowColor","string",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationX","number",false],["rotationX","number",false],["spotShadowColor","string",false]],[["translationY","number",false],["rotationX","number",false],["spotShadowColor","string",false]],[["scaleX","number",false],["translationY","number",false],["rotationX","number",false],["spotShadowColor","string",false]],[["scaleY","number",false],["translationY","number",false],["rotationX","number",false],["spotShadowColor","string",false]],[["scaleX","number",false],["scaleY","number",false],["translationY","number",false],["rotationX","number",false],["spotShadowColor","string",false]],[["alpha","number",false],["translationY","number",false],["rotationX","number",false],["spotShadowColor","string",false]],[["scaleX","number",false],["alpha","number",false],["translationY","number",false],["rotationX","number",false],["spotShadowColor","string",false]],[["scaleY","number",false],["alpha","number",false],["translationY","number",false],["rotationX","number",false],["spotShadowColor","string",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationY","number",false],["rotationX","number",false],["spotShadowColor","string",false]],[["translationX","number",false],["translationY","number",false],["rotationX","number",false],["spotShadowColor","string",false]],[["scaleX","number",false],["translationX","number",false],["translationY","number",false],["rotationX","number",false],["spotShadowColor","string",false]],[["scaleY","number",false],["translationX","number",false],["translationY","number",false],["rotationX","number",false],["spotShadowColor","string",false]],[["scaleX","number",false],["scaleY","number",false],["translationX","number",false],["translationY","number",false],["rotationX","number",false],["spotShadowColor","string",false]],[["alpha","number",false],["translationX","number",false],["translationY","number",false],["rotationX","number",false],["spotShadowColor","string",false]],[["scaleX","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["rotationX","number",false],["spotShadowColor","string",false]],[["scaleY","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["rotationX","number",false],["spotShadowColor","string",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["rotationX","number",false],["spotShadowColor","string",false]],[["shadowElevation","number",false],["rotationX","number",false],["spotShadowColor","string",false]],[["scaleX","number",false],["shadowElevation","number",false],["rotationX","number",false],["spotShadowColor","string",false]],[["scaleY","number",false],["shadowElevation","number",false],["rotationX","number",false],["spotShadowColor","string",false]],[["scaleX","number",false],["scaleY","number",false],["shadowElevation","number",false],["rotationX","number",false],["spotShadowColor","string",false]],[["alpha","number",false],["shadowElevation","number",false],["rotationX","number",false],["spotShadowColor","string",false]],[["scaleX","number",false],["alpha","number",false],["shadowElevation","number",false],["rotationX","number",false],["spotShadowColor","string",false]],[["scaleY","number",false],["alpha","number",false],["shadowElevation","number",false],["rotationX","number",false],["spotShadowColor","string",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["shadowElevation","number",false],["rotationX","number",false],["spotShadowColor","string",false]],[["translationX","number",false],["shadowElevation","number",false],["rotationX","number",false],["spotShadowColor","string",false]],[["scaleX","number",false],["translationX","number",false],["shadowElevation","number",false],["rotationX","number",false],["spotShadowColor","string",false]],[["scaleY","number",false],["translationX","number",false],["shadowElevation","number",false],["rotationX","number",false],["spotShadowColor","string",false]],[["scaleX","number",false],["scaleY","number",false],["translationX","number",false],["shadowElevation","number",false],["rotationX","number",false],["spotShadowColor","string",false]],[["alpha","number",false],["translationX","number",false],["shadowElevation","number",false],["rotationX","number",false],["spotShadowColor","string",false]],[["scaleX","number",false],["alpha","number",false],["translationX","number",false],["shadowElevation","number",false],["rotationX","number",false],["spotShadowColor","string",false]],[["scaleY","number",false],["alpha","number",false],["translationX","number",false],["shadowElevation","number",false],["rotationX","number",false],["spotShadowColor","string",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationX","number",false],["shadowElevation","number",false],["rotationX","number",false],["spotShadowColor","string",false]],[["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["spotShadowColor","string",false]],[["scaleX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["spotShadowColor","string",false]],[["scaleY","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["spotShadowColor","string",false]],[["scaleX","number",false],["scaleY","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["spotShadowColor","string",false]],[["alpha","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["spotShadowColor","string",false]],[["scaleX","number",false],["alpha","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["spotShadowColor","string",false]],[["scaleY","number",false],["alpha","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["spotShadowColor","string",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["spotShadowColor","string",false]],[["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["spotShadowColor","string",false]],[["scaleX","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["spotShadowColor","string",false]],[["scaleY","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["spotShadowColor","string",false]],[["scaleX","number",false],["scaleY","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["spotShadowColor","string",false]],[["alpha","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["spotShadowColor","string",false]],[["scaleX","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["spotShadowColor","string",false]],[["scaleY","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["spotShadowColor","string",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["spotShadowColor","string",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["rotationY","number",false],["rotationZ","number",false],["cameraDistance","number",false],["shape","shape",false],["clip","boolean",false],["ambientShadowColor","string",false],["spotShadowColor","string",false]],[["scaleX","number",false],["scaleY","number",false],["alpha","number",false],["translationX","number",false],["translationY","number",false],["shadowElevation","number",false],["rotationX","number",false],["rotationY","number",false],["rotationZ","number",false],["cameraDistance","number",false],["transformOrigin","object",false],["shape","shape",false],["clip","boolean",false],["ambientShadowColor","string",false],["spotShadowColor","string",false]]] },
  ],
  "toolingGraphicsLayer": [
    { id: 125, forms: [[]] },
  ],
  "onInterceptKeyBeforeSoftKeyboard": [
    { id: 126, primary: "onInterceptKeyBeforeSoftKeyboard", forms: [[["onInterceptKeyBeforeSoftKeyboard","object",false]]] },
  ],
  "onKeyEvent": [
    { id: 127, primary: "onKeyEvent", forms: [[["onKeyEvent","object",false]]] },
  ],
  "onPreInterceptKeyBeforeSoftKeyboard": [
    { id: 128, primary: "onPreInterceptKeyBeforeSoftKeyboard", forms: [[["onPreInterceptKeyBeforeSoftKeyboard","object",false]]] },
  ],
  "onPreviewKeyEvent": [
    { id: 129, primary: "onPreviewKeyEvent", forms: [[["onPreviewKeyEvent","object",false]]] },
  ],
  "nestedScroll": [
    { id: 130, primary: "connection", forms: [[["connection","object",false]]] },
  ],
  "pointerHoverIcon": [
    { id: 131, primary: "icon", forms: [[["icon","string",false]],[["icon","string",false],["overrideDescendants","boolean",false]]] },
  ],
  "stylusHoverIcon": [
    { id: 132, primary: "icon", forms: [[["icon","string",false]],[["icon","string",false],["overrideDescendants","boolean",false]]] },
  ],
  "layoutId": [
    { id: 133, primary: "layoutId", forms: [[["layoutId","string",false]]] },
  ],
  "onGloballyPositioned": [
    { id: 134, primary: "onGloballyPositioned", forms: [[["onGloballyPositioned","function",false]]] },
  ],
  "onLayoutRectChanged": [
    { id: 135, primary: "callback", forms: [[["callback","function",false]],[["throttleMillis","number",false],["callback","function",false]],[["debounceMillis","number",false],["callback","function",false]],[["throttleMillis","number",false],["debounceMillis","number",false],["callback","function",false]]] },
  ],
  "onPlaced": [
    { id: 136, primary: "onPlaced", forms: [[["onPlaced","function",false]]] },
  ],
  "onSizeChanged": [
    { id: 137, primary: "onSizeChanged", forms: [[["onSizeChanged","function",false]]] },
  ],
  "testTag": [
    { id: 138, primary: "tag", forms: [[["tag","string",false]]] },
  ],
  "clearAndSetSemantics": [
    { id: 139, primary: "properties", forms: [[["properties","object",false]]] },
  ],
  "semantics": [
    { id: 140, primary: "properties", forms: [[["properties","object",false]],[["mergeDescendants","boolean",false],["properties","object",false]]] },
  ],
  "sensitiveContent": [
    { id: 141, forms: [[],[["isContentSensitive","boolean",false]]] },
  ],
  "zIndex": [
    { id: 142, primary: "zIndex", forms: [[["zIndex","number",false]]] },
  ],
}) as Modifier;
