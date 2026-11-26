// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeListItemColorsValue, ComposeListItemElevationValue, ComposeListItemShapesValue } from "../values/records";
import type { ComposePaddingValues } from "../../utils/composeValues";
import type { ComposeInteractionSource } from "../../utils/nativeHandles";
import type { ComposeVerticalAlignment } from "../values/enums";

export type SegmentedListItemProps =
  | {
    shapes: ComposeListItemShapesValue;
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
    colors?: never;
    elevation?: never;
    onClick?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    shapes: ComposeListItemShapesValue;
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
    colors?: never;
    contentPadding?: never;
    onClick?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    shapes: ComposeListItemShapesValue;
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
    contentPadding?: never;
    onClick?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    shapes: ComposeListItemShapesValue;
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
    elevation?: never;
    contentPadding?: never;
    onClick?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    shapes: ComposeListItemShapesValue;
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
    elevation?: never;
    contentPadding?: never;
    onClick?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    shapes: ComposeListItemShapesValue;
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
    elevation?: never;
    contentPadding?: never;
    onClick?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    shapes: ComposeListItemShapesValue;
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
    elevation?: never;
    contentPadding?: never;
    onClick?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    shapes: ComposeListItemShapesValue;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    leadingContent: ReactNode;
    trailingContent: ReactNode;
    overlineContent: ReactNode;
    supportingContent: ReactNode;
    verticalAlignment: ComposeVerticalAlignment;
    colors: ComposeListItemColorsValue;
    elevation: ComposeListItemElevationValue;
    contentPadding: ComposePaddingValues;
    children?: ReactNode;
    enabled?: never;
    onClick?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    shapes: ComposeListItemShapesValue;
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
    elevation?: never;
    contentPadding?: never;
    onClick?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    shapes: ComposeListItemShapesValue;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    trailingContent: ReactNode;
    overlineContent: ReactNode;
    supportingContent: ReactNode;
    verticalAlignment: ComposeVerticalAlignment;
    colors: ComposeListItemColorsValue;
    elevation: ComposeListItemElevationValue;
    contentPadding: ComposePaddingValues;
    children?: ReactNode;
    leadingContent?: never;
    onClick?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    shapes: ComposeListItemShapesValue;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingContent: ReactNode;
    overlineContent: ReactNode;
    supportingContent: ReactNode;
    verticalAlignment: ComposeVerticalAlignment;
    colors: ComposeListItemColorsValue;
    elevation: ComposeListItemElevationValue;
    contentPadding: ComposePaddingValues;
    children?: ReactNode;
    trailingContent?: never;
    onClick?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    shapes: ComposeListItemShapesValue;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingContent: ReactNode;
    trailingContent: ReactNode;
    supportingContent: ReactNode;
    verticalAlignment: ComposeVerticalAlignment;
    colors: ComposeListItemColorsValue;
    elevation: ComposeListItemElevationValue;
    contentPadding: ComposePaddingValues;
    children?: ReactNode;
    overlineContent?: never;
    onClick?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    shapes: ComposeListItemShapesValue;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingContent: ReactNode;
    trailingContent: ReactNode;
    overlineContent: ReactNode;
    verticalAlignment: ComposeVerticalAlignment;
    colors: ComposeListItemColorsValue;
    elevation: ComposeListItemElevationValue;
    contentPadding: ComposePaddingValues;
    children?: ReactNode;
    supportingContent?: never;
    onClick?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    shapes: ComposeListItemShapesValue;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingContent: ReactNode;
    trailingContent: ReactNode;
    overlineContent: ReactNode;
    supportingContent: ReactNode;
    colors: ComposeListItemColorsValue;
    elevation: ComposeListItemElevationValue;
    contentPadding: ComposePaddingValues;
    children?: ReactNode;
    verticalAlignment?: never;
    onClick?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    shapes: ComposeListItemShapesValue;
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
    colors?: never;
    onClick?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    shapes: ComposeListItemShapesValue;
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
    contentPadding: ComposePaddingValues;
    children?: ReactNode;
    elevation?: never;
    onClick?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    shapes: ComposeListItemShapesValue;
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
    elevation: ComposeListItemElevationValue;
    contentPadding?: ComposePaddingValues;
    children?: ReactNode;
    onClick?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    onClick: () => void;
    shapes: ComposeListItemShapesValue;
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
    colors?: never;
    elevation?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    onClick: () => void;
    shapes: ComposeListItemShapesValue;
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
    colors?: never;
    contentPadding?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    onClick: () => void;
    shapes: ComposeListItemShapesValue;
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
    contentPadding?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    onClick: () => void;
    shapes: ComposeListItemShapesValue;
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
    elevation?: never;
    contentPadding?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    onClick: () => void;
    shapes: ComposeListItemShapesValue;
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
    elevation?: never;
    contentPadding?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    onClick: () => void;
    shapes: ComposeListItemShapesValue;
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
    elevation?: never;
    contentPadding?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    onClick: () => void;
    shapes: ComposeListItemShapesValue;
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
    elevation?: never;
    contentPadding?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    onClick: () => void;
    shapes: ComposeListItemShapesValue;
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
    colors: ComposeListItemColorsValue;
    elevation: ComposeListItemElevationValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    enabled?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    onClick: () => void;
    shapes: ComposeListItemShapesValue;
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
    elevation?: never;
    contentPadding?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    onClick: () => void;
    shapes: ComposeListItemShapesValue;
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
    colors: ComposeListItemColorsValue;
    elevation: ComposeListItemElevationValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    leadingContent?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    onClick: () => void;
    shapes: ComposeListItemShapesValue;
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
    colors: ComposeListItemColorsValue;
    elevation: ComposeListItemElevationValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    trailingContent?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    onClick: () => void;
    shapes: ComposeListItemShapesValue;
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
    colors: ComposeListItemColorsValue;
    elevation: ComposeListItemElevationValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    overlineContent?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    onClick: () => void;
    shapes: ComposeListItemShapesValue;
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
    colors: ComposeListItemColorsValue;
    elevation: ComposeListItemElevationValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    supportingContent?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    onClick: () => void;
    shapes: ComposeListItemShapesValue;
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
    colors: ComposeListItemColorsValue;
    elevation: ComposeListItemElevationValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    verticalAlignment?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    onClick: () => void;
    shapes: ComposeListItemShapesValue;
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
    colors: ComposeListItemColorsValue;
    elevation: ComposeListItemElevationValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    onLongClick?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    onClick: () => void;
    shapes: ComposeListItemShapesValue;
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
    colors: ComposeListItemColorsValue;
    elevation: ComposeListItemElevationValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    onLongClickLabel?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    onClick: () => void;
    shapes: ComposeListItemShapesValue;
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
    colors?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    onClick: () => void;
    shapes: ComposeListItemShapesValue;
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
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    elevation?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    onClick: () => void;
    shapes: ComposeListItemShapesValue;
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
    elevation: ComposeListItemElevationValue;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    contentPadding?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    onClick: () => void;
    shapes: ComposeListItemShapesValue;
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
    elevation: ComposeListItemElevationValue;
    contentPadding: ComposePaddingValues;
    interactionSource?: ComposeInteractionSource | null;
    children?: ReactNode;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    shapes: ComposeListItemShapesValue;
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
    colors?: never;
    elevation?: never;
    onClick?: never;
    selected?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    shapes: ComposeListItemShapesValue;
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
    colors?: never;
    contentPadding?: never;
    onClick?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    selected?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    shapes: ComposeListItemShapesValue;
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
    contentPadding?: never;
    onClick?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    selected?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    shapes: ComposeListItemShapesValue;
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
    elevation?: never;
    contentPadding?: never;
    onClick?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    selected?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    shapes: ComposeListItemShapesValue;
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
    elevation?: never;
    contentPadding?: never;
    onClick?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    selected?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    shapes: ComposeListItemShapesValue;
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
    elevation?: never;
    contentPadding?: never;
    onClick?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    selected?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    shapes: ComposeListItemShapesValue;
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
    elevation?: never;
    contentPadding?: never;
    onClick?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    selected?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    shapes: ComposeListItemShapesValue;
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
    colors: ComposeListItemColorsValue;
    elevation: ComposeListItemElevationValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    enabled?: never;
    onClick?: never;
    selected?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    shapes: ComposeListItemShapesValue;
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
    elevation?: never;
    contentPadding?: never;
    onClick?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    selected?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    shapes: ComposeListItemShapesValue;
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
    colors: ComposeListItemColorsValue;
    elevation: ComposeListItemElevationValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    leadingContent?: never;
    onClick?: never;
    selected?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    shapes: ComposeListItemShapesValue;
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
    colors: ComposeListItemColorsValue;
    elevation: ComposeListItemElevationValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    trailingContent?: never;
    onClick?: never;
    selected?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    shapes: ComposeListItemShapesValue;
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
    colors: ComposeListItemColorsValue;
    elevation: ComposeListItemElevationValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    overlineContent?: never;
    onClick?: never;
    selected?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    shapes: ComposeListItemShapesValue;
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
    colors: ComposeListItemColorsValue;
    elevation: ComposeListItemElevationValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    supportingContent?: never;
    onClick?: never;
    selected?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    shapes: ComposeListItemShapesValue;
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
    colors: ComposeListItemColorsValue;
    elevation: ComposeListItemElevationValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    verticalAlignment?: never;
    onClick?: never;
    selected?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    shapes: ComposeListItemShapesValue;
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
    colors: ComposeListItemColorsValue;
    elevation: ComposeListItemElevationValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    onClick?: never;
    onLongClick?: never;
    selected?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    shapes: ComposeListItemShapesValue;
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
    colors: ComposeListItemColorsValue;
    elevation: ComposeListItemElevationValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    onClick?: never;
    onLongClickLabel?: never;
    selected?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    shapes: ComposeListItemShapesValue;
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
    colors?: never;
    onClick?: never;
    selected?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    shapes: ComposeListItemShapesValue;
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
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    elevation?: never;
    onClick?: never;
    selected?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    shapes: ComposeListItemShapesValue;
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
    elevation: ComposeListItemElevationValue;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    contentPadding?: never;
    onClick?: never;
    selected?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    shapes: ComposeListItemShapesValue;
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
    elevation: ComposeListItemElevationValue;
    contentPadding: ComposePaddingValues;
    interactionSource?: ComposeInteractionSource | null;
    children?: ReactNode;
    onClick?: never;
    selected?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    shapes: ComposeListItemShapesValue;
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
    colors?: never;
    elevation?: never;
    checked?: never;
    onCheckedChange?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    shapes: ComposeListItemShapesValue;
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
    colors?: never;
    contentPadding?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    checked?: never;
    onCheckedChange?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    shapes: ComposeListItemShapesValue;
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
    contentPadding?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    checked?: never;
    onCheckedChange?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    shapes: ComposeListItemShapesValue;
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
    elevation?: never;
    contentPadding?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    checked?: never;
    onCheckedChange?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    shapes: ComposeListItemShapesValue;
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
    elevation?: never;
    contentPadding?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    checked?: never;
    onCheckedChange?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    shapes: ComposeListItemShapesValue;
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
    elevation?: never;
    contentPadding?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    checked?: never;
    onCheckedChange?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    shapes: ComposeListItemShapesValue;
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
    elevation?: never;
    contentPadding?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    checked?: never;
    onCheckedChange?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    shapes: ComposeListItemShapesValue;
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
    colors: ComposeListItemColorsValue;
    elevation: ComposeListItemElevationValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    enabled?: never;
    checked?: never;
    onCheckedChange?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    shapes: ComposeListItemShapesValue;
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
    elevation?: never;
    contentPadding?: never;
    onLongClick?: never;
    onLongClickLabel?: never;
    interactionSource?: never;
    checked?: never;
    onCheckedChange?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    shapes: ComposeListItemShapesValue;
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
    colors: ComposeListItemColorsValue;
    elevation: ComposeListItemElevationValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    leadingContent?: never;
    checked?: never;
    onCheckedChange?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    shapes: ComposeListItemShapesValue;
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
    colors: ComposeListItemColorsValue;
    elevation: ComposeListItemElevationValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    trailingContent?: never;
    checked?: never;
    onCheckedChange?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    shapes: ComposeListItemShapesValue;
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
    colors: ComposeListItemColorsValue;
    elevation: ComposeListItemElevationValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    overlineContent?: never;
    checked?: never;
    onCheckedChange?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    shapes: ComposeListItemShapesValue;
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
    colors: ComposeListItemColorsValue;
    elevation: ComposeListItemElevationValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    supportingContent?: never;
    checked?: never;
    onCheckedChange?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    shapes: ComposeListItemShapesValue;
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
    colors: ComposeListItemColorsValue;
    elevation: ComposeListItemElevationValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    verticalAlignment?: never;
    checked?: never;
    onCheckedChange?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    shapes: ComposeListItemShapesValue;
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
    colors: ComposeListItemColorsValue;
    elevation: ComposeListItemElevationValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    onLongClick?: never;
    checked?: never;
    onCheckedChange?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    shapes: ComposeListItemShapesValue;
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
    colors: ComposeListItemColorsValue;
    elevation: ComposeListItemElevationValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    onLongClickLabel?: never;
    checked?: never;
    onCheckedChange?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    shapes: ComposeListItemShapesValue;
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
    colors?: never;
    checked?: never;
    onCheckedChange?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    shapes: ComposeListItemShapesValue;
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
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    elevation?: never;
    checked?: never;
    onCheckedChange?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    shapes: ComposeListItemShapesValue;
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
    elevation: ComposeListItemElevationValue;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    contentPadding?: never;
    checked?: never;
    onCheckedChange?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    shapes: ComposeListItemShapesValue;
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
    elevation: ComposeListItemElevationValue;
    contentPadding: ComposePaddingValues;
    interactionSource?: ComposeInteractionSource | null;
    children?: ReactNode;
    checked?: never;
    onCheckedChange?: never;
    }
