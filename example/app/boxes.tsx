import { ScrollView, StyleSheet, Text } from "react-native";
import { Box, Icon, Modifier } from "jetpack-compose-react-native";

export default function BoxesExample() {
  return (
    <ScrollView style={{ flex: 1 }} contentContainerStyle={{ padding: 20 }}>
      <Text style={styles.header}>Boxes Example</Text>
      <Box contentAlignment="center" modifier={Modifier.fillMaxWidth()}>
        <Text>Centered Box</Text>
        <Icon
          name="home"
          theme="filled"
          contentDescription="notifications icon"
        />
      </Box>
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
