// Generated from Compose declarations by generate.mjs.
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeTimePickerDisplayMode } from "../values/enums";

export interface DisplayModeToggleProps {
  onDisplayModeChange: () => void;
  displayMode: ComposeTimePickerDisplayMode;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
}
export const DisplayModeToggle = createComposableComponent<DisplayModeToggleProps>({
  name: "DisplayModeToggle",
  props: ["displayMode","modifier"],
  events: ["onDisplayModeChange"],
  children: false,
});
