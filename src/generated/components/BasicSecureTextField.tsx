// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeBrush } from "../../utils/modifier";
import type { ComposeInputTransformation, ComposeKeyboardOptions, ComposeScrollState, ComposeTextFieldState, ComposeTextLayout, ComposeTextStyle } from "../../utils/composeValues";
import type { ComposeInteractionSource } from "../../utils/nativeHandles";
import type { ComposeTextObfuscationModeValue } from "../values/enums";

export type BasicSecureTextFieldProps =
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
    onTextLayout?: never;
    interactionSource?: never;
    cursorBrush?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly?: boolean;
    inputTransformation?: ComposeInputTransformation | null;
    textStyle?: ComposeTextStyle;
    keyboardOptions?: ComposeKeyboardOptions;
    textObfuscationCharacter: string;
    onKeyboardAction?: never;
    onTextLayout?: never;
    interactionSource?: never;
    cursorBrush?: never;
    decorator?: never;
    textObfuscationMode?: never;
    scrollState?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    textObfuscationMode: ComposeTextObfuscationModeValue;
    textObfuscationCharacter?: string;
    enabled?: never;
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
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly?: boolean;
    textStyle?: ComposeTextStyle;
    keyboardOptions?: ComposeKeyboardOptions;
    cursorBrush: ComposeBrush;
    inputTransformation?: never;
    onKeyboardAction?: never;
    onTextLayout?: never;
    interactionSource?: never;
    decorator?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
    scrollState?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly?: boolean;
    textStyle?: ComposeTextStyle;
    keyboardOptions?: ComposeKeyboardOptions;
    interactionSource: ComposeInteractionSource | null;
    cursorBrush?: ComposeBrush;
    inputTransformation?: never;
    onKeyboardAction?: never;
    onTextLayout?: never;
    decorator?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
    scrollState?: never;
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
    interactionSource?: never;
    cursorBrush?: never;
    decorator?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
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
    interactionSource?: never;
    cursorBrush?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
    scrollState?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly?: boolean;
    textStyle?: ComposeTextStyle;
    keyboardOptions?: ComposeKeyboardOptions;
    onKeyboardAction: (() => void) | null;
    interactionSource?: ComposeInteractionSource | null;
    cursorBrush?: ComposeBrush;
    inputTransformation?: never;
    onTextLayout?: never;
    decorator?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
    scrollState?: never;
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
    onTextLayout?: never;
    interactionSource?: never;
    cursorBrush?: never;
    decorator?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    keyboardOptions: ComposeKeyboardOptions;
    textObfuscationMode: ComposeTextObfuscationModeValue;
    enabled?: never;
    readOnly?: never;
    inputTransformation?: never;
    textStyle?: never;
    onKeyboardAction?: never;
    onTextLayout?: never;
    interactionSource?: never;
    cursorBrush?: never;
    decorator?: never;
    textObfuscationCharacter?: never;
    scrollState?: never;
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
    onTextLayout?: never;
    interactionSource?: never;
    cursorBrush?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
    scrollState?: never;
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
    interactionSource?: never;
    cursorBrush?: never;
    decorator?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
    scrollState?: never;
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
    onTextLayout?: never;
    interactionSource?: never;
    cursorBrush?: never;
    decorator?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    textStyle: ComposeTextStyle;
    keyboardOptions?: ComposeKeyboardOptions;
    textObfuscationMode: ComposeTextObfuscationModeValue;
    enabled?: never;
    readOnly?: never;
    inputTransformation?: never;
    onKeyboardAction?: never;
    onTextLayout?: never;
    interactionSource?: never;
    cursorBrush?: never;
    decorator?: never;
    textObfuscationCharacter?: never;
    scrollState?: never;
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
    onTextLayout?: never;
    interactionSource?: never;
    cursorBrush?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
    scrollState?: never;
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
    interactionSource?: never;
    cursorBrush?: never;
    decorator?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
    scrollState?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly?: boolean;
    inputTransformation: ComposeInputTransformation | null;
    keyboardOptions?: ComposeKeyboardOptions;
    scrollState?: ComposeScrollState;
    textStyle?: never;
    onKeyboardAction?: never;
    onTextLayout?: never;
    interactionSource?: never;
    cursorBrush?: never;
    decorator?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    inputTransformation: ComposeInputTransformation | null;
    textStyle?: ComposeTextStyle;
    keyboardOptions?: ComposeKeyboardOptions;
    textObfuscationMode: ComposeTextObfuscationModeValue;
    enabled?: never;
    readOnly?: never;
    onKeyboardAction?: never;
    onTextLayout?: never;
    interactionSource?: never;
    cursorBrush?: never;
    decorator?: never;
    textObfuscationCharacter?: never;
    scrollState?: never;
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
    onTextLayout?: never;
    interactionSource?: never;
    cursorBrush?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
    scrollState?: never;
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
    interactionSource?: never;
    cursorBrush?: never;
    decorator?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
    scrollState?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly?: boolean;
    inputTransformation: ComposeInputTransformation | null;
    keyboardOptions?: ComposeKeyboardOptions;
    onKeyboardAction: (() => void) | null;
    textStyle?: never;
    onTextLayout?: never;
    interactionSource?: never;
    cursorBrush?: never;
    decorator?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
    scrollState?: never;
    }
  | {
    state: ComposeTextFieldState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    readOnly?: boolean;
    inputTransformation: ComposeInputTransformation | null;
    textStyle: ComposeTextStyle;
    keyboardOptions?: ComposeKeyboardOptions;
    scrollState: ComposeScrollState;
    onKeyboardAction?: never;
    onTextLayout?: never;
    interactionSource?: never;
    cursorBrush?: never;
    decorator?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
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
    onTextLayout?: never;
    interactionSource?: never;
    cursorBrush?: never;
    decorator?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
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
    textObfuscationMode: ComposeTextObfuscationModeValue;
    enabled?: never;
    onKeyboardAction?: never;
    onTextLayout?: never;
    interactionSource?: never;
    cursorBrush?: never;
    decorator?: never;
    textObfuscationCharacter?: never;
    scrollState?: never;
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
    onTextLayout?: never;
    interactionSource?: never;
    cursorBrush?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
    scrollState?: never;
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
    interactionSource?: never;
    cursorBrush?: never;
    decorator?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
    scrollState?: never;
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
    interactionSource: ComposeInteractionSource | null;
    cursorBrush: ComposeBrush;
    enabled?: never;
    onTextLayout?: never;
    decorator?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
    scrollState?: never;
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
    interactionSource: ComposeInteractionSource | null;
    cursorBrush: ComposeBrush;
    textObfuscationMode: ComposeTextObfuscationModeValue;
    textObfuscationCharacter: string;
    enabled?: never;
    onTextLayout?: never;
    decorator?: never;
    scrollState?: never;
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
    onTextLayout: ((value: ComposeTextLayout) => void) | null;
    interactionSource: ComposeInteractionSource | null;
    cursorBrush: ComposeBrush;
    decorator: ReactNode;
    textObfuscationMode: ComposeTextObfuscationModeValue;
    textObfuscationCharacter: string;
    scrollState: ComposeScrollState;
    enabled?: never;
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
    onTextLayout?: never;
    interactionSource?: never;
    cursorBrush?: never;
    decorator?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
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
    textObfuscationMode: ComposeTextObfuscationModeValue;
    onKeyboardAction?: never;
    onTextLayout?: never;
    interactionSource?: never;
    cursorBrush?: never;
    decorator?: never;
    textObfuscationCharacter?: never;
    scrollState?: never;
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
    onTextLayout?: never;
    interactionSource?: never;
    cursorBrush?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
    scrollState?: never;
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
    interactionSource?: never;
    cursorBrush?: never;
    decorator?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
    scrollState?: never;
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
    interactionSource: ComposeInteractionSource | null;
    cursorBrush: ComposeBrush;
    readOnly?: never;
    onTextLayout?: never;
    decorator?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
    scrollState?: never;
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
    interactionSource: ComposeInteractionSource | null;
    cursorBrush: ComposeBrush;
    textObfuscationMode: ComposeTextObfuscationModeValue;
    textObfuscationCharacter: string;
    readOnly?: never;
    onTextLayout?: never;
    decorator?: never;
    scrollState?: never;
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
    onTextLayout: ((value: ComposeTextLayout) => void) | null;
    interactionSource: ComposeInteractionSource | null;
    cursorBrush: ComposeBrush;
    decorator: ReactNode;
    textObfuscationMode: ComposeTextObfuscationModeValue;
    textObfuscationCharacter: string;
    scrollState: ComposeScrollState;
    readOnly?: never;
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
    textObfuscationMode: ComposeTextObfuscationModeValue;
    textObfuscationCharacter: string;
    inputTransformation?: never;
    onTextLayout?: never;
    decorator?: never;
    scrollState?: never;
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
    onTextLayout: ((value: ComposeTextLayout) => void) | null;
    interactionSource: ComposeInteractionSource | null;
    cursorBrush: ComposeBrush;
    decorator: ReactNode;
    textObfuscationMode: ComposeTextObfuscationModeValue;
    textObfuscationCharacter: string;
    scrollState: ComposeScrollState;
    inputTransformation?: never;
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
    interactionSource: ComposeInteractionSource | null;
    cursorBrush: ComposeBrush;
    textStyle?: never;
    onTextLayout?: never;
    decorator?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
    scrollState?: never;
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
    interactionSource: ComposeInteractionSource | null;
    cursorBrush: ComposeBrush;
    textObfuscationMode: ComposeTextObfuscationModeValue;
    textObfuscationCharacter: string;
    textStyle?: never;
    onTextLayout?: never;
    decorator?: never;
    scrollState?: never;
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
    onTextLayout: ((value: ComposeTextLayout) => void) | null;
    interactionSource: ComposeInteractionSource | null;
    cursorBrush: ComposeBrush;
    decorator: ReactNode;
    textObfuscationMode: ComposeTextObfuscationModeValue;
    textObfuscationCharacter: string;
    scrollState: ComposeScrollState;
    textStyle?: never;
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
    interactionSource: ComposeInteractionSource | null;
    cursorBrush: ComposeBrush;
    keyboardOptions?: never;
    onTextLayout?: never;
    decorator?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
    scrollState?: never;
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
    interactionSource: ComposeInteractionSource | null;
    cursorBrush: ComposeBrush;
    textObfuscationMode: ComposeTextObfuscationModeValue;
    textObfuscationCharacter: string;
    keyboardOptions?: never;
    onTextLayout?: never;
    decorator?: never;
    scrollState?: never;
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
    onTextLayout: ((value: ComposeTextLayout) => void) | null;
    interactionSource: ComposeInteractionSource | null;
    cursorBrush: ComposeBrush;
    decorator: ReactNode;
    textObfuscationMode: ComposeTextObfuscationModeValue;
    textObfuscationCharacter: string;
    scrollState: ComposeScrollState;
    keyboardOptions?: never;
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
    interactionSource: ComposeInteractionSource | null;
    cursorBrush: ComposeBrush;
    onKeyboardAction?: never;
    onTextLayout?: never;
    decorator?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
    scrollState?: never;
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
    interactionSource: ComposeInteractionSource | null;
    cursorBrush: ComposeBrush;
    textObfuscationMode: ComposeTextObfuscationModeValue;
    textObfuscationCharacter: string;
    onKeyboardAction?: never;
    onTextLayout?: never;
    decorator?: never;
    scrollState?: never;
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
    onTextLayout: ((value: ComposeTextLayout) => void) | null;
    interactionSource: ComposeInteractionSource | null;
    cursorBrush: ComposeBrush;
    decorator: ReactNode;
    textObfuscationMode: ComposeTextObfuscationModeValue;
    textObfuscationCharacter: string;
    scrollState: ComposeScrollState;
    onKeyboardAction?: never;
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
    cursorBrush: ComposeBrush;
    onTextLayout?: never;
    interactionSource?: never;
    decorator?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
    scrollState?: never;
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
    cursorBrush: ComposeBrush;
    textObfuscationMode: ComposeTextObfuscationModeValue;
    textObfuscationCharacter: string;
    onTextLayout?: never;
    interactionSource?: never;
    decorator?: never;
    scrollState?: never;
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
    onTextLayout?: never;
    cursorBrush?: never;
    decorator?: never;
    textObfuscationMode?: never;
    textObfuscationCharacter?: never;
    scrollState?: never;
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
    textObfuscationMode: ComposeTextObfuscationModeValue;
    textObfuscationCharacter: string;
    onTextLayout?: never;
    cursorBrush?: never;
    decorator?: never;
    scrollState?: never;
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
    onTextLayout?: ((value: ComposeTextLayout) => void) | null;
    interactionSource: ComposeInteractionSource | null;
    cursorBrush: ComposeBrush;
    decorator?: ReactNode;
    textObfuscationMode?: ComposeTextObfuscationModeValue;
    textObfuscationCharacter?: string;
    scrollState?: ComposeScrollState;
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
    cursorBrush: ComposeBrush;
    decorator: ReactNode;
    textObfuscationMode: ComposeTextObfuscationModeValue;
    textObfuscationCharacter: string;
    scrollState: ComposeScrollState;
    interactionSource?: never;
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
    decorator: ReactNode;
    textObfuscationMode: ComposeTextObfuscationModeValue;
    textObfuscationCharacter: string;
    scrollState: ComposeScrollState;
    cursorBrush?: never;
    }
