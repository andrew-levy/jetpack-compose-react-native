import fs from "node:fs";

// Types with a hand-written `toComposeSnapshot()` encoder. The extractor reads the same table.
const snapshots = JSON.parse(fs.readFileSync(new URL("./snapshots.json", import.meta.url), "utf8"));

const range = "readonly [first: number, last: number]";
const scalars = {
  "kotlin.String": ["string", (value) => value],
  "kotlin.Char": ["string", (value) => `${value}.toString()`],
  "kotlin.Boolean": ["boolean", (value) => value],
  "kotlin.Byte": ["number", (value) => `${value}.toInt()`],
  "kotlin.Short": ["number", (value) => `${value}.toInt()`],
  "kotlin.Int": ["number", (value) => value],
  "kotlin.Long": ["number", (value) => value],
  "kotlin.Float": ["number", (value) => `${value}.toDouble()`],
  "kotlin.Double": ["number", (value) => value],
  "androidx.compose.ui.unit.Dp": ["number", (value) => `${value}.value.toDouble()`],
  "androidx.compose.ui.graphics.Color": ["string", (value) => `composePayloadColor(${value})`],
  "kotlin.ranges.IntRange": [range, (value) => `org.json.JSONArray().put(${value}.first).put(${value}.last)`],
  "kotlin.ranges.LongRange": [range, (value) => `org.json.JSONArray().put(${value}.first).put(${value}.last)`],
};
const collections = new Set(["kotlin.collections.List", "kotlin.collections.Set", "kotlin.collections.Collection"]);
// Each tuple container lists the Kotlin property and the TypeScript label of its elements.
const tuples = {
  "kotlin.Pair": [["first", "first"], ["second", "second"]],
  "kotlin.Triple": [["first", "first"], ["second", "second"], ["third", "third"]],
  "kotlin.ranges.ClosedRange": [["start", "start"], ["endInclusive", "endInclusive"]],
  "kotlin.ranges.ClosedFloatingPointRange": [["start", "start"], ["endInclusive", "endInclusive"]],
};

// A payload kind is a Kotlin type expression, for example `kotlin.collections.List<kotlin.Pair<kotlin.Int,kotlin.String?>>?`.
export function parsePayloads(text) {
  let index = 0;
  const fail = () => { throw Error(`Invalid payload kind: ${text}`); };
  function type() {
    const name = /^[A-Za-z_][\w.]*/.exec(text.slice(index))?.[0] ?? fail();
    index += name.length;
    const args = [];
    if (text[index] === "<") {
      do {
        index++;
        args.push(type());
      } while (text[index] === ",");
      if (text[index++] !== ">") fail();
    }
    const nullable = text[index] === "?";
    if (nullable) index++;
    return { name, args, nullable };
  }
  const types = [type()];
  while (text[index] === ",") {
    index++;
    types.push(type());
  }
  if (index !== text.length) fail();
  return types;
}

const kotlinType = ({ name, args, nullable }) =>
  `${name}${args.length ? `<${args.map(kotlinType).join(", ")}>` : ""}${nullable ? "?" : ""}`;

