// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeShape } from "../../utils/modifier";
import type { ComposeInteractionSource } from "../../utils/nativeHandles";

export interface StandardFloatingActionButtonProps {
  onClick: () => void;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  shape?: ComposeShape;
  containerColor?: string;
  contentColor?: string;
  interactionSource?: ComposeInteractionSource | null;
  children?: ReactNode;
}
export const StandardFloatingActionButton = createComposableComponent<StandardFloatingActionButtonProps>({
  name: "StandardFloatingActionButton",
  props: ["modifier","shape","containerColor","contentColor","interactionSource"],
  objectProps: ["shape","interactionSource"],
  events: ["onClick"],
  children: true,
});
