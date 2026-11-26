// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent } from "../../runtime/createComposableComponent";
import type { ColorScheme } from "../values/factories";
import type { ComposeMotionSchemeValue, ComposeShapesValue, ComposeTypographyValue } from "../values/records";

export interface MaterialExpressiveThemeProps {
  colorScheme?: ColorScheme | null;
  motionScheme?: ComposeMotionSchemeValue | null;
  shapes?: ComposeShapesValue | null;
  typography?: ComposeTypographyValue | null;
  children?: ReactNode;
}
export const MaterialExpressiveTheme = createComposableComponent<MaterialExpressiveThemeProps>({
  name: "MaterialExpressiveTheme",
  props: ["colorScheme","motionScheme","shapes","typography"],
  objectProps: ["colorScheme","motionScheme","shapes","typography"],
  children: true,
});
