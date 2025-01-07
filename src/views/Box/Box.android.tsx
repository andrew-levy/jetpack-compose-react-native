import { requireNativeViewManager } from "expo-modules-core";
import * as React from "react";
import { ViewStyle } from "react-native";
import { Modifier } from "../../utils/modifier";

export type BoxProps = {
  style?: ViewStyle;
  modifier?: typeof Modifier;
  contentAlignment?: "start" | "center" | "end";
  children?: React.ReactNode;
};

const NativeView: React.ComponentType<BoxProps> =
  requireNativeViewManager("RowView");

export function Box({ style, ...rest }: BoxProps) {
  return (
    <NativeView
      {...rest}
      contentAlignment={rest.contentAlignment}
      style={{ height: "auto", width: "auto", ...(style as any) }}
      modifier={(rest.modifier as any)?.build()}
    />
  );
}
