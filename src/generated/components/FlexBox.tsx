// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeFlexBoxConfig } from "../../utils/composeValues";

export interface FlexBoxProps {
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  config?: ComposeFlexBoxConfig;
  children?: ReactNode;
}
export const FlexBox = createComposableComponent<FlexBoxProps>({
  name: "FlexBox",
  props: ["modifier","config"],
  objectProps: ["config"],
  children: true,
});
