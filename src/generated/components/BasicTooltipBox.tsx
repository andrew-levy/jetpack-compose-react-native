// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposePopupPosition, ComposeTooltipState } from "../../utils/composeValues";

export interface BasicTooltipBoxProps {
  positionProvider: ComposePopupPosition;
  tooltip: ReactNode;
  state: ComposeTooltipState;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  focusable?: boolean;
  enableUserInput?: boolean;
  propagateMinConstraints?: boolean;
  children?: ReactNode;
}
export const BasicTooltipBox = createComposableComponent<BasicTooltipBoxProps>({
  name: "BasicTooltipBox",
  props: ["positionProvider","state","modifier","focusable","enableUserInput","propagateMinConstraints"],
  objectProps: ["positionProvider","state"],
  slots: ["tooltip"],
  children: true,
});
