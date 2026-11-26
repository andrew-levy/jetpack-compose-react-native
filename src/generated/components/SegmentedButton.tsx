// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeShape } from "../../utils/modifier";
import type { ComposeSegmentedButtonColorsValue } from "../values/records";
import type { ComposeBorderStroke, ComposePaddingValues } from "../../utils/composeValues";
import type { ComposeInteractionSource } from "../../utils/nativeHandles";

export type SegmentedButtonProps =
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    shape: ComposeShape;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    colors?: ComposeSegmentedButtonColorsValue;
    border?: ComposeBorderStroke;
    contentPadding?: ComposePaddingValues;
    interactionSource?: ComposeInteractionSource | null;
    icon?: ReactNode;
    label: ReactNode;
    selected?: never;
    onClick?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    shape: ComposeShape;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    colors?: ComposeSegmentedButtonColorsValue;
    border?: ComposeBorderStroke;
    contentPadding?: ComposePaddingValues;
    interactionSource?: ComposeInteractionSource | null;
    icon?: ReactNode;
    label: ReactNode;
    checked?: never;
    onCheckedChange?: never;
    }
;
export const SegmentedButton = createComposableComponent<SegmentedButtonProps>({
  name: "SegmentedButton",
  props: ["checked","shape","modifier","enabled","colors","border","contentPadding","interactionSource","selected"],
  objectProps: ["shape","colors","border","contentPadding","interactionSource"],
  slots: ["icon","label"],
  events: ["onCheckedChange","onClick"],
  children: false,
  overloads: [
    { id: "SegmentedButton", children: false, parameters: [["checked","boolean",false,false],["onCheckedChange","function",false,false],["shape","shape",false,false],["modifier","ComposeModifier",true,false],["enabled","boolean",true,false],["colors","object",true,false],["border","object",true,false],["contentPadding","object",true,false],["interactionSource","object",true,true],["icon","ReactNode",true,false],["label","ReactNode",false,false]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63] },
    { id: "SegmentedButton#1", children: false, parameters: [["selected","boolean",false,false],["onClick","function",false,false],["shape","shape",false,false],["modifier","ComposeModifier",true,false],["enabled","boolean",true,false],["colors","object",true,false],["border","object",true,false],["contentPadding","object",true,false],["interactionSource","object",true,true],["icon","ReactNode",true,false],["label","ReactNode",false,false]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63] },
  ],
});
