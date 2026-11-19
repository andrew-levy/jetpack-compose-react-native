import { useEffect, useState } from "react";
import { BackHandler, Pressable, ScrollView, StyleSheet, Text, View } from "react-native";
import GeneratedCompose from "./app/generated-compose";
import Buttons from "./app/buttons";
import Switches from "./app/switches";
import Sliders from "./app/sliders";
import Columns from "./app/columns";
import Rows from "./app/rows";
import Icons from "./app/icons";
import Progress from "./app/progress";
import Checkboxes from "./app/checkboxes";
import Cards from "./app/cards";
import Spacers from "./app/spacers";
import Chips from "./app/chips";
import Badges from "./app/badges";
import Dividers from "./app/dividers";
import Textfields from "./app/textfields";
import Texts from "./app/texts";
import Grids from "./app/grids";
import Boxes from "./app/boxes";
import Dialogs from "./app/dialogs";
import Datepicker from "./app/datepicker";
import Snackbars from "./app/snackbars";
import Images from "./app/images";
import Carousel from "./app/carousel";
import Scaffold from "./app/scaffold";
import Modifiers from "./app/modifiers";

const screens = {
  "generated-compose": GeneratedCompose,
  "buttons": Buttons,
  "switches": Switches,
  "sliders": Sliders,
  "columns": Columns,
  "rows": Rows,
  "icons": Icons,
  "progress": Progress,
  "checkboxes": Checkboxes,
  "cards": Cards,
  "spacers": Spacers,
  "chips": Chips,
  "badges": Badges,
  "dividers": Dividers,
  "textfields": Textfields,
  "texts": Texts,
  "grids": Grids,
  "boxes": Boxes,
  "dialogs": Dialogs,
  "datepicker": Datepicker,
  "snackbars": Snackbars,
  "images": Images,
  "carousel": Carousel,
  "scaffold": Scaffold,
  "modifiers": Modifiers,
} as const;

export default function App() {
  const [route, setRoute] = useState<keyof typeof screens | null>(null);

  useEffect(() => {
    const subscription = BackHandler.addEventListener("hardwareBackPress", () => {
      if (!route) return false;
      setRoute(null);
      return true;
    });
    return () => subscription.remove();
  }, [route]);

  if (route) {
    const Screen = screens[route];
    return (
      <View style={styles.screen}>
        <Pressable accessibilityRole="button" onPress={() => setRoute(null)} style={styles.link}>
          <Text style={styles.linkText}>Examples</Text>
        </Pressable>
        <Screen />
      </View>
    );
  }

  return (
    <ScrollView style={styles.screen} contentContainerStyle={{ padding: 20 }}>
      <Text style={styles.header}>Jetpack Compose React Native Examples</Text>
      {(Object.keys(screens) as (keyof typeof screens)[]).map((screen) => (
        <Pressable key={screen} accessibilityRole="button" onPress={() => setRoute(screen)} style={styles.link}>
          <Text style={styles.linkText}>{screen.charAt(0).toUpperCase() + screen.slice(1)}</Text>
        </Pressable>
      ))}
    </ScrollView>
  );
}

const styles = StyleSheet.create({
  screen: { flex: 1, backgroundColor: "#fff" },
  header: {
    fontSize: 30,
    fontWeight: "bold",
    marginVertical: 20,
  },
  link: {
    padding: 15,
    backgroundColor: "#f0f0f0",
    marginVertical: 5,
    borderRadius: 8,
  },
  linkText: {
    fontSize: 18,
  },
});
