// Generated from Compose declarations by generate.mjs.
import { createComposableComponent } from "../../runtime/createComposableComponent";
import type { ComposeScrollFieldColorsValue } from "../values/records";

export interface ItemProps {
  index: number;
  selected: boolean;
  enabled?: boolean;
  colors?: ComposeScrollFieldColorsValue;
}
export const Item = createComposableComponent<ItemProps>({
  name: "Item",
  props: ["index","selected","enabled","colors"],
  objectProps: ["colors"],
  children: false,
});
