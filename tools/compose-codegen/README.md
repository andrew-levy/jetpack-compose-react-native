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

## Mixed children and layout

Fabric measures the Compose root using native measurement state. Compose
places embedded React Native views, and Fabric measures each React Native
subtree at the size proposed by Compose. A React component can return a
generated Compose view or an ordinary React Native view. A React Native
`View` groups its subtree into one Compose child, including when Fabric would
otherwise flatten the group.

The [root README](../../README.md#run-the-example) shows how to build and
verify the demo from a fresh checkout.

## Generate

With Android SDK 35, JDK 17, Gradle 8.9, and Node installed, run these commands
from the repository root.

```sh
gradle -p tools/compose-codegen kspDebugKotlin
node tools/compose-codegen/generate.mjs
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
node tools/compose-codegen/generate.mjs --check
```

The example app exercises nested Compose JSX, React Native children, modifiers,
height measurement, updates, and tap events. Run `npm run android:verify` from
the repository root to build the app and run the emulator check.
