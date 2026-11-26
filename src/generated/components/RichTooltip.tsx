// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeShape } from "../../utils/modifier";
import type { ComposeRichTooltipColorsValue } from "../values/records";

export interface RichTooltipProps {
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  title?: ReactNode;
  action?: ReactNode;
  caretShape?: ComposeShape | null;
  maxWidth?: number;
  shape?: ComposeShape;
  colors?: ComposeRichTooltipColorsValue;
  tonalElevation?: number;
  shadowElevation?: number;
  text: ReactNode;
}
export const RichTooltip = createComposableComponent<RichTooltipProps>({
  name: "RichTooltip",
  props: ["modifier","caretShape","maxWidth","shape","colors","tonalElevation","shadowElevation"],
  objectProps: ["caretShape","shape","colors"],
  slots: ["title","action","text"],
  children: false,
});
