# Generated Compose components

On Android, render generated Jetpack Compose components in a shared composition. The
`Generated` namespace exposes the generated API on the existing package entry point.

```tsx
import { ComposeHost, Generated, Modifier } from "jetpack-compose-react-native";

<ComposeHost fitContent>
  <Generated.Column modifier={Modifier.padding(16)}>
    <Generated.Text text="Hello Compose" />
    <Generated.Button onClick={() => console.log("Clicked")}>
      <Generated.Text text="Tap me" />
    </Generated.Button>
  </Generated.Column>
</ComposeHost>
```

React reconciles the JSX and mounts native nodes through the Expo view managers. The
host owns one `ComposeView`. It renders the mounted tree with the generated Kotlin
dispatcher. React keys preserve nodes through updates, and native callbacks dispatch
through the corresponding React Native view. Use `fitContent` to report native
content height back to Yoga. By default the host fills the space allocated by Yoga,
and the `style` prop controls the outer React Native view. A bounded host width is
required when fitting content.

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
