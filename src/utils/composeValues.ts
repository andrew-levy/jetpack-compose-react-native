import type { ComposeRole } from "../generated/values";

/** Dimensions are expressed in dp. */
export type ComposeDpSize = { width: number; height: number };

/** Logical padding edges, expressed in dp. */
export type ComposePaddingValues = { all?: number; horizontal?: number; vertical?: number; start?: number; top?: number; end?: number; bottom?: number };

/** Physical window inset edges, expressed in dp. */
export type ComposeWindowInsets = { left?: number; top?: number; right?: number; bottom?: number };

export type ComposeAnnotatedString = { text: string };

export type ComposeTextStyle = {
  color?: string;
  fontSize?: number;
  lineHeight?: number;
  letterSpacing?: number;
};

/** A color fill or a drawable bundled in the Android app. */
export type ComposePainter = { color: string } | { drawable: string };
export type ComposeTextFieldState = { initialText?: string };

export type ComposeDatePickerState = { initialSelectedDateMillis?: number; initialDisplayedMonthMillis?: number };
export type ComposeDateRangePickerState = {
  initialSelectedStartDateMillis?: number;
  initialSelectedEndDateMillis?: number;
  initialDisplayedMonthMillis?: number;
};
export type ComposeTimePickerState = { initialHour?: number; initialMinute?: number; is24Hour?: boolean };
export type ComposeSwipeToDismissState = { initialValue?: "settled" | "startToEnd" | "endToStart" };
export type ComposeBottomSheetScaffoldState = { skipHiddenState?: boolean };
export type ComposeGridCells = { count: number } | { minSize: number };
export type ComposeLazyState = { initialIndex?: number; initialOffsetPx?: number };
export type ComposePagerState = { initialPage?: number };
export type ComposeScrollState = { initialOffsetPx?: number };

/** Sizes and coordinates reported by Compose use physical pixels. */
export type ComposeLayoutSize = { width: number; height: number };
export type ComposeLayoutPosition = ComposeLayoutSize & { x: number; y: number };
export type ComposeFocusState = { isFocused: boolean; hasFocus: boolean; isCaptured: boolean };


export type ComposeSemantics = {
  contentDescription?: string;
  stateDescription?: string;
  role?: ComposeRole;
  heading?: boolean;
  disabled?: boolean;
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
export type ComposeNestedScrollConnection = {
  preScroll?: ComposeAxisConsumption;
  postScroll?: ComposeAxisConsumption;
  preFling?: ComposeAxisConsumption;
  postFling?: ComposeAxisConsumption;
  userInputOnly?: boolean;
};

/** Android key codes consumed synchronously by this modifier. */
export type ComposeKeyPolicy = { keyCodes: readonly number[]; event?: "down" | "up" | "both" };

export type ComposeEasing = "linear" | "fastOutSlowIn" | "linearOutSlowIn" | "fastOutLinearIn"
  | readonly [x1: number, y1: number, x2: number, y2: number];

export type ComposeAnimationSpec =
  | { type: "spring"; dampingRatio?: number; stiffness?: number }
  | { type: "tween"; durationMillis?: number; delayMillis?: number; easing?: ComposeEasing }
  | { type: "snap"; delayMillis?: number };

export type ComposeVisibilityTransition =
  | { type: "none" }
  | { type: "fade"; alpha?: number; animationSpec?: ComposeAnimationSpec };

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
