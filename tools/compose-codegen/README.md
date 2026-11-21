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
node tools/compose-codegen/pipeline.mjs
```

The pipeline reads the Kotlin metadata and JVM annotations of the resolved AndroidX Compose
artifacts. It finds their packages automatically and checks KSP's inventory of public
composables and public `Modifier` extensions against those binaries, including overloads
and public member declarations. Missing entries or mismatched coverage fail the run.
Use `-PcomposePackages=package.one.*,package.two` or `-PmodifierPackages=package.one` to
select a package tree or an exact package. Discovery is driven by the pinned Gradle classpath.

KSP records declarations, nested types, defaults, and opt-ins. The generator stages Kotlin
calls and compiles them with the Compose compiler and the production value decoders before
writing Kotlin dispatch and TypeScript exports from the same manifest. Failed candidates
leave their source and compiler diagnostics under `tools/compose-codegen/build/`.
Consumers build the checked-in output without running the extractor.

The component bridge supports primitives, shape and brush values, float ranges
as pairs, modifiers, callbacks, JSX children, and named composable slots.
Overloads share a component name and use the supplied props to select a
Kotlin call. For example, `<CircularProgressIndicator />` renders indeterminate
progress and `<CircularProgressIndicator progress={0.5} />` renders determinate
progress. Progress parameters that Kotlin reads through a float supplier
receive the current React prop as a native lambda.

Kotlin supplies library defaults for omitted arguments. The generator preserves
established call forms. It limits the number of new default-argument combinations for
wide signatures, combining each new prop with the core props and considering the full
call. The report counts the remaining combinations. Large Kotlin dispatch tables are
written in separate source files to bound the compiler's work per file.
Compose and modifier signatures each have an outcome in [coverage.json](coverage.json),
including unsupported bridges, omitted props, and ambiguous or shadowed argument forms.

Structured props such as `contentPadding` and `windowInsets` take numbers in dp.
`Image`, `Icon`, and `Modifier.paint` can read a plain color or a drawable from the
application's Android `res/drawable` resources. For example, use
`painter={{ drawable: "hero" }}` for `res/drawable/hero.xml` or a packaged bitmap.

Lazy lists and grids treat each direct child as an item, and pagers treat each
direct child as a page. Use React keys for stable item identity and give scrolling
containers a bounded size on their scroll axis. Compose lazily renders items from
the existing React child tree. Grid cells can use `{ count: 2 }` or `{ minSize: 140 }`
with the minimum size in dp.

`BoxWithConstraints` accepts native Compose and React Native children. The scaffold
bindings automatically apply the content padding passed by Compose. State props
such as `DatePicker`'s `state`, `LazyColumn`'s `state`, and `ModalBottomSheet`'s
`sheetState` initialize state owned by Compose. Pass a new React key to reset that
state. Use an existing controlled overload when you need to observe or drive its
value in JavaScript. The layout and focus callbacks deliver serializable snapshots.
Layout dimensions and positions relative to the Compose root use physical pixels.

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
node tools/compose-codegen/pipeline.mjs --check
```

CI independently checks discovery, compiles candidate bindings, and compares
[api-surface.json](api-surface.json) with the base commit to catch lost call forms. A
second run compares the pinned Material 3 release with the configured upgrade fixture.
The example app exercises nested Compose JSX, React Native children, modifiers,
height measurement, updates, and tap events. Run `npm run android:verify` from
the repository root to build the app and run the emulator checks.
