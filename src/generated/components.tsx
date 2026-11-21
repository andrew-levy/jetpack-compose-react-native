// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "./runtime/createComposableComponent";
import type { ColorScheme } from "./factories";
import type { ComposeShape, ComposeBrush } from "../utils/modifier";
export type ComposeFloatRange = readonly [start: number, endInclusive: number];
import type { ComposeAnimationSpec, ComposeAnnotatedString, ComposeBottomSheetScaffoldState, ComposeDatePickerFormatter, ComposeDatePickerState, ComposeDateRangePickerState, ComposeDpSize, ComposeGridCells, ComposeLazyState, ComposeNestedScrollConnection, ComposePaddingValues, ComposePagerState, ComposePainter, ComposePopupPosition, ComposeSearchBarState, ComposeSnackbarHostState, ComposeSwipeToDismissState, ComposeTextFieldSnapshot, ComposeTextFieldState, ComposeTextFieldValue, ComposeTextStyle, ComposeTimePickerState, ComposeTooltipState, ComposeVisibilityTransition, ComposeWindowInsets } from "../utils/composeValues";
import type { ComposeFocusRequester, ComposeInteractionSource } from "../utils/nativeHandles";
import type { ComposeDpOffset, ComposeIntOffset } from "./records";
export type { ComposePaddingValues, ComposeWindowInsets } from "../utils/composeValues";
export type ComposeSheetState = { skipPartiallyExpanded?: boolean };
import type { ComposeAlignment, ComposeHorizontalAlignment, ComposeVerticalAlignment, ComposeHorizontalArrangement, ComposeVerticalArrangement, ComposeTextAlign, ComposeTextOverflow, ComposeFontWeight, ComposeToggleableState, ComposeContentScale, ComposeDisplayMode } from "./values";

export interface ActiveIconProps {
}
export const ActiveIcon = createComposableComponent<ActiveIconProps>({
  name: "ActiveIcon",
  props: [],
  children: false,
});

export interface AlertDialogProps {
  onDismissRequest: () => void;
  confirmButton: ReactNode;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  dismissButton?: ReactNode;
  icon?: ReactNode;
  title?: ReactNode;
  text?: ReactNode;
  shape?: ComposeShape;
  containerColor?: string;
  iconContentColor?: string;
  titleContentColor?: string;
  textContentColor?: string;
  tonalElevation?: number;
}
export const AlertDialog = createComposableComponent<AlertDialogProps>({
  name: "AlertDialog",
  props: ["modifier","shape","containerColor","iconContentColor","titleContentColor","textContentColor","tonalElevation"],
  objectProps: ["shape"],
  slots: ["confirmButton","dismissButton","icon","title","text"],
  events: ["onDismissRequest"],
  children: false,
});

export interface AnimatedVisibilityProps {
  visible: boolean;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  enter?: ComposeVisibilityTransition;
  exit?: ComposeVisibilityTransition;
  label?: string;
  children?: ReactNode;
}
export const AnimatedVisibility = createComposableComponent<AnimatedVisibilityProps>({
  name: "AnimatedVisibility",
  props: ["visible","modifier","enter","exit","label"],
  objectProps: ["enter","exit"],
  children: true,
});

export interface AssistChipProps {
  onClick: () => void;
  label: ReactNode;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  enabled?: boolean;
  leadingIcon?: ReactNode;
  trailingIcon?: ReactNode;
  shape?: ComposeShape;
  interactionSource?: ComposeInteractionSource | null;
}
export const AssistChip = createComposableComponent<AssistChipProps>({
  name: "AssistChip",
  props: ["modifier","enabled","shape","interactionSource"],
  objectProps: ["shape","interactionSource"],
  slots: ["label","leadingIcon","trailingIcon"],
  events: ["onClick"],
  children: false,
});

export interface BadgeProps {
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  containerColor?: string;
  contentColor?: string;
  content?: ReactNode;
}
export const Badge = createComposableComponent<BadgeProps>({
  name: "Badge",
  props: ["modifier","containerColor","contentColor"],
  slots: ["content"],
  children: false,
});

export interface BadgedBoxProps {
  badge: ReactNode;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  children?: ReactNode;
}
export const BadgedBox = createComposableComponent<BadgedBoxProps>({
  name: "BadgedBox",
  props: ["modifier"],
  slots: ["badge"],
  children: true,
});

export interface BasicAlertDialogProps {
  onDismissRequest: () => void;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  children?: ReactNode;
}
export const BasicAlertDialog = createComposableComponent<BasicAlertDialogProps>({
  name: "BasicAlertDialog",
  props: ["modifier"],
  events: ["onDismissRequest"],
  children: true,
});

export interface BasicSecureTextFieldProps {
  state: ComposeTextFieldState;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  enabled?: boolean;
  readOnly?: boolean;
  textStyle?: ComposeTextStyle;
  interactionSource?: ComposeInteractionSource | null;
  cursorBrush?: ComposeBrush;
}
export const BasicSecureTextField = createComposableComponent<BasicSecureTextFieldProps>({
  name: "BasicSecureTextField",
  props: ["state","modifier","enabled","readOnly","textStyle","interactionSource","cursorBrush"],
  objectProps: ["state","textStyle","interactionSource","cursorBrush"],
  children: false,
});

export type BasicTextProps =
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    composeTextStyle?: ComposeTextStyle;
    overflow?: ComposeTextOverflow;
    softWrap?: boolean;
    maxLines?: number;
    minLines?: number;
    }
  | {
    text: ComposeAnnotatedString;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    composeTextStyle?: ComposeTextStyle;
    overflow?: ComposeTextOverflow;
    softWrap?: boolean;
    maxLines?: number;
    minLines?: number;
    }
;
export const BasicText = createComposableComponent<BasicTextProps>({
  name: "BasicText",
  props: ["text","modifier","composeTextStyle","overflow","softWrap","maxLines","minLines"],
  objectProps: ["composeTextStyle","text"],
  children: false,
  overloads: [
    { id: "BasicText", children: false, parameters: [["text","string",false,false],["modifier","ComposeModifier",true,false],["composeTextStyle","object",true,false],["overflow","string",true,false],["softWrap","boolean",true,false],["maxLines","number",true,false],["minLines","number",true,false]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31] },
    { id: "BasicText#1", children: false, parameters: [["text","object",false,false],["modifier","ComposeModifier",true,false],["composeTextStyle","object",true,false],["overflow","string",true,false],["softWrap","boolean",true,false],["maxLines","number",true,false],["minLines","number",true,false]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31] },
  ],
});

export type BasicTextFieldProps =
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly?: boolean;
    textStyle?: ComposeTextStyle;
    interactionSource?: ComposeInteractionSource | null;
    cursorBrush?: ComposeBrush;
    value?: never;
    onValueChange?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    }
  | {
    value: ComposeTextFieldValue;
    onValueChange: (value: ComposeTextFieldSnapshot) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly?: boolean;
    textStyle?: ComposeTextStyle;
    singleLine?: boolean;
    maxLines?: number;
    minLines?: number;
    interactionSource?: ComposeInteractionSource | null;
    cursorBrush?: ComposeBrush;
    state?: never;
    }
  | {
    value: string;
    onValueChange: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly?: boolean;
    textStyle?: ComposeTextStyle;
    singleLine?: boolean;
    maxLines?: number;
    minLines?: number;
    interactionSource?: ComposeInteractionSource | null;
    cursorBrush?: ComposeBrush;
    state?: never;
    }
;
export const BasicTextField = createComposableComponent<BasicTextFieldProps>({
  name: "BasicTextField",
  props: ["state","modifier","enabled","readOnly","textStyle","interactionSource","cursorBrush","value","singleLine","maxLines","minLines"],
  objectProps: ["state","textStyle","interactionSource","cursorBrush","value"],
  events: ["onValueChange"],
  children: false,
  overloads: [
    { id: "BasicTextField", children: false, parameters: [["state","object",false,false],["modifier","ComposeModifier",true,false],["enabled","boolean",true,false],["readOnly","boolean",true,false],["textStyle","object",true,false],["interactionSource","object",true,true],["cursorBrush","brush",true,false]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31] },
    { id: "BasicTextField#1", children: false, parameters: [["value","object",false,false],["onValueChange","function",false,false],["modifier","ComposeModifier",true,false],["enabled","boolean",true,false],["readOnly","boolean",true,false],["textStyle","object",true,false],["singleLine","boolean",true,false],["maxLines","number",true,false],["minLines","number",true,false],["interactionSource","object",true,true],["cursorBrush","brush",true,false]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,123,124,125,126,127,128,129,130,131,132,133,134,135,136,137,138,139,140,141,142,143,144,145,146,147,148,149,150,151,152,153,154,155,156,157,158,159,160,161,162,163,164,165,166,167,168,169,170,171,172,173,174,175,176,177,178,179,180,181,182,183,184,185,186,187,188,189,190,191,192,193,194,195,196,197,198,199,200,201,202,203,204,205,206,207,208,209,210,211,212,213,214,215,216,217,218,219,220,221,222,223,224,225,226,227,228,229,230,231,232,233,234,235,236,237,238,239,240,241,242,243,244,245,246,247,248,249,250,251,252,253,254,255] },
    { id: "BasicTextField#2", children: false, parameters: [["value","string",false,false],["onValueChange","function",false,false],["modifier","ComposeModifier",true,false],["enabled","boolean",true,false],["readOnly","boolean",true,false],["textStyle","object",true,false],["singleLine","boolean",true,false],["maxLines","number",true,false],["minLines","number",true,false],["interactionSource","object",true,true],["cursorBrush","brush",true,false]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,123,124,125,126,127,128,129,130,131,132,133,134,135,136,137,138,139,140,141,142,143,144,145,146,147,148,149,150,151,152,153,154,155,156,157,158,159,160,161,162,163,164,165,166,167,168,169,170,171,172,173,174,175,176,177,178,179,180,181,182,183,184,185,186,187,188,189,190,191,192,193,194,195,196,197,198,199,200,201,202,203,204,205,206,207,208,209,210,211,212,213,214,215,216,217,218,219,220,221,222,223,224,225,226,227,228,229,230,231,232,233,234,235,236,237,238,239,240,241,242,243,244,245,246,247,248,249,250,251,252,253,254,255] },
  ],
});

export interface BasicTooltipBoxProps {
  positionProvider: ComposePopupPosition;
  tooltip: ReactNode;
  state: ComposeTooltipState;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  focusable?: boolean;
  enableUserInput?: boolean;
  propagateMinConstraints?: boolean;
  children?: ReactNode;
}
export const BasicTooltipBox = createComposableComponent<BasicTooltipBoxProps>({
  name: "BasicTooltipBox",
  props: ["positionProvider","state","modifier","focusable","enableUserInput","propagateMinConstraints"],
  objectProps: ["positionProvider","state"],
  slots: ["tooltip"],
  children: true,
});

export type BottomAppBarProps =
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    containerColor?: string;
    contentColor?: string;
    tonalElevation?: number;
    contentPadding?: ComposePaddingValues;
    windowInsets?: ComposeWindowInsets;
    children?: ReactNode;
    actions?: never;
    floatingActionButton?: never;
    }
  | {
    actions: ReactNode;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    floatingActionButton?: ReactNode;
    containerColor?: string;
    contentColor?: string;
    tonalElevation?: number;
    contentPadding?: ComposePaddingValues;
    windowInsets?: ComposeWindowInsets;
    children?: never;
    }
;
export const BottomAppBar = createComposableComponent<BottomAppBarProps>({
  name: "BottomAppBar",
  props: ["modifier","containerColor","contentColor","tonalElevation","contentPadding","windowInsets"],
  objectProps: ["contentPadding","windowInsets"],
  slots: ["actions","floatingActionButton"],
  children: true,
  overloads: [
    { id: "BottomAppBar", children: true, parameters: [["modifier","ComposeModifier",true,false],["containerColor","string",true,false],["contentColor","string",true,false],["tonalElevation","number",true,false],["contentPadding","object",true,false],["windowInsets","object",true,false]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31] },
    { id: "BottomAppBar#1", children: false, parameters: [["actions","ReactNode",false,false],["modifier","ComposeModifier",true,false],["floatingActionButton","ReactNode",true,true],["containerColor","string",true,false],["contentColor","string",true,false],["tonalElevation","number",true,false],["contentPadding","object",true,false],["windowInsets","object",true,false]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63] },
  ],
});

export type BottomSheetScaffoldProps =
  | {
    sheetContent: ReactNode;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    sheetPeekHeight?: number;
    sheetMaxWidth?: number;
    sheetContainerColor?: string;
    sheetContentColor?: string;
    contentColor?: string;
    children?: ReactNode;
    scaffoldState?: never;
    sheetShape?: never;
    sheetTonalElevation?: never;
    sheetShadowElevation?: never;
    sheetDragHandle?: never;
    sheetSwipeEnabled?: never;
    topBar?: never;
    containerColor?: never;
    }
  | {
    sheetContent: ReactNode;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    sheetPeekHeight?: number;
    sheetMaxWidth?: number;
    sheetContainerColor?: string;
    sheetContentColor?: string;
    containerColor: string;
    children?: ReactNode;
    scaffoldState?: never;
    sheetShape?: never;
    sheetTonalElevation?: never;
    sheetShadowElevation?: never;
    sheetDragHandle?: never;
    sheetSwipeEnabled?: never;
    topBar?: never;
    contentColor?: never;
    }
  | {
    sheetContent: ReactNode;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    sheetPeekHeight?: number;
    sheetMaxWidth?: number;
    sheetContainerColor?: string;
    sheetContentColor?: string;
    topBar: ReactNode;
    children?: ReactNode;
    scaffoldState?: never;
    sheetShape?: never;
    sheetTonalElevation?: never;
    sheetShadowElevation?: never;
    sheetDragHandle?: never;
    sheetSwipeEnabled?: never;
    containerColor?: never;
    contentColor?: never;
    }
  | {
    sheetContent: ReactNode;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    sheetPeekHeight?: number;
    sheetMaxWidth?: number;
    sheetContainerColor?: string;
    sheetContentColor?: string;
    sheetSwipeEnabled: boolean;
    children?: ReactNode;
    scaffoldState?: never;
    sheetShape?: never;
    sheetTonalElevation?: never;
    sheetShadowElevation?: never;
    sheetDragHandle?: never;
    topBar?: never;
    containerColor?: never;
    contentColor?: never;
    }
  | {
    sheetContent: ReactNode;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    sheetPeekHeight?: number;
    sheetMaxWidth?: number;
    sheetContainerColor?: string;
    sheetContentColor?: string;
    sheetDragHandle: ReactNode;
    children?: ReactNode;
    scaffoldState?: never;
    sheetShape?: never;
    sheetTonalElevation?: never;
    sheetShadowElevation?: never;
    sheetSwipeEnabled?: never;
    topBar?: never;
    containerColor?: never;
    contentColor?: never;
    }
  | {
    sheetContent: ReactNode;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    sheetPeekHeight?: number;
    sheetMaxWidth?: number;
    sheetContainerColor?: string;
    sheetContentColor?: string;
    sheetShadowElevation: number;
    children?: ReactNode;
    scaffoldState?: never;
    sheetShape?: never;
    sheetTonalElevation?: never;
    sheetDragHandle?: never;
    sheetSwipeEnabled?: never;
    topBar?: never;
    containerColor?: never;
    contentColor?: never;
    }
  | {
    sheetContent: ReactNode;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    sheetPeekHeight?: number;
    sheetMaxWidth?: number;
    sheetContainerColor?: string;
    sheetContentColor?: string;
    sheetTonalElevation: number;
    children?: ReactNode;
    scaffoldState?: never;
    sheetShape?: never;
    sheetShadowElevation?: never;
    sheetDragHandle?: never;
    sheetSwipeEnabled?: never;
    topBar?: never;
    containerColor?: never;
    contentColor?: never;
    }
  | {
    sheetContent: ReactNode;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    sheetPeekHeight?: number;
    sheetMaxWidth?: number;
    sheetShape: ComposeShape;
    sheetContainerColor?: string;
    sheetContentColor?: string;
    children?: ReactNode;
    scaffoldState?: never;
    sheetTonalElevation?: never;
    sheetShadowElevation?: never;
    sheetDragHandle?: never;
    sheetSwipeEnabled?: never;
    topBar?: never;
    containerColor?: never;
    contentColor?: never;
    }
  | {
    sheetContent: ReactNode;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    scaffoldState: ComposeBottomSheetScaffoldState;
    sheetPeekHeight?: number;
    sheetMaxWidth?: number;
    sheetContainerColor?: string;
    sheetContentColor?: string;
    children?: ReactNode;
    sheetShape?: never;
    sheetTonalElevation?: never;
    sheetShadowElevation?: never;
    sheetDragHandle?: never;
    sheetSwipeEnabled?: never;
    topBar?: never;
    containerColor?: never;
    contentColor?: never;
    }
  | {
    sheetContent: ReactNode;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    scaffoldState: ComposeBottomSheetScaffoldState;
    sheetPeekHeight: number;
    sheetMaxWidth: number;
    sheetShape: ComposeShape;
    sheetContainerColor: string;
    sheetContentColor: string;
    sheetTonalElevation: number;
    sheetShadowElevation: number;
    sheetDragHandle: ReactNode;
    sheetSwipeEnabled: boolean;
    topBar: ReactNode;
    containerColor: string;
    contentColor: string;
    children?: ReactNode;
    }
;
export const BottomSheetScaffold = createComposableComponent<BottomSheetScaffoldProps>({
  name: "BottomSheetScaffold",
  props: ["modifier","scaffoldState","sheetPeekHeight","sheetMaxWidth","sheetShape","sheetContainerColor","sheetContentColor","sheetTonalElevation","sheetShadowElevation","sheetSwipeEnabled","containerColor","contentColor"],
  objectProps: ["scaffoldState","sheetShape"],
  slots: ["sheetContent","sheetDragHandle","topBar"],
  children: true,
  overloads: [
    { id: "BottomSheetScaffold", children: true, parameters: [["sheetContent","ReactNode",false,false],["modifier","ComposeModifier",true,false],["scaffoldState","object",true,false],["sheetPeekHeight","number",true,false],["sheetMaxWidth","number",true,false],["sheetShape","shape",true,false],["sheetContainerColor","string",true,false],["sheetContentColor","string",true,false],["sheetTonalElevation","number",true,false],["sheetShadowElevation","number",true,false],["sheetDragHandle","ReactNode",true,true],["sheetSwipeEnabled","boolean",true,false],["topBar","ReactNode",true,true],["containerColor","string",true,false],["contentColor","string",true,false]], masks: [0,1,2,3,4,5,6,7,8,10,12,14,16,17,18,19,20,21,22,23,24,26,28,30,32,33,34,35,36,37,38,39,40,42,44,46,48,49,50,51,52,53,54,55,56,58,60,62,64,66,68,70,80,82,84,86,96,98,100,102,112,114,116,118,128,130,132,134,144,146,148,150,160,162,164,166,176,178,180,182,256,258,260,262,272,274,276,278,288,290,292,294,304,306,308,310,512,514,516,518,528,530,532,534,544,546,548,550,560,562,564,566,1024,1026,1028,1030,1040,1042,1044,1046,1056,1058,1060,1062,1072,1074,1076,1078,2048,2050,2052,2054,2064,2066,2068,2070,2080,2082,2084,2086,2096,2098,2100,2102,4096,4098,4100,4102,4112,4114,4116,4118,4128,4130,4132,4134,4144,4146,4148,4150,8191] },
  ],
});

export interface BoxProps {
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  contentAlignment?: ComposeAlignment;
  propagateMinConstraints?: boolean;
  children?: ReactNode;
}
export const Box = createComposableComponent<BoxProps>({
  name: "Box",
  props: ["modifier","contentAlignment","propagateMinConstraints"],
  children: true,
});

export interface BoxWithConstraintsProps {
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  contentAlignment?: ComposeAlignment;
  propagateMinConstraints?: boolean;
  children?: ReactNode;
}
export const BoxWithConstraints = createComposableComponent<BoxWithConstraintsProps>({
  name: "BoxWithConstraints",
  props: ["modifier","contentAlignment","propagateMinConstraints"],
  children: true,
});

export interface ButtonProps {
  onClick: () => void;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  enabled?: boolean;
  shape?: ComposeShape;
  contentPadding?: ComposePaddingValues;
  interactionSource?: ComposeInteractionSource | null;
  children?: ReactNode;
}
export const Button = createComposableComponent<ButtonProps>({
  name: "Button",
  props: ["modifier","enabled","shape","contentPadding","interactionSource"],
  objectProps: ["shape","contentPadding","interactionSource"],
  events: ["onClick"],
  children: true,
});

export type CardProps =
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    shape?: ComposeShape;
    children?: ReactNode;
    onClick?: never;
    enabled?: never;
    interactionSource?: never;
    }
  | {
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    shape?: ComposeShape;
    interactionSource?: ComposeInteractionSource | null;
    children?: ReactNode;
    }
;
export const Card = createComposableComponent<CardProps>({
  name: "Card",
  props: ["modifier","shape","enabled","interactionSource"],
  objectProps: ["shape","interactionSource"],
  events: ["onClick"],
  children: true,
  overloads: [
    { id: "Card", children: true, parameters: [["modifier","ComposeModifier",true,false],["shape","shape",true,false]], masks: [0,1] },
    { id: "Card#1", children: true, parameters: [["onClick","function",false,false],["modifier","ComposeModifier",true,false],["enabled","boolean",true,false],["shape","shape",true,false],["interactionSource","object",true,true]], masks: [0,1,2,3,4,5,6,7] },
  ],
});

export interface CenterAlignedTopAppBarProps {
  title: ReactNode;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  navigationIcon?: ReactNode;
  actions?: ReactNode;
  expandedHeight?: number;
  windowInsets?: ComposeWindowInsets;
}
export const CenterAlignedTopAppBar = createComposableComponent<CenterAlignedTopAppBarProps>({
  name: "CenterAlignedTopAppBar",
  props: ["modifier","expandedHeight","windowInsets"],
  objectProps: ["windowInsets"],
  slots: ["title","navigationIcon","actions"],
  children: false,
});

export interface CheckboxProps {
  checked: boolean;
  onCheckedChange: ((value: boolean) => void) | null;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  enabled?: boolean;
  interactionSource?: ComposeInteractionSource | null;
}
export const Checkbox = createComposableComponent<CheckboxProps>({
  name: "Checkbox",
  props: ["checked","modifier","enabled","interactionSource"],
  objectProps: ["interactionSource"],
  events: ["onCheckedChange"],
  children: false,
});

export type CircularProgressIndicatorProps =
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color?: string;
    strokeWidth?: number;
    trackColor?: string;
    gapSize?: number;
    progress?: never;
    }
  | {
    progress: number;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color?: string;
    strokeWidth?: number;
    trackColor?: string;
    gapSize?: number;
    }
;
export const CircularProgressIndicator = createComposableComponent<CircularProgressIndicatorProps>({
  name: "CircularProgressIndicator",
  props: ["modifier","color","strokeWidth","trackColor","gapSize","progress"],
  children: false,
  overloads: [
    { id: "CircularProgressIndicator", children: false, parameters: [["modifier","ComposeModifier",true,false],["color","string",true,false],["strokeWidth","number",true,false],["trackColor","string",true,false],["gapSize","number",true,false]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15] },
    { id: "CircularProgressIndicator#1", children: false, parameters: [["progress","number",false,false],["modifier","ComposeModifier",true,false],["color","string",true,false],["strokeWidth","number",true,false],["trackColor","string",true,false],["gapSize","number",true,false]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15] },
  ],
});

export type CircularWavyProgressIndicatorProps =
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color?: string;
    trackColor?: string;
    gapSize?: number;
    amplitude?: number;
    wavelength?: number;
    waveSpeed?: number;
    progress?: never;
    }
  | {
    progress: number;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color?: string;
    trackColor?: string;
    gapSize?: number;
    wavelength?: number;
    waveSpeed?: number;
    amplitude?: never;
    }
;
export const CircularWavyProgressIndicator = createComposableComponent<CircularWavyProgressIndicatorProps>({
  name: "CircularWavyProgressIndicator",
  props: ["modifier","color","trackColor","gapSize","amplitude","wavelength","waveSpeed","progress"],
  children: false,
  overloads: [
    { id: "CircularWavyProgressIndicator", children: false, parameters: [["modifier","ComposeModifier",true,false],["color","string",true,false],["trackColor","string",true,false],["gapSize","number",true,false],["amplitude","number",true,false],["wavelength","number",true,false],["waveSpeed","number",true,false]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63] },
    { id: "CircularWavyProgressIndicator#1", children: false, parameters: [["progress","number",false,false],["modifier","ComposeModifier",true,false],["color","string",true,false],["trackColor","string",true,false],["gapSize","number",true,false],["wavelength","number",true,false],["waveSpeed","number",true,false]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31] },
  ],
});

export interface ClickableTextProps {
  text: ComposeAnnotatedString;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  composeTextStyle?: ComposeTextStyle;
  softWrap?: boolean;
  overflow?: ComposeTextOverflow;
  maxLines?: number;
  onClick: (value: number) => void;
}
export const ClickableText = createComposableComponent<ClickableTextProps>({
  name: "ClickableText",
  props: ["text","modifier","composeTextStyle","softWrap","overflow","maxLines"],
  objectProps: ["text","composeTextStyle"],
  events: ["onClick"],
  children: false,
});

export interface ColumnProps {
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  verticalArrangement?: ComposeVerticalArrangement;
  horizontalAlignment?: ComposeHorizontalAlignment;
  children?: ReactNode;
}
export const Column = createComposableComponent<ColumnProps>({
  name: "Column",
  props: ["modifier","verticalArrangement","horizontalAlignment"],
  children: true,
});

export interface CompositionLocalProviderProps {
  children?: ReactNode;
}
export const CompositionLocalProvider = createComposableComponent<CompositionLocalProviderProps>({
  name: "CompositionLocalProvider",
  props: [],
  children: true,
});

export type ContainedLoadingIndicatorProps =
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    containerColor?: string;
    indicatorColor?: string;
    containerShape?: ComposeShape;
    progress?: never;
    }
  | {
    progress: number;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    containerColor?: string;
    indicatorColor?: string;
    containerShape?: ComposeShape;
    }
;
export const ContainedLoadingIndicator = createComposableComponent<ContainedLoadingIndicatorProps>({
  name: "ContainedLoadingIndicator",
  props: ["modifier","containerColor","indicatorColor","containerShape","progress"],
  objectProps: ["containerShape"],
  children: false,
  overloads: [
    { id: "ContainedLoadingIndicator", children: false, parameters: [["modifier","ComposeModifier",true,false],["containerColor","string",true,false],["indicatorColor","string",true,false],["containerShape","shape",true,false]], masks: [0,1,2,3,4,5,6,7] },
    { id: "ContainedLoadingIndicator#1", children: false, parameters: [["progress","number",false,false],["modifier","ComposeModifier",true,false],["containerColor","string",true,false],["indicatorColor","string",true,false],["containerShape","shape",true,false]], masks: [0,1,2,3,4,5,6,7] },
  ],
});

