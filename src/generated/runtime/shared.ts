import * as React from "react";
import type { StyleProp, ViewStyle } from "react-native";

export interface ComposeHostProps {
  children?: React.ReactNode;
  style?: StyleProp<ViewStyle>;
  fitContent?: boolean;
  testID?: string;
}

export type ModifierData = readonly Record<string, unknown>[];
export const ComposeHostContext = React.createContext(false);
