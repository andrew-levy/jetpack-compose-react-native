// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeShape } from "../../utils/modifier";
import type { ComposeChipColorsValue, ComposeChipElevationValue } from "../values/records";
import type { ComposeBorderStroke, ComposePaddingValues } from "../../utils/composeValues";
import type { ComposeInteractionSource } from "../../utils/nativeHandles";
import type { ComposeHorizontalArrangement } from "../values/enums";

export type AssistChipProps =
  | {
    onClick: () => void;
    label: ReactNode;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    leadingIcon?: ReactNode;
    trailingIcon?: ReactNode;
    shape?: ComposeShape;
    horizontalArrangement?: ComposeHorizontalArrangement;
    contentPadding?: ComposePaddingValues;
    interactionSource?: ComposeInteractionSource | null;
    colors?: never;
    elevation?: never;
    border?: never;
    }
  | {
    onClick: () => void;
    label: ReactNode;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    leadingIcon?: ReactNode;
    trailingIcon?: ReactNode;
    shape?: ComposeShape;
    border: ComposeBorderStroke | null;
    interactionSource?: ComposeInteractionSource | null;
    colors?: never;
    elevation?: never;
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
    leadingIcon?: ReactNode;
    trailingIcon?: ReactNode;
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
    leadingIcon?: ReactNode;
    trailingIcon?: ReactNode;
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
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    shape: ComposeShape;
    border: ComposeBorderStroke | null;
    horizontalArrangement: ComposeHorizontalArrangement;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    enabled?: never;
    colors?: never;
    elevation?: never;
    }
  | {
    onClick: () => void;
    label: ReactNode;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
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
    trailingIcon: ReactNode;
    shape: ComposeShape;
    border: ComposeBorderStroke | null;
    horizontalArrangement: ComposeHorizontalArrangement;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    leadingIcon?: never;
    colors?: never;
    elevation?: never;
    }
  | {
    onClick: () => void;
    label: ReactNode;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    trailingIcon: ReactNode;
    shape: ComposeShape;
    colors: ComposeChipColorsValue;
    elevation: ComposeChipElevationValue | null;
    border: ComposeBorderStroke | null;
    horizontalArrangement: ComposeHorizontalArrangement;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    leadingIcon?: never;
    }
  | {
    onClick: () => void;
    label: ReactNode;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingIcon: ReactNode;
    shape: ComposeShape;
    border: ComposeBorderStroke | null;
    horizontalArrangement: ComposeHorizontalArrangement;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    trailingIcon?: never;
    colors?: never;
    elevation?: never;
    }
  | {
    onClick: () => void;
    label: ReactNode;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingIcon: ReactNode;
    shape: ComposeShape;
    colors: ComposeChipColorsValue;
    elevation: ComposeChipElevationValue | null;
    border: ComposeBorderStroke | null;
    horizontalArrangement: ComposeHorizontalArrangement;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    trailingIcon?: never;
    }
  | {
    onClick: () => void;
    label: ReactNode;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    border: ComposeBorderStroke | null;
    horizontalArrangement: ComposeHorizontalArrangement;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    shape?: never;
    colors?: never;
    elevation?: never;
    }
  | {
    onClick: () => void;
    label: ReactNode;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
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
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    shape: ComposeShape;
    border: ComposeBorderStroke | null;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    colors?: never;
    elevation?: never;
    horizontalArrangement?: never;
    }
  | {
    onClick: () => void;
    label: ReactNode;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    shape: ComposeShape;
    border: ComposeBorderStroke | null;
    horizontalArrangement: ComposeHorizontalArrangement;
    interactionSource: ComposeInteractionSource | null;
    colors?: never;
    elevation?: never;
    contentPadding?: never;
    }
  | {
    onClick: () => void;
    label: ReactNode;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    shape: ComposeShape;
    border: ComposeBorderStroke | null;
    horizontalArrangement: ComposeHorizontalArrangement;
    contentPadding: ComposePaddingValues;
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
    enabled: boolean;
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
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
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
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
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
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
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
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
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
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
    leadingIcon: ReactNode;
    trailingIcon: ReactNode;
    shape: ComposeShape;
    colors: ComposeChipColorsValue;
    elevation: ComposeChipElevationValue | null;
    border: ComposeBorderStroke | null;
    horizontalArrangement: ComposeHorizontalArrangement;
    contentPadding: ComposePaddingValues;
    interactionSource?: ComposeInteractionSource | null;
    }
;
export const AssistChip = createComposableComponent<AssistChipProps>({
  name: "AssistChip",
  props: ["modifier","enabled","shape","colors","elevation","border","horizontalArrangement","contentPadding","interactionSource"],
  objectProps: ["shape","colors","elevation","border","contentPadding","interactionSource"],
  slots: ["label","leadingIcon","trailingIcon"],
  events: ["onClick"],
  children: false,
  overloads: [
    { id: "AssistChip", children: false, parameters: [["onClick","function",false,false],["label","ReactNode",false,false],["modifier","ComposeModifier",true,false],["enabled","boolean",true,false],["leadingIcon","ReactNode",true,true],["trailingIcon","ReactNode",true,true],["shape","shape",true,false],["colors","object",true,false],["elevation","object",true,true],["border","object",true,true],["horizontalArrangement","string",true,false],["contentPadding","object",true,false],["interactionSource","object",true,true]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,123,124,125,126,127,128,129,130,131,132,133,134,135,136,137,138,139,140,141,142,143,256,257,258,259,260,261,262,263,264,265,266,267,268,269,270,271,384,385,386,387,388,389,390,391,392,393,394,395,396,397,398,399,463,511,512,513,514,515,516,517,518,519,520,521,522,523,524,525,526,527,528,529,530,531,532,533,534,535,536,537,538,539,540,541,542,543,544,545,546,547,548,549,550,551,552,553,554,555,556,557,558,559,560,561,562,563,564,565,566,567,568,569,570,571,572,573,574,575,576,577,578,579,580,581,582,583,584,585,586,587,588,589,590,591,592,593,594,595,596,597,598,599,600,601,602,603,604,605,606,607,608,609,610,611,612,613,614,615,616,617,618,619,620,621,622,623,624,625,626,627,628,629,630,631,632,633,634,635,636,637,638,639,640,641,642,643,644,645,646,647,648,649,650,651,652,653,654,655,719,767,768,769,770,771,772,773,774,775,776,777,778,779,780,781,782,783,847,895,896,897,898,899,900,901,902,903,904,905,906,907,908,909,910,911,959,967,971,973,974,975,991,1007,1015,1019,1021,1022,1023] },
  ],
});
