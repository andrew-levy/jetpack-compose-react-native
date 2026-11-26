import { decodeValue } from "./records.mjs";
import { typeImports } from "./modifiers.mjs";

// `CompositionLocalProvider` provides a discovered `Local*` by name:
// `<CompositionLocalProvider value={{ local: "LocalContentColor", value: "#6750a4" }}>`.
export function localOutputs(locals, kinds) {
  const typeOf = ({ kind, nullable }) => {
    const descriptor = kinds[kind];
    if (!descriptor) throw Error(`Unknown CompositionLocal kind: ${kind}`);
    return `${descriptor.type}${nullable ? " | null" : ""}`;
  };
  const enums = [...new Set(locals.map(({ kind }) => kind).filter((kind) => kind.startsWith("Compose")))].sort();
  const typeScript = [
    "// Generated from Compose CompositionLocals by generate.mjs.",
    ...typeImports([
      ...locals.map(({ kind }) => kinds[kind]).filter(({ type }) => !enums.includes(type)),
      ...(enums.length ? [{ module: "./values", imports: enums }] : []),
    ]),
    "",
    "/** A value for one CompositionLocal, named by its Kotlin property. */",
    "export type ComposeProvidedValue =",
    ...(locals.length
      ? locals.map((local) => `  | { local: ${JSON.stringify(local.name)}; value: ${typeOf(local)} }`)
      : ["  never"]),
    ";",
    "",
  ].join("\n");
  const optIns = [...new Set(locals.flatMap(({ optIns }) => optIns))].sort();
  const kotlin = [
    "// Generated from Compose CompositionLocals by generate.mjs.",
    ...(optIns.length ? [`@file:OptIn(${optIns.map((marker) => `${marker}::class`).join(", ")})`, ""] : []),
    "package com.jetpackcomposereactnative.generated",
    "",
    "import androidx.compose.runtime.Composable",
    "import androidx.compose.runtime.ProvidedValue",
    "import androidx.compose.ui.unit.dp",
    "import androidx.compose.ui.unit.sp",
    "import com.jetpackcomposereactnative.common.parseComposeColor",
    "import org.json.JSONArray",
    "import org.json.JSONObject",
    "",
    "@Composable",
    "internal fun JSONObject.toComposeProvidedValue(): ProvidedValue<*> = when (val local = getString(\"local\")) {",
    ...locals.map(({ name, property, kind, nullable }) => {
      const value = decodeValue(kind, '"value"');
      return `  ${JSON.stringify(name)} -> ${property} provides ${nullable ? `if (isNull("value")) null else ${value}` : value}`;
    }),
    '  else -> error("Unknown CompositionLocal: $local")',
    "}",
    "",
    "@Composable",
    "internal fun JSONArray.toComposeProvidedValues(): Array<ProvidedValue<*>> =",
    "  List(length()) { index -> getJSONObject(index).toComposeProvidedValue() }.toTypedArray()",
    "",
  ].join("\n");
  return [typeScript, kotlin];
}
