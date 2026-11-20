export interface ColorSchemeColors {
  primary?: string;
  onPrimary?: string;
  primaryContainer?: string;
  onPrimaryContainer?: string;
  inversePrimary?: string;
  secondary?: string;
  onSecondary?: string;
  secondaryContainer?: string;
  onSecondaryContainer?: string;
  tertiary?: string;
  onTertiary?: string;
  tertiaryContainer?: string;
  onTertiaryContainer?: string;
  background?: string;
  onBackground?: string;
  surface?: string;
  onSurface?: string;
  surfaceVariant?: string;
  onSurfaceVariant?: string;
  surfaceTint?: string;
  inverseSurface?: string;
  inverseOnSurface?: string;
  error?: string;
  onError?: string;
  errorContainer?: string;
  onErrorContainer?: string;
  outline?: string;
  outlineVariant?: string;
  scrim?: string;
  surfaceBright?: string;
  surfaceContainer?: string;
  surfaceContainerHigh?: string;
  surfaceContainerHighest?: string;
  surfaceContainerLow?: string;
  surfaceContainerLowest?: string;
  surfaceDim?: string;
}

export interface ColorScheme {
  readonly palette: "light" | "dark";
  readonly colors: Readonly<ColorSchemeColors>;
}

export function lightColorScheme(colors: ColorSchemeColors = {}): ColorScheme {
  return { palette: "light", colors: { ...colors } };
}

export function darkColorScheme(colors: ColorSchemeColors = {}): ColorScheme {
  return { palette: "dark", colors: { ...colors } };
}
