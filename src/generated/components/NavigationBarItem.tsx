// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeNavigationBarItemColorsValue } from "../values/records";
import type { ComposeInteractionSource } from "../../utils/nativeHandles";

export interface NavigationBarItemProps {
  selected: boolean;
  onClick: () => void;
  icon: ReactNode;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  enabled?: boolean;
  label?: ReactNode;
  alwaysShowLabel?: boolean;
  colors?: ComposeNavigationBarItemColorsValue;
  interactionSource?: ComposeInteractionSource | null;
}
export const NavigationBarItem = createComposableComponent<NavigationBarItemProps>({
  name: "NavigationBarItem",
  props: ["selected","modifier","enabled","alwaysShowLabel","colors","interactionSource"],
  objectProps: ["colors","interactionSource"],
  slots: ["icon","label"],
  events: ["onClick"],
  children: false,
});
