// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeNavigationItemColorsValue } from "../values/records";
import type { ComposeInteractionSource } from "../../utils/nativeHandles";
import type { ComposePaddingValues } from "../../utils/composeValues";
import type { ComposeNavigationItemIconPositionValue } from "../values/enums";

export interface WideNavigationRailItemProps {
  selected: boolean;
  onClick: () => void;
  icon: ReactNode;
  label: ReactNode;
  railExpanded: boolean;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  enabled?: boolean;
  iconPosition?: ComposeNavigationItemIconPositionValue;
  colors?: ComposeNavigationItemColorsValue;
  interactionSource?: ComposeInteractionSource | null;
  indicatorPadding?: ComposePaddingValues;
}
export const WideNavigationRailItem = createComposableComponent<WideNavigationRailItemProps>({
  name: "WideNavigationRailItem",
  props: ["selected","railExpanded","modifier","enabled","iconPosition","colors","interactionSource","indicatorPadding"],
  objectProps: ["colors","interactionSource","indicatorPadding"],
  slots: ["icon","label"],
  events: ["onClick"],
  children: false,
});
