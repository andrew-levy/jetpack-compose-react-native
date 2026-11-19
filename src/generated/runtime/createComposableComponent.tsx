import * as React from "react";

import type { Modifier } from "../../utils/modifier";
import { ComposeHostContext, type ModifierData } from "./shared";
import { RenderComposeNode, type ComposeEventValue } from "./RenderComposeNode";

export type ComposeModifier = typeof Modifier;

export interface ComposableDescription {
  name: string;
  props: readonly string[];
  events?: readonly string[];
  slots?: readonly string[];
  children: boolean;
}

export function createComposableComponent<P extends object>(
  description: ComposableDescription,
): React.ComponentType<P> {
  const eventNames = new Set(description.events);
  function Generated(props: P & { children?: React.ReactNode }) {
    if (!React.useContext(ComposeHostContext)) {
      throw new Error(`Generated.${description.name} must be rendered inside a ComposeHost.`);
    }

    const values: Record<string, string | number | boolean | ModifierData | null> = {};
    const input = props as Record<string, unknown>;
    for (const name of description.props) {
      const value = input[name];
      if (value === undefined) continue;
      if (value === null) {
        values[name] = null;
        continue;
      }
      if (name === "modifier") {
        values[name] = (value as { build(): ModifierData }).build();
      } else if (typeof value === "string" || typeof value === "boolean" || typeof value === "number") {
        values[name] = value;
      }
    }

    for (const name of eventNames) {
      if (input[name] !== undefined) values[name] = input[name] === null ? null : true;
    }
    const slots = description.slots?.map((name) => {
      const child = input[name] as React.ReactNode;
      if (child === undefined) return null;
      values[name] = child === null ? null : true;
      if (child === null) return null;
      return <RenderComposeNode key={name} slotName={name}>{child}</RenderComposeNode>;
    });

    return (
      <RenderComposeNode
        componentName={description.name}
        values={JSON.stringify(values)}
        onComposeEvent={({ nativeEvent: { name, value } }) => {
          if (!eventNames.has(name)) return;
          const callback = input[name] as ((value?: ComposeEventValue) => void) | undefined;
          if (value === undefined) callback?.();
          else callback?.(value);
        }}
      >
        {description.children ? props.children : null}
        {slots}
      </RenderComposeNode>
    );
  }

  Generated.displayName = `Compose.${description.name}`;
  return Generated;
}
