// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";

export interface PermanentNavigationDrawerProps {
  drawerContent: ReactNode;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  children?: ReactNode;
}
export const PermanentNavigationDrawer = createComposableComponent<PermanentNavigationDrawerProps>({
  name: "PermanentNavigationDrawer",
  props: ["modifier"],
  slots: ["drawerContent"],
  children: true,
});
