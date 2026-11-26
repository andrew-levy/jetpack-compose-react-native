// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeDropdownMenuPopupPositionProviderValue } from "../values/records";
import type { ComposePopupProperties } from "../../utils/composeValues";

export interface DropdownMenuPopupProps {
  expanded: boolean;
  onDismissRequest: () => void;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  popupPositionProvider?: ComposeDropdownMenuPopupPositionProviderValue;
  properties?: ComposePopupProperties;
  children?: ReactNode;
}
export const DropdownMenuPopup = createComposableComponent<DropdownMenuPopupProps>({
  name: "DropdownMenuPopup",
  props: ["expanded","modifier","popupPositionProvider","properties"],
  objectProps: ["popupPositionProvider","properties"],
  events: ["onDismissRequest"],
  children: true,
});
