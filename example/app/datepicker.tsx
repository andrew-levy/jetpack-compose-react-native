import React from "react";
import { ScrollView, StyleSheet, Text } from "react-native";
import { Legacy } from "jetpack-compose-react-native";

const { Button, DatePicker } = Legacy;

export default function DialogsExample() {
  const [datePickerVisible, setDatePickerVisible] = React.useState(false);

  return (
    <ScrollView style={{ flex: 1 }} contentContainerStyle={{ padding: 20 }}>
      <Text style={styles.header}>Datepickers Example</Text>
      {datePickerVisible && (
        <DatePicker
          showModeToggle
          confirmText="Confirm"
          dismissText="Cancel"
          onDismiss={() => setDatePickerVisible(!datePickerVisible)}
        />
      )}
      <Button
        text="Show DatePicker"
        onClick={() => {
          setDatePickerVisible(true);
        }}
      />
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
