import { ScrollView, StyleSheet, Text } from "react-native";
import { Grid } from "jetpack-compose-react-native";

export default function GridsExample() {
  return (
    <ScrollView style={{ flex: 1 }} contentContainerStyle={{ padding: 20 }}>
      <Text style={styles.header}>Grids Example</Text>
      <Text style={[styles.header, { fontSize: 24 }]}>LazyVerticalGrid</Text>
      {/* vertical grid it's by default */}
      <Grid gridCellsType="fixed" size={5}>
        {Array.from({ length: 50 }).map((_, index) => (
          <Text key={index}>{index}</Text>
        ))}
      </Grid>

      <Text style={[styles.header, { fontSize: 24 }]}>
        LazyVerticalStaggeredGrid
      </Text>
      {/* vertical staggered grid it's by default */}
      <Grid staggered spacedBy={5}>
        {Array.from({ length: 30 }).map((_, index) => (
          <Text key={index}>{index}</Text>
        ))}
      </Grid>

      <Text style={[styles.header, { fontSize: 24 }]}>LazyHorizontalGrid</Text>
      <Grid horizontal gridCellsType="adaptive">
        {Array.from({ length: 30 }).map((_, index) => (
          <Text key={index}>{index}</Text>
        ))}
      </Grid>

      <Text style={[styles.header, { fontSize: 24 }]}>
        LazyHorizontalStaggeredGrid
      </Text>
      <Grid horizontal staggered spacedBy={5} style={{ height: 150 }}>
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
