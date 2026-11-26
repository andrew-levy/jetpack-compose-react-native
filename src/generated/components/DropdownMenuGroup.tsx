// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeMenuGroupShapesValue } from "../values/records";
import type { ComposeBorderStroke, ComposePaddingValues } from "../../utils/composeValues";
import type { ComposeInteractionSource } from "../../utils/nativeHandles";

export interface DropdownMenuGroupProps {
  shapes: ComposeMenuGroupShapesValue;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  containerColor?: string;
  tonalElevation?: number;
  shadowElevation?: number;
  border?: ComposeBorderStroke | null;
  contentPadding?: ComposePaddingValues;
  interactionSource?: ComposeInteractionSource | null;
  children?: ReactNode;
}
export const DropdownMenuGroup = createComposableComponent<DropdownMenuGroupProps>({
  name: "DropdownMenuGroup",
  props: ["shapes","modifier","containerColor","tonalElevation","shadowElevation","border","contentPadding","interactionSource"],
  objectProps: ["shapes","border","contentPadding","interactionSource"],
  children: true,
});
