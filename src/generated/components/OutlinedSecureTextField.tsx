// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeShape } from "../../utils/modifier";
import type { ComposeInputTransformation, ComposeKeyboardOptions, ComposePaddingValues, ComposeTextFieldState, ComposeTextLayout, ComposeTextStyle } from "../../utils/composeValues";
import type { ComposeTextFieldColorsValue, ComposeTextFieldLabelPositionValue } from "../values/records";
import type { ComposeInteractionSource } from "../../utils/nativeHandles";
import type { ComposeTextObfuscationModeValue } from "../values/enums";

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
    labelPosition?: never;
    label?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    inputTransformation?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    onTextLayout?: never;
    shape?: never;
    colors?: never;
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
    labelPosition?: never;
    label?: never;
    prefix?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    inputTransformation?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    onTextLayout?: never;
    shape?: never;
    colors?: never;
    interactionSource?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    textStyle?: ComposeTextStyle;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    trailingIcon?: ReactNode;
    colors: ComposeTextFieldColorsValue;
    labelPosition?: never;
    label?: never;
    prefix?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    inputTransformation?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    onTextLayout?: never;
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
    shape: ComposeShape;
    textStyle?: never;
    labelPosition?: never;
    label?: never;
    prefix?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    inputTransformation?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    onTextLayout?: never;
    colors?: never;
    contentPadding?: never;
    interactionSource?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    textStyle?: ComposeTextStyle;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    trailingIcon?: ReactNode;
    onTextLayout: ((value: ComposeTextLayout) => void) | null;
    labelPosition?: never;
    label?: never;
    prefix?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    inputTransformation?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    shape?: never;
    colors?: never;
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
    onKeyboardAction: (() => void) | null;
    textStyle?: never;
    labelPosition?: never;
    label?: never;
    prefix?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    inputTransformation?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
    keyboardOptions?: never;
    onTextLayout?: never;
    shape?: never;
    colors?: never;
    contentPadding?: never;
    interactionSource?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    keyboardOptions: ComposeKeyboardOptions;
    onKeyboardAction?: (() => void) | null;
    enabled?: never;
    textStyle?: never;
    labelPosition?: never;
    label?: never;
    placeholder?: never;
    leadingIcon?: never;
    trailingIcon?: never;
    prefix?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    inputTransformation?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
    onTextLayout?: never;
    shape?: never;
    colors?: never;
    contentPadding?: never;
    interactionSource?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    textObfuscationCharacter: string;
    colors?: ComposeTextFieldColorsValue;
    enabled?: never;
    textStyle?: never;
    labelPosition?: never;
    label?: never;
    placeholder?: never;
    leadingIcon?: never;
    trailingIcon?: never;
    prefix?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    inputTransformation?: never;
    textObfuscationMode?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    onTextLayout?: never;
    shape?: never;
    contentPadding?: never;
    interactionSource?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    textObfuscationMode: ComposeTextObfuscationModeValue;
    colors?: ComposeTextFieldColorsValue;
    enabled?: never;
    textStyle?: never;
    labelPosition?: never;
    label?: never;
    placeholder?: never;
    leadingIcon?: never;
    trailingIcon?: never;
    prefix?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    inputTransformation?: never;
    textObfuscationCharacter?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    onTextLayout?: never;
    shape?: never;
    contentPadding?: never;
    interactionSource?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    textObfuscationMode: ComposeTextObfuscationModeValue;
    textObfuscationCharacter: string;
    enabled?: never;
    textStyle?: never;
    labelPosition?: never;
    label?: never;
    placeholder?: never;
    leadingIcon?: never;
    trailingIcon?: never;
    prefix?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    inputTransformation?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    onTextLayout?: never;
    shape?: never;
    colors?: never;
    contentPadding?: never;
    interactionSource?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    textStyle?: ComposeTextStyle;
    inputTransformation: ComposeInputTransformation | null;
    keyboardOptions?: ComposeKeyboardOptions;
    onKeyboardAction?: (() => void) | null;
    labelPosition?: never;
    label?: never;
    placeholder?: never;
    leadingIcon?: never;
    trailingIcon?: never;
    prefix?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
    onTextLayout?: never;
    shape?: never;
    colors?: never;
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
    labelPosition?: never;
    label?: never;
    prefix?: never;
    suffix?: never;
    supportingText?: never;
    inputTransformation?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    onTextLayout?: never;
    shape?: never;
    colors?: never;
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
    labelPosition?: never;
    label?: never;
    prefix?: never;
    suffix?: never;
    isError?: never;
    inputTransformation?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    onTextLayout?: never;
    shape?: never;
    colors?: never;
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
    labelPosition?: never;
    label?: never;
    prefix?: never;
    supportingText?: never;
    isError?: never;
    inputTransformation?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    onTextLayout?: never;
    shape?: never;
    colors?: never;
    contentPadding?: never;
    interactionSource?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    trailingIcon: ReactNode;
    keyboardOptions: ComposeKeyboardOptions;
    enabled?: never;
    textStyle?: never;
    labelPosition?: never;
    label?: never;
    placeholder?: never;
    leadingIcon?: never;
    prefix?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    inputTransformation?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
    onKeyboardAction?: never;
    onTextLayout?: never;
    shape?: never;
    colors?: never;
    contentPadding?: never;
    interactionSource?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    trailingIcon: ReactNode;
    textObfuscationCharacter: string;
    enabled?: never;
    textStyle?: never;
    labelPosition?: never;
    label?: never;
    placeholder?: never;
    leadingIcon?: never;
    prefix?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    inputTransformation?: never;
    textObfuscationMode?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    onTextLayout?: never;
    shape?: never;
    colors?: never;
    contentPadding?: never;
    interactionSource?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    trailingIcon: ReactNode;
    textObfuscationMode: ComposeTextObfuscationModeValue;
    enabled?: never;
    textStyle?: never;
    labelPosition?: never;
    label?: never;
    placeholder?: never;
    leadingIcon?: never;
    prefix?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    inputTransformation?: never;
    textObfuscationCharacter?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    onTextLayout?: never;
    shape?: never;
    colors?: never;
    contentPadding?: never;
    interactionSource?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    leadingIcon: ReactNode;
    trailingIcon?: ReactNode;
    keyboardOptions: ComposeKeyboardOptions;
    enabled?: never;
    textStyle?: never;
    labelPosition?: never;
    label?: never;
    placeholder?: never;
    prefix?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    inputTransformation?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
    onKeyboardAction?: never;
    onTextLayout?: never;
    shape?: never;
    colors?: never;
    contentPadding?: never;
    interactionSource?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    leadingIcon: ReactNode;
    trailingIcon?: ReactNode;
    textObfuscationCharacter: string;
    enabled?: never;
    textStyle?: never;
    labelPosition?: never;
    label?: never;
    placeholder?: never;
    prefix?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    inputTransformation?: never;
    textObfuscationMode?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    onTextLayout?: never;
    shape?: never;
    colors?: never;
    contentPadding?: never;
    interactionSource?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    leadingIcon: ReactNode;
    trailingIcon?: ReactNode;
    textObfuscationMode: ComposeTextObfuscationModeValue;
    enabled?: never;
    textStyle?: never;
    labelPosition?: never;
    label?: never;
    placeholder?: never;
    prefix?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    inputTransformation?: never;
    textObfuscationCharacter?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    onTextLayout?: never;
    shape?: never;
    colors?: never;
    contentPadding?: never;
    interactionSource?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    placeholder: ReactNode;
    leadingIcon?: ReactNode;
    trailingIcon?: ReactNode;
    keyboardOptions: ComposeKeyboardOptions;
    enabled?: never;
    textStyle?: never;
    labelPosition?: never;
    label?: never;
    prefix?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    inputTransformation?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
    onKeyboardAction?: never;
    onTextLayout?: never;
    shape?: never;
    colors?: never;
    contentPadding?: never;
    interactionSource?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    placeholder: ReactNode;
    leadingIcon?: ReactNode;
    trailingIcon?: ReactNode;
    textObfuscationCharacter: string;
    enabled?: never;
    textStyle?: never;
    labelPosition?: never;
    label?: never;
    prefix?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    inputTransformation?: never;
    textObfuscationMode?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    onTextLayout?: never;
    shape?: never;
    colors?: never;
    contentPadding?: never;
    interactionSource?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    placeholder: ReactNode;
    leadingIcon?: ReactNode;
    trailingIcon?: ReactNode;
    textObfuscationMode: ComposeTextObfuscationModeValue;
    enabled?: never;
    textStyle?: never;
    labelPosition?: never;
    label?: never;
    prefix?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    inputTransformation?: never;
    textObfuscationCharacter?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    onTextLayout?: never;
    shape?: never;
    colors?: never;
    contentPadding?: never;
    interactionSource?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    label: ReactNode;
    colors?: ComposeTextFieldColorsValue;
    enabled?: never;
    textStyle?: never;
    labelPosition?: never;
    placeholder?: never;
    leadingIcon?: never;
    trailingIcon?: never;
    prefix?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    inputTransformation?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    onTextLayout?: never;
    shape?: never;
    contentPadding?: never;
    interactionSource?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    label: ReactNode;
    textObfuscationCharacter: string;
    enabled?: never;
    textStyle?: never;
    labelPosition?: never;
    placeholder?: never;
    leadingIcon?: never;
    trailingIcon?: never;
    prefix?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    inputTransformation?: never;
    textObfuscationMode?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    onTextLayout?: never;
    shape?: never;
    colors?: never;
    contentPadding?: never;
    interactionSource?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    label: ReactNode;
    textObfuscationMode: ComposeTextObfuscationModeValue;
    enabled?: never;
    textStyle?: never;
    labelPosition?: never;
    placeholder?: never;
    leadingIcon?: never;
    trailingIcon?: never;
    prefix?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    inputTransformation?: never;
    textObfuscationCharacter?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    onTextLayout?: never;
    shape?: never;
    colors?: never;
    contentPadding?: never;
    interactionSource?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    label: ReactNode;
    trailingIcon: ReactNode;
    enabled?: never;
    textStyle?: never;
    labelPosition?: never;
    placeholder?: never;
    leadingIcon?: never;
    prefix?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    inputTransformation?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    onTextLayout?: never;
    shape?: never;
    colors?: never;
    contentPadding?: never;
    interactionSource?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    label: ReactNode;
    leadingIcon: ReactNode;
    trailingIcon?: ReactNode;
    enabled?: never;
    textStyle?: never;
    labelPosition?: never;
    placeholder?: never;
    prefix?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    inputTransformation?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    onTextLayout?: never;
    shape?: never;
    colors?: never;
    contentPadding?: never;
    interactionSource?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    label: ReactNode;
    placeholder: ReactNode;
    leadingIcon?: ReactNode;
    trailingIcon?: ReactNode;
    enabled?: never;
    textStyle?: never;
    labelPosition?: never;
    prefix?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    inputTransformation?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    onTextLayout?: never;
    shape?: never;
    colors?: never;
    contentPadding?: never;
    interactionSource?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    labelPosition: ComposeTextFieldLabelPositionValue;
    colors?: ComposeTextFieldColorsValue;
    enabled?: never;
    textStyle?: never;
    label?: never;
    placeholder?: never;
    leadingIcon?: never;
    trailingIcon?: never;
    prefix?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    inputTransformation?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    onTextLayout?: never;
    shape?: never;
    contentPadding?: never;
    interactionSource?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    labelPosition: ComposeTextFieldLabelPositionValue;
    textObfuscationCharacter: string;
    enabled?: never;
    textStyle?: never;
    label?: never;
    placeholder?: never;
    leadingIcon?: never;
    trailingIcon?: never;
    prefix?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    inputTransformation?: never;
    textObfuscationMode?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    onTextLayout?: never;
    shape?: never;
    colors?: never;
    contentPadding?: never;
    interactionSource?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    labelPosition: ComposeTextFieldLabelPositionValue;
    textObfuscationMode: ComposeTextObfuscationModeValue;
    enabled?: never;
    textStyle?: never;
    label?: never;
    placeholder?: never;
    leadingIcon?: never;
    trailingIcon?: never;
    prefix?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    inputTransformation?: never;
    textObfuscationCharacter?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    onTextLayout?: never;
    shape?: never;
    colors?: never;
    contentPadding?: never;
    interactionSource?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    labelPosition: ComposeTextFieldLabelPositionValue;
    trailingIcon: ReactNode;
    enabled?: never;
    textStyle?: never;
    label?: never;
    placeholder?: never;
    leadingIcon?: never;
    prefix?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    inputTransformation?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    onTextLayout?: never;
    shape?: never;
    colors?: never;
    contentPadding?: never;
    interactionSource?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    labelPosition: ComposeTextFieldLabelPositionValue;
    leadingIcon: ReactNode;
    trailingIcon?: ReactNode;
    enabled?: never;
    textStyle?: never;
    label?: never;
    placeholder?: never;
    prefix?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    inputTransformation?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    onTextLayout?: never;
    shape?: never;
    colors?: never;
    contentPadding?: never;
    interactionSource?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    labelPosition: ComposeTextFieldLabelPositionValue;
    placeholder: ReactNode;
    leadingIcon?: ReactNode;
    trailingIcon?: ReactNode;
    enabled?: never;
    textStyle?: never;
    label?: never;
    prefix?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    inputTransformation?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    onTextLayout?: never;
    shape?: never;
    colors?: never;
    contentPadding?: never;
    interactionSource?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    labelPosition: ComposeTextFieldLabelPositionValue;
    label: ReactNode;
    enabled?: never;
    textStyle?: never;
    placeholder?: never;
    leadingIcon?: never;
    trailingIcon?: never;
    prefix?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    inputTransformation?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    onTextLayout?: never;
    shape?: never;
    colors?: never;
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
    labelPosition?: never;
    label?: never;
    prefix?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    inputTransformation?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    onTextLayout?: never;
    shape?: never;
    colors?: never;
    contentPadding?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    textStyle: ComposeTextStyle;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    trailingIcon?: ReactNode;
    textObfuscationCharacter: string;
    enabled?: never;
    labelPosition?: never;
    label?: never;
    prefix?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    inputTransformation?: never;
    textObfuscationMode?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    onTextLayout?: never;
    shape?: never;
    colors?: never;
    contentPadding?: never;
    interactionSource?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    textStyle: ComposeTextStyle;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    trailingIcon?: ReactNode;
    textObfuscationMode: ComposeTextObfuscationModeValue;
    enabled?: never;
    labelPosition?: never;
    label?: never;
    prefix?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    inputTransformation?: never;
    textObfuscationCharacter?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    onTextLayout?: never;
    shape?: never;
    colors?: never;
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
    prefix: ReactNode;
    interactionSource: ComposeInteractionSource | null;
    labelPosition?: never;
    label?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    inputTransformation?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    onTextLayout?: never;
    shape?: never;
    colors?: never;
    contentPadding?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
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
    interactionSource: ComposeInteractionSource | null;
    enabled?: never;
    labelPosition?: never;
    label?: never;
    inputTransformation?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    onTextLayout?: never;
    colors?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    textStyle: ComposeTextStyle;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    supportingText: ReactNode;
    isError: boolean;
    inputTransformation?: ComposeInputTransformation | null;
    keyboardOptions: ComposeKeyboardOptions;
    onKeyboardAction: (() => void) | null;
    shape: ComposeShape;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    enabled?: never;
    labelPosition?: never;
    label?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
    onTextLayout?: never;
    colors?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    textStyle: ComposeTextStyle;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    supportingText: ReactNode;
    isError: boolean;
    inputTransformation: ComposeInputTransformation | null;
    textObfuscationMode: ComposeTextObfuscationModeValue;
    textObfuscationCharacter: string;
    keyboardOptions: ComposeKeyboardOptions;
    onKeyboardAction: (() => void) | null;
    onTextLayout?: ((value: ComposeTextLayout) => void) | null;
    shape: ComposeShape;
    colors: ComposeTextFieldColorsValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    enabled?: never;
    labelPosition?: never;
    label?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    textStyle: ComposeTextStyle;
    label: ReactNode;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    trailingIcon?: ReactNode;
    enabled?: never;
    labelPosition?: never;
    prefix?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    inputTransformation?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    onTextLayout?: never;
    shape?: never;
    colors?: never;
    contentPadding?: never;
    interactionSource?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    textStyle: ComposeTextStyle;
    labelPosition: ComposeTextFieldLabelPositionValue;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    trailingIcon?: ReactNode;
    enabled?: never;
    label?: never;
    prefix?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    inputTransformation?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    onTextLayout?: never;
    shape?: never;
    colors?: never;
    contentPadding?: never;
    interactionSource?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    textStyle: ComposeTextStyle;
    labelPosition: ComposeTextFieldLabelPositionValue;
    label: ReactNode;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    supportingText: ReactNode;
    isError: boolean;
    inputTransformation: ComposeInputTransformation | null;
    textObfuscationMode: ComposeTextObfuscationModeValue;
    textObfuscationCharacter: string;
    keyboardOptions: ComposeKeyboardOptions;
    onKeyboardAction: (() => void) | null;
    onTextLayout?: ((value: ComposeTextLayout) => void) | null;
    shape: ComposeShape;
    colors: ComposeTextFieldColorsValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    enabled?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    trailingIcon?: ReactNode;
    keyboardOptions: ComposeKeyboardOptions;
    textStyle?: never;
    labelPosition?: never;
    label?: never;
    prefix?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    inputTransformation?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
    onKeyboardAction?: never;
    onTextLayout?: never;
    shape?: never;
    colors?: never;
    contentPadding?: never;
    interactionSource?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    textStyle?: ComposeTextStyle;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    trailingIcon?: ReactNode;
    textObfuscationCharacter: string;
    labelPosition?: never;
    label?: never;
    prefix?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    inputTransformation?: never;
    textObfuscationMode?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    onTextLayout?: never;
    shape?: never;
    colors?: never;
    contentPadding?: never;
    interactionSource?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    textStyle?: ComposeTextStyle;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    trailingIcon?: ReactNode;
    textObfuscationMode: ComposeTextObfuscationModeValue;
    labelPosition?: never;
    label?: never;
    prefix?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    inputTransformation?: never;
    textObfuscationCharacter?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    onTextLayout?: never;
    shape?: never;
    colors?: never;
    contentPadding?: never;
    interactionSource?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    supportingText: ReactNode;
    isError: boolean;
    shape: ComposeShape;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    textStyle?: never;
    labelPosition?: never;
    label?: never;
    inputTransformation?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    onTextLayout?: never;
    colors?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    supportingText: ReactNode;
    isError: boolean;
    inputTransformation?: ComposeInputTransformation | null;
    keyboardOptions: ComposeKeyboardOptions;
    onKeyboardAction: (() => void) | null;
    shape: ComposeShape;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    textStyle?: never;
    labelPosition?: never;
    label?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
    onTextLayout?: never;
    colors?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    supportingText: ReactNode;
    isError: boolean;
    inputTransformation: ComposeInputTransformation | null;
    textObfuscationMode: ComposeTextObfuscationModeValue;
    textObfuscationCharacter: string;
    keyboardOptions: ComposeKeyboardOptions;
    onKeyboardAction: (() => void) | null;
    onTextLayout?: ((value: ComposeTextLayout) => void) | null;
    shape: ComposeShape;
    colors: ComposeTextFieldColorsValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    textStyle?: never;
    labelPosition?: never;
    label?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    textStyle?: ComposeTextStyle;
    label: ReactNode;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    trailingIcon?: ReactNode;
    labelPosition?: never;
    prefix?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    inputTransformation?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    onTextLayout?: never;
    shape?: never;
    colors?: never;
    contentPadding?: never;
    interactionSource?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    textStyle?: ComposeTextStyle;
    labelPosition: ComposeTextFieldLabelPositionValue;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    trailingIcon?: ReactNode;
    label?: never;
    prefix?: never;
    suffix?: never;
    supportingText?: never;
    isError?: never;
    inputTransformation?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    onTextLayout?: never;
    shape?: never;
    colors?: never;
    contentPadding?: never;
    interactionSource?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    labelPosition: ComposeTextFieldLabelPositionValue;
    label: ReactNode;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    supportingText: ReactNode;
    isError: boolean;
    inputTransformation: ComposeInputTransformation | null;
    textObfuscationMode: ComposeTextObfuscationModeValue;
    textObfuscationCharacter: string;
    keyboardOptions: ComposeKeyboardOptions;
    onKeyboardAction: (() => void) | null;
    onTextLayout?: ((value: ComposeTextLayout) => void) | null;
    shape: ComposeShape;
    colors: ComposeTextFieldColorsValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    textStyle?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    textStyle: ComposeTextStyle;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    supportingText: ReactNode;
    isError: boolean;
    shape: ComposeShape;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    labelPosition?: never;
    label?: never;
    placeholder?: never;
    inputTransformation?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    onTextLayout?: never;
    colors?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    textStyle: ComposeTextStyle;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    supportingText: ReactNode;
    isError: boolean;
    inputTransformation?: ComposeInputTransformation | null;
    keyboardOptions: ComposeKeyboardOptions;
    onKeyboardAction: (() => void) | null;
    shape: ComposeShape;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    labelPosition?: never;
    label?: never;
    placeholder?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
    onTextLayout?: never;
    colors?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    textStyle: ComposeTextStyle;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    supportingText: ReactNode;
    isError: boolean;
    inputTransformation: ComposeInputTransformation | null;
    textObfuscationMode: ComposeTextObfuscationModeValue;
    textObfuscationCharacter: string;
    keyboardOptions: ComposeKeyboardOptions;
    onKeyboardAction: (() => void) | null;
    onTextLayout?: ((value: ComposeTextLayout) => void) | null;
    shape: ComposeShape;
    colors: ComposeTextFieldColorsValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    labelPosition?: never;
    label?: never;
    placeholder?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    textStyle: ComposeTextStyle;
    placeholder: ReactNode;
    trailingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    supportingText: ReactNode;
    isError: boolean;
    shape: ComposeShape;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    labelPosition?: never;
    label?: never;
    leadingIcon?: never;
    inputTransformation?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    onTextLayout?: never;
    colors?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    textStyle: ComposeTextStyle;
    placeholder: ReactNode;
    trailingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    supportingText: ReactNode;
    isError: boolean;
    inputTransformation?: ComposeInputTransformation | null;
    keyboardOptions: ComposeKeyboardOptions;
    onKeyboardAction: (() => void) | null;
    shape: ComposeShape;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    labelPosition?: never;
    label?: never;
    leadingIcon?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
    onTextLayout?: never;
    colors?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    textStyle: ComposeTextStyle;
    placeholder: ReactNode;
    trailingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    supportingText: ReactNode;
    isError: boolean;
    inputTransformation: ComposeInputTransformation | null;
    textObfuscationMode: ComposeTextObfuscationModeValue;
    textObfuscationCharacter: string;
    keyboardOptions: ComposeKeyboardOptions;
    onKeyboardAction: (() => void) | null;
    onTextLayout?: ((value: ComposeTextLayout) => void) | null;
    shape: ComposeShape;
    colors: ComposeTextFieldColorsValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    labelPosition?: never;
    label?: never;
    leadingIcon?: never;
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
    prefix: ReactNode;
    suffix: ReactNode;
    supportingText: ReactNode;
    isError: boolean;
    shape: ComposeShape;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    labelPosition?: never;
    label?: never;
    trailingIcon?: never;
    inputTransformation?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    onTextLayout?: never;
    colors?: never;
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
    prefix: ReactNode;
    suffix: ReactNode;
    supportingText: ReactNode;
    isError: boolean;
    inputTransformation?: ComposeInputTransformation | null;
    keyboardOptions: ComposeKeyboardOptions;
    onKeyboardAction: (() => void) | null;
    shape: ComposeShape;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    labelPosition?: never;
    label?: never;
    trailingIcon?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
    onTextLayout?: never;
    colors?: never;
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
    prefix: ReactNode;
    suffix: ReactNode;
    supportingText: ReactNode;
    isError: boolean;
    inputTransformation: ComposeInputTransformation | null;
    textObfuscationMode: ComposeTextObfuscationModeValue;
    textObfuscationCharacter: string;
    keyboardOptions: ComposeKeyboardOptions;
    onKeyboardAction: (() => void) | null;
    onTextLayout?: ((value: ComposeTextLayout) => void) | null;
    shape: ComposeShape;
    colors: ComposeTextFieldColorsValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    labelPosition?: never;
    label?: never;
    trailingIcon?: never;
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
    suffix: ReactNode;
    supportingText: ReactNode;
    isError: boolean;
    shape: ComposeShape;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    labelPosition?: never;
    label?: never;
    prefix?: never;
    inputTransformation?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    onTextLayout?: never;
    colors?: never;
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
    suffix: ReactNode;
    supportingText: ReactNode;
    isError: boolean;
    inputTransformation?: ComposeInputTransformation | null;
    keyboardOptions: ComposeKeyboardOptions;
    onKeyboardAction: (() => void) | null;
    shape: ComposeShape;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    labelPosition?: never;
    label?: never;
    prefix?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
    onTextLayout?: never;
    colors?: never;
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
    suffix: ReactNode;
    supportingText: ReactNode;
    isError: boolean;
    inputTransformation: ComposeInputTransformation | null;
    textObfuscationMode: ComposeTextObfuscationModeValue;
    textObfuscationCharacter: string;
    keyboardOptions: ComposeKeyboardOptions;
    onKeyboardAction: (() => void) | null;
    onTextLayout?: ((value: ComposeTextLayout) => void) | null;
    shape: ComposeShape;
    colors: ComposeTextFieldColorsValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    labelPosition?: never;
    label?: never;
    prefix?: never;
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
    supportingText: ReactNode;
    isError: boolean;
    shape: ComposeShape;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    labelPosition?: never;
    label?: never;
    suffix?: never;
    inputTransformation?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    onTextLayout?: never;
    colors?: never;
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
    supportingText: ReactNode;
    isError: boolean;
    inputTransformation?: ComposeInputTransformation | null;
    keyboardOptions: ComposeKeyboardOptions;
    onKeyboardAction: (() => void) | null;
    shape: ComposeShape;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    labelPosition?: never;
    label?: never;
    suffix?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
    onTextLayout?: never;
    colors?: never;
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
    supportingText: ReactNode;
    isError: boolean;
    inputTransformation: ComposeInputTransformation | null;
    textObfuscationMode: ComposeTextObfuscationModeValue;
    textObfuscationCharacter: string;
    keyboardOptions: ComposeKeyboardOptions;
    onKeyboardAction: (() => void) | null;
    onTextLayout?: ((value: ComposeTextLayout) => void) | null;
    shape: ComposeShape;
    colors: ComposeTextFieldColorsValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    labelPosition?: never;
    label?: never;
    suffix?: never;
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
    isError: boolean;
    shape: ComposeShape;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    labelPosition?: never;
    label?: never;
    supportingText?: never;
    inputTransformation?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    onTextLayout?: never;
    colors?: never;
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
    isError: boolean;
    inputTransformation?: ComposeInputTransformation | null;
    keyboardOptions: ComposeKeyboardOptions;
    onKeyboardAction: (() => void) | null;
    shape: ComposeShape;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    labelPosition?: never;
    label?: never;
    supportingText?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
    onTextLayout?: never;
    colors?: never;
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
    isError: boolean;
    inputTransformation: ComposeInputTransformation | null;
    textObfuscationMode: ComposeTextObfuscationModeValue;
    textObfuscationCharacter: string;
    keyboardOptions: ComposeKeyboardOptions;
    onKeyboardAction: (() => void) | null;
    onTextLayout?: ((value: ComposeTextLayout) => void) | null;
    shape: ComposeShape;
    colors: ComposeTextFieldColorsValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    labelPosition?: never;
    label?: never;
    supportingText?: never;
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
    shape: ComposeShape;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    labelPosition?: never;
    label?: never;
    isError?: never;
    inputTransformation?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    onTextLayout?: never;
    colors?: never;
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
    inputTransformation?: ComposeInputTransformation | null;
    keyboardOptions: ComposeKeyboardOptions;
    onKeyboardAction: (() => void) | null;
    shape: ComposeShape;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    labelPosition?: never;
    label?: never;
    isError?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
    onTextLayout?: never;
    colors?: never;
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
    inputTransformation: ComposeInputTransformation | null;
    textObfuscationMode: ComposeTextObfuscationModeValue;
    textObfuscationCharacter: string;
    keyboardOptions: ComposeKeyboardOptions;
    onKeyboardAction: (() => void) | null;
    onTextLayout?: ((value: ComposeTextLayout) => void) | null;
    shape: ComposeShape;
    colors: ComposeTextFieldColorsValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    labelPosition?: never;
    label?: never;
    isError?: never;
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
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    labelPosition?: never;
    label?: never;
    inputTransformation?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    onTextLayout?: never;
    shape?: never;
    colors?: never;
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
    interactionSource: ComposeInteractionSource | null;
    labelPosition?: never;
    label?: never;
    inputTransformation?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    onTextLayout?: never;
    colors?: never;
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
    labelPosition?: never;
    label?: never;
    inputTransformation?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    onTextLayout?: never;
    colors?: never;
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
    inputTransformation?: ComposeInputTransformation | null;
    onKeyboardAction: (() => void) | null;
    shape: ComposeShape;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    labelPosition?: never;
    label?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
    keyboardOptions?: never;
    onTextLayout?: never;
    colors?: never;
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
    inputTransformation?: ComposeInputTransformation | null;
    keyboardOptions: ComposeKeyboardOptions;
    shape: ComposeShape;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    labelPosition?: never;
    label?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
    onKeyboardAction?: never;
    onTextLayout?: never;
    colors?: never;
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
    inputTransformation?: ComposeInputTransformation | null;
    keyboardOptions: ComposeKeyboardOptions;
    onKeyboardAction: (() => void) | null;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    labelPosition?: never;
    label?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
    onTextLayout?: never;
    shape?: never;
    colors?: never;
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
    inputTransformation?: ComposeInputTransformation | null;
    keyboardOptions: ComposeKeyboardOptions;
    onKeyboardAction: (() => void) | null;
    shape: ComposeShape;
    interactionSource: ComposeInteractionSource | null;
    labelPosition?: never;
    label?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
    onTextLayout?: never;
    colors?: never;
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
    inputTransformation?: ComposeInputTransformation | null;
    keyboardOptions: ComposeKeyboardOptions;
    onKeyboardAction: (() => void) | null;
    shape: ComposeShape;
    contentPadding: ComposePaddingValues;
    interactionSource?: ComposeInteractionSource | null;
    labelPosition?: never;
    label?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
    onTextLayout?: never;
    colors?: never;
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
    textObfuscationMode: ComposeTextObfuscationModeValue;
    textObfuscationCharacter: string;
    keyboardOptions: ComposeKeyboardOptions;
    onKeyboardAction: (() => void) | null;
    onTextLayout?: ((value: ComposeTextLayout) => void) | null;
    shape: ComposeShape;
    colors: ComposeTextFieldColorsValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    labelPosition?: never;
    label?: never;
    inputTransformation?: never;
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
    inputTransformation: ComposeInputTransformation | null;
    keyboardOptions: ComposeKeyboardOptions;
    onKeyboardAction: (() => void) | null;
    shape: ComposeShape;
    colors: ComposeTextFieldColorsValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    labelPosition?: never;
    label?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
    onTextLayout?: never;
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
    inputTransformation: ComposeInputTransformation | null;
    keyboardOptions: ComposeKeyboardOptions;
    onKeyboardAction: (() => void) | null;
    onTextLayout: ((value: ComposeTextLayout) => void) | null;
    shape: ComposeShape;
    colors?: ComposeTextFieldColorsValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    labelPosition?: never;
    label?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
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
    inputTransformation: ComposeInputTransformation | null;
    textObfuscationCharacter: string;
    keyboardOptions: ComposeKeyboardOptions;
    onKeyboardAction: (() => void) | null;
    onTextLayout?: ((value: ComposeTextLayout) => void) | null;
    shape: ComposeShape;
    colors?: ComposeTextFieldColorsValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    labelPosition?: never;
    label?: never;
    textObfuscationMode?: never;
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
    inputTransformation: ComposeInputTransformation | null;
    textObfuscationMode: ComposeTextObfuscationModeValue;
    keyboardOptions: ComposeKeyboardOptions;
    onKeyboardAction: (() => void) | null;
    onTextLayout?: ((value: ComposeTextLayout) => void) | null;
    shape: ComposeShape;
    colors?: ComposeTextFieldColorsValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    labelPosition?: never;
    label?: never;
    textObfuscationCharacter?: never;
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
    inputTransformation: ComposeInputTransformation | null;
    textObfuscationMode: ComposeTextObfuscationModeValue;
    textObfuscationCharacter: string;
    onKeyboardAction: (() => void) | null;
    onTextLayout?: ((value: ComposeTextLayout) => void) | null;
    shape: ComposeShape;
    colors: ComposeTextFieldColorsValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    labelPosition?: never;
    label?: never;
    keyboardOptions?: never;
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
    inputTransformation: ComposeInputTransformation | null;
    textObfuscationMode: ComposeTextObfuscationModeValue;
    textObfuscationCharacter: string;
    keyboardOptions: ComposeKeyboardOptions;
    onTextLayout?: ((value: ComposeTextLayout) => void) | null;
    shape: ComposeShape;
    colors: ComposeTextFieldColorsValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    labelPosition?: never;
    label?: never;
    onKeyboardAction?: never;
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
    inputTransformation: ComposeInputTransformation | null;
    textObfuscationMode: ComposeTextObfuscationModeValue;
    textObfuscationCharacter: string;
    keyboardOptions: ComposeKeyboardOptions;
    onKeyboardAction: (() => void) | null;
    onTextLayout?: ((value: ComposeTextLayout) => void) | null;
    colors: ComposeTextFieldColorsValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    labelPosition?: never;
    label?: never;
    shape?: never;
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
    inputTransformation: ComposeInputTransformation | null;
    textObfuscationMode: ComposeTextObfuscationModeValue;
    textObfuscationCharacter: string;
    keyboardOptions: ComposeKeyboardOptions;
    onKeyboardAction: (() => void) | null;
    onTextLayout?: ((value: ComposeTextLayout) => void) | null;
    shape: ComposeShape;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    labelPosition?: never;
    label?: never;
    colors?: never;
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
    inputTransformation: ComposeInputTransformation | null;
    textObfuscationMode: ComposeTextObfuscationModeValue;
    textObfuscationCharacter: string;
    keyboardOptions: ComposeKeyboardOptions;
    onKeyboardAction: (() => void) | null;
    onTextLayout?: ((value: ComposeTextLayout) => void) | null;
    shape: ComposeShape;
    colors: ComposeTextFieldColorsValue;
    interactionSource: ComposeInteractionSource | null;
    labelPosition?: never;
    label?: never;
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
    inputTransformation: ComposeInputTransformation | null;
    textObfuscationMode: ComposeTextObfuscationModeValue;
    textObfuscationCharacter: string;
    keyboardOptions: ComposeKeyboardOptions;
    onKeyboardAction: (() => void) | null;
    onTextLayout?: ((value: ComposeTextLayout) => void) | null;
    shape: ComposeShape;
    colors: ComposeTextFieldColorsValue;
    contentPadding: ComposePaddingValues;
    interactionSource?: ComposeInteractionSource | null;
    labelPosition?: never;
    label?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    textStyle: ComposeTextStyle;
    label: ReactNode;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    supportingText: ReactNode;
    isError: boolean;
    inputTransformation: ComposeInputTransformation | null;
    textObfuscationMode?: ComposeTextObfuscationModeValue;
    textObfuscationCharacter?: string;
    keyboardOptions: ComposeKeyboardOptions;
    onKeyboardAction: (() => void) | null;
    shape: ComposeShape;
    colors?: ComposeTextFieldColorsValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    labelPosition?: never;
    onTextLayout?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    textStyle: ComposeTextStyle;
    label: ReactNode;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    supportingText: ReactNode;
    isError: boolean;
    inputTransformation: ComposeInputTransformation | null;
    textObfuscationMode: ComposeTextObfuscationModeValue;
    textObfuscationCharacter: string;
    keyboardOptions: ComposeKeyboardOptions;
    onKeyboardAction: (() => void) | null;
    onTextLayout: ((value: ComposeTextLayout) => void) | null;
    shape: ComposeShape;
    colors: ComposeTextFieldColorsValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    labelPosition?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    textStyle: ComposeTextStyle;
    labelPosition: ComposeTextFieldLabelPositionValue;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    supportingText: ReactNode;
    isError: boolean;
    inputTransformation: ComposeInputTransformation | null;
    textObfuscationMode?: ComposeTextObfuscationModeValue;
    textObfuscationCharacter?: string;
    keyboardOptions: ComposeKeyboardOptions;
    onKeyboardAction: (() => void) | null;
    shape: ComposeShape;
    colors?: ComposeTextFieldColorsValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    label?: never;
    onTextLayout?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    textStyle: ComposeTextStyle;
    labelPosition: ComposeTextFieldLabelPositionValue;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    supportingText: ReactNode;
    isError: boolean;
    inputTransformation: ComposeInputTransformation | null;
    textObfuscationMode: ComposeTextObfuscationModeValue;
    textObfuscationCharacter: string;
    keyboardOptions: ComposeKeyboardOptions;
    onKeyboardAction: (() => void) | null;
    onTextLayout: ((value: ComposeTextLayout) => void) | null;
    shape: ComposeShape;
    colors: ComposeTextFieldColorsValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    label?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    textStyle: ComposeTextStyle;
    labelPosition: ComposeTextFieldLabelPositionValue;
    label: ReactNode;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    supportingText: ReactNode;
    isError: boolean;
    inputTransformation: ComposeInputTransformation | null;
    textObfuscationMode: ComposeTextObfuscationModeValue;
    textObfuscationCharacter: string;
    keyboardOptions: ComposeKeyboardOptions;
    onKeyboardAction: (() => void) | null;
    onTextLayout?: ((value: ComposeTextLayout) => void) | null;
    shape: ComposeShape;
    colors: ComposeTextFieldColorsValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    placeholder?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    textStyle: ComposeTextStyle;
    labelPosition: ComposeTextFieldLabelPositionValue;
    label: ReactNode;
    placeholder: ReactNode;
    trailingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    supportingText: ReactNode;
    isError: boolean;
    inputTransformation: ComposeInputTransformation | null;
    textObfuscationMode: ComposeTextObfuscationModeValue;
    textObfuscationCharacter: string;
    keyboardOptions: ComposeKeyboardOptions;
    onKeyboardAction: (() => void) | null;
    onTextLayout?: ((value: ComposeTextLayout) => void) | null;
    shape: ComposeShape;
    colors: ComposeTextFieldColorsValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    leadingIcon?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    textStyle: ComposeTextStyle;
    labelPosition: ComposeTextFieldLabelPositionValue;
    label: ReactNode;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    supportingText: ReactNode;
    isError: boolean;
    inputTransformation: ComposeInputTransformation | null;
    textObfuscationMode: ComposeTextObfuscationModeValue;
    textObfuscationCharacter: string;
    keyboardOptions: ComposeKeyboardOptions;
    onKeyboardAction: (() => void) | null;
    onTextLayout?: ((value: ComposeTextLayout) => void) | null;
    shape: ComposeShape;
    colors: ComposeTextFieldColorsValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    trailingIcon?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    textStyle: ComposeTextStyle;
    labelPosition: ComposeTextFieldLabelPositionValue;
    label: ReactNode;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    suffix: ReactNode;
    supportingText: ReactNode;
    isError: boolean;
    inputTransformation: ComposeInputTransformation | null;
    textObfuscationMode: ComposeTextObfuscationModeValue;
    textObfuscationCharacter: string;
    keyboardOptions: ComposeKeyboardOptions;
    onKeyboardAction: (() => void) | null;
    onTextLayout?: ((value: ComposeTextLayout) => void) | null;
    shape: ComposeShape;
    colors: ComposeTextFieldColorsValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    prefix?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    textStyle: ComposeTextStyle;
    labelPosition: ComposeTextFieldLabelPositionValue;
    label: ReactNode;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    prefix: ReactNode;
    supportingText: ReactNode;
    isError: boolean;
    inputTransformation: ComposeInputTransformation | null;
    textObfuscationMode: ComposeTextObfuscationModeValue;
    textObfuscationCharacter: string;
    keyboardOptions: ComposeKeyboardOptions;
    onKeyboardAction: (() => void) | null;
    onTextLayout?: ((value: ComposeTextLayout) => void) | null;
    shape: ComposeShape;
    colors: ComposeTextFieldColorsValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    suffix?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    textStyle: ComposeTextStyle;
    labelPosition: ComposeTextFieldLabelPositionValue;
    label: ReactNode;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    isError: boolean;
    inputTransformation: ComposeInputTransformation | null;
    textObfuscationMode: ComposeTextObfuscationModeValue;
    textObfuscationCharacter: string;
    keyboardOptions: ComposeKeyboardOptions;
    onKeyboardAction: (() => void) | null;
    onTextLayout?: ((value: ComposeTextLayout) => void) | null;
    shape: ComposeShape;
    colors: ComposeTextFieldColorsValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    supportingText?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    textStyle: ComposeTextStyle;
    labelPosition: ComposeTextFieldLabelPositionValue;
    label: ReactNode;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    supportingText: ReactNode;
    inputTransformation: ComposeInputTransformation | null;
    textObfuscationMode: ComposeTextObfuscationModeValue;
    textObfuscationCharacter: string;
    keyboardOptions: ComposeKeyboardOptions;
    onKeyboardAction: (() => void) | null;
    onTextLayout?: ((value: ComposeTextLayout) => void) | null;
    shape: ComposeShape;
    colors: ComposeTextFieldColorsValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    isError?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    textStyle: ComposeTextStyle;
    labelPosition: ComposeTextFieldLabelPositionValue;
    label: ReactNode;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    supportingText: ReactNode;
    isError: boolean;
    textObfuscationMode: ComposeTextObfuscationModeValue;
    textObfuscationCharacter: string;
    keyboardOptions: ComposeKeyboardOptions;
    onKeyboardAction: (() => void) | null;
    onTextLayout?: ((value: ComposeTextLayout) => void) | null;
    shape: ComposeShape;
    colors: ComposeTextFieldColorsValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    inputTransformation?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    textStyle: ComposeTextStyle;
    labelPosition: ComposeTextFieldLabelPositionValue;
    label: ReactNode;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    supportingText: ReactNode;
    isError: boolean;
    inputTransformation: ComposeInputTransformation | null;
    textObfuscationCharacter?: string;
    keyboardOptions: ComposeKeyboardOptions;
    onKeyboardAction: (() => void) | null;
    shape: ComposeShape;
    colors?: ComposeTextFieldColorsValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    textObfuscationMode?: never;
    onTextLayout?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    textStyle: ComposeTextStyle;
    labelPosition: ComposeTextFieldLabelPositionValue;
    label: ReactNode;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    supportingText: ReactNode;
    isError: boolean;
    inputTransformation: ComposeInputTransformation | null;
    textObfuscationCharacter: string;
    keyboardOptions: ComposeKeyboardOptions;
    onKeyboardAction: (() => void) | null;
    onTextLayout: ((value: ComposeTextLayout) => void) | null;
    shape: ComposeShape;
    colors: ComposeTextFieldColorsValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    textObfuscationMode?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    textStyle: ComposeTextStyle;
    labelPosition: ComposeTextFieldLabelPositionValue;
    label: ReactNode;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    supportingText: ReactNode;
    isError: boolean;
    inputTransformation: ComposeInputTransformation | null;
    textObfuscationMode: ComposeTextObfuscationModeValue;
    keyboardOptions: ComposeKeyboardOptions;
    onKeyboardAction: (() => void) | null;
    shape: ComposeShape;
    colors?: ComposeTextFieldColorsValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    textObfuscationCharacter?: never;
    onTextLayout?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    textStyle: ComposeTextStyle;
    labelPosition: ComposeTextFieldLabelPositionValue;
    label: ReactNode;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    supportingText: ReactNode;
    isError: boolean;
    inputTransformation: ComposeInputTransformation | null;
    textObfuscationMode: ComposeTextObfuscationModeValue;
    keyboardOptions: ComposeKeyboardOptions;
    onKeyboardAction: (() => void) | null;
    onTextLayout: ((value: ComposeTextLayout) => void) | null;
    shape: ComposeShape;
    colors: ComposeTextFieldColorsValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    textObfuscationCharacter?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    textStyle: ComposeTextStyle;
    labelPosition: ComposeTextFieldLabelPositionValue;
    label: ReactNode;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    supportingText: ReactNode;
    isError: boolean;
    inputTransformation: ComposeInputTransformation | null;
    textObfuscationMode: ComposeTextObfuscationModeValue;
    textObfuscationCharacter: string;
    onKeyboardAction: (() => void) | null;
    onTextLayout?: ((value: ComposeTextLayout) => void) | null;
    shape: ComposeShape;
    colors: ComposeTextFieldColorsValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    keyboardOptions?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    textStyle: ComposeTextStyle;
    labelPosition: ComposeTextFieldLabelPositionValue;
    label: ReactNode;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    supportingText: ReactNode;
    isError: boolean;
    inputTransformation: ComposeInputTransformation | null;
    textObfuscationMode: ComposeTextObfuscationModeValue;
    textObfuscationCharacter: string;
    keyboardOptions: ComposeKeyboardOptions;
    onTextLayout?: ((value: ComposeTextLayout) => void) | null;
    shape: ComposeShape;
    colors: ComposeTextFieldColorsValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    onKeyboardAction?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    textStyle: ComposeTextStyle;
    labelPosition: ComposeTextFieldLabelPositionValue;
    label: ReactNode;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    supportingText: ReactNode;
    isError: boolean;
    inputTransformation: ComposeInputTransformation | null;
    textObfuscationMode: ComposeTextObfuscationModeValue;
    textObfuscationCharacter: string;
    keyboardOptions: ComposeKeyboardOptions;
    onKeyboardAction: (() => void) | null;
    onTextLayout?: ((value: ComposeTextLayout) => void) | null;
    colors: ComposeTextFieldColorsValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    shape?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    textStyle: ComposeTextStyle;
    labelPosition: ComposeTextFieldLabelPositionValue;
    label: ReactNode;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    supportingText: ReactNode;
    isError: boolean;
    inputTransformation: ComposeInputTransformation | null;
    textObfuscationMode: ComposeTextObfuscationModeValue;
    textObfuscationCharacter: string;
    keyboardOptions: ComposeKeyboardOptions;
    onKeyboardAction: (() => void) | null;
    onTextLayout?: ((value: ComposeTextLayout) => void) | null;
    shape: ComposeShape;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    colors?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    textStyle: ComposeTextStyle;
    labelPosition: ComposeTextFieldLabelPositionValue;
    label: ReactNode;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    supportingText: ReactNode;
    isError: boolean;
    inputTransformation: ComposeInputTransformation | null;
    textObfuscationMode: ComposeTextObfuscationModeValue;
    textObfuscationCharacter: string;
    keyboardOptions: ComposeKeyboardOptions;
    onKeyboardAction: (() => void) | null;
    onTextLayout?: ((value: ComposeTextLayout) => void) | null;
    shape: ComposeShape;
    colors: ComposeTextFieldColorsValue;
    interactionSource: ComposeInteractionSource | null;
    contentPadding?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    textStyle: ComposeTextStyle;
    labelPosition: ComposeTextFieldLabelPositionValue;
    label: ReactNode;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    supportingText: ReactNode;
    isError: boolean;
    inputTransformation: ComposeInputTransformation | null;
    textObfuscationMode: ComposeTextObfuscationModeValue;
    textObfuscationCharacter: string;
    keyboardOptions: ComposeKeyboardOptions;
    onKeyboardAction: (() => void) | null;
    onTextLayout?: ((value: ComposeTextLayout) => void) | null;
    shape: ComposeShape;
    colors: ComposeTextFieldColorsValue;
    contentPadding: ComposePaddingValues;
    interactionSource?: ComposeInteractionSource | null;
    }
