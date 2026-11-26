// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeShape } from "../../utils/modifier";
import type { ComposeSearchBarState, ComposeWindowInsets } from "../../utils/composeValues";
import type { ComposeSearchBarColorsValue } from "../values/records";

export type SearchBarProps =
  | {
    state: ComposeSearchBarState;
    inputField: ReactNode;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    shape?: ComposeShape;
    colors?: ComposeSearchBarColorsValue;
    tonalElevation?: number;
    shadowElevation?: number;
    expanded?: never;
    onExpandedChange?: never;
    windowInsets?: never;
    children?: never;
    }
  | {
    inputField: ReactNode;
    expanded: boolean;
    onExpandedChange: (value: boolean) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    shape?: ComposeShape;
    colors?: ComposeSearchBarColorsValue;
    tonalElevation?: number;
    shadowElevation?: number;
    windowInsets?: ComposeWindowInsets;
    children?: ReactNode;
    state?: never;
    }
;
export const SearchBar = createComposableComponent<SearchBarProps>({
  name: "SearchBar",
  props: ["state","modifier","shape","colors","tonalElevation","shadowElevation","expanded","windowInsets"],
  objectProps: ["state","shape","colors","windowInsets"],
  slots: ["inputField"],
  events: ["onExpandedChange"],
  children: true,
  overloads: [
    { id: "SearchBar", children: false, parameters: [["state","object",false,false],["inputField","ReactNode",false,false],["modifier","ComposeModifier",true,false],["shape","shape",true,false],["colors","object",true,false],["tonalElevation","number",true,false],["shadowElevation","number",true,false]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15] },
    { id: "SearchBar#1", children: true, parameters: [["inputField","ReactNode",false,false],["expanded","boolean",false,false],["onExpandedChange","function",false,false],["modifier","ComposeModifier",true,false],["shape","shape",true,false],["colors","object",true,false],["tonalElevation","number",true,false],["shadowElevation","number",true,false],["windowInsets","object",true,false]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31] },
  ],
});
