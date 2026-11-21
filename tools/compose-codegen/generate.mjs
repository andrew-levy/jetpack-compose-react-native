import fs from "node:fs";
import path from "node:path";
import { fileURLToPath } from "node:url";
import { modifierKinds, modifierOutputs, typeImports } from "./modifiers.mjs";
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

const sharedTypes = {
  dpSize: ["ComposeDpSize", "toDpSize"],
  paddingValues: ["ComposePaddingValues", "toPaddingValues"],
  windowInsets: ["ComposeWindowInsets", "toWindowInsets"],
  annotatedString: ["ComposeAnnotatedString", "toAnnotatedString"],
  textStyle: ["ComposeTextStyle", "toTextStyle"],
  gridCells: ["ComposeGridCells", "toGridCells"],
  staggeredGridCells: ["ComposeGridCells", "toStaggeredGridCells"],
  semantics: ["ComposeSemantics", "toSemantics"],
  focusProperties: ["ComposeFocusProperties", "toFocusProperties"],
  dateFormatter: ["ComposeDatePickerFormatter", "toDatePickerFormatter"],
};

const stateKinds = {
  sheetState: ["ComposeSheetState", "androidx.compose.material3.SheetState", "rememberComposeSheetState"],
  datePickerState: ["ComposeDatePickerState", "androidx.compose.material3.DatePickerState", "rememberComposeDatePickerState"],
  dateRangePickerState: ["ComposeDateRangePickerState", "androidx.compose.material3.DateRangePickerState", "rememberComposeDateRangePickerState"],
  timePickerState: ["ComposeTimePickerState", "androidx.compose.material3.TimePickerState", "rememberComposeTimePickerState"],
  swipeToDismissState: ["ComposeSwipeToDismissState", "androidx.compose.material3.SwipeToDismissBoxState", "rememberComposeSwipeToDismissState"],
  bottomSheetScaffoldState: ["ComposeBottomSheetScaffoldState", "androidx.compose.material3.BottomSheetScaffoldState", "rememberComposeBottomSheetScaffoldState"],
  lazyListState: ["ComposeLazyState", "androidx.compose.foundation.lazy.LazyListState", "rememberComposeLazyListState"],
  lazyGridState: ["ComposeLazyState", "androidx.compose.foundation.lazy.grid.LazyGridState", "rememberComposeLazyGridState"],
  lazyStaggeredGridState: ["ComposeLazyState", "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState", "rememberComposeLazyStaggeredGridState"],
  pagerState: ["ComposePagerState", "androidx.compose.foundation.pager.PagerState", "rememberComposePagerState"],
  textFieldState: ["ComposeTextFieldState", "androidx.compose.foundation.text.input.TextFieldState", "rememberComposeTextFieldState"],
  searchBarState: ["ComposeSearchBarState", "androidx.compose.material3.SearchBarState", "rememberComposeSearchBarState"],
  basicTooltipState: ["ComposeTooltipState", "androidx.compose.foundation.BasicTooltipState", "rememberComposeBasicTooltipState"],
  tooltipState: ["ComposeTooltipState", "androidx.compose.material3.TooltipState", "rememberComposeTooltipState"],
  popupPosition: ["ComposePopupPosition", "androidx.compose.ui.window.PopupPositionProvider", "rememberComposePopupPosition"],
  snackbarHostState: ["ComposeSnackbarHostState", "androidx.compose.material3.SnackbarHostState", "rememberComposeSnackbarHostState"],
};

