import { StyleSheet, Text, View } from "react-native";

import {
  Button,
  Switch,
  Modifier,
  Slider,
  Column,
} from "jetpack-compose-react-native";
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
        style={{ height: 80 }}
        modifier={Modifier.padding(10)
          .backgroundColor({ color: "red" })
          .border({ width: 1, color: "black" })}
      />
      <Switch
        checked={checked}
        onCheckedChange={(v) => {
          console.log("onCheckedChange", v);
          setChecked(v);
        }}
        modifier={Modifier.padding(10)
          .backgroundColor({ color: "red" })
          .border({ width: 1, color: "black" })}
      />
      <Slider
        value={sliderValue}
        onValueChange={(v) => {
          console.log("onValueChange", v);
          setSliderValue(v);
        }}
      />
      <Text>Slider value: {sliderValue}</Text>
      <Column
        style={{
          backgroundColor: "pink",
          width: 300,
          height: 100,
        }}
      >
        <Button text={"button text"} />
        <Text>1</Text>
        <Text>2</Text>
        <Text>3</Text>
      </Column>
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
