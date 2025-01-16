import {
  ScrollView,
  StyleSheet,
  View,
  Text,
  useWindowDimensions,
} from "react-native";
import { Snackbar, Button } from "jetpack-compose-react-native";
import { useState } from "react";

export default function SnackbarsExample() {
  const [show, setShow] = useState(false);
  const { width, height } = useWindowDimensions();
  return (
    <>
      <ScrollView style={{ flex: 1 }} contentContainerStyle={{ padding: 20 }}>
        <Text style={styles.header}>Snackbars Example</Text>
        <Button text="Show Snackbar" onClick={() => setShow(true)} />
      </ScrollView>
      <Snackbar
        style={{
          position: "absolute",
          bottom: 0,
          right: 0,
          width,
          height,
          backgroundColor: "transparent",
        }}
        message="I'm a snackbar"
        show={show}
        onDismiss={() => setShow(false)}
        onActionPerformed={() => setShow(false)}
      />
    </>
  );
}

const styles = StyleSheet.create({
  header: {
    fontSize: 30,
    fontWeight: "bold",
    marginVertical: 20,
  },
});
