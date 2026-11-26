// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent } from "../../runtime/createComposableComponent";

export interface LookaheadAnimationVisualDebuggingProps {
  isEnabled?: boolean;
  overlayColor?: string;
  multipleMatchesColor?: string;
  unmatchedElementColor?: string;
  inactiveElementColor?: string;
  isShowKeyLabelEnabled?: boolean;
  children?: ReactNode;
}
export const LookaheadAnimationVisualDebugging = createComposableComponent<LookaheadAnimationVisualDebuggingProps>({
  name: "LookaheadAnimationVisualDebugging",
  props: ["isEnabled","overlayColor","multipleMatchesColor","unmatchedElementColor","inactiveElementColor","isShowKeyLabelEnabled"],
  children: true,
});
