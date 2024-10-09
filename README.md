# Jetpack Compose React Native

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
- [ ] Floating Action Button
- [ ] Text Field
- [ ] Text
- [ ] Chip
- [ ] Card
- [ ] Dialog
- [ ] Bottom Sheet
- [ ] Snackbar
- [ ] Checkbox
- [ ] Badge
- [ ] Bottom Sheet
- [ ] Time/Date Picker
- [ ] Column (LazyColumn)
- [ ] Row (LazyRow)
- [ ] Grid (LazyGrid)
- [ ] Box
- [ ] Dividers
- [ ] Spacer
- [ ] Other types of [buttons](https://developer.android.com/develop/ui/compose/components/button)
- [ ] More modifiers!
