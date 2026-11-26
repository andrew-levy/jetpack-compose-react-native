// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent, type ComposeModifier } from "../../runtime/createComposableComponent";
import type { ComposeShape } from "../../utils/modifier";
import type { ComposeWindowInsets } from "../../utils/composeValues";

export interface PermanentDrawerSheetProps {
  modifiers?: ComposeModifier;
  /** @deprecated Use the modifiers prop. */
  modifier?: ComposeModifier;
  drawerShape?: ComposeShape;
  drawerContainerColor?: string;
  drawerContentColor?: string;
  drawerTonalElevation?: number;
  windowInsets?: ComposeWindowInsets;
  children?: ReactNode;
}
export const PermanentDrawerSheet = createComposableComponent<PermanentDrawerSheetProps>({
  name: "PermanentDrawerSheet",
  props: ["modifier","drawerShape","drawerContainerColor","drawerContentColor","drawerTonalElevation","windowInsets"],
  objectProps: ["drawerShape","windowInsets"],
  children: true,
});
