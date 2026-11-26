// Generated from Compose declarations by generate.mjs.
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeDisplayMode } from "../values/enums";

export interface DateRangePickerTitleProps {
  displayMode: ComposeDisplayMode;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  contentColor?: string;
}
export const DateRangePickerTitle = createComposableComponent<DateRangePickerTitleProps>({
  name: "DateRangePickerTitle",
  props: ["displayMode","modifier","contentColor"],
  children: false,
});
