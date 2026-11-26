// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";

export interface FloatingActionButtonMenuItemProps {
  onClick: () => void;
  text: ReactNode;
  icon: ReactNode;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  containerColor?: string;
  contentColor?: string;
}
export const FloatingActionButtonMenuItem = createComposableComponent<FloatingActionButtonMenuItemProps>({
  name: "FloatingActionButtonMenuItem",
  props: ["modifier","containerColor","contentColor"],
  slots: ["text","icon"],
  events: ["onClick"],
  children: false,
});
