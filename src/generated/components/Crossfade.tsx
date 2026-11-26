// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeAnimationSpec } from "../../utils/composeValues";

export interface CrossfadeProps {
  targetState: number | string;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  animationSpec?: ComposeAnimationSpec;
  label?: string;
  children?: ReactNode;
}
export const Crossfade = createComposableComponent<CrossfadeProps>({
  name: "Crossfade",
  props: ["targetState","modifier","animationSpec","label"],
  objectProps: ["animationSpec"],
  keyedChildren: true,
  children: true,
});
