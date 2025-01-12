import { Stack } from "expo-router";

export default function Layout() {
  return (
    <Stack>
      <Stack.Screen name="index" />
      <Stack.Screen name="buttons" />
      <Stack.Screen name="switches" />
    </Stack>
  );
}
