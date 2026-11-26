// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeShape } from "../../utils/modifier";
import type { ComposeFloatingActionButtonElevationValue } from "../values/records";
import type { ComposeInteractionSource } from "../../utils/nativeHandles";

export type ExtendedFloatingActionButtonProps =
  | {
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    shape?: ComposeShape;
    containerColor?: string;
    contentColor?: string;
    elevation?: ComposeFloatingActionButtonElevationValue;
    interactionSource?: ComposeInteractionSource | null;
    children?: ReactNode;
    text?: never;
    icon?: never;
    expanded?: never;
    }
  | {
    text: ReactNode;
    icon: ReactNode;
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    expanded?: boolean;
    shape?: ComposeShape;
    containerColor?: string;
    contentColor?: string;
    elevation?: ComposeFloatingActionButtonElevationValue;
    interactionSource?: ComposeInteractionSource | null;
    children?: never;
    }
;
export const ExtendedFloatingActionButton = createComposableComponent<ExtendedFloatingActionButtonProps>({
  name: "ExtendedFloatingActionButton",
  props: ["modifier","shape","containerColor","contentColor","elevation","interactionSource","expanded"],
  objectProps: ["shape","elevation","interactionSource"],
  slots: ["text","icon"],
  events: ["onClick"],
  children: true,
  overloads: [
    { id: "ExtendedFloatingActionButton", children: true, parameters: [["onClick","function",false,false],["modifier","ComposeModifier",true,false],["shape","shape",true,false],["containerColor","string",true,false],["contentColor","string",true,false],["elevation","object",true,false],["interactionSource","object",true,true]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31] },
    { id: "ExtendedFloatingActionButton#1", children: false, parameters: [["text","ReactNode",false,false],["icon","ReactNode",false,false],["onClick","function",false,false],["modifier","ComposeModifier",true,false],["expanded","boolean",true,false],["shape","shape",true,false],["containerColor","string",true,false],["contentColor","string",true,false],["elevation","object",true,false],["interactionSource","object",true,true]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63] },
  ],
});
