// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeSnackbarHostState } from "../../utils/composeValues";
import type { ComposeSnackbarDataSnapshot } from "../values/payloads";

export interface SnackbarHostProps {
  hostState: ComposeSnackbarHostState;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  snackbar?: ReactNode | ((value1: ComposeSnackbarDataSnapshot) => ReactNode);
}
export const SnackbarHost = createComposableComponent<SnackbarHostProps>({
  name: "SnackbarHost",
  props: ["hostState","modifier"],
  objectProps: ["hostState"],
  slots: ["snackbar"],
  renderSlots: ["snackbar"],
  children: false,
});
