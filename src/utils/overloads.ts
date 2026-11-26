export type OverloadParameter = readonly [
  name: string, kind: string, optional: boolean, nullable: boolean,
];

export interface ComposableOverload {
  controlledText?: boolean;
  id: string;
  children: boolean;
  keyedChildren?: boolean;
  parameters: readonly OverloadParameter[];
  masks: readonly number[];
}

export interface ComposableDescription {
  controlledText?: boolean;
  name: string;
  props: readonly string[];
  objectProps?: readonly string[];
  events?: readonly string[];
  slots?: readonly string[];
  // Slots that Compose calls with values. They accept React content or a function of those values.
  renderSlots?: readonly string[];
  children: boolean;
  keyedChildren?: boolean;
  overloads?: readonly ComposableOverload[];
}

export function propValue(props: Record<string, unknown>, name: string) {
  return name === "modifier" && props.modifiers !== undefined ? props.modifiers : props[name];
}

function matchesType(value: unknown, kind: string, nullable: boolean) {
  if (kind === "ReactNode") return true;
  if (value === null) return nullable;
  if (kind === "tuple") return Array.isArray(value);
  if (kind === "animationTarget") return typeof value === "string" || typeof value === "number";
  if (kind === "object") return typeof value === "object" && !Array.isArray(value);
  if (kind === "ComposeModifier") return typeof (value as { build?: unknown } | null)?.build === "function";
  if (kind === "brush" || kind === "shape") return typeof value === "string" || typeof value === "object";
  return typeof value === kind;
}

export function selectOverload(
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
