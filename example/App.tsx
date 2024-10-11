import { ScrollView, StyleSheet, Text, View } from "react-native";
import {
  Button,
  Switch,
  Modifier,
  Slider,
  Column,
  Icon,
  ProgressIndicator,
} from "jetpack-compose-react-native";
import React, { useEffect } from "react";

export default function App() {
  const [count, setCount] = React.useState(0);
  const [checked, setChecked] = React.useState(true);
  const [sliderValue, setSliderValue] = React.useState(0.5);
  const [progress, setProgress] = React.useState(0.5);

  return (
    <ScrollView
      style={{ flex: 1 }}
      contentContainerStyle={{
        padding: 20,
      }}
    >
      <Text
        style={[
          styles.header,
          {
            fontSize: 30,
            marginVertical: 20,
          },
        ]}
      >
        Jetpack Compose React Native
      </Text>
      {/* Button Section */}
      <Text style={styles.header}>Button</Text>
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

      {/* Switch Section */}
      <Text style={styles.header}>Switch</Text>
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

      {/* Slider Section */}
      <Text style={styles.header}>Slider</Text>
      <Slider
        value={sliderValue}
        onValueChange={(v) => {
          console.log("onValueChange", v);
          setSliderValue(v);
        }}
      />
      <Text>Slider value: {sliderValue}</Text>

      {/* Column Section */}
      <Text style={styles.header}>Column</Text>
      <Column
        style={{
          backgroundColor: "pink",
          width: 300,
          height: 100,
        }}
      >
        <Button
          text={"button text"}
          onClick={() => {
            console.log("button clicked");
          }}
        />
        <Text>1</Text>
        <Text>2</Text>
        <Text>3</Text>
      </Column>

      {/* Icon Section */}
      <Text style={styles.header}>Icon</Text>
      <View style={{ flexDirection: "row" }}>
        <Icon
          name="shopping_cart"
          theme="round"
          contentDescription="home icon"
        />
        <Icon name="home" theme="outlined" contentDescription="home icon" />
        <Icon
          name="bug_report"
          theme="two-tone"
          contentDescription="home icon"
        />
        <Icon name="favorite" theme="sharp" contentDescription="home icon" />
        <Icon name="settings" theme="filled" contentDescription="home icon" />
      </View>

      {/* Placeholder sections for unimplemented components */}
      <Text style={styles.header}>Progress Indicator</Text>
      <Button
        text="Increment Progress"
        onClick={() => {
          setProgress(progress + 0.1);
        }}
      />
      <View
        style={{
          flexDirection: "row",
          justifyContent: "space-around",
          alignItems: "center",
          marginVertical: 10,
        }}
      >
        <ProgressIndicator progress={progress} />
        <ProgressIndicator progress={progress} variant="linear" />
      </View>

      <Text style={styles.header}>Floating Action Button</Text>
      <Text style={styles.header}>Text Field</Text>
      <Text style={styles.header}>Text</Text>
      <Text style={styles.header}>Chip</Text>
      <Text style={styles.header}>Card</Text>
      <Text style={styles.header}>Dialog</Text>
      <Text style={styles.header}>Bottom Sheet</Text>
      <Text style={styles.header}>Snackbar</Text>
      <Text style={styles.header}>Checkbox</Text>
      <Text style={styles.header}>Badge</Text>
      <Text style={styles.header}>Time/Date Picker</Text>
      <Text style={styles.header}>LazyColumn</Text>
      <Text style={styles.header}>LazyRow</Text>
      <Text style={styles.header}>LazyGrid</Text>
      <Text style={styles.header}>Row</Text>
      <Text style={styles.header}>Grid</Text>
      <Text style={styles.header}>Box</Text>
      <Text style={styles.header}>Dividers</Text>
      <Text style={styles.header}>Spacer</Text>
    </ScrollView>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: "#fff",
    alignItems: "center",
    justifyContent: "center",
  },
  header: {
    fontSize: 20,
    fontWeight: "bold",
    marginVertical: 10,
  },
});
