import type { ComposeParagraphStyleValue, ComposeSpanStyleValue, ComposeTextStyleValue } from "../generated/values/records";
import type { ComposeFontWeight, ComposeRole } from "../generated/values/enums";
import type { ComposeBrush } from "./modifier";
import type { ComposeMaterialIcon } from "../generated/values/icons";

/** Dimensions are expressed in dp. */
export type ComposeDpSize = { width: number; height: number };

/** Logical padding edges, expressed in dp. */
export type ComposePaddingValues = { all?: number; horizontal?: number; vertical?: number; start?: number; top?: number; end?: number; bottom?: number };

/** Physical window inset edges, expressed in dp. */
export type ComposeWindowInsets = { left?: number; top?: number; right?: number; bottom?: number };

type ComposeWindowProperties = {
  dismissOnBackPress?: boolean;
  dismissOnClickOutside?: boolean;
  securePolicy?: "inherit" | "secureOn" | "secureOff";
  usePlatformDefaultWidth?: boolean;
};

export type ComposeDialogProperties = ComposeWindowProperties & {
  decorFitsSystemWindows?: boolean;
  windowTitle?: string;
};

export type ComposePopupProperties = ComposeWindowProperties & {
  focusable?: boolean;
  excludeFromSystemGesture?: boolean;
  clippingEnabled?: boolean;
};

/** Span and annotation bounds are UTF-16 offsets with an exclusive end. */
export type ComposeAnnotatedString = {
  text: string;
  /** SpanStyle ranges, in UTF-16 offsets: `{ start, end, color, fontWeight, ... }`. */
  spans?: readonly ComposeTextSpan[];
  /** ParagraphStyle ranges, in UTF-16 offsets: `{ start, end, textAlign, lineHeight, ... }`. */
  paragraphs?: readonly ComposeTextParagraph[];
  annotations?: readonly { start: number; end: number; tag: string; value: string }[];
};

/** A SpanStyle applied to `start..end`. Every SpanStyle field is generated from Compose. */
export type ComposeTextSpan = { start: number; end: number } & ComposeSpanStyleValue & {
  /** @deprecated Use `fontStyle: "italic"`. */
  italic?: boolean;
  /** @deprecated Use `textDecoration`. */
  decoration?: "none" | "underline" | "lineThrough";
};

/** A ParagraphStyle applied to `start..end`. */
export type ComposeTextParagraph = { start: number; end: number } & ComposeParagraphStyleValue;

/** A TextStyle. Every TextStyle field is generated from Compose. Sizes are in sp. */
export type ComposeTextStyle = ComposeTextStyleValue;

/**
 * An image a painter loads: a `require()` asset or `{ uri }` (http, https, file, content or asset).
 * Width and height in dp size the painter before the image loads.
 */
export type ComposeImageSource = number | { uri: string; width?: number; height?: number; scale?: number };

/** A built-in Material icon, a color fill, a drawable bundled in the Android app, or an image source. */
export type ComposePainter = ComposeMaterialIcon | { color: string } | { drawable: string } | { source: ComposeImageSource };
export type ComposeTextFieldState = { initialText?: string };

export type ComposeDatePickerState = { initialSelectedDateMillis?: number; initialDisplayedMonthMillis?: number };
export type ComposeDateRangePickerState = {
  initialSelectedStartDateMillis?: number;
  initialSelectedEndDateMillis?: number;
  initialDisplayedMonthMillis?: number;
};
export type ComposeTimePickerState = { initialHour?: number; initialMinute?: number; is24Hour?: boolean };
export type ComposeSwipeToDismissState = { initialValue?: "settled" | "startToEnd" | "endToStart" };
type ObservedState<Snapshot> = { onStateChange?: (state: Snapshot) => void };

