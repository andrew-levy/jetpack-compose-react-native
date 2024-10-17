import { requireNativeViewManager } from "expo-modules-core";
import * as React from "react";
import { ViewStyle } from "react-native";
import { Modifier } from "../../utils/modifier";

export type BadgeProps = {
  style?: ViewStyle;
  modifier?: typeof Modifier;
  content?: string;
  children?: React.ReactNode;
};

const NativeView: React.ComponentType<BadgeProps> =
  requireNativeViewManager("BadgeView");

export function Badge({ style, ...rest }: BadgeProps) {
  return (
    <NativeView
      {...rest}
      style={{ height: 100, width: "100%", ...(style as any) }}
      modifier={(rest.modifier as any)?.build()}
    />
  );
}
