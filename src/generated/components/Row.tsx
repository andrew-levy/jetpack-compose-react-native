// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeHorizontalArrangement, ComposeVerticalAlignment } from "../values/enums";

export interface RowProps {
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  horizontalArrangement?: ComposeHorizontalArrangement;
  verticalAlignment?: ComposeVerticalAlignment;
  children?: ReactNode;
}
export const Row = createComposableComponent<RowProps>({
  name: "Row",
  props: ["modifier","horizontalArrangement","verticalAlignment"],
  children: true,
});
