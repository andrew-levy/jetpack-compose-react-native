// Generated from Compose declarations by generate.mjs.
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeShape } from "../../utils/modifier";
import type { ComposeMaterialShape } from "../values/enums";

export type ContainedLoadingIndicatorProps =
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    containerColor?: string;
    indicatorColor?: string;
    containerShape?: ComposeShape;
    polygons?: readonly ComposeMaterialShape[];
    progress?: never;
    }
  | {
    progress: number;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    containerColor?: string;
    indicatorColor?: string;
    containerShape?: ComposeShape;
    polygons?: readonly ComposeMaterialShape[];
    }
;
export const ContainedLoadingIndicator = createComposableComponent<ContainedLoadingIndicatorProps>({
  name: "ContainedLoadingIndicator",
  props: ["modifier","containerColor","indicatorColor","containerShape","polygons","progress"],
  objectProps: ["containerShape","polygons"],
  children: false,
  overloads: [
    { id: "ContainedLoadingIndicator", children: false, parameters: [["modifier","ComposeModifier",true,false],["containerColor","string",true,false],["indicatorColor","string",true,false],["containerShape","shape",true,false],["polygons","tuple",true,false]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15] },
    { id: "ContainedLoadingIndicator#1", children: false, parameters: [["progress","number",false,false],["modifier","ComposeModifier",true,false],["containerColor","string",true,false],["indicatorColor","string",true,false],["containerShape","shape",true,false],["polygons","tuple",true,false]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15] },
  ],
});