export type ContainerProps =
  | {
    enabled: boolean;
    isError: boolean;
    interactionSource: ComposeInteractionSource;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    shape?: ComposeShape;
    focusedBorderThickness?: number;
    unfocusedBorderThickness?: number;
    focusedIndicatorLineThickness?: never;
    unfocusedIndicatorLineThickness?: never;
    }
  | {
    enabled: boolean;
    isError: boolean;
    interactionSource: ComposeInteractionSource;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    shape?: ComposeShape;
    unfocusedIndicatorLineThickness: number;
    focusedBorderThickness?: never;
    unfocusedBorderThickness?: never;
    focusedIndicatorLineThickness?: never;
    }
  | {
    enabled: boolean;
    isError: boolean;
    interactionSource: ComposeInteractionSource;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    shape?: ComposeShape;
    focusedIndicatorLineThickness: number;
    unfocusedIndicatorLineThickness?: number;
    focusedBorderThickness?: never;
    unfocusedBorderThickness?: never;
    }
;
export const Container = createComposableComponent<ContainerProps>({
  name: "Container",
  props: ["enabled","isError","interactionSource","modifier","shape","focusedBorderThickness","unfocusedBorderThickness","focusedIndicatorLineThickness","unfocusedIndicatorLineThickness"],
  objectProps: ["interactionSource","shape"],
  children: false,
  overloads: [
    { id: "Container", children: false, parameters: [["enabled","boolean",false,false],["isError","boolean",false,false],["interactionSource","object",false,false],["modifier","ComposeModifier",true,false],["shape","shape",true,false],["focusedBorderThickness","number",true,false],["unfocusedBorderThickness","number",true,false]], masks: [0,1,2,3,4,5,6,7] },
    { id: "Container#1", children: false, parameters: [["enabled","boolean",false,false],["isError","boolean",false,false],["interactionSource","object",false,false],["modifier","ComposeModifier",true,false],["shape","shape",true,false],["focusedIndicatorLineThickness","number",true,false],["unfocusedIndicatorLineThickness","number",true,false]], masks: [2,3,4,5,6,7] },
  ],
});

export interface ContainerBoxProps {
  enabled: boolean;
  isError: boolean;
  interactionSource: ComposeInteractionSource;
  shape?: ComposeShape;
  focusedBorderThickness?: number;
  unfocusedBorderThickness?: number;
}
export const ContainerBox = createComposableComponent<ContainerBoxProps>({
  name: "ContainerBox",
  props: ["enabled","isError","interactionSource","shape","focusedBorderThickness","unfocusedBorderThickness"],
  objectProps: ["interactionSource","shape"],
  children: false,
});

export interface CustomizedLookaheadAnimationVisualDebuggingProps {
  debugColor: string;
  children?: ReactNode;
}
export const CustomizedLookaheadAnimationVisualDebugging = createComposableComponent<CustomizedLookaheadAnimationVisualDebuggingProps>({
  name: "CustomizedLookaheadAnimationVisualDebugging",
  props: ["debugColor"],
  children: true,
});

export interface DatePickerProps {
  state: ComposeDatePickerState;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  dateFormatter?: ComposeDatePickerFormatter;
  title?: ReactNode;
  headline?: ReactNode;
  showModeToggle?: boolean;
  focusRequester?: ComposeFocusRequester | null;
}
export const DatePicker = createComposableComponent<DatePickerProps>({
  name: "DatePicker",
  props: ["state","modifier","dateFormatter","showModeToggle","focusRequester"],
  objectProps: ["state","dateFormatter","focusRequester"],
  slots: ["title","headline"],
  children: false,
});

export interface DatePickerDialogProps {
  onDismissRequest: () => void;
  confirmButton: ReactNode;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  dismissButton?: ReactNode;
  shape?: ComposeShape;
  tonalElevation?: number;
  children?: ReactNode;
}
export const DatePickerDialog = createComposableComponent<DatePickerDialogProps>({
  name: "DatePickerDialog",
  props: ["modifier","shape","tonalElevation"],
  objectProps: ["shape"],
  slots: ["confirmButton","dismissButton"],
  events: ["onDismissRequest"],
  children: true,
});

export interface DatePickerHeadlineProps {
  selectedDateMillis: number | null;
  displayMode: ComposeDisplayMode;
  dateFormatter: ComposeDatePickerFormatter;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  contentColor?: string;
}
export const DatePickerHeadline = createComposableComponent<DatePickerHeadlineProps>({
  name: "DatePickerHeadline",
  props: ["selectedDateMillis","displayMode","dateFormatter","modifier","contentColor"],
  objectProps: ["dateFormatter"],
  children: false,
});

export interface DatePickerTitleProps {
  displayMode: ComposeDisplayMode;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  contentColor?: string;
}
export const DatePickerTitle = createComposableComponent<DatePickerTitleProps>({
  name: "DatePickerTitle",
  props: ["displayMode","modifier","contentColor"],
  children: false,
});

export interface DateRangePickerProps {
  state: ComposeDateRangePickerState;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  dateFormatter?: ComposeDatePickerFormatter;
  title?: ReactNode;
  headline?: ReactNode;
  showModeToggle?: boolean;
  focusRequester?: ComposeFocusRequester | null;
}
export const DateRangePicker = createComposableComponent<DateRangePickerProps>({
  name: "DateRangePicker",
  props: ["state","modifier","dateFormatter","showModeToggle","focusRequester"],
  objectProps: ["state","dateFormatter","focusRequester"],
  slots: ["title","headline"],
  children: false,
});

export interface DateRangePickerHeadlineProps {
  selectedStartDateMillis: number | null;
  selectedEndDateMillis: number | null;
  displayMode: ComposeDisplayMode;
  dateFormatter: ComposeDatePickerFormatter;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  contentColor?: string;
}
export const DateRangePickerHeadline = createComposableComponent<DateRangePickerHeadlineProps>({
  name: "DateRangePickerHeadline",
  props: ["selectedStartDateMillis","selectedEndDateMillis","displayMode","dateFormatter","modifier","contentColor"],
  objectProps: ["dateFormatter"],
  children: false,
});

export interface DateRangePickerTitleProps {
  displayMode: ComposeDisplayMode;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  contentColor?: string;
}
export const DateRangePickerTitle = createComposableComponent<DateRangePickerTitleProps>({
  name: "DateRangePickerTitle",
  props: ["displayMode","modifier","contentColor"],
  children: false,
});

export interface DialogProps {
  onDismissRequest: () => void;
  children?: ReactNode;
}
export const Dialog = createComposableComponent<DialogProps>({
  name: "Dialog",
  props: [],
  events: ["onDismissRequest"],
  children: true,
});

export interface DisableSelectionProps {
  children?: ReactNode;
}
export const DisableSelection = createComposableComponent<DisableSelectionProps>({
  name: "DisableSelection",
  props: [],
  children: true,
});

export interface DismissibleDrawerSheetProps {
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  drawerShape?: ComposeShape;
  drawerContainerColor?: string;
  drawerContentColor?: string;
  drawerTonalElevation?: number;
  windowInsets?: ComposeWindowInsets;
  children?: ReactNode;
}
export const DismissibleDrawerSheet = createComposableComponent<DismissibleDrawerSheetProps>({
  name: "DismissibleDrawerSheet",
  props: ["modifier","drawerShape","drawerContainerColor","drawerContentColor","drawerTonalElevation","windowInsets"],
  objectProps: ["drawerShape","windowInsets"],
  children: true,
});

export interface DismissibleNavigationDrawerProps {
  drawerContent: ReactNode;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  gesturesEnabled?: boolean;
  children?: ReactNode;
}
export const DismissibleNavigationDrawer = createComposableComponent<DismissibleNavigationDrawerProps>({
  name: "DismissibleNavigationDrawer",
  props: ["modifier","gesturesEnabled"],
  slots: ["drawerContent"],
  children: true,
});

export interface DividerProps {
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  thickness?: number;
  color?: string;
}
export const Divider = createComposableComponent<DividerProps>({
  name: "Divider",
  props: ["modifier","thickness","color"],
  children: false,
});

export interface DockedSearchBarProps {
  inputField: ReactNode;
  expanded: boolean;
  onExpandedChange: (value: boolean) => void;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  shape?: ComposeShape;
  tonalElevation?: number;
  shadowElevation?: number;
  children?: ReactNode;
}
export const DockedSearchBar = createComposableComponent<DockedSearchBarProps>({
  name: "DockedSearchBar",
  props: ["expanded","modifier","shape","tonalElevation","shadowElevation"],
  objectProps: ["shape"],
  slots: ["inputField"],
  events: ["onExpandedChange"],
  children: true,
});

export interface DragHandleProps {
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  width?: number;
  height?: number;
  shape?: ComposeShape;
  color?: string;
}
export const DragHandle = createComposableComponent<DragHandleProps>({
  name: "DragHandle",
  props: ["modifier","width","height","shape","color"],
  objectProps: ["shape"],
  children: false,
});

export interface DropdownMenuProps {
  expanded: boolean;
  onDismissRequest: () => void;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  offset?: ComposeDpOffset;
  shape?: ComposeShape;
  containerColor?: string;
  tonalElevation?: number;
  shadowElevation?: number;
  children?: ReactNode;
}
export const DropdownMenu = createComposableComponent<DropdownMenuProps>({
  name: "DropdownMenu",
  props: ["expanded","modifier","offset","shape","containerColor","tonalElevation","shadowElevation"],
  objectProps: ["offset","shape"],
  events: ["onDismissRequest"],
  children: true,
});

export interface DropdownMenuItemProps {
  text: ReactNode;
  onClick: () => void;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  leadingIcon?: ReactNode;
  trailingIcon?: ReactNode;
  enabled?: boolean;
  contentPadding?: ComposePaddingValues;
  interactionSource?: ComposeInteractionSource | null;
}
export const DropdownMenuItem = createComposableComponent<DropdownMenuItemProps>({
  name: "DropdownMenuItem",
  props: ["modifier","enabled","contentPadding","interactionSource"],
  objectProps: ["contentPadding","interactionSource"],
  slots: ["text","leadingIcon","trailingIcon"],
  events: ["onClick"],
  children: false,
});

export interface ElevatedAssistChipProps {
  onClick: () => void;
  label: ReactNode;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  enabled?: boolean;
  leadingIcon?: ReactNode;
  trailingIcon?: ReactNode;
  shape?: ComposeShape;
  interactionSource?: ComposeInteractionSource | null;
}
export const ElevatedAssistChip = createComposableComponent<ElevatedAssistChipProps>({
  name: "ElevatedAssistChip",
  props: ["modifier","enabled","shape","interactionSource"],
  objectProps: ["shape","interactionSource"],
  slots: ["label","leadingIcon","trailingIcon"],
  events: ["onClick"],
  children: false,
});

export interface ElevatedButtonProps {
  onClick: () => void;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  enabled?: boolean;
  shape?: ComposeShape;
  contentPadding?: ComposePaddingValues;
  interactionSource?: ComposeInteractionSource | null;
  children?: ReactNode;
}
export const ElevatedButton = createComposableComponent<ElevatedButtonProps>({
  name: "ElevatedButton",
  props: ["modifier","enabled","shape","contentPadding","interactionSource"],
  objectProps: ["shape","contentPadding","interactionSource"],
  events: ["onClick"],
  children: true,
});

export type ElevatedCardProps =
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    shape?: ComposeShape;
    children?: ReactNode;
    onClick?: never;
    enabled?: never;
    interactionSource?: never;
    }
  | {
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    shape?: ComposeShape;
    interactionSource?: ComposeInteractionSource | null;
    children?: ReactNode;
    }
;
export const ElevatedCard = createComposableComponent<ElevatedCardProps>({
  name: "ElevatedCard",
  props: ["modifier","shape","enabled","interactionSource"],
  objectProps: ["shape","interactionSource"],
  events: ["onClick"],
  children: true,
  overloads: [
    { id: "ElevatedCard", children: true, parameters: [["modifier","ComposeModifier",true,false],["shape","shape",true,false]], masks: [0,1] },
    { id: "ElevatedCard#1", children: true, parameters: [["onClick","function",false,false],["modifier","ComposeModifier",true,false],["enabled","boolean",true,false],["shape","shape",true,false],["interactionSource","object",true,true]], masks: [0,1,2,3,4,5,6,7] },
  ],
});

export interface ElevatedFilterChipProps {
  selected: boolean;
  onClick: () => void;
  label: ReactNode;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  enabled?: boolean;
  leadingIcon?: ReactNode;
  trailingIcon?: ReactNode;
  shape?: ComposeShape;
  interactionSource?: ComposeInteractionSource | null;
}
export const ElevatedFilterChip = createComposableComponent<ElevatedFilterChipProps>({
  name: "ElevatedFilterChip",
  props: ["selected","modifier","enabled","shape","interactionSource"],
  objectProps: ["shape","interactionSource"],
  slots: ["label","leadingIcon","trailingIcon"],
  events: ["onClick"],
  children: false,
});

export interface ElevatedLeadingButtonProps {
  onClick: () => void;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  enabled?: boolean;
  contentPadding?: ComposePaddingValues;
  interactionSource?: ComposeInteractionSource | null;
  children?: ReactNode;
}
export const ElevatedLeadingButton = createComposableComponent<ElevatedLeadingButtonProps>({
  name: "ElevatedLeadingButton",
  props: ["modifier","enabled","contentPadding","interactionSource"],
  objectProps: ["contentPadding","interactionSource"],
  events: ["onClick"],
  children: true,
});

export interface ElevatedSuggestionChipProps {
  onClick: () => void;
  label: ReactNode;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  enabled?: boolean;
  icon?: ReactNode;
  shape?: ComposeShape;
  interactionSource?: ComposeInteractionSource | null;
}
export const ElevatedSuggestionChip = createComposableComponent<ElevatedSuggestionChipProps>({
  name: "ElevatedSuggestionChip",
  props: ["modifier","enabled","shape","interactionSource"],
  objectProps: ["shape","interactionSource"],
  slots: ["label","icon"],
  events: ["onClick"],
  children: false,
});

export interface ElevatedToggleButtonProps {
  checked: boolean;
  onCheckedChange: (value: boolean) => void;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  enabled?: boolean;
  contentPadding?: ComposePaddingValues;
  interactionSource?: ComposeInteractionSource | null;
  children?: ReactNode;
}
export const ElevatedToggleButton = createComposableComponent<ElevatedToggleButtonProps>({
  name: "ElevatedToggleButton",
  props: ["checked","modifier","enabled","contentPadding","interactionSource"],
  objectProps: ["contentPadding","interactionSource"],
  events: ["onCheckedChange"],
  children: true,
});

export interface ElevatedTrailingButtonProps {
  checked: boolean;
  onCheckedChange: (value: boolean) => void;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  enabled?: boolean;
  contentPadding?: ComposePaddingValues;
  interactionSource?: ComposeInteractionSource | null;
  children?: ReactNode;
}
export const ElevatedTrailingButton = createComposableComponent<ElevatedTrailingButtonProps>({
  name: "ElevatedTrailingButton",
  props: ["checked","modifier","enabled","contentPadding","interactionSource"],
  objectProps: ["contentPadding","interactionSource"],
  events: ["onCheckedChange"],
  children: true,
});

export interface ExpandedDockedSearchBarProps {
  state: ComposeSearchBarState;
  inputField: ReactNode;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  shape?: ComposeShape;
  tonalElevation?: number;
  shadowElevation?: number;
  children?: ReactNode;
}
export const ExpandedDockedSearchBar = createComposableComponent<ExpandedDockedSearchBarProps>({
  name: "ExpandedDockedSearchBar",
  props: ["state","modifier","shape","tonalElevation","shadowElevation"],
  objectProps: ["state","shape"],
  slots: ["inputField"],
  children: true,
});

export interface ExpandedFullScreenSearchBarProps {
  state: ComposeSearchBarState;
  inputField: ReactNode;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  collapsedShape?: ComposeShape;
  tonalElevation?: number;
  shadowElevation?: number;
  windowInsets?: ComposeWindowInsets;
  children?: ReactNode;
}
export const ExpandedFullScreenSearchBar = createComposableComponent<ExpandedFullScreenSearchBarProps>({
  name: "ExpandedFullScreenSearchBar",
  props: ["state","modifier","collapsedShape","tonalElevation","shadowElevation","windowInsets"],
  objectProps: ["state","collapsedShape","windowInsets"],
  slots: ["inputField"],
  children: true,
});

export interface ExposedDropdownMenuProps {
  expanded: boolean;
  onDismissRequest: () => void;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  matchAnchorWidth?: boolean;
  shape?: ComposeShape;
  containerColor?: string;
  tonalElevation?: number;
  shadowElevation?: number;
  children?: ReactNode;
}
export const ExposedDropdownMenu = createComposableComponent<ExposedDropdownMenuProps>({
  name: "ExposedDropdownMenu",
  props: ["expanded","modifier","matchAnchorWidth","shape","containerColor","tonalElevation","shadowElevation"],
  objectProps: ["shape"],
  events: ["onDismissRequest"],
  children: true,
});

export interface ExposedDropdownMenuBoxProps {
  expanded: boolean;
  onExpandedChange: (value: boolean) => void;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  children?: ReactNode;
}
export const ExposedDropdownMenuBox = createComposableComponent<ExposedDropdownMenuBoxProps>({
  name: "ExposedDropdownMenuBox",
  props: ["expanded","modifier"],
  events: ["onExpandedChange"],
  children: true,
});

export type ExtendedFloatingActionButtonProps =
  | {
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    shape?: ComposeShape;
    containerColor?: string;
    contentColor?: string;
    interactionSource?: ComposeInteractionSource | null;
    children?: ReactNode;
    text?: never;
    icon?: never;
    expanded?: never;
    }
  | {
    text: ReactNode;
    icon: ReactNode;
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    expanded?: boolean;
    shape?: ComposeShape;
    containerColor?: string;
    contentColor?: string;
    interactionSource?: ComposeInteractionSource | null;
    children?: never;
    }
;
export const ExtendedFloatingActionButton = createComposableComponent<ExtendedFloatingActionButtonProps>({
  name: "ExtendedFloatingActionButton",
  props: ["modifier","shape","containerColor","contentColor","interactionSource","expanded"],
  objectProps: ["shape","interactionSource"],
  slots: ["text","icon"],
  events: ["onClick"],
  children: true,
  overloads: [
    { id: "ExtendedFloatingActionButton", children: true, parameters: [["onClick","function",false,false],["modifier","ComposeModifier",true,false],["shape","shape",true,false],["containerColor","string",true,false],["contentColor","string",true,false],["interactionSource","object",true,true]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15] },
    { id: "ExtendedFloatingActionButton#1", children: false, parameters: [["text","ReactNode",false,false],["icon","ReactNode",false,false],["onClick","function",false,false],["modifier","ComposeModifier",true,false],["expanded","boolean",true,false],["shape","shape",true,false],["containerColor","string",true,false],["contentColor","string",true,false],["interactionSource","object",true,true]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31] },
  ],
});

export interface FilledIconButtonProps {
  onClick: () => void;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  enabled?: boolean;
  shape?: ComposeShape;
  interactionSource?: ComposeInteractionSource | null;
  children?: ReactNode;
}
export const FilledIconButton = createComposableComponent<FilledIconButtonProps>({
  name: "FilledIconButton",
  props: ["modifier","enabled","shape","interactionSource"],
  objectProps: ["shape","interactionSource"],
  events: ["onClick"],
  children: true,
});

export interface FilledIconToggleButtonProps {
  checked: boolean;
  onCheckedChange: (value: boolean) => void;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  enabled?: boolean;
  shape?: ComposeShape;
  interactionSource?: ComposeInteractionSource | null;
  children?: ReactNode;
}
export const FilledIconToggleButton = createComposableComponent<FilledIconToggleButtonProps>({
  name: "FilledIconToggleButton",
  props: ["checked","modifier","enabled","shape","interactionSource"],
  objectProps: ["shape","interactionSource"],
  events: ["onCheckedChange"],
  children: true,
});

export interface FilledTonalButtonProps {
  onClick: () => void;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  enabled?: boolean;
  shape?: ComposeShape;
  contentPadding?: ComposePaddingValues;
  interactionSource?: ComposeInteractionSource | null;
  children?: ReactNode;
}
export const FilledTonalButton = createComposableComponent<FilledTonalButtonProps>({
  name: "FilledTonalButton",
  props: ["modifier","enabled","shape","contentPadding","interactionSource"],
  objectProps: ["shape","contentPadding","interactionSource"],
  events: ["onClick"],
  children: true,
});

export interface FilledTonalIconButtonProps {
  onClick: () => void;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  enabled?: boolean;
  shape?: ComposeShape;
  interactionSource?: ComposeInteractionSource | null;
  children?: ReactNode;
}
export const FilledTonalIconButton = createComposableComponent<FilledTonalIconButtonProps>({
  name: "FilledTonalIconButton",
  props: ["modifier","enabled","shape","interactionSource"],
  objectProps: ["shape","interactionSource"],
  events: ["onClick"],
  children: true,
});

export interface FilledTonalIconToggleButtonProps {
  checked: boolean;
  onCheckedChange: (value: boolean) => void;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  enabled?: boolean;
  shape?: ComposeShape;
  interactionSource?: ComposeInteractionSource | null;
  children?: ReactNode;
}
export const FilledTonalIconToggleButton = createComposableComponent<FilledTonalIconToggleButtonProps>({
  name: "FilledTonalIconToggleButton",
  props: ["checked","modifier","enabled","shape","interactionSource"],
  objectProps: ["shape","interactionSource"],
  events: ["onCheckedChange"],
  children: true,
});

export interface FilterChipProps {
  selected: boolean;
  onClick: () => void;
  label: ReactNode;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  enabled?: boolean;
  leadingIcon?: ReactNode;
  trailingIcon?: ReactNode;
  shape?: ComposeShape;
  interactionSource?: ComposeInteractionSource | null;
}
export const FilterChip = createComposableComponent<FilterChipProps>({
  name: "FilterChip",
  props: ["selected","modifier","enabled","shape","interactionSource"],
  objectProps: ["shape","interactionSource"],
  slots: ["label","leadingIcon","trailingIcon"],
  events: ["onClick"],
  children: false,
});

export interface FlexibleBottomAppBarProps {
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  containerColor?: string;
  contentColor?: string;
  contentPadding?: ComposePaddingValues;
  horizontalArrangement?: ComposeHorizontalArrangement;
  expandedHeight?: number;
  windowInsets?: ComposeWindowInsets;
  children?: ReactNode;
}
export const FlexibleBottomAppBar = createComposableComponent<FlexibleBottomAppBarProps>({
  name: "FlexibleBottomAppBar",
  props: ["modifier","containerColor","contentColor","contentPadding","horizontalArrangement","expandedHeight","windowInsets"],
  objectProps: ["contentPadding","windowInsets"],
  children: true,
});

export interface FloatingActionButtonProps {
  onClick: () => void;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  shape?: ComposeShape;
  containerColor?: string;
  contentColor?: string;
  interactionSource?: ComposeInteractionSource | null;
  children?: ReactNode;
}
export const FloatingActionButton = createComposableComponent<FloatingActionButtonProps>({
  name: "FloatingActionButton",
  props: ["modifier","shape","containerColor","contentColor","interactionSource"],
  objectProps: ["shape","interactionSource"],
  events: ["onClick"],
  children: true,
});

export interface FloatingActionButtonMenuProps {
  expanded: boolean;
  button: ReactNode;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  horizontalAlignment?: ComposeHorizontalAlignment;
  children?: ReactNode;
}
export const FloatingActionButtonMenu = createComposableComponent<FloatingActionButtonMenuProps>({
  name: "FloatingActionButtonMenu",
  props: ["expanded","modifier","horizontalAlignment"],
  slots: ["button"],
  children: true,
});

export interface FlowColumnProps {
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  verticalArrangement?: ComposeVerticalArrangement;
  horizontalArrangement?: ComposeHorizontalArrangement;
  itemHorizontalAlignment?: ComposeHorizontalAlignment;
  maxItemsInEachColumn?: number;
  maxLines?: number;
  children?: ReactNode;
}
export const FlowColumn = createComposableComponent<FlowColumnProps>({
  name: "FlowColumn",
  props: ["modifier","verticalArrangement","horizontalArrangement","itemHorizontalAlignment","maxItemsInEachColumn","maxLines"],
  children: true,
});

export interface FlowRowProps {
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  horizontalArrangement?: ComposeHorizontalArrangement;
  verticalArrangement?: ComposeVerticalArrangement;
  itemVerticalAlignment?: ComposeVerticalAlignment;
  maxItemsInEachRow?: number;
  maxLines?: number;
  children?: ReactNode;
}
export const FlowRow = createComposableComponent<FlowRowProps>({
  name: "FlowRow",
  props: ["modifier","horizontalArrangement","verticalArrangement","itemVerticalAlignment","maxItemsInEachRow","maxLines"],
  children: true,
});

export interface HorizontalDividerProps {
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  thickness?: number;
  color?: string;
}
export const HorizontalDivider = createComposableComponent<HorizontalDividerProps>({
  name: "HorizontalDivider",
  props: ["modifier","thickness","color"],
  children: false,
});

export type HorizontalFloatingToolbarProps =
  | {
    expanded: boolean;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    contentPadding?: ComposePaddingValues;
    shape?: ComposeShape;
    leadingContent?: ReactNode;
    trailingContent?: ReactNode;
    expandedShadowElevation?: number;
    collapsedShadowElevation?: number;
    children?: ReactNode;
    floatingActionButton?: never;
    animationSpec?: never;
    }
  | {
    expanded: boolean;
    floatingActionButton: ReactNode;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    contentPadding?: ComposePaddingValues;
    shape?: ComposeShape;
    animationSpec?: ComposeAnimationSpec;
    expandedShadowElevation?: number;
    collapsedShadowElevation?: number;
    children?: ReactNode;
    leadingContent?: never;
    trailingContent?: never;
    }
;
export const HorizontalFloatingToolbar = createComposableComponent<HorizontalFloatingToolbarProps>({
  name: "HorizontalFloatingToolbar",
  props: ["expanded","modifier","contentPadding","shape","expandedShadowElevation","collapsedShadowElevation","animationSpec"],
  objectProps: ["contentPadding","shape","animationSpec"],
  slots: ["leadingContent","trailingContent","floatingActionButton"],
  children: true,
  overloads: [
    { id: "HorizontalFloatingToolbar", children: true, parameters: [["expanded","boolean",false,false],["modifier","ComposeModifier",true,false],["contentPadding","object",true,false],["shape","shape",true,false],["leadingContent","ReactNode",true,true],["trailingContent","ReactNode",true,true],["expandedShadowElevation","number",true,false],["collapsedShadowElevation","number",true,false]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63] },
    { id: "HorizontalFloatingToolbar#1", children: true, parameters: [["expanded","boolean",false,false],["floatingActionButton","ReactNode",false,false],["modifier","ComposeModifier",true,false],["contentPadding","object",true,false],["shape","shape",true,false],["animationSpec","object",true,false],["expandedShadowElevation","number",true,false],["collapsedShadowElevation","number",true,false]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31] },
  ],
});

