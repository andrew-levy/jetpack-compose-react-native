// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeShape } from "../../utils/modifier";
import type { ComposeCardColorsValue, ComposeCardElevationValue } from "../values/records";
import type { ComposeBorderStroke } from "../../utils/composeValues";
import type { ComposeInteractionSource } from "../../utils/nativeHandles";

export type OutlinedCardProps =
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    shape?: ComposeShape;
    colors?: ComposeCardColorsValue;
    elevation?: ComposeCardElevationValue;
    border?: ComposeBorderStroke;
    children?: ReactNode;
    onClick?: never;
    enabled?: never;
    interactionSource?: never;
    }
  | {
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    shape?: ComposeShape;
    colors?: ComposeCardColorsValue;
    elevation?: ComposeCardElevationValue;
    border?: ComposeBorderStroke;
    interactionSource?: ComposeInteractionSource | null;
    children?: ReactNode;
    }
;
export const OutlinedCard = createComposableComponent<OutlinedCardProps>({
  name: "OutlinedCard",
  props: ["modifier","shape","colors","elevation","border","enabled","interactionSource"],
  objectProps: ["shape","colors","elevation","border","interactionSource"],
  events: ["onClick"],
  children: true,
  overloads: [
    { id: "OutlinedCard", children: true, parameters: [["modifier","ComposeModifier",true,false],["shape","shape",true,false],["colors","object",true,false],["elevation","object",true,false],["border","object",true,false]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15] },
    { id: "OutlinedCard#1", children: true, parameters: [["onClick","function",false,false],["modifier","ComposeModifier",true,false],["enabled","boolean",true,false],["shape","shape",true,false],["colors","object",true,false],["elevation","object",true,false],["border","object",true,false],["interactionSource","object",true,true]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63] },
  ],
});
