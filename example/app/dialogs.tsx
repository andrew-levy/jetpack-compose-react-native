import React from "react";
import { ScrollView, StyleSheet, Text } from "react-native";
import { Button, Dialog } from "jetpack-compose-react-native";

export default function DialogsExample() {
  const [dialogVisible, setDialogVisible] = React.useState(false);

  return (
    <ScrollView style={{ flex: 1 }} contentContainerStyle={{ padding: 20 }}>
      <Text style={styles.header}>Dialogs Example</Text>
      {dialogVisible && (
        <Dialog title="Dialog Title" text="Dialog text description" />
      )}
      <Button
        text="Show Dialog"
        onClick={() => {
          setDialogVisible(true);
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
