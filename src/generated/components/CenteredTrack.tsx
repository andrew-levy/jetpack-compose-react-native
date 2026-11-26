// Generated from Compose declarations by generate.mjs.
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeSliderState } from "../../utils/nativeHandles";
import type { ComposeSliderColorsValue } from "../values/records";

export interface CenteredTrackProps {
  sliderState: ComposeSliderState;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  enabled?: boolean;
  colors?: ComposeSliderColorsValue;
  thumbTrackGapSize?: number;
  trackInsideCornerSize?: number;
  trackCornerSize?: number;
}
export const CenteredTrack = createComposableComponent<CenteredTrackProps>({
  name: "CenteredTrack",
  props: ["sliderState","modifier","enabled","colors","thumbTrackGapSize","trackInsideCornerSize","trackCornerSize"],
  objectProps: ["sliderState","colors"],
  children: false,
});
