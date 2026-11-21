import { useEffect, useRef, useState } from "react";
import { BackHandler, Pressable, ScrollView, StatusBar, StyleSheet, Text, View } from "react-native";

import { Bindings, Components, Expressive, Interop, Modifiers } from "./Gallery";

const screens = [
  { title: "Components", View: Components },
  { title: "Expressive", View: Expressive },
  { title: "Modifiers", View: Modifiers },
  { title: "Interop", View: Interop },
  { title: "Bindings", View: Bindings },
] as const;

export default function App() {
  const [screen, setScreen] = useState(0);
  const [showCode, setShowCode] = useState(false);
  const scroll = useRef<ScrollView>(null);
  const Gallery = screens[screen].View;

  function selectScreen(index: number) {
    scroll.current?.scrollTo({ y: 0, animated: false });
    setScreen(index);
  }

  useEffect(() => {
    const subscription = BackHandler.addEventListener("hardwareBackPress", () => {
      if (screen === 0) return false;
      selectScreen(0);
      return true;
    });
    return () => subscription.remove();
  }, [screen]);

  return (
    <View style={styles.screen}>
      <StatusBar barStyle="dark-content" backgroundColor="#f5f3fa" />
      <View style={styles.header}>
        <View style={styles.identity}>
          <View style={styles.mark}><Text style={styles.markText}>C</Text></View>
          <Text accessibilityRole="header" style={styles.title}>Compose Gallery</Text>
        </View>
        <Pressable
          accessibilityRole="togglebutton"
          accessibilityLabel="Show source code"
          accessibilityState={{ checked: showCode }}
          onPress={() => setShowCode(!showCode)}
          style={[styles.codeButton, showCode && styles.codeActive]}
        >
          <Text style={[styles.codeLabel, showCode && styles.codeActiveLabel]}>{"</>"} Code</Text>
        </Pressable>
      </View>
      <View accessibilityRole="tablist" style={styles.tabs}>
        {screens.map(({ title }, index) => (
          <Pressable
            key={title}
            accessibilityRole="tab"
            accessibilityState={{ selected: screen === index }}
            onPress={() => selectScreen(index)}
            style={[styles.tab, screen === index && styles.selectedTab]}
          >
            <Text
              numberOfLines={1}
              adjustsFontSizeToFit
              style={[styles.tabLabel, screen === index && styles.selectedLabel]}
            >
              {title}
            </Text>
          </Pressable>
        ))}
      </View>
      <ScrollView
        ref={scroll}
        keyboardShouldPersistTaps="handled"
        contentContainerStyle={styles.content}
      >
        <Gallery showCode={showCode} />
      </ScrollView>
    </View>
  );
}

const styles = StyleSheet.create({
  screen: { flex: 1, backgroundColor: "#f5f3fa" },
  header: { minHeight: 60, paddingHorizontal: 16, flexDirection: "row", alignItems: "center", justifyContent: "space-between", gap: 8 },
  identity: { flex: 1, flexDirection: "row", gap: 9, alignItems: "center" },
  mark: { backgroundColor: "#3e275f", width: 30, height: 30, borderRadius: 9, justifyContent: "center", alignItems: "center" },
  markText: { color: "#f1e5ff", fontWeight: "800", fontSize: 19 },
  title: { color: "#261b3a", fontSize: 21, fontWeight: "800", letterSpacing: -0.65, flexShrink: 1 },
  codeButton: { borderRadius: 10, paddingHorizontal: 9, minHeight: 44, justifyContent: "center" },
  codeActive: { backgroundColor: "#3e275f" },
  codeLabel: { color: "#604680", fontSize: 12, fontWeight: "800" },
  codeActiveLabel: { color: "#fff" },
  tabs: { marginHorizontal: 16, borderRadius: 14, backgroundColor: "#eae4f3", padding: 4, flexDirection: "row" },
  tab: { flex: 1, minHeight: 44, borderRadius: 10, alignItems: "center", justifyContent: "center" },
  selectedTab: { backgroundColor: "#fff" },
  tabLabel: { color: "#5c4b70", fontSize: 13, fontWeight: "600" },
  selectedLabel: { color: "#3e275f", fontWeight: "800" },
  content: { padding: 16, paddingBottom: 40, gap: 14 },
});
