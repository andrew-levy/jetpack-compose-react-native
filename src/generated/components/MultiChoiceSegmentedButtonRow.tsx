// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";

export interface MultiChoiceSegmentedButtonRowProps {
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  space?: number;
  children?: ReactNode;
}
export const MultiChoiceSegmentedButtonRow = createComposableComponent<MultiChoiceSegmentedButtonRowProps>({
  name: "MultiChoiceSegmentedButtonRow",
  props: ["modifier","space"],
  children: true,
});
