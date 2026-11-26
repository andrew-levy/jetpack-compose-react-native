// Generated from Compose declarations by generate.mjs.
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";

export interface SpacerProps {
  modifiers: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
}
export const Spacer = createComposableComponent<SpacerProps>({
  name: "Spacer",
  props: ["modifier"],
  children: false,
});
