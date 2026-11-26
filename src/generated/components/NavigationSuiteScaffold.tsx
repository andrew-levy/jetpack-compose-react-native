// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeNavigationSuiteScaffoldStateValue } from "../values/records";
import type { ComposeHorizontalAlignment, ComposeNavigationSuiteTypeValue, ComposeVerticalArrangement } from "../values/enums";

export interface NavigationSuiteScaffoldProps {
  navigationItems: ReactNode;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  navigationSuiteType?: ComposeNavigationSuiteTypeValue;
  containerColor?: string;
  contentColor?: string;
  state?: ComposeNavigationSuiteScaffoldStateValue;
  navigationItemVerticalArrangement?: ComposeVerticalArrangement;
  primaryActionContent?: ReactNode;
  primaryActionContentHorizontalAlignment?: ComposeHorizontalAlignment;
  children?: ReactNode;
}
export const NavigationSuiteScaffold = createComposableComponent<NavigationSuiteScaffoldProps>({
  name: "NavigationSuiteScaffold",
  props: ["modifier","navigationSuiteType","containerColor","contentColor","state","navigationItemVerticalArrangement","primaryActionContentHorizontalAlignment"],
  objectProps: ["state"],
  slots: ["navigationItems","primaryActionContent"],
  children: true,
});
