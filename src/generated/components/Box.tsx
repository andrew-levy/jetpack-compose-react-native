// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeAlignment } from "../values/enums";

export type BoxProps =
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    contentAlignment?: ComposeAlignment;
    propagateMinConstraints?: boolean;
    children?: ReactNode;
    }
  | {
    modifiers: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    contentAlignment?: never;
    propagateMinConstraints?: never;
    children?: never;
    }
;
export const Box = createComposableComponent<BoxProps>({
  name: "Box",
  props: ["modifier","contentAlignment","propagateMinConstraints"],
  children: true,
  overloads: [
    { id: "Box", children: true, parameters: [["modifier","ComposeModifier",true,false],["contentAlignment","string",true,false],["propagateMinConstraints","boolean",true,false]], masks: [0,1,2,3] },
    { id: "Box#1", children: false, parameters: [["modifier","ComposeModifier",false,false]], masks: [0] },
  ],
});
