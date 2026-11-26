import { darkColorScheme, lightColorScheme, type ComposeShape } from "jetpack-compose-react-native";

// One quiet neutral ramp and a single violet accent. Everything else comes from Material 3.
export const palettes = {
  light: {
    accent: "#5646D6", onAccent: "#FFFFFF", accentSoft: "#E6E1FF", onAccentSoft: "#1B1060",
    page: "#FBFAF8", card: "#F2F0EC", cardHigh: "#E9E6E1", ink: "#1C1B1A", muted: "#6B6862", line: "#DCD8D1",
  },
  dark: {
    accent: "#C7BFFF", onAccent: "#271A87", accentSoft: "#3D3290", onAccentSoft: "#E6E1FF",
    page: "#131312", card: "#1D1C1B", cardHigh: "#272624", ink: "#EDEBE7", muted: "#A6A29B", line: "#3A3835",
  },
};

export type Palette = typeof palettes.light;

export function colorSchemeFor(dark: boolean) {
  const p = dark ? palettes.dark : palettes.light;
  const colors = {
    primary: p.accent, onPrimary: p.onAccent,
    primaryContainer: p.accentSoft, onPrimaryContainer: p.onAccentSoft,
    secondaryContainer: p.accentSoft, onSecondaryContainer: p.onAccentSoft,
    background: p.page, onBackground: p.ink,
    surface: p.page, onSurface: p.ink, onSurfaceVariant: p.muted,
    surfaceContainerLowest: p.page, surfaceContainerLow: p.card, surfaceContainer: p.card,
    surfaceContainerHigh: p.cardHigh, surfaceContainerHighest: p.cardHigh,
    surfaceVariant: p.cardHigh, outline: p.muted, outlineVariant: p.line,
  };
  return dark ? darkColorScheme(colors) : lightColorScheme(colors);
}

export const radius = (size: number): ComposeShape => ({ rect: { cornerRadius: size } });

/** Corner shapes for a run of grouped list rows: round outer corners, tight inner ones. */
export function groupShape(index: number, count: number): ComposeShape {
  const outer = 24, inner = 6;
  return {
    factory: "RoundedCornerShape",
    topStart: index === 0 ? outer : inner, topEnd: index === 0 ? outer : inner,
    bottomStart: index === count - 1 ? outer : inner, bottomEnd: index === count - 1 ? outer : inner,
  };
}
