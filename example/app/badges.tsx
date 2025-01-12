import { View, Text, StyleSheet } from "react-native";
import { BadgedBox, Badge, Icon } from "jetpack-compose-react-native";

export default function BadgesExample() {
  return (
    <View style={styles.container}>
      <Text style={styles.header}>Badge Example</Text>
      <BadgedBox badge={<Badge content="Hello" />}>
        <Icon
          name="notifications"
          theme="filled"
          contentDescription="notifications icon"
        />
      </BadgedBox>
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
