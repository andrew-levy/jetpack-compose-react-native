import { requireNativeViewManager } from "expo-modules-core";
import * as React from "react";
import { ViewStyle } from "react-native";

export type ButtonProps = {
  text: string;
  onClick?: () => void;
  style?: ViewStyle;
};

const NativeView: React.ComponentType<ButtonProps & { onButtonClick }> =
  requireNativeViewManager("ButtonView");

export function Button({ onClick, style, ...rest }: ButtonProps) {
  return (
    <NativeView
      {...rest}
      onButtonClick={onClick}
      style={{ height: 40, width: "100%", ...(style as any) }}
    />
  );
}
