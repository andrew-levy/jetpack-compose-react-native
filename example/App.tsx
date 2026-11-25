import { useEffect, useState } from "react";
import { BackHandler, StatusBar, useColorScheme, View } from "react-native";
import { SafeAreaProvider, SafeAreaView } from "react-native-safe-area-context";

import { Button, Modifier, Row, Text } from "jetpack-compose-react-native";

import { ChatScreen } from "./chat/ChatScreen";
import { themes } from "./chat/appearance";
import BridgeChecks from "./BridgeChecks";
import { Catalog } from "./catalog/Catalog";
import { CatalogPaletteContext, palettes, type ThemeMode } from "./catalog/theme";

// Android draws apps edge to edge (Expo SDK 58, target SDK 36), so keep content clear of the system bars.
export default function App({ catalogStart, bridgeChecks }: { catalogStart?: number; bridgeChecks?: boolean }) {
  const [mode, setMode] = useState<ThemeMode>("System");
  const [catalogOpen, setCatalogOpen] = useState(catalogStart !== undefined);
  const systemScheme = useColorScheme();
  const dark = mode === "Dark" || (mode === "System" && systemScheme === "dark");
  const palette = dark ? palettes.dark : palettes.light;

  const theme = themes[dark ? "dark" : "light"];

  useEffect(() => {
    if (!catalogOpen || catalogStart !== undefined) return;
    const subscription = BackHandler.addEventListener("hardwareBackPress", () => {
      setCatalogOpen(false);
      return true;
    });
    return () => subscription.remove();
  }, [catalogOpen, catalogStart]);

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
      <StatusBar barStyle={dark ? "light-content" : "dark-content"} />
      {catalogStart === undefined && (
        <SafeAreaView edges={["top", "left", "right"]}
          style={{ flex: 1, display: catalogOpen ? "none" : "flex", backgroundColor: theme.palette.page }}>
          <ChatScreen appearance={mode} onAppearance={setMode} theme={theme} onCatalog={() => setCatalogOpen(true)} />
        </SafeAreaView>
      )}
      {catalogOpen && (
        <CatalogPaletteContext.Provider value={palette}>
          <SafeAreaView edges={["top", "bottom"]} style={{ flex: 1, backgroundColor: palette.page }}>
            {catalogStart === undefined && (
              <View style={{ paddingHorizontal: 12 }}>
                <Row modifiers={Modifier.fillMaxWidth()}>
                  <Button onClick={() => setCatalogOpen(false)}><Text text="Back to Fieldnote" /></Button>
                </Row>
              </View>
            )}
            <Catalog startIndex={catalogStart} mode={mode} onModeChange={setMode} />
          </SafeAreaView>
        </CatalogPaletteContext.Provider>
      )}
    </SafeAreaProvider>
  );
}
