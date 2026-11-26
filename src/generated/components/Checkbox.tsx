// Generated from Compose declarations by generate.mjs.
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeCheckboxColorsValue, ComposeStrokeValue } from "../values/records";
import type { ComposeInteractionSource } from "../../utils/nativeHandles";

export type CheckboxProps =
  | {
    checked: boolean;
    onCheckedChange: ((value: boolean) => void) | null;
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
    checked: boolean;
    onCheckedChange: ((value: boolean) => void) | null;
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
export const Checkbox = createComposableComponent<CheckboxProps>({
  name: "Checkbox",
  props: ["checked","modifier","enabled","colors","interactionSource","checkmarkStroke","outlineStroke"],
  objectProps: ["colors","interactionSource","checkmarkStroke","outlineStroke"],
  events: ["onCheckedChange"],
  children: false,
  overloads: [
    { id: "Checkbox", children: false, parameters: [["checked","boolean",false,false],["onCheckedChange","function",false,true],["modifier","ComposeModifier",true,false],["enabled","boolean",true,false],["colors","object",true,false],["interactionSource","object",true,true]], masks: [0,1,2,3,4,5,6,7] },
    { id: "Checkbox#1", children: false, parameters: [["checked","boolean",false,false],["onCheckedChange","function",false,true],["checkmarkStroke","object",false,false],["outlineStroke","object",false,false],["modifier","ComposeModifier",true,false],["enabled","boolean",true,false],["colors","object",true,false],["interactionSource","object",true,true]], masks: [0,1,2,3,4,5,6,7] },
  ],
});