const kinds = {
  ...Object.fromEntries(Object.entries(stateKinds).map(([kind, [type]]) => [
    kind, { type, input: "object", module: kind === "sheetState" ? "./components" : "../utils/composeValues" },
  ])),
  alignmentLine: { type: "ComposeAlignmentLine", input: "string", module: "../utils/composeValues",
    expression: (key) => `toComposeAlignmentLine(node.string(${key}))` },
  scrollState: { type: "ComposeScrollState", input: "object", module: "../utils/composeValues",
    expression: () => "scrollState", composition: { value: "scrollState", factory: "rememberComposeScrollState" } },
  ...Object.fromEntries(Object.entries(sharedTypes).map(([kind, [type, decoder]]) => [
    kind, { type, input: "object", module: "../utils/composeValues", expression: (key) => `node.jsonObject(${key}).${decoder}()`,
      ...((kind === "paddingValues" || kind === "windowInsets") && { modifierInput: kind }) },
  ])),
  ...modifierKinds,
  string: { type: "string", expression: (key) => `node.string(${key})` },
  boolean: { type: "boolean", expression: (key) => `node.boolean(${key})` },
  int: { type: "number", expression: (key) => `node.number(${key}).toInt()` },
  long: { type: "number", expression: (key) => `node.number(${key}).toLong()` },
  float: { type: "number", expression: (key) => `node.number(${key}).toFloat()` },
  double: { type: "number", expression: (key) => `node.number(${key})` },
  dp: { type: "number", expression: (key) => `node.number(${key}).dp` },
  sp: { type: "number", expression: (key) => `node.number(${key}).sp` },
  colorScheme: { type: "ColorScheme", input: "object", expression: (key) => `node.jsonObject(${key}).toColorScheme()` },
  windowInsetsProducer: { type: "ComposeWindowInsets", input: "object", module: "../utils/composeValues", expression: (key) => `{ node.jsonObject(${key}).toWindowInsets() }` },
  painter: { type: "ComposePainter", input: "object", module: "../utils/composeValues",
    expression: (key) => `node.jsonObject(${key}).rememberComposePainter()`,
    modifierExpression: () => "painter",
    composition: { value: "painter", factory: "rememberComposePainter" } },
  color: { type: "string", expression: (key) => `node.color(${key})` },
  shape: { ...modifierKinds.shape, expression: (key) => `node.arguments().shape(${key})` },
  brush: { ...modifierKinds.brush, expression: (key) => `node.arguments().brush(${key})` },
  floatRange: { type: "ComposeFloatRange", input: "tuple", module: "./components", expression: (key) => `node.arguments().floatRange(${key})`,
    modifierExpression: (key) => `args.floatRange(${key})` },
  floatProducer: { type: "number", expression: (key) => `{ node.number(${key}).toFloat() }` },
  modifier: { type: "ComposeModifier", expression: (key) => `node.modifier(${key}, scope)` },
  event: { type: "() => void", input: "function", expression: (key) => `{ node.emit(${key}) }` },
  eventString: { type: "(value: string) => void", input: "function", expression: emitValue("String") },
  eventBoolean: { type: "(value: boolean) => void", input: "function", expression: emitValue("Boolean") },
  eventFloat: { type: "(value: number) => void", input: "function", expression: emitValue("Float") },
  eventDouble: { type: "(value: number) => void", input: "function", expression: emitValue("Double") },
  eventFloatRange: { type: "(value: ComposeFloatRange) => void", input: "function", module: "./components", imports: ["ComposeFloatRange"],
    expression: (key) => `{ value: ClosedFloatingPointRange<Float> -> node.emit(${key}, org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }` },
  eventLayoutBounds: eventSnapshot("ComposeLayoutPosition", "androidx.compose.ui.spatial.RelativeLayoutBounds"),
  eventLayoutSize: eventSnapshot("ComposeLayoutSize", "androidx.compose.ui.unit.IntSize"),
  eventLayoutPosition: eventSnapshot("ComposeLayoutPosition", "androidx.compose.ui.layout.LayoutCoordinates"),
  eventNullableLayoutPosition: eventSnapshot("ComposeLayoutPosition", "androidx.compose.ui.layout.LayoutCoordinates", true),
  eventFocusState: eventSnapshot("ComposeFocusState", "androidx.compose.ui.focus.FocusState"),
  eventInt: { type: "(value: number) => void", input: "function", expression: emitValue("Int") },
  slot: { type: "ReactNode", expression: (key) => `{ RenderComposeChildren(node.slot(${key})) }` },
};

for (const { name } of manifest.values ?? []) {
  kinds[name] = { type: name, input: "string", expression: (key) => `to${name}(node.string(${key}))` };
}

