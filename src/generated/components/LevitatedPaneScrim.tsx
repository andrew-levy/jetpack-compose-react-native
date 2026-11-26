// Generated from Compose declarations by generate.mjs.
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";

export interface LevitatedPaneScrimProps {
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  onClick?: () => void;
  color?: string;
}
export const LevitatedPaneScrim = createComposableComponent<LevitatedPaneScrimProps>({
  name: "LevitatedPaneScrim",
  props: ["modifier","color"],
  events: ["onClick"],
  children: false,
});
