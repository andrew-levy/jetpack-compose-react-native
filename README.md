# Jetpack Compose React Native

Render native Jetpack Compose components in a React Native Fabric app. Import
components by name. A top-level Compose component creates the native host for
its subtree automatically.

```tsx
import { Pressable, Text as RNText } from "react-native";
import { Button, Column, Text, compose } from "jetpack-compose-react-native";

export function Greeting() {
  return (
    <Column modifiers={compose().padding(16)}>
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
   Create an Android virtual device with an API 34 system image.
2. Set `ANDROID_HOME` to that SDK and start an Android emulator. If multiple
   devices are attached, set `ANDROID_SERIAL` to the one you want to use.
3. From a fresh checkout, run the following.

```sh
npm ci
npm run android
```

The command builds, installs, and opens the example for the selected device's
ABI. Tap **Tap Compose**, then **Tap React Native**. The counter reaches
**Tapped 2** and **Below Compose** returns to its original position. Tap
**Tapped 2** to verify the generated clickable modifier changes it to
**Tapped 3**.

### Agent checklist

On a machine with the prerequisites above, boot the emulator and run these
commands. Select an online device with `ANDROID_SERIAL` if needed.

```sh
git clone --branch poc/generated-compose-bridge https://github.com/andrew-levy/jetpack-compose-react-native.git
cd jetpack-compose-react-native
node --version
java -version
adb devices
npm ci
npm run build
npm run android:verify
```

With Python 3 installed, the verification command builds and installs the app,
opens the demo, taps both buttons, and checks that Fabric resizes the Compose
root as the React Native child is added and removed. A successful run verifies the Compose button, the React Native button, and
the generated clickable modifier.

## Use it in a React Native app

The bridge targets React Native 0.74.5 with the New Architecture enabled.
Install the package or a checkout of this repository and rebuild the Android
app. React Native autolinking registers its view managers and Fabric
descriptors.

The [code generation guide](tools/compose-codegen/README.md) covers layout and
regenerating the components from AndroidX Compose.

## Contributors

- [Oliver Lopez](https://x.com/oliverloops)
