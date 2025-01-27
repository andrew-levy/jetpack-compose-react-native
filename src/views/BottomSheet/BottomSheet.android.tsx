import { requireNativeViewManager } from "expo-modules-core";
import * as React from "react";
import { ViewStyle } from "react-native";
import { Modifier } from "../../utils/modifier";

export type BottomSheetProps = {
  style?: ViewStyle;
  tonalElevation?: number;
  onDismiss?: () => void;
  children?: React.ReactNode;
  modifier?: typeof Modifier;
};

const NativeView: React.ComponentType<BottomSheetProps> =
  requireNativeViewManager("BottomSheetView");

export function BottomSheet({ style, onDismiss, ...rest }: BottomSheetProps) {
  return (
    <NativeView
      {...rest}
      onDismiss={onDismiss}
      style={{ height: "auto", width: "auto", ...(style as any) }}
      modifier={(rest.modifier as any)?.build()}
    />
  );
}
