// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent } from "../../runtime/createComposableComponent";
import type { ComposeDialogProperties } from "../../utils/composeValues";

export interface DialogProps {
  onDismissRequest: () => void;
  properties?: ComposeDialogProperties;
  children?: ReactNode;
}
export const Dialog = createComposableComponent<DialogProps>({
  name: "Dialog",
  props: ["properties"],
  objectProps: ["properties"],
  events: ["onDismissRequest"],
  children: true,
});
