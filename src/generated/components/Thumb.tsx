// Generated from Compose declarations by generate.mjs.
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeInteractionSource } from "../../utils/nativeHandles";
import type { ComposeSliderColorsValue } from "../values/records";
import type { ComposeDpSize } from "../../utils/composeValues";

export type ThumbProps =
  | {
    interactionSource: ComposeInteractionSource;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    colors?: ComposeSliderColorsValue;
    enabled?: boolean;
    thumbSize?: ComposeDpSize;
    isVertical?: never;
    }
  | {
    interactionSource: ComposeInteractionSource;
    isVertical: boolean;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    colors?: ComposeSliderColorsValue;
    enabled?: boolean;
    thumbSize?: ComposeDpSize;
    }
;
export const Thumb = createComposableComponent<ThumbProps>({
  name: "Thumb",
  props: ["interactionSource","modifier","colors","enabled","thumbSize","isVertical"],
  objectProps: ["interactionSource","colors","thumbSize"],
  children: false,
  overloads: [
    { id: "Thumb", children: false, parameters: [["interactionSource","object",false,false],["modifier","ComposeModifier",true,false],["colors","object",true,false],["enabled","boolean",true,false],["thumbSize","object",true,false]], masks: [0,1,2,3,4,5,6,7] },
    { id: "Thumb#1", children: false, parameters: [["interactionSource","object",false,false],["isVertical","boolean",false,false],["modifier","ComposeModifier",true,false],["colors","object",true,false],["enabled","boolean",true,false],["thumbSize","object",true,false]], masks: [0,1,2,3,4,5,6,7] },
  ],
});
