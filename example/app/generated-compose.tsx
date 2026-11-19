import { useState } from "react";
import { StyleSheet, Text, View } from "react-native";
import { ComposeHost, Generated, Modifier } from "jetpack-compose-react-native";

function Status({ clicks }: { clicks: number }) {
  return <Generated.Text text={clicks ? `Tapped ${clicks}` : "Ready"} />;
}

export default function GeneratedComposeScreen() {
  const [clicks, setClicks] = useState(0);

  return (
    <View style={styles.screen}>
      <ComposeHost fitContent>
        <Generated.Column modifier={Modifier.padding(16)}>
          <Status clicks={clicks} />
          <Generated.Row>
            <Generated.Button onClick={() => setClicks(clicks + 1)}>
              <Generated.Text text="Tap Compose" />
            </Generated.Button>
          </Generated.Row>
          {clicks % 2 === 0 ? (
            <Generated.Text key="first" text="Even click count" />
          ) : (
            <Generated.Text key="second" text="Odd click count" />
          )}
          {clicks % 2 === 1 && <Generated.Text text="Added by React" />}
        </Generated.Column>
      </ComposeHost>
      <Text>Below Compose</Text>
      <ComposeHost style={styles.fixedHost}>
        <Generated.Text text="Fixed height Compose" />
      </ComposeHost>
    </View>
  );
}

const styles = StyleSheet.create({
  screen: { flex: 1, backgroundColor: "#fff" },
  fixedHost: { height: 48, flex: 0 },
});
