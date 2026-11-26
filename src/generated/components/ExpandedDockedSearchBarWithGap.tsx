// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeShape } from "../../utils/modifier";
import type { ComposePopupProperties, ComposeSearchBarState } from "../../utils/composeValues";
import type { ComposeSearchBarColorsValue } from "../values/records";

export interface ExpandedDockedSearchBarWithGapProps {
  state: ComposeSearchBarState;
  inputField: ReactNode;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  shape?: ComposeShape;
  dropdownShape?: ComposeShape;
  dropdownGapSize?: number;
  dropdownScrimColor?: string;
  colors?: ComposeSearchBarColorsValue;
  tonalElevation?: number;
  shadowElevation?: number;
  properties?: ComposePopupProperties;
  children?: ReactNode;
}
export const ExpandedDockedSearchBarWithGap = createComposableComponent<ExpandedDockedSearchBarWithGapProps>({
  name: "ExpandedDockedSearchBarWithGap",
  props: ["state","modifier","shape","dropdownShape","dropdownGapSize","dropdownScrimColor","colors","tonalElevation","shadowElevation","properties"],
  objectProps: ["state","shape","dropdownShape","colors","properties"],
  slots: ["inputField"],
  children: true,
});
