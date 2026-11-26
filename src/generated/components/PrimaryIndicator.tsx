// Generated from Compose declarations by generate.mjs.
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeShape } from "../../utils/modifier";

export interface PrimaryIndicatorProps {
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  width?: number;
  height?: number;
  color?: string;
  shape?: ComposeShape;
}
export const PrimaryIndicator = createComposableComponent<PrimaryIndicatorProps>({
  name: "PrimaryIndicator",
  props: ["modifier","width","height","color","shape"],
  objectProps: ["shape"],
  children: false,
});
