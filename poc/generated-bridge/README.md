# Generated Compose components

Import components by name from the package root.

```tsx
import { Button, Column, Modifier, Text } from "jetpack-compose-react-native";

<Column modifier={Modifier.padding(16)}>
  <Text text="Hello Compose" />
  <Button onClick={() => console.log("Clicked")}>
    <Text text="Tap me" />
  </Button>
</Column>
```

Each top-level generated component creates one Android `ComposeView`. Generated
descendants, including those returned by React components, render in that same
composition. The root fits its native content height at the available React
Native width. An explicit height or growing flex style on the root lets React
Native allocate its height. Use a Compose `modifier` for layout inside the
composition. The optional `ComposeHost` export can group multiple roots in one
composition.

For the original component props, import `Legacy` from the package root and use
components such as `Legacy.Button` and `Legacy.Text`. Names exclusive to the
original API, such as `Grid` and `Slider`, are also available as named imports.

## Run the Android example

Use Node 22, JDK 17, and an Android emulator. In Android Studio's SDK Manager,
install Android SDK Platform 34, Build-Tools 34.0.0, Platform-Tools,
NDK 26.1.10909125, and CMake 3.22.1. Set `ANDROID_HOME` to your Android SDK
directory, add its `platform-tools` directory to `PATH`, and start one emulator.

From a fresh checkout of the branch, run:

```sh
git clone --branch poc/generated-compose-bridge https://github.com/andrew-levy/jetpack-compose-react-native.git
cd jetpack-compose-react-native

npm install --ignore-scripts --legacy-peer-deps --package-lock=false
npm --prefix example install --legacy-peer-deps --package-lock=false
ln -s ../example/node_modules/react-native node_modules/react-native
ln -s ../example/node_modules/react node_modules/react
npm run build

abi="$(adb shell getprop ro.product.cpu.abi | tr -d '\r')"
example/android/gradlew -p example/android :app:assembleRelease \
  -PnewArchEnabled=true -PreactNativeArchitectures="$abi"
adb install -r example/android/app/build/outputs/apk/release/app-release.apk
```

Open the example app, select **Generated-compose**, and tap **Tap Compose**
twice. The label advances from **Ready** to **Tapped 1** and **Tapped 2**. A
child appears after the first tap and is removed after the second. The
**Below Compose** label moves down and back as the native content height changes.

Run the same automated check as CI with the emulator still running:

```sh
python3 poc/generated-bridge/check-emulator.py
```

## Generate

With Android SDK 35, JDK 17, Gradle 8.9, and Node installed, run these commands
from the repository root.

```sh
gradle -p poc/generated-bridge/android-smoke kspDebugKotlin
node poc/generated-bridge/generate.mjs
```

KSP discovers public composables in the Foundation Layout and Material 3 packages
on the pinned AndroidX classpath. Pass `-PcomposePackages=package1,package2` to
change the package search. The generator consumes the manifest emitted by KSP and
writes the TypeScript wrappers and Kotlin dispatcher used by the package. Generated
source is checked in so consumers can build the library without running the extractor.

The type mapping covers strings, booleans, numbers, Dp, Sp, colors, the package's
`Modifier` builder, and callbacks with zero or one primitive argument. Supported
`content` lambdas map to JSX children. Supported named composable slots take React elements as props. For optional scalar props, the generated
Kotlin applies the original Compose default when callers omit the prop. Discovery
selects one supported, unambiguous overload per name and omits signatures with
unsupported required parameters. It exposes up to four optional values per
overload in addition to the modifier. Native Android-only output can contain
generated components and React components that render them.

## Verify

```sh
node poc/generated-bridge/generate.mjs --check
```

The `generated-compose` route in the example app exercises nested generated JSX,
a React child component, modifiers, height measurement, updates and tap events.
The workflow builds the example with Fabric enabled and uses
`poc/generated-bridge/check-emulator.py` to open the screen from the example menu
and verify it on Android.
