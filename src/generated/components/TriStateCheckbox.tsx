// Generated from Compose declarations by generate.mjs.
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeCheckboxColorsValue, ComposeStrokeValue } from "../values/records";
import type { ComposeInteractionSource } from "../../utils/nativeHandles";
import type { ComposeToggleableState } from "../values/enums";

export type TriStateCheckboxProps =
  | {
    state: ComposeToggleableState;
    onClick: (() => void) | null;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    colors?: ComposeCheckboxColorsValue;
    interactionSource?: ComposeInteractionSource | null;
    checkmarkStroke?: never;
    outlineStroke?: never;
    }
  | {
    state: ComposeToggleableState;
    onClick: (() => void) | null;
    checkmarkStroke: ComposeStrokeValue;
    outlineStroke: ComposeStrokeValue;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    colors?: ComposeCheckboxColorsValue;
    interactionSource?: ComposeInteractionSource | null;
    }
;
export const TriStateCheckbox = createComposableComponent<TriStateCheckboxProps>({
  name: "TriStateCheckbox",
  props: ["state","modifier","enabled","colors","interactionSource","checkmarkStroke","outlineStroke"],
  objectProps: ["colors","interactionSource","checkmarkStroke","outlineStroke"],
  events: ["onClick"],
  children: false,
  overloads: [
    { id: "TriStateCheckbox", children: false, parameters: [["state","string",false,false],["onClick","function",false,true],["modifier","ComposeModifier",true,false],["enabled","boolean",true,false],["colors","object",true,false],["interactionSource","object",true,true]], masks: [0,1,2,3,4,5,6,7] },
    { id: "TriStateCheckbox#1", children: false, parameters: [["state","string",false,false],["onClick","function",false,true],["checkmarkStroke","object",false,false],["outlineStroke","object",false,false],["modifier","ComposeModifier",true,false],["enabled","boolean",true,false],["colors","object",true,false],["interactionSource","object",true,true]], masks: [0,1,2,3,4,5,6,7] },
  ],
});
