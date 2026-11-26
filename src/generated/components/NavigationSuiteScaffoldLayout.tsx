// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent } from "../../runtime/createComposableComponent";
import type { ComposeNavigationSuiteScaffoldStateValue } from "../values/records";
import type { ComposeHorizontalAlignment, ComposeNavigationSuiteTypeValue } from "../values/enums";

export type NavigationSuiteScaffoldLayoutProps =
  | {
    navigationSuite: ReactNode;
    layoutType?: ComposeNavigationSuiteTypeValue;
    state?: ComposeNavigationSuiteScaffoldStateValue;
    children?: ReactNode;
    navigationSuiteType?: never;
    primaryActionContent?: never;
    primaryActionContentHorizontalAlignment?: never;
    }
  | {
    navigationSuite: ReactNode;
    navigationSuiteType: ComposeNavigationSuiteTypeValue;
    state?: ComposeNavigationSuiteScaffoldStateValue;
    primaryActionContent?: ReactNode;
    primaryActionContentHorizontalAlignment?: ComposeHorizontalAlignment;
    children?: ReactNode;
    layoutType?: never;
    }
;
export const NavigationSuiteScaffoldLayout = createComposableComponent<NavigationSuiteScaffoldLayoutProps>({
  name: "NavigationSuiteScaffoldLayout",
  props: ["layoutType","state","navigationSuiteType","primaryActionContentHorizontalAlignment"],
  objectProps: ["state"],
  slots: ["navigationSuite","primaryActionContent"],
  children: true,
  overloads: [
    { id: "NavigationSuiteScaffoldLayout", children: true, parameters: [["navigationSuite","ReactNode",false,false],["layoutType","string",true,false],["state","object",true,false]], masks: [0,1,2,3] },
    { id: "NavigationSuiteScaffoldLayout#1", children: true, parameters: [["navigationSuite","ReactNode",false,false],["navigationSuiteType","string",false,false],["state","object",true,false],["primaryActionContent","ReactNode",true,false],["primaryActionContentHorizontalAlignment","string",true,false]], masks: [0,1,2,3,4,5,6,7] },
  ],
});
