import { useState } from "react";
import { StatusBar, useColorScheme } from "react-native";
import { SafeAreaProvider, SafeAreaView } from "react-native-safe-area-context";

import BridgeChecks from "./BridgeChecks";
import { Catalog } from "./catalog/Catalog";
import { CatalogPaletteContext, palettes, type ThemeMode } from "./catalog/theme";

// Android draws apps edge to edge (Expo SDK 58, target SDK 36), so keep content clear of the system bars.
export default function App({ catalogStart, bridgeChecks }: { catalogStart?: number; bridgeChecks?: boolean }) {
  const [mode, setMode] = useState<ThemeMode>("System");
  const systemScheme = useColorScheme();
  const dark = mode === "Dark" || (mode === "System" && systemScheme === "dark");
  const palette = dark ? palettes.dark : palettes.light;

  if (bridgeChecks) {
    return (
      <SafeAreaProvider>
        <SafeAreaView edges={["top", "bottom"]} style={{ flex: 1, backgroundColor: "#f5f3fa" }}>
          <BridgeChecks />
        </SafeAreaView>
      </SafeAreaProvider>
    );
  }

  return (
    <SafeAreaProvider>
      <CatalogPaletteContext.Provider value={palette}>
        <SafeAreaView edges={["top", "bottom"]} style={{ flex: 1, backgroundColor: palette.page }}>
          <StatusBar barStyle={dark ? "light-content" : "dark-content"} />
          <Catalog startIndex={catalogStart} mode={mode} onModeChange={setMode} />
        </SafeAreaView>
      </CatalogPaletteContext.Provider>
    </SafeAreaProvider>
  );
}