;
export const BasicSecureTextField = createComposableComponent<BasicSecureTextFieldProps>({
  name: "BasicSecureTextField",
  props: ["state","modifier","enabled","readOnly","inputTransformation","textStyle","keyboardOptions","interactionSource","cursorBrush","textObfuscationMode","textObfuscationCharacter","scrollState"],
  objectProps: ["state","inputTransformation","textStyle","keyboardOptions","interactionSource","cursorBrush","scrollState"],
  slots: ["decorator"],
  events: ["onKeyboardAction","onTextLayout"],
  children: false,
  overloads: [
    { id: "BasicSecureTextField", children: false, parameters: [["state","object",false,false],["modifier","ComposeModifier",true,false],["enabled","boolean",true,false],["readOnly","boolean",true,false],["inputTransformation","object",true,true],["textStyle","object",true,false],["keyboardOptions","object",true,false],["onKeyboardAction","function",true,true],["onTextLayout","function",true,true],["interactionSource","object",true,true],["cursorBrush","brush",true,false],["decorator","ReactNode",true,true],["textObfuscationMode","string",true,false],["textObfuscationCharacter","string",true,false],["scrollState","object",true,false]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,16,17,18,19,20,21,22,23,24,25,26,27,32,33,34,35,36,37,38,39,40,41,42,43,48,49,50,51,52,53,54,55,56,57,58,59,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,128,129,130,131,136,137,138,139,144,145,146,147,152,153,154,155,160,161,162,163,168,169,170,171,176,177,178,179,184,185,186,187,191,256,257,258,259,264,265,266,267,272,273,274,275,280,281,282,283,288,289,290,291,296,297,298,299,304,305,306,307,312,313,314,315,319,384,385,386,387,392,393,394,395,400,401,402,403,408,409,410,411,415,416,417,418,419,424,425,426,427,431,432,433,434,435,439,440,441,442,443,445,446,447,511,512,513,514,515,516,517,518,519,520,521,522,523,524,525,526,527,528,529,530,531,532,533,534,535,536,537,538,539,540,541,542,543,576,959,1023,1024,1025,1026,1027,1028,1029,1030,1031,1032,1033,1034,1035,1036,1037,1038,1039,1040,1041,1042,1043,1044,1045,1046,1047,1048,1049,1050,1051,1052,1053,1054,1055,1471,1535,1983,2047,2048,2049,2050,2051,2052,2053,2054,2055,2056,2057,2058,2059,2060,2061,2062,2063,2064,2065,2066,2067,2068,2069,2070,2071,2072,2073,2074,2075,2076,2077,2078,2079,2495,2559,3007,3071,3072,3263,3391,3487,3503,3511,3515,3517,3518,3519,3583,4031,4095,4096,4097,4098,4099,4100,4101,4102,4103,4104,4105,4106,4107,4108,4109,4110,4111,4112,4113,4114,4115,4116,4117,4118,4119,4120,4121,4122,4123,4124,4125,4126,4127,4160,4543,4607,4608,5055,5119,5567,5631,6079,6143,6591,6655,7103,7167,7615,7679,7935,8063,8127,8159,8175,8183,8187,8189,8190,8191] },
  ],
});
