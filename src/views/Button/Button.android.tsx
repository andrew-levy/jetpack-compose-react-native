import { requireNativeViewManager } from "expo-modules-core";
import * as React from "react";
import { ViewStyle } from "react-native";
import { Modifier } from "../../utils/modifier";

export type ButtonProps = {
  text: string;
  onClick?: () => void;
  style?: ViewStyle;
  modifier?: typeof Modifier;
};

type NativeButtonProps = Omit<ButtonProps, "onClick"> & {
  onButtonClick?: () => void;
};

const NativeView: React.ComponentType<NativeButtonProps> =
  requireNativeViewManager("ButtonView");

export function Button({ onClick, style, ...rest }: ButtonProps) {
  return (
    <NativeView
      {...rest}
      onButtonClick={onClick}
      style={{ height: 40, width: "100%", ...(style as any) }}
      modifier={(rest.modifier as any)?.build()}
    />
  );
}
