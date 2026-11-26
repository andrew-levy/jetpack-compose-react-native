// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeHorizontalArrangement, ComposeVerticalAlignment, ComposeVerticalArrangement } from "../values/enums";

export interface FlowRowProps {
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  horizontalArrangement?: ComposeHorizontalArrangement;
  verticalArrangement?: ComposeVerticalArrangement;
  itemVerticalAlignment?: ComposeVerticalAlignment;
  maxItemsInEachRow?: number;
  maxLines?: number;
  children?: ReactNode;
}
export const FlowRow = createComposableComponent<FlowRowProps>({
  name: "FlowRow",
  props: ["modifier","horizontalArrangement","verticalArrangement","itemVerticalAlignment","maxItemsInEachRow","maxLines"],
  children: true,
});
