// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeShape } from "../../utils/modifier";
import type { ComposePullToRefreshState } from "../../utils/nativeHandles";

export interface IndicatorBoxProps {
  state: ComposePullToRefreshState;
  isRefreshing: boolean;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  maxDistance?: number;
  shape?: ComposeShape;
  containerColor?: string;
  elevation?: number;
  children?: ReactNode;
}
export const IndicatorBox = createComposableComponent<IndicatorBoxProps>({
  name: "IndicatorBox",
  props: ["state","isRefreshing","modifier","maxDistance","shape","containerColor","elevation"],
  objectProps: ["state","shape"],
  children: true,
});
