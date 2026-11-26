// Generated from Compose declarations by generate.mjs.
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";

export interface VerticalDividerProps {
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  thickness?: number;
  color?: string;
}
export const VerticalDivider = createComposableComponent<VerticalDividerProps>({
  name: "VerticalDivider",
  props: ["modifier","thickness","color"],
  children: false,
});