export function payloadCodec(payloadTypes = []) {
  const named = new Map(payloadTypes.map((type) => [type.kotlinType, type]));
  const known = (name) => {
    if (!named.has(name)) throw Error(`Unknown payload type: ${name}`);
    return named.get(name);
  };

  // Returns a Kotlin expression that converts `value` to a JSON value. Locals are numbered per expression.
  function encode(type, value) {
    let locals = 0;
    function encoded(node, value) {
      if (node.nullable) {
        const local = `v${++locals}`;
        const inner = encoded({ ...node, nullable: false }, local);
        if (inner === local) return `${value} ?: org.json.JSONObject.NULL`;
        return `${value}?.let { ${local} -> ${inner} } ?: org.json.JSONObject.NULL`;
      }
      const { name, args } = node;
      if (Object.hasOwn(scalars, name)) return scalars[name][1](value);
      if (Object.hasOwn(snapshots, name)) return `${value}.toComposeSnapshot()`;
      if (collections.has(name)) {
        const array = `a${++locals}`;
        const element = `e${++locals}`;
        return `org.json.JSONArray().also { ${array} -> ${value}.forEach { ${element} -> ${array}.put(${encoded(args[0], element)}) } }`;
      }
      if (Object.hasOwn(tuples, name)) {
        const elements = tuples[name].map(([property], index) =>
          `.put(${encoded(args[Math.min(index, args.length - 1)], `${value}.${property}`)})`);
        return `org.json.JSONArray()${elements.join("")}`;
      }
      const payload = known(name);
      if (payload.value) return `${value}.name.replaceFirstChar { it.lowercaseChar() }`;
      return `${value}.to${payload.name}()`;
    }
    return encoded(type, value);
  }

  // Returns the TypeScript type of the JSON value and the type names it imports.
  function typeOf(node) {
    const imports = [];
    function described({ name, args, nullable }) {
      const type = (() => {
        if (Object.hasOwn(scalars, name)) return scalars[name][0];
        if (Object.hasOwn(snapshots, name)) {
          imports.push(snapshots[name]);
          return snapshots[name].type;
        }
        if (collections.has(name)) return `readonly ${wrapped(args[0])}[]`;
        if (Object.hasOwn(tuples, name)) {
          return `readonly [${tuples[name].map(([, label], index) =>
            `${label}: ${described(args[Math.min(index, args.length - 1)])}`).join(", ")}]`;
        }
        const payload = known(name);
        imports.push({ type: payload.name, module: payload.value ? "./values" : "./payloads" });
        return payload.name;
      })();
      return nullable ? `${type} | null` : type;
    }
    function wrapped(element) {
      const type = described(element);
      return element.nullable ? `(${type})` : type;
    }
    return { type: described(node), imports };
  }

  return { encode, typeOf, kotlinType };
}

// A callback whose arguments are payloads: one argument arrives as its value, several as one tuple.
export function payloadEventDescriptor(kind, codec) {
  const tuple = kind.startsWith("eventTuple:");
  const types = parsePayloads(kind.slice(kind.indexOf(":") + 1));
  const values = types.map((type, index) => {
    const name = tuple ? `value${index + 1}` : "value";
    return { name, type, ts: codec.typeOf(type) };
  });
  const typeImports = values.flatMap(({ ts }) => ts.imports);
  const declarations = values.map(({ name, type }) => `${name}: ${codec.kotlinType(type)}`).join(", ");
  return {
    type: tuple
      ? `(values: readonly [${values.map(({ name, ts }) => `${name}: ${ts.type}`).join(", ")}]) => void`
      : `(value: ${values[0].ts.type}) => void`,
    input: "function",
    typeImports,
    expression: (key) => {
      const payload = tuple
        ? `org.json.JSONArray()${values.map(({ name, type }) => `.put(${codec.encode(type, name)})`).join("")}`
        : codec.encode(values[0].type, "value");
      return `{ ${declarations} -> node.emit(${key}, ${payload}) }`;
    },
  };
}

// Element decoders and interpolations of mapping kinds. `array` is a JSONArray and `index` an element position.
const mappingValues = {
  float: { ts: "number", type: "kotlin.Float", decode: "array.getDouble(index).toFloat()",
    lerp: "{ start, stop, fraction -> start + (stop - start) * fraction }" },
  dp: { ts: "number", type: "androidx.compose.ui.unit.Dp", decode: "androidx.compose.ui.unit.Dp(array.getDouble(index).toFloat())",
    lerp: "{ start, stop, fraction -> androidx.compose.ui.unit.lerp(start, stop, fraction) }" },
  color: { ts: "string", type: "androidx.compose.ui.graphics.Color",
    decode: "com.jetpackcomposereactnative.common.parseComposeColor(array.getString(index))",
    lerp: "{ start, stop, fraction -> androidx.compose.ui.graphics.lerp(start, stop, fraction) }" },
  string: { ts: "string", type: "kotlin.String", decode: "array.getString(index)" },
  int: { ts: "number", type: "kotlin.Int", decode: "array.getInt(index)" },
  boolean: { ts: "boolean", type: "kotlin.Boolean", decode: "array.getBoolean(index)" },
  key: { ts: "string | number", type: "kotlin.Any", decode: "array.get(index)" },
};

