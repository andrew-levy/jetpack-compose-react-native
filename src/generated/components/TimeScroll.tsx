// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeTimePickerState } from "../../utils/composeValues";
import type { ComposeTimePickerColorsValue, ComposeTimePickerShapesValue } from "../values/records";

export type TimeScrollProps =
  | {
    state: ComposeTimePickerState;
    shapes: ComposeTimePickerShapesValue;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    colors?: ComposeTimePickerColorsValue;
    toggle?: never;
    }
  | {
    state: ComposeTimePickerState;
    shapes: ComposeTimePickerShapesValue;
    toggle: ReactNode;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    colors?: ComposeTimePickerColorsValue;
    }
;
export const TimeScroll = createComposableComponent<TimeScrollProps>({
  name: "TimeScroll",
  props: ["state","shapes","modifier","colors"],
  objectProps: ["state","shapes","colors"],
  slots: ["toggle"],
  children: false,
  overloads: [
    { id: "TimeScroll", children: false, parameters: [["state","object",false,false],["shapes","object",false,false],["modifier","ComposeModifier",true,false],["colors","object",true,false]], masks: [0,1] },
    { id: "TimeScroll#1", children: false, parameters: [["state","object",false,false],["shapes","object",false,false],["toggle","ReactNode",false,false],["modifier","ComposeModifier",true,false],["colors","object",true,false]], masks: [0,1] },
  ],
});