export interface HorizontalPagerProps {
  state: ComposePagerState;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  contentPadding?: ComposePaddingValues;
  beyondViewportPageCount?: number;
  pageSpacing?: number;
  verticalAlignment?: ComposeVerticalAlignment;
  userScrollEnabled?: boolean;
  reverseLayout?: boolean;
  pageNestedScrollConnection?: ComposeNestedScrollConnection;
  children?: ReactNode;
}
export const HorizontalPager = createComposableComponent<HorizontalPagerProps>({
  name: "HorizontalPager",
  props: ["state","modifier","contentPadding","beyondViewportPageCount","pageSpacing","verticalAlignment","userScrollEnabled","reverseLayout","pageNestedScrollConnection"],
  objectProps: ["state","contentPadding","pageNestedScrollConnection"],
  children: true,
});

export type IconProps =
  | {
    painter: ComposePainter;
    contentDescription: string | null;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    tint?: string;
    active?: never;
    activeContent?: never;
    inactiveContent?: never;
    }
  | {
    active: boolean;
    activeContent?: ReactNode;
    inactiveContent?: ReactNode;
    painter?: never;
    contentDescription?: never;
    modifier?: never;
    modifiers?: never;
    tint?: never;
    }
;
export const Icon = createComposableComponent<IconProps>({
  name: "Icon",
  props: ["painter","contentDescription","modifier","tint","active"],
  objectProps: ["painter"],
  slots: ["activeContent","inactiveContent"],
  children: false,
  overloads: [
    { id: "Icon", children: false, parameters: [["painter","object",false,false],["contentDescription","string",false,true],["modifier","ComposeModifier",true,false],["tint","string",true,false]], masks: [0,1] },
    { id: "Icon#1", children: false, parameters: [["active","boolean",false,false],["activeContent","ReactNode",true,false],["inactiveContent","ReactNode",true,true]], masks: [0,1,2,3] },
  ],
});

export interface IconButtonProps {
  onClick: () => void;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  enabled?: boolean;
  interactionSource?: ComposeInteractionSource | null;
  shape?: ComposeShape;
  children?: ReactNode;
}
export const IconButton = createComposableComponent<IconButtonProps>({
  name: "IconButton",
  props: ["modifier","enabled","interactionSource","shape"],
  objectProps: ["interactionSource","shape"],
  events: ["onClick"],
  children: true,
});

export interface IconToggleButtonProps {
  checked: boolean;
  onCheckedChange: (value: boolean) => void;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  enabled?: boolean;
  interactionSource?: ComposeInteractionSource | null;
  shape?: ComposeShape;
  children?: ReactNode;
}
export const IconToggleButton = createComposableComponent<IconToggleButtonProps>({
  name: "IconToggleButton",
  props: ["checked","modifier","enabled","interactionSource","shape"],
  objectProps: ["interactionSource","shape"],
  events: ["onCheckedChange"],
  children: true,
});

export interface ImageProps {
  painter: ComposePainter;
  contentDescription: string | null;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  alignment?: ComposeAlignment;
  contentScale?: ComposeContentScale;
  alpha?: number;
}
export const Image = createComposableComponent<ImageProps>({
  name: "Image",
  props: ["painter","contentDescription","modifier","alignment","contentScale","alpha"],
  objectProps: ["painter"],
  children: false,
});

export interface IndicatorProps {
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  height?: number;
  color?: string;
}
export const Indicator = createComposableComponent<IndicatorProps>({
  name: "Indicator",
  props: ["modifier","height","color"],
  children: false,
});

export interface InputChipProps {
  selected: boolean;
  onClick: () => void;
  label: ReactNode;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  enabled?: boolean;
  leadingIcon?: ReactNode;
  avatar?: ReactNode;
  trailingIcon?: ReactNode;
  shape?: ComposeShape;
  interactionSource?: ComposeInteractionSource | null;
}
export const InputChip = createComposableComponent<InputChipProps>({
  name: "InputChip",
  props: ["selected","modifier","enabled","shape","interactionSource"],
  objectProps: ["shape","interactionSource"],
  slots: ["label","leadingIcon","avatar","trailingIcon"],
  events: ["onClick"],
  children: false,
});

export type InputFieldProps =
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly?: boolean;
    textStyle?: ComposeTextStyle;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    trailingIcon?: ReactNode;
    prefix?: ReactNode;
    suffix?: ReactNode;
    shape?: ComposeShape;
    interactionSource?: ComposeInteractionSource | null;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    state: ComposeTextFieldState;
    onSearch: (value: string) => void;
    expanded: boolean;
    onExpandedChange: (value: boolean) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly?: boolean;
    textStyle?: ComposeTextStyle;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    trailingIcon?: ReactNode;
    prefix?: ReactNode;
    suffix?: ReactNode;
    shape?: ComposeShape;
    interactionSource?: ComposeInteractionSource | null;
    textFieldState?: never;
    searchBarState?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    query: string;
    onQueryChange: (value: string) => void;
    onSearch: (value: string) => void;
    expanded: boolean;
    onExpandedChange: (value: boolean) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    trailingIcon?: ReactNode;
    interactionSource?: ComposeInteractionSource | null;
    textFieldState?: never;
    searchBarState?: never;
    readOnly?: never;
    textStyle?: never;
    prefix?: never;
    suffix?: never;
    shape?: never;
    state?: never;
    }
;
export const InputField = createComposableComponent<InputFieldProps>({
  name: "InputField",
  props: ["textFieldState","searchBarState","modifier","enabled","readOnly","textStyle","shape","interactionSource","state","expanded","query"],
  objectProps: ["textFieldState","searchBarState","textStyle","shape","interactionSource","state"],
  slots: ["placeholder","leadingIcon","trailingIcon","prefix","suffix"],
  events: ["onSearch","onExpandedChange","onQueryChange"],
  children: false,
  overloads: [
    { id: "InputField", children: false, parameters: [["textFieldState","object",false,false],["searchBarState","object",false,false],["onSearch","function",false,false],["modifier","ComposeModifier",true,false],["enabled","boolean",true,false],["readOnly","boolean",true,false],["textStyle","object",true,false],["placeholder","ReactNode",true,true],["leadingIcon","ReactNode",true,true],["trailingIcon","ReactNode",true,true],["prefix","ReactNode",true,true],["suffix","ReactNode",true,true],["shape","shape",true,false],["interactionSource","object",true,true]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,123,124,125,126,127,128,129,130,131,132,133,134,135,136,137,138,139,140,141,142,143,144,145,146,147,148,149,150,151,152,153,154,155,156,157,158,159,160,161,162,163,164,165,166,167,168,169,170,171,172,173,174,175,176,177,178,179,180,181,182,183,184,185,186,187,188,189,190,191,192,193,194,195,196,197,198,199,200,201,202,203,204,205,206,207,208,209,210,211,212,213,214,215,216,217,218,219,220,221,222,223,224,225,226,227,228,229,230,231,232,233,234,235,236,237,238,239,240,241,242,243,244,245,246,247,248,249,250,251,252,253,254,255,256,257,258,259,260,261,262,263,264,265,266,267,268,269,270,271,272,273,274,275,276,277,278,279,280,281,282,283,284,285,286,287,288,289,290,291,292,293,294,295,296,297,298,299,300,301,302,303,304,305,306,307,308,309,310,311,312,313,314,315,316,317,318,319,320,321,322,323,324,325,326,327,328,329,330,331,332,333,334,335,336,337,338,339,340,341,342,343,344,345,346,347,348,349,350,351,352,353,354,355,356,357,358,359,360,361,362,363,364,365,366,367,368,369,370,371,372,373,374,375,376,377,378,379,380,381,382,383,384,385,386,387,388,389,390,391,392,393,394,395,396,397,398,399,400,401,402,403,404,405,406,407,408,409,410,411,412,413,414,415,416,417,418,419,420,421,422,423,424,425,426,427,428,429,430,431,432,433,434,435,436,437,438,439,440,441,442,443,444,445,446,447,448,449,450,451,452,453,454,455,456,457,458,459,460,461,462,463,464,465,466,467,468,469,470,471,472,473,474,475,476,477,478,479,480,481,482,483,484,485,486,487,488,489,490,491,492,493,494,495,496,497,498,499,500,501,502,503,504,505,506,507,508,509,510,511,512,513,514,515,516,517,518,519,520,521,522,523,524,525,526,527,528,529,530,531,532,533,534,535,536,537,538,539,540,541,542,543,544,545,546,547,548,549,550,551,552,553,554,555,556,557,558,559,560,561,562,563,564,565,566,567,568,569,570,571,572,573,574,575,576,577,578,579,580,581,582,583,584,585,586,587,588,589,590,591,592,593,594,595,596,597,598,599,600,601,602,603,604,605,606,607,608,609,610,611,612,613,614,615,616,617,618,619,620,621,622,623,624,625,626,627,628,629,630,631,632,633,634,635,636,637,638,639,640,641,642,643,644,645,646,647,648,649,650,651,652,653,654,655,656,657,658,659,660,661,662,663,664,665,666,667,668,669,670,671,672,673,674,675,676,677,678,679,680,681,682,683,684,685,686,687,688,689,690,691,692,693,694,695,696,697,698,699,700,701,702,703,704,705,706,707,708,709,710,711,712,713,714,715,716,717,718,719,720,721,722,723,724,725,726,727,728,729,730,731,732,733,734,735,736,737,738,739,740,741,742,743,744,745,746,747,748,749,750,751,752,753,754,755,756,757,758,759,760,761,762,763,764,765,766,767,768,769,770,771,772,773,774,775,776,777,778,779,780,781,782,783,784,785,786,787,788,789,790,791,792,793,794,795,796,797,798,799,800,801,802,803,804,805,806,807,808,809,810,811,812,813,814,815,816,817,818,819,820,821,822,823,824,825,826,827,828,829,830,831,832,833,834,835,836,837,838,839,840,841,842,843,844,845,846,847,848,849,850,851,852,853,854,855,856,857,858,859,860,861,862,863,864,865,866,867,868,869,870,871,872,873,874,875,876,877,878,879,880,881,882,883,884,885,886,887,888,889,890,891,892,893,894,895,896,897,898,899,900,901,902,903,904,905,906,907,908,909,910,911,912,913,914,915,916,917,918,919,920,921,922,923,924,925,926,927,928,929,930,931,932,933,934,935,936,937,938,939,940,941,942,943,944,945,946,947,948,949,950,951,952,953,954,955,956,957,958,959,960,961,962,963,964,965,966,967,968,969,970,971,972,973,974,975,976,977,978,979,980,981,982,983,984,985,986,987,988,989,990,991,992,993,994,995,996,997,998,999,1000,1001,1002,1003,1004,1005,1006,1007,1008,1009,1010,1011,1012,1013,1014,1015,1016,1017,1018,1019,1020,1021,1022,1023] },
    { id: "InputField#1", children: false, parameters: [["state","object",false,false],["onSearch","function",false,false],["expanded","boolean",false,false],["onExpandedChange","function",false,false],["modifier","ComposeModifier",true,false],["enabled","boolean",true,false],["readOnly","boolean",true,false],["textStyle","object",true,false],["placeholder","ReactNode",true,true],["leadingIcon","ReactNode",true,true],["trailingIcon","ReactNode",true,true],["prefix","ReactNode",true,true],["suffix","ReactNode",true,true],["shape","shape",true,false],["interactionSource","object",true,true]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,123,124,125,126,127,128,129,130,131,132,133,134,135,136,137,138,139,140,141,142,143,144,145,146,147,148,149,150,151,152,153,154,155,156,157,158,159,160,161,162,163,164,165,166,167,168,169,170,171,172,173,174,175,176,177,178,179,180,181,182,183,184,185,186,187,188,189,190,191,192,193,194,195,196,197,198,199,200,201,202,203,204,205,206,207,208,209,210,211,212,213,214,215,216,217,218,219,220,221,222,223,224,225,226,227,228,229,230,231,232,233,234,235,236,237,238,239,240,241,242,243,244,245,246,247,248,249,250,251,252,253,254,255,256,257,258,259,260,261,262,263,264,265,266,267,268,269,270,271,272,273,274,275,276,277,278,279,280,281,282,283,284,285,286,287,288,289,290,291,292,293,294,295,296,297,298,299,300,301,302,303,304,305,306,307,308,309,310,311,312,313,314,315,316,317,318,319,320,321,322,323,324,325,326,327,328,329,330,331,332,333,334,335,336,337,338,339,340,341,342,343,344,345,346,347,348,349,350,351,352,353,354,355,356,357,358,359,360,361,362,363,364,365,366,367,368,369,370,371,372,373,374,375,376,377,378,379,380,381,382,383,384,385,386,387,388,389,390,391,392,393,394,395,396,397,398,399,400,401,402,403,404,405,406,407,408,409,410,411,412,413,414,415,416,417,418,419,420,421,422,423,424,425,426,427,428,429,430,431,432,433,434,435,436,437,438,439,440,441,442,443,444,445,446,447,448,449,450,451,452,453,454,455,456,457,458,459,460,461,462,463,464,465,466,467,468,469,470,471,472,473,474,475,476,477,478,479,480,481,482,483,484,485,486,487,488,489,490,491,492,493,494,495,496,497,498,499,500,501,502,503,504,505,506,507,508,509,510,511,512,513,514,515,516,517,518,519,520,521,522,523,524,525,526,527,528,529,530,531,532,533,534,535,536,537,538,539,540,541,542,543,544,545,546,547,548,549,550,551,552,553,554,555,556,557,558,559,560,561,562,563,564,565,566,567,568,569,570,571,572,573,574,575,576,577,578,579,580,581,582,583,584,585,586,587,588,589,590,591,592,593,594,595,596,597,598,599,600,601,602,603,604,605,606,607,608,609,610,611,612,613,614,615,616,617,618,619,620,621,622,623,624,625,626,627,628,629,630,631,632,633,634,635,636,637,638,639,640,641,642,643,644,645,646,647,648,649,650,651,652,653,654,655,656,657,658,659,660,661,662,663,664,665,666,667,668,669,670,671,672,673,674,675,676,677,678,679,680,681,682,683,684,685,686,687,688,689,690,691,692,693,694,695,696,697,698,699,700,701,702,703,704,705,706,707,708,709,710,711,712,713,714,715,716,717,718,719,720,721,722,723,724,725,726,727,728,729,730,731,732,733,734,735,736,737,738,739,740,741,742,743,744,745,746,747,748,749,750,751,752,753,754,755,756,757,758,759,760,761,762,763,764,765,766,767,768,769,770,771,772,773,774,775,776,777,778,779,780,781,782,783,784,785,786,787,788,789,790,791,792,793,794,795,796,797,798,799,800,801,802,803,804,805,806,807,808,809,810,811,812,813,814,815,816,817,818,819,820,821,822,823,824,825,826,827,828,829,830,831,832,833,834,835,836,837,838,839,840,841,842,843,844,845,846,847,848,849,850,851,852,853,854,855,856,857,858,859,860,861,862,863,864,865,866,867,868,869,870,871,872,873,874,875,876,877,878,879,880,881,882,883,884,885,886,887,888,889,890,891,892,893,894,895,896,897,898,899,900,901,902,903,904,905,906,907,908,909,910,911,912,913,914,915,916,917,918,919,920,921,922,923,924,925,926,927,928,929,930,931,932,933,934,935,936,937,938,939,940,941,942,943,944,945,946,947,948,949,950,951,952,953,954,955,956,957,958,959,960,961,962,963,964,965,966,967,968,969,970,971,972,973,974,975,976,977,978,979,980,981,982,983,984,985,986,987,988,989,990,991,992,993,994,995,996,997,998,999,1000,1001,1002,1003,1004,1005,1006,1007,1008,1009,1010,1011,1012,1013,1014,1015,1016,1017,1018,1019,1020,1021,1022,1023] },
    { id: "InputField#2", children: false, parameters: [["query","string",false,false],["onQueryChange","function",false,false],["onSearch","function",false,false],["expanded","boolean",false,false],["onExpandedChange","function",false,false],["modifier","ComposeModifier",true,false],["enabled","boolean",true,false],["placeholder","ReactNode",true,true],["leadingIcon","ReactNode",true,true],["trailingIcon","ReactNode",true,true],["interactionSource","object",true,true]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31] },
  ],
});

export interface LabelProps {
  label: ReactNode;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  interactionSource?: ComposeInteractionSource | null;
  isPersistent?: boolean;
  children?: ReactNode;
}
export const Label = createComposableComponent<LabelProps>({
  name: "Label",
  props: ["modifier","interactionSource","isPersistent"],
  objectProps: ["interactionSource"],
  slots: ["label"],
  children: true,
});

export type LargeExtendedFloatingActionButtonProps =
  | {
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    shape?: ComposeShape;
    containerColor?: string;
    contentColor?: string;
    interactionSource?: ComposeInteractionSource | null;
    children?: ReactNode;
    text?: never;
    icon?: never;
    expanded?: never;
    }
  | {
    text: ReactNode;
    icon: ReactNode;
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    expanded?: boolean;
    shape?: ComposeShape;
    containerColor?: string;
    contentColor?: string;
    interactionSource?: ComposeInteractionSource | null;
    children?: never;
    }
;
export const LargeExtendedFloatingActionButton = createComposableComponent<LargeExtendedFloatingActionButtonProps>({
  name: "LargeExtendedFloatingActionButton",
  props: ["modifier","shape","containerColor","contentColor","interactionSource","expanded"],
  objectProps: ["shape","interactionSource"],
  slots: ["text","icon"],
  events: ["onClick"],
  children: true,
  overloads: [
    { id: "LargeExtendedFloatingActionButton", children: true, parameters: [["onClick","function",false,false],["modifier","ComposeModifier",true,false],["shape","shape",true,false],["containerColor","string",true,false],["contentColor","string",true,false],["interactionSource","object",true,true]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15] },
    { id: "LargeExtendedFloatingActionButton#1", children: false, parameters: [["text","ReactNode",false,false],["icon","ReactNode",false,false],["onClick","function",false,false],["modifier","ComposeModifier",true,false],["expanded","boolean",true,false],["shape","shape",true,false],["containerColor","string",true,false],["contentColor","string",true,false],["interactionSource","object",true,true]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31] },
  ],
});

export interface LargeFlexibleTopAppBarProps {
  title: ReactNode;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  subtitle?: ReactNode;
  navigationIcon?: ReactNode;
  actions?: ReactNode;
  titleHorizontalAlignment?: ComposeHorizontalAlignment;
  collapsedHeight?: number;
  expandedHeight?: number;
  windowInsets?: ComposeWindowInsets;
}
export const LargeFlexibleTopAppBar = createComposableComponent<LargeFlexibleTopAppBarProps>({
  name: "LargeFlexibleTopAppBar",
  props: ["modifier","titleHorizontalAlignment","collapsedHeight","expandedHeight","windowInsets"],
  objectProps: ["windowInsets"],
  slots: ["title","subtitle","navigationIcon","actions"],
  children: false,
});

export interface LargeFloatingActionButtonProps {
  onClick: () => void;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  shape?: ComposeShape;
  containerColor?: string;
  contentColor?: string;
  interactionSource?: ComposeInteractionSource | null;
  children?: ReactNode;
}
export const LargeFloatingActionButton = createComposableComponent<LargeFloatingActionButtonProps>({
  name: "LargeFloatingActionButton",
  props: ["modifier","shape","containerColor","contentColor","interactionSource"],
  objectProps: ["shape","interactionSource"],
  events: ["onClick"],
  children: true,
});

export interface LargeTopAppBarProps {
  title: ReactNode;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  navigationIcon?: ReactNode;
  actions?: ReactNode;
  collapsedHeight?: number;
  expandedHeight?: number;
  windowInsets?: ComposeWindowInsets;
}
export const LargeTopAppBar = createComposableComponent<LargeTopAppBarProps>({
  name: "LargeTopAppBar",
  props: ["modifier","collapsedHeight","expandedHeight","windowInsets"],
  objectProps: ["windowInsets"],
  slots: ["title","navigationIcon","actions"],
  children: false,
});

export interface LazyColumnProps {
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  state?: ComposeLazyState;
  contentPadding?: ComposePaddingValues;
  reverseLayout?: boolean;
  verticalArrangement?: ComposeVerticalArrangement;
  horizontalAlignment?: ComposeHorizontalAlignment;
  userScrollEnabled?: boolean;
  children?: ReactNode;
}
export const LazyColumn = createComposableComponent<LazyColumnProps>({
  name: "LazyColumn",
  props: ["modifier","state","contentPadding","reverseLayout","verticalArrangement","horizontalAlignment","userScrollEnabled"],
  objectProps: ["state","contentPadding"],
  children: true,
});

export interface LazyHorizontalGridProps {
  rows: ComposeGridCells;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  state?: ComposeLazyState;
  contentPadding?: ComposePaddingValues;
  reverseLayout?: boolean;
  horizontalArrangement?: ComposeHorizontalArrangement;
  verticalArrangement?: ComposeVerticalArrangement;
  userScrollEnabled?: boolean;
  children?: ReactNode;
}
export const LazyHorizontalGrid = createComposableComponent<LazyHorizontalGridProps>({
  name: "LazyHorizontalGrid",
  props: ["rows","modifier","state","contentPadding","reverseLayout","horizontalArrangement","verticalArrangement","userScrollEnabled"],
  objectProps: ["rows","state","contentPadding"],
  children: true,
});

export interface LazyHorizontalStaggeredGridProps {
  rows: ComposeGridCells;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  state?: ComposeLazyState;
  contentPadding?: ComposePaddingValues;
  reverseLayout?: boolean;
  verticalArrangement?: ComposeVerticalArrangement;
  horizontalItemSpacing?: number;
  userScrollEnabled?: boolean;
  children?: ReactNode;
}
export const LazyHorizontalStaggeredGrid = createComposableComponent<LazyHorizontalStaggeredGridProps>({
  name: "LazyHorizontalStaggeredGrid",
  props: ["rows","modifier","state","contentPadding","reverseLayout","verticalArrangement","horizontalItemSpacing","userScrollEnabled"],
  objectProps: ["rows","state","contentPadding"],
  children: true,
});

export interface LazyRowProps {
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  state?: ComposeLazyState;
  contentPadding?: ComposePaddingValues;
  reverseLayout?: boolean;
  horizontalArrangement?: ComposeHorizontalArrangement;
  verticalAlignment?: ComposeVerticalAlignment;
  userScrollEnabled?: boolean;
  children?: ReactNode;
}
export const LazyRow = createComposableComponent<LazyRowProps>({
  name: "LazyRow",
  props: ["modifier","state","contentPadding","reverseLayout","horizontalArrangement","verticalAlignment","userScrollEnabled"],
  objectProps: ["state","contentPadding"],
  children: true,
});

export interface LazyVerticalGridProps {
  columns: ComposeGridCells;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  state?: ComposeLazyState;
  contentPadding?: ComposePaddingValues;
  reverseLayout?: boolean;
  verticalArrangement?: ComposeVerticalArrangement;
  horizontalArrangement?: ComposeHorizontalArrangement;
  userScrollEnabled?: boolean;
  children?: ReactNode;
}
export const LazyVerticalGrid = createComposableComponent<LazyVerticalGridProps>({
  name: "LazyVerticalGrid",
  props: ["columns","modifier","state","contentPadding","reverseLayout","verticalArrangement","horizontalArrangement","userScrollEnabled"],
  objectProps: ["columns","state","contentPadding"],
  children: true,
});

export interface LazyVerticalStaggeredGridProps {
  columns: ComposeGridCells;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  state?: ComposeLazyState;
  contentPadding?: ComposePaddingValues;
  reverseLayout?: boolean;
  verticalItemSpacing?: number;
  horizontalArrangement?: ComposeHorizontalArrangement;
  userScrollEnabled?: boolean;
  children?: ReactNode;
}
export const LazyVerticalStaggeredGrid = createComposableComponent<LazyVerticalStaggeredGridProps>({
  name: "LazyVerticalStaggeredGrid",
  props: ["columns","modifier","state","contentPadding","reverseLayout","verticalItemSpacing","horizontalArrangement","userScrollEnabled"],
  objectProps: ["columns","state","contentPadding"],
  children: true,
});

export interface LeadingButtonProps {
  onClick: () => void;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  enabled?: boolean;
  contentPadding?: ComposePaddingValues;
  interactionSource?: ComposeInteractionSource | null;
  children?: ReactNode;
}
export const LeadingButton = createComposableComponent<LeadingButtonProps>({
  name: "LeadingButton",
  props: ["modifier","enabled","contentPadding","interactionSource"],
  objectProps: ["contentPadding","interactionSource"],
  events: ["onClick"],
  children: true,
});

export interface LeadingIconTabProps {
  selected: boolean;
  onClick: () => void;
  text: ReactNode;
  icon: ReactNode;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  enabled?: boolean;
  selectedContentColor?: string;
  unselectedContentColor?: string;
  interactionSource?: ComposeInteractionSource | null;
}
export const LeadingIconTab = createComposableComponent<LeadingIconTabProps>({
  name: "LeadingIconTab",
  props: ["selected","modifier","enabled","selectedContentColor","unselectedContentColor","interactionSource"],
  objectProps: ["interactionSource"],
  slots: ["text","icon"],
  events: ["onClick"],
  children: false,
});

export type LinearProgressIndicatorProps =
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color?: string;
    trackColor?: string;
    gapSize?: number;
    progress?: never;
    }
  | {
    progress: number;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color?: string;
    trackColor?: string;
    gapSize?: number;
    }
;
export const LinearProgressIndicator = createComposableComponent<LinearProgressIndicatorProps>({
  name: "LinearProgressIndicator",
  props: ["modifier","color","trackColor","gapSize","progress"],
  children: false,
  overloads: [
    { id: "LinearProgressIndicator", children: false, parameters: [["modifier","ComposeModifier",true,false],["color","string",true,false],["trackColor","string",true,false],["gapSize","number",true,false]], masks: [0,1,2,3,4,5,6,7] },
    { id: "LinearProgressIndicator#1", children: false, parameters: [["progress","number",false,false],["modifier","ComposeModifier",true,false],["color","string",true,false],["trackColor","string",true,false],["gapSize","number",true,false]], masks: [0,1,2,3,4,5,6,7] },
  ],
});

export type LinearWavyProgressIndicatorProps =
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color?: string;
    trackColor?: string;
    gapSize?: number;
    amplitude?: number;
    wavelength?: number;
    waveSpeed?: number;
    progress?: never;
    stopSize?: never;
    }
  | {
    progress: number;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color?: string;
    trackColor?: string;
    gapSize?: number;
    stopSize?: number;
    wavelength?: number;
    waveSpeed?: number;
    amplitude?: never;
    }
