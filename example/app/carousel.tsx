import { View, Text, StyleSheet, Image } from "react-native";
import {
  Card,
  Column,
  Button,
  Carousel,
  Modifier,
} from "jetpack-compose-react-native";

export default function ColumnsExample() {
  return (
    <Carousel
      style={{ height: 200, width: 400 }}
      items={[
        require("../assets/jellybean.webp"),
        require("../assets/icecream_sandwich.webp"),
        require("../assets/gingerbread.webp"),
        require("../assets/eclair.jpg"),
        require("../assets/cupcake.jpg"),
        require("../assets/donut.jpeg"),
      ]}
    />
    // <View style={styles.container}>
    //   <Carousel style={{ height: 200, width: 400 }}>
    //     {/* <Button text="Button 1" /> */}
    //     <Image
    //       source={require("../assets/gingerbread.webp")}
    //       style={{ width: 100, height: 100 }}
    //     />
    //     <Image
    //       source={require("../assets/eclair.jpg")}
    //       style={{ width: 100, height: 100 }}
    //     />
    //     <Image
    //       source={require("../assets/cupcake.jpg")}
    //       style={{ width: 100, height: 100 }}

    //       // modifier={Modifier.border({ width: 1, color: "red" })}
    //     />
    //     <Image
    //       source={require("../assets/donut.jpeg")}
    //       style={{ width: 100, height: 100 }}

    //       // modifier={Modifier.border({ width: 1, color: "blue" })}
    //     />
    //   </Carousel>
    // </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
  },
  header: {
    fontSize: 24,
    fontWeight: "bold",
    marginBottom: 20,
  },
});
