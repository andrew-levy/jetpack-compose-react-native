// Generated from Compose declarations by generate.mjs.
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeMaterialShape } from "../values/enums";
import type { ComposePullToRefreshState } from "../../utils/nativeHandles";

export type LoadingIndicatorProps =
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color?: string;
    polygons?: readonly ComposeMaterialShape[];
    progress?: never;
    state?: never;
    isRefreshing?: never;
    containerColor?: never;
    elevation?: never;
    maxDistance?: never;
    }
  | {
    progress: number;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    color?: string;
    polygons?: readonly ComposeMaterialShape[];
    state?: never;
    isRefreshing?: never;
    containerColor?: never;
    elevation?: never;
    maxDistance?: never;
    }
  | {
    state: ComposePullToRefreshState;
    isRefreshing: boolean;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    containerColor?: string;
    color?: string;
    elevation?: number;
    maxDistance?: number;
    polygons?: never;
    progress?: never;
    }
;
export const LoadingIndicator = createComposableComponent<LoadingIndicatorProps>({
  name: "LoadingIndicator",
  props: ["modifier","color","polygons","progress","state","isRefreshing","containerColor","elevation","maxDistance"],
  objectProps: ["polygons","state"],
  children: false,
  overloads: [
    { id: "LoadingIndicator", children: false, parameters: [["modifier","ComposeModifier",true,false],["color","string",true,false],["polygons","tuple",true,false]], masks: [0,1,2,3] },
    { id: "LoadingIndicator#1", children: false, parameters: [["progress","number",false,false],["modifier","ComposeModifier",true,false],["color","string",true,false],["polygons","tuple",true,false]], masks: [0,1,2,3] },
    { id: "LoadingIndicator#2", children: false, parameters: [["state","object",false,false],["isRefreshing","boolean",false,false],["modifier","ComposeModifier",true,false],["containerColor","string",true,false],["color","string",true,false],["elevation","number",true,false],["maxDistance","number",true,false]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15] },
  ],
});