;
export const LinearWavyProgressIndicator = createComposableComponent<LinearWavyProgressIndicatorProps>({
  name: "LinearWavyProgressIndicator",
  props: ["modifier","color","trackColor","gapSize","amplitude","wavelength","waveSpeed","progress","stopSize"],
  children: false,
  overloads: [
    { id: "LinearWavyProgressIndicator", children: false, parameters: [["modifier","ComposeModifier",true,false],["color","string",true,false],["trackColor","string",true,false],["gapSize","number",true,false],["amplitude","number",true,false],["wavelength","number",true,false],["waveSpeed","number",true,false]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63] },
    { id: "LinearWavyProgressIndicator#1", children: false, parameters: [["progress","number",false,false],["modifier","ComposeModifier",true,false],["color","string",true,false],["trackColor","string",true,false],["gapSize","number",true,false],["stopSize","number",true,false],["wavelength","number",true,false],["waveSpeed","number",true,false]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63] },
  ],
});

export interface ListItemProps {
  headlineContent: ReactNode;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  overlineContent?: ReactNode;
  supportingContent?: ReactNode;
  leadingContent?: ReactNode;
  trailingContent?: ReactNode;
  tonalElevation?: number;
  shadowElevation?: number;
}
export const ListItem = createComposableComponent<ListItemProps>({
  name: "ListItem",
  props: ["modifier","tonalElevation","shadowElevation"],
  slots: ["headlineContent","overlineContent","supportingContent","leadingContent","trailingContent"],
  children: false,
});

export type LoadingIndicatorProps =
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color?: string;
    progress?: never;
    }
  | {
    progress: number;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color?: string;
    }
;
export const LoadingIndicator = createComposableComponent<LoadingIndicatorProps>({
  name: "LoadingIndicator",
  props: ["modifier","color","progress"],
  children: false,
  overloads: [
    { id: "LoadingIndicator", children: false, parameters: [["modifier","ComposeModifier",true,false],["color","string",true,false]], masks: [0,1] },
    { id: "LoadingIndicator#1", children: false, parameters: [["progress","number",false,false],["modifier","ComposeModifier",true,false],["color","string",true,false]], masks: [0,1] },
  ],
});

export interface LookaheadAnimationVisualDebuggingProps {
  isEnabled?: boolean;
  overlayColor?: string;
  multipleMatchesColor?: string;
  unmatchedElementColor?: string;
  isShowKeyLabelEnabled?: boolean;
  children?: ReactNode;
}
export const LookaheadAnimationVisualDebugging = createComposableComponent<LookaheadAnimationVisualDebuggingProps>({
  name: "LookaheadAnimationVisualDebugging",
  props: ["isEnabled","overlayColor","multipleMatchesColor","unmatchedElementColor","isShowKeyLabelEnabled"],
  children: true,
});

export interface LookaheadScopeProps {
  children?: ReactNode;
}
export const LookaheadScope = createComposableComponent<LookaheadScopeProps>({
  name: "LookaheadScope",
  props: [],
  children: true,
});

export interface MaterialExpressiveThemeProps {
  colorScheme?: ColorScheme | null;
  children?: ReactNode;
}
export const MaterialExpressiveTheme = createComposableComponent<MaterialExpressiveThemeProps>({
  name: "MaterialExpressiveTheme",
  props: ["colorScheme"],
  objectProps: ["colorScheme"],
  children: true,
});

export interface MaterialThemeProps {
  colorScheme?: ColorScheme;
  children?: ReactNode;
}
export const MaterialTheme = createComposableComponent<MaterialThemeProps>({
  name: "MaterialTheme",
  props: ["colorScheme"],
  objectProps: ["colorScheme"],
  children: true,
});

export type MediumExtendedFloatingActionButtonProps =
  | {
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    shape?: ComposeShape;
    containerColor?: string;
    contentColor?: string;
    interactionSource?: ComposeInteractionSource | null;
    children?: ReactNode;
    text?: never;
    icon?: never;
    expanded?: never;
    }
  | {
    text: ReactNode;
    icon: ReactNode;
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    expanded?: boolean;
    shape?: ComposeShape;
    containerColor?: string;
    contentColor?: string;
    interactionSource?: ComposeInteractionSource | null;
    children?: never;
    }
;
export const MediumExtendedFloatingActionButton = createComposableComponent<MediumExtendedFloatingActionButtonProps>({
  name: "MediumExtendedFloatingActionButton",
  props: ["modifier","shape","containerColor","contentColor","interactionSource","expanded"],
  objectProps: ["shape","interactionSource"],
  slots: ["text","icon"],
  events: ["onClick"],
  children: true,
  overloads: [
    { id: "MediumExtendedFloatingActionButton", children: true, parameters: [["onClick","function",false,false],["modifier","ComposeModifier",true,false],["shape","shape",true,false],["containerColor","string",true,false],["contentColor","string",true,false],["interactionSource","object",true,true]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15] },
    { id: "MediumExtendedFloatingActionButton#1", children: false, parameters: [["text","ReactNode",false,false],["icon","ReactNode",false,false],["onClick","function",false,false],["modifier","ComposeModifier",true,false],["expanded","boolean",true,false],["shape","shape",true,false],["containerColor","string",true,false],["contentColor","string",true,false],["interactionSource","object",true,true]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31] },
  ],
});

export interface MediumFlexibleTopAppBarProps {
  title: ReactNode;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  subtitle?: ReactNode;
  navigationIcon?: ReactNode;
  actions?: ReactNode;
  titleHorizontalAlignment?: ComposeHorizontalAlignment;
  collapsedHeight?: number;
  expandedHeight?: number;
  windowInsets?: ComposeWindowInsets;
}
export const MediumFlexibleTopAppBar = createComposableComponent<MediumFlexibleTopAppBarProps>({
  name: "MediumFlexibleTopAppBar",
  props: ["modifier","titleHorizontalAlignment","collapsedHeight","expandedHeight","windowInsets"],
  objectProps: ["windowInsets"],
  slots: ["title","subtitle","navigationIcon","actions"],
  children: false,
});

export interface MediumFloatingActionButtonProps {
  onClick: () => void;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  shape?: ComposeShape;
  containerColor?: string;
  contentColor?: string;
  interactionSource?: ComposeInteractionSource | null;
  children?: ReactNode;
}
export const MediumFloatingActionButton = createComposableComponent<MediumFloatingActionButtonProps>({
  name: "MediumFloatingActionButton",
  props: ["modifier","shape","containerColor","contentColor","interactionSource"],
  objectProps: ["shape","interactionSource"],
  events: ["onClick"],
  children: true,
});

export interface MediumTopAppBarProps {
  title: ReactNode;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  navigationIcon?: ReactNode;
  actions?: ReactNode;
  collapsedHeight?: number;
  expandedHeight?: number;
  windowInsets?: ComposeWindowInsets;
}
export const MediumTopAppBar = createComposableComponent<MediumTopAppBarProps>({
  name: "MediumTopAppBar",
  props: ["modifier","collapsedHeight","expandedHeight","windowInsets"],
  objectProps: ["windowInsets"],
  slots: ["title","navigationIcon","actions"],
  children: false,
});

export interface ModalBottomSheetProps {
  onDismissRequest: () => void;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  sheetState?: ComposeSheetState;
  sheetMaxWidth?: number;
  sheetGesturesEnabled?: boolean;
  shape?: ComposeShape;
  containerColor?: string;
  contentColor?: string;
  tonalElevation?: number;
  scrimColor?: string;
  dragHandle?: ReactNode;
  contentWindowInsets?: ComposeWindowInsets;
  children?: ReactNode;
}
export const ModalBottomSheet = createComposableComponent<ModalBottomSheetProps>({
  name: "ModalBottomSheet",
  props: ["modifier","sheetState","sheetMaxWidth","sheetGesturesEnabled","shape","containerColor","contentColor","tonalElevation","scrimColor","contentWindowInsets"],
  objectProps: ["sheetState","shape","contentWindowInsets"],
  slots: ["dragHandle"],
  events: ["onDismissRequest"],
  children: true,
});

export interface ModalDrawerSheetProps {
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  drawerShape?: ComposeShape;
  drawerContainerColor?: string;
  drawerContentColor?: string;
  drawerTonalElevation?: number;
  windowInsets?: ComposeWindowInsets;
  children?: ReactNode;
}
export const ModalDrawerSheet = createComposableComponent<ModalDrawerSheetProps>({
  name: "ModalDrawerSheet",
  props: ["modifier","drawerShape","drawerContainerColor","drawerContentColor","drawerTonalElevation","windowInsets"],
  objectProps: ["drawerShape","windowInsets"],
  children: true,
});

export interface ModalNavigationDrawerProps {
  drawerContent: ReactNode;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  gesturesEnabled?: boolean;
  scrimColor?: string;
  children?: ReactNode;
}
export const ModalNavigationDrawer = createComposableComponent<ModalNavigationDrawerProps>({
  name: "ModalNavigationDrawer",
  props: ["modifier","gesturesEnabled","scrimColor"],
  slots: ["drawerContent"],
  children: true,
});

export interface ModalWideNavigationRailProps {
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  hideOnCollapse?: boolean;
  collapsedShape?: ComposeShape;
  expandedShape?: ComposeShape;
  header?: ReactNode;
  expandedHeaderTopPadding?: number;
  windowInsets?: ComposeWindowInsets;
  arrangement?: ComposeVerticalArrangement;
  children?: ReactNode;
}
export const ModalWideNavigationRail = createComposableComponent<ModalWideNavigationRailProps>({
  name: "ModalWideNavigationRail",
  props: ["modifier","hideOnCollapse","collapsedShape","expandedShape","expandedHeaderTopPadding","windowInsets","arrangement"],
  objectProps: ["collapsedShape","expandedShape","windowInsets"],
  slots: ["header"],
  children: true,
});

export interface MultiChoiceSegmentedButtonRowProps {
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  space?: number;
  children?: ReactNode;
}
export const MultiChoiceSegmentedButtonRow = createComposableComponent<MultiChoiceSegmentedButtonRowProps>({
  name: "MultiChoiceSegmentedButtonRow",
  props: ["modifier","space"],
  children: true,
});

export interface NavigationBarProps {
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  containerColor?: string;
  contentColor?: string;
  tonalElevation?: number;
  windowInsets?: ComposeWindowInsets;
  children?: ReactNode;
}
export const NavigationBar = createComposableComponent<NavigationBarProps>({
  name: "NavigationBar",
  props: ["modifier","containerColor","contentColor","tonalElevation","windowInsets"],
  objectProps: ["windowInsets"],
  children: true,
});

export interface NavigationDrawerItemProps {
  label: ReactNode;
  selected: boolean;
  onClick: () => void;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  icon?: ReactNode;
  badge?: ReactNode;
  shape?: ComposeShape;
  interactionSource?: ComposeInteractionSource | null;
}
export const NavigationDrawerItem = createComposableComponent<NavigationDrawerItemProps>({
  name: "NavigationDrawerItem",
  props: ["selected","modifier","shape","interactionSource"],
  objectProps: ["shape","interactionSource"],
  slots: ["label","icon","badge"],
  events: ["onClick"],
  children: false,
});

export interface NavigationRailProps {
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  containerColor?: string;
  contentColor?: string;
  header?: ReactNode;
  windowInsets?: ComposeWindowInsets;
  children?: ReactNode;
}
export const NavigationRail = createComposableComponent<NavigationRailProps>({
  name: "NavigationRail",
  props: ["modifier","containerColor","contentColor","windowInsets"],
  objectProps: ["windowInsets"],
  slots: ["header"],
  children: true,
});

export interface NavigationRailItemProps {
  selected: boolean;
  onClick: () => void;
  icon: ReactNode;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  enabled?: boolean;
  label?: ReactNode;
  alwaysShowLabel?: boolean;
  interactionSource?: ComposeInteractionSource | null;
}
export const NavigationRailItem = createComposableComponent<NavigationRailItemProps>({
  name: "NavigationRailItem",
  props: ["selected","modifier","enabled","alwaysShowLabel","interactionSource"],
  objectProps: ["interactionSource"],
  slots: ["icon","label"],
  events: ["onClick"],
  children: false,
});

export interface OutlinedButtonProps {
  onClick: () => void;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  enabled?: boolean;
  shape?: ComposeShape;
  contentPadding?: ComposePaddingValues;
  interactionSource?: ComposeInteractionSource | null;
  children?: ReactNode;
}
export const OutlinedButton = createComposableComponent<OutlinedButtonProps>({
  name: "OutlinedButton",
  props: ["modifier","enabled","shape","contentPadding","interactionSource"],
  objectProps: ["shape","contentPadding","interactionSource"],
  events: ["onClick"],
  children: true,
});

export type OutlinedCardProps =
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    shape?: ComposeShape;
    children?: ReactNode;
    onClick?: never;
    enabled?: never;
    interactionSource?: never;
    }
  | {
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    shape?: ComposeShape;
    interactionSource?: ComposeInteractionSource | null;
    children?: ReactNode;
    }
;
export const OutlinedCard = createComposableComponent<OutlinedCardProps>({
  name: "OutlinedCard",
  props: ["modifier","shape","enabled","interactionSource"],
  objectProps: ["shape","interactionSource"],
  events: ["onClick"],
  children: true,
  overloads: [
    { id: "OutlinedCard", children: true, parameters: [["modifier","ComposeModifier",true,false],["shape","shape",true,false]], masks: [0,1] },
    { id: "OutlinedCard#1", children: true, parameters: [["onClick","function",false,false],["modifier","ComposeModifier",true,false],["enabled","boolean",true,false],["shape","shape",true,false],["interactionSource","object",true,true]], masks: [0,1,2,3,4,5,6,7] },
  ],
});

export interface OutlinedIconButtonProps {
  onClick: () => void;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  enabled?: boolean;
  shape?: ComposeShape;
  interactionSource?: ComposeInteractionSource | null;
  children?: ReactNode;
}
export const OutlinedIconButton = createComposableComponent<OutlinedIconButtonProps>({
  name: "OutlinedIconButton",
  props: ["modifier","enabled","shape","interactionSource"],
  objectProps: ["shape","interactionSource"],
  events: ["onClick"],
  children: true,
});

export interface OutlinedIconToggleButtonProps {
  checked: boolean;
  onCheckedChange: (value: boolean) => void;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  enabled?: boolean;
  shape?: ComposeShape;
  interactionSource?: ComposeInteractionSource | null;
  children?: ReactNode;
}
export const OutlinedIconToggleButton = createComposableComponent<OutlinedIconToggleButtonProps>({
  name: "OutlinedIconToggleButton",
  props: ["checked","modifier","enabled","shape","interactionSource"],
  objectProps: ["shape","interactionSource"],
  events: ["onCheckedChange"],
  children: true,
});

export interface OutlinedLeadingButtonProps {
  onClick: () => void;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  enabled?: boolean;
  contentPadding?: ComposePaddingValues;
  interactionSource?: ComposeInteractionSource | null;
  children?: ReactNode;
}
export const OutlinedLeadingButton = createComposableComponent<OutlinedLeadingButtonProps>({
  name: "OutlinedLeadingButton",
  props: ["modifier","enabled","contentPadding","interactionSource"],
  objectProps: ["contentPadding","interactionSource"],
  events: ["onClick"],
  children: true,
});

export type OutlinedSecureTextFieldProps =
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    trailingIcon?: ReactNode;
    prefix?: ReactNode;
    interactionSource?: ComposeInteractionSource | null;
    textStyle?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    shape?: never;
    contentPadding?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    trailingIcon?: ReactNode;
    contentPadding: ComposePaddingValues;
    textStyle?: never;
    prefix?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    shape?: never;
    interactionSource?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    trailingIcon?: ReactNode;
    shape: ComposeShape;
    textStyle?: never;
    prefix?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    contentPadding?: never;
    interactionSource?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    trailingIcon?: ReactNode;
    isError: boolean;
    textStyle?: never;
    prefix?: never;
    suffix?: never;
    supportingText?: never;
    shape?: never;
    contentPadding?: never;
    interactionSource?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    trailingIcon?: ReactNode;
    supportingText: ReactNode;
    textStyle?: never;
    prefix?: never;
    suffix?: never;
    isError?: never;
    shape?: never;
    contentPadding?: never;
    interactionSource?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    trailingIcon?: ReactNode;
    suffix: ReactNode;
    textStyle?: never;
    prefix?: never;
    supportingText?: never;
    isError?: never;
    shape?: never;
    contentPadding?: never;
    interactionSource?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    textStyle: ComposeTextStyle;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    trailingIcon?: ReactNode;
    interactionSource?: ComposeInteractionSource | null;
    prefix?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    shape?: never;
    contentPadding?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    textStyle: ComposeTextStyle;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    trailingIcon?: ReactNode;
    prefix: ReactNode;
    interactionSource: ComposeInteractionSource | null;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    shape?: never;
    contentPadding?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    textStyle: ComposeTextStyle;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    supportingText: ReactNode;
    isError: boolean;
    shape: ComposeShape;
    contentPadding: ComposePaddingValues;
    interactionSource?: ComposeInteractionSource | null;
    }
;
export const OutlinedSecureTextField = createComposableComponent<OutlinedSecureTextFieldProps>({
  name: "OutlinedSecureTextField",
  props: ["state","modifier","enabled","textStyle","isError","shape","contentPadding","interactionSource"],
  objectProps: ["state","textStyle","shape","contentPadding","interactionSource"],
  slots: ["placeholder","leadingIcon","trailingIcon","prefix","suffix","supportingText"],
  children: false,
  overloads: [
    { id: "OutlinedSecureTextField", children: false, parameters: [["state","object",false,false],["modifier","ComposeModifier",true,false],["enabled","boolean",true,false],["textStyle","object",true,false],["placeholder","ReactNode",true,true],["leadingIcon","ReactNode",true,true],["trailingIcon","ReactNode",true,true],["prefix","ReactNode",true,true],["suffix","ReactNode",true,true],["supportingText","ReactNode",true,true],["isError","boolean",true,false],["shape","shape",true,false],["contentPadding","object",true,false],["interactionSource","object",true,true]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,36,37,40,41,44,45,48,49,52,53,56,57,60,61,64,65,68,69,72,73,76,77,80,81,84,85,88,89,92,93,128,129,132,133,136,137,140,141,144,145,148,149,152,153,156,157,256,257,260,261,264,265,268,269,272,273,276,277,280,281,284,285,512,513,516,517,520,521,524,525,528,529,532,533,536,537,540,541,1024,1025,1028,1029,1032,1033,1036,1037,1040,1041,1044,1045,1048,1049,1052,1053,2047,2048,2049,2050,2051,2052,2053,2054,2055,2056,2057,2058,2059,2060,2061,2062,2063,2064,2065,2066,2067,2068,2069,2070,2071,2072,2073,2074,2075,2076,2077,2078,2079,2080,2081,2082,2083,2084,2085,2086,2087,2088,2089,2090,2091,2092,2093,2094,2095,2096,2097,2098,2099,2100,2101,2102,2103,2104,2105,2106,2107,2108,2109,2110,2111,4095] },
  ],
});

export type OutlinedTextFieldProps =
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly?: boolean;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    trailingIcon?: ReactNode;
    interactionSource?: ComposeInteractionSource | null;
    textStyle?: never;
    prefix?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    shape?: never;
    contentPadding?: never;
    value?: never;
    onValueChange?: never;
    label?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly?: boolean;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    contentPadding: ComposePaddingValues;
    textStyle?: never;
    trailingIcon?: never;
    prefix?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    shape?: never;
    interactionSource?: never;
    value?: never;
    onValueChange?: never;
    label?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly?: boolean;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    shape: ComposeShape;
    textStyle?: never;
    trailingIcon?: never;
    prefix?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    contentPadding?: never;
    interactionSource?: never;
    value?: never;
    onValueChange?: never;
    label?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly?: boolean;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    isError: boolean;
    textStyle?: never;
    trailingIcon?: never;
    prefix?: never;
    suffix?: never;
    supportingText?: never;
    shape?: never;
    contentPadding?: never;
    interactionSource?: never;
    value?: never;
    onValueChange?: never;
    label?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly?: boolean;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    supportingText: ReactNode;
    textStyle?: never;
    trailingIcon?: never;
    prefix?: never;
    suffix?: never;
    isError?: never;
    shape?: never;
    contentPadding?: never;
    interactionSource?: never;
    value?: never;
    onValueChange?: never;
    label?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly?: boolean;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    suffix: ReactNode;
    textStyle?: never;
    trailingIcon?: never;
    prefix?: never;
    supportingText?: never;
    isError?: never;
    shape?: never;
    contentPadding?: never;
    interactionSource?: never;
    value?: never;
    onValueChange?: never;
    label?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly?: boolean;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    prefix: ReactNode;
    textStyle?: never;
    trailingIcon?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    shape?: never;
    contentPadding?: never;
    interactionSource?: never;
    value?: never;
    onValueChange?: never;
    label?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly?: boolean;
    textStyle: ComposeTextStyle;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    interactionSource?: ComposeInteractionSource | null;
    trailingIcon?: never;
    prefix?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    shape?: never;
    contentPadding?: never;
    value?: never;
    onValueChange?: never;
    label?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly?: boolean;
    textStyle: ComposeTextStyle;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    trailingIcon: ReactNode;
    interactionSource: ComposeInteractionSource | null;
    prefix?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    shape?: never;
    contentPadding?: never;
    value?: never;
    onValueChange?: never;
    label?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    readOnly: boolean;
    textStyle: ComposeTextStyle;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    supportingText: ReactNode;
    isError: boolean;
    shape: ComposeShape;
    contentPadding: ComposePaddingValues;
    interactionSource?: ComposeInteractionSource | null;
    value?: never;
    onValueChange?: never;
    label?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    }
  | {
    value: ComposeTextFieldValue;
    onValueChange: (value: ComposeTextFieldSnapshot) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly?: boolean;
    label?: ReactNode;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    trailingIcon?: ReactNode;
    prefix?: ReactNode;
    shape?: ComposeShape;
    state?: never;
    textStyle?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    contentPadding?: never;
    interactionSource?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    }
  | {
    value: ComposeTextFieldValue;
    onValueChange: (value: ComposeTextFieldSnapshot) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly?: boolean;
    label?: ReactNode;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    interactionSource: ComposeInteractionSource | null;
    state?: never;
    textStyle?: never;
    trailingIcon?: never;
    prefix?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    shape?: never;
    contentPadding?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    }
  | {
    value: ComposeTextFieldValue;
    onValueChange: (value: ComposeTextFieldSnapshot) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly?: boolean;
    label?: ReactNode;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    trailingIcon?: ReactNode;
    prefix?: ReactNode;
    minLines: number;
    state?: never;
    textStyle?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    shape?: never;
    contentPadding?: never;
    interactionSource?: never;
    singleLine?: never;
    maxLines?: never;
    }
  | {
    value: ComposeTextFieldValue;
    onValueChange: (value: ComposeTextFieldSnapshot) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly?: boolean;
    label?: ReactNode;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    trailingIcon?: ReactNode;
    prefix?: ReactNode;
    maxLines: number;
    state?: never;
    textStyle?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    shape?: never;
    contentPadding?: never;
    interactionSource?: never;
    singleLine?: never;
    minLines?: never;
    }
  | {
    value: ComposeTextFieldValue;
    onValueChange: (value: ComposeTextFieldSnapshot) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly?: boolean;
    label?: ReactNode;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    trailingIcon?: ReactNode;
    prefix?: ReactNode;
    singleLine: boolean;
    state?: never;
    textStyle?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    shape?: never;
    contentPadding?: never;
    interactionSource?: never;
    maxLines?: never;
    minLines?: never;
    }
  | {
    value: ComposeTextFieldValue;
    onValueChange: (value: ComposeTextFieldSnapshot) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly?: boolean;
    label?: ReactNode;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    trailingIcon?: ReactNode;
    prefix?: ReactNode;
    isError: boolean;
    state?: never;
    textStyle?: never;
    suffix?: never;
    supportingText?: never;
    shape?: never;
    contentPadding?: never;
    interactionSource?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    }
  | {
    value: ComposeTextFieldValue;
    onValueChange: (value: ComposeTextFieldSnapshot) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly?: boolean;
    label?: ReactNode;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    trailingIcon?: ReactNode;
    prefix?: ReactNode;
    supportingText: ReactNode;
    state?: never;
    textStyle?: never;
    suffix?: never;
    isError?: never;
    shape?: never;
    contentPadding?: never;
    interactionSource?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    }
  | {
    value: ComposeTextFieldValue;
    onValueChange: (value: ComposeTextFieldSnapshot) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly?: boolean;
    label?: ReactNode;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    trailingIcon?: ReactNode;
    prefix?: ReactNode;
    suffix: ReactNode;
    state?: never;
    textStyle?: never;
    supportingText?: never;
    isError?: never;
    shape?: never;
    contentPadding?: never;
    interactionSource?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    }
  | {
    value: ComposeTextFieldValue;
    onValueChange: (value: ComposeTextFieldSnapshot) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly?: boolean;
    textStyle: ComposeTextStyle;
    label?: ReactNode;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    interactionSource?: ComposeInteractionSource | null;
    state?: never;
    trailingIcon?: never;
    prefix?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    shape?: never;
    contentPadding?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    }
  | {
    value: ComposeTextFieldValue;
    onValueChange: (value: ComposeTextFieldSnapshot) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly?: boolean;
    textStyle: ComposeTextStyle;
    label?: ReactNode;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    prefix: ReactNode;
    state?: never;
    trailingIcon?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    shape?: never;
    contentPadding?: never;
    interactionSource?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    }
  | {
    value: ComposeTextFieldValue;
    onValueChange: (value: ComposeTextFieldSnapshot) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly?: boolean;
    textStyle: ComposeTextStyle;
    label?: ReactNode;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    trailingIcon: ReactNode;
    prefix?: ReactNode;
    state?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    shape?: never;
    contentPadding?: never;
    interactionSource?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    }
  | {
    value: ComposeTextFieldValue;
    onValueChange: (value: ComposeTextFieldSnapshot) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    readOnly: boolean;
    label: ReactNode;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    supportingText: ReactNode;
    isError: boolean;
    singleLine: boolean;
    maxLines: number;
    minLines: number;
    shape: ComposeShape;
    state?: never;
    textStyle?: never;
    contentPadding?: never;
    interactionSource?: never;
    }
  | {
    value: ComposeTextFieldValue;
    onValueChange: (value: ComposeTextFieldSnapshot) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    readOnly: boolean;
    textStyle: ComposeTextStyle;
    label: ReactNode;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    supportingText: ReactNode;
    isError: boolean;
    singleLine: boolean;
    maxLines: number;
    minLines: number;
    interactionSource?: ComposeInteractionSource | null;
    shape: ComposeShape;
    state?: never;
    contentPadding?: never;
    }
  | {
    value: string;
    onValueChange: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly?: boolean;
    label?: ReactNode;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    trailingIcon?: ReactNode;
    prefix?: ReactNode;
    shape?: ComposeShape;
    state?: never;
    textStyle?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    contentPadding?: never;
    interactionSource?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    }
  | {
    value: string;
    onValueChange: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly?: boolean;
    label?: ReactNode;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    interactionSource: ComposeInteractionSource | null;
    state?: never;
    textStyle?: never;
    trailingIcon?: never;
    prefix?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    shape?: never;
    contentPadding?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    }
  | {
    value: string;
    onValueChange: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly?: boolean;
    label?: ReactNode;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    trailingIcon?: ReactNode;
    prefix?: ReactNode;
    minLines: number;
    state?: never;
    textStyle?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    shape?: never;
    contentPadding?: never;
    interactionSource?: never;
    singleLine?: never;
    maxLines?: never;
    }
  | {
    value: string;
    onValueChange: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly?: boolean;
    label?: ReactNode;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    trailingIcon?: ReactNode;
    prefix?: ReactNode;
    maxLines: number;
    state?: never;
    textStyle?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    shape?: never;
    contentPadding?: never;
    interactionSource?: never;
    singleLine?: never;
    minLines?: never;
    }
  | {
    value: string;
    onValueChange: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly?: boolean;
    label?: ReactNode;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    trailingIcon?: ReactNode;
    prefix?: ReactNode;
    singleLine: boolean;
    state?: never;
    textStyle?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    shape?: never;
    contentPadding?: never;
    interactionSource?: never;
    maxLines?: never;
    minLines?: never;
    }
  | {
    value: string;
    onValueChange: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly?: boolean;
    label?: ReactNode;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    trailingIcon?: ReactNode;
    prefix?: ReactNode;
    isError: boolean;
    state?: never;
    textStyle?: never;
    suffix?: never;
    supportingText?: never;
    shape?: never;
    contentPadding?: never;
    interactionSource?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    }
  | {
    value: string;
    onValueChange: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly?: boolean;
    label?: ReactNode;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    trailingIcon?: ReactNode;
    prefix?: ReactNode;
    supportingText: ReactNode;
    state?: never;
    textStyle?: never;
    suffix?: never;
    isError?: never;
    shape?: never;
    contentPadding?: never;
    interactionSource?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    }
  | {
    value: string;
    onValueChange: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly?: boolean;
    label?: ReactNode;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    trailingIcon?: ReactNode;
    prefix?: ReactNode;
    suffix: ReactNode;
    state?: never;
    textStyle?: never;
    supportingText?: never;
    isError?: never;
    shape?: never;
    contentPadding?: never;
    interactionSource?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    }
  | {
    value: string;
    onValueChange: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly?: boolean;
    textStyle: ComposeTextStyle;
    label?: ReactNode;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    interactionSource?: ComposeInteractionSource | null;
    state?: never;
    trailingIcon?: never;
    prefix?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    shape?: never;
    contentPadding?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    }
  | {
    value: string;
    onValueChange: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly?: boolean;
    textStyle: ComposeTextStyle;
    label?: ReactNode;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    prefix: ReactNode;
    state?: never;
    trailingIcon?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    shape?: never;
    contentPadding?: never;
    interactionSource?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    }
  | {
    value: string;
    onValueChange: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly?: boolean;
    textStyle: ComposeTextStyle;
    label?: ReactNode;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    trailingIcon: ReactNode;
    prefix?: ReactNode;
    state?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    shape?: never;
    contentPadding?: never;
    interactionSource?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    }
  | {
    value: string;
    onValueChange: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    readOnly: boolean;
    label: ReactNode;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    supportingText: ReactNode;
    isError: boolean;
    singleLine: boolean;
    maxLines: number;
    minLines: number;
    shape: ComposeShape;
    state?: never;
    textStyle?: never;
    contentPadding?: never;
    interactionSource?: never;
    }
  | {
    value: string;
    onValueChange: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    readOnly: boolean;
    textStyle: ComposeTextStyle;
    label: ReactNode;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    supportingText: ReactNode;
    isError: boolean;
    singleLine: boolean;
    maxLines: number;
    minLines: number;
    interactionSource?: ComposeInteractionSource | null;
    shape: ComposeShape;
    state?: never;
    contentPadding?: never;
    }
