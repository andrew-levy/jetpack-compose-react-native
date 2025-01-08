import { requireNativeViewManager } from "expo-modules-core";
import * as React from "react";
import { ViewStyle } from "react-native";
import { Modifier } from "../../utils/modifier";

export type BoxProps = {
  style?: ViewStyle;
  modifier?: typeof Modifier;
  contentAlignment?: ContentAlignment;
  children?: React.ReactNode;
};

type ContentAlignment =
  | "topStart"
  | "topCenter"
  | "topEnd"
  | "centerStart"
  | "center"
  | "centerEnd"
  | "bottomStart"
  | "bottomCenter"
  | "bottomEnd";

const NativeView: React.ComponentType<BoxProps> =
  requireNativeViewManager("BoxView");

export function Box({ style, contentAlignment, ...rest }: BoxProps) {
  return (
    <NativeView
      {...rest}
      contentAlignment={contentAlignment}
      style={{ height: "auto", width: "100%", ...(style as any) }}
      modifier={(rest.modifier as any)?.build()}
    />
  );
}
