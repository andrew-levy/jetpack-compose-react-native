import assert from "node:assert/strict";
import test from "node:test";

import { mappingDescriptor, parsePayloads, payloadCodec, payloadEventDescriptor, payloadOutputs } from "../tools/compose-codegen/payloads.mjs";

const TAB = "androidx.compose.material3.TabPosition";
const DISMISS = "androidx.compose.material3.SwipeToDismissBoxValue";
const payloadTypes = [
  { kotlinType: DISMISS, name: "ComposeSwipeToDismissBoxValueOption", value: true, fields: [], optIns: [] },
  {
    kotlinType: TAB, name: "ComposeTabPositionSnapshot", value: false, optIns: [],
    fields: [
      { name: "left", type: "androidx.compose.ui.unit.Dp" },
      { name: "label", type: "kotlin.String?" },
      { name: "tint", type: "androidx.compose.ui.graphics.Color" },
      { name: "size", type: "androidx.compose.ui.unit.IntSize" },
    ],
  },
];
const codec = payloadCodec(payloadTypes);
const typeOf = (kind) => codec.typeOf(parsePayloads(kind)[0]).type;
const encode = (kind, value = "value") => codec.encode(parsePayloads(kind)[0], value);

test("payload kinds parse as Kotlin type expressions", () => {
  assert.deepEqual(parsePayloads("kotlin.collections.List<kotlin.Pair<kotlin.Int,kotlin.String?>>?,kotlin.Boolean"), [
    {
      name: "kotlin.collections.List", nullable: true,
      args: [{ name: "kotlin.Pair", nullable: false, args: [
        { name: "kotlin.Int", args: [], nullable: false },
        { name: "kotlin.String", args: [], nullable: true },
      ] }],
    },
    { name: "kotlin.Boolean", args: [], nullable: false },
  ]);
  assert.throws(() => parsePayloads("kotlin.Pair<kotlin.Int"), /Invalid payload kind/);
});

test("published tuples keep their JavaScript signature", () => {
  const descriptor = payloadEventDescriptor(
    "eventTuple:androidx.compose.ui.unit.IntSize,androidx.compose.ui.unit.IntSize", codec);
  assert.equal(descriptor.type, "(values: readonly [value1: ComposeLayoutSize, value2: ComposeLayoutSize]) => void");
  assert.deepEqual(descriptor.typeImports, [
    { type: "ComposeLayoutSize", module: "../utils/composeValues" },
    { type: "ComposeLayoutSize", module: "../utils/composeValues" },
  ]);
  assert.equal(descriptor.expression('"finishedListener"'),
    "{ value1: androidx.compose.ui.unit.IntSize, value2: androidx.compose.ui.unit.IntSize -> " +
    'node.emit("finishedListener", org.json.JSONArray().put(value1.toComposeSnapshot()).put(value2.toComposeSnapshot())) }');
});

test("enums cross as their case names", () => {
  const descriptor = payloadEventDescriptor(`eventPayload:${DISMISS}`, codec);
  assert.equal(descriptor.type, "(value: ComposeSwipeToDismissBoxValueOption) => void");
  assert.deepEqual(descriptor.typeImports, [{ type: "ComposeSwipeToDismissBoxValueOption", module: "./values" }]);
  assert.equal(descriptor.expression('"onDismiss"'),
    `{ value: ${DISMISS} -> node.emit("onDismiss", value.name.replaceFirstChar { it.lowercaseChar() }) }`);
});

test("containers, tuples and ranges nest", () => {
  assert.equal(typeOf(`kotlin.collections.List<${TAB}>`), "readonly ComposeTabPositionSnapshot[]");
  assert.equal(typeOf("kotlin.collections.Set<kotlin.Int?>"), "readonly (number | null)[]");
  assert.equal(typeOf("kotlin.Pair<kotlin.Int,kotlin.String?>?"), "readonly [first: number, second: string | null] | null");
  assert.equal(typeOf("kotlin.Triple<kotlin.Boolean,kotlin.Float,androidx.compose.ui.unit.Dp>"),
    "readonly [first: boolean, second: number, third: number]");
  assert.equal(typeOf("kotlin.ranges.ClosedFloatingPointRange<kotlin.Float>"), "readonly [start: number, endInclusive: number]");
  assert.equal(typeOf("kotlin.ranges.IntRange"), "readonly [first: number, last: number]");

  assert.equal(encode(`kotlin.collections.List<${TAB}>`),
    "org.json.JSONArray().also { a1 -> value.forEach { e2 -> a1.put(e2.toComposeTabPositionSnapshot()) } }");
  assert.equal(encode("kotlin.Pair<kotlin.Int,kotlin.String?>?"),
    "value?.let { v1 -> org.json.JSONArray().put(v1.first).put(v1.second ?: org.json.JSONObject.NULL) } ?: org.json.JSONObject.NULL");
  assert.equal(encode("kotlin.ranges.ClosedFloatingPointRange<kotlin.Float>"),
    "org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())");
  assert.throws(() => typeOf("androidx.compose.ui.Unknown"), /Unknown payload type/);
});

test("snapshot types are generated from their properties", () => {
  const [typeScript, kotlin] = payloadOutputs(payloadTypes, codec);
  assert.match(typeScript, /import type \{ ComposeLayoutSize \} from "\.\.\/utils\/composeValues";/);
  assert.match(typeScript,
    /export type ComposeTabPositionSnapshot = \{ readonly \$handle: number; left: number; label: string \| null; tint: string; size: ComposeLayoutSize \};/);
  assert.doesNotMatch(typeScript, /SwipeToDismissBoxValue/);
  assert.match(kotlin, /internal fun androidx\.compose\.material3\.TabPosition\.toComposeTabPositionSnapshot\(\): JSONObject = JSONObject\(\)/);
  assert.match(kotlin, /\.put\("left", this\.`left`\.value\.toDouble\(\)\)/);
  assert.match(kotlin, /\.put\("label", this\.`label` \?: org\.json\.JSONObject\.NULL\)/);
  assert.match(kotlin, /\.put\("tint", composePayloadColor\(this\.`tint`\)\)/);
  assert.match(kotlin, /\.put\("size", this\.`size`\.toComposeSnapshot\(\)\)/);
  // The snapshot names its native object, which a prop of the same type resolves.
  assert.match(kotlin, /\.put\("\\\$handle", ComposePayloadHandles\.handle\(this\)\)/);
  assert.match(kotlin, /internal fun <T> JSONObject\.toComposePayloadValue\(\): T/);
});

test("pure mappings are described as data", () => {
  const interpolation = mappingDescriptor("interpolation:dp");
  assert.equal(interpolation.type, "readonly (readonly [at: number, value: number])[]");
  assert.equal(interpolation.input, "tuple");
  assert.equal(interpolation.expression('"containerSize"'),
    'node.arguments().jsonArray("containerSize").toComposeInterpolation<androidx.compose.ui.unit.Dp>(' +
    "{ array, index -> androidx.compose.ui.unit.Dp(array.getDouble(index).toFloat()) }, " +
    "{ start, stop, fraction -> androidx.compose.ui.unit.lerp(start, stop, fraction) })");
  assert.equal(interpolation.modifierExpression('"size"').startsWith('args.jsonArray("size").'), true);

  const keys = mappingDescriptor("lookup:key");
  assert.equal(keys.type, "readonly (string | number)[]");
  assert.match(keys.expression('"key"'), /toComposeLookup<kotlin\.Any>\(\{ array, index -> array\.get\(index\) \}, \{ index -> index \}\)$/);
  assert.throws(() => mappingDescriptor("interpolation:string"), /Unknown mapping kind/);
});
