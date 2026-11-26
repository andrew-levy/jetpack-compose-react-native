// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeWindowInsets } from "../../utils/composeValues";
import type { ComposeFabPositionValue } from "../values/enums";

export interface ScaffoldProps {
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  topBar?: ReactNode;
  bottomBar?: ReactNode;
  snackbarHost?: ReactNode;
  floatingActionButton?: ReactNode;
  floatingActionButtonPosition?: ComposeFabPositionValue;
  containerColor?: string;
  contentColor?: string;
  contentWindowInsets?: ComposeWindowInsets;
  children?: ReactNode;
}
export const Scaffold = createComposableComponent<ScaffoldProps>({
  name: "Scaffold",
  props: ["modifier","floatingActionButtonPosition","containerColor","contentColor","contentWindowInsets"],
  objectProps: ["contentWindowInsets"],
  slots: ["topBar","bottomBar","snackbarHost","floatingActionButton"],
  children: true,
});
