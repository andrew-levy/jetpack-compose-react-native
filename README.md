# Jetpack Compose React Native

_This project is in early development and is not yet ready for use._

## Getting started

<!-- ```bash
npx expo install jetpack-compose-react-native  # (coming soon)
``` -->

Add the plugin to your `app.json`. This will allow your Android app to use Jetpack Compose.

```json
{
  "plugins": ["jetpack-compose-react-native"]
}
```

Next, prebuild your app.

```bash
npx expo prebuild -p android --clean
```

## Usage

```tsx
import { Button, Column, Modifier, Text } from "jetpack-compose-react-native";

export function Greeting() {
  return (
    <Column modifier={Modifier.padding(16)}>
      <Text text="Hello Compose" />
      <Button onClick={() => console.log("Clicked")}>
        <Text text="Tap me" />
      </Button>
    </Column>
  );
}
```

The root component creates a native Compose host automatically. See the
[generated bridge guide](poc/generated-bridge/README.md) for the example app,
source generation, and migration from the original wrappers.

## Contributors

- [Oliver Lopez](https://x.com/oliverloops)

## To Do (WIP)

- [x] Button
- [x] Switch
- [x] Slider
- [x] Column
- [x] Row
- [x] Icon
- [x] Progress Indicator (Circular + Linear)
- [x] Checkbox
- [x] Other types of [buttons](https://developer.android.com/develop/ui/compose/components/button)
- [x] Card
- [x] Spacer
- [x] Chip
- [x] Badge
- [x] Horizontal Divider
- [x] Vertical Divider
- [x] Text Field
- [x] Dialog
- [x] Text
- [x] Carousel
- [x] Snackbar
- [ ] Bottom Sheet
- [x] Time/Date Picker (WIP...)
- [x] LazyColumn/Row (just add a `lazy` prop to the existing components)
- [x] LazyGrid (vertical and horizontal props from the same component)
- [x] LazyStaggeredGrid (vertical and horizontal props from the same component)
- [x] Box
- [ ] More modifiers!
