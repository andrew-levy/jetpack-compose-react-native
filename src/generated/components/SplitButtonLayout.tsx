// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";

export interface SplitButtonLayoutProps {
  leadingButton: ReactNode;
  trailingButton: ReactNode;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  spacing?: number;
}
export const SplitButtonLayout = createComposableComponent<SplitButtonLayoutProps>({
  name: "SplitButtonLayout",
  props: ["modifier","spacing"],
  slots: ["leadingButton","trailingButton"],
  children: false,
});
