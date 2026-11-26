// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeShape } from "../../utils/modifier";
import type { ComposeFloatingActionButtonElevationValue } from "../values/records";
import type { ComposeInteractionSource } from "../../utils/nativeHandles";

export interface SmallFloatingActionButtonProps {
  onClick: () => void;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  shape?: ComposeShape;
  containerColor?: string;
  contentColor?: string;
  elevation?: ComposeFloatingActionButtonElevationValue;
  interactionSource?: ComposeInteractionSource | null;
  children?: ReactNode;
}
export const SmallFloatingActionButton = createComposableComponent<SmallFloatingActionButtonProps>({
  name: "SmallFloatingActionButton",
  props: ["modifier","shape","containerColor","contentColor","elevation","interactionSource"],
  objectProps: ["shape","elevation","interactionSource"],
  events: ["onClick"],
  children: true,
});
