import { View, Text, StyleSheet } from "react-native";
import { Switch, Modifier } from "jetpack-compose-react-native";
import { useState } from "react";

export default function SwitchesExample() {
  const [checked, setChecked] = useState(true);

  return (
    <View style={styles.container}>
      <Text style={styles.header}>Switch Example</Text>
      <Switch
        checked={checked}
        onCheckedChange={(v) => {
          console.log("onCheckedChange", v);
          setChecked(v);
        }}
        style={{
          width: 200,
          height: 100,
        }}
        modifier={Modifier.shadow({
          ambientColor: "black",
          elevation: 5,
          shape: "rectangle",
          spotColor: "black",
        }).border({ width: 1, color: "green" })}
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
