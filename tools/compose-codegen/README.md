# Generated Compose APIs

Import components by name from the package root.

```tsx
import { Button, Column, Text, compose } from "jetpack-compose-react-native";

<Column horizontalAlignment="start" modifiers={compose().padding(16).fillMaxWidth()}>
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

KSP discovers public composables and public `Modifier` extensions on the
pinned AndroidX classpath, including extensions for supported layout scopes. Use
`-PcomposePackages=package1,package2` or
`-PmodifierPackages=package1,package2` to change the package searches. The
generator uses the discovered declarations to emit TypeScript components and
modifier overloads, native Kotlin dispatch, and string unions and converters
for supported Compose values such as `Alignment` and `Arrangement`. Consumers
build the checked-in output without running the extractor.

The component bridge supports primitives, supported Compose values, colors,
modifiers, callbacks with zero or one primitive argument, JSX children, and
named composable slots. It selects one supported, unambiguous overload per name
and skips signatures with unsupported required parameters. It exposes up to
four optional props with the original bridge types, plus discovered value
props up to a total of seven. The
`modifiers` prop has its own slot and counts toward neither limit. The generated
calls omit unused parameters so Kotlin applies the AndroidX defaults.

Start a chain with `compose()` and pass it through the `modifiers` prop.
Modifiers apply in chain order. Pass the primary value first and additional
settings in an options object. You can also pass a named arguments object to
select a Compose overload. Scoped modifiers such as `weight` need a native
parent such as `Row` or `Column`.
Supported modifier callbacks such as `clickable` use the same event bridge
as composable callbacks.

```tsx
compose()
  .background("#f3f4f6", { in: { rect: { cornerRadius: 12 } } })
  .padding("horizontal", 16)
  .fillMaxWidth(0.9)
```

The shared bridge still owns hosting, prop serialization, callback delivery,
and React Native children. The extractor defines which Kotlin types can
cross the bridge. The runtime has small adapters for shape and brush values
and preserves the existing `backgroundColor` and `backgroundBrush` aliases. The
`Modifier` singleton and `modifier` prop remain available for existing callers.

## Verify

```sh
node tools/compose-codegen/generate.mjs --check
```

The example app exercises nested Compose JSX, React Native children, modifiers,
height measurement, updates, and tap events. Run `npm run android:verify` from
the repository root to build the app and run the emulator check.
