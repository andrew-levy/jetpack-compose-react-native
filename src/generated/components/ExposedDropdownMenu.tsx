// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeShape } from "../../utils/modifier";
import type { ComposeBorderStroke, ComposeScrollState } from "../../utils/composeValues";

export interface ExposedDropdownMenuProps {
  expanded: boolean;
  onDismissRequest: () => void;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  scrollState?: ComposeScrollState;
  matchAnchorWidth?: boolean;
  shape?: ComposeShape;
  containerColor?: string;
  tonalElevation?: number;
  shadowElevation?: number;
  border?: ComposeBorderStroke | null;
  children?: ReactNode;
}
export const ExposedDropdownMenu = createComposableComponent<ExposedDropdownMenuProps>({
  name: "ExposedDropdownMenu",
  props: ["expanded","modifier","scrollState","matchAnchorWidth","shape","containerColor","tonalElevation","shadowElevation","border"],
  objectProps: ["scrollState","shape","border"],
  events: ["onDismissRequest"],
  children: true,
});
