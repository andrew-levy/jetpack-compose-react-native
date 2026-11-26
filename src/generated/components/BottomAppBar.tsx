// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposePaddingValues, ComposeWindowInsets } from "../../utils/composeValues";
import type { ComposeBottomAppBarScrollBehaviorValue } from "../values/records";

export type BottomAppBarProps =
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    containerColor?: string;
    contentColor?: string;
    tonalElevation?: number;
    contentPadding?: ComposePaddingValues;
    windowInsets?: ComposeWindowInsets;
    scrollBehavior?: ComposeBottomAppBarScrollBehaviorValue | null;
    children?: ReactNode;
    actions?: never;
    floatingActionButton?: never;
    }
  | {
    actions: ReactNode;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    floatingActionButton?: ReactNode;
    containerColor?: string;
    contentColor?: string;
    tonalElevation?: number;
    contentPadding?: ComposePaddingValues;
    windowInsets?: ComposeWindowInsets;
    scrollBehavior?: ComposeBottomAppBarScrollBehaviorValue | null;
    children?: never;
    }
;
export const BottomAppBar = createComposableComponent<BottomAppBarProps>({
  name: "BottomAppBar",
  props: ["modifier","containerColor","contentColor","tonalElevation","contentPadding","windowInsets","scrollBehavior"],
  objectProps: ["contentPadding","windowInsets","scrollBehavior"],
  slots: ["actions","floatingActionButton"],
  children: true,
  overloads: [
    { id: "BottomAppBar", children: true, parameters: [["modifier","ComposeModifier",true,false],["containerColor","string",true,false],["contentColor","string",true,false],["tonalElevation","number",true,false],["contentPadding","object",true,false],["windowInsets","object",true,false],["scrollBehavior","object",true,true]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63] },
    { id: "BottomAppBar#1", children: false, parameters: [["actions","ReactNode",false,false],["modifier","ComposeModifier",true,false],["floatingActionButton","ReactNode",true,true],["containerColor","string",true,false],["contentColor","string",true,false],["tonalElevation","number",true,false],["contentPadding","object",true,false],["windowInsets","object",true,false],["scrollBehavior","object",true,true]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,123,124,125,126,127] },
  ],
});
