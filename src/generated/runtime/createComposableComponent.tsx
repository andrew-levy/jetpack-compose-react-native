import * as React from "react";

import type { ComposeChain } from "../modifiers";
import { AutomaticComposeHost } from "./ComposeHost";
import { ComposeHostContext, type ComposableViewProps } from "./shared";
import { RenderComposeNode, type ComposeEventValue } from "./RenderComposeNode";

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

type OverloadParameter = readonly [
  name: string, kind: string, optional: boolean, nullable: boolean,
];

interface ComposableOverload {
  id: string;
  children: boolean;
  parameters: readonly OverloadParameter[];
  masks: readonly number[];
}

export interface ComposableDescription {
  name: string;
  props: readonly string[];
  objectProps?: readonly string[];
  events?: readonly string[];
  slots?: readonly string[];
  children: boolean;
  overloads?: readonly ComposableOverload[];
}

function propValue(props: Record<string, unknown>, name: string) {
  return name === "modifier" && props.modifiers !== undefined ? props.modifiers : props[name];
}

function matchesType(value: unknown, kind: string, nullable: boolean) {
  if (kind === "ReactNode") return true;
  if (value === null) return nullable;
  if (kind === "tuple") return Array.isArray(value);
  if (kind === "object") return typeof value === "object" && !Array.isArray(value);
  if (kind === "ComposeModifier") return typeof (value as ComposeModifier)?.build === "function";
  if (kind === "brush" || kind === "shape") return typeof value === "string" || typeof value === "object";
  return typeof value === kind;
}

function selectOverload(
  description: ComposableDescription,
  names: ReadonlySet<string>,
  props: Record<string, unknown>,
) {
  const passed = [...names].filter((name) => propValue(props, name) !== undefined);
  const overload = description.overloads?.find(({ children, parameters, masks }) => {
    if (!children && props.children !== undefined) return false;
    if (passed.some((name) => !parameters.some(([parameter]) => parameter === name))) return false;
    let mask = 0;
    let bit = 0;
    for (const [name, kind, optional, nullable] of parameters) {
      const value = propValue(props, name);
      if (value === undefined ? !optional : !matchesType(value, kind, nullable)) return false;
      if (optional && name !== "modifier") {
        if (value !== undefined) mask |= 1 << bit;
        bit++;
      }
    }
    return masks.includes(mask);
  });
  if (!overload) throw new Error(`No Compose ${description.name} overload accepts ${passed.join(", ")}`);
  return overload;
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
        {(overload?.children ?? description.children) ? props.children : null}
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
