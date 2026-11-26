// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeVisibilityTransition } from "../../utils/composeValues";
import type { ComposeDragToResizeStateSnapshot } from "../values/payloads";

export interface AnimatedPaneProps {
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  enterTransition?: ComposeVisibilityTransition;
  exitTransition?: ComposeVisibilityTransition;
  dragToResizeHandle?: ReactNode | ((value1: ComposeDragToResizeStateSnapshot) => ReactNode);
  children?: ReactNode;
}
export const AnimatedPane = createComposableComponent<AnimatedPaneProps>({
  name: "AnimatedPane",
  props: ["modifier","enterTransition","exitTransition"],
  objectProps: ["enterTransition","exitTransition"],
  slots: ["dragToResizeHandle"],
  renderSlots: ["dragToResizeHandle"],
  children: true,
});
