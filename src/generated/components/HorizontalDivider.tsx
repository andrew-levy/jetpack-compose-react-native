// Generated from Compose declarations by generate.mjs.
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";

export interface HorizontalDividerProps {
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  thickness?: number;
  color?: string;
}
export const HorizontalDivider = createComposableComponent<HorizontalDividerProps>({
  name: "HorizontalDivider",
  props: ["modifier","thickness","color"],
  children: false,
});
