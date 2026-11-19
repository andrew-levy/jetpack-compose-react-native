const quote = JSON.stringify;

export const modifierKinds = {
  shape: { type: "ComposeShape", expression: (key) => `args.shape(${key})`, input: "stringOrObject" },
  brush: { type: "ComposeBrush", expression: (key) => `args.brush(${key})`, input: "stringOrObject" },
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
  for (const { id, name, argumentLists } of overloads) {
    const signatures = methods.get(name) ?? new Set();
    for (const parameters of argumentLists) {
      if (!parameters.length) {
        signatures.add(`  ${name}(): Modifier;`);
      } else {
        const fields = parameters.map((parameter) => `${parameter.name}: ${typeOf(parameter, kinds)}`);
        signatures.add(`  ${name}(options: { ${fields.join("; ")} }): Modifier;`);
        if (parameters.length === 1) {
          const [parameter] = parameters;
          const type = typeOf(parameter, kinds);
          if (parameter.kind !== "shape" && parameter.kind !== "brush") {
            signatures.add(`  ${name}(${parameter.name}: ${type}): Modifier;`);
          }
        }
      }
    }
    methods.set(name, signatures);
    (metadata[name] ??= []).push({
      id,
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
    'import { createModifier, type ComposeBrush, type ComposeShape, type ModifierCompatibility, type ModifierPayload } from "../utils/modifier";',
    ...(valueTypes.length ? [`import type { ${valueTypes.join(", ")} } from "./values";`] : []),
    "",
    "interface GeneratedModifiers {",
    ...methodDeclarations,
    "}",
    "",
    "export type Modifier = GeneratedModifiers & ModifierCompatibility<Modifier> & ModifierPayload;",
    "",
    "export const Modifier = createModifier({",
    ...Object.entries(metadata).map(([name, options]) => `  ${quote(name)}: [\n${options.map(({ id, forms }) =>
      `    { id: ${id}, forms: ${quote(forms)} },`
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
