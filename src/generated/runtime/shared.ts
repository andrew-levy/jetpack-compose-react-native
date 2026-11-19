import * as React from "react";
import type { StyleProp, ViewStyle } from "react-native";

export interface ComposableViewProps {
  style?: StyleProp<ViewStyle>;
  testID?: string;
}

export interface ComposeHostProps extends ComposableViewProps {
  children?: React.ReactNode;
  fitContent?: boolean;
}

export type ModifierData = readonly Record<string, unknown>[];
export const ComposeHostContext = React.createContext(false);
