// Generated from Compose declarations by generate.mjs.
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";

export interface SecondaryIndicatorProps {
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  height?: number;
  color?: string;
}
export const SecondaryIndicator = createComposableComponent<SecondaryIndicatorProps>({
  name: "SecondaryIndicator",
  props: ["modifier","height","color"],
  children: false,
});
