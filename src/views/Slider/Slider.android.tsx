import { requireNativeViewManager } from "expo-modules-core";
import * as React from "react";
import { NativeSyntheticEvent, ViewStyle } from "react-native";
import { Modifier } from "../../utils/modifier";

export type SliderProps = {
  value: number;
  onValueChange?: (value: number) => void;
  style?: ViewStyle;
  modifier?: typeof Modifier;
};

type NativeSliderProps = Omit<SliderProps, "onValueChange"> & {
  onValueChange: (e: NativeSyntheticEvent<{ value: number }>) => void;
};

const NativeView: React.ComponentType<NativeSliderProps> =
  requireNativeViewManager("SliderView");

export function Slider({
  style,
  modifier,
  onValueChange,
  ...rest
}: SliderProps) {
  return (
    <NativeView
      {...rest}
      onValueChange={(e) => {
        onValueChange?.(e.nativeEvent.value);
      }}
      style={{ height: 40, width: "100%", ...(style as any) }}
      modifier={(modifier as any)?.build()}
    />
  );
}
