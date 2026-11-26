// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeLayoutMeasurePolicy } from "../../utils/composeValues";

export interface MultiMeasureLayoutProps {
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  measurePolicy: ComposeLayoutMeasurePolicy;
  children?: ReactNode;
}
export const MultiMeasureLayout = createComposableComponent<MultiMeasureLayoutProps>({
  name: "MultiMeasureLayout",
  props: ["modifier","measurePolicy"],
  objectProps: ["measurePolicy"],
  children: true,
});
