// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeHorizontalAlignment } from "../values/enums";

export interface FloatingActionButtonMenuProps {
  expanded: boolean;
  button: ReactNode;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  horizontalAlignment?: ComposeHorizontalAlignment;
  children?: ReactNode;
}
export const FloatingActionButtonMenu = createComposableComponent<FloatingActionButtonMenuProps>({
  name: "FloatingActionButtonMenu",
  props: ["expanded","modifier","horizontalAlignment"],
  slots: ["button"],
  children: true,
});
