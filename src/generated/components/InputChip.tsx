// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeShape } from "../../utils/modifier";
import type { ComposeChipShapesValue, ComposeSelectableChipColorsValue, ComposeSelectableChipElevationValue } from "../values/records";
import type { ComposeBorderStroke, ComposePaddingValues } from "../../utils/composeValues";
import type { ComposeInteractionSource } from "../../utils/nativeHandles";
import type { ComposeHorizontalArrangement } from "../values/enums";

export type InputChipProps =
  | {
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
    horizontalArrangement?: ComposeHorizontalArrangement;
    contentPadding?: ComposePaddingValues;
    interactionSource?: ComposeInteractionSource | null;
    colors?: never;
    elevation?: never;
    border?: never;
    shapes?: never;
    }
  | {
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
    border: ComposeBorderStroke | null;
    interactionSource?: ComposeInteractionSource | null;
    colors?: never;
    elevation?: never;
    horizontalArrangement?: never;
    contentPadding?: never;
    shapes?: never;
    }
  | {
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
    elevation: ComposeSelectableChipElevationValue | null;
    border?: ComposeBorderStroke | null;
    interactionSource?: ComposeInteractionSource | null;
    colors?: never;
    horizontalArrangement?: never;
    contentPadding?: never;
    shapes?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    label: ReactNode;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    colors: ComposeSelectableChipColorsValue;
    elevation?: ComposeSelectableChipElevationValue | null;
    enabled?: never;
    leadingIcon?: never;
    avatar?: never;
    trailingIcon?: never;
    shape?: never;
    border?: never;
    horizontalArrangement?: never;
    contentPadding?: never;
    interactionSource?: never;
    shapes?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    label: ReactNode;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    shape: ComposeShape;
    colors: ComposeSelectableChipColorsValue;
    enabled?: never;
    leadingIcon?: never;
    avatar?: never;
    trailingIcon?: never;
    elevation?: never;
    border?: never;
    horizontalArrangement?: never;
    contentPadding?: never;
    interactionSource?: never;
    shapes?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    label: ReactNode;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    trailingIcon: ReactNode;
    shape?: ComposeShape;
    colors: ComposeSelectableChipColorsValue;
    enabled?: never;
    leadingIcon?: never;
    avatar?: never;
    elevation?: never;
    border?: never;
    horizontalArrangement?: never;
    contentPadding?: never;
    interactionSource?: never;
    shapes?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    label: ReactNode;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    avatar: ReactNode;
    trailingIcon?: ReactNode;
    shape?: ComposeShape;
    colors: ComposeSelectableChipColorsValue;
    enabled?: never;
    leadingIcon?: never;
    elevation?: never;
    border?: never;
    horizontalArrangement?: never;
    contentPadding?: never;
    interactionSource?: never;
    shapes?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    label: ReactNode;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    leadingIcon: ReactNode;
    avatar?: ReactNode;
    trailingIcon?: ReactNode;
    shape?: ComposeShape;
    colors: ComposeSelectableChipColorsValue;
    enabled?: never;
    elevation?: never;
    border?: never;
    horizontalArrangement?: never;
    contentPadding?: never;
    interactionSource?: never;
    shapes?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    label: ReactNode;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    leadingIcon: ReactNode;
    avatar: ReactNode;
    trailingIcon: ReactNode;
    shape: ComposeShape;
    border: ComposeBorderStroke | null;
    horizontalArrangement: ComposeHorizontalArrangement;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    enabled?: never;
    colors?: never;
    elevation?: never;
    shapes?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    label: ReactNode;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    leadingIcon: ReactNode;
    avatar: ReactNode;
    trailingIcon: ReactNode;
    shape: ComposeShape;
    colors: ComposeSelectableChipColorsValue;
    elevation: ComposeSelectableChipElevationValue | null;
    border: ComposeBorderStroke | null;
    horizontalArrangement: ComposeHorizontalArrangement;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    enabled?: never;
    shapes?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    label: ReactNode;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingIcon?: ReactNode;
    avatar?: ReactNode;
    trailingIcon?: ReactNode;
    shape?: ComposeShape;
    colors: ComposeSelectableChipColorsValue;
    elevation?: never;
    border?: never;
    horizontalArrangement?: never;
    contentPadding?: never;
    interactionSource?: never;
    shapes?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    label: ReactNode;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    avatar: ReactNode;
    trailingIcon: ReactNode;
    shape: ComposeShape;
    border: ComposeBorderStroke | null;
    horizontalArrangement: ComposeHorizontalArrangement;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    leadingIcon?: never;
    colors?: never;
    elevation?: never;
    shapes?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    label: ReactNode;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    avatar: ReactNode;
    trailingIcon: ReactNode;
    shape: ComposeShape;
    colors: ComposeSelectableChipColorsValue;
    elevation: ComposeSelectableChipElevationValue | null;
    border: ComposeBorderStroke | null;
    horizontalArrangement: ComposeHorizontalArrangement;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    leadingIcon?: never;
    shapes?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    label: ReactNode;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    shape: ComposeShape;
    border: ComposeBorderStroke | null;
    horizontalArrangement: ComposeHorizontalArrangement;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    avatar?: never;
    colors?: never;
    elevation?: never;
    shapes?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    label: ReactNode;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    shape: ComposeShape;
    colors: ComposeSelectableChipColorsValue;
    elevation: ComposeSelectableChipElevationValue | null;
    border: ComposeBorderStroke | null;
    horizontalArrangement: ComposeHorizontalArrangement;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    avatar?: never;
    shapes?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    label: ReactNode;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingIcon: ReactNode;
    avatar: ReactNode;
    shape: ComposeShape;
    border: ComposeBorderStroke | null;
    horizontalArrangement: ComposeHorizontalArrangement;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    trailingIcon?: never;
    colors?: never;
    elevation?: never;
    shapes?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    label: ReactNode;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingIcon: ReactNode;
    avatar: ReactNode;
    shape: ComposeShape;
    colors: ComposeSelectableChipColorsValue;
    elevation: ComposeSelectableChipElevationValue | null;
    border: ComposeBorderStroke | null;
    horizontalArrangement: ComposeHorizontalArrangement;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    trailingIcon?: never;
    shapes?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    label: ReactNode;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingIcon: ReactNode;
    avatar: ReactNode;
    trailingIcon: ReactNode;
    border: ComposeBorderStroke | null;
    horizontalArrangement: ComposeHorizontalArrangement;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    shape?: never;
    colors?: never;
    elevation?: never;
    shapes?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    label: ReactNode;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingIcon: ReactNode;
    avatar: ReactNode;
    trailingIcon: ReactNode;
    colors: ComposeSelectableChipColorsValue;
    elevation: ComposeSelectableChipElevationValue | null;
    border: ComposeBorderStroke | null;
    horizontalArrangement: ComposeHorizontalArrangement;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    shape?: never;
    shapes?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    label: ReactNode;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingIcon: ReactNode;
    avatar: ReactNode;
    trailingIcon: ReactNode;
    shape: ComposeShape;
    border: ComposeBorderStroke | null;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    colors?: never;
    elevation?: never;
    horizontalArrangement?: never;
    shapes?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    label: ReactNode;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingIcon: ReactNode;
    avatar: ReactNode;
    trailingIcon: ReactNode;
    shape: ComposeShape;
    border: ComposeBorderStroke | null;
    horizontalArrangement: ComposeHorizontalArrangement;
    interactionSource: ComposeInteractionSource | null;
    colors?: never;
    elevation?: never;
    contentPadding?: never;
    shapes?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    label: ReactNode;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingIcon: ReactNode;
    avatar: ReactNode;
    trailingIcon: ReactNode;
    shape: ComposeShape;
    border: ComposeBorderStroke | null;
    horizontalArrangement: ComposeHorizontalArrangement;
    contentPadding: ComposePaddingValues;
    interactionSource?: ComposeInteractionSource | null;
    colors?: never;
    elevation?: never;
    shapes?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    label: ReactNode;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingIcon: ReactNode;
    avatar: ReactNode;
    trailingIcon: ReactNode;
    shape: ComposeShape;
    elevation: ComposeSelectableChipElevationValue | null;
    border: ComposeBorderStroke | null;
    horizontalArrangement: ComposeHorizontalArrangement;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    colors?: never;
    shapes?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    label: ReactNode;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingIcon: ReactNode;
    avatar: ReactNode;
    trailingIcon: ReactNode;
    shape: ComposeShape;
    colors: ComposeSelectableChipColorsValue;
    border: ComposeBorderStroke | null;
    horizontalArrangement: ComposeHorizontalArrangement;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    elevation?: never;
    shapes?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    label: ReactNode;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingIcon: ReactNode;
    avatar: ReactNode;
    trailingIcon: ReactNode;
    shape: ComposeShape;
    colors: ComposeSelectableChipColorsValue;
    elevation: ComposeSelectableChipElevationValue | null;
    horizontalArrangement: ComposeHorizontalArrangement;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    border?: never;
    shapes?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    label: ReactNode;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingIcon: ReactNode;
    avatar: ReactNode;
    trailingIcon: ReactNode;
    shape: ComposeShape;
    colors: ComposeSelectableChipColorsValue;
    elevation: ComposeSelectableChipElevationValue | null;
    border: ComposeBorderStroke | null;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    horizontalArrangement?: never;
    shapes?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    label: ReactNode;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingIcon: ReactNode;
    avatar: ReactNode;
    trailingIcon: ReactNode;
    shape: ComposeShape;
    colors: ComposeSelectableChipColorsValue;
    elevation: ComposeSelectableChipElevationValue | null;
    border: ComposeBorderStroke | null;
    horizontalArrangement: ComposeHorizontalArrangement;
    interactionSource: ComposeInteractionSource | null;
    contentPadding?: never;
    shapes?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    label: ReactNode;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingIcon: ReactNode;
    avatar: ReactNode;
    trailingIcon: ReactNode;
    shape: ComposeShape;
    colors: ComposeSelectableChipColorsValue;
    elevation: ComposeSelectableChipElevationValue | null;
    border: ComposeBorderStroke | null;
    horizontalArrangement: ComposeHorizontalArrangement;
    contentPadding: ComposePaddingValues;
    interactionSource?: ComposeInteractionSource | null;
    shapes?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    label: ReactNode;
    shapes: ComposeChipShapesValue;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    leadingIcon?: ReactNode;
    avatar?: ReactNode;
    trailingIcon?: ReactNode;
    horizontalArrangement?: ComposeHorizontalArrangement;
    contentPadding?: ComposePaddingValues;
    interactionSource?: ComposeInteractionSource | null;
    shape?: never;
    colors?: never;
    elevation?: never;
    border?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    label: ReactNode;
    shapes: ComposeChipShapesValue;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    leadingIcon?: ReactNode;
    avatar?: ReactNode;
    trailingIcon?: ReactNode;
    border: ComposeBorderStroke | null;
    shape?: never;
    colors?: never;
    elevation?: never;
    horizontalArrangement?: never;
    contentPadding?: never;
    interactionSource?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    label: ReactNode;
    shapes: ComposeChipShapesValue;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    leadingIcon?: ReactNode;
    avatar?: ReactNode;
    trailingIcon?: ReactNode;
    elevation: ComposeSelectableChipElevationValue | null;
    border?: ComposeBorderStroke | null;
    shape?: never;
    colors?: never;
    horizontalArrangement?: never;
    contentPadding?: never;
    interactionSource?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    label: ReactNode;
    shapes: ComposeChipShapesValue;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    leadingIcon?: ReactNode;
    avatar?: ReactNode;
    trailingIcon?: ReactNode;
    colors: ComposeSelectableChipColorsValue;
    border?: ComposeBorderStroke | null;
    shape?: never;
    elevation?: never;
    horizontalArrangement?: never;
    contentPadding?: never;
    interactionSource?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    label: ReactNode;
    shapes: ComposeChipShapesValue;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    colors: ComposeSelectableChipColorsValue;
    elevation: ComposeSelectableChipElevationValue | null;
    enabled?: never;
    leadingIcon?: never;
    avatar?: never;
    trailingIcon?: never;
    shape?: never;
    border?: never;
    horizontalArrangement?: never;
    contentPadding?: never;
    interactionSource?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    label: ReactNode;
    shapes: ComposeChipShapesValue;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    leadingIcon: ReactNode;
    avatar: ReactNode;
    trailingIcon: ReactNode;
    border: ComposeBorderStroke | null;
    horizontalArrangement: ComposeHorizontalArrangement;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    enabled?: never;
    shape?: never;
    colors?: never;
    elevation?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    label: ReactNode;
    shapes: ComposeChipShapesValue;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    leadingIcon: ReactNode;
    avatar: ReactNode;
    trailingIcon: ReactNode;
    colors: ComposeSelectableChipColorsValue;
    elevation: ComposeSelectableChipElevationValue | null;
    border: ComposeBorderStroke | null;
    horizontalArrangement: ComposeHorizontalArrangement;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    enabled?: never;
    shape?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    label: ReactNode;
    shapes: ComposeChipShapesValue;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    avatar: ReactNode;
    trailingIcon: ReactNode;
    border: ComposeBorderStroke | null;
    horizontalArrangement: ComposeHorizontalArrangement;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    leadingIcon?: never;
    shape?: never;
    colors?: never;
    elevation?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    label: ReactNode;
    shapes: ComposeChipShapesValue;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    avatar: ReactNode;
    trailingIcon: ReactNode;
    colors: ComposeSelectableChipColorsValue;
    elevation: ComposeSelectableChipElevationValue | null;
    border: ComposeBorderStroke | null;
    horizontalArrangement: ComposeHorizontalArrangement;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    leadingIcon?: never;
    shape?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    label: ReactNode;
    shapes: ComposeChipShapesValue;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    border: ComposeBorderStroke | null;
    horizontalArrangement: ComposeHorizontalArrangement;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    avatar?: never;
    shape?: never;
    colors?: never;
    elevation?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    label: ReactNode;
    shapes: ComposeChipShapesValue;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    colors: ComposeSelectableChipColorsValue;
    elevation: ComposeSelectableChipElevationValue | null;
    border: ComposeBorderStroke | null;
    horizontalArrangement: ComposeHorizontalArrangement;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    avatar?: never;
    shape?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    label: ReactNode;
    shapes: ComposeChipShapesValue;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingIcon: ReactNode;
    avatar: ReactNode;
    border: ComposeBorderStroke | null;
    horizontalArrangement: ComposeHorizontalArrangement;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    trailingIcon?: never;
    shape?: never;
    colors?: never;
    elevation?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    label: ReactNode;
    shapes: ComposeChipShapesValue;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingIcon: ReactNode;
    avatar: ReactNode;
    colors: ComposeSelectableChipColorsValue;
    elevation: ComposeSelectableChipElevationValue | null;
    border: ComposeBorderStroke | null;
    horizontalArrangement: ComposeHorizontalArrangement;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    trailingIcon?: never;
    shape?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    label: ReactNode;
    shapes: ComposeChipShapesValue;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingIcon: ReactNode;
    avatar: ReactNode;
    trailingIcon: ReactNode;
    border: ComposeBorderStroke | null;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    shape?: never;
    colors?: never;
    elevation?: never;
    horizontalArrangement?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    label: ReactNode;
    shapes: ComposeChipShapesValue;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingIcon: ReactNode;
    avatar: ReactNode;
    trailingIcon: ReactNode;
    border: ComposeBorderStroke | null;
    horizontalArrangement: ComposeHorizontalArrangement;
    interactionSource: ComposeInteractionSource | null;
    shape?: never;
    colors?: never;
    elevation?: never;
    contentPadding?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    label: ReactNode;
    shapes: ComposeChipShapesValue;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingIcon: ReactNode;
    avatar: ReactNode;
    trailingIcon: ReactNode;
    border: ComposeBorderStroke | null;
    horizontalArrangement: ComposeHorizontalArrangement;
    contentPadding: ComposePaddingValues;
    interactionSource?: ComposeInteractionSource | null;
    shape?: never;
    colors?: never;
    elevation?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    label: ReactNode;
    shapes: ComposeChipShapesValue;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingIcon: ReactNode;
    avatar: ReactNode;
    trailingIcon: ReactNode;
    elevation: ComposeSelectableChipElevationValue | null;
    border: ComposeBorderStroke | null;
    horizontalArrangement: ComposeHorizontalArrangement;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    shape?: never;
    colors?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    label: ReactNode;
    shapes: ComposeChipShapesValue;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingIcon: ReactNode;
    avatar: ReactNode;
    trailingIcon: ReactNode;
    colors: ComposeSelectableChipColorsValue;
    border: ComposeBorderStroke | null;
    horizontalArrangement: ComposeHorizontalArrangement;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    shape?: never;
    elevation?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    label: ReactNode;
    shapes: ComposeChipShapesValue;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingIcon: ReactNode;
    avatar: ReactNode;
    trailingIcon: ReactNode;
    colors: ComposeSelectableChipColorsValue;
    elevation: ComposeSelectableChipElevationValue | null;
    horizontalArrangement: ComposeHorizontalArrangement;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    shape?: never;
    border?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    label: ReactNode;
    shapes: ComposeChipShapesValue;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingIcon: ReactNode;
    avatar: ReactNode;
    trailingIcon: ReactNode;
    colors: ComposeSelectableChipColorsValue;
    elevation: ComposeSelectableChipElevationValue | null;
    border: ComposeBorderStroke | null;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    shape?: never;
    horizontalArrangement?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    label: ReactNode;
    shapes: ComposeChipShapesValue;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingIcon: ReactNode;
    avatar: ReactNode;
    trailingIcon: ReactNode;
    colors: ComposeSelectableChipColorsValue;
    elevation: ComposeSelectableChipElevationValue | null;
    border: ComposeBorderStroke | null;
    horizontalArrangement: ComposeHorizontalArrangement;
    interactionSource: ComposeInteractionSource | null;
    shape?: never;
    contentPadding?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    label: ReactNode;
    shapes: ComposeChipShapesValue;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingIcon: ReactNode;
    avatar: ReactNode;
    trailingIcon: ReactNode;
    colors: ComposeSelectableChipColorsValue;
    elevation: ComposeSelectableChipElevationValue | null;
    border: ComposeBorderStroke | null;
    horizontalArrangement: ComposeHorizontalArrangement;
    contentPadding: ComposePaddingValues;
    interactionSource?: ComposeInteractionSource | null;
    shape?: never;
    }
