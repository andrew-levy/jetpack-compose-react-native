import { ScrollView, StyleSheet, Text } from "react-native";
import { Grid } from "jetpack-compose-react-native";

export default function GridsExample() {
  return (
    <ScrollView style={{ flex: 1 }} contentContainerStyle={{ padding: 20 }}>
      <Text style={styles.header}>Grids Example</Text>
      <Grid gridCellsType="fixed" size={5}>
        {Array.from({ length: 30 }).map((_, index) => (
          <Text key={index}>{index}</Text>
        ))}
      </Grid>
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