export type ComposeSheetValue = "hidden" | "partiallyExpanded" | "expanded";
export type ComposeSheetSnapshot = {
  currentValue: ComposeSheetValue;
  targetValue: ComposeSheetValue;
  isVisible: boolean;
};
export type ComposeModalSheetState = ObservedState<ComposeSheetSnapshot> & { skipPartiallyExpanded?: boolean };
export type ComposeBottomSheetScaffoldState = ObservedState<ComposeSheetSnapshot> & { skipHiddenState?: boolean };
export type ComposeGridCells = { count: number } | { minSize: number };
export type ComposeLazySnapshot = {
  firstVisibleItemIndex: number;
  firstVisibleItemScrollOffsetPx: number;
  visibleItemIndices: readonly number[];
  totalItemsCount: number;
  isScrollInProgress: boolean;
};
export type ComposePagerSnapshot = {
  currentPage: number;
  settledPage: number;
  targetPage: number;
  currentPageOffsetFraction: number;
  isScrollInProgress: boolean;
};
export type ComposeScrollSnapshot = { offsetPx: number; maxOffsetPx: number; isScrollInProgress: boolean };
export type ComposeLazyState = ObservedState<ComposeLazySnapshot> & { initialIndex?: number; initialOffsetPx?: number };
export type ComposePagerState = ObservedState<ComposePagerSnapshot> & { initialPage?: number };
export type ComposeScrollState = ObservedState<ComposeScrollSnapshot> & { initialOffsetPx?: number };

/** Sizes and coordinates reported by Compose use physical pixels. */
export type ComposeLayoutSize = { width: number; height: number };
export type ComposeTextLayout = ComposeLayoutSize & {
  lineCount: number;
  didOverflowWidth: boolean;
  didOverflowHeight: boolean;
};
export type ComposeLayoutPosition = ComposeLayoutSize & { x: number; y: number };
export type ComposeFocusState = { isFocused: boolean; hasFocus: boolean; isCaptured: boolean };


export type ComposeSemantics = {
  contentDescription?: string;
  stateDescription?: string;
  role?: ComposeRole;
  heading?: boolean;
  disabled?: boolean;
  onClickLabel?: string;
  onClick?: () => void;
  customActions?: readonly { label: string; onAction: () => void }[];
};
export type ComposeFocusProperties = { canFocus: boolean };


export type ComposeAlignmentLine = "firstBaseline" | "lastBaseline";
export type ComposeDatePickerFormatter = {
  yearSelectionSkeleton?: string;
  selectedDateSkeleton?: string;
  selectedDateDescriptionSkeleton?: string;
};
export type ComposeSearchBarState = { initiallyExpanded?: boolean };
export type ComposeTooltipState = { initiallyVisible?: boolean; persistent?: boolean };
export type ComposePopupPosition = { spacing?: number };
export type ComposeSnackbarHostState = { message?: string };

/** Fractions of the available delta or velocity consumed natively, from zero to one. */
export type ComposeAxisConsumption = { x?: number; y?: number };
export type ComposeTopAppBarScrollMode = "pinned" | "enterAlways" | "exitUntilCollapsed";
export type ComposeTopAppBarScrollBehavior = {
  readonly kind: "topAppBarScroll";
  readonly token: string;
  readonly mode: ComposeTopAppBarScrollMode;
};

export type ComposeNestedScrollConnection = {
  preScroll?: ComposeAxisConsumption;
  postScroll?: ComposeAxisConsumption;
  preFling?: ComposeAxisConsumption;
  postFling?: ComposeAxisConsumption;
  userInputOnly?: boolean;
};
export type ComposeNestedScrollBehavior = ComposeNestedScrollConnection | ComposeTopAppBarScrollBehavior;

/** Android key codes consumed synchronously by this modifier. */
export type ComposeKeyPolicy = { keyCodes: readonly number[]; event?: "down" | "up" | "both" };

export type ComposeEasing = "linear" | "fastOutSlowIn" | "linearOutSlowIn" | "fastOutLinearIn"
  | readonly [x1: number, y1: number, x2: number, y2: number];

export type ComposeAnimationOffset = { x: number; y: number };
export type ComposeAnimationRect = { left: number; top: number; right: number; bottom: number };

