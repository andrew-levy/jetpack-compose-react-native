// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeShape } from "../../utils/modifier";
import type { ComposeButtonColorsValue, ComposeButtonElevationValue, ComposeButtonShapesValue } from "../values/records";
import type { ComposeBorderStroke, ComposePaddingValues } from "../../utils/composeValues";
import type { ComposeInteractionSource } from "../../utils/nativeHandles";

export type TextButtonProps =
  | {
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    shape?: ComposeShape;
    colors?: ComposeButtonColorsValue;
    elevation?: ComposeButtonElevationValue | null;
    border?: ComposeBorderStroke | null;
    contentPadding?: ComposePaddingValues;
    interactionSource?: ComposeInteractionSource | null;
    children?: ReactNode;
    shapes?: never;
    }
  | {
    onClick: () => void;
    shapes: ComposeButtonShapesValue;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    colors?: ComposeButtonColorsValue;
    elevation?: ComposeButtonElevationValue | null;
    border?: ComposeBorderStroke | null;
    contentPadding?: ComposePaddingValues;
    interactionSource?: ComposeInteractionSource | null;
    children?: ReactNode;
    shape?: never;
    }
;
export const TextButton = createComposableComponent<TextButtonProps>({
  name: "TextButton",
  props: ["modifier","enabled","shape","colors","elevation","border","contentPadding","interactionSource","shapes"],
  objectProps: ["shape","colors","elevation","border","contentPadding","interactionSource","shapes"],
  events: ["onClick"],
  children: true,
  overloads: [
    { id: "TextButton", children: true, parameters: [["onClick","function",false,false],["modifier","ComposeModifier",true,false],["enabled","boolean",true,false],["shape","shape",true,false],["colors","object",true,false],["elevation","object",true,true],["border","object",true,true],["contentPadding","object",true,false],["interactionSource","object",true,true]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,123,124,125,126,127] },
    { id: "TextButton#1", children: true, parameters: [["onClick","function",false,false],["shapes","object",false,false],["modifier","ComposeModifier",true,false],["enabled","boolean",true,false],["colors","object",true,false],["elevation","object",true,true],["border","object",true,true],["contentPadding","object",true,false],["interactionSource","object",true,true]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63] },
  ],
});
