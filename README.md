# Jetpack Compose React Native

Use native Jetpack Compose and Material 3 components from TypeScript in your
React Native Android app. The library generates component and modifier bindings
from AndroidX, and a top-level Compose component hosts its subtree automatically.

## Quick start

The beta targets Android with React Native 0.87 or newer (the example uses 0.88.1 with Expo SDK 58) and
the New Architecture. It binds Compose UI and Foundation 1.13 and Material 3 1.5, which need Android
compile SDK 37.1 (`compileSdk 37` with `compileSdkMinor 1`), AGP 9.1 or newer, min SDK 24, and Kotlin
2.2.20 with the matching Compose compiler Gradle plugin. To try a checkout, run `npm ci` and
`npm pack` in this repository, then install the resulting tarball from your
React Native app with `npm install /path/to/the-package.tgz`. Add
`org.jetbrains.kotlin:compose-compiler-gradle-plugin:2.2.20` to the root
Android buildscript classpath, then rebuild Android. React Native
autolinks the view managers and Fabric descriptors. In an Expo app, the example's
[config plugin](example/plugins/withComposeExample.js) shows both settings.

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

## Configuration blocks

Compose modifiers that take a configuration block, such as `blur { ... }`, `graphicsLayer { ... }`,
`dropShadow(shape) { ... }` and `innerShadow(shape) { ... }`, accept an object of the block's settable
properties. Native code assigns the ones you pass inside the block, so omitted properties keep their
Compose defaults. This Kotlin

```kotlin
Modifier.blur {
    blurRadiusSpec = BlurRadiusSpec.verticalGradient(
        listOf(BlurStop(0f, 24.dp), BlurStop(0.25f, 0.dp), BlurStop(0.75f, 0.dp), BlurStop(1f, 24.dp)),
    )
    edgeTreatment = BlurredEdgeTreatment.Rectangle
}
```

is written as

```tsx
Modifier.blur({
  blurRadiusSpec: {
    factory: "BlurRadiusSpec.verticalGradient",
    stops: [
      { fraction: 0, radius: 24 }, { fraction: 0.25, radius: 0 },
      { fraction: 0.75, radius: 0 }, { fraction: 1, radius: 24 },
    ],
  },
  edgeTreatment: "rectangle",
})
```

Values built by a companion factory take a `factory` name, and an overloaded factory is selected by its
fields (`{ factory: "BlurRadiusSpec.verticalGradient", startRadius: 24, endRadius: 0 }` picks the
two-radius overload). Dimensions are in dp. The blocks and factories are discovered from the Compose
declarations, so new ones need no change to the generator.

## Focus, scrolling, and styles

Create a requester with `useFocusRequester()` or `useBringIntoViewRequester()`.
Attach it to the target modifier, then call `requestFocus()` or
`bringIntoView()` from a React event. Keep users of the same handle in a single
Compose host.

Use `Modifier.nestedScroll({ preScroll: { y: 1 } })` to consume vertical deltas
before the child scrolls. Pre- and post-scroll rules also accept per-axis
fractions for flings. Use `Modifier.onPreviewKeyEvent({ keyCodes: [4], event: "up" })`
to consume matching key events on Android.

Animation parameters accept native spring, tween, and snap specs. For example,
`Modifier.animateContentSize({ animationSpec: { type: "tween", durationMillis: 240 } })`.

Compose Foundation 1.11 supplies the experimental Style API. Use a style object
with `Modifier.styleable`. Share an interaction source when a style should
respond to focus, press, or hover from another modifier.

```tsx
import { Box, Modifier, Text, useInteractionSource } from "jetpack-compose-react-native";

function StyledFocusTarget() {
  const interactionSource = useInteractionSource();
  return (
    <Box modifiers={Modifier.styleable({
      style: {
        background: "#ede5fc",
        contentPadding: 12,
        whenFocused: { background: "#c1f2e7" },
      },
      styleState: { interactionSource },
    }).focusable({ interactionSource })}>
      <Text text="Focus target" />
    </Box>
  );
}
```

State-based text fields can filter and format edits on Android. The backing
state stores the filtered text, and Compose keeps cursor and selection offsets
in sync with the formatted display.

```tsx
<TextField
  state={{ initialText: "" }}
  keyboardOptions={{ keyboardType: "phone" }}
  lineLimits={{ type: "singleLine" }}
  inputTransformation={{ digitsOnly: true, maxLength: 10 }}
  outputTransformation={{ insertions: [{ offset: 3, text: "-" }, { offset: 6, text: "-" }] }}
/>
```

Controlled string and `TextFieldValue` overloads also support
`visualTransformation={{ type: "password" }}` for display masking.

## Gestures, layouts, and transitions

