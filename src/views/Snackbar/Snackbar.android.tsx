import { requireNativeViewManager } from "expo-modules-core";
import * as React from "react";
import { ViewStyle } from "react-native";
import { Modifier } from "../../utils/modifier";

export type SnackbarProps = {
  style?: ViewStyle;
  message: string;
  actionLabel?: string;
  onAction?: () => void;
  onDismiss: () => void;
  modifier?: typeof Modifier;
};

const NativeView: React.ComponentType<SnackbarProps> =
  requireNativeViewManager("SnackbarView");

export function Snackbar({
  style,
  onAction,
  onDismiss,
  ...rest
}: SnackbarProps) {
  return (
    <NativeView
      {...rest}
      onAction={onAction}
      onDismiss={onDismiss}
      style={{ height: "auto", width: "auto", ...(style as any) }}
      modifier={(rest.modifier as any)?.build()}
    />
  );
}
