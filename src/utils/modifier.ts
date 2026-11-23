export type ComposeShape = string | { radius: number } | { rect: { cornerRadius: number } };
export type ComposeBrush = string | {
  colors: readonly string[];
  direction?: "horizontal" | "vertical";
};

interface Padding {
  horizontal?: number;
  vertical?: number;
  top?: number;
  bottom?: number;
  start?: number;
  leading?: number;
  end?: number;
  trailing?: number;
  left?: number;
  right?: number;
}

type PaddingEdge = "all" | "horizontal" | "vertical" | "top" | "bottom" | "leading" | "trailing";

export interface ModifierCompatibility<Chain> {
  padding(edges: PaddingEdge | readonly PaddingEdge[], length: number): Chain;
  padding(value: Padding): Chain;
  border(value: { width?: number; color?: string; brush?: ComposeBrush; shape?: ComposeShape }): Chain;
  backgroundColor(value: { color: string; shape?: ComposeShape }): Chain;
  backgroundBrush(value: { brush: ComposeBrush; shape?: ComposeShape; alpha?: number }): Chain;
  shadow(value: {
    elevation?: number;
    shape?: ComposeShape;
    clip?: boolean;
    ambientColor?: string;
    spotColor?: string;
  }): Chain;
}

type ArgumentType = "string" | "number" | "boolean" | "function" | "shape" | "brush" | "object" | "tuple" | "paddingValues" | "windowInsets";
type Argument = readonly [key: string, type: ArgumentType, nullable: boolean];

interface Overload {
  id: number;
  primary?: string;
  labels?: Readonly<Record<string, string>>;
  forms: readonly (readonly Argument[])[];
}

interface ModifierCall {
  name: string;
  ids: number[];
  args: Record<string, unknown>;
}

export interface ModifierPayload {
  build(): readonly ModifierCall[];
}

function isObject(value: unknown): value is Record<string, unknown> {
  return typeof value === "object" && value !== null && !Array.isArray(value);
}

const structuredEdges = {
  paddingValues: new Set(["all", "horizontal", "vertical", "start", "top", "end", "bottom"]),
  windowInsets: new Set(["left", "top", "right", "bottom"]),
};

function matches(value: unknown, type: ArgumentType, nullable: boolean): boolean {
  if (value === null) return nullable;
  if (type === "paddingValues" || type === "windowInsets") {
    return isObject(value) && Object.entries(value).every(([key, edge]) =>
      structuredEdges[type].has(key) && (edge === undefined || (typeof edge === "number" && Number.isFinite(edge)))
    );
  }
  if (type === "object") return isObject(value);
  if (type === "tuple") return Array.isArray(value);
  if (type === "shape") {
    return typeof value === "string" || (isObject(value) &&
      (typeof value.radius === "number" || (isObject(value.rect) && typeof value.rect.cornerRadius === "number")));
  }
  if (type === "brush") return typeof value === "string" || (isObject(value) && Array.isArray(value.colors));
  return type === "number" ? typeof value === "number" && Number.isFinite(value) : typeof value === type;
}

function normalize(name: string, args: Record<string, unknown>): Record<string, unknown> {
  switch (name) {
    case "padding": {
      const { left, right, top, bottom, start, end, leading, trailing, horizontal, vertical, ...rest } = args;
      if (Object.keys(rest).length) return args;
      if ([left, right, top, bottom, start, end, leading, trailing].some((value) => value !== undefined)) {
        return {
          start: start ?? leading ?? left ?? horizontal ?? 0,
          end: end ?? trailing ?? right ?? horizontal ?? 0,
          top: top ?? vertical ?? 0,
          bottom: bottom ?? vertical ?? 0,
        };
      }
      return { horizontal: horizontal ?? 0, vertical: vertical ?? 0 };
    }
    case "border":
      if (args.border !== undefined) return args;
      return { width: 1, ...(args.brush === undefined ? { color: "black" } : { shape: "rect" }), ...args };
    case "shadow":
      return { elevation: 0, ...args };
    default:
      return args;
  }
}

function withoutUndefined(options: Record<string, unknown>): Record<string, unknown> {
  return Object.fromEntries(Object.entries(options).filter(([, argument]) => argument !== undefined));
}

