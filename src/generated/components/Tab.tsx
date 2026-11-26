// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeInteractionSource } from "../../utils/nativeHandles";

export type TabProps =
  | {
    selected: boolean;
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    text?: ReactNode;
    icon?: ReactNode;
    selectedContentColor?: string;
    unselectedContentColor?: string;
    interactionSource?: ComposeInteractionSource | null;
    children?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    selectedContentColor?: string;
    unselectedContentColor?: string;
    interactionSource?: ComposeInteractionSource | null;
    children?: ReactNode;
    text?: never;
    icon?: never;
    }
;
export const Tab = createComposableComponent<TabProps>({
  name: "Tab",
  props: ["selected","modifier","enabled","selectedContentColor","unselectedContentColor","interactionSource"],
  objectProps: ["interactionSource"],
  slots: ["text","icon"],
  events: ["onClick"],
  children: true,
  overloads: [
    { id: "Tab", children: false, parameters: [["selected","boolean",false,false],["onClick","function",false,false],["modifier","ComposeModifier",true,false],["enabled","boolean",true,false],["text","ReactNode",true,true],["icon","ReactNode",true,true],["selectedContentColor","string",true,false],["unselectedContentColor","string",true,false],["interactionSource","object",true,true]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63] },
    { id: "Tab#1", children: true, parameters: [["selected","boolean",false,false],["onClick","function",false,false],["modifier","ComposeModifier",true,false],["enabled","boolean",true,false],["selectedContentColor","string",true,false],["unselectedContentColor","string",true,false],["interactionSource","object",true,true]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15] },
  ],
});
