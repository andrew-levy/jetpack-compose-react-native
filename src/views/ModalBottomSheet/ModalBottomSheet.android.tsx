import { requireNativeViewManager } from "expo-modules-core";
import * as React from "react";
import { NativeSyntheticEvent, ViewStyle } from "react-native";
import { Modifier } from "../../utils/modifier";

export type ModalBottomSheetProps = {
  isVisible: boolean;
  onDismiss?: () => void;
  children?: React.ReactNode;
  style?: ViewStyle;
  modifier?: typeof Modifier;
};

type NativeModalBottomSheetProps = Omit<ModalBottomSheetProps, "onDismiss"> & {
  onDismiss: (e: NativeSyntheticEvent<{}>) => void;
};

const NativeView: React.ComponentType<NativeModalBottomSheetProps> =
  requireNativeViewManager("ModalBottomSheetView");

export function ModalBottomSheet({
  style,
  modifier,
  onDismiss,
  children,
  ...rest
}: ModalBottomSheetProps) {
  return (
    <NativeView
      {...rest}
      onDismiss={() => {
        onDismiss?.();
      }}
      style={style}
      modifier={(modifier as any)?.build()}
    >
      {children}
    </NativeView>
  );
}
