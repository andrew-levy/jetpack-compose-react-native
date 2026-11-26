// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposePaddingValues, ComposeWindowInsets } from "../../utils/composeValues";
import type { ComposeBottomAppBarScrollBehaviorValue } from "../values/records";
import type { ComposeHorizontalArrangement } from "../values/enums";

export interface FlexibleBottomAppBarProps {
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  containerColor?: string;
  contentColor?: string;
  contentPadding?: ComposePaddingValues;
  horizontalArrangement?: ComposeHorizontalArrangement;
  expandedHeight?: number;
  windowInsets?: ComposeWindowInsets;
  scrollBehavior?: ComposeBottomAppBarScrollBehaviorValue | null;
  children?: ReactNode;
}
export const FlexibleBottomAppBar = createComposableComponent<FlexibleBottomAppBarProps>({
  name: "FlexibleBottomAppBar",
  props: ["modifier","containerColor","contentColor","contentPadding","horizontalArrangement","expandedHeight","windowInsets","scrollBehavior"],
  objectProps: ["contentPadding","windowInsets","scrollBehavior"],
  children: true,
});
