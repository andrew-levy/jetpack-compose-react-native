const quote = JSON.stringify;

const styleNames = { background: "style", border: "content" };
const backgroundLabels = { shape: "in" };

function positionalKey(name, parameters) {
  if (Object.hasOwn(styleNames, name)) {
    return parameters.find(({ kind }) => kind === "color" || kind === "brush")?.name;
  }
  const required = parameters.filter(({ optional }) => !optional);
  return required.length === 1 ? required[0].name : undefined;
}

export const modifierKinds = {
  shape: { type: "ComposeShape", expression: (key) => `args.shape(${key})`, input: "shape" },
  brush: { type: "ComposeBrush", expression: (key) => `args.brush(${key})`, input: "brush" },
};

export function typeImports(descriptors, ownModule) {
  const modules = new Map();
  for (const { type, module, imports } of descriptors) {
    if (!module || module === ownModule) continue;
    if (!modules.has(module)) modules.set(module, new Set());
    for (const name of imports ?? [type]) modules.get(module).add(name);
  }
  return [...modules].map(([module, names]) =>
    `import type { ${[...names].sort().join(", ")} } from ${quote(module)};`
  );
}

export function modifierOutputs(modifiers, kinds) {
  const overloads = modifiers.map((modifier, id) => {
    const optional = modifier.parameters.filter(({ optional }) => optional);
    const argumentLists = modifier.masks.map((mask) =>
      modifier.parameters.filter((parameter) => !parameter.optional || (mask & (1 << optional.indexOf(parameter))))
    );
    return { ...modifier, id, argumentLists };
  });
  return [typeScript(overloads, kinds), kotlin(overloads, kinds)];
}

function typeScript(overloads, kinds) {
  const methods = new Map();
  const metadata = Object.create(null);
  for (const { id, name, parameters: allParameters, argumentLists } of overloads) {
    const primary = positionalKey(name, allParameters);
    const labels = name === "background" ? backgroundLabels : undefined;
    const signatures = methods.get(name) ?? new Set();
    for (const parameters of argumentLists) {
      if (!parameters.length) {
        signatures.add(`  ${name}(): ComposeChain;`);
      } else {
        const fields = parameters.map((parameter) => `${parameter.name}: ${typeOf(parameter, kinds)}`);
        signatures.add(`  ${name}(options: { ${fields.join("; ")} }): ComposeChain;`);
        const first = primary
          ? parameters.find((parameter) => parameter.name === primary)
          : parameters.length === 1 ? parameters[0] : undefined;
        if (first) {
          const trailing = parameters.filter((parameter) => parameter !== first);
          const options = trailing.map((parameter) => {
            const field = labels?.[parameter.name] ?? parameter.name;
            const optional = name === "border" && (field === "width" || (first.kind === "brush" && field === "shape"));
            return { text: `${field}${optional ? "?" : ""}: ${typeOf(parameter, kinds)}`, optional };
          });
          const suffix = trailing.length
            ? `, options${options.every(({ optional }) => optional) ? "?" : ""}: { ${options.map(({ text }) => text).join("; ")} }`
            : "";
          signatures.add(`  ${name}(${styleNames[name] ?? first.name}: ${typeOf(first, kinds)}${suffix}): ComposeChain;`);
        }
      }
    }
    methods.set(name, signatures);
    (metadata[name] ??= []).push({
      id, primary, labels,
      forms: argumentLists.map((parameters) => parameters.map(({ name, kind, nullable }) =>
        [name, kinds[kind].modifierInput ?? kinds[kind].input ?? kinds[kind].type, nullable]
      )),
    });
  }

  const methodDeclarations = [...methods].sort(([left], [right]) => left.localeCompare(right))
    .flatMap(([, signatures]) => [...signatures]);
  const valueTypes = [...new Set(overloads.flatMap(({ parameters }) => parameters.map(({ kind }) => kind)))]
    .filter((kind) => kind.startsWith("Compose")).sort();
  return [
    "// Generated from Compose declarations by generate.mjs.",
    'import { createModifier, type ComposeBrush, type ComposeShape, type ModifierCompatibility, type ModifierPayload } from "../utils/modifier";',
    ...typeImports(overloads.flatMap(({ parameters }) => parameters.map(({ kind }) => kinds[kind]))),
    ...(valueTypes.length ? [`import type { ${valueTypes.join(", ")} } from "./values";`] : []),
    "",
    "interface GeneratedModifiers {",
    ...methodDeclarations,
    "}",
    "",
    "export type ComposeChain = GeneratedModifiers & ModifierCompatibility<ComposeChain> & ModifierPayload;",
    "",
    "export type Modifier = ComposeChain;",
    "",
    "export const Modifier = createModifier({",
    ...Object.entries(metadata).map(([name, options]) => `  ${quote(name)}: [\n${options
      .sort((left, right) => Number(left.primary === "brush") - Number(right.primary === "brush"))
      .map(({ id, forms, primary, labels }) =>
        `    { id: ${id}, ${primary ? `primary: ${quote(primary)}, ` : ""}${labels ? `labels: ${quote(labels)}, ` : ""}forms: ${quote(forms)} },`
      ).join("\n")}\n  ],`),
    "}) as Modifier;",
    "",
  ].join("\n");
}

function typeOf({ kind, nullable }, kinds) {
  const type = kinds[kind].type;
  if (!nullable) return type;
  return kind.startsWith("event") ? `(${type}) | null` : `${type} | null`;
}

