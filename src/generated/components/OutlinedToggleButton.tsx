// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeToggleButtonColorsValue, ComposeToggleButtonElevationValue, ComposeToggleButtonShapesValue } from "../values/records";
import type { ComposeBorderStroke, ComposePaddingValues } from "../../utils/composeValues";
import type { ComposeInteractionSource } from "../../utils/nativeHandles";
import type { ComposeToggleButtonSizeValue } from "../values/enums";

export type OutlinedToggleButtonProps =
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    icon?: ReactNode;
    elevation?: ComposeToggleButtonElevationValue | null;
    border?: ComposeBorderStroke | null;
    contentPadding?: ComposePaddingValues;
    interactionSource?: ComposeInteractionSource | null;
    children?: ReactNode;
    buttonSize?: never;
    shapes?: never;
    colors?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    icon?: ReactNode;
    colors: ComposeToggleButtonColorsValue;
    border?: ComposeBorderStroke | null;
    contentPadding?: ComposePaddingValues;
    interactionSource?: ComposeInteractionSource | null;
    children?: ReactNode;
    buttonSize?: never;
    shapes?: never;
    elevation?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    colors: ComposeToggleButtonColorsValue;
    elevation: ComposeToggleButtonElevationValue | null;
    children?: ReactNode;
    buttonSize?: never;
    enabled?: never;
    icon?: never;
    shapes?: never;
    border?: never;
    contentPadding?: never;
    interactionSource?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    shapes: ComposeToggleButtonShapesValue;
    colors?: ComposeToggleButtonColorsValue;
    border?: ComposeBorderStroke | null;
    contentPadding?: ComposePaddingValues;
    interactionSource?: ComposeInteractionSource | null;
    children?: ReactNode;
    buttonSize?: never;
    icon?: never;
    elevation?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    shapes: ComposeToggleButtonShapesValue;
    elevation: ComposeToggleButtonElevationValue | null;
    children?: ReactNode;
    buttonSize?: never;
    enabled?: never;
    icon?: never;
    colors?: never;
    border?: never;
    contentPadding?: never;
    interactionSource?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled?: boolean;
    icon: ReactNode;
    shapes: ComposeToggleButtonShapesValue;
    border?: ComposeBorderStroke | null;
    contentPadding?: ComposePaddingValues;
    interactionSource?: ComposeInteractionSource | null;
    children?: ReactNode;
    buttonSize?: never;
    colors?: never;
    elevation?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    icon: ReactNode;
    colors: ComposeToggleButtonColorsValue;
    elevation: ComposeToggleButtonElevationValue | null;
    border: ComposeBorderStroke | null;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    buttonSize?: never;
    shapes?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    icon: ReactNode;
    shapes: ComposeToggleButtonShapesValue;
    elevation: ComposeToggleButtonElevationValue | null;
    border: ComposeBorderStroke | null;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    buttonSize?: never;
    colors?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    enabled: boolean;
    icon: ReactNode;
    shapes: ComposeToggleButtonShapesValue;
    colors: ComposeToggleButtonColorsValue;
    elevation?: ComposeToggleButtonElevationValue | null;
    border: ComposeBorderStroke | null;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    buttonSize?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    buttonSize: ComposeToggleButtonSizeValue;
    enabled?: boolean;
    icon?: ReactNode;
    border?: ComposeBorderStroke | null;
    contentPadding?: ComposePaddingValues;
    interactionSource?: ComposeInteractionSource | null;
    children?: ReactNode;
    shapes?: never;
    colors?: never;
    elevation?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    buttonSize: ComposeToggleButtonSizeValue;
    elevation: ComposeToggleButtonElevationValue | null;
    children?: ReactNode;
    enabled?: never;
    icon?: never;
    shapes?: never;
    colors?: never;
    border?: never;
    contentPadding?: never;
    interactionSource?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    buttonSize: ComposeToggleButtonSizeValue;
    colors: ComposeToggleButtonColorsValue;
    children?: ReactNode;
    enabled?: never;
    icon?: never;
    shapes?: never;
    elevation?: never;
    border?: never;
    contentPadding?: never;
    interactionSource?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    buttonSize: ComposeToggleButtonSizeValue;
    shapes: ComposeToggleButtonShapesValue;
    children?: ReactNode;
    enabled?: never;
    icon?: never;
    colors?: never;
    elevation?: never;
    border?: never;
    contentPadding?: never;
    interactionSource?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    buttonSize: ComposeToggleButtonSizeValue;
    icon: ReactNode;
    shapes: ComposeToggleButtonShapesValue;
    colors: ComposeToggleButtonColorsValue;
    elevation: ComposeToggleButtonElevationValue | null;
    border: ComposeBorderStroke | null;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    enabled?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    buttonSize: ComposeToggleButtonSizeValue;
    enabled: boolean;
    shapes: ComposeToggleButtonShapesValue;
    colors: ComposeToggleButtonColorsValue;
    elevation: ComposeToggleButtonElevationValue | null;
    border: ComposeBorderStroke | null;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    icon?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    buttonSize: ComposeToggleButtonSizeValue;
    enabled: boolean;
    icon: ReactNode;
    elevation: ComposeToggleButtonElevationValue | null;
    border: ComposeBorderStroke | null;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    shapes?: never;
    colors?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    buttonSize: ComposeToggleButtonSizeValue;
    enabled: boolean;
    icon: ReactNode;
    colors: ComposeToggleButtonColorsValue;
    elevation?: ComposeToggleButtonElevationValue | null;
    border: ComposeBorderStroke | null;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    shapes?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    buttonSize: ComposeToggleButtonSizeValue;
    enabled: boolean;
    icon: ReactNode;
    shapes: ComposeToggleButtonShapesValue;
    elevation?: ComposeToggleButtonElevationValue | null;
    border: ComposeBorderStroke | null;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    colors?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    buttonSize: ComposeToggleButtonSizeValue;
    enabled: boolean;
    icon: ReactNode;
    shapes: ComposeToggleButtonShapesValue;
    colors: ComposeToggleButtonColorsValue;
    border: ComposeBorderStroke | null;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    elevation?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    buttonSize: ComposeToggleButtonSizeValue;
    enabled: boolean;
    icon: ReactNode;
    shapes: ComposeToggleButtonShapesValue;
    colors: ComposeToggleButtonColorsValue;
    elevation: ComposeToggleButtonElevationValue | null;
    contentPadding: ComposePaddingValues;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    border?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    buttonSize: ComposeToggleButtonSizeValue;
    enabled: boolean;
    icon: ReactNode;
    shapes: ComposeToggleButtonShapesValue;
    colors: ComposeToggleButtonColorsValue;
    elevation: ComposeToggleButtonElevationValue | null;
    border: ComposeBorderStroke | null;
    interactionSource: ComposeInteractionSource | null;
    children?: ReactNode;
    contentPadding?: never;
    }
  | {
    checked: boolean;
    onCheckedChange: (value: boolean) => void;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    buttonSize: ComposeToggleButtonSizeValue;
    enabled: boolean;
    icon: ReactNode;
    shapes: ComposeToggleButtonShapesValue;
    colors: ComposeToggleButtonColorsValue;
    elevation: ComposeToggleButtonElevationValue | null;
    border: ComposeBorderStroke | null;
    contentPadding: ComposePaddingValues;
    interactionSource?: ComposeInteractionSource | null;
    children?: ReactNode;
    }
