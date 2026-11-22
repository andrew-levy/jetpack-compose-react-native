import { scalarKinds } from "./scalars.mjs";

function decodeField({ kind, name, nullable }) {
  const key = JSON.stringify(name);
  const decode = scalarKinds[kind]?.jsonRead(key) ?? (kind.startsWith("record:")
    ? `getJSONObject(${key}).decode${kind.slice("record:".length)}()`
    : `to${kind}(getString(${key}))`);
  return nullable ? `if (get(${key}) === JSONObject.NULL) null else ${decode}` : decode;
}

export function recordOutputs(records, kinds) {
  const fields = records.flatMap((record) => record.fields);
  const enums = [...new Set(fields.map(({ kind }) => kind).filter((kind) => kind.startsWith("Compose")))].sort();
  const ts = ["// Generated from Compose value factories by generate.mjs."];
  if (enums.length) ts.push(`import type { ${enums.join(", ")} } from "./values";`);
  const kt = [
    "// Generated from Compose value factories by generate.mjs.",
    "package com.jetpackcomposereactnative.generated",
    "",
    "import androidx.compose.ui.unit.dp",
    "import androidx.compose.ui.unit.sp",
    ...(fields.some(({ kind }) => kind === "color")
      ? ["import com.jetpackcomposereactnative.common.parseComposeColor"]
      : []),
    "import org.json.JSONObject",
  ];
  for (const { name, kotlinType, fields } of records) {
    const typeFields = fields.map(({ name: field, kind, optional, nullable }) =>
      `${field}${optional ? "?" : ""}: ${kinds[kind].type}${nullable ? " | null" : ""}`);
    ts.push("", `export type ${name} = { ${typeFields.join("; ")} };`);
    const optional = fields.filter((field) => field.optional);
    const argument = (field) => "`" + field.name + "` = " + decodeField(field);
    const signature = `internal fun JSONObject.decode${name}(): ${kotlinType}`;
    if (!optional.length) {
      kt.push("", `${signature} = ${kotlinType}(`, ...fields.map((field) => `  ${argument(field)},`), ")");
      continue;
    }
    const mask = optional.map(({ name }, index) => `(if (has(${JSON.stringify(name)})) ${1 << index} else 0)`);
    kt.push("", `${signature} = when (${mask.join(" + ")}) {`);
    for (let bits = 0; bits < 2 ** optional.length; bits++) {
      const passed = fields.filter((field) => !field.optional || (bits & (1 << optional.indexOf(field))));
      kt.push(`  ${bits} -> ${kotlinType}(${passed.map(argument).join(", ")})`);
    }
    kt.push(`  else -> error("Invalid generated arguments for ${name}")`, "}");
  }
  if (records.length === 0) ts.push("", "export {};");
  return [ts.join("\n") + "\n", kt.join("\n") + "\n"];
}
