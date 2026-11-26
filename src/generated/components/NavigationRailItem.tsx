// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeNavigationRailItemColorsValue } from "../values/records";
import type { ComposeInteractionSource } from "../../utils/nativeHandles";

export interface NavigationRailItemProps {
  selected: boolean;
  onClick: () => void;
  icon: ReactNode;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  enabled?: boolean;
  label?: ReactNode;
  alwaysShowLabel?: boolean;
  colors?: ComposeNavigationRailItemColorsValue;
  interactionSource?: ComposeInteractionSource | null;
}
export const NavigationRailItem = createComposableComponent<NavigationRailItemProps>({
  name: "NavigationRailItem",
  props: ["selected","modifier","enabled","alwaysShowLabel","colors","interactionSource"],
  objectProps: ["colors","interactionSource"],
  slots: ["icon","label"],
  events: ["onClick"],
  children: false,
});
