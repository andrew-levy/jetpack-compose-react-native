// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeShape } from "../../utils/modifier";
import type { ComposeDpOffset } from "../values/records";
import type { ComposeBorderStroke, ComposePopupProperties, ComposeScrollState } from "../../utils/composeValues";

export interface DropdownMenuProps {
  expanded: boolean;
  onDismissRequest: () => void;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  offset?: ComposeDpOffset;
  scrollState?: ComposeScrollState;
  properties?: ComposePopupProperties;
  shape?: ComposeShape;
  containerColor?: string;
  tonalElevation?: number;
  shadowElevation?: number;
  border?: ComposeBorderStroke | null;
  children?: ReactNode;
}
export const DropdownMenu = createComposableComponent<DropdownMenuProps>({
  name: "DropdownMenu",
  props: ["expanded","modifier","offset","scrollState","properties","shape","containerColor","tonalElevation","shadowElevation","border"],
  objectProps: ["offset","scrollState","properties","shape","border"],
  events: ["onDismissRequest"],
  children: true,
});
