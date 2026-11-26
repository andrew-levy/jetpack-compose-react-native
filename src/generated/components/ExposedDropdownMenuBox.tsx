// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";

export interface ExposedDropdownMenuBoxProps {
  expanded: boolean;
  onExpandedChange: (value: boolean) => void;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  children?: ReactNode;
}
export const ExposedDropdownMenuBox = createComposableComponent<ExposedDropdownMenuBoxProps>({
  name: "ExposedDropdownMenuBox",
  props: ["expanded","modifier"],
  events: ["onExpandedChange"],
  children: true,
});
