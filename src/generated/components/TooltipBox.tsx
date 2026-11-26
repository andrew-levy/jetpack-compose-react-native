// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposePopupPosition, ComposeTooltipState } from "../../utils/composeValues";

export interface TooltipBoxProps {
  positionProvider: ComposePopupPosition;
  tooltip: ReactNode;
  state: ComposeTooltipState;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  onDismissRequest?: (() => void) | null;
  focusable?: boolean;
  enableUserInput?: boolean;
  hasAction?: boolean;
  children?: ReactNode;
}
export const TooltipBox = createComposableComponent<TooltipBoxProps>({
  name: "TooltipBox",
  props: ["positionProvider","state","modifier","focusable","enableUserInput","hasAction"],
  objectProps: ["positionProvider","state"],
  slots: ["tooltip"],
  events: ["onDismissRequest"],
  children: true,
});
