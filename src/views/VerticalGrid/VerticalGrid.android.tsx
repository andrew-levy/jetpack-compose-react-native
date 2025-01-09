import { requireNativeViewManager } from "expo-modules-core";
import * as React from "react";
import { ViewStyle } from "react-native";
import { Modifier } from "../../utils/modifier";

export type VerticalGridProps = {
  style?: ViewStyle;
  staggered?: boolean;
  modifier?: typeof Modifier;
  children?: React.ReactNode;
};

const NativeView: React.ComponentType<VerticalGridProps> =
  requireNativeViewManager("VerticalGridView");

export function VerticalGrid({ style, ...rest }: VerticalGridProps) {
  return (
    <NativeView
      {...rest}
      staggered={rest.staggered}
      style={{ height: 100, width: "100%", ...(style as any) }}
      modifier={(rest.modifier as any)?.build()}
    />
  );
}
