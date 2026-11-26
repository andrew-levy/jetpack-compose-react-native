import { scalarKinds } from "./scalars.mjs";

// Reads one value of `kind` from the JSON receiver (a JSONObject, or a JSONArray for list elements).
export function decodeValue(kind, key) {
  if (kind.startsWith("list:")) {
    const element = decodeValue(kind.slice("list:".length), "index");
    return `getJSONArray(${key}).let { items -> List(items.length()) { index -> with(items) { ${element} } } }`;
  }
  if (kind === "shape") return `composeShape(${key})`;
  if (kind === "textStyle") return `getJSONObject(${key}).toTextStyle()`;
  if (Object.hasOwn(sharedDecoders, kind)) return `getJSONObject(${key}).${sharedDecoders[kind]}()`;
  if (kind === "brush") return `composeBrush(${key})`;
  return scalarKinds[kind]?.jsonRead(key) ?? (kind.startsWith("record:")
    ? `getJSONObject(${key}).decode${kind.slice("record:".length)}()`
    : `to${kind}(getString(${key}))`);
}

function decodeField({ kind, name, nullable }) {
  const key = JSON.stringify(name);
  const decode = decodeValue(kind, key);
  return nullable ? `if (get(${key}) === JSONObject.NULL) null else ${decode}` : decode;
}

// Bridge values with a shared JSON decoder (ComposeBridgeValues.kt).
const sharedDecoders = { dpSize: "toDpSize", paddingValues: "toPaddingValues", windowInsets: "toWindowInsets" };
const utilityTypes = { shape: "ComposeShape", brush: "ComposeBrush" };
const valueTypes = {
  textStyle: "ComposeTextStyle", dpSize: "ComposeDpSize", paddingValues: "ComposePaddingValues",
  windowInsets: "ComposeWindowInsets",
};

function fieldType(kind, kinds) {
  if (kind.startsWith("list:")) return `readonly ${fieldType(kind.slice("list:".length), kinds)}[]`;
  return utilityTypes[kind] ?? valueTypes[kind] ?? kinds[kind].type;
}

