// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeShape } from "../../utils/modifier";
import type { ComposeInputTransformation, ComposeKeyboardOptions, ComposeOutputTransformation, ComposeScrollState, ComposeSearchBarState, ComposeTextFieldLineLimits, ComposeTextFieldState, ComposeTextStyle } from "../../utils/composeValues";
import type { ComposeTextFieldColorsValue } from "../values/records";
import type { ComposeInteractionSource } from "../../utils/nativeHandles";

export type InputFieldProps =
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    inputTransformation?: ComposeInputTransformation | null;
    outputTransformation?: ComposeOutputTransformation | null;
    keyboardOptions?: ComposeKeyboardOptions;
    lineLimits?: ComposeTextFieldLineLimits;
    enabled?: never;
    readOnly?: never;
    textStyle?: never;
    placeholder?: never;
    leadingIcon?: never;
    trailingIcon?: never;
    prefix?: never;
    suffix?: never;
    scrollState?: never;
    shape?: never;
    colors?: never;
    interactionSource?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly?: boolean;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    interactionSource: ComposeInteractionSource | null;
    textStyle?: never;
    trailingIcon?: never;
    prefix?: never;
    suffix?: never;
    inputTransformation?: never;
    outputTransformation?: never;
    scrollState?: never;
    shape?: never;
    colors?: never;
    keyboardOptions?: never;
    lineLimits?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
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
    colors: ComposeTextFieldColorsValue;
    trailingIcon?: never;
    prefix?: never;
    suffix?: never;
    inputTransformation?: never;
    outputTransformation?: never;
    scrollState?: never;
    shape?: never;
    interactionSource?: never;
    keyboardOptions?: never;
    lineLimits?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly?: boolean;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    shape: ComposeShape;
    interactionSource?: ComposeInteractionSource | null;
    textStyle?: never;
    trailingIcon?: never;
    prefix?: never;
    suffix?: never;
    inputTransformation?: never;
    outputTransformation?: never;
    scrollState?: never;
    colors?: never;
    keyboardOptions?: never;
    lineLimits?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
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
    scrollState: ComposeScrollState;
    trailingIcon?: never;
    prefix?: never;
    suffix?: never;
    inputTransformation?: never;
    outputTransformation?: never;
    shape?: never;
    colors?: never;
    interactionSource?: never;
    keyboardOptions?: never;
    lineLimits?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly?: boolean;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    suffix: ReactNode;
    shape?: ComposeShape;
    interactionSource?: ComposeInteractionSource | null;
    textStyle?: never;
    trailingIcon?: never;
    prefix?: never;
    inputTransformation?: never;
    outputTransformation?: never;
    scrollState?: never;
    colors?: never;
    keyboardOptions?: never;
    lineLimits?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly?: boolean;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    prefix: ReactNode;
    suffix?: ReactNode;
    shape?: ComposeShape;
    interactionSource?: ComposeInteractionSource | null;
    textStyle?: never;
    trailingIcon?: never;
    inputTransformation?: never;
    outputTransformation?: never;
    scrollState?: never;
    colors?: never;
    keyboardOptions?: never;
    lineLimits?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly?: boolean;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    trailingIcon: ReactNode;
    prefix?: ReactNode;
    suffix?: ReactNode;
    shape?: ComposeShape;
    interactionSource?: ComposeInteractionSource | null;
    textStyle?: never;
    inputTransformation?: never;
    outputTransformation?: never;
    scrollState?: never;
    colors?: never;
    keyboardOptions?: never;
    lineLimits?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    leadingIcon: ReactNode;
    lineLimits?: ComposeTextFieldLineLimits;
    enabled?: never;
    readOnly?: never;
    textStyle?: never;
    placeholder?: never;
    trailingIcon?: never;
    prefix?: never;
    suffix?: never;
    inputTransformation?: never;
    outputTransformation?: never;
    scrollState?: never;
    shape?: never;
    colors?: never;
    interactionSource?: never;
    keyboardOptions?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    leadingIcon: ReactNode;
    keyboardOptions: ComposeKeyboardOptions;
    enabled?: never;
    readOnly?: never;
    textStyle?: never;
    placeholder?: never;
    trailingIcon?: never;
    prefix?: never;
    suffix?: never;
    inputTransformation?: never;
    outputTransformation?: never;
    scrollState?: never;
    shape?: never;
    colors?: never;
    interactionSource?: never;
    lineLimits?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    placeholder: ReactNode;
    leadingIcon?: ReactNode;
    lineLimits?: ComposeTextFieldLineLimits;
    enabled?: never;
    readOnly?: never;
    textStyle?: never;
    trailingIcon?: never;
    prefix?: never;
    suffix?: never;
    inputTransformation?: never;
    outputTransformation?: never;
    scrollState?: never;
    shape?: never;
    colors?: never;
    interactionSource?: never;
    keyboardOptions?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    placeholder: ReactNode;
    leadingIcon?: ReactNode;
    keyboardOptions: ComposeKeyboardOptions;
    enabled?: never;
    readOnly?: never;
    textStyle?: never;
    trailingIcon?: never;
    prefix?: never;
    suffix?: never;
    inputTransformation?: never;
    outputTransformation?: never;
    scrollState?: never;
    shape?: never;
    colors?: never;
    interactionSource?: never;
    lineLimits?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly?: boolean;
    placeholder: ReactNode;
    outputTransformation: ComposeOutputTransformation | null;
    textStyle?: never;
    leadingIcon?: never;
    trailingIcon?: never;
    prefix?: never;
    suffix?: never;
    inputTransformation?: never;
    scrollState?: never;
    shape?: never;
    colors?: never;
    interactionSource?: never;
    keyboardOptions?: never;
    lineLimits?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly?: boolean;
    placeholder: ReactNode;
    inputTransformation: ComposeInputTransformation | null;
    outputTransformation?: ComposeOutputTransformation | null;
    textStyle?: never;
    leadingIcon?: never;
    trailingIcon?: never;
    prefix?: never;
    suffix?: never;
    scrollState?: never;
    shape?: never;
    colors?: never;
    interactionSource?: never;
    keyboardOptions?: never;
    lineLimits?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    readOnly?: boolean;
    textStyle: ComposeTextStyle;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    trailingIcon?: ReactNode;
    prefix?: ReactNode;
    suffix?: ReactNode;
    shape?: ComposeShape;
    interactionSource?: ComposeInteractionSource | null;
    enabled?: never;
    inputTransformation?: never;
    outputTransformation?: never;
    scrollState?: never;
    colors?: never;
    keyboardOptions?: never;
    lineLimits?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly?: boolean;
    textStyle: ComposeTextStyle;
    placeholder?: ReactNode;
    outputTransformation: ComposeOutputTransformation | null;
    leadingIcon?: never;
    trailingIcon?: never;
    prefix?: never;
    suffix?: never;
    inputTransformation?: never;
    scrollState?: never;
    shape?: never;
    colors?: never;
    interactionSource?: never;
    keyboardOptions?: never;
    lineLimits?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly?: boolean;
    textStyle: ComposeTextStyle;
    placeholder?: ReactNode;
    inputTransformation: ComposeInputTransformation | null;
    outputTransformation?: ComposeOutputTransformation | null;
    leadingIcon?: never;
    trailingIcon?: never;
    prefix?: never;
    suffix?: never;
    scrollState?: never;
    shape?: never;
    colors?: never;
    interactionSource?: never;
    keyboardOptions?: never;
    lineLimits?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    readOnly: boolean;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    lineLimits?: ComposeTextFieldLineLimits;
    enabled?: never;
    textStyle?: never;
    trailingIcon?: never;
    prefix?: never;
    suffix?: never;
    inputTransformation?: never;
    outputTransformation?: never;
    scrollState?: never;
    shape?: never;
    colors?: never;
    interactionSource?: never;
    keyboardOptions?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    readOnly: boolean;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    keyboardOptions: ComposeKeyboardOptions;
    enabled?: never;
    textStyle?: never;
    trailingIcon?: never;
    prefix?: never;
    suffix?: never;
    inputTransformation?: never;
    outputTransformation?: never;
    scrollState?: never;
    shape?: never;
    colors?: never;
    interactionSource?: never;
    lineLimits?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    readOnly: boolean;
    outputTransformation: ComposeOutputTransformation | null;
    keyboardOptions?: ComposeKeyboardOptions;
    lineLimits?: ComposeTextFieldLineLimits;
    enabled?: never;
    textStyle?: never;
    placeholder?: never;
    leadingIcon?: never;
    trailingIcon?: never;
    prefix?: never;
    suffix?: never;
    inputTransformation?: never;
    scrollState?: never;
    shape?: never;
    colors?: never;
    interactionSource?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    readOnly: boolean;
    inputTransformation: ComposeInputTransformation | null;
    outputTransformation?: ComposeOutputTransformation | null;
    keyboardOptions?: ComposeKeyboardOptions;
    lineLimits?: ComposeTextFieldLineLimits;
    enabled?: never;
    textStyle?: never;
    placeholder?: never;
    leadingIcon?: never;
    trailingIcon?: never;
    prefix?: never;
    suffix?: never;
    scrollState?: never;
    shape?: never;
    colors?: never;
    interactionSource?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    readOnly: boolean;
    textStyle: ComposeTextStyle;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    shape: ComposeShape;
    interactionSource: ComposeInteractionSource | null;
    keyboardOptions: ComposeKeyboardOptions;
    lineLimits: ComposeTextFieldLineLimits;
    enabled?: never;
    inputTransformation?: never;
    outputTransformation?: never;
    scrollState?: never;
    colors?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    readOnly: boolean;
    textStyle: ComposeTextStyle;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    inputTransformation: ComposeInputTransformation | null;
    outputTransformation: ComposeOutputTransformation | null;
    shape: ComposeShape;
    colors?: ComposeTextFieldColorsValue;
    interactionSource: ComposeInteractionSource | null;
    enabled?: never;
    scrollState?: never;
    keyboardOptions?: never;
    lineLimits?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    readOnly: boolean;
    textStyle: ComposeTextStyle;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    inputTransformation: ComposeInputTransformation | null;
    outputTransformation: ComposeOutputTransformation | null;
    shape: ComposeShape;
    colors?: ComposeTextFieldColorsValue;
    interactionSource: ComposeInteractionSource | null;
    keyboardOptions: ComposeKeyboardOptions;
    lineLimits: ComposeTextFieldLineLimits;
    enabled?: never;
    scrollState?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    readOnly: boolean;
    textStyle: ComposeTextStyle;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    inputTransformation: ComposeInputTransformation | null;
    outputTransformation: ComposeOutputTransformation | null;
    scrollState: ComposeScrollState;
    shape: ComposeShape;
    colors: ComposeTextFieldColorsValue;
    interactionSource: ComposeInteractionSource | null;
    enabled?: never;
    keyboardOptions?: never;
    lineLimits?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    readOnly: boolean;
    textStyle: ComposeTextStyle;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    inputTransformation: ComposeInputTransformation | null;
    outputTransformation: ComposeOutputTransformation | null;
    scrollState: ComposeScrollState;
    shape: ComposeShape;
    colors: ComposeTextFieldColorsValue;
    interactionSource: ComposeInteractionSource | null;
    keyboardOptions: ComposeKeyboardOptions;
    lineLimits: ComposeTextFieldLineLimits;
    enabled?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    readOnly?: boolean;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    lineLimits?: ComposeTextFieldLineLimits;
    textStyle?: never;
    trailingIcon?: never;
    prefix?: never;
    suffix?: never;
    inputTransformation?: never;
    outputTransformation?: never;
    scrollState?: never;
    shape?: never;
    colors?: never;
    interactionSource?: never;
    keyboardOptions?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    readOnly?: boolean;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    keyboardOptions: ComposeKeyboardOptions;
    textStyle?: never;
    trailingIcon?: never;
    prefix?: never;
    suffix?: never;
    inputTransformation?: never;
    outputTransformation?: never;
    scrollState?: never;
    shape?: never;
    colors?: never;
    interactionSource?: never;
    lineLimits?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    readOnly?: boolean;
    outputTransformation: ComposeOutputTransformation | null;
    keyboardOptions?: ComposeKeyboardOptions;
    lineLimits?: ComposeTextFieldLineLimits;
    textStyle?: never;
    placeholder?: never;
    leadingIcon?: never;
    trailingIcon?: never;
    prefix?: never;
    suffix?: never;
    inputTransformation?: never;
    scrollState?: never;
    shape?: never;
    colors?: never;
    interactionSource?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    readOnly?: boolean;
    inputTransformation: ComposeInputTransformation | null;
    outputTransformation?: ComposeOutputTransformation | null;
    keyboardOptions?: ComposeKeyboardOptions;
    lineLimits?: ComposeTextFieldLineLimits;
    textStyle?: never;
    placeholder?: never;
    leadingIcon?: never;
    trailingIcon?: never;
    prefix?: never;
    suffix?: never;
    scrollState?: never;
    shape?: never;
    colors?: never;
    interactionSource?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    textStyle: ComposeTextStyle;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    trailingIcon?: ReactNode;
    prefix?: ReactNode;
    suffix?: ReactNode;
    shape?: ComposeShape;
    interactionSource?: ComposeInteractionSource | null;
    readOnly?: never;
    inputTransformation?: never;
    outputTransformation?: never;
    scrollState?: never;
    colors?: never;
    keyboardOptions?: never;
    lineLimits?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
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
    shape: ComposeShape;
    interactionSource: ComposeInteractionSource | null;
    keyboardOptions: ComposeKeyboardOptions;
    lineLimits: ComposeTextFieldLineLimits;
    readOnly?: never;
    inputTransformation?: never;
    outputTransformation?: never;
    scrollState?: never;
    colors?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
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
    inputTransformation: ComposeInputTransformation | null;
    outputTransformation: ComposeOutputTransformation | null;
    shape: ComposeShape;
    colors?: ComposeTextFieldColorsValue;
    interactionSource: ComposeInteractionSource | null;
    readOnly?: never;
    scrollState?: never;
    keyboardOptions?: never;
    lineLimits?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
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
    inputTransformation: ComposeInputTransformation | null;
    outputTransformation: ComposeOutputTransformation | null;
    shape: ComposeShape;
    colors?: ComposeTextFieldColorsValue;
    interactionSource: ComposeInteractionSource | null;
    keyboardOptions: ComposeKeyboardOptions;
    lineLimits: ComposeTextFieldLineLimits;
    readOnly?: never;
    scrollState?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
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
    inputTransformation: ComposeInputTransformation | null;
    outputTransformation: ComposeOutputTransformation | null;
    scrollState: ComposeScrollState;
    shape: ComposeShape;
    colors: ComposeTextFieldColorsValue;
    interactionSource: ComposeInteractionSource | null;
    readOnly?: never;
    keyboardOptions?: never;
    lineLimits?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
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
    inputTransformation: ComposeInputTransformation | null;
    outputTransformation: ComposeOutputTransformation | null;
    scrollState: ComposeScrollState;
    shape: ComposeShape;
    colors: ComposeTextFieldColorsValue;
    interactionSource: ComposeInteractionSource | null;
    keyboardOptions: ComposeKeyboardOptions;
    lineLimits: ComposeTextFieldLineLimits;
    readOnly?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    readOnly: boolean;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    shape: ComposeShape;
    interactionSource: ComposeInteractionSource | null;
    keyboardOptions: ComposeKeyboardOptions;
    lineLimits: ComposeTextFieldLineLimits;
    textStyle?: never;
    inputTransformation?: never;
    outputTransformation?: never;
    scrollState?: never;
    colors?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    readOnly: boolean;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    inputTransformation: ComposeInputTransformation | null;
    outputTransformation: ComposeOutputTransformation | null;
    shape: ComposeShape;
    colors?: ComposeTextFieldColorsValue;
    interactionSource: ComposeInteractionSource | null;
    textStyle?: never;
    scrollState?: never;
    keyboardOptions?: never;
    lineLimits?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    readOnly: boolean;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    inputTransformation: ComposeInputTransformation | null;
    outputTransformation: ComposeOutputTransformation | null;
    shape: ComposeShape;
    colors?: ComposeTextFieldColorsValue;
    interactionSource: ComposeInteractionSource | null;
    keyboardOptions: ComposeKeyboardOptions;
    lineLimits: ComposeTextFieldLineLimits;
    textStyle?: never;
    scrollState?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    readOnly: boolean;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    inputTransformation: ComposeInputTransformation | null;
    outputTransformation: ComposeOutputTransformation | null;
    scrollState: ComposeScrollState;
    shape: ComposeShape;
    colors: ComposeTextFieldColorsValue;
    interactionSource: ComposeInteractionSource | null;
    textStyle?: never;
    keyboardOptions?: never;
    lineLimits?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    readOnly: boolean;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    inputTransformation: ComposeInputTransformation | null;
    outputTransformation: ComposeOutputTransformation | null;
    scrollState: ComposeScrollState;
    shape: ComposeShape;
    colors: ComposeTextFieldColorsValue;
    interactionSource: ComposeInteractionSource | null;
    keyboardOptions: ComposeKeyboardOptions;
    lineLimits: ComposeTextFieldLineLimits;
    textStyle?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    readOnly: boolean;
    textStyle: ComposeTextStyle;
    leadingIcon?: ReactNode;
    trailingIcon?: ReactNode;
    prefix?: ReactNode;
    suffix?: ReactNode;
    shape?: ComposeShape;
    interactionSource?: ComposeInteractionSource | null;
    placeholder?: never;
    inputTransformation?: never;
    outputTransformation?: never;
    scrollState?: never;
    colors?: never;
    keyboardOptions?: never;
    lineLimits?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    readOnly: boolean;
    textStyle: ComposeTextStyle;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    shape: ComposeShape;
    interactionSource: ComposeInteractionSource | null;
    keyboardOptions: ComposeKeyboardOptions;
    lineLimits: ComposeTextFieldLineLimits;
    placeholder?: never;
    inputTransformation?: never;
    outputTransformation?: never;
    scrollState?: never;
    colors?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    readOnly: boolean;
    textStyle: ComposeTextStyle;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    inputTransformation: ComposeInputTransformation | null;
    outputTransformation: ComposeOutputTransformation | null;
    shape: ComposeShape;
    colors?: ComposeTextFieldColorsValue;
    interactionSource: ComposeInteractionSource | null;
    placeholder?: never;
    scrollState?: never;
    keyboardOptions?: never;
    lineLimits?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    readOnly: boolean;
    textStyle: ComposeTextStyle;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    inputTransformation: ComposeInputTransformation | null;
    outputTransformation: ComposeOutputTransformation | null;
    shape: ComposeShape;
    colors?: ComposeTextFieldColorsValue;
    interactionSource: ComposeInteractionSource | null;
    keyboardOptions: ComposeKeyboardOptions;
    lineLimits: ComposeTextFieldLineLimits;
    placeholder?: never;
    scrollState?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    readOnly: boolean;
    textStyle: ComposeTextStyle;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    inputTransformation: ComposeInputTransformation | null;
    outputTransformation: ComposeOutputTransformation | null;
    scrollState: ComposeScrollState;
    shape: ComposeShape;
    colors: ComposeTextFieldColorsValue;
    interactionSource: ComposeInteractionSource | null;
    placeholder?: never;
    keyboardOptions?: never;
    lineLimits?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    readOnly: boolean;
    textStyle: ComposeTextStyle;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    inputTransformation: ComposeInputTransformation | null;
    outputTransformation: ComposeOutputTransformation | null;
    scrollState: ComposeScrollState;
    shape: ComposeShape;
    colors: ComposeTextFieldColorsValue;
    interactionSource: ComposeInteractionSource | null;
    keyboardOptions: ComposeKeyboardOptions;
    lineLimits: ComposeTextFieldLineLimits;
    placeholder?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    readOnly: boolean;
    textStyle: ComposeTextStyle;
    placeholder: ReactNode;
    trailingIcon?: ReactNode;
    prefix?: ReactNode;
    suffix?: ReactNode;
    shape?: ComposeShape;
    interactionSource?: ComposeInteractionSource | null;
    leadingIcon?: never;
    inputTransformation?: never;
    outputTransformation?: never;
    scrollState?: never;
    colors?: never;
    keyboardOptions?: never;
    lineLimits?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    readOnly: boolean;
    textStyle: ComposeTextStyle;
    placeholder: ReactNode;
    trailingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    shape: ComposeShape;
    interactionSource: ComposeInteractionSource | null;
    keyboardOptions: ComposeKeyboardOptions;
    lineLimits: ComposeTextFieldLineLimits;
    leadingIcon?: never;
    inputTransformation?: never;
    outputTransformation?: never;
    scrollState?: never;
    colors?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    readOnly: boolean;
    textStyle: ComposeTextStyle;
    placeholder: ReactNode;
    trailingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    inputTransformation: ComposeInputTransformation | null;
    outputTransformation: ComposeOutputTransformation | null;
    shape: ComposeShape;
    colors?: ComposeTextFieldColorsValue;
    interactionSource: ComposeInteractionSource | null;
    leadingIcon?: never;
    scrollState?: never;
    keyboardOptions?: never;
    lineLimits?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    readOnly: boolean;
    textStyle: ComposeTextStyle;
    placeholder: ReactNode;
    trailingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    inputTransformation: ComposeInputTransformation | null;
    outputTransformation: ComposeOutputTransformation | null;
    shape: ComposeShape;
    colors?: ComposeTextFieldColorsValue;
    interactionSource: ComposeInteractionSource | null;
    keyboardOptions: ComposeKeyboardOptions;
    lineLimits: ComposeTextFieldLineLimits;
    leadingIcon?: never;
    scrollState?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    readOnly: boolean;
    textStyle: ComposeTextStyle;
    placeholder: ReactNode;
    trailingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    inputTransformation: ComposeInputTransformation | null;
    outputTransformation: ComposeOutputTransformation | null;
    scrollState: ComposeScrollState;
    shape: ComposeShape;
    colors: ComposeTextFieldColorsValue;
    interactionSource: ComposeInteractionSource | null;
    leadingIcon?: never;
    keyboardOptions?: never;
    lineLimits?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    readOnly: boolean;
    textStyle: ComposeTextStyle;
    placeholder: ReactNode;
    trailingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    inputTransformation: ComposeInputTransformation | null;
    outputTransformation: ComposeOutputTransformation | null;
    scrollState: ComposeScrollState;
    shape: ComposeShape;
    colors: ComposeTextFieldColorsValue;
    interactionSource: ComposeInteractionSource | null;
    keyboardOptions: ComposeKeyboardOptions;
    lineLimits: ComposeTextFieldLineLimits;
    leadingIcon?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    readOnly: boolean;
    textStyle: ComposeTextStyle;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    prefix?: ReactNode;
    suffix?: ReactNode;
    shape?: ComposeShape;
    interactionSource?: ComposeInteractionSource | null;
    trailingIcon?: never;
    inputTransformation?: never;
    outputTransformation?: never;
    scrollState?: never;
    colors?: never;
    keyboardOptions?: never;
    lineLimits?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    readOnly: boolean;
    textStyle: ComposeTextStyle;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    shape: ComposeShape;
    interactionSource: ComposeInteractionSource | null;
    keyboardOptions: ComposeKeyboardOptions;
    lineLimits: ComposeTextFieldLineLimits;
    trailingIcon?: never;
    inputTransformation?: never;
    outputTransformation?: never;
    scrollState?: never;
    colors?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    readOnly: boolean;
    textStyle: ComposeTextStyle;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    inputTransformation: ComposeInputTransformation | null;
    outputTransformation: ComposeOutputTransformation | null;
    shape: ComposeShape;
    colors?: ComposeTextFieldColorsValue;
    interactionSource: ComposeInteractionSource | null;
    trailingIcon?: never;
    scrollState?: never;
    keyboardOptions?: never;
    lineLimits?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    readOnly: boolean;
    textStyle: ComposeTextStyle;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    inputTransformation: ComposeInputTransformation | null;
    outputTransformation: ComposeOutputTransformation | null;
    shape: ComposeShape;
    colors?: ComposeTextFieldColorsValue;
    interactionSource: ComposeInteractionSource | null;
    keyboardOptions: ComposeKeyboardOptions;
    lineLimits: ComposeTextFieldLineLimits;
    trailingIcon?: never;
    scrollState?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    readOnly: boolean;
    textStyle: ComposeTextStyle;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    inputTransformation: ComposeInputTransformation | null;
    outputTransformation: ComposeOutputTransformation | null;
    scrollState: ComposeScrollState;
    shape: ComposeShape;
    colors: ComposeTextFieldColorsValue;
    interactionSource: ComposeInteractionSource | null;
    trailingIcon?: never;
    keyboardOptions?: never;
    lineLimits?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    readOnly: boolean;
    textStyle: ComposeTextStyle;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    inputTransformation: ComposeInputTransformation | null;
    outputTransformation: ComposeOutputTransformation | null;
    scrollState: ComposeScrollState;
    shape: ComposeShape;
    colors: ComposeTextFieldColorsValue;
    interactionSource: ComposeInteractionSource | null;
    keyboardOptions: ComposeKeyboardOptions;
    lineLimits: ComposeTextFieldLineLimits;
    trailingIcon?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    readOnly: boolean;
    textStyle: ComposeTextStyle;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    suffix?: ReactNode;
    shape?: ComposeShape;
    interactionSource?: ComposeInteractionSource | null;
    prefix?: never;
    inputTransformation?: never;
    outputTransformation?: never;
    scrollState?: never;
    colors?: never;
    keyboardOptions?: never;
    lineLimits?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    readOnly: boolean;
    textStyle: ComposeTextStyle;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    suffix: ReactNode;
    shape: ComposeShape;
    interactionSource: ComposeInteractionSource | null;
    keyboardOptions: ComposeKeyboardOptions;
    lineLimits: ComposeTextFieldLineLimits;
    prefix?: never;
    inputTransformation?: never;
    outputTransformation?: never;
    scrollState?: never;
    colors?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    readOnly: boolean;
    textStyle: ComposeTextStyle;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    suffix: ReactNode;
    inputTransformation: ComposeInputTransformation | null;
    outputTransformation: ComposeOutputTransformation | null;
    shape: ComposeShape;
    colors?: ComposeTextFieldColorsValue;
    interactionSource: ComposeInteractionSource | null;
    prefix?: never;
    scrollState?: never;
    keyboardOptions?: never;
    lineLimits?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    readOnly: boolean;
    textStyle: ComposeTextStyle;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    suffix: ReactNode;
    inputTransformation: ComposeInputTransformation | null;
    outputTransformation: ComposeOutputTransformation | null;
    shape: ComposeShape;
    colors?: ComposeTextFieldColorsValue;
    interactionSource: ComposeInteractionSource | null;
    keyboardOptions: ComposeKeyboardOptions;
    lineLimits: ComposeTextFieldLineLimits;
    prefix?: never;
    scrollState?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    readOnly: boolean;
    textStyle: ComposeTextStyle;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    suffix: ReactNode;
    inputTransformation: ComposeInputTransformation | null;
    outputTransformation: ComposeOutputTransformation | null;
    scrollState: ComposeScrollState;
    shape: ComposeShape;
    colors: ComposeTextFieldColorsValue;
    interactionSource: ComposeInteractionSource | null;
    prefix?: never;
    keyboardOptions?: never;
    lineLimits?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    readOnly: boolean;
    textStyle: ComposeTextStyle;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    suffix: ReactNode;
    inputTransformation: ComposeInputTransformation | null;
    outputTransformation: ComposeOutputTransformation | null;
    scrollState: ComposeScrollState;
    shape: ComposeShape;
    colors: ComposeTextFieldColorsValue;
    interactionSource: ComposeInteractionSource | null;
    keyboardOptions: ComposeKeyboardOptions;
    lineLimits: ComposeTextFieldLineLimits;
    prefix?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
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
    shape?: ComposeShape;
    interactionSource?: ComposeInteractionSource | null;
    suffix?: never;
    inputTransformation?: never;
    outputTransformation?: never;
    scrollState?: never;
    colors?: never;
    keyboardOptions?: never;
    lineLimits?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
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
    shape: ComposeShape;
    interactionSource: ComposeInteractionSource | null;
    keyboardOptions: ComposeKeyboardOptions;
    lineLimits: ComposeTextFieldLineLimits;
    suffix?: never;
    inputTransformation?: never;
    outputTransformation?: never;
    scrollState?: never;
    colors?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
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
    inputTransformation: ComposeInputTransformation | null;
    outputTransformation: ComposeOutputTransformation | null;
    shape: ComposeShape;
    colors?: ComposeTextFieldColorsValue;
    interactionSource: ComposeInteractionSource | null;
    suffix?: never;
    scrollState?: never;
    keyboardOptions?: never;
    lineLimits?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
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
    inputTransformation: ComposeInputTransformation | null;
    outputTransformation: ComposeOutputTransformation | null;
    shape: ComposeShape;
    colors?: ComposeTextFieldColorsValue;
    interactionSource: ComposeInteractionSource | null;
    keyboardOptions: ComposeKeyboardOptions;
    lineLimits: ComposeTextFieldLineLimits;
    suffix?: never;
    scrollState?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
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
    inputTransformation: ComposeInputTransformation | null;
    outputTransformation: ComposeOutputTransformation | null;
    scrollState: ComposeScrollState;
    shape: ComposeShape;
    colors: ComposeTextFieldColorsValue;
    interactionSource: ComposeInteractionSource | null;
    suffix?: never;
    keyboardOptions?: never;
    lineLimits?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
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
    inputTransformation: ComposeInputTransformation | null;
    outputTransformation: ComposeOutputTransformation | null;
    scrollState: ComposeScrollState;
    shape: ComposeShape;
    colors: ComposeTextFieldColorsValue;
    interactionSource: ComposeInteractionSource | null;
    keyboardOptions: ComposeKeyboardOptions;
    lineLimits: ComposeTextFieldLineLimits;
    suffix?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
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
    interactionSource?: ComposeInteractionSource | null;
    inputTransformation?: never;
    outputTransformation?: never;
    scrollState?: never;
    shape?: never;
    colors?: never;
    keyboardOptions?: never;
    lineLimits?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
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
    interactionSource: ComposeInteractionSource | null;
    keyboardOptions: ComposeKeyboardOptions;
    lineLimits: ComposeTextFieldLineLimits;
    inputTransformation?: never;
    outputTransformation?: never;
    scrollState?: never;
    shape?: never;
    colors?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
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
    shape: ComposeShape;
    inputTransformation?: never;
    outputTransformation?: never;
    scrollState?: never;
    colors?: never;
    interactionSource?: never;
    keyboardOptions?: never;
    lineLimits?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
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
    shape: ComposeShape;
    keyboardOptions: ComposeKeyboardOptions;
    lineLimits: ComposeTextFieldLineLimits;
    inputTransformation?: never;
    outputTransformation?: never;
    scrollState?: never;
    colors?: never;
    interactionSource?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
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
    shape: ComposeShape;
    interactionSource: ComposeInteractionSource | null;
    keyboardOptions?: ComposeKeyboardOptions;
    lineLimits?: ComposeTextFieldLineLimits;
    inputTransformation?: never;
    outputTransformation?: never;
    scrollState?: never;
    colors?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
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
    outputTransformation: ComposeOutputTransformation | null;
    shape: ComposeShape;
    colors?: ComposeTextFieldColorsValue;
    interactionSource: ComposeInteractionSource | null;
    inputTransformation?: never;
    scrollState?: never;
    keyboardOptions?: never;
    lineLimits?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
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
    outputTransformation: ComposeOutputTransformation | null;
    shape: ComposeShape;
    colors?: ComposeTextFieldColorsValue;
    interactionSource: ComposeInteractionSource | null;
    keyboardOptions: ComposeKeyboardOptions;
    lineLimits: ComposeTextFieldLineLimits;
    inputTransformation?: never;
    scrollState?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
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
    outputTransformation: ComposeOutputTransformation | null;
    scrollState: ComposeScrollState;
    shape: ComposeShape;
    colors: ComposeTextFieldColorsValue;
    interactionSource: ComposeInteractionSource | null;
    inputTransformation?: never;
    keyboardOptions?: never;
    lineLimits?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
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
    outputTransformation: ComposeOutputTransformation | null;
    scrollState: ComposeScrollState;
    shape: ComposeShape;
    colors: ComposeTextFieldColorsValue;
    interactionSource: ComposeInteractionSource | null;
    keyboardOptions: ComposeKeyboardOptions;
    lineLimits: ComposeTextFieldLineLimits;
    inputTransformation?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
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
    inputTransformation: ComposeInputTransformation | null;
    shape: ComposeShape;
    colors?: ComposeTextFieldColorsValue;
    interactionSource: ComposeInteractionSource | null;
    outputTransformation?: never;
    scrollState?: never;
    keyboardOptions?: never;
    lineLimits?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
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
    inputTransformation: ComposeInputTransformation | null;
    shape: ComposeShape;
    colors?: ComposeTextFieldColorsValue;
    interactionSource: ComposeInteractionSource | null;
    keyboardOptions: ComposeKeyboardOptions;
    lineLimits: ComposeTextFieldLineLimits;
    outputTransformation?: never;
    scrollState?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
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
    inputTransformation: ComposeInputTransformation | null;
    scrollState: ComposeScrollState;
    shape: ComposeShape;
    colors: ComposeTextFieldColorsValue;
    interactionSource: ComposeInteractionSource | null;
    outputTransformation?: never;
    keyboardOptions?: never;
    lineLimits?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
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
    inputTransformation: ComposeInputTransformation | null;
    scrollState: ComposeScrollState;
    shape: ComposeShape;
    colors: ComposeTextFieldColorsValue;
    interactionSource: ComposeInteractionSource | null;
    keyboardOptions: ComposeKeyboardOptions;
    lineLimits: ComposeTextFieldLineLimits;
    outputTransformation?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
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
    inputTransformation: ComposeInputTransformation | null;
    outputTransformation: ComposeOutputTransformation | null;
    colors?: ComposeTextFieldColorsValue;
    interactionSource: ComposeInteractionSource | null;
    scrollState?: never;
    shape?: never;
    keyboardOptions?: never;
    lineLimits?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
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
    inputTransformation: ComposeInputTransformation | null;
    outputTransformation: ComposeOutputTransformation | null;
    colors?: ComposeTextFieldColorsValue;
    interactionSource: ComposeInteractionSource | null;
    keyboardOptions: ComposeKeyboardOptions;
    lineLimits: ComposeTextFieldLineLimits;
    scrollState?: never;
    shape?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
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
    inputTransformation: ComposeInputTransformation | null;
    outputTransformation: ComposeOutputTransformation | null;
    shape: ComposeShape;
    colors?: ComposeTextFieldColorsValue;
    scrollState?: never;
    interactionSource?: never;
    keyboardOptions?: never;
    lineLimits?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
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
    inputTransformation: ComposeInputTransformation | null;
    outputTransformation: ComposeOutputTransformation | null;
    shape: ComposeShape;
    colors?: ComposeTextFieldColorsValue;
    keyboardOptions: ComposeKeyboardOptions;
    lineLimits: ComposeTextFieldLineLimits;
    scrollState?: never;
    interactionSource?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
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
    inputTransformation: ComposeInputTransformation | null;
    outputTransformation: ComposeOutputTransformation | null;
    shape: ComposeShape;
    colors?: ComposeTextFieldColorsValue;
    interactionSource: ComposeInteractionSource | null;
    keyboardOptions?: ComposeKeyboardOptions;
    lineLimits?: ComposeTextFieldLineLimits;
    scrollState?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
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
    inputTransformation: ComposeInputTransformation | null;
    outputTransformation: ComposeOutputTransformation | null;
    scrollState: ComposeScrollState;
    colors: ComposeTextFieldColorsValue;
    interactionSource: ComposeInteractionSource | null;
    shape?: never;
    keyboardOptions?: never;
    lineLimits?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
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
    inputTransformation: ComposeInputTransformation | null;
    outputTransformation: ComposeOutputTransformation | null;
    scrollState: ComposeScrollState;
    colors: ComposeTextFieldColorsValue;
    interactionSource: ComposeInteractionSource | null;
    keyboardOptions: ComposeKeyboardOptions;
    lineLimits: ComposeTextFieldLineLimits;
    shape?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
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
    inputTransformation: ComposeInputTransformation | null;
    outputTransformation: ComposeOutputTransformation | null;
    scrollState: ComposeScrollState;
    shape: ComposeShape;
    interactionSource: ComposeInteractionSource | null;
    colors?: never;
    keyboardOptions?: never;
    lineLimits?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
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
    inputTransformation: ComposeInputTransformation | null;
    outputTransformation: ComposeOutputTransformation | null;
    scrollState: ComposeScrollState;
    shape: ComposeShape;
    interactionSource: ComposeInteractionSource | null;
    keyboardOptions: ComposeKeyboardOptions;
    lineLimits: ComposeTextFieldLineLimits;
    colors?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
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
    inputTransformation: ComposeInputTransformation | null;
    outputTransformation: ComposeOutputTransformation | null;
    scrollState: ComposeScrollState;
    shape: ComposeShape;
    colors: ComposeTextFieldColorsValue;
    interactionSource?: never;
    keyboardOptions?: never;
    lineLimits?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
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
    inputTransformation: ComposeInputTransformation | null;
    outputTransformation: ComposeOutputTransformation | null;
    scrollState: ComposeScrollState;
    shape: ComposeShape;
    colors: ComposeTextFieldColorsValue;
    keyboardOptions: ComposeKeyboardOptions;
    lineLimits: ComposeTextFieldLineLimits;
    interactionSource?: never;
    state?: never;
    expanded?: never;
    onExpandedChange?: never;
    query?: never;
    onQueryChange?: never;
    }
  | {
    textFieldState: ComposeTextFieldState;
    searchBarState: ComposeSearchBarState;
    onSearch: (value: string) => void;
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
    inputTransformation: ComposeInputTransformation | null;
    outputTransformation: ComposeOutputTransformation | null;
    scrollState: ComposeScrollState;
    shape: ComposeShape;
    colors: ComposeTextFieldColorsValue;
    interactionSource: ComposeInteractionSource | null;
    keyboardOptions?: ComposeKeyboardOptions;
    lineLimits?: ComposeTextFieldLineLimits;
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
    inputTransformation?: never;
    outputTransformation?: never;
    scrollState?: never;
    colors?: never;
    keyboardOptions?: never;
    lineLimits?: never;
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
    colors: ComposeTextFieldColorsValue;
    textFieldState?: never;
    searchBarState?: never;
    trailingIcon?: never;
    prefix?: never;
    suffix?: never;
    inputTransformation?: never;
    outputTransformation?: never;
    scrollState?: never;
    shape?: never;
    interactionSource?: never;
    keyboardOptions?: never;
    lineLimits?: never;
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
    scrollState: ComposeScrollState;
    textFieldState?: never;
    searchBarState?: never;
    trailingIcon?: never;
    prefix?: never;
    suffix?: never;
    inputTransformation?: never;
    outputTransformation?: never;
    shape?: never;
    colors?: never;
    interactionSource?: never;
    keyboardOptions?: never;
    lineLimits?: never;
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
    outputTransformation: ComposeOutputTransformation | null;
    textFieldState?: never;
    searchBarState?: never;
    leadingIcon?: never;
    trailingIcon?: never;
    prefix?: never;
    suffix?: never;
    inputTransformation?: never;
    scrollState?: never;
    shape?: never;
    colors?: never;
    interactionSource?: never;
    keyboardOptions?: never;
    lineLimits?: never;
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
    inputTransformation: ComposeInputTransformation | null;
    outputTransformation?: ComposeOutputTransformation | null;
    textFieldState?: never;
    searchBarState?: never;
    leadingIcon?: never;
    trailingIcon?: never;
    prefix?: never;
    suffix?: never;
    scrollState?: never;
    shape?: never;
    colors?: never;
    interactionSource?: never;
    keyboardOptions?: never;
    lineLimits?: never;
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
    readOnly: boolean;
    textStyle: ComposeTextStyle;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    inputTransformation: ComposeInputTransformation | null;
    outputTransformation: ComposeOutputTransformation | null;
    shape: ComposeShape;
    colors?: ComposeTextFieldColorsValue;
    interactionSource: ComposeInteractionSource | null;
    textFieldState?: never;
    searchBarState?: never;
    enabled?: never;
    scrollState?: never;
    keyboardOptions?: never;
    lineLimits?: never;
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
    readOnly: boolean;
    textStyle: ComposeTextStyle;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    inputTransformation: ComposeInputTransformation | null;
    outputTransformation: ComposeOutputTransformation | null;
    scrollState: ComposeScrollState;
    shape: ComposeShape;
    colors: ComposeTextFieldColorsValue;
    interactionSource: ComposeInteractionSource | null;
    textFieldState?: never;
    searchBarState?: never;
    enabled?: never;
    keyboardOptions?: never;
    lineLimits?: never;
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
    enabled: boolean;
    textStyle: ComposeTextStyle;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    inputTransformation: ComposeInputTransformation | null;
    outputTransformation: ComposeOutputTransformation | null;
    shape: ComposeShape;
    colors?: ComposeTextFieldColorsValue;
    interactionSource: ComposeInteractionSource | null;
    textFieldState?: never;
    searchBarState?: never;
    readOnly?: never;
    scrollState?: never;
    keyboardOptions?: never;
    lineLimits?: never;
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
    enabled: boolean;
    textStyle: ComposeTextStyle;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    inputTransformation: ComposeInputTransformation | null;
    outputTransformation: ComposeOutputTransformation | null;
    scrollState: ComposeScrollState;
    shape: ComposeShape;
    colors: ComposeTextFieldColorsValue;
    interactionSource: ComposeInteractionSource | null;
    textFieldState?: never;
    searchBarState?: never;
    readOnly?: never;
    keyboardOptions?: never;
    lineLimits?: never;
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
    enabled: boolean;
    readOnly: boolean;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    inputTransformation: ComposeInputTransformation | null;
    outputTransformation: ComposeOutputTransformation | null;
    shape: ComposeShape;
    colors?: ComposeTextFieldColorsValue;
    interactionSource: ComposeInteractionSource | null;
    textFieldState?: never;
    searchBarState?: never;
    textStyle?: never;
    scrollState?: never;
    keyboardOptions?: never;
    lineLimits?: never;
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
    enabled: boolean;
    readOnly: boolean;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    inputTransformation: ComposeInputTransformation | null;
    outputTransformation: ComposeOutputTransformation | null;
    scrollState: ComposeScrollState;
    shape: ComposeShape;
    colors: ComposeTextFieldColorsValue;
    interactionSource: ComposeInteractionSource | null;
    textFieldState?: never;
    searchBarState?: never;
    textStyle?: never;
    keyboardOptions?: never;
    lineLimits?: never;
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
    enabled: boolean;
    readOnly: boolean;
    textStyle: ComposeTextStyle;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    inputTransformation: ComposeInputTransformation | null;
    outputTransformation: ComposeOutputTransformation | null;
    shape: ComposeShape;
    colors?: ComposeTextFieldColorsValue;
    interactionSource: ComposeInteractionSource | null;
    textFieldState?: never;
    searchBarState?: never;
    placeholder?: never;
    scrollState?: never;
    keyboardOptions?: never;
    lineLimits?: never;
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
    enabled: boolean;
    readOnly: boolean;
    textStyle: ComposeTextStyle;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    inputTransformation: ComposeInputTransformation | null;
    outputTransformation: ComposeOutputTransformation | null;
    scrollState: ComposeScrollState;
    shape: ComposeShape;
    colors: ComposeTextFieldColorsValue;
    interactionSource: ComposeInteractionSource | null;
    textFieldState?: never;
    searchBarState?: never;
    placeholder?: never;
    keyboardOptions?: never;
    lineLimits?: never;
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
    enabled: boolean;
    readOnly: boolean;
    textStyle: ComposeTextStyle;
    placeholder: ReactNode;
    trailingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    inputTransformation: ComposeInputTransformation | null;
    outputTransformation: ComposeOutputTransformation | null;
    shape: ComposeShape;
    colors?: ComposeTextFieldColorsValue;
    interactionSource: ComposeInteractionSource | null;
    textFieldState?: never;
    searchBarState?: never;
    leadingIcon?: never;
    scrollState?: never;
    keyboardOptions?: never;
    lineLimits?: never;
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
    enabled: boolean;
    readOnly: boolean;
    textStyle: ComposeTextStyle;
    placeholder: ReactNode;
    trailingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    inputTransformation: ComposeInputTransformation | null;
    outputTransformation: ComposeOutputTransformation | null;
    scrollState: ComposeScrollState;
    shape: ComposeShape;
    colors: ComposeTextFieldColorsValue;
    interactionSource: ComposeInteractionSource | null;
    textFieldState?: never;
    searchBarState?: never;
    leadingIcon?: never;
    keyboardOptions?: never;
    lineLimits?: never;
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
    enabled: boolean;
    readOnly: boolean;
    textStyle: ComposeTextStyle;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    inputTransformation: ComposeInputTransformation | null;
    outputTransformation: ComposeOutputTransformation | null;
    shape: ComposeShape;
    colors?: ComposeTextFieldColorsValue;
    interactionSource: ComposeInteractionSource | null;
    textFieldState?: never;
    searchBarState?: never;
    trailingIcon?: never;
    scrollState?: never;
    keyboardOptions?: never;
    lineLimits?: never;
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
    enabled: boolean;
    readOnly: boolean;
    textStyle: ComposeTextStyle;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    inputTransformation: ComposeInputTransformation | null;
    outputTransformation: ComposeOutputTransformation | null;
    scrollState: ComposeScrollState;
    shape: ComposeShape;
    colors: ComposeTextFieldColorsValue;
    interactionSource: ComposeInteractionSource | null;
    textFieldState?: never;
    searchBarState?: never;
    trailingIcon?: never;
    keyboardOptions?: never;
    lineLimits?: never;
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
    enabled: boolean;
    readOnly: boolean;
    textStyle: ComposeTextStyle;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    suffix: ReactNode;
    inputTransformation: ComposeInputTransformation | null;
    outputTransformation: ComposeOutputTransformation | null;
    shape: ComposeShape;
    colors?: ComposeTextFieldColorsValue;
    interactionSource: ComposeInteractionSource | null;
    textFieldState?: never;
    searchBarState?: never;
    prefix?: never;
    scrollState?: never;
    keyboardOptions?: never;
    lineLimits?: never;
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
    enabled: boolean;
    readOnly: boolean;
    textStyle: ComposeTextStyle;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    suffix: ReactNode;
    inputTransformation: ComposeInputTransformation | null;
    outputTransformation: ComposeOutputTransformation | null;
    scrollState: ComposeScrollState;
    shape: ComposeShape;
    colors: ComposeTextFieldColorsValue;
    interactionSource: ComposeInteractionSource | null;
    textFieldState?: never;
    searchBarState?: never;
    prefix?: never;
    keyboardOptions?: never;
    lineLimits?: never;
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
    enabled: boolean;
    readOnly: boolean;
    textStyle: ComposeTextStyle;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    prefix: ReactNode;
    inputTransformation: ComposeInputTransformation | null;
    outputTransformation: ComposeOutputTransformation | null;
    shape: ComposeShape;
    colors?: ComposeTextFieldColorsValue;
    interactionSource: ComposeInteractionSource | null;
    textFieldState?: never;
    searchBarState?: never;
    suffix?: never;
    scrollState?: never;
    keyboardOptions?: never;
    lineLimits?: never;
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
    enabled: boolean;
    readOnly: boolean;
    textStyle: ComposeTextStyle;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    prefix: ReactNode;
    inputTransformation: ComposeInputTransformation | null;
    outputTransformation: ComposeOutputTransformation | null;
    scrollState: ComposeScrollState;
    shape: ComposeShape;
    colors: ComposeTextFieldColorsValue;
    interactionSource: ComposeInteractionSource | null;
    textFieldState?: never;
    searchBarState?: never;
    suffix?: never;
    keyboardOptions?: never;
    lineLimits?: never;
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
    enabled: boolean;
    readOnly: boolean;
    textStyle: ComposeTextStyle;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    outputTransformation: ComposeOutputTransformation | null;
    shape: ComposeShape;
    colors?: ComposeTextFieldColorsValue;
    interactionSource: ComposeInteractionSource | null;
    textFieldState?: never;
    searchBarState?: never;
    inputTransformation?: never;
    scrollState?: never;
    keyboardOptions?: never;
    lineLimits?: never;
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
    enabled: boolean;
    readOnly: boolean;
    textStyle: ComposeTextStyle;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    outputTransformation: ComposeOutputTransformation | null;
    scrollState: ComposeScrollState;
    shape: ComposeShape;
    colors: ComposeTextFieldColorsValue;
    interactionSource: ComposeInteractionSource | null;
    textFieldState?: never;
    searchBarState?: never;
    inputTransformation?: never;
    keyboardOptions?: never;
    lineLimits?: never;
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
    enabled: boolean;
    readOnly: boolean;
    textStyle: ComposeTextStyle;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    inputTransformation: ComposeInputTransformation | null;
    shape: ComposeShape;
    colors?: ComposeTextFieldColorsValue;
    interactionSource: ComposeInteractionSource | null;
    textFieldState?: never;
    searchBarState?: never;
    outputTransformation?: never;
    scrollState?: never;
    keyboardOptions?: never;
    lineLimits?: never;
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
    enabled: boolean;
    readOnly: boolean;
    textStyle: ComposeTextStyle;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    inputTransformation: ComposeInputTransformation | null;
    scrollState: ComposeScrollState;
    shape: ComposeShape;
    colors: ComposeTextFieldColorsValue;
    interactionSource: ComposeInteractionSource | null;
    textFieldState?: never;
    searchBarState?: never;
    outputTransformation?: never;
    keyboardOptions?: never;
    lineLimits?: never;
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
    enabled: boolean;
    readOnly: boolean;
    textStyle: ComposeTextStyle;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    inputTransformation: ComposeInputTransformation | null;
    outputTransformation: ComposeOutputTransformation | null;
    colors?: ComposeTextFieldColorsValue;
    interactionSource: ComposeInteractionSource | null;
    textFieldState?: never;
    searchBarState?: never;
    scrollState?: never;
    shape?: never;
    keyboardOptions?: never;
    lineLimits?: never;
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
    enabled: boolean;
    readOnly: boolean;
    textStyle: ComposeTextStyle;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    inputTransformation: ComposeInputTransformation | null;
    outputTransformation: ComposeOutputTransformation | null;
    shape: ComposeShape;
    colors?: ComposeTextFieldColorsValue;
    interactionSource?: ComposeInteractionSource | null;
    textFieldState?: never;
    searchBarState?: never;
    scrollState?: never;
    keyboardOptions?: never;
    lineLimits?: never;
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
    enabled: boolean;
    readOnly: boolean;
    textStyle: ComposeTextStyle;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    inputTransformation: ComposeInputTransformation | null;
    outputTransformation: ComposeOutputTransformation | null;
    scrollState: ComposeScrollState;
    colors: ComposeTextFieldColorsValue;
    interactionSource: ComposeInteractionSource | null;
    textFieldState?: never;
    searchBarState?: never;
    shape?: never;
    keyboardOptions?: never;
    lineLimits?: never;
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
    enabled: boolean;
    readOnly: boolean;
    textStyle: ComposeTextStyle;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    inputTransformation: ComposeInputTransformation | null;
    outputTransformation: ComposeOutputTransformation | null;
    scrollState: ComposeScrollState;
    shape: ComposeShape;
    interactionSource: ComposeInteractionSource | null;
    textFieldState?: never;
    searchBarState?: never;
    colors?: never;
    keyboardOptions?: never;
    lineLimits?: never;
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
    enabled: boolean;
    readOnly: boolean;
    textStyle: ComposeTextStyle;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    prefix: ReactNode;
    suffix: ReactNode;
    inputTransformation: ComposeInputTransformation | null;
    outputTransformation: ComposeOutputTransformation | null;
    scrollState: ComposeScrollState;
    shape: ComposeShape;
    colors: ComposeTextFieldColorsValue;
    interactionSource?: ComposeInteractionSource | null;
    textFieldState?: never;
    searchBarState?: never;
    keyboardOptions?: never;
    lineLimits?: never;
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
    colors?: ComposeTextFieldColorsValue;
    interactionSource?: ComposeInteractionSource | null;
    textFieldState?: never;
    searchBarState?: never;
    readOnly?: never;
    textStyle?: never;
    prefix?: never;
    suffix?: never;
    inputTransformation?: never;
    outputTransformation?: never;
    scrollState?: never;
    shape?: never;
    keyboardOptions?: never;
    lineLimits?: never;
    state?: never;
    }
