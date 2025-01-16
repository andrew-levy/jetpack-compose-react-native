import { View, Text, StyleSheet } from "react-native";
import { Button, Modifier } from "jetpack-compose-react-native";
import { useState } from "react";

export default function ButtonsExample() {
  const [count, setCount] = useState(0);

  return (
    <View style={styles.container}>
      <Text style={styles.header}>Button Examples</Text>
      <View style={{ flexDirection: "row" }}>
        <View style={{ flex: 1, gap: 10 }}>
          <Button text="Default" onClick={() => setCount(count + 1)} />
          <Button
            text="Outlined"
            onClick={() => setCount(count + 1)}
            variant="outlined"
          />
          <Button
            text="Text"
            onClick={() => setCount(count + 1)}
            variant="text"
          />
        </View>
        <View style={{ flex: 1, gap: 10 }}>
          <Button
            text="Elevated"
            onClick={() => setCount(count + 1)}
            variant="elevated"
          />
          <Button
            text="Filled Tonal"
            onClick={() => setCount(count + 1)}
            variant="filled-tonal"
          />
          <Button
            text="Floating Action"
            onClick={() => setCount(count + 1)}
            variant="floating-action"
            modifier={Modifier.padding(5)}
          />
          <Button
            style={{ height: 60 }}
            text="Extended Floating Action"
            onClick={() => setCount(count + 1)}
            variant="extended-floating-action"
          />
        </View>
      </View>
      <Text>Button clicked {count} times</Text>
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
