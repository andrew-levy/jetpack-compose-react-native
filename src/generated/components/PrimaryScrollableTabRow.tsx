// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeScrollState } from "../../utils/composeValues";

export interface PrimaryScrollableTabRowProps {
  selectedTabIndex: number;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  scrollState?: ComposeScrollState;
  containerColor?: string;
  contentColor?: string;
  edgePadding?: number;
  indicator?: ReactNode;
  divider?: ReactNode;
  minTabWidth?: number;
  tabs: ReactNode;
}
export const PrimaryScrollableTabRow = createComposableComponent<PrimaryScrollableTabRowProps>({
  name: "PrimaryScrollableTabRow",
  props: ["selectedTabIndex","modifier","scrollState","containerColor","contentColor","edgePadding","minTabWidth"],
  objectProps: ["scrollState"],
  slots: ["indicator","divider","tabs"],
  children: false,
});
