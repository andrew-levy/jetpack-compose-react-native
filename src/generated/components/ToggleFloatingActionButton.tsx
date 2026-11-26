// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeAlignment } from "../values/enums";

export interface ToggleFloatingActionButtonProps {
  checked: boolean;
  onCheckedChange: (value: boolean) => void;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  containerColor?: readonly (readonly [at: number, value: string])[];
  contentAlignment?: ComposeAlignment;
  containerSize?: readonly (readonly [at: number, value: number])[];
  containerCornerRadius?: readonly (readonly [at: number, value: number])[];
  children?: ReactNode;
}
export const ToggleFloatingActionButton = createComposableComponent<ToggleFloatingActionButtonProps>({
  name: "ToggleFloatingActionButton",
  props: ["checked","modifier","containerColor","contentAlignment","containerSize","containerCornerRadius"],
  objectProps: ["containerColor","containerSize","containerCornerRadius"],
  events: ["onCheckedChange"],
  children: true,
});
