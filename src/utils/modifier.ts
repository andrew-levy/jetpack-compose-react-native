export type ComposeShape = string | { radius: number };
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
  end?: number;
  left?: number;
  right?: number;
}

export interface ModifierCompatibility<Chain> {
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

type ArgumentType = "string" | "number" | "boolean" | "function" | "stringOrObject";
type Argument = readonly [key: string, type: ArgumentType, nullable: boolean];

interface Overload {
  id: number;
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

function matches(value: unknown, type: ArgumentType, nullable: boolean): boolean {
  if (value === null) return nullable;
  if (type === "stringOrObject") return typeof value === "string" || isObject(value);
  return type === "number" ? typeof value === "number" && Number.isFinite(value) : typeof value === type;
}

function normalize(name: string, args: Record<string, unknown>): Record<string, unknown> {
  switch (name) {
    case "padding": {
      const { left, right, top, bottom, start, end, horizontal, vertical, ...rest } = args;
      if (Object.keys(rest).length) return args;
      if ([left, right, top, bottom, start, end].some((value) => value !== undefined)) {
        return {
          start: start ?? left ?? horizontal ?? 0,
          end: end ?? right ?? horizontal ?? 0,
          top: top ?? vertical ?? 0,
          bottom: bottom ?? vertical ?? 0,
        };
      }
      return { horizontal: horizontal ?? 0, vertical: vertical ?? 0 };
    }
    case "border":
      return { width: 1, ...(args.brush === undefined ? { color: "black" } : {}), ...args };
    case "shadow":
      return { elevation: 0, ...args };
    default:
      return args;
  }
}

function resolve(
  name: string,
  overloads: readonly Overload[],
  value: unknown,
): ModifierCall {
  const options = isObject(value)
    ? normalize(name, Object.fromEntries(Object.entries(value).filter(([, arg]) => arg !== undefined)))
    : value === undefined ? {} : undefined;
  let args = options;
  const ids: number[] = [];
  for (const { id, forms } of overloads) {
    for (const form of forms) {
      if (!args && form.length === 1) {
        const [[key, type, nullable]] = form;
        if (type !== "stringOrObject" && matches(value, type, nullable)) {
          args = { [key]: value };
        }
      }
      if (args && Object.keys(args).length === form.length &&
          form.every(([key, type, nullable]) => matches(args?.[key], type, nullable))) {
        ids.push(id);
        break;
      }
    }
  }
  if (args && ids.length) return { name, ids, args };
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
      value(this: ModifierChain, value: unknown) {
        return new ModifierChain([...this.build(), resolve(name, overloads, value)]);
      },
    });
  }
  for (const name of ["backgroundColor", "backgroundBrush"]) {
    if (!methods.background || Object.prototype.hasOwnProperty.call(methods, name)) continue;
    Object.defineProperty(ModifierChain.prototype, name, {
      value(this: ModifierChain, options: unknown) {
        return new ModifierChain([...this.build(), resolve("background", methods.background, options)]);
      },
    });
  }
  return new ModifierChain();
}
