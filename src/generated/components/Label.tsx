// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeInteractionSource } from "../../utils/nativeHandles";

export interface LabelProps {
  label: ReactNode;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  interactionSource?: ComposeInteractionSource | null;
  isPersistent?: boolean;
  children?: ReactNode;
}
export const Label = createComposableComponent<LabelProps>({
  name: "Label",
  props: ["modifier","interactionSource","isPersistent"],
  objectProps: ["interactionSource"],
  slots: ["label"],
  children: true,
});
