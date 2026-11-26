// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent } from "../../runtime/createComposableComponent";
import type { ComposeProvidedValue } from "../values/locals";

export type CompositionLocalProviderProps =
  | {
    values?: readonly ComposeProvidedValue[];
    children?: ReactNode;
    value?: never;
    }
  | {
    value: ComposeProvidedValue;
    children?: ReactNode;
    values?: never;
    }
;
export const CompositionLocalProvider = createComposableComponent<CompositionLocalProviderProps>({
  name: "CompositionLocalProvider",
  props: ["values","value"],
  objectProps: ["values","value"],
  children: true,
  overloads: [
    { id: "CompositionLocalProvider", children: true, parameters: [["values","tuple",true,false]], masks: [0,1] },
    { id: "CompositionLocalProvider#1", children: true, parameters: [["value","object",false,false]], masks: [0] },
  ],
});