function eventSnapshot(snapshot, native, nullable = false) {
  return {
    type: `(value: ${snapshot}${nullable ? " | null" : ""}) => void`,
    input: "function",
    module: "../utils/composeValues",
    imports: [snapshot],
    expression: (key) => `{ value: ${native}${nullable ? "?" : ""} -> node.emit(${key}, ${nullable ? "value?.toComposeSnapshot() ?: org.json.JSONObject.NULL" : "value.toComposeSnapshot()"}) }`,
  };
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
    const objectProps = namesOf(({ kind }) => ["object", "tuple", "shape", "brush"].includes(kinds[kind].input));
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
    ...typeImports([...usedKinds].map((kind) => kinds[kind]), "./components"),
    'export type { ComposePaddingValues, ComposeWindowInsets } from "../utils/composeValues";',
    ...(usedKinds.has("sheetState") ? [
      "export type ComposeSheetState = { skipPartiallyExpanded?: boolean };",
    ] : []),
    ...(types.length ? [`import type { ${types.join(", ")} } from "./values";`] : []),
    "",
    ...declarations.flatMap((declaration) => [declaration, ""]),
  ].join("\n");
}

const pagerScope = "androidx.compose.foundation.pager.PagerScope";
const lazyBuilderScopes = new Set([
  "androidx.compose.foundation.lazy.LazyListScope",
  "androidx.compose.foundation.lazy.grid.LazyGridScope",
  "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope",
]);

function renderSlot(children, scope) {
  if (lazyBuilderScopes.has(scope)) return `{ renderLazyComposeChildren(${children}) }`;
  if (scope === pagerScope) {
    return `{ index -> ${children}.getOrNull(index)?.let { RenderComposeChild(it, this) } }`;
  }
  if (scope === "androidx.compose.foundation.layout.PaddingValues") {
    return `{ padding -> RenderPaddedComposeChildren(${children}, padding) }`;
  }
  return `{ RenderComposeChildren(${children}${scope ? ", this" : ""}) }`;
}