;
export const OutlinedTextField = createComposableComponent<OutlinedTextFieldProps>({
  name: "OutlinedTextField",
  props: ["state","modifier","enabled","readOnly","textStyle","isError","shape","contentPadding","interactionSource","value","singleLine","maxLines","minLines"],
  objectProps: ["state","textStyle","shape","contentPadding","interactionSource","value"],
  slots: ["placeholder","leadingIcon","trailingIcon","prefix","suffix","supportingText","label"],
  events: ["onValueChange"],
  children: false,
  overloads: [
    { id: "OutlinedTextField", children: false, parameters: [["state","object",false,false],["modifier","ComposeModifier",true,false],["enabled","boolean",true,false],["readOnly","boolean",true,false],["textStyle","object",true,false],["placeholder","ReactNode",true,true],["leadingIcon","ReactNode",true,true],["trailingIcon","ReactNode",true,true],["prefix","ReactNode",true,true],["suffix","ReactNode",true,true],["supportingText","ReactNode",true,true],["isError","boolean",true,false],["shape","shape",true,false],["contentPadding","object",true,false],["interactionSource","object",true,true]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,40,41,42,43,48,49,50,51,56,57,58,59,64,65,66,67,72,73,74,75,80,81,82,83,88,89,90,91,128,129,130,131,136,137,138,139,144,145,146,147,152,153,154,155,256,257,258,259,264,265,266,267,272,273,274,275,280,281,282,283,512,513,514,515,520,521,522,523,528,529,530,531,536,537,538,539,1024,1025,1026,1027,1032,1033,1034,1035,1040,1041,1042,1043,1048,1049,1050,1051,2048,2049,2050,2051,2056,2057,2058,2059,2064,2065,2066,2067,2072,2073,2074,2075,4095,4096,4097,4098,4099,4100,4101,4102,4103,4104,4105,4106,4107,4108,4109,4110,4111,4112,4113,4114,4115,4116,4117,4118,4119,4120,4121,4122,4123,4124,4125,4126,4127,4128,4129,4130,4131,4132,4133,4134,4135,4136,4137,4138,4139,4140,4141,4142,4143,4144,4145,4146,4147,4148,4149,4150,4151,4152,4153,4154,4155,4156,4157,4158,4159,8191] },
    { id: "OutlinedTextField#1", children: false, parameters: [["value","object",false,false],["onValueChange","function",false,false],["modifier","ComposeModifier",true,false],["enabled","boolean",true,false],["readOnly","boolean",true,false],["textStyle","object",true,false],["label","ReactNode",true,true],["placeholder","ReactNode",true,true],["leadingIcon","ReactNode",true,true],["trailingIcon","ReactNode",true,true],["prefix","ReactNode",true,true],["suffix","ReactNode",true,true],["supportingText","ReactNode",true,true],["isError","boolean",true,false],["singleLine","boolean",true,false],["maxLines","number",true,false],["minLines","number",true,false],["interactionSource","object",true,true],["shape","shape",true,false]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,123,124,125,126,127,128,129,130,131,132,133,134,135,136,137,138,139,140,141,142,143,144,145,146,147,148,149,150,151,152,153,154,155,156,157,158,159,160,161,162,163,164,165,166,167,168,169,170,171,172,173,174,175,176,177,178,179,180,181,182,183,184,185,186,187,188,189,190,191,192,193,194,195,196,197,198,199,200,201,202,203,204,205,206,207,208,209,210,211,212,213,214,215,216,217,218,219,220,221,222,223,224,225,226,227,228,229,230,231,232,233,234,235,236,237,238,239,240,241,242,243,244,245,246,247,248,249,250,251,252,253,254,255,256,257,258,259,264,265,266,267,272,273,274,275,280,281,282,283,288,289,290,291,296,297,298,299,304,305,306,307,312,313,314,315,320,321,322,323,328,329,330,331,336,337,338,339,344,345,346,347,352,353,354,355,360,361,362,363,368,369,370,371,376,377,378,379,384,385,386,387,392,393,394,395,400,401,402,403,408,409,410,411,416,417,418,419,424,425,426,427,432,433,434,435,440,441,442,443,448,449,450,451,456,457,458,459,464,465,466,467,472,473,474,475,480,481,482,483,488,489,490,491,496,497,498,499,504,505,506,507,512,513,514,515,520,521,522,523,528,529,530,531,536,537,538,539,544,545,546,547,552,553,554,555,560,561,562,563,568,569,570,571,576,577,578,579,584,585,586,587,592,593,594,595,600,601,602,603,608,609,610,611,616,617,618,619,624,625,626,627,632,633,634,635,640,641,642,643,648,649,650,651,656,657,658,659,664,665,666,667,672,673,674,675,680,681,682,683,688,689,690,691,696,697,698,699,704,705,706,707,712,713,714,715,720,721,722,723,728,729,730,731,736,737,738,739,744,745,746,747,752,753,754,755,760,761,762,763,1024,1025,1026,1027,1032,1033,1034,1035,1040,1041,1042,1043,1048,1049,1050,1051,1056,1057,1058,1059,1064,1065,1066,1067,1072,1073,1074,1075,1080,1081,1082,1083,1088,1089,1090,1091,1096,1097,1098,1099,1104,1105,1106,1107,1112,1113,1114,1115,1120,1121,1122,1123,1128,1129,1130,1131,1136,1137,1138,1139,1144,1145,1146,1147,1152,1153,1154,1155,1160,1161,1162,1163,1168,1169,1170,1171,1176,1177,1178,1179,1184,1185,1186,1187,1192,1193,1194,1195,1200,1201,1202,1203,1208,1209,1210,1211,1216,1217,1218,1219,1224,1225,1226,1227,1232,1233,1234,1235,1240,1241,1242,1243,1248,1249,1250,1251,1256,1257,1258,1259,1264,1265,1266,1267,1272,1273,1274,1275,2048,2049,2050,2051,2056,2057,2058,2059,2064,2065,2066,2067,2072,2073,2074,2075,2080,2081,2082,2083,2088,2089,2090,2091,2096,2097,2098,2099,2104,2105,2106,2107,2112,2113,2114,2115,2120,2121,2122,2123,2128,2129,2130,2131,2136,2137,2138,2139,2144,2145,2146,2147,2152,2153,2154,2155,2160,2161,2162,2163,2168,2169,2170,2171,2176,2177,2178,2179,2184,2185,2186,2187,2192,2193,2194,2195,2200,2201,2202,2203,2208,2209,2210,2211,2216,2217,2218,2219,2224,2225,2226,2227,2232,2233,2234,2235,2240,2241,2242,2243,2248,2249,2250,2251,2256,2257,2258,2259,2264,2265,2266,2267,2272,2273,2274,2275,2280,2281,2282,2283,2288,2289,2290,2291,2296,2297,2298,2299,4096,4097,4098,4099,4104,4105,4106,4107,4112,4113,4114,4115,4120,4121,4122,4123,4128,4129,4130,4131,4136,4137,4138,4139,4144,4145,4146,4147,4152,4153,4154,4155,4160,4161,4162,4163,4168,4169,4170,4171,4176,4177,4178,4179,4184,4185,4186,4187,4192,4193,4194,4195,4200,4201,4202,4203,4208,4209,4210,4211,4216,4217,4218,4219,4224,4225,4226,4227,4232,4233,4234,4235,4240,4241,4242,4243,4248,4249,4250,4251,4256,4257,4258,4259,4264,4265,4266,4267,4272,4273,4274,4275,4280,4281,4282,4283,4288,4289,4290,4291,4296,4297,4298,4299,4304,4305,4306,4307,4312,4313,4314,4315,4320,4321,4322,4323,4328,4329,4330,4331,4336,4337,4338,4339,4344,4345,4346,4347,8192,8193,8194,8195,8200,8201,8202,8203,8208,8209,8210,8211,8216,8217,8218,8219,8224,8225,8226,8227,8232,8233,8234,8235,8240,8241,8242,8243,8248,8249,8250,8251,8256,8257,8258,8259,8264,8265,8266,8267,8272,8273,8274,8275,8280,8281,8282,8283,8288,8289,8290,8291,8296,8297,8298,8299,8304,8305,8306,8307,8312,8313,8314,8315,8320,8321,8322,8323,8328,8329,8330,8331,8336,8337,8338,8339,8344,8345,8346,8347,8352,8353,8354,8355,8360,8361,8362,8363,8368,8369,8370,8371,8376,8377,8378,8379,8384,8385,8386,8387,8392,8393,8394,8395,8400,8401,8402,8403,8408,8409,8410,8411,8416,8417,8418,8419,8424,8425,8426,8427,8432,8433,8434,8435,8440,8441,8442,8443,16384,16385,16386,16387,16388,16389,16390,16391,16392,16393,16394,16395,16396,16397,16398,16399,16400,16401,16402,16403,16404,16405,16406,16407,16408,16409,16410,16411,16412,16413,16414,16415,16416,16417,16418,16419,16420,16421,16422,16423,16424,16425,16426,16427,16428,16429,16430,16431,16432,16433,16434,16435,16436,16437,16438,16439,16440,16441,16442,16443,16444,16445,16446,16447,32768,32769,32770,32771,32776,32777,32778,32779,32784,32785,32786,32787,32792,32793,32794,32795,32800,32801,32802,32803,32808,32809,32810,32811,32816,32817,32818,32819,32824,32825,32826,32827,32832,32833,32834,32835,32840,32841,32842,32843,32848,32849,32850,32851,32856,32857,32858,32859,32864,32865,32866,32867,32872,32873,32874,32875,32880,32881,32882,32883,32888,32889,32890,32891,32896,32897,32898,32899,32904,32905,32906,32907,32912,32913,32914,32915,32920,32921,32922,32923,32928,32929,32930,32931,32936,32937,32938,32939,32944,32945,32946,32947,32952,32953,32954,32955,32960,32961,32962,32963,32968,32969,32970,32971,32976,32977,32978,32979,32984,32985,32986,32987,32992,32993,32994,32995,33000,33001,33002,33003,33008,33009,33010,33011,33016,33017,33018,33019,49147,49151,65535] },
    { id: "OutlinedTextField#2", children: false, parameters: [["value","string",false,false],["onValueChange","function",false,false],["modifier","ComposeModifier",true,false],["enabled","boolean",true,false],["readOnly","boolean",true,false],["textStyle","object",true,false],["label","ReactNode",true,true],["placeholder","ReactNode",true,true],["leadingIcon","ReactNode",true,true],["trailingIcon","ReactNode",true,true],["prefix","ReactNode",true,true],["suffix","ReactNode",true,true],["supportingText","ReactNode",true,true],["isError","boolean",true,false],["singleLine","boolean",true,false],["maxLines","number",true,false],["minLines","number",true,false],["interactionSource","object",true,true],["shape","shape",true,false]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,123,124,125,126,127,128,129,130,131,132,133,134,135,136,137,138,139,140,141,142,143,144,145,146,147,148,149,150,151,152,153,154,155,156,157,158,159,160,161,162,163,164,165,166,167,168,169,170,171,172,173,174,175,176,177,178,179,180,181,182,183,184,185,186,187,188,189,190,191,192,193,194,195,196,197,198,199,200,201,202,203,204,205,206,207,208,209,210,211,212,213,214,215,216,217,218,219,220,221,222,223,224,225,226,227,228,229,230,231,232,233,234,235,236,237,238,239,240,241,242,243,244,245,246,247,248,249,250,251,252,253,254,255,256,257,258,259,264,265,266,267,272,273,274,275,280,281,282,283,288,289,290,291,296,297,298,299,304,305,306,307,312,313,314,315,320,321,322,323,328,329,330,331,336,337,338,339,344,345,346,347,352,353,354,355,360,361,362,363,368,369,370,371,376,377,378,379,384,385,386,387,392,393,394,395,400,401,402,403,408,409,410,411,416,417,418,419,424,425,426,427,432,433,434,435,440,441,442,443,448,449,450,451,456,457,458,459,464,465,466,467,472,473,474,475,480,481,482,483,488,489,490,491,496,497,498,499,504,505,506,507,512,513,514,515,520,521,522,523,528,529,530,531,536,537,538,539,544,545,546,547,552,553,554,555,560,561,562,563,568,569,570,571,576,577,578,579,584,585,586,587,592,593,594,595,600,601,602,603,608,609,610,611,616,617,618,619,624,625,626,627,632,633,634,635,640,641,642,643,648,649,650,651,656,657,658,659,664,665,666,667,672,673,674,675,680,681,682,683,688,689,690,691,696,697,698,699,704,705,706,707,712,713,714,715,720,721,722,723,728,729,730,731,736,737,738,739,744,745,746,747,752,753,754,755,760,761,762,763,1024,1025,1026,1027,1032,1033,1034,1035,1040,1041,1042,1043,1048,1049,1050,1051,1056,1057,1058,1059,1064,1065,1066,1067,1072,1073,1074,1075,1080,1081,1082,1083,1088,1089,1090,1091,1096,1097,1098,1099,1104,1105,1106,1107,1112,1113,1114,1115,1120,1121,1122,1123,1128,1129,1130,1131,1136,1137,1138,1139,1144,1145,1146,1147,1152,1153,1154,1155,1160,1161,1162,1163,1168,1169,1170,1171,1176,1177,1178,1179,1184,1185,1186,1187,1192,1193,1194,1195,1200,1201,1202,1203,1208,1209,1210,1211,1216,1217,1218,1219,1224,1225,1226,1227,1232,1233,1234,1235,1240,1241,1242,1243,1248,1249,1250,1251,1256,1257,1258,1259,1264,1265,1266,1267,1272,1273,1274,1275,2048,2049,2050,2051,2056,2057,2058,2059,2064,2065,2066,2067,2072,2073,2074,2075,2080,2081,2082,2083,2088,2089,2090,2091,2096,2097,2098,2099,2104,2105,2106,2107,2112,2113,2114,2115,2120,2121,2122,2123,2128,2129,2130,2131,2136,2137,2138,2139,2144,2145,2146,2147,2152,2153,2154,2155,2160,2161,2162,2163,2168,2169,2170,2171,2176,2177,2178,2179,2184,2185,2186,2187,2192,2193,2194,2195,2200,2201,2202,2203,2208,2209,2210,2211,2216,2217,2218,2219,2224,2225,2226,2227,2232,2233,2234,2235,2240,2241,2242,2243,2248,2249,2250,2251,2256,2257,2258,2259,2264,2265,2266,2267,2272,2273,2274,2275,2280,2281,2282,2283,2288,2289,2290,2291,2296,2297,2298,2299,4096,4097,4098,4099,4104,4105,4106,4107,4112,4113,4114,4115,4120,4121,4122,4123,4128,4129,4130,4131,4136,4137,4138,4139,4144,4145,4146,4147,4152,4153,4154,4155,4160,4161,4162,4163,4168,4169,4170,4171,4176,4177,4178,4179,4184,4185,4186,4187,4192,4193,4194,4195,4200,4201,4202,4203,4208,4209,4210,4211,4216,4217,4218,4219,4224,4225,4226,4227,4232,4233,4234,4235,4240,4241,4242,4243,4248,4249,4250,4251,4256,4257,4258,4259,4264,4265,4266,4267,4272,4273,4274,4275,4280,4281,4282,4283,4288,4289,4290,4291,4296,4297,4298,4299,4304,4305,4306,4307,4312,4313,4314,4315,4320,4321,4322,4323,4328,4329,4330,4331,4336,4337,4338,4339,4344,4345,4346,4347,8192,8193,8194,8195,8200,8201,8202,8203,8208,8209,8210,8211,8216,8217,8218,8219,8224,8225,8226,8227,8232,8233,8234,8235,8240,8241,8242,8243,8248,8249,8250,8251,8256,8257,8258,8259,8264,8265,8266,8267,8272,8273,8274,8275,8280,8281,8282,8283,8288,8289,8290,8291,8296,8297,8298,8299,8304,8305,8306,8307,8312,8313,8314,8315,8320,8321,8322,8323,8328,8329,8330,8331,8336,8337,8338,8339,8344,8345,8346,8347,8352,8353,8354,8355,8360,8361,8362,8363,8368,8369,8370,8371,8376,8377,8378,8379,8384,8385,8386,8387,8392,8393,8394,8395,8400,8401,8402,8403,8408,8409,8410,8411,8416,8417,8418,8419,8424,8425,8426,8427,8432,8433,8434,8435,8440,8441,8442,8443,16384,16385,16386,16387,16388,16389,16390,16391,16392,16393,16394,16395,16396,16397,16398,16399,16400,16401,16402,16403,16404,16405,16406,16407,16408,16409,16410,16411,16412,16413,16414,16415,16416,16417,16418,16419,16420,16421,16422,16423,16424,16425,16426,16427,16428,16429,16430,16431,16432,16433,16434,16435,16436,16437,16438,16439,16440,16441,16442,16443,16444,16445,16446,16447,32768,32769,32770,32771,32776,32777,32778,32779,32784,32785,32786,32787,32792,32793,32794,32795,32800,32801,32802,32803,32808,32809,32810,32811,32816,32817,32818,32819,32824,32825,32826,32827,32832,32833,32834,32835,32840,32841,32842,32843,32848,32849,32850,32851,32856,32857,32858,32859,32864,32865,32866,32867,32872,32873,32874,32875,32880,32881,32882,32883,32888,32889,32890,32891,32896,32897,32898,32899,32904,32905,32906,32907,32912,32913,32914,32915,32920,32921,32922,32923,32928,32929,32930,32931,32936,32937,32938,32939,32944,32945,32946,32947,32952,32953,32954,32955,32960,32961,32962,32963,32968,32969,32970,32971,32976,32977,32978,32979,32984,32985,32986,32987,32992,32993,32994,32995,33000,33001,33002,33003,33008,33009,33010,33011,33016,33017,33018,33019,49147,49151,65535] },
  ],
});

export interface OutlinedToggleButtonProps {
  checked: boolean;
  onCheckedChange: (value: boolean) => void;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  enabled?: boolean;
  contentPadding?: ComposePaddingValues;
  interactionSource?: ComposeInteractionSource | null;
  children?: ReactNode;
}
export const OutlinedToggleButton = createComposableComponent<OutlinedToggleButtonProps>({
  name: "OutlinedToggleButton",
  props: ["checked","modifier","enabled","contentPadding","interactionSource"],
  objectProps: ["contentPadding","interactionSource"],
  events: ["onCheckedChange"],
  children: true,
});

export interface OutlinedTrailingButtonProps {
  checked: boolean;
  onCheckedChange: (value: boolean) => void;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  enabled?: boolean;
  contentPadding?: ComposePaddingValues;
  interactionSource?: ComposeInteractionSource | null;
  children?: ReactNode;
}
export const OutlinedTrailingButton = createComposableComponent<OutlinedTrailingButtonProps>({
  name: "OutlinedTrailingButton",
  props: ["checked","modifier","enabled","contentPadding","interactionSource"],
  objectProps: ["contentPadding","interactionSource"],
  events: ["onCheckedChange"],
  children: true,
});

export interface PermanentDrawerSheetProps {
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  drawerShape?: ComposeShape;
  drawerContainerColor?: string;
  drawerContentColor?: string;
  drawerTonalElevation?: number;
  windowInsets?: ComposeWindowInsets;
  children?: ReactNode;
}
export const PermanentDrawerSheet = createComposableComponent<PermanentDrawerSheetProps>({
  name: "PermanentDrawerSheet",
  props: ["modifier","drawerShape","drawerContainerColor","drawerContentColor","drawerTonalElevation","windowInsets"],
  objectProps: ["drawerShape","windowInsets"],
  children: true,
});

export interface PermanentNavigationDrawerProps {
  drawerContent: ReactNode;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  children?: ReactNode;
}
export const PermanentNavigationDrawer = createComposableComponent<PermanentNavigationDrawerProps>({
  name: "PermanentNavigationDrawer",
  props: ["modifier"],
  slots: ["drawerContent"],
  children: true,
});

export interface PlainTooltipProps {
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  caretSize?: ComposeDpSize;
  maxWidth?: number;
  shape?: ComposeShape;
  contentColor?: string;
  containerColor?: string;
  tonalElevation?: number;
  shadowElevation?: number;
  children?: ReactNode;
}
export const PlainTooltip = createComposableComponent<PlainTooltipProps>({
  name: "PlainTooltip",
  props: ["modifier","caretSize","maxWidth","shape","contentColor","containerColor","tonalElevation","shadowElevation"],
  objectProps: ["caretSize","shape"],
  children: true,
});

export type PopupProps =
  | {
    alignment?: ComposeAlignment;
    offset?: ComposeIntOffset;
    onDismissRequest?: (() => void) | null;
    children?: ReactNode;
    popupPositionProvider?: never;
    }
  | {
    popupPositionProvider: ComposePopupPosition;
    onDismissRequest?: (() => void) | null;
    children?: ReactNode;
    alignment?: never;
    offset?: never;
    }
;
export const Popup = createComposableComponent<PopupProps>({
  name: "Popup",
  props: ["alignment","offset","popupPositionProvider"],
  objectProps: ["offset","popupPositionProvider"],
  events: ["onDismissRequest"],
  children: true,
  overloads: [
    { id: "Popup", children: true, parameters: [["alignment","string",true,false],["offset","object",true,false],["onDismissRequest","function",true,true]], masks: [0,1,2,3,4,5,6,7] },
    { id: "Popup#1", children: true, parameters: [["popupPositionProvider","object",false,false],["onDismissRequest","function",true,true]], masks: [0,1] },
  ],
});

export interface PrimaryIndicatorProps {
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  width?: number;
  height?: number;
  color?: string;
  shape?: ComposeShape;
}
export const PrimaryIndicator = createComposableComponent<PrimaryIndicatorProps>({
  name: "PrimaryIndicator",
  props: ["modifier","width","height","color","shape"],
  objectProps: ["shape"],
  children: false,
});

export interface PrimaryScrollableTabRowProps {
  selectedTabIndex: number;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  containerColor?: string;
  contentColor?: string;
  edgePadding?: number;
  divider?: ReactNode;
  minTabWidth?: number;
  tabs: ReactNode;
}
export const PrimaryScrollableTabRow = createComposableComponent<PrimaryScrollableTabRowProps>({
  name: "PrimaryScrollableTabRow",
  props: ["selectedTabIndex","modifier","containerColor","contentColor","edgePadding","minTabWidth"],
  slots: ["divider","tabs"],
  children: false,
});

export interface PrimaryTabRowProps {
  selectedTabIndex: number;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  containerColor?: string;
  contentColor?: string;
  divider?: ReactNode;
  tabs: ReactNode;
}
export const PrimaryTabRow = createComposableComponent<PrimaryTabRowProps>({
  name: "PrimaryTabRow",
  props: ["selectedTabIndex","modifier","containerColor","contentColor"],
  slots: ["divider","tabs"],
  children: false,
});

export interface ProvideTextStyleProps {
  value: ComposeTextStyle;
  children?: ReactNode;
}
export const ProvideTextStyle = createComposableComponent<ProvideTextStyleProps>({
  name: "ProvideTextStyle",
  props: ["value"],
  objectProps: ["value"],
  children: true,
});

export interface PullToRefreshBoxProps {
  isRefreshing: boolean;
  onRefresh: () => void;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  contentAlignment?: ComposeAlignment;
  indicator?: ReactNode;
  children?: ReactNode;
}
export const PullToRefreshBox = createComposableComponent<PullToRefreshBoxProps>({
  name: "PullToRefreshBox",
  props: ["isRefreshing","modifier","contentAlignment"],
  slots: ["indicator"],
  events: ["onRefresh"],
  children: true,
});