`Layout` and `Modifier.layout` accept native measurement rules. For example,
this lays out a fixed-height region and places the second child at the end and center
of its available space. Offsets and dimensions are in dp.

```tsx
<Layout
  modifiers={Modifier.fillMaxWidth()}
  measurePolicy={{ height: 64, children: [{}, { horizontalBias: 1, verticalBias: 0.5 }] }}
>
  <Text text="Title" />
  <Text text="Detail" />
</Layout>
```

Pass a state description to `Modifier.draggable`, `anchoredDraggable`,
`scrollable`, or `transformable`. Android handles the gesture, and optional
callbacks report deltas in physical pixels to React. Scroll consumption is
configured up front and runs on Android during the gesture.

```tsx
Modifier.draggable({
  orientation: "horizontal",
  state: { onDelta: (pixels) => console.log(pixels) },
})
```

`Grid` and `FlexBox` take a `config` object and can contain React Native
children. Apply `Modifier.gridItem` or `Modifier.flex` to direct Compose
children of the corresponding layout. `Canvas` and `Modifier.drawBehind`
take a `{ commands: [...] }` drawing description in dp. The content-drawing
modifiers accept `before` and `after` command lists.

`Crossfade` and `AnimatedContent` use a zero-based child index as
`targetState`. Keep the children and their keys stable through the transition.
For shared elements inside a `SharedTransitionLayout`, reuse the same
`sharedContentState: { key }` on both elements and set
`animatedVisibilityScope: "current"` inside `AnimatedContent` or
`AnimatedVisibility`. Use `useSliderState`, `useRangeSliderState`,
`usePullToRefreshState`, and `useLayoutBoundsHolder` to share native state
between consumers in the same Compose host.

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

## Fieldnote chat demo

The Android example opens in Fieldnote, an offline chat built with JPC RN. Start
an empty conversation, tap a prompt suggestion, or open a sample conversation
from the drawer. Each new prompt moves to the top of the transcript with room
below for its simulated streaming reply. Scroll back freely during generation
and use the down arrow to return to the latest prompt.

Long-press a message for its context menu, or tap the response's overflow button.
You can copy and share replies, rate them, stop generation, or edit and retry
the latest turn. The title and composer mode chip open chat settings. Use the
plus button to attach a built-in sample file.

Run from the repository root with an Android emulator or device connected and
the SDK from Quick start installed.

```sh
npm ci
npm run example:prebuild
npm run android
```

Compose renders the transcript, multiline composer, drawer, menus, bottom
sheets, progress indicator, and motion. React owns the conversation, draft,
and simulated generation state. The demo keeps conversations for the app
session and runs without an API key or an AI service.

## Compose Gallery

Choose **Compose Catalog** from the Fieldnote drawer to open the searchable
catalog. Filter by component or modifier, then open an entry to try it. Previous and Next follow
your current search results. Use **Mark reviewed** to track your manual pass
during the current app session. Switch between System, Light, and Dark on the
list or while a preview is open.

Try **AnimatedVisibility** for the show and hide transition, **Column** for a
three-child stack, and **AlertDialog** for opening and dismissing a native
dialog. Modifier previews show a reference sample and the result in the
same layout context.

`npm test` checks representative JavaScript call forms against the generated
Kotlin registry and verifies that the catalog fixtures are current. Regenerate
them with `npm run catalog:fixtures` after changing the generated API.
CI builds the demo from `npm pack` in a separate React Native project.

With the current release APK installed on a connected Android device or emulator,
`python3 scripts/sweep-catalog.py` mounts one preview per catalog entry and drives selected animations and overlays. It
continues after an app crash, writes `catalog-sweep-report.json`, and fails on
errors or incomplete coverage. `npm run android:verify` exercises catalog search and theme switching, along with native interactions
such as Compose gestures, event delivery, and mixed Compose and React Native layout.

The **Compose Bridge** workflow publishes screenshots and individual GIFs in the
`compose-gallery-previews` artifact. [Gallery workflow](https://github.com/andrew-levy/jetpack-compose-react-native/actions/workflows/compose-bridge.yml)

### Run the gallery

Use Node 22, JDK 17, and an API 34 or newer emulator or Android device. With the Android
SDK command-line tools installed and `ANDROID_HOME` set, install the required
packages. Gradle also installs missing SDK packages on the first build once their licenses are accepted.

```sh
sdkmanager "platform-tools" "platforms;android-37.1" "build-tools;37.0.0" \
  "ndk;27.1.12297006" "cmake;3.22.1"
```

The example is an Expo app. `example/android` is generated by `expo prebuild` from
[app.json](example/app.json) and [the config plugin](example/plugins/withComposeExample.js), and is not
checked in. `npm run android` generates it when it is missing; run `npm run example:prebuild` after
changing either file.

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
