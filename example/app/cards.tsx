import { View, Text, StyleSheet } from "react-native";
import { Card, Button } from "jetpack-compose-react-native";

export default function CardsExample() {
  return (
    <View style={styles.container}>
      <Text style={styles.header}>Card Example</Text>
      <Card variant="elevated" style={{ width: 200, height: 100 }}>
        <Text>Elevated Card Content</Text>
        <Button text="Click me" />
      </Card>
      <Card variant="filled" style={{ width: 200, height: 100 }}>
        <Text>Filled Card Content</Text>
        <Button text="Click me" />
      </Card>
      <Card variant="outlined" style={{ width: 200, height: 100 }}>
        <Text>Outlined Card Content</Text>
        <Button text="Click me" />
      </Card>
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
