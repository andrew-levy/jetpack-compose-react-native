import { View, Text, StyleSheet } from "react-native";
import { Image, Modifier } from "jetpack-compose-react-native";

export default function IconsExample() {
  return (
    <View style={styles.container}>
      <Image
        source={require("../assets/gingerbread.webp")}
        style={{ width: 100, height: 100 }}
      />
      <Image
        source={require("../assets/eclair.jpg")}
        modifier={Modifier.border({ width: 1, color: "green" })}
        style={{ width: 100, height: 100 }}
      />
      <Image
        source={require("../assets/cupcake.jpg")}
        modifier={Modifier.border({
          width: 1,
          color: "rgba(247, 12, 28, 0.5)",
        })}
        style={{ width: 100, height: 100 }}
      />
      <Image
        source={require("../assets/donut.jpeg")}
        modifier={Modifier.border({ width: 1, color: "blue" })}
        style={{ width: 100, height: 100 }}
      />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    padding: 20,
  },
  header: {
    fontSize: 24,
    fontWeight: "bold",
    marginBottom: 20,
  },
});
