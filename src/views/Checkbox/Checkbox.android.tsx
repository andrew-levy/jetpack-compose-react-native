import { requireNativeComponent } from "react-native";
import * as React from "react";
import { NativeSyntheticEvent, ViewStyle } from "react-native";
import { Modifier } from "../../utils/modifier";

export type CheckboxProps = {
  checked: boolean;
  onCheckedChange?: (checked: boolean) => void;
  style?: ViewStyle;
  modifier?: typeof Modifier;
};

type NativeCheckboxProps = Omit<CheckboxProps, "onCheckedChange"> & {
  onCheckedChange: (e: NativeSyntheticEvent<{ checked: boolean }>) => void;
};

const NativeView: React.ComponentType<NativeCheckboxProps> =
  requireNativeComponent("CheckboxView");

export function Checkbox({
  style,
  modifier,
  onCheckedChange,
  ...rest
}: CheckboxProps) {
  return (
    <NativeView
      {...rest}
      onCheckedChange={(e) => {
        onCheckedChange?.(e.nativeEvent.checked);
      }}
      modifier={(modifier as any)?.build()}
      style={{ height: 40, width: "100%", ...(style as any) }}
    />
  );
}
