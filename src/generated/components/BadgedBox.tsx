// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";

export interface BadgedBoxProps {
  badge: ReactNode;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  children?: ReactNode;
}
export const BadgedBox = createComposableComponent<BadgedBoxProps>({
  name: "BadgedBox",
  props: ["modifier"],
  slots: ["badge"],
  children: true,
});
