import { View, Text, StyleSheet } from "react-native";
import { Row } from "jetpack-compose-react-native";

export default function RowsExample() {
  return (
    <View style={styles.container}>
      <Text style={styles.header}>Row Example</Text>
      <Row style={{ height: 50 }}>
        <Text>1</Text>
        <Text>2</Text>
        <Text>3</Text>
      </Row>
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
