// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";

export interface PrimaryTabRowProps {
  selectedTabIndex: number;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  containerColor?: string;
  contentColor?: string;
  indicator?: ReactNode;
  divider?: ReactNode;
  tabs: ReactNode;
}
export const PrimaryTabRow = createComposableComponent<PrimaryTabRowProps>({
  name: "PrimaryTabRow",
  props: ["selectedTabIndex","modifier","containerColor","contentColor"],
  slots: ["indicator","divider","tabs"],
  children: false,
});
