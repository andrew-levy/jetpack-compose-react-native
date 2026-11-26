// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeListItemColorsValue, ComposeListItemElevationValue, ComposeListItemShapesValue } from "../values/records";
import type { ComposePaddingValues } from "../../utils/composeValues";
import type { ComposeInteractionSource } from "../../utils/nativeHandles";
import type { ComposeVerticalAlignment } from "../values/enums";

export type ListItemProps =
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    leadingContent?: ReactNode;
    trailingContent?: ReactNode;
    overlineContent?: ReactNode;
    supportingContent?: ReactNode;
    verticalAlignment?: ComposeVerticalAlignment;
    contentPadding?: ComposePaddingValues;
    children?: ReactNode;
    shapes?: never;
    colors?: never;
    elevation?: never;
    onClick?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    leadingContent?: ReactNode;
    trailingContent?: ReactNode;
    overlineContent?: ReactNode;
    supportingContent?: ReactNode;
    elevation: ComposeListItemElevationValue;
    children?: ReactNode;
    verticalAlignment?: never;
    shapes?: never;
    colors?: never;
    contentPadding?: never;
    onClick?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    colors: ComposeListItemColorsValue;
    elevation?: ComposeListItemElevationValue;
    children?: ReactNode;
    enabled?: never;
    leadingContent?: never;
    trailingContent?: never;
    overlineContent?: never;
    supportingContent?: never;
    verticalAlignment?: never;
    shapes?: never;
    contentPadding?: never;
    onClick?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    shapes: ComposeListItemShapesValue;
    elevation?: ComposeListItemElevationValue;
    children?: ReactNode;
    enabled?: never;
    leadingContent?: never;
    trailingContent?: never;
    overlineContent?: never;
    supportingContent?: never;
    verticalAlignment?: never;
    colors?: never;
    contentPadding?: never;
    onClick?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    shapes: ComposeListItemShapesValue;
    colors: ComposeListItemColorsValue;
    children?: ReactNode;
    enabled?: never;
    leadingContent?: never;
    trailingContent?: never;
    overlineContent?: never;
    supportingContent?: never;
    verticalAlignment?: never;
    elevation?: never;
    contentPadding?: never;
    onClick?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    supportingContent: ReactNode;
    colors: ComposeListItemColorsValue;
    children?: ReactNode;
    enabled?: never;
    leadingContent?: never;
    trailingContent?: never;
    overlineContent?: never;
    verticalAlignment?: never;
    shapes?: never;
    elevation?: never;
    contentPadding?: never;
    onClick?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    supportingContent: ReactNode;
    shapes: ComposeListItemShapesValue;
    children?: ReactNode;
    enabled?: never;
    leadingContent?: never;
    trailingContent?: never;
    overlineContent?: never;
    verticalAlignment?: never;
    colors?: never;
    elevation?: never;
    contentPadding?: never;
    onClick?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    overlineContent: ReactNode;
    supportingContent?: ReactNode;
    colors: ComposeListItemColorsValue;
    children?: ReactNode;
    enabled?: never;
    leadingContent?: never;
    trailingContent?: never;
    verticalAlignment?: never;
    shapes?: never;
    elevation?: never;
    contentPadding?: never;
    onClick?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    overlineContent: ReactNode;
    supportingContent?: ReactNode;
    shapes: ComposeListItemShapesValue;
    children?: ReactNode;
    enabled?: never;
    leadingContent?: never;
    trailingContent?: never;
    verticalAlignment?: never;
    colors?: never;
    elevation?: never;
    contentPadding?: never;
    onClick?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    trailingContent: ReactNode;
    overlineContent?: ReactNode;
    supportingContent?: ReactNode;
    colors: ComposeListItemColorsValue;
    children?: ReactNode;
    enabled?: never;
    leadingContent?: never;
    verticalAlignment?: never;
    shapes?: never;
    elevation?: never;
    contentPadding?: never;
    onClick?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    trailingContent: ReactNode;
    overlineContent?: ReactNode;
    supportingContent?: ReactNode;
    shapes: ComposeListItemShapesValue;
    children?: ReactNode;
    enabled?: never;
    leadingContent?: never;
    verticalAlignment?: never;
    colors?: never;
    elevation?: never;
    contentPadding?: never;
    onClick?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    leadingContent: ReactNode;
    trailingContent?: ReactNode;
    overlineContent?: ReactNode;
    supportingContent?: ReactNode;
    colors: ComposeListItemColorsValue;
    children?: ReactNode;
    enabled?: never;
    verticalAlignment?: never;
    shapes?: never;
    elevation?: never;
    contentPadding?: never;
    onClick?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    leadingContent: ReactNode;
    trailingContent?: ReactNode;
    overlineContent?: ReactNode;
    supportingContent?: ReactNode;
    shapes: ComposeListItemShapesValue;
    children?: ReactNode;
    enabled?: never;
    verticalAlignment?: never;
    colors?: never;
    elevation?: never;
    contentPadding?: never;
    onClick?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    leadingContent: ReactNode;
    trailingContent: ReactNode;
    overlineContent: ReactNode;
    supportingContent: ReactNode;
    verticalAlignment: ComposeVerticalAlignment;
    shapes: ComposeListItemShapesValue;
    colors: ComposeListItemColorsValue;
    elevation: ComposeListItemElevationValue;
    contentPadding: ComposePaddingValues;
    children?: ReactNode;
    enabled?: never;
    onClick?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingContent?: ReactNode;
    trailingContent?: ReactNode;
    overlineContent?: ReactNode;
    supportingContent?: ReactNode;
    colors: ComposeListItemColorsValue;
    children?: ReactNode;
    verticalAlignment?: never;
    shapes?: never;
    elevation?: never;
    contentPadding?: never;
    onClick?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingContent?: ReactNode;
    trailingContent?: ReactNode;
    overlineContent?: ReactNode;
    supportingContent?: ReactNode;
    shapes: ComposeListItemShapesValue;
    children?: ReactNode;
    verticalAlignment?: never;
    colors?: never;
    elevation?: never;
    contentPadding?: never;
    onClick?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    trailingContent: ReactNode;
    overlineContent: ReactNode;
    supportingContent: ReactNode;
    verticalAlignment: ComposeVerticalAlignment;
    shapes: ComposeListItemShapesValue;
    colors: ComposeListItemColorsValue;
    elevation: ComposeListItemElevationValue;
    contentPadding: ComposePaddingValues;
    children?: ReactNode;
    leadingContent?: never;
    onClick?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingContent: ReactNode;
    overlineContent: ReactNode;
    supportingContent: ReactNode;
    verticalAlignment: ComposeVerticalAlignment;
    shapes: ComposeListItemShapesValue;
    colors: ComposeListItemColorsValue;
    elevation: ComposeListItemElevationValue;
    contentPadding: ComposePaddingValues;
    children?: ReactNode;
    trailingContent?: never;
    onClick?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingContent: ReactNode;
    trailingContent: ReactNode;
    supportingContent: ReactNode;
    verticalAlignment: ComposeVerticalAlignment;
    shapes: ComposeListItemShapesValue;
    colors: ComposeListItemColorsValue;
    elevation: ComposeListItemElevationValue;
    contentPadding: ComposePaddingValues;
    children?: ReactNode;
    overlineContent?: never;
    onClick?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingContent: ReactNode;
    trailingContent: ReactNode;
    overlineContent: ReactNode;
    verticalAlignment: ComposeVerticalAlignment;
    shapes: ComposeListItemShapesValue;
    colors: ComposeListItemColorsValue;
    elevation: ComposeListItemElevationValue;
    contentPadding: ComposePaddingValues;
    children?: ReactNode;
    supportingContent?: never;
    onClick?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingContent: ReactNode;
    trailingContent: ReactNode;
    overlineContent: ReactNode;
    supportingContent: ReactNode;
    shapes: ComposeListItemShapesValue;
    colors: ComposeListItemColorsValue;
    elevation: ComposeListItemElevationValue;
    contentPadding: ComposePaddingValues;
    children?: ReactNode;
    verticalAlignment?: never;
    onClick?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingContent: ReactNode;
    trailingContent: ReactNode;
    overlineContent: ReactNode;
    supportingContent: ReactNode;
    verticalAlignment: ComposeVerticalAlignment;
    elevation: ComposeListItemElevationValue;
    contentPadding: ComposePaddingValues;
    children?: ReactNode;
    shapes?: never;
    colors?: never;
    onClick?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingContent: ReactNode;
    trailingContent: ReactNode;
    overlineContent: ReactNode;
    supportingContent: ReactNode;
    verticalAlignment: ComposeVerticalAlignment;
    colors: ComposeListItemColorsValue;
    elevation?: ComposeListItemElevationValue;
    contentPadding: ComposePaddingValues;
    children?: ReactNode;
    shapes?: never;
    onClick?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingContent: ReactNode;
    trailingContent: ReactNode;
    overlineContent: ReactNode;
    supportingContent: ReactNode;
    verticalAlignment: ComposeVerticalAlignment;
    shapes: ComposeListItemShapesValue;
    elevation?: ComposeListItemElevationValue;
    contentPadding: ComposePaddingValues;
    children?: ReactNode;
    colors?: never;
    onClick?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingContent: ReactNode;
    trailingContent: ReactNode;
    overlineContent: ReactNode;
    supportingContent: ReactNode;
    verticalAlignment: ComposeVerticalAlignment;
    shapes: ComposeListItemShapesValue;
    colors: ComposeListItemColorsValue;
    contentPadding: ComposePaddingValues;
    children?: ReactNode;
    elevation?: never;
    onClick?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingContent: ReactNode;
    trailingContent: ReactNode;
    overlineContent: ReactNode;
    supportingContent: ReactNode;
    verticalAlignment: ComposeVerticalAlignment;
    shapes: ComposeListItemShapesValue;
    colors: ComposeListItemColorsValue;
    elevation: ComposeListItemElevationValue;
    contentPadding?: ComposePaddingValues;
    children?: ReactNode;
    onClick?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
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
    leadingContent?: ReactNode;
    trailingContent?: ReactNode;
    overlineContent?: ReactNode;
    supportingContent?: ReactNode;
    verticalAlignment?: ComposeVerticalAlignment;
    onLongClick?: (() => void) | null;
    onLongClickLabel?: string | null;
    contentPadding?: ComposePaddingValues;
    interactionSource?: ComposeInteractionSource | null;
    children?: ReactNode;
    shapes?: never;
    colors?: never;
    elevation?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
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
    leadingContent?: ReactNode;
    trailingContent?: ReactNode;
    overlineContent?: ReactNode;
    supportingContent?: ReactNode;
    elevation: ComposeListItemElevationValue;
    children?: ReactNode;
    verticalAlignment?: never;
    shapes?: never;
    colors?: never;
    contentPadding?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    colors: ComposeListItemColorsValue;
    elevation?: ComposeListItemElevationValue;
    children?: ReactNode;
    enabled?: never;
    leadingContent?: never;
    trailingContent?: never;
    overlineContent?: never;
    supportingContent?: never;
    verticalAlignment?: never;
    shapes?: never;
    contentPadding?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    shapes: ComposeListItemShapesValue;
    elevation?: ComposeListItemElevationValue;
    children?: ReactNode;
    enabled?: never;
    leadingContent?: never;
    trailingContent?: never;
    overlineContent?: never;
    supportingContent?: never;
    verticalAlignment?: never;
    colors?: never;
    contentPadding?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    shapes: ComposeListItemShapesValue;
    colors: ComposeListItemColorsValue;
    children?: ReactNode;
    enabled?: never;
    leadingContent?: never;
    trailingContent?: never;
    overlineContent?: never;
    supportingContent?: never;
    verticalAlignment?: never;
    elevation?: never;
    contentPadding?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    supportingContent: ReactNode;
    colors: ComposeListItemColorsValue;
    children?: ReactNode;
    enabled?: never;
    leadingContent?: never;
    trailingContent?: never;
    overlineContent?: never;
    verticalAlignment?: never;
    shapes?: never;
    elevation?: never;
    contentPadding?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    supportingContent: ReactNode;
    shapes: ComposeListItemShapesValue;
    children?: ReactNode;
    enabled?: never;
    leadingContent?: never;
    trailingContent?: never;
    overlineContent?: never;
    verticalAlignment?: never;
    colors?: never;
    elevation?: never;
    contentPadding?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    overlineContent: ReactNode;
    supportingContent?: ReactNode;
    colors: ComposeListItemColorsValue;
    children?: ReactNode;
    enabled?: never;
    leadingContent?: never;
    trailingContent?: never;
    verticalAlignment?: never;
    shapes?: never;
    elevation?: never;
    contentPadding?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    overlineContent: ReactNode;
    supportingContent?: ReactNode;
    shapes: ComposeListItemShapesValue;
    children?: ReactNode;
    enabled?: never;
    leadingContent?: never;
    trailingContent?: never;
    verticalAlignment?: never;
    colors?: never;
    elevation?: never;
    contentPadding?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    trailingContent: ReactNode;
    overlineContent?: ReactNode;
    supportingContent?: ReactNode;
    colors: ComposeListItemColorsValue;
    children?: ReactNode;
    enabled?: never;
    leadingContent?: never;
    verticalAlignment?: never;
    shapes?: never;
    elevation?: never;
    contentPadding?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    trailingContent: ReactNode;
    overlineContent?: ReactNode;
    supportingContent?: ReactNode;
    shapes: ComposeListItemShapesValue;
    children?: ReactNode;
    enabled?: never;
    leadingContent?: never;
    verticalAlignment?: never;
    colors?: never;
    elevation?: never;
    contentPadding?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    leadingContent: ReactNode;
    trailingContent?: ReactNode;
    overlineContent?: ReactNode;
    supportingContent?: ReactNode;
    colors: ComposeListItemColorsValue;
    children?: ReactNode;
    enabled?: never;
    verticalAlignment?: never;
    shapes?: never;
    elevation?: never;
    contentPadding?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    leadingContent: ReactNode;
    trailingContent?: ReactNode;
    overlineContent?: ReactNode;
    supportingContent?: ReactNode;
    shapes: ComposeListItemShapesValue;
    children?: ReactNode;
    enabled?: never;
    verticalAlignment?: never;
    colors?: never;
    elevation?: never;
    contentPadding?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    leadingContent: ReactNode;
    trailingContent: ReactNode;
    overlineContent: ReactNode;
    supportingContent: ReactNode;
    verticalAlignment: ComposeVerticalAlignment;
    onLongClick: (() => void) | null;
    onLongClickLabel: string | null;
    shapes: ComposeListItemShapesValue;
    colors: ComposeListItemColorsValue;
    elevation: ComposeListItemElevationValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    enabled?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingContent?: ReactNode;
    trailingContent?: ReactNode;
    overlineContent?: ReactNode;
    supportingContent?: ReactNode;
    colors: ComposeListItemColorsValue;
    children?: ReactNode;
    verticalAlignment?: never;
    shapes?: never;
    elevation?: never;
    contentPadding?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingContent?: ReactNode;
    trailingContent?: ReactNode;
    overlineContent?: ReactNode;
    supportingContent?: ReactNode;
    shapes: ComposeListItemShapesValue;
    children?: ReactNode;
    verticalAlignment?: never;
    colors?: never;
    elevation?: never;
    contentPadding?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    trailingContent: ReactNode;
    overlineContent: ReactNode;
    supportingContent: ReactNode;
    verticalAlignment: ComposeVerticalAlignment;
    onLongClick: (() => void) | null;
    onLongClickLabel: string | null;
    shapes: ComposeListItemShapesValue;
    colors: ComposeListItemColorsValue;
    elevation: ComposeListItemElevationValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    leadingContent?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingContent: ReactNode;
    overlineContent: ReactNode;
    supportingContent: ReactNode;
    verticalAlignment: ComposeVerticalAlignment;
    onLongClick: (() => void) | null;
    onLongClickLabel: string | null;
    shapes: ComposeListItemShapesValue;
    colors: ComposeListItemColorsValue;
    elevation: ComposeListItemElevationValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    trailingContent?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingContent: ReactNode;
    trailingContent: ReactNode;
    supportingContent: ReactNode;
    verticalAlignment: ComposeVerticalAlignment;
    onLongClick: (() => void) | null;
    onLongClickLabel: string | null;
    shapes: ComposeListItemShapesValue;
    colors: ComposeListItemColorsValue;
    elevation: ComposeListItemElevationValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    overlineContent?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingContent: ReactNode;
    trailingContent: ReactNode;
    overlineContent: ReactNode;
    verticalAlignment: ComposeVerticalAlignment;
    onLongClick: (() => void) | null;
    onLongClickLabel: string | null;
    shapes: ComposeListItemShapesValue;
    colors: ComposeListItemColorsValue;
    elevation: ComposeListItemElevationValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    supportingContent?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingContent: ReactNode;
    trailingContent: ReactNode;
    overlineContent: ReactNode;
    supportingContent: ReactNode;
    onLongClick: (() => void) | null;
    onLongClickLabel: string | null;
    shapes: ComposeListItemShapesValue;
    colors: ComposeListItemColorsValue;
    elevation: ComposeListItemElevationValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    verticalAlignment?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingContent: ReactNode;
    trailingContent: ReactNode;
    overlineContent: ReactNode;
    supportingContent: ReactNode;
    verticalAlignment: ComposeVerticalAlignment;
    onLongClickLabel: string | null;
    shapes: ComposeListItemShapesValue;
    colors: ComposeListItemColorsValue;
    elevation: ComposeListItemElevationValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    onLongClick?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingContent: ReactNode;
    trailingContent: ReactNode;
    overlineContent: ReactNode;
    supportingContent: ReactNode;
    verticalAlignment: ComposeVerticalAlignment;
    onLongClick: (() => void) | null;
    shapes: ComposeListItemShapesValue;
    colors: ComposeListItemColorsValue;
    elevation: ComposeListItemElevationValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    onLongClickLabel?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingContent: ReactNode;
    trailingContent: ReactNode;
    overlineContent: ReactNode;
    supportingContent: ReactNode;
    verticalAlignment: ComposeVerticalAlignment;
    onLongClick: (() => void) | null;
    onLongClickLabel: string | null;
    elevation: ComposeListItemElevationValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    shapes?: never;
    colors?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingContent: ReactNode;
    trailingContent: ReactNode;
    overlineContent: ReactNode;
    supportingContent: ReactNode;
    verticalAlignment: ComposeVerticalAlignment;
    onLongClick: (() => void) | null;
    onLongClickLabel: string | null;
    colors: ComposeListItemColorsValue;
    elevation?: ComposeListItemElevationValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    shapes?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingContent: ReactNode;
    trailingContent: ReactNode;
    overlineContent: ReactNode;
    supportingContent: ReactNode;
    verticalAlignment: ComposeVerticalAlignment;
    onLongClick: (() => void) | null;
    onLongClickLabel: string | null;
    shapes: ComposeListItemShapesValue;
    elevation?: ComposeListItemElevationValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    colors?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingContent: ReactNode;
    trailingContent: ReactNode;
    overlineContent: ReactNode;
    supportingContent: ReactNode;
    verticalAlignment: ComposeVerticalAlignment;
    onLongClick: (() => void) | null;
    onLongClickLabel: string | null;
    shapes: ComposeListItemShapesValue;
    colors: ComposeListItemColorsValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    elevation?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingContent: ReactNode;
    trailingContent: ReactNode;
    overlineContent: ReactNode;
    supportingContent: ReactNode;
    verticalAlignment: ComposeVerticalAlignment;
    onLongClick: (() => void) | null;
    onLongClickLabel: string | null;
    shapes: ComposeListItemShapesValue;
    colors: ComposeListItemColorsValue;
    elevation: ComposeListItemElevationValue;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    contentPadding?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingContent: ReactNode;
    trailingContent: ReactNode;
    overlineContent: ReactNode;
    supportingContent: ReactNode;
    verticalAlignment: ComposeVerticalAlignment;
    onLongClick: (() => void) | null;
    onLongClickLabel: string | null;
    shapes: ComposeListItemShapesValue;
    colors: ComposeListItemColorsValue;
    elevation: ComposeListItemElevationValue;
    contentPadding: ComposePaddingValues;
    interactionSource?: ComposeInteractionSource | null;
    children?: ReactNode;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    headlineContent: ReactNode;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    overlineContent?: ReactNode;
    supportingContent?: ReactNode;
    leadingContent?: ReactNode;
    trailingContent?: ReactNode;
    colors?: ComposeListItemColorsValue;
    tonalElevation?: number;
    shadowElevation?: number;
    enabled?: never;
    verticalAlignment?: never;
    shapes?: never;
    elevation?: never;
    contentPadding?: never;
    children?: never;
    onClick?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
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
    leadingContent?: ReactNode;
    trailingContent?: ReactNode;
    overlineContent?: ReactNode;
    supportingContent?: ReactNode;
    verticalAlignment?: ComposeVerticalAlignment;
    onLongClick?: (() => void) | null;
    onLongClickLabel?: string | null;
    contentPadding?: ComposePaddingValues;
    interactionSource?: ComposeInteractionSource | null;
    children?: ReactNode;
    shapes?: never;
    colors?: never;
    elevation?: never;
    onClick?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    selected?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    leadingContent?: ReactNode;
    trailingContent?: ReactNode;
    overlineContent?: ReactNode;
    supportingContent?: ReactNode;
    elevation: ComposeListItemElevationValue;
    children?: ReactNode;
    verticalAlignment?: never;
    shapes?: never;
    colors?: never;
    contentPadding?: never;
    onClick?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    selected?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    colors: ComposeListItemColorsValue;
    elevation?: ComposeListItemElevationValue;
    children?: ReactNode;
    enabled?: never;
    leadingContent?: never;
    trailingContent?: never;
    overlineContent?: never;
    supportingContent?: never;
    verticalAlignment?: never;
    shapes?: never;
    contentPadding?: never;
    onClick?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    selected?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    shapes: ComposeListItemShapesValue;
    elevation?: ComposeListItemElevationValue;
    children?: ReactNode;
    enabled?: never;
    leadingContent?: never;
    trailingContent?: never;
    overlineContent?: never;
    supportingContent?: never;
    verticalAlignment?: never;
    colors?: never;
    contentPadding?: never;
    onClick?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    selected?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    shapes: ComposeListItemShapesValue;
    colors: ComposeListItemColorsValue;
    children?: ReactNode;
    enabled?: never;
    leadingContent?: never;
    trailingContent?: never;
    overlineContent?: never;
    supportingContent?: never;
    verticalAlignment?: never;
    elevation?: never;
    contentPadding?: never;
    onClick?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    selected?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    supportingContent: ReactNode;
    colors: ComposeListItemColorsValue;
    children?: ReactNode;
    enabled?: never;
    leadingContent?: never;
    trailingContent?: never;
    overlineContent?: never;
    verticalAlignment?: never;
    shapes?: never;
    elevation?: never;
    contentPadding?: never;
    onClick?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    selected?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    supportingContent: ReactNode;
    shapes: ComposeListItemShapesValue;
    children?: ReactNode;
    enabled?: never;
    leadingContent?: never;
    trailingContent?: never;
    overlineContent?: never;
    verticalAlignment?: never;
    colors?: never;
    elevation?: never;
    contentPadding?: never;
    onClick?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    selected?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    overlineContent: ReactNode;
    supportingContent?: ReactNode;
    colors: ComposeListItemColorsValue;
    children?: ReactNode;
    enabled?: never;
    leadingContent?: never;
    trailingContent?: never;
    verticalAlignment?: never;
    shapes?: never;
    elevation?: never;
    contentPadding?: never;
    onClick?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    selected?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    overlineContent: ReactNode;
    supportingContent?: ReactNode;
    shapes: ComposeListItemShapesValue;
    children?: ReactNode;
    enabled?: never;
    leadingContent?: never;
    trailingContent?: never;
    verticalAlignment?: never;
    colors?: never;
    elevation?: never;
    contentPadding?: never;
    onClick?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    selected?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    trailingContent: ReactNode;
    overlineContent?: ReactNode;
    supportingContent?: ReactNode;
    colors: ComposeListItemColorsValue;
    children?: ReactNode;
    enabled?: never;
    leadingContent?: never;
    verticalAlignment?: never;
    shapes?: never;
    elevation?: never;
    contentPadding?: never;
    onClick?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    selected?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    trailingContent: ReactNode;
    overlineContent?: ReactNode;
    supportingContent?: ReactNode;
    shapes: ComposeListItemShapesValue;
    children?: ReactNode;
    enabled?: never;
    leadingContent?: never;
    verticalAlignment?: never;
    colors?: never;
    elevation?: never;
    contentPadding?: never;
    onClick?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    selected?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    leadingContent: ReactNode;
    trailingContent?: ReactNode;
    overlineContent?: ReactNode;
    supportingContent?: ReactNode;
    colors: ComposeListItemColorsValue;
    children?: ReactNode;
    enabled?: never;
    verticalAlignment?: never;
    shapes?: never;
    elevation?: never;
    contentPadding?: never;
    onClick?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    selected?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    leadingContent: ReactNode;
    trailingContent?: ReactNode;
    overlineContent?: ReactNode;
    supportingContent?: ReactNode;
    shapes: ComposeListItemShapesValue;
    children?: ReactNode;
    enabled?: never;
    verticalAlignment?: never;
    colors?: never;
    elevation?: never;
    contentPadding?: never;
    onClick?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    selected?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    leadingContent: ReactNode;
    trailingContent: ReactNode;
    overlineContent: ReactNode;
    supportingContent: ReactNode;
    verticalAlignment: ComposeVerticalAlignment;
    onLongClick: (() => void) | null;
    onLongClickLabel: string | null;
    shapes: ComposeListItemShapesValue;
    colors: ComposeListItemColorsValue;
    elevation: ComposeListItemElevationValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    enabled?: never;
    onClick?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    selected?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingContent?: ReactNode;
    trailingContent?: ReactNode;
    overlineContent?: ReactNode;
    supportingContent?: ReactNode;
    colors: ComposeListItemColorsValue;
    children?: ReactNode;
    verticalAlignment?: never;
    shapes?: never;
    elevation?: never;
    contentPadding?: never;
    onClick?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    selected?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingContent?: ReactNode;
    trailingContent?: ReactNode;
    overlineContent?: ReactNode;
    supportingContent?: ReactNode;
    shapes: ComposeListItemShapesValue;
    children?: ReactNode;
    verticalAlignment?: never;
    colors?: never;
    elevation?: never;
    contentPadding?: never;
    onClick?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    selected?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    trailingContent: ReactNode;
    overlineContent: ReactNode;
    supportingContent: ReactNode;
    verticalAlignment: ComposeVerticalAlignment;
    onLongClick: (() => void) | null;
    onLongClickLabel: string | null;
    shapes: ComposeListItemShapesValue;
    colors: ComposeListItemColorsValue;
    elevation: ComposeListItemElevationValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    leadingContent?: never;
    onClick?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    selected?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingContent: ReactNode;
    overlineContent: ReactNode;
    supportingContent: ReactNode;
    verticalAlignment: ComposeVerticalAlignment;
    onLongClick: (() => void) | null;
    onLongClickLabel: string | null;
    shapes: ComposeListItemShapesValue;
    colors: ComposeListItemColorsValue;
    elevation: ComposeListItemElevationValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    trailingContent?: never;
    onClick?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    selected?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingContent: ReactNode;
    trailingContent: ReactNode;
    supportingContent: ReactNode;
    verticalAlignment: ComposeVerticalAlignment;
    onLongClick: (() => void) | null;
    onLongClickLabel: string | null;
    shapes: ComposeListItemShapesValue;
    colors: ComposeListItemColorsValue;
    elevation: ComposeListItemElevationValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    overlineContent?: never;
    onClick?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    selected?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingContent: ReactNode;
    trailingContent: ReactNode;
    overlineContent: ReactNode;
    verticalAlignment: ComposeVerticalAlignment;
    onLongClick: (() => void) | null;
    onLongClickLabel: string | null;
    shapes: ComposeListItemShapesValue;
    colors: ComposeListItemColorsValue;
    elevation: ComposeListItemElevationValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    supportingContent?: never;
    onClick?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    selected?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingContent: ReactNode;
    trailingContent: ReactNode;
    overlineContent: ReactNode;
    supportingContent: ReactNode;
    onLongClick: (() => void) | null;
    onLongClickLabel: string | null;
    shapes: ComposeListItemShapesValue;
    colors: ComposeListItemColorsValue;
    elevation: ComposeListItemElevationValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    verticalAlignment?: never;
    onClick?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    selected?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingContent: ReactNode;
    trailingContent: ReactNode;
    overlineContent: ReactNode;
    supportingContent: ReactNode;
    verticalAlignment: ComposeVerticalAlignment;
    onLongClickLabel: string | null;
    shapes: ComposeListItemShapesValue;
    colors: ComposeListItemColorsValue;
    elevation: ComposeListItemElevationValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    onClick?: never;
    onLongClick?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    selected?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingContent: ReactNode;
    trailingContent: ReactNode;
    overlineContent: ReactNode;
    supportingContent: ReactNode;
    verticalAlignment: ComposeVerticalAlignment;
    onLongClick: (() => void) | null;
    shapes: ComposeListItemShapesValue;
    colors: ComposeListItemColorsValue;
    elevation: ComposeListItemElevationValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    onClick?: never;
    onLongClickLabel?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    selected?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingContent: ReactNode;
    trailingContent: ReactNode;
    overlineContent: ReactNode;
    supportingContent: ReactNode;
    verticalAlignment: ComposeVerticalAlignment;
    onLongClick: (() => void) | null;
    onLongClickLabel: string | null;
    elevation: ComposeListItemElevationValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    shapes?: never;
    colors?: never;
    onClick?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    selected?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingContent: ReactNode;
    trailingContent: ReactNode;
    overlineContent: ReactNode;
    supportingContent: ReactNode;
    verticalAlignment: ComposeVerticalAlignment;
    onLongClick: (() => void) | null;
    onLongClickLabel: string | null;
    colors: ComposeListItemColorsValue;
    elevation?: ComposeListItemElevationValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    shapes?: never;
    onClick?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    selected?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingContent: ReactNode;
    trailingContent: ReactNode;
    overlineContent: ReactNode;
    supportingContent: ReactNode;
    verticalAlignment: ComposeVerticalAlignment;
    onLongClick: (() => void) | null;
    onLongClickLabel: string | null;
    shapes: ComposeListItemShapesValue;
    elevation?: ComposeListItemElevationValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    colors?: never;
    onClick?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    selected?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingContent: ReactNode;
    trailingContent: ReactNode;
    overlineContent: ReactNode;
    supportingContent: ReactNode;
    verticalAlignment: ComposeVerticalAlignment;
    onLongClick: (() => void) | null;
    onLongClickLabel: string | null;
    shapes: ComposeListItemShapesValue;
    colors: ComposeListItemColorsValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    elevation?: never;
    onClick?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    selected?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingContent: ReactNode;
    trailingContent: ReactNode;
    overlineContent: ReactNode;
    supportingContent: ReactNode;
    verticalAlignment: ComposeVerticalAlignment;
    onLongClick: (() => void) | null;
    onLongClickLabel: string | null;
    shapes: ComposeListItemShapesValue;
    colors: ComposeListItemColorsValue;
    elevation: ComposeListItemElevationValue;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    contentPadding?: never;
    onClick?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    selected?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingContent: ReactNode;
    trailingContent: ReactNode;
    overlineContent: ReactNode;
    supportingContent: ReactNode;
    verticalAlignment: ComposeVerticalAlignment;
    onLongClick: (() => void) | null;
    onLongClickLabel: string | null;
    shapes: ComposeListItemShapesValue;
    colors: ComposeListItemColorsValue;
    elevation: ComposeListItemElevationValue;
    contentPadding: ComposePaddingValues;
    interactionSource?: ComposeInteractionSource | null;
    children?: ReactNode;
    onClick?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    selected?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    leadingContent?: ReactNode;
    trailingContent?: ReactNode;
    overlineContent?: ReactNode;
    supportingContent?: ReactNode;
    verticalAlignment?: ComposeVerticalAlignment;
    onLongClick?: (() => void) | null;
    onLongClickLabel?: string | null;
    contentPadding?: ComposePaddingValues;
    interactionSource?: ComposeInteractionSource | null;
    children?: ReactNode;
    shapes?: never;
    colors?: never;
    elevation?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    checked?: never;
    onCheckedChange?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    leadingContent?: ReactNode;
    trailingContent?: ReactNode;
    overlineContent?: ReactNode;
    supportingContent?: ReactNode;
    elevation: ComposeListItemElevationValue;
    children?: ReactNode;
    verticalAlignment?: never;
    shapes?: never;
    colors?: never;
    contentPadding?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    checked?: never;
    onCheckedChange?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    colors: ComposeListItemColorsValue;
    elevation?: ComposeListItemElevationValue;
    children?: ReactNode;
    enabled?: never;
    leadingContent?: never;
    trailingContent?: never;
    overlineContent?: never;
    supportingContent?: never;
    verticalAlignment?: never;
    shapes?: never;
    contentPadding?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    checked?: never;
    onCheckedChange?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    shapes: ComposeListItemShapesValue;
    elevation?: ComposeListItemElevationValue;
    children?: ReactNode;
    enabled?: never;
    leadingContent?: never;
    trailingContent?: never;
    overlineContent?: never;
    supportingContent?: never;
    verticalAlignment?: never;
    colors?: never;
    contentPadding?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    checked?: never;
    onCheckedChange?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    shapes: ComposeListItemShapesValue;
    colors: ComposeListItemColorsValue;
    children?: ReactNode;
    enabled?: never;
    leadingContent?: never;
    trailingContent?: never;
    overlineContent?: never;
    supportingContent?: never;
    verticalAlignment?: never;
    elevation?: never;
    contentPadding?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    checked?: never;
    onCheckedChange?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    supportingContent: ReactNode;
    colors: ComposeListItemColorsValue;
    children?: ReactNode;
    enabled?: never;
    leadingContent?: never;
    trailingContent?: never;
    overlineContent?: never;
    verticalAlignment?: never;
    shapes?: never;
    elevation?: never;
    contentPadding?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    checked?: never;
    onCheckedChange?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    supportingContent: ReactNode;
    shapes: ComposeListItemShapesValue;
    children?: ReactNode;
    enabled?: never;
    leadingContent?: never;
    trailingContent?: never;
    overlineContent?: never;
    verticalAlignment?: never;
    colors?: never;
    elevation?: never;
    contentPadding?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    checked?: never;
    onCheckedChange?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    overlineContent: ReactNode;
    supportingContent?: ReactNode;
    colors: ComposeListItemColorsValue;
    children?: ReactNode;
    enabled?: never;
    leadingContent?: never;
    trailingContent?: never;
    verticalAlignment?: never;
    shapes?: never;
    elevation?: never;
    contentPadding?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    checked?: never;
    onCheckedChange?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    overlineContent: ReactNode;
    supportingContent?: ReactNode;
    shapes: ComposeListItemShapesValue;
    children?: ReactNode;
    enabled?: never;
    leadingContent?: never;
    trailingContent?: never;
    verticalAlignment?: never;
    colors?: never;
    elevation?: never;
    contentPadding?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    checked?: never;
    onCheckedChange?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    trailingContent: ReactNode;
    overlineContent?: ReactNode;
    supportingContent?: ReactNode;
    colors: ComposeListItemColorsValue;
    children?: ReactNode;
    enabled?: never;
    leadingContent?: never;
    verticalAlignment?: never;
    shapes?: never;
    elevation?: never;
    contentPadding?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    checked?: never;
    onCheckedChange?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    trailingContent: ReactNode;
    overlineContent?: ReactNode;
    supportingContent?: ReactNode;
    shapes: ComposeListItemShapesValue;
    children?: ReactNode;
    enabled?: never;
    leadingContent?: never;
    verticalAlignment?: never;
    colors?: never;
    elevation?: never;
    contentPadding?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    checked?: never;
    onCheckedChange?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    leadingContent: ReactNode;
    trailingContent?: ReactNode;
    overlineContent?: ReactNode;
    supportingContent?: ReactNode;
    colors: ComposeListItemColorsValue;
    children?: ReactNode;
    enabled?: never;
    verticalAlignment?: never;
    shapes?: never;
    elevation?: never;
    contentPadding?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    checked?: never;
    onCheckedChange?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    leadingContent: ReactNode;
    trailingContent?: ReactNode;
    overlineContent?: ReactNode;
    supportingContent?: ReactNode;
    shapes: ComposeListItemShapesValue;
    children?: ReactNode;
    enabled?: never;
    verticalAlignment?: never;
    colors?: never;
    elevation?: never;
    contentPadding?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    checked?: never;
    onCheckedChange?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    leadingContent: ReactNode;
    trailingContent: ReactNode;
    overlineContent: ReactNode;
    supportingContent: ReactNode;
    verticalAlignment: ComposeVerticalAlignment;
    onLongClick: (() => void) | null;
    onLongClickLabel: string | null;
    shapes: ComposeListItemShapesValue;
    colors: ComposeListItemColorsValue;
    elevation: ComposeListItemElevationValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    enabled?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    checked?: never;
    onCheckedChange?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingContent?: ReactNode;
    trailingContent?: ReactNode;
    overlineContent?: ReactNode;
    supportingContent?: ReactNode;
    colors: ComposeListItemColorsValue;
    children?: ReactNode;
    verticalAlignment?: never;
    shapes?: never;
    elevation?: never;
    contentPadding?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    checked?: never;
    onCheckedChange?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingContent?: ReactNode;
    trailingContent?: ReactNode;
    overlineContent?: ReactNode;
    supportingContent?: ReactNode;
    shapes: ComposeListItemShapesValue;
    children?: ReactNode;
    verticalAlignment?: never;
    colors?: never;
    elevation?: never;
    contentPadding?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    checked?: never;
    onCheckedChange?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    trailingContent: ReactNode;
    overlineContent: ReactNode;
    supportingContent: ReactNode;
    verticalAlignment: ComposeVerticalAlignment;
    onLongClick: (() => void) | null;
    onLongClickLabel: string | null;
    shapes: ComposeListItemShapesValue;
    colors: ComposeListItemColorsValue;
    elevation: ComposeListItemElevationValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    leadingContent?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    checked?: never;
    onCheckedChange?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingContent: ReactNode;
    overlineContent: ReactNode;
    supportingContent: ReactNode;
    verticalAlignment: ComposeVerticalAlignment;
    onLongClick: (() => void) | null;
    onLongClickLabel: string | null;
    shapes: ComposeListItemShapesValue;
    colors: ComposeListItemColorsValue;
    elevation: ComposeListItemElevationValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    trailingContent?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    checked?: never;
    onCheckedChange?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingContent: ReactNode;
    trailingContent: ReactNode;
    supportingContent: ReactNode;
    verticalAlignment: ComposeVerticalAlignment;
    onLongClick: (() => void) | null;
    onLongClickLabel: string | null;
    shapes: ComposeListItemShapesValue;
    colors: ComposeListItemColorsValue;
    elevation: ComposeListItemElevationValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    overlineContent?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    checked?: never;
    onCheckedChange?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingContent: ReactNode;
    trailingContent: ReactNode;
    overlineContent: ReactNode;
    verticalAlignment: ComposeVerticalAlignment;
    onLongClick: (() => void) | null;
    onLongClickLabel: string | null;
    shapes: ComposeListItemShapesValue;
    colors: ComposeListItemColorsValue;
    elevation: ComposeListItemElevationValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    supportingContent?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    checked?: never;
    onCheckedChange?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingContent: ReactNode;
    trailingContent: ReactNode;
    overlineContent: ReactNode;
    supportingContent: ReactNode;
    onLongClick: (() => void) | null;
    onLongClickLabel: string | null;
    shapes: ComposeListItemShapesValue;
    colors: ComposeListItemColorsValue;
    elevation: ComposeListItemElevationValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    verticalAlignment?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    checked?: never;
    onCheckedChange?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingContent: ReactNode;
    trailingContent: ReactNode;
    overlineContent: ReactNode;
    supportingContent: ReactNode;
    verticalAlignment: ComposeVerticalAlignment;
    onLongClickLabel: string | null;
    shapes: ComposeListItemShapesValue;
    colors: ComposeListItemColorsValue;
    elevation: ComposeListItemElevationValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    onLongClick?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    checked?: never;
    onCheckedChange?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingContent: ReactNode;
    trailingContent: ReactNode;
    overlineContent: ReactNode;
    supportingContent: ReactNode;
    verticalAlignment: ComposeVerticalAlignment;
    onLongClick: (() => void) | null;
    shapes: ComposeListItemShapesValue;
    colors: ComposeListItemColorsValue;
    elevation: ComposeListItemElevationValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    onLongClickLabel?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    checked?: never;
    onCheckedChange?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingContent: ReactNode;
    trailingContent: ReactNode;
    overlineContent: ReactNode;
    supportingContent: ReactNode;
    verticalAlignment: ComposeVerticalAlignment;
    onLongClick: (() => void) | null;
    onLongClickLabel: string | null;
    elevation: ComposeListItemElevationValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    shapes?: never;
    colors?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    checked?: never;
    onCheckedChange?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingContent: ReactNode;
    trailingContent: ReactNode;
    overlineContent: ReactNode;
    supportingContent: ReactNode;
    verticalAlignment: ComposeVerticalAlignment;
    onLongClick: (() => void) | null;
    onLongClickLabel: string | null;
    colors: ComposeListItemColorsValue;
    elevation?: ComposeListItemElevationValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    shapes?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    checked?: never;
    onCheckedChange?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingContent: ReactNode;
    trailingContent: ReactNode;
    overlineContent: ReactNode;
    supportingContent: ReactNode;
    verticalAlignment: ComposeVerticalAlignment;
    onLongClick: (() => void) | null;
    onLongClickLabel: string | null;
    shapes: ComposeListItemShapesValue;
    elevation?: ComposeListItemElevationValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    colors?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    checked?: never;
    onCheckedChange?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingContent: ReactNode;
    trailingContent: ReactNode;
    overlineContent: ReactNode;
    supportingContent: ReactNode;
    verticalAlignment: ComposeVerticalAlignment;
    onLongClick: (() => void) | null;
    onLongClickLabel: string | null;
    shapes: ComposeListItemShapesValue;
    colors: ComposeListItemColorsValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    elevation?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    checked?: never;
    onCheckedChange?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingContent: ReactNode;
    trailingContent: ReactNode;
    overlineContent: ReactNode;
    supportingContent: ReactNode;
    verticalAlignment: ComposeVerticalAlignment;
    onLongClick: (() => void) | null;
    onLongClickLabel: string | null;
    shapes: ComposeListItemShapesValue;
    colors: ComposeListItemColorsValue;
    elevation: ComposeListItemElevationValue;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    contentPadding?: never;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    checked?: never;
    onCheckedChange?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingContent: ReactNode;
    trailingContent: ReactNode;
    overlineContent: ReactNode;
    supportingContent: ReactNode;
    verticalAlignment: ComposeVerticalAlignment;
    onLongClick: (() => void) | null;
    onLongClickLabel: string | null;
    shapes: ComposeListItemShapesValue;
    colors: ComposeListItemColorsValue;
    elevation: ComposeListItemElevationValue;
    contentPadding: ComposePaddingValues;
    interactionSource?: ComposeInteractionSource | null;
    children?: ReactNode;
    headlineContent?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    checked?: never;
    onCheckedChange?: never;
    }
