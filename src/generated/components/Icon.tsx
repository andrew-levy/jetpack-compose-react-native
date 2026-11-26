// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeImageBitmapValue } from "../values/records";
import type { ComposeMaterialIcon } from "../values/icons";
import type { ComposePainter } from "../../utils/composeValues";

export type IconProps =
  | {
    bitmap: ComposeImageBitmapValue;
    contentDescription: string | null;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    tint?: string;
    imageVector?: never;
    painter?: never;
    active?: never;
    activeContent?: never;
    inactiveContent?: never;
    }
  | {
    imageVector: ComposeMaterialIcon;
    contentDescription: string | null;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    tint?: string;
    bitmap?: never;
    painter?: never;
    active?: never;
    activeContent?: never;
    inactiveContent?: never;
    }
  | {
    painter: ComposePainter;
    contentDescription: string | null;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    tint?: string;
    bitmap?: never;
    imageVector?: never;
    active?: never;
    activeContent?: never;
    inactiveContent?: never;
    }
  | {
    active: boolean;
    activeContent?: ReactNode;
    inactiveContent?: ReactNode;
    bitmap?: never;
    contentDescription?: never;
    modifier?: never;
    modifiers?: never;
    tint?: never;
    imageVector?: never;
    painter?: never;
    }
;
export const Icon = createComposableComponent<IconProps>({
  name: "Icon",
  props: ["bitmap","contentDescription","modifier","tint","imageVector","painter","active"],
  objectProps: ["bitmap","imageVector","painter"],
  slots: ["activeContent","inactiveContent"],
  children: false,
  overloads: [
    { id: "Icon", children: false, parameters: [["bitmap","object",false,false],["contentDescription","string",false,true],["modifier","ComposeModifier",true,false],["tint","string",true,false]], masks: [0,1] },
    { id: "Icon#1", children: false, parameters: [["imageVector","object",false,false],["contentDescription","string",false,true],["modifier","ComposeModifier",true,false],["tint","string",true,false]], masks: [0,1] },
    { id: "Icon#2", children: false, parameters: [["painter","object",false,false],["contentDescription","string",false,true],["modifier","ComposeModifier",true,false],["tint","string",true,false]], masks: [0,1] },
    { id: "Icon#3", children: false, parameters: [["active","boolean",false,false],["activeContent","ReactNode",true,false],["inactiveContent","ReactNode",true,true]], masks: [0,1,2,3] },
  ],
});
