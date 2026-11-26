// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeInteractionSource, ComposeSliderState } from "../../utils/nativeHandles";
import type { ComposeSliderColorsValue } from "../values/records";
import type { ComposeFloatRange } from "./shared";

export type SliderProps =
  | {
    state: ComposeSliderState;
    onValueChange: (value: number) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    onValueChangeFinished?: (() => void) | null;
    colors?: ComposeSliderColorsValue;
    interactionSource?: ComposeInteractionSource;
    thumb?: ReactNode;
    track?: ReactNode;
    value?: never;
    valueRange?: never;
    steps?: never;
    }
  | {
    value: number;
    onValueChange: (value: number) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    valueRange?: ComposeFloatRange;
    steps?: number;
    onValueChangeFinished?: (() => void) | null;
    colors?: ComposeSliderColorsValue;
    interactionSource?: ComposeInteractionSource;
    state?: never;
    thumb?: never;
    track?: never;
    }
;
export const Slider = createComposableComponent<SliderProps>({
  name: "Slider",
  props: ["state","modifier","enabled","colors","interactionSource","value","valueRange","steps"],
  objectProps: ["state","colors","interactionSource","valueRange"],
  slots: ["thumb","track"],
  events: ["onValueChange","onValueChangeFinished"],
  children: false,
  overloads: [
    { id: "Slider", children: false, parameters: [["state","object",false,false],["onValueChange","function",false,false],["modifier","ComposeModifier",true,false],["enabled","boolean",true,false],["onValueChangeFinished","function",true,true],["colors","object",true,false],["interactionSource","object",true,false],["thumb","ReactNode",true,false],["track","ReactNode",true,false]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63] },
    { id: "Slider#1", children: false, parameters: [["value","number",false,false],["onValueChange","function",false,false],["modifier","ComposeModifier",true,false],["enabled","boolean",true,false],["valueRange","tuple",true,false],["steps","number",true,false],["onValueChangeFinished","function",true,true],["colors","object",true,false],["interactionSource","object",true,false]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63] },
  ],
});
