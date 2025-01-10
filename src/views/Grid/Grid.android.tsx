import { requireNativeViewManager } from "expo-modules-core";
import * as React from "react";
import { ViewStyle } from "react-native";
import { Modifier } from "../../utils/modifier";

export type GridProps = {
  style?: ViewStyle;
  staggered?: boolean;
  vertical?: boolean;
  horizontal?: boolean;
  modifier?: typeof Modifier;
  size?: number;
  gridCellsType?: "fixed" | "fixedSize" | "adaptive";
  verticalItemSpacing?: number;
  spacedBy?: number;
  children?: React.ReactNode;
};

const NativeView: React.ComponentType<GridProps> =
  requireNativeViewManager("GridView");

export function Grid({ style, ...rest }: GridProps) {
  return (
    <NativeView
      {...rest}
      vertical={rest.vertical}
      horizontal={rest.horizontal}
      staggered={rest.staggered}
      style={{ height: 100, width: "100%", ...(style as any) }}
      modifier={(rest.modifier as any)?.build()}
    />
  );
}
