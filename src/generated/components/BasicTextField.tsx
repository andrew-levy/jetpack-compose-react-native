// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeBrush } from "../../utils/modifier";
import type { ComposeInputTransformation, ComposeKeyboardActions, ComposeKeyboardOptions, ComposeOutputTransformation, ComposeScrollState, ComposeTextFieldLineLimits, ComposeTextFieldSnapshot, ComposeTextFieldState, ComposeTextFieldValue, ComposeTextLayout, ComposeTextStyle, ComposeVisualTransformation } from "../../utils/composeValues";
import type { ComposeInteractionSource } from "../../utils/nativeHandles";

export type BasicTextFieldProps =
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    decorator?: ReactNode;
    scrollState?: ComposeScrollState;
    enabled?: never;
    readOnly?: never;
    inputTransformation?: never;
    textStyle?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    onTextLayout?: never;
    interactionSource?: never;
    cursorBrush?: never;
    outputTransformation?: never;
    value?: never;
    onValueChange?: never;
    keyboardActions?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    inputTransformation?: ComposeInputTransformation | null;
    keyboardOptions?: ComposeKeyboardOptions;
    outputTransformation: ComposeOutputTransformation | null;
    enabled?: never;
    readOnly?: never;
    textStyle?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    onTextLayout?: never;
    interactionSource?: never;
    cursorBrush?: never;
    decorator?: never;
    scrollState?: never;
    value?: never;
    onValueChange?: never;
    keyboardActions?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly?: boolean;
    textStyle?: ComposeTextStyle;
    cursorBrush: ComposeBrush;
    inputTransformation?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    onTextLayout?: never;
    interactionSource?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    value?: never;
    onValueChange?: never;
    keyboardActions?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    readOnly?: boolean;
    textStyle?: ComposeTextStyle;
    interactionSource: ComposeInteractionSource | null;
    cursorBrush?: ComposeBrush;
    enabled?: never;
    inputTransformation?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    onTextLayout?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    value?: never;
    onValueChange?: never;
    keyboardActions?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    onTextLayout: ((value: ComposeTextLayout) => void) | null;
    scrollState?: ComposeScrollState;
    enabled?: never;
    readOnly?: never;
    inputTransformation?: never;
    textStyle?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    interactionSource?: never;
    cursorBrush?: never;
    outputTransformation?: never;
    decorator?: never;
    value?: never;
    onValueChange?: never;
    keyboardActions?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    onTextLayout: ((value: ComposeTextLayout) => void) | null;
    decorator: ReactNode;
    enabled?: never;
    readOnly?: never;
    inputTransformation?: never;
    textStyle?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    interactionSource?: never;
    cursorBrush?: never;
    outputTransformation?: never;
    scrollState?: never;
    value?: never;
    onValueChange?: never;
    keyboardActions?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    inputTransformation?: ComposeInputTransformation | null;
    keyboardOptions?: ComposeKeyboardOptions;
    lineLimits: ComposeTextFieldLineLimits;
    outputTransformation?: ComposeOutputTransformation | null;
    enabled?: never;
    readOnly?: never;
    textStyle?: never;
    onKeyboardAction?: never;
    onTextLayout?: never;
    interactionSource?: never;
    cursorBrush?: never;
    decorator?: never;
    scrollState?: never;
    value?: never;
    onValueChange?: never;
    keyboardActions?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    lineLimits: ComposeTextFieldLineLimits;
    interactionSource: ComposeInteractionSource | null;
    readOnly?: never;
    inputTransformation?: never;
    textStyle?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    onTextLayout?: never;
    cursorBrush?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    value?: never;
    onValueChange?: never;
    keyboardActions?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    onKeyboardAction: (() => void) | null;
    lineLimits?: ComposeTextFieldLineLimits;
    outputTransformation?: ComposeOutputTransformation | null;
    enabled?: never;
    readOnly?: never;
    inputTransformation?: never;
    textStyle?: never;
    keyboardOptions?: never;
    onTextLayout?: never;
    interactionSource?: never;
    cursorBrush?: never;
    decorator?: never;
    scrollState?: never;
    value?: never;
    onValueChange?: never;
    keyboardActions?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    onKeyboardAction: (() => void) | null;
    interactionSource: ComposeInteractionSource | null;
    readOnly?: never;
    inputTransformation?: never;
    textStyle?: never;
    keyboardOptions?: never;
    lineLimits?: never;
    onTextLayout?: never;
    cursorBrush?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    value?: never;
    onValueChange?: never;
    keyboardActions?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    keyboardOptions: ComposeKeyboardOptions;
    scrollState?: ComposeScrollState;
    enabled?: never;
    readOnly?: never;
    inputTransformation?: never;
    textStyle?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    onTextLayout?: never;
    interactionSource?: never;
    cursorBrush?: never;
    outputTransformation?: never;
    decorator?: never;
    value?: never;
    onValueChange?: never;
    keyboardActions?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    keyboardOptions: ComposeKeyboardOptions;
    decorator: ReactNode;
    enabled?: never;
    readOnly?: never;
    inputTransformation?: never;
    textStyle?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    onTextLayout?: never;
    interactionSource?: never;
    cursorBrush?: never;
    outputTransformation?: never;
    scrollState?: never;
    value?: never;
    onValueChange?: never;
    keyboardActions?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    readOnly?: boolean;
    textStyle?: ComposeTextStyle;
    keyboardOptions: ComposeKeyboardOptions;
    interactionSource: ComposeInteractionSource | null;
    enabled?: never;
    inputTransformation?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    onTextLayout?: never;
    cursorBrush?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    value?: never;
    onValueChange?: never;
    keyboardActions?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    keyboardOptions: ComposeKeyboardOptions;
    onTextLayout: ((value: ComposeTextLayout) => void) | null;
    enabled?: never;
    readOnly?: never;
    inputTransformation?: never;
    textStyle?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    interactionSource?: never;
    cursorBrush?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    value?: never;
    onValueChange?: never;
    keyboardActions?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    keyboardOptions: ComposeKeyboardOptions;
    onKeyboardAction: (() => void) | null;
    outputTransformation?: ComposeOutputTransformation | null;
    enabled?: never;
    readOnly?: never;
    inputTransformation?: never;
    textStyle?: never;
    lineLimits?: never;
    onTextLayout?: never;
    interactionSource?: never;
    cursorBrush?: never;
    decorator?: never;
    scrollState?: never;
    value?: never;
    onValueChange?: never;
    keyboardActions?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    keyboardOptions: ComposeKeyboardOptions;
    onKeyboardAction: (() => void) | null;
    lineLimits: ComposeTextFieldLineLimits;
    outputTransformation: ComposeOutputTransformation | null;
    enabled?: never;
    readOnly?: never;
    inputTransformation?: never;
    textStyle?: never;
    onTextLayout?: never;
    interactionSource?: never;
    cursorBrush?: never;
    decorator?: never;
    scrollState?: never;
    value?: never;
    onValueChange?: never;
    keyboardActions?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    textStyle: ComposeTextStyle;
    keyboardOptions?: ComposeKeyboardOptions;
    scrollState?: ComposeScrollState;
    enabled?: never;
    readOnly?: never;
    inputTransformation?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    onTextLayout?: never;
    interactionSource?: never;
    cursorBrush?: never;
    outputTransformation?: never;
    decorator?: never;
    value?: never;
    onValueChange?: never;
    keyboardActions?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    textStyle: ComposeTextStyle;
    keyboardOptions?: ComposeKeyboardOptions;
    decorator: ReactNode;
    enabled?: never;
    readOnly?: never;
    inputTransformation?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    onTextLayout?: never;
    interactionSource?: never;
    cursorBrush?: never;
    outputTransformation?: never;
    scrollState?: never;
    value?: never;
    onValueChange?: never;
    keyboardActions?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    textStyle: ComposeTextStyle;
    keyboardOptions?: ComposeKeyboardOptions;
    onTextLayout: ((value: ComposeTextLayout) => void) | null;
    enabled?: never;
    readOnly?: never;
    inputTransformation?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    interactionSource?: never;
    cursorBrush?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    value?: never;
    onValueChange?: never;
    keyboardActions?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    textStyle: ComposeTextStyle;
    lineLimits: ComposeTextFieldLineLimits;
    interactionSource?: ComposeInteractionSource | null;
    readOnly?: never;
    inputTransformation?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    onTextLayout?: never;
    cursorBrush?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    value?: never;
    onValueChange?: never;
    keyboardActions?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    textStyle: ComposeTextStyle;
    onKeyboardAction: (() => void) | null;
    interactionSource?: ComposeInteractionSource | null;
    readOnly?: never;
    inputTransformation?: never;
    keyboardOptions?: never;
    lineLimits?: never;
    onTextLayout?: never;
    cursorBrush?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    value?: never;
    onValueChange?: never;
    keyboardActions?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    inputTransformation: ComposeInputTransformation | null;
    keyboardOptions?: ComposeKeyboardOptions;
    scrollState?: ComposeScrollState;
    readOnly?: never;
    textStyle?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    onTextLayout?: never;
    interactionSource?: never;
    cursorBrush?: never;
    outputTransformation?: never;
    decorator?: never;
    value?: never;
    onValueChange?: never;
    keyboardActions?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    inputTransformation: ComposeInputTransformation | null;
    textStyle?: ComposeTextStyle;
    keyboardOptions?: ComposeKeyboardOptions;
    decorator: ReactNode;
    enabled?: never;
    readOnly?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    onTextLayout?: never;
    interactionSource?: never;
    cursorBrush?: never;
    outputTransformation?: never;
    scrollState?: never;
    value?: never;
    onValueChange?: never;
    keyboardActions?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    inputTransformation: ComposeInputTransformation | null;
    textStyle?: ComposeTextStyle;
    keyboardOptions?: ComposeKeyboardOptions;
    onTextLayout: ((value: ComposeTextLayout) => void) | null;
    enabled?: never;
    readOnly?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    interactionSource?: never;
    cursorBrush?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    value?: never;
    onValueChange?: never;
    keyboardActions?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    inputTransformation: ComposeInputTransformation | null;
    keyboardOptions?: ComposeKeyboardOptions;
    onKeyboardAction: (() => void) | null;
    lineLimits?: ComposeTextFieldLineLimits;
    outputTransformation?: ComposeOutputTransformation | null;
    readOnly?: never;
    textStyle?: never;
    onTextLayout?: never;
    interactionSource?: never;
    cursorBrush?: never;
    decorator?: never;
    scrollState?: never;
    value?: never;
    onValueChange?: never;
    keyboardActions?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    inputTransformation: ComposeInputTransformation | null;
    textStyle: ComposeTextStyle;
    keyboardOptions?: ComposeKeyboardOptions;
    scrollState: ComposeScrollState;
    readOnly?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    onTextLayout?: never;
    interactionSource?: never;
    cursorBrush?: never;
    outputTransformation?: never;
    decorator?: never;
    value?: never;
    onValueChange?: never;
    keyboardActions?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    readOnly: boolean;
    textStyle?: ComposeTextStyle;
    keyboardOptions?: ComposeKeyboardOptions;
    scrollState?: ComposeScrollState;
    enabled?: never;
    inputTransformation?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    onTextLayout?: never;
    interactionSource?: never;
    cursorBrush?: never;
    outputTransformation?: never;
    decorator?: never;
    value?: never;
    onValueChange?: never;
    keyboardActions?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    readOnly: boolean;
    inputTransformation?: ComposeInputTransformation | null;
    textStyle?: ComposeTextStyle;
    keyboardOptions?: ComposeKeyboardOptions;
    decorator: ReactNode;
    enabled?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    onTextLayout?: never;
    interactionSource?: never;
    cursorBrush?: never;
    outputTransformation?: never;
    scrollState?: never;
    value?: never;
    onValueChange?: never;
    keyboardActions?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    readOnly: boolean;
    inputTransformation?: ComposeInputTransformation | null;
    textStyle?: ComposeTextStyle;
    keyboardOptions?: ComposeKeyboardOptions;
    onTextLayout: ((value: ComposeTextLayout) => void) | null;
    enabled?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    interactionSource?: never;
    cursorBrush?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    value?: never;
    onValueChange?: never;
    keyboardActions?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    readOnly: boolean;
    textStyle?: ComposeTextStyle;
    lineLimits: ComposeTextFieldLineLimits;
    interactionSource?: ComposeInteractionSource | null;
    enabled?: never;
    inputTransformation?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    onTextLayout?: never;
    cursorBrush?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    value?: never;
    onValueChange?: never;
    keyboardActions?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    readOnly: boolean;
    textStyle?: ComposeTextStyle;
    onKeyboardAction: (() => void) | null;
    interactionSource?: ComposeInteractionSource | null;
    enabled?: never;
    inputTransformation?: never;
    keyboardOptions?: never;
    lineLimits?: never;
    onTextLayout?: never;
    cursorBrush?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    value?: never;
    onValueChange?: never;
    keyboardActions?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    readOnly: boolean;
    textStyle: ComposeTextStyle;
    keyboardOptions: ComposeKeyboardOptions;
    onKeyboardAction: (() => void) | null;
    lineLimits: ComposeTextFieldLineLimits;
    interactionSource: ComposeInteractionSource | null;
    cursorBrush: ComposeBrush;
    enabled?: never;
    inputTransformation?: never;
    onTextLayout?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    value?: never;
    onValueChange?: never;
    keyboardActions?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly: boolean;
    inputTransformation: ComposeInputTransformation | null;
    textStyle?: ComposeTextStyle;
    keyboardOptions?: ComposeKeyboardOptions;
    scrollState: ComposeScrollState;
    onKeyboardAction?: never;
    lineLimits?: never;
    onTextLayout?: never;
    interactionSource?: never;
    cursorBrush?: never;
    outputTransformation?: never;
    decorator?: never;
    value?: never;
    onValueChange?: never;
    keyboardActions?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    readOnly: boolean;
    inputTransformation: ComposeInputTransformation | null;
    textStyle: ComposeTextStyle;
    keyboardOptions: ComposeKeyboardOptions;
    onKeyboardAction: (() => void) | null;
    lineLimits: ComposeTextFieldLineLimits;
    interactionSource: ComposeInteractionSource | null;
    cursorBrush: ComposeBrush;
    outputTransformation: ComposeOutputTransformation | null;
    enabled?: never;
    onTextLayout?: never;
    decorator?: never;
    scrollState?: never;
    value?: never;
    onValueChange?: never;
    keyboardActions?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    readOnly: boolean;
    inputTransformation: ComposeInputTransformation | null;
    textStyle: ComposeTextStyle;
    keyboardOptions: ComposeKeyboardOptions;
    onKeyboardAction: (() => void) | null;
    lineLimits: ComposeTextFieldLineLimits;
    onTextLayout: ((value: ComposeTextLayout) => void) | null;
    interactionSource: ComposeInteractionSource | null;
    cursorBrush: ComposeBrush;
    outputTransformation: ComposeOutputTransformation | null;
    decorator: ReactNode;
    scrollState: ComposeScrollState;
    enabled?: never;
    value?: never;
    onValueChange?: never;
    keyboardActions?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    readOnly?: boolean;
    textStyle?: ComposeTextStyle;
    keyboardOptions?: ComposeKeyboardOptions;
    scrollState?: ComposeScrollState;
    inputTransformation?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    onTextLayout?: never;
    interactionSource?: never;
    cursorBrush?: never;
    outputTransformation?: never;
    decorator?: never;
    value?: never;
    onValueChange?: never;
    keyboardActions?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    readOnly?: boolean;
    inputTransformation?: ComposeInputTransformation | null;
    textStyle?: ComposeTextStyle;
    keyboardOptions?: ComposeKeyboardOptions;
    decorator: ReactNode;
    onKeyboardAction?: never;
    lineLimits?: never;
    onTextLayout?: never;
    interactionSource?: never;
    cursorBrush?: never;
    outputTransformation?: never;
    scrollState?: never;
    value?: never;
    onValueChange?: never;
    keyboardActions?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    outputTransformation: ComposeOutputTransformation | null;
    readOnly?: never;
    inputTransformation?: never;
    textStyle?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    onTextLayout?: never;
    interactionSource?: never;
    cursorBrush?: never;
    decorator?: never;
    scrollState?: never;
    value?: never;
    onValueChange?: never;
    keyboardActions?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    textStyle?: ComposeTextStyle;
    interactionSource: ComposeInteractionSource | null;
    cursorBrush?: ComposeBrush;
    readOnly?: never;
    inputTransformation?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    onTextLayout?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    value?: never;
    onValueChange?: never;
    keyboardActions?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    readOnly?: boolean;
    inputTransformation?: ComposeInputTransformation | null;
    textStyle?: ComposeTextStyle;
    keyboardOptions?: ComposeKeyboardOptions;
    onTextLayout: ((value: ComposeTextLayout) => void) | null;
    onKeyboardAction?: never;
    lineLimits?: never;
    interactionSource?: never;
    cursorBrush?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    value?: never;
    onValueChange?: never;
    keyboardActions?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    lineLimits: ComposeTextFieldLineLimits;
    outputTransformation?: ComposeOutputTransformation | null;
    readOnly?: never;
    inputTransformation?: never;
    textStyle?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    onTextLayout?: never;
    interactionSource?: never;
    cursorBrush?: never;
    decorator?: never;
    scrollState?: never;
    value?: never;
    onValueChange?: never;
    keyboardActions?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    onKeyboardAction: (() => void) | null;
    outputTransformation?: ComposeOutputTransformation | null;
    readOnly?: never;
    inputTransformation?: never;
    textStyle?: never;
    keyboardOptions?: never;
    lineLimits?: never;
    onTextLayout?: never;
    interactionSource?: never;
    cursorBrush?: never;
    decorator?: never;
    scrollState?: never;
    value?: never;
    onValueChange?: never;
    keyboardActions?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    onKeyboardAction: (() => void) | null;
    lineLimits: ComposeTextFieldLineLimits;
    outputTransformation: ComposeOutputTransformation | null;
    readOnly?: never;
    inputTransformation?: never;
    textStyle?: never;
    keyboardOptions?: never;
    onTextLayout?: never;
    interactionSource?: never;
    cursorBrush?: never;
    decorator?: never;
    scrollState?: never;
    value?: never;
    onValueChange?: never;
    keyboardActions?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    keyboardOptions: ComposeKeyboardOptions;
    onKeyboardAction?: (() => void) | null;
    lineLimits?: ComposeTextFieldLineLimits;
    outputTransformation: ComposeOutputTransformation | null;
    readOnly?: never;
    inputTransformation?: never;
    textStyle?: never;
    onTextLayout?: never;
    interactionSource?: never;
    cursorBrush?: never;
    decorator?: never;
    scrollState?: never;
    value?: never;
    onValueChange?: never;
    keyboardActions?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    textStyle?: ComposeTextStyle;
    keyboardOptions: ComposeKeyboardOptions;
    interactionSource: ComposeInteractionSource | null;
    readOnly?: never;
    inputTransformation?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    onTextLayout?: never;
    cursorBrush?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    value?: never;
    onValueChange?: never;
    keyboardActions?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    textStyle: ComposeTextStyle;
    keyboardOptions: ComposeKeyboardOptions;
    onKeyboardAction: (() => void) | null;
    lineLimits: ComposeTextFieldLineLimits;
    interactionSource: ComposeInteractionSource | null;
    cursorBrush: ComposeBrush;
    readOnly?: never;
    inputTransformation?: never;
    onTextLayout?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    value?: never;
    onValueChange?: never;
    keyboardActions?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    inputTransformation: ComposeInputTransformation | null;
    keyboardOptions?: ComposeKeyboardOptions;
    outputTransformation: ComposeOutputTransformation | null;
    readOnly?: never;
    textStyle?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    onTextLayout?: never;
    interactionSource?: never;
    cursorBrush?: never;
    decorator?: never;
    scrollState?: never;
    value?: never;
    onValueChange?: never;
    keyboardActions?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    inputTransformation: ComposeInputTransformation | null;
    keyboardOptions?: ComposeKeyboardOptions;
    lineLimits: ComposeTextFieldLineLimits;
    outputTransformation?: ComposeOutputTransformation | null;
    readOnly?: never;
    textStyle?: never;
    onKeyboardAction?: never;
    onTextLayout?: never;
    interactionSource?: never;
    cursorBrush?: never;
    decorator?: never;
    scrollState?: never;
    value?: never;
    onValueChange?: never;
    keyboardActions?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    inputTransformation: ComposeInputTransformation | null;
    textStyle: ComposeTextStyle;
    keyboardOptions: ComposeKeyboardOptions;
    onKeyboardAction: (() => void) | null;
    lineLimits: ComposeTextFieldLineLimits;
    interactionSource: ComposeInteractionSource | null;
    cursorBrush: ComposeBrush;
    outputTransformation: ComposeOutputTransformation | null;
    readOnly?: never;
    onTextLayout?: never;
    decorator?: never;
    scrollState?: never;
    value?: never;
    onValueChange?: never;
    keyboardActions?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    inputTransformation: ComposeInputTransformation | null;
    textStyle: ComposeTextStyle;
    keyboardOptions: ComposeKeyboardOptions;
    onKeyboardAction: (() => void) | null;
    lineLimits: ComposeTextFieldLineLimits;
    onTextLayout: ((value: ComposeTextLayout) => void) | null;
    interactionSource: ComposeInteractionSource | null;
    cursorBrush: ComposeBrush;
    outputTransformation: ComposeOutputTransformation | null;
    decorator: ReactNode;
    scrollState: ComposeScrollState;
    readOnly?: never;
    value?: never;
    onValueChange?: never;
    keyboardActions?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    readOnly: boolean;
    interactionSource: ComposeInteractionSource | null;
    cursorBrush?: ComposeBrush;
    inputTransformation?: never;
    textStyle?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    onTextLayout?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    value?: never;
    onValueChange?: never;
    keyboardActions?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    readOnly: boolean;
    lineLimits: ComposeTextFieldLineLimits;
    interactionSource?: ComposeInteractionSource | null;
    inputTransformation?: never;
    textStyle?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    onTextLayout?: never;
    cursorBrush?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    value?: never;
    onValueChange?: never;
    keyboardActions?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    readOnly: boolean;
    onKeyboardAction: (() => void) | null;
    interactionSource?: ComposeInteractionSource | null;
    inputTransformation?: never;
    textStyle?: never;
    keyboardOptions?: never;
    lineLimits?: never;
    onTextLayout?: never;
    cursorBrush?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    value?: never;
    onValueChange?: never;
    keyboardActions?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    readOnly: boolean;
    keyboardOptions: ComposeKeyboardOptions;
    interactionSource: ComposeInteractionSource | null;
    inputTransformation?: never;
    textStyle?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    onTextLayout?: never;
    cursorBrush?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    value?: never;
    onValueChange?: never;
    keyboardActions?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    readOnly: boolean;
    keyboardOptions: ComposeKeyboardOptions;
    onKeyboardAction: (() => void) | null;
    lineLimits: ComposeTextFieldLineLimits;
    interactionSource: ComposeInteractionSource | null;
    cursorBrush: ComposeBrush;
    inputTransformation?: never;
    textStyle?: never;
    onTextLayout?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    value?: never;
    onValueChange?: never;
    keyboardActions?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    readOnly: boolean;
    textStyle: ComposeTextStyle;
    lineLimits?: ComposeTextFieldLineLimits;
    interactionSource: ComposeInteractionSource | null;
    cursorBrush?: ComposeBrush;
    inputTransformation?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    onTextLayout?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    value?: never;
    onValueChange?: never;
    keyboardActions?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    readOnly: boolean;
    textStyle: ComposeTextStyle;
    lineLimits: ComposeTextFieldLineLimits;
    inputTransformation?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    onTextLayout?: never;
    interactionSource?: never;
    cursorBrush?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    value?: never;
    onValueChange?: never;
    keyboardActions?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    readOnly: boolean;
    textStyle: ComposeTextStyle;
    onKeyboardAction: (() => void) | null;
    inputTransformation?: never;
    keyboardOptions?: never;
    lineLimits?: never;
    onTextLayout?: never;
    interactionSource?: never;
    cursorBrush?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    value?: never;
    onValueChange?: never;
    keyboardActions?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    readOnly: boolean;
    textStyle: ComposeTextStyle;
    onKeyboardAction: (() => void) | null;
    interactionSource: ComposeInteractionSource | null;
    cursorBrush?: ComposeBrush;
    inputTransformation?: never;
    keyboardOptions?: never;
    lineLimits?: never;
    onTextLayout?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    value?: never;
    onValueChange?: never;
    keyboardActions?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    readOnly: boolean;
    textStyle: ComposeTextStyle;
    onKeyboardAction: (() => void) | null;
    lineLimits: ComposeTextFieldLineLimits;
    interactionSource: ComposeInteractionSource | null;
    cursorBrush: ComposeBrush;
    inputTransformation?: never;
    keyboardOptions?: never;
    onTextLayout?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    value?: never;
    onValueChange?: never;
    keyboardActions?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    readOnly: boolean;
    textStyle: ComposeTextStyle;
    keyboardOptions: ComposeKeyboardOptions;
    interactionSource: ComposeInteractionSource | null;
    cursorBrush?: ComposeBrush;
    inputTransformation?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    onTextLayout?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    value?: never;
    onValueChange?: never;
    keyboardActions?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    readOnly: boolean;
    textStyle: ComposeTextStyle;
    keyboardOptions: ComposeKeyboardOptions;
    lineLimits: ComposeTextFieldLineLimits;
    interactionSource: ComposeInteractionSource | null;
    cursorBrush: ComposeBrush;
    inputTransformation?: never;
    onKeyboardAction?: never;
    onTextLayout?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    value?: never;
    onValueChange?: never;
    keyboardActions?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    readOnly: boolean;
    textStyle: ComposeTextStyle;
    keyboardOptions: ComposeKeyboardOptions;
    onKeyboardAction: (() => void) | null;
    interactionSource: ComposeInteractionSource | null;
    cursorBrush: ComposeBrush;
    inputTransformation?: never;
    lineLimits?: never;
    onTextLayout?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    value?: never;
    onValueChange?: never;
    keyboardActions?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    readOnly: boolean;
    textStyle: ComposeTextStyle;
    keyboardOptions: ComposeKeyboardOptions;
    onKeyboardAction: (() => void) | null;
    lineLimits: ComposeTextFieldLineLimits;
    cursorBrush: ComposeBrush;
    inputTransformation?: never;
    onTextLayout?: never;
    interactionSource?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    value?: never;
    onValueChange?: never;
    keyboardActions?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    readOnly: boolean;
    textStyle: ComposeTextStyle;
    keyboardOptions: ComposeKeyboardOptions;
    onKeyboardAction: (() => void) | null;
    lineLimits: ComposeTextFieldLineLimits;
    interactionSource: ComposeInteractionSource | null;
    inputTransformation?: never;
    onTextLayout?: never;
    cursorBrush?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    value?: never;
    onValueChange?: never;
    keyboardActions?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    readOnly: boolean;
    textStyle: ComposeTextStyle;
    keyboardOptions: ComposeKeyboardOptions;
    onKeyboardAction: (() => void) | null;
    lineLimits: ComposeTextFieldLineLimits;
    interactionSource: ComposeInteractionSource | null;
    cursorBrush: ComposeBrush;
    outputTransformation?: ComposeOutputTransformation | null;
    inputTransformation?: never;
    onTextLayout?: never;
    decorator?: never;
    scrollState?: never;
    value?: never;
    onValueChange?: never;
    keyboardActions?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    readOnly: boolean;
    textStyle: ComposeTextStyle;
    keyboardOptions: ComposeKeyboardOptions;
    onKeyboardAction: (() => void) | null;
    lineLimits: ComposeTextFieldLineLimits;
    onTextLayout: ((value: ComposeTextLayout) => void) | null;
    interactionSource: ComposeInteractionSource | null;
    cursorBrush: ComposeBrush;
    outputTransformation: ComposeOutputTransformation | null;
    decorator: ReactNode;
    scrollState: ComposeScrollState;
    inputTransformation?: never;
    value?: never;
    onValueChange?: never;
    keyboardActions?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    readOnly: boolean;
    inputTransformation: ComposeInputTransformation | null;
    keyboardOptions: ComposeKeyboardOptions;
    onKeyboardAction: (() => void) | null;
    lineLimits: ComposeTextFieldLineLimits;
    interactionSource: ComposeInteractionSource | null;
    cursorBrush: ComposeBrush;
    outputTransformation: ComposeOutputTransformation | null;
    textStyle?: never;
    onTextLayout?: never;
    decorator?: never;
    scrollState?: never;
    value?: never;
    onValueChange?: never;
    keyboardActions?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    readOnly: boolean;
    inputTransformation: ComposeInputTransformation | null;
    keyboardOptions: ComposeKeyboardOptions;
    onKeyboardAction: (() => void) | null;
    lineLimits: ComposeTextFieldLineLimits;
    onTextLayout: ((value: ComposeTextLayout) => void) | null;
    interactionSource: ComposeInteractionSource | null;
    cursorBrush: ComposeBrush;
    outputTransformation: ComposeOutputTransformation | null;
    decorator: ReactNode;
    scrollState: ComposeScrollState;
    textStyle?: never;
    value?: never;
    onValueChange?: never;
    keyboardActions?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    readOnly: boolean;
    inputTransformation: ComposeInputTransformation | null;
    textStyle: ComposeTextStyle;
    onKeyboardAction: (() => void) | null;
    lineLimits: ComposeTextFieldLineLimits;
    interactionSource: ComposeInteractionSource | null;
    cursorBrush: ComposeBrush;
    outputTransformation: ComposeOutputTransformation | null;
    keyboardOptions?: never;
    onTextLayout?: never;
    decorator?: never;
    scrollState?: never;
    value?: never;
    onValueChange?: never;
    keyboardActions?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    readOnly: boolean;
    inputTransformation: ComposeInputTransformation | null;
    textStyle: ComposeTextStyle;
    onKeyboardAction: (() => void) | null;
    lineLimits: ComposeTextFieldLineLimits;
    onTextLayout: ((value: ComposeTextLayout) => void) | null;
    interactionSource: ComposeInteractionSource | null;
    cursorBrush: ComposeBrush;
    outputTransformation: ComposeOutputTransformation | null;
    decorator: ReactNode;
    scrollState: ComposeScrollState;
    keyboardOptions?: never;
    value?: never;
    onValueChange?: never;
    keyboardActions?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    readOnly: boolean;
    inputTransformation: ComposeInputTransformation | null;
    textStyle: ComposeTextStyle;
    keyboardOptions: ComposeKeyboardOptions;
    lineLimits: ComposeTextFieldLineLimits;
    interactionSource: ComposeInteractionSource | null;
    cursorBrush: ComposeBrush;
    outputTransformation: ComposeOutputTransformation | null;
    onKeyboardAction?: never;
    onTextLayout?: never;
    decorator?: never;
    scrollState?: never;
    value?: never;
    onValueChange?: never;
    keyboardActions?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    readOnly: boolean;
    inputTransformation: ComposeInputTransformation | null;
    textStyle: ComposeTextStyle;
    keyboardOptions: ComposeKeyboardOptions;
    lineLimits: ComposeTextFieldLineLimits;
    onTextLayout: ((value: ComposeTextLayout) => void) | null;
    interactionSource: ComposeInteractionSource | null;
    cursorBrush: ComposeBrush;
    outputTransformation: ComposeOutputTransformation | null;
    decorator: ReactNode;
    scrollState: ComposeScrollState;
    onKeyboardAction?: never;
    value?: never;
    onValueChange?: never;
    keyboardActions?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    readOnly: boolean;
    inputTransformation: ComposeInputTransformation | null;
    textStyle: ComposeTextStyle;
    keyboardOptions: ComposeKeyboardOptions;
    onKeyboardAction: (() => void) | null;
    interactionSource: ComposeInteractionSource | null;
    cursorBrush: ComposeBrush;
    outputTransformation: ComposeOutputTransformation | null;
    lineLimits?: never;
    onTextLayout?: never;
    decorator?: never;
    scrollState?: never;
    value?: never;
    onValueChange?: never;
    keyboardActions?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    readOnly: boolean;
    inputTransformation: ComposeInputTransformation | null;
    textStyle: ComposeTextStyle;
    keyboardOptions: ComposeKeyboardOptions;
    onKeyboardAction: (() => void) | null;
    onTextLayout: ((value: ComposeTextLayout) => void) | null;
    interactionSource: ComposeInteractionSource | null;
    cursorBrush: ComposeBrush;
    outputTransformation: ComposeOutputTransformation | null;
    decorator: ReactNode;
    scrollState: ComposeScrollState;
    lineLimits?: never;
    value?: never;
    onValueChange?: never;
    keyboardActions?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    readOnly: boolean;
    inputTransformation: ComposeInputTransformation | null;
    textStyle: ComposeTextStyle;
    keyboardOptions: ComposeKeyboardOptions;
    onKeyboardAction: (() => void) | null;
    lineLimits: ComposeTextFieldLineLimits;
    cursorBrush: ComposeBrush;
    outputTransformation: ComposeOutputTransformation | null;
    onTextLayout?: never;
    interactionSource?: never;
    decorator?: never;
    scrollState?: never;
    value?: never;
    onValueChange?: never;
    keyboardActions?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    readOnly: boolean;
    inputTransformation: ComposeInputTransformation | null;
    textStyle: ComposeTextStyle;
    keyboardOptions: ComposeKeyboardOptions;
    onKeyboardAction: (() => void) | null;
    lineLimits: ComposeTextFieldLineLimits;
    interactionSource: ComposeInteractionSource | null;
    outputTransformation: ComposeOutputTransformation | null;
    onTextLayout?: never;
    cursorBrush?: never;
    decorator?: never;
    scrollState?: never;
    value?: never;
    onValueChange?: never;
    keyboardActions?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    readOnly: boolean;
    inputTransformation: ComposeInputTransformation | null;
    textStyle: ComposeTextStyle;
    keyboardOptions: ComposeKeyboardOptions;
    onKeyboardAction: (() => void) | null;
    lineLimits: ComposeTextFieldLineLimits;
    interactionSource: ComposeInteractionSource | null;
    cursorBrush: ComposeBrush;
    onTextLayout?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    value?: never;
    onValueChange?: never;
    keyboardActions?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    readOnly: boolean;
    inputTransformation: ComposeInputTransformation | null;
    textStyle: ComposeTextStyle;
    keyboardOptions: ComposeKeyboardOptions;
    onKeyboardAction: (() => void) | null;
    lineLimits: ComposeTextFieldLineLimits;
    onTextLayout?: ((value: ComposeTextLayout) => void) | null;
    interactionSource: ComposeInteractionSource | null;
    cursorBrush: ComposeBrush;
    outputTransformation: ComposeOutputTransformation | null;
    decorator?: ReactNode;
    scrollState?: ComposeScrollState;
    value?: never;
    onValueChange?: never;
    keyboardActions?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    readOnly: boolean;
    inputTransformation: ComposeInputTransformation | null;
    textStyle: ComposeTextStyle;
    keyboardOptions: ComposeKeyboardOptions;
    onKeyboardAction: (() => void) | null;
    lineLimits: ComposeTextFieldLineLimits;
    onTextLayout: ((value: ComposeTextLayout) => void) | null;
    cursorBrush: ComposeBrush;
    outputTransformation: ComposeOutputTransformation | null;
    decorator: ReactNode;
    scrollState: ComposeScrollState;
    interactionSource?: never;
    value?: never;
    onValueChange?: never;
    keyboardActions?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    readOnly: boolean;
    inputTransformation: ComposeInputTransformation | null;
    textStyle: ComposeTextStyle;
    keyboardOptions: ComposeKeyboardOptions;
    onKeyboardAction: (() => void) | null;
    lineLimits: ComposeTextFieldLineLimits;
    onTextLayout: ((value: ComposeTextLayout) => void) | null;
    interactionSource: ComposeInteractionSource | null;
    outputTransformation: ComposeOutputTransformation | null;
    decorator: ReactNode;
    scrollState: ComposeScrollState;
    cursorBrush?: never;
    value?: never;
    onValueChange?: never;
    keyboardActions?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    readOnly: boolean;
    inputTransformation: ComposeInputTransformation | null;
    textStyle: ComposeTextStyle;
    keyboardOptions: ComposeKeyboardOptions;
    onKeyboardAction: (() => void) | null;
    lineLimits: ComposeTextFieldLineLimits;
    onTextLayout: ((value: ComposeTextLayout) => void) | null;
    interactionSource: ComposeInteractionSource | null;
    cursorBrush: ComposeBrush;
    decorator: ReactNode;
    scrollState: ComposeScrollState;
    outputTransformation?: never;
    value?: never;
    onValueChange?: never;
    keyboardActions?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    value: ComposeTextFieldValue;
    onValueChange: (value: ComposeTextFieldSnapshot) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    onTextLayout?: (value: ComposeTextLayout) => void;
    decorationBox?: ReactNode;
    state?: never;
    enabled?: never;
    readOnly?: never;
    inputTransformation?: never;
    textStyle?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    interactionSource?: never;
    cursorBrush?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    keyboardActions?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    visualTransformation?: never;
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
    cursorBrush: ComposeBrush;
    state?: never;
    inputTransformation?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    onTextLayout?: never;
    interactionSource?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    keyboardActions?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
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
    interactionSource: ComposeInteractionSource | null;
    cursorBrush?: ComposeBrush;
    state?: never;
    inputTransformation?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    onTextLayout?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    keyboardActions?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    value: ComposeTextFieldValue;
    onValueChange: (value: ComposeTextFieldSnapshot) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    singleLine?: boolean;
    visualTransformation: ComposeVisualTransformation;
    state?: never;
    readOnly?: never;
    inputTransformation?: never;
    textStyle?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    onTextLayout?: never;
    interactionSource?: never;
    cursorBrush?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    keyboardActions?: never;
    maxLines?: never;
    minLines?: never;
    decorationBox?: never;
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
    minLines: number;
    interactionSource?: ComposeInteractionSource | null;
    cursorBrush?: ComposeBrush;
    state?: never;
    inputTransformation?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    onTextLayout?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    keyboardActions?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    value: ComposeTextFieldValue;
    onValueChange: (value: ComposeTextFieldSnapshot) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    maxLines: number;
    decorationBox?: ReactNode;
    state?: never;
    enabled?: never;
    readOnly?: never;
    inputTransformation?: never;
    textStyle?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    onTextLayout?: never;
    interactionSource?: never;
    cursorBrush?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    keyboardActions?: never;
    singleLine?: never;
    minLines?: never;
    visualTransformation?: never;
    }
  | {
    value: ComposeTextFieldValue;
    onValueChange: (value: ComposeTextFieldSnapshot) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    maxLines: number;
    onTextLayout: (value: ComposeTextLayout) => void;
    state?: never;
    enabled?: never;
    readOnly?: never;
    inputTransformation?: never;
    textStyle?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    interactionSource?: never;
    cursorBrush?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    keyboardActions?: never;
    singleLine?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    value: ComposeTextFieldValue;
    onValueChange: (value: ComposeTextFieldSnapshot) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    singleLine: boolean;
    maxLines?: number;
    decorationBox?: ReactNode;
    state?: never;
    enabled?: never;
    readOnly?: never;
    inputTransformation?: never;
    textStyle?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    onTextLayout?: never;
    interactionSource?: never;
    cursorBrush?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    keyboardActions?: never;
    minLines?: never;
    visualTransformation?: never;
    }
  | {
    value: ComposeTextFieldValue;
    onValueChange: (value: ComposeTextFieldSnapshot) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    singleLine: boolean;
    maxLines?: number;
    onTextLayout: (value: ComposeTextLayout) => void;
    state?: never;
    enabled?: never;
    readOnly?: never;
    inputTransformation?: never;
    textStyle?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    interactionSource?: never;
    cursorBrush?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    keyboardActions?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    value: ComposeTextFieldValue;
    onValueChange: (value: ComposeTextFieldSnapshot) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    keyboardActions: ComposeKeyboardActions;
    singleLine?: boolean;
    visualTransformation?: ComposeVisualTransformation;
    state?: never;
    readOnly?: never;
    inputTransformation?: never;
    textStyle?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    onTextLayout?: never;
    interactionSource?: never;
    cursorBrush?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    maxLines?: never;
    minLines?: never;
    decorationBox?: never;
    }
  | {
    value: ComposeTextFieldValue;
    onValueChange: (value: ComposeTextFieldSnapshot) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    keyboardActions: ComposeKeyboardActions;
    singleLine?: boolean;
    maxLines: number;
    state?: never;
    readOnly?: never;
    inputTransformation?: never;
    textStyle?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    onTextLayout?: never;
    interactionSource?: never;
    cursorBrush?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    value: ComposeTextFieldValue;
    onValueChange: (value: ComposeTextFieldSnapshot) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    keyboardOptions: ComposeKeyboardOptions;
    singleLine?: boolean;
    visualTransformation?: ComposeVisualTransformation;
    state?: never;
    readOnly?: never;
    inputTransformation?: never;
    textStyle?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    onTextLayout?: never;
    interactionSource?: never;
    cursorBrush?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    keyboardActions?: never;
    maxLines?: never;
    minLines?: never;
    decorationBox?: never;
    }
  | {
    value: ComposeTextFieldValue;
    onValueChange: (value: ComposeTextFieldSnapshot) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    keyboardOptions: ComposeKeyboardOptions;
    singleLine?: boolean;
    maxLines: number;
    state?: never;
    readOnly?: never;
    inputTransformation?: never;
    textStyle?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    onTextLayout?: never;
    interactionSource?: never;
    cursorBrush?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    keyboardActions?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    value: ComposeTextFieldValue;
    onValueChange: (value: ComposeTextFieldSnapshot) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    keyboardOptions: ComposeKeyboardOptions;
    keyboardActions: ComposeKeyboardActions;
    visualTransformation?: ComposeVisualTransformation;
    state?: never;
    enabled?: never;
    readOnly?: never;
    inputTransformation?: never;
    textStyle?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    onTextLayout?: never;
    interactionSource?: never;
    cursorBrush?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    decorationBox?: never;
    }
  | {
    value: ComposeTextFieldValue;
    onValueChange: (value: ComposeTextFieldSnapshot) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    keyboardOptions: ComposeKeyboardOptions;
    keyboardActions: ComposeKeyboardActions;
    singleLine: boolean;
    visualTransformation: ComposeVisualTransformation;
    state?: never;
    enabled?: never;
    readOnly?: never;
    inputTransformation?: never;
    textStyle?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    onTextLayout?: never;
    interactionSource?: never;
    cursorBrush?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    maxLines?: never;
    minLines?: never;
    decorationBox?: never;
    }
  | {
    value: ComposeTextFieldValue;
    onValueChange: (value: ComposeTextFieldSnapshot) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    textStyle: ComposeTextStyle;
    singleLine?: boolean;
    maxLines?: number;
    decorationBox?: ReactNode;
    state?: never;
    enabled?: never;
    readOnly?: never;
    inputTransformation?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    onTextLayout?: never;
    interactionSource?: never;
    cursorBrush?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    keyboardActions?: never;
    minLines?: never;
    visualTransformation?: never;
    }
  | {
    value: ComposeTextFieldValue;
    onValueChange: (value: ComposeTextFieldSnapshot) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    textStyle: ComposeTextStyle;
    singleLine?: boolean;
    maxLines?: number;
    onTextLayout: (value: ComposeTextLayout) => void;
    state?: never;
    enabled?: never;
    readOnly?: never;
    inputTransformation?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    interactionSource?: never;
    cursorBrush?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    keyboardActions?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    value: ComposeTextFieldValue;
    onValueChange: (value: ComposeTextFieldSnapshot) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    readOnly: boolean;
    textStyle?: ComposeTextStyle;
    singleLine?: boolean;
    maxLines?: number;
    decorationBox?: ReactNode;
    state?: never;
    enabled?: never;
    inputTransformation?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    onTextLayout?: never;
    interactionSource?: never;
    cursorBrush?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    keyboardActions?: never;
    minLines?: never;
    visualTransformation?: never;
    }
  | {
    value: ComposeTextFieldValue;
    onValueChange: (value: ComposeTextFieldSnapshot) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    readOnly: boolean;
    textStyle?: ComposeTextStyle;
    singleLine?: boolean;
    maxLines?: number;
    onTextLayout: (value: ComposeTextLayout) => void;
    state?: never;
    enabled?: never;
    inputTransformation?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    interactionSource?: never;
    cursorBrush?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    keyboardActions?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    value: ComposeTextFieldValue;
    onValueChange: (value: ComposeTextFieldSnapshot) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly: boolean;
    keyboardActions: ComposeKeyboardActions;
    singleLine?: boolean;
    maxLines?: number;
    state?: never;
    inputTransformation?: never;
    textStyle?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    onTextLayout?: never;
    interactionSource?: never;
    cursorBrush?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    value: ComposeTextFieldValue;
    onValueChange: (value: ComposeTextFieldSnapshot) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly: boolean;
    keyboardOptions: ComposeKeyboardOptions;
    singleLine?: boolean;
    maxLines?: number;
    state?: never;
    inputTransformation?: never;
    textStyle?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    onTextLayout?: never;
    interactionSource?: never;
    cursorBrush?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    keyboardActions?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    value: ComposeTextFieldValue;
    onValueChange: (value: ComposeTextFieldSnapshot) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    readOnly: boolean;
    textStyle: ComposeTextStyle;
    keyboardOptions: ComposeKeyboardOptions;
    keyboardActions: ComposeKeyboardActions;
    singleLine: boolean;
    maxLines: number;
    minLines: number;
    visualTransformation?: ComposeVisualTransformation;
    interactionSource: ComposeInteractionSource | null;
    cursorBrush: ComposeBrush;
    state?: never;
    enabled?: never;
    inputTransformation?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    onTextLayout?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    decorationBox?: never;
    }
  | {
    value: ComposeTextFieldValue;
    onValueChange: (value: ComposeTextFieldSnapshot) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    readOnly: boolean;
    textStyle: ComposeTextStyle;
    keyboardOptions: ComposeKeyboardOptions;
    keyboardActions: ComposeKeyboardActions;
    singleLine: boolean;
    maxLines: number;
    minLines: number;
    visualTransformation: ComposeVisualTransformation;
    onTextLayout: (value: ComposeTextLayout) => void;
    interactionSource: ComposeInteractionSource | null;
    cursorBrush: ComposeBrush;
    decorationBox: ReactNode;
    state?: never;
    enabled?: never;
    inputTransformation?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    }
  | {
    value: ComposeTextFieldValue;
    onValueChange: (value: ComposeTextFieldSnapshot) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    readOnly?: boolean;
    textStyle?: ComposeTextStyle;
    singleLine?: boolean;
    maxLines?: number;
    decorationBox?: ReactNode;
    state?: never;
    inputTransformation?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    onTextLayout?: never;
    interactionSource?: never;
    cursorBrush?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    keyboardActions?: never;
    minLines?: never;
    visualTransformation?: never;
    }
  | {
    value: ComposeTextFieldValue;
    onValueChange: (value: ComposeTextFieldSnapshot) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    readOnly?: boolean;
    textStyle?: ComposeTextStyle;
    singleLine?: boolean;
    maxLines?: number;
    onTextLayout: (value: ComposeTextLayout) => void;
    state?: never;
    inputTransformation?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    interactionSource?: never;
    cursorBrush?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    keyboardActions?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    value: ComposeTextFieldValue;
    onValueChange: (value: ComposeTextFieldSnapshot) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    keyboardOptions: ComposeKeyboardOptions;
    keyboardActions: ComposeKeyboardActions;
    singleLine?: boolean;
    visualTransformation: ComposeVisualTransformation;
    state?: never;
    readOnly?: never;
    inputTransformation?: never;
    textStyle?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    onTextLayout?: never;
    interactionSource?: never;
    cursorBrush?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    maxLines?: never;
    minLines?: never;
    decorationBox?: never;
    }
  | {
    value: ComposeTextFieldValue;
    onValueChange: (value: ComposeTextFieldSnapshot) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    textStyle: ComposeTextStyle;
    keyboardOptions: ComposeKeyboardOptions;
    keyboardActions: ComposeKeyboardActions;
    singleLine: boolean;
    maxLines: number;
    minLines: number;
    visualTransformation?: ComposeVisualTransformation;
    interactionSource: ComposeInteractionSource | null;
    cursorBrush: ComposeBrush;
    state?: never;
    readOnly?: never;
    inputTransformation?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    onTextLayout?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    decorationBox?: never;
    }
  | {
    value: ComposeTextFieldValue;
    onValueChange: (value: ComposeTextFieldSnapshot) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    textStyle: ComposeTextStyle;
    keyboardOptions: ComposeKeyboardOptions;
    keyboardActions: ComposeKeyboardActions;
    singleLine: boolean;
    maxLines: number;
    minLines: number;
    visualTransformation: ComposeVisualTransformation;
    onTextLayout: (value: ComposeTextLayout) => void;
    interactionSource: ComposeInteractionSource | null;
    cursorBrush: ComposeBrush;
    decorationBox: ReactNode;
    state?: never;
    readOnly?: never;
    inputTransformation?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    }
  | {
    value: ComposeTextFieldValue;
    onValueChange: (value: ComposeTextFieldSnapshot) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    readOnly: boolean;
    keyboardOptions: ComposeKeyboardOptions;
    keyboardActions: ComposeKeyboardActions;
    singleLine: boolean;
    maxLines: number;
    minLines: number;
    visualTransformation?: ComposeVisualTransformation;
    interactionSource: ComposeInteractionSource | null;
    cursorBrush: ComposeBrush;
    state?: never;
    inputTransformation?: never;
    textStyle?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    onTextLayout?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    decorationBox?: never;
    }
  | {
    value: ComposeTextFieldValue;
    onValueChange: (value: ComposeTextFieldSnapshot) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    readOnly: boolean;
    keyboardOptions: ComposeKeyboardOptions;
    keyboardActions: ComposeKeyboardActions;
    singleLine: boolean;
    maxLines: number;
    minLines: number;
    visualTransformation: ComposeVisualTransformation;
    onTextLayout: (value: ComposeTextLayout) => void;
    interactionSource: ComposeInteractionSource | null;
    cursorBrush: ComposeBrush;
    decorationBox: ReactNode;
    state?: never;
    inputTransformation?: never;
    textStyle?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
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
    keyboardActions: ComposeKeyboardActions;
    singleLine: boolean;
    maxLines: number;
    minLines: number;
    visualTransformation?: ComposeVisualTransformation;
    interactionSource: ComposeInteractionSource | null;
    cursorBrush: ComposeBrush;
    state?: never;
    inputTransformation?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    onTextLayout?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    decorationBox?: never;
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
    keyboardActions: ComposeKeyboardActions;
    singleLine: boolean;
    maxLines: number;
    minLines: number;
    visualTransformation: ComposeVisualTransformation;
    onTextLayout: (value: ComposeTextLayout) => void;
    interactionSource: ComposeInteractionSource | null;
    cursorBrush: ComposeBrush;
    decorationBox: ReactNode;
    state?: never;
    inputTransformation?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
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
    keyboardOptions: ComposeKeyboardOptions;
    singleLine: boolean;
    maxLines: number;
    minLines: number;
    visualTransformation?: ComposeVisualTransformation;
    interactionSource: ComposeInteractionSource | null;
    cursorBrush: ComposeBrush;
    state?: never;
    inputTransformation?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    onTextLayout?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    keyboardActions?: never;
    decorationBox?: never;
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
    keyboardOptions: ComposeKeyboardOptions;
    singleLine: boolean;
    maxLines: number;
    minLines: number;
    visualTransformation: ComposeVisualTransformation;
    onTextLayout: (value: ComposeTextLayout) => void;
    interactionSource: ComposeInteractionSource | null;
    cursorBrush: ComposeBrush;
    decorationBox: ReactNode;
    state?: never;
    inputTransformation?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    keyboardActions?: never;
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
    keyboardOptions: ComposeKeyboardOptions;
    keyboardActions: ComposeKeyboardActions;
    maxLines: number;
    minLines: number;
    visualTransformation?: ComposeVisualTransformation;
    interactionSource: ComposeInteractionSource | null;
    cursorBrush: ComposeBrush;
    state?: never;
    inputTransformation?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    onTextLayout?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    singleLine?: never;
    decorationBox?: never;
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
    keyboardOptions: ComposeKeyboardOptions;
    keyboardActions: ComposeKeyboardActions;
    maxLines: number;
    minLines: number;
    visualTransformation: ComposeVisualTransformation;
    onTextLayout: (value: ComposeTextLayout) => void;
    interactionSource: ComposeInteractionSource | null;
    cursorBrush: ComposeBrush;
    decorationBox: ReactNode;
    state?: never;
    inputTransformation?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    singleLine?: never;
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
    keyboardOptions: ComposeKeyboardOptions;
    keyboardActions: ComposeKeyboardActions;
    singleLine: boolean;
    minLines: number;
    visualTransformation?: ComposeVisualTransformation;
    interactionSource: ComposeInteractionSource | null;
    cursorBrush: ComposeBrush;
    state?: never;
    inputTransformation?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    onTextLayout?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    maxLines?: never;
    decorationBox?: never;
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
    keyboardOptions: ComposeKeyboardOptions;
    keyboardActions: ComposeKeyboardActions;
    singleLine: boolean;
    minLines: number;
    visualTransformation: ComposeVisualTransformation;
    onTextLayout: (value: ComposeTextLayout) => void;
    interactionSource: ComposeInteractionSource | null;
    cursorBrush: ComposeBrush;
    decorationBox: ReactNode;
    state?: never;
    inputTransformation?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    maxLines?: never;
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
    keyboardOptions: ComposeKeyboardOptions;
    keyboardActions: ComposeKeyboardActions;
    singleLine: boolean;
    maxLines: number;
    visualTransformation?: ComposeVisualTransformation;
    interactionSource: ComposeInteractionSource | null;
    cursorBrush: ComposeBrush;
    state?: never;
    inputTransformation?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    onTextLayout?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    minLines?: never;
    decorationBox?: never;
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
    keyboardOptions: ComposeKeyboardOptions;
    keyboardActions: ComposeKeyboardActions;
    singleLine: boolean;
    maxLines: number;
    visualTransformation: ComposeVisualTransformation;
    onTextLayout: (value: ComposeTextLayout) => void;
    interactionSource: ComposeInteractionSource | null;
    cursorBrush: ComposeBrush;
    decorationBox: ReactNode;
    state?: never;
    inputTransformation?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
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
    textStyle: ComposeTextStyle;
    keyboardOptions: ComposeKeyboardOptions;
    keyboardActions: ComposeKeyboardActions;
    singleLine: boolean;
    maxLines: number;
    minLines: number;
    visualTransformation?: ComposeVisualTransformation;
    cursorBrush: ComposeBrush;
    state?: never;
    inputTransformation?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    onTextLayout?: never;
    interactionSource?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    decorationBox?: never;
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
    keyboardOptions: ComposeKeyboardOptions;
    keyboardActions: ComposeKeyboardActions;
    singleLine: boolean;
    maxLines: number;
    minLines: number;
    interactionSource: ComposeInteractionSource | null;
    cursorBrush?: ComposeBrush;
    state?: never;
    inputTransformation?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    onTextLayout?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    visualTransformation?: never;
    decorationBox?: never;
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
    keyboardOptions: ComposeKeyboardOptions;
    keyboardActions: ComposeKeyboardActions;
    singleLine: boolean;
    maxLines: number;
    minLines: number;
    onTextLayout: (value: ComposeTextLayout) => void;
    interactionSource: ComposeInteractionSource | null;
    cursorBrush: ComposeBrush;
    decorationBox: ReactNode;
    state?: never;
    inputTransformation?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    visualTransformation?: never;
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
    keyboardOptions: ComposeKeyboardOptions;
    keyboardActions: ComposeKeyboardActions;
    singleLine: boolean;
    maxLines: number;
    minLines: number;
    visualTransformation: ComposeVisualTransformation;
    interactionSource: ComposeInteractionSource | null;
    state?: never;
    inputTransformation?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    onTextLayout?: never;
    cursorBrush?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    decorationBox?: never;
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
    keyboardOptions: ComposeKeyboardOptions;
    keyboardActions: ComposeKeyboardActions;
    singleLine: boolean;
    maxLines: number;
    minLines: number;
    visualTransformation: ComposeVisualTransformation;
    onTextLayout?: (value: ComposeTextLayout) => void;
    interactionSource: ComposeInteractionSource | null;
    cursorBrush: ComposeBrush;
    decorationBox?: ReactNode;
    state?: never;
    inputTransformation?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
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
    keyboardOptions: ComposeKeyboardOptions;
    keyboardActions: ComposeKeyboardActions;
    singleLine: boolean;
    maxLines: number;
    minLines: number;
    visualTransformation: ComposeVisualTransformation;
    onTextLayout: (value: ComposeTextLayout) => void;
    cursorBrush: ComposeBrush;
    decorationBox: ReactNode;
    state?: never;
    inputTransformation?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    interactionSource?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
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
    keyboardOptions: ComposeKeyboardOptions;
    keyboardActions: ComposeKeyboardActions;
    singleLine: boolean;
    maxLines: number;
    minLines: number;
    visualTransformation: ComposeVisualTransformation;
    onTextLayout: (value: ComposeTextLayout) => void;
    interactionSource: ComposeInteractionSource | null;
    decorationBox: ReactNode;
    state?: never;
    inputTransformation?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    cursorBrush?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    }
  | {
    value: string;
    onValueChange: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    onTextLayout?: (value: ComposeTextLayout) => void;
    decorationBox?: ReactNode;
    state?: never;
    enabled?: never;
    readOnly?: never;
    inputTransformation?: never;
    textStyle?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    interactionSource?: never;
    cursorBrush?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    keyboardActions?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    visualTransformation?: never;
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
    cursorBrush: ComposeBrush;
    state?: never;
    inputTransformation?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    onTextLayout?: never;
    interactionSource?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    keyboardActions?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
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
    interactionSource: ComposeInteractionSource | null;
    cursorBrush?: ComposeBrush;
    state?: never;
    inputTransformation?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    onTextLayout?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    keyboardActions?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    value: string;
    onValueChange: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    singleLine?: boolean;
    visualTransformation: ComposeVisualTransformation;
    state?: never;
    readOnly?: never;
    inputTransformation?: never;
    textStyle?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    onTextLayout?: never;
    interactionSource?: never;
    cursorBrush?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    keyboardActions?: never;
    maxLines?: never;
    minLines?: never;
    decorationBox?: never;
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
    minLines: number;
    interactionSource?: ComposeInteractionSource | null;
    cursorBrush?: ComposeBrush;
    state?: never;
    inputTransformation?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    onTextLayout?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    keyboardActions?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    value: string;
    onValueChange: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    maxLines: number;
    decorationBox?: ReactNode;
    state?: never;
    enabled?: never;
    readOnly?: never;
    inputTransformation?: never;
    textStyle?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    onTextLayout?: never;
    interactionSource?: never;
    cursorBrush?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    keyboardActions?: never;
    singleLine?: never;
    minLines?: never;
    visualTransformation?: never;
    }
  | {
    value: string;
    onValueChange: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    maxLines: number;
    onTextLayout: (value: ComposeTextLayout) => void;
    state?: never;
    enabled?: never;
    readOnly?: never;
    inputTransformation?: never;
    textStyle?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    interactionSource?: never;
    cursorBrush?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    keyboardActions?: never;
    singleLine?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    value: string;
    onValueChange: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    singleLine: boolean;
    maxLines?: number;
    decorationBox?: ReactNode;
    state?: never;
    enabled?: never;
    readOnly?: never;
    inputTransformation?: never;
    textStyle?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    onTextLayout?: never;
    interactionSource?: never;
    cursorBrush?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    keyboardActions?: never;
    minLines?: never;
    visualTransformation?: never;
    }
  | {
    value: string;
    onValueChange: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    singleLine: boolean;
    maxLines?: number;
    onTextLayout: (value: ComposeTextLayout) => void;
    state?: never;
    enabled?: never;
    readOnly?: never;
    inputTransformation?: never;
    textStyle?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    interactionSource?: never;
    cursorBrush?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    keyboardActions?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    value: string;
    onValueChange: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    keyboardActions: ComposeKeyboardActions;
    singleLine?: boolean;
    visualTransformation?: ComposeVisualTransformation;
    state?: never;
    readOnly?: never;
    inputTransformation?: never;
    textStyle?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    onTextLayout?: never;
    interactionSource?: never;
    cursorBrush?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    maxLines?: never;
    minLines?: never;
    decorationBox?: never;
    }
  | {
    value: string;
    onValueChange: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    keyboardActions: ComposeKeyboardActions;
    singleLine?: boolean;
    maxLines: number;
    state?: never;
    readOnly?: never;
    inputTransformation?: never;
    textStyle?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    onTextLayout?: never;
    interactionSource?: never;
    cursorBrush?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    value: string;
    onValueChange: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    keyboardOptions: ComposeKeyboardOptions;
    singleLine?: boolean;
    visualTransformation?: ComposeVisualTransformation;
    state?: never;
    readOnly?: never;
    inputTransformation?: never;
    textStyle?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    onTextLayout?: never;
    interactionSource?: never;
    cursorBrush?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    keyboardActions?: never;
    maxLines?: never;
    minLines?: never;
    decorationBox?: never;
    }
  | {
    value: string;
    onValueChange: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    keyboardOptions: ComposeKeyboardOptions;
    singleLine?: boolean;
    maxLines: number;
    state?: never;
    readOnly?: never;
    inputTransformation?: never;
    textStyle?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    onTextLayout?: never;
    interactionSource?: never;
    cursorBrush?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    keyboardActions?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    value: string;
    onValueChange: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    keyboardOptions: ComposeKeyboardOptions;
    keyboardActions: ComposeKeyboardActions;
    visualTransformation?: ComposeVisualTransformation;
    state?: never;
    enabled?: never;
    readOnly?: never;
    inputTransformation?: never;
    textStyle?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    onTextLayout?: never;
    interactionSource?: never;
    cursorBrush?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    singleLine?: never;
    maxLines?: never;
    minLines?: never;
    decorationBox?: never;
    }
  | {
    value: string;
    onValueChange: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    keyboardOptions: ComposeKeyboardOptions;
    keyboardActions: ComposeKeyboardActions;
    singleLine: boolean;
    visualTransformation: ComposeVisualTransformation;
    state?: never;
    enabled?: never;
    readOnly?: never;
    inputTransformation?: never;
    textStyle?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    onTextLayout?: never;
    interactionSource?: never;
    cursorBrush?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    maxLines?: never;
    minLines?: never;
    decorationBox?: never;
    }
  | {
    value: string;
    onValueChange: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    textStyle: ComposeTextStyle;
    singleLine?: boolean;
    maxLines?: number;
    decorationBox?: ReactNode;
    state?: never;
    enabled?: never;
    readOnly?: never;
    inputTransformation?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    onTextLayout?: never;
    interactionSource?: never;
    cursorBrush?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    keyboardActions?: never;
    minLines?: never;
    visualTransformation?: never;
    }
  | {
    value: string;
    onValueChange: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    textStyle: ComposeTextStyle;
    singleLine?: boolean;
    maxLines?: number;
    onTextLayout: (value: ComposeTextLayout) => void;
    state?: never;
    enabled?: never;
    readOnly?: never;
    inputTransformation?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    interactionSource?: never;
    cursorBrush?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    keyboardActions?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    value: string;
    onValueChange: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    readOnly: boolean;
    textStyle?: ComposeTextStyle;
    singleLine?: boolean;
    maxLines?: number;
    decorationBox?: ReactNode;
    state?: never;
    enabled?: never;
    inputTransformation?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    onTextLayout?: never;
    interactionSource?: never;
    cursorBrush?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    keyboardActions?: never;
    minLines?: never;
    visualTransformation?: never;
    }
  | {
    value: string;
    onValueChange: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    readOnly: boolean;
    textStyle?: ComposeTextStyle;
    singleLine?: boolean;
    maxLines?: number;
    onTextLayout: (value: ComposeTextLayout) => void;
    state?: never;
    enabled?: never;
    inputTransformation?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    interactionSource?: never;
    cursorBrush?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    keyboardActions?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    value: string;
    onValueChange: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly: boolean;
    keyboardActions: ComposeKeyboardActions;
    singleLine?: boolean;
    maxLines?: number;
    state?: never;
    inputTransformation?: never;
    textStyle?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    onTextLayout?: never;
    interactionSource?: never;
    cursorBrush?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    value: string;
    onValueChange: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly: boolean;
    keyboardOptions: ComposeKeyboardOptions;
    singleLine?: boolean;
    maxLines?: number;
    state?: never;
    inputTransformation?: never;
    textStyle?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    onTextLayout?: never;
    interactionSource?: never;
    cursorBrush?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    keyboardActions?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    value: string;
    onValueChange: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    readOnly: boolean;
    textStyle: ComposeTextStyle;
    keyboardOptions: ComposeKeyboardOptions;
    keyboardActions: ComposeKeyboardActions;
    singleLine: boolean;
    maxLines: number;
    minLines: number;
    visualTransformation?: ComposeVisualTransformation;
    interactionSource: ComposeInteractionSource | null;
    cursorBrush: ComposeBrush;
    state?: never;
    enabled?: never;
    inputTransformation?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    onTextLayout?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    decorationBox?: never;
    }
  | {
    value: string;
    onValueChange: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    readOnly: boolean;
    textStyle: ComposeTextStyle;
    keyboardOptions: ComposeKeyboardOptions;
    keyboardActions: ComposeKeyboardActions;
    singleLine: boolean;
    maxLines: number;
    minLines: number;
    visualTransformation: ComposeVisualTransformation;
    onTextLayout: (value: ComposeTextLayout) => void;
    interactionSource: ComposeInteractionSource | null;
    cursorBrush: ComposeBrush;
    decorationBox: ReactNode;
    state?: never;
    enabled?: never;
    inputTransformation?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    }
  | {
    value: string;
    onValueChange: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    readOnly?: boolean;
    textStyle?: ComposeTextStyle;
    singleLine?: boolean;
    maxLines?: number;
    decorationBox?: ReactNode;
    state?: never;
    inputTransformation?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    onTextLayout?: never;
    interactionSource?: never;
    cursorBrush?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    keyboardActions?: never;
    minLines?: never;
    visualTransformation?: never;
    }
  | {
    value: string;
    onValueChange: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    readOnly?: boolean;
    textStyle?: ComposeTextStyle;
    singleLine?: boolean;
    maxLines?: number;
    onTextLayout: (value: ComposeTextLayout) => void;
    state?: never;
    inputTransformation?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    interactionSource?: never;
    cursorBrush?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    keyboardActions?: never;
    minLines?: never;
    visualTransformation?: never;
    decorationBox?: never;
    }
  | {
    value: string;
    onValueChange: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    keyboardOptions: ComposeKeyboardOptions;
    keyboardActions: ComposeKeyboardActions;
    singleLine?: boolean;
    visualTransformation: ComposeVisualTransformation;
    state?: never;
    readOnly?: never;
    inputTransformation?: never;
    textStyle?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    onTextLayout?: never;
    interactionSource?: never;
    cursorBrush?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    maxLines?: never;
    minLines?: never;
    decorationBox?: never;
    }
  | {
    value: string;
    onValueChange: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    textStyle: ComposeTextStyle;
    keyboardOptions: ComposeKeyboardOptions;
    keyboardActions: ComposeKeyboardActions;
    singleLine: boolean;
    maxLines: number;
    minLines: number;
    visualTransformation?: ComposeVisualTransformation;
    interactionSource: ComposeInteractionSource | null;
    cursorBrush: ComposeBrush;
    state?: never;
    readOnly?: never;
    inputTransformation?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    onTextLayout?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    decorationBox?: never;
    }
  | {
    value: string;
    onValueChange: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    textStyle: ComposeTextStyle;
    keyboardOptions: ComposeKeyboardOptions;
    keyboardActions: ComposeKeyboardActions;
    singleLine: boolean;
    maxLines: number;
    minLines: number;
    visualTransformation: ComposeVisualTransformation;
    onTextLayout: (value: ComposeTextLayout) => void;
    interactionSource: ComposeInteractionSource | null;
    cursorBrush: ComposeBrush;
    decorationBox: ReactNode;
    state?: never;
    readOnly?: never;
    inputTransformation?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    }
  | {
    value: string;
    onValueChange: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    readOnly: boolean;
    keyboardOptions: ComposeKeyboardOptions;
    keyboardActions: ComposeKeyboardActions;
    singleLine: boolean;
    maxLines: number;
    minLines: number;
    visualTransformation?: ComposeVisualTransformation;
    interactionSource: ComposeInteractionSource | null;
    cursorBrush: ComposeBrush;
    state?: never;
    inputTransformation?: never;
    textStyle?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    onTextLayout?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    decorationBox?: never;
    }
  | {
    value: string;
    onValueChange: (value: string) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    readOnly: boolean;
    keyboardOptions: ComposeKeyboardOptions;
    keyboardActions: ComposeKeyboardActions;
    singleLine: boolean;
    maxLines: number;
    minLines: number;
    visualTransformation: ComposeVisualTransformation;
    onTextLayout: (value: ComposeTextLayout) => void;
    interactionSource: ComposeInteractionSource | null;
    cursorBrush: ComposeBrush;
    decorationBox: ReactNode;
    state?: never;
    inputTransformation?: never;
    textStyle?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
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
    keyboardActions: ComposeKeyboardActions;
    singleLine: boolean;
    maxLines: number;
    minLines: number;
    visualTransformation?: ComposeVisualTransformation;
    interactionSource: ComposeInteractionSource | null;
    cursorBrush: ComposeBrush;
    state?: never;
    inputTransformation?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    onTextLayout?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    decorationBox?: never;
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
    keyboardActions: ComposeKeyboardActions;
    singleLine: boolean;
    maxLines: number;
    minLines: number;
    visualTransformation: ComposeVisualTransformation;
    onTextLayout: (value: ComposeTextLayout) => void;
    interactionSource: ComposeInteractionSource | null;
    cursorBrush: ComposeBrush;
    decorationBox: ReactNode;
    state?: never;
    inputTransformation?: never;
    keyboardOptions?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
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
    keyboardOptions: ComposeKeyboardOptions;
    singleLine: boolean;
    maxLines: number;
    minLines: number;
    visualTransformation?: ComposeVisualTransformation;
    interactionSource: ComposeInteractionSource | null;
    cursorBrush: ComposeBrush;
    state?: never;
    inputTransformation?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    onTextLayout?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    keyboardActions?: never;
    decorationBox?: never;
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
    keyboardOptions: ComposeKeyboardOptions;
    singleLine: boolean;
    maxLines: number;
    minLines: number;
    visualTransformation: ComposeVisualTransformation;
    onTextLayout: (value: ComposeTextLayout) => void;
    interactionSource: ComposeInteractionSource | null;
    cursorBrush: ComposeBrush;
    decorationBox: ReactNode;
    state?: never;
    inputTransformation?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    keyboardActions?: never;
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
    keyboardOptions: ComposeKeyboardOptions;
    keyboardActions: ComposeKeyboardActions;
    maxLines: number;
    minLines: number;
    visualTransformation?: ComposeVisualTransformation;
    interactionSource: ComposeInteractionSource | null;
    cursorBrush: ComposeBrush;
    state?: never;
    inputTransformation?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    onTextLayout?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    singleLine?: never;
    decorationBox?: never;
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
    keyboardOptions: ComposeKeyboardOptions;
    keyboardActions: ComposeKeyboardActions;
    maxLines: number;
    minLines: number;
    visualTransformation: ComposeVisualTransformation;
    onTextLayout: (value: ComposeTextLayout) => void;
    interactionSource: ComposeInteractionSource | null;
    cursorBrush: ComposeBrush;
    decorationBox: ReactNode;
    state?: never;
    inputTransformation?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    singleLine?: never;
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
    keyboardOptions: ComposeKeyboardOptions;
    keyboardActions: ComposeKeyboardActions;
    singleLine: boolean;
    minLines: number;
    visualTransformation?: ComposeVisualTransformation;
    interactionSource: ComposeInteractionSource | null;
    cursorBrush: ComposeBrush;
    state?: never;
    inputTransformation?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    onTextLayout?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    maxLines?: never;
    decorationBox?: never;
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
    keyboardOptions: ComposeKeyboardOptions;
    keyboardActions: ComposeKeyboardActions;
    singleLine: boolean;
    minLines: number;
    visualTransformation: ComposeVisualTransformation;
    onTextLayout: (value: ComposeTextLayout) => void;
    interactionSource: ComposeInteractionSource | null;
    cursorBrush: ComposeBrush;
    decorationBox: ReactNode;
    state?: never;
    inputTransformation?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    maxLines?: never;
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
    keyboardOptions: ComposeKeyboardOptions;
    keyboardActions: ComposeKeyboardActions;
    singleLine: boolean;
    maxLines: number;
    visualTransformation?: ComposeVisualTransformation;
    interactionSource: ComposeInteractionSource | null;
    cursorBrush: ComposeBrush;
    state?: never;
    inputTransformation?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    onTextLayout?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    minLines?: never;
    decorationBox?: never;
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
    keyboardOptions: ComposeKeyboardOptions;
    keyboardActions: ComposeKeyboardActions;
    singleLine: boolean;
    maxLines: number;
    visualTransformation: ComposeVisualTransformation;
    onTextLayout: (value: ComposeTextLayout) => void;
    interactionSource: ComposeInteractionSource | null;
    cursorBrush: ComposeBrush;
    decorationBox: ReactNode;
    state?: never;
    inputTransformation?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
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
    textStyle: ComposeTextStyle;
    keyboardOptions: ComposeKeyboardOptions;
    keyboardActions: ComposeKeyboardActions;
    singleLine: boolean;
    maxLines: number;
    minLines: number;
    visualTransformation?: ComposeVisualTransformation;
    cursorBrush: ComposeBrush;
    state?: never;
    inputTransformation?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    onTextLayout?: never;
    interactionSource?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    decorationBox?: never;
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
    keyboardOptions: ComposeKeyboardOptions;
    keyboardActions: ComposeKeyboardActions;
    singleLine: boolean;
    maxLines: number;
    minLines: number;
    interactionSource: ComposeInteractionSource | null;
    cursorBrush?: ComposeBrush;
    state?: never;
    inputTransformation?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    onTextLayout?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    visualTransformation?: never;
    decorationBox?: never;
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
    keyboardOptions: ComposeKeyboardOptions;
    keyboardActions: ComposeKeyboardActions;
    singleLine: boolean;
    maxLines: number;
    minLines: number;
    onTextLayout: (value: ComposeTextLayout) => void;
    interactionSource: ComposeInteractionSource | null;
    cursorBrush: ComposeBrush;
    decorationBox: ReactNode;
    state?: never;
    inputTransformation?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    visualTransformation?: never;
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
    keyboardOptions: ComposeKeyboardOptions;
    keyboardActions: ComposeKeyboardActions;
    singleLine: boolean;
    maxLines: number;
    minLines: number;
    visualTransformation: ComposeVisualTransformation;
    interactionSource: ComposeInteractionSource | null;
    state?: never;
    inputTransformation?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    onTextLayout?: never;
    cursorBrush?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    decorationBox?: never;
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
    keyboardOptions: ComposeKeyboardOptions;
    keyboardActions: ComposeKeyboardActions;
    singleLine: boolean;
    maxLines: number;
    minLines: number;
    visualTransformation: ComposeVisualTransformation;
    onTextLayout?: (value: ComposeTextLayout) => void;
    interactionSource: ComposeInteractionSource | null;
    cursorBrush: ComposeBrush;
    decorationBox?: ReactNode;
    state?: never;
    inputTransformation?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
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
    keyboardOptions: ComposeKeyboardOptions;
    keyboardActions: ComposeKeyboardActions;
    singleLine: boolean;
    maxLines: number;
    minLines: number;
    visualTransformation: ComposeVisualTransformation;
    onTextLayout: (value: ComposeTextLayout) => void;
    cursorBrush: ComposeBrush;
    decorationBox: ReactNode;
    state?: never;
    inputTransformation?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    interactionSource?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
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
    keyboardOptions: ComposeKeyboardOptions;
    keyboardActions: ComposeKeyboardActions;
    singleLine: boolean;
    maxLines: number;
    minLines: number;
    visualTransformation: ComposeVisualTransformation;
    onTextLayout: (value: ComposeTextLayout) => void;
    interactionSource: ComposeInteractionSource | null;
    decorationBox: ReactNode;
    state?: never;
    inputTransformation?: never;
    onKeyboardAction?: never;
    lineLimits?: never;
    cursorBrush?: never;
    outputTransformation?: never;
    decorator?: never;
    scrollState?: never;
    }
