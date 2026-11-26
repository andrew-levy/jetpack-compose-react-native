// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeButtonColorsValue, ComposeButtonElevationValue, ComposeSplitButtonShapesValue } from "../values/records";
import type { ComposeBorderStroke, ComposePaddingValues } from "../../utils/composeValues";
import type { ComposeInteractionSource } from "../../utils/nativeHandles";

export interface LeadingButtonProps {
  onClick: () => void;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  enabled?: boolean;
  shapes?: ComposeSplitButtonShapesValue;
  colors?: ComposeButtonColorsValue;
  elevation?: ComposeButtonElevationValue | null;
  border?: ComposeBorderStroke | null;
  contentPadding?: ComposePaddingValues;
  interactionSource?: ComposeInteractionSource | null;
  children?: ReactNode;
}
export const LeadingButton = createComposableComponent<LeadingButtonProps>({
  name: "LeadingButton",
  props: ["modifier","enabled","shapes","colors","elevation","border","contentPadding","interactionSource"],
  objectProps: ["shapes","colors","elevation","border","contentPadding","interactionSource"],
  events: ["onClick"],
  children: true,
});
