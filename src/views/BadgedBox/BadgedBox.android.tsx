import { requireNativeComponent } from "react-native";
import * as React from "react";
import { ViewStyle } from "react-native";
import { Modifier } from "../../utils/modifier";
import { BadgeProps } from "../Badge/Badge.android";

export type BadgedBoxProps = {
  badge: React.ReactElement<BadgeProps>;
  style?: ViewStyle;
  modifier?: typeof Modifier;
  children?: React.ReactNode;
};

type NativeBadgedBoxProps = Omit<BadgedBoxProps, "badge">;

const NativeView: React.ComponentType<NativeBadgedBoxProps> =
  requireNativeComponent("BadgedBoxView");

export function BadgedBox({ style, children, badge, ...rest }: BadgedBoxProps) {
  return (
    <NativeView
      {...rest}
      style={{ height: 20, width: 20, ...(style as any) }}
      modifier={(rest.modifier as any)?.build()}
    >
      {badge}
      {children}
    </NativeView>
  );
}
