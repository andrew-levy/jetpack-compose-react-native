// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeShape } from "../../utils/modifier";
import type { ComposeBorderStroke } from "../../utils/composeValues";
import type { ComposeInteractionSource } from "../../utils/nativeHandles";

export type SurfaceProps =
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    shape?: ComposeShape;
    color?: string;
    contentColor?: string;
    tonalElevation?: number;
    shadowElevation?: number;
    border?: ComposeBorderStroke | null;
    children?: ReactNode;
    onClick?: never;
    enabled?: never;
    interactionSource?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    shape?: ComposeShape;
    color?: string;
    contentColor?: string;
    tonalElevation?: number;
    shadowElevation?: number;
    interactionSource?: ComposeInteractionSource | null;
    children?: ReactNode;
    border?: never;
    enabled?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    color?: string;
    contentColor?: string;
    tonalElevation?: number;
    border: ComposeBorderStroke | null;
    children?: ReactNode;
    shape?: never;
    shadowElevation?: never;
    interactionSource?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    shape: ComposeShape;
    color: string;
    contentColor: string;
    tonalElevation: number;
    shadowElevation: number;
    border: ComposeBorderStroke | null;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    enabled?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    color?: string;
    contentColor?: string;
    tonalElevation?: number;
    shadowElevation?: number;
    interactionSource?: ComposeInteractionSource | null;
    children?: ReactNode;
    shape?: never;
    border?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    color: string;
    contentColor: string;
    tonalElevation: number;
    shadowElevation: number;
    border: ComposeBorderStroke | null;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    shape?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    shape: ComposeShape;
    contentColor?: string;
    tonalElevation?: number;
    shadowElevation?: number;
    interactionSource?: ComposeInteractionSource | null;
    children?: ReactNode;
    color?: never;
    border?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    shape: ComposeShape;
    contentColor: string;
    tonalElevation: number;
    shadowElevation: number;
    border: ComposeBorderStroke | null;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    color?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    shape: ComposeShape;
    color: string;
    tonalElevation?: number;
    shadowElevation?: number;
    interactionSource?: ComposeInteractionSource | null;
    children?: ReactNode;
    contentColor?: never;
    border?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    shape: ComposeShape;
    color: string;
    tonalElevation: number;
    shadowElevation: number;
    border: ComposeBorderStroke | null;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    contentColor?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    shape: ComposeShape;
    color: string;
    contentColor: string;
    shadowElevation?: number;
    interactionSource?: ComposeInteractionSource | null;
    children?: ReactNode;
    tonalElevation?: never;
    border?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    shape: ComposeShape;
    color: string;
    contentColor: string;
    shadowElevation: number;
    border: ComposeBorderStroke | null;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    tonalElevation?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    shape: ComposeShape;
    color: string;
    contentColor: string;
    tonalElevation: number;
    interactionSource?: ComposeInteractionSource | null;
    children?: ReactNode;
    shadowElevation?: never;
    border?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    shape: ComposeShape;
    color: string;
    contentColor: string;
    tonalElevation: number;
    border: ComposeBorderStroke | null;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    shadowElevation?: never;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    shape: ComposeShape;
    color: string;
    contentColor: string;
    tonalElevation: number;
    shadowElevation: number;
    border?: ComposeBorderStroke | null;
    interactionSource?: ComposeInteractionSource | null;
    children?: ReactNode;
    checked?: never;
    onCheckedChange?: never;
    selected?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    shape?: ComposeShape;
    color?: string;
    contentColor?: string;
    tonalElevation?: number;
    shadowElevation?: number;
    interactionSource?: ComposeInteractionSource | null;
    children?: ReactNode;
    border?: never;
    onClick?: never;
    enabled?: never;
    selected?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    color?: string;
    contentColor?: string;
    tonalElevation?: number;
    border: ComposeBorderStroke | null;
    children?: ReactNode;
    shape?: never;
    shadowElevation?: never;
    onClick?: never;
    interactionSource?: never;
    selected?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    shape: ComposeShape;
    color: string;
    contentColor: string;
    tonalElevation: number;
    shadowElevation: number;
    border: ComposeBorderStroke | null;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    onClick?: never;
    enabled?: never;
    selected?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    color?: string;
    contentColor?: string;
    tonalElevation?: number;
    shadowElevation?: number;
    interactionSource?: ComposeInteractionSource | null;
    children?: ReactNode;
    shape?: never;
    border?: never;
    onClick?: never;
    selected?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    color: string;
    contentColor: string;
    tonalElevation: number;
    shadowElevation: number;
    border: ComposeBorderStroke | null;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    shape?: never;
    onClick?: never;
    selected?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    shape: ComposeShape;
    contentColor?: string;
    tonalElevation?: number;
    shadowElevation?: number;
    interactionSource?: ComposeInteractionSource | null;
    children?: ReactNode;
    color?: never;
    border?: never;
    onClick?: never;
    selected?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    shape: ComposeShape;
    contentColor: string;
    tonalElevation: number;
    shadowElevation: number;
    border: ComposeBorderStroke | null;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    color?: never;
    onClick?: never;
    selected?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    shape: ComposeShape;
    color: string;
    tonalElevation?: number;
    shadowElevation?: number;
    interactionSource?: ComposeInteractionSource | null;
    children?: ReactNode;
    contentColor?: never;
    border?: never;
    onClick?: never;
    selected?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    shape: ComposeShape;
    color: string;
    tonalElevation: number;
    shadowElevation: number;
    border: ComposeBorderStroke | null;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    contentColor?: never;
    onClick?: never;
    selected?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    shape: ComposeShape;
    color: string;
    contentColor: string;
    shadowElevation?: number;
    interactionSource?: ComposeInteractionSource | null;
    children?: ReactNode;
    tonalElevation?: never;
    border?: never;
    onClick?: never;
    selected?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    shape: ComposeShape;
    color: string;
    contentColor: string;
    shadowElevation: number;
    border: ComposeBorderStroke | null;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    tonalElevation?: never;
    onClick?: never;
    selected?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    shape: ComposeShape;
    color: string;
    contentColor: string;
    tonalElevation: number;
    interactionSource?: ComposeInteractionSource | null;
    children?: ReactNode;
    shadowElevation?: never;
    border?: never;
    onClick?: never;
    selected?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    shape: ComposeShape;
    color: string;
    contentColor: string;
    tonalElevation: number;
    border: ComposeBorderStroke | null;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    shadowElevation?: never;
    onClick?: never;
    selected?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    shape: ComposeShape;
    color: string;
    contentColor: string;
    tonalElevation: number;
    shadowElevation: number;
    border?: ComposeBorderStroke | null;
    interactionSource?: ComposeInteractionSource | null;
    children?: ReactNode;
    onClick?: never;
    selected?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    shape?: ComposeShape;
    color?: string;
    contentColor?: string;
    tonalElevation?: number;
    shadowElevation?: number;
    interactionSource?: ComposeInteractionSource | null;
    children?: ReactNode;
    border?: never;
    enabled?: never;
    checked?: never;
    onCheckedChange?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    color?: string;
    contentColor?: string;
    tonalElevation?: number;
    border: ComposeBorderStroke | null;
    children?: ReactNode;
    shape?: never;
    shadowElevation?: never;
    interactionSource?: never;
    checked?: never;
    onCheckedChange?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    shape: ComposeShape;
    color: string;
    contentColor: string;
    tonalElevation: number;
    shadowElevation: number;
    border: ComposeBorderStroke | null;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    enabled?: never;
    checked?: never;
    onCheckedChange?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    color?: string;
    contentColor?: string;
    tonalElevation?: number;
    shadowElevation?: number;
    interactionSource?: ComposeInteractionSource | null;
    children?: ReactNode;
    shape?: never;
    border?: never;
    checked?: never;
    onCheckedChange?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    color: string;
    contentColor: string;
    tonalElevation: number;
    shadowElevation: number;
    border: ComposeBorderStroke | null;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    shape?: never;
    checked?: never;
    onCheckedChange?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    shape: ComposeShape;
    contentColor?: string;
    tonalElevation?: number;
    shadowElevation?: number;
    interactionSource?: ComposeInteractionSource | null;
    children?: ReactNode;
    color?: never;
    border?: never;
    checked?: never;
    onCheckedChange?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    shape: ComposeShape;
    contentColor: string;
    tonalElevation: number;
    shadowElevation: number;
    border: ComposeBorderStroke | null;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    color?: never;
    checked?: never;
    onCheckedChange?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    shape: ComposeShape;
    color: string;
    tonalElevation?: number;
    shadowElevation?: number;
    interactionSource?: ComposeInteractionSource | null;
    children?: ReactNode;
    contentColor?: never;
    border?: never;
    checked?: never;
    onCheckedChange?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    shape: ComposeShape;
    color: string;
    tonalElevation: number;
    shadowElevation: number;
    border: ComposeBorderStroke | null;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    contentColor?: never;
    checked?: never;
    onCheckedChange?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    shape: ComposeShape;
    color: string;
    contentColor: string;
    shadowElevation?: number;
    interactionSource?: ComposeInteractionSource | null;
    children?: ReactNode;
    tonalElevation?: never;
    border?: never;
    checked?: never;
    onCheckedChange?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    shape: ComposeShape;
    color: string;
    contentColor: string;
    shadowElevation: number;
    border: ComposeBorderStroke | null;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    tonalElevation?: never;
    checked?: never;
    onCheckedChange?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    shape: ComposeShape;
    color: string;
    contentColor: string;
    tonalElevation: number;
    interactionSource?: ComposeInteractionSource | null;
    children?: ReactNode;
    shadowElevation?: never;
    border?: never;
    checked?: never;
    onCheckedChange?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    shape: ComposeShape;
    color: string;
    contentColor: string;
    tonalElevation: number;
    border: ComposeBorderStroke | null;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    shadowElevation?: never;
    checked?: never;
    onCheckedChange?: never;
    }
  | {
    selected: boolean;
    onClick: () => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    shape: ComposeShape;
    color: string;
    contentColor: string;
    tonalElevation: number;
    shadowElevation: number;
    border?: ComposeBorderStroke | null;
    interactionSource?: ComposeInteractionSource | null;
    children?: ReactNode;
    checked?: never;
    onCheckedChange?: never;
    }
