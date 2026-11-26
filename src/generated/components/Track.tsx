// Generated from Compose declarations by generate.mjs.
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeRangeSliderState, ComposeSliderState } from "../../utils/nativeHandles";
import type { ComposeSliderColorsValue } from "../values/records";

export type TrackProps =
  | {
    rangeSliderState: ComposeRangeSliderState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    colors?: ComposeSliderColorsValue;
    thumbTrackGapSize?: number;
    trackInsideCornerSize?: number;
    sliderState?: never;
    trackCornerSize?: never;
    }
  | {
    sliderState: ComposeSliderState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    colors?: ComposeSliderColorsValue;
    thumbTrackGapSize?: number;
    trackInsideCornerSize?: number;
    rangeSliderState?: never;
    trackCornerSize?: never;
    }
  | {
    rangeSliderState: ComposeRangeSliderState;
    trackCornerSize: number;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    colors?: ComposeSliderColorsValue;
    thumbTrackGapSize?: number;
    trackInsideCornerSize?: number;
    sliderState?: never;
    }
  | {
    sliderState: ComposeSliderState;
    trackCornerSize: number;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    colors?: ComposeSliderColorsValue;
    thumbTrackGapSize?: number;
    trackInsideCornerSize?: number;
    rangeSliderState?: never;
    }
;
export const Track = createComposableComponent<TrackProps>({
  name: "Track",
  props: ["rangeSliderState","modifier","enabled","colors","thumbTrackGapSize","trackInsideCornerSize","sliderState","trackCornerSize"],
  objectProps: ["rangeSliderState","colors","sliderState"],
  children: false,
  overloads: [
    { id: "Track", children: false, parameters: [["rangeSliderState","object",false,false],["modifier","ComposeModifier",true,false],["enabled","boolean",true,false],["colors","object",true,false],["thumbTrackGapSize","number",true,false],["trackInsideCornerSize","number",true,false]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15] },
    { id: "Track#1", children: false, parameters: [["sliderState","object",false,false],["modifier","ComposeModifier",true,false],["enabled","boolean",true,false],["colors","object",true,false],["thumbTrackGapSize","number",true,false],["trackInsideCornerSize","number",true,false]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15] },
    { id: "Track#2", children: false, parameters: [["rangeSliderState","object",false,false],["trackCornerSize","number",false,false],["modifier","ComposeModifier",true,false],["enabled","boolean",true,false],["colors","object",true,false],["thumbTrackGapSize","number",true,false],["trackInsideCornerSize","number",true,false]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15] },
    { id: "Track#3", children: false, parameters: [["sliderState","object",false,false],["trackCornerSize","number",false,false],["modifier","ComposeModifier",true,false],["enabled","boolean",true,false],["colors","object",true,false],["thumbTrackGapSize","number",true,false],["trackInsideCornerSize","number",true,false]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15] },
  ],
});
