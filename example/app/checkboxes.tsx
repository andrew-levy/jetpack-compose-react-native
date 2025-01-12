import { View, Text, StyleSheet } from "react-native";
import { Checkbox } from "jetpack-compose-react-native";
import { useState } from "react";

export default function CheckboxesExample() {
  const [checked, setChecked] = useState(true);

  return (
    <View style={styles.container}>
      <Text style={styles.header}>Checkbox Example</Text>
      <Checkbox
        checked={checked}
        onCheckedChange={(v) => {
          console.log("onCheckedChange", v);
          setChecked(v);
        }}
      />
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