export interface RadioButtonProps {
  selected: boolean;
  onClick: (() => void) | null;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  enabled?: boolean;
  interactionSource?: ComposeInteractionSource | null;
}
export const RadioButton = createComposableComponent<RadioButtonProps>({
  name: "RadioButton",
  props: ["selected","modifier","enabled","interactionSource"],
  objectProps: ["interactionSource"],
  events: ["onClick"],
  children: false,
});

export type RangeSliderProps =
  | {
    value: ComposeFloatRange;
    onValueChange: (value: ComposeFloatRange) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    valueRange?: ComposeFloatRange;
    steps?: number;
    onValueChangeFinished?: (() => void) | null;
    startInteractionSource?: never;
    endInteractionSource?: never;
    }
  | {
    value: ComposeFloatRange;
    onValueChange: (value: ComposeFloatRange) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    valueRange?: ComposeFloatRange;
    onValueChangeFinished?: (() => void) | null;
    endInteractionSource: ComposeInteractionSource;
    steps?: number;
    startInteractionSource?: never;
    }
  | {
    value: ComposeFloatRange;
    onValueChange: (value: ComposeFloatRange) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    valueRange?: ComposeFloatRange;
    onValueChangeFinished?: (() => void) | null;
    startInteractionSource: ComposeInteractionSource;
    endInteractionSource?: ComposeInteractionSource;
    steps?: number;
    }
;
export const RangeSlider = createComposableComponent<RangeSliderProps>({
  name: "RangeSlider",
  props: ["value","modifier","enabled","valueRange","steps","startInteractionSource","endInteractionSource"],
  objectProps: ["value","valueRange","startInteractionSource","endInteractionSource"],
  events: ["onValueChange","onValueChangeFinished"],
  children: false,
  overloads: [
    { id: "RangeSlider", children: false, parameters: [["value","tuple",false,false],["onValueChange","function",false,false],["modifier","ComposeModifier",true,false],["enabled","boolean",true,false],["valueRange","tuple",true,false],["steps","number",true,false],["onValueChangeFinished","function",true,true]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15] },
    { id: "RangeSlider#1", children: false, parameters: [["value","tuple",false,false],["onValueChange","function",false,false],["modifier","ComposeModifier",true,false],["enabled","boolean",true,false],["valueRange","tuple",true,false],["onValueChangeFinished","function",true,true],["startInteractionSource","object",true,false],["endInteractionSource","object",true,false],["steps","number",true,false]], masks: [8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63] },
  ],
});

export interface ReusableContentHostProps {
  active: boolean;
  children?: ReactNode;
}
export const ReusableContentHost = createComposableComponent<ReusableContentHostProps>({
  name: "ReusableContentHost",
  props: ["active"],
  children: true,
});

export interface RichTooltipProps {
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  title?: ReactNode;
  action?: ReactNode;
  caretSize?: ComposeDpSize;
  maxWidth?: number;
  shape?: ComposeShape;
  tonalElevation?: number;
  shadowElevation?: number;
  text: ReactNode;
}
export const RichTooltip = createComposableComponent<RichTooltipProps>({
  name: "RichTooltip",
  props: ["modifier","caretSize","maxWidth","shape","tonalElevation","shadowElevation"],
  objectProps: ["caretSize","shape"],
  slots: ["title","action","text"],
  children: false,
});

export interface RowProps {
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  horizontalArrangement?: ComposeHorizontalArrangement;
  verticalAlignment?: ComposeVerticalAlignment;
  children?: ReactNode;
}
export const Row = createComposableComponent<RowProps>({
  name: "Row",
  props: ["modifier","horizontalArrangement","verticalAlignment"],
  children: true,
});

export interface ScaffoldProps {
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  topBar?: ReactNode;
  bottomBar?: ReactNode;
  snackbarHost?: ReactNode;
  floatingActionButton?: ReactNode;
  containerColor?: string;
  contentColor?: string;
  contentWindowInsets?: ComposeWindowInsets;
  children?: ReactNode;
}
export const Scaffold = createComposableComponent<ScaffoldProps>({
  name: "Scaffold",
  props: ["modifier","containerColor","contentColor","contentWindowInsets"],
  objectProps: ["contentWindowInsets"],
  slots: ["topBar","bottomBar","snackbarHost","floatingActionButton"],
  children: true,
});

export interface ScrollableTabRowProps {
  selectedTabIndex: number;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  containerColor?: string;
  contentColor?: string;
  edgePadding?: number;
  divider?: ReactNode;
  tabs: ReactNode;
}
export const ScrollableTabRow = createComposableComponent<ScrollableTabRowProps>({
  name: "ScrollableTabRow",
  props: ["selectedTabIndex","modifier","containerColor","contentColor","edgePadding"],
  slots: ["divider","tabs"],
  children: false,
});

export type SearchBarProps =
  | {
    state: ComposeSearchBarState;
    inputField: ReactNode;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    shape?: ComposeShape;
    tonalElevation?: number;
    shadowElevation?: number;
    expanded?: never;
    onExpandedChange?: never;
    windowInsets?: never;
    children?: never;
    }
  | {
    inputField: ReactNode;
    expanded: boolean;
    onExpandedChange: (value: boolean) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    shape?: ComposeShape;
    tonalElevation?: number;
    shadowElevation?: number;
    windowInsets?: ComposeWindowInsets;
    children?: ReactNode;
    state?: never;
    }
;
export const SearchBar = createComposableComponent<SearchBarProps>({
  name: "SearchBar",
  props: ["state","modifier","shape","tonalElevation","shadowElevation","expanded","windowInsets"],
  objectProps: ["state","shape","windowInsets"],
  slots: ["inputField"],
  events: ["onExpandedChange"],
  children: true,
  overloads: [
    { id: "SearchBar", children: false, parameters: [["state","object",false,false],["inputField","ReactNode",false,false],["modifier","ComposeModifier",true,false],["shape","shape",true,false],["tonalElevation","number",true,false],["shadowElevation","number",true,false]], masks: [0,1,2,3,4,5,6,7] },
    { id: "SearchBar#1", children: true, parameters: [["inputField","ReactNode",false,false],["expanded","boolean",false,false],["onExpandedChange","function",false,false],["modifier","ComposeModifier",true,false],["shape","shape",true,false],["tonalElevation","number",true,false],["shadowElevation","number",true,false],["windowInsets","object",true,false]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15] },
  ],
});

export interface SecondaryIndicatorProps {
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  height?: number;
  color?: string;
}
export const SecondaryIndicator = createComposableComponent<SecondaryIndicatorProps>({
  name: "SecondaryIndicator",
  props: ["modifier","height","color"],
  children: false,
});

export interface SecondaryScrollableTabRowProps {
  selectedTabIndex: number;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  containerColor?: string;
  contentColor?: string;
  edgePadding?: number;
  divider?: ReactNode;
  minTabWidth?: number;
  tabs: ReactNode;
}
export const SecondaryScrollableTabRow = createComposableComponent<SecondaryScrollableTabRowProps>({
  name: "SecondaryScrollableTabRow",
  props: ["selectedTabIndex","modifier","containerColor","contentColor","edgePadding","minTabWidth"],
  slots: ["divider","tabs"],
  children: false,
});

export interface SecondaryTabRowProps {
  selectedTabIndex: number;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  containerColor?: string;
  contentColor?: string;
  divider?: ReactNode;
  tabs: ReactNode;
}
export const SecondaryTabRow = createComposableComponent<SecondaryTabRowProps>({
  name: "SecondaryTabRow",
  props: ["selectedTabIndex","modifier","containerColor","contentColor"],
  slots: ["divider","tabs"],
  children: false,
});

export type SecureTextFieldProps =
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    trailingIcon?: ReactNode;
    prefix?: ReactNode;
    interactionSource?: ComposeInteractionSource | null;
    textStyle?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    shape?: never;
    contentPadding?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    trailingIcon?: ReactNode;
    contentPadding: ComposePaddingValues;
    textStyle?: never;
    prefix?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    shape?: never;
    interactionSource?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    trailingIcon?: ReactNode;
    shape: ComposeShape;
    textStyle?: never;
    prefix?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    contentPadding?: never;
    interactionSource?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    trailingIcon?: ReactNode;
    isError: boolean;
    textStyle?: never;
    prefix?: never;
    suffix?: never;
    supportingText?: never;
    shape?: never;
    contentPadding?: never;
    interactionSource?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    trailingIcon?: ReactNode;
    supportingText: ReactNode;
    textStyle?: never;
    prefix?: never;
    suffix?: never;
    isError?: never;
    shape?: never;
    contentPadding?: never;
    interactionSource?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    trailingIcon?: ReactNode;
    suffix: ReactNode;
    textStyle?: never;
    prefix?: never;
    supportingText?: never;
    isError?: never;
    shape?: never;
    contentPadding?: never;
    interactionSource?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    textStyle: ComposeTextStyle;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    trailingIcon?: ReactNode;
    interactionSource?: ComposeInteractionSource | null;
    prefix?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    shape?: never;
    contentPadding?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    textStyle: ComposeTextStyle;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    trailingIcon?: ReactNode;
    prefix: ReactNode;
    interactionSource: ComposeInteractionSource | null;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    shape?: never;
    contentPadding?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    textStyle: ComposeTextStyle;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    supportingText: ReactNode;
    isError: boolean;
    shape: ComposeShape;
    contentPadding: ComposePaddingValues;
    interactionSource?: ComposeInteractionSource | null;
    }
;
export const SecureTextField = createComposableComponent<SecureTextFieldProps>({
  name: "SecureTextField",
  props: ["state","modifier","enabled","textStyle","isError","shape","contentPadding","interactionSource"],
  objectProps: ["state","textStyle","shape","contentPadding","interactionSource"],
  slots: ["placeholder","leadingIcon","trailingIcon","prefix","suffix","supportingText"],
  children: false,
  overloads: [
    { id: "SecureTextField", children: false, parameters: [["state","object",false,false],["modifier","ComposeModifier",true,false],["enabled","boolean",true,false],["textStyle","object",true,false],["placeholder","ReactNode",true,true],["leadingIcon","ReactNode",true,true],["trailingIcon","ReactNode",true,true],["prefix","ReactNode",true,true],["suffix","ReactNode",true,true],["supportingText","ReactNode",true,true],["isError","boolean",true,false],["shape","shape",true,false],["contentPadding","object",true,false],["interactionSource","object",true,true]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,36,37,40,41,44,45,48,49,52,53,56,57,60,61,64,65,68,69,72,73,76,77,80,81,84,85,88,89,92,93,128,129,132,133,136,137,140,141,144,145,148,149,152,153,156,157,256,257,260,261,264,265,268,269,272,273,276,277,280,281,284,285,512,513,516,517,520,521,524,525,528,529,532,533,536,537,540,541,1024,1025,1028,1029,1032,1033,1036,1037,1040,1041,1044,1045,1048,1049,1052,1053,2047,2048,2049,2050,2051,2052,2053,2054,2055,2056,2057,2058,2059,2060,2061,2062,2063,2064,2065,2066,2067,2068,2069,2070,2071,2072,2073,2074,2075,2076,2077,2078,2079,2080,2081,2082,2083,2084,2085,2086,2087,2088,2089,2090,2091,2092,2093,2094,2095,2096,2097,2098,2099,2100,2101,2102,2103,2104,2105,2106,2107,2108,2109,2110,2111,4095] },
  ],
});

export type SegmentedButtonProps =
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    shape: ComposeShape;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    contentPadding?: ComposePaddingValues;
    interactionSource?: ComposeInteractionSource | null;
    icon?: ReactNode;
    label: ReactNode;
    selected?: never;
    onClick?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    shape: ComposeShape;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    contentPadding?: ComposePaddingValues;
    interactionSource?: ComposeInteractionSource | null;
    icon?: ReactNode;
    label: ReactNode;
    checked?: never;
    onCheckedChange?: never;
    }
;
export const SegmentedButton = createComposableComponent<SegmentedButtonProps>({
  name: "SegmentedButton",
  props: ["checked","shape","modifier","enabled","contentPadding","interactionSource","selected"],
  objectProps: ["shape","contentPadding","interactionSource"],
  slots: ["icon","label"],
  events: ["onCheckedChange","onClick"],
  children: false,
  overloads: [
    { id: "SegmentedButton", children: false, parameters: [["checked","boolean",false,false],["onCheckedChange","function",false,false],["shape","shape",false,false],["modifier","ComposeModifier",true,false],["enabled","boolean",true,false],["contentPadding","object",true,false],["interactionSource","object",true,true],["icon","ReactNode",true,false],["label","ReactNode",false,false]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15] },
    { id: "SegmentedButton#1", children: false, parameters: [["selected","boolean",false,false],["onClick","function",false,false],["shape","shape",false,false],["modifier","ComposeModifier",true,false],["enabled","boolean",true,false],["contentPadding","object",true,false],["interactionSource","object",true,true],["icon","ReactNode",true,false],["label","ReactNode",false,false]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15] },
  ],
});

export interface SelectionContainerProps {
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  children?: ReactNode;
}
export const SelectionContainer = createComposableComponent<SelectionContainerProps>({
  name: "SelectionContainer",
  props: ["modifier"],
  children: true,
});

export interface SharedTransitionLayoutProps {
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  children?: ReactNode;
}
export const SharedTransitionLayout = createComposableComponent<SharedTransitionLayoutProps>({
  name: "SharedTransitionLayout",
  props: ["modifier"],
  children: true,
});

export interface ShortNavigationBarProps {
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  containerColor?: string;
  contentColor?: string;
  windowInsets?: ComposeWindowInsets;
  children?: ReactNode;
}
export const ShortNavigationBar = createComposableComponent<ShortNavigationBarProps>({
  name: "ShortNavigationBar",
  props: ["modifier","containerColor","contentColor","windowInsets"],
  objectProps: ["windowInsets"],
  children: true,
});

export interface ShortNavigationBarItemProps {
  selected: boolean;
  onClick: () => void;
  icon: ReactNode;
  label: ReactNode;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  enabled?: boolean;
  interactionSource?: ComposeInteractionSource | null;
}
export const ShortNavigationBarItem = createComposableComponent<ShortNavigationBarItemProps>({
  name: "ShortNavigationBarItem",
  props: ["selected","modifier","enabled","interactionSource"],
  objectProps: ["interactionSource"],
  slots: ["icon","label"],
  events: ["onClick"],
  children: false,
});

export interface SingleChoiceSegmentedButtonRowProps {
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  space?: number;
  children?: ReactNode;
}
export const SingleChoiceSegmentedButtonRow = createComposableComponent<SingleChoiceSegmentedButtonRowProps>({
  name: "SingleChoiceSegmentedButtonRow",
  props: ["modifier","space"],
  children: true,
});

export interface SliderProps {
  value: number;
  onValueChange: (value: number) => void;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  enabled?: boolean;
  valueRange?: ComposeFloatRange;
  steps?: number;
  onValueChangeFinished?: (() => void) | null;
  interactionSource?: ComposeInteractionSource;
}
export const Slider = createComposableComponent<SliderProps>({
  name: "Slider",
  props: ["value","modifier","enabled","valueRange","steps","interactionSource"],
  objectProps: ["valueRange","interactionSource"],
  events: ["onValueChange","onValueChangeFinished"],
  children: false,
});

export type SmallExtendedFloatingActionButtonProps =
  | {
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    shape?: ComposeShape;
    containerColor?: string;
    contentColor?: string;
    interactionSource?: ComposeInteractionSource | null;
    children?: ReactNode;
    text?: never;
    icon?: never;
    expanded?: never;
    }
  | {
    text: ReactNode;
    icon: ReactNode;
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    expanded?: boolean;
    shape?: ComposeShape;
    containerColor?: string;
    contentColor?: string;
    interactionSource?: ComposeInteractionSource | null;
    children?: never;
    }
;
export const SmallExtendedFloatingActionButton = createComposableComponent<SmallExtendedFloatingActionButtonProps>({
  name: "SmallExtendedFloatingActionButton",
  props: ["modifier","shape","containerColor","contentColor","interactionSource","expanded"],
  objectProps: ["shape","interactionSource"],
  slots: ["text","icon"],
  events: ["onClick"],
  children: true,
  overloads: [
    { id: "SmallExtendedFloatingActionButton", children: true, parameters: [["onClick","function",false,false],["modifier","ComposeModifier",true,false],["shape","shape",true,false],["containerColor","string",true,false],["contentColor","string",true,false],["interactionSource","object",true,true]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15] },
    { id: "SmallExtendedFloatingActionButton#1", children: false, parameters: [["text","ReactNode",false,false],["icon","ReactNode",false,false],["onClick","function",false,false],["modifier","ComposeModifier",true,false],["expanded","boolean",true,false],["shape","shape",true,false],["containerColor","string",true,false],["contentColor","string",true,false],["interactionSource","object",true,true]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31] },
  ],
});

export interface SmallFloatingActionButtonProps {
  onClick: () => void;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  shape?: ComposeShape;
  containerColor?: string;
  contentColor?: string;
  interactionSource?: ComposeInteractionSource | null;
  children?: ReactNode;
}
export const SmallFloatingActionButton = createComposableComponent<SmallFloatingActionButtonProps>({
  name: "SmallFloatingActionButton",
  props: ["modifier","shape","containerColor","contentColor","interactionSource"],
  objectProps: ["shape","interactionSource"],
  events: ["onClick"],
  children: true,
});

export interface SnackbarProps {
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  action?: ReactNode;
  dismissAction?: ReactNode;
  actionOnNewLine?: boolean;
  shape?: ComposeShape;
  containerColor?: string;
  contentColor?: string;
  actionContentColor?: string;
  dismissActionContentColor?: string;
  children?: ReactNode;
}
export const Snackbar = createComposableComponent<SnackbarProps>({
  name: "Snackbar",
  props: ["modifier","actionOnNewLine","shape","containerColor","contentColor","actionContentColor","dismissActionContentColor"],
  objectProps: ["shape"],
  slots: ["action","dismissAction"],
  children: true,
});

export interface SnackbarHostProps {
  hostState: ComposeSnackbarHostState;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
}
export const SnackbarHost = createComposableComponent<SnackbarHostProps>({
  name: "SnackbarHost",
  props: ["hostState","modifier"],
  objectProps: ["hostState"],
  children: false,
});

export interface SpacerProps {
  modifiers: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
}
export const Spacer = createComposableComponent<SpacerProps>({
  name: "Spacer",
  props: ["modifier"],
  children: false,
});

export interface SplitButtonLayoutProps {
  leadingButton: ReactNode;
  trailingButton: ReactNode;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  spacing?: number;
}
export const SplitButtonLayout = createComposableComponent<SplitButtonLayoutProps>({
  name: "SplitButtonLayout",
  props: ["modifier","spacing"],
  slots: ["leadingButton","trailingButton"],
  children: false,
});

export interface StandardFloatingActionButtonProps {
  onClick: () => void;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  shape?: ComposeShape;
  containerColor?: string;
  contentColor?: string;
  interactionSource?: ComposeInteractionSource | null;
  children?: ReactNode;
}
export const StandardFloatingActionButton = createComposableComponent<StandardFloatingActionButtonProps>({
  name: "StandardFloatingActionButton",
  props: ["modifier","shape","containerColor","contentColor","interactionSource"],
  objectProps: ["shape","interactionSource"],
  events: ["onClick"],
  children: true,
});

export interface SuggestionChipProps {
  onClick: () => void;
  label: ReactNode;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  enabled?: boolean;
  icon?: ReactNode;
  shape?: ComposeShape;
  interactionSource?: ComposeInteractionSource | null;
}
export const SuggestionChip = createComposableComponent<SuggestionChipProps>({
  name: "SuggestionChip",
  props: ["modifier","enabled","shape","interactionSource"],
  objectProps: ["shape","interactionSource"],
  slots: ["label","icon"],
  events: ["onClick"],
  children: false,
});

export type SurfaceProps =
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    shape?: ComposeShape;
    color?: string;
    contentColor?: string;
    tonalElevation?: number;
    shadowElevation?: number;
    children?: ReactNode;
    onClick?: never;
    enabled?: never;
    interactionSource?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    shape?: ComposeShape;
    color?: string;
    contentColor?: string;
    tonalElevation?: number;
    shadowElevation?: number;
    interactionSource?: ComposeInteractionSource | null;
    children?: ReactNode;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    shape?: ComposeShape;
    color?: string;
    contentColor?: string;
    tonalElevation?: number;
    shadowElevation?: number;
    interactionSource?: ComposeInteractionSource | null;
    children?: ReactNode;
    onClick?: never;
    selected?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    shape?: ComposeShape;
    color?: string;
    contentColor?: string;
    tonalElevation?: number;
    shadowElevation?: number;
    interactionSource?: ComposeInteractionSource | null;
    children?: ReactNode;
    checked?: never;
    onCheckedChange?: never;
    }
;
export const Surface = createComposableComponent<SurfaceProps>({
  name: "Surface",
  props: ["modifier","shape","color","contentColor","tonalElevation","shadowElevation","enabled","interactionSource","checked","selected"],
  objectProps: ["shape","interactionSource"],
  events: ["onClick","onCheckedChange"],
  children: true,
  overloads: [
    { id: "Surface", children: true, parameters: [["modifier","ComposeModifier",true,false],["shape","shape",true,false],["color","string",true,false],["contentColor","string",true,false],["tonalElevation","number",true,false],["shadowElevation","number",true,false]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31] },
    { id: "Surface#1", children: true, parameters: [["onClick","function",false,false],["modifier","ComposeModifier",true,false],["enabled","boolean",true,false],["shape","shape",true,false],["color","string",true,false],["contentColor","string",true,false],["tonalElevation","number",true,false],["shadowElevation","number",true,false],["interactionSource","object",true,true]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,123,124,125,126,127] },
    { id: "Surface#2", children: true, parameters: [["checked","boolean",false,false],["onCheckedChange","function",false,false],["modifier","ComposeModifier",true,false],["enabled","boolean",true,false],["shape","shape",true,false],["color","string",true,false],["contentColor","string",true,false],["tonalElevation","number",true,false],["shadowElevation","number",true,false],["interactionSource","object",true,true]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,123,124,125,126,127] },
    { id: "Surface#3", children: true, parameters: [["selected","boolean",false,false],["onClick","function",false,false],["modifier","ComposeModifier",true,false],["enabled","boolean",true,false],["shape","shape",true,false],["color","string",true,false],["contentColor","string",true,false],["tonalElevation","number",true,false],["shadowElevation","number",true,false],["interactionSource","object",true,true]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,123,124,125,126,127] },
  ],
});

export interface SwipeToDismissBoxProps {
  state: ComposeSwipeToDismissState;
  backgroundContent: ReactNode;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  enableDismissFromStartToEnd?: boolean;
  enableDismissFromEndToStart?: boolean;
  gesturesEnabled?: boolean;
  children?: ReactNode;
}
export const SwipeToDismissBox = createComposableComponent<SwipeToDismissBoxProps>({
  name: "SwipeToDismissBox",
  props: ["state","modifier","enableDismissFromStartToEnd","enableDismissFromEndToStart","gesturesEnabled"],
  objectProps: ["state"],
  slots: ["backgroundContent"],
  children: true,
});

export interface SwitchProps {
  checked: boolean;
  onCheckedChange: ((value: boolean) => void) | null;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  thumbContent?: ReactNode;
  enabled?: boolean;
  interactionSource?: ComposeInteractionSource | null;
}
export const Switch = createComposableComponent<SwitchProps>({
  name: "Switch",
  props: ["checked","modifier","enabled","interactionSource"],
  objectProps: ["interactionSource"],
  slots: ["thumbContent"],
  events: ["onCheckedChange"],
  children: false,
});

export interface TabProps {
  selected: boolean;
  onClick: () => void;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  enabled?: boolean;
  text?: ReactNode;
  icon?: ReactNode;
  selectedContentColor?: string;
  unselectedContentColor?: string;
  interactionSource?: ComposeInteractionSource | null;
}
export const Tab = createComposableComponent<TabProps>({
  name: "Tab",
  props: ["selected","modifier","enabled","selectedContentColor","unselectedContentColor","interactionSource"],
  objectProps: ["interactionSource"],
  slots: ["text","icon"],
  events: ["onClick"],
  children: false,
});

export interface TabRowProps {
  selectedTabIndex: number;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  containerColor?: string;
  contentColor?: string;
  divider?: ReactNode;
  tabs: ReactNode;
}
export const TabRow = createComposableComponent<TabRowProps>({
  name: "TabRow",
  props: ["selectedTabIndex","modifier","containerColor","contentColor"],
  slots: ["divider","tabs"],
  children: false,
});

