// Generated from Compose declarations by generate.mjs.
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeShape } from "../../utils/modifier";

export interface DragHandleProps {
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  width?: number;
  height?: number;
  shape?: ComposeShape;
  color?: string;
}
export const DragHandle = createComposableComponent<DragHandleProps>({
  name: "DragHandle",
  props: ["modifier","width","height","shape","color"],
  objectProps: ["shape"],
  children: false,
});
