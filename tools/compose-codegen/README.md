# Generated Compose APIs

Import components by name from the package root.

```tsx
import { Button, Column, Modifier, Text } from "jetpack-compose-react-native";

<Column horizontalAlignment="start" modifiers={Modifier.padding(16).fillMaxWidth()}>
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
composition. To group siblings into one composition, put them under a Compose
layout such as `Column` or `Row`. Hosting happens automatically.

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

With Android SDK 35, JDK 17, Gradle 8.9, and Node 22 installed, run these commands
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
modifier overloads, native Kotlin dispatch, string unions and converters for values such as
`Alignment` and `Arrangement`, and bindings for Material color scheme factories.
KSP reads the Kotlin opt-in markers on declarations and signature types so the
generated functions can opt in to experimental APIs automatically. Consumers
build the checked-in output without running the extractor.

The component bridge supports primitives, shape and brush values, float ranges
as pairs, modifiers, callbacks, JSX children, and named composable slots.
Overloads share a component name and use the supplied props to select a
Kotlin call. For example, `<CircularProgressIndicator />` renders indeterminate
progress and `<CircularProgressIndicator progress={0.5} />` renders determinate
progress. Progress parameters that Kotlin reads through a float supplier
receive the current React prop as a native lambda.

Kotlin supplies library defaults for omitted arguments. The generator budgets
128 call forms per overload, which allows seven independently optional props
in addition to the modifier. The [coverage report](coverage.json) records every
public top-level composable in the configured packages by Kotlin signature,
including omitted props and ambiguous or shadowed call forms. It gives the
reason for each skipped or unsupported declaration.

Start a chain on `Modifier` and pass it through the `modifiers` prop.
Modifiers apply in chain order. Pass the primary value first and additional
settings in an options object. You can also pass a named arguments object to
select a Compose overload. Scoped modifiers such as `weight` need a native
parent such as `Row` or `Column`.
Supported modifier callbacks such as `clickable` use the same event bridge
as composable callbacks.

```tsx
Modifier
  .background("#f3f4f6", { in: { rect: { cornerRadius: 12 } } })
  .padding("horizontal", 16)
  .fillMaxWidth(0.9)
```

The shared bridge still owns hosting, prop serialization, callback delivery,
and React Native children. The extractor defines which Kotlin types can
cross the bridge. The runtime has small adapters for shape and brush values
and preserves the existing `backgroundColor` and `backgroundBrush` aliases. The
`modifier` prop remains available for existing callers.

## Verify

```sh
node tools/compose-codegen/generate.mjs --check
```

CI also compares the pinned Material 3 release with a newer version using
`-PcomposeMaterial3Version`. It reports API additions, removals, and status
changes and checks for JSX call forms lost beyond documented upstream changes. A Kotlin
fixture checks discovery of new overloads, public opt-in markers, and unsupported
parameter reporting.

The example app exercises nested Compose JSX, React Native children, modifiers,
height measurement, updates, and tap events. Run `npm run android:verify` from
the repository root to build the app and run the emulator check.
