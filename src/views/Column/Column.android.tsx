import { requireNativeComponent } from "react-native";
import * as React from "react";
import { ViewStyle } from "react-native";
import { Modifier } from "../../utils/modifier";

export type ColumnProps = {
  style?: ViewStyle;
  lazy?: boolean;
  modifier?: typeof Modifier;
  children?: React.ReactNode;
};

const NativeView: React.ComponentType<ColumnProps> =
  requireNativeComponent("ColumnView");

export function Column({ style, ...rest }: ColumnProps) {
  return (
    <NativeView
      {...rest}
      lazy={rest.lazy}
      style={{ height: 100, width: "100%", ...(style as any) }}
      modifier={(rest.modifier as any)?.build()}
    />
  );
}
