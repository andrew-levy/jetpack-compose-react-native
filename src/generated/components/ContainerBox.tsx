// Generated from Compose declarations by generate.mjs.
import { createComposableComponent } from "../../runtime/createComposableComponent";
import type { ComposeShape } from "../../utils/modifier";
import type { ComposeInteractionSource } from "../../utils/nativeHandles";
import type { ComposeTextFieldColorsValue } from "../values/records";

export interface ContainerBoxProps {
  enabled: boolean;
  isError: boolean;
  interactionSource: ComposeInteractionSource;
  colors?: ComposeTextFieldColorsValue;
  shape?: ComposeShape;
  focusedBorderThickness?: number;
  unfocusedBorderThickness?: number;
}
export const ContainerBox = createComposableComponent<ContainerBoxProps>({
  name: "ContainerBox",
  props: ["enabled","isError","interactionSource","colors","shape","focusedBorderThickness","unfocusedBorderThickness"],
  objectProps: ["interactionSource","colors","shape"],
  children: false,
});
