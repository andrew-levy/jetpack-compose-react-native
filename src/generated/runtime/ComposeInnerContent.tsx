import * as React from "react";

import { RenderComposeNode } from "./RenderComposeNode";

/** Renders the editable control inside a Compose text-field decoration slot. */
export function ComposeInnerContent() {
  return <RenderComposeNode componentName="$innerContent" />;
}
