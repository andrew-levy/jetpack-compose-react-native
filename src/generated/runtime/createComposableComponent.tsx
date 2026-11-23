import * as React from "react";

import type { ComposeChain } from "../modifiers";
import { propValue, selectOverload, type ComposableDescription } from "../../utils/overloads";
import { AutomaticComposeHost } from "./ComposeHost";
import { ComposeHostContext, type ComposableViewProps } from "./shared";
import { RenderComposeNode, type ComposeEventValue } from "./RenderComposeNode";

export type { ComposableDescription } from "../../utils/overloads";
export type ComposeModifier = ComposeChain;

type ComposeCallback = (value?: ComposeEventValue) => void;

function serializeBridgeValue(
  value: unknown,
  callbacks: Map<string, ComposeCallback>,
  path: readonly (string | number)[],
  allowCallback = false,
): unknown {
  if (typeof value === "function" && allowCallback) {
    const event = JSON.stringify(path);
    callbacks.set(event, value as ComposeCallback);
    return event;
  }
  if (Array.isArray(value)) {
    return value.map((element, index) => serializeBridgeValue(element, callbacks, [...path, index]));
  }
  if (value === null || typeof value !== "object" || Object.getPrototypeOf(value) !== Object.prototype) return value;
  return Object.fromEntries(Object.entries(value).map(([name, element]) =>
    [name, serializeBridgeValue(element, callbacks, [...path, name], /^on[A-Z]/.test(name))]
  ));
}

function serializeModifier(modifier: ComposeModifier, callbacks: Map<string, ComposeCallback>) {
  return modifier.build().map((call, index) => ({
    ...call,
    args: Object.fromEntries(Object.entries(call.args).map(([name, value]) =>
      [name, serializeBridgeValue(value, callbacks, ["modifier", index, name], true)]
    )),
  }));
}

function animationChildren(children: React.ReactNode) {
  return React.Children.map(children, (child) => {
    if (!React.isValidElement(child) || child.key === null) return null;
    return <RenderComposeNode slotName={`$state:${child.key}`}>{child}</RenderComposeNode>;
  });
}

export function createComposableComponent<P extends object>(
  description: ComposableDescription,
): React.ComponentType<P & ComposableViewProps> {
  const eventNames = new Set(description.events);
  const objectProps = new Set(description.objectProps);
  const allNames = new Set([...description.props, ...eventNames, ...(description.slots ?? [])]);
  function Generated(props: P & ComposableViewProps & { children?: React.ReactNode }) {
    const hasHost = React.useContext(ComposeHostContext);

    const values: Record<string, unknown> = {};
    const valueCallbacks = new Map<string, ComposeCallback>();
    const input = props as Record<string, unknown>;
    const overload = description.overloads && selectOverload(description, allNames, input);
    if (overload) values.$overload = overload.id;
    const selectedKinds = overload && new Map(overload.parameters.map(([name, kind]) => [name, kind]));
    for (const name of description.props) {
      if (selectedKinds?.get(name) === "function" || selectedKinds?.get(name) === "ReactNode") continue;
      const value = propValue(input, name);
      if (value === undefined) continue;
      if (value === null) {
        values[name] = null;
        continue;
      }
      if (name === "modifier") {
        values[name] = serializeModifier(value as ComposeModifier, valueCallbacks);
      } else if (objectProps.has(name) && typeof value === "object") {
        values[name] = serializeBridgeValue(value, valueCallbacks, ["prop", name]);
      } else if (typeof value === "string" || typeof value === "boolean" || typeof value === "number") {
        values[name] = value;
      }
    }

    for (const name of eventNames) {
      if (selectedKinds && selectedKinds.get(name) !== "function") continue;
      if (input[name] !== undefined) values[name] = input[name] === null ? null : true;
    }
    const slots = description.slots?.map((name) => {
      if (selectedKinds && selectedKinds.get(name) !== "ReactNode") return null;
      const child = input[name] as React.ReactNode;
      if (child === undefined) return null;
      values[name] = child === null ? null : true;
      if (child === null) return null;
      return <RenderComposeNode key={name} slotName={name}>{child}</RenderComposeNode>;
    });
    const usesKeys = (overload?.keyedChildren ?? description.keyedChildren) && typeof input.targetState === "string";

    const node = (
      <RenderComposeNode
        componentName={description.name}
        values={JSON.stringify(values)}
        onComposeEvent={({ nativeEvent: { name, value } }) => {
          const callback = eventNames.has(name)
            ? input[name] as ComposeCallback | undefined
            : valueCallbacks.get(name);
          if (value === undefined) callback?.();
          else callback?.(value);
        }}
      >
        {(overload?.children ?? description.children)
          ? (usesKeys ? animationChildren(props.children) : props.children)
          : null}
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
