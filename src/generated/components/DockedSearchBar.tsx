// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeShape } from "../../utils/modifier";
import type { ComposeSearchBarColorsValue } from "../values/records";
import type { ComposeInteractionSource } from "../../utils/nativeHandles";

export type DockedSearchBarProps =
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
    children?: ReactNode;
    query?: never;
    onQueryChange?: never;
    onSearch?: never;
    active?: never;
    onActiveChange?: never;
    enabled?: never;
    placeholder?: never;
    leadingIcon?: never;
    trailingIcon?: never;
    interactionSource?: never;
    }
  | {
    query: string;
    onQueryChange: (value: string) => void;
    onSearch: (value: string) => void;
    active: boolean;
    onActiveChange: (value: boolean) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    trailingIcon?: ReactNode;
    shape?: ComposeShape;
    tonalElevation?: number;
    shadowElevation?: number;
    interactionSource?: ComposeInteractionSource | null;
    children?: ReactNode;
    inputField?: never;
    expanded?: never;
    onExpandedChange?: never;
    colors?: never;
    }
  | {
    query: string;
    onQueryChange: (value: string) => void;
    onSearch: (value: string) => void;
    active: boolean;
    onActiveChange: (value: boolean) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    placeholder?: ReactNode;
    leadingIcon?: ReactNode;
    trailingIcon?: ReactNode;
    shape?: ComposeShape;
    colors: ComposeSearchBarColorsValue;
    children?: ReactNode;
    inputField?: never;
    expanded?: never;
    onExpandedChange?: never;
    tonalElevation?: never;
    shadowElevation?: never;
    interactionSource?: never;
    }
  | {
    query: string;
    onQueryChange: (value: string) => void;
    onSearch: (value: string) => void;
    active: boolean;
    onActiveChange: (value: boolean) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    shape: ComposeShape;
    colors: ComposeSearchBarColorsValue;
    tonalElevation: number;
    shadowElevation: number;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    inputField?: never;
    expanded?: never;
    onExpandedChange?: never;
    enabled?: never;
    }
  | {
    query: string;
    onQueryChange: (value: string) => void;
    onSearch: (value: string) => void;
    active: boolean;
    onActiveChange: (value: boolean) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    shape: ComposeShape;
    colors: ComposeSearchBarColorsValue;
    tonalElevation: number;
    shadowElevation: number;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    inputField?: never;
    expanded?: never;
    onExpandedChange?: never;
    placeholder?: never;
    }
  | {
    query: string;
    onQueryChange: (value: string) => void;
    onSearch: (value: string) => void;
    active: boolean;
    onActiveChange: (value: boolean) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    placeholder: ReactNode;
    trailingIcon: ReactNode;
    shape: ComposeShape;
    colors: ComposeSearchBarColorsValue;
    tonalElevation: number;
    shadowElevation: number;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    inputField?: never;
    expanded?: never;
    onExpandedChange?: never;
    leadingIcon?: never;
    }
  | {
    query: string;
    onQueryChange: (value: string) => void;
    onSearch: (value: string) => void;
    active: boolean;
    onActiveChange: (value: boolean) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    shape: ComposeShape;
    colors: ComposeSearchBarColorsValue;
    tonalElevation: number;
    shadowElevation: number;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    inputField?: never;
    expanded?: never;
    onExpandedChange?: never;
    trailingIcon?: never;
    }
  | {
    query: string;
    onQueryChange: (value: string) => void;
    onSearch: (value: string) => void;
    active: boolean;
    onActiveChange: (value: boolean) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    colors: ComposeSearchBarColorsValue;
    tonalElevation: number;
    shadowElevation: number;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    inputField?: never;
    expanded?: never;
    onExpandedChange?: never;
    shape?: never;
    }
  | {
    query: string;
    onQueryChange: (value: string) => void;
    onSearch: (value: string) => void;
    active: boolean;
    onActiveChange: (value: boolean) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    shape: ComposeShape;
    colors: ComposeSearchBarColorsValue;
    shadowElevation: number;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    inputField?: never;
    expanded?: never;
    onExpandedChange?: never;
    tonalElevation?: never;
    }
  | {
    query: string;
    onQueryChange: (value: string) => void;
    onSearch: (value: string) => void;
    active: boolean;
    onActiveChange: (value: boolean) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    shape: ComposeShape;
    colors: ComposeSearchBarColorsValue;
    tonalElevation: number;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    inputField?: never;
    expanded?: never;
    onExpandedChange?: never;
    shadowElevation?: never;
    }
  | {
    query: string;
    onQueryChange: (value: string) => void;
    onSearch: (value: string) => void;
    active: boolean;
    onActiveChange: (value: boolean) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    placeholder: ReactNode;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    shape: ComposeShape;
    colors: ComposeSearchBarColorsValue;
    tonalElevation: number;
    shadowElevation: number;
    interactionSource?: ComposeInteractionSource | null;
    children?: ReactNode;
    inputField?: never;
    expanded?: never;
    onExpandedChange?: never;
    }
;
export const DockedSearchBar = createComposableComponent<DockedSearchBarProps>({
  name: "DockedSearchBar",
  props: ["expanded","modifier","shape","colors","tonalElevation","shadowElevation","query","active","enabled","interactionSource"],
  objectProps: ["shape","colors","interactionSource"],
  slots: ["inputField","placeholder","leadingIcon","trailingIcon"],
  events: ["onExpandedChange","onQueryChange","onSearch","onActiveChange"],
  children: true,
  overloads: [
    { id: "DockedSearchBar", children: true, parameters: [["inputField","ReactNode",false,false],["expanded","boolean",false,false],["onExpandedChange","function",false,false],["modifier","ComposeModifier",true,false],["shape","shape",true,false],["colors","object",true,false],["tonalElevation","number",true,false],["shadowElevation","number",true,false]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15] },
    { id: "DockedSearchBar#1", children: true, controlledText: true, parameters: [["query","string",false,false],["onQueryChange","function",false,false],["onSearch","function",false,false],["active","boolean",false,false],["onActiveChange","function",false,false],["modifier","ComposeModifier",true,false],["enabled","boolean",true,false],["placeholder","ReactNode",true,true],["leadingIcon","ReactNode",true,true],["trailingIcon","ReactNode",true,true],["shape","shape",true,false],["colors","object",true,false],["tonalElevation","number",true,false],["shadowElevation","number",true,false],["interactionSource","object",true,true]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,128,129,130,131,132,133,134,135,136,137,138,139,140,141,142,143,144,145,146,147,148,149,150,151,152,153,154,155,156,157,158,159,192,193,194,195,196,197,198,199,200,201,202,203,204,205,206,207,208,209,210,211,212,213,214,215,216,217,218,219,220,221,222,223,255,256,257,258,259,260,261,262,263,264,265,266,267,268,269,270,271,272,273,274,275,276,277,278,279,280,281,282,283,284,285,286,287,320,321,322,323,324,325,326,327,328,329,330,331,332,333,334,335,336,337,338,339,340,341,342,343,344,345,346,347,348,349,350,351,383,384,385,386,387,388,389,390,391,392,393,394,395,396,397,398,399,400,401,402,403,404,405,406,407,408,409,410,411,412,413,414,415,447,448,449,450,451,452,453,454,455,456,457,458,459,460,461,462,463,464,465,466,467,468,469,470,471,472,473,474,475,476,477,478,479,495,503,507,509,510,511] },
  ],
});
