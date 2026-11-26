// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeSwitchColorsValue } from "../values/records";
import type { ComposeInteractionSource } from "../../utils/nativeHandles";

export interface SwitchProps {
  checked: boolean;
  onCheckedChange: ((value: boolean) => void) | null;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  thumbContent?: ReactNode;
  enabled?: boolean;
  colors?: ComposeSwitchColorsValue;
  interactionSource?: ComposeInteractionSource | null;
}
export const Switch = createComposableComponent<SwitchProps>({
  name: "Switch",
  props: ["checked","modifier","enabled","colors","interactionSource"],
  objectProps: ["colors","interactionSource"],
  slots: ["thumbContent"],
  events: ["onCheckedChange"],
  children: false,
});
