import * as React from "react";
import { requireNativeViewManager } from "expo-modules-core";
import { serializeComposableTree, type EventTable } from "./tree";

type NativeEvent = { nativeEvent: { nodeId: string; name: string } };
const NativeHost = requireNativeViewManager("GeneratedComposeHost");

export function ComposeHost({ children }: { children: React.ReactNode }) {
  const events: EventTable = new Map();
  const tree = serializeComposableTree(children, events);
  return React.createElement(NativeHost, {
    style: { flex: 1 },
    tree: JSON.stringify(tree),
    onComposeEvent: (event: NativeEvent) => {
      events.get(event.nativeEvent.nodeId + ":" + event.nativeEvent.name)?.();
    },
  });
}
