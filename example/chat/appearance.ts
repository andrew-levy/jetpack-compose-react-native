import { darkColorScheme, lightColorScheme, type ComposeMotionSchemeValue, type ComposeShape } from "jetpack-compose-react-native";

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
  cornerRadius: 16,
};

const dark: typeof light = {
  ...light,
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

const expressiveLight: Palette = {
  ...light,
  page: "#F9F3FC",
  surface: "#FFFAFF",
  panel: "#F0E6F5",
  ink: "#291A35",
  muted: "#66546F",
  edge: "#DFD0E7",
  accent: "#713F93",
  softAccent: "#ECD7FC",
  scrim: "#65291A35",
  cornerRadius: 26,
};

const expressiveDark: Palette = {
  ...dark,
  page: "#21172B",
  surface: "#2C2038",
  panel: "#392947",
  ink: "#F6E7FF",
  muted: "#CEB9D8",
  edge: "#5D496B",
  accent: "#E0B6FA",
  accentInk: "#3D1757",
  softAccent: "#4B2D61",
  scrim: "#95130C1A",
  cornerRadius: 26,
};

function theme(palette: Palette, dark: boolean, expressive: boolean) {
  const scheme = dark ? darkColorScheme(material(palette)) : lightColorScheme(material(palette));
  const motion: ComposeMotionSchemeValue = { factory: expressive ? "MotionScheme.expressive" : "MotionScheme.standard" };
  return { palette, scheme, motion };
}

export const themes = {
  light: theme(light, false, false),
  dark: theme(dark, true, false),
  expressiveLight: theme(expressiveLight, false, true),
  expressiveDark: theme(expressiveDark, true, true),
};

export function rounded(radius: number): ComposeShape {
  return { rect: { cornerRadius: radius } };
}
