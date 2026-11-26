// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeShape } from "../../utils/modifier";
import type { ComposeWindowInsets } from "../../utils/composeValues";
import type { ComposeDrawerStateHandle } from "../../utils/nativeHandles";

export type ModalDrawerSheetProps =
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    drawerShape?: ComposeShape;
    drawerContainerColor?: string;
    drawerContentColor?: string;
    drawerTonalElevation?: number;
    windowInsets?: ComposeWindowInsets;
    children?: ReactNode;
    drawerState?: never;
    }
  | {
    drawerState: ComposeDrawerStateHandle;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    drawerShape?: ComposeShape;
    drawerContainerColor?: string;
    drawerContentColor?: string;
    drawerTonalElevation?: number;
    windowInsets?: ComposeWindowInsets;
    children?: ReactNode;
    }
;
export const ModalDrawerSheet = createComposableComponent<ModalDrawerSheetProps>({
  name: "ModalDrawerSheet",
  props: ["modifier","drawerShape","drawerContainerColor","drawerContentColor","drawerTonalElevation","windowInsets","drawerState"],
  objectProps: ["drawerShape","windowInsets","drawerState"],
  children: true,
  overloads: [
    { id: "ModalDrawerSheet", children: true, parameters: [["modifier","ComposeModifier",true,false],["drawerShape","shape",true,false],["drawerContainerColor","string",true,false],["drawerContentColor","string",true,false],["drawerTonalElevation","number",true,false],["windowInsets","object",true,false]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31] },
    { id: "ModalDrawerSheet#1", children: true, parameters: [["drawerState","object",false,false],["modifier","ComposeModifier",true,false],["drawerShape","shape",true,false],["drawerContainerColor","string",true,false],["drawerContentColor","string",true,false],["drawerTonalElevation","number",true,false],["windowInsets","object",true,false]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31] },
  ],
});
