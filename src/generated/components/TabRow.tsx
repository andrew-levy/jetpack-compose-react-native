// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeTabPositionSnapshot } from "../values/payloads";

export interface TabRowProps {
  selectedTabIndex: number;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  containerColor?: string;
  contentColor?: string;
  indicator?: ReactNode | ((value1: readonly ComposeTabPositionSnapshot[]) => ReactNode);
  divider?: ReactNode;
  tabs: ReactNode;
}
export const TabRow = createComposableComponent<TabRowProps>({
  name: "TabRow",
  props: ["selectedTabIndex","modifier","containerColor","contentColor"],
  slots: ["indicator","divider","tabs"],
  renderSlots: ["indicator"],
  children: false,
});
