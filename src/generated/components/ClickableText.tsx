// Generated from Compose declarations by generate.mjs.
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeAnnotatedString, ComposeTextLayout, ComposeTextStyle } from "../../utils/composeValues";
import type { ComposeTextOverflow } from "../values/enums";

export interface ClickableTextProps {
  text: ComposeAnnotatedString;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  composeTextStyle?: ComposeTextStyle;
  softWrap?: boolean;
  overflow?: ComposeTextOverflow;
  maxLines?: number;
  onTextLayout?: (value: ComposeTextLayout) => void;
  onClick: (value: number) => void;
}
export const ClickableText = createComposableComponent<ClickableTextProps>({
  name: "ClickableText",
  props: ["text","modifier","composeTextStyle","softWrap","overflow","maxLines"],
  objectProps: ["text","composeTextStyle"],
  events: ["onTextLayout","onClick"],
  children: false,
});
