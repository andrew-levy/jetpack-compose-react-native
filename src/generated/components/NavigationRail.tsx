// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeWindowInsets } from "../../utils/composeValues";

export interface NavigationRailProps {
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  containerColor?: string;
  contentColor?: string;
  header?: ReactNode;
  windowInsets?: ComposeWindowInsets;
  children?: ReactNode;
}
export const NavigationRail = createComposableComponent<NavigationRailProps>({
  name: "NavigationRail",
  props: ["modifier","containerColor","contentColor","windowInsets"],
  objectProps: ["windowInsets"],
  slots: ["header"],
  children: true,
});
