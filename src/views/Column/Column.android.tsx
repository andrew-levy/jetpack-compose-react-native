import { requireNativeViewManager } from "expo-modules-core";
import * as React from "react";
import { ViewStyle } from "react-native";
import { Modifier } from "../../utils/modifier";

export type ColumnProps = {
  style?: ViewStyle;
  modifier?: typeof Modifier;
};

type NativeColumnProps = Omit<ColumnProps, "onClick"> & {
  onColumnClick?: () => void;
};

const NativeView: React.ComponentType<NativeColumnProps> =
  requireNativeViewManager("ColumnView");

export function Column({ style, ...rest }: ColumnProps) {
  return (
    <NativeView
      {...rest}
      style={{ height: 100, width: "100%", ...(style as any) }}
      modifier={(rest.modifier as any)?.build()}
    />
  );
}
