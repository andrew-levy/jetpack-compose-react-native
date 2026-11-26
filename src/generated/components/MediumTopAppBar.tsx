// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeTopAppBarScrollBehavior, ComposeWindowInsets } from "../../utils/composeValues";
import type { ComposeTopAppBarColorsValue } from "../values/records";

export interface MediumTopAppBarProps {
  title: ReactNode;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  navigationIcon?: ReactNode;
  actions?: ReactNode;
  collapsedHeight?: number;
  expandedHeight?: number;
  windowInsets?: ComposeWindowInsets;
  colors?: ComposeTopAppBarColorsValue;
  scrollBehavior?: ComposeTopAppBarScrollBehavior | null;
}
export const MediumTopAppBar = createComposableComponent<MediumTopAppBarProps>({
  name: "MediumTopAppBar",
  props: ["modifier","collapsedHeight","expandedHeight","windowInsets","colors","scrollBehavior"],
  objectProps: ["windowInsets","colors","scrollBehavior"],
  slots: ["title","navigationIcon","actions"],
  children: false,
});
