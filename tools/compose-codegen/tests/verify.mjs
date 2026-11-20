import assert from "node:assert/strict";
import { readFileSync } from "node:fs";
import { join } from "node:path";

function readManifest(path) {
  const manifest = JSON.parse(readFileSync(path, "utf8"));
  assert.equal(manifest.schemaVersion, 3);
  const entries = new Map(manifest.coverage.map((entry) => [entry.signature, entry]));
  assert.equal(entries.size, manifest.coverage.length, "Every Kotlin signature appears once");
  assert.equal(manifest.coverage.filter(({ status }) => status === "generated").length, manifest.components.length);
  for (const entry of entries.values()) {
    assert.ok(["generated", "skipped", "unsupported"].includes(entry.status), entry.signature);
    if (entry.status !== "generated") assert.ok(entry.reason, entry.signature);
    assert.ok(entry.omittedParameters.every(({ reason }) => reason), entry.signature);
    assert.ok(entry.omittedForms.every(({ reason }) => reason), entry.signature);
  }
  return { ...manifest, entries };
}

function callForms(components) {
  return new Set(components.flatMap(({ name, parameters, children, masks }) => masks.map((mask) => {
    let bit = 0;
    const passed = parameters
      .filter(({ optional, kind }) => !optional || kind === "modifier" || (mask & (1 << bit++)))
      .map(({ name, kind, nullable, optional }) => [name, kind, nullable, kind === "modifier" && optional])
      .sort(([left], [right]) => left.localeCompare(right));
    return JSON.stringify([name, children, passed]);
  })));
}

const [mode, first, second] = process.argv.slice(2);
const original = readManifest(first);
if (mode === "upgrade") {
  const newer = readManifest(second);
  const additions = newer.coverage.filter(({ signature }) => !original.entries.has(signature));
  const removals = original.coverage.filter(({ signature }) => !newer.entries.has(signature));
  const changes = newer.coverage.filter(({ signature, status }) =>
    original.entries.has(signature) && original.entries.get(signature).status !== status);
  for (const entry of additions) console.log(`Added (${entry.status}) ${entry.signature}`);
  for (const entry of removals) console.log(`Removed upstream (${entry.status}) ${entry.signature}`);
  for (const entry of changes) console.log(`Changed to ${entry.status} ${entry.signature}`);

  assert.ok(additions.some(({ status }) => status === "generated"), "Discover a new bridgeable overload");
  assert.ok(additions.some(({ status }) => status === "unsupported"), "Report new unsupported signatures");

  const upgradedForms = callForms(newer.components);
  const lost = [...callForms(original.components)].filter((form) => !upgradedForms.has(form));
  // Material 3 1.5.0-alpha01 hides the previous WideNavigationRailItem
  // overload and replaces it with one that requires railExpanded.
  const expected = [["icon", "label", "modifier", "onClick", "selected"],
    ["enabled", "icon", "label", "modifier", "onClick", "selected"]];
  const unexpected = lost.filter((form) => {
    const [name, children, props] = JSON.parse(form);
    if (name !== "WideNavigationRailItem" || children) return true;
    const names = props.map(([prop]) => prop);
    return !expected.some((shape) => shape.join() === names.join());
  });
  for (const form of lost) console.log(`Removed JSX call form ${form}`);
  assert.deepEqual(unexpected, [], "A Compose upgrade unexpectedly dropped a JSX call form");
} else if (mode === "probe") {
  const readOutput = (name) => readFileSync(join(second, name), "utf8");
  const name = "com.jetpackcomposereactnative.codegen";
  const overloads = original.components.filter(({ name }) => name === "DiscoveryProbe");
  assert.equal(overloads.length, 2);
  assert.deepEqual(overloads.find(({ parameters }) => parameters[0].name === "label").optIns,
    [`${name}.BridgeLayoutPreview`, `${name}.BridgePreview`]);
  assert.ok(original.coverage.some(({ status, omittedParameters }) => status === "generated" &&
    omittedParameters.some(({ name, required }) => name === "optionalMetadata" && !required)));
  assert.ok(original.coverage.some(({ status, omittedParameters }) => status === "unsupported" &&
    omittedParameters.some(({ name, required }) => name === "requiredMetadata" && required)));

  const ts = readOutput("components.tsx");
  const kt = readOutput("ComposableRegistry.kt");
  assert.match(ts, /export const DiscoveryProbe/);
  assert.match(ts, /label: string/);
  assert.match(ts, /count: number/);
  assert.match(ts, /scheme\??: ColorScheme \| null/);
  assert.match(readOutput("factories.ts"), /export function lightColorScheme/);
  assert.match(readOutput("ComposeFactories.kt"), /internal fun JSONObject.toColorScheme/);
  assert.doesNotMatch(ts, /export const UnsupportedProbe/);
  assert.ok(kt.includes(`@OptIn(${name}.BridgeLayoutPreview::class, ${name}.BridgePreview::class)`));
  assert.ok(kt.includes(`${name}.DiscoveryProbe(`));
  assert.match(readOutput("modifiers.ts"), /discoveryProbe\(inset: number\)/);
  assert.ok(readOutput("ModifierRegistry.kt").includes(`import ${name}.discoveryProbe as `));
} else {
  throw Error("Expected upgrade or probe verification mode");
}
