// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeShape } from "../../utils/modifier";
import type { ComposeInteractionSource } from "../../utils/nativeHandles";

export interface NavigationDrawerItemProps {
  label: ReactNode;
  selected: boolean;
  onClick: () => void;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  icon?: ReactNode;
  badge?: ReactNode;
  shape?: ComposeShape;
  interactionSource?: ComposeInteractionSource | null;
}
export const NavigationDrawerItem = createComposableComponent<NavigationDrawerItemProps>({
  name: "NavigationDrawerItem",
  props: ["selected","modifier","shape","interactionSource"],
  objectProps: ["shape","interactionSource"],
  slots: ["label","icon","badge"],
  events: ["onClick"],
  children: false,
});
