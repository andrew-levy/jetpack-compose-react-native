// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposePaddingValues, ComposeTopAppBarScrollBehavior, ComposeWindowInsets } from "../../utils/composeValues";
import type { ComposeTopAppBarColorsValue } from "../values/records";

export interface CenterAlignedTopAppBarProps {
  title: ReactNode;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  navigationIcon?: ReactNode;
  actions?: ReactNode;
  expandedHeight?: number;
  windowInsets?: ComposeWindowInsets;
  colors?: ComposeTopAppBarColorsValue;
  scrollBehavior?: ComposeTopAppBarScrollBehavior | null;
  contentPadding?: ComposePaddingValues;
}
export const CenterAlignedTopAppBar = createComposableComponent<CenterAlignedTopAppBarProps>({
  name: "CenterAlignedTopAppBar",
  props: ["modifier","expandedHeight","windowInsets","colors","scrollBehavior","contentPadding"],
  objectProps: ["windowInsets","colors","scrollBehavior","contentPadding"],
  slots: ["title","navigationIcon","actions"],
  children: false,
});
