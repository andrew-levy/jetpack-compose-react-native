// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeShape } from "../../utils/modifier";
import type { ComposeIconToggleButtonColorsValue, ComposeIconToggleButtonShapesValue } from "../values/records";
import type { ComposeInteractionSource } from "../../utils/nativeHandles";

export type FilledTonalIconToggleButtonProps =
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    shape?: ComposeShape;
    colors?: ComposeIconToggleButtonColorsValue;
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
    interactionSource?: ComposeInteractionSource | null;
    children?: ReactNode;
    shape?: never;
    }
;
export const FilledTonalIconToggleButton = createComposableComponent<FilledTonalIconToggleButtonProps>({
  name: "FilledTonalIconToggleButton",
  props: ["checked","modifier","enabled","shape","colors","interactionSource","shapes"],
  objectProps: ["shape","colors","interactionSource","shapes"],
  events: ["onCheckedChange"],
  children: true,
  overloads: [
    { id: "FilledTonalIconToggleButton", children: true, parameters: [["checked","boolean",false,false],["onCheckedChange","function",false,false],["modifier","ComposeModifier",true,false],["enabled","boolean",true,false],["shape","shape",true,false],["colors","object",true,false],["interactionSource","object",true,true]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15] },
    { id: "FilledTonalIconToggleButton#1", children: true, parameters: [["checked","boolean",false,false],["onCheckedChange","function",false,false],["shapes","object",false,false],["modifier","ComposeModifier",true,false],["enabled","boolean",true,false],["colors","object",true,false],["interactionSource","object",true,true]], masks: [0,1,2,3,4,5,6,7] },
  ],
});
