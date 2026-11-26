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

## Output

`generate.mjs` owns `src/generated` and removes the files it no longer writes:

| Path | Contents |
| --- | --- |
| `src/generated/components/<Name>.tsx` | Props types and runtime description of one component's overloads |
| `src/generated/components/shared.ts` | Types shared by component props |
| `src/generated/modifiers/chain.ts` | The `Modifier` chain's method signatures |
| `src/generated/modifiers/index.ts` | `Modifier` and the overload table it selects calls from |
| `src/generated/values/` | Enums, records, payload snapshots, styles, icon styles, and value factories |
| `android/.../generated/*.kt` | Kotlin renderers, decoders, and registries |

The hand-written runtime lives in `src/runtime`, and `src/utils` holds the shared bridge types.
When `COMPOSE_GENERATED_OUTPUT` is set, the same tree is written under that directory.

## Generate

With Android SDK 37.1, JDK 17, Gradle 9.4 (set `COMPOSE_GRADLE` to its `gradle` when it is not on
`PATH`), and Node 22 installed, run these commands
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
written in separate source files to bound the compiler's work per file. Wide renderers
share scalar decoders and unscoped slot lambdas across call forms. Each branch passes only the supplied
named arguments, so Kotlin still evaluates the original default expressions.
Compose and modifier signatures each have an outcome in [coverage.json](coverage.json),
including unsupported bridges, omitted props, and ambiguous or shadowed argument forms.
The extractor also reads the last generated [API surface](api-surface.json).
When a native signature gains a bridgeable parameter, it rechecks and retains
compatible published call forms before compiling the new bindings.

Structured props such as `contentPadding` and `windowInsets` take numbers in dp.
`Image`, `Icon`, and `Modifier.paint` accept a built-in Material icon, a plain color,
or an Android drawable. Use `painter={{ icon: "Edit", style: "outlined" }}` for a
built-in icon or `painter={{ drawable: "hero" }}` for `res/drawable/hero.xml`.
`Icon` and `Image` also take `imageVector={{ icon: "Edit" }}`. Every icon in
Material Icons Core and Extended works by its Kotlin name, such as `Edit` or
`_3dRotation`. Native code looks icons up by name, so the TypeScript types list
only the styles, not the icon names. Omit `style` for filled icons, or use a style
such as `autoMirroredOutlined` for directional icons that mirror in right-to-left
layouts. The library's consumer ProGuard rules keep the icon getters, so release
builds include all Material icons.

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

Use `StickyHeader` as a direct child of `LazyColumn` or `LazyRow`. The header
counts as one item for native indices. A list or grid can receive
`useLazyListState({ onStateChange })` for scroll commands and visible-item
snapshots. Use `usePagerState` with pagers and `useScrollState` with scroll
modifiers. Each control handle belongs to one scroll container. A command can
replace an in-flight command, and out-of-range positions are clamped to the
current content. Snapshots also work with plain state objects.

Modal sheets and persistent sheets accept `useModalBottomSheetState` and
`useBottomSheetScaffoldState` respectively. Observe `currentValue` to remove a
modal after its hide animation ends. Persistent sheets can hide when
`skipHiddenState` is false.

For a collapsing toolbar, call `useTopAppBarScrollBehavior("exitUntilCollapsed")`.
Pass its value to the Material top app bar's `scrollBehavior` and to
`Modifier.nestedScroll` on a parent of the scrollable content. Keep both usages
inside the same Compose host, typically a shared Compose `Column` or `Scaffold`.

`ButtonGroup`, `AppBarRow`, and `AppBarColumn` accept an `items` array for
clickable and toggleable actions. App bar items take a painter as their icon.
Compose manages overflow and shows its native menu. The optional
`overflowIndicator` React slot replaces the default icon and opens the menu
when pressed.

For styled text, pass `{ text, spans }` to an annotated-text overload of
`Text` or `BasicText`. Span ranges use UTF-16 offsets. Semantics support
`onClick` and named `customActions` that notify React when Android invokes them.
Text and text fields can report text layout size, line count, and overflow.
Visibility transitions include fade, slide, and scale. `AnimatedContent`
accepts a `transitionSpec` with an enter and exit transition.

Pass React content to `BasicTextField`'s `decorator` or `decorationBox`. Put one
`<ComposeInnerContent />` inside that content to render the native editable control.
Use React content in slider `thumb` and `track` slots. Compose positions and
handles input for the thumb, while the slider's state binding provides the
current value to React.
A state-based text field accepts a React `label` and a generated
`labelPosition` value such as `{ factory: "TextFieldLabelPosition.Above" }`.

`Modifier.pointerInput` runs a native pointer policy with an event pass and
consumption rules. Its optional `onEvent` sends a snapshot of pointer changes
with coordinates in local physical pixels. Put gesture decisions that must
consume events into the native policy so React can observe changes asynchronously.

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

The extractor follows the types reachable from discovered props. It can build
immutable values through public primary constructors and public same-name
factories, and it discovers enum cases through Kotlin metadata. A field can be a
primitive, an enum, or another constructible value. Generated TypeScript types
and Kotlin decoders share the same field definitions. For constructor fields with
defaults, omit the key to use Kotlin's default or pass `null` when the field is
nullable. The extractor rejects construction paths with cycles, ambiguous calls,
or fields requiring native owners. It also discovers supported Foundation
`StyleScope` properties from the Compose classpath.

