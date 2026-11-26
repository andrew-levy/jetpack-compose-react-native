// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeShape } from "../../utils/modifier";
import type { ComposeIconButtonColorsValue, ComposeIconButtonShapesValue } from "../values/records";
import type { ComposeInteractionSource } from "../../utils/nativeHandles";

export type FilledIconButtonProps =
  | {
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    shape?: ComposeShape;
    colors?: ComposeIconButtonColorsValue;
    interactionSource?: ComposeInteractionSource | null;
    children?: ReactNode;
    shapes?: never;
    }
  | {
    onClick: () => void;
    shapes: ComposeIconButtonShapesValue;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    colors?: ComposeIconButtonColorsValue;
    interactionSource?: ComposeInteractionSource | null;
    children?: ReactNode;
    shape?: never;
    }
;
export const FilledIconButton = createComposableComponent<FilledIconButtonProps>({
  name: "FilledIconButton",
  props: ["modifier","enabled","shape","colors","interactionSource","shapes"],
  objectProps: ["shape","colors","interactionSource","shapes"],
  events: ["onClick"],
  children: true,
  overloads: [
    { id: "FilledIconButton", children: true, parameters: [["onClick","function",false,false],["modifier","ComposeModifier",true,false],["enabled","boolean",true,false],["shape","shape",true,false],["colors","object",true,false],["interactionSource","object",true,true]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15] },
    { id: "FilledIconButton#1", children: true, parameters: [["onClick","function",false,false],["shapes","object",false,false],["modifier","ComposeModifier",true,false],["enabled","boolean",true,false],["colors","object",true,false],["interactionSource","object",true,true]], masks: [0,1,2,3,4,5,6,7] },
  ],
});
