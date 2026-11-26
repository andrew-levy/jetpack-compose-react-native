// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeCarouselState, ComposePaddingValues } from "../../utils/composeValues";

export interface HorizontalCenteredHeroCarouselProps {
  state: ComposeCarouselState;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  preferredItemWidth?: number;
  itemSpacing?: number;
  userScrollEnabled?: boolean;
  minSmallItemWidth?: number;
  maxSmallItemWidth?: number;
  contentPadding?: ComposePaddingValues;
  children?: ReactNode;
}
export const HorizontalCenteredHeroCarousel = createComposableComponent<HorizontalCenteredHeroCarouselProps>({
  name: "HorizontalCenteredHeroCarousel",
  props: ["state","modifier","preferredItemWidth","itemSpacing","userScrollEnabled","minSmallItemWidth","maxSmallItemWidth","contentPadding"],
  objectProps: ["state","contentPadding"],
  children: true,
});
