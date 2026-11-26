// Generated from Compose declarations by generate.mjs.
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposePullToRefreshState } from "../../utils/nativeHandles";

export type IndicatorProps =
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    height?: number;
    color?: string;
    state?: never;
    isRefreshing?: never;
    containerColor?: never;
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
    maxDistance?: number;
    height?: never;
    }
;
export const Indicator = createComposableComponent<IndicatorProps>({
  name: "Indicator",
  props: ["modifier","height","color","state","isRefreshing","containerColor","maxDistance"],
  objectProps: ["state"],
  children: false,
  overloads: [
    { id: "Indicator", children: false, parameters: [["modifier","ComposeModifier",true,false],["height","number",true,false],["color","string",true,false]], masks: [0,1,2,3] },
    { id: "Indicator#1", children: false, parameters: [["state","object",false,false],["isRefreshing","boolean",false,false],["modifier","ComposeModifier",true,false],["containerColor","string",true,false],["color","string",true,false],["maxDistance","number",true,false]], masks: [0,1,2,3,4,5,6,7] },
  ],
});
