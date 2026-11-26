// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent } from "../../runtime/createComposableComponent";

export interface ReusableContentHostProps {
  active: boolean;
  children?: ReactNode;
}
export const ReusableContentHost = createComposableComponent<ReusableContentHostProps>({
  name: "ReusableContentHost",
  props: ["active"],
  children: true,
});
