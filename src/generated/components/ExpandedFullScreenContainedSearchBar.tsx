// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeShape } from "../../utils/modifier";
import type { ComposeDialogProperties, ComposeSearchBarState, ComposeWindowInsets } from "../../utils/composeValues";
import type { ComposeSearchBarColorsValue } from "../values/records";

export interface ExpandedFullScreenContainedSearchBarProps {
  state: ComposeSearchBarState;
  inputField: ReactNode;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  collapsedShape?: ComposeShape;
  colors?: ComposeSearchBarColorsValue;
  tonalElevation?: number;
  shadowElevation?: number;
  windowInsets?: ComposeWindowInsets;
  properties?: ComposeDialogProperties;
  children?: ReactNode;
}
export const ExpandedFullScreenContainedSearchBar = createComposableComponent<ExpandedFullScreenContainedSearchBarProps>({
  name: "ExpandedFullScreenContainedSearchBar",
  props: ["state","modifier","collapsedShape","colors","tonalElevation","shadowElevation","windowInsets","properties"],
  objectProps: ["state","collapsedShape","colors","windowInsets","properties"],
  slots: ["inputField"],
  children: true,
});
