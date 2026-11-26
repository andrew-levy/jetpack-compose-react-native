// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeShape } from "../../utils/modifier";
import type { ComposeSearchBarState, ComposeWindowInsets } from "../../utils/composeValues";
import type { ComposeSearchBarColorsValue, ComposeSearchBarScrollBehaviorValue } from "../values/records";

export interface TopSearchBarProps {
  state: ComposeSearchBarState;
  inputField: ReactNode;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  shape?: ComposeShape;
  colors?: ComposeSearchBarColorsValue;
  tonalElevation?: number;
  shadowElevation?: number;
  windowInsets?: ComposeWindowInsets;
  scrollBehavior?: ComposeSearchBarScrollBehaviorValue | null;
}
export const TopSearchBar = createComposableComponent<TopSearchBarProps>({
  name: "TopSearchBar",
  props: ["state","modifier","shape","colors","tonalElevation","shadowElevation","windowInsets","scrollBehavior"],
  objectProps: ["state","shape","colors","windowInsets","scrollBehavior"],
  slots: ["inputField"],
  children: false,
});
