// Generated from Compose declarations by generate.mjs.
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeTimePickerDisplayMode } from "../values/enums";

export interface TitleProps {
  displayMode: ComposeTimePickerDisplayMode;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
}
export const Title = createComposableComponent<TitleProps>({
  name: "Title",
  props: ["displayMode","modifier"],
  children: false,
});
