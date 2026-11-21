// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "./runtime/createComposableComponent";
import type { ColorScheme } from "./factories";
import type { ComposeShape, ComposeBrush } from "../utils/modifier";
export type ComposeFloatRange = readonly [start: number, endInclusive: number];
export type ComposePaddingValues = { all?: number; horizontal?: number; vertical?: number; start?: number; top?: number; end?: number; bottom?: number };
export type ComposeWindowInsets = { left?: number; top?: number; right?: number; bottom?: number };
export type ComposeSheetState = { skipPartiallyExpanded?: boolean };
import type { ComposeAlignment, ComposeHorizontalAlignment, ComposeVerticalAlignment, ComposeHorizontalArrangement, ComposeVerticalArrangement, ComposeTextAlign, ComposeTextOverflow, ComposeFontWeight } from "./values";

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
}
export const AssistChip = createComposableComponent<AssistChipProps>({
  name: "AssistChip",
  props: ["modifier","enabled","shape"],
  objectProps: ["shape"],
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

export interface BasicTextProps {
  text: string;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  overflow?: ComposeTextOverflow;
  softWrap?: boolean;
  maxLines?: number;
  minLines?: number;
}
export const BasicText = createComposableComponent<BasicTextProps>({
  name: "BasicText",
  props: ["text","modifier","overflow","softWrap","maxLines","minLines"],
  children: false,
});

export interface BasicTextFieldProps {
  value: string;
  onValueChange: (value: string) => void;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  enabled?: boolean;
  readOnly?: boolean;
  singleLine?: boolean;
  maxLines?: number;
  minLines?: number;
  cursorBrush?: ComposeBrush;
}
export const BasicTextField = createComposableComponent<BasicTextFieldProps>({
  name: "BasicTextField",
  props: ["value","modifier","enabled","readOnly","singleLine","maxLines","minLines","cursorBrush"],
  objectProps: ["cursorBrush"],
  events: ["onValueChange"],
  children: false,
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
  children?: ReactNode;
}
export const Button = createComposableComponent<ButtonProps>({
  name: "Button",
  props: ["modifier","enabled","shape","contentPadding"],
  objectProps: ["shape","contentPadding"],
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
    }
  | {
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    shape?: ComposeShape;
    children?: ReactNode;
    }
;
export const Card = createComposableComponent<CardProps>({
  name: "Card",
  props: ["modifier","shape","enabled"],
  objectProps: ["shape"],
  events: ["onClick"],
  children: true,
  overloads: [
    { id: "Card", children: true, parameters: [["modifier","ComposeModifier",true,false],["shape","shape",true,false]], masks: [0,1] },
    { id: "Card#1", children: true, parameters: [["onClick","function",false,false],["modifier","ComposeModifier",true,false],["enabled","boolean",true,false],["shape","shape",true,false]], masks: [0,1,2,3] },
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
}
export const Checkbox = createComposableComponent<CheckboxProps>({
  name: "Checkbox",
  props: ["checked","modifier","enabled"],
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

export interface DropdownMenuProps {
  expanded: boolean;
  onDismissRequest: () => void;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  shape?: ComposeShape;
  containerColor?: string;
  tonalElevation?: number;
  shadowElevation?: number;
  children?: ReactNode;
}
export const DropdownMenu = createComposableComponent<DropdownMenuProps>({
  name: "DropdownMenu",
  props: ["expanded","modifier","shape","containerColor","tonalElevation","shadowElevation"],
  objectProps: ["shape"],
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
}
export const DropdownMenuItem = createComposableComponent<DropdownMenuItemProps>({
  name: "DropdownMenuItem",
  props: ["modifier","enabled","contentPadding"],
  objectProps: ["contentPadding"],
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
}
export const ElevatedAssistChip = createComposableComponent<ElevatedAssistChipProps>({
  name: "ElevatedAssistChip",
  props: ["modifier","enabled","shape"],
  objectProps: ["shape"],
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
  children?: ReactNode;
}
export const ElevatedButton = createComposableComponent<ElevatedButtonProps>({
  name: "ElevatedButton",
  props: ["modifier","enabled","shape","contentPadding"],
  objectProps: ["shape","contentPadding"],
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
    }
  | {
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    shape?: ComposeShape;
    children?: ReactNode;
    }
;
export const ElevatedCard = createComposableComponent<ElevatedCardProps>({
  name: "ElevatedCard",
  props: ["modifier","shape","enabled"],
  objectProps: ["shape"],
  events: ["onClick"],
  children: true,
  overloads: [
    { id: "ElevatedCard", children: true, parameters: [["modifier","ComposeModifier",true,false],["shape","shape",true,false]], masks: [0,1] },
    { id: "ElevatedCard#1", children: true, parameters: [["onClick","function",false,false],["modifier","ComposeModifier",true,false],["enabled","boolean",true,false],["shape","shape",true,false]], masks: [0,1,2,3] },
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
}
export const ElevatedFilterChip = createComposableComponent<ElevatedFilterChipProps>({
  name: "ElevatedFilterChip",
  props: ["selected","modifier","enabled","shape"],
  objectProps: ["shape"],
  slots: ["label","leadingIcon","trailingIcon"],
  events: ["onClick"],
  children: false,
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
}
export const ElevatedSuggestionChip = createComposableComponent<ElevatedSuggestionChipProps>({
  name: "ElevatedSuggestionChip",
  props: ["modifier","enabled","shape"],
  objectProps: ["shape"],
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
  children?: ReactNode;
}
export const ElevatedToggleButton = createComposableComponent<ElevatedToggleButtonProps>({
  name: "ElevatedToggleButton",
  props: ["checked","modifier","enabled","contentPadding"],
  objectProps: ["contentPadding"],
  events: ["onCheckedChange"],
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
    children?: never;
    }
;
export const ExtendedFloatingActionButton = createComposableComponent<ExtendedFloatingActionButtonProps>({
  name: "ExtendedFloatingActionButton",
  props: ["modifier","shape","containerColor","contentColor","expanded"],
  objectProps: ["shape"],
  slots: ["text","icon"],
  events: ["onClick"],
  children: true,
  overloads: [
    { id: "ExtendedFloatingActionButton", children: true, parameters: [["onClick","function",false,false],["modifier","ComposeModifier",true,false],["shape","shape",true,false],["containerColor","string",true,false],["contentColor","string",true,false]], masks: [0,1,2,3,4,5,6,7] },
    { id: "ExtendedFloatingActionButton#1", children: false, parameters: [["text","ReactNode",false,false],["icon","ReactNode",false,false],["onClick","function",false,false],["modifier","ComposeModifier",true,false],["expanded","boolean",true,false],["shape","shape",true,false],["containerColor","string",true,false],["contentColor","string",true,false]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15] },
  ],
});

export interface FilledIconButtonProps {
  onClick: () => void;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  enabled?: boolean;
  shape?: ComposeShape;
  children?: ReactNode;
}
export const FilledIconButton = createComposableComponent<FilledIconButtonProps>({
  name: "FilledIconButton",
  props: ["modifier","enabled","shape"],
  objectProps: ["shape"],
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
  children?: ReactNode;
}
export const FilledIconToggleButton = createComposableComponent<FilledIconToggleButtonProps>({
  name: "FilledIconToggleButton",
  props: ["checked","modifier","enabled","shape"],
  objectProps: ["shape"],
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
  children?: ReactNode;
}
export const FilledTonalButton = createComposableComponent<FilledTonalButtonProps>({
  name: "FilledTonalButton",
  props: ["modifier","enabled","shape","contentPadding"],
  objectProps: ["shape","contentPadding"],
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
  children?: ReactNode;
}
export const FilledTonalIconButton = createComposableComponent<FilledTonalIconButtonProps>({
  name: "FilledTonalIconButton",
  props: ["modifier","enabled","shape"],
  objectProps: ["shape"],
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
  children?: ReactNode;
}
export const FilledTonalIconToggleButton = createComposableComponent<FilledTonalIconToggleButtonProps>({
  name: "FilledTonalIconToggleButton",
  props: ["checked","modifier","enabled","shape"],
  objectProps: ["shape"],
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
}
export const FilterChip = createComposableComponent<FilterChipProps>({
  name: "FilterChip",
  props: ["selected","modifier","enabled","shape"],
  objectProps: ["shape"],
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
  children?: ReactNode;
}
export const FloatingActionButton = createComposableComponent<FloatingActionButtonProps>({
  name: "FloatingActionButton",
  props: ["modifier","shape","containerColor","contentColor"],
  objectProps: ["shape"],
  events: ["onClick"],
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
    }
  | {
    expanded: boolean;
    floatingActionButton: ReactNode;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    contentPadding?: ComposePaddingValues;
    shape?: ComposeShape;
    expandedShadowElevation?: number;
    collapsedShadowElevation?: number;
    children?: ReactNode;
    leadingContent?: never;
    trailingContent?: never;
    }
;
export const HorizontalFloatingToolbar = createComposableComponent<HorizontalFloatingToolbarProps>({
  name: "HorizontalFloatingToolbar",
  props: ["expanded","modifier","contentPadding","shape","expandedShadowElevation","collapsedShadowElevation"],
  objectProps: ["contentPadding","shape"],
  slots: ["leadingContent","trailingContent","floatingActionButton"],
  children: true,
  overloads: [
    { id: "HorizontalFloatingToolbar", children: true, parameters: [["expanded","boolean",false,false],["modifier","ComposeModifier",true,false],["contentPadding","object",true,false],["shape","shape",true,false],["leadingContent","ReactNode",true,true],["trailingContent","ReactNode",true,true],["expandedShadowElevation","number",true,false],["collapsedShadowElevation","number",true,false]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63] },
    { id: "HorizontalFloatingToolbar#1", children: true, parameters: [["expanded","boolean",false,false],["floatingActionButton","ReactNode",false,false],["modifier","ComposeModifier",true,false],["contentPadding","object",true,false],["shape","shape",true,false],["expandedShadowElevation","number",true,false],["collapsedShadowElevation","number",true,false]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15] },
  ],
});

export interface IconButtonProps {
  onClick: () => void;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  enabled?: boolean;
  shape?: ComposeShape;
  children?: ReactNode;
}
export const IconButton = createComposableComponent<IconButtonProps>({
  name: "IconButton",
  props: ["modifier","enabled","shape"],
  objectProps: ["shape"],
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
  shape?: ComposeShape;
  children?: ReactNode;
}
export const IconToggleButton = createComposableComponent<IconToggleButtonProps>({
  name: "IconToggleButton",
  props: ["checked","modifier","enabled","shape"],
  objectProps: ["shape"],
  events: ["onCheckedChange"],
  children: true,
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
}
export const InputChip = createComposableComponent<InputChipProps>({
  name: "InputChip",
  props: ["selected","modifier","enabled","shape"],
  objectProps: ["shape"],
  slots: ["label","leadingIcon","avatar","trailingIcon"],
  events: ["onClick"],
  children: false,
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
    children?: never;
    }
;
export const LargeExtendedFloatingActionButton = createComposableComponent<LargeExtendedFloatingActionButtonProps>({
  name: "LargeExtendedFloatingActionButton",
  props: ["modifier","shape","containerColor","contentColor","expanded"],
  objectProps: ["shape"],
  slots: ["text","icon"],
  events: ["onClick"],
  children: true,
  overloads: [
    { id: "LargeExtendedFloatingActionButton", children: true, parameters: [["onClick","function",false,false],["modifier","ComposeModifier",true,false],["shape","shape",true,false],["containerColor","string",true,false],["contentColor","string",true,false]], masks: [0,1,2,3,4,5,6,7] },
    { id: "LargeExtendedFloatingActionButton#1", children: false, parameters: [["text","ReactNode",false,false],["icon","ReactNode",false,false],["onClick","function",false,false],["modifier","ComposeModifier",true,false],["expanded","boolean",true,false],["shape","shape",true,false],["containerColor","string",true,false],["contentColor","string",true,false]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15] },
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
  children?: ReactNode;
}
export const LargeFloatingActionButton = createComposableComponent<LargeFloatingActionButtonProps>({
  name: "LargeFloatingActionButton",
  props: ["modifier","shape","containerColor","contentColor"],
  objectProps: ["shape"],
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
}
export const LeadingIconTab = createComposableComponent<LeadingIconTabProps>({
  name: "LeadingIconTab",
  props: ["selected","modifier","enabled","selectedContentColor","unselectedContentColor"],
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
    children?: never;
    }
;
export const MediumExtendedFloatingActionButton = createComposableComponent<MediumExtendedFloatingActionButtonProps>({
  name: "MediumExtendedFloatingActionButton",
  props: ["modifier","shape","containerColor","contentColor","expanded"],
  objectProps: ["shape"],
  slots: ["text","icon"],
  events: ["onClick"],
  children: true,
  overloads: [
    { id: "MediumExtendedFloatingActionButton", children: true, parameters: [["onClick","function",false,false],["modifier","ComposeModifier",true,false],["shape","shape",true,false],["containerColor","string",true,false],["contentColor","string",true,false]], masks: [0,1,2,3,4,5,6,7] },
    { id: "MediumExtendedFloatingActionButton#1", children: false, parameters: [["text","ReactNode",false,false],["icon","ReactNode",false,false],["onClick","function",false,false],["modifier","ComposeModifier",true,false],["expanded","boolean",true,false],["shape","shape",true,false],["containerColor","string",true,false],["contentColor","string",true,false]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15] },
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
  children?: ReactNode;
}
export const MediumFloatingActionButton = createComposableComponent<MediumFloatingActionButtonProps>({
  name: "MediumFloatingActionButton",
  props: ["modifier","shape","containerColor","contentColor"],
  objectProps: ["shape"],
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
}
export const NavigationDrawerItem = createComposableComponent<NavigationDrawerItemProps>({
  name: "NavigationDrawerItem",
  props: ["selected","modifier","shape"],
  objectProps: ["shape"],
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
}
export const NavigationRailItem = createComposableComponent<NavigationRailItemProps>({
  name: "NavigationRailItem",
  props: ["selected","modifier","enabled","alwaysShowLabel"],
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
  children?: ReactNode;
}
export const OutlinedButton = createComposableComponent<OutlinedButtonProps>({
  name: "OutlinedButton",
  props: ["modifier","enabled","shape","contentPadding"],
  objectProps: ["shape","contentPadding"],
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
    }
  | {
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    shape?: ComposeShape;
    children?: ReactNode;
    }
;
export const OutlinedCard = createComposableComponent<OutlinedCardProps>({
  name: "OutlinedCard",
  props: ["modifier","shape","enabled"],
  objectProps: ["shape"],
  events: ["onClick"],
  children: true,
  overloads: [
    { id: "OutlinedCard", children: true, parameters: [["modifier","ComposeModifier",true,false],["shape","shape",true,false]], masks: [0,1] },
    { id: "OutlinedCard#1", children: true, parameters: [["onClick","function",false,false],["modifier","ComposeModifier",true,false],["enabled","boolean",true,false],["shape","shape",true,false]], masks: [0,1,2,3] },
  ],
});

export interface OutlinedIconButtonProps {
  onClick: () => void;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  enabled?: boolean;
  shape?: ComposeShape;
  children?: ReactNode;
}
export const OutlinedIconButton = createComposableComponent<OutlinedIconButtonProps>({
  name: "OutlinedIconButton",
  props: ["modifier","enabled","shape"],
  objectProps: ["shape"],
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
  children?: ReactNode;
}
export const OutlinedIconToggleButton = createComposableComponent<OutlinedIconToggleButtonProps>({
  name: "OutlinedIconToggleButton",
  props: ["checked","modifier","enabled","shape"],
  objectProps: ["shape"],
  events: ["onCheckedChange"],
  children: true,
});

export type OutlinedTextFieldProps =
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
    suffix?: never;
    supportingText?: never;
    isError?: never;
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
    suffix?: never;
    supportingText?: never;
    isError?: never;
    singleLine?: never;
    maxLines?: never;
    shape?: never;
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
    suffix?: never;
    supportingText?: never;
    isError?: never;
    singleLine?: never;
    minLines?: never;
    shape?: never;
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
    suffix?: never;
    supportingText?: never;
    isError?: never;
    maxLines?: never;
    minLines?: never;
    shape?: never;
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
    suffix?: never;
    supportingText?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    shape?: never;
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
    suffix?: never;
    isError?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    shape?: never;
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
    supportingText?: never;
    isError?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    shape?: never;
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
    }
;
export const OutlinedTextField = createComposableComponent<OutlinedTextFieldProps>({
  name: "OutlinedTextField",
  props: ["value","modifier","enabled","readOnly","isError","singleLine","maxLines","minLines","shape"],
  objectProps: ["shape"],
  slots: ["label","placeholder","leadingIcon","trailingIcon","prefix","suffix","supportingText"],
  events: ["onValueChange"],
  children: false,
  overloads: [
    { id: "OutlinedTextField", children: false, parameters: [["value","string",false,false],["onValueChange","function",false,false],["modifier","ComposeModifier",true,false],["enabled","boolean",true,false],["readOnly","boolean",true,false],["label","ReactNode",true,true],["placeholder","ReactNode",true,true],["leadingIcon","ReactNode",true,true],["trailingIcon","ReactNode",true,true],["prefix","ReactNode",true,true],["suffix","ReactNode",true,true],["supportingText","ReactNode",true,true],["isError","boolean",true,false],["singleLine","boolean",true,false],["maxLines","number",true,false],["minLines","number",true,false],["shape","shape",true,false]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,123,124,125,126,127,128,129,130,131,132,133,134,135,136,137,138,139,140,141,142,143,144,145,146,147,148,149,150,151,152,153,154,155,156,157,158,159,160,161,162,163,164,165,166,167,168,169,170,171,172,173,174,175,176,177,178,179,180,181,182,183,184,185,186,187,188,189,190,191,192,193,194,195,196,197,198,199,200,201,202,203,204,205,206,207,208,209,210,211,212,213,214,215,216,217,218,219,220,221,222,223,224,225,226,227,228,229,230,231,232,233,234,235,236,237,238,239,240,241,242,243,244,245,246,247,248,249,250,251,252,253,254,255,256,257,258,259,260,261,262,263,264,265,266,267,268,269,270,271,272,273,274,275,276,277,278,279,280,281,282,283,284,285,286,287,288,289,290,291,292,293,294,295,296,297,298,299,300,301,302,303,304,305,306,307,308,309,310,311,312,313,314,315,316,317,318,319,320,321,322,323,324,325,326,327,328,329,330,331,332,333,334,335,336,337,338,339,340,341,342,343,344,345,346,347,348,349,350,351,352,353,354,355,356,357,358,359,360,361,362,363,364,365,366,367,368,369,370,371,372,373,374,375,376,377,378,379,380,381,382,383,512,513,514,515,516,517,518,519,520,521,522,523,524,525,526,527,528,529,530,531,532,533,534,535,536,537,538,539,540,541,542,543,544,545,546,547,548,549,550,551,552,553,554,555,556,557,558,559,560,561,562,563,564,565,566,567,568,569,570,571,572,573,574,575,576,577,578,579,580,581,582,583,584,585,586,587,588,589,590,591,592,593,594,595,596,597,598,599,600,601,602,603,604,605,606,607,608,609,610,611,612,613,614,615,616,617,618,619,620,621,622,623,624,625,626,627,628,629,630,631,632,633,634,635,636,637,638,639,1024,1025,1026,1027,1028,1029,1030,1031,1032,1033,1034,1035,1036,1037,1038,1039,1040,1041,1042,1043,1044,1045,1046,1047,1048,1049,1050,1051,1052,1053,1054,1055,1056,1057,1058,1059,1060,1061,1062,1063,1064,1065,1066,1067,1068,1069,1070,1071,1072,1073,1074,1075,1076,1077,1078,1079,1080,1081,1082,1083,1084,1085,1086,1087,1088,1089,1090,1091,1092,1093,1094,1095,1096,1097,1098,1099,1100,1101,1102,1103,1104,1105,1106,1107,1108,1109,1110,1111,1112,1113,1114,1115,1116,1117,1118,1119,1120,1121,1122,1123,1124,1125,1126,1127,1128,1129,1130,1131,1132,1133,1134,1135,1136,1137,1138,1139,1140,1141,1142,1143,1144,1145,1146,1147,1148,1149,1150,1151,2048,2049,2050,2051,2052,2053,2054,2055,2056,2057,2058,2059,2060,2061,2062,2063,2064,2065,2066,2067,2068,2069,2070,2071,2072,2073,2074,2075,2076,2077,2078,2079,2080,2081,2082,2083,2084,2085,2086,2087,2088,2089,2090,2091,2092,2093,2094,2095,2096,2097,2098,2099,2100,2101,2102,2103,2104,2105,2106,2107,2108,2109,2110,2111,2112,2113,2114,2115,2116,2117,2118,2119,2120,2121,2122,2123,2124,2125,2126,2127,2128,2129,2130,2131,2132,2133,2134,2135,2136,2137,2138,2139,2140,2141,2142,2143,2144,2145,2146,2147,2148,2149,2150,2151,2152,2153,2154,2155,2156,2157,2158,2159,2160,2161,2162,2163,2164,2165,2166,2167,2168,2169,2170,2171,2172,2173,2174,2175,4096,4097,4098,4099,4100,4101,4102,4103,4104,4105,4106,4107,4108,4109,4110,4111,4112,4113,4114,4115,4116,4117,4118,4119,4120,4121,4122,4123,4124,4125,4126,4127,4128,4129,4130,4131,4132,4133,4134,4135,4136,4137,4138,4139,4140,4141,4142,4143,4144,4145,4146,4147,4148,4149,4150,4151,4152,4153,4154,4155,4156,4157,4158,4159,4160,4161,4162,4163,4164,4165,4166,4167,4168,4169,4170,4171,4172,4173,4174,4175,4176,4177,4178,4179,4180,4181,4182,4183,4184,4185,4186,4187,4188,4189,4190,4191,4192,4193,4194,4195,4196,4197,4198,4199,4200,4201,4202,4203,4204,4205,4206,4207,4208,4209,4210,4211,4212,4213,4214,4215,4216,4217,4218,4219,4220,4221,4222,4223,8192,8193,8194,8195,8196,8197,8198,8199,8200,8201,8202,8203,8204,8205,8206,8207,8208,8209,8210,8211,8212,8213,8214,8215,8216,8217,8218,8219,8220,8221,8222,8223,8224,8225,8226,8227,8228,8229,8230,8231,8232,8233,8234,8235,8236,8237,8238,8239,8240,8241,8242,8243,8244,8245,8246,8247,8248,8249,8250,8251,8252,8253,8254,8255,8256,8257,8258,8259,8260,8261,8262,8263,8264,8265,8266,8267,8268,8269,8270,8271,8272,8273,8274,8275,8276,8277,8278,8279,8280,8281,8282,8283,8284,8285,8286,8287,8288,8289,8290,8291,8292,8293,8294,8295,8296,8297,8298,8299,8300,8301,8302,8303,8304,8305,8306,8307,8308,8309,8310,8311,8312,8313,8314,8315,8316,8317,8318,8319,16383] },
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
  children?: ReactNode;
}
export const OutlinedToggleButton = createComposableComponent<OutlinedToggleButtonProps>({
  name: "OutlinedToggleButton",
  props: ["checked","modifier","enabled","contentPadding"],
  objectProps: ["contentPadding"],
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

export interface PopupProps {
  alignment?: ComposeAlignment;
  onDismissRequest?: (() => void) | null;
  children?: ReactNode;
}
export const Popup = createComposableComponent<PopupProps>({
  name: "Popup",
  props: ["alignment"],
  events: ["onDismissRequest"],
  children: true,
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
}
export const RadioButton = createComposableComponent<RadioButtonProps>({
  name: "RadioButton",
  props: ["selected","modifier","enabled"],
  events: ["onClick"],
  children: false,
});

export interface RangeSliderProps {
  value: ComposeFloatRange;
  onValueChange: (value: ComposeFloatRange) => void;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  enabled?: boolean;
  valueRange?: ComposeFloatRange;
  steps?: number;
  onValueChangeFinished?: (() => void) | null;
}
export const RangeSlider = createComposableComponent<RangeSliderProps>({
  name: "RangeSlider",
  props: ["value","modifier","enabled","valueRange","steps"],
  objectProps: ["value","valueRange"],
  events: ["onValueChange","onValueChangeFinished"],
  children: false,
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

export interface SearchBarProps {
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
}
export const SearchBar = createComposableComponent<SearchBarProps>({
  name: "SearchBar",
  props: ["expanded","modifier","shape","tonalElevation","shadowElevation","windowInsets"],
  objectProps: ["shape","windowInsets"],
  slots: ["inputField"],
  events: ["onExpandedChange"],
  children: true,
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
}
export const ShortNavigationBarItem = createComposableComponent<ShortNavigationBarItemProps>({
  name: "ShortNavigationBarItem",
  props: ["selected","modifier","enabled"],
  slots: ["icon","label"],
  events: ["onClick"],
  children: false,
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
}
export const Slider = createComposableComponent<SliderProps>({
  name: "Slider",
  props: ["value","modifier","enabled","valueRange","steps"],
  objectProps: ["valueRange"],
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
    children?: never;
    }
;
export const SmallExtendedFloatingActionButton = createComposableComponent<SmallExtendedFloatingActionButtonProps>({
  name: "SmallExtendedFloatingActionButton",
  props: ["modifier","shape","containerColor","contentColor","expanded"],
  objectProps: ["shape"],
  slots: ["text","icon"],
  events: ["onClick"],
  children: true,
  overloads: [
    { id: "SmallExtendedFloatingActionButton", children: true, parameters: [["onClick","function",false,false],["modifier","ComposeModifier",true,false],["shape","shape",true,false],["containerColor","string",true,false],["contentColor","string",true,false]], masks: [0,1,2,3,4,5,6,7] },
    { id: "SmallExtendedFloatingActionButton#1", children: false, parameters: [["text","ReactNode",false,false],["icon","ReactNode",false,false],["onClick","function",false,false],["modifier","ComposeModifier",true,false],["expanded","boolean",true,false],["shape","shape",true,false],["containerColor","string",true,false],["contentColor","string",true,false]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15] },
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
  children?: ReactNode;
}
export const SmallFloatingActionButton = createComposableComponent<SmallFloatingActionButtonProps>({
  name: "SmallFloatingActionButton",
  props: ["modifier","shape","containerColor","contentColor"],
  objectProps: ["shape"],
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

export interface SuggestionChipProps {
  onClick: () => void;
  label: ReactNode;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  enabled?: boolean;
  icon?: ReactNode;
  shape?: ComposeShape;
}
export const SuggestionChip = createComposableComponent<SuggestionChipProps>({
  name: "SuggestionChip",
  props: ["modifier","enabled","shape"],
  objectProps: ["shape"],
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
    children?: ReactNode;
    checked?: never;
    onCheckedChange?: never;
    }
;
export const Surface = createComposableComponent<SurfaceProps>({
  name: "Surface",
  props: ["modifier","shape","color","contentColor","tonalElevation","shadowElevation","enabled","checked","selected"],
  objectProps: ["shape"],
  events: ["onClick","onCheckedChange"],
  children: true,
  overloads: [
    { id: "Surface", children: true, parameters: [["modifier","ComposeModifier",true,false],["shape","shape",true,false],["color","string",true,false],["contentColor","string",true,false],["tonalElevation","number",true,false],["shadowElevation","number",true,false]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31] },
    { id: "Surface#1", children: true, parameters: [["onClick","function",false,false],["modifier","ComposeModifier",true,false],["enabled","boolean",true,false],["shape","shape",true,false],["color","string",true,false],["contentColor","string",true,false],["tonalElevation","number",true,false],["shadowElevation","number",true,false]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63] },
    { id: "Surface#2", children: true, parameters: [["checked","boolean",false,false],["onCheckedChange","function",false,false],["modifier","ComposeModifier",true,false],["enabled","boolean",true,false],["shape","shape",true,false],["color","string",true,false],["contentColor","string",true,false],["tonalElevation","number",true,false],["shadowElevation","number",true,false]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63] },
    { id: "Surface#3", children: true, parameters: [["selected","boolean",false,false],["onClick","function",false,false],["modifier","ComposeModifier",true,false],["enabled","boolean",true,false],["shape","shape",true,false],["color","string",true,false],["contentColor","string",true,false],["tonalElevation","number",true,false],["shadowElevation","number",true,false]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63] },
  ],
});

export interface SwitchProps {
  checked: boolean;
  onCheckedChange: ((value: boolean) => void) | null;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  thumbContent?: ReactNode;
  enabled?: boolean;
}
export const Switch = createComposableComponent<SwitchProps>({
  name: "Switch",
  props: ["checked","modifier","enabled"],
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
}
export const Tab = createComposableComponent<TabProps>({
  name: "Tab",
  props: ["selected","modifier","enabled","selectedContentColor","unselectedContentColor"],
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

export interface TextProps {
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
  overflow?: ComposeTextOverflow;
  softWrap?: boolean;
  maxLines?: number;
  minLines?: number;
}
export const Text = createComposableComponent<TextProps>({
  name: "Text",
  props: ["text","modifier","color","fontSize","fontWeight","letterSpacing","textAlign","lineHeight","overflow","softWrap","maxLines","minLines"],
  children: false,
});

export interface TextButtonProps {
  onClick: () => void;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  enabled?: boolean;
  shape?: ComposeShape;
  contentPadding?: ComposePaddingValues;
  children?: ReactNode;
}
export const TextButton = createComposableComponent<TextButtonProps>({
  name: "TextButton",
  props: ["modifier","enabled","shape","contentPadding"],
  objectProps: ["shape","contentPadding"],
  events: ["onClick"],
  children: true,
});

export type TextFieldProps =
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
    suffix?: never;
    supportingText?: never;
    isError?: never;
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
    suffix?: never;
    supportingText?: never;
    isError?: never;
    singleLine?: never;
    maxLines?: never;
    shape?: never;
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
    suffix?: never;
    supportingText?: never;
    isError?: never;
    singleLine?: never;
    minLines?: never;
    shape?: never;
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
    suffix?: never;
    supportingText?: never;
    isError?: never;
    maxLines?: never;
    minLines?: never;
    shape?: never;
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
    suffix?: never;
    supportingText?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    shape?: never;
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
    suffix?: never;
    isError?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    shape?: never;
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
    supportingText?: never;
    isError?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    shape?: never;
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
    }
;
export const TextField = createComposableComponent<TextFieldProps>({
  name: "TextField",
  props: ["value","modifier","enabled","readOnly","isError","singleLine","maxLines","minLines","shape"],
  objectProps: ["shape"],
  slots: ["label","placeholder","leadingIcon","trailingIcon","prefix","suffix","supportingText"],
  events: ["onValueChange"],
  children: false,
  overloads: [
    { id: "TextField", children: false, parameters: [["value","string",false,false],["onValueChange","function",false,false],["modifier","ComposeModifier",true,false],["enabled","boolean",true,false],["readOnly","boolean",true,false],["label","ReactNode",true,true],["placeholder","ReactNode",true,true],["leadingIcon","ReactNode",true,true],["trailingIcon","ReactNode",true,true],["prefix","ReactNode",true,true],["suffix","ReactNode",true,true],["supportingText","ReactNode",true,true],["isError","boolean",true,false],["singleLine","boolean",true,false],["maxLines","number",true,false],["minLines","number",true,false],["shape","shape",true,false]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,123,124,125,126,127,128,129,130,131,132,133,134,135,136,137,138,139,140,141,142,143,144,145,146,147,148,149,150,151,152,153,154,155,156,157,158,159,160,161,162,163,164,165,166,167,168,169,170,171,172,173,174,175,176,177,178,179,180,181,182,183,184,185,186,187,188,189,190,191,192,193,194,195,196,197,198,199,200,201,202,203,204,205,206,207,208,209,210,211,212,213,214,215,216,217,218,219,220,221,222,223,224,225,226,227,228,229,230,231,232,233,234,235,236,237,238,239,240,241,242,243,244,245,246,247,248,249,250,251,252,253,254,255,256,257,258,259,260,261,262,263,264,265,266,267,268,269,270,271,272,273,274,275,276,277,278,279,280,281,282,283,284,285,286,287,288,289,290,291,292,293,294,295,296,297,298,299,300,301,302,303,304,305,306,307,308,309,310,311,312,313,314,315,316,317,318,319,320,321,322,323,324,325,326,327,328,329,330,331,332,333,334,335,336,337,338,339,340,341,342,343,344,345,346,347,348,349,350,351,352,353,354,355,356,357,358,359,360,361,362,363,364,365,366,367,368,369,370,371,372,373,374,375,376,377,378,379,380,381,382,383,512,513,514,515,516,517,518,519,520,521,522,523,524,525,526,527,528,529,530,531,532,533,534,535,536,537,538,539,540,541,542,543,544,545,546,547,548,549,550,551,552,553,554,555,556,557,558,559,560,561,562,563,564,565,566,567,568,569,570,571,572,573,574,575,576,577,578,579,580,581,582,583,584,585,586,587,588,589,590,591,592,593,594,595,596,597,598,599,600,601,602,603,604,605,606,607,608,609,610,611,612,613,614,615,616,617,618,619,620,621,622,623,624,625,626,627,628,629,630,631,632,633,634,635,636,637,638,639,1024,1025,1026,1027,1028,1029,1030,1031,1032,1033,1034,1035,1036,1037,1038,1039,1040,1041,1042,1043,1044,1045,1046,1047,1048,1049,1050,1051,1052,1053,1054,1055,1056,1057,1058,1059,1060,1061,1062,1063,1064,1065,1066,1067,1068,1069,1070,1071,1072,1073,1074,1075,1076,1077,1078,1079,1080,1081,1082,1083,1084,1085,1086,1087,1088,1089,1090,1091,1092,1093,1094,1095,1096,1097,1098,1099,1100,1101,1102,1103,1104,1105,1106,1107,1108,1109,1110,1111,1112,1113,1114,1115,1116,1117,1118,1119,1120,1121,1122,1123,1124,1125,1126,1127,1128,1129,1130,1131,1132,1133,1134,1135,1136,1137,1138,1139,1140,1141,1142,1143,1144,1145,1146,1147,1148,1149,1150,1151,2048,2049,2050,2051,2052,2053,2054,2055,2056,2057,2058,2059,2060,2061,2062,2063,2064,2065,2066,2067,2068,2069,2070,2071,2072,2073,2074,2075,2076,2077,2078,2079,2080,2081,2082,2083,2084,2085,2086,2087,2088,2089,2090,2091,2092,2093,2094,2095,2096,2097,2098,2099,2100,2101,2102,2103,2104,2105,2106,2107,2108,2109,2110,2111,2112,2113,2114,2115,2116,2117,2118,2119,2120,2121,2122,2123,2124,2125,2126,2127,2128,2129,2130,2131,2132,2133,2134,2135,2136,2137,2138,2139,2140,2141,2142,2143,2144,2145,2146,2147,2148,2149,2150,2151,2152,2153,2154,2155,2156,2157,2158,2159,2160,2161,2162,2163,2164,2165,2166,2167,2168,2169,2170,2171,2172,2173,2174,2175,4096,4097,4098,4099,4100,4101,4102,4103,4104,4105,4106,4107,4108,4109,4110,4111,4112,4113,4114,4115,4116,4117,4118,4119,4120,4121,4122,4123,4124,4125,4126,4127,4128,4129,4130,4131,4132,4133,4134,4135,4136,4137,4138,4139,4140,4141,4142,4143,4144,4145,4146,4147,4148,4149,4150,4151,4152,4153,4154,4155,4156,4157,4158,4159,4160,4161,4162,4163,4164,4165,4166,4167,4168,4169,4170,4171,4172,4173,4174,4175,4176,4177,4178,4179,4180,4181,4182,4183,4184,4185,4186,4187,4188,4189,4190,4191,4192,4193,4194,4195,4196,4197,4198,4199,4200,4201,4202,4203,4204,4205,4206,4207,4208,4209,4210,4211,4212,4213,4214,4215,4216,4217,4218,4219,4220,4221,4222,4223,8192,8193,8194,8195,8196,8197,8198,8199,8200,8201,8202,8203,8204,8205,8206,8207,8208,8209,8210,8211,8212,8213,8214,8215,8216,8217,8218,8219,8220,8221,8222,8223,8224,8225,8226,8227,8228,8229,8230,8231,8232,8233,8234,8235,8236,8237,8238,8239,8240,8241,8242,8243,8244,8245,8246,8247,8248,8249,8250,8251,8252,8253,8254,8255,8256,8257,8258,8259,8260,8261,8262,8263,8264,8265,8266,8267,8268,8269,8270,8271,8272,8273,8274,8275,8276,8277,8278,8279,8280,8281,8282,8283,8284,8285,8286,8287,8288,8289,8290,8291,8292,8293,8294,8295,8296,8297,8298,8299,8300,8301,8302,8303,8304,8305,8306,8307,8308,8309,8310,8311,8312,8313,8314,8315,8316,8317,8318,8319,16383] },
  ],
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
  children?: ReactNode;
}
export const ToggleButton = createComposableComponent<ToggleButtonProps>({
  name: "ToggleButton",
  props: ["checked","modifier","enabled","contentPadding"],
  objectProps: ["contentPadding"],
  events: ["onCheckedChange"],
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
  children?: ReactNode;
}
export const TonalToggleButton = createComposableComponent<TonalToggleButtonProps>({
  name: "TonalToggleButton",
  props: ["checked","modifier","enabled","contentPadding"],
  objectProps: ["contentPadding"],
  events: ["onCheckedChange"],
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
}
export const VerticalDragHandle = createComposableComponent<VerticalDragHandleProps>({
  name: "VerticalDragHandle",
  props: ["modifier"],
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
    }
  | {
    expanded: boolean;
    floatingActionButton: ReactNode;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    contentPadding?: ComposePaddingValues;
    shape?: ComposeShape;
    expandedShadowElevation?: number;
    collapsedShadowElevation?: number;
    children?: ReactNode;
    leadingContent?: never;
    trailingContent?: never;
    }
;
export const VerticalFloatingToolbar = createComposableComponent<VerticalFloatingToolbarProps>({
  name: "VerticalFloatingToolbar",
  props: ["expanded","modifier","contentPadding","shape","expandedShadowElevation","collapsedShadowElevation"],
  objectProps: ["contentPadding","shape"],
  slots: ["leadingContent","trailingContent","floatingActionButton"],
  children: true,
  overloads: [
    { id: "VerticalFloatingToolbar", children: true, parameters: [["expanded","boolean",false,false],["modifier","ComposeModifier",true,false],["contentPadding","object",true,false],["shape","shape",true,false],["leadingContent","ReactNode",true,true],["trailingContent","ReactNode",true,true],["expandedShadowElevation","number",true,false],["collapsedShadowElevation","number",true,false]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63] },
    { id: "VerticalFloatingToolbar#1", children: true, parameters: [["expanded","boolean",false,false],["floatingActionButton","ReactNode",false,false],["modifier","ComposeModifier",true,false],["contentPadding","object",true,false],["shape","shape",true,false],["expandedShadowElevation","number",true,false],["collapsedShadowElevation","number",true,false]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15] },
  ],
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
}
export const WideNavigationRailItem = createComposableComponent<WideNavigationRailItemProps>({
  name: "WideNavigationRailItem",
  props: ["selected","modifier","enabled","railExpanded"],
  slots: ["icon","label"],
  events: ["onClick"],
  children: false,
});