function kotlin(overloads, kinds) {
  const imports = new Map();
  for (const { kotlinFunction, scope, staticOwner } of overloads) {
    if (!scope && !staticOwner && !imports.has(kotlinFunction)) imports.set(kotlinFunction, `composeModifier${imports.size}`);
  }
  const functions = overloads.flatMap(({ signature: sourceSignature, id, name, kotlinFunction, parameters, argumentLists, scope, staticOwner, optIns, composable }) => {
    const annotations = [
      `// ${sourceSignature}`,
      ...(optIns.length ? [`@OptIn(${optIns.map((marker) => `${marker}::class`).join(", ")})`] : []),
    ];
    const signature = `private fun apply${id}(modifier: Modifier, args: ComposeModifierArguments${scope ? `, scope: ${scope}` : ""}): Modifier`;
    const render = (passed) => {
      const args = passed.map(({ name, kind, nullable }) => {
        const key = quote(name);
        const value = (kinds[kind].modifierExpression ?? kinds[kind].expression)(key).replaceAll("node.", "args.");
        const argument = nullable ? `if (args.isNull(${key})) null else (${value})` : value;
        return `\`${name}\` = ${kinds[kind].spread ? "*" : ""}${argument}`;
      });
      const functionName = scope || staticOwner ? name : imports.get(kotlinFunction);
      const compositionValues = passed.flatMap(({ name, kind, nullable }) => {
        const composition = kinds[kind].composition;
        if (!composition) return [];
        const { value, factory, emitsEvents, nativeExpression } = composition;
        const key = quote(name);
        const factoryCall = nativeExpression?.(key) ?? `args.jsonObject(${key}).${factory}(${emitsEvents ? "args" : ""})`;
        return [`val ${value} = ${nullable ? `if (args.isNull(${key})) null else ${factoryCall}` : factoryCall}`];
      });
      const call = `${functionName}(${args.join(", ")})`;
      const invocation = composable || compositionValues.length
        ? `modifier.composed { ${[...compositionValues, call].join("; ")} }`
        : `modifier.${call}`;
      return scope || staticOwner ? `with(${staticOwner ?? "scope"}) { ${invocation} }` : invocation;
    };
    if (argumentLists.length === 1) {
      const [passed] = argumentLists;
      return [
        ...annotations,
        `${signature} =`,
        `  ${render(passed)}`,
        "",
      ];
    }
    const optional = parameters.filter(({ optional }) => optional);
    const mask = optional.map(({ name }, index) => `(if (args.has(${quote(name)})) ${1 << index} else 0)`);
    const cases = argumentLists.map((passed) => [
      optional.reduce((bits, parameter, bit) => passed.includes(parameter) ? bits | (1 << bit) : bits, 0),
      render(passed),
    ]);
    const groupSize = 32;
    const split = cases.length > groupSize;
    const groups = Map.groupBy(cases, ([index]) => Math.floor(index / groupSize));
    const invalid = '    else -> error("Invalid generated modifier arguments: " + args)';
    return [
      ...annotations,
      `${signature} {`,
      `  val mask = ${mask.join(" +\n    ")}`,
      split ? `  return when (mask / ${groupSize}) {` : "  return when (mask) {",
      ...(split ? [...groups.keys()].map((group) =>
        `    ${group} -> apply${id}Group${group}(modifier, args${scope ? ", scope" : ""}, mask)`
      ) : cases.map(([index, call]) => `    ${index} -> ${call}`)),
      invalid,
      "  }",
      "}",
      "",
      ...(split ? [...groups].flatMap(([group, groupCases]) => [
        ...annotations.slice(1),
        `${signature.replace(`apply${id}(`, `apply${id}Group${group}(`).replace("): Modifier", ", mask: Int): Modifier")} = when (mask) {`,
        ...groupCases.map(([index, call]) => `    ${index} -> ${call}`),
        invalid,
        "  }",
        "",
      ]) : []),
    ];
  });

  return [
    "// Generated from Compose declarations by generate.mjs.",
    '@file:Suppress("UNUSED_PARAMETER")',
    "",
    "package com.jetpackcomposereactnative.generated",
    "",
    "import androidx.compose.ui.Modifier",
    ...(overloads.some(({ parameters, composable, scope }) => composable || scope === "androidx.compose.animation.SharedTransitionScope" ||
      parameters.some(({ kind }) => kinds[kind].composition))
      ? ["import androidx.compose.ui.composed"] : []),
    "import androidx.compose.ui.unit.dp",
    "import androidx.compose.ui.unit.sp",
    ...[...imports].map(([name, alias]) => `import ${name} as ${alias}`),
    "",
    ...([...new Set(overloads.flatMap(({ optIns }) => optIns))].sort().length
      ? [`@OptIn(${[...new Set(overloads.flatMap(({ optIns }) => optIns))].sort().map((marker) => `${marker}::class`).join(", ")})`] : []),
    "internal fun applyComposeModifier(id: Int, modifier: Modifier, args: ComposeModifierArguments, scope: Any?): Modifier? = when (id) {",
    ...overloads.map(({ id, scope }) => {
      if (scope === "androidx.compose.animation.SharedTransitionScope") {
        return `  ${id} -> modifier.composed { apply${id}(this, args, currentComposeSharedTransitionScope()) }`;
      }
      if (scope) return `  ${id} -> if (scope is ${scope}) apply${id}(modifier, args, scope) else null`;
      return `  ${id} -> apply${id}(modifier, args)`;
    }),
    '  else -> error("Unknown generated Compose modifier: " + id)',
    "}",
    "",
    ...functions,
  ].join("\n");
}
