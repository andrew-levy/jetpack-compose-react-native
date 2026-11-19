// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "./runtime/createComposableComponent";
import type { ComposeAlignment, ComposeHorizontalAlignment, ComposeVerticalAlignment, ComposeHorizontalArrangement, ComposeVerticalArrangement, ComposeTextAlign, ComposeTextOverflow, ComposeFontWeight } from "./values";

export interface AlertDialogProps {
  onDismissRequest: () => void;
  confirmButton: ReactNode;
  modifier?: ComposeModifier;
  dismissButton?: ReactNode;
  icon?: ReactNode;
  title?: ReactNode;
  text?: ReactNode;
}
export const AlertDialog = createComposableComponent<AlertDialogProps>({
  name: "AlertDialog",
  props: ["modifier"],
  slots: ["confirmButton","dismissButton","icon","title","text"],
  events: ["onDismissRequest"],
  children: false,
});

export interface AssistChipProps {
  onClick: () => void;
  label: ReactNode;
  modifier?: ComposeModifier;
  enabled?: boolean;
  leadingIcon?: ReactNode;
  trailingIcon?: ReactNode;
}
export const AssistChip = createComposableComponent<AssistChipProps>({
  name: "AssistChip",
  props: ["modifier","enabled"],
  slots: ["label","leadingIcon","trailingIcon"],
  events: ["onClick"],
  children: false,
});

export interface BadgeProps {
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
  modifier?: ComposeModifier;
  children?: ReactNode;
}
export const BadgedBox = createComposableComponent<BadgedBoxProps>({
  name: "BadgedBox",
  props: ["modifier"],
  slots: ["badge"],
  children: true,
});

export interface BoxProps {
  modifier?: ComposeModifier;
  propagateMinConstraints?: boolean;
  contentAlignment?: ComposeAlignment;
  children?: ReactNode;
}
export const Box = createComposableComponent<BoxProps>({
  name: "Box",
  props: ["modifier","propagateMinConstraints","contentAlignment"],
  children: true,
});

export interface ButtonProps {
  onClick: () => void;
  modifier?: ComposeModifier;
  enabled?: boolean;
  children?: ReactNode;
}
export const Button = createComposableComponent<ButtonProps>({
  name: "Button",
  props: ["modifier","enabled"],
  events: ["onClick"],
  children: true,
});

export interface CardProps {
  modifier?: ComposeModifier;
  children?: ReactNode;
}
export const Card = createComposableComponent<CardProps>({
  name: "Card",
  props: ["modifier"],
  children: true,
});

export interface CheckboxProps {
  checked: boolean;
  onCheckedChange: ((value: boolean) => void) | null;
  modifier?: ComposeModifier;
  enabled?: boolean;
}
export const Checkbox = createComposableComponent<CheckboxProps>({
  name: "Checkbox",
  props: ["checked","modifier","enabled"],
  events: ["onCheckedChange"],
  children: false,
});

export interface CircularProgressIndicatorProps {
  modifier?: ComposeModifier;
  color?: string;
  strokeWidth?: number;
  trackColor?: string;
}
export const CircularProgressIndicator = createComposableComponent<CircularProgressIndicatorProps>({
  name: "CircularProgressIndicator",
  props: ["modifier","color","strokeWidth","trackColor"],
  children: false,
});

