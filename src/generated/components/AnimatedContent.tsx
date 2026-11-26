// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeContentTransition } from "../../utils/composeValues";
import type { ComposeAlignment } from "../values/enums";

export interface AnimatedContentProps {
  targetState: number | string;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  transitionSpec?: ComposeContentTransition;
  contentAlignment?: ComposeAlignment;
  label?: string;
  children?: ReactNode;
}
export const AnimatedContent = createComposableComponent<AnimatedContentProps>({
  name: "AnimatedContent",
  props: ["targetState","modifier","transitionSpec","contentAlignment","label"],
  objectProps: ["transitionSpec"],
  keyedChildren: true,
  children: true,
});
