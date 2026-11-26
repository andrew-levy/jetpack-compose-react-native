// Generated from Compose declarations by generate.mjs.
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";

export interface TrailingIconProps {
  expanded: boolean;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
}
export const TrailingIcon = createComposableComponent<TrailingIconProps>({
  name: "TrailingIcon",
  props: ["expanded","modifier"],
  children: false,
});
