// Generated from Compose declarations by generate.mjs.
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeTimePickerState } from "../../utils/composeValues";
import type { ComposeTimePickerColorsValue, ComposeTimePickerShapesValue } from "../values/records";
import type { ComposeTimePickerLayoutTypeValue } from "../values/enums";

export type TimePickerProps =
  | {
    state: ComposeTimePickerState;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    colors?: ComposeTimePickerColorsValue;
    layoutType?: ComposeTimePickerLayoutTypeValue;
    shapes?: never;
    }
  | {
    state: ComposeTimePickerState;
    shapes: ComposeTimePickerShapesValue;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    colors?: ComposeTimePickerColorsValue;
    layoutType?: ComposeTimePickerLayoutTypeValue;
    }
;
export const TimePicker = createComposableComponent<TimePickerProps>({
  name: "TimePicker",
  props: ["state","modifier","colors","layoutType","shapes"],
  objectProps: ["state","colors","shapes"],
  children: false,
  overloads: [
    { id: "TimePicker", children: false, parameters: [["state","object",false,false],["modifier","ComposeModifier",true,false],["colors","object",true,false],["layoutType","string",true,false]], masks: [0,1,2,3] },
    { id: "TimePicker#1", children: false, parameters: [["state","object",false,false],["shapes","object",false,false],["modifier","ComposeModifier",true,false],["colors","object",true,false],["layoutType","string",true,false]], masks: [0,1,2,3] },
  ],
});