export interface ColumnProps {
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

export interface DismissibleDrawerSheetProps {
  modifier?: ComposeModifier;
  drawerContainerColor?: string;
  drawerContentColor?: string;
  drawerTonalElevation?: number;
  children?: ReactNode;
}
export const DismissibleDrawerSheet = createComposableComponent<DismissibleDrawerSheetProps>({
  name: "DismissibleDrawerSheet",
  props: ["modifier","drawerContainerColor","drawerContentColor","drawerTonalElevation"],
  children: true,
});

export interface DismissibleNavigationDrawerProps {
  drawerContent: ReactNode;
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

export interface DropdownMenuProps {
  expanded: boolean;
  onDismissRequest: () => void;
  modifier?: ComposeModifier;
  containerColor?: string;
  tonalElevation?: number;
  shadowElevation?: number;
  children?: ReactNode;
}
export const DropdownMenu = createComposableComponent<DropdownMenuProps>({
  name: "DropdownMenu",
  props: ["expanded","modifier","containerColor","tonalElevation","shadowElevation"],
  events: ["onDismissRequest"],
  children: true,
});

export interface DropdownMenuItemProps {
  text: ReactNode;
  onClick: () => void;
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
  modifier?: ComposeModifier;
  enabled?: boolean;
  leadingIcon?: ReactNode;
  trailingIcon?: ReactNode;
}
export const ElevatedAssistChip = createComposableComponent<ElevatedAssistChipProps>({
  name: "ElevatedAssistChip",
  props: ["modifier","enabled"],
  slots: ["label","leadingIcon","trailingIcon"],
  events: ["onClick"],
  children: false,
});

export interface ElevatedButtonProps {
  onClick: () => void;
  modifier?: ComposeModifier;
  enabled?: boolean;
  children?: ReactNode;
}
export const ElevatedButton = createComposableComponent<ElevatedButtonProps>({
  name: "ElevatedButton",
  props: ["modifier","enabled"],
  events: ["onClick"],
  children: true,
});

export interface ElevatedCardProps {
  modifier?: ComposeModifier;
  children?: ReactNode;
}
export const ElevatedCard = createComposableComponent<ElevatedCardProps>({
  name: "ElevatedCard",
  props: ["modifier"],
  children: true,
});

export interface ElevatedFilterChipProps {
  selected: boolean;
  onClick: () => void;
  label: ReactNode;
  modifier?: ComposeModifier;
  enabled?: boolean;
  leadingIcon?: ReactNode;
  trailingIcon?: ReactNode;
}
export const ElevatedFilterChip = createComposableComponent<ElevatedFilterChipProps>({
  name: "ElevatedFilterChip",
  props: ["selected","modifier","enabled"],
  slots: ["label","leadingIcon","trailingIcon"],
  events: ["onClick"],
  children: false,
});

export interface ElevatedSuggestionChipProps {
  onClick: () => void;
  label: ReactNode;
  modifier?: ComposeModifier;
  enabled?: boolean;
  icon?: ReactNode;
}
export const ElevatedSuggestionChip = createComposableComponent<ElevatedSuggestionChipProps>({
  name: "ElevatedSuggestionChip",
  props: ["modifier","enabled"],
  slots: ["label","icon"],
  events: ["onClick"],
  children: false,
});

export interface ExtendedFloatingActionButtonProps {
  onClick: () => void;
  modifier?: ComposeModifier;
  containerColor?: string;
  contentColor?: string;
  children?: ReactNode;
}
export const ExtendedFloatingActionButton = createComposableComponent<ExtendedFloatingActionButtonProps>({
  name: "ExtendedFloatingActionButton",
  props: ["modifier","containerColor","contentColor"],
  events: ["onClick"],
  children: true,
});

export interface FilledIconButtonProps {
  onClick: () => void;
  modifier?: ComposeModifier;
  enabled?: boolean;
  children?: ReactNode;
}
export const FilledIconButton = createComposableComponent<FilledIconButtonProps>({
  name: "FilledIconButton",
  props: ["modifier","enabled"],
  events: ["onClick"],
  children: true,
});

export interface FilledIconToggleButtonProps {
  checked: boolean;
  onCheckedChange: (value: boolean) => void;
  modifier?: ComposeModifier;
  enabled?: boolean;
  children?: ReactNode;
}
export const FilledIconToggleButton = createComposableComponent<FilledIconToggleButtonProps>({
  name: "FilledIconToggleButton",
  props: ["checked","modifier","enabled"],
  events: ["onCheckedChange"],
  children: true,
});

export interface FilledTonalButtonProps {
  onClick: () => void;
  modifier?: ComposeModifier;
  enabled?: boolean;
  children?: ReactNode;
}
export const FilledTonalButton = createComposableComponent<FilledTonalButtonProps>({
  name: "FilledTonalButton",
  props: ["modifier","enabled"],
  events: ["onClick"],
  children: true,
});

export interface FilledTonalIconButtonProps {
  onClick: () => void;
  modifier?: ComposeModifier;
  enabled?: boolean;
  children?: ReactNode;
}
export const FilledTonalIconButton = createComposableComponent<FilledTonalIconButtonProps>({
  name: "FilledTonalIconButton",
  props: ["modifier","enabled"],
  events: ["onClick"],
  children: true,
});

export interface FilledTonalIconToggleButtonProps {
  checked: boolean;
  onCheckedChange: (value: boolean) => void;
  modifier?: ComposeModifier;
  enabled?: boolean;
  children?: ReactNode;
}
export const FilledTonalIconToggleButton = createComposableComponent<FilledTonalIconToggleButtonProps>({
  name: "FilledTonalIconToggleButton",
  props: ["checked","modifier","enabled"],
  events: ["onCheckedChange"],
  children: true,
});

export interface FilterChipProps {
  selected: boolean;
  onClick: () => void;
  label: ReactNode;
  modifier?: ComposeModifier;
  enabled?: boolean;
  leadingIcon?: ReactNode;
  trailingIcon?: ReactNode;
}
export const FilterChip = createComposableComponent<FilterChipProps>({
  name: "FilterChip",
  props: ["selected","modifier","enabled"],
  slots: ["label","leadingIcon","trailingIcon"],
  events: ["onClick"],
  children: false,
});

export interface FloatingActionButtonProps {
  onClick: () => void;
  modifier?: ComposeModifier;
  containerColor?: string;
  contentColor?: string;
  children?: ReactNode;
}
export const FloatingActionButton = createComposableComponent<FloatingActionButtonProps>({
  name: "FloatingActionButton",
  props: ["modifier","containerColor","contentColor"],
  events: ["onClick"],
  children: true,
});

export interface HorizontalDividerProps {
  modifier?: ComposeModifier;
  thickness?: number;
  color?: string;
}
export const HorizontalDivider = createComposableComponent<HorizontalDividerProps>({
  name: "HorizontalDivider",
  props: ["modifier","thickness","color"],
  children: false,
});

export interface IconButtonProps {
  onClick: () => void;
  modifier?: ComposeModifier;
  enabled?: boolean;
  children?: ReactNode;
}
export const IconButton = createComposableComponent<IconButtonProps>({
  name: "IconButton",
  props: ["modifier","enabled"],
  events: ["onClick"],
  children: true,
});

export interface IconToggleButtonProps {
  checked: boolean;
  onCheckedChange: (value: boolean) => void;
  modifier?: ComposeModifier;
  enabled?: boolean;
  children?: ReactNode;
}
export const IconToggleButton = createComposableComponent<IconToggleButtonProps>({
  name: "IconToggleButton",
  props: ["checked","modifier","enabled"],
  events: ["onCheckedChange"],
  children: true,
});

export interface InputChipProps {
  selected: boolean;
  onClick: () => void;
  label: ReactNode;
  modifier?: ComposeModifier;
  enabled?: boolean;
  leadingIcon?: ReactNode;
  avatar?: ReactNode;
  trailingIcon?: ReactNode;
}
export const InputChip = createComposableComponent<InputChipProps>({
  name: "InputChip",
  props: ["selected","modifier","enabled"],
  slots: ["label","leadingIcon","avatar","trailingIcon"],
  events: ["onClick"],
  children: false,
});

export interface LargeFloatingActionButtonProps {
  onClick: () => void;
  modifier?: ComposeModifier;
  containerColor?: string;
  contentColor?: string;
  children?: ReactNode;
}
export const LargeFloatingActionButton = createComposableComponent<LargeFloatingActionButtonProps>({
  name: "LargeFloatingActionButton",
  props: ["modifier","containerColor","contentColor"],
  events: ["onClick"],
  children: true,
});

export interface LeadingIconTabProps {
  selected: boolean;
  onClick: () => void;
  text: ReactNode;
  icon: ReactNode;
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

export interface LinearProgressIndicatorProps {
  modifier?: ComposeModifier;
  color?: string;
  trackColor?: string;
  gapSize?: number;
}
export const LinearProgressIndicator = createComposableComponent<LinearProgressIndicatorProps>({
  name: "LinearProgressIndicator",
  props: ["modifier","color","trackColor","gapSize"],
  children: false,
});

export interface ListItemProps {
  headlineContent: ReactNode;
  modifier?: ComposeModifier;
  overlineContent?: ReactNode;
  supportingContent?: ReactNode;
  leadingContent?: ReactNode;
  trailingContent?: ReactNode;
}
export const ListItem = createComposableComponent<ListItemProps>({
  name: "ListItem",
  props: ["modifier"],
  slots: ["headlineContent","overlineContent","supportingContent","leadingContent","trailingContent"],
  children: false,
});

export interface MaterialThemeProps {
  children?: ReactNode;
}
export const MaterialTheme = createComposableComponent<MaterialThemeProps>({
  name: "MaterialTheme",
  props: [],
  children: true,
});

export interface ModalDrawerSheetProps {
  modifier?: ComposeModifier;
  drawerContainerColor?: string;
  drawerContentColor?: string;
  drawerTonalElevation?: number;
  children?: ReactNode;
}
export const ModalDrawerSheet = createComposableComponent<ModalDrawerSheetProps>({
  name: "ModalDrawerSheet",
  props: ["modifier","drawerContainerColor","drawerContentColor","drawerTonalElevation"],
  children: true,
});

export interface ModalNavigationDrawerProps {
  drawerContent: ReactNode;
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

export interface NavigationBarProps {
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
  modifier?: ComposeModifier;
  icon?: ReactNode;
  badge?: ReactNode;
}
export const NavigationDrawerItem = createComposableComponent<NavigationDrawerItemProps>({
  name: "NavigationDrawerItem",
  props: ["selected","modifier"],
  slots: ["label","icon","badge"],
  events: ["onClick"],
  children: false,
});

export interface NavigationRailProps {
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
  modifier?: ComposeModifier;
  enabled?: boolean;
  children?: ReactNode;
}
export const OutlinedButton = createComposableComponent<OutlinedButtonProps>({
  name: "OutlinedButton",
  props: ["modifier","enabled"],
  events: ["onClick"],
  children: true,
});

export interface OutlinedCardProps {
  modifier?: ComposeModifier;
  children?: ReactNode;
}
export const OutlinedCard = createComposableComponent<OutlinedCardProps>({
  name: "OutlinedCard",
  props: ["modifier"],
  children: true,
});

export interface OutlinedIconButtonProps {
  onClick: () => void;
  modifier?: ComposeModifier;
  enabled?: boolean;
  children?: ReactNode;
}
export const OutlinedIconButton = createComposableComponent<OutlinedIconButtonProps>({
  name: "OutlinedIconButton",
  props: ["modifier","enabled"],
  events: ["onClick"],
  children: true,
});

export interface OutlinedIconToggleButtonProps {
  checked: boolean;
  onCheckedChange: (value: boolean) => void;
  modifier?: ComposeModifier;
  enabled?: boolean;
  children?: ReactNode;
}
export const OutlinedIconToggleButton = createComposableComponent<OutlinedIconToggleButtonProps>({
  name: "OutlinedIconToggleButton",
  props: ["checked","modifier","enabled"],
  events: ["onCheckedChange"],
  children: true,
});

export interface OutlinedTextFieldProps {
  value: string;
  onValueChange: (value: string) => void;
  modifier?: ComposeModifier;
  enabled?: boolean;
  readOnly?: boolean;
  label?: ReactNode;
  placeholder?: ReactNode;
}
export const OutlinedTextField = createComposableComponent<OutlinedTextFieldProps>({
  name: "OutlinedTextField",
  props: ["value","modifier","enabled","readOnly"],
  slots: ["label","placeholder"],
  events: ["onValueChange"],
  children: false,
});

export interface PermanentDrawerSheetProps {
  modifier?: ComposeModifier;
  drawerContainerColor?: string;
  drawerContentColor?: string;
  drawerTonalElevation?: number;
  children?: ReactNode;
}
export const PermanentDrawerSheet = createComposableComponent<PermanentDrawerSheetProps>({
  name: "PermanentDrawerSheet",
  props: ["modifier","drawerContainerColor","drawerContentColor","drawerTonalElevation"],
  children: true,
});

export interface PermanentNavigationDrawerProps {
  drawerContent: ReactNode;
  modifier?: ComposeModifier;
  children?: ReactNode;
}
export const PermanentNavigationDrawer = createComposableComponent<PermanentNavigationDrawerProps>({
  name: "PermanentNavigationDrawer",
  props: ["modifier"],
  slots: ["drawerContent"],
  children: true,
});

export interface RadioButtonProps {
  selected: boolean;
  onClick: (() => void) | null;
  modifier?: ComposeModifier;
  enabled?: boolean;
}
export const RadioButton = createComposableComponent<RadioButtonProps>({
  name: "RadioButton",
  props: ["selected","modifier","enabled"],
  events: ["onClick"],
  children: false,
});

export interface RowProps {
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

export interface SmallFloatingActionButtonProps {
  onClick: () => void;
  modifier?: ComposeModifier;
  containerColor?: string;
  contentColor?: string;
  children?: ReactNode;
}
export const SmallFloatingActionButton = createComposableComponent<SmallFloatingActionButtonProps>({
  name: "SmallFloatingActionButton",
  props: ["modifier","containerColor","contentColor"],
  events: ["onClick"],
  children: true,
});

export interface SnackbarProps {
  modifier?: ComposeModifier;
  action?: ReactNode;
  dismissAction?: ReactNode;
  actionOnNewLine?: boolean;
  containerColor?: string;
  children?: ReactNode;
}
export const Snackbar = createComposableComponent<SnackbarProps>({
  name: "Snackbar",
  props: ["modifier","actionOnNewLine","containerColor"],
  slots: ["action","dismissAction"],
  children: true,
});

export interface SpacerProps {
  modifier: ComposeModifier;
}
export const Spacer = createComposableComponent<SpacerProps>({
  name: "Spacer",
  props: ["modifier"],
  children: false,
});

export interface SuggestionChipProps {
  onClick: () => void;
  label: ReactNode;
  modifier?: ComposeModifier;
  enabled?: boolean;
  icon?: ReactNode;
}
export const SuggestionChip = createComposableComponent<SuggestionChipProps>({
  name: "SuggestionChip",
  props: ["modifier","enabled"],
  slots: ["label","icon"],
  events: ["onClick"],
  children: false,
});

export interface SurfaceProps {
  modifier?: ComposeModifier;
  color?: string;
  contentColor?: string;
  tonalElevation?: number;
  shadowElevation?: number;
  children?: ReactNode;
}
export const Surface = createComposableComponent<SurfaceProps>({
  name: "Surface",
  props: ["modifier","color","contentColor","tonalElevation","shadowElevation"],
  children: true,
});

export interface SwitchProps {
  checked: boolean;
  onCheckedChange: ((value: boolean) => void) | null;
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
  modifier?: ComposeModifier;
  enabled?: boolean;
  text?: ReactNode;
  icon?: ReactNode;
  selectedContentColor?: string;
}
export const Tab = createComposableComponent<TabProps>({
  name: "Tab",
  props: ["selected","modifier","enabled","selectedContentColor"],
  slots: ["text","icon"],
  events: ["onClick"],
  children: false,
});

export interface TabRowProps {
  selectedTabIndex: number;
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
  modifier?: ComposeModifier;
  color?: string;
  fontSize?: number;
  letterSpacing?: number;
  lineHeight?: number;
  fontWeight?: ComposeFontWeight | null;
  textAlign?: ComposeTextAlign | null;
  overflow?: ComposeTextOverflow;
}
export const Text = createComposableComponent<TextProps>({
  name: "Text",
  props: ["text","modifier","color","fontSize","letterSpacing","lineHeight","fontWeight","textAlign","overflow"],
  children: false,
});

export interface TextButtonProps {
  onClick: () => void;
  modifier?: ComposeModifier;
  enabled?: boolean;
  children?: ReactNode;
}
export const TextButton = createComposableComponent<TextButtonProps>({
  name: "TextButton",
  props: ["modifier","enabled"],
  events: ["onClick"],
  children: true,
});

export interface TextFieldProps {
  value: string;
  onValueChange: (value: string) => void;
  modifier?: ComposeModifier;
  enabled?: boolean;
  readOnly?: boolean;
  label?: ReactNode;
  placeholder?: ReactNode;
}
export const TextField = createComposableComponent<TextFieldProps>({
  name: "TextField",
  props: ["value","modifier","enabled","readOnly"],
  slots: ["label","placeholder"],
  events: ["onValueChange"],
  children: false,
});

export interface VerticalDividerProps {
  modifier?: ComposeModifier;
  thickness?: number;
  color?: string;
}
export const VerticalDivider = createComposableComponent<VerticalDividerProps>({
  name: "VerticalDivider",
  props: ["modifier","thickness","color"],
  children: false,
});
