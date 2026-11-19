import * as React from "react";
export interface ModifierCall { name: string; args: readonly unknown[]; }
export type ModifierChain = readonly ModifierCall[];
export interface ComposableDescription {
  name: string;
  props: readonly string[];
  children: boolean;
}
/**
 * Adapter injection point only. Does NOT register a real Fabric component.
 * A Fabric host/tree reconciler must be implemented and tested separately.
 */
export type NativeNodeAdapter = (
  name: string,
  values: Record<string, unknown>,
  children: React.ReactNode
) => React.ReactElement | null;
let adapter: NativeNodeAdapter | undefined;
export function installNativeNodeAdapter(value: NativeNodeAdapter) { adapter = value; }
export function createComposable<P extends object>(description: ComposableDescription): React.ComponentType<P> {
  function Generated(props: P & { children?: React.ReactNode }) {
    if (!adapter) throw new Error("Compose PoC has no Fabric adapter; generated API only.");
    const values: Record<string, unknown> = {};
    for (const key of description.props) {
      const value = (props as Record<string, unknown>)[key];
      if (value !== undefined) values[key] = value;
    }
    return adapter(description.name, values, description.children ? props.children : null);
  }
  Generated.displayName = "Compose." + description.name;
  return Generated as React.ComponentType<P>;
}
