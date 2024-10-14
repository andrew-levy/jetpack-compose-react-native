import { requireNativeViewManager } from "expo-modules-core";
import * as React from "react";
import { ViewStyle } from "react-native";
import { Modifier } from "../../utils/modifier";

export type SpacerProps = {
  style?: ViewStyle;
  modifier?: typeof Modifier;
};

const NativeView: React.ComponentType<SpacerProps> =
  requireNativeViewManager("SpacerView");

export function Spacer({ style, ...rest }: SpacerProps) {
  return (
    <NativeView
      {...rest}
      style={{ height: 40, width: "100%", ...(style as any) }}
      modifier={(rest.modifier as any)?.build()}
    />
  );
}
