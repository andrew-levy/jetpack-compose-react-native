import { ScrollView, StyleSheet, View, Text } from "react-native";
import { Snackbar } from "jetpack-compose-react-native";

export default function SnackbarsExample() {
  return (
    <ScrollView style={{ flex: 1 }} contentContainerStyle={{ padding: 20 }}>
      <Text style={styles.header}>Snackbars Example</Text>
      <View style={{ backgroundColor: "gold" }}>
        <Snackbar
          message="I'm a snackbar with action"
          actionLabel="Action"
          onAction={() => console.log("Snackbar action fired")}
          onDismiss={() => console.log("Snackbar dismissed")}
        />
      </View>
      <Snackbar
        message="I'm a snackbar"
        onDismiss={() => console.log("Snackbar dismissed")}
      />
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
