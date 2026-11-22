import { scalarKinds } from "./scalars.mjs";

const primitiveTypes = Object.fromEntries(Object.values(scalarKinds)
  .filter(({ nativeType }) => nativeType)
  .map(({ nativeType, type }) => [nativeType, type]));

const snapshots = {
  "androidx.compose.ui.unit.IntSize": ["ComposeLayoutSize", "../utils/composeValues"],
  "androidx.compose.ui.unit.DpSize": ["ComposeDpSize", "../utils/composeValues"],
  "androidx.compose.ui.geometry.Offset": ["ComposeOffset", "./records"],
  "androidx.compose.ui.unit.Velocity": ["ComposeOffset", "./records"],
};

export function eventTupleDescriptor(kind) {
  const arguments_ = kind.slice("eventTuple:".length).split(",").map((nativeType, index) => {
    const nullable = nativeType.endsWith("?");
    const type = nullable ? nativeType.slice(0, -1) : nativeType;
    const snapshot = snapshots[type];
    const tsType = primitiveTypes[type] ?? snapshot[0];
    const name = `value${index + 1}`;
    const encoded = snapshot ? `${name}${nullable ? "?." : "."}toComposeSnapshot()` : name;
    return {
      ts: `${name}: ${tsType}${nullable ? " | null" : ""}`,
      declaration: `${name}: ${nativeType}`,
      encoded: nullable ? `${encoded} ?: org.json.JSONObject.NULL` : encoded,
      snapshot,
    };
  });
  return {
    type: `(values: readonly [${arguments_.map(({ ts }) => ts).join(", ")}]) => void`,
    input: "function",
    typeImports: arguments_.flatMap(({ snapshot }) =>
      snapshot ? [{ type: snapshot[0], module: snapshot[1] }] : []),
    expression: (key) => {
      const values = arguments_.map(({ encoded }) => `.put(${encoded})`).join("");
      return `{ ${arguments_.map(({ declaration }) => declaration).join(", ")} -> node.emit(${key}, org.json.JSONArray()${values}) }`;
    },
  };
}
