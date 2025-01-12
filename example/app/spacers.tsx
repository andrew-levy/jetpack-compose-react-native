import { View, Text, StyleSheet } from "react-native";
import { Row, Spacer } from "jetpack-compose-react-native";

export default function SpacersExample() {
  return (
    <View style={styles.container}>
      <Text style={styles.header}>Spacer Example</Text>
      <Row style={{ width: "100%" }}>
        <Text>Before Spacer</Text>
        <Spacer />
        <Text>After Spacer</Text>
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
