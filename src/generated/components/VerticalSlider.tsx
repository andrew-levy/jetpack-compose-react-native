// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeInteractionSource, ComposeSliderState } from "../../utils/nativeHandles";
import type { ComposeSliderColorsValue } from "../values/records";

export interface VerticalSliderProps {
  state: ComposeSliderState;
  onValueChange: (value: number) => void;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  enabled?: boolean;
  onValueChangeFinished?: (() => void) | null;
  topToBottom?: boolean;
  colors?: ComposeSliderColorsValue;
  interactionSource?: ComposeInteractionSource;
  thumb?: ReactNode;
  track?: ReactNode;
}
export const VerticalSlider = createComposableComponent<VerticalSliderProps>({
  name: "VerticalSlider",
  props: ["state","modifier","enabled","topToBottom","colors","interactionSource"],
  objectProps: ["state","colors","interactionSource"],
  slots: ["thumb","track"],
  events: ["onValueChange","onValueChangeFinished"],
  children: false,
});
