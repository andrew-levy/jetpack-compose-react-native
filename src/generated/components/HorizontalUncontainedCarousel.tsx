// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeCarouselState, ComposePaddingValues } from "../../utils/composeValues";

export interface HorizontalUncontainedCarouselProps {
  state: ComposeCarouselState;
  itemWidth: number;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  itemSpacing?: number;
  userScrollEnabled?: boolean;
  contentPadding?: ComposePaddingValues;
  children?: ReactNode;
}
export const HorizontalUncontainedCarousel = createComposableComponent<HorizontalUncontainedCarouselProps>({
  name: "HorizontalUncontainedCarousel",
  props: ["state","itemWidth","modifier","itemSpacing","userScrollEnabled","contentPadding"],
  objectProps: ["state","contentPadding"],
  children: true,
});
