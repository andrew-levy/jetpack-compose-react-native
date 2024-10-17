# Jetpack Compose React Native

_This project is in early development and is not yet ready for use._

## Getting started

```bash
npx expo install jetpack-compose-react-native  # (coming soon)
```

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
import { Button, Switch, Column, Text } from "jetpack-compose-react-native";
import { useState } from "react";

export default function App() {
  const [checked, setChecked] = useState(false);
  return (
    <Column>
      <Text>Use Jetpack Compose views in your RN app!</Text>
      <Button title="Press me" onClick={() => console.log("Button pressed")} />
      <Switch
        checked={checked}
        onCheckedChange={(isChecked) => setChecked(isChecked)}
      />
    </Column>
  );
}
```

## To Do

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
- [ ] Text Field
- [ ] Text
- [ ] Dialog
- [ ] Bottom Sheet
- [ ] Snackbarx
- [ ] Bottom Sheet
- [ ] Time/Date Picker
- [ ] LazyColumn/Row/Grid (just add a `lazy` prop to the existing components)
- [ ] Grid
- [ ] Box
- [ ] More modifiers!
