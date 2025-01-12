import { View, Text, StyleSheet } from "react-native";
import { Slider } from "jetpack-compose-react-native";
import { useState } from "react";

export default function SlidersExample() {
  const [sliderValue, setSliderValue] = useState(0.5);

  return (
    <View style={styles.container}>
      <Text style={styles.header}>Slider Example</Text>
      <Slider
        value={sliderValue}
        onValueChange={(v) => {
          console.log("onValueChange", v);
          setSliderValue(v);
        }}
      />
      <Text>Slider value: {sliderValue}</Text>
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
