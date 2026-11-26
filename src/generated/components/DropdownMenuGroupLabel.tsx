// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposePaddingValues } from "../../utils/composeValues";
import type { ComposeAlignment } from "../values/enums";

export interface DropdownMenuGroupLabelProps {
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  contentAlignment?: ComposeAlignment;
  padding?: ComposePaddingValues;
  children?: ReactNode;
}
export const DropdownMenuGroupLabel = createComposableComponent<DropdownMenuGroupLabelProps>({
  name: "DropdownMenuGroupLabel",
  props: ["modifier","contentAlignment","padding"],
  objectProps: ["padding"],
  children: true,
});
