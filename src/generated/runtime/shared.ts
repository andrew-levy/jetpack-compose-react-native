import * as React from "react";
import type { StyleProp, ViewStyle } from "react-native";

export interface ComposableViewProps {
  style?: StyleProp<ViewStyle>;
  testID?: string;
}

export interface ComposeThemeColors {
  primary?: string;
  onPrimary?: string;
  primaryContainer?: string;
  onPrimaryContainer?: string;
  secondary?: string;
  onSecondary?: string;
  secondaryContainer?: string;
  onSecondaryContainer?: string;
  tertiary?: string;
  onTertiary?: string;
  tertiaryContainer?: string;
  onTertiaryContainer?: string;
  surface?: string;
  onSurface?: string;
  surfaceVariant?: string;
  onSurfaceVariant?: string;
  outline?: string;
  error?: string;
  onError?: string;
}

export interface ComposeTheme {
  /** The default is light. Use system to follow Android's appearance. */
  appearance?: "light" | "dark" | "system";
  /** Material 3 color roles to override. Other roles use the selected appearance's defaults. */
  colors?: ComposeThemeColors;
}

export interface ComposeHostProps extends ComposableViewProps {
  theme?: ComposeTheme;
  children?: React.ReactNode;
  fitContent?: boolean;
}

export const ComposeHostContext = React.createContext(false);