Components can also use values made by a public Compose defaults factory. Pass
`elevation={{ factory: "ButtonDefaults.buttonElevation", defaultElevation: 3 }}`
to `Button`, for example. Kotlin supplies the factory's other defaults.

Dialogs and popups accept a `properties` object for options such as outside-tap
dismissal, back-button dismissal, and default window width. Popup properties also
include focusability and clipping. Dialog properties include the window title.

Callback arguments are derived from their Kotlin types. A Unit-returning callback
(`on*`, `*Listener`, `callback`, or `watcher`) whose arguments can be described
receives one argument as its value, or several as a typed tuple in one JavaScript
event. The extractor describes these types:

- Strings, booleans, numbers, `Dp` (as a number), and `Color` (as `#AARRGGBB`).
- Enums, as their generated case names.
- Lists and sets as arrays. `Pair`, `Triple`, and ranges as labeled tuples, such as
  `readonly [start: number, endInclusive: number]`.
- The types in [snapshots.json](snapshots.json), which have hand-written encoders.
- Other Compose classes and interfaces, as a `Compose<Type>Snapshot` object of their
  public properties. Draw, measure, and composition scopes are excluded.

For example, `SwipeToDismissBox`'s `onDismiss` receives a
`ComposeSwipeToDismissBoxValueOption`. The `finishedListener` option on
`Modifier.animateContentSize` receives `readonly [ComposeLayoutSize, ComposeLayoutSize]`
with the start and end sizes in physical pixels. To support a new type with its own
encoder, add a `toComposeSnapshot()` extension and list the type in snapshots.json.

The same payload types cross into slots that Compose calls with values. Pass React
content, or a function of the values. React renders the function once for each argument
list that Compose is composing:

```tsx
<TwoRowsTopAppBar title={(expanded) => <Text text={expanded ? "Inbox" : "In"} />} />
<TabRow selectedTabIndex={0} indicator={(positions) => <Box modifiers={Modifier.width(positions[0].width)} />} />
```

The function's content appears after React receives the arguments, one frame after
Compose first calls the slot.

Other declarations the generator follows:

- A scope is any receiver of a composable content lambda, such as
  `ExposedDropdownMenuBoxScope`. Composables and modifiers declared on it render inside
  that parent.
- A composable `Scope.(index: Int) -> Unit` slot renders children by position. When the
  same component takes `key: (Int) -> Any`, the keys come from the children's React keys.
- A value made by a public `remember*` function in the type's package uses the same
  `factory` form as `*Defaults` values. For example, pass
  `state={{ factory: "rememberScrollFieldState", itemCount: 24 }}` to `ScrollField`.
- A lambda or `fun interface` that only returns a value, such as `ColorProducer` or
  `@Composable () -> WindowInsets`, takes that value as the prop.
- A pure `(Float) -> Float | Dp | Color` mapping takes stops `[[at, value], ...]` that
  native code interpolates. Values before the first stop or after the last one are clamped.
  An `(Int) -> T` mapping takes the values by index. Any other pure mapping takes one value
  that it returns for every input, such as `systemGestureExclusion({ left: 0, top: 0, right: 48, bottom: 800 })`.
- A snapshot object carries a `$handle`. A prop of the same type takes the snapshot back, and
  native code passes the original object:
  `snackbar={(data) => <Snackbar snackbarData={data} />}`.
- `CompositionLocalProvider` provides any public `Local*` whose value crosses the bridge, by
  name: `value={{ local: "LocalContentColor", value: "#6750a4" }}`, or `values={[...]}`.
- `List<T>` props take arrays, such as `polygons={["cookie9Sided", "pentagon"]}` on `LoadingIndicator`.
- Supertypes of a scope are scopes, so `PaneScaffoldScope` modifiers work inside pane scaffolds.
  A generic receiver (`ExtendedPaneScaffoldPaneScope<R, V>.AnimatedPane`) resolves to the scope
  that implements it.
- Values made by a scope's own members, such as `OverlayClip(clipShape)` in a shared
  transition, take the same `factory` form.
- `Modifier.nonInteractiveScrollbar` takes the `useScrollState` or `useLazyListState` handle of a
  container in the same Compose host and follows that container's scroll state.
- When no other construction path works, an immutable Compose class takes the public
  constructor that Kotlin resolves for the supplied fields (`ModalBottomSheetProperties`).

APIs that accept the same native handle or value type share a decoder. Requesters
and interaction sources retain their identity within a Compose host. Animation
specs use the same decoder for components and modifiers. Scroll and key policies
run on Android so Compose can act on the result during the current event.
## Animation and native policies

- In `Crossfade` and `AnimatedContent`, pass a number to select a child by
  position or a string to select a direct child by its React `key`. Keep both
  children mounted while Compose animates between them.
- `nestedScroll` synchronously consumes configured fractions of the available
  scroll and fling. A custom connection or a programmatic dispatcher needs
  native policies for callback arguments, results, and coroutine ownership.
- The requester and interaction source hooks retain identity within a Compose
  host. List and sheet handles send commands to composition-owned native state.
- Animation specs support spring, tween, snap, and keyframes. Each keyframe
  takes `atMillis` and a value in the animated property's type, such as a number
  for `Crossfade` or a pixel size for `Modifier.animateContentSize`.

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
