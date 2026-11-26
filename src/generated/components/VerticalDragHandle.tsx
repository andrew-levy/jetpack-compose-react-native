// Generated from Compose declarations by generate.mjs.
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeDragHandleColorsValue, ComposeDragHandleShapesValue, ComposeDragHandleSizesValue } from "../values/records";
import type { ComposeInteractionSource } from "../../utils/nativeHandles";

export interface VerticalDragHandleProps {
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  sizes?: ComposeDragHandleSizesValue;
  colors?: ComposeDragHandleColorsValue;
  shapes?: ComposeDragHandleShapesValue;
  interactionSource?: ComposeInteractionSource | null;
}
export const VerticalDragHandle = createComposableComponent<VerticalDragHandleProps>({
  name: "VerticalDragHandle",
  props: ["modifier","sizes","colors","shapes","interactionSource"],
  objectProps: ["sizes","colors","shapes","interactionSource"],
  children: false,
});
