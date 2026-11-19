import { requireNativeComponent } from "react-native";
import * as React from "react";
import { ViewStyle } from "react-native";
import { Modifier } from "../../utils/modifier";

export type DatePickerProps = {
  style?: ViewStyle;
  confirmText?: string;
  dismissText?: string;
  tonalElevation?: number;
  showModeToggle?: boolean;
  onDismiss?: () => void;
  onConfirm?: () => void;
  modifier?: typeof Modifier;
};

const NativeView: React.ComponentType<DatePickerProps> =
  requireNativeComponent("DatePickerView");

export function DatePicker({
  style,
  onConfirm,
  onDismiss,
  ...rest
}: DatePickerProps) {
  return (
    <NativeView
      {...rest}
      onConfirm={onConfirm}
      onDismiss={onDismiss}
      style={{ height: "auto", width: "auto", ...(style as any) }}
      modifier={(rest.modifier as any)?.build()}
    />
  );
}