export type TextProps =
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color?: string;
    fontSize?: number;
    fontWeight?: ComposeFontWeight | null;
    letterSpacing?: number;
    textAlign?: ComposeTextAlign | null;
    lineHeight?: number;
    composeTextStyle?: ComposeTextStyle;
    overflow?: never;
    softWrap?: never;
    maxLines?: never;
    minLines?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color?: string;
    fontSize?: number;
    fontWeight?: ComposeFontWeight | null;
    letterSpacing?: number;
    textAlign?: ComposeTextAlign | null;
    lineHeight?: number;
    minLines: number;
    overflow?: never;
    softWrap?: never;
    maxLines?: never;
    composeTextStyle?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color?: string;
    fontSize?: number;
    fontWeight?: ComposeFontWeight | null;
    letterSpacing?: number;
    textAlign?: ComposeTextAlign | null;
    lineHeight?: number;
    maxLines: number;
    minLines?: number;
    overflow?: never;
    softWrap?: never;
    composeTextStyle?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color?: string;
    fontSize?: number;
    fontWeight?: ComposeFontWeight | null;
    letterSpacing?: number;
    textAlign?: ComposeTextAlign | null;
    lineHeight?: number;
    softWrap: boolean;
    maxLines?: number;
    minLines?: number;
    overflow?: never;
    composeTextStyle?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize?: number;
    fontWeight?: ComposeFontWeight | null;
    letterSpacing?: number;
    textAlign?: ComposeTextAlign | null;
    lineHeight?: number;
    overflow: ComposeTextOverflow;
    softWrap?: boolean;
    maxLines?: number;
    minLines?: number;
    color?: never;
    composeTextStyle?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    fontWeight?: ComposeFontWeight | null;
    letterSpacing?: number;
    textAlign?: ComposeTextAlign | null;
    lineHeight?: number;
    overflow: ComposeTextOverflow;
    softWrap?: boolean;
    maxLines?: number;
    minLines?: number;
    fontSize?: never;
    composeTextStyle?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    fontSize: number;
    letterSpacing?: number;
    textAlign?: ComposeTextAlign | null;
    lineHeight?: number;
    overflow: ComposeTextOverflow;
    softWrap?: boolean;
    maxLines?: number;
    minLines?: number;
    fontWeight?: never;
    composeTextStyle?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    textAlign?: ComposeTextAlign | null;
    lineHeight?: number;
    overflow: ComposeTextOverflow;
    softWrap?: boolean;
    maxLines?: number;
    minLines?: number;
    letterSpacing?: never;
    composeTextStyle?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    lineHeight?: number;
    overflow: ComposeTextOverflow;
    softWrap?: boolean;
    maxLines?: number;
    minLines?: number;
    textAlign?: never;
    composeTextStyle?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    overflow: ComposeTextOverflow;
    softWrap?: boolean;
    maxLines?: number;
    minLines?: number;
    lineHeight?: never;
    composeTextStyle?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    maxLines?: number;
    minLines?: number;
    softWrap?: never;
    composeTextStyle?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    minLines?: number;
    maxLines?: never;
    composeTextStyle?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    maxLines: number;
    minLines?: never;
    composeTextStyle?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    maxLines: number;
    minLines: number;
    composeTextStyle?: ComposeTextStyle;
    }
  | {
    text: ComposeAnnotatedString;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color?: string;
    fontSize?: number;
    letterSpacing?: number;
    textAlign?: ComposeTextAlign | null;
    lineHeight?: number;
    composeTextStyle?: ComposeTextStyle;
    fontWeight?: never;
    overflow?: never;
    softWrap?: never;
    maxLines?: never;
    minLines?: never;
    }
  | {
    text: ComposeAnnotatedString;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color?: string;
    fontSize?: number;
    letterSpacing?: number;
    lineHeight?: number;
    minLines: number;
    fontWeight?: never;
    textAlign?: never;
    overflow?: never;
    softWrap?: never;
    maxLines?: never;
    composeTextStyle?: never;
    }
  | {
    text: ComposeAnnotatedString;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color?: string;
    fontSize?: number;
    letterSpacing?: number;
    lineHeight?: number;
    maxLines: number;
    fontWeight?: never;
    textAlign?: never;
    overflow?: never;
    softWrap?: never;
    minLines?: never;
    composeTextStyle?: never;
    }
  | {
    text: ComposeAnnotatedString;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color?: string;
    fontSize?: number;
    letterSpacing?: number;
    lineHeight?: number;
    softWrap: boolean;
    fontWeight?: never;
    textAlign?: never;
    overflow?: never;
    maxLines?: never;
    minLines?: never;
    composeTextStyle?: never;
    }
  | {
    text: ComposeAnnotatedString;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color?: string;
    fontSize?: number;
    letterSpacing?: number;
    lineHeight?: number;
    overflow: ComposeTextOverflow;
    fontWeight?: never;
    textAlign?: never;
    softWrap?: never;
    maxLines?: never;
    minLines?: never;
    composeTextStyle?: never;
    }
  | {
    text: ComposeAnnotatedString;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color?: string;
    fontSize?: number;
    fontWeight: ComposeFontWeight | null;
    letterSpacing?: number;
    lineHeight?: number;
    composeTextStyle?: ComposeTextStyle;
    textAlign?: never;
    overflow?: never;
    softWrap?: never;
    maxLines?: never;
    minLines?: never;
    }
  | {
    text: ComposeAnnotatedString;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color?: string;
    fontSize?: number;
    fontWeight: ComposeFontWeight | null;
    letterSpacing?: number;
    textAlign: ComposeTextAlign | null;
    lineHeight?: number;
    composeTextStyle: ComposeTextStyle;
    overflow?: never;
    softWrap?: never;
    maxLines?: never;
    minLines?: never;
    }
  | {
    text: ComposeAnnotatedString;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    maxLines: number;
    minLines: number;
    composeTextStyle?: ComposeTextStyle;
    }
;
export const Text = createComposableComponent<TextProps>({
  name: "Text",
  props: ["text","modifier","color","fontSize","fontWeight","letterSpacing","textAlign","lineHeight","overflow","softWrap","maxLines","minLines","composeTextStyle"],
  objectProps: ["composeTextStyle","text"],
  children: false,
  overloads: [
    { id: "Text", children: false, parameters: [["text","string",false,false],["modifier","ComposeModifier",true,false],["color","string",true,false],["fontSize","number",true,false],["fontWeight","string",true,true],["letterSpacing","number",true,false],["textAlign","string",true,true],["lineHeight","number",true,false],["overflow","string",true,false],["softWrap","boolean",true,false],["maxLines","number",true,false],["minLines","number",true,false],["composeTextStyle","object",true,false]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,123,124,125,126,127,128,129,130,131,132,133,134,135,136,137,138,139,140,141,142,143,144,145,146,147,148,149,150,151,152,153,154,155,156,157,158,159,160,161,162,163,164,165,166,167,168,169,170,171,172,173,174,175,176,177,178,179,180,181,182,183,184,185,186,187,188,189,190,191,192,193,194,195,196,197,198,199,200,201,202,203,204,205,206,207,208,209,210,211,212,213,214,215,216,217,218,219,220,221,222,223,224,225,226,227,228,229,230,231,232,233,234,235,236,237,238,239,240,241,242,243,244,245,246,247,248,249,250,251,252,253,254,255,256,257,258,259,260,261,262,263,264,265,266,267,268,269,270,271,272,273,274,275,276,277,278,279,280,281,282,283,284,285,286,287,288,289,290,291,292,293,294,295,296,297,298,299,300,301,302,303,304,305,306,307,308,309,310,311,312,313,314,315,316,317,318,319,320,321,322,323,324,325,326,327,328,329,330,331,332,333,334,335,336,337,338,339,340,341,342,343,344,345,346,347,348,349,350,351,352,353,354,355,356,357,358,359,360,361,362,363,364,365,366,367,368,369,370,371,372,373,374,375,376,377,378,379,380,381,382,383,384,385,386,387,388,389,390,391,392,393,394,395,396,397,398,399,400,401,402,403,404,405,406,407,408,409,410,411,412,413,414,415,416,417,418,419,420,421,422,423,424,425,426,427,428,429,430,431,432,433,434,435,436,437,438,439,440,441,442,443,444,445,446,447,448,449,450,451,452,453,454,455,456,457,458,459,460,461,462,463,464,465,466,467,468,469,470,471,472,473,474,475,476,477,478,479,480,481,482,483,484,485,486,487,488,489,490,491,492,493,494,495,496,497,498,499,500,501,502,503,504,505,506,507,508,509,510,511,512,513,514,515,516,517,518,519,520,521,522,523,524,525,526,527,528,529,530,531,532,533,534,535,536,537,538,539,540,541,542,543,544,545,546,547,548,549,550,551,552,553,554,555,556,557,558,559,560,561,562,563,564,565,566,567,568,569,570,571,572,573,574,575,576,577,578,579,580,581,582,583,584,585,586,587,588,589,590,591,592,593,594,595,596,597,598,599,600,601,602,603,604,605,606,607,608,609,610,611,612,613,614,615,616,617,618,619,620,621,622,623,624,625,626,627,628,629,630,631,632,633,634,635,636,637,638,639,640,641,642,643,644,645,646,647,648,649,650,651,652,653,654,655,656,657,658,659,660,661,662,663,664,665,666,667,668,669,670,671,672,673,674,675,676,677,678,679,680,681,682,683,684,685,686,687,688,689,690,691,692,693,694,695,696,697,698,699,700,701,702,703,704,705,706,707,708,709,710,711,712,713,714,715,716,717,718,719,720,721,722,723,724,725,726,727,728,729,730,731,732,733,734,735,736,737,738,739,740,741,742,743,744,745,746,747,748,749,750,751,752,753,754,755,756,757,758,759,760,761,762,763,764,765,766,767,768,769,770,771,772,773,774,775,776,777,778,779,780,781,782,783,784,785,786,787,788,789,790,791,792,793,794,795,796,797,798,799,800,801,802,803,804,805,806,807,808,809,810,811,812,813,814,815,816,817,818,819,820,821,822,823,824,825,826,827,828,829,830,831,832,833,834,835,836,837,838,839,840,841,842,843,844,845,846,847,848,849,850,851,852,853,854,855,856,857,858,859,860,861,862,863,864,865,866,867,868,869,870,871,872,873,874,875,876,877,878,879,880,881,882,883,884,885,886,887,888,889,890,891,892,893,894,895,896,897,898,899,900,901,902,903,904,905,906,907,908,909,910,911,912,913,914,915,916,917,918,919,920,921,922,923,924,925,926,927,928,929,930,931,932,933,934,935,936,937,938,939,940,941,942,943,944,945,946,947,948,949,950,951,952,953,954,955,956,957,958,959,960,961,962,963,964,965,966,967,968,969,970,971,972,973,974,975,976,977,978,979,980,981,982,983,984,985,986,987,988,989,990,991,992,993,994,995,996,997,998,999,1000,1001,1002,1003,1004,1005,1006,1007,1008,1009,1010,1011,1012,1013,1014,1015,1016,1017,1018,1019,1020,1021,1022,1023,1024,1025,1026,1027,1028,1029,1030,1031,1032,1033,1034,1035,1036,1037,1038,1039,1040,1041,1042,1043,1044,1045,1046,1047,1048,1049,1050,1051,1052,1053,1054,1055,1056,1057,1058,1059,1060,1061,1062,1063,1064,1065,1066,1067,1068,1069,1070,1071,1072,1073,1074,1075,1076,1077,1078,1079,1080,1081,1082,1083,1084,1085,1086,1087,2047] },
    { id: "Text#1", children: false, parameters: [["text","object",false,false],["modifier","ComposeModifier",true,false],["color","string",true,false],["fontSize","number",true,false],["fontWeight","string",true,true],["letterSpacing","number",true,false],["textAlign","string",true,true],["lineHeight","number",true,false],["overflow","string",true,false],["softWrap","boolean",true,false],["maxLines","number",true,false],["minLines","number",true,false],["composeTextStyle","object",true,false]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,24,25,26,27,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,56,57,58,59,64,65,66,67,72,73,74,75,96,97,98,99,104,105,106,107,128,129,130,131,136,137,138,139,160,161,162,163,168,169,170,171,256,257,258,259,264,265,266,267,288,289,290,291,296,297,298,299,512,513,514,515,520,521,522,523,544,545,546,547,552,553,554,555,1023,1024,1025,1026,1027,1028,1029,1030,1031,1032,1033,1034,1035,1036,1037,1038,1039,1040,1041,1042,1043,1044,1045,1046,1047,1048,1049,1050,1051,1052,1053,1054,1055,1056,1057,1058,1059,1060,1061,1062,1063,1064,1065,1066,1067,1068,1069,1070,1071,1072,1073,1074,1075,1076,1077,1078,1079,1080,1081,1082,1083,1084,1085,1086,1087,2047] },
  ],
});

export interface TextButtonProps {
  onClick: () => void;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  enabled?: boolean;
  shape?: ComposeShape;
  contentPadding?: ComposePaddingValues;
  interactionSource?: ComposeInteractionSource | null;
  children?: ReactNode;
}
export const TextButton = createComposableComponent<TextButtonProps>({
  name: "TextButton",
  props: ["modifier","enabled","shape","contentPadding","interactionSource"],
  objectProps: ["shape","contentPadding","interactionSource"],
  events: ["onClick"],
  children: true,
});

export type TextFieldProps =
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly?: boolean;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    trailingIcon?: ReactNode;
    interactionSource?: ComposeInteractionSource | null;
    textStyle?: never;
    prefix?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    shape?: never;
    contentPadding?: never;
    value?: never;
    onValueChange?: never;
    label?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly?: boolean;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    contentPadding: ComposePaddingValues;
    textStyle?: never;
    trailingIcon?: never;
    prefix?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    shape?: never;
    interactionSource?: never;
    value?: never;
    onValueChange?: never;
    label?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly?: boolean;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    shape: ComposeShape;
    textStyle?: never;
    trailingIcon?: never;
    prefix?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    contentPadding?: never;
    interactionSource?: never;
    value?: never;
    onValueChange?: never;
    label?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly?: boolean;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    isError: boolean;
    textStyle?: never;
    trailingIcon?: never;
    prefix?: never;
    suffix?: never;
    supportingText?: never;
    shape?: never;
    contentPadding?: never;
    interactionSource?: never;
    value?: never;
    onValueChange?: never;
    label?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly?: boolean;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    supportingText: ReactNode;
    textStyle?: never;
    trailingIcon?: never;
    prefix?: never;
    suffix?: never;
    isError?: never;
    shape?: never;
    contentPadding?: never;
    interactionSource?: never;
    value?: never;
    onValueChange?: never;
    label?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly?: boolean;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    suffix: ReactNode;
    textStyle?: never;
    trailingIcon?: never;
    prefix?: never;
    supportingText?: never;
    isError?: never;
    shape?: never;
    contentPadding?: never;
    interactionSource?: never;
    value?: never;
    onValueChange?: never;
    label?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly?: boolean;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    prefix: ReactNode;
    textStyle?: never;
    trailingIcon?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    shape?: never;
    contentPadding?: never;
    interactionSource?: never;
    value?: never;
    onValueChange?: never;
    label?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly?: boolean;
    textStyle: ComposeTextStyle;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    interactionSource?: ComposeInteractionSource | null;
    trailingIcon?: never;
    prefix?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    shape?: never;
    contentPadding?: never;
    value?: never;
    onValueChange?: never;
    label?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly?: boolean;
    textStyle: ComposeTextStyle;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    trailingIcon: ReactNode;
    interactionSource: ComposeInteractionSource | null;
    prefix?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    shape?: never;
    contentPadding?: never;
    value?: never;
    onValueChange?: never;
    label?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    readOnly: boolean;
    textStyle: ComposeTextStyle;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    supportingText: ReactNode;
    isError: boolean;
    shape: ComposeShape;
    contentPadding: ComposePaddingValues;
    interactionSource?: ComposeInteractionSource | null;
    value?: never;
    onValueChange?: never;
    label?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    }
  | {
    value: ComposeTextFieldValue;
    onValueChange: (value: ComposeTextFieldSnapshot) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly?: boolean;
    label?: ReactNode;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    trailingIcon?: ReactNode;
    prefix?: ReactNode;
    shape?: ComposeShape;
    state?: never;
    textStyle?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    contentPadding?: never;
    interactionSource?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    }
  | {
    value: ComposeTextFieldValue;
    onValueChange: (value: ComposeTextFieldSnapshot) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly?: boolean;
    label?: ReactNode;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    interactionSource: ComposeInteractionSource | null;
    state?: never;
    textStyle?: never;
    trailingIcon?: never;
    prefix?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    shape?: never;
    contentPadding?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    }
  | {
    value: ComposeTextFieldValue;
    onValueChange: (value: ComposeTextFieldSnapshot) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly?: boolean;
    label?: ReactNode;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    trailingIcon?: ReactNode;
    prefix?: ReactNode;
    minLines: number;
    state?: never;
    textStyle?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    shape?: never;
    contentPadding?: never;
    interactionSource?: never;
    singleLine?: never;
    maxLines?: never;
    }
  | {
    value: ComposeTextFieldValue;
    onValueChange: (value: ComposeTextFieldSnapshot) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly?: boolean;
    label?: ReactNode;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    trailingIcon?: ReactNode;
    prefix?: ReactNode;
    maxLines: number;
    state?: never;
    textStyle?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    shape?: never;
    contentPadding?: never;
    interactionSource?: never;
    singleLine?: never;
    minLines?: never;
    }
  | {
    value: ComposeTextFieldValue;
    onValueChange: (value: ComposeTextFieldSnapshot) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly?: boolean;
    label?: ReactNode;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    trailingIcon?: ReactNode;
    prefix?: ReactNode;
    singleLine: boolean;
    state?: never;
    textStyle?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    shape?: never;
    contentPadding?: never;
    interactionSource?: never;
    maxLines?: never;
    minLines?: never;
    }
  | {
    value: ComposeTextFieldValue;
    onValueChange: (value: ComposeTextFieldSnapshot) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly?: boolean;
    label?: ReactNode;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    trailingIcon?: ReactNode;
    prefix?: ReactNode;
    isError: boolean;
    state?: never;
    textStyle?: never;
    suffix?: never;
    supportingText?: never;
    shape?: never;
    contentPadding?: never;
    interactionSource?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    }
  | {
    value: ComposeTextFieldValue;
    onValueChange: (value: ComposeTextFieldSnapshot) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly?: boolean;
    label?: ReactNode;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    trailingIcon?: ReactNode;
    prefix?: ReactNode;
    supportingText: ReactNode;
    state?: never;
    textStyle?: never;
    suffix?: never;
    isError?: never;
    shape?: never;
    contentPadding?: never;
    interactionSource?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    }
  | {
    value: ComposeTextFieldValue;
    onValueChange: (value: ComposeTextFieldSnapshot) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly?: boolean;
    label?: ReactNode;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    trailingIcon?: ReactNode;
    prefix?: ReactNode;
    suffix: ReactNode;
    state?: never;
    textStyle?: never;
    supportingText?: never;
    isError?: never;
    shape?: never;
    contentPadding?: never;
    interactionSource?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    }
  | {
    value: ComposeTextFieldValue;
    onValueChange: (value: ComposeTextFieldSnapshot) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly?: boolean;
    textStyle: ComposeTextStyle;
    label?: ReactNode;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    interactionSource?: ComposeInteractionSource | null;
    state?: never;
    trailingIcon?: never;
    prefix?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    shape?: never;
    contentPadding?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    }
  | {
    value: ComposeTextFieldValue;
    onValueChange: (value: ComposeTextFieldSnapshot) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly?: boolean;
    textStyle: ComposeTextStyle;
    label?: ReactNode;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    prefix: ReactNode;
    state?: never;
    trailingIcon?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    shape?: never;
    contentPadding?: never;
    interactionSource?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    }
  | {
    value: ComposeTextFieldValue;
    onValueChange: (value: ComposeTextFieldSnapshot) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly?: boolean;
    textStyle: ComposeTextStyle;
    label?: ReactNode;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    trailingIcon: ReactNode;
    prefix?: ReactNode;
    state?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    shape?: never;
    contentPadding?: never;
    interactionSource?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    }
  | {
    value: ComposeTextFieldValue;
    onValueChange: (value: ComposeTextFieldSnapshot) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    readOnly: boolean;
    label: ReactNode;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    supportingText: ReactNode;
    isError: boolean;
    singleLine: boolean;
    maxLines: number;
    minLines: number;
    shape: ComposeShape;
    state?: never;
    textStyle?: never;
    contentPadding?: never;
    interactionSource?: never;
    }
  | {
    value: ComposeTextFieldValue;
    onValueChange: (value: ComposeTextFieldSnapshot) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    readOnly: boolean;
    textStyle: ComposeTextStyle;
    label: ReactNode;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    supportingText: ReactNode;
    isError: boolean;
    singleLine: boolean;
    maxLines: number;
    minLines: number;
    interactionSource?: ComposeInteractionSource | null;
    shape: ComposeShape;
    state?: never;
    contentPadding?: never;
    }
  | {
    value: string;
    onValueChange: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly?: boolean;
    label?: ReactNode;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    trailingIcon?: ReactNode;
    prefix?: ReactNode;
    shape?: ComposeShape;
    state?: never;
    textStyle?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    contentPadding?: never;
    interactionSource?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    }
  | {
    value: string;
    onValueChange: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly?: boolean;
    label?: ReactNode;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    interactionSource: ComposeInteractionSource | null;
    state?: never;
    textStyle?: never;
    trailingIcon?: never;
    prefix?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    shape?: never;
    contentPadding?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    }
  | {
    value: string;
    onValueChange: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly?: boolean;
    label?: ReactNode;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    trailingIcon?: ReactNode;
    prefix?: ReactNode;
    minLines: number;
    state?: never;
    textStyle?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    shape?: never;
    contentPadding?: never;
    interactionSource?: never;
    singleLine?: never;
    maxLines?: never;
    }
  | {
    value: string;
    onValueChange: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly?: boolean;
    label?: ReactNode;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    trailingIcon?: ReactNode;
    prefix?: ReactNode;
    maxLines: number;
    state?: never;
    textStyle?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    shape?: never;
    contentPadding?: never;
    interactionSource?: never;
    singleLine?: never;
    minLines?: never;
    }
  | {
    value: string;
    onValueChange: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly?: boolean;
    label?: ReactNode;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    trailingIcon?: ReactNode;
    prefix?: ReactNode;
    singleLine: boolean;
    state?: never;
    textStyle?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    shape?: never;
    contentPadding?: never;
    interactionSource?: never;
    maxLines?: never;
    minLines?: never;
    }
  | {
    value: string;
    onValueChange: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly?: boolean;
    label?: ReactNode;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    trailingIcon?: ReactNode;
    prefix?: ReactNode;
    isError: boolean;
    state?: never;
    textStyle?: never;
    suffix?: never;
    supportingText?: never;
    shape?: never;
    contentPadding?: never;
    interactionSource?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    }
  | {
    value: string;
    onValueChange: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly?: boolean;
    label?: ReactNode;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    trailingIcon?: ReactNode;
    prefix?: ReactNode;
    supportingText: ReactNode;
    state?: never;
    textStyle?: never;
    suffix?: never;
    isError?: never;
    shape?: never;
    contentPadding?: never;
    interactionSource?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    }
  | {
    value: string;
    onValueChange: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly?: boolean;
    label?: ReactNode;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    trailingIcon?: ReactNode;
    prefix?: ReactNode;
    suffix: ReactNode;
    state?: never;
    textStyle?: never;
    supportingText?: never;
    isError?: never;
    shape?: never;
    contentPadding?: never;
    interactionSource?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    }
  | {
    value: string;
    onValueChange: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly?: boolean;
    textStyle: ComposeTextStyle;
    label?: ReactNode;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    interactionSource?: ComposeInteractionSource | null;
    state?: never;
    trailingIcon?: never;
    prefix?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    shape?: never;
    contentPadding?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    }
  | {
    value: string;
    onValueChange: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly?: boolean;
    textStyle: ComposeTextStyle;
    label?: ReactNode;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    prefix: ReactNode;
    state?: never;
    trailingIcon?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    shape?: never;
    contentPadding?: never;
    interactionSource?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    }
  | {
    value: string;
    onValueChange: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly?: boolean;
    textStyle: ComposeTextStyle;
    label?: ReactNode;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    trailingIcon: ReactNode;
    prefix?: ReactNode;
    state?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    shape?: never;
    contentPadding?: never;
    interactionSource?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    }
  | {
    value: string;
    onValueChange: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    readOnly: boolean;
    label: ReactNode;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    supportingText: ReactNode;
    isError: boolean;
    singleLine: boolean;
    maxLines: number;
    minLines: number;
    shape: ComposeShape;
    state?: never;
    textStyle?: never;
    contentPadding?: never;
    interactionSource?: never;
    }
  | {
    value: string;
    onValueChange: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    readOnly: boolean;
    textStyle: ComposeTextStyle;
    label: ReactNode;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    supportingText: ReactNode;
    isError: boolean;
    singleLine: boolean;
    maxLines: number;
    minLines: number;
    interactionSource?: ComposeInteractionSource | null;
    shape: ComposeShape;
    state?: never;
    contentPadding?: never;
    }
