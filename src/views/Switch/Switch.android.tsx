import { requireNativeViewManager } from "expo-modules-core";
import * as React from "react";
import { NativeSyntheticEvent, ViewStyle } from "react-native";
import { Modifier } from "../../utils/modifier";

export type SwitchProps = {
  checked: boolean;
  onCheckedChange?: (checked: boolean) => void;
  style?: ViewStyle;
  modifier?: typeof Modifier;
};

type NativeSwitchProps = Omit<SwitchProps, "onCheckedChange"> & {
  onCheckedChange: (e: NativeSyntheticEvent<{ checked: boolean }>) => void;
};

const NativeView: React.ComponentType<NativeSwitchProps> =
  requireNativeViewManager("SwitchView");

export function Switch({
  style,
  modifier,
  onCheckedChange,
  ...rest
}: SwitchProps) {
  return (
    <NativeView
      {...rest}
      onCheckedChange={(e) => {
        onCheckedChange?.(e.nativeEvent.checked);
      }}
      modifier={(modifier as any).build()}
      style={{ height: 40, width: "100%", ...(style as any) }}
    />
  );
}
