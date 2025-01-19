import { requireNativeViewManager } from "expo-modules-core";
import * as React from "react";
import { ViewStyle } from "react-native";
import { Modifier } from "../../utils/modifier";

type TextAlign = "left" | "center" | "right" | "justify";
type TextOverflow = "ellipsis" | "clip";
type TextDecoration = "underline" | "lineThrough" | "none";
type FontStyle = "normal" | "italic";
type FontWeight = "normal" | "bold" | number;

type BaseTextProps = {
  style?: ViewStyle;
  modifier?: typeof Modifier;
  color?: string;
  fontSize?: number;
  fontStyle?: FontStyle;
  fontWeight?: FontWeight;
  fontFamily?: string;
  letterSpacing?: number;
  textDecoration?: TextDecoration;
  textAlign?: TextAlign;
  lineHeight?: number;
  overflow?: TextOverflow;
  softWrap?: boolean;
  maxLines?: number;
  minLines?: number;
};

export type TextProps = BaseTextProps & {
  children?: string;
};

type NativeTextProps = BaseTextProps & {
  text?: string;
};

const NativeView: React.ComponentType<NativeTextProps> =
  requireNativeViewManager("TextView");

export function Text({ style, modifier, children, ...props }: TextProps) {
  return (
    <NativeView
      style={{
        height: 20,
        width: "100%",
        ...(style as any),
      }}
      modifier={(modifier as any)?.build()}
      text={children}
      {...props}
    />
  );
}
