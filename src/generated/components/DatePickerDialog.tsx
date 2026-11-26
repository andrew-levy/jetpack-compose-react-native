// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeShape } from "../../utils/modifier";
import type { ComposeDatePickerColorsValue } from "../values/records";
import type { ComposeDialogProperties } from "../../utils/composeValues";

export interface DatePickerDialogProps {
  onDismissRequest: () => void;
  confirmButton: ReactNode;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  dismissButton?: ReactNode;
  shape?: ComposeShape;
  tonalElevation?: number;
  colors?: ComposeDatePickerColorsValue;
  properties?: ComposeDialogProperties;
  children?: ReactNode;
}
export const DatePickerDialog = createComposableComponent<DatePickerDialogProps>({
  name: "DatePickerDialog",
  props: ["modifier","shape","tonalElevation","colors","properties"],
  objectProps: ["shape","colors","properties"],
  slots: ["confirmButton","dismissButton"],
  events: ["onDismissRequest"],
  children: true,
});
