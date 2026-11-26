// Generated from Compose declarations by generate.mjs.
import type { ReactNode } from "react";
import { createComposableComponent } from "../../runtime/createComposableComponent";
import type { ColorScheme } from "../values/factories";
import type { ComposeMotionSchemeValue, ComposeShapesValue, ComposeTypographyValue } from "../values/records";

export type MaterialThemeProps =
  | {
    colorScheme?: ColorScheme;
    shapes?: ComposeShapesValue;
    typography?: ComposeTypographyValue;
    children?: ReactNode;
    motionScheme?: never;
    }
  | {
    colorScheme?: ColorScheme;
    motionScheme: ComposeMotionSchemeValue;
    shapes?: ComposeShapesValue;
    typography?: ComposeTypographyValue;
    children?: ReactNode;
    }
;
export const MaterialTheme = createComposableComponent<MaterialThemeProps>({
  name: "MaterialTheme",
  props: ["colorScheme","shapes","typography","motionScheme"],
  objectProps: ["colorScheme","shapes","typography","motionScheme"],
  children: true,
  overloads: [
    { id: "MaterialTheme", children: true, parameters: [["colorScheme","object",true,false],["shapes","object",true,false],["typography","object",true,false]], masks: [0,1,2,3,4,5,6,7] },
    { id: "MaterialTheme#1", children: true, parameters: [["colorScheme","object",true,false],["motionScheme","object",true,false],["shapes","object",true,false],["typography","object",true,false]], masks: [2,3,6,7,10,11,14,15] },
  ],
});
