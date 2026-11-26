// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeDialogProperties } from "../../utils/composeValues";

export interface BasicAlertDialogProps {
  onDismissRequest: () => void;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  properties?: ComposeDialogProperties;
  children?: ReactNode;
}
export const BasicAlertDialog = createComposableComponent<BasicAlertDialogProps>({
  name: "BasicAlertDialog",
  props: ["modifier","properties"],
  objectProps: ["properties"],
  events: ["onDismissRequest"],
  children: true,
});