export type ComposeAnimationSpec<Value = number> =
  | { type: "spring"; dampingRatio?: number; stiffness?: number }
  | { type: "tween"; durationMillis?: number; delayMillis?: number; easing?: ComposeEasing }
  | { type: "snap"; delayMillis?: number }
  | {
      type: "keyframes";
      durationMillis: number;
      delayMillis?: number;
      frames: readonly { atMillis: number; value: Value; easing?: ComposeEasing }[];
    };

export type ComposeVisibilityTransition =
  | { type: "none" }
  | { type: "fade"; alpha?: number; animationSpec?: ComposeAnimationSpec }
  | { type: "scale"; scale?: number; animationSpec?: ComposeAnimationSpec }
  | { type: "slide"; direction: "up" | "down" | "left" | "right"; fraction?: number; animationSpec?: ComposeAnimationSpec<ComposeAnimationOffset> };

export type ComposeContentTransition = {
  enter: ComposeVisibilityTransition;
  exit: ComposeVisibilityTransition;
};

export type ComposeTextRange = { start: number; end: number };
export type ComposeTextFieldValue = {
  text: string;
  selection?: ComposeTextRange;
  composition?: ComposeTextRange | null;
};
export type ComposeTextFieldSnapshot = {
  text: string;
  selection: ComposeTextRange;
  composition: ComposeTextRange | null;
};

export type ComposeKeyboardOptions = {
  capitalization?: "none" | "characters" | "words" | "sentences";
  keyboardType?: "text" | "ascii" | "number" | "phone" | "uri" | "email" | "password" | "numberPassword" | "decimal";
  imeAction?: "default" | "none" | "go" | "search" | "send" | "previous" | "next" | "done";
  autoCorrectEnabled?: boolean;
  showKeyboardOnFocus?: boolean;
};

export type ComposeTextFieldLineLimits =
  | { type: "singleLine" }
  | { type: "multiLine"; minHeightInLines?: number; maxHeightInLines?: number };

/** Filters user edits before they are written to native text state. */
export type ComposeInputTransformation = {
  /** Reject edits containing characters other than ASCII digits. */
  digitsOnly?: boolean;
  /** Reject edits that exceed this many UTF-16 code units. */
  maxLength?: number;
};

/** Inserts display text after each offset once the backing text extends past it. */
export type ComposeOutputTransformation = {
  /** Offsets refer to the original text and must be positive, distinct UTF-16 offsets. */
  insertions: readonly { offset: number; text: string }[];
};

/** Display transformation for the controlled string and TextFieldValue overloads. */
export type ComposeVisualTransformation =
  | { type: "none" }
  | { type: "password"; mask?: string };

export type ComposePageSize = { type: "fill" } | { type: "fixed"; size: number };

export type ComposeShadow = {
  radius: number;
  color?: string;
  spread?: number;
  offset?: { x: number; y: number };
  alpha?: number;
};

export type ComposeLayoutChildPlacement = {
  /** Child dimensions in dp. The child's available space caps explicit dimensions. */
  width?: number;
  height?: number;
  /** Position in the available space on each axis, from 0 to 1. Defaults to 0. */
  horizontalBias?: number;
  verticalBias?: number;
  /** Additional placement offsets in dp. Horizontal placement is relative to layout direction. */
  x?: number;
  y?: number;
};

type ComposeLayoutDimensions = { width?: number; height?: number };

/** Measures direct children together and places them in declaration order. */
export type ComposeLayoutMeasurePolicy = ComposeLayoutDimensions & {
  children?: readonly ComposeLayoutChildPlacement[];
};

/** Measures and places the element wrapped by this modifier. */
export type ComposeLayoutModifierMeasure = ComposeLayoutDimensions & {
  child?: ComposeLayoutChildPlacement;
};

