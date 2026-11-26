// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeMenuItemShapesValue, ComposeSelectableMenuItemColorsValue } from "../values/records";
import type { ComposePaddingValues } from "../../utils/composeValues";
import type { ComposeInteractionSource } from "../../utils/nativeHandles";
import type { ComposeHorizontalArrangement } from "../values/enums";

export type CheckableDropdownMenuItemProps =
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    text: ReactNode;
    shapes: ComposeMenuItemShapesValue;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    leadingIcon?: ReactNode;
    checkedLeadingIcon?: ReactNode;
    trailingContent?: ReactNode;
    supportingText?: ReactNode;
    enabled?: boolean;
    horizontalArrangement?: ComposeHorizontalArrangement;
    contentPadding?: ComposePaddingValues;
    interactionSource?: ComposeInteractionSource | null;
    colors?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    text: ReactNode;
    shapes: ComposeMenuItemShapesValue;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    leadingIcon?: ReactNode;
    checkedLeadingIcon?: ReactNode;
    trailingContent?: ReactNode;
    supportingText?: ReactNode;
    enabled?: boolean;
    colors: ComposeSelectableMenuItemColorsValue;
    horizontalArrangement?: never;
    contentPadding?: never;
    interactionSource?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    text: ReactNode;
    shapes: ComposeMenuItemShapesValue;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    checkedLeadingIcon: ReactNode;
    trailingContent: ReactNode;
    supportingText: ReactNode;
    enabled: boolean;
    colors: ComposeSelectableMenuItemColorsValue;
    horizontalArrangement: ComposeHorizontalArrangement;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    leadingIcon?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    text: ReactNode;
    shapes: ComposeMenuItemShapesValue;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    leadingIcon: ReactNode;
    trailingContent: ReactNode;
    supportingText: ReactNode;
    enabled: boolean;
    colors: ComposeSelectableMenuItemColorsValue;
    horizontalArrangement: ComposeHorizontalArrangement;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    checkedLeadingIcon?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    text: ReactNode;
    shapes: ComposeMenuItemShapesValue;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    leadingIcon: ReactNode;
    checkedLeadingIcon: ReactNode;
    supportingText: ReactNode;
    enabled: boolean;
    colors: ComposeSelectableMenuItemColorsValue;
    horizontalArrangement: ComposeHorizontalArrangement;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    trailingContent?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    text: ReactNode;
    shapes: ComposeMenuItemShapesValue;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    leadingIcon: ReactNode;
    checkedLeadingIcon: ReactNode;
    trailingContent: ReactNode;
    enabled: boolean;
    colors: ComposeSelectableMenuItemColorsValue;
    horizontalArrangement: ComposeHorizontalArrangement;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    supportingText?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    text: ReactNode;
    shapes: ComposeMenuItemShapesValue;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    leadingIcon: ReactNode;
    checkedLeadingIcon: ReactNode;
    trailingContent: ReactNode;
    supportingText: ReactNode;
    colors: ComposeSelectableMenuItemColorsValue;
    horizontalArrangement: ComposeHorizontalArrangement;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    enabled?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    text: ReactNode;
    shapes: ComposeMenuItemShapesValue;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    leadingIcon: ReactNode;
    checkedLeadingIcon: ReactNode;
    trailingContent: ReactNode;
    supportingText: ReactNode;
    enabled: boolean;
    colors: ComposeSelectableMenuItemColorsValue;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    horizontalArrangement?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    text: ReactNode;
    shapes: ComposeMenuItemShapesValue;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    leadingIcon: ReactNode;
    checkedLeadingIcon: ReactNode;
    trailingContent: ReactNode;
    supportingText: ReactNode;
    enabled: boolean;
    colors: ComposeSelectableMenuItemColorsValue;
    horizontalArrangement: ComposeHorizontalArrangement;
    interactionSource: ComposeInteractionSource | null;
    contentPadding?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    text: ReactNode;
    shapes: ComposeMenuItemShapesValue;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    leadingIcon: ReactNode;
    checkedLeadingIcon: ReactNode;
    trailingContent: ReactNode;
    supportingText: ReactNode;
    enabled: boolean;
    colors: ComposeSelectableMenuItemColorsValue;
    horizontalArrangement: ComposeHorizontalArrangement;
    contentPadding: ComposePaddingValues;
    interactionSource?: ComposeInteractionSource | null;
    }
;
export const CheckableDropdownMenuItem = createComposableComponent<CheckableDropdownMenuItemProps>({
  name: "CheckableDropdownMenuItem",
  props: ["checked","shapes","modifier","enabled","colors","horizontalArrangement","contentPadding","interactionSource"],
  objectProps: ["shapes","colors","contentPadding","interactionSource"],
  slots: ["text","leadingIcon","checkedLeadingIcon","trailingContent","supportingText"],
  events: ["onCheckedChange"],
  children: false,
  overloads: [
    { id: "CheckableDropdownMenuItem", children: false, parameters: [["checked","boolean",false,false],["onCheckedChange","function",false,false],["text","ReactNode",false,false],["shapes","object",false,false],["modifier","ComposeModifier",true,false],["leadingIcon","ReactNode",true,true],["checkedLeadingIcon","ReactNode",true,true],["trailingContent","ReactNode",true,true],["supportingText","ReactNode",true,true],["enabled","boolean",true,false],["colors","object",true,false],["horizontalArrangement","string",true,false],["contentPadding","object",true,false],["interactionSource","object",true,true]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,128,129,130,131,132,133,134,135,136,137,138,139,140,141,142,143,144,145,146,147,148,149,150,151,152,153,154,155,156,157,158,159,192,193,194,195,196,197,198,199,200,201,202,203,204,205,206,207,208,209,210,211,212,213,214,215,216,217,218,219,220,221,222,223,255,256,257,258,259,260,261,262,263,264,265,266,267,268,269,270,271,272,273,274,275,276,277,278,279,280,281,282,283,284,285,286,287,320,321,322,323,324,325,326,327,328,329,330,331,332,333,334,335,336,337,338,339,340,341,342,343,344,345,346,347,348,349,350,351,383,384,385,386,387,388,389,390,391,392,393,394,395,396,397,398,399,400,401,402,403,404,405,406,407,408,409,410,411,412,413,414,415,447,448,449,450,451,452,453,454,455,456,457,458,459,460,461,462,463,464,465,466,467,468,469,470,471,472,473,474,475,476,477,478,479,495,503,507,509,510,511] },
  ],
});
