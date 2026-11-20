import fs from "node:fs";
import path from "node:path";
import { fileURLToPath } from "node:url";
import { modifierKinds, modifierOutputs } from "./modifiers.mjs";
import { valueOutputs } from "./values.mjs";
import { factoryOutputs } from "./factories.mjs";

const repo = fileURLToPath(new URL("../../", import.meta.url));
const input = process.env.COMPOSE_API_MANIFEST ??
  path.join(repo, "tools/compose-codegen/build/generated/ksp/debug/resources/compose-api-manifest.json");
const output = process.env.COMPOSE_GENERATED_OUTPUT;
const manifest = JSON.parse(fs.readFileSync(input, "utf8"));
const check = process.argv.includes("--check");
const quote = JSON.stringify;

const kinds = {
  ...modifierKinds,
  string: { type: "string", expression: (key) => `node.string(${key})` },
  boolean: { type: "boolean", expression: (key) => `node.boolean(${key})` },
  int: { type: "number", expression: (key) => `node.number(${key}).toInt()` },
  float: { type: "number", expression: (key) => `node.number(${key}).toFloat()` },
  double: { type: "number", expression: (key) => `node.number(${key})` },
  dp: { type: "number", expression: (key) => `node.number(${key}).dp` },
  sp: { type: "number", expression: (key) => `node.number(${key}).sp` },
  colorScheme: { type: "ColorScheme", input: "object", expression: (key) => `node.jsonObject(${key}).toColorScheme()` },
  color: { type: "string", expression: (key) => `node.color(${key})` },
  shape: { ...modifierKinds.shape, expression: (key) => `node.arguments().shape(${key})` },
  brush: { ...modifierKinds.brush, expression: (key) => `node.arguments().brush(${key})` },
  floatRange: { type: "ComposeFloatRange", input: "object", expression: (key) => `node.arguments().floatRange(${key})` },
  floatProducer: { type: "number", expression: (key) => `{ node.number(${key}).toFloat() }` },
  modifier: { type: "ComposeModifier", expression: (key) => `node.modifier(${key}, scope)` },
  event: { type: "() => void", input: "function", expression: (key) => `{ node.emit(${key}) }` },
  eventString: { type: "(value: string) => void", input: "function", expression: emitValue("String") },
  eventBoolean: { type: "(value: boolean) => void", input: "function", expression: emitValue("Boolean") },
  eventFloat: { type: "(value: number) => void", input: "function", expression: emitValue("Float") },
  eventDouble: { type: "(value: number) => void", input: "function", expression: emitValue("Double") },
  eventFloatRange: { type: "(value: ComposeFloatRange) => void", input: "function",
    expression: (key) => `{ value: ClosedFloatingPointRange<Float> -> node.emit(${key}, JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }` },
  eventInt: { type: "(value: number) => void", input: "function", expression: emitValue("Int") },
  slot: { type: "ReactNode", expression: (key) => `{ RenderComposeChildren(node.slot(${key})) }` },
};

for (const { name } of manifest.values ?? []) {
  kinds[name] = { type: name, input: "string", expression: (key) => `to${name}(node.string(${key}))` };
}

function emitValue(type) {
  return (key) => `{ value: ${type} -> node.emit(${key}, value) }`;
}

function validate({ schemaVersion, components, modifiers, values, factories, coverage }) {
  if (schemaVersion !== 3 || !Array.isArray(components) || !components.length ||
      !Array.isArray(modifiers) || !Array.isArray(values) || !Array.isArray(factories) || !Array.isArray(coverage)) {
    throw Error("Expected a nonempty Compose API manifest with schema version 3.");
  }
  for (const { name, kotlinFunction, parameters, children } of components) {
    if (!/^[A-Z]\w*$/.test(name)) throw Error(`Invalid component: ${name}`);
    if (!/^\w+(\.\w+)+$/.test(kotlinFunction)) throw Error(`Invalid Kotlin function: ${kotlinFunction}`);
    if (typeof children !== "boolean") throw Error(`Missing children flag for ${name}`);

    const props = new Set();
    for (const { name: prop, kind, optional, nullable } of parameters) {
      if (!/^[A-Za-z_]\w*$/.test(prop) || props.has(prop) || !Object.hasOwn(kinds, kind) ||
          typeof optional !== "boolean" || typeof nullable !== "boolean") {
        throw Error(`Invalid or duplicate prop: ${name}.${prop} (${kind})`);
      }
      props.add(prop);
    }
  }
}

function passedParameters({ parameters }, mask) {
  let bit = 0;
  return parameters.filter(({ optional, kind }) => !optional || kind === "modifier" || (mask & (1 << bit++)));
}

function fieldType({ kind, nullable }) {
  const type = kinds[kind].type;
  const value = nullable && kind.startsWith("event") ? `(${type})` : type;
  return `${value}${nullable && kind !== "slot" ? " | null" : ""}`;
}

