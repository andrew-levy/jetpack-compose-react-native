import { View, Text, StyleSheet } from "react-native";
import { Icon } from "jetpack-compose-react-native";

export default function IconsExample() {
  return (
    <View style={styles.container}>
      <Text style={styles.header}>Icon Example</Text>
      <View style={{ flexDirection: "row" }}>
        <Icon
          name="bug_report"
          theme="two-tone"
          contentDescription="bug icon"
        />
        <Icon
          name="shopping_cart"
          theme="rounded"
          contentDescription="cart icon"
        />
        <Icon name="home" theme="outlined" contentDescription="home icon" />
        <Icon
          name="favorite"
          theme="sharp"
          contentDescription="favorite icon"
        />
        <Icon
          name="settings"
          theme="filled"
          contentDescription="settings icon"
        />
      </View>
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
