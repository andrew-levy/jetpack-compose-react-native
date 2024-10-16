import { requireNativeViewManager } from "expo-modules-core";
import * as React from "react";
import { ViewStyle } from "react-native";
import { Modifier } from "../../utils/modifier";
import { MaterialIconName } from "../Icon/Icon.types";

export type ChipProps = {
  labelText: string;
  selected?: boolean;
  leadingIcon?: MaterialIconName;
  trailingIcon?: MaterialIconName;
  variant?: "assist" | "input" | "filter" | "suggestion";
  enabled?: boolean;
  onClick?: () => void;
  style?: ViewStyle;
  modifier?: typeof Modifier;
};

type NativeChipProps = Omit<ChipProps, "onClick"> & {
  onChipClick?: () => void;
};

const NativeView: React.ComponentType<NativeChipProps> =
  requireNativeViewManager("ChipView");

export function Chip({
  onClick,
  style,
  variant = "suggestion",
  enabled,
  ...rest
}: ChipProps) {
  return (
    <NativeView
      {...rest}
      variant={variant}
      enabled={enabled}
      onChipClick={onClick}
      style={{ height: 40, width: "100%", ...(style as any) }}
      modifier={(rest.modifier as any)?.build()}
    />
  );
}
