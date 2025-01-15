import { View, Text, StyleSheet } from "react-native";
import { Image, Column, Button, Modifier } from "jetpack-compose-react-native";

export default function ColumnsExample() {
  return (
    <View style={styles.container}>
      <Text style={styles.header}>Column Example</Text>
      <Column
        style={{
          height: 200,
          width: 400,
        }}
      >
        <Button text="Button 1" />
        <Button text="Button 2" />
        <Image
          source={require("../assets/gingerbread.webp")}
          modifier={Modifier.width(100).height(100)}
          style={{
            width: 50,
            height: 50,
            borderRadius: 30,
          }}
        />

        <Image
          source={require("../assets/gingerbread.webp")}
          style={{
            borderRadius: 30,
          }}
        />
        <Image
          source={require("../assets/gingerbread.webp")}
          style={{
            borderRadius: 30,
          }}
        />
        <Image
          source={require("../assets/gingerbread.webp")}
          style={{
            width: 50,
            height: 50,
            borderRadius: 30,
          }}
        />
      </Column>
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
