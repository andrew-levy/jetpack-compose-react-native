import { darkColorScheme, lightColorScheme, type ComposeShape } from "jetpack-compose-react-native";

const light = {
  page: "#F6F5EF",
  surface: "#FFFDF8",
  panel: "#ECEFE6",
  ink: "#172E28",
  muted: "#4C6158",
  edge: "#D2DACF",
  accent: "#235B48",
  accentInk: "#FFFFFF",
  softAccent: "#DCEBDB",
  scrim: "#65112720",
  danger: "#97483C",
};

const dark: typeof light = {
  page: "#101C19",
  surface: "#172722",
  panel: "#1E3129",
  ink: "#E5F1E8",
  muted: "#ADC1B5",
  edge: "#395249",
  accent: "#A5D8B9",
  accentInk: "#103629",
  softAccent: "#284537",
  scrim: "#95030907",
  danger: "#FFB4A9",
};

export type Palette = typeof light;
export type Appearance = "System" | "Light" | "Dark";

function material(palette: Palette) {
  return {
    primary: palette.accent, onPrimary: palette.accentInk,
    primaryContainer: palette.softAccent, onPrimaryContainer: palette.ink,
    secondaryContainer: palette.softAccent, onSecondaryContainer: palette.ink,
    background: palette.page, onBackground: palette.ink,
    surface: palette.surface, onSurface: palette.ink,
    surfaceVariant: palette.panel, onSurfaceVariant: palette.muted,
    surfaceContainer: palette.surface, surfaceContainerHigh: palette.panel,
    outline: palette.edge, outlineVariant: palette.edge,
    inverseSurface: palette.ink, inverseOnSurface: palette.surface,
    error: palette.danger,
  };
}

export const themes = {
  light: { palette: light, scheme: lightColorScheme(material(light)) },
  dark: { palette: dark, scheme: darkColorScheme(material(dark)) },
};

export function rounded(radius: number): ComposeShape {
  return { rect: { cornerRadius: radius } };
}
