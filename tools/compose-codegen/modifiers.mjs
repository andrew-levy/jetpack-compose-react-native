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
        [name, kinds[kind].input ?? kinds[kind].type, nullable]
      )),
    });
  }

  const methodDeclarations = [...methods].sort(([left], [right]) => left.localeCompare(right))
    .flatMap(([, signatures]) => [...signatures]);
  const valueTypes = [...new Set(overloads.flatMap(({ parameters }) => parameters.map(({ kind }) => kind)))]
    .filter((kind) => kind.startsWith("Compose")).sort();
  return [
    "// Generated from Compose declarations by generate.mjs.",
    'import { createModifierFactory, type ComposeBrush, type ComposeShape, type ModifierCompatibility, type ModifierPayload } from "../utils/modifier";',
    ...(valueTypes.length ? [`import type { ${valueTypes.join(", ")} } from "./values";`] : []),
    "",
    "interface GeneratedModifiers {",
    ...methodDeclarations,
    "}",
    "",
    "export type ComposeChain = GeneratedModifiers & ModifierCompatibility<ComposeChain> & ModifierPayload;",
    "",
    "const createChain = createModifierFactory({",
    ...Object.entries(metadata).map(([name, options]) => `  ${quote(name)}: [\n${options
      .sort((left, right) => Number(left.primary === "brush") - Number(right.primary === "brush"))
      .map(({ id, forms, primary, labels }) =>
        `    { id: ${id}, ${primary ? `primary: ${quote(primary)}, ` : ""}${labels ? `labels: ${quote(labels)}, ` : ""}forms: ${quote(forms)} },`
      ).join("\n")}\n  ],`),
    "});",
    "",
    "export function compose(): ComposeChain {",
    "  return createChain() as ComposeChain;",
    "}",
    "",
    "/** @deprecated Start a modifier chain with compose(). */",
    "export type Modifier = ComposeChain;",
    "/** @deprecated Start a modifier chain with compose(). */",
    "export const Modifier = compose();",
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
  for (const { kotlinFunction, scope } of overloads) {
    if (!scope && !imports.has(kotlinFunction)) imports.set(kotlinFunction, `composeModifier${imports.size}`);
  }
  const functions = overloads.flatMap(({ id, name, kotlinFunction, parameters, argumentLists, scope }) => {
    const signature = `private fun apply${id}(modifier: Modifier, args: ComposeModifierArguments${scope ? `, scope: ${scope}` : ""}): Modifier`;
    const render = (passed) => {
      const args = passed.map(({ name, kind, nullable }) => {
        const key = quote(name);
        const value = kinds[kind].expression(key).replaceAll("node.", "args.");
        return `\`${name}\` = ${nullable ? `if (args.isNull(${key})) null else ${value}` : value}`;
      });
      const call = `modifier.${scope ? name : imports.get(kotlinFunction)}(${args.join(", ")})`;
      return scope ? `with(scope) { ${call} }` : call;
    };
    if (argumentLists.length === 1) {
      const [passed] = argumentLists;
      return [
        `${signature} =`,
        `  ${render(passed)}`,
        "",
      ];
    }
    const optional = parameters.filter(({ optional }) => optional);
    const mask = optional.map(({ name }, index) => `(if (args.has(${quote(name)})) ${1 << index} else 0)`);
    return [
      `${signature} {`,
      `  val mask = ${mask.join(" +\n    ")}`,
      "  return when (mask) {",
      ...argumentLists.map((passed) => {
        const index = optional.reduce((bits, parameter, bit) => passed.includes(parameter) ? bits | (1 << bit) : bits, 0);
        return `    ${index} -> ${render(passed)}`;
      }),
      '    else -> error("Invalid generated modifier arguments: " + args)',
      "  }",
      "}",
      "",
    ];
  });

  return [
    "// Generated from Compose declarations by generate.mjs.",
    '@file:Suppress("UNUSED_PARAMETER")',
    "",
    "package com.jetpackcomposereactnative.generated",
    "",
    "import androidx.compose.ui.Modifier",
    "import androidx.compose.ui.unit.dp",
    "import androidx.compose.ui.unit.sp",
    ...[...imports].map(([name, alias]) => `import ${name} as ${alias}`),
    "",
    "internal fun applyComposeModifier(id: Int, modifier: Modifier, args: ComposeModifierArguments, scope: Any?): Modifier? = when (id) {",
    ...overloads.map(({ id, scope }) => scope
      ? `  ${id} -> if (scope is ${scope}) apply${id}(modifier, args, scope) else null`
      : `  ${id} -> apply${id}(modifier, args)`),
    '  else -> error("Unknown generated Compose modifier: " + id)',
    "}",
    "",
    ...functions,
  ].join("\n");
}
