// Generated from Compose declarations by generate.mjs.
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeDatePickerFormatter } from "../../utils/composeValues";
import type { ComposeDisplayMode } from "../values/enums";

export interface DatePickerHeadlineProps {
  selectedDateMillis: number | null;
  displayMode: ComposeDisplayMode;
  dateFormatter: ComposeDatePickerFormatter;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  contentColor?: string;
}
export const DatePickerHeadline = createComposableComponent<DatePickerHeadlineProps>({
  name: "DatePickerHeadline",
  props: ["selectedDateMillis","displayMode","dateFormatter","modifier","contentColor"],
  objectProps: ["dateFormatter"],
  children: false,
});
