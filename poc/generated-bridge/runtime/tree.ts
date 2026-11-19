import * as React from "react";
import { COMPOSABLE_MARKER, type ComposableDescription } from "./createComposableComponent";

export interface SerializedComposableNode {
  name: string;
  props?: Record<string, string | boolean>;
  children?: SerializedComposableNode[];
}

export type EventTable = Map<string, () => void>;

/**
 * Serializes the initial generated component tree for the native Compose host.
 * This bootstrap supports generated elements, fragments, and arrays. It does
 * not yet implement React reconciliation, arbitrary function components,
 * modifier decoding, or Fabric's native child-mount protocol.
 */
export function serializeComposableTree(
  root: React.ReactNode,
  events: EventTable,
): SerializedComposableNode {
  let nextId = 0;
  function visit(value: React.ReactNode): SerializedComposableNode[] {
    if (value == null || typeof value === "boolean") return [];
    if (Array.isArray(value)) return value.flatMap(visit);
    if (!React.isValidElement(value)) {
      throw new Error("Only generated Compose components are supported in the bootstrap host");
    }
    if (value.type === React.Fragment) return visit((value.props as { children?: React.ReactNode }).children);
    const description = (value.type as unknown as { [COMPOSABLE_MARKER]?: ComposableDescription })[COMPOSABLE_MARKER];
    if (!description) throw new Error("Unsupported component in Compose tree");
    const input = value.props as Record<string, unknown>;
    const props: Record<string, string | boolean> = {};
    const id = String(++nextId);
    for (const name of description.props) {
      const prop = input[name];
      if (prop === undefined || prop === null) continue;
      if (typeof prop === "function" && name.startsWith("on")) {
        events.set(id + ":" + name, prop as () => void);
      } else if (typeof prop === "string" || typeof prop === "boolean") {
        props[name] = prop;
      } else if (name !== "modifier") {
        throw new Error("Unsupported Compose prop " + description.name + "." + name);
      }
    }
    props.__nodeId = id;
    const children = description.children ? visit(input.children as React.ReactNode) : [];
    return [{ name: description.name, props, ...(children.length ? { children } : {}) }];
  }
  const nodes = visit(root);
  if (nodes.length !== 1) throw new Error("Compose host requires exactly one root");
  return nodes[0];
}
