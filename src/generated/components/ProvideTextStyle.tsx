// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent } from "../../runtime/createComposableComponent";
import type { ComposeTextStyle } from "../../utils/composeValues";

export interface ProvideTextStyleProps {
  value: ComposeTextStyle;
  children?: ReactNode;
}
export const ProvideTextStyle = createComposableComponent<ProvideTextStyleProps>({
  name: "ProvideTextStyle",
  props: ["value"],
  objectProps: ["value"],
  children: true,
});
