import { useState } from "react";
import { StatusBar, View, useColorScheme } from "react-native";

import BridgeChecks from "./BridgeChecks";
import { Catalog } from "./catalog/Catalog";
import { CatalogPaletteContext, palettes, type ThemeMode } from "./catalog/theme";

export default function App({ catalogStart, bridgeChecks }: { catalogStart?: number; bridgeChecks?: boolean }) {
  const [mode, setMode] = useState<ThemeMode>("System");
  const systemScheme = useColorScheme();
  const dark = mode === "Dark" || (mode === "System" && systemScheme === "dark");
  const palette = dark ? palettes.dark : palettes.light;

  if (bridgeChecks) return <BridgeChecks />;

  return (
    <CatalogPaletteContext.Provider value={palette}>
      <View style={{ flex: 1, backgroundColor: palette.page }}>
        <StatusBar barStyle={dark ? "light-content" : "dark-content"} backgroundColor={palette.page} />
        <Catalog startIndex={catalogStart} mode={mode} onModeChange={setMode} />
      </View>
    </CatalogPaletteContext.Provider>
  );
}
