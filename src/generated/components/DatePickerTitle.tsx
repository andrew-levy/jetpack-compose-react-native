// Generated from Compose declarations by generate.mjs.
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeDisplayMode } from "../values/enums";

export interface DatePickerTitleProps {
  displayMode: ComposeDisplayMode;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  contentColor?: string;
}
export const DatePickerTitle = createComposableComponent<DatePickerTitleProps>({
  name: "DatePickerTitle",
  props: ["displayMode","modifier","contentColor"],
  children: false,
});