;
export const OutlinedToggleButton = createComposableComponent<OutlinedToggleButtonProps>({
  name: "OutlinedToggleButton",
  props: ["checked","modifier","buttonSize","enabled","shapes","colors","elevation","border","contentPadding","interactionSource"],
  objectProps: ["shapes","colors","elevation","border","contentPadding","interactionSource"],
  slots: ["icon"],
  events: ["onCheckedChange"],
  children: true,
  overloads: [
    { id: "OutlinedToggleButton", children: true, parameters: [["checked","boolean",false,false],["onCheckedChange","function",false,false],["modifier","ComposeModifier",true,false],["buttonSize","string",true,false],["enabled","boolean",true,false],["icon","ReactNode",true,true],["shapes","object",true,false],["colors","object",true,false],["elevation","object",true,true],["border","object",true,true],["contentPadding","object",true,false],["interactionSource","object",true,true]], masks: [0,1,2,3,4,5,6,7,8,9,10,12,14,16,17,18,20,22,24,26,32,33,34,36,38,40,48,64,65,66,67,68,69,70,71,72,74,76,78,80,82,84,86,88,90,96,98,100,102,128,129,130,131,132,133,134,135,136,138,140,142,144,146,148,150,152,154,160,162,164,166,192,193,194,195,196,197,198,199,200,202,204,206,208,210,212,214,216,218,224,226,228,230,255,256,257,258,259,260,261,262,263,264,266,268,270,272,274,276,278,280,282,288,290,292,294,320,321,322,323,324,325,326,327,328,330,332,334,336,338,340,342,344,346,352,354,356,358,383,384,385,386,387,388,389,390,391,392,394,396,398,400,402,404,406,408,410,416,418,420,422,447,448,449,450,451,452,453,454,455,456,458,460,462,463,464,466,468,470,471,472,474,478,479,480,482,484,486,487,494,495,502,503,507,509,510,511] },
  ],
});
