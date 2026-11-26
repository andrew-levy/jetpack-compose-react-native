// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeDrawerStateHandle } from "../../utils/nativeHandles";

export interface ModalNavigationDrawerProps {
  drawerContent: ReactNode;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  drawerState?: ComposeDrawerStateHandle;
  gesturesEnabled?: boolean;
  scrimColor?: string;
  children?: ReactNode;
}
export const ModalNavigationDrawer = createComposableComponent<ModalNavigationDrawerProps>({
  name: "ModalNavigationDrawer",
  props: ["modifier","drawerState","gesturesEnabled","scrimColor"],
  objectProps: ["drawerState"],
  slots: ["drawerContent"],
  children: true,
});
