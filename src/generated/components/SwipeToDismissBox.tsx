// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeSwipeToDismissState } from "../../utils/composeValues";
import type { ComposeSwipeToDismissBoxValueOption } from "../values/enums";

export interface SwipeToDismissBoxProps {
  state: ComposeSwipeToDismissState;
  backgroundContent: ReactNode;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  enableDismissFromStartToEnd?: boolean;
  enableDismissFromEndToStart?: boolean;
  gesturesEnabled?: boolean;
  onDismiss?: (value: ComposeSwipeToDismissBoxValueOption) => void;
  children?: ReactNode;
}
export const SwipeToDismissBox = createComposableComponent<SwipeToDismissBoxProps>({
  name: "SwipeToDismissBox",
  props: ["state","modifier","enableDismissFromStartToEnd","enableDismissFromEndToStart","gesturesEnabled"],
  objectProps: ["state"],
  slots: ["backgroundContent"],
  events: ["onDismiss"],
  children: true,
});
