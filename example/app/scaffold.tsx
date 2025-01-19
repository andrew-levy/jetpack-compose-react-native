import { StyleSheet, Text, useWindowDimensions } from "react-native";
import { Scaffold, Modifier } from "jetpack-compose-react-native";

export default function BoxesExample() {
  const { width, height } = useWindowDimensions();
  console.log("width", width);
  return (
    <Scaffold
      style={{
        width,
        height: height - 80,
      }}
      modifier={Modifier.fillMaxSize()}
    >
      <Text>Element inside a Scaffold</Text>
    </Scaffold>
  );
}

const styles = StyleSheet.create({
  header: {
    fontSize: 30,
    fontWeight: "bold",
  },
});
