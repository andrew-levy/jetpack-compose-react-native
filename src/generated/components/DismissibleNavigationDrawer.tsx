// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeDrawerStateHandle } from "../../utils/nativeHandles";

export interface DismissibleNavigationDrawerProps {
  drawerContent: ReactNode;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  drawerState?: ComposeDrawerStateHandle;
  gesturesEnabled?: boolean;
  children?: ReactNode;
}
export const DismissibleNavigationDrawer = createComposableComponent<DismissibleNavigationDrawerProps>({
  name: "DismissibleNavigationDrawer",
  props: ["modifier","drawerState","gesturesEnabled"],
  objectProps: ["drawerState"],
  slots: ["drawerContent"],
  children: true,
});
