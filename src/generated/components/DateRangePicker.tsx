// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeDatePickerFormatter, ComposeDateRangePickerState } from "../../utils/composeValues";
import type { ComposeDatePickerColorsValue } from "../values/records";
import type { ComposeFocusRequester } from "../../utils/nativeHandles";

export interface DateRangePickerProps {
  state: ComposeDateRangePickerState;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  dateFormatter?: ComposeDatePickerFormatter;
  colors?: ComposeDatePickerColorsValue;
  title?: ReactNode;
  headline?: ReactNode;
  showModeToggle?: boolean;
  focusRequester?: ComposeFocusRequester | null;
}
export const DateRangePicker = createComposableComponent<DateRangePickerProps>({
  name: "DateRangePicker",
  props: ["state","modifier","dateFormatter","colors","showModeToggle","focusRequester"],
  objectProps: ["state","dateFormatter","colors","focusRequester"],
  slots: ["title","headline"],
  children: false,
});
