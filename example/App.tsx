import { useState } from "react";
import { StatusBar, useColorScheme } from "react-native";
import {
  AnimatedContent, Icon, IconButton, LargeFlexibleTopAppBar, MaterialExpressiveTheme, Modifier, NavigationBar,
  NavigationBarItem, Scaffold, Text, useTopAppBarScrollBehavior,
} from "jetpack-compose-react-native";

import { ComponentsScreen } from "./showcase/components";
import { ControlsScreen, HomeScreen, MotionScreen, PaletteContext } from "./showcase/screens";
import { colorSchemeFor, palettes } from "./showcase/theme";

const tabs = [
  { key: "home", label: "Home", icon: "Home", title: "Compose" },
  { key: "components", label: "Components", icon: "Widgets", title: "Components" },
  { key: "controls", label: "Controls", icon: "Tune", title: "Controls" },
  { key: "motion", label: "Motion", icon: "Animation", title: "Motion" },
] as const;
type Tab = (typeof tabs)[number]["key"];

export default function App() {
  const [dark, setDark] = useState(useColorScheme() === "dark");
  const [tab, setTab] = useState<Tab>("home");
  const toolbar = useTopAppBarScrollBehavior("exitUntilCollapsed");
  const p = dark ? palettes.dark : palettes.light;
  const current = tabs.find(item => item.key === tab)!;

  return (
    <PaletteContext.Provider value={p}>
      <StatusBar barStyle={dark ? "light-content" : "dark-content"} />
      <MaterialExpressiveTheme colorScheme={colorSchemeFor(dark)} style={{ flex: 1 }}>
        <Scaffold
          modifiers={Modifier.fillMaxSize().nestedScroll(toolbar)}
          containerColor={p.page}
          topBar={
            <LargeFlexibleTopAppBar
              scrollBehavior={toolbar}
              title={<Text text={current.title} />}
              actions={
                <IconButton onClick={() => setDark(!dark)}>
                  <Icon painter={{ icon: dark ? "LightMode" : "DarkMode", style: "outlined" }}
                    contentDescription={dark ? "Use light theme" : "Use dark theme"} />
                </IconButton>
              }
            />
          }
          bottomBar={
            <NavigationBar containerColor={p.page}>
              {tabs.map(item => (
                <NavigationBarItem
                  key={item.key}
                  selected={tab === item.key}
                  onClick={() => setTab(item.key)}
                  icon={<Icon painter={{ icon: item.icon, style: tab === item.key ? undefined : "outlined" }} contentDescription={null} />}
                  label={<Text text={item.label} />}
                />
              ))}
            </NavigationBar>
          }
        >
          <AnimatedContent
            targetState={tab}
            modifiers={Modifier.fillMaxSize()}
            transitionSpec={{
              enter: { type: "fade", animationSpec: { type: "tween", durationMillis: 220 } },
              exit: { type: "fade", animationSpec: { type: "tween", durationMillis: 120 } },
            }}
          >
            <HomeScreen key="home" onStart={() => setTab("components")} />
            <ComponentsScreen key="components" />
            <ControlsScreen key="controls" />
            <MotionScreen key="motion" />
          </AnimatedContent>
        </Scaffold>
      </MaterialExpressiveTheme>
    </PaletteContext.Provider>
  );
}
