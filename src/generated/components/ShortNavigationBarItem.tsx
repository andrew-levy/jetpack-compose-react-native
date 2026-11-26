// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeNavigationItemColorsValue } from "../values/records";
import type { ComposeInteractionSource } from "../../utils/nativeHandles";
import type { ComposeNavigationItemIconPositionValue } from "../values/enums";

export interface ShortNavigationBarItemProps {
  selected: boolean;
  onClick: () => void;
  icon: ReactNode;
  label: ReactNode;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  enabled?: boolean;
  iconPosition?: ComposeNavigationItemIconPositionValue;
  colors?: ComposeNavigationItemColorsValue;
  interactionSource?: ComposeInteractionSource | null;
}
export const ShortNavigationBarItem = createComposableComponent<ShortNavigationBarItemProps>({
  name: "ShortNavigationBarItem",
  props: ["selected","modifier","enabled","iconPosition","colors","interactionSource"],
  objectProps: ["colors","interactionSource"],
  slots: ["icon","label"],
  events: ["onClick"],
  children: false,
});
