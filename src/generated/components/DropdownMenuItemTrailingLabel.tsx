// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposePaddingValues } from "../../utils/composeValues";

export interface DropdownMenuItemTrailingLabelProps {
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  padding?: ComposePaddingValues;
  children?: ReactNode;
}
export const DropdownMenuItemTrailingLabel = createComposableComponent<DropdownMenuItemTrailingLabelProps>({
  name: "DropdownMenuItemTrailingLabel",
  props: ["modifier","padding"],
  objectProps: ["padding"],
  children: true,
});
