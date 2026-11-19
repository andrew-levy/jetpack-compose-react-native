export function valueOutputs(values) {
  const typeScript = [
    "// Generated from Compose declarations by generate.mjs.",
    "",
    ...values.map(({ name, cases }) =>
      `export type ${name} = ${cases.map(({ name }) => JSON.stringify(name)).join(" | ")};`
    ),
    "",
  ].join("\n");

  const kotlin = [
    "// Generated from Compose declarations by generate.mjs.",
    "package com.jetpackcomposereactnative.generated",
    "",
    ...values.flatMap(({ name, kotlinType, cases }) => [
      `internal fun to${name}(value: String): ${kotlinType} = when (value) {`,
      ...cases.map(({ name, expression }) => `  ${JSON.stringify(name)} -> ${expression}`),
      `  else -> error("Unknown ${name}: " + value)`,
      "}",
      "",
    ]),
  ].join("\n");

  return [typeScript, kotlin];
}
