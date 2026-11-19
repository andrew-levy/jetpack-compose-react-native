import { requireNativeComponent } from "react-native";
import * as React from "react";
import { ViewStyle } from "react-native";
import { Modifier } from "../../utils/modifier";

export type CardProps = {
  variant?: "outlined" | "elevated" | "filled";
  style?: ViewStyle;
  modifier?: typeof Modifier;
  children?: React.ReactNode;
};

const NativeView: React.ComponentType<CardProps> =
  requireNativeComponent("CardView");

export function Card({ style, variant = "filled", ...rest }: CardProps) {
  return (
    <NativeView
      {...rest}
      variant={variant}
      style={{ height: 400, width: "100%", ...(style as any) }}
      modifier={(rest.modifier as any)?.build()}
    />
  );
}
