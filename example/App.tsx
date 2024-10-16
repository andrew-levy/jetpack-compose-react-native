import { FlatList, ScrollView, StyleSheet, Text, View } from "react-native";
import {
  Button,
  Switch,
  Modifier,
  Slider,
  Column,
  Icon,
  ProgressIndicator,
  Row,
  Checkbox,
  Card,
  Spacer,
  Chip,
} from "jetpack-compose-react-native";
import React, { useEffect } from "react";

export default function App() {
  const [count, setCount] = React.useState(0);
  const [checked, setChecked] = React.useState(true);
  const [sliderValue, setSliderValue] = React.useState(0.5);
  const [progress, setProgress] = React.useState(0.5);
  const [filterChipSelected, setFilterChipSelected] = React.useState(false);
  const [inputChipSelected, setInputChipSelected] = React.useState(false);

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
      <View style={{ flexDirection: "row" }}>
        <View style={{ flex: 1, gap: 10 }}>
          <Button
            text="Default"
            onClick={() => {
              setCount(count + 1);
            }}
          />
          <Button
            text="Outlined"
            onClick={() => {
              setCount(count + 1);
            }}
            variant="outlined"
          />
          <Button
            text="Text"
            onClick={() => {
              setCount(count + 1);
            }}
            variant="text"
          />
        </View>
        <View style={{ flex: 1, gap: 10 }}>
          <Button
            text="Elevated"
            onClick={() => {
              setCount(count + 1);
            }}
            variant="elevated"
          />
          <Button
            text="Filled Tonal"
            onClick={() => {
              setCount(count + 1);
            }}
            variant="filled-tonal"
          />

          <Button
            text="Floating Action"
            onClick={() => {
              setCount(count + 1);
            }}
            variant="floating-action"
            modifier={Modifier.padding(5)}
          />
        </View>
      </View>
      <Text>Button clicked {count} times</Text>

      {/* Switch Section */}
      <Text style={styles.header}>Switch</Text>
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
      <Column>
        <Text>1</Text>
        <Text>2</Text>
        <Text>3</Text>
      </Column>

      {/* Row Section */}
      <Text style={styles.header}>Row</Text>
      <Row style={{ height: 50 }}>
        <Text>1</Text>
        <Text>2</Text>
        <Text>3</Text>
      </Row>

      {/* Icon Section */}
      <Text style={styles.header}>Icon</Text>
      <View style={{ flexDirection: "row" }}>
        <Icon
          name="bug_report"
          theme="two-tone"
          contentDescription="home icon"
        />
        <Icon
          name="shopping_cart"
          theme="rounded"
          contentDescription="home icon"
        />
        <Icon name="home" theme="outlined" contentDescription="home icon" />
        <Icon name="favorite" theme="sharp" contentDescription="home icon" />
        <Icon name="settings" theme="filled" contentDescription="home icon" />
      </View>

      {/* Placeholder sections for unimplemented components */}
      <Text style={styles.header}>Progress Indicator</Text>
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
      <View
        style={{
          gap: 10,
          marginVertical: 10,
        }}
      >
        <ProgressIndicator progress={progress} />
        <ProgressIndicator progress={progress} variant="linear" />
      </View>

      <Text style={styles.header}>Checkbox</Text>
      <Checkbox
        checked={checked}
        onCheckedChange={(v) => {
          console.log("onCheckedChange", v);
          setChecked(v);
        }}
      />
      <Text style={styles.header}>Card</Text>
      <Card
        variant="elevated"
        modifier={Modifier.padding(10)}
        style={{
          width: 200,
          height: 100,
        }}
      >
        <Text>Elevated Card Content</Text>
        <Button text="Click me" />
      </Card>
      <Card
        variant="filled"
        style={{
          width: 200,
          height: 100,
        }}
      >
        <Text>Filled Card Content</Text>
        <Button text="Click me" />
      </Card>
      <Card
        variant="outlined"
        style={{
          width: 200,
          height: 100,
        }}
      >
        <Text>Outlined Card Content</Text>
        <Button text="Click me" />
      </Card>

      <Text style={styles.header}>Spacer</Text>
      <Row
        modifier={Modifier.fillMaxWidth()}
        style={{
          width: "100%",
        }}
      >
        <Text>Before Spacer</Text>
        <Spacer modifier={Modifier.width(100)} />
        <Text>After Spacer</Text>
      </Row>
      <Text style={styles.header}>Chip</Text>
      <Chip
        variant="assist"
        labelText="Assist"
        leadingIcon="person"
        trailingIcon="close"
      />
      <Chip
        variant="input"
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

      <Text style={styles.header}>Text Field</Text>
      <Text style={styles.header}>Text</Text>
      <Text style={styles.header}>Dialog</Text>
      <Text style={styles.header}>Bottom Sheet</Text>
      <Text style={styles.header}>Snackbar</Text>
      <Text style={styles.header}>Badge</Text>
      <Text style={styles.header}>Time/Date Picker</Text>
      <Text style={styles.header}>LazyColumn</Text>
      <Text style={styles.header}>LazyRow</Text>
      <Text style={styles.header}>LazyGrid</Text>
      <Text style={styles.header}>Grid</Text>
      <Text style={styles.header}>Box</Text>
      <Text style={styles.header}>Dividers</Text>
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
