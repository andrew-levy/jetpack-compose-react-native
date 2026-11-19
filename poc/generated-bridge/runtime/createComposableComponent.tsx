import * as React from "react";

export interface ModifierCall { name: string; args: readonly unknown[] }
export type ModifierChain = readonly ModifierCall[];
export interface ComposableDescription {
  name: string;
  props: readonly string[];
  children: boolean;
}

export const COMPOSABLE_MARKER = Symbol.for("jetpack-compose-react-native.composable");

/** Metadata retained on generated React components for the native tree adapter. */
export interface GeneratedComposable {
  [COMPOSABLE_MARKER]: ComposableDescription;
}

/**
 * Creates the typed React component corresponding to a generated Compose API.
 * The host adapter is responsible for mounting the resulting tree.
 */
export function createComposableComponent<P extends object>(
  description: ComposableDescription,
): React.ComponentType<P> {
  function Generated(props: P & { children?: React.ReactNode }) {
    return React.createElement(ComposableNode, { description, ...props });
  }
  Object.assign(Generated, { [COMPOSABLE_MARKER]: description });
  Generated.displayName = "Compose." + description.name;
  return Generated as React.ComponentType<P>;
}

function ComposableNode(props: { description: ComposableDescription; children?: React.ReactNode }) {
  // The root renderer consumes these nodes. A nested node must not create a
  // ComposeView of its own.
  return React.createElement(React.Fragment, null, props.children);
}
