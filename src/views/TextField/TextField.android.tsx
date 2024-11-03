import { requireNativeViewManager } from "expo-modules-core";
import * as React from "react";
import { NativeSyntheticEvent, ViewStyle } from "react-native";
import { Modifier } from "../../utils/modifier";

export type TextFieldProps = {
  value: string;
  onValueChange?: (value: string) => void;
  label?: string;
  style?: ViewStyle;
  modifier?: typeof Modifier;
};

type NativeTextFieldProps = Omit<TextFieldProps, "onValueChange"> & {
  onValueChange: (e: NativeSyntheticEvent<{ value: string }>) => void;
};

const NativeView: React.ComponentType<NativeTextFieldProps> =
  requireNativeViewManager("TextFieldView");

export function TextField({
  style,
  modifier,
  onValueChange,
  ...rest
}: TextFieldProps) {
  return (
    <NativeView
      {...rest}
      onValueChange={(e) => {
        onValueChange?.(e.nativeEvent.value);
      }}
      style={{ height: 50, width: "100%", ...(style as any) }}
      modifier={(modifier as any)?.build()}
    />
  );
}
