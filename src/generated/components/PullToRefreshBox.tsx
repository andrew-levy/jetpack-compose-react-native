// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposePullToRefreshState } from "../../utils/nativeHandles";
import type { ComposeAlignment } from "../values/enums";

export interface PullToRefreshBoxProps {
  isRefreshing: boolean;
  onRefresh: () => void;
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  state?: ComposePullToRefreshState;
  contentAlignment?: ComposeAlignment;
  indicator?: ReactNode;
  enabled?: boolean;
  threshold?: number;
  children?: ReactNode;
}
export const PullToRefreshBox = createComposableComponent<PullToRefreshBoxProps>({
  name: "PullToRefreshBox",
  props: ["isRefreshing","modifier","state","contentAlignment","enabled","threshold"],
  objectProps: ["state"],
  slots: ["indicator"],
  events: ["onRefresh"],
  children: true,
});
