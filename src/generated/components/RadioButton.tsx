// Generated from Compose declarations by generate.mjs.
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeRadioButtonColorsValue } from "../values/records";
import type { ComposeInteractionSource } from "../../utils/nativeHandles";

export interface RadioButtonProps {
  selected: boolean;
  onClick: (() => void) | null;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  enabled?: boolean;
  colors?: ComposeRadioButtonColorsValue;
  interactionSource?: ComposeInteractionSource | null;
}
export const RadioButton = createComposableComponent<RadioButtonProps>({
  name: "RadioButton",
  props: ["selected","modifier","enabled","colors","interactionSource"],
  objectProps: ["colors","interactionSource"],
  events: ["onClick"],
  children: false,
});
