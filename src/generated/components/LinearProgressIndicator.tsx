// Generated from Compose declarations by generate.mjs.
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeDrawing } from "../../utils/composeValues";
import type { ComposeStrokeCapValue } from "../values/enums";

export type LinearProgressIndicatorProps =
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color?: string;
    trackColor?: string;
    strokeCap?: ComposeStrokeCapValue;
    gapSize?: number;
    progress?: never;
    drawStopIndicator?: never;
    }
  | {
    progress: number;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color?: string;
    trackColor?: string;
    strokeCap?: ComposeStrokeCapValue;
    gapSize?: number;
    drawStopIndicator?: ComposeDrawing;
    }
;
export const LinearProgressIndicator = createComposableComponent<LinearProgressIndicatorProps>({
  name: "LinearProgressIndicator",
  props: ["modifier","color","trackColor","strokeCap","gapSize","progress","drawStopIndicator"],
  objectProps: ["drawStopIndicator"],
  children: false,
  overloads: [
    { id: "LinearProgressIndicator", children: false, parameters: [["modifier","ComposeModifier",true,false],["color","string",true,false],["trackColor","string",true,false],["strokeCap","string",true,false],["gapSize","number",true,false]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15] },
    { id: "LinearProgressIndicator#1", children: false, parameters: [["progress","number",false,false],["modifier","ComposeModifier",true,false],["color","string",true,false],["trackColor","string",true,false],["strokeCap","string",true,false],["gapSize","number",true,false],["drawStopIndicator","object",true,false]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31] },
  ],
});
