// Generated from Compose declarations by generate.mjs.
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeStrokeCapValue } from "../values/enums";

export type CircularProgressIndicatorProps =
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color?: string;
    strokeWidth?: number;
    trackColor?: string;
    strokeCap?: ComposeStrokeCapValue;
    gapSize?: number;
    progress?: never;
    }
  | {
    progress: number;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color?: string;
    strokeWidth?: number;
    trackColor?: string;
    strokeCap?: ComposeStrokeCapValue;
    gapSize?: number;
    }
;
export const CircularProgressIndicator = createComposableComponent<CircularProgressIndicatorProps>({
  name: "CircularProgressIndicator",
  props: ["modifier","color","strokeWidth","trackColor","strokeCap","gapSize","progress"],
  children: false,
  overloads: [
    { id: "CircularProgressIndicator", children: false, parameters: [["modifier","ComposeModifier",true,false],["color","string",true,false],["strokeWidth","number",true,false],["trackColor","string",true,false],["strokeCap","string",true,false],["gapSize","number",true,false]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31] },
    { id: "CircularProgressIndicator#1", children: false, parameters: [["progress","number",false,false],["modifier","ComposeModifier",true,false],["color","string",true,false],["strokeWidth","number",true,false],["trackColor","string",true,false],["strokeCap","string",true,false],["gapSize","number",true,false]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31] },
  ],
});
