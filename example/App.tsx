import { StyleSheet, Text, View } from 'react-native';

import * as JetpackComposeReactNative from 'jetpack-compose-react-native';

export default function App() {
  return (
    <View style={styles.container}>
      <Text>{JetpackComposeReactNative.hello()}</Text>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },
});
