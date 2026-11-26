// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeShape } from "../../utils/modifier";
import type { ComposeChipColorsValue, ComposeChipElevationValue } from "../values/records";
import type { ComposeBorderStroke, ComposePaddingValues } from "../../utils/composeValues";
import type { ComposeInteractionSource } from "../../utils/nativeHandles";
import type { ComposeHorizontalArrangement } from "../values/enums";

export type ElevatedSuggestionChipProps =
  | {
    onClick: () => void;
    label: ReactNode;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    icon?: ReactNode;
    shape?: ComposeShape;
    border?: ComposeBorderStroke | null;
    horizontalArrangement?: ComposeHorizontalArrangement;
    contentPadding?: ComposePaddingValues;
    interactionSource?: ComposeInteractionSource | null;
    colors?: never;
    elevation?: never;
    }
  | {
    onClick: () => void;
    label: ReactNode;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    icon?: ReactNode;
    shape?: ComposeShape;
    elevation: ComposeChipElevationValue | null;
    border?: ComposeBorderStroke | null;
    interactionSource?: ComposeInteractionSource | null;
    colors?: never;
    horizontalArrangement?: never;
    contentPadding?: never;
    }
  | {
    onClick: () => void;
    label: ReactNode;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    icon?: ReactNode;
    shape?: ComposeShape;
    elevation: ComposeChipElevationValue | null;
    border?: ComposeBorderStroke | null;
    horizontalArrangement: ComposeHorizontalArrangement;
    colors?: never;
    contentPadding?: never;
    interactionSource?: never;
    }
  | {
    onClick: () => void;
    label: ReactNode;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    icon?: ReactNode;
    shape?: ComposeShape;
    colors: ComposeChipColorsValue;
    elevation?: ComposeChipElevationValue | null;
    border?: ComposeBorderStroke | null;
    interactionSource?: ComposeInteractionSource | null;
    horizontalArrangement?: never;
    contentPadding?: never;
    }
  | {
    onClick: () => void;
    label: ReactNode;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    icon?: ReactNode;
    shape?: ComposeShape;
    colors: ComposeChipColorsValue;
    border?: ComposeBorderStroke | null;
    horizontalArrangement: ComposeHorizontalArrangement;
    elevation?: never;
    contentPadding?: never;
    interactionSource?: never;
    }
  | {
    onClick: () => void;
    label: ReactNode;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    icon: ReactNode;
    shape: ComposeShape;
    colors: ComposeChipColorsValue;
    elevation: ComposeChipElevationValue | null;
    border: ComposeBorderStroke | null;
    horizontalArrangement: ComposeHorizontalArrangement;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    enabled?: never;
    }
  | {
    onClick: () => void;
    label: ReactNode;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    shape: ComposeShape;
    colors: ComposeChipColorsValue;
    elevation: ComposeChipElevationValue | null;
    border: ComposeBorderStroke | null;
    horizontalArrangement: ComposeHorizontalArrangement;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    icon?: never;
    }
  | {
    onClick: () => void;
    label: ReactNode;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    icon: ReactNode;
    colors: ComposeChipColorsValue;
    elevation: ComposeChipElevationValue | null;
    border: ComposeBorderStroke | null;
    horizontalArrangement: ComposeHorizontalArrangement;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    shape?: never;
    }
  | {
    onClick: () => void;
    label: ReactNode;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    icon: ReactNode;
    shape: ComposeShape;
    elevation: ComposeChipElevationValue | null;
    border: ComposeBorderStroke | null;
    horizontalArrangement: ComposeHorizontalArrangement;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    colors?: never;
    }
  | {
    onClick: () => void;
    label: ReactNode;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    icon: ReactNode;
    shape: ComposeShape;
    colors: ComposeChipColorsValue;
    border: ComposeBorderStroke | null;
    horizontalArrangement: ComposeHorizontalArrangement;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    elevation?: never;
    }
  | {
    onClick: () => void;
    label: ReactNode;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    icon: ReactNode;
    shape: ComposeShape;
    colors: ComposeChipColorsValue;
    elevation: ComposeChipElevationValue | null;
    horizontalArrangement: ComposeHorizontalArrangement;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    border?: never;
    }
  | {
    onClick: () => void;
    label: ReactNode;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    icon: ReactNode;
    shape: ComposeShape;
    colors: ComposeChipColorsValue;
    elevation: ComposeChipElevationValue | null;
    border: ComposeBorderStroke | null;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    horizontalArrangement?: never;
    }
  | {
    onClick: () => void;
    label: ReactNode;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    icon: ReactNode;
    shape: ComposeShape;
    colors: ComposeChipColorsValue;
    elevation: ComposeChipElevationValue | null;
    border: ComposeBorderStroke | null;
    horizontalArrangement: ComposeHorizontalArrangement;
    interactionSource: ComposeInteractionSource | null;
    contentPadding?: never;
    }
  | {
    onClick: () => void;
    label: ReactNode;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    icon: ReactNode;
    shape: ComposeShape;
    colors: ComposeChipColorsValue;
    elevation: ComposeChipElevationValue | null;
    border: ComposeBorderStroke | null;
    horizontalArrangement: ComposeHorizontalArrangement;
    contentPadding: ComposePaddingValues;
    interactionSource?: ComposeInteractionSource | null;
    }
;
export const ElevatedSuggestionChip = createComposableComponent<ElevatedSuggestionChipProps>({
  name: "ElevatedSuggestionChip",
  props: ["modifier","enabled","shape","colors","elevation","border","horizontalArrangement","contentPadding","interactionSource"],
  objectProps: ["shape","colors","elevation","border","contentPadding","interactionSource"],
  slots: ["label","icon"],
  events: ["onClick"],
  children: false,
  overloads: [
    { id: "ElevatedSuggestionChip", children: false, parameters: [["onClick","function",false,false],["label","ReactNode",false,false],["modifier","ComposeModifier",true,false],["enabled","boolean",true,false],["icon","ReactNode",true,true],["shape","shape",true,false],["colors","object",true,false],["elevation","object",true,true],["border","object",true,true],["horizontalArrangement","string",true,false],["contentPadding","object",true,false],["interactionSource","object",true,true]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,128,129,130,131,132,133,134,135,160,161,162,163,164,165,166,167,192,193,194,195,196,197,198,199,224,225,226,227,228,229,230,231,255,256,257,258,259,260,261,262,263,264,265,266,267,268,269,270,271,272,273,274,275,276,277,278,279,280,281,282,283,284,285,286,287,288,289,290,291,292,293,294,295,296,297,298,299,300,301,302,303,304,305,306,307,308,309,310,311,312,313,314,315,316,317,318,319,320,321,322,323,324,325,326,327,352,353,354,355,356,357,358,359,383,384,385,386,387,388,389,390,391,416,417,418,419,420,421,422,423,447,448,449,450,451,452,453,454,455,479,480,481,482,483,484,485,486,487,495,503,507,509,510,511] },
  ],
});
