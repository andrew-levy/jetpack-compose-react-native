import * as React from "react";

import type { ComposeChain } from "../modifiers";
import { AutomaticComposeHost } from "./ComposeHost";
import { ComposeHostContext, type ComposableViewProps } from "./shared";
import { RenderComposeNode, type ComposeEventValue } from "./RenderComposeNode";

export type ComposeModifier = ComposeChain;

type ComposeCallback = (value?: ComposeEventValue) => void;

function serializeModifier(modifier: ComposeModifier, callbacks: Map<string, ComposeCallback>) {
  return modifier.build().map((call, index) => {
    const args = Object.fromEntries(Object.entries(call.args).map(([name, value]) => {
      if (typeof value !== "function") return [name, value];
      const event = `modifier.${index}.${name}`;
      callbacks.set(event, value as ComposeCallback);
      return [name, event];
    }));
    return { ...call, args };
  });
}

export interface ComposableDescription {
  name: string;
  props: readonly string[];
  objectProps?: readonly string[];
  events?: readonly string[];
  slots?: readonly string[];
  children: boolean;
}

export function createComposableComponent<P extends object>(
  description: ComposableDescription,
): React.ComponentType<P & ComposableViewProps> {
  const eventNames = new Set(description.events);
  const objectProps = new Set(description.objectProps);
  function Generated(props: P & ComposableViewProps & { children?: React.ReactNode }) {
    const hasHost = React.useContext(ComposeHostContext);

    const values: Record<string, unknown> = {};
    const modifierCallbacks = new Map<string, ComposeCallback>();
    const input = props as Record<string, unknown>;
    for (const name of description.props) {
      const value = name === "modifier" && input.modifiers !== undefined ? input.modifiers : input[name];
      if (value === undefined) continue;
      if (value === null) {
        values[name] = null;
        continue;
      }
      if (name === "modifier") {
        values[name] = serializeModifier(value as ComposeModifier, modifierCallbacks);
      } else if (objectProps.has(name) && typeof value === "object") {
        values[name] = value;
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

    const node = (
      <RenderComposeNode
        componentName={description.name}
        values={JSON.stringify(values)}
        onComposeEvent={({ nativeEvent: { name, value } }) => {
          const callback = eventNames.has(name)
            ? input[name] as ComposeCallback | undefined
            : modifierCallbacks.get(name);
          if (value === undefined) callback?.();
          else callback?.(value);
        }}
      >
        {description.children ? props.children : null}
        {slots}
      </RenderComposeNode>
    );

    return hasHost ? node : (
      <AutomaticComposeHost style={props.style} testID={props.testID}>
        {node}
      </AutomaticComposeHost>
    );
  }

  Generated.displayName = `Compose.${description.name}`;
  return Generated;
}
