// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeShape } from "../../utils/modifier";
import type { ComposeWideNavigationRailStateHandle } from "../../utils/nativeHandles";
import type { ComposeWideNavigationRailColorsValue } from "../values/records";
import type { ComposePaddingValues, ComposeWindowInsets } from "../../utils/composeValues";
import type { ComposeVerticalArrangement } from "../values/enums";

export interface WideNavigationRailProps {
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  state?: ComposeWideNavigationRailStateHandle;
  shape?: ComposeShape;
  colors?: ComposeWideNavigationRailColorsValue;
  header?: ReactNode;
  windowInsets?: ComposeWindowInsets;
  arrangement?: ComposeVerticalArrangement;
  contentPadding?: ComposePaddingValues;
  children?: ReactNode;
}
export const WideNavigationRail = createComposableComponent<WideNavigationRailProps>({
  name: "WideNavigationRail",
  props: ["modifier","state","shape","colors","windowInsets","arrangement","contentPadding"],
  objectProps: ["state","shape","colors","windowInsets","contentPadding"],
  slots: ["header"],
  children: true,
});
