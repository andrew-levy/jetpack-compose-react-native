import { requireNativeViewManager } from "expo-modules-core";
import * as React from "react";
import { ViewStyle } from "react-native";
import { Modifier } from "../../utils/modifier";

export type SwitchProps = {
  checked: boolean;
  onCheckedChange?: () => void;
  style?: ViewStyle;
  modifier?: typeof Modifier;
};

const NativeView: React.ComponentType<SwitchProps> =
  requireNativeViewManager("SwitchView");

export function Switch({ style, modifier, ...rest }: SwitchProps) {
  console.log("Switch", modifier);
  return (
    <NativeView
      {...rest}
      modifier={(modifier as any).build()}
      style={{ height: 40, width: "100%", ...(style as any) }}
    />
  );
}
