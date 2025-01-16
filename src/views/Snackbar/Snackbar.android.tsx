import { requireNativeViewManager } from "expo-modules-core";
import * as React from "react";
import { ViewStyle } from "react-native";
import { Modifier } from "../../utils/modifier";

export type SnackbarProps = {
  style?: ViewStyle;
  message: string;
  actionLabel?: string;
  onActionPerformed?: () => void;
  onDismiss?: () => void;
  show: boolean;
  modifier?: typeof Modifier;
};

const NativeView: React.ComponentType<SnackbarProps> =
  requireNativeViewManager("SnackbarView");

export function Snackbar({ style, ...rest }: SnackbarProps) {
  return (
    <NativeView
      {...rest}
      style={{ height: 200, width: 300, ...(style as any) }}
      modifier={(rest.modifier as any)?.build()}
    />
  );
}
