// Generated from Compose declarations by generate.mjs.
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";

export interface ScrimProps {
  contentDescription: string | null;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  onClick?: (() => void) | null;
  alpha?: number;
  color?: string;
}
export const Scrim = createComposableComponent<ScrimProps>({
  name: "Scrim",
  props: ["contentDescription","modifier","alpha","color"],
  events: ["onClick"],
  children: false,
});
