// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeNavigationItemColorsValue } from "../values/records";
import type { ComposeInteractionSource } from "../../utils/nativeHandles";
import type { ComposeNavigationSuiteTypeValue } from "../values/enums";

export interface NavigationSuiteItemProps {
  selected: boolean;
  onClick: () => void;
  icon: ReactNode;
  label: ReactNode;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  navigationSuiteType?: ComposeNavigationSuiteTypeValue;
  enabled?: boolean;
  badge?: ReactNode;
  colors?: ComposeNavigationItemColorsValue | null;
  interactionSource?: ComposeInteractionSource | null;
}
export const NavigationSuiteItem = createComposableComponent<NavigationSuiteItemProps>({
  name: "NavigationSuiteItem",
  props: ["selected","modifier","navigationSuiteType","enabled","colors","interactionSource"],
  objectProps: ["colors","interactionSource"],
  slots: ["icon","label","badge"],
  events: ["onClick"],
  children: false,
});
