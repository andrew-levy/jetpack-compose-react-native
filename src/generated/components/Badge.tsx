// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";

export interface BadgeProps {
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  containerColor?: string;
  contentColor?: string;
  content?: ReactNode;
}
export const Badge = createComposableComponent<BadgeProps>({
  name: "Badge",
  props: ["modifier","containerColor","contentColor"],
  slots: ["content"],
  children: false,
});
