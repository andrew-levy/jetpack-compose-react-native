// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeSelectionStateValue } from "../values/records";

export type SelectionContainerProps =
  | {
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    children?: ReactNode;
    state?: never;
    }
  | {
    state: ComposeSelectionStateValue;
    modifiers?: ComposeModifier;
    /** @deprecated Use the modifiers prop. */
    modifier?: ComposeModifier;
    children?: ReactNode;
    }
;
export const SelectionContainer = createComposableComponent<SelectionContainerProps>({
  name: "SelectionContainer",
  props: ["modifier","state"],
  objectProps: ["state"],
  children: true,
  overloads: [
    { id: "SelectionContainer", children: true, parameters: [["modifier","ComposeModifier",true,false]], masks: [0] },
    { id: "SelectionContainer#1", children: true, parameters: [["state","object",false,false],["modifier","ComposeModifier",true,false]], masks: [0] },
  ],
});
