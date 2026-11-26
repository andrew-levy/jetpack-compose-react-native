// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeShape } from "../../utils/modifier";
import type { ComposeDialogProperties } from "../../utils/composeValues";

export interface VibrantTimePickerDialogProps {
  onDismissRequest: () => void;
  confirmButton: ReactNode;
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
export const VibrantTimePickerDialog = createComposableComponent<VibrantTimePickerDialogProps>({
  name: "VibrantTimePickerDialog",
  props: ["modifier","properties","shape","containerColor"],
  objectProps: ["properties","shape"],
  slots: ["confirmButton","modeToggleButton","dismissButton"],
  events: ["onDismissRequest"],
  children: true,
});
