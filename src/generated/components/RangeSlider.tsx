// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeInteractionSource, ComposeRangeSliderState } from "../../utils/nativeHandles";
import type { ComposeFloatRange } from "./shared";
import type { ComposeSliderColorsValue } from "../values/records";

export type RangeSliderProps =
  | {
    state: ComposeRangeSliderState;
    onValueChange: (value: ComposeFloatRange) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    onValueChangeFinished?: (() => void) | null;
    colors?: ComposeSliderColorsValue;
    startThumbInteractionSource?: ComposeInteractionSource;
    endThumbInteractionSource?: ComposeInteractionSource;
    startThumb?: ReactNode;
    endThumb?: ReactNode;
    track?: ReactNode;
    value?: never;
    valueRange?: never;
    steps?: never;
    }
  | {
    value: ComposeFloatRange;
    onValueChange: (value: ComposeFloatRange) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    valueRange?: ComposeFloatRange;
    steps?: number;
    onValueChangeFinished?: (() => void) | null;
    colors?: ComposeSliderColorsValue;
    state?: never;
    startThumbInteractionSource?: never;
    endThumbInteractionSource?: never;
    startThumb?: never;
    endThumb?: never;
    track?: never;
    }
;
export const RangeSlider = createComposableComponent<RangeSliderProps>({
  name: "RangeSlider",
  props: ["state","modifier","enabled","colors","startThumbInteractionSource","endThumbInteractionSource","value","valueRange","steps"],
  objectProps: ["state","colors","startThumbInteractionSource","endThumbInteractionSource","value","valueRange"],
  slots: ["startThumb","endThumb","track"],
  events: ["onValueChange","onValueChangeFinished"],
  children: false,
  overloads: [
    { id: "RangeSlider", children: false, parameters: [["state","object",false,false],["onValueChange","function",false,false],["modifier","ComposeModifier",true,false],["enabled","boolean",true,false],["onValueChangeFinished","function",true,true],["colors","object",true,false],["startThumbInteractionSource","object",true,false],["endThumbInteractionSource","object",true,false],["startThumb","ReactNode",true,false],["endThumb","ReactNode",true,false],["track","ReactNode",true,false]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,123,124,125,126,127,128,129,130,131,132,133,134,135,136,137,138,139,140,141,142,143,144,145,146,147,148,149,150,151,152,153,154,155,156,157,158,159,160,161,162,163,164,165,166,167,168,169,170,171,172,173,174,175,176,177,178,179,180,181,182,183,184,185,186,187,188,189,190,191,192,193,194,195,196,197,198,199,200,201,202,203,204,205,206,207,208,209,210,211,212,213,214,215,216,217,218,219,220,221,222,223,224,225,226,227,228,229,230,231,232,233,234,235,236,237,238,239,240,241,242,243,244,245,246,247,248,249,250,251,252,253,254,255] },
    { id: "RangeSlider#1", children: false, parameters: [["value","tuple",false,false],["onValueChange","function",false,false],["modifier","ComposeModifier",true,false],["enabled","boolean",true,false],["valueRange","tuple",true,false],["steps","number",true,false],["onValueChangeFinished","function",true,true],["colors","object",true,false]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31] },
  ],
});
