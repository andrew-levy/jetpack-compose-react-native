import { requireNativeViewManager } from "expo-modules-core";
import * as React from "react";
import { ViewStyle } from "react-native";
import { Modifier } from "../../utils/modifier";

export type DividerProps = {
  thickness?: number;
  color?: string;
  style?: ViewStyle;
  modifier?: typeof Modifier;
};

const NativeView: React.ComponentType<DividerProps> =
  requireNativeViewManager("DividerView");

function Divider({
  style,
  ...rest
}: DividerProps & { direction?: "horizontal" | "vertical" }) {
  return <NativeView {...rest} modifier={(rest.modifier as any)?.build()} />;
}

export function HorizontalDivider({ style, ...rest }: DividerProps) {
  return <Divider {...rest} direction="horizontal" />;
}

export function VerticalDivider({ style, ...rest }: DividerProps) {
  return <Divider {...rest} direction="vertical" />;
}
