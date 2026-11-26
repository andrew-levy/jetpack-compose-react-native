// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeCarouselState, ComposePaddingValues } from "../../utils/composeValues";

export interface HorizontalMultiBrowseCarouselProps {
  state: ComposeCarouselState;
  preferredItemWidth: number;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  itemSpacing?: number;
  userScrollEnabled?: boolean;
  minSmallItemWidth?: number;
  maxSmallItemWidth?: number;
  contentPadding?: ComposePaddingValues;
  children?: ReactNode;
}
export const HorizontalMultiBrowseCarousel = createComposableComponent<HorizontalMultiBrowseCarouselProps>({
  name: "HorizontalMultiBrowseCarousel",
  props: ["state","preferredItemWidth","modifier","itemSpacing","userScrollEnabled","minSmallItemWidth","maxSmallItemWidth","contentPadding"],
  objectProps: ["state","contentPadding"],
  children: true,
});
