// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeWindowInsets } from "../../utils/composeValues";

export interface NavigationBarProps {
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  containerColor?: string;
  contentColor?: string;
  tonalElevation?: number;
  windowInsets?: ComposeWindowInsets;
  children?: ReactNode;
}
export const NavigationBar = createComposableComponent<NavigationBarProps>({
  name: "NavigationBar",
  props: ["modifier","containerColor","contentColor","tonalElevation","windowInsets"],
  objectProps: ["windowInsets"],
  children: true,
});
