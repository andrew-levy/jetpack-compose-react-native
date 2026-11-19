import { useState } from "react";
import { StyleSheet, Text as ReactNativeText, View } from "react-native";
import { Button, Column, Modifier, Row, Text } from "jetpack-compose-react-native";

function Status({ clicks }: { clicks: number }) {
  return <Text text={clicks ? `Tapped ${clicks}` : "Ready"} />;
}

export default function GeneratedComposeScreen() {
  const [clicks, setClicks] = useState(0);

  return (
    <View style={styles.screen}>
      <Column modifier={Modifier.padding(16)}>
        <Status clicks={clicks} />
        <Row>
          <Button onClick={() => setClicks(clicks + 1)}>
            <Text text="Tap Compose" />
          </Button>
        </Row>
        {clicks % 2 === 0 ? (
          <Text key="first" text="Even click count" />
        ) : (
          <Text key="second" text="Odd click count" />
        )}
        {clicks % 2 === 1 && <Text text="Added by React" />}
      </Column>
      <ReactNativeText>Below Compose</ReactNativeText>
      <Text text="Fixed height Compose" style={styles.fixedRoot} />
    </View>
  );
}

const styles = StyleSheet.create({
  screen: { flex: 1, backgroundColor: "#fff" },
  fixedRoot: { height: 48 },
});
