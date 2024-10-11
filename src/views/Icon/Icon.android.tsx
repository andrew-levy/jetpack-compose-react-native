import { requireNativeViewManager } from "expo-modules-core";
import * as React from "react";
import { ViewStyle } from "react-native";
import { Modifier } from "../../utils/modifier";
import { MaterialIconName, MaterialIconTheme } from "./Icon.types";

export type IconProps = {
  name: MaterialIconName;
  theme: MaterialIconTheme;
  contentDescription?: string;
  style?: ViewStyle;
  modifier?: typeof Modifier;
};

const NativeView: React.ComponentType<IconProps> =
  requireNativeViewManager("IconView");

export function Icon({ style, modifier, ...rest }: IconProps) {
  return (
    <NativeView
      {...rest}
      style={{ height: 40, width: 40, ...(style as any) }}
      modifier={(modifier as any)?.build()}
    />
  );
}
