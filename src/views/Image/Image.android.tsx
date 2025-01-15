import { requireNativeViewManager } from "expo-modules-core";
import * as React from "react";
import { ViewStyle, Image as RNImage } from "react-native";
import { Modifier } from "../../utils/modifier";

export type ImageProps = {
  source: number;
  style?: ViewStyle;
  modifier?: typeof Modifier;
};

type NativeImageProps = Omit<ImageProps, "source"> & {
  source: string;
};

const NativeView: React.ComponentType<NativeImageProps> =
  requireNativeViewManager("ComposeImageView");

export function Image({ source: src, style, ...rest }: ImageProps) {
  return (
    <NativeView
      {...rest}
      source={RNImage.resolveAssetSource(src).uri}
      style={{ height: 40, width: "100%", ...(style as any) }}
      modifier={(rest.modifier as any)?.build()}
    />
  );
}
