// Generated from Compose declarations by generate.mjs.
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeDatePickerFormatter } from "../../utils/composeValues";
import type { ComposeDisplayMode } from "../values/enums";

export interface DateRangePickerHeadlineProps {
  selectedStartDateMillis: number | null;
  selectedEndDateMillis: number | null;
  displayMode: ComposeDisplayMode;
  dateFormatter: ComposeDatePickerFormatter;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  contentColor?: string;
}
export const DateRangePickerHeadline = createComposableComponent<DateRangePickerHeadlineProps>({
  name: "DateRangePickerHeadline",
  props: ["selectedStartDateMillis","selectedEndDateMillis","displayMode","dateFormatter","modifier","contentColor"],
  objectProps: ["dateFormatter"],
  children: false,
});
