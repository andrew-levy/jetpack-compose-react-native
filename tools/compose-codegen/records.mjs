const decoders = {
  boolean: ["boolean", "getBoolean", ""],
  int: ["number", "getInt", ""],
  float: ["number", "getDouble", ".toFloat()"],
  double: ["number", "getDouble", ""],
  dp: ["number", "getDouble", ".dp"],
  sp: ["number", "getDouble", ".sp"],
};

export function recordOutputs(records) {
  const ts = ["// Generated from Compose value factories by generate.mjs."];
  const kt = [
    "// Generated from Compose value factories by generate.mjs.",
    "package com.jetpackcomposereactnative.generated",
    "",
    "import androidx.compose.ui.unit.dp",
    "import androidx.compose.ui.unit.sp",
    "import org.json.JSONObject",
  ];
  for (const { name, kotlinType, fields } of records) {
    const typeFields = fields.map(({ name: field, kind }) => field + ": " + decoders[kind][0]);
    ts.push("", "export type " + name + " = { " + typeFields.join("; ") + " };");
    kt.push("", "internal fun JSONObject.decode" + name + "(): " + kotlinType + " = " + kotlinType + "(");
    for (const { name: field, kind } of fields) {
      const [, decode, suffix] = decoders[kind];
      const label = String.fromCharCode(96) + field + String.fromCharCode(96);
      kt.push("  " + label + " = " + decode + "(" + JSON.stringify(field) + ")" + suffix + ",");
    }
    kt.push(")");
  }
  if (records.length === 0) ts.push("", "export {};");
  return [ts.join("\n") + "\n", kt.join("\n") + "\n"];
}