function componentFields(component, parameters, exact, reserved = []) {
  const fields = parameters.flatMap((parameter) => {
    const { name, optional, kind } = parameter;
    const type = fieldType(parameter);
    if (kind === "modifier") return [
      `  modifiers${optional ? "?" : ""}: ${type};`,
      "  /** @deprecated Use the modifiers prop. */",
      `  modifier?: ${type};`,
    ];
    return [`  ${name}${optional && !exact ? "?" : ""}: ${type};`];
  });
  if (component.children) fields.push("  children?: ReactNode;");
  const names = new Set(parameters.map(({ name }) => name));
  if (component.children) names.add("children");
  for (const name of reserved) {
    if (!names.has(name)) {
      fields.push(`  ${name}?: never;`);
      if (name === "modifier") fields.push("  modifiers?: never;");
    }
  }
  return fields;
}

function typeScript({ components, values, factories }) {
  const usedKinds = new Set(components.flatMap(({ parameters }) => parameters.map(({ kind }) => kind)));
  const types = values.map(({ name }) => name).filter((name) => usedKinds.has(name));
  const declarations = [...Map.groupBy(components, ({ name }) => name)].map(([name, overloads]) => {
    const first = overloads[0];
    const exhaustive = ({ parameters, masks }) =>
      masks.length === (1 << parameters.filter(({ optional, kind }) => optional && kind !== "modifier").length);
    const allProps = [...new Set(overloads.flatMap(({ parameters, children }) =>
      [...parameters.map(({ name }) => name), ...(children ? ["children"] : [])]))];
    const simple = overloads.length === 1 && exhaustive(first);
    const fields = simple
      ? [`export interface ${name}Props {`, ...componentFields(first, first.parameters, false), "}"]
      : [
        `export type ${name}Props =`,
        ...overloads.flatMap((component) => {
          const full = exhaustive(component);
          const forms = full ? [component.parameters] : component.masks.map((mask) => passedParameters(component, mask));
          return forms.flatMap((parameters) => [
            "  | {",
            ...componentFields(component, parameters, !full, allProps).map((line) => `  ${line}`),
            "    }",
          ]);
        }),
        ";",
      ];
    const namesOf = (predicate) => [...new Set(overloads.flatMap(({ parameters }) =>
      parameters.filter(predicate).map(({ name }) => name)))];
    const props = namesOf(({ kind }) => kind !== "slot" && !kind.startsWith("event"));
    const objectProps = namesOf(({ kind }) => ["object", "shape", "brush"].includes(kinds[kind].input));
    const events = namesOf(({ kind }) => kind.startsWith("event"));
    const slots = namesOf(({ kind }) => kind === "slot");
    return [
      ...fields,
      `export const ${name} = createComposableComponent<${name}Props>({`,
      `  name: ${quote(name)},`,
      `  props: ${quote(props)},`,
      ...(objectProps.length ? [`  objectProps: ${quote(objectProps)},`] : []),
      ...(slots.length ? [`  slots: ${quote(slots)},`] : []),
      ...(events.length ? [`  events: ${quote(events)},`] : []),
      `  children: ${overloads.some(({ children }) => children)},`,
      ...(!simple ? [
        "  overloads: [",
        ...overloads.map(({ id, children, masks, parameters }) => {
          const asInput = ({ name, kind, optional, nullable }) => [
            name, kinds[kind].input ?? kinds[kind].type, optional, nullable,
          ];
          return `    { id: ${quote(id)}, children: ${children}, parameters: ${quote(parameters.map(asInput))}, masks: ${quote(masks)} },`;
        }),
        "  ],",
      ] : []),
      "});",
    ].join("\n");
  });
  return [
    "// Generated from Compose declarations by generate.mjs.",
    'import type { ReactNode } from "react";',
    'import { createComposableComponent, type ComposeModifier } from "./runtime/createComposableComponent";',
    ...(usedKinds.has("colorScheme") && factories.length ? ['import type { ColorScheme } from "./factories";'] : []),
    ...(usedKinds.has("shape") || usedKinds.has("brush") ? [
      `import type { ${[usedKinds.has("shape") && "ComposeShape", usedKinds.has("brush") && "ComposeBrush"].filter(Boolean).join(", ")} } from "../utils/modifier";`,
    ] : []),
    ...(usedKinds.has("floatRange") || usedKinds.has("eventFloatRange") ? [
      "export type ComposeFloatRange = readonly [start: number, endInclusive: number];",
    ] : []),
    ...(types.length ? [`import type { ${types.join(", ")} } from "./values";`] : []),
    "",
    ...declarations.flatMap((declaration) => [declaration, ""]),
  ].join("\n");
}

