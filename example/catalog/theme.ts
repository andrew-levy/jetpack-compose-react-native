import { createContext, useContext } from "react";
import { darkColorScheme, lightColorScheme } from "jetpack-compose-react-native";

export const themeModes = ["System", "Light", "Dark"] as const;
export type ThemeMode = typeof themeModes[number];

export const palettes = {
  light: {
    page: "#F5F5EF", surface: "#FFFFFF", stage: "#EAF3EC", raised: "#D8EBDD",
    ink: "#172921", muted: "#52665A", line: "#D3DED5", accent: "#185D41",
    accentText: "#FFFFFF", error: "#9E2732", swatches: ["#CBE9D2", "#CCE4EF", "#F5DEB9"],
  },
  dark: {
    page: "#111B17", surface: "#1B2922", stage: "#20352A", raised: "#304A3B",
    ink: "#E7F2E9", muted: "#B2C5B8", line: "#405548", accent: "#ADE1BA",
    accentText: "#112E20", error: "#FFB4B9", swatches: ["#335843", "#274F60", "#624A26"],
  },
};

type Palette = typeof palettes.light;
export const CatalogPaletteContext = createContext<Palette>(palettes.light);
export const useCatalogPalette = () => useContext(CatalogPaletteContext);

export const previewSchemes = {
  light: lightColorScheme({
    primary: palettes.light.accent, onPrimary: palettes.light.accentText,
    surface: palettes.light.surface, onSurface: palettes.light.ink,
    surfaceVariant: palettes.light.raised, onSurfaceVariant: palettes.light.muted,
    background: palettes.light.stage, onBackground: palettes.light.ink,
  }),
  dark: darkColorScheme({
    primary: palettes.dark.accent, onPrimary: palettes.dark.accentText,
    surface: palettes.dark.surface, onSurface: palettes.dark.ink,
    surfaceVariant: palettes.dark.raised, onSurfaceVariant: palettes.dark.muted,
    background: palettes.dark.stage, onBackground: palettes.dark.ink,
  }),
};
