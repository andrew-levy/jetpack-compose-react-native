import { View, Text, StyleSheet } from "react-native";
import { Chip, Modifier } from "jetpack-compose-react-native";
import { useState } from "react";

export default function ChipsExample() {
  const [filterChipSelected, setFilterChipSelected] = useState(false);
  const [inputChipSelected, setInputChipSelected] = useState(false);

  return (
    <View style={styles.container}>
      <Text style={styles.header}>Chip Example</Text>
      <Chip
        variant="assist"
        labelText="Assist"
        leadingIcon="person"
        trailingIcon="close"
        modifier={Modifier.border({ width: 1, color: "green" })}
      />
      <Chip
        variant="input"
        modifier={Modifier.border({ width: 1, color: "green" })}
        labelText="Input"
        leadingIcon={inputChipSelected ? "check" : undefined}
        selected={inputChipSelected}
        onClick={() => {
          setInputChipSelected(!inputChipSelected);
        }}
      />
      <Chip
        variant="filter"
        labelText="Filter"
        trailingIcon="box"
        selected={filterChipSelected}
        onClick={() => {
          setFilterChipSelected(!filterChipSelected);
        }}
      />
      <Chip variant="suggestion" labelText="Suggestion" />
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
