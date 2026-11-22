import { scalarKinds } from "./scalars.mjs";

function decodeField({ kind, name, nullable }) {
  const key = JSON.stringify(name);
  const decode = scalarKinds[kind]?.jsonRead(key) ?? (kind.startsWith("record:")
    ? `getJSONObject(${key}).decode${kind.slice("record:".length)}()`
    : `to${kind}(getString(${key}))`);
  return nullable ? `if (get(${key}) === JSONObject.NULL) null else ${decode}` : decode;
}

export function recordOutputs(records, kinds) {
  const fields = records.flatMap((record) => [...record.fields, ...(record.factories ?? []).flatMap((factory) => factory.fields)]);
  const optIns = [...new Set(records.flatMap((record) => record.optIns ?? []))].sort();
  const enums = [...new Set(fields.map(({ kind }) => kind).filter((kind) => kind.startsWith("Compose")))].sort();
  const ts = ["// Generated from Compose value factories by generate.mjs."];
  if (enums.length) ts.push(`import type { ${enums.join(", ")} } from "./values";`);
  const kt = [
    "// Generated from Compose value factories by generate.mjs.",
    ...(optIns.length ? [`@file:OptIn(${optIns.map((marker) => `${marker}::class`).join(", ")})`, ""] : []),
    "package com.jetpackcomposereactnative.generated",
    "",
    ...(records.some(({ factories }) => factories?.length) ? ["import androidx.compose.runtime.Composable"] : []),
    "import androidx.compose.ui.unit.dp",
    "import androidx.compose.ui.unit.sp",
    ...(fields.some(({ kind }) => kind === "color")
      ? ["import com.jetpackcomposereactnative.common.parseComposeColor"]
      : []),
    "import org.json.JSONObject",
  ];
  const typeFields = (fields) => fields.map(({ name, kind, optional, nullable }) =>
    `${name}${optional ? "?" : ""}: ${kinds[kind].type}${nullable ? " | null" : ""}`);
  function emitDecoder(signature, call, fields, label) {
    const optional = fields.filter((field) => field.optional);
    const argument = (field) => "`" + field.name + "` = " + decodeField(field);
    if (!optional.length) {
      kt.push(`${signature} = ${call}(`, ...fields.map((field) => `  ${argument(field)},`), ")");
      return;
    }
    const mask = optional.map(({ name }, index) => `(if (has(${JSON.stringify(name)})) ${1 << index} else 0)`);
    kt.push(`${signature} = when (${mask.join(" + ")}) {`);
    for (let bits = 0; bits < 2 ** optional.length; bits++) {
      const passed = fields.filter((field) => !field.optional || (bits & (1 << optional.indexOf(field))));
      kt.push(`  ${bits} -> ${call}(${passed.map(argument).join(", ")})`);
    }
    kt.push('  else -> error("Invalid generated arguments for ' + label + '")', "}");
  }
  for (const { name, kotlinType, fields, factories = [] } of records) {
    const signature = `internal fun JSONObject.decode${name}(): ${kotlinType}`;
    kt.push("");
    if (factories.length === 0) {
      ts.push("", `export type ${name} = { ${typeFields(fields).join("; ")} };`);
      emitDecoder(signature, kotlinType, fields, name);
      continue;
    }
    ts.push("", `export type ${name} =`,
      ...factories.map(({ name, fields }) =>
        `  | { ${[`factory: ${JSON.stringify(name)}`, ...typeFields(fields)].join("; ")} }`),
      ";");
    kt.push("@Composable", `${signature} = when (val factory = getString("factory")) {`,
      ...factories.map(({ name: label }, index) => `  ${JSON.stringify(label)} -> decode${name}Factory${index}()`),
      `  else -> error("Unknown ${name} factory: " + factory)`, "}");
    for (const [index, { function: call, fields }] of factories.entries()) {
      kt.push("", "@Composable");
      emitDecoder(`private fun JSONObject.decode${name}Factory${index}(): ${kotlinType}`, call, fields, call);
    }
  }
  if (records.length === 0) ts.push("", "export {};");
  return [ts.join("\n") + "\n", kt.join("\n") + "\n"];
}