;
export const OutlinedSecureTextField = createComposableComponent<OutlinedSecureTextFieldProps>({
  name: "OutlinedSecureTextField",
  props: ["state","modifier","enabled","textStyle","labelPosition","isError","inputTransformation","textObfuscationMode","textObfuscationCharacter","keyboardOptions","shape","colors","contentPadding","interactionSource"],
  objectProps: ["state","textStyle","labelPosition","inputTransformation","keyboardOptions","shape","colors","contentPadding","interactionSource"],
  slots: ["label","placeholder","leadingIcon","trailingIcon","prefix","suffix","supportingText"],
  events: ["onKeyboardAction","onTextLayout"],
  children: false,
  overloads: [
    { id: "OutlinedSecureTextField", children: false, parameters: [["state","object",false,false],["modifier","ComposeModifier",true,false],["enabled","boolean",true,false],["textStyle","object",true,false],["labelPosition","object",true,false],["label","ReactNode",true,true],["placeholder","ReactNode",true,true],["leadingIcon","ReactNode",true,true],["trailingIcon","ReactNode",true,true],["prefix","ReactNode",true,true],["suffix","ReactNode",true,true],["supportingText","ReactNode",true,true],["isError","boolean",true,false],["inputTransformation","object",true,true],["textObfuscationMode","string",true,false],["textObfuscationCharacter","string",true,false],["keyboardOptions","object",true,false],["onKeyboardAction","function",true,true],["onTextLayout","function",true,true],["shape","shape",true,false],["colors","object",true,false],["contentPadding","object",true,false],["interactionSource","object",true,true]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,16,17,18,19,20,21,22,23,24,25,26,27,32,33,34,35,36,37,38,39,40,41,42,43,48,49,50,51,52,53,54,55,56,57,58,59,64,65,66,67,68,69,70,71,72,73,74,75,80,81,82,83,84,85,86,87,88,89,90,91,96,97,98,99,100,101,102,103,104,105,106,107,112,113,114,115,116,117,118,119,120,121,122,123,128,129,144,145,160,161,176,177,192,193,208,209,224,225,240,241,256,257,272,273,288,289,304,305,320,321,336,337,352,353,368,369,512,513,528,529,544,545,560,561,576,577,592,593,608,609,624,625,1024,1025,1040,1041,1056,1057,1072,1073,1088,1089,1104,1105,1120,1121,1136,1137,2048,2049,2050,2051,4096,4097,4098,4099,4100,4104,4112,4113,4114,4115,4128,4129,4130,4131,4144,4145,4146,4147,4160,4161,4162,4163,4176,4177,4178,4179,4192,4193,4194,4195,4208,4209,4210,4211,8192,8193,8194,8195,8196,8200,8208,8209,8210,8211,8224,8225,8226,8227,8240,8241,8242,8243,8256,8257,8258,8259,8272,8273,8274,8275,8288,8289,8290,8291,8304,8305,8306,8307,12288,16384,16385,16400,16401,16416,16417,16432,16433,16448,16449,16464,16465,16480,16481,16496,16497,18432,18433,18434,18435,32768,32769,32784,32785,32800,32801,32816,32817,32832,32833,32848,32849,32864,32865,32880,32881,34816,34817,34818,34819,49152,51200,51201,51202,51203,65536,65537,65538,65539,65552,65553,65554,65555,65568,65569,65570,65571,65584,65585,65586,65587,65600,65601,65602,65603,65616,65617,65618,65619,65632,65633,65634,65635,65648,65649,65650,65651,131072,131073,131088,131089,131104,131105,131120,131121,131136,131137,131152,131153,131168,131169,131184,131185,262144,262145,262146,262147,262148,262152,262160,262161,262162,262163,262176,262177,262178,262179,262192,262193,262194,262195,262208,262209,262210,262211,262224,262225,262226,262227,262240,262241,262242,262243,262256,262257,262258,262259,266240,270336,524288,524289,524304,524305,524320,524321,524336,524337,524352,524353,524368,524369,524384,524385,524400,524401,657395,706547,708595,983027,983039,1048563,1048575,1048576,1048577,1048578,1048579,1048592,1048593,1048594,1048595,1048608,1048609,1048610,1048611,1048624,1048625,1048626,1048627,1048640,1048641,1048642,1048643,1048656,1048657,1048658,1048659,1048672,1048673,1048674,1048675,1048688,1048689,1048690,1048691,1048704,1048705,1048706,1048707,1048720,1048721,1048722,1048723,1048736,1048737,1048738,1048739,1048752,1048753,1048754,1048755,1048768,1048769,1048770,1048771,1048784,1048785,1048786,1048787,1048800,1048801,1048802,1048803,1048816,1048817,1048818,1048819,1181683,1230835,1232883,1507315,1507327,1572851,1572863,1574899,1624051,1626099,1704947,1705459,1705715,1705843,1705907,1705939,1705955,1705969,1705970,1705971,1722355,1724403,1738739,1740787,1754099,1754611,1754867,1754995,1755059,1755091,1755107,1755121,1755122,1755123,1756147,1756659,1756915,1757043,1757107,1757139,1757155,1757169,1757170,1757171,1757175,1757179,1757183,1761267,1761271,1761275,1761279,1765363,1765367,1765371,1765375,1769459,1769463,1769467,1769471,1822707,1826803,1830899,1834995,1835007,1900531,1900543,1966067,1966079,1998835,1998847,2015219,2015231,2019315,2019319,2019323,2019327,2023411,2023415,2023419,2023423,2027507,2027511,2027515,2027519,2029555,2029567,2030579,2030591,2031091,2031103,2031347,2031359,2031475,2031487,2031539,2031551,2031571,2031583,2031587,2031599,2031601,2031602,2031603,2031607,2031611,2031613,2031614,2031615,2064371,2064383,2080755,2080767,2084851,2088947,2088959,2093043,2093055,2095091,2095103,2096115,2096127,2096627,2096639,2096883,2096895,2097011,2097023,2097075,2097087,2097107,2097119,2097123,2097135,2097137,2097138,2097139,2097143,2097147,2097149,2097150,2097151] },
  ],
});
