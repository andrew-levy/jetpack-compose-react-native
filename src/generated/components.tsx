// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "./runtime/createComposableComponent";
import type { ColorScheme } from "./factories";
import type { ComposeShape } from "../utils/modifier";
export type ComposeFloatRange = readonly [start: number, endInclusive: number];
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
}
export const AlertDialog = createComposableComponent<AlertDialogProps>({
  name: "AlertDialog",
  props: ["modifier","shape","containerColor","iconContentColor"],
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

export type BottomAppBarProps =
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    containerColor?: string;
    contentColor?: string;
    tonalElevation?: number;
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
    children?: never;
    }
;
export const BottomAppBar = createComposableComponent<BottomAppBarProps>({
  name: "BottomAppBar",
  props: ["modifier","containerColor","contentColor","tonalElevation"],
  slots: ["actions","floatingActionButton"],
  children: true,
  overloads: [
    { id: "BottomAppBar", children: true, parameters: [["modifier","ComposeModifier",true,false],["containerColor","string",true,false],["contentColor","string",true,false],["tonalElevation","number",true,false]], masks: [0,1,2,3,4,5,6,7] },
    { id: "BottomAppBar#1", children: false, parameters: [["actions","ReactNode",false,false],["modifier","ComposeModifier",true,false],["floatingActionButton","ReactNode",true,true],["containerColor","string",true,false],["contentColor","string",true,false],["tonalElevation","number",true,false]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15] },
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

export interface ButtonProps {
  onClick: () => void;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  enabled?: boolean;
  shape?: ComposeShape;
  children?: ReactNode;
}
export const Button = createComposableComponent<ButtonProps>({
  name: "Button",
  props: ["modifier","enabled","shape"],
  objectProps: ["shape"],
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
}
export const CenterAlignedTopAppBar = createComposableComponent<CenterAlignedTopAppBarProps>({
  name: "CenterAlignedTopAppBar",
  props: ["modifier","expandedHeight"],
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

export interface DismissibleDrawerSheetProps {
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  drawerShape?: ComposeShape;
  drawerContainerColor?: string;
  drawerContentColor?: string;
  drawerTonalElevation?: number;
  children?: ReactNode;
}
export const DismissibleDrawerSheet = createComposableComponent<DismissibleDrawerSheetProps>({
  name: "DismissibleDrawerSheet",
  props: ["modifier","drawerShape","drawerContainerColor","drawerContentColor","drawerTonalElevation"],
  objectProps: ["drawerShape"],
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
}
export const DropdownMenuItem = createComposableComponent<DropdownMenuItemProps>({
  name: "DropdownMenuItem",
  props: ["modifier","enabled"],
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
  children?: ReactNode;
}
export const ElevatedButton = createComposableComponent<ElevatedButtonProps>({
  name: "ElevatedButton",
  props: ["modifier","enabled","shape"],
  objectProps: ["shape"],
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
  children?: ReactNode;
}
export const ElevatedToggleButton = createComposableComponent<ElevatedToggleButtonProps>({
  name: "ElevatedToggleButton",
  props: ["checked","modifier","enabled"],
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
  children?: ReactNode;
}
export const FilledTonalButton = createComposableComponent<FilledTonalButtonProps>({
  name: "FilledTonalButton",
  props: ["modifier","enabled","shape"],
  objectProps: ["shape"],
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
  horizontalArrangement?: ComposeHorizontalArrangement;
  expandedHeight?: number;
  children?: ReactNode;
}
export const FlexibleBottomAppBar = createComposableComponent<FlexibleBottomAppBarProps>({
  name: "FlexibleBottomAppBar",
  props: ["modifier","containerColor","contentColor","horizontalArrangement","expandedHeight"],
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
  props: ["expanded","modifier","shape","expandedShadowElevation","collapsedShadowElevation"],
  objectProps: ["shape"],
  slots: ["leadingContent","trailingContent","floatingActionButton"],
  children: true,
  overloads: [
    { id: "HorizontalFloatingToolbar", children: true, parameters: [["expanded","boolean",false,false],["modifier","ComposeModifier",true,false],["shape","shape",true,false],["leadingContent","ReactNode",true,true],["trailingContent","ReactNode",true,true],["expandedShadowElevation","number",true,false],["collapsedShadowElevation","number",true,false]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31] },
    { id: "HorizontalFloatingToolbar#1", children: true, parameters: [["expanded","boolean",false,false],["floatingActionButton","ReactNode",false,false],["modifier","ComposeModifier",true,false],["shape","shape",true,false],["expandedShadowElevation","number",true,false],["collapsedShadowElevation","number",true,false]], masks: [0,1,2,3,4,5,6,7] },
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
}
export const LargeFlexibleTopAppBar = createComposableComponent<LargeFlexibleTopAppBarProps>({
  name: "LargeFlexibleTopAppBar",
  props: ["modifier","titleHorizontalAlignment","collapsedHeight","expandedHeight"],
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
}
export const LargeTopAppBar = createComposableComponent<LargeTopAppBarProps>({
  name: "LargeTopAppBar",
  props: ["modifier","collapsedHeight","expandedHeight"],
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
}
export const MediumFlexibleTopAppBar = createComposableComponent<MediumFlexibleTopAppBarProps>({
  name: "MediumFlexibleTopAppBar",
  props: ["modifier","titleHorizontalAlignment","collapsedHeight","expandedHeight"],
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
}
export const MediumTopAppBar = createComposableComponent<MediumTopAppBarProps>({
  name: "MediumTopAppBar",
  props: ["modifier","collapsedHeight","expandedHeight"],
  slots: ["title","navigationIcon","actions"],
  children: false,
});

export interface ModalBottomSheetProps {
  onDismissRequest: () => void;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  sheetMaxWidth?: number;
  sheetGesturesEnabled?: boolean;
  shape?: ComposeShape;
  containerColor?: string;
  contentColor?: string;
  tonalElevation?: number;
  scrimColor?: string;
  children?: ReactNode;
}
export const ModalBottomSheet = createComposableComponent<ModalBottomSheetProps>({
  name: "ModalBottomSheet",
  props: ["modifier","sheetMaxWidth","sheetGesturesEnabled","shape","containerColor","contentColor","tonalElevation","scrimColor"],
  objectProps: ["shape"],
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
  children?: ReactNode;
}
export const ModalDrawerSheet = createComposableComponent<ModalDrawerSheetProps>({
  name: "ModalDrawerSheet",
  props: ["modifier","drawerShape","drawerContainerColor","drawerContentColor","drawerTonalElevation"],
  objectProps: ["drawerShape"],
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
  arrangement?: ComposeVerticalArrangement;
  children?: ReactNode;
}
export const ModalWideNavigationRail = createComposableComponent<ModalWideNavigationRailProps>({
  name: "ModalWideNavigationRail",
  props: ["modifier","hideOnCollapse","collapsedShape","expandedShape","expandedHeaderTopPadding","arrangement"],
  objectProps: ["collapsedShape","expandedShape"],
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
  children?: ReactNode;
}
export const NavigationBar = createComposableComponent<NavigationBarProps>({
  name: "NavigationBar",
  props: ["modifier","containerColor","contentColor","tonalElevation"],
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
  children?: ReactNode;
}
export const NavigationRail = createComposableComponent<NavigationRailProps>({
  name: "NavigationRail",
  props: ["modifier","containerColor","contentColor"],
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
  children?: ReactNode;
}
export const OutlinedButton = createComposableComponent<OutlinedButtonProps>({
  name: "OutlinedButton",
  props: ["modifier","enabled","shape"],
  objectProps: ["shape"],
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

export interface OutlinedTextFieldProps {
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
}
export const OutlinedTextField = createComposableComponent<OutlinedTextFieldProps>({
  name: "OutlinedTextField",
  props: ["value","modifier","enabled","readOnly"],
  slots: ["label","placeholder","leadingIcon","trailingIcon","prefix"],
  events: ["onValueChange"],
  children: false,
});

export interface OutlinedToggleButtonProps {
  checked: boolean;
  onCheckedChange: (value: boolean) => void;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  enabled?: boolean;
  children?: ReactNode;
}
export const OutlinedToggleButton = createComposableComponent<OutlinedToggleButtonProps>({
  name: "OutlinedToggleButton",
  props: ["checked","modifier","enabled"],
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
  children?: ReactNode;
}
export const PermanentDrawerSheet = createComposableComponent<PermanentDrawerSheetProps>({
  name: "PermanentDrawerSheet",
  props: ["modifier","drawerShape","drawerContainerColor","drawerContentColor","drawerTonalElevation"],
  objectProps: ["drawerShape"],
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
  children?: ReactNode;
}
export const SearchBar = createComposableComponent<SearchBarProps>({
  name: "SearchBar",
  props: ["expanded","modifier","shape","tonalElevation","shadowElevation"],
  objectProps: ["shape"],
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

export interface ShortNavigationBarProps {
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  containerColor?: string;
  contentColor?: string;
  children?: ReactNode;
}
export const ShortNavigationBar = createComposableComponent<ShortNavigationBarProps>({
  name: "ShortNavigationBar",
  props: ["modifier","containerColor","contentColor"],
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
  children?: ReactNode;
}
export const Snackbar = createComposableComponent<SnackbarProps>({
  name: "Snackbar",
  props: ["modifier","actionOnNewLine","shape","containerColor","contentColor","actionContentColor"],
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
}
export const Text = createComposableComponent<TextProps>({
  name: "Text",
  props: ["text","modifier","color","fontSize","fontWeight","letterSpacing","textAlign","lineHeight","overflow"],
  children: false,
});

export interface TextButtonProps {
  onClick: () => void;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  enabled?: boolean;
  shape?: ComposeShape;
  children?: ReactNode;
}
export const TextButton = createComposableComponent<TextButtonProps>({
  name: "TextButton",
  props: ["modifier","enabled","shape"],
  objectProps: ["shape"],
  events: ["onClick"],
  children: true,
});

export interface TextFieldProps {
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
}
export const TextField = createComposableComponent<TextFieldProps>({
  name: "TextField",
  props: ["value","modifier","enabled","readOnly"],
  slots: ["label","placeholder","leadingIcon","trailingIcon","prefix"],
  events: ["onValueChange"],
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
  children?: ReactNode;
}
export const ToggleButton = createComposableComponent<ToggleButtonProps>({
  name: "ToggleButton",
  props: ["checked","modifier","enabled"],
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
  children?: ReactNode;
}
export const TonalToggleButton = createComposableComponent<TonalToggleButtonProps>({
  name: "TonalToggleButton",
  props: ["checked","modifier","enabled"],
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
    }
;
export const TopAppBar = createComposableComponent<TopAppBarProps>({
  name: "TopAppBar",
  props: ["modifier","expandedHeight","titleHorizontalAlignment"],
  slots: ["title","navigationIcon","actions","subtitle"],
  children: false,
  overloads: [
    { id: "TopAppBar", children: false, parameters: [["title","ReactNode",false,false],["modifier","ComposeModifier",true,false],["navigationIcon","ReactNode",true,false],["actions","ReactNode",true,false],["expandedHeight","number",true,false]], masks: [0,1,2,3,4,5,6,7] },
    { id: "TopAppBar#1", children: false, parameters: [["title","ReactNode",false,false],["subtitle","ReactNode",false,false],["modifier","ComposeModifier",true,false],["navigationIcon","ReactNode",true,false],["actions","ReactNode",true,false],["titleHorizontalAlignment","string",true,false],["expandedHeight","number",true,false]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15] },
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
  props: ["expanded","modifier","shape","expandedShadowElevation","collapsedShadowElevation"],
  objectProps: ["shape"],
  slots: ["leadingContent","trailingContent","floatingActionButton"],
  children: true,
  overloads: [
    { id: "VerticalFloatingToolbar", children: true, parameters: [["expanded","boolean",false,false],["modifier","ComposeModifier",true,false],["shape","shape",true,false],["leadingContent","ReactNode",true,true],["trailingContent","ReactNode",true,true],["expandedShadowElevation","number",true,false],["collapsedShadowElevation","number",true,false]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31] },
    { id: "VerticalFloatingToolbar#1", children: true, parameters: [["expanded","boolean",false,false],["floatingActionButton","ReactNode",false,false],["modifier","ComposeModifier",true,false],["shape","shape",true,false],["expandedShadowElevation","number",true,false],["collapsedShadowElevation","number",true,false]], masks: [0,1,2,3,4,5,6,7] },
  ],
});

export interface WideNavigationRailProps {
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  shape?: ComposeShape;
  header?: ReactNode;
  arrangement?: ComposeVerticalArrangement;
  children?: ReactNode;
}
export const WideNavigationRail = createComposableComponent<WideNavigationRailProps>({
  name: "WideNavigationRail",
  props: ["modifier","shape","arrangement"],
  objectProps: ["shape"],
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
