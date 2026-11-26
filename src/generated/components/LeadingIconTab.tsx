// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeInteractionSource } from "../../utils/nativeHandles";

export interface LeadingIconTabProps {
  selected: boolean;
  onClick: () => void;
  text: ReactNode;
  icon: ReactNode;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  enabled?: boolean;
  selectedContentColor?: string;
  unselectedContentColor?: string;
  interactionSource?: ComposeInteractionSource | null;
}
export const LeadingIconTab = createComposableComponent<LeadingIconTabProps>({
  name: "LeadingIconTab",
  props: ["selected","modifier","enabled","selectedContentColor","unselectedContentColor","interactionSource"],
  objectProps: ["interactionSource"],
  slots: ["text","icon"],
  events: ["onClick"],
  children: false,
});
