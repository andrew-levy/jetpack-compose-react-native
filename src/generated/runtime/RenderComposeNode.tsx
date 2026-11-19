import type { ReactNode } from "react";

export type ComposeEventValue = string | number | boolean;

export interface RenderComposeNodeProps {
  componentName?: string;
  slotName?: string;
  values?: string;
  onComposeEvent?: (event: {
    nativeEvent: { name: string; value?: ComposeEventValue };
  }) => void;
  children?: ReactNode;
}

export function RenderComposeNode(_props: RenderComposeNodeProps) {
  return null;
}
