import { requireNativeViewManager } from "expo-modules-core";
import * as React from "react";
import { ViewStyle } from "react-native";
import { Modifier } from "../../utils/modifier";

export type RowProps = {
  style?: ViewStyle;
  modifier?: typeof Modifier;
  children?: React.ReactNode;
};

const NativeView: React.ComponentType<RowProps> =
  requireNativeViewManager("RowView");

export function Row({ style, ...rest }: RowProps) {
  return (
    <NativeView
      {...rest}
      style={{ height: 100, width: "100%", ...(style as any) }}
      modifier={(rest.modifier as any)?.build()}
    />
  );
}