function kotlin({ components }) {
  const dispatch = components.map(({ id, renderer, parameters }) =>
    `    ${quote(id)} -> render${renderer}(node${parameters.some(({ kind }) => kind === "modifier") ? ", scope" : ""})`
  );
  const functions = components.map(({ renderer, kotlinFunction, parameters, children, childrenScope, optIns, masks }) => {
    const modifierScope = parameters.some(({ kind }) => kind === "modifier") ? ", scope: Any?" : "";
    const optionals = parameters.filter(({ optional, kind }) => optional && kind !== "modifier");
    const bits = new Map(optionals.map(({ name }, index) => [name, 1 << index]));
    const call = (mask, indent) => {
      const args = passedParameters({ parameters }, mask)
        .map(({ name, kind, nullable, scope }) => {
          const key = quote(name);
          const value = kind === "slot" && scope
            ? `{ RenderComposeChildren(node.slot(${key}), this) }`
            : kinds[kind].expression(key);
          const expression = nullable ? `if (node.isNull(${key})) null else (${value})` : value;
          return `\`${name}\` = ${expression}`;
        });
      if (children) args.push(`content = { RenderComposeChildren(node.children${childrenScope ? ", this" : ""}) }`);
      return args.length ? [
        `${kotlinFunction}(`,
        ...args.map((arg) => `${indent}  ${arg},`),
        `${indent})`,
      ].join("\n") : `${kotlinFunction}()`;
    };

    const body = !optionals.length ? [`  ${call(0, "  ")}`] : [
      "  val mask = " + optionals.map(({ name }) =>
        `(if (node.has(${quote(name)})) ${bits.get(name)} else 0)`).join(" +\n    "),
      "  when (mask) {",
      ...masks.map((mask) => `    ${mask} -> ${call(mask, "    ")}`),
      '    else -> error("Invalid generated arguments for " + node.name)',
      "  }",
    ];
    return [
      ...(optIns.length ? [`@OptIn(${optIns.map((marker) => `${marker}::class`).join(", ")})`] : []),
      "@Composable",
      `private fun render${renderer}(node: ComposeNode${modifierScope}) {`,
      ...body,
      "}",
      "",
    ].join("\n");
  });

  return [
    "// Generated from Compose declarations by generate.mjs.",
    "package com.jetpackcomposereactnative.generated",
    "",
    "import androidx.compose.runtime.Composable",
    "import androidx.compose.ui.unit.dp",
    "import androidx.compose.ui.unit.sp",
    ...(components.some(({ parameters }) => parameters.some(({ kind }) => kind === "eventFloatRange")) ? ["import org.json.JSONArray"] : []),
    "",
    "@Composable",
    "internal fun RenderComposable(node: ComposeNode, scope: Any?) {",
    "  when (node.name) {",
    ...dispatch,
    '    else -> error("Unknown generated Compose component: " + node.name)',
    "  }",
    "}",
    "",
    ...functions,
  ].join("\n");
}

validate(manifest);
const [factoryTypeScript, factoryKotlin] = factoryOutputs(manifest.factories);
for (const [name, overloads] of Map.groupBy(manifest.components, ({ name }) => name)) {
  overloads.forEach((component, index) => {
    component.id = index ? `${name}#${index}` : name;
    component.renderer = index ? `${name}_${index}` : name;
  });
}
const [modifierTypeScript, modifierKotlin] = modifierOutputs(manifest.modifiers, { ...kinds, ...modifierKinds });
const [valueTypeScript, valueKotlin] = valueOutputs(manifest.values);
const android = "android/src/main/java/com/jetpackcomposereactnative/generated";
const files = [
  ["src/generated/components.tsx", typeScript(manifest)],
  ["src/generated/modifiers.ts", modifierTypeScript],
  ["src/generated/values.ts", valueTypeScript],
  ["src/generated/factories.ts", factoryTypeScript],
  [`${android}/ComposeFactories.kt`, factoryKotlin],
  ["tools/compose-codegen/coverage.json", `${JSON.stringify(manifest.coverage, null, 2)}\n`],
  [`${android}/ComposableRegistry.kt`, kotlin(manifest)],
  [`${android}/ModifierRegistry.kt`, modifierKotlin],
  [`${android}/ComposeValues.kt`, valueKotlin],
];

for (const [relative, content] of files) {
  const destination = output ? path.join(output, path.basename(relative)) : path.join(repo, relative);
  if (check) {
    if (fs.readFileSync(destination, "utf8") !== content) throw Error(`Stale generated file: ${destination}`);
  } else {
    fs.mkdirSync(path.dirname(destination), { recursive: true });
    fs.writeFileSync(destination, content);
  }
}
console.log(`${check ? "Verified" : "Generated"} TypeScript and Kotlin for ${manifest.components.length} composable overloads and ${manifest.modifiers.length} modifier overloads`);