export type ComposeGridTrack = number | { fr: number } | { fraction: number } | "auto";
export type ComposeGridConfig = {
  columns: readonly ComposeGridTrack[];
  rows: readonly ComposeGridTrack[];
  flow?: "row" | "column";
  gap?: number;
  rowGap?: number;
  columnGap?: number;
};

export type ComposeFlexBoxConfig = {
  direction?: "row" | "rowReverse" | "column" | "columnReverse";
  wrap?: "noWrap" | "wrap" | "wrapReverse";
  gap?: number;
  rowGap?: number;
  columnGap?: number;
};

export type ComposeFlexConfig = {
  grow?: number;
  shrink?: number;
  order?: number;
  basis?: number | { fraction: number };
};

/** Gesture deltas and offsets are in physical pixels. Events are delivered to React asynchronously. */
export type ComposeDragState = { onDelta: (deltaPx: number) => void };
export type ComposeDrag2DState = { onDelta: (deltaPx: import("../generated/values/records").ComposeOffset) => void };
export type ComposeScrollableState = {
  /** Fraction of each available delta consumed on Android. Defaults to one. */
  consumeFraction?: number;
  onDelta?: (consumedPx: number) => void;
};
export type ComposeScrollable2DState = {
  consumeFraction?: ComposeAxisConsumption;
  onDelta?: (consumedPx: import("../generated/values/records").ComposeOffset) => void;
};
export type ComposeTransformableState = {
  onTransform: (event: {
    centroid: import("../generated/values/records").ComposeOffset | null;
    pan: import("../generated/values/records").ComposeOffset;
    zoom: number;
    rotation: number;
  }) => void;
};

export type ComposeAnchoredDragState = {
  /** Named anchors and their positions in physical pixels. */
  anchors: Readonly<Record<string, number>>;
  initialValue: string;
  onOffsetChange?: (offsetPx: number) => void;
  onSettled?: (anchor: string) => void;
};

type ComposeDrawPoint = { x: number; y: number };

/** Fill with `color` or `brush`; a `strokeWidth` strokes the outline instead. Units are dp. */
type ComposeDrawPaint = ({ color: string; brush?: never } | { brush: ComposeBrush; color?: never }) & {
  alpha?: number;
  strokeWidth?: number;
  strokeCap?: "butt" | "round" | "square";
  strokeJoin?: "miter" | "round" | "bevel";
};
/** A box in dp. A missing width or height fills the rest of the drawing area. */
type ComposeDrawBounds = { x?: number; y?: number; width?: number; height?: number };
export type ComposePathSegment =
  | { op: "moveTo" | "lineTo"; x: number; y: number }
  | { op: "quadTo"; x1: number; y1: number; x2: number; y2: number }
  | { op: "cubicTo"; x1: number; y1: number; x2: number; y2: number; x3: number; y3: number }
  | { op: "arcTo"; x: number; y: number; width: number; height: number; startAngle: number; sweepAngle: number; forceMoveTo?: boolean }
  | { op: "close" };
type ComposeDrawPath = { points: readonly ComposeDrawPoint[]; segments?: never; closed?: boolean }
  | { segments: readonly ComposePathSegment[]; points?: never; closed?: boolean };
type ComposeDrawGroup = { commands?: readonly ComposeDrawCommand[] };

