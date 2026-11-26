// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeAppBarItem } from "../../utils/composeValues";

export interface AppBarColumnProps {
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  overflowIndicator?: ReactNode;
  maxItemCount?: number;
  items: readonly ComposeAppBarItem[];
}
export const AppBarColumn = createComposableComponent<AppBarColumnProps>({
  name: "AppBarColumn",
  props: ["modifier","maxItemCount","items"],
  objectProps: ["items"],
  slots: ["overflowIndicator"],
  children: false,
});