;
export const SegmentedListItem = createComposableComponent<SegmentedListItemProps>({
  name: "SegmentedListItem",
  props: ["shapes","modifier","enabled","verticalAlignment","colors","elevation","contentPadding","onLongClickLabel","interactionSource","checked","selected"],
  objectProps: ["shapes","colors","elevation","contentPadding","interactionSource"],
  slots: ["leadingContent","trailingContent","overlineContent","supportingContent"],
  events: ["onClick","onLongClick","onCheckedChange"],
  children: true,
  overloads: [
    { id: "SegmentedListItem", children: true, parameters: [["shapes","object",false,false],["modifier","ComposeModifier",true,false],["enabled","boolean",true,false],["leadingContent","ReactNode",true,true],["trailingContent","ReactNode",true,true],["overlineContent","ReactNode",true,true],["supportingContent","ReactNode",true,true],["verticalAlignment","string",true,false],["colors","object",true,false],["elevation","object",true,false],["contentPadding","object",true,false]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,128,129,130,131,132,133,134,135,136,137,138,139,140,141,142,143,144,145,146,147,148,149,150,151,152,153,154,155,156,157,158,159,192,255,256,257,258,259,260,261,262,263,264,265,266,267,268,269,270,271,272,273,274,275,276,277,278,279,280,281,282,283,284,285,286,287,288,289,290,291,292,293,294,295,296,297,298,299,300,301,302,303,304,305,306,307,308,309,310,311,312,313,314,315,316,317,318,319,383,447,479,495,503,507,509,510,511] },
    { id: "SegmentedListItem#1", children: true, parameters: [["onClick","function",false,false],["shapes","object",false,false],["modifier","ComposeModifier",true,false],["enabled","boolean",true,false],["leadingContent","ReactNode",true,true],["trailingContent","ReactNode",true,true],["overlineContent","ReactNode",true,true],["supportingContent","ReactNode",true,true],["verticalAlignment","string",true,false],["onLongClick","function",true,true],["onLongClickLabel","string",true,true],["colors","object",true,false],["elevation","object",true,false],["contentPadding","object",true,false],["interactionSource","object",true,true]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,123,124,125,126,127,128,129,130,131,132,133,134,135,136,137,138,139,140,141,142,143,144,145,146,147,148,149,150,151,152,153,154,155,156,157,158,159,160,161,162,163,164,165,166,167,168,169,170,171,172,173,174,175,176,177,178,179,180,181,182,183,184,185,186,187,188,189,190,191,192,193,194,195,196,197,198,199,200,201,202,203,204,205,206,207,208,209,210,211,212,213,214,215,216,217,218,219,220,221,222,223,224,225,226,227,228,229,230,231,232,233,234,235,236,237,238,239,240,241,242,243,244,245,246,247,248,249,250,251,252,253,254,255,256,257,258,259,260,261,262,263,264,265,266,267,268,269,270,271,272,273,274,275,276,277,278,279,280,281,282,283,284,285,286,287,512,513,514,515,516,517,518,519,520,521,522,523,524,525,526,527,528,529,530,531,532,533,534,535,536,537,538,539,540,541,542,543,768,1024,1025,1026,1027,1028,1029,1030,1031,1032,1033,1034,1035,1036,1037,1038,1039,1040,1041,1042,1043,1044,1045,1046,1047,1048,1049,1050,1051,1052,1053,1054,1055,1056,1057,1058,1059,1060,1061,1062,1063,1064,1065,1066,1067,1068,1069,1070,1071,1072,1073,1074,1075,1076,1077,1078,1079,1080,1081,1082,1083,1084,1085,1086,1087,1088,1089,1090,1091,1092,1093,1094,1095,1096,1097,1098,1099,1100,1101,1102,1103,1104,1105,1106,1107,1108,1109,1110,1111,1112,1113,1114,1115,1116,1117,1118,1119,1120,1121,1122,1123,1124,1125,1126,1127,1128,1129,1130,1131,1132,1133,1134,1135,1136,1137,1138,1139,1140,1141,1142,1143,1144,1145,1146,1147,1148,1149,1150,1151,1152,1153,1154,1155,1156,1157,1158,1159,1160,1161,1162,1163,1164,1165,1166,1167,1168,1169,1170,1171,1172,1173,1174,1175,1176,1177,1178,1179,1180,1181,1182,1183,1184,1185,1186,1187,1188,1189,1190,1191,1192,1193,1194,1195,1196,1197,1198,1199,1200,1201,1202,1203,1204,1205,1206,1207,1208,1209,1210,1211,1212,1213,1214,1215,1216,1217,1218,1219,1220,1221,1222,1223,1224,1225,1226,1227,1228,1229,1230,1231,1232,1233,1234,1235,1236,1237,1238,1239,1240,1241,1242,1243,1244,1245,1246,1247,1248,1249,1250,1251,1252,1253,1254,1255,1256,1257,1258,1259,1260,1261,1262,1263,1264,1265,1266,1267,1268,1269,1270,1271,1272,1273,1274,1275,1276,1277,1278,1279,2047,2048,2049,2050,2051,2052,2053,2054,2055,2056,2057,2058,2059,2060,2061,2062,2063,2064,2065,2066,2067,2068,2069,2070,2071,2072,2073,2074,2075,2076,2077,2078,2079,2080,2081,2082,2083,2084,2085,2086,2087,2088,2089,2090,2091,2092,2093,2094,2095,2096,2097,2098,2099,2100,2101,2102,2103,2104,2105,2106,2107,2108,2109,2110,2111,2112,2113,2114,2115,2116,2117,2118,2119,2120,2121,2122,2123,2124,2125,2126,2127,2128,2129,2130,2131,2132,2133,2134,2135,2136,2137,2138,2139,2140,2141,2142,2143,2144,2145,2146,2147,2148,2149,2150,2151,2152,2153,2154,2155,2156,2157,2158,2159,2160,2161,2162,2163,2164,2165,2166,2167,2168,2169,2170,2171,2172,2173,2174,2175,2176,2177,2178,2179,2180,2181,2182,2183,2184,2185,2186,2187,2188,2189,2190,2191,2192,2193,2194,2195,2196,2197,2198,2199,2200,2201,2202,2203,2204,2205,2206,2207,2208,2209,2210,2211,2212,2213,2214,2215,2216,2217,2218,2219,2220,2221,2222,2223,2224,2225,2226,2227,2228,2229,2230,2231,2232,2233,2234,2235,2236,2237,2238,2239,2240,2241,2242,2243,2244,2245,2246,2247,2248,2249,2250,2251,2252,2253,2254,2255,2256,2257,2258,2259,2260,2261,2262,2263,2264,2265,2266,2267,2268,2269,2270,2271,2272,2273,2274,2275,2276,2277,2278,2279,2280,2281,2282,2283,2284,2285,2286,2287,2288,2289,2290,2291,2292,2293,2294,2295,2296,2297,2298,2299,2300,2301,2302,2303,3071,3072,3073,3074,3075,3076,3077,3078,3079,3080,3081,3082,3083,3084,3085,3086,3087,3088,3089,3090,3091,3092,3093,3094,3095,3096,3097,3098,3099,3100,3101,3102,3103,3104,3105,3106,3107,3108,3109,3110,3111,3112,3113,3114,3115,3116,3117,3118,3119,3120,3121,3122,3123,3124,3125,3126,3127,3128,3129,3130,3131,3132,3133,3134,3135,3136,3137,3138,3139,3140,3141,3142,3143,3144,3145,3146,3147,3148,3149,3150,3151,3152,3153,3154,3155,3156,3157,3158,3159,3160,3161,3162,3163,3164,3165,3166,3167,3168,3169,3170,3171,3172,3173,3174,3175,3176,3177,3178,3179,3180,3181,3182,3183,3184,3185,3186,3187,3188,3189,3190,3191,3192,3193,3194,3195,3196,3197,3198,3199,3200,3201,3202,3203,3204,3205,3206,3207,3208,3209,3210,3211,3212,3213,3214,3215,3216,3217,3218,3219,3220,3221,3222,3223,3224,3225,3226,3227,3228,3229,3230,3231,3232,3233,3234,3235,3236,3237,3238,3239,3240,3241,3242,3243,3244,3245,3246,3247,3248,3249,3250,3251,3252,3253,3254,3255,3256,3257,3258,3259,3260,3261,3262,3263,3264,3265,3266,3267,3268,3269,3270,3271,3272,3273,3274,3275,3276,3277,3278,3279,3280,3281,3282,3283,3284,3285,3286,3287,3288,3289,3290,3291,3292,3293,3294,3295,3296,3297,3298,3299,3300,3301,3302,3303,3304,3305,3306,3307,3308,3309,3310,3311,3312,3313,3314,3315,3316,3317,3318,3319,3320,3321,3322,3323,3324,3325,3326,3327,3583,3839,3967,4031,4063,4079,4087,4091,4093,4094,4095] },
    { id: "SegmentedListItem#2", children: true, parameters: [["checked","boolean",false,false],["onCheckedChange","function",false,false],["shapes","object",false,false],["modifier","ComposeModifier",true,false],["enabled","boolean",true,false],["leadingContent","ReactNode",true,true],["trailingContent","ReactNode",true,true],["overlineContent","ReactNode",true,true],["supportingContent","ReactNode",true,true],["verticalAlignment","string",true,false],["onLongClick","function",true,true],["onLongClickLabel","string",true,true],["colors","object",true,false],["elevation","object",true,false],["contentPadding","object",true,false],["interactionSource","object",true,true]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,123,124,125,126,127,128,129,130,131,132,133,134,135,136,137,138,139,140,141,142,143,144,145,146,147,148,149,150,151,152,153,154,155,156,157,158,159,160,161,162,163,164,165,166,167,168,169,170,171,172,173,174,175,176,177,178,179,180,181,182,183,184,185,186,187,188,189,190,191,192,193,194,195,196,197,198,199,200,201,202,203,204,205,206,207,208,209,210,211,212,213,214,215,216,217,218,219,220,221,222,223,224,225,226,227,228,229,230,231,232,233,234,235,236,237,238,239,240,241,242,243,244,245,246,247,248,249,250,251,252,253,254,255,256,257,258,259,260,261,262,263,264,265,266,267,268,269,270,271,272,273,274,275,276,277,278,279,280,281,282,283,284,285,286,287,512,513,514,515,516,517,518,519,520,521,522,523,524,525,526,527,528,529,530,531,532,533,534,535,536,537,538,539,540,541,542,543,768,1024,1025,1026,1027,1028,1029,1030,1031,1032,1033,1034,1035,1036,1037,1038,1039,1040,1041,1042,1043,1044,1045,1046,1047,1048,1049,1050,1051,1052,1053,1054,1055,1056,1057,1058,1059,1060,1061,1062,1063,1064,1065,1066,1067,1068,1069,1070,1071,1072,1073,1074,1075,1076,1077,1078,1079,1080,1081,1082,1083,1084,1085,1086,1087,1088,1089,1090,1091,1092,1093,1094,1095,1096,1097,1098,1099,1100,1101,1102,1103,1104,1105,1106,1107,1108,1109,1110,1111,1112,1113,1114,1115,1116,1117,1118,1119,1120,1121,1122,1123,1124,1125,1126,1127,1128,1129,1130,1131,1132,1133,1134,1135,1136,1137,1138,1139,1140,1141,1142,1143,1144,1145,1146,1147,1148,1149,1150,1151,1152,1153,1154,1155,1156,1157,1158,1159,1160,1161,1162,1163,1164,1165,1166,1167,1168,1169,1170,1171,1172,1173,1174,1175,1176,1177,1178,1179,1180,1181,1182,1183,1184,1185,1186,1187,1188,1189,1190,1191,1192,1193,1194,1195,1196,1197,1198,1199,1200,1201,1202,1203,1204,1205,1206,1207,1208,1209,1210,1211,1212,1213,1214,1215,1216,1217,1218,1219,1220,1221,1222,1223,1224,1225,1226,1227,1228,1229,1230,1231,1232,1233,1234,1235,1236,1237,1238,1239,1240,1241,1242,1243,1244,1245,1246,1247,1248,1249,1250,1251,1252,1253,1254,1255,1256,1257,1258,1259,1260,1261,1262,1263,1264,1265,1266,1267,1268,1269,1270,1271,1272,1273,1274,1275,1276,1277,1278,1279,2047,2048,2049,2050,2051,2052,2053,2054,2055,2056,2057,2058,2059,2060,2061,2062,2063,2064,2065,2066,2067,2068,2069,2070,2071,2072,2073,2074,2075,2076,2077,2078,2079,2080,2081,2082,2083,2084,2085,2086,2087,2088,2089,2090,2091,2092,2093,2094,2095,2096,2097,2098,2099,2100,2101,2102,2103,2104,2105,2106,2107,2108,2109,2110,2111,2112,2113,2114,2115,2116,2117,2118,2119,2120,2121,2122,2123,2124,2125,2126,2127,2128,2129,2130,2131,2132,2133,2134,2135,2136,2137,2138,2139,2140,2141,2142,2143,2144,2145,2146,2147,2148,2149,2150,2151,2152,2153,2154,2155,2156,2157,2158,2159,2160,2161,2162,2163,2164,2165,2166,2167,2168,2169,2170,2171,2172,2173,2174,2175,2176,2177,2178,2179,2180,2181,2182,2183,2184,2185,2186,2187,2188,2189,2190,2191,2192,2193,2194,2195,2196,2197,2198,2199,2200,2201,2202,2203,2204,2205,2206,2207,2208,2209,2210,2211,2212,2213,2214,2215,2216,2217,2218,2219,2220,2221,2222,2223,2224,2225,2226,2227,2228,2229,2230,2231,2232,2233,2234,2235,2236,2237,2238,2239,2240,2241,2242,2243,2244,2245,2246,2247,2248,2249,2250,2251,2252,2253,2254,2255,2256,2257,2258,2259,2260,2261,2262,2263,2264,2265,2266,2267,2268,2269,2270,2271,2272,2273,2274,2275,2276,2277,2278,2279,2280,2281,2282,2283,2284,2285,2286,2287,2288,2289,2290,2291,2292,2293,2294,2295,2296,2297,2298,2299,2300,2301,2302,2303,3071,3072,3073,3074,3075,3076,3077,3078,3079,3080,3081,3082,3083,3084,3085,3086,3087,3088,3089,3090,3091,3092,3093,3094,3095,3096,3097,3098,3099,3100,3101,3102,3103,3104,3105,3106,3107,3108,3109,3110,3111,3112,3113,3114,3115,3116,3117,3118,3119,3120,3121,3122,3123,3124,3125,3126,3127,3128,3129,3130,3131,3132,3133,3134,3135,3136,3137,3138,3139,3140,3141,3142,3143,3144,3145,3146,3147,3148,3149,3150,3151,3152,3153,3154,3155,3156,3157,3158,3159,3160,3161,3162,3163,3164,3165,3166,3167,3168,3169,3170,3171,3172,3173,3174,3175,3176,3177,3178,3179,3180,3181,3182,3183,3184,3185,3186,3187,3188,3189,3190,3191,3192,3193,3194,3195,3196,3197,3198,3199,3200,3201,3202,3203,3204,3205,3206,3207,3208,3209,3210,3211,3212,3213,3214,3215,3216,3217,3218,3219,3220,3221,3222,3223,3224,3225,3226,3227,3228,3229,3230,3231,3232,3233,3234,3235,3236,3237,3238,3239,3240,3241,3242,3243,3244,3245,3246,3247,3248,3249,3250,3251,3252,3253,3254,3255,3256,3257,3258,3259,3260,3261,3262,3263,3264,3265,3266,3267,3268,3269,3270,3271,3272,3273,3274,3275,3276,3277,3278,3279,3280,3281,3282,3283,3284,3285,3286,3287,3288,3289,3290,3291,3292,3293,3294,3295,3296,3297,3298,3299,3300,3301,3302,3303,3304,3305,3306,3307,3308,3309,3310,3311,3312,3313,3314,3315,3316,3317,3318,3319,3320,3321,3322,3323,3324,3325,3326,3327,3583,3839,3967,4031,4063,4079,4087,4091,4093,4094,4095] },
    { id: "SegmentedListItem#3", children: true, parameters: [["selected","boolean",false,false],["onClick","function",false,false],["shapes","object",false,false],["modifier","ComposeModifier",true,false],["enabled","boolean",true,false],["leadingContent","ReactNode",true,true],["trailingContent","ReactNode",true,true],["overlineContent","ReactNode",true,true],["supportingContent","ReactNode",true,true],["verticalAlignment","string",true,false],["onLongClick","function",true,true],["onLongClickLabel","string",true,true],["colors","object",true,false],["elevation","object",true,false],["contentPadding","object",true,false],["interactionSource","object",true,true]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,123,124,125,126,127,128,129,130,131,132,133,134,135,136,137,138,139,140,141,142,143,144,145,146,147,148,149,150,151,152,153,154,155,156,157,158,159,160,161,162,163,164,165,166,167,168,169,170,171,172,173,174,175,176,177,178,179,180,181,182,183,184,185,186,187,188,189,190,191,192,193,194,195,196,197,198,199,200,201,202,203,204,205,206,207,208,209,210,211,212,213,214,215,216,217,218,219,220,221,222,223,224,225,226,227,228,229,230,231,232,233,234,235,236,237,238,239,240,241,242,243,244,245,246,247,248,249,250,251,252,253,254,255,256,257,258,259,260,261,262,263,264,265,266,267,268,269,270,271,272,273,274,275,276,277,278,279,280,281,282,283,284,285,286,287,512,513,514,515,516,517,518,519,520,521,522,523,524,525,526,527,528,529,530,531,532,533,534,535,536,537,538,539,540,541,542,543,768,1024,1025,1026,1027,1028,1029,1030,1031,1032,1033,1034,1035,1036,1037,1038,1039,1040,1041,1042,1043,1044,1045,1046,1047,1048,1049,1050,1051,1052,1053,1054,1055,1056,1057,1058,1059,1060,1061,1062,1063,1064,1065,1066,1067,1068,1069,1070,1071,1072,1073,1074,1075,1076,1077,1078,1079,1080,1081,1082,1083,1084,1085,1086,1087,1088,1089,1090,1091,1092,1093,1094,1095,1096,1097,1098,1099,1100,1101,1102,1103,1104,1105,1106,1107,1108,1109,1110,1111,1112,1113,1114,1115,1116,1117,1118,1119,1120,1121,1122,1123,1124,1125,1126,1127,1128,1129,1130,1131,1132,1133,1134,1135,1136,1137,1138,1139,1140,1141,1142,1143,1144,1145,1146,1147,1148,1149,1150,1151,1152,1153,1154,1155,1156,1157,1158,1159,1160,1161,1162,1163,1164,1165,1166,1167,1168,1169,1170,1171,1172,1173,1174,1175,1176,1177,1178,1179,1180,1181,1182,1183,1184,1185,1186,1187,1188,1189,1190,1191,1192,1193,1194,1195,1196,1197,1198,1199,1200,1201,1202,1203,1204,1205,1206,1207,1208,1209,1210,1211,1212,1213,1214,1215,1216,1217,1218,1219,1220,1221,1222,1223,1224,1225,1226,1227,1228,1229,1230,1231,1232,1233,1234,1235,1236,1237,1238,1239,1240,1241,1242,1243,1244,1245,1246,1247,1248,1249,1250,1251,1252,1253,1254,1255,1256,1257,1258,1259,1260,1261,1262,1263,1264,1265,1266,1267,1268,1269,1270,1271,1272,1273,1274,1275,1276,1277,1278,1279,2047,2048,2049,2050,2051,2052,2053,2054,2055,2056,2057,2058,2059,2060,2061,2062,2063,2064,2065,2066,2067,2068,2069,2070,2071,2072,2073,2074,2075,2076,2077,2078,2079,2080,2081,2082,2083,2084,2085,2086,2087,2088,2089,2090,2091,2092,2093,2094,2095,2096,2097,2098,2099,2100,2101,2102,2103,2104,2105,2106,2107,2108,2109,2110,2111,2112,2113,2114,2115,2116,2117,2118,2119,2120,2121,2122,2123,2124,2125,2126,2127,2128,2129,2130,2131,2132,2133,2134,2135,2136,2137,2138,2139,2140,2141,2142,2143,2144,2145,2146,2147,2148,2149,2150,2151,2152,2153,2154,2155,2156,2157,2158,2159,2160,2161,2162,2163,2164,2165,2166,2167,2168,2169,2170,2171,2172,2173,2174,2175,2176,2177,2178,2179,2180,2181,2182,2183,2184,2185,2186,2187,2188,2189,2190,2191,2192,2193,2194,2195,2196,2197,2198,2199,2200,2201,2202,2203,2204,2205,2206,2207,2208,2209,2210,2211,2212,2213,2214,2215,2216,2217,2218,2219,2220,2221,2222,2223,2224,2225,2226,2227,2228,2229,2230,2231,2232,2233,2234,2235,2236,2237,2238,2239,2240,2241,2242,2243,2244,2245,2246,2247,2248,2249,2250,2251,2252,2253,2254,2255,2256,2257,2258,2259,2260,2261,2262,2263,2264,2265,2266,2267,2268,2269,2270,2271,2272,2273,2274,2275,2276,2277,2278,2279,2280,2281,2282,2283,2284,2285,2286,2287,2288,2289,2290,2291,2292,2293,2294,2295,2296,2297,2298,2299,2300,2301,2302,2303,3071,3072,3073,3074,3075,3076,3077,3078,3079,3080,3081,3082,3083,3084,3085,3086,3087,3088,3089,3090,3091,3092,3093,3094,3095,3096,3097,3098,3099,3100,3101,3102,3103,3104,3105,3106,3107,3108,3109,3110,3111,3112,3113,3114,3115,3116,3117,3118,3119,3120,3121,3122,3123,3124,3125,3126,3127,3128,3129,3130,3131,3132,3133,3134,3135,3136,3137,3138,3139,3140,3141,3142,3143,3144,3145,3146,3147,3148,3149,3150,3151,3152,3153,3154,3155,3156,3157,3158,3159,3160,3161,3162,3163,3164,3165,3166,3167,3168,3169,3170,3171,3172,3173,3174,3175,3176,3177,3178,3179,3180,3181,3182,3183,3184,3185,3186,3187,3188,3189,3190,3191,3192,3193,3194,3195,3196,3197,3198,3199,3200,3201,3202,3203,3204,3205,3206,3207,3208,3209,3210,3211,3212,3213,3214,3215,3216,3217,3218,3219,3220,3221,3222,3223,3224,3225,3226,3227,3228,3229,3230,3231,3232,3233,3234,3235,3236,3237,3238,3239,3240,3241,3242,3243,3244,3245,3246,3247,3248,3249,3250,3251,3252,3253,3254,3255,3256,3257,3258,3259,3260,3261,3262,3263,3264,3265,3266,3267,3268,3269,3270,3271,3272,3273,3274,3275,3276,3277,3278,3279,3280,3281,3282,3283,3284,3285,3286,3287,3288,3289,3290,3291,3292,3293,3294,3295,3296,3297,3298,3299,3300,3301,3302,3303,3304,3305,3306,3307,3308,3309,3310,3311,3312,3313,3314,3315,3316,3317,3318,3319,3320,3321,3322,3323,3324,3325,3326,3327,3583,3839,3967,4031,4063,4079,4087,4091,4093,4094,4095] },
  ],
});
