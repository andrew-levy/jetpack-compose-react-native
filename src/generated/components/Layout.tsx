// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeLayoutMeasurePolicy } from "../../utils/composeValues";

export type LayoutProps =
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    measurePolicy: ComposeLayoutMeasurePolicy;
    children?: never;
    }
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    measurePolicy: ComposeLayoutMeasurePolicy;
    children?: ReactNode;
    }
;
export const Layout = createComposableComponent<LayoutProps>({
  name: "Layout",
  props: ["modifier","measurePolicy"],
  objectProps: ["measurePolicy"],
  children: true,
  overloads: [
    { id: "Layout", children: false, parameters: [["modifier","ComposeModifier",true,false],["measurePolicy","object",false,false]], masks: [0] },
    { id: "Layout#1", children: true, parameters: [["modifier","ComposeModifier",true,false],["measurePolicy","object",false,false]], masks: [0] },
  ],
});
