import { requireNativeViewManager } from "expo-modules-core";
import * as React from "react";
import { ViewStyle } from "react-native";
import { Modifier } from "../../utils/modifier";

export type CarouselProps = {
  style?: ViewStyle;
  modifier?: typeof Modifier;
  children?: React.ReactNode;
};

const NativeView: React.ComponentType<CarouselProps> =
  requireNativeViewManager("CarouselView");

export function Carousel({ style, ...rest }: CarouselProps) {
  return (
    <NativeView
      {...rest}
      style={{ height: 100, width: "100%", ...(style as any) }}
      modifier={(rest.modifier as any)?.build()}
    />
  );
}