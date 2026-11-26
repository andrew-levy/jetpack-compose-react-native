// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeTabPositionSnapshot } from "../values/payloads";

export interface ScrollableTabRowProps {
  selectedTabIndex: number;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  containerColor?: string;
  contentColor?: string;
  edgePadding?: number;
  indicator?: ReactNode | ((value1: readonly ComposeTabPositionSnapshot[]) => ReactNode);
  divider?: ReactNode;
  tabs: ReactNode;
}
export const ScrollableTabRow = createComposableComponent<ScrollableTabRowProps>({
  name: "ScrollableTabRow",
  props: ["selectedTabIndex","modifier","containerColor","contentColor","edgePadding"],
  slots: ["indicator","divider","tabs"],
  renderSlots: ["indicator"],
  children: false,
});
