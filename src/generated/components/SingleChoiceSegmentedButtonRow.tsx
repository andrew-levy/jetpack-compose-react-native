// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";

export interface SingleChoiceSegmentedButtonRowProps {
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  space?: number;
  children?: ReactNode;
}
export const SingleChoiceSegmentedButtonRow = createComposableComponent<SingleChoiceSegmentedButtonRowProps>({
  name: "SingleChoiceSegmentedButtonRow",
  props: ["modifier","space"],
  children: true,
});
