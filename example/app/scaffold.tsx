import { ScrollView, StyleSheet, Text } from "react-native";
import { Scaffold, Modifier } from "jetpack-compose-react-native";

export default function BoxesExample() {
  return (
    <ScrollView style={{ flex: 1 }} contentContainerStyle={{ padding: 20 }}>
      <Text style={styles.header}>Scaffold Example</Text>
      <Scaffold modifier={Modifier.fillMaxSize()}>
        <Text>Element inside a Scaffold</Text>
      </Scaffold>
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
