// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeHorizontalAlignment, ComposeVerticalArrangement } from "../values/enums";

export interface ColumnProps {
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  verticalArrangement?: ComposeVerticalArrangement;
  horizontalAlignment?: ComposeHorizontalAlignment;
  children?: ReactNode;
}
export const Column = createComposableComponent<ColumnProps>({
  name: "Column",
  props: ["modifier","verticalArrangement","horizontalAlignment"],
  children: true,
});
