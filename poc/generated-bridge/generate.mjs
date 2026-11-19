import fs from "node:fs";
import path from "node:path";
import { fileURLToPath } from "node:url";

const repo = fileURLToPath(new URL("../../", import.meta.url));
const input = process.env.COMPOSE_API_MANIFEST ??
  path.join(repo, "poc/generated-bridge/android-smoke/build/generated/ksp/debug/resources/compose-api-manifest.json");
const output = process.env.COMPOSE_GENERATED_OUTPUT;
const manifest = JSON.parse(fs.readFileSync(input, "utf8"));
const check = process.argv.includes("--check");
const quote = JSON.stringify;

const kinds = {
  string: { type: "string", expression: (key) => `node.string(${key})` },
  boolean: { type: "boolean", expression: (key) => `node.boolean(${key})` },
  int: { type: "number", expression: (key) => `node.number(${key}).toInt()` },
  float: { type: "number", expression: (key) => `node.number(${key}).toFloat()` },
  double: { type: "number", expression: (key) => `node.number(${key})` },
  dp: { type: "number", expression: (key) => `node.number(${key}).dp` },
  sp: { type: "number", expression: (key) => `node.number(${key}).sp` },
  color: { type: "string", expression: (key) => `node.color(${key})` },
  modifier: { type: "ComposeModifier", expression: (key) => `node.modifier(${key})` },
  event: { type: "() => void", expression: (key) => `{ node.emit(${key}) }` },
  eventString: { type: "(value: string) => void", expression: emitValue("String") },
  eventBoolean: { type: "(value: boolean) => void", expression: emitValue("Boolean") },
  eventFloat: { type: "(value: number) => void", expression: emitValue("Float") },
  eventDouble: { type: "(value: number) => void", expression: emitValue("Double") },
  eventInt: { type: "(value: number) => void", expression: emitValue("Int") },
  slot: { type: "ReactNode", expression: (key) => `{ RenderComposeChildren(node.slot(${key})) }` },
};

function emitValue(type) {
  return (key) => `{ value: ${type} -> node.emit(${key}, value) }`;
}

function validate({ schemaVersion, components }) {
  if (schemaVersion !== 1 || !Array.isArray(components) || !components.length) {
    throw Error("Expected a nonempty Compose API manifest with schema version 1.");
  }
  const names = new Set();
  for (const { name, kotlinFunction, parameters, children } of components) {
    if (!/^[A-Z]\w*$/.test(name) || names.has(name)) throw Error(`Invalid or duplicate component: ${name}`);
    if (!/^\w+(\.\w+)+$/.test(kotlinFunction)) throw Error(`Invalid Kotlin function: ${kotlinFunction}`);
    if (typeof children !== "boolean") throw Error(`Missing children flag for ${name}`);
    names.add(name);

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

function typeScript({ components }) {
  const declarations = components.map(({ name, parameters, children }) => {
    const fields = parameters.map(({ name, optional, kind, nullable }) => {
      const type = kinds[kind].type;
      const value = nullable && kind.startsWith("event") ? `(${type})` : type;
      return `  ${name}${optional ? "?" : ""}: ${value}${nullable && kind !== "slot" ? " | null" : ""};`;
    });
    if (children) fields.push("  children?: ReactNode;");
    const props = parameters.filter(({ kind }) => kind !== "slot" && !kind.startsWith("event")).map(({ name }) => name);
    const events = parameters.filter(({ kind }) => kind.startsWith("event")).map(({ name }) => name);
    const slots = parameters.filter(({ kind }) => kind === "slot").map(({ name }) => name);
    return [
      `export interface ${name}Props {`,
      ...fields,
      "}",
      `export const ${name} = createComposableComponent<${name}Props>({`,
      `  name: ${quote(name)},`,
      `  props: ${quote(props)},`,
      ...(slots.length ? [`  slots: ${quote(slots)},`] : []),
      ...(events.length ? [`  events: ${quote(events)},`] : []),
      `  children: ${children},`,
      "});",
    ].join("\n");
  });
  return [
    "// Generated from Compose declarations by generate.mjs.",
    'import type { ReactNode } from "react";',
    'import { createComposableComponent, type ComposeModifier } from "./runtime/createComposableComponent";',
    "",
    ...declarations.flatMap((declaration) => [declaration, ""]),
  ].join("\n");
}

function kotlin({ components }) {
  const dispatch = components.map(({ name }) => `    ${quote(name)} -> render${name}(node)`);
  const functions = components.map(({ name, kotlinFunction, parameters, children }) => {
    const optionals = parameters.filter(({ optional, kind }) => optional && kind !== "modifier");
    const bits = new Map(optionals.map(({ name }, index) => [name, 1 << index]));
    const call = (mask, indent) => {
      const args = parameters.filter(({ name }) => !bits.has(name) || (mask & bits.get(name)))
        .map(({ name, kind, nullable }) => {
          const key = quote(name);
          const value = kinds[kind].expression(key);
          const expression = nullable ? `if (node.isNull(${key})) null else (${value})` : value;
          return `\`${name}\` = ${expression}`;
        });
      if (children) args.push("content = { RenderComposeChildren(node.children) }");
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
      ...Array.from({ length: 1 << optionals.length }, (_, mask) => {
        const label = mask === (1 << optionals.length) - 1 ? "else" : mask;
        return `    ${label} -> ${call(mask, "    ")}`;
      }),
      "  }",
    ];
    return ["@Composable", `private fun render${name}(node: ComposeNode) {`, ...body, "}", ""].join("\n");
  });

  return [
    "// Generated from Compose declarations by generate.mjs.",
    "package com.jetpackcomposereactnative.generated",
    "",
    "import androidx.compose.runtime.Composable",
    "import androidx.compose.ui.unit.dp",
    "import androidx.compose.ui.unit.sp",
    "",
    "@Composable",
    "internal fun RenderComposable(node: ComposeNode) {",
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
const files = [
  ["src/generated/components.tsx", typeScript(manifest)],
  ["android/src/main/java/com/jetpackcomposereactnative/generated/ComposableRegistry.kt", kotlin(manifest)],
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
console.log(`${check ? "Verified" : "Generated"} TypeScript and Kotlin for ${manifest.components.length} composables`);
