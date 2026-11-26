import * as React from "react";
import { RenderComposeNode } from "./RenderComposeNode";

/** Pin one direct child of LazyColumn or LazyRow as a native Compose sticky header. */
export function StickyHeader({ children }: { children: React.ReactNode }) {
  return <RenderComposeNode componentName="$stickyHeader">{children}</RenderComposeNode>;
}
