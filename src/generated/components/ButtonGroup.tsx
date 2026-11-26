// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeButtonGroupItem } from "../../utils/composeValues";
import type { ComposeHorizontalArrangement, ComposeVerticalAlignment } from "../values/enums";

export interface ButtonGroupProps {
  overflowIndicator?: ReactNode;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  expandedRatio?: number;
  horizontalArrangement?: ComposeHorizontalArrangement;
  verticalAlignment?: ComposeVerticalAlignment;
  items: readonly ComposeButtonGroupItem[];
}
export const ButtonGroup = createComposableComponent<ButtonGroupProps>({
  name: "ButtonGroup",
  props: ["modifier","expandedRatio","horizontalArrangement","verticalAlignment","items"],
  objectProps: ["items"],
  slots: ["overflowIndicator"],
  children: false,
});
