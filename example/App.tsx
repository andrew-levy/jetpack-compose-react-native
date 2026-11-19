import { useState } from "react";
import { Pressable, StyleSheet, Text as ReactNativeText, View } from "react-native";
import { Button, Column, Modifier, Row, Text } from "jetpack-compose-react-native";

function Status({ clicks, onClick }: { clicks: number; onClick: () => void }) {
  return <Text text={clicks ? `Tapped ${clicks}` : "Ready"} modifier={Modifier.clickable(onClick)} />;
}

export default function App() {
  const [clicks, setClicks] = useState(0);
  const onClick = () => setClicks((value) => value + 1);

  return (
    <View style={styles.screen}>
      <Column
        horizontalAlignment="start"
        modifier={Modifier.background({ color: "#f3f4f6", shape: { radius: 12 } }).padding(16)}
      >
        <Status clicks={clicks} onClick={onClick} />
        <Row>
          <Button modifier={Modifier.align("centerVertically")} onClick={onClick}>
            <Text text="Tap Compose" />
          </Button>
          <View style={styles.reactChild}>
            <Pressable accessibilityRole="button" onPress={onClick}>
              <ReactNativeText>Tap React Native</ReactNativeText>
            </Pressable>
          </View>
        </Row>
        {clicks % 2 === 0 ? (
          <Text key="first" text="Even click count" />
        ) : (
          <Text key="second" text="Odd click count" />
        )}
        {clicks % 2 === 1 && <ReactNativeText>Added by React</ReactNativeText>}
      </Column>
      <ReactNativeText>Below Compose</ReactNativeText>
      <Text text="Fixed height Compose" style={styles.fixedRoot} />
    </View>
  );
}

const styles = StyleSheet.create({
  screen: { flex: 1, backgroundColor: "#fff" },
  fixedRoot: { height: 48 },
  reactChild: { padding: 12 },
});