;
export const InputField = createComposableComponent<InputFieldProps>({
  name: "InputField",
  props: ["textFieldState","searchBarState","modifier","enabled","readOnly","textStyle","inputTransformation","outputTransformation","scrollState","shape","colors","interactionSource","keyboardOptions","lineLimits","state","expanded","query"],
  objectProps: ["textFieldState","searchBarState","textStyle","inputTransformation","outputTransformation","scrollState","shape","colors","interactionSource","keyboardOptions","lineLimits","state"],
  slots: ["placeholder","leadingIcon","trailingIcon","prefix","suffix"],
  events: ["onSearch","onExpandedChange","onQueryChange"],
  children: false,
  overloads: [
    { id: "InputField", children: false, parameters: [["textFieldState","object",false,false],["searchBarState","object",false,false],["onSearch","function",false,false],["modifier","ComposeModifier",true,false],["enabled","boolean",true,false],["readOnly","boolean",true,false],["textStyle","object",true,false],["placeholder","ReactNode",true,true],["leadingIcon","ReactNode",true,true],["trailingIcon","ReactNode",true,true],["prefix","ReactNode",true,true],["suffix","ReactNode",true,true],["inputTransformation","object",true,true],["outputTransformation","object",true,true],["scrollState","object",true,false],["shape","shape",true,false],["colors","object",true,false],["interactionSource","object",true,true],["keyboardOptions","object",true,false],["lineLimits","object",true,false]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,123,124,125,126,127,128,129,130,131,132,133,134,135,136,137,138,139,140,141,142,143,144,145,146,147,148,149,150,151,152,153,154,155,156,157,158,159,160,161,162,163,164,165,166,167,168,169,170,171,172,173,174,175,176,177,178,179,180,181,182,183,184,185,186,187,188,189,190,191,192,193,194,195,196,197,198,199,200,201,202,203,204,205,206,207,208,209,210,211,212,213,214,215,216,217,218,219,220,221,222,223,224,225,226,227,228,229,230,231,232,233,234,235,236,237,238,239,240,241,242,243,244,245,246,247,248,249,250,251,252,253,254,255,256,257,258,259,260,261,262,263,264,265,266,267,268,269,270,271,512,513,514,515,516,517,518,519,520,521,522,523,524,525,526,527,768,769,770,771,772,773,774,775,776,777,778,779,780,781,782,783,1024,1025,1026,1027,1028,1029,1030,1031,1032,1033,1034,1035,1036,1037,1038,1039,1040,1041,1042,1043,1044,1045,1046,1047,1048,1049,1050,1051,1052,1053,1054,1055,2048,2049,2050,2051,2052,2053,2054,2055,2056,2057,2058,2059,2060,2061,2062,2063,2064,2065,2066,2067,2068,2069,2070,2071,2072,2073,2074,2075,2076,2077,2078,2079,2080,2081,2082,2083,2084,2085,2086,2087,2088,2089,2090,2091,2092,2093,2094,2095,2096,2097,2098,2099,2100,2101,2102,2103,2104,2105,2106,2107,2108,2109,2110,2111,2112,2113,2114,2115,2116,2117,2118,2119,2120,2121,2122,2123,2124,2125,2126,2127,2128,2129,2130,2131,2132,2133,2134,2135,2136,2137,2138,2139,2140,2141,2142,2143,2144,2145,2146,2147,2148,2149,2150,2151,2152,2153,2154,2155,2156,2157,2158,2159,2160,2161,2162,2163,2164,2165,2166,2167,2168,2169,2170,2171,2172,2173,2174,2175,2176,2177,2178,2179,2180,2181,2182,2183,2184,2185,2186,2187,2188,2189,2190,2191,2192,2193,2194,2195,2196,2197,2198,2199,2200,2201,2202,2203,2204,2205,2206,2207,2208,2209,2210,2211,2212,2213,2214,2215,2216,2217,2218,2219,2220,2221,2222,2223,2224,2225,2226,2227,2228,2229,2230,2231,2232,2233,2234,2235,2236,2237,2238,2239,2240,2241,2242,2243,2244,2245,2246,2247,2248,2249,2250,2251,2252,2253,2254,2255,2256,2257,2258,2259,2260,2261,2262,2263,2264,2265,2266,2267,2268,2269,2270,2271,2272,2273,2274,2275,2276,2277,2278,2279,2280,2281,2282,2283,2284,2285,2286,2287,2288,2289,2290,2291,2292,2293,2294,2295,2296,2297,2298,2299,2300,2301,2302,2303,3071,4096,4097,4098,4099,4100,4101,4102,4103,4104,4105,4106,4107,4108,4109,4110,4111,4112,4113,4114,4115,4116,4117,4118,4119,4120,4121,4122,4123,4124,4125,4126,4127,7167,8191,8192,8193,8194,8195,8196,8197,8198,8199,8200,8201,8202,8203,8204,8205,8206,8207,8208,8209,8210,8211,8212,8213,8214,8215,8216,8217,8218,8219,8220,8221,8222,8223,8224,8225,8226,8227,8228,8229,8230,8231,8232,8233,8234,8235,8236,8237,8238,8239,8240,8241,8242,8243,8244,8245,8246,8247,8248,8249,8250,8251,8252,8253,8254,8255,8256,8257,8258,8259,8260,8261,8262,8263,8264,8265,8266,8267,8268,8269,8270,8271,8272,8273,8274,8275,8276,8277,8278,8279,8280,8281,8282,8283,8284,8285,8286,8287,8288,8289,8290,8291,8292,8293,8294,8295,8296,8297,8298,8299,8300,8301,8302,8303,8304,8305,8306,8307,8308,8309,8310,8311,8312,8313,8314,8315,8316,8317,8318,8319,8320,8321,8322,8323,8324,8325,8326,8327,8328,8329,8330,8331,8332,8333,8334,8335,8336,8337,8338,8339,8340,8341,8342,8343,8344,8345,8346,8347,8348,8349,8350,8351,8352,8353,8354,8355,8356,8357,8358,8359,8360,8361,8362,8363,8364,8365,8366,8367,8368,8369,8370,8371,8372,8373,8374,8375,8376,8377,8378,8379,8380,8381,8382,8383,8384,8385,8386,8387,8388,8389,8390,8391,8392,8393,8394,8395,8396,8397,8398,8399,8400,8401,8402,8403,8404,8405,8406,8407,8408,8409,8410,8411,8412,8413,8414,8415,8416,8417,8418,8419,8420,8421,8422,8423,8424,8425,8426,8427,8428,8429,8430,8431,8432,8433,8434,8435,8436,8437,8438,8439,8440,8441,8442,8443,8444,8445,8446,8447,9215,10240,10241,10242,10243,10244,10245,10246,10247,10248,10249,10250,10251,10252,10253,10254,10255,10256,10257,10258,10259,10260,10261,10262,10263,10264,10265,10266,10267,10268,10269,10270,10271,10272,10273,10274,10275,10276,10277,10278,10279,10280,10281,10282,10283,10284,10285,10286,10287,10288,10289,10290,10291,10292,10293,10294,10295,10296,10297,10298,10299,10300,10301,10302,10303,10304,10305,10306,10307,10308,10309,10310,10311,10312,10313,10314,10315,10316,10317,10318,10319,10320,10321,10322,10323,10324,10325,10326,10327,10328,10329,10330,10331,10332,10333,10334,10335,10336,10337,10338,10339,10340,10341,10342,10343,10344,10345,10346,10347,10348,10349,10350,10351,10352,10353,10354,10355,10356,10357,10358,10359,10360,10361,10362,10363,10364,10365,10366,10367,10368,10369,10370,10371,10372,10373,10374,10375,10376,10377,10378,10379,10380,10381,10382,10383,10384,10385,10386,10387,10388,10389,10390,10391,10392,10393,10394,10395,10396,10397,10398,10399,10400,10401,10402,10403,10404,10405,10406,10407,10408,10409,10410,10411,10412,10413,10414,10415,10416,10417,10418,10419,10420,10421,10422,10423,10424,10425,10426,10427,10428,10429,10430,10431,10432,10433,10434,10435,10436,10437,10438,10439,10440,10441,10442,10443,10444,10445,10446,10447,10448,10449,10450,10451,10452,10453,10454,10455,10456,10457,10458,10459,10460,10461,10462,10463,10464,10465,10466,10467,10468,10469,10470,10471,10472,10473,10474,10475,10476,10477,10478,10479,10480,10481,10482,10483,10484,10485,10486,10487,10488,10489,10490,10491,10492,10493,10494,10495,10751,11007,11135,11199,11231,11247,11255,11259,11261,11262,11263,12287,13311,14335,14847,15103,15231,15295,15327,15343,15351,15355,15357,15358,15359,15871,16127,16255,16319,16351,16367,16375,16379,16381,16382,16383,16384,16385,16386,16387,16392,16393,16394,16395,16400,16401,16402,16403,16408,16409,16410,16411,16640,16641,16642,16643,16896,16897,16898,16899,17152,17153,17154,17155,26879,27647,31743,32767,32768,32769,32770,32771,32776,32777,32778,32779,32784,32785,32786,32787,32792,32793,32794,32795,33024,33025,33026,33027,33280,33281,33282,33283,33536,33537,33538,33539,43263,44031,48127,49151,49152,49408,49409,49410,49411,49664,49665,49666,49667,49920,49921,49922,49923,51455,52223,56319,57343,57599,58367,59519,59583,59615,59631,59639,59643,59645,59646,59647,59903,60159,60287,60351,60383,60399,60407,60411,60413,60414,60415,61439,62463,63487,63999,64255,64383,64447,64479,64495,64503,64507,64509,64510,64511,65023,65279,65407,65471,65503,65519,65527,65531,65533,65534,65535] },
    { id: "InputField#1", children: false, parameters: [["state","object",false,false],["onSearch","function",false,false],["expanded","boolean",false,false],["onExpandedChange","function",false,false],["modifier","ComposeModifier",true,false],["enabled","boolean",true,false],["readOnly","boolean",true,false],["textStyle","object",true,false],["placeholder","ReactNode",true,true],["leadingIcon","ReactNode",true,true],["trailingIcon","ReactNode",true,true],["prefix","ReactNode",true,true],["suffix","ReactNode",true,true],["inputTransformation","object",true,true],["outputTransformation","object",true,true],["scrollState","object",true,false],["shape","shape",true,false],["colors","object",true,false],["interactionSource","object",true,true]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,123,124,125,126,127,128,129,130,131,132,133,134,135,136,137,138,139,140,141,142,143,144,145,146,147,148,149,150,151,152,153,154,155,156,157,158,159,160,161,162,163,164,165,166,167,168,169,170,171,172,173,174,175,176,177,178,179,180,181,182,183,184,185,186,187,188,189,190,191,192,193,194,195,196,197,198,199,200,201,202,203,204,205,206,207,208,209,210,211,212,213,214,215,216,217,218,219,220,221,222,223,224,225,226,227,228,229,230,231,232,233,234,235,236,237,238,239,240,241,242,243,244,245,246,247,248,249,250,251,252,253,254,255,256,257,258,259,260,261,262,263,264,265,266,267,268,269,270,271,512,513,514,515,516,517,518,519,520,521,522,523,524,525,526,527,768,769,770,771,772,773,774,775,776,777,778,779,780,781,782,783,1024,1025,1026,1027,1028,1029,1030,1031,1032,1033,1034,1035,1036,1037,1038,1039,1040,1041,1042,1043,1044,1045,1046,1047,1048,1049,1050,1051,1052,1053,1054,1055,2048,2049,2050,2051,2052,2053,2054,2055,2056,2057,2058,2059,2060,2061,2062,2063,2064,2065,2066,2067,2068,2069,2070,2071,2072,2073,2074,2075,2076,2077,2078,2079,2080,2081,2082,2083,2084,2085,2086,2087,2088,2089,2090,2091,2092,2093,2094,2095,2096,2097,2098,2099,2100,2101,2102,2103,2104,2105,2106,2107,2108,2109,2110,2111,2112,2113,2114,2115,2116,2117,2118,2119,2120,2121,2122,2123,2124,2125,2126,2127,2128,2129,2130,2131,2132,2133,2134,2135,2136,2137,2138,2139,2140,2141,2142,2143,2144,2145,2146,2147,2148,2149,2150,2151,2152,2153,2154,2155,2156,2157,2158,2159,2160,2161,2162,2163,2164,2165,2166,2167,2168,2169,2170,2171,2172,2173,2174,2175,2176,2177,2178,2179,2180,2181,2182,2183,2184,2185,2186,2187,2188,2189,2190,2191,2192,2193,2194,2195,2196,2197,2198,2199,2200,2201,2202,2203,2204,2205,2206,2207,2208,2209,2210,2211,2212,2213,2214,2215,2216,2217,2218,2219,2220,2221,2222,2223,2224,2225,2226,2227,2228,2229,2230,2231,2232,2233,2234,2235,2236,2237,2238,2239,2240,2241,2242,2243,2244,2245,2246,2247,2248,2249,2250,2251,2252,2253,2254,2255,2256,2257,2258,2259,2260,2261,2262,2263,2264,2265,2266,2267,2268,2269,2270,2271,2272,2273,2274,2275,2276,2277,2278,2279,2280,2281,2282,2283,2284,2285,2286,2287,2288,2289,2290,2291,2292,2293,2294,2295,2296,2297,2298,2299,2300,2301,2302,2303,3071,4096,4097,4098,4099,4100,4101,4102,4103,4104,4105,4106,4107,4108,4109,4110,4111,4112,4113,4114,4115,4116,4117,4118,4119,4120,4121,4122,4123,4124,4125,4126,4127,7167,8191,8192,8193,8194,8195,8196,8197,8198,8199,8200,8201,8202,8203,8204,8205,8206,8207,8208,8209,8210,8211,8212,8213,8214,8215,8216,8217,8218,8219,8220,8221,8222,8223,8224,8225,8226,8227,8228,8229,8230,8231,8232,8233,8234,8235,8236,8237,8238,8239,8240,8241,8242,8243,8244,8245,8246,8247,8248,8249,8250,8251,8252,8253,8254,8255,8256,8257,8258,8259,8260,8261,8262,8263,8264,8265,8266,8267,8268,8269,8270,8271,8272,8273,8274,8275,8276,8277,8278,8279,8280,8281,8282,8283,8284,8285,8286,8287,8288,8289,8290,8291,8292,8293,8294,8295,8296,8297,8298,8299,8300,8301,8302,8303,8304,8305,8306,8307,8308,8309,8310,8311,8312,8313,8314,8315,8316,8317,8318,8319,8320,8321,8322,8323,8324,8325,8326,8327,8328,8329,8330,8331,8332,8333,8334,8335,8336,8337,8338,8339,8340,8341,8342,8343,8344,8345,8346,8347,8348,8349,8350,8351,8352,8353,8354,8355,8356,8357,8358,8359,8360,8361,8362,8363,8364,8365,8366,8367,8368,8369,8370,8371,8372,8373,8374,8375,8376,8377,8378,8379,8380,8381,8382,8383,8384,8385,8386,8387,8388,8389,8390,8391,8392,8393,8394,8395,8396,8397,8398,8399,8400,8401,8402,8403,8404,8405,8406,8407,8408,8409,8410,8411,8412,8413,8414,8415,8416,8417,8418,8419,8420,8421,8422,8423,8424,8425,8426,8427,8428,8429,8430,8431,8432,8433,8434,8435,8436,8437,8438,8439,8440,8441,8442,8443,8444,8445,8446,8447,9215,10240,10241,10242,10243,10244,10245,10246,10247,10248,10249,10250,10251,10252,10253,10254,10255,10256,10257,10258,10259,10260,10261,10262,10263,10264,10265,10266,10267,10268,10269,10270,10271,10272,10273,10274,10275,10276,10277,10278,10279,10280,10281,10282,10283,10284,10285,10286,10287,10288,10289,10290,10291,10292,10293,10294,10295,10296,10297,10298,10299,10300,10301,10302,10303,10304,10305,10306,10307,10308,10309,10310,10311,10312,10313,10314,10315,10316,10317,10318,10319,10320,10321,10322,10323,10324,10325,10326,10327,10328,10329,10330,10331,10332,10333,10334,10335,10336,10337,10338,10339,10340,10341,10342,10343,10344,10345,10346,10347,10348,10349,10350,10351,10352,10353,10354,10355,10356,10357,10358,10359,10360,10361,10362,10363,10364,10365,10366,10367,10368,10369,10370,10371,10372,10373,10374,10375,10376,10377,10378,10379,10380,10381,10382,10383,10384,10385,10386,10387,10388,10389,10390,10391,10392,10393,10394,10395,10396,10397,10398,10399,10400,10401,10402,10403,10404,10405,10406,10407,10408,10409,10410,10411,10412,10413,10414,10415,10416,10417,10418,10419,10420,10421,10422,10423,10424,10425,10426,10427,10428,10429,10430,10431,10432,10433,10434,10435,10436,10437,10438,10439,10440,10441,10442,10443,10444,10445,10446,10447,10448,10449,10450,10451,10452,10453,10454,10455,10456,10457,10458,10459,10460,10461,10462,10463,10464,10465,10466,10467,10468,10469,10470,10471,10472,10473,10474,10475,10476,10477,10478,10479,10480,10481,10482,10483,10484,10485,10486,10487,10488,10489,10490,10491,10492,10493,10494,10495,10751,11007,11135,11199,11231,11247,11255,11259,11261,11262,11263,12287,13311,14335,14847,15103,15231,15295,15327,15343,15351,15355,15357,15358,15359,15871,16127,16255,16319,16351,16367,16375,16379,16381,16382,16383] },
    { id: "InputField#2", children: false, controlledText: true, parameters: [["query","string",false,false],["onQueryChange","function",false,false],["onSearch","function",false,false],["expanded","boolean",false,false],["onExpandedChange","function",false,false],["modifier","ComposeModifier",true,false],["enabled","boolean",true,false],["placeholder","ReactNode",true,true],["leadingIcon","ReactNode",true,true],["trailingIcon","ReactNode",true,true],["colors","object",true,false],["interactionSource","object",true,true]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63] },
  ],
});
