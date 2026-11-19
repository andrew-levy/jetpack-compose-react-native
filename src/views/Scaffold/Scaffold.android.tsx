import { requireNativeComponent } from "react-native";
import * as React from "react";
import { ViewStyle, useWindowDimensions } from "react-native";
import { Modifier } from "../../utils/modifier";

export type ScaffoldProps = {
  style?: ViewStyle;
  modifier?: typeof Modifier;
  children?: React.ReactNode;
};

const NativeView: React.ComponentType<ScaffoldProps> =
  requireNativeComponent("ScaffoldView");

export function Scaffold({ style, ...rest }: ScaffoldProps) {
  return (
    <NativeView
      {...rest}
      style={{ height: "100%", width: "100%", ...(style as any) }}
      modifier={(rest.modifier as any)?.build()}
    />
  );
}
