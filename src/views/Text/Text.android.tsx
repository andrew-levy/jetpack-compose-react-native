import { requireNativeViewManager } from "expo-modules-core";
import * as React from "react";
import { TextStyle } from "react-native";
import { Modifier } from "../../utils/modifier";

export type TextProps = {
  text: string;
  style?: TextStyle;
  modifier?: typeof Modifier;
};

const NativeView: React.ComponentType<TextProps> =
  requireNativeViewManager("ButtonView");

export function Text({ style, ...rest }: TextProps) {
  return (
    <NativeView
      {...rest}
      style={{ ...(style as any) }}
      modifier={(rest.modifier as any)?.build()}
    />
  );
}
