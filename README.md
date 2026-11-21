# Jetpack Compose React Native

Use native Jetpack Compose and Material 3 components from TypeScript in your
React Native Android app. The library generates component and modifier bindings
from AndroidX, and a top-level Compose component hosts its subtree automatically.

## Quick start

Install the package or a checkout of this repository in a React Native 0.74.5
app with the New Architecture enabled, Android compile SDK 35, AGP 8.6.1,
and Kotlin 2.0.21 with the matching Compose compiler Gradle plugin. Add
`org.jetbrains.kotlin:compose-compiler-gradle-plugin:2.0.21` to the root
Android buildscript classpath, then rebuild Android. React Native
autolinks the view managers and Fabric descriptors.

```tsx
import { Pressable, Text as RNText } from "react-native";
import { Button, Column, Modifier, Text } from "jetpack-compose-react-native";

export function Greeting() {
  return (
    <Column
      modifiers={Modifier
        .background("#ede5fc", { in: { rect: { cornerRadius: 16 } } })
        .padding("all", 16)}
    >
      <Text text="Hello from Compose" />
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

Generated components accept the `modifiers` prop, and chains start with
`Modifier`. Modifier order matters. For example, putting `background` before
`padding` paints the padded area. See the [code generation guide](tools/compose-codegen/README.md)
for package discovery, supported argument types, and regeneration.

## Customize the theme

Wrap a Compose subtree in `MaterialTheme` and pass a Material 3 color scheme.
Theme values apply to Material components inside that subtree.

```tsx
import { useColorScheme } from "react-native";
import { Button, MaterialTheme, Text, darkColorScheme, lightColorScheme } from "jetpack-compose-react-native";

const light = lightColorScheme({ primary: "#005e54", onPrimary: "#ffffff" });
const dark = darkColorScheme({ primary: "#80d5c6", onPrimary: "#003730" });

function ThemedButton() {
  const colors = useColorScheme() === "dark" ? dark : light;
  return (
    <MaterialTheme colorScheme={colors}>
      <Button onClick={() => console.log("Continue")}>
        <Text text="Continue" />
      </Button>
    </MaterialTheme>
  );
}
```

`MaterialTheme` can be the root of a Compose subtree or nested inside one.
Omit `colorScheme` to inherit the parent palette or use the native defaults.

Use `MaterialExpressiveTheme` to apply the native Material 3 Expressive palette
and motion defaults to the same components. The wrapper opts into the
experimental Material 3 API on Android.

```tsx
import { Button, MaterialExpressiveTheme, Text } from "jetpack-compose-react-native";

<MaterialExpressiveTheme>
  <Button onClick={() => console.log("Continue")}>
    <Text text="Continue" />
  </Button>
</MaterialExpressiveTheme>
```

## Compose Gallery

Use the tabs in the [example app](example/App.tsx) to spot-check generated bindings.

| Tab | What to try |
| --- | --- |
| **Components** | Switch between buttons, inputs, surfaces, and progress. Try the two slider thumbs, tabs, chips, and both text field styles. |
| **Modifiers** | Swap chain order and compare gradients, borders, clipping, shadows, size, offset, layering, and scoped weight. |
| **Overlays** | Open the bottom sheet or alert dialog. Choose a dropdown action, then undo it in the snackbar. |
| **Interop** | Tap either button to insert or remove a React Native child in a Compose layout. |
| **Expressive** | Compare the standard spinner and Expressive morphing indicator side by side. |

The **Compose Bridge** workflow publishes screenshots and individual GIFs in the
`compose-gallery-previews` artifact. [Gallery workflow](https://github.com/andrew-levy/jetpack-compose-react-native/actions/workflows/compose-bridge.yml)

### Run the gallery

Use Node 22, JDK 17, and an API 34 emulator or Android device. With the Android
SDK command-line tools installed and `ANDROID_HOME` set, install the required
packages.

```sh
sdkmanager "platform-tools" "platforms;android-35" "build-tools;34.0.0" "build-tools;35.0.0" \
  "ndk;26.1.10909125" "cmake;3.22.1"
```

Start the emulator or connect a device, then run these commands from the
repository root.

```sh
adb devices
npm ci
npm run android
```

The command builds, installs, and launches the gallery. Set `ANDROID_SERIAL`
when multiple devices are connected. With Python 3 installed,
`npm run android:verify` also checks gallery navigation, modifier order, and
mixed Compose and React Native interactions on the device.
