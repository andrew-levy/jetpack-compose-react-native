import { requireNativeViewManager } from "expo-modules-core";
import * as React from "react";
import { ViewStyle, Image } from "react-native";
import { Modifier } from "../../utils/modifier";

export type CarouselProps = {
  style?: ViewStyle;
  modifier?: typeof Modifier;
  items: string[];
};

const NativeView: React.ComponentType<CarouselProps> =
  requireNativeViewManager("CarouselView");

export function Carousel({
  style,
  items: itemRequires,
  ...rest
}: CarouselProps) {
  return (
    <NativeView
      {...rest}
      items={itemRequires.map(
        (item: any) => Image.resolveAssetSource(item).uri
      )}
      style={{ height: 100, width: "100%", ...(style as any) }}
      modifier={(rest.modifier as any)?.build()}
    />
  );
}
