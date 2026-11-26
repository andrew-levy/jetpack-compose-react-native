// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposePaneExpansionStateValue, ComposePaneScaffoldDirectiveValue, ComposeThreePaneScaffoldValueValue } from "../values/records";
import type { ComposePaneExpansionStateSnapshot } from "../values/payloads";

export interface SupportingPaneScaffoldProps {
  directive: ComposePaneScaffoldDirectiveValue;
  value: ComposeThreePaneScaffoldValueValue;
  mainPane: ReactNode;
  supportingPane: ReactNode;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  extraPane?: ReactNode;
  paneExpansionDragHandle?: ReactNode | ((value1: ComposePaneExpansionStateSnapshot) => ReactNode);
  paneExpansionState?: ComposePaneExpansionStateValue | null;
}
export const SupportingPaneScaffold = createComposableComponent<SupportingPaneScaffoldProps>({
  name: "SupportingPaneScaffold",
  props: ["directive","value","modifier","paneExpansionState"],
  objectProps: ["directive","value","paneExpansionState"],
  slots: ["mainPane","supportingPane","extraPane","paneExpansionDragHandle"],
  renderSlots: ["paneExpansionDragHandle"],
  children: false,
});
