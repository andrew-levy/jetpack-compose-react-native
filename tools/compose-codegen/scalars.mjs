function scalar(type, nodeRead, jsonRead, nativeType) {
  return { type, expression: nodeRead, jsonRead, nativeType };
}

export const scalarKinds = {
  string: scalar("string", (key) => `node.string(${key})`, (key) => `getString(${key})`, "kotlin.String"),
  char: scalar("string", (key) => `node.string(${key}).single()`, (key) => `getString(${key}).single()`, "kotlin.Char"),
  boolean: scalar("boolean", (key) => `node.boolean(${key})`, (key) => `getBoolean(${key})`, "kotlin.Boolean"),
  int: scalar("number", (key) => `node.number(${key}).toInt()`, (key) => `getInt(${key})`, "kotlin.Int"),
  long: scalar("number", (key) => `node.number(${key}).toLong()`, (key) => `getLong(${key})`, "kotlin.Long"),
  float: scalar("number", (key) => `node.number(${key}).toFloat()`, (key) => `getDouble(${key}).toFloat()`, "kotlin.Float"),
  double: scalar("number", (key) => `node.number(${key})`, (key) => `getDouble(${key})`, "kotlin.Double"),
  dp: scalar("number", (key) => `node.number(${key}).dp`, (key) => `getDouble(${key}).dp`),
  sp: scalar("number", (key) => `node.number(${key}).sp`, (key) => `getDouble(${key}).sp`),
  color: scalar("string", (key) => `node.color(${key})`, (key) => `parseComposeColor(getString(${key}))`),
};