;
export const InputChip = createComposableComponent<InputChipProps>({
  name: "InputChip",
  props: ["selected","modifier","enabled","shape","colors","elevation","border","horizontalArrangement","contentPadding","interactionSource","shapes"],
  objectProps: ["shape","colors","elevation","border","contentPadding","interactionSource","shapes"],
  slots: ["label","leadingIcon","avatar","trailingIcon"],
  events: ["onClick"],
  children: false,
  overloads: [
    { id: "InputChip", children: false, parameters: [["selected","boolean",false,false],["onClick","function",false,false],["label","ReactNode",false,false],["modifier","ComposeModifier",true,false],["enabled","boolean",true,false],["leadingIcon","ReactNode",true,true],["avatar","ReactNode",true,true],["trailingIcon","ReactNode",true,true],["shape","shape",true,false],["colors","object",true,false],["elevation","object",true,true],["border","object",true,true],["horizontalArrangement","string",true,false],["contentPadding","object",true,false],["interactionSource","object",true,true]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,128,129,130,131,132,133,134,135,136,137,138,139,140,141,142,143,144,145,146,147,148,149,150,151,152,153,154,155,156,157,158,159,192,193,194,195,196,197,198,199,200,201,202,203,204,205,206,207,208,209,210,211,212,213,214,215,216,217,218,219,220,221,222,223,256,257,258,259,260,261,262,263,264,265,266,267,268,269,270,271,272,273,274,275,276,277,278,279,280,281,282,283,284,285,286,287,512,513,514,515,516,517,518,519,520,521,522,523,524,525,526,527,528,529,530,531,532,533,534,535,536,537,538,539,540,541,542,543,768,769,770,771,772,773,774,775,776,777,778,779,780,781,782,783,784,785,786,787,788,789,790,791,792,793,794,795,796,797,798,799,927,1023,1024,1025,1026,1027,1028,1029,1030,1031,1032,1033,1034,1035,1036,1037,1038,1039,1040,1041,1042,1043,1044,1045,1046,1047,1048,1049,1050,1051,1052,1053,1054,1055,1088,1089,1090,1091,1092,1093,1094,1095,1096,1097,1098,1099,1100,1101,1102,1103,1104,1105,1106,1107,1108,1109,1110,1111,1112,1113,1114,1115,1116,1117,1118,1119,1152,1153,1154,1155,1156,1157,1158,1159,1160,1161,1162,1163,1164,1165,1166,1167,1168,1169,1170,1171,1172,1173,1174,1175,1176,1177,1178,1179,1180,1181,1182,1183,1216,1217,1218,1219,1220,1221,1222,1223,1224,1225,1226,1227,1228,1229,1230,1231,1232,1233,1234,1235,1236,1237,1238,1239,1240,1241,1242,1243,1244,1245,1246,1247,1280,1281,1282,1283,1284,1285,1286,1287,1288,1289,1290,1291,1292,1293,1294,1295,1296,1297,1298,1299,1300,1301,1302,1303,1304,1305,1306,1307,1308,1309,1310,1311,1439,1535,1536,1537,1538,1539,1540,1541,1542,1543,1544,1545,1546,1547,1548,1549,1550,1551,1552,1553,1554,1555,1556,1557,1558,1559,1560,1561,1562,1563,1564,1565,1566,1567,1695,1791,1792,1793,1794,1795,1796,1797,1798,1799,1800,1801,1802,1803,1804,1805,1806,1807,1808,1809,1810,1811,1812,1813,1814,1815,1816,1817,1818,1819,1820,1821,1822,1823,1919,1935,1943,1947,1949,1950,1951,1983,2015,2031,2039,2043,2045,2046,2047] },
    { id: "InputChip#1", children: false, parameters: [["selected","boolean",false,false],["onClick","function",false,false],["label","ReactNode",false,false],["shapes","object",false,false],["modifier","ComposeModifier",true,false],["enabled","boolean",true,false],["leadingIcon","ReactNode",true,true],["avatar","ReactNode",true,true],["trailingIcon","ReactNode",true,true],["colors","object",true,false],["elevation","object",true,true],["border","object",true,true],["horizontalArrangement","string",true,false],["contentPadding","object",true,false],["interactionSource","object",true,true]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,128,129,130,131,132,133,134,135,136,137,138,139,140,141,142,143,256,257,258,259,260,261,262,263,264,265,266,267,268,269,270,271,384,385,386,387,388,389,390,391,392,393,394,395,396,397,398,399,463,511,512,513,514,515,516,517,518,519,520,521,522,523,524,525,526,527,640,641,642,643,644,645,646,647,648,649,650,651,652,653,654,655,719,767,768,769,770,771,772,773,774,775,776,777,778,779,780,781,782,783,847,895,896,897,898,899,900,901,902,903,904,905,906,907,908,909,910,911,959,967,971,973,974,975,991,1007,1015,1019,1021,1022,1023] },
  ],
});
