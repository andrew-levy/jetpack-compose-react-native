// Generated from Compose declarations by generate.mjs.
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";

export interface DividerProps {
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  thickness?: number;
  color?: string;
}
export const Divider = createComposableComponent<DividerProps>({
  name: "Divider",
  props: ["modifier","thickness","color"],
  children: false,
});
