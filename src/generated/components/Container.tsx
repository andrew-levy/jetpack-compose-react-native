// Generated from Compose declarations by generate.mjs.
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeShape } from "../../utils/modifier";
import type { ComposeInteractionSource } from "../../utils/nativeHandles";
import type { ComposeTextFieldColorsValue } from "../values/records";

export type ContainerProps =
  | {
    enabled: boolean;
    isError: boolean;
    interactionSource: ComposeInteractionSource;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    colors?: ComposeTextFieldColorsValue;
    shape?: ComposeShape;
    focusedBorderThickness?: number;
    unfocusedBorderThickness?: number;
    focusedIndicatorLineThickness?: never;
    unfocusedIndicatorLineThickness?: never;
    }
  | {
    enabled: boolean;
    isError: boolean;
    interactionSource: ComposeInteractionSource;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    colors?: ComposeTextFieldColorsValue;
    shape?: ComposeShape;
    unfocusedIndicatorLineThickness: number;
    focusedBorderThickness?: never;
    unfocusedBorderThickness?: never;
    focusedIndicatorLineThickness?: never;
    }
  | {
    enabled: boolean;
    isError: boolean;
    interactionSource: ComposeInteractionSource;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    colors?: ComposeTextFieldColorsValue;
    shape?: ComposeShape;
    focusedIndicatorLineThickness: number;
    unfocusedIndicatorLineThickness?: number;
    focusedBorderThickness?: never;
    unfocusedBorderThickness?: never;
    }
;
export const Container = createComposableComponent<ContainerProps>({
  name: "Container",
  props: ["enabled","isError","interactionSource","modifier","colors","shape","focusedBorderThickness","unfocusedBorderThickness","focusedIndicatorLineThickness","unfocusedIndicatorLineThickness"],
  objectProps: ["interactionSource","colors","shape"],
  children: false,
  overloads: [
    { id: "Container", children: false, parameters: [["enabled","boolean",false,false],["isError","boolean",false,false],["interactionSource","object",false,false],["modifier","ComposeModifier",true,false],["colors","object",true,false],["shape","shape",true,false],["focusedBorderThickness","number",true,false],["unfocusedBorderThickness","number",true,false]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15] },
    { id: "Container#1", children: false, parameters: [["enabled","boolean",false,false],["isError","boolean",false,false],["interactionSource","object",false,false],["modifier","ComposeModifier",true,false],["colors","object",true,false],["shape","shape",true,false],["focusedIndicatorLineThickness","number",true,false],["unfocusedIndicatorLineThickness","number",true,false]], masks: [4,5,6,7,8,9,10,11,12,13,14,15] },
  ],
});
