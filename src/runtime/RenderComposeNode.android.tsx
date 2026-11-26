import * as React from "react";

import NativeNode from "../specs/JpcComposeNodeNativeComponent";
import type { RenderComposeNodeProps } from "./RenderComposeNode";

export function RenderComposeNode({ onComposeEvent, ...props }: RenderComposeNodeProps) {
  return (
    <NativeNode
      {...props}
      collapsable={false}
      onComposeEvent={onComposeEvent && ((event) => {
        onComposeEvent({ nativeEvent: JSON.parse(event.nativeEvent.payload) });
      })}
    />
  );
}
