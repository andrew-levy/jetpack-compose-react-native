// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";

export interface SharedTransitionLayoutProps {
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  children?: ReactNode;
}
export const SharedTransitionLayout = createComposableComponent<SharedTransitionLayoutProps>({
  name: "SharedTransitionLayout",
  props: ["modifier"],
  children: true,
});
