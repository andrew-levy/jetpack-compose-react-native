import { ScrollView, StyleSheet, Text, View } from "react-native";
import { HorizontalDivider, Column } from "jetpack-compose-react-native";

export default function DividersExample() {
  return (
    <ScrollView style={{ flex: 1 }} contentContainerStyle={{ padding: 20 }}>
      <Text style={styles.header}>Dividers Example</Text>
      <Column style={{ height: 300 }}>
        <Text>Item 1</Text>
        <HorizontalDivider />
        <Text>Item 2</Text>
        <HorizontalDivider />
      </Column>
    </ScrollView>
  );
}

const styles = StyleSheet.create({
  header: {
    fontSize: 30,
    fontWeight: "bold",
    marginVertical: 20,
  },
});
