// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeNavigationSuiteTypeValue, ComposeVerticalArrangement } from "../values/enums";

export interface NavigationSuiteProps {
  navigationSuiteType: ComposeNavigationSuiteTypeValue;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  verticalArrangement?: ComposeVerticalArrangement;
  primaryActionContent?: ReactNode;
  children?: ReactNode;
}
export const NavigationSuite = createComposableComponent<NavigationSuiteProps>({
  name: "NavigationSuite",
  props: ["navigationSuiteType","modifier","verticalArrangement"],
  slots: ["primaryActionContent"],
  children: true,
});
