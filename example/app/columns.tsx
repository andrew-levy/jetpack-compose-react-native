import { View, Text, StyleSheet } from "react-native";
import { Column } from "jetpack-compose-react-native";

export default function ColumnsExample() {
  return (
    <View style={styles.container}>
      <Text style={styles.header}>Column Example</Text>
      <Column>
        <Text>1</Text>
        <Text>2</Text>
        <Text>3</Text>
        <Text>4</Text>
      </Column>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    padding: 20,
  },
  header: {
    fontSize: 24,
    fontWeight: "bold",
    marginBottom: 20,
  },
});
