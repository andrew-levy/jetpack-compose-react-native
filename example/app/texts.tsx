import { ScrollView, StyleSheet, Text } from "react-native";
import { Text as JetpackText, Modifier } from "jetpack-compose-react-native";
import React from "react";

export default function TextsExample() {
  const [text, setText] = React.useState("Hello");

  return (
    <ScrollView style={{ flex: 1 }} contentContainerStyle={{ padding: 20 }}>
      <Text style={styles.header}>Texts Example</Text>
      <JetpackText
        color="blue"
        fontWeight="bold"
        textDecoration="lineThrough"
        fontSize={20}
        textAlign="right"
        modifier={Modifier.alpha(1).border({ color: "red", width: 1 })}
      >
        {text}
      </JetpackText>
    </ScrollView>
  );
}

const styles = StyleSheet.create({
  header: {
    fontSize: 30,
    fontWeight: "bold",
    marginVertical: 20,
  },
});
