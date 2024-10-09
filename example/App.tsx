import { StyleSheet, Text, View } from "react-native";

import { Button, Switch, Modifier, Slider } from "jetpack-compose-react-native";
import React, { useEffect } from "react";

export default function App() {
  const [count, setCount] = React.useState(0);
  const [checked, setChecked] = React.useState(true);
  const [sliderValue, setSliderValue] = React.useState(0.5);

  return (
    <View style={styles.container}>
      <Button
        text={"button text " + count}
        onClick={() => {
          setCount(count + 1);
        }}
      />
      <Switch
        checked={checked}
        onCheckedChange={(v) => {
          console.log("onCheckedChange", v);
          setChecked(v);
        }}
        modifier={Modifier.padding(10)}
      />
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
    backgroundColor: "#fff",
    alignItems: "center",
    justifyContent: "center",
  },
});