;
export const BasicTextField = createComposableComponent<BasicTextFieldProps>({
  name: "BasicTextField",
  props: ["state","modifier","enabled","readOnly","inputTransformation","textStyle","keyboardOptions","lineLimits","interactionSource","cursorBrush","outputTransformation","scrollState","value","keyboardActions","singleLine","maxLines","minLines","visualTransformation"],
  objectProps: ["state","inputTransformation","textStyle","keyboardOptions","lineLimits","interactionSource","cursorBrush","outputTransformation","scrollState","value","keyboardActions","visualTransformation"],
  slots: ["decorator","decorationBox"],
  events: ["onKeyboardAction","onTextLayout","onValueChange"],
  children: false,
  overloads: [
    { id: "BasicTextField", children: false, parameters: [["state","object",false,false],["modifier","ComposeModifier",true,false],["enabled","boolean",true,false],["readOnly","boolean",true,false],["inputTransformation","object",true,true],["textStyle","object",true,false],["keyboardOptions","object",true,false],["onKeyboardAction","function",true,true],["lineLimits","object",true,false],["onTextLayout","function",true,true],["interactionSource","object",true,true],["cursorBrush","brush",true,false],["outputTransformation","object",true,true],["decorator","ReactNode",true,true],["scrollState","object",true,false]], masks: [0,1,2,3,4,5,8,9,10,11,16,17,18,19,20,21,24,25,26,27,32,33,34,35,36,37,40,41,42,43,48,52,53,64,65,66,67,68,69,72,73,74,75,80,84,85,96,100,101,116,117,128,129,130,131,132,133,134,135,136,137,138,139,140,141,142,143,144,145,146,147,148,149,150,151,152,153,154,155,156,157,158,159,256,257,258,259,264,265,266,267,272,273,274,275,280,281,282,283,288,289,290,291,296,297,298,299,320,321,322,323,328,329,330,331,379,512,513,514,515,520,521,522,523,635,768,769,770,771,776,777,778,779,795,811,827,843,859,875,883,889,890,891,895,1024,1025,1028,1029,1040,1041,1044,1045,1056,1057,1060,1061,1072,1073,1076,1077,1088,1089,1092,1093,1104,1105,1108,1109,1120,1121,1124,1125,1136,1137,1140,1141,1407,1663,1855,1887,1903,1911,1915,1917,1918,1919,2047,2048,2049,2050,2051,2052,2053,2054,2055,2056,2057,2058,2059,2060,2061,2062,2063,2064,2065,2066,2067,2068,2069,2070,2071,2072,2073,2074,2075,2076,2077,2078,2079,2176,3967,4095,4096,4097,4098,4099,4100,4101,4102,4103,4104,4105,4106,4107,4108,4109,4110,4111,4112,4113,4114,4115,4116,4117,4118,4119,4120,4121,4122,4123,4124,4125,4126,4127,4224,6015,6143,6144,7167,7679,7935,8063,8127,8159,8175,8183,8187,8189,8190,8191] },
    { id: "BasicTextField#1", children: false, controlledText: true, parameters: [["value","object",false,false],["onValueChange","function",false,false],["modifier","ComposeModifier",true,false],["enabled","boolean",true,false],["readOnly","boolean",true,false],["textStyle","object",true,false],["keyboardOptions","object",true,false],["keyboardActions","object",true,false],["singleLine","boolean",true,false],["maxLines","number",true,false],["minLines","number",true,false],["visualTransformation","object",true,false],["onTextLayout","function",true,false],["interactionSource","object",true,true],["cursorBrush","brush",true,false],["decorationBox","ReactNode",true,false]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,16,17,18,19,24,32,33,34,35,36,37,38,39,40,41,42,43,48,49,50,51,64,65,66,67,68,69,70,71,72,73,74,75,80,81,82,83,96,97,98,99,100,101,102,103,104,105,106,107,112,113,114,115,128,129,130,131,132,133,134,135,160,161,162,163,164,165,166,167,192,193,194,195,196,197,198,199,224,225,226,227,228,229,230,231,256,257,264,265,272,273,280,281,288,289,296,297,304,305,312,313,512,513,514,515,516,517,518,519,544,545,546,547,548,549,550,551,576,577,578,579,580,581,582,583,608,609,610,611,612,613,614,615,1024,1025,1026,1027,1028,1029,1030,1031,1056,1057,1058,1059,1060,1061,1062,1063,1088,1089,1090,1091,1092,1093,1094,1095,1120,1121,1122,1123,1124,1125,1126,1127,1152,1153,1154,1155,1156,1157,1158,1159,1184,1185,1186,1187,1188,1189,1190,1191,1216,1217,1218,1219,1220,1221,1222,1223,1248,1249,1250,1251,1252,1253,1254,1255,1279,1535,2048,2049,2050,2051,2052,2053,2054,2055,2080,2081,2082,2083,2084,2085,2086,2087,2112,2113,2114,2115,2116,2117,2118,2119,2144,2145,2146,2147,2148,2149,2150,2151,2176,2177,2178,2179,2180,2181,2182,2183,2208,2209,2210,2211,2212,2213,2214,2215,2240,2241,2242,2243,2244,2245,2246,2247,2272,2273,2274,2275,2276,2277,2278,2279,2303,2559,3072,3073,3074,3075,3076,3077,3078,3079,3104,3105,3106,3107,3108,3109,3110,3111,3136,3137,3138,3139,3140,3141,3142,3143,3168,3169,3170,3171,3172,3173,3174,3175,3199,3200,3201,3202,3203,3204,3205,3206,3207,3232,3233,3234,3235,3236,3237,3238,3239,3263,3264,3265,3266,3267,3268,3269,3270,3271,3295,3296,3297,3298,3299,3300,3301,3302,3303,3311,3319,3323,3325,3326,3327,3455,3519,3551,3567,3575,3579,3581,3582,3583,4095,4096,4097,4098,4099,4100,4101,4102,4103,4128,4129,4130,4131,4132,4133,4134,4135,4160,4161,4162,4163,4164,4165,4166,4167,4192,4193,4194,4195,4196,4197,4198,4199,4608,6143,7167,7679,7935,8063,8127,8159,8175,8183,8187,8189,8190,8191] },
    { id: "BasicTextField#2", children: false, controlledText: true, parameters: [["value","string",false,false],["onValueChange","function",false,false],["modifier","ComposeModifier",true,false],["enabled","boolean",true,false],["readOnly","boolean",true,false],["textStyle","object",true,false],["keyboardOptions","object",true,false],["keyboardActions","object",true,false],["singleLine","boolean",true,false],["maxLines","number",true,false],["minLines","number",true,false],["visualTransformation","object",true,false],["onTextLayout","function",true,false],["interactionSource","object",true,true],["cursorBrush","brush",true,false],["decorationBox","ReactNode",true,false]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,16,17,18,19,24,32,33,34,35,36,37,38,39,40,41,42,43,48,49,50,51,64,65,66,67,68,69,70,71,72,73,74,75,80,81,82,83,96,97,98,99,100,101,102,103,104,105,106,107,112,113,114,115,128,129,130,131,132,133,134,135,160,161,162,163,164,165,166,167,192,193,194,195,196,197,198,199,224,225,226,227,228,229,230,231,256,257,264,265,272,273,280,281,288,289,296,297,304,305,312,313,512,513,514,515,516,517,518,519,544,545,546,547,548,549,550,551,576,577,578,579,580,581,582,583,608,609,610,611,612,613,614,615,1024,1025,1026,1027,1028,1029,1030,1031,1056,1057,1058,1059,1060,1061,1062,1063,1088,1089,1090,1091,1092,1093,1094,1095,1120,1121,1122,1123,1124,1125,1126,1127,1152,1153,1154,1155,1156,1157,1158,1159,1184,1185,1186,1187,1188,1189,1190,1191,1216,1217,1218,1219,1220,1221,1222,1223,1248,1249,1250,1251,1252,1253,1254,1255,1279,1535,2048,2049,2050,2051,2052,2053,2054,2055,2080,2081,2082,2083,2084,2085,2086,2087,2112,2113,2114,2115,2116,2117,2118,2119,2144,2145,2146,2147,2148,2149,2150,2151,2176,2177,2178,2179,2180,2181,2182,2183,2208,2209,2210,2211,2212,2213,2214,2215,2240,2241,2242,2243,2244,2245,2246,2247,2272,2273,2274,2275,2276,2277,2278,2279,2303,2559,3072,3073,3074,3075,3076,3077,3078,3079,3104,3105,3106,3107,3108,3109,3110,3111,3136,3137,3138,3139,3140,3141,3142,3143,3168,3169,3170,3171,3172,3173,3174,3175,3199,3200,3201,3202,3203,3204,3205,3206,3207,3232,3233,3234,3235,3236,3237,3238,3239,3263,3264,3265,3266,3267,3268,3269,3270,3271,3295,3296,3297,3298,3299,3300,3301,3302,3303,3311,3319,3323,3325,3326,3327,3455,3519,3551,3567,3575,3579,3581,3582,3583,4095,4096,4097,4098,4099,4100,4101,4102,4103,4128,4129,4130,4131,4132,4133,4134,4135,4160,4161,4162,4163,4164,4165,4166,4167,4192,4193,4194,4195,4196,4197,4198,4199,4608,6143,7167,7679,7935,8063,8127,8159,8175,8183,8187,8189,8190,8191] },
  ],
});