;
export const TextField = createComposableComponent<TextFieldProps>({
  name: "TextField",
  props: ["state","modifier","enabled","readOnly","textStyle","isError","shape","contentPadding","interactionSource","value","singleLine","maxLines","minLines"],
  objectProps: ["state","textStyle","shape","contentPadding","interactionSource","value"],
  slots: ["placeholder","leadingIcon","trailingIcon","prefix","suffix","supportingText","label"],
  events: ["onValueChange"],
  children: false,
  overloads: [
    { id: "TextField", children: false, parameters: [["state","object",false,false],["modifier","ComposeModifier",true,false],["enabled","boolean",true,false],["readOnly","boolean",true,false],["textStyle","object",true,false],["placeholder","ReactNode",true,true],["leadingIcon","ReactNode",true,true],["trailingIcon","ReactNode",true,true],["prefix","ReactNode",true,true],["suffix","ReactNode",true,true],["supportingText","ReactNode",true,true],["isError","boolean",true,false],["shape","shape",true,false],["contentPadding","object",true,false],["interactionSource","object",true,true]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,40,41,42,43,48,49,50,51,56,57,58,59,64,65,66,67,72,73,74,75,80,81,82,83,88,89,90,91,128,129,130,131,136,137,138,139,144,145,146,147,152,153,154,155,256,257,258,259,264,265,266,267,272,273,274,275,280,281,282,283,512,513,514,515,520,521,522,523,528,529,530,531,536,537,538,539,1024,1025,1026,1027,1032,1033,1034,1035,1040,1041,1042,1043,1048,1049,1050,1051,2048,2049,2050,2051,2056,2057,2058,2059,2064,2065,2066,2067,2072,2073,2074,2075,4095,4096,4097,4098,4099,4100,4101,4102,4103,4104,4105,4106,4107,4108,4109,4110,4111,4112,4113,4114,4115,4116,4117,4118,4119,4120,4121,4122,4123,4124,4125,4126,4127,4128,4129,4130,4131,4132,4133,4134,4135,4136,4137,4138,4139,4140,4141,4142,4143,4144,4145,4146,4147,4148,4149,4150,4151,4152,4153,4154,4155,4156,4157,4158,4159,8191] },
    { id: "TextField#1", children: false, parameters: [["value","object",false,false],["onValueChange","function",false,false],["modifier","ComposeModifier",true,false],["enabled","boolean",true,false],["readOnly","boolean",true,false],["textStyle","object",true,false],["label","ReactNode",true,true],["placeholder","ReactNode",true,true],["leadingIcon","ReactNode",true,true],["trailingIcon","ReactNode",true,true],["prefix","ReactNode",true,true],["suffix","ReactNode",true,true],["supportingText","ReactNode",true,true],["isError","boolean",true,false],["singleLine","boolean",true,false],["maxLines","number",true,false],["minLines","number",true,false],["interactionSource","object",true,true],["shape","shape",true,false]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,123,124,125,126,127,128,129,130,131,132,133,134,135,136,137,138,139,140,141,142,143,144,145,146,147,148,149,150,151,152,153,154,155,156,157,158,159,160,161,162,163,164,165,166,167,168,169,170,171,172,173,174,175,176,177,178,179,180,181,182,183,184,185,186,187,188,189,190,191,192,193,194,195,196,197,198,199,200,201,202,203,204,205,206,207,208,209,210,211,212,213,214,215,216,217,218,219,220,221,222,223,224,225,226,227,228,229,230,231,232,233,234,235,236,237,238,239,240,241,242,243,244,245,246,247,248,249,250,251,252,253,254,255,256,257,258,259,264,265,266,267,272,273,274,275,280,281,282,283,288,289,290,291,296,297,298,299,304,305,306,307,312,313,314,315,320,321,322,323,328,329,330,331,336,337,338,339,344,345,346,347,352,353,354,355,360,361,362,363,368,369,370,371,376,377,378,379,384,385,386,387,392,393,394,395,400,401,402,403,408,409,410,411,416,417,418,419,424,425,426,427,432,433,434,435,440,441,442,443,448,449,450,451,456,457,458,459,464,465,466,467,472,473,474,475,480,481,482,483,488,489,490,491,496,497,498,499,504,505,506,507,512,513,514,515,520,521,522,523,528,529,530,531,536,537,538,539,544,545,546,547,552,553,554,555,560,561,562,563,568,569,570,571,576,577,578,579,584,585,586,587,592,593,594,595,600,601,602,603,608,609,610,611,616,617,618,619,624,625,626,627,632,633,634,635,640,641,642,643,648,649,650,651,656,657,658,659,664,665,666,667,672,673,674,675,680,681,682,683,688,689,690,691,696,697,698,699,704,705,706,707,712,713,714,715,720,721,722,723,728,729,730,731,736,737,738,739,744,745,746,747,752,753,754,755,760,761,762,763,1024,1025,1026,1027,1032,1033,1034,1035,1040,1041,1042,1043,1048,1049,1050,1051,1056,1057,1058,1059,1064,1065,1066,1067,1072,1073,1074,1075,1080,1081,1082,1083,1088,1089,1090,1091,1096,1097,1098,1099,1104,1105,1106,1107,1112,1113,1114,1115,1120,1121,1122,1123,1128,1129,1130,1131,1136,1137,1138,1139,1144,1145,1146,1147,1152,1153,1154,1155,1160,1161,1162,1163,1168,1169,1170,1171,1176,1177,1178,1179,1184,1185,1186,1187,1192,1193,1194,1195,1200,1201,1202,1203,1208,1209,1210,1211,1216,1217,1218,1219,1224,1225,1226,1227,1232,1233,1234,1235,1240,1241,1242,1243,1248,1249,1250,1251,1256,1257,1258,1259,1264,1265,1266,1267,1272,1273,1274,1275,2048,2049,2050,2051,2056,2057,2058,2059,2064,2065,2066,2067,2072,2073,2074,2075,2080,2081,2082,2083,2088,2089,2090,2091,2096,2097,2098,2099,2104,2105,2106,2107,2112,2113,2114,2115,2120,2121,2122,2123,2128,2129,2130,2131,2136,2137,2138,2139,2144,2145,2146,2147,2152,2153,2154,2155,2160,2161,2162,2163,2168,2169,2170,2171,2176,2177,2178,2179,2184,2185,2186,2187,2192,2193,2194,2195,2200,2201,2202,2203,2208,2209,2210,2211,2216,2217,2218,2219,2224,2225,2226,2227,2232,2233,2234,2235,2240,2241,2242,2243,2248,2249,2250,2251,2256,2257,2258,2259,2264,2265,2266,2267,2272,2273,2274,2275,2280,2281,2282,2283,2288,2289,2290,2291,2296,2297,2298,2299,4096,4097,4098,4099,4104,4105,4106,4107,4112,4113,4114,4115,4120,4121,4122,4123,4128,4129,4130,4131,4136,4137,4138,4139,4144,4145,4146,4147,4152,4153,4154,4155,4160,4161,4162,4163,4168,4169,4170,4171,4176,4177,4178,4179,4184,4185,4186,4187,4192,4193,4194,4195,4200,4201,4202,4203,4208,4209,4210,4211,4216,4217,4218,4219,4224,4225,4226,4227,4232,4233,4234,4235,4240,4241,4242,4243,4248,4249,4250,4251,4256,4257,4258,4259,4264,4265,4266,4267,4272,4273,4274,4275,4280,4281,4282,4283,4288,4289,4290,4291,4296,4297,4298,4299,4304,4305,4306,4307,4312,4313,4314,4315,4320,4321,4322,4323,4328,4329,4330,4331,4336,4337,4338,4339,4344,4345,4346,4347,8192,8193,8194,8195,8200,8201,8202,8203,8208,8209,8210,8211,8216,8217,8218,8219,8224,8225,8226,8227,8232,8233,8234,8235,8240,8241,8242,8243,8248,8249,8250,8251,8256,8257,8258,8259,8264,8265,8266,8267,8272,8273,8274,8275,8280,8281,8282,8283,8288,8289,8290,8291,8296,8297,8298,8299,8304,8305,8306,8307,8312,8313,8314,8315,8320,8321,8322,8323,8328,8329,8330,8331,8336,8337,8338,8339,8344,8345,8346,8347,8352,8353,8354,8355,8360,8361,8362,8363,8368,8369,8370,8371,8376,8377,8378,8379,8384,8385,8386,8387,8392,8393,8394,8395,8400,8401,8402,8403,8408,8409,8410,8411,8416,8417,8418,8419,8424,8425,8426,8427,8432,8433,8434,8435,8440,8441,8442,8443,16384,16385,16386,16387,16388,16389,16390,16391,16392,16393,16394,16395,16396,16397,16398,16399,16400,16401,16402,16403,16404,16405,16406,16407,16408,16409,16410,16411,16412,16413,16414,16415,16416,16417,16418,16419,16420,16421,16422,16423,16424,16425,16426,16427,16428,16429,16430,16431,16432,16433,16434,16435,16436,16437,16438,16439,16440,16441,16442,16443,16444,16445,16446,16447,32768,32769,32770,32771,32776,32777,32778,32779,32784,32785,32786,32787,32792,32793,32794,32795,32800,32801,32802,32803,32808,32809,32810,32811,32816,32817,32818,32819,32824,32825,32826,32827,32832,32833,32834,32835,32840,32841,32842,32843,32848,32849,32850,32851,32856,32857,32858,32859,32864,32865,32866,32867,32872,32873,32874,32875,32880,32881,32882,32883,32888,32889,32890,32891,32896,32897,32898,32899,32904,32905,32906,32907,32912,32913,32914,32915,32920,32921,32922,32923,32928,32929,32930,32931,32936,32937,32938,32939,32944,32945,32946,32947,32952,32953,32954,32955,32960,32961,32962,32963,32968,32969,32970,32971,32976,32977,32978,32979,32984,32985,32986,32987,32992,32993,32994,32995,33000,33001,33002,33003,33008,33009,33010,33011,33016,33017,33018,33019,49147,49151,65535] },
    { id: "TextField#2", children: false, parameters: [["value","string",false,false],["onValueChange","function",false,false],["modifier","ComposeModifier",true,false],["enabled","boolean",true,false],["readOnly","boolean",true,false],["textStyle","object",true,false],["label","ReactNode",true,true],["placeholder","ReactNode",true,true],["leadingIcon","ReactNode",true,true],["trailingIcon","ReactNode",true,true],["prefix","ReactNode",true,true],["suffix","ReactNode",true,true],["supportingText","ReactNode",true,true],["isError","boolean",true,false],["singleLine","boolean",true,false],["maxLines","number",true,false],["minLines","number",true,false],["interactionSource","object",true,true],["shape","shape",true,false]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,123,124,125,126,127,128,129,130,131,132,133,134,135,136,137,138,139,140,141,142,143,144,145,146,147,148,149,150,151,152,153,154,155,156,157,158,159,160,161,162,163,164,165,166,167,168,169,170,171,172,173,174,175,176,177,178,179,180,181,182,183,184,185,186,187,188,189,190,191,192,193,194,195,196,197,198,199,200,201,202,203,204,205,206,207,208,209,210,211,212,213,214,215,216,217,218,219,220,221,222,223,224,225,226,227,228,229,230,231,232,233,234,235,236,237,238,239,240,241,242,243,244,245,246,247,248,249,250,251,252,253,254,255,256,257,258,259,264,265,266,267,272,273,274,275,280,281,282,283,288,289,290,291,296,297,298,299,304,305,306,307,312,313,314,315,320,321,322,323,328,329,330,331,336,337,338,339,344,345,346,347,352,353,354,355,360,361,362,363,368,369,370,371,376,377,378,379,384,385,386,387,392,393,394,395,400,401,402,403,408,409,410,411,416,417,418,419,424,425,426,427,432,433,434,435,440,441,442,443,448,449,450,451,456,457,458,459,464,465,466,467,472,473,474,475,480,481,482,483,488,489,490,491,496,497,498,499,504,505,506,507,512,513,514,515,520,521,522,523,528,529,530,531,536,537,538,539,544,545,546,547,552,553,554,555,560,561,562,563,568,569,570,571,576,577,578,579,584,585,586,587,592,593,594,595,600,601,602,603,608,609,610,611,616,617,618,619,624,625,626,627,632,633,634,635,640,641,642,643,648,649,650,651,656,657,658,659,664,665,666,667,672,673,674,675,680,681,682,683,688,689,690,691,696,697,698,699,704,705,706,707,712,713,714,715,720,721,722,723,728,729,730,731,736,737,738,739,744,745,746,747,752,753,754,755,760,761,762,763,1024,1025,1026,1027,1032,1033,1034,1035,1040,1041,1042,1043,1048,1049,1050,1051,1056,1057,1058,1059,1064,1065,1066,1067,1072,1073,1074,1075,1080,1081,1082,1083,1088,1089,1090,1091,1096,1097,1098,1099,1104,1105,1106,1107,1112,1113,1114,1115,1120,1121,1122,1123,1128,1129,1130,1131,1136,1137,1138,1139,1144,1145,1146,1147,1152,1153,1154,1155,1160,1161,1162,1163,1168,1169,1170,1171,1176,1177,1178,1179,1184,1185,1186,1187,1192,1193,1194,1195,1200,1201,1202,1203,1208,1209,1210,1211,1216,1217,1218,1219,1224,1225,1226,1227,1232,1233,1234,1235,1240,1241,1242,1243,1248,1249,1250,1251,1256,1257,1258,1259,1264,1265,1266,1267,1272,1273,1274,1275,2048,2049,2050,2051,2056,2057,2058,2059,2064,2065,2066,2067,2072,2073,2074,2075,2080,2081,2082,2083,2088,2089,2090,2091,2096,2097,2098,2099,2104,2105,2106,2107,2112,2113,2114,2115,2120,2121,2122,2123,2128,2129,2130,2131,2136,2137,2138,2139,2144,2145,2146,2147,2152,2153,2154,2155,2160,2161,2162,2163,2168,2169,2170,2171,2176,2177,2178,2179,2184,2185,2186,2187,2192,2193,2194,2195,2200,2201,2202,2203,2208,2209,2210,2211,2216,2217,2218,2219,2224,2225,2226,2227,2232,2233,2234,2235,2240,2241,2242,2243,2248,2249,2250,2251,2256,2257,2258,2259,2264,2265,2266,2267,2272,2273,2274,2275,2280,2281,2282,2283,2288,2289,2290,2291,2296,2297,2298,2299,4096,4097,4098,4099,4104,4105,4106,4107,4112,4113,4114,4115,4120,4121,4122,4123,4128,4129,4130,4131,4136,4137,4138,4139,4144,4145,4146,4147,4152,4153,4154,4155,4160,4161,4162,4163,4168,4169,4170,4171,4176,4177,4178,4179,4184,4185,4186,4187,4192,4193,4194,4195,4200,4201,4202,4203,4208,4209,4210,4211,4216,4217,4218,4219,4224,4225,4226,4227,4232,4233,4234,4235,4240,4241,4242,4243,4248,4249,4250,4251,4256,4257,4258,4259,4264,4265,4266,4267,4272,4273,4274,4275,4280,4281,4282,4283,4288,4289,4290,4291,4296,4297,4298,4299,4304,4305,4306,4307,4312,4313,4314,4315,4320,4321,4322,4323,4328,4329,4330,4331,4336,4337,4338,4339,4344,4345,4346,4347,8192,8193,8194,8195,8200,8201,8202,8203,8208,8209,8210,8211,8216,8217,8218,8219,8224,8225,8226,8227,8232,8233,8234,8235,8240,8241,8242,8243,8248,8249,8250,8251,8256,8257,8258,8259,8264,8265,8266,8267,8272,8273,8274,8275,8280,8281,8282,8283,8288,8289,8290,8291,8296,8297,8298,8299,8304,8305,8306,8307,8312,8313,8314,8315,8320,8321,8322,8323,8328,8329,8330,8331,8336,8337,8338,8339,8344,8345,8346,8347,8352,8353,8354,8355,8360,8361,8362,8363,8368,8369,8370,8371,8376,8377,8378,8379,8384,8385,8386,8387,8392,8393,8394,8395,8400,8401,8402,8403,8408,8409,8410,8411,8416,8417,8418,8419,8424,8425,8426,8427,8432,8433,8434,8435,8440,8441,8442,8443,16384,16385,16386,16387,16388,16389,16390,16391,16392,16393,16394,16395,16396,16397,16398,16399,16400,16401,16402,16403,16404,16405,16406,16407,16408,16409,16410,16411,16412,16413,16414,16415,16416,16417,16418,16419,16420,16421,16422,16423,16424,16425,16426,16427,16428,16429,16430,16431,16432,16433,16434,16435,16436,16437,16438,16439,16440,16441,16442,16443,16444,16445,16446,16447,32768,32769,32770,32771,32776,32777,32778,32779,32784,32785,32786,32787,32792,32793,32794,32795,32800,32801,32802,32803,32808,32809,32810,32811,32816,32817,32818,32819,32824,32825,32826,32827,32832,32833,32834,32835,32840,32841,32842,32843,32848,32849,32850,32851,32856,32857,32858,32859,32864,32865,32866,32867,32872,32873,32874,32875,32880,32881,32882,32883,32888,32889,32890,32891,32896,32897,32898,32899,32904,32905,32906,32907,32912,32913,32914,32915,32920,32921,32922,32923,32928,32929,32930,32931,32936,32937,32938,32939,32944,32945,32946,32947,32952,32953,32954,32955,32960,32961,32962,32963,32968,32969,32970,32971,32976,32977,32978,32979,32984,32985,32986,32987,32992,32993,32994,32995,33000,33001,33002,33003,33008,33009,33010,33011,33016,33017,33018,33019,49147,49151,65535] },
  ],
});

export interface ThumbProps {
  interactionSource: ComposeInteractionSource;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  enabled?: boolean;
  thumbSize?: ComposeDpSize;
}
export const Thumb = createComposableComponent<ThumbProps>({
  name: "Thumb",
  props: ["interactionSource","modifier","enabled","thumbSize"],
  objectProps: ["interactionSource","thumbSize"],
  children: false,
});

export interface TimeInputProps {
  state: ComposeTimePickerState;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
}
export const TimeInput = createComposableComponent<TimeInputProps>({
  name: "TimeInput",
  props: ["state","modifier"],
  objectProps: ["state"],
  children: false,
});

export interface TimePickerProps {
  state: ComposeTimePickerState;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
}
export const TimePicker = createComposableComponent<TimePickerProps>({
  name: "TimePicker",
  props: ["state","modifier"],
  objectProps: ["state"],
  children: false,
});

export interface TimePickerDialogProps {
  onDismissRequest: () => void;
  confirmButton: ReactNode;
  title: ReactNode;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  modeToggleButton?: ReactNode;
  dismissButton?: ReactNode;
  shape?: ComposeShape;
  containerColor?: string;
  children?: ReactNode;
}
export const TimePickerDialog = createComposableComponent<TimePickerDialogProps>({
  name: "TimePickerDialog",
  props: ["modifier","shape","containerColor"],
  objectProps: ["shape"],
  slots: ["confirmButton","title","modeToggleButton","dismissButton"],
  events: ["onDismissRequest"],
  children: true,
});

export interface ToggleButtonProps {
  checked: boolean;
  onCheckedChange: (value: boolean) => void;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  enabled?: boolean;
  contentPadding?: ComposePaddingValues;
  interactionSource?: ComposeInteractionSource | null;
  children?: ReactNode;
}
export const ToggleButton = createComposableComponent<ToggleButtonProps>({
  name: "ToggleButton",
  props: ["checked","modifier","enabled","contentPadding","interactionSource"],
  objectProps: ["contentPadding","interactionSource"],
  events: ["onCheckedChange"],
  children: true,
});

export interface ToggleFloatingActionButtonProps {
  checked: boolean;
  onCheckedChange: (value: boolean) => void;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  contentAlignment?: ComposeAlignment;
  children?: ReactNode;
}
export const ToggleFloatingActionButton = createComposableComponent<ToggleFloatingActionButtonProps>({
  name: "ToggleFloatingActionButton",
  props: ["checked","modifier","contentAlignment"],
  events: ["onCheckedChange"],
  children: true,
});

export interface TonalLeadingButtonProps {
  onClick: () => void;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  enabled?: boolean;
  contentPadding?: ComposePaddingValues;
  interactionSource?: ComposeInteractionSource | null;
  children?: ReactNode;
}
export const TonalLeadingButton = createComposableComponent<TonalLeadingButtonProps>({
  name: "TonalLeadingButton",
  props: ["modifier","enabled","contentPadding","interactionSource"],
  objectProps: ["contentPadding","interactionSource"],
  events: ["onClick"],
  children: true,
});

export interface TonalToggleButtonProps {
  checked: boolean;
  onCheckedChange: (value: boolean) => void;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  enabled?: boolean;
  contentPadding?: ComposePaddingValues;
  interactionSource?: ComposeInteractionSource | null;
  children?: ReactNode;
}
export const TonalToggleButton = createComposableComponent<TonalToggleButtonProps>({
  name: "TonalToggleButton",
  props: ["checked","modifier","enabled","contentPadding","interactionSource"],
  objectProps: ["contentPadding","interactionSource"],
  events: ["onCheckedChange"],
  children: true,
});

export interface TonalTrailingButtonProps {
  checked: boolean;
  onCheckedChange: (value: boolean) => void;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  enabled?: boolean;
  contentPadding?: ComposePaddingValues;
  interactionSource?: ComposeInteractionSource | null;
  children?: ReactNode;
}
export const TonalTrailingButton = createComposableComponent<TonalTrailingButtonProps>({
  name: "TonalTrailingButton",
  props: ["checked","modifier","enabled","contentPadding","interactionSource"],
  objectProps: ["contentPadding","interactionSource"],
  events: ["onCheckedChange"],
  children: true,
});

export interface TooltipBoxProps {
  positionProvider: ComposePopupPosition;
  tooltip: ReactNode;
  state: ComposeTooltipState;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  onDismissRequest?: (() => void) | null;
  focusable?: boolean;
  enableUserInput?: boolean;
  children?: ReactNode;
}
export const TooltipBox = createComposableComponent<TooltipBoxProps>({
  name: "TooltipBox",
  props: ["positionProvider","state","modifier","focusable","enableUserInput"],
  objectProps: ["positionProvider","state"],
  slots: ["tooltip"],
  events: ["onDismissRequest"],
  children: true,
});

export type TopAppBarProps =
  | {
    title: ReactNode;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    navigationIcon?: ReactNode;
    actions?: ReactNode;
    expandedHeight?: number;
    windowInsets?: ComposeWindowInsets;
    subtitle?: never;
    titleHorizontalAlignment?: never;
    }
  | {
    title: ReactNode;
    subtitle: ReactNode;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    navigationIcon?: ReactNode;
    actions?: ReactNode;
    titleHorizontalAlignment?: ComposeHorizontalAlignment;
    expandedHeight?: number;
    windowInsets?: ComposeWindowInsets;
    }
;
export const TopAppBar = createComposableComponent<TopAppBarProps>({
  name: "TopAppBar",
  props: ["modifier","expandedHeight","windowInsets","titleHorizontalAlignment"],
  objectProps: ["windowInsets"],
  slots: ["title","navigationIcon","actions","subtitle"],
  children: false,
  overloads: [
    { id: "TopAppBar", children: false, parameters: [["title","ReactNode",false,false],["modifier","ComposeModifier",true,false],["navigationIcon","ReactNode",true,false],["actions","ReactNode",true,false],["expandedHeight","number",true,false],["windowInsets","object",true,false]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15] },
    { id: "TopAppBar#1", children: false, parameters: [["title","ReactNode",false,false],["subtitle","ReactNode",false,false],["modifier","ComposeModifier",true,false],["navigationIcon","ReactNode",true,false],["actions","ReactNode",true,false],["titleHorizontalAlignment","string",true,false],["expandedHeight","number",true,false],["windowInsets","object",true,false]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31] },
  ],
});

export interface TopSearchBarProps {
  state: ComposeSearchBarState;
  inputField: ReactNode;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  shape?: ComposeShape;
  tonalElevation?: number;
  shadowElevation?: number;
  windowInsets?: ComposeWindowInsets;
}
export const TopSearchBar = createComposableComponent<TopSearchBarProps>({
  name: "TopSearchBar",
  props: ["state","modifier","shape","tonalElevation","shadowElevation","windowInsets"],
  objectProps: ["state","shape","windowInsets"],
  slots: ["inputField"],
  children: false,
});

export type TrailingButtonProps =
  | {
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    contentPadding?: ComposePaddingValues;
    interactionSource?: ComposeInteractionSource | null;
    children?: ReactNode;
    checked?: never;
    onCheckedChange?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    contentPadding?: ComposePaddingValues;
    interactionSource?: ComposeInteractionSource | null;
    children?: ReactNode;
    onClick?: never;
    }
;
export const TrailingButton = createComposableComponent<TrailingButtonProps>({
  name: "TrailingButton",
  props: ["modifier","enabled","contentPadding","interactionSource","checked"],
  objectProps: ["contentPadding","interactionSource"],
  events: ["onClick","onCheckedChange"],
  children: true,
  overloads: [
    { id: "TrailingButton", children: true, parameters: [["onClick","function",false,false],["modifier","ComposeModifier",true,false],["enabled","boolean",true,false],["contentPadding","object",true,false],["interactionSource","object",true,true]], masks: [0,1,2,3,4,5,6,7] },
    { id: "TrailingButton#1", children: true, parameters: [["checked","boolean",false,false],["onCheckedChange","function",false,false],["modifier","ComposeModifier",true,false],["enabled","boolean",true,false],["contentPadding","object",true,false],["interactionSource","object",true,true]], masks: [0,1,2,3,4,5,6,7] },
  ],
});

export interface TrailingIconProps {
  expanded: boolean;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
}
export const TrailingIcon = createComposableComponent<TrailingIconProps>({
  name: "TrailingIcon",
  props: ["expanded","modifier"],
  children: false,
});

export interface TriStateCheckboxProps {
  state: ComposeToggleableState;
  onClick: (() => void) | null;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  enabled?: boolean;
  interactionSource?: ComposeInteractionSource | null;
}
export const TriStateCheckbox = createComposableComponent<TriStateCheckboxProps>({
  name: "TriStateCheckbox",
  props: ["state","modifier","enabled","interactionSource"],
  objectProps: ["interactionSource"],
  events: ["onClick"],
  children: false,
});

export interface VerticalDividerProps {
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  thickness?: number;
  color?: string;
}
export const VerticalDivider = createComposableComponent<VerticalDividerProps>({
  name: "VerticalDivider",
  props: ["modifier","thickness","color"],
  children: false,
});

export interface VerticalDragHandleProps {
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  interactionSource?: ComposeInteractionSource | null;
}
export const VerticalDragHandle = createComposableComponent<VerticalDragHandleProps>({
  name: "VerticalDragHandle",
  props: ["modifier","interactionSource"],
  objectProps: ["interactionSource"],
  children: false,
});

export type VerticalFloatingToolbarProps =
  | {
    expanded: boolean;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    contentPadding?: ComposePaddingValues;
    shape?: ComposeShape;
    leadingContent?: ReactNode;
    trailingContent?: ReactNode;
    expandedShadowElevation?: number;
    collapsedShadowElevation?: number;
    children?: ReactNode;
    floatingActionButton?: never;
    animationSpec?: never;
    }
  | {
    expanded: boolean;
    floatingActionButton: ReactNode;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    contentPadding?: ComposePaddingValues;
    shape?: ComposeShape;
    animationSpec?: ComposeAnimationSpec;
    expandedShadowElevation?: number;
    collapsedShadowElevation?: number;
    children?: ReactNode;
    leadingContent?: never;
    trailingContent?: never;
    }
;
export const VerticalFloatingToolbar = createComposableComponent<VerticalFloatingToolbarProps>({
  name: "VerticalFloatingToolbar",
  props: ["expanded","modifier","contentPadding","shape","expandedShadowElevation","collapsedShadowElevation","animationSpec"],
  objectProps: ["contentPadding","shape","animationSpec"],
  slots: ["leadingContent","trailingContent","floatingActionButton"],
  children: true,
  overloads: [
    { id: "VerticalFloatingToolbar", children: true, parameters: [["expanded","boolean",false,false],["modifier","ComposeModifier",true,false],["contentPadding","object",true,false],["shape","shape",true,false],["leadingContent","ReactNode",true,true],["trailingContent","ReactNode",true,true],["expandedShadowElevation","number",true,false],["collapsedShadowElevation","number",true,false]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63] },
    { id: "VerticalFloatingToolbar#1", children: true, parameters: [["expanded","boolean",false,false],["floatingActionButton","ReactNode",false,false],["modifier","ComposeModifier",true,false],["contentPadding","object",true,false],["shape","shape",true,false],["animationSpec","object",true,false],["expandedShadowElevation","number",true,false],["collapsedShadowElevation","number",true,false]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31] },
  ],
});

export interface VerticalPagerProps {
  state: ComposePagerState;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  contentPadding?: ComposePaddingValues;
  beyondViewportPageCount?: number;
  pageSpacing?: number;
  horizontalAlignment?: ComposeHorizontalAlignment;
  userScrollEnabled?: boolean;
  reverseLayout?: boolean;
  pageNestedScrollConnection?: ComposeNestedScrollConnection;
  children?: ReactNode;
}
export const VerticalPager = createComposableComponent<VerticalPagerProps>({
  name: "VerticalPager",
  props: ["state","modifier","contentPadding","beyondViewportPageCount","pageSpacing","horizontalAlignment","userScrollEnabled","reverseLayout","pageNestedScrollConnection"],
  objectProps: ["state","contentPadding","pageNestedScrollConnection"],
  children: true,
});

export interface VibrantFloatingActionButtonProps {
  onClick: () => void;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  shape?: ComposeShape;
  containerColor?: string;
  contentColor?: string;
  interactionSource?: ComposeInteractionSource | null;
  children?: ReactNode;
}
export const VibrantFloatingActionButton = createComposableComponent<VibrantFloatingActionButtonProps>({
  name: "VibrantFloatingActionButton",
  props: ["modifier","shape","containerColor","contentColor","interactionSource"],
  objectProps: ["shape","interactionSource"],
  events: ["onClick"],
  children: true,
});

export interface WideNavigationRailProps {
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  shape?: ComposeShape;
  header?: ReactNode;
  windowInsets?: ComposeWindowInsets;
  arrangement?: ComposeVerticalArrangement;
  children?: ReactNode;
}
export const WideNavigationRail = createComposableComponent<WideNavigationRailProps>({
  name: "WideNavigationRail",
  props: ["modifier","shape","windowInsets","arrangement"],
  objectProps: ["shape","windowInsets"],
  slots: ["header"],
  children: true,
});

export interface WideNavigationRailItemProps {
  selected: boolean;
  onClick: () => void;
  icon: ReactNode;
  label: ReactNode;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  enabled?: boolean;
  railExpanded?: boolean;
  interactionSource?: ComposeInteractionSource | null;
}
export const WideNavigationRailItem = createComposableComponent<WideNavigationRailItemProps>({
  name: "WideNavigationRailItem",
  props: ["selected","modifier","enabled","railExpanded","interactionSource"],
  objectProps: ["interactionSource"],
  slots: ["icon","label"],
  events: ["onClick"],
  children: false,
});
