# Jetpack Compose React Native

Render native Jetpack Compose components in a React Native Fabric app. Import
components by name. A top-level Compose component creates the native host for
its subtree automatically.

```tsx
import { Pressable, Text as RNText } from "react-native";
import { Button, Column, Modifier, Text } from "jetpack-compose-react-native";

export function Greeting() {
  return (
    <Column modifier={Modifier.padding(16)}>
      <Text text="Hello Compose" />
      <Button onClick={() => console.log("Compose clicked")}>
        <Text text="Compose button" />
      </Button>
      <Pressable onPress={() => console.log("React Native clicked")}>
        <RNText>React Native button</RNText>
      </Pressable>
    </Column>
  );
}
```

## Run the example

1. Use Node 22 and JDK 17. In Android Studio, install Android SDK Platform 34,
   Build-Tools 34.0.0, Platform-Tools, NDK 26.1.10909125, and CMake 3.22.1.
2. Set `ANDROID_HOME` to that SDK and start an Android emulator. If multiple
   devices are attached, set `ANDROID_SERIAL` to the one you want to use.
3. From a fresh checkout, run the following.

```sh
npm ci
npm run android
```

The command builds, installs, and opens the example for the selected device's
ABI. Open **Generated-compose**, tap **Tap Compose**, then tap **Tap React
Native**. The counter reaches **Tapped 2** and **Below Compose** returns to
its original position.

### Agent checklist

- Check that `node --version` is 22.x and `java -version` reports JDK 17.
- Start one Android emulator and confirm it is online with `adb devices`.
- Run `npm ci`, then `npm run build`.
- Run `npm run android:verify` with Python 3 installed. It builds and installs
  the app, opens the demo, taps both types of button, and checks the measured
  layout after a React Native child is added and removed.
- A successful run prints `Verified mixed Compose and React Native layout,
  both callbacks, and child insertion and removal.`

## Use it in a React Native app

The bridge targets React Native 0.74.5 with the New Architecture enabled.
Install the package or a checkout of this repository and rebuild the Android
app. React Native autolinking registers its view managers and Fabric
descriptors.

The [generated bridge guide](poc/generated-bridge/README.md) covers sizing,
compatibility wrappers, and regeneration from AndroidX Compose.

## Contributors

- [Oliver Lopez](https://x.com/oliverloops)
