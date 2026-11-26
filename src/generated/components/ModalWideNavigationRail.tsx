// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeShape } from "../../utils/modifier";
import type { ComposeWideNavigationRailStateHandle } from "../../utils/nativeHandles";
import type { ComposeModalWideNavigationRailPropertiesValue, ComposeWideNavigationRailColorsValue } from "../values/records";
import type { ComposePaddingValues, ComposeWindowInsets } from "../../utils/composeValues";
import type { ComposeVerticalArrangement } from "../values/enums";

export type ModalWideNavigationRailProps =
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    state?: ComposeWideNavigationRailStateHandle;
    hideOnCollapse?: boolean;
    collapsedShape?: ComposeShape;
    expandedShape?: ComposeShape;
    header?: ReactNode;
    expandedHeaderTopPadding?: number;
    windowInsets?: ComposeWindowInsets;
    arrangement?: ComposeVerticalArrangement;
    contentPadding?: ComposePaddingValues;
    children?: ReactNode;
    colors?: never;
    expandedProperties?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    state?: ComposeWideNavigationRailStateHandle;
    hideOnCollapse?: boolean;
    collapsedShape?: ComposeShape;
    header?: ReactNode;
    expandedHeaderTopPadding?: number;
    expandedProperties: ComposeModalWideNavigationRailPropertiesValue;
    children?: ReactNode;
    expandedShape?: never;
    colors?: never;
    windowInsets?: never;
    arrangement?: never;
    contentPadding?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    colors: ComposeWideNavigationRailColorsValue;
    expandedProperties?: ComposeModalWideNavigationRailPropertiesValue;
    children?: ReactNode;
    state?: never;
    hideOnCollapse?: never;
    collapsedShape?: never;
    expandedShape?: never;
    header?: never;
    expandedHeaderTopPadding?: never;
    windowInsets?: never;
    arrangement?: never;
    contentPadding?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    colors: ComposeWideNavigationRailColorsValue;
    arrangement: ComposeVerticalArrangement;
    children?: ReactNode;
    state?: never;
    hideOnCollapse?: never;
    collapsedShape?: never;
    expandedShape?: never;
    header?: never;
    expandedHeaderTopPadding?: never;
    windowInsets?: never;
    expandedProperties?: never;
    contentPadding?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    colors: ComposeWideNavigationRailColorsValue;
    windowInsets: ComposeWindowInsets;
    arrangement?: ComposeVerticalArrangement;
    children?: ReactNode;
    state?: never;
    hideOnCollapse?: never;
    collapsedShape?: never;
    expandedShape?: never;
    header?: never;
    expandedHeaderTopPadding?: never;
    expandedProperties?: never;
    contentPadding?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    colors: ComposeWideNavigationRailColorsValue;
    expandedHeaderTopPadding: number;
    windowInsets?: ComposeWindowInsets;
    arrangement?: ComposeVerticalArrangement;
    children?: ReactNode;
    state?: never;
    hideOnCollapse?: never;
    collapsedShape?: never;
    expandedShape?: never;
    header?: never;
    expandedProperties?: never;
    contentPadding?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    colors: ComposeWideNavigationRailColorsValue;
    header: ReactNode;
    expandedHeaderTopPadding?: number;
    windowInsets?: ComposeWindowInsets;
    arrangement?: ComposeVerticalArrangement;
    children?: ReactNode;
    state?: never;
    hideOnCollapse?: never;
    collapsedShape?: never;
    expandedShape?: never;
    expandedProperties?: never;
    contentPadding?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    expandedShape: ComposeShape;
    colors: ComposeWideNavigationRailColorsValue;
    header?: ReactNode;
    expandedHeaderTopPadding?: number;
    windowInsets?: ComposeWindowInsets;
    arrangement?: ComposeVerticalArrangement;
    children?: ReactNode;
    state?: never;
    hideOnCollapse?: never;
    collapsedShape?: never;
    expandedProperties?: never;
    contentPadding?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    collapsedShape: ComposeShape;
    colors: ComposeWideNavigationRailColorsValue;
    header?: ReactNode;
    expandedHeaderTopPadding?: number;
    windowInsets?: ComposeWindowInsets;
    arrangement?: ComposeVerticalArrangement;
    children?: ReactNode;
    state?: never;
    hideOnCollapse?: never;
    expandedShape?: never;
    expandedProperties?: never;
    contentPadding?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    collapsedShape: ComposeShape;
    expandedShape: ComposeShape;
    colors: ComposeWideNavigationRailColorsValue;
    expandedHeaderTopPadding?: number;
    windowInsets?: ComposeWindowInsets;
    arrangement?: ComposeVerticalArrangement;
    children?: ReactNode;
    state?: never;
    hideOnCollapse?: never;
    header?: never;
    expandedProperties?: never;
    contentPadding?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    collapsedShape: ComposeShape;
    expandedShape: ComposeShape;
    colors: ComposeWideNavigationRailColorsValue;
    header: ReactNode;
    windowInsets?: ComposeWindowInsets;
    arrangement?: ComposeVerticalArrangement;
    children?: ReactNode;
    state?: never;
    hideOnCollapse?: never;
    expandedHeaderTopPadding?: never;
    expandedProperties?: never;
    contentPadding?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    collapsedShape: ComposeShape;
    expandedShape: ComposeShape;
    colors: ComposeWideNavigationRailColorsValue;
    header: ReactNode;
    expandedHeaderTopPadding: number;
    arrangement?: ComposeVerticalArrangement;
    children?: ReactNode;
    state?: never;
    hideOnCollapse?: never;
    windowInsets?: never;
    expandedProperties?: never;
    contentPadding?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    collapsedShape: ComposeShape;
    expandedShape: ComposeShape;
    colors: ComposeWideNavigationRailColorsValue;
    header: ReactNode;
    expandedHeaderTopPadding: number;
    windowInsets: ComposeWindowInsets;
    children?: ReactNode;
    state?: never;
    hideOnCollapse?: never;
    arrangement?: never;
    expandedProperties?: never;
    contentPadding?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    collapsedShape: ComposeShape;
    expandedShape: ComposeShape;
    colors: ComposeWideNavigationRailColorsValue;
    header: ReactNode;
    expandedHeaderTopPadding: number;
    windowInsets: ComposeWindowInsets;
    arrangement: ComposeVerticalArrangement;
    contentPadding?: ComposePaddingValues;
    children?: ReactNode;
    state?: never;
    hideOnCollapse?: never;
    expandedProperties?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    hideOnCollapse: boolean;
    colors: ComposeWideNavigationRailColorsValue;
    header?: ReactNode;
    expandedHeaderTopPadding?: number;
    windowInsets?: ComposeWindowInsets;
    arrangement?: ComposeVerticalArrangement;
    children?: ReactNode;
    state?: never;
    collapsedShape?: never;
    expandedShape?: never;
    expandedProperties?: never;
    contentPadding?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    hideOnCollapse: boolean;
    expandedShape: ComposeShape;
    colors: ComposeWideNavigationRailColorsValue;
    expandedHeaderTopPadding?: number;
    windowInsets?: ComposeWindowInsets;
    arrangement?: ComposeVerticalArrangement;
    children?: ReactNode;
    state?: never;
    collapsedShape?: never;
    header?: never;
    expandedProperties?: never;
    contentPadding?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    hideOnCollapse: boolean;
    expandedShape: ComposeShape;
    colors: ComposeWideNavigationRailColorsValue;
    header: ReactNode;
    windowInsets?: ComposeWindowInsets;
    arrangement?: ComposeVerticalArrangement;
    children?: ReactNode;
    state?: never;
    collapsedShape?: never;
    expandedHeaderTopPadding?: never;
    expandedProperties?: never;
    contentPadding?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    hideOnCollapse: boolean;
    expandedShape: ComposeShape;
    colors: ComposeWideNavigationRailColorsValue;
    header: ReactNode;
    expandedHeaderTopPadding: number;
    arrangement?: ComposeVerticalArrangement;
    children?: ReactNode;
    state?: never;
    collapsedShape?: never;
    windowInsets?: never;
    expandedProperties?: never;
    contentPadding?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    hideOnCollapse: boolean;
    expandedShape: ComposeShape;
    colors: ComposeWideNavigationRailColorsValue;
    header: ReactNode;
    expandedHeaderTopPadding: number;
    windowInsets: ComposeWindowInsets;
    children?: ReactNode;
    state?: never;
    collapsedShape?: never;
    arrangement?: never;
    expandedProperties?: never;
    contentPadding?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    hideOnCollapse: boolean;
    expandedShape: ComposeShape;
    colors: ComposeWideNavigationRailColorsValue;
    header: ReactNode;
    expandedHeaderTopPadding: number;
    windowInsets: ComposeWindowInsets;
    arrangement: ComposeVerticalArrangement;
    contentPadding?: ComposePaddingValues;
    children?: ReactNode;
    state?: never;
    collapsedShape?: never;
    expandedProperties?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    hideOnCollapse: boolean;
    collapsedShape: ComposeShape;
    colors: ComposeWideNavigationRailColorsValue;
    expandedHeaderTopPadding?: number;
    windowInsets?: ComposeWindowInsets;
    arrangement?: ComposeVerticalArrangement;
    children?: ReactNode;
    state?: never;
    expandedShape?: never;
    header?: never;
    expandedProperties?: never;
    contentPadding?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    hideOnCollapse: boolean;
    collapsedShape: ComposeShape;
    colors: ComposeWideNavigationRailColorsValue;
    header: ReactNode;
    windowInsets?: ComposeWindowInsets;
    arrangement?: ComposeVerticalArrangement;
    children?: ReactNode;
    state?: never;
    expandedShape?: never;
    expandedHeaderTopPadding?: never;
    expandedProperties?: never;
    contentPadding?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    hideOnCollapse: boolean;
    collapsedShape: ComposeShape;
    colors: ComposeWideNavigationRailColorsValue;
    header: ReactNode;
    expandedHeaderTopPadding: number;
    arrangement?: ComposeVerticalArrangement;
    children?: ReactNode;
    state?: never;
    expandedShape?: never;
    windowInsets?: never;
    expandedProperties?: never;
    contentPadding?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    hideOnCollapse: boolean;
    collapsedShape: ComposeShape;
    colors: ComposeWideNavigationRailColorsValue;
    header: ReactNode;
    expandedHeaderTopPadding: number;
    windowInsets: ComposeWindowInsets;
    children?: ReactNode;
    state?: never;
    expandedShape?: never;
    arrangement?: never;
    expandedProperties?: never;
    contentPadding?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    hideOnCollapse: boolean;
    collapsedShape: ComposeShape;
    colors: ComposeWideNavigationRailColorsValue;
    header: ReactNode;
    expandedHeaderTopPadding: number;
    windowInsets: ComposeWindowInsets;
    arrangement: ComposeVerticalArrangement;
    contentPadding?: ComposePaddingValues;
    children?: ReactNode;
    state?: never;
    expandedShape?: never;
    expandedProperties?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    hideOnCollapse: boolean;
    collapsedShape: ComposeShape;
    expandedShape: ComposeShape;
    colors: ComposeWideNavigationRailColorsValue;
    windowInsets?: ComposeWindowInsets;
    arrangement?: ComposeVerticalArrangement;
    children?: ReactNode;
    state?: never;
    header?: never;
    expandedHeaderTopPadding?: never;
    expandedProperties?: never;
    contentPadding?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    hideOnCollapse: boolean;
    collapsedShape: ComposeShape;
    expandedShape: ComposeShape;
    colors: ComposeWideNavigationRailColorsValue;
    expandedHeaderTopPadding: number;
    arrangement?: ComposeVerticalArrangement;
    children?: ReactNode;
    state?: never;
    header?: never;
    windowInsets?: never;
    expandedProperties?: never;
    contentPadding?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    hideOnCollapse: boolean;
    collapsedShape: ComposeShape;
    expandedShape: ComposeShape;
    colors: ComposeWideNavigationRailColorsValue;
    expandedHeaderTopPadding: number;
    windowInsets: ComposeWindowInsets;
    children?: ReactNode;
    state?: never;
    header?: never;
    arrangement?: never;
    expandedProperties?: never;
    contentPadding?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    hideOnCollapse: boolean;
    collapsedShape: ComposeShape;
    expandedShape: ComposeShape;
    colors: ComposeWideNavigationRailColorsValue;
    expandedHeaderTopPadding: number;
    windowInsets: ComposeWindowInsets;
    arrangement: ComposeVerticalArrangement;
    contentPadding?: ComposePaddingValues;
    children?: ReactNode;
    state?: never;
    header?: never;
    expandedProperties?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    hideOnCollapse: boolean;
    collapsedShape: ComposeShape;
    expandedShape: ComposeShape;
    colors: ComposeWideNavigationRailColorsValue;
    header: ReactNode;
    arrangement?: ComposeVerticalArrangement;
    children?: ReactNode;
    state?: never;
    expandedHeaderTopPadding?: never;
    windowInsets?: never;
    expandedProperties?: never;
    contentPadding?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    hideOnCollapse: boolean;
    collapsedShape: ComposeShape;
    expandedShape: ComposeShape;
    colors: ComposeWideNavigationRailColorsValue;
    header: ReactNode;
    windowInsets: ComposeWindowInsets;
    children?: ReactNode;
    state?: never;
    expandedHeaderTopPadding?: never;
    arrangement?: never;
    expandedProperties?: never;
    contentPadding?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    hideOnCollapse: boolean;
    collapsedShape: ComposeShape;
    expandedShape: ComposeShape;
    colors: ComposeWideNavigationRailColorsValue;
    header: ReactNode;
    windowInsets: ComposeWindowInsets;
    arrangement: ComposeVerticalArrangement;
    contentPadding?: ComposePaddingValues;
    children?: ReactNode;
    state?: never;
    expandedHeaderTopPadding?: never;
    expandedProperties?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    hideOnCollapse: boolean;
    collapsedShape: ComposeShape;
    expandedShape: ComposeShape;
    colors: ComposeWideNavigationRailColorsValue;
    header: ReactNode;
    expandedHeaderTopPadding: number;
    children?: ReactNode;
    state?: never;
    windowInsets?: never;
    arrangement?: never;
    expandedProperties?: never;
    contentPadding?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    hideOnCollapse: boolean;
    collapsedShape: ComposeShape;
    expandedShape: ComposeShape;
    colors: ComposeWideNavigationRailColorsValue;
    header: ReactNode;
    expandedHeaderTopPadding: number;
    arrangement: ComposeVerticalArrangement;
    contentPadding?: ComposePaddingValues;
    children?: ReactNode;
    state?: never;
    windowInsets?: never;
    expandedProperties?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    hideOnCollapse: boolean;
    collapsedShape: ComposeShape;
    expandedShape: ComposeShape;
    colors: ComposeWideNavigationRailColorsValue;
    header: ReactNode;
    expandedHeaderTopPadding: number;
    windowInsets: ComposeWindowInsets;
    arrangement?: ComposeVerticalArrangement;
    contentPadding?: ComposePaddingValues;
    children?: ReactNode;
    state?: never;
    expandedProperties?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    hideOnCollapse: boolean;
    collapsedShape: ComposeShape;
    expandedShape: ComposeShape;
    colors: ComposeWideNavigationRailColorsValue;
    header: ReactNode;
    expandedHeaderTopPadding: number;
    windowInsets: ComposeWindowInsets;
    arrangement: ComposeVerticalArrangement;
    expandedProperties: ComposeModalWideNavigationRailPropertiesValue;
    contentPadding: ComposePaddingValues;
    children?: ReactNode;
    state?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    state: ComposeWideNavigationRailStateHandle;
    hideOnCollapse?: boolean;
    collapsedShape?: ComposeShape;
    colors: ComposeWideNavigationRailColorsValue;
    header?: ReactNode;
    expandedHeaderTopPadding?: number;
    children?: ReactNode;
    expandedShape?: never;
    windowInsets?: never;
    arrangement?: never;
    expandedProperties?: never;
    contentPadding?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    state: ComposeWideNavigationRailStateHandle;
    collapsedShape: ComposeShape;
    expandedShape: ComposeShape;
    colors: ComposeWideNavigationRailColorsValue;
    header: ReactNode;
    expandedHeaderTopPadding: number;
    windowInsets: ComposeWindowInsets;
    arrangement: ComposeVerticalArrangement;
    expandedProperties?: ComposeModalWideNavigationRailPropertiesValue;
    contentPadding: ComposePaddingValues;
    children?: ReactNode;
    hideOnCollapse?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    state: ComposeWideNavigationRailStateHandle;
    hideOnCollapse: boolean;
    expandedShape: ComposeShape;
    colors: ComposeWideNavigationRailColorsValue;
    header: ReactNode;
    expandedHeaderTopPadding: number;
    windowInsets: ComposeWindowInsets;
    arrangement: ComposeVerticalArrangement;
    expandedProperties?: ComposeModalWideNavigationRailPropertiesValue;
    contentPadding: ComposePaddingValues;
    children?: ReactNode;
    collapsedShape?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    state: ComposeWideNavigationRailStateHandle;
    hideOnCollapse: boolean;
    collapsedShape: ComposeShape;
    colors: ComposeWideNavigationRailColorsValue;
    header: ReactNode;
    expandedHeaderTopPadding: number;
    windowInsets: ComposeWindowInsets;
    arrangement: ComposeVerticalArrangement;
    expandedProperties?: ComposeModalWideNavigationRailPropertiesValue;
    contentPadding: ComposePaddingValues;
    children?: ReactNode;
    expandedShape?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    state: ComposeWideNavigationRailStateHandle;
    hideOnCollapse: boolean;
    collapsedShape: ComposeShape;
    expandedShape: ComposeShape;
    header: ReactNode;
    expandedHeaderTopPadding: number;
    windowInsets: ComposeWindowInsets;
    arrangement: ComposeVerticalArrangement;
    expandedProperties: ComposeModalWideNavigationRailPropertiesValue;
    contentPadding: ComposePaddingValues;
    children?: ReactNode;
    colors?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    state: ComposeWideNavigationRailStateHandle;
    hideOnCollapse: boolean;
    collapsedShape: ComposeShape;
    expandedShape: ComposeShape;
    colors: ComposeWideNavigationRailColorsValue;
    expandedHeaderTopPadding: number;
    windowInsets: ComposeWindowInsets;
    arrangement: ComposeVerticalArrangement;
    expandedProperties?: ComposeModalWideNavigationRailPropertiesValue;
    contentPadding: ComposePaddingValues;
    children?: ReactNode;
    header?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    state: ComposeWideNavigationRailStateHandle;
    hideOnCollapse: boolean;
    collapsedShape: ComposeShape;
    expandedShape: ComposeShape;
    colors: ComposeWideNavigationRailColorsValue;
    header: ReactNode;
    windowInsets: ComposeWindowInsets;
    arrangement: ComposeVerticalArrangement;
    expandedProperties?: ComposeModalWideNavigationRailPropertiesValue;
    contentPadding: ComposePaddingValues;
    children?: ReactNode;
    expandedHeaderTopPadding?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    state: ComposeWideNavigationRailStateHandle;
    hideOnCollapse: boolean;
    collapsedShape: ComposeShape;
    expandedShape: ComposeShape;
    colors: ComposeWideNavigationRailColorsValue;
    header: ReactNode;
    expandedHeaderTopPadding: number;
    arrangement: ComposeVerticalArrangement;
    expandedProperties?: ComposeModalWideNavigationRailPropertiesValue;
    contentPadding: ComposePaddingValues;
    children?: ReactNode;
    windowInsets?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    state: ComposeWideNavigationRailStateHandle;
    hideOnCollapse: boolean;
    collapsedShape: ComposeShape;
    expandedShape: ComposeShape;
    colors: ComposeWideNavigationRailColorsValue;
    header: ReactNode;
    expandedHeaderTopPadding: number;
    windowInsets: ComposeWindowInsets;
    expandedProperties?: ComposeModalWideNavigationRailPropertiesValue;
    contentPadding: ComposePaddingValues;
    children?: ReactNode;
    arrangement?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    state: ComposeWideNavigationRailStateHandle;
    hideOnCollapse: boolean;
    collapsedShape: ComposeShape;
    expandedShape: ComposeShape;
    colors: ComposeWideNavigationRailColorsValue;
    header: ReactNode;
    expandedHeaderTopPadding: number;
    windowInsets: ComposeWindowInsets;
    arrangement: ComposeVerticalArrangement;
    expandedProperties?: ComposeModalWideNavigationRailPropertiesValue;
    contentPadding?: ComposePaddingValues;
    children?: ReactNode;
    }
