import React from "react";
import { ScrollView, StyleSheet, View, Text } from "react-native";
import { BottomSheet, Column } from "jetpack-compose-react-native";

export default function DialogsExample() {
  return (
    <ScrollView style={{ flex: 1 }} contentContainerStyle={{ padding: 20 }}>
      <Text style={styles.header}>BottomSheet Example</Text>
      <BottomSheet onDismiss={() => console.log("BottomSheet dismissed")}>
        <View>
          <Text style={styles.title}>Hello I'm a BottomSheet</Text>
          <Text style={styles.title}>Hello I'm a BottomSheet</Text>
          <Text style={styles.title}>Hello I'm a BottomSheet</Text>
        </View>
      </BottomSheet>
    </ScrollView>
  );
}

const styles = StyleSheet.create({
  header: {
    fontSize: 30,
    fontWeight: "bold",
    marginVertical: 20,
  },
  title: {
    fontSize: 32,
    fontWeight: "500",
  },
});