function matchesForm(form: readonly Argument[], args: Record<string, unknown>): boolean {
  return Object.keys(args).length === form.length &&
    form.every(([key, type, nullable]) => matches(args[key], type, nullable));
}

function edgePadding(value: unknown, length: number): Record<string, unknown> | undefined {
  const edges: unknown[] = Array.isArray(value) ? value : [value];
  const groups: Readonly<Record<PaddingEdge, readonly PaddingEdge[]>> = {
    all: ["top", "bottom", "leading", "trailing"],
    horizontal: ["leading", "trailing"],
    vertical: ["top", "bottom"],
    top: ["top"],
    bottom: ["bottom"],
    leading: ["leading"],
    trailing: ["trailing"],
  };
  if (!edges.every((edge) => typeof edge === "string" && Object.prototype.hasOwnProperty.call(groups, edge))) {
    return undefined;
  }
  return Object.fromEntries(edges.flatMap((edge) => groups[edge as PaddingEdge].map((name) => [name, length])));
}

function positionalArgs(
  name: string,
  overloads: readonly Overload[],
  value: unknown,
  options: Record<string, unknown>,
): Record<string, unknown> | undefined {
  for (const { primary, labels, forms } of overloads) {
    for (const form of forms) {
      const first = primary ? form.find(([key]) => key === primary) : form.length === 1 ? form[0] : undefined;
      if (!first) continue;
      const [key, type, nullable] = first;
      if (!matches(value, type, nullable)) continue;

      const args: Record<string, unknown> = { [key]: value };
      for (const [nativeKey] of form) {
        if (nativeKey === key) continue;
        const label = labels?.[nativeKey] ?? nativeKey;
        if (Object.prototype.hasOwnProperty.call(options, label)) args[nativeKey] = options[label];
      }
      if (Object.keys(args).length !== Object.keys(options).length + 1) continue;
      const normalized = normalize(name, args);
      if (matchesForm(form, normalized)) return normalized;
    }
  }
  return undefined;
}

function resolve(name: string, overloads: readonly Overload[], values: readonly unknown[]): ModifierCall {
  const [value, options] = values;
  const edges = name === "padding" && values.length === 2 && typeof options === "number"
    ? edgePadding(value, options)
    : undefined;
  const named = edges ?? (values.length === 1 && isObject(value) ? withoutUndefined(value) : undefined);
  let args: Record<string, unknown> | undefined = value === undefined && values.length <= 1 ? {} : undefined;
  if (named) {
    const normalized = normalize(name, named);
    if (overloads.some(({ forms }) => forms.some((form) => matchesForm(form, normalized)))) args = normalized;
  }
  if (!args && values.length <= 2 && (options === undefined || isObject(options))) {
    args = positionalArgs(name, overloads, value, options ? withoutUndefined(options) : {});
  }
  if (args) {
    const resolved = args;
    const ids = overloads.filter(({ forms }) => forms.some((form) => matchesForm(form, resolved))).map(({ id }) => id);
    if (ids.length) return { name, ids, args: resolved };
  }
  throw new TypeError(`No Compose modifier overload matches ${name}()`);
}

export function createModifier(methods: Record<string, readonly Overload[]>): ModifierPayload {
  class ModifierChain {
    constructor(private readonly calls: readonly ModifierCall[] = []) {}

    build(): readonly ModifierCall[] {
      return this.calls;
    }
  }

  for (const [name, overloads] of Object.entries(methods)) {
    Object.defineProperty(ModifierChain.prototype, name, {
      value(this: ModifierChain, ...values: unknown[]) {
        return new ModifierChain([...this.build(), resolve(name, overloads, values)]);
      },
    });
  }
  for (const name of ["backgroundColor", "backgroundBrush"]) {
    if (!methods.background || Object.prototype.hasOwnProperty.call(methods, name)) continue;
    Object.defineProperty(ModifierChain.prototype, name, {
      value(this: ModifierChain, options: unknown) {
        return new ModifierChain([...this.build(), resolve("background", methods.background, [options])]);
      },
    });
  }
  return new ModifierChain();
}
