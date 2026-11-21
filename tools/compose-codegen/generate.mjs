import fs from "node:fs";
import path from "node:path";
import { fileURLToPath } from "node:url";
import { modifierKinds, modifierOutputs } from "./modifiers.mjs";
import { valueOutputs } from "./values.mjs";
import { factoryOutputs } from "./factories.mjs";
import { verifyInventory } from "./inventory.mjs";

const repo = fileURLToPath(new URL("../../", import.meta.url));
const input = process.env.COMPOSE_API_MANIFEST ??
  path.join(repo, "tools/compose-codegen/build/generated/ksp/debug/resources/compose-api-manifest.json");
const output = process.env.COMPOSE_GENERATED_OUTPUT;
const manifest = JSON.parse(fs.readFileSync(input, "utf8"));
const check = process.argv.includes("--check");
const candidateDir = process.env.COMPOSE_KOTLIN_CANDIDATES;
const approvedDir = process.env.COMPOSE_APPROVED_KOTLIN;
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
  paddingValues: { type: "ComposePaddingValues", input: "object", expression: (key) => `node.jsonObject(${key}).toPaddingValues()` },
  windowInsets: { type: "ComposeWindowInsets", input: "object", expression: (key) => `node.jsonObject(${key}).toWindowInsets()` },
  windowInsetsProducer: { type: "ComposeWindowInsets", input: "object", expression: (key) => `{ node.jsonObject(${key}).toWindowInsets() }` },
  sheetState: { type: "ComposeSheetState", input: "object" },
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
  if (schemaVersion !== 4 || !Array.isArray(components) || !components.length ||
      !Array.isArray(modifiers) || !Array.isArray(values) || !Array.isArray(factories) || !Array.isArray(coverage)) {
    throw Error("Expected a nonempty Compose API manifest with schema version 4.");
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

function componentFields(component, parameters, reserved = []) {
  const fields = parameters.flatMap((parameter) => {
    const { name, optional, kind } = parameter;
    const type = fieldType(parameter);
    if (kind === "modifier") return [
      `  modifiers${optional ? "?" : ""}: ${type};`,
      "  /** @deprecated Use the modifiers prop. */",
      `  modifier?: ${type};`,
    ];
    return [`  ${name}${optional ? "?" : ""}: ${type};`];
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

// Merge sibling masks into optional TypeScript fields while keeping the accepted forms exact.
function propForms({ masks, parameters }) {
  const optionals = parameters.filter(({ optional, kind }) => optional && kind !== "modifier");
  const all = (1 << optionals.length) - 1;
  function compact(forms, bit) {
    if (forms.length === 0) return [];
    const remaining = all & ~(bit - 1);
    if (forms.length === 2 ** (optionals.length - Math.log2(bit))) return [[0, remaining]];
    if (bit > all) return [[0, 0]];
    const without = compact(forms.filter((mask) => !(mask & bit)), bit * 2);
    const withProp = new Map(compact(forms.filter((mask) => mask & bit), bit * 2)
      .map(([required, optional]) => [`${required}:${optional}`, [required, optional]]));
    const result = without.map(([required, optional]) =>
      withProp.delete(`${required}:${optional}`) ? [required, optional | bit] : [required, optional]);
    return [...result, ...[...withProp.values()].map(([required, optional]) => [required | bit, optional])];
  }
  return compact(masks, 1).map(([required, optional]) => parameters.flatMap((parameter) => {
    if (!parameter.optional || parameter.kind === "modifier") return [parameter];
    const bit = 1 << optionals.indexOf(parameter);
    if (required & bit) return [{ ...parameter, optional: false }];
    return optional & bit ? [parameter] : [];
  }));
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
      ? [`export interface ${name}Props {`, ...componentFields(first, first.parameters), "}"]
      : [
        `export type ${name}Props =`,
        ...overloads.flatMap((component) => {
          return propForms(component).flatMap((parameters) => [
            "  | {",
            ...componentFields(component, parameters, allProps).map((line) => `  ${line}`),
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
    ...(usedKinds.has("paddingValues") ? [
      "export type ComposePaddingValues = { all?: number; horizontal?: number; vertical?: number; start?: number; top?: number; end?: number; bottom?: number };",
    ] : []),
    ...(usedKinds.has("windowInsets") || usedKinds.has("windowInsetsProducer") ? [
      "export type ComposeWindowInsets = { left?: number; top?: number; right?: number; bottom?: number };",
    ] : []),
    ...(usedKinds.has("sheetState") ? [
      "export type ComposeSheetState = { skipPartiallyExpanded?: boolean };",
    ] : []),
    ...(types.length ? [`import type { ${types.join(", ")} } from "./values";`] : []),
    "",
    ...declarations.flatMap((declaration) => [declaration, ""]),
  ].join("\n");
}

function kotlin({ components }) {
  const dispatch = components.map(({ id, renderer, parameters }) =>
    `    ${quote(id)} -> Renderer${renderer}.render(node${parameters.some(({ kind }) => kind === "modifier") ? ", scope" : ""})`
  );
  const functions = components.map(({ signature, renderer, kotlinFunction, parameters, children, childrenScope, optIns, masks }) => {
    const modifierScope = parameters.some(({ kind }) => kind === "modifier") ? ", scope: Any?" : "";
    const optionals = parameters.filter(({ optional, kind }) => optional && kind !== "modifier");
    const bits = new Map(optionals.map(({ name }, index) => [name, 1 << index]));
    const call = (mask, indent) => {
      const args = passedParameters({ parameters }, mask)
        .map(({ name, kind, nullable, scope }) => {
          const key = quote(name);
          const value = kind === "sheetState" ? `requireNotNull(${name}Value)`
            : kind === "slot" && scope ? `{ RenderComposeChildren(node.slot(${key}), this) }`
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

    const maskValue = optionals.map(({ name }) =>
      `(if (node.has(${quote(name)})) ${bits.get(name)} else 0)`).join(" +\n    ");
    const state = parameters.filter(({ kind }) => kind === "sheetState");
    const stateArguments = state.map(({ name }) => `, ${name}Value`).join("");
    const stateValues = state.map(({ name }) =>
      `  val ${name}Value = if (node.has(${quote(name)}) && !node.isNull(${quote(name)})) node.jsonObject(${quote(name)}).rememberComposeSheetState() else null`
    );
    const invalid = '    else -> error("Invalid generated arguments for " + node.name)';
    const groupSize = 32;
    const groups = Map.groupBy(masks, (mask) => Math.floor(mask / groupSize));
    const split = masks.length > groupSize;
    const body = !optionals.length ? [`  ${call(0, "  ")}`] : [
      `  val mask = ${maskValue}`,
      split ? `  when (mask / ${groupSize}) {` : "  when (mask) {",
      ...(split ? [...groups.keys()].map((group) =>
        `    ${group} -> render${renderer}Group${group}(node${modifierScope ? ", scope" : ""}, mask${stateArguments})`
      ) : masks.map((mask) => `    ${mask} -> ${call(mask, "    ")}`)),
      invalid,
      "  }",
    ];
    const annotations = [
      ...(optIns.length ? [`@OptIn(${optIns.map((marker) => `${marker}::class`).join(", ")})`] : []),
      "@Composable",
    ];
    const stateTypes = state.map(({ name }) => `, ${name}Value: androidx.compose.material3.SheetState?`).join("");
    const methods = [
      ...annotations,
      `fun render(node: ComposeNode${modifierScope}) {`,
      ...stateValues,
      ...body,
      "}",
      "",
      ...(split ? [...groups].flatMap(([group, groupMasks]) => [
        ...annotations,
        `private fun render${renderer}Group${group}(node: ComposeNode${modifierScope}, mask: Int${stateTypes}) {`,
        "  when (mask) {",
        ...groupMasks.map((mask) => `    ${mask} -> ${call(mask, "    ")}`),
        invalid,
        "  }",
        "}",
        "",
      ]) : []),
    ];
    return [
      `// ${signature}`,
      `private object Renderer${renderer} {`,
      ...methods.filter((line, index) => line || index !== methods.length - 1)
        .map((line) => line ? `  ${line.replaceAll("\n", "\n  ")}` : ""),
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
const inventoryPath = process.env.COMPOSE_BINARY_INVENTORY ??
  path.join(repo, "tools/compose-codegen/build/compose-binary-inventory.json");
verifyInventory(manifest, JSON.parse(fs.readFileSync(inventoryPath, "utf8")));
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
const nativeFiles = [
  [`${android}/ComposeFactories.kt`, factoryKotlin],
  [`${android}/ComposableRegistry.kt`, kotlin(manifest)],
  [`${android}/ModifierRegistry.kt`, modifierKotlin],
  [`${android}/ComposeValues.kt`, valueKotlin],
];

if (candidateDir) {
  fs.mkdirSync(candidateDir, { recursive: true });
  for (const [relative, content] of nativeFiles) fs.writeFileSync(path.join(candidateDir, path.basename(relative)), content);
  process.exit(0);
}
if (!approvedDir) throw Error("Run the generation pipeline so Kotlin compiles before writing package exports.");
for (const [relative, content] of nativeFiles) {
  if (fs.readFileSync(path.join(approvedDir, path.basename(relative)), "utf8") !== content) {
    throw Error(`Kotlin candidate changed after compilation: ${relative}`);
  }
}
const surface = {
  components: manifest.components.map(({ name, parameters, children, masks }) => ({ name, parameters, children, masks })),
  modifiers: manifest.modifiers.map(({ name, parameters, scope, masks }) => ({ name, parameters, scope, masks })),
};
const files = [
  ...nativeFiles,
  ["src/generated/components.tsx", typeScript(manifest)],
  ["src/generated/modifiers.ts", modifierTypeScript],
  ["src/generated/values.ts", valueTypeScript],
  ["src/generated/factories.ts", factoryTypeScript],
  ["tools/compose-codegen/api-surface.json", `{\n${Object.entries(surface).map(([kind, entries]) =>
    `  "${kind}": [\n${entries.map((entry) => `    ${JSON.stringify(entry)}`).join(",\n")}\n  ]`).join(",\n")}\n}\n`],
  ["tools/compose-codegen/coverage.json", `${JSON.stringify(manifest.coverage, null, 2)}\n`],
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