export function recordOutputs(records, kinds) {
  const fields = records.flatMap((record) => [...record.fields, ...(record.factories ?? []).flatMap((factory) => factory.fields)]);
  const optIns = [...new Set(records.flatMap((record) => record.optIns ?? []))].sort();
  const elementKinds = fields.map(({ kind }) => kind.replace(/^(list:)+/, ""));
  const enums = [...new Set(elementKinds.filter((kind) => kind.startsWith("Compose")))].sort();
  const utilities = [...new Set(elementKinds.filter((kind) => utilityTypes[kind]).map((kind) => utilityTypes[kind]))].sort();
  const ts = ["// Generated from Compose value factories by generate.mjs."];
  if (enums.length) ts.push(`import type { ${enums.join(", ")} } from "./values";`);
  if (utilities.length) ts.push(`import type { ${utilities.join(", ")} } from "../utils/modifier";`);
  const values = [...new Set(elementKinds.filter((kind) => valueTypes[kind]).map((kind) => valueTypes[kind]))].sort();
  if (values.length) ts.push(`import type { ${values.join(", ")} } from "../utils/composeValues";`);
  const kt = [
    "// Generated from Compose value factories by generate.mjs.",
    ...(optIns.length ? [`@file:OptIn(${optIns.map((marker) => `${marker}::class`).join(", ")})`, ""] : []),
    "package com.jetpackcomposereactnative.generated",
    "",
    ...(records.some(({ factories }) => factories?.some(({ composable }) => composable))
      ? ["import androidx.compose.runtime.Composable"] : []),
    "import androidx.compose.ui.unit.dp",
    "import androidx.compose.ui.unit.sp",
    ...(elementKinds.includes("color")
      ? ["import com.jetpackcomposereactnative.common.parseComposeColor"]
      : []),
    "import org.json.JSONObject",
  ];
  const typeFields = (fields) => fields.map(({ name, kind, optional, nullable }) =>
    `${name}${optional ? "?" : ""}: ${fieldType(kind, kinds)}${nullable ? " | null" : ""}`);
  // `markers`: an overload that shares its label is only chosen when JavaScript supplies one of the fields only
  // it declares, so call forms without one are never made (and may be ambiguous with the sibling overload).
  // `scope`: the factories are members of that scope and are called inside `with(scope)`.
  function emitDecoder(signature, call, fields, label, markers = null, scope = null) {
    const optional = fields.filter((field) => field.optional);
    const argument = (field) => "`" + field.name + "` = " + decodeField(field);
    const [open, close] = scope ? ["with(scope) { ", " }"] : ["", ""];
    if (!optional.length) {
      kt.push(`${signature} = ${open}${call}(`, ...fields.map((field) => `  ${argument(field)},`), `)${close}`);
      return;
    }
    const mask = optional.map(({ name }, index) => `(if (has(${JSON.stringify(name)})) ${1 << index} else 0)`);
    kt.push(`${signature} = ${open}when (${mask.join(" + ")}) {`);
    for (let bits = 0; bits < 2 ** optional.length; bits++) {
      const passed = fields.filter((field) => !field.optional || (bits & (1 << optional.indexOf(field))));
      if (markers && !passed.some(({ name: passedName }) => markers.has(passedName))) continue;
      kt.push(`  ${bits} -> ${call}(${passed.map(argument).join(", ")})`);
    }
    kt.push('  else -> error("Invalid generated arguments for ' + label + '")', `}${close}`);
  }
  // A block decodes its supplied fields once, then returns the lambda Compose runs on the scope.
  function emitBlock(name, kotlinType, fields) {
    kt.push(`internal fun JSONObject.decode${name}(): ${kotlinType}.() -> Unit {`);
    for (const field of fields) {
      const local = "`" + field.name + "`";
      const key = JSON.stringify(field.name);
      kt.push(`  val has${field.name[0].toUpperCase()}${field.name.slice(1)} = has(${key})`,
        `  val ${local} = if (has(${key})) ${decodeField(field)} else null`);
    }
    kt.push("  return {");
    for (const field of fields) {
      const local = "`" + field.name + "`";
      const present = `has${field.name[0].toUpperCase()}${field.name.slice(1)}`;
      kt.push(field.nullable
        ? `    if (${present}) this.${local} = ${local}`
        : `    if (${present}) this.${local} = ${local}!!`);
    }
    kt.push("  }", "}");
  }
  // A wide value type: start from its defaults and copy in each supplied field.
  function emitCopy(signature, kotlinType, fields) {
    kt.push(`${signature} {`, `  var value = ${kotlinType}()`);
    for (const field of fields) {
      kt.push(`  if (has(${JSON.stringify(field.name)})) value = value.copy(\`${field.name}\` = ${decodeField(field)})`);
    }
    kt.push("  return value", "}");
  }
  for (const { name, kotlinType, fields, factories = [], block, copy, scope } of records) {
    const scopeParameter = scope ? `scope: ${scope}` : "";
    const scopeArgument = scope ? "scope" : "";
    const signature = `internal fun JSONObject.decode${name}(${scopeParameter}): ${kotlinType}`;
    kt.push("");
    if (copy) {
      ts.push("", `export type ${name} = { ${typeFields(fields).join("; ")} };`);
      emitCopy(signature, kotlinType, fields);
      continue;
    }
    if (block) {
      ts.push("", `export type ${name} = { ${typeFields(fields).join("; ")} };`);
      emitBlock(name, kotlinType, fields);
      continue;
    }
    if (factories.length === 0) {
      ts.push("", `export type ${name} = { ${typeFields(fields).join("; ")} };`);
      emitDecoder(signature, kotlinType, fields, name);
      continue;
    }
    ts.push("", `export type ${name} =`,
      ...factories.map(({ name, fields }) =>
        `  | { ${[`factory: ${JSON.stringify(name)}`, ...typeFields(fields)].join("; ")} }`),
      ";");
    if (factories.some(({ composable }) => composable)) kt.push("@Composable");
    // Overloads that share a label are told apart by a required field only one of them declares.
    const labels = [...new Set(factories.map(({ name: label }) => label))];
    const branch = (label) => {
      const overloads = factories.map((factory, index) => ({ ...factory, index })).filter((factory) => factory.name === label);
      if (overloads.length === 1) return `decode${name}Factory${overloads[0].index}(${scopeArgument})`;
      // An overload is chosen when JavaScript supplies a field only it declares. Overloads with a required
      // marker are tested first, as such a field must be present.
      const choices = overloads.map(({ fields: own, index }) => {
        const markers = own.filter((field) =>
          overloads.every((other) => other.index === index || other.fields.every(({ name: other }) => other !== field.name)));
        const required = markers.some(({ optional }) => !optional);
        const test = (required ? markers.filter(({ optional }) => !optional) : markers)
          .map(({ name: marker }) => `has(${JSON.stringify(marker)})`).join(" || ");
        return { required, branch: `${test} -> decode${name}Factory${index}(${scopeArgument})` };
      }).sort((a, b) => Number(b.required) - Number(a.required)).map(({ branch }) => branch);
      return `when { ${choices.join("; ")}; else -> error("No ${label} overload accepts these fields") }`;
    };
    kt.push(`${signature} = when (val factory = getString("factory")) {`,
      ...labels.map((label) => `  ${JSON.stringify(label)} -> ${branch(label)}`),
      `  else -> error("Unknown ${name} factory: " + factory)`, "}");
    for (const [index, { function: call, fields, composable }] of factories.entries()) {
      kt.push("");
      if (composable) kt.push("@Composable");
      const siblings = factories.filter((factory, other) => other !== index && factory.name === factories[index].name);
      const markers = siblings.length === 0 ? null : new Set(fields.map(({ name: field }) => field)
        .filter((field) => siblings.every((sibling) => sibling.fields.every(({ name: other }) => other !== field))));
      emitDecoder(`private fun JSONObject.decode${name}Factory${index}(${scopeParameter}): ${kotlinType}`, call, fields, call, markers,
        scope);
    }
  }
  if (records.length === 0) ts.push("", "export {};");
  return [ts.join("\n") + "\n", kt.join("\n") + "\n"];
}
