// Generated from Compose Foundation StyleScope by generate.mjs.
import type { ComposeAnimationSpec, ComposeTextStyle } from "../utils/composeValues";
import type { ComposeOffset, ComposeTransformOrigin } from "./records";
import type { ComposeInteractionSource } from '../utils/nativeHandles';
import type { ComposeFontWeight, ComposeTextAlign } from './values';
import type { ComposeShape, ComposeBrush } from '../utils/modifier';

export interface ComposeFoundationStyle {
  alpha?: number;
  background?: string;
  borderBrush?: ComposeBrush;
  borderColor?: string;
  borderWidth?: number;
  bottom?: number;
  clip?: boolean;
  contentBrush?: ComposeBrush;
  contentColor?: string;
  contentPadding?: number;
  contentPaddingBottom?: number;
  contentPaddingEnd?: number;
  contentPaddingHorizontal?: number;
  contentPaddingStart?: number;
  contentPaddingTop?: number;
  contentPaddingVertical?: number;
  externalPadding?: number;
  externalPaddingBottom?: number;
  externalPaddingEnd?: number;
  externalPaddingHorizontal?: number;
  externalPaddingStart?: number;
  externalPaddingTop?: number;
  externalPaddingVertical?: number;
  fontSize?: number;
  fontWeight?: ComposeFontWeight;
  foreground?: string;
  height?: number;
  left?: number;
  letterSpacing?: number;
  lineHeight?: number;
  maxHeight?: number;
  maxWidth?: number;
  minHeight?: number;
  minWidth?: number;
  right?: number;
  rotationX?: number;
  rotationY?: number;
  rotationZ?: number;
  scale?: number;
  scaleX?: number;
  scaleY?: number;
  shape?: ComposeShape;
  size?: number;
  textAlign?: ComposeTextAlign;
  textStyle?: ComposeTextStyle;
  top?: number;
  transformOrigin?: ComposeTransformOrigin;
  translation?: ComposeOffset;
  translationX?: number;
  translationY?: number;
  width?: number;
  zIndex?: number;
  whenDisabled?: ComposeFoundationStyle;
  whenChecked?: ComposeFoundationStyle;
  whenSelected?: ComposeFoundationStyle;
  whenFocused?: ComposeFoundationStyle;
  whenHovered?: ComposeFoundationStyle;
  whenPressed?: ComposeFoundationStyle;
  animationSpec?: ComposeAnimationSpec;
}

export interface ComposeFoundationStyleState {
  interactionSource?: ComposeInteractionSource;
  enabled?: boolean;
  selected?: boolean;
  checked?: boolean;
}
