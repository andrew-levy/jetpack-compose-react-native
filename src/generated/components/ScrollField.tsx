// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeScrollFieldColorsValue, ComposeScrollFieldStateValue } from "../values/records";
import type { ComposeInteractionSource } from "../../utils/nativeHandles";

export interface ScrollFieldProps {
  state: ComposeScrollFieldStateValue;
  contentDescription: string | null;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  enabled?: boolean;
  colors?: ComposeScrollFieldColorsValue;
  fieldAccessibilityDescription?: readonly (string)[];
  interactionSource?: ComposeInteractionSource | null;
  field?: ReactNode | ((value1: number, value2: boolean, value3: boolean) => ReactNode);
}
export const ScrollField = createComposableComponent<ScrollFieldProps>({
  name: "ScrollField",
  props: ["state","contentDescription","modifier","enabled","colors","fieldAccessibilityDescription","interactionSource"],
  objectProps: ["state","colors","fieldAccessibilityDescription","interactionSource"],
  slots: ["field"],
  renderSlots: ["field"],
  children: false,
});
