// Generated from Compose declarations by generate.mjs.
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeFontFamilyValue, ComposeTextAutoSizeValue } from "../values/records";
import type { ComposeAnnotatedString, ComposeTextLayout, ComposeTextStyle } from "../../utils/composeValues";
import type { ComposeFontStyleValue, ComposeFontWeight, ComposeTextAlign, ComposeTextDecorationValue, ComposeTextOverflow } from "../values/enums";

export type TextProps =
  | {
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
    composeTextStyle?: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    overflow?: never;
    softWrap?: never;
    maxLines?: never;
    minLines?: never;
    onTextLayout?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color?: string;
    fontSize?: number;
    fontWeight?: ComposeFontWeight | null;
    letterSpacing?: number;
    lineHeight?: number;
    onTextLayout: ((value: ComposeTextLayout) => void) | null;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    textAlign?: never;
    overflow?: never;
    softWrap?: never;
    maxLines?: never;
    minLines?: never;
    composeTextStyle?: never;
    }
  | {
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
    minLines: number;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    overflow?: never;
    softWrap?: never;
    maxLines?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
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
    maxLines: number;
    minLines?: number;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    overflow?: never;
    softWrap?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize?: number;
    fontWeight?: ComposeFontWeight | null;
    letterSpacing?: number;
    textAlign?: ComposeTextAlign | null;
    lineHeight?: number;
    softWrap: boolean;
    maxLines?: number;
    minLines?: number;
    color?: never;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    overflow?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontWeight?: ComposeFontWeight | null;
    letterSpacing?: number;
    textAlign?: ComposeTextAlign | null;
    lineHeight?: number;
    overflow: ComposeTextOverflow;
    softWrap?: boolean;
    maxLines?: number;
    minLines?: number;
    color?: never;
    autoSize?: never;
    fontSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color?: string;
    fontSize?: number;
    fontWeight?: ComposeFontWeight | null;
    letterSpacing?: number;
    textDecoration: ComposeTextDecorationValue | null;
    lineHeight?: number;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textAlign?: never;
    overflow?: never;
    softWrap?: never;
    maxLines?: never;
    minLines?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color?: string;
    fontSize?: number;
    fontWeight?: ComposeFontWeight | null;
    fontFamily: ComposeFontFamilyValue | null;
    letterSpacing?: number;
    lineHeight?: number;
    autoSize?: never;
    fontStyle?: never;
    textDecoration?: never;
    textAlign?: never;
    overflow?: never;
    softWrap?: never;
    maxLines?: never;
    minLines?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontFamily: ComposeFontFamilyValue | null;
    textDecoration: ComposeTextDecorationValue | null;
    color?: never;
    autoSize?: never;
    fontSize?: never;
    fontStyle?: never;
    fontWeight?: never;
    letterSpacing?: never;
    textAlign?: never;
    lineHeight?: never;
    overflow?: never;
    softWrap?: never;
    maxLines?: never;
    minLines?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color?: string;
    fontSize?: number;
    fontStyle: ComposeFontStyleValue | null;
    fontWeight?: ComposeFontWeight | null;
    letterSpacing?: number;
    lineHeight?: number;
    autoSize?: never;
    fontFamily?: never;
    textDecoration?: never;
    textAlign?: never;
    overflow?: never;
    softWrap?: never;
    maxLines?: never;
    minLines?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontStyle: ComposeFontStyleValue | null;
    textDecoration: ComposeTextDecorationValue | null;
    color?: never;
    autoSize?: never;
    fontSize?: never;
    fontWeight?: never;
    fontFamily?: never;
    letterSpacing?: never;
    textAlign?: never;
    lineHeight?: never;
    overflow?: never;
    softWrap?: never;
    maxLines?: never;
    minLines?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontStyle: ComposeFontStyleValue | null;
    fontFamily: ComposeFontFamilyValue | null;
    color?: never;
    autoSize?: never;
    fontSize?: never;
    fontWeight?: never;
    letterSpacing?: never;
    textDecoration?: never;
    textAlign?: never;
    lineHeight?: never;
    overflow?: never;
    softWrap?: never;
    maxLines?: never;
    minLines?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize: number;
    letterSpacing?: number;
    textAlign?: ComposeTextAlign | null;
    lineHeight?: number;
    overflow: ComposeTextOverflow;
    softWrap?: boolean;
    maxLines?: number;
    minLines?: number;
    color?: never;
    autoSize?: never;
    fontStyle?: never;
    fontWeight?: never;
    fontFamily?: never;
    textDecoration?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    textAlign?: ComposeTextAlign | null;
    lineHeight?: number;
    overflow: ComposeTextOverflow;
    softWrap?: boolean;
    maxLines?: number;
    minLines?: number;
    color?: never;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    letterSpacing?: never;
    textDecoration?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    lineHeight?: number;
    overflow: ComposeTextOverflow;
    softWrap?: boolean;
    maxLines?: number;
    minLines?: number;
    color?: never;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    textAlign?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    overflow: ComposeTextOverflow;
    softWrap?: boolean;
    maxLines?: number;
    minLines?: number;
    color?: never;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    lineHeight?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    maxLines?: number;
    minLines?: number;
    color?: never;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    softWrap?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    minLines?: number;
    color?: never;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    maxLines?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    maxLines: number;
    color?: never;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    minLines?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    maxLines: number;
    minLines: number;
    composeTextStyle?: ComposeTextStyle;
    color?: never;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    onTextLayout?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color?: string;
    autoSize: ComposeTextAutoSizeValue | null;
    fontSize?: number;
    fontWeight?: ComposeFontWeight | null;
    letterSpacing?: number;
    lineHeight?: number;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    textAlign?: never;
    overflow?: never;
    softWrap?: never;
    maxLines?: never;
    minLines?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    autoSize: ComposeTextAutoSizeValue | null;
    textDecoration: ComposeTextDecorationValue | null;
    color?: never;
    fontSize?: never;
    fontStyle?: never;
    fontWeight?: never;
    fontFamily?: never;
    letterSpacing?: never;
    textAlign?: never;
    lineHeight?: never;
    overflow?: never;
    softWrap?: never;
    maxLines?: never;
    minLines?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    autoSize: ComposeTextAutoSizeValue | null;
    fontFamily: ComposeFontFamilyValue | null;
    color?: never;
    fontSize?: never;
    fontStyle?: never;
    fontWeight?: never;
    letterSpacing?: never;
    textDecoration?: never;
    textAlign?: never;
    lineHeight?: never;
    overflow?: never;
    softWrap?: never;
    maxLines?: never;
    minLines?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    autoSize: ComposeTextAutoSizeValue | null;
    fontStyle: ComposeFontStyleValue | null;
    color?: never;
    fontSize?: never;
    fontWeight?: never;
    fontFamily?: never;
    letterSpacing?: never;
    textDecoration?: never;
    textAlign?: never;
    lineHeight?: never;
    overflow?: never;
    softWrap?: never;
    maxLines?: never;
    minLines?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    autoSize: ComposeTextAutoSizeValue | null;
    fontSize: number;
    fontStyle: ComposeFontStyleValue | null;
    fontWeight: ComposeFontWeight | null;
    fontFamily?: ComposeFontFamilyValue | null;
    letterSpacing: number;
    textDecoration: ComposeTextDecorationValue | null;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    maxLines: number;
    minLines: number;
    onTextLayout?: ((value: ComposeTextLayout) => void) | null;
    composeTextStyle: ComposeTextStyle;
    color?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    fontWeight?: ComposeFontWeight | null;
    letterSpacing?: number;
    textAlign?: ComposeTextAlign | null;
    lineHeight?: number;
    softWrap: boolean;
    maxLines?: number;
    minLines?: number;
    autoSize?: never;
    fontSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    overflow?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    letterSpacing?: number;
    textAlign?: ComposeTextAlign | null;
    lineHeight?: number;
    overflow: ComposeTextOverflow;
    softWrap?: boolean;
    maxLines?: number;
    minLines?: number;
    autoSize?: never;
    fontSize?: never;
    fontStyle?: never;
    fontWeight?: never;
    fontFamily?: never;
    textDecoration?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    fontWeight: ComposeFontWeight | null;
    textAlign?: ComposeTextAlign | null;
    lineHeight?: number;
    overflow: ComposeTextOverflow;
    softWrap?: boolean;
    maxLines?: number;
    minLines?: number;
    autoSize?: never;
    fontSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    letterSpacing?: never;
    textDecoration?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    lineHeight?: number;
    overflow: ComposeTextOverflow;
    softWrap?: boolean;
    maxLines?: number;
    minLines?: number;
    autoSize?: never;
    fontSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    textAlign?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    overflow: ComposeTextOverflow;
    softWrap?: boolean;
    maxLines?: number;
    minLines?: number;
    autoSize?: never;
    fontSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    lineHeight?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    maxLines?: number;
    minLines?: number;
    autoSize?: never;
    fontSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    softWrap?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    minLines?: number;
    autoSize?: never;
    fontSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    maxLines?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    maxLines: number;
    autoSize?: never;
    fontSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    minLines?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    maxLines: number;
    minLines: number;
    composeTextStyle?: ComposeTextStyle;
    autoSize?: never;
    fontSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    onTextLayout?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    fontSize: number;
    letterSpacing?: number;
    textAlign?: ComposeTextAlign | null;
    lineHeight?: number;
    softWrap: boolean;
    maxLines?: number;
    minLines?: number;
    autoSize?: never;
    fontStyle?: never;
    fontWeight?: never;
    fontFamily?: never;
    textDecoration?: never;
    overflow?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    fontSize: number;
    textAlign?: ComposeTextAlign | null;
    lineHeight?: number;
    overflow: ComposeTextOverflow;
    softWrap?: boolean;
    maxLines?: number;
    minLines?: number;
    autoSize?: never;
    fontStyle?: never;
    fontWeight?: never;
    fontFamily?: never;
    letterSpacing?: never;
    textDecoration?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    fontSize: number;
    letterSpacing: number;
    lineHeight?: number;
    overflow: ComposeTextOverflow;
    softWrap?: boolean;
    maxLines?: number;
    minLines?: number;
    autoSize?: never;
    fontStyle?: never;
    fontWeight?: never;
    fontFamily?: never;
    textDecoration?: never;
    textAlign?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    fontSize: number;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    overflow: ComposeTextOverflow;
    softWrap?: boolean;
    maxLines?: number;
    minLines?: number;
    autoSize?: never;
    fontStyle?: never;
    fontWeight?: never;
    fontFamily?: never;
    textDecoration?: never;
    lineHeight?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    fontSize: number;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    maxLines?: number;
    minLines?: number;
    autoSize?: never;
    fontStyle?: never;
    fontWeight?: never;
    fontFamily?: never;
    textDecoration?: never;
    softWrap?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    fontSize: number;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    minLines?: number;
    autoSize?: never;
    fontStyle?: never;
    fontWeight?: never;
    fontFamily?: never;
    textDecoration?: never;
    maxLines?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    fontSize: number;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    maxLines: number;
    autoSize?: never;
    fontStyle?: never;
    fontWeight?: never;
    fontFamily?: never;
    textDecoration?: never;
    minLines?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    fontSize: number;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    maxLines: number;
    minLines: number;
    composeTextStyle?: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontWeight?: never;
    fontFamily?: never;
    textDecoration?: never;
    onTextLayout?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    textAlign?: ComposeTextAlign | null;
    lineHeight?: number;
    softWrap: boolean;
    maxLines?: number;
    minLines?: number;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    letterSpacing?: never;
    textDecoration?: never;
    overflow?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    lineHeight?: number;
    overflow: ComposeTextOverflow;
    softWrap?: boolean;
    maxLines?: number;
    minLines?: number;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    letterSpacing?: never;
    textDecoration?: never;
    textAlign?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    textAlign: ComposeTextAlign | null;
    overflow: ComposeTextOverflow;
    softWrap?: boolean;
    maxLines?: number;
    minLines?: number;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    letterSpacing?: never;
    textDecoration?: never;
    lineHeight?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    maxLines?: number;
    minLines?: number;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    letterSpacing?: never;
    textDecoration?: never;
    softWrap?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    minLines?: number;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    letterSpacing?: never;
    textDecoration?: never;
    maxLines?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    maxLines: number;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    letterSpacing?: never;
    textDecoration?: never;
    minLines?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    maxLines: number;
    minLines: number;
    composeTextStyle?: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    letterSpacing?: never;
    textDecoration?: never;
    onTextLayout?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    lineHeight?: number;
    softWrap: boolean;
    maxLines?: number;
    minLines?: number;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    textAlign?: never;
    overflow?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    overflow: ComposeTextOverflow;
    softWrap?: boolean;
    maxLines?: number;
    minLines?: number;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    textAlign?: never;
    lineHeight?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    maxLines?: number;
    minLines?: number;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    textAlign?: never;
    softWrap?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    minLines?: number;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    textAlign?: never;
    maxLines?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    maxLines: number;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    textAlign?: never;
    minLines?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    maxLines: number;
    minLines: number;
    composeTextStyle?: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    textAlign?: never;
    onTextLayout?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    softWrap: boolean;
    maxLines?: number;
    minLines?: number;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    lineHeight?: never;
    overflow?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    overflow: ComposeTextOverflow;
    maxLines?: number;
    minLines?: number;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    lineHeight?: never;
    softWrap?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    minLines?: number;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    lineHeight?: never;
    maxLines?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    maxLines: number;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    lineHeight?: never;
    minLines?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    maxLines: number;
    minLines: number;
    composeTextStyle?: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    lineHeight?: never;
    onTextLayout?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    softWrap: boolean;
    minLines?: number;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    overflow?: never;
    maxLines?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    softWrap: boolean;
    maxLines: number;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    overflow?: never;
    minLines?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    softWrap: boolean;
    maxLines: number;
    minLines: number;
    composeTextStyle?: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    overflow?: never;
    onTextLayout?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    minLines?: number;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    softWrap?: never;
    maxLines?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    maxLines: number;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    softWrap?: never;
    minLines?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    maxLines: number;
    minLines: number;
    composeTextStyle?: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    softWrap?: never;
    onTextLayout?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    maxLines?: never;
    minLines?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    minLines: number;
    composeTextStyle?: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    maxLines?: never;
    onTextLayout?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    maxLines: number;
    minLines?: number;
    composeTextStyle?: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    onTextLayout?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    maxLines: number;
    minLines: number;
    onTextLayout: ((value: ComposeTextLayout) => void) | null;
    composeTextStyle: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    textDecoration: ComposeTextDecorationValue | null;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    maxLines: number;
    minLines: number;
    onTextLayout?: ((value: ComposeTextLayout) => void) | null;
    composeTextStyle: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    fontFamily: ComposeFontFamilyValue | null;
    letterSpacing: number;
    textDecoration?: ComposeTextDecorationValue | null;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    maxLines: number;
    minLines: number;
    onTextLayout?: ((value: ComposeTextLayout) => void) | null;
    composeTextStyle: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    fontSize: number;
    fontStyle: ComposeFontStyleValue | null;
    fontWeight: ComposeFontWeight | null;
    fontFamily?: ComposeFontFamilyValue | null;
    letterSpacing: number;
    textDecoration?: ComposeTextDecorationValue | null;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    maxLines: number;
    minLines: number;
    onTextLayout?: ((value: ComposeTextLayout) => void) | null;
    composeTextStyle: ComposeTextStyle;
    autoSize?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    autoSize: ComposeTextAutoSizeValue | null;
    fontStyle: ComposeFontStyleValue | null;
    fontWeight: ComposeFontWeight | null;
    fontFamily?: ComposeFontFamilyValue | null;
    letterSpacing: number;
    textDecoration: ComposeTextDecorationValue | null;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    maxLines: number;
    minLines: number;
    onTextLayout?: ((value: ComposeTextLayout) => void) | null;
    composeTextStyle: ComposeTextStyle;
    fontSize?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    autoSize: ComposeTextAutoSizeValue | null;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    fontFamily?: ComposeFontFamilyValue | null;
    letterSpacing: number;
    textDecoration?: ComposeTextDecorationValue | null;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    maxLines: number;
    minLines: number;
    onTextLayout?: ((value: ComposeTextLayout) => void) | null;
    composeTextStyle: ComposeTextStyle;
    fontStyle?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    autoSize: ComposeTextAutoSizeValue | null;
    fontSize: number;
    fontStyle: ComposeFontStyleValue | null;
    fontFamily?: ComposeFontFamilyValue | null;
    letterSpacing: number;
    textDecoration: ComposeTextDecorationValue | null;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    maxLines: number;
    minLines: number;
    onTextLayout?: ((value: ComposeTextLayout) => void) | null;
    composeTextStyle: ComposeTextStyle;
    fontWeight?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    autoSize: ComposeTextAutoSizeValue | null;
    fontSize: number;
    fontStyle: ComposeFontStyleValue | null;
    fontWeight: ComposeFontWeight | null;
    fontFamily?: ComposeFontFamilyValue | null;
    textDecoration: ComposeTextDecorationValue | null;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    maxLines: number;
    minLines: number;
    onTextLayout?: ((value: ComposeTextLayout) => void) | null;
    composeTextStyle: ComposeTextStyle;
    letterSpacing?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    autoSize: ComposeTextAutoSizeValue | null;
    fontSize: number;
    fontStyle: ComposeFontStyleValue | null;
    fontWeight: ComposeFontWeight | null;
    fontFamily?: ComposeFontFamilyValue | null;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    maxLines: number;
    minLines: number;
    onTextLayout?: ((value: ComposeTextLayout) => void) | null;
    composeTextStyle: ComposeTextStyle;
    textDecoration?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    autoSize: ComposeTextAutoSizeValue | null;
    fontSize: number;
    fontStyle: ComposeFontStyleValue | null;
    fontWeight: ComposeFontWeight | null;
    fontFamily?: ComposeFontFamilyValue | null;
    letterSpacing: number;
    textDecoration: ComposeTextDecorationValue | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    maxLines: number;
    minLines: number;
    onTextLayout?: ((value: ComposeTextLayout) => void) | null;
    composeTextStyle: ComposeTextStyle;
    textAlign?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    autoSize: ComposeTextAutoSizeValue | null;
    fontSize: number;
    fontStyle: ComposeFontStyleValue | null;
    fontWeight: ComposeFontWeight | null;
    fontFamily?: ComposeFontFamilyValue | null;
    letterSpacing: number;
    textDecoration: ComposeTextDecorationValue | null;
    textAlign: ComposeTextAlign | null;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    maxLines: number;
    minLines: number;
    onTextLayout?: ((value: ComposeTextLayout) => void) | null;
    composeTextStyle: ComposeTextStyle;
    lineHeight?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    autoSize: ComposeTextAutoSizeValue | null;
    fontSize: number;
    fontStyle: ComposeFontStyleValue | null;
    fontWeight: ComposeFontWeight | null;
    fontFamily?: ComposeFontFamilyValue | null;
    letterSpacing: number;
    textDecoration: ComposeTextDecorationValue | null;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    softWrap: boolean;
    maxLines: number;
    minLines: number;
    onTextLayout?: ((value: ComposeTextLayout) => void) | null;
    composeTextStyle: ComposeTextStyle;
    overflow?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    autoSize: ComposeTextAutoSizeValue | null;
    fontSize: number;
    fontStyle: ComposeFontStyleValue | null;
    fontWeight: ComposeFontWeight | null;
    fontFamily?: ComposeFontFamilyValue | null;
    letterSpacing: number;
    textDecoration: ComposeTextDecorationValue | null;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    maxLines: number;
    minLines: number;
    onTextLayout?: ((value: ComposeTextLayout) => void) | null;
    composeTextStyle: ComposeTextStyle;
    softWrap?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    autoSize: ComposeTextAutoSizeValue | null;
    fontSize: number;
    fontStyle: ComposeFontStyleValue | null;
    fontWeight: ComposeFontWeight | null;
    fontFamily?: ComposeFontFamilyValue | null;
    letterSpacing: number;
    textDecoration: ComposeTextDecorationValue | null;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    minLines: number;
    onTextLayout?: ((value: ComposeTextLayout) => void) | null;
    composeTextStyle: ComposeTextStyle;
    maxLines?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    autoSize: ComposeTextAutoSizeValue | null;
    fontSize: number;
    fontStyle: ComposeFontStyleValue | null;
    fontWeight: ComposeFontWeight | null;
    fontFamily?: ComposeFontFamilyValue | null;
    letterSpacing: number;
    textDecoration: ComposeTextDecorationValue | null;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    maxLines: number;
    onTextLayout?: ((value: ComposeTextLayout) => void) | null;
    composeTextStyle: ComposeTextStyle;
    minLines?: never;
    }
  | {
    text: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    autoSize: ComposeTextAutoSizeValue | null;
    fontSize: number;
    fontStyle: ComposeFontStyleValue | null;
    fontWeight: ComposeFontWeight | null;
    fontFamily?: ComposeFontFamilyValue | null;
    letterSpacing: number;
    textDecoration: ComposeTextDecorationValue | null;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    maxLines: number;
    minLines: number;
    onTextLayout?: ((value: ComposeTextLayout) => void) | null;
    composeTextStyle?: ComposeTextStyle;
    }
  | {
    text: ComposeAnnotatedString;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color?: string;
    fontSize?: number;
    letterSpacing?: number;
    textAlign?: ComposeTextAlign | null;
    lineHeight?: number;
    composeTextStyle?: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontWeight?: never;
    fontFamily?: never;
    textDecoration?: never;
    overflow?: never;
    softWrap?: never;
    maxLines?: never;
    minLines?: never;
    onTextLayout?: never;
    }
  | {
    text: ComposeAnnotatedString;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color?: string;
    fontSize?: number;
    fontWeight?: ComposeFontWeight | null;
    letterSpacing?: number;
    lineHeight?: number;
    onTextLayout: (value: ComposeTextLayout) => void;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    textAlign?: never;
    overflow?: never;
    softWrap?: never;
    maxLines?: never;
    minLines?: never;
    composeTextStyle?: never;
    }
  | {
    text: ComposeAnnotatedString;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color?: string;
    fontSize?: number;
    letterSpacing?: number;
    lineHeight?: number;
    minLines: number;
    autoSize?: never;
    fontStyle?: never;
    fontWeight?: never;
    fontFamily?: never;
    textDecoration?: never;
    textAlign?: never;
    overflow?: never;
    softWrap?: never;
    maxLines?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: ComposeAnnotatedString;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color?: string;
    fontSize?: number;
    letterSpacing?: number;
    lineHeight?: number;
    maxLines: number;
    autoSize?: never;
    fontStyle?: never;
    fontWeight?: never;
    fontFamily?: never;
    textDecoration?: never;
    textAlign?: never;
    overflow?: never;
    softWrap?: never;
    minLines?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: ComposeAnnotatedString;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color?: string;
    fontSize?: number;
    letterSpacing?: number;
    lineHeight?: number;
    softWrap: boolean;
    autoSize?: never;
    fontStyle?: never;
    fontWeight?: never;
    fontFamily?: never;
    textDecoration?: never;
    textAlign?: never;
    overflow?: never;
    maxLines?: never;
    minLines?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: ComposeAnnotatedString;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color?: string;
    fontSize?: number;
    letterSpacing?: number;
    lineHeight?: number;
    overflow: ComposeTextOverflow;
    autoSize?: never;
    fontStyle?: never;
    fontWeight?: never;
    fontFamily?: never;
    textDecoration?: never;
    textAlign?: never;
    softWrap?: never;
    maxLines?: never;
    minLines?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: ComposeAnnotatedString;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color?: string;
    fontSize?: number;
    fontWeight?: ComposeFontWeight | null;
    letterSpacing?: number;
    textDecoration: ComposeTextDecorationValue | null;
    lineHeight?: number;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textAlign?: never;
    overflow?: never;
    softWrap?: never;
    maxLines?: never;
    minLines?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: ComposeAnnotatedString;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color?: string;
    fontSize?: number;
    fontWeight?: ComposeFontWeight | null;
    fontFamily: ComposeFontFamilyValue | null;
    letterSpacing?: number;
    lineHeight?: number;
    autoSize?: never;
    fontStyle?: never;
    textDecoration?: never;
    textAlign?: never;
    overflow?: never;
    softWrap?: never;
    maxLines?: never;
    minLines?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: ComposeAnnotatedString;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontFamily: ComposeFontFamilyValue | null;
    textDecoration: ComposeTextDecorationValue | null;
    color?: never;
    autoSize?: never;
    fontSize?: never;
    fontStyle?: never;
    fontWeight?: never;
    letterSpacing?: never;
    textAlign?: never;
    lineHeight?: never;
    overflow?: never;
    softWrap?: never;
    maxLines?: never;
    minLines?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: ComposeAnnotatedString;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color?: string;
    fontSize?: number;
    fontWeight: ComposeFontWeight | null;
    letterSpacing?: number;
    lineHeight?: number;
    composeTextStyle?: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    textAlign?: never;
    overflow?: never;
    softWrap?: never;
    maxLines?: never;
    minLines?: never;
    onTextLayout?: never;
    }
  | {
    text: ComposeAnnotatedString;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color?: string;
    fontSize?: number;
    fontWeight: ComposeFontWeight | null;
    letterSpacing?: number;
    textAlign: ComposeTextAlign | null;
    lineHeight?: number;
    composeTextStyle: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    overflow?: never;
    softWrap?: never;
    maxLines?: never;
    minLines?: never;
    onTextLayout?: never;
    }
  | {
    text: ComposeAnnotatedString;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color?: string;
    fontSize?: number;
    fontStyle: ComposeFontStyleValue | null;
    fontWeight?: ComposeFontWeight | null;
    letterSpacing?: number;
    lineHeight?: number;
    autoSize?: never;
    fontFamily?: never;
    textDecoration?: never;
    textAlign?: never;
    overflow?: never;
    softWrap?: never;
    maxLines?: never;
    minLines?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: ComposeAnnotatedString;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontStyle: ComposeFontStyleValue | null;
    textDecoration: ComposeTextDecorationValue | null;
    color?: never;
    autoSize?: never;
    fontSize?: never;
    fontWeight?: never;
    fontFamily?: never;
    letterSpacing?: never;
    textAlign?: never;
    lineHeight?: never;
    overflow?: never;
    softWrap?: never;
    maxLines?: never;
    minLines?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: ComposeAnnotatedString;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontStyle: ComposeFontStyleValue | null;
    fontFamily: ComposeFontFamilyValue | null;
    color?: never;
    autoSize?: never;
    fontSize?: never;
    fontWeight?: never;
    letterSpacing?: never;
    textDecoration?: never;
    textAlign?: never;
    lineHeight?: never;
    overflow?: never;
    softWrap?: never;
    maxLines?: never;
    minLines?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: ComposeAnnotatedString;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    maxLines: number;
    minLines: number;
    composeTextStyle: ComposeTextStyle;
    color?: never;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    onTextLayout?: never;
    }
  | {
    text: ComposeAnnotatedString;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color?: string;
    autoSize: ComposeTextAutoSizeValue | null;
    fontSize?: number;
    fontWeight?: ComposeFontWeight | null;
    letterSpacing?: number;
    lineHeight?: number;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    textAlign?: never;
    overflow?: never;
    softWrap?: never;
    maxLines?: never;
    minLines?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: ComposeAnnotatedString;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    autoSize: ComposeTextAutoSizeValue | null;
    textDecoration: ComposeTextDecorationValue | null;
    color?: never;
    fontSize?: never;
    fontStyle?: never;
    fontWeight?: never;
    fontFamily?: never;
    letterSpacing?: never;
    textAlign?: never;
    lineHeight?: never;
    overflow?: never;
    softWrap?: never;
    maxLines?: never;
    minLines?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: ComposeAnnotatedString;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    autoSize: ComposeTextAutoSizeValue | null;
    fontFamily: ComposeFontFamilyValue | null;
    color?: never;
    fontSize?: never;
    fontStyle?: never;
    fontWeight?: never;
    letterSpacing?: never;
    textDecoration?: never;
    textAlign?: never;
    lineHeight?: never;
    overflow?: never;
    softWrap?: never;
    maxLines?: never;
    minLines?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: ComposeAnnotatedString;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    autoSize: ComposeTextAutoSizeValue | null;
    fontStyle: ComposeFontStyleValue | null;
    color?: never;
    fontSize?: never;
    fontWeight?: never;
    fontFamily?: never;
    letterSpacing?: never;
    textDecoration?: never;
    textAlign?: never;
    lineHeight?: never;
    overflow?: never;
    softWrap?: never;
    maxLines?: never;
    minLines?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: ComposeAnnotatedString;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    autoSize: ComposeTextAutoSizeValue | null;
    fontSize: number;
    fontStyle: ComposeFontStyleValue | null;
    fontWeight: ComposeFontWeight | null;
    fontFamily?: ComposeFontFamilyValue | null;
    letterSpacing: number;
    textDecoration: ComposeTextDecorationValue | null;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    maxLines: number;
    minLines: number;
    onTextLayout?: (value: ComposeTextLayout) => void;
    composeTextStyle: ComposeTextStyle;
    color?: never;
    }
  | {
    text: ComposeAnnotatedString;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    maxLines: number;
    minLines: number;
    composeTextStyle: ComposeTextStyle;
    autoSize?: never;
    fontSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    onTextLayout?: never;
    }
  | {
    text: ComposeAnnotatedString;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    fontSize: number;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    maxLines: number;
    minLines: number;
    composeTextStyle: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontWeight?: never;
    fontFamily?: never;
    textDecoration?: never;
    onTextLayout?: never;
    }
  | {
    text: ComposeAnnotatedString;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    maxLines: number;
    minLines: number;
    composeTextStyle: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    letterSpacing?: never;
    textDecoration?: never;
    onTextLayout?: never;
    }
  | {
    text: ComposeAnnotatedString;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    maxLines: number;
    minLines: number;
    composeTextStyle: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    textAlign?: never;
    onTextLayout?: never;
    }
  | {
    text: ComposeAnnotatedString;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    maxLines: number;
    minLines: number;
    composeTextStyle: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    lineHeight?: never;
    onTextLayout?: never;
    }
  | {
    text: ComposeAnnotatedString;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    softWrap: boolean;
    maxLines: number;
    minLines: number;
    composeTextStyle: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    overflow?: never;
    onTextLayout?: never;
    }
  | {
    text: ComposeAnnotatedString;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    maxLines: number;
    minLines: number;
    composeTextStyle: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    softWrap?: never;
    onTextLayout?: never;
    }
  | {
    text: ComposeAnnotatedString;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    minLines: number;
    composeTextStyle: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    maxLines?: never;
    onTextLayout?: never;
    }
  | {
    text: ComposeAnnotatedString;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    maxLines: number;
    composeTextStyle: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    minLines?: never;
    onTextLayout?: never;
    }
  | {
    text: ComposeAnnotatedString;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    maxLines: number;
    minLines: number;
    composeTextStyle?: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    onTextLayout?: never;
    }
  | {
    text: ComposeAnnotatedString;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    maxLines: number;
    minLines: number;
    onTextLayout: (value: ComposeTextLayout) => void;
    composeTextStyle: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    }
  | {
    text: ComposeAnnotatedString;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    textDecoration: ComposeTextDecorationValue | null;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    maxLines: number;
    minLines: number;
    onTextLayout?: (value: ComposeTextLayout) => void;
    composeTextStyle: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    }
  | {
    text: ComposeAnnotatedString;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    fontFamily: ComposeFontFamilyValue | null;
    letterSpacing: number;
    textDecoration?: ComposeTextDecorationValue | null;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    maxLines: number;
    minLines: number;
    onTextLayout?: (value: ComposeTextLayout) => void;
    composeTextStyle: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    }
  | {
    text: ComposeAnnotatedString;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    fontSize: number;
    fontStyle: ComposeFontStyleValue | null;
    fontWeight: ComposeFontWeight | null;
    fontFamily?: ComposeFontFamilyValue | null;
    letterSpacing: number;
    textDecoration?: ComposeTextDecorationValue | null;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    maxLines: number;
    minLines: number;
    onTextLayout?: (value: ComposeTextLayout) => void;
    composeTextStyle: ComposeTextStyle;
    autoSize?: never;
    }
  | {
    text: ComposeAnnotatedString;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    autoSize: ComposeTextAutoSizeValue | null;
    fontStyle: ComposeFontStyleValue | null;
    fontWeight: ComposeFontWeight | null;
    fontFamily?: ComposeFontFamilyValue | null;
    letterSpacing: number;
    textDecoration: ComposeTextDecorationValue | null;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    maxLines: number;
    minLines: number;
    onTextLayout?: (value: ComposeTextLayout) => void;
    composeTextStyle: ComposeTextStyle;
    fontSize?: never;
    }
  | {
    text: ComposeAnnotatedString;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    autoSize: ComposeTextAutoSizeValue | null;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    fontFamily?: ComposeFontFamilyValue | null;
    letterSpacing: number;
    textDecoration?: ComposeTextDecorationValue | null;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    maxLines: number;
    minLines: number;
    onTextLayout?: (value: ComposeTextLayout) => void;
    composeTextStyle: ComposeTextStyle;
    fontStyle?: never;
    }
  | {
    text: ComposeAnnotatedString;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    autoSize: ComposeTextAutoSizeValue | null;
    fontSize: number;
    fontStyle: ComposeFontStyleValue | null;
    fontFamily?: ComposeFontFamilyValue | null;
    letterSpacing: number;
    textDecoration: ComposeTextDecorationValue | null;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    maxLines: number;
    minLines: number;
    onTextLayout?: (value: ComposeTextLayout) => void;
    composeTextStyle: ComposeTextStyle;
    fontWeight?: never;
    }
  | {
    text: ComposeAnnotatedString;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    autoSize: ComposeTextAutoSizeValue | null;
    fontSize: number;
    fontStyle: ComposeFontStyleValue | null;
    fontWeight: ComposeFontWeight | null;
    fontFamily?: ComposeFontFamilyValue | null;
    textDecoration: ComposeTextDecorationValue | null;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    maxLines: number;
    minLines: number;
    onTextLayout?: (value: ComposeTextLayout) => void;
    composeTextStyle: ComposeTextStyle;
    letterSpacing?: never;
    }
  | {
    text: ComposeAnnotatedString;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    autoSize: ComposeTextAutoSizeValue | null;
    fontSize: number;
    fontStyle: ComposeFontStyleValue | null;
    fontWeight: ComposeFontWeight | null;
    fontFamily?: ComposeFontFamilyValue | null;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    maxLines: number;
    minLines: number;
    onTextLayout?: (value: ComposeTextLayout) => void;
    composeTextStyle: ComposeTextStyle;
    textDecoration?: never;
    }
  | {
    text: ComposeAnnotatedString;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    autoSize: ComposeTextAutoSizeValue | null;
    fontSize: number;
    fontStyle: ComposeFontStyleValue | null;
    fontWeight: ComposeFontWeight | null;
    fontFamily?: ComposeFontFamilyValue | null;
    letterSpacing: number;
    textDecoration: ComposeTextDecorationValue | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    maxLines: number;
    minLines: number;
    onTextLayout?: (value: ComposeTextLayout) => void;
    composeTextStyle: ComposeTextStyle;
    textAlign?: never;
    }
  | {
    text: ComposeAnnotatedString;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    autoSize: ComposeTextAutoSizeValue | null;
    fontSize: number;
    fontStyle: ComposeFontStyleValue | null;
    fontWeight: ComposeFontWeight | null;
    fontFamily?: ComposeFontFamilyValue | null;
    letterSpacing: number;
    textDecoration: ComposeTextDecorationValue | null;
    textAlign: ComposeTextAlign | null;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    maxLines: number;
    minLines: number;
    onTextLayout?: (value: ComposeTextLayout) => void;
    composeTextStyle: ComposeTextStyle;
    lineHeight?: never;
    }
  | {
    text: ComposeAnnotatedString;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    autoSize: ComposeTextAutoSizeValue | null;
    fontSize: number;
    fontStyle: ComposeFontStyleValue | null;
    fontWeight: ComposeFontWeight | null;
    fontFamily?: ComposeFontFamilyValue | null;
    letterSpacing: number;
    textDecoration: ComposeTextDecorationValue | null;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    softWrap: boolean;
    maxLines: number;
    minLines: number;
    onTextLayout?: (value: ComposeTextLayout) => void;
    composeTextStyle: ComposeTextStyle;
    overflow?: never;
    }
  | {
    text: ComposeAnnotatedString;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    autoSize: ComposeTextAutoSizeValue | null;
    fontSize: number;
    fontStyle: ComposeFontStyleValue | null;
    fontWeight: ComposeFontWeight | null;
    fontFamily?: ComposeFontFamilyValue | null;
    letterSpacing: number;
    textDecoration: ComposeTextDecorationValue | null;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    maxLines: number;
    minLines: number;
    onTextLayout?: (value: ComposeTextLayout) => void;
    composeTextStyle: ComposeTextStyle;
    softWrap?: never;
    }
  | {
    text: ComposeAnnotatedString;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    autoSize: ComposeTextAutoSizeValue | null;
    fontSize: number;
    fontStyle: ComposeFontStyleValue | null;
    fontWeight: ComposeFontWeight | null;
    fontFamily?: ComposeFontFamilyValue | null;
    letterSpacing: number;
    textDecoration: ComposeTextDecorationValue | null;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    minLines: number;
    onTextLayout?: (value: ComposeTextLayout) => void;
    composeTextStyle: ComposeTextStyle;
    maxLines?: never;
    }
  | {
    text: ComposeAnnotatedString;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    autoSize: ComposeTextAutoSizeValue | null;
    fontSize: number;
    fontStyle: ComposeFontStyleValue | null;
    fontWeight: ComposeFontWeight | null;
    fontFamily?: ComposeFontFamilyValue | null;
    letterSpacing: number;
    textDecoration: ComposeTextDecorationValue | null;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    maxLines: number;
    onTextLayout?: (value: ComposeTextLayout) => void;
    composeTextStyle: ComposeTextStyle;
    minLines?: never;
    }
  | {
    text: ComposeAnnotatedString;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color: string;
    autoSize: ComposeTextAutoSizeValue | null;
    fontSize: number;
    fontStyle: ComposeFontStyleValue | null;
    fontWeight: ComposeFontWeight | null;
    fontFamily?: ComposeFontFamilyValue | null;
    letterSpacing: number;
    textDecoration: ComposeTextDecorationValue | null;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    maxLines: number;
    minLines: number;
    onTextLayout?: (value: ComposeTextLayout) => void;
    composeTextStyle?: ComposeTextStyle;
    }
  | {
    text: string;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize?: number;
    fontWeight?: ComposeFontWeight | null;
    letterSpacing?: number;
    textAlign?: ComposeTextAlign | null;
    lineHeight?: number;
    minLines: number;
    composeTextStyle: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    overflow?: never;
    softWrap?: never;
    maxLines?: never;
    onTextLayout?: never;
    }
  | {
    text: string;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize?: number;
    fontWeight?: ComposeFontWeight | null;
    letterSpacing?: number;
    textAlign?: ComposeTextAlign | null;
    lineHeight?: number;
    maxLines: number;
    minLines?: number;
    composeTextStyle: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    overflow?: never;
    softWrap?: never;
    onTextLayout?: never;
    }
  | {
    text: string;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontWeight?: ComposeFontWeight | null;
    letterSpacing?: number;
    textAlign?: ComposeTextAlign | null;
    lineHeight?: number;
    softWrap: boolean;
    maxLines?: number;
    minLines?: number;
    composeTextStyle: ComposeTextStyle;
    autoSize?: never;
    fontSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    overflow?: never;
    onTextLayout?: never;
    }
  | {
    text: string;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize?: number;
    fontWeight?: ComposeFontWeight | null;
    letterSpacing?: number;
    lineHeight?: number;
    softWrap: boolean;
    onTextLayout: ((value: ComposeTextLayout) => void) | null;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    textAlign?: never;
    overflow?: never;
    maxLines?: never;
    minLines?: never;
    composeTextStyle?: never;
    }
  | {
    text: string;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    letterSpacing?: number;
    textAlign?: ComposeTextAlign | null;
    lineHeight?: number;
    overflow: ComposeTextOverflow;
    softWrap?: boolean;
    maxLines?: number;
    minLines?: number;
    composeTextStyle: ComposeTextStyle;
    autoSize?: never;
    fontSize?: never;
    fontStyle?: never;
    fontWeight?: never;
    fontFamily?: never;
    textDecoration?: never;
    onTextLayout?: never;
    }
  | {
    text: string;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize?: number;
    fontWeight?: ComposeFontWeight | null;
    letterSpacing?: number;
    textDecoration: ComposeTextDecorationValue | null;
    lineHeight?: number;
    softWrap: boolean;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textAlign?: never;
    overflow?: never;
    maxLines?: never;
    minLines?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: string;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize?: number;
    fontWeight?: ComposeFontWeight | null;
    fontFamily: ComposeFontFamilyValue | null;
    letterSpacing?: number;
    lineHeight?: number;
    softWrap: boolean;
    autoSize?: never;
    fontStyle?: never;
    textDecoration?: never;
    textAlign?: never;
    overflow?: never;
    maxLines?: never;
    minLines?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: string;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontFamily: ComposeFontFamilyValue | null;
    textDecoration: ComposeTextDecorationValue | null;
    autoSize?: never;
    fontSize?: never;
    fontStyle?: never;
    fontWeight?: never;
    letterSpacing?: never;
    textAlign?: never;
    lineHeight?: never;
    overflow?: never;
    softWrap?: never;
    maxLines?: never;
    minLines?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: string;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontWeight: ComposeFontWeight | null;
    textAlign?: ComposeTextAlign | null;
    lineHeight?: number;
    overflow: ComposeTextOverflow;
    softWrap?: boolean;
    maxLines?: number;
    minLines?: number;
    composeTextStyle: ComposeTextStyle;
    autoSize?: never;
    fontSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    letterSpacing?: never;
    textDecoration?: never;
    onTextLayout?: never;
    }
  | {
    text: string;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    lineHeight?: number;
    overflow: ComposeTextOverflow;
    softWrap?: boolean;
    maxLines?: number;
    minLines?: number;
    composeTextStyle: ComposeTextStyle;
    autoSize?: never;
    fontSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    textAlign?: never;
    onTextLayout?: never;
    }
  | {
    text: string;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    overflow: ComposeTextOverflow;
    softWrap?: boolean;
    maxLines?: number;
    minLines?: number;
    composeTextStyle: ComposeTextStyle;
    autoSize?: never;
    fontSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    lineHeight?: never;
    onTextLayout?: never;
    }
  | {
    text: string;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    maxLines?: number;
    minLines?: number;
    composeTextStyle: ComposeTextStyle;
    autoSize?: never;
    fontSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    softWrap?: never;
    onTextLayout?: never;
    }
  | {
    text: string;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    minLines?: number;
    composeTextStyle: ComposeTextStyle;
    autoSize?: never;
    fontSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    maxLines?: never;
    onTextLayout?: never;
    }
  | {
    text: string;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    maxLines: number;
    composeTextStyle: ComposeTextStyle;
    autoSize?: never;
    fontSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    minLines?: never;
    onTextLayout?: never;
    }
  | {
    text: string;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize?: number;
    fontStyle: ComposeFontStyleValue | null;
    fontWeight?: ComposeFontWeight | null;
    letterSpacing?: number;
    lineHeight?: number;
    softWrap: boolean;
    autoSize?: never;
    fontFamily?: never;
    textDecoration?: never;
    textAlign?: never;
    overflow?: never;
    maxLines?: never;
    minLines?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: string;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontStyle: ComposeFontStyleValue | null;
    textDecoration: ComposeTextDecorationValue | null;
    autoSize?: never;
    fontSize?: never;
    fontWeight?: never;
    fontFamily?: never;
    letterSpacing?: never;
    textAlign?: never;
    lineHeight?: never;
    overflow?: never;
    softWrap?: never;
    maxLines?: never;
    minLines?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: string;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontStyle: ComposeFontStyleValue | null;
    fontFamily: ComposeFontFamilyValue | null;
    autoSize?: never;
    fontSize?: never;
    fontWeight?: never;
    letterSpacing?: never;
    textDecoration?: never;
    textAlign?: never;
    lineHeight?: never;
    overflow?: never;
    softWrap?: never;
    maxLines?: never;
    minLines?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: string;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize: number;
    letterSpacing?: number;
    textAlign?: ComposeTextAlign | null;
    lineHeight?: number;
    softWrap: boolean;
    maxLines?: number;
    minLines?: number;
    composeTextStyle: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontWeight?: never;
    fontFamily?: never;
    textDecoration?: never;
    overflow?: never;
    onTextLayout?: never;
    }
  | {
    text: string;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize: number;
    textAlign?: ComposeTextAlign | null;
    lineHeight?: number;
    overflow: ComposeTextOverflow;
    softWrap?: boolean;
    maxLines?: number;
    minLines?: number;
    composeTextStyle: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontWeight?: never;
    fontFamily?: never;
    letterSpacing?: never;
    textDecoration?: never;
    onTextLayout?: never;
    }
  | {
    text: string;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize: number;
    letterSpacing: number;
    lineHeight?: number;
    overflow: ComposeTextOverflow;
    softWrap?: boolean;
    maxLines?: number;
    minLines?: number;
    composeTextStyle: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontWeight?: never;
    fontFamily?: never;
    textDecoration?: never;
    textAlign?: never;
    onTextLayout?: never;
    }
  | {
    text: string;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize: number;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    overflow: ComposeTextOverflow;
    softWrap?: boolean;
    maxLines?: number;
    minLines?: number;
    composeTextStyle: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontWeight?: never;
    fontFamily?: never;
    textDecoration?: never;
    lineHeight?: never;
    onTextLayout?: never;
    }
  | {
    text: string;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize: number;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    maxLines?: number;
    minLines?: number;
    composeTextStyle: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontWeight?: never;
    fontFamily?: never;
    textDecoration?: never;
    softWrap?: never;
    onTextLayout?: never;
    }
  | {
    text: string;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize: number;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    minLines?: number;
    composeTextStyle: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontWeight?: never;
    fontFamily?: never;
    textDecoration?: never;
    maxLines?: never;
    onTextLayout?: never;
    }
  | {
    text: string;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize: number;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    maxLines: number;
    composeTextStyle: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontWeight?: never;
    fontFamily?: never;
    textDecoration?: never;
    minLines?: never;
    onTextLayout?: never;
    }
  | {
    text: string;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    textAlign?: ComposeTextAlign | null;
    lineHeight?: number;
    softWrap: boolean;
    maxLines?: number;
    minLines?: number;
    composeTextStyle: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    letterSpacing?: never;
    textDecoration?: never;
    overflow?: never;
    onTextLayout?: never;
    }
  | {
    text: string;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    lineHeight?: number;
    overflow: ComposeTextOverflow;
    softWrap?: boolean;
    maxLines?: number;
    minLines?: number;
    composeTextStyle: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    letterSpacing?: never;
    textDecoration?: never;
    textAlign?: never;
    onTextLayout?: never;
    }
  | {
    text: string;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    textAlign: ComposeTextAlign | null;
    overflow: ComposeTextOverflow;
    softWrap?: boolean;
    maxLines?: number;
    minLines?: number;
    composeTextStyle: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    letterSpacing?: never;
    textDecoration?: never;
    lineHeight?: never;
    onTextLayout?: never;
    }
  | {
    text: string;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    maxLines?: number;
    minLines?: number;
    composeTextStyle: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    letterSpacing?: never;
    textDecoration?: never;
    softWrap?: never;
    onTextLayout?: never;
    }
  | {
    text: string;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    minLines?: number;
    composeTextStyle: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    letterSpacing?: never;
    textDecoration?: never;
    maxLines?: never;
    onTextLayout?: never;
    }
  | {
    text: string;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    maxLines: number;
    composeTextStyle: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    letterSpacing?: never;
    textDecoration?: never;
    minLines?: never;
    onTextLayout?: never;
    }
  | {
    text: string;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    lineHeight?: number;
    softWrap: boolean;
    maxLines?: number;
    minLines?: number;
    composeTextStyle: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    textAlign?: never;
    overflow?: never;
    onTextLayout?: never;
    }
  | {
    text: string;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    overflow: ComposeTextOverflow;
    softWrap?: boolean;
    maxLines?: number;
    minLines?: number;
    composeTextStyle: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    textAlign?: never;
    lineHeight?: never;
    onTextLayout?: never;
    }
  | {
    text: string;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    maxLines?: number;
    minLines?: number;
    composeTextStyle: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    textAlign?: never;
    softWrap?: never;
    onTextLayout?: never;
    }
  | {
    text: string;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    minLines?: number;
    composeTextStyle: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    textAlign?: never;
    maxLines?: never;
    onTextLayout?: never;
    }
  | {
    text: string;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    maxLines: number;
    composeTextStyle: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    textAlign?: never;
    minLines?: never;
    onTextLayout?: never;
    }
  | {
    text: string;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    softWrap: boolean;
    maxLines?: number;
    minLines?: number;
    composeTextStyle: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    lineHeight?: never;
    overflow?: never;
    onTextLayout?: never;
    }
  | {
    text: string;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    overflow: ComposeTextOverflow;
    maxLines?: number;
    minLines?: number;
    composeTextStyle: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    lineHeight?: never;
    softWrap?: never;
    onTextLayout?: never;
    }
  | {
    text: string;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    minLines?: number;
    composeTextStyle: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    lineHeight?: never;
    maxLines?: never;
    onTextLayout?: never;
    }
  | {
    text: string;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    maxLines: number;
    composeTextStyle: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    lineHeight?: never;
    minLines?: never;
    onTextLayout?: never;
    }
  | {
    text: string;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    softWrap: boolean;
    minLines?: number;
    composeTextStyle: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    overflow?: never;
    maxLines?: never;
    onTextLayout?: never;
    }
  | {
    text: string;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    softWrap: boolean;
    maxLines: number;
    composeTextStyle: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    overflow?: never;
    minLines?: never;
    onTextLayout?: never;
    }
  | {
    text: string;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    minLines?: number;
    composeTextStyle: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    softWrap?: never;
    maxLines?: never;
    onTextLayout?: never;
    }
  | {
    text: string;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    maxLines: number;
    composeTextStyle: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    softWrap?: never;
    minLines?: never;
    onTextLayout?: never;
    }
  | {
    text: string;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    composeTextStyle: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    maxLines?: never;
    minLines?: never;
    onTextLayout?: never;
    }
  | {
    text: string;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    autoSize: ComposeTextAutoSizeValue | null;
    fontSize?: number;
    fontWeight?: ComposeFontWeight | null;
    letterSpacing?: number;
    lineHeight?: number;
    softWrap: boolean;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    textAlign?: never;
    overflow?: never;
    maxLines?: never;
    minLines?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: string;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    autoSize: ComposeTextAutoSizeValue | null;
    textDecoration: ComposeTextDecorationValue | null;
    fontSize?: never;
    fontStyle?: never;
    fontWeight?: never;
    fontFamily?: never;
    letterSpacing?: never;
    textAlign?: never;
    lineHeight?: never;
    overflow?: never;
    softWrap?: never;
    maxLines?: never;
    minLines?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: string;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    autoSize: ComposeTextAutoSizeValue | null;
    fontFamily: ComposeFontFamilyValue | null;
    fontSize?: never;
    fontStyle?: never;
    fontWeight?: never;
    letterSpacing?: never;
    textDecoration?: never;
    textAlign?: never;
    lineHeight?: never;
    overflow?: never;
    softWrap?: never;
    maxLines?: never;
    minLines?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: string;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    autoSize: ComposeTextAutoSizeValue | null;
    fontStyle: ComposeFontStyleValue | null;
    fontSize?: never;
    fontWeight?: never;
    fontFamily?: never;
    letterSpacing?: never;
    textDecoration?: never;
    textAlign?: never;
    lineHeight?: never;
    overflow?: never;
    softWrap?: never;
    maxLines?: never;
    minLines?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: ComposeAnnotatedString;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize?: number;
    letterSpacing?: number;
    lineHeight?: number;
    minLines: number;
    composeTextStyle: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontWeight?: never;
    fontFamily?: never;
    textDecoration?: never;
    textAlign?: never;
    overflow?: never;
    softWrap?: never;
    maxLines?: never;
    onTextLayout?: never;
    }
  | {
    text: ComposeAnnotatedString;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize?: number;
    letterSpacing?: number;
    lineHeight?: number;
    maxLines: number;
    composeTextStyle: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontWeight?: never;
    fontFamily?: never;
    textDecoration?: never;
    textAlign?: never;
    overflow?: never;
    softWrap?: never;
    minLines?: never;
    onTextLayout?: never;
    }
  | {
    text: ComposeAnnotatedString;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize?: number;
    letterSpacing?: number;
    lineHeight?: number;
    maxLines: number;
    minLines: number;
    composeTextStyle?: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontWeight?: never;
    fontFamily?: never;
    textDecoration?: never;
    textAlign?: never;
    overflow?: never;
    softWrap?: never;
    onTextLayout?: never;
    }
  | {
    text: ComposeAnnotatedString;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize?: number;
    letterSpacing?: number;
    lineHeight?: number;
    softWrap: boolean;
    composeTextStyle: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontWeight?: never;
    fontFamily?: never;
    textDecoration?: never;
    textAlign?: never;
    overflow?: never;
    maxLines?: never;
    minLines?: never;
    onTextLayout?: never;
    }
  | {
    text: ComposeAnnotatedString;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize?: number;
    fontWeight?: ComposeFontWeight | null;
    letterSpacing?: number;
    lineHeight?: number;
    softWrap: boolean;
    onTextLayout: (value: ComposeTextLayout) => void;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    textAlign?: never;
    overflow?: never;
    maxLines?: never;
    minLines?: never;
    composeTextStyle?: never;
    }
  | {
    text: ComposeAnnotatedString;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize?: number;
    letterSpacing?: number;
    lineHeight?: number;
    softWrap: boolean;
    minLines: number;
    composeTextStyle?: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontWeight?: never;
    fontFamily?: never;
    textDecoration?: never;
    textAlign?: never;
    overflow?: never;
    maxLines?: never;
    onTextLayout?: never;
    }
  | {
    text: ComposeAnnotatedString;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize?: number;
    letterSpacing?: number;
    lineHeight?: number;
    softWrap: boolean;
    maxLines: number;
    minLines?: number;
    composeTextStyle?: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontWeight?: never;
    fontFamily?: never;
    textDecoration?: never;
    textAlign?: never;
    overflow?: never;
    onTextLayout?: never;
    }
  | {
    text: ComposeAnnotatedString;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize?: number;
    letterSpacing?: number;
    lineHeight?: number;
    overflow: ComposeTextOverflow;
    composeTextStyle: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontWeight?: never;
    fontFamily?: never;
    textDecoration?: never;
    textAlign?: never;
    softWrap?: never;
    maxLines?: never;
    minLines?: never;
    onTextLayout?: never;
    }
  | {
    text: ComposeAnnotatedString;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize?: number;
    letterSpacing?: number;
    lineHeight?: number;
    overflow: ComposeTextOverflow;
    minLines: number;
    composeTextStyle?: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontWeight?: never;
    fontFamily?: never;
    textDecoration?: never;
    textAlign?: never;
    softWrap?: never;
    maxLines?: never;
    onTextLayout?: never;
    }
  | {
    text: ComposeAnnotatedString;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize?: number;
    letterSpacing?: number;
    lineHeight?: number;
    overflow: ComposeTextOverflow;
    maxLines: number;
    minLines?: number;
    composeTextStyle?: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontWeight?: never;
    fontFamily?: never;
    textDecoration?: never;
    textAlign?: never;
    softWrap?: never;
    onTextLayout?: never;
    }
  | {
    text: ComposeAnnotatedString;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize?: number;
    letterSpacing?: number;
    lineHeight?: number;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    maxLines?: number;
    minLines?: number;
    composeTextStyle?: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontWeight?: never;
    fontFamily?: never;
    textDecoration?: never;
    textAlign?: never;
    onTextLayout?: never;
    }
  | {
    text: ComposeAnnotatedString;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize?: number;
    letterSpacing?: number;
    textAlign: ComposeTextAlign | null;
    lineHeight?: number;
    minLines: number;
    composeTextStyle?: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontWeight?: never;
    fontFamily?: never;
    textDecoration?: never;
    overflow?: never;
    softWrap?: never;
    maxLines?: never;
    onTextLayout?: never;
    }
  | {
    text: ComposeAnnotatedString;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize?: number;
    letterSpacing?: number;
    textAlign: ComposeTextAlign | null;
    lineHeight?: number;
    maxLines: number;
    minLines?: number;
    composeTextStyle?: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontWeight?: never;
    fontFamily?: never;
    textDecoration?: never;
    overflow?: never;
    softWrap?: never;
    onTextLayout?: never;
    }
  | {
    text: ComposeAnnotatedString;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize?: number;
    letterSpacing?: number;
    textAlign: ComposeTextAlign | null;
    lineHeight?: number;
    softWrap: boolean;
    maxLines?: number;
    minLines?: number;
    composeTextStyle?: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontWeight?: never;
    fontFamily?: never;
    textDecoration?: never;
    overflow?: never;
    onTextLayout?: never;
    }
  | {
    text: ComposeAnnotatedString;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    letterSpacing?: number;
    textAlign: ComposeTextAlign | null;
    lineHeight?: number;
    overflow: ComposeTextOverflow;
    softWrap?: boolean;
    maxLines?: number;
    minLines?: number;
    composeTextStyle?: ComposeTextStyle;
    autoSize?: never;
    fontSize?: never;
    fontStyle?: never;
    fontWeight?: never;
    fontFamily?: never;
    textDecoration?: never;
    onTextLayout?: never;
    }
  | {
    text: ComposeAnnotatedString;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize?: number;
    fontWeight?: ComposeFontWeight | null;
    letterSpacing?: number;
    textDecoration: ComposeTextDecorationValue | null;
    lineHeight?: number;
    softWrap: boolean;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textAlign?: never;
    overflow?: never;
    maxLines?: never;
    minLines?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: ComposeAnnotatedString;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize?: number;
    fontWeight?: ComposeFontWeight | null;
    fontFamily: ComposeFontFamilyValue | null;
    letterSpacing?: number;
    lineHeight?: number;
    softWrap: boolean;
    autoSize?: never;
    fontStyle?: never;
    textDecoration?: never;
    textAlign?: never;
    overflow?: never;
    maxLines?: never;
    minLines?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: ComposeAnnotatedString;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontFamily: ComposeFontFamilyValue | null;
    textDecoration: ComposeTextDecorationValue | null;
    autoSize?: never;
    fontSize?: never;
    fontStyle?: never;
    fontWeight?: never;
    letterSpacing?: never;
    textAlign?: never;
    lineHeight?: never;
    overflow?: never;
    softWrap?: never;
    maxLines?: never;
    minLines?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: ComposeAnnotatedString;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize?: number;
    fontWeight: ComposeFontWeight | null;
    letterSpacing?: number;
    textAlign?: ComposeTextAlign | null;
    lineHeight?: number;
    minLines: number;
    composeTextStyle?: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    overflow?: never;
    softWrap?: never;
    maxLines?: never;
    onTextLayout?: never;
    }
  | {
    text: ComposeAnnotatedString;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize?: number;
    fontWeight: ComposeFontWeight | null;
    letterSpacing?: number;
    textAlign?: ComposeTextAlign | null;
    lineHeight?: number;
    maxLines: number;
    minLines?: number;
    composeTextStyle?: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    overflow?: never;
    softWrap?: never;
    onTextLayout?: never;
    }
  | {
    text: ComposeAnnotatedString;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontWeight: ComposeFontWeight | null;
    letterSpacing?: number;
    textAlign?: ComposeTextAlign | null;
    lineHeight?: number;
    softWrap: boolean;
    maxLines?: number;
    minLines?: number;
    composeTextStyle?: ComposeTextStyle;
    autoSize?: never;
    fontSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    overflow?: never;
    onTextLayout?: never;
    }
  | {
    text: ComposeAnnotatedString;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontWeight: ComposeFontWeight | null;
    textAlign?: ComposeTextAlign | null;
    lineHeight?: number;
    overflow: ComposeTextOverflow;
    softWrap?: boolean;
    maxLines?: number;
    minLines?: number;
    composeTextStyle?: ComposeTextStyle;
    autoSize?: never;
    fontSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    letterSpacing?: never;
    textDecoration?: never;
    onTextLayout?: never;
    }
  | {
    text: ComposeAnnotatedString;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize?: number;
    fontWeight: ComposeFontWeight | null;
    letterSpacing?: number;
    textAlign: ComposeTextAlign | null;
    lineHeight?: number;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    overflow?: never;
    softWrap?: never;
    maxLines?: never;
    minLines?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: ComposeAnnotatedString;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    lineHeight?: number;
    overflow: ComposeTextOverflow;
    softWrap?: boolean;
    maxLines?: number;
    minLines?: number;
    composeTextStyle?: ComposeTextStyle;
    autoSize?: never;
    fontSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    textAlign?: never;
    onTextLayout?: never;
    }
  | {
    text: ComposeAnnotatedString;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    overflow: ComposeTextOverflow;
    softWrap?: boolean;
    maxLines?: number;
    minLines?: number;
    composeTextStyle?: ComposeTextStyle;
    autoSize?: never;
    fontSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    lineHeight?: never;
    onTextLayout?: never;
    }
  | {
    text: ComposeAnnotatedString;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    maxLines?: number;
    minLines?: number;
    composeTextStyle?: ComposeTextStyle;
    autoSize?: never;
    fontSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    softWrap?: never;
    onTextLayout?: never;
    }
  | {
    text: ComposeAnnotatedString;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    minLines?: number;
    composeTextStyle?: ComposeTextStyle;
    autoSize?: never;
    fontSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    maxLines?: never;
    onTextLayout?: never;
    }
  | {
    text: ComposeAnnotatedString;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    maxLines: number;
    composeTextStyle?: ComposeTextStyle;
    autoSize?: never;
    fontSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    minLines?: never;
    onTextLayout?: never;
    }
  | {
    text: ComposeAnnotatedString;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    maxLines: number;
    minLines: number;
    autoSize?: never;
    fontSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: ComposeAnnotatedString;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize?: number;
    fontStyle: ComposeFontStyleValue | null;
    fontWeight?: ComposeFontWeight | null;
    letterSpacing?: number;
    lineHeight?: number;
    softWrap: boolean;
    autoSize?: never;
    fontFamily?: never;
    textDecoration?: never;
    textAlign?: never;
    overflow?: never;
    maxLines?: never;
    minLines?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: ComposeAnnotatedString;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontStyle: ComposeFontStyleValue | null;
    textDecoration: ComposeTextDecorationValue | null;
    autoSize?: never;
    fontSize?: never;
    fontWeight?: never;
    fontFamily?: never;
    letterSpacing?: never;
    textAlign?: never;
    lineHeight?: never;
    overflow?: never;
    softWrap?: never;
    maxLines?: never;
    minLines?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: ComposeAnnotatedString;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontStyle: ComposeFontStyleValue | null;
    fontFamily: ComposeFontFamilyValue | null;
    autoSize?: never;
    fontSize?: never;
    fontWeight?: never;
    letterSpacing?: never;
    textDecoration?: never;
    textAlign?: never;
    lineHeight?: never;
    overflow?: never;
    softWrap?: never;
    maxLines?: never;
    minLines?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: ComposeAnnotatedString;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize: number;
    textAlign: ComposeTextAlign | null;
    lineHeight?: number;
    overflow: ComposeTextOverflow;
    softWrap?: boolean;
    maxLines?: number;
    minLines?: number;
    composeTextStyle?: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontWeight?: never;
    fontFamily?: never;
    letterSpacing?: never;
    textDecoration?: never;
    onTextLayout?: never;
    }
  | {
    text: ComposeAnnotatedString;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize: number;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    overflow: ComposeTextOverflow;
    softWrap?: boolean;
    maxLines?: number;
    minLines?: number;
    composeTextStyle?: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontWeight?: never;
    fontFamily?: never;
    textDecoration?: never;
    lineHeight?: never;
    onTextLayout?: never;
    }
  | {
    text: ComposeAnnotatedString;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize: number;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    maxLines?: number;
    minLines?: number;
    composeTextStyle?: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontWeight?: never;
    fontFamily?: never;
    textDecoration?: never;
    softWrap?: never;
    onTextLayout?: never;
    }
  | {
    text: ComposeAnnotatedString;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize: number;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    minLines?: number;
    composeTextStyle?: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontWeight?: never;
    fontFamily?: never;
    textDecoration?: never;
    maxLines?: never;
    onTextLayout?: never;
    }
  | {
    text: ComposeAnnotatedString;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize: number;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    maxLines: number;
    composeTextStyle?: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontWeight?: never;
    fontFamily?: never;
    textDecoration?: never;
    minLines?: never;
    onTextLayout?: never;
    }
  | {
    text: ComposeAnnotatedString;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize: number;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    maxLines: number;
    minLines: number;
    autoSize?: never;
    fontStyle?: never;
    fontWeight?: never;
    fontFamily?: never;
    textDecoration?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: ComposeAnnotatedString;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    textAlign?: ComposeTextAlign | null;
    lineHeight?: number;
    softWrap: boolean;
    maxLines?: number;
    minLines?: number;
    composeTextStyle?: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    letterSpacing?: never;
    textDecoration?: never;
    overflow?: never;
    onTextLayout?: never;
    }
  | {
    text: ComposeAnnotatedString;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    lineHeight?: number;
    overflow: ComposeTextOverflow;
    softWrap?: boolean;
    maxLines?: number;
    minLines?: number;
    composeTextStyle?: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    letterSpacing?: never;
    textDecoration?: never;
    textAlign?: never;
    onTextLayout?: never;
    }
  | {
    text: ComposeAnnotatedString;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    textAlign: ComposeTextAlign | null;
    overflow: ComposeTextOverflow;
    softWrap?: boolean;
    maxLines?: number;
    minLines?: number;
    composeTextStyle?: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    letterSpacing?: never;
    textDecoration?: never;
    lineHeight?: never;
    onTextLayout?: never;
    }
  | {
    text: ComposeAnnotatedString;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    maxLines?: number;
    minLines?: number;
    composeTextStyle?: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    letterSpacing?: never;
    textDecoration?: never;
    softWrap?: never;
    onTextLayout?: never;
    }
  | {
    text: ComposeAnnotatedString;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    minLines?: number;
    composeTextStyle?: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    letterSpacing?: never;
    textDecoration?: never;
    maxLines?: never;
    onTextLayout?: never;
    }
  | {
    text: ComposeAnnotatedString;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    maxLines: number;
    composeTextStyle?: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    letterSpacing?: never;
    textDecoration?: never;
    minLines?: never;
    onTextLayout?: never;
    }
  | {
    text: ComposeAnnotatedString;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    maxLines: number;
    minLines: number;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    letterSpacing?: never;
    textDecoration?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: ComposeAnnotatedString;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    lineHeight?: number;
    softWrap: boolean;
    maxLines?: number;
    minLines?: number;
    composeTextStyle?: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    textAlign?: never;
    overflow?: never;
    onTextLayout?: never;
    }
  | {
    text: ComposeAnnotatedString;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    overflow: ComposeTextOverflow;
    softWrap?: boolean;
    maxLines?: number;
    minLines?: number;
    composeTextStyle?: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    textAlign?: never;
    lineHeight?: never;
    onTextLayout?: never;
    }
  | {
    text: ComposeAnnotatedString;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    maxLines?: number;
    minLines?: number;
    composeTextStyle?: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    textAlign?: never;
    softWrap?: never;
    onTextLayout?: never;
    }
  | {
    text: ComposeAnnotatedString;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    minLines?: number;
    composeTextStyle?: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    textAlign?: never;
    maxLines?: never;
    onTextLayout?: never;
    }
  | {
    text: ComposeAnnotatedString;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    maxLines: number;
    composeTextStyle?: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    textAlign?: never;
    minLines?: never;
    onTextLayout?: never;
    }
  | {
    text: ComposeAnnotatedString;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    maxLines: number;
    minLines: number;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    textAlign?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: ComposeAnnotatedString;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    softWrap: boolean;
    maxLines?: number;
    minLines?: number;
    composeTextStyle?: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    lineHeight?: never;
    overflow?: never;
    onTextLayout?: never;
    }
  | {
    text: ComposeAnnotatedString;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    overflow: ComposeTextOverflow;
    maxLines?: number;
    minLines?: number;
    composeTextStyle?: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    lineHeight?: never;
    softWrap?: never;
    onTextLayout?: never;
    }
  | {
    text: ComposeAnnotatedString;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    minLines?: number;
    composeTextStyle?: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    lineHeight?: never;
    maxLines?: never;
    onTextLayout?: never;
    }
  | {
    text: ComposeAnnotatedString;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    maxLines: number;
    composeTextStyle?: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    lineHeight?: never;
    minLines?: never;
    onTextLayout?: never;
    }
  | {
    text: ComposeAnnotatedString;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    maxLines: number;
    minLines: number;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    lineHeight?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: ComposeAnnotatedString;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    softWrap: boolean;
    minLines?: number;
    composeTextStyle?: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    overflow?: never;
    maxLines?: never;
    onTextLayout?: never;
    }
  | {
    text: ComposeAnnotatedString;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    softWrap: boolean;
    maxLines: number;
    composeTextStyle?: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    overflow?: never;
    minLines?: never;
    onTextLayout?: never;
    }
  | {
    text: ComposeAnnotatedString;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    softWrap: boolean;
    maxLines: number;
    minLines: number;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    overflow?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: ComposeAnnotatedString;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    minLines?: number;
    composeTextStyle?: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    softWrap?: never;
    maxLines?: never;
    onTextLayout?: never;
    }
  | {
    text: ComposeAnnotatedString;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    maxLines: number;
    composeTextStyle?: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    softWrap?: never;
    minLines?: never;
    onTextLayout?: never;
    }
  | {
    text: ComposeAnnotatedString;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    maxLines: number;
    minLines: number;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    softWrap?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: ComposeAnnotatedString;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    composeTextStyle?: ComposeTextStyle;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    maxLines?: never;
    minLines?: never;
    onTextLayout?: never;
    }
  | {
    text: ComposeAnnotatedString;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    minLines: number;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    maxLines?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: ComposeAnnotatedString;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    fontSize: number;
    fontWeight: ComposeFontWeight | null;
    letterSpacing: number;
    textAlign: ComposeTextAlign | null;
    lineHeight: number;
    overflow: ComposeTextOverflow;
    softWrap: boolean;
    maxLines: number;
    autoSize?: never;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    minLines?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: ComposeAnnotatedString;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    autoSize: ComposeTextAutoSizeValue | null;
    fontSize?: number;
    fontWeight?: ComposeFontWeight | null;
    letterSpacing?: number;
    lineHeight?: number;
    softWrap: boolean;
    fontStyle?: never;
    fontFamily?: never;
    textDecoration?: never;
    textAlign?: never;
    overflow?: never;
    maxLines?: never;
    minLines?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: ComposeAnnotatedString;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    autoSize: ComposeTextAutoSizeValue | null;
    textDecoration: ComposeTextDecorationValue | null;
    fontSize?: never;
    fontStyle?: never;
    fontWeight?: never;
    fontFamily?: never;
    letterSpacing?: never;
    textAlign?: never;
    lineHeight?: never;
    overflow?: never;
    softWrap?: never;
    maxLines?: never;
    minLines?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: ComposeAnnotatedString;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    autoSize: ComposeTextAutoSizeValue | null;
    fontFamily: ComposeFontFamilyValue | null;
    fontSize?: never;
    fontStyle?: never;
    fontWeight?: never;
    letterSpacing?: never;
    textDecoration?: never;
    textAlign?: never;
    lineHeight?: never;
    overflow?: never;
    softWrap?: never;
    maxLines?: never;
    minLines?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
  | {
    text: ComposeAnnotatedString;
    color: string;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    autoSize: ComposeTextAutoSizeValue | null;
    fontStyle: ComposeFontStyleValue | null;
    fontSize?: never;
    fontWeight?: never;
    fontFamily?: never;
    letterSpacing?: never;
    textDecoration?: never;
    textAlign?: never;
    lineHeight?: never;
    overflow?: never;
    softWrap?: never;
    maxLines?: never;
    minLines?: never;
    onTextLayout?: never;
    composeTextStyle?: never;
    }
;
export const Text = createComposableComponent<TextProps>({
  name: "Text",
  props: ["text","modifier","color","autoSize","fontSize","fontStyle","fontWeight","fontFamily","letterSpacing","textDecoration","textAlign","lineHeight","overflow","softWrap","maxLines","minLines","composeTextStyle"],
  objectProps: ["autoSize","fontFamily","composeTextStyle","text"],
  events: ["onTextLayout"],
  children: false,
  overloads: [
    { id: "Text", children: false, parameters: [["text","string",false,false],["modifier","ComposeModifier",true,false],["color","string",true,false],["autoSize","object",true,true],["fontSize","number",true,false],["fontStyle","string",true,true],["fontWeight","string",true,true],["fontFamily","object",true,true],["letterSpacing","number",true,false],["textDecoration","string",true,true],["textAlign","string",true,true],["lineHeight","number",true,false],["overflow","string",true,false],["softWrap","boolean",true,false],["maxLines","number",true,false],["minLines","number",true,false],["onTextLayout","function",true,true],["composeTextStyle","object",true,false]], masks: [0,1,2,3,4,5,6,7,8,9,10,12,13,16,17,18,19,20,21,22,23,24,25,28,29,32,33,34,36,37,40,48,49,52,53,64,65,66,67,68,69,70,71,72,73,76,77,80,81,82,83,84,85,86,87,88,89,92,93,96,97,100,101,112,113,116,117,128,129,130,132,133,136,144,145,148,149,160,192,193,196,197,208,209,212,213,256,257,260,261,272,273,276,277,320,321,324,325,336,337,340,341,512,513,514,515,516,517,518,519,520,521,524,525,528,529,530,531,532,533,534,535,536,537,540,541,544,545,548,549,560,561,564,565,576,577,578,579,580,581,582,583,584,585,588,589,592,593,594,595,596,597,598,599,600,601,604,605,608,609,612,613,624,625,628,629,640,641,644,645,656,657,660,661,704,705,708,709,720,721,724,725,768,769,772,773,784,785,788,789,832,833,836,837,848,849,852,853,1024,1025,1028,1029,1040,1041,1044,1045,1088,1089,1092,1093,1104,1105,1108,1109,1280,1281,1284,1285,1296,1297,1300,1301,1344,1345,1348,1349,1360,1361,1364,1365,1536,1537,1540,1541,1552,1553,1556,1557,1600,1601,1604,1605,1616,1617,1620,1621,1792,1793,1796,1797,1808,1809,1812,1813,1856,1857,1860,1861,1872,1873,1876,1877,2048,2049,2052,2053,2064,2065,2068,2069,2112,2113,2116,2117,2128,2129,2132,2133,2304,2305,2308,2309,2320,2321,2324,2325,2368,2369,2372,2373,2384,2385,2388,2389,2560,2561,2564,2565,2576,2577,2580,2581,2624,2625,2628,2629,2640,2641,2644,2645,2816,2817,2820,2821,2832,2833,2836,2837,2880,2881,2884,2885,2896,2897,2900,2901,3072,3073,3076,3077,3088,3089,3092,3093,3136,3137,3140,3141,3152,3153,3156,3157,3328,3329,3332,3333,3344,3345,3348,3349,3392,3393,3396,3397,3408,3409,3412,3413,3584,3585,3588,3589,3600,3601,3604,3605,3648,3649,3652,3653,3664,3665,3668,3669,3840,3841,3844,3845,3856,3857,3860,3861,3904,3905,3908,3909,3920,3921,3924,3925,4096,4097,4100,4101,4112,4113,4116,4117,4160,4161,4164,4165,4176,4177,4180,4181,4352,4353,4356,4357,4368,4369,4372,4373,4416,4417,4420,4421,4432,4433,4436,4437,4608,4609,4612,4613,4624,4625,4628,4629,4672,4673,4676,4677,4688,4689,4692,4693,4864,4865,4868,4869,4880,4881,4884,4885,4928,4929,4932,4933,4944,4945,4948,4949,5120,5121,5124,5125,5136,5137,5140,5141,5184,5185,5188,5189,5200,5201,5204,5205,5376,5377,5380,5381,5392,5393,5396,5397,5440,5441,5444,5445,5456,5457,5460,5461,5632,5633,5636,5637,5648,5649,5652,5653,5696,5697,5700,5701,5712,5713,5716,5717,5888,5889,5892,5893,5904,5905,5908,5909,5952,5953,5956,5957,5968,5969,5972,5973,6144,6145,6148,6149,6160,6161,6164,6165,6208,6209,6212,6213,6224,6225,6228,6229,6400,6401,6404,6405,6416,6417,6420,6421,6464,6465,6468,6469,6480,6481,6484,6485,6656,6657,6660,6661,6672,6673,6676,6677,6720,6721,6724,6725,6736,6737,6740,6741,6912,6913,6916,6917,6928,6929,6932,6933,6976,6977,6980,6981,6992,6993,6996,6997,7168,7169,7172,7173,7184,7185,7188,7189,7232,7233,7236,7237,7248,7249,7252,7253,7424,7425,7428,7429,7440,7441,7444,7445,7488,7489,7492,7493,7504,7505,7508,7509,7680,7681,7684,7685,7696,7697,7700,7701,7744,7745,7748,7749,7760,7761,7764,7765,7936,7937,7940,7941,7952,7953,7956,7957,8000,8001,8004,8005,8016,8017,8020,8021,8192,8193,8196,8197,8208,8209,8212,8213,8256,8257,8260,8261,8272,8273,8276,8277,8448,8449,8452,8453,8464,8465,8468,8469,8512,8513,8516,8517,8528,8529,8532,8533,8704,8705,8708,8709,8720,8721,8724,8725,8768,8769,8772,8773,8784,8785,8788,8789,8960,8961,8964,8965,8976,8977,8980,8981,9024,9025,9028,9029,9040,9041,9044,9045,9216,9217,9220,9221,9232,9233,9236,9237,9280,9281,9284,9285,9296,9297,9300,9301,9472,9473,9476,9477,9488,9489,9492,9493,9536,9537,9540,9541,9552,9553,9556,9557,9728,9729,9732,9733,9744,9745,9748,9749,9792,9793,9796,9797,9808,9809,9812,9813,9984,9985,9988,9989,10000,10001,10004,10005,10048,10049,10052,10053,10064,10065,10068,10069,10240,10241,10244,10245,10256,10257,10260,10261,10304,10305,10308,10309,10320,10321,10324,10325,10496,10497,10500,10501,10512,10513,10516,10517,10560,10561,10564,10565,10576,10577,10580,10581,10752,10753,10756,10757,10768,10769,10772,10773,10816,10817,10820,10821,10832,10833,10836,10837,11008,11009,11012,11013,11024,11025,11028,11029,11072,11073,11076,11077,11088,11089,11092,11093,11264,11265,11268,11269,11280,11281,11284,11285,11328,11329,11332,11333,11344,11345,11348,11349,11520,11521,11524,11525,11536,11537,11540,11541,11584,11585,11588,11589,11600,11601,11604,11605,11776,11777,11780,11781,11792,11793,11796,11797,11840,11841,11844,11845,11856,11857,11860,11861,12032,12033,12036,12037,12048,12049,12052,12053,12096,12097,12100,12101,12112,12113,12116,12117,12288,12289,12292,12293,12304,12305,12308,12309,12352,12353,12356,12357,12368,12369,12372,12373,12544,12545,12548,12549,12560,12561,12564,12565,12608,12609,12612,12613,12624,12625,12628,12629,12800,12801,12804,12805,12816,12817,12820,12821,12864,12865,12868,12869,12880,12881,12884,12885,13056,13057,13060,13061,13072,13073,13076,13077,13120,13121,13124,13125,13136,13137,13140,13141,13312,13313,13316,13317,13328,13329,13332,13333,13376,13377,13380,13381,13392,13393,13396,13397,13568,13569,13572,13573,13584,13585,13588,13589,13632,13633,13636,13637,13648,13649,13652,13653,13824,13825,13828,13829,13840,13841,13844,13845,13888,13889,13892,13893,13904,13905,13908,13909,14080,14081,14084,14085,14096,14097,14100,14101,14144,14145,14148,14149,14160,14161,14164,14165,14336,14337,14340,14341,14352,14353,14356,14357,14400,14401,14404,14405,14416,14417,14420,14421,14592,14593,14596,14597,14608,14609,14612,14613,14656,14657,14660,14661,14672,14673,14676,14677,14848,14849,14852,14853,14864,14865,14868,14869,14912,14913,14916,14917,14928,14929,14932,14933,15104,15105,15108,15109,15120,15121,15124,15125,15168,15169,15172,15173,15184,15185,15188,15189,15360,15361,15364,15365,15376,15377,15380,15381,15424,15425,15428,15429,15440,15441,15444,15445,15616,15617,15620,15621,15632,15633,15636,15637,15680,15681,15684,15685,15696,15697,15700,15701,15872,15873,15876,15877,15888,15889,15892,15893,15936,15937,15940,15941,15952,15953,15956,15957,16128,16129,16132,16133,16144,16145,16148,16149,16192,16193,16196,16197,16208,16209,16212,16213,16351,16383,16384,16385,16388,16389,16400,16401,16404,16405,16448,16449,16452,16453,16464,16465,16468,16469,16896,16897,16900,16901,16912,16913,16916,16917,16960,16961,16964,16965,16976,16977,16980,16981,32735,32767,32768,32769,32772,32773,32784,32785,32788,32789,32832,32833,32836,32837,32848,32849,32852,32853,33024,33025,33028,33029,33040,33041,33044,33045,33088,33089,33092,33093,33104,33105,33108,33109,33280,33281,33284,33285,33296,33297,33300,33301,33344,33345,33348,33349,33360,33361,33364,33365,33536,33537,33540,33541,33552,33553,33556,33557,33600,33601,33604,33605,33616,33617,33620,33621,40789,40927,40959,44885,45023,45055,46933,47071,47103,47957,48095,48127,48469,48607,48639,48725,48863,48895,48917,48965,48977,48980,48981,48983,48989,48991,49013,49015,49021,49023,49055,49087,49103,49109,49111,49115,49117,49118,49119,49135,49141,49143,49147,49149,49150,49151,57311,57343,61407,61439,63455,63487,64479,64511,64991,65023,65247,65279,65365,65367,65373,65375,65397,65399,65405,65407,65439,65471,65487,65493,65495,65499,65501,65502,65503,65519,65525,65527,65531,65533,65534,65535] },
    { id: "Text#1", children: false, parameters: [["text","object",false,false],["modifier","ComposeModifier",true,false],["color","string",true,false],["autoSize","object",true,true],["fontSize","number",true,false],["fontStyle","string",true,true],["fontWeight","string",true,true],["fontFamily","object",true,true],["letterSpacing","number",true,false],["textDecoration","string",true,true],["textAlign","string",true,true],["lineHeight","number",true,false],["overflow","string",true,false],["softWrap","boolean",true,false],["maxLines","number",true,false],["minLines","number",true,false],["onTextLayout","function",true,false],["composeTextStyle","object",true,false]], masks: [0,1,2,3,4,5,6,7,8,9,10,12,13,16,17,18,19,20,21,22,23,24,25,28,29,32,33,34,36,37,40,48,49,52,53,64,65,66,67,68,69,70,71,72,73,76,77,80,81,82,83,84,85,86,87,88,89,92,93,96,97,100,101,112,113,116,117,128,129,130,132,133,136,144,145,148,149,160,192,193,196,197,208,209,212,213,256,257,260,261,320,321,324,325,512,513,514,515,516,517,518,519,520,521,524,525,528,529,530,531,532,533,534,535,536,537,540,541,544,545,548,549,560,561,564,565,576,577,578,579,580,581,582,583,584,585,588,589,592,593,594,595,596,597,598,599,600,601,604,605,608,609,612,613,624,625,628,629,640,641,644,645,656,657,660,661,704,705,708,709,720,721,724,725,768,769,772,773,832,833,836,837,1024,1025,1028,1029,1088,1089,1092,1093,1536,1537,1540,1541,1600,1601,1604,1605,2048,2049,2052,2053,2112,2113,2116,2117,2560,2561,2564,2565,2624,2625,2628,2629,4096,4097,4100,4101,4160,4161,4164,4165,4608,4609,4612,4613,4672,4673,4676,4677,8192,8193,8196,8197,8256,8257,8260,8261,8704,8705,8708,8709,8768,8769,8772,8773,16213,16351,16383,16384,16385,16388,16389,16400,16401,16404,16405,16448,16449,16452,16453,16464,16465,16468,16469,16896,16897,16900,16901,16912,16913,16916,16917,16960,16961,16964,16965,16976,16977,16980,16981,32735,32767,32768,32769,32772,32773,32784,32785,32788,32789,32832,32833,32836,32837,32848,32849,32852,32853,33024,33025,33028,33029,33040,33041,33044,33045,33088,33089,33092,33093,33104,33105,33108,33109,33280,33281,33284,33285,33296,33297,33300,33301,33344,33345,33348,33349,33360,33361,33364,33365,33536,33537,33540,33541,33552,33553,33556,33557,33600,33601,33604,33605,33616,33617,33620,33621,40789,40927,40959,44885,45023,45055,46933,47071,47103,47957,48095,48127,48469,48607,48639,48725,48863,48895,48917,48965,48977,48980,48981,48983,48989,48991,49013,49015,49021,49023,49055,49087,49103,49109,49111,49115,49117,49118,49119,49135,49141,49143,49147,49149,49150,49151,57311,57343,61407,61439,63455,63487,64479,64511,64991,65023,65247,65279,65365,65367,65373,65375,65397,65399,65405,65407,65439,65471,65487,65493,65495,65499,65501,65502,65503,65519,65525,65527,65531,65533,65534,65535] },
    { id: "Text#2", children: false, parameters: [["text","string",false,false],["color","string",false,false],["modifier","ComposeModifier",true,false],["autoSize","object",true,true],["fontSize","number",true,false],["fontStyle","string",true,true],["fontWeight","string",true,true],["fontFamily","object",true,true],["letterSpacing","number",true,false],["textDecoration","string",true,true],["textAlign","string",true,true],["lineHeight","number",true,false],["overflow","string",true,false],["softWrap","boolean",true,false],["maxLines","number",true,false],["minLines","number",true,false],["onTextLayout","function",true,true],["composeTextStyle","object",true,false]], masks: [5,17,20,65,68,80,1025,1027,1028,1030,1033,1035,1036,1038,1040,1042,1048,1050,1057,1059,1060,1062,1065,1067,1068,1070,1072,1074,1080,1082,1088,1090,1096,1098,1120,1122,1128,1130,1281,1283,1284,1286,1289,1291,1292,1294,1296,1298,1304,1306,1313,1315,1316,1318,1321,1323,1324,1326,1328,1330,1336,1338,1344,1346,1352,1354,1376,1378,1384,1386,9216,9218,9224,9226,9248,9250,9256,9258,9472,9474,9480,9482,9504,9506,9512,9514,16896,16898,16904,16906,16928,16930,16936,16938,17024,17026,17032,17034,17056,17058,17064,17066,17152,17154,17160,17162,17184,17186,17192,17194,17280,17282,17288,17290,17312,17314,17320,17322,17408,17410,17416,17418,17440,17442,17448,17450,17536,17538,17544,17546,17568,17570,17576,17578,17664,17666,17672,17674,17696,17698,17704,17706,17792,17794,17800,17802,17824,17826,17832,17834,17920,17922,17928,17930,17952,17954,17960,17962,18048,18050,18056,18058,18080,18082,18088,18090,18176,18178,18184,18186,18208,18210,18216,18218,18304,18306,18312,18314,18336,18338,18344,18346,18432,18434,18440,18442,18464,18466,18472,18474,18560,18562,18568,18570,18592,18594,18600,18602,18688,18690,18696,18698,18720,18722,18728,18730,18816,18818,18824,18826,18848,18850,18856,18858,18944,18946,18952,18954,18976,18978,18984,18986,19072,19074,19080,19082,19104,19106,19112,19114,19200,19202,19208,19210,19232,19234,19240,19242,19328,19330,19336,19338,19360,19362,19368,19370,19456,19458,19464,19466,19488,19490,19496,19498,19584,19586,19592,19594,19616,19618,19624,19626,19712,19714,19720,19722,19744,19746,19752,19754,19840,19842,19848,19850,19872,19874,19880,19882,19968,19970,19976,19978,20000,20002,20008,20010,20096,20098,20104,20106,20128,20130,20136,20138,20224,20226,20232,20234,20256,20258,20264,20266,20352,20354,20360,20362,20384,20386,20392,20480,20482,20488,20490,20512,20514,20520,20522,20608,20610,20616,20618,20640,20642,20648,20650,20736,20738,20744,20746,20768,20770,20776,20778,20864,20866,20872,20874,20896,20898,20904,20906,20992,20994,21000,21002,21024,21026,21032,21034,21120,21122,21128,21130,21152,21154,21160,21162,21248,21250,21256,21258,21280,21282,21288,21290,21376,21378,21384,21386,21408,21410,21416,21418,21504,21506,21512,21514,21536,21538,21544,21546,21632,21634,21640,21642,21664,21666,21672,21674,21760,21762,21768,21770,21792,21794,21800,21802,21888,21890,21896,21898,21920,21922,21928,21930,22016,22018,22024,22026,22048,22050,22056,22058,22144,22146,22152,22154,22176,22178,22184,22186,22272,22274,22280,22282,22304,22306,22312,22314,22400,22402,22408,22410,22432,22434,22440,22528,22530,22536,22538,22560,22562,22568,22570,22656,22658,22664,22666,22688,22690,22696,22698,22784,22786,22792,22794,22816,22818,22824,22826,22912,22914,22920,22922,22944,22946,22952,22954,23040,23042,23048,23050,23072,23074,23080,23082,23168,23170,23176,23178,23200,23202,23208,23210,23296,23298,23304,23306,23328,23330,23336,23338,23424,23426,23432,23434,23456,23458,23464,23552,23554,23560,23562,23584,23586,23592,23594,23680,23682,23688,23690,23712,23714,23720,23722,23808,23810,23816,23818,23840,23842,23848,23850,23936,23938,23944,23946,23968,23970,23976,24064,24066,24072,24074,24096,24098,24104,24106,24192,24194,24200,24202,24224,24226,24232,24320,24322,24328,24330,24352,24354,24360,24448,24450,24456,24480] },
    { id: "Text#3", children: false, parameters: [["text","object",false,false],["color","string",false,false],["modifier","ComposeModifier",true,false],["autoSize","object",true,true],["fontSize","number",true,false],["fontStyle","string",true,true],["fontWeight","string",true,true],["fontFamily","object",true,true],["letterSpacing","number",true,false],["textDecoration","string",true,true],["textAlign","string",true,true],["lineHeight","number",true,false],["overflow","string",true,false],["softWrap","boolean",true,false],["maxLines","number",true,false],["minLines","number",true,false],["onTextLayout","function",true,false],["composeTextStyle","object",true,false]], masks: [5,17,20,65,68,80,136,138,168,170,392,394,424,426,520,522,552,554,640,642,648,650,672,674,680,682,776,778,808,810,896,898,904,906,928,930,936,938,1025,1027,1028,1030,1032,1033,1034,1035,1036,1038,1040,1042,1048,1050,1057,1059,1060,1062,1064,1065,1066,1067,1068,1070,1072,1074,1080,1082,1088,1090,1096,1098,1120,1122,1128,1130,1152,1154,1160,1162,1184,1186,1192,1194,1281,1283,1284,1286,1288,1289,1290,1291,1292,1294,1296,1298,1304,1306,1313,1315,1316,1318,1320,1321,1322,1323,1324,1326,1328,1330,1336,1338,1344,1346,1352,1354,1376,1378,1384,1386,1408,1410,1416,1418,1440,1442,1448,1450,1536,1538,1544,1546,1568,1570,1576,1578,1664,1666,1672,1674,1696,1698,1704,1706,1792,1794,1800,1802,1824,1826,1832,1834,1920,1922,1928,1930,1952,1954,1960,1962,2056,2058,2088,2090,2176,2178,2184,2186,2208,2210,2216,2218,2312,2314,2344,2346,2432,2434,2440,2442,2464,2466,2472,2474,2560,2562,2568,2570,2592,2594,2600,2602,2688,2690,2696,2698,2720,2722,2728,2730,2816,2818,2824,2826,2848,2850,2856,2858,2944,2946,2952,2954,2976,2978,2984,2986,3072,3074,3080,3082,3104,3106,3112,3114,3200,3202,3208,3210,3232,3234,3240,3242,3328,3330,3336,3338,3360,3362,3368,3370,3456,3458,3464,3466,3488,3490,3496,3498,3584,3586,3592,3594,3616,3618,3624,3626,3712,3714,3720,3722,3744,3746,3752,3754,3840,3842,3848,3850,3872,3874,3880,3882,3968,3970,3976,3978,4000,4002,4008,4010,4104,4106,4136,4138,4224,4226,4232,4234,4256,4258,4264,4266,4360,4362,4392,4394,4480,4482,4488,4490,4512,4514,4520,4522,4608,4610,4616,4618,4640,4642,4648,4650,4736,4738,4744,4746,4768,4770,4776,4778,4864,4866,4872,4874,4896,4898,4904,4906,4992,4994,5000,5002,5024,5026,5032,5034,5120,5122,5128,5130,5152,5154,5160,5162,5248,5250,5256,5258,5280,5282,5288,5290,5376,5378,5384,5386,5408,5410,5416,5418,5504,5506,5512,5514,5536,5538,5544,5546,5632,5634,5640,5642,5664,5666,5672,5674,5760,5762,5768,5770,5792,5794,5800,5802,5888,5890,5896,5898,5920,5922,5928,5930,6016,6018,6024,6026,6048,6050,6056,6058,6144,6146,6152,6154,6176,6178,6184,6186,6272,6274,6280,6282,6304,6306,6312,6314,6400,6402,6408,6410,6432,6434,6440,6442,6528,6530,6536,6538,6560,6562,6568,6570,6656,6658,6664,6666,6688,6690,6696,6698,6784,6786,6792,6794,6816,6818,6824,6826,6912,6914,6920,6922,6944,6946,6952,6954,7040,7042,7048,7050,7072,7074,7080,7082,7168,7170,7176,7178,7200,7202,7208,7210,7296,7298,7304,7306,7328,7330,7336,7338,7424,7426,7432,7434,7456,7458,7464,7466,7552,7554,7560,7562,7584,7586,7592,7594,7680,7682,7688,7690,7712,7714,7720,7722,7808,7810,7816,7818,7840,7842,7848,7850,7936,7938,7944,7946,7968,7970,7976,7978,8064,8066,8072,8074,8096,8098,8104,9216,9218,9224,9226,9248,9250,9256,9258,9472,9474,9480,9482,9504,9506,9512,9514,16896,16898,16904,16906,16928,16930,16936,16938,17024,17026,17032,17034,17056,17058,17064,17066,17152,17154,17160,17162,17184,17186,17192,17194,17280,17282,17288,17290,17312,17314,17320,17322,17408,17410,17416,17418,17440,17442,17448,17450,17536,17538,17544,17546,17568,17570,17576,17578,17664,17666,17672,17674,17696,17698,17704,17706,17792,17794,17800,17802,17824,17826,17832,17834,17920,17922,17928,17930,17952,17954,17960,17962,18048,18050,18056,18058,18080,18082,18088,18090,18176,18178,18184,18186,18208,18210,18216,18218,18304,18306,18312,18314,18336,18338,18344,18346,18432,18434,18440,18442,18464,18466,18472,18474,18560,18562,18568,18570,18592,18594,18600,18602,18688,18690,18696,18698,18720,18722,18728,18730,18816,18818,18824,18826,18848,18850,18856,18858,18944,18946,18952,18954,18976,18978,18984,18986,19072,19074,19080,19082,19104,19106,19112,19114,19200,19202,19208,19210,19232,19234,19240,19242,19328,19330,19336,19338,19360,19362,19368,19370,19456,19458,19464,19466,19488,19490,19496,19498,19584,19586,19592,19594,19616,19618,19624,19626,19712,19714,19720,19722,19744,19746,19752,19754,19840,19842,19848,19850,19872,19874,19880,19882,19968,19970,19976,19978,20000,20002,20008,20010,20096,20098,20104,20106,20128,20130,20136,20138,20224,20226,20232,20234,20256,20258,20264,20266,20352,20354,20360,20362,20384,20386,20392,20480,20482,20488,20490,20512,20514,20520,20522,20608,20610,20616,20618,20640,20642,20648,20650,20736,20738,20744,20746,20768,20770,20776,20778,20864,20866,20872,20874,20896,20898,20904,20906,20992,20994,21000,21002,21024,21026,21032,21034,21120,21122,21128,21130,21152,21154,21160,21162,21248,21250,21256,21258,21280,21282,21288,21290,21376,21378,21384,21386,21408,21410,21416,21418,21504,21506,21512,21514,21536,21538,21544,21546,21632,21634,21640,21642,21664,21666,21672,21674,21760,21762,21768,21770,21792,21794,21800,21802,21888,21890,21896,21898,21920,21922,21928,21930,22016,22018,22024,22026,22048,22050,22056,22058,22144,22146,22152,22154,22176,22178,22184,22186,22272,22274,22280,22282,22304,22306,22312,22314,22400,22402,22408,22410,22432,22434,22440,22528,22530,22536,22538,22560,22562,22568,22570,22656,22658,22664,22666,22688,22690,22696,22698,22784,22786,22792,22794,22816,22818,22824,22826,22912,22914,22920,22922,22944,22946,22952,22954,23040,23042,23048,23050,23072,23074,23080,23082,23168,23170,23176,23178,23200,23202,23208,23210,23296,23298,23304,23306,23328,23330,23336,23338,23424,23426,23432,23434,23456,23458,23464,23552,23554,23560,23562,23584,23586,23592,23594,23680,23682,23688,23690,23712,23714,23720,23722,23808,23810,23816,23818,23840,23842,23848,23850,23936,23938,23944,23946,23968,23970,23976,24064,24066,24072,24074,24096,24098,24104,24106,24192,24194,24200,24202,24224,24226,24232,24320,24322,24328,24330,24352,24354,24360,24448,24450,24456,24480] },
  ],
});