// `interpolation:<kind>`: `(Float) -> T` from stops `[[at, value], ...]`, clamped outside the first and last stop.
// `lookup:<kind>`: `(Int) -> T` from values by index. Keys past the end are the index itself; other kinds clamp.
export function mappingDescriptor(kind) {
  const [mapping, valueKind] = kind.split(":");
  const value = mappingValues[valueKind];
  if (!value || (mapping === "interpolation" && !value.lerp)) throw Error(`Unknown mapping kind: ${kind}`);
  const decoder = `{ array, index -> ${value.decode} }`;
  const call = mapping === "interpolation"
    ? `toComposeInterpolation<${value.type}>(${decoder}, ${value.lerp})`
    : `toComposeLookup<${value.type}>(${decoder}${valueKind === "key" ? ", { index -> index }" : ""})`;
  return {
    type: mapping === "interpolation"
      ? `readonly (readonly [at: number, value: ${value.ts}])[]`
      : `readonly (${value.ts})[]`,
    input: "tuple",
    expression: (key) => `node.arguments().jsonArray(${key}).${call}`,
    modifierExpression: (key) => `args.jsonArray(${key}).${call}`,
  };
}

export function payloadOutputs(payloadTypes, codec) {
  const snapshotTypes = payloadTypes.filter(({ value }) => !value);
  const imports = new Map();
  const fields = snapshotTypes.map(({ name, fields }) => [name, fields.map((field) => {
    const { type, imports: used } = codec.typeOf(parsePayloads(field.type)[0]);
    for (const { type: imported, module } of used) {
      if (module === "./payloads") continue;
      if (!imports.has(module)) imports.set(module, new Set());
      imports.get(module).add(imported);
    }
    return `${field.name}: ${type}`;
  })]);
  const typeScript = [
    "// Generated from Compose declarations by generate.mjs.",
    ...[...imports].sort(([left], [right]) => left.localeCompare(right))
      .map(([module, names]) => `import type { ${[...names].sort().join(", ")} } from ${JSON.stringify(module)};`),
    "",
    ...fields.map(([name, entries]) => `export type ${name} = { ${entries.join("; ")} };`),
    "",
  ].join("\n");

  const kotlin = [
    "// Generated from Compose declarations by generate.mjs.",
    "package com.jetpackcomposereactnative.generated",
    "",
    "import androidx.compose.ui.graphics.toArgb",
    "import org.json.JSONObject",
    "",
    "internal fun composePayloadColor(color: androidx.compose.ui.graphics.Color): String =",
    '  "#%08X".format(color.toArgb())',
    "",
    "internal fun <T> org.json.JSONArray.toComposeInterpolation(",
    "  decode: (org.json.JSONArray, Int) -> T,",
    "  lerp: (T, T, Float) -> T,",
    "): (Float) -> T {",
    "  val stops = List(length()) { getJSONArray(it) }",
    '  require(stops.isNotEmpty()) { "An interpolation needs at least one stop" }',
    "  val positions = FloatArray(stops.size) { stops[it].getDouble(0).toFloat() }",
    "  val values = stops.map { decode(it, 1) }",
    "  return { position ->",
    "    val next = positions.indexOfFirst { it > position }",
    "    when (next) {",
    "      -1 -> values.last()",
    "      0 -> values.first()",
    "      else -> {",
    "        val span = positions[next] - positions[next - 1]",
    "        lerp(values[next - 1], values[next], if (span == 0f) 1f else (position - positions[next - 1]) / span)",
    "      }",
    "    }",
    "  }",
    "}",
    "",
    "internal fun <T> org.json.JSONArray.toComposeLookup(",
    "  decode: (org.json.JSONArray, Int) -> T,",
    "  fallback: ((Int) -> T)? = null,",
    "): (Int) -> T {",
    "  val values = List(length()) { decode(this, it) }",
    "  return { index -> values.getOrNull(index) ?: fallback?.invoke(index) ?: values[index.coerceIn(0, values.lastIndex)] }",
    "}",
    ...snapshotTypes.flatMap(({ name, kotlinType: type, fields, optIns }) => [
      "",
      ...(optIns.length ? [`@OptIn(${optIns.map((marker) => `${marker}::class`).join(", ")})`] : []),
      `internal fun ${type}.to${name}(): JSONObject = JSONObject()`,
      ...fields.map((field) =>
        `  .put(${JSON.stringify(field.name)}, ${codec.encode(parsePayloads(field.type)[0], `this.\`${field.name}\``)})`),
    ]),
    "",
  ].join("\n");
  return [typeScript, kotlin];
}
