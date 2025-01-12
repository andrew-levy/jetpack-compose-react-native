import { ScrollView, StyleSheet, Text, View } from "react-native";
import { Link } from "expo-router";

const examples = [
  "buttons",
  "switches",
  "sliders",
  "columns",
  "rows",
  "icons",
  "progress",
  "checkboxes",
  "cards",
  "spacers",
  "chips",
  "badges",
  "dividers",
  "textfields",
  "texts",
  "grids",
  "boxes",
];

export default function Home() {
  return (
    <ScrollView style={{ flex: 1 }} contentContainerStyle={{ padding: 20 }}>
      <Text style={styles.header}>Jetpack Compose React Native Examples</Text>
      {examples.map((example) => (
        <Link key={example} href={`/${example}`} style={styles.link}>
          <Text style={styles.linkText}>
            {example.charAt(0).toUpperCase() + example.slice(1)}
          </Text>
        </Link>
      ))}
    </ScrollView>
  );
}

const styles = StyleSheet.create({
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
