import { View, Text, StyleSheet } from "react-native";
import { ProgressIndicator, Button } from "jetpack-compose-react-native";
import { useState } from "react";

export default function ProgressExample() {
  const [progress, setProgress] = useState(0.5);

  return (
    <View style={styles.container}>
      <Text style={styles.header}>Progress Indicator Example</Text>
      <Button
        text="Increment Progress"
        onClick={() => {
          if (progress > 1) {
            setProgress(0);
            return;
          }
          setProgress(progress + 0.1);
        }}
      />
      <View style={{ gap: 10, marginVertical: 10 }}>
        <ProgressIndicator progress={progress} />
        <ProgressIndicator progress={progress} variant="linear" />
      </View>
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