function kotlin({ components }) {
  const dispatch = components.flatMap(({ id, renderer, parameters, name, ownerScope }) => {
    if (ownerScope) return [
      `    ${quote(id)} -> {`,
      `      check(scope is ${ownerScope}) { ${quote(`${name} requires ${ownerScope.split(".").at(-1)}`)} }`,
      `      Renderer${renderer}.render(node, scope)`,
      "    }",
    ];
    return `    ${quote(id)} -> Renderer${renderer}.render(node${parameters.some(({ kind }) => kind === "modifier") ? ", scope" : ""})`;
  });
  const extensionImports = new Map();
  for (const { kotlinFunction, scopedExtension } of components) {
    if (scopedExtension && !extensionImports.has(kotlinFunction)) {
      extensionImports.set(kotlinFunction, `composeScoped${extensionImports.size}`);
    }
  }
  const ownerOptIns = [...new Set(components.filter(({ ownerScope }) => ownerScope).flatMap(({ optIns }) => optIns))].sort();
  const functions = components.map(({ signature, renderer, kotlinFunction, parameters, children, childrenScope, childrenParameter, optIns, masks, ownerScope, scopedExtension }) => {
    const modifierScope = ownerScope ? `, scope: ${ownerScope}` : parameters.some(({ kind }) => kind === "modifier") ? ", scope: Any?" : "";
    const nativeFunction = ownerScope
      ? `scope.${scopedExtension ? extensionImports.get(kotlinFunction) : kotlinFunction.split(".").at(-1)}`
      : kotlinFunction;
    const optionals = parameters.filter(({ optional, kind }) => optional && kind !== "modifier");
    const bits = new Map(optionals.map(({ name }, index) => [name, 1 << index]));
    const call = (mask, indent) => {
      const args = passedParameters({ parameters }, mask)
        .map(({ name, kind, nullable, scope }) => {
          const key = quote(name);
          const value = Object.hasOwn(stateKinds, kind) ? `requireNotNull(${name}Value)`
            : kind === "slot" && scope ? renderSlot(`node.slot(${key})`, scope)
            : kinds[kind].expression(key);
          const expression = nullable ? `if (node.isNull(${key})) null else (${value})` : value;
          return `\`${name}\` = ${expression}`;
        });
      if (children) {
        const argument = childrenParameter ?? "content";
        args.push(`${argument} = ${renderSlot("node.children", childrenScope)}`);
      }
      return args.length ? [
        `${nativeFunction}(`,
        ...args.map((arg) => `${indent}  ${arg},`),
        `${indent})`,
      ].join("\n") : `${nativeFunction}()`;
    };

    const maskValue = optionals.map(({ name }) =>
      `(if (node.has(${quote(name)})) ${bits.get(name)} else 0)`).join(" +\n    ");
    const state = parameters.filter(({ kind }) => Object.hasOwn(stateKinds, kind));
    const stateArguments = state.map(({ name }) => `, ${name}Value`).join("");
    const stateValues = state.map(({ name, kind }) =>
      `  val ${name}Value = if (node.has(${quote(name)}) && !node.isNull(${quote(name)})) node.jsonObject(${quote(name)}).${stateKinds[kind][2]}(${kind === "pagerState" ? "node" : ""}) else null`
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
    const stateTypes = state.map(({ name, kind }) => `, ${name}Value: ${stateKinds[kind][1]}?`).join("");
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

  const preamble = [
    "// Generated from Compose declarations by generate.mjs.",
    "package com.jetpackcomposereactnative.generated",
    "",
    "import androidx.compose.runtime.Composable",
    "import androidx.compose.ui.unit.dp",
    "import androidx.compose.ui.unit.sp",
    ...[...extensionImports].map(([name, alias]) => `import ${name} as ${alias}`),
    "",
  ];
  const registry = [
    ...(ownerOptIns.length ? [`@OptIn(${ownerOptIns.map((marker) => `${marker}::class`).join(", ")})`] : []),
    "@Composable",
    "internal fun RenderComposable(node: ComposeNode, scope: Any?) {",
    "  when (node.name) {",
    ...dispatch,
    '    else -> error("Unknown generated Compose component: " + node.name)',
    "  }",
    "}",
    "",
  ];

  // Kotlin lowers IR one file at a time. Keep a large API inventory from turning
  // into a single compilation unit containing thousands of default-argument calls.
  const maxRendererBytes = 1_000_000;
  const shards = [];
  let shard = [];
  let size = 0;
  for (const renderer of functions) {
    const bytes = Buffer.byteLength(renderer) + 1;
    if (size + bytes > maxRendererBytes && shard.length) {
      shards.push(shard);
      shard = [];
      size = 0;
    }
    shard.push(renderer);
    size += bytes;
  }
  if (shard.length) shards.push(shard);
  if (shards.length <= 1) {
    return [["ComposableRegistry.kt", [...preamble, ...registry, ...functions].join("\n")]];
  }
  return [
    ["ComposableRegistry.kt", [...preamble, ...registry].join("\n")],
    ...shards.map((renderers, index) => [
      `ComposableRenderers${index}.kt`,
      [...preamble, ...renderers.map((renderer) =>
        renderer.replace(/^private object Renderer/m, "internal object Renderer"))].join("\n"),
    ]),
  ];
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
  ...kotlin(manifest).map(([file, content]) => [`${android}/${file}`, content]),
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
const nativeOutput = output ?? path.join(repo, android);
const expectedShards = new Set(nativeFiles.map(([relative]) => path.basename(relative)));
for (const file of fs.readdirSync(nativeOutput)) {
  if (!/^ComposableRenderers[0-9]+\.kt$/.test(file) || expectedShards.has(file)) continue;
  if (check) throw Error(`Stale generated file: ${path.join(nativeOutput, file)}`);
  fs.rmSync(path.join(nativeOutput, file));
}
console.log(`${check ? "Verified" : "Generated"} TypeScript and Kotlin for ${manifest.components.length} composable overloads and ${manifest.modifiers.length} modifier overloads`);
