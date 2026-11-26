// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeShape } from "../../utils/modifier";
import type { ComposeDialogProperties } from "../../utils/composeValues";

export interface TimePickerDialogProps {
  onDismissRequest: () => void;
  confirmButton: ReactNode;
  title: ReactNode;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  properties?: ComposeDialogProperties;
  modeToggleButton?: ReactNode;
  dismissButton?: ReactNode;
  shape?: ComposeShape;
  containerColor?: string;
  children?: ReactNode;
}
export const TimePickerDialog = createComposableComponent<TimePickerDialogProps>({
  name: "TimePickerDialog",
  props: ["modifier","properties","shape","containerColor"],
  objectProps: ["properties","shape"],
  slots: ["confirmButton","title","modeToggleButton","dismissButton"],
  events: ["onDismissRequest"],
  children: true,
});
