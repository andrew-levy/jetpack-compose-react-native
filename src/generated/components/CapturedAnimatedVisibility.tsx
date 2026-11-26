// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeVisibilityTransition } from "../../utils/composeValues";

export interface CapturedAnimatedVisibilityProps {
  visible: boolean;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  enter?: ComposeVisibilityTransition;
  exit?: ComposeVisibilityTransition;
  label?: string;
  children?: ReactNode;
}
export const CapturedAnimatedVisibility = createComposableComponent<CapturedAnimatedVisibilityProps>({
  name: "CapturedAnimatedVisibility",
  props: ["visible","modifier","enter","exit","label"],
  objectProps: ["enter","exit"],
  children: true,
});
