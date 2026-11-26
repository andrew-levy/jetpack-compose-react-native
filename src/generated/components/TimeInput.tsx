// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeTimePickerState } from "../../utils/composeValues";
import type { ComposeTimeInputColorsValue, ComposeTimePickerShapesValue } from "../values/records";

export type TimeInputProps =
  | {
    state: ComposeTimePickerState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    colors?: ComposeTimeInputColorsValue;
    shapes?: never;
    toggle?: never;
    }
  | {
    state: ComposeTimePickerState;
    shapes: ComposeTimePickerShapesValue;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    colors?: ComposeTimeInputColorsValue;
    toggle?: never;
    }
  | {
    state: ComposeTimePickerState;
    shapes: ComposeTimePickerShapesValue;
    toggle: ReactNode;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    colors?: ComposeTimeInputColorsValue;
    }
;
export const TimeInput = createComposableComponent<TimeInputProps>({
  name: "TimeInput",
  props: ["state","modifier","colors","shapes"],
  objectProps: ["state","colors","shapes"],
  slots: ["toggle"],
  children: false,
  overloads: [
    { id: "TimeInput", children: false, parameters: [["state","object",false,false],["modifier","ComposeModifier",true,false],["colors","object",true,false]], masks: [0,1] },
    { id: "TimeInput#1", children: false, parameters: [["state","object",false,false],["shapes","object",false,false],["modifier","ComposeModifier",true,false],["colors","object",true,false]], masks: [0,1] },
    { id: "TimeInput#2", children: false, parameters: [["state","object",false,false],["shapes","object",false,false],["toggle","ReactNode",false,false],["modifier","ComposeModifier",true,false],["colors","object",true,false]], masks: [0,1] },
  ],
});
