import { requireNativeViewManager } from "expo-modules-core";
import * as React from "react";
import { ViewStyle } from "react-native";
import { Modifier } from "../../utils/modifier";

export type DialogProps = {
  style?: ViewStyle;
  title: string;
  text: string;
  icon?: string;
  confirmText?: string;
  dismissText?: string;
  tonalElevation?: number;
  onDismiss?: () => void;
  onConfirm?: () => void;
  modifier?: typeof Modifier;
};

const NativeView: React.ComponentType<DialogProps> =
  requireNativeViewManager("DialogView");

export function Dialog({ style, onDismiss, onConfirm, ...rest }: DialogProps) {
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