;
export const Surface = createComposableComponent<SurfaceProps>({
  name: "Surface",
  props: ["modifier","shape","color","contentColor","tonalElevation","shadowElevation","border","enabled","interactionSource","checked","selected"],
  objectProps: ["shape","border","interactionSource"],
  events: ["onClick","onCheckedChange"],
  children: true,
  overloads: [
    { id: "Surface", children: true, parameters: [["modifier","ComposeModifier",true,false],["shape","shape",true,false],["color","string",true,false],["contentColor","string",true,false],["tonalElevation","number",true,false],["shadowElevation","number",true,false],["border","object",true,true]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63] },
    { id: "Surface#1", children: true, parameters: [["onClick","function",false,false],["modifier","ComposeModifier",true,false],["enabled","boolean",true,false],["shape","shape",true,false],["color","string",true,false],["contentColor","string",true,false],["tonalElevation","number",true,false],["shadowElevation","number",true,false],["border","object",true,true],["interactionSource","object",true,true]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,68,69,72,73,76,77,80,81,84,85,88,89,92,93,127,128,129,130,131,132,133,134,135,136,137,138,139,140,141,142,143,144,145,146,147,148,149,150,151,152,153,154,155,156,157,158,159,160,161,162,163,164,165,166,167,168,169,170,171,172,173,174,175,176,177,178,179,180,181,182,183,184,185,186,187,188,189,190,191,223,239,247,251,253,254,255] },
    { id: "Surface#2", children: true, parameters: [["checked","boolean",false,false],["onCheckedChange","function",false,false],["modifier","ComposeModifier",true,false],["enabled","boolean",true,false],["shape","shape",true,false],["color","string",true,false],["contentColor","string",true,false],["tonalElevation","number",true,false],["shadowElevation","number",true,false],["border","object",true,true],["interactionSource","object",true,true]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,68,69,72,73,76,77,80,81,84,85,88,89,92,93,127,128,129,130,131,132,133,134,135,136,137,138,139,140,141,142,143,144,145,146,147,148,149,150,151,152,153,154,155,156,157,158,159,160,161,162,163,164,165,166,167,168,169,170,171,172,173,174,175,176,177,178,179,180,181,182,183,184,185,186,187,188,189,190,191,223,239,247,251,253,254,255] },
    { id: "Surface#3", children: true, parameters: [["selected","boolean",false,false],["onClick","function",false,false],["modifier","ComposeModifier",true,false],["enabled","boolean",true,false],["shape","shape",true,false],["color","string",true,false],["contentColor","string",true,false],["tonalElevation","number",true,false],["shadowElevation","number",true,false],["border","object",true,true],["interactionSource","object",true,true]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,68,69,72,73,76,77,80,81,84,85,88,89,92,93,127,128,129,130,131,132,133,134,135,136,137,138,139,140,141,142,143,144,145,146,147,148,149,150,151,152,153,154,155,156,157,158,159,160,161,162,163,164,165,166,167,168,169,170,171,172,173,174,175,176,177,178,179,180,181,182,183,184,185,186,187,188,189,190,191,223,239,247,251,253,254,255] },
  ],
});
