import { StyleSheet, Text, View } from "react-native";

import { Button, Switch, Modifier } from "jetpack-compose-react-native";
import React, { useEffect } from "react";

export default function App() {
  const [count, setCount] = React.useState(0);
  const [checked, setChecked] = React.useState(false);

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
        onCheckedChange={() => setChecked(!checked)}
        modifier={Modifier.padding(40)}
      />
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
