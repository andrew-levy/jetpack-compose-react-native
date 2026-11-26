// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeShape } from "../../utils/modifier";

export interface PlainTooltipProps {
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  caretShape?: ComposeShape | null;
  maxWidth?: number;
  shape?: ComposeShape;
  contentColor?: string;
  containerColor?: string;
  tonalElevation?: number;
  shadowElevation?: number;
  children?: ReactNode;
}
export const PlainTooltip = createComposableComponent<PlainTooltipProps>({
  name: "PlainTooltip",
  props: ["modifier","caretShape","maxWidth","shape","contentColor","containerColor","tonalElevation","shadowElevation"],
  objectProps: ["caretShape","shape"],
  children: true,
});