;
export const ModalWideNavigationRail = createComposableComponent<ModalWideNavigationRailProps>({
  name: "ModalWideNavigationRail",
  props: ["modifier","state","hideOnCollapse","collapsedShape","expandedShape","colors","expandedHeaderTopPadding","windowInsets","arrangement","expandedProperties","contentPadding"],
  objectProps: ["state","collapsedShape","expandedShape","colors","windowInsets","expandedProperties","contentPadding"],
  slots: ["header"],
  children: true,
  overloads: [
    { id: "ModalWideNavigationRail", children: true, parameters: [["modifier","ComposeModifier",true,false],["state","object",true,false],["hideOnCollapse","boolean",true,false],["collapsedShape","shape",true,false],["expandedShape","shape",true,false],["colors","object",true,false],["header","ReactNode",true,true],["expandedHeaderTopPadding","number",true,false],["windowInsets","object",true,false],["arrangement","string",true,false],["expandedProperties","object",true,false],["contentPadding","object",true,false]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,26,28,30,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,58,60,62,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,90,92,94,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,122,124,126,128,129,130,131,132,133,134,135,136,137,138,139,140,141,142,143,144,146,148,150,152,154,156,158,160,161,162,163,164,165,166,167,168,169,170,171,172,173,174,175,176,178,180,182,184,186,188,190,192,193,194,195,196,197,198,199,200,201,202,203,204,205,206,207,208,210,212,214,216,218,220,222,224,225,226,227,228,229,230,231,232,233,234,235,236,237,238,239,240,242,244,246,248,250,252,254,256,257,258,259,260,261,262,263,264,265,266,267,268,269,270,271,272,274,276,278,280,282,284,286,288,289,290,291,292,293,294,295,296,297,298,299,300,301,302,303,304,306,308,310,312,314,316,318,320,321,322,323,324,325,326,327,328,329,330,331,332,333,334,335,336,338,340,342,344,346,348,350,352,353,354,355,356,357,358,359,360,361,362,363,364,365,366,367,368,370,372,374,376,378,380,382,384,385,386,387,388,389,390,391,392,393,394,395,396,397,398,399,400,402,404,406,408,410,412,414,416,417,418,419,420,421,422,423,424,425,426,427,428,429,430,431,432,434,436,438,440,442,444,446,448,449,450,451,452,453,454,455,456,457,458,459,460,461,462,463,464,466,468,470,472,474,476,478,480,481,482,483,484,485,486,487,488,489,490,491,492,493,494,495,496,498,500,502,504,506,508,510,511,512,513,514,515,516,517,518,519,528,544,545,546,547,548,549,550,551,576,577,578,579,580,581,582,583,608,609,610,611,612,613,614,615,1023,1024,1025,1026,1027,1028,1029,1030,1031,1032,1033,1034,1035,1036,1037,1038,1039,1056,1057,1058,1059,1060,1061,1062,1063,1064,1065,1066,1067,1068,1069,1070,1071,1088,1089,1090,1091,1092,1093,1094,1095,1096,1097,1098,1099,1100,1101,1102,1103,1120,1121,1122,1123,1124,1125,1126,1127,1128,1129,1130,1131,1132,1133,1134,1135,1152,1153,1154,1155,1156,1157,1158,1159,1160,1161,1162,1163,1164,1165,1166,1167,1184,1185,1186,1187,1188,1189,1190,1191,1192,1193,1194,1195,1196,1197,1198,1199,1216,1217,1218,1219,1220,1221,1222,1223,1224,1225,1226,1227,1228,1229,1230,1231,1248,1249,1250,1251,1252,1253,1254,1255,1256,1257,1258,1259,1260,1261,1262,1263,1278,1279,1280,1281,1282,1283,1284,1285,1286,1287,1288,1289,1290,1291,1292,1293,1294,1295,1312,1313,1314,1315,1316,1317,1318,1319,1320,1321,1322,1323,1324,1325,1326,1327,1344,1345,1346,1347,1348,1349,1350,1351,1352,1353,1354,1355,1356,1357,1358,1359,1376,1377,1378,1379,1380,1381,1382,1383,1384,1385,1386,1387,1388,1389,1390,1391,1406,1407,1408,1409,1410,1411,1412,1413,1414,1415,1416,1417,1418,1419,1420,1421,1422,1423,1440,1441,1442,1443,1444,1445,1446,1447,1448,1449,1450,1451,1452,1453,1454,1455,1470,1471,1472,1473,1474,1475,1476,1477,1478,1479,1480,1481,1482,1483,1484,1485,1486,1487,1502,1503,1504,1505,1506,1507,1508,1509,1510,1511,1512,1513,1514,1515,1516,1517,1518,1519,1526,1527,1530,1531,1532,1533,1534,1535,1791,1919,1983,2015,2031,2039,2043,2045,2046,2047] },
  ],
});