export type ComposeDrawCommand =
  | ({ type: "rect"; cornerRadius?: number } & ComposeDrawBounds & ComposeDrawPaint)
  | ({ type: "oval" } & ComposeDrawBounds & ComposeDrawPaint)
  | ({ type: "circle"; center?: ComposeDrawPoint; radius: number } & ComposeDrawPaint)
  | ({ type: "arc"; startAngle: number; sweepAngle: number; useCenter?: boolean } & ComposeDrawBounds & ComposeDrawPaint)
  | ({ type: "line"; start: ComposeDrawPoint; end: ComposeDrawPoint } & ComposeDrawPaint)
  | ({ type: "points"; points: readonly ComposeDrawPoint[]; pointMode?: "points" | "lines" | "polygon" } & ComposeDrawPaint)
  | ({ type: "path" } & ComposeDrawPath & ComposeDrawPaint)
  /** `y` is the text baseline. `fontSize` is in sp. */
  | { type: "text"; text: string; x?: number; y?: number; color?: string; alpha?: number; fontSize?: number;
      fontWeight?: "normal" | "bold"; textAlign?: "start" | "center" | "end" }
  | ({ type: "translate"; x?: number; y?: number } & ComposeDrawGroup)
  | ({ type: "rotate"; degrees: number; pivot?: ComposeDrawPoint } & ComposeDrawGroup)
  | ({ type: "scale"; scale?: number; x?: number; y?: number; pivot?: ComposeDrawPoint } & ComposeDrawGroup)
  | ({ type: "inset"; all?: number; left?: number; top?: number; right?: number; bottom?: number } & ComposeDrawGroup)
  | ({ type: "clipRect" } & ComposeDrawBounds & ComposeDrawGroup)
  | ({ type: "clipPath" } & ComposeDrawPath & ComposeDrawGroup);

export type ComposeDrawing = { commands: readonly ComposeDrawCommand[] };
export type ComposeContentDrawing = { before?: readonly ComposeDrawCommand[]; after?: readonly ComposeDrawCommand[] };

export type ComposeBorderStroke = { width: number; color: string };
export type ComposeCarouselState = { initialItem?: number };
export type ComposeOverscrollEffect = { type: "platform" };
export type ComposeFlingBehavior = { type: "platform" | "none" };

/** A stable key shared by the source and destination inside one SharedTransitionLayout. */
export type ComposeSharedContent = { key: string };

export type ComposeMotionEvent = {
  action: number;
  x: number;
  y: number;
  pointerCount: number;
};

export type ComposeTouchPolicy = {
  /** Android MotionEvent action codes. Include action 0 to claim a touch sequence. */
  actions: readonly number[];
  onEvent?: (event: ComposeMotionEvent) => void;
};

export type ComposeRotaryPolicy = {
  consume?: boolean;
  onScroll?: (event: { horizontalPixels: number; verticalPixels: number }) => void;
};

export type ComposeReceiveContent = {
  /** Consume received text and leave non-text items in the native chain. Defaults to true. */
  consume?: boolean;
  onText: (text: string) => void;
};

export type ComposeIndication = {
  type: "ripple";
  bounded?: boolean;
  radius?: number;
  color?: string;
};

export type ComposeRectRulers = {
  type: "safeDrawing" | "safeGestures" | "safeContent" | "systemBars" | "ime";
  maximum?: boolean;
};

export type ComposeKeyboardActions = {
  onDone?: () => void;
  onGo?: () => void;
  onNext?: () => void;
  onPrevious?: () => void;
  onSearch?: () => void;
  onSend?: () => void;
  performDefaultAction?: boolean;
};

export type ComposeDragTransfer = { text: string; label?: string };
export type ComposeDragTypes = { mimeTypes: readonly string[] };
export type ComposeDragTarget = { onDrop: (text: string) => void };

type ComposeAction = { label: string; enabled?: boolean } & (
  | { checked?: never; onClick: () => void; onCheckedChange?: never }
  | { checked: boolean; onCheckedChange: (checked: boolean) => void; onClick?: never }
);

export type ComposeButtonGroupItem = ComposeAction & { icon?: ComposePainter; weight?: number };
export type ComposeAppBarItem = ComposeAction & { icon: ComposePainter };

export type ComposePointerChange = {
  id: string;
  uptimeMillis: number;
  position: { x: number; y: number };
  previousPosition: { x: number; y: number };
  pressed: boolean;
  previousPressed: boolean;
  consumed: boolean;
  pointerType: string;
};

export type ComposePointerPolicy = {
  pass?: "initial" | "main" | "final";
  consume?: "none" | "movement" | "all";
  onEvent?: (event: { type: string; changes: readonly ComposePointerChange[] }) => void;
};
