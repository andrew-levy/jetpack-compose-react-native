// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeHorizontalAlignment, ComposeHorizontalArrangement, ComposeVerticalArrangement } from "../values/enums";

export interface FlowColumnProps {
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  verticalArrangement?: ComposeVerticalArrangement;
  horizontalArrangement?: ComposeHorizontalArrangement;
  itemHorizontalAlignment?: ComposeHorizontalAlignment;
  maxItemsInEachColumn?: number;
  maxLines?: number;
  children?: ReactNode;
}
export const FlowColumn = createComposableComponent<FlowColumnProps>({
  name: "FlowColumn",
  props: ["modifier","verticalArrangement","horizontalArrangement","itemHorizontalAlignment","maxItemsInEachColumn","maxLines"],
  children: true,
});
