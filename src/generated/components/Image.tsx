// Generated from Compose declarations by generate.mjs.
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeColorFilterValue, ComposeImageBitmapValue } from "../values/records";
import type { ComposeMaterialIcon } from "../values/icons";
import type { ComposePainter } from "../../utils/composeValues";
import type { ComposeAlignment, ComposeContentScale, ComposeFilterQualityValue } from "../values/enums";

export type ImageProps =
  | {
    bitmap: ComposeImageBitmapValue;
    contentDescription: string | null;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    alignment?: ComposeAlignment;
    contentScale?: ComposeContentScale;
    alpha?: number;
    colorFilter?: ComposeColorFilterValue | null;
    filterQuality?: ComposeFilterQualityValue;
    imageVector?: never;
    painter?: never;
    }
  | {
    imageVector: ComposeMaterialIcon;
    contentDescription: string | null;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    alignment?: ComposeAlignment;
    contentScale?: ComposeContentScale;
    alpha?: number;
    colorFilter?: ComposeColorFilterValue | null;
    bitmap?: never;
    filterQuality?: never;
    painter?: never;
    }
  | {
    painter: ComposePainter;
    contentDescription: string | null;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    alignment?: ComposeAlignment;
    contentScale?: ComposeContentScale;
    alpha?: number;
    colorFilter?: ComposeColorFilterValue | null;
    bitmap?: never;
    filterQuality?: never;
    imageVector?: never;
    }
;
export const Image = createComposableComponent<ImageProps>({
  name: "Image",
  props: ["bitmap","contentDescription","modifier","alignment","contentScale","alpha","colorFilter","filterQuality","imageVector","painter"],
  objectProps: ["bitmap","colorFilter","imageVector","painter"],
  children: false,
  overloads: [
    { id: "Image", children: false, parameters: [["bitmap","object",false,false],["contentDescription","string",false,true],["modifier","ComposeModifier",true,false],["alignment","string",true,false],["contentScale","string",true,false],["alpha","number",true,false],["colorFilter","object",true,true],["filterQuality","string",true,false]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31] },
    { id: "Image#1", children: false, parameters: [["imageVector","object",false,false],["contentDescription","string",false,true],["modifier","ComposeModifier",true,false],["alignment","string",true,false],["contentScale","string",true,false],["alpha","number",true,false],["colorFilter","object",true,true]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15] },
    { id: "Image#2", children: false, parameters: [["painter","object",false,false],["contentDescription","string",false,true],["modifier","ComposeModifier",true,false],["alignment","string",true,false],["contentScale","string",true,false],["alpha","number",true,false],["colorFilter","object",true,true]], masks: [0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15] },
  ],
});
