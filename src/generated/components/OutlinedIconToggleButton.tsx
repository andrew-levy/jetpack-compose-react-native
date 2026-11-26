// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeShape } from "../../utils/modifier";
import type { ComposeIconToggleButtonColorsValue, ComposeIconToggleButtonShapesValue } from "../values/records";
import type { ComposeBorderStroke } from "../../utils/composeValues";
import type { ComposeInteractionSource } from "../../utils/nativeHandles";

export type OutlinedIconToggleButtonProps =
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    shape?: ComposeShape;
    colors?: ComposeIconToggleButtonColorsValue;
    border?: ComposeBorderStroke | null;
    interactionSource?: ComposeInteractionSource | null;
    children?: ReactNode;
    shapes?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    shapes: ComposeIconToggleButtonShapesValue;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    colors?: ComposeIconToggleButtonColorsValue;
    border?: ComposeBorderStroke | null;
    interactionSource?: ComposeInteractionSource | null;
    children?: ReactNode;
    shape?: never;
    }
;
export const OutlinedIconToggleButton = createComposableComponent<OutlinedIconToggleButtonProps>({
  name: "OutlinedIconToggleButton",
  props: ["checked","modifier","enabled","shape","colors","border","interactionSource","shapes"],
  objectProps: ["shape","colors","border","interactionSource","shapes"],
  events: ["onCheckedChange"],
  children: true,
  overloads: [
    { id: "OutlinedIconToggleButton", children: true, parameters: [["checked","boolean",false,false],["onCheckedChange","function",false,false],["modifier","ComposeModifier",true,false],["enabled","boolean",true,false],["shape","shape",true,false],["colors","object",true,false],["border","object",true,true],["interactionSource","object",true,true]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31] },
    { id: "OutlinedIconToggleButton#1", children: true, parameters: [["checked","boolean",false,false],["onCheckedChange","function",false,false],["shapes","object",false,false],["modifier","ComposeModifier",true,false],["enabled","boolean",true,false],["colors","object",true,false],["border","object",true,true],["interactionSource","object",true,true]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15] },
  ],
});
