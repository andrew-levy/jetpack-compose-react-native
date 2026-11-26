// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeGridConfig } from "../../utils/composeValues";

export interface GridProps {
  config: ComposeGridConfig;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  children?: ReactNode;
}
export const Grid = createComposableComponent<GridProps>({
  name: "Grid",
  props: ["config","modifier"],
  objectProps: ["config"],
  children: true,
});
