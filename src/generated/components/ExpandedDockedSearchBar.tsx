// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeShape } from "../../utils/modifier";
import type { ComposePopupProperties, ComposeSearchBarState } from "../../utils/composeValues";
import type { ComposeSearchBarColorsValue } from "../values/records";

export interface ExpandedDockedSearchBarProps {
  state: ComposeSearchBarState;
  inputField: ReactNode;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  shape?: ComposeShape;
  colors?: ComposeSearchBarColorsValue;
  tonalElevation?: number;
  shadowElevation?: number;
  properties?: ComposePopupProperties;
  children?: ReactNode;
}
export const ExpandedDockedSearchBar = createComposableComponent<ExpandedDockedSearchBarProps>({
  name: "ExpandedDockedSearchBar",
  props: ["state","modifier","shape","colors","tonalElevation","shadowElevation","properties"],
  objectProps: ["state","shape","colors","properties"],
  slots: ["inputField"],
  children: true,
});