;
export const ListItem = createComposableComponent<ListItemProps>({
  name: "ListItem",
  props: ["modifier","enabled","verticalAlignment","shapes","colors","elevation","contentPadding","onLongClickLabel","interactionSource","tonalElevation","shadowElevation","checked","selected"],
  objectProps: ["shapes","colors","elevation","contentPadding","interactionSource"],
  slots: ["leadingContent","trailingContent","overlineContent","supportingContent","headlineContent"],
  events: ["onClick","onLongClick","onCheckedChange"],
  children: true,
  overloads: [
    { id: "ListItem", children: true, parameters: [["modifier","ComposeModifier",true,false],["enabled","boolean",true,false],["leadingContent","ReactNode",true,true],["trailingContent","ReactNode",true,true],["overlineContent","ReactNode",true,true],["supportingContent","ReactNode",true,true],["verticalAlignment","string",true,false],["shapes","object",true,false],["colors","object",true,false],["elevation","object",true,false],["contentPadding","object",true,false]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,128,129,130,131,132,133,134,135,136,137,138,139,140,141,142,143,144,145,146,147,148,149,150,151,152,153,154,155,156,157,158,159,192,256,257,258,259,260,261,262,263,264,265,266,267,268,269,270,271,272,273,274,275,276,277,278,279,280,281,282,283,284,285,286,287,320,384,511,512,513,514,515,516,517,518,519,520,521,522,523,524,525,526,527,528,529,530,531,532,533,534,535,536,537,538,539,540,541,542,543,544,545,546,547,548,549,550,551,552,553,554,555,556,557,558,559,560,561,562,563,564,565,566,567,568,569,570,571,572,573,574,575,639,703,767,831,895,959,991,1007,1015,1019,1021,1022,1023] },
    { id: "ListItem#1", children: true, parameters: [["onClick","function",false,false],["modifier","ComposeModifier",true,false],["enabled","boolean",true,false],["leadingContent","ReactNode",true,true],["trailingContent","ReactNode",true,true],["overlineContent","ReactNode",true,true],["supportingContent","ReactNode",true,true],["verticalAlignment","string",true,false],["onLongClick","function",true,true],["onLongClickLabel","string",true,true],["shapes","object",true,false],["colors","object",true,false],["elevation","object",true,false],["contentPadding","object",true,false],["interactionSource","object",true,true]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,123,124,125,126,127,128,129,130,131,132,133,134,135,136,137,138,139,140,141,142,143,144,145,146,147,148,149,150,151,152,153,154,155,156,157,158,159,160,161,162,163,164,165,166,167,168,169,170,171,172,173,174,175,176,177,178,179,180,181,182,183,184,185,186,187,188,189,190,191,192,193,194,195,196,197,198,199,200,201,202,203,204,205,206,207,208,209,210,211,212,213,214,215,216,217,218,219,220,221,222,223,224,225,226,227,228,229,230,231,232,233,234,235,236,237,238,239,240,241,242,243,244,245,246,247,248,249,250,251,252,253,254,255,256,257,258,259,260,261,262,263,264,265,266,267,268,269,270,271,272,273,274,275,276,277,278,279,280,281,282,283,284,285,286,287,512,513,514,515,516,517,518,519,520,521,522,523,524,525,526,527,528,529,530,531,532,533,534,535,536,537,538,539,540,541,542,543,768,1024,1025,1026,1027,1028,1029,1030,1031,1032,1033,1034,1035,1036,1037,1038,1039,1040,1041,1042,1043,1044,1045,1046,1047,1048,1049,1050,1051,1052,1053,1054,1055,1280,1536,2048,2049,2050,2051,2052,2053,2054,2055,2056,2057,2058,2059,2060,2061,2062,2063,2064,2065,2066,2067,2068,2069,2070,2071,2072,2073,2074,2075,2076,2077,2078,2079,2080,2081,2082,2083,2084,2085,2086,2087,2088,2089,2090,2091,2092,2093,2094,2095,2096,2097,2098,2099,2100,2101,2102,2103,2104,2105,2106,2107,2108,2109,2110,2111,2112,2113,2114,2115,2116,2117,2118,2119,2120,2121,2122,2123,2124,2125,2126,2127,2128,2129,2130,2131,2132,2133,2134,2135,2136,2137,2138,2139,2140,2141,2142,2143,2144,2145,2146,2147,2148,2149,2150,2151,2152,2153,2154,2155,2156,2157,2158,2159,2160,2161,2162,2163,2164,2165,2166,2167,2168,2169,2170,2171,2172,2173,2174,2175,2176,2177,2178,2179,2180,2181,2182,2183,2184,2185,2186,2187,2188,2189,2190,2191,2192,2193,2194,2195,2196,2197,2198,2199,2200,2201,2202,2203,2204,2205,2206,2207,2208,2209,2210,2211,2212,2213,2214,2215,2216,2217,2218,2219,2220,2221,2222,2223,2224,2225,2226,2227,2228,2229,2230,2231,2232,2233,2234,2235,2236,2237,2238,2239,2240,2241,2242,2243,2244,2245,2246,2247,2248,2249,2250,2251,2252,2253,2254,2255,2256,2257,2258,2259,2260,2261,2262,2263,2264,2265,2266,2267,2268,2269,2270,2271,2272,2273,2274,2275,2276,2277,2278,2279,2280,2281,2282,2283,2284,2285,2286,2287,2288,2289,2290,2291,2292,2293,2294,2295,2296,2297,2298,2299,2300,2301,2302,2303,4095,4096,4097,4098,4099,4100,4101,4102,4103,4104,4105,4106,4107,4108,4109,4110,4111,4112,4113,4114,4115,4116,4117,4118,4119,4120,4121,4122,4123,4124,4125,4126,4127,4128,4129,4130,4131,4132,4133,4134,4135,4136,4137,4138,4139,4140,4141,4142,4143,4144,4145,4146,4147,4148,4149,4150,4151,4152,4153,4154,4155,4156,4157,4158,4159,4160,4161,4162,4163,4164,4165,4166,4167,4168,4169,4170,4171,4172,4173,4174,4175,4176,4177,4178,4179,4180,4181,4182,4183,4184,4185,4186,4187,4188,4189,4190,4191,4192,4193,4194,4195,4196,4197,4198,4199,4200,4201,4202,4203,4204,4205,4206,4207,4208,4209,4210,4211,4212,4213,4214,4215,4216,4217,4218,4219,4220,4221,4222,4223,4224,4225,4226,4227,4228,4229,4230,4231,4232,4233,4234,4235,4236,4237,4238,4239,4240,4241,4242,4243,4244,4245,4246,4247,4248,4249,4250,4251,4252,4253,4254,4255,4256,4257,4258,4259,4260,4261,4262,4263,4264,4265,4266,4267,4268,4269,4270,4271,4272,4273,4274,4275,4276,4277,4278,4279,4280,4281,4282,4283,4284,4285,4286,4287,4288,4289,4290,4291,4292,4293,4294,4295,4296,4297,4298,4299,4300,4301,4302,4303,4304,4305,4306,4307,4308,4309,4310,4311,4312,4313,4314,4315,4316,4317,4318,4319,4320,4321,4322,4323,4324,4325,4326,4327,4328,4329,4330,4331,4332,4333,4334,4335,4336,4337,4338,4339,4340,4341,4342,4343,4344,4345,4346,4347,4348,4349,4350,4351,6143,6144,6145,6146,6147,6148,6149,6150,6151,6152,6153,6154,6155,6156,6157,6158,6159,6160,6161,6162,6163,6164,6165,6166,6167,6168,6169,6170,6171,6172,6173,6174,6175,6176,6177,6178,6179,6180,6181,6182,6183,6184,6185,6186,6187,6188,6189,6190,6191,6192,6193,6194,6195,6196,6197,6198,6199,6200,6201,6202,6203,6204,6205,6206,6207,6208,6209,6210,6211,6212,6213,6214,6215,6216,6217,6218,6219,6220,6221,6222,6223,6224,6225,6226,6227,6228,6229,6230,6231,6232,6233,6234,6235,6236,6237,6238,6239,6240,6241,6242,6243,6244,6245,6246,6247,6248,6249,6250,6251,6252,6253,6254,6255,6256,6257,6258,6259,6260,6261,6262,6263,6264,6265,6266,6267,6268,6269,6270,6271,6272,6273,6274,6275,6276,6277,6278,6279,6280,6281,6282,6283,6284,6285,6286,6287,6288,6289,6290,6291,6292,6293,6294,6295,6296,6297,6298,6299,6300,6301,6302,6303,6304,6305,6306,6307,6308,6309,6310,6311,6312,6313,6314,6315,6316,6317,6318,6319,6320,6321,6322,6323,6324,6325,6326,6327,6328,6329,6330,6331,6332,6333,6334,6335,6336,6337,6338,6339,6340,6341,6342,6343,6344,6345,6346,6347,6348,6349,6350,6351,6352,6353,6354,6355,6356,6357,6358,6359,6360,6361,6362,6363,6364,6365,6366,6367,6368,6369,6370,6371,6372,6373,6374,6375,6376,6377,6378,6379,6380,6381,6382,6383,6384,6385,6386,6387,6388,6389,6390,6391,6392,6393,6394,6395,6396,6397,6398,6399,6655,6911,7167,7423,7679,7935,8063,8127,8159,8175,8183,8187,8189,8190,8191] },
    { id: "ListItem#2", children: false, parameters: [["headlineContent","ReactNode",false,false],["modifier","ComposeModifier",true,false],["overlineContent","ReactNode",true,true],["supportingContent","ReactNode",true,true],["leadingContent","ReactNode",true,true],["trailingContent","ReactNode",true,true],["colors","object",true,false],["tonalElevation","number",true,false],["shadowElevation","number",true,false]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,123,124,125,126,127] },
    { id: "ListItem#3", children: true, parameters: [["checked","boolean",false,false],["onCheckedChange","function",false,false],["modifier","ComposeModifier",true,false],["enabled","boolean",true,false],["leadingContent","ReactNode",true,true],["trailingContent","ReactNode",true,true],["overlineContent","ReactNode",true,true],["supportingContent","ReactNode",true,true],["verticalAlignment","string",true,false],["onLongClick","function",true,true],["onLongClickLabel","string",true,true],["shapes","object",true,false],["colors","object",true,false],["elevation","object",true,false],["contentPadding","object",true,false],["interactionSource","object",true,true]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,123,124,125,126,127,128,129,130,131,132,133,134,135,136,137,138,139,140,141,142,143,144,145,146,147,148,149,150,151,152,153,154,155,156,157,158,159,160,161,162,163,164,165,166,167,168,169,170,171,172,173,174,175,176,177,178,179,180,181,182,183,184,185,186,187,188,189,190,191,192,193,194,195,196,197,198,199,200,201,202,203,204,205,206,207,208,209,210,211,212,213,214,215,216,217,218,219,220,221,222,223,224,225,226,227,228,229,230,231,232,233,234,235,236,237,238,239,240,241,242,243,244,245,246,247,248,249,250,251,252,253,254,255,256,257,258,259,260,261,262,263,264,265,266,267,268,269,270,271,272,273,274,275,276,277,278,279,280,281,282,283,284,285,286,287,512,513,514,515,516,517,518,519,520,521,522,523,524,525,526,527,528,529,530,531,532,533,534,535,536,537,538,539,540,541,542,543,768,1024,1025,1026,1027,1028,1029,1030,1031,1032,1033,1034,1035,1036,1037,1038,1039,1040,1041,1042,1043,1044,1045,1046,1047,1048,1049,1050,1051,1052,1053,1054,1055,1280,1536,2048,2049,2050,2051,2052,2053,2054,2055,2056,2057,2058,2059,2060,2061,2062,2063,2064,2065,2066,2067,2068,2069,2070,2071,2072,2073,2074,2075,2076,2077,2078,2079,2080,2081,2082,2083,2084,2085,2086,2087,2088,2089,2090,2091,2092,2093,2094,2095,2096,2097,2098,2099,2100,2101,2102,2103,2104,2105,2106,2107,2108,2109,2110,2111,2112,2113,2114,2115,2116,2117,2118,2119,2120,2121,2122,2123,2124,2125,2126,2127,2128,2129,2130,2131,2132,2133,2134,2135,2136,2137,2138,2139,2140,2141,2142,2143,2144,2145,2146,2147,2148,2149,2150,2151,2152,2153,2154,2155,2156,2157,2158,2159,2160,2161,2162,2163,2164,2165,2166,2167,2168,2169,2170,2171,2172,2173,2174,2175,2176,2177,2178,2179,2180,2181,2182,2183,2184,2185,2186,2187,2188,2189,2190,2191,2192,2193,2194,2195,2196,2197,2198,2199,2200,2201,2202,2203,2204,2205,2206,2207,2208,2209,2210,2211,2212,2213,2214,2215,2216,2217,2218,2219,2220,2221,2222,2223,2224,2225,2226,2227,2228,2229,2230,2231,2232,2233,2234,2235,2236,2237,2238,2239,2240,2241,2242,2243,2244,2245,2246,2247,2248,2249,2250,2251,2252,2253,2254,2255,2256,2257,2258,2259,2260,2261,2262,2263,2264,2265,2266,2267,2268,2269,2270,2271,2272,2273,2274,2275,2276,2277,2278,2279,2280,2281,2282,2283,2284,2285,2286,2287,2288,2289,2290,2291,2292,2293,2294,2295,2296,2297,2298,2299,2300,2301,2302,2303,4095,4096,4097,4098,4099,4100,4101,4102,4103,4104,4105,4106,4107,4108,4109,4110,4111,4112,4113,4114,4115,4116,4117,4118,4119,4120,4121,4122,4123,4124,4125,4126,4127,4128,4129,4130,4131,4132,4133,4134,4135,4136,4137,4138,4139,4140,4141,4142,4143,4144,4145,4146,4147,4148,4149,4150,4151,4152,4153,4154,4155,4156,4157,4158,4159,4160,4161,4162,4163,4164,4165,4166,4167,4168,4169,4170,4171,4172,4173,4174,4175,4176,4177,4178,4179,4180,4181,4182,4183,4184,4185,4186,4187,4188,4189,4190,4191,4192,4193,4194,4195,4196,4197,4198,4199,4200,4201,4202,4203,4204,4205,4206,4207,4208,4209,4210,4211,4212,4213,4214,4215,4216,4217,4218,4219,4220,4221,4222,4223,4224,4225,4226,4227,4228,4229,4230,4231,4232,4233,4234,4235,4236,4237,4238,4239,4240,4241,4242,4243,4244,4245,4246,4247,4248,4249,4250,4251,4252,4253,4254,4255,4256,4257,4258,4259,4260,4261,4262,4263,4264,4265,4266,4267,4268,4269,4270,4271,4272,4273,4274,4275,4276,4277,4278,4279,4280,4281,4282,4283,4284,4285,4286,4287,4288,4289,4290,4291,4292,4293,4294,4295,4296,4297,4298,4299,4300,4301,4302,4303,4304,4305,4306,4307,4308,4309,4310,4311,4312,4313,4314,4315,4316,4317,4318,4319,4320,4321,4322,4323,4324,4325,4326,4327,4328,4329,4330,4331,4332,4333,4334,4335,4336,4337,4338,4339,4340,4341,4342,4343,4344,4345,4346,4347,4348,4349,4350,4351,6143,6144,6145,6146,6147,6148,6149,6150,6151,6152,6153,6154,6155,6156,6157,6158,6159,6160,6161,6162,6163,6164,6165,6166,6167,6168,6169,6170,6171,6172,6173,6174,6175,6176,6177,6178,6179,6180,6181,6182,6183,6184,6185,6186,6187,6188,6189,6190,6191,6192,6193,6194,6195,6196,6197,6198,6199,6200,6201,6202,6203,6204,6205,6206,6207,6208,6209,6210,6211,6212,6213,6214,6215,6216,6217,6218,6219,6220,6221,6222,6223,6224,6225,6226,6227,6228,6229,6230,6231,6232,6233,6234,6235,6236,6237,6238,6239,6240,6241,6242,6243,6244,6245,6246,6247,6248,6249,6250,6251,6252,6253,6254,6255,6256,6257,6258,6259,6260,6261,6262,6263,6264,6265,6266,6267,6268,6269,6270,6271,6272,6273,6274,6275,6276,6277,6278,6279,6280,6281,6282,6283,6284,6285,6286,6287,6288,6289,6290,6291,6292,6293,6294,6295,6296,6297,6298,6299,6300,6301,6302,6303,6304,6305,6306,6307,6308,6309,6310,6311,6312,6313,6314,6315,6316,6317,6318,6319,6320,6321,6322,6323,6324,6325,6326,6327,6328,6329,6330,6331,6332,6333,6334,6335,6336,6337,6338,6339,6340,6341,6342,6343,6344,6345,6346,6347,6348,6349,6350,6351,6352,6353,6354,6355,6356,6357,6358,6359,6360,6361,6362,6363,6364,6365,6366,6367,6368,6369,6370,6371,6372,6373,6374,6375,6376,6377,6378,6379,6380,6381,6382,6383,6384,6385,6386,6387,6388,6389,6390,6391,6392,6393,6394,6395,6396,6397,6398,6399,6655,6911,7167,7423,7679,7935,8063,8127,8159,8175,8183,8187,8189,8190,8191] },
    { id: "ListItem#4", children: true, parameters: [["selected","boolean",false,false],["onClick","function",false,false],["modifier","ComposeModifier",true,false],["enabled","boolean",true,false],["leadingContent","ReactNode",true,true],["trailingContent","ReactNode",true,true],["overlineContent","ReactNode",true,true],["supportingContent","ReactNode",true,true],["verticalAlignment","string",true,false],["onLongClick","function",true,true],["onLongClickLabel","string",true,true],["shapes","object",true,false],["colors","object",true,false],["elevation","object",true,false],["contentPadding","object",true,false],["interactionSource","object",true,true]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,123,124,125,126,127,128,129,130,131,132,133,134,135,136,137,138,139,140,141,142,143,144,145,146,147,148,149,150,151,152,153,154,155,156,157,158,159,160,161,162,163,164,165,166,167,168,169,170,171,172,173,174,175,176,177,178,179,180,181,182,183,184,185,186,187,188,189,190,191,192,193,194,195,196,197,198,199,200,201,202,203,204,205,206,207,208,209,210,211,212,213,214,215,216,217,218,219,220,221,222,223,224,225,226,227,228,229,230,231,232,233,234,235,236,237,238,239,240,241,242,243,244,245,246,247,248,249,250,251,252,253,254,255,256,257,258,259,260,261,262,263,264,265,266,267,268,269,270,271,272,273,274,275,276,277,278,279,280,281,282,283,284,285,286,287,512,513,514,515,516,517,518,519,520,521,522,523,524,525,526,527,528,529,530,531,532,533,534,535,536,537,538,539,540,541,542,543,768,1024,1025,1026,1027,1028,1029,1030,1031,1032,1033,1034,1035,1036,1037,1038,1039,1040,1041,1042,1043,1044,1045,1046,1047,1048,1049,1050,1051,1052,1053,1054,1055,1280,1536,2048,2049,2050,2051,2052,2053,2054,2055,2056,2057,2058,2059,2060,2061,2062,2063,2064,2065,2066,2067,2068,2069,2070,2071,2072,2073,2074,2075,2076,2077,2078,2079,2080,2081,2082,2083,2084,2085,2086,2087,2088,2089,2090,2091,2092,2093,2094,2095,2096,2097,2098,2099,2100,2101,2102,2103,2104,2105,2106,2107,2108,2109,2110,2111,2112,2113,2114,2115,2116,2117,2118,2119,2120,2121,2122,2123,2124,2125,2126,2127,2128,2129,2130,2131,2132,2133,2134,2135,2136,2137,2138,2139,2140,2141,2142,2143,2144,2145,2146,2147,2148,2149,2150,2151,2152,2153,2154,2155,2156,2157,2158,2159,2160,2161,2162,2163,2164,2165,2166,2167,2168,2169,2170,2171,2172,2173,2174,2175,2176,2177,2178,2179,2180,2181,2182,2183,2184,2185,2186,2187,2188,2189,2190,2191,2192,2193,2194,2195,2196,2197,2198,2199,2200,2201,2202,2203,2204,2205,2206,2207,2208,2209,2210,2211,2212,2213,2214,2215,2216,2217,2218,2219,2220,2221,2222,2223,2224,2225,2226,2227,2228,2229,2230,2231,2232,2233,2234,2235,2236,2237,2238,2239,2240,2241,2242,2243,2244,2245,2246,2247,2248,2249,2250,2251,2252,2253,2254,2255,2256,2257,2258,2259,2260,2261,2262,2263,2264,2265,2266,2267,2268,2269,2270,2271,2272,2273,2274,2275,2276,2277,2278,2279,2280,2281,2282,2283,2284,2285,2286,2287,2288,2289,2290,2291,2292,2293,2294,2295,2296,2297,2298,2299,2300,2301,2302,2303,4095,4096,4097,4098,4099,4100,4101,4102,4103,4104,4105,4106,4107,4108,4109,4110,4111,4112,4113,4114,4115,4116,4117,4118,4119,4120,4121,4122,4123,4124,4125,4126,4127,4128,4129,4130,4131,4132,4133,4134,4135,4136,4137,4138,4139,4140,4141,4142,4143,4144,4145,4146,4147,4148,4149,4150,4151,4152,4153,4154,4155,4156,4157,4158,4159,4160,4161,4162,4163,4164,4165,4166,4167,4168,4169,4170,4171,4172,4173,4174,4175,4176,4177,4178,4179,4180,4181,4182,4183,4184,4185,4186,4187,4188,4189,4190,4191,4192,4193,4194,4195,4196,4197,4198,4199,4200,4201,4202,4203,4204,4205,4206,4207,4208,4209,4210,4211,4212,4213,4214,4215,4216,4217,4218,4219,4220,4221,4222,4223,4224,4225,4226,4227,4228,4229,4230,4231,4232,4233,4234,4235,4236,4237,4238,4239,4240,4241,4242,4243,4244,4245,4246,4247,4248,4249,4250,4251,4252,4253,4254,4255,4256,4257,4258,4259,4260,4261,4262,4263,4264,4265,4266,4267,4268,4269,4270,4271,4272,4273,4274,4275,4276,4277,4278,4279,4280,4281,4282,4283,4284,4285,4286,4287,4288,4289,4290,4291,4292,4293,4294,4295,4296,4297,4298,4299,4300,4301,4302,4303,4304,4305,4306,4307,4308,4309,4310,4311,4312,4313,4314,4315,4316,4317,4318,4319,4320,4321,4322,4323,4324,4325,4326,4327,4328,4329,4330,4331,4332,4333,4334,4335,4336,4337,4338,4339,4340,4341,4342,4343,4344,4345,4346,4347,4348,4349,4350,4351,6143,6144,6145,6146,6147,6148,6149,6150,6151,6152,6153,6154,6155,6156,6157,6158,6159,6160,6161,6162,6163,6164,6165,6166,6167,6168,6169,6170,6171,6172,6173,6174,6175,6176,6177,6178,6179,6180,6181,6182,6183,6184,6185,6186,6187,6188,6189,6190,6191,6192,6193,6194,6195,6196,6197,6198,6199,6200,6201,6202,6203,6204,6205,6206,6207,6208,6209,6210,6211,6212,6213,6214,6215,6216,6217,6218,6219,6220,6221,6222,6223,6224,6225,6226,6227,6228,6229,6230,6231,6232,6233,6234,6235,6236,6237,6238,6239,6240,6241,6242,6243,6244,6245,6246,6247,6248,6249,6250,6251,6252,6253,6254,6255,6256,6257,6258,6259,6260,6261,6262,6263,6264,6265,6266,6267,6268,6269,6270,6271,6272,6273,6274,6275,6276,6277,6278,6279,6280,6281,6282,6283,6284,6285,6286,6287,6288,6289,6290,6291,6292,6293,6294,6295,6296,6297,6298,6299,6300,6301,6302,6303,6304,6305,6306,6307,6308,6309,6310,6311,6312,6313,6314,6315,6316,6317,6318,6319,6320,6321,6322,6323,6324,6325,6326,6327,6328,6329,6330,6331,6332,6333,6334,6335,6336,6337,6338,6339,6340,6341,6342,6343,6344,6345,6346,6347,6348,6349,6350,6351,6352,6353,6354,6355,6356,6357,6358,6359,6360,6361,6362,6363,6364,6365,6366,6367,6368,6369,6370,6371,6372,6373,6374,6375,6376,6377,6378,6379,6380,6381,6382,6383,6384,6385,6386,6387,6388,6389,6390,6391,6392,6393,6394,6395,6396,6397,6398,6399,6655,6911,7167,7423,7679,7935,8063,8127,8159,8175,8183,8187,8189,8190,8191] },
  ],
});
