import { requireNativeViewManager } from "expo-modules-core";
import * as React from "react";
import { StyleSheet, ViewStyle } from "react-native";
import { Modifier } from "../../utils/modifier";

export type ProgressIndicatorProps = {
  progress: number;
  variant?: "circular" | "linear";
  style?: ViewStyle;
  modifier?: typeof Modifier;
};

const NativeView: React.ComponentType<ProgressIndicatorProps> =
  requireNativeViewManager("ProgressIndicatorView");

export function ProgressIndicator({
  style,
  variant = "circular",
  ...rest
}: ProgressIndicatorProps) {
  return (
    <NativeView
      {...rest}
      variant={variant}
      style={[styles[variant], style] as any}
      modifier={(rest.modifier as any)?.build()}
    />
  );
}

const styles = StyleSheet.create({
  linear: {
    height: 4,
    width: "100%",
  },
  circular: {
    height: 40,
    width: 40,
  },
});
