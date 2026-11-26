// Generated from Compose declarations by generate.mjs.
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeTimePickerDisplayMode } from "../values/enums";

export interface ScrollDisplayModeToggleProps {
  onDisplayModeChange: () => void;
  displayMode: ComposeTimePickerDisplayMode;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
}
export const ScrollDisplayModeToggle = createComposableComponent<ScrollDisplayModeToggleProps>({
  name: "ScrollDisplayModeToggle",
  props: ["displayMode","modifier"],
  events: ["onDisplayModeChange"],
  children: false,
});
