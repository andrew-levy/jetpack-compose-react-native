// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeAlignment } from "../values/enums";

export interface BoxWithConstraintsProps {
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  contentAlignment?: ComposeAlignment;
  propagateMinConstraints?: boolean;
  children?: ReactNode;
}
export const BoxWithConstraints = createComposableComponent<BoxWithConstraintsProps>({
  name: "BoxWithConstraints",
  props: ["modifier","contentAlignment","propagateMinConstraints"],
  children: true,
});
