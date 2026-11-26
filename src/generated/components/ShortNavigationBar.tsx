// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeWindowInsets } from "../../utils/composeValues";
import type { ComposeShortNavigationBarArrangementValue } from "../values/enums";

export interface ShortNavigationBarProps {
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  containerColor?: string;
  contentColor?: string;
  windowInsets?: ComposeWindowInsets;
  arrangement?: ComposeShortNavigationBarArrangementValue;
  children?: ReactNode;
}
export const ShortNavigationBar = createComposableComponent<ShortNavigationBarProps>({
  name: "ShortNavigationBar",
  props: ["modifier","containerColor","contentColor","windowInsets","arrangement"],
  objectProps: ["windowInsets"],
  children: true,
});
