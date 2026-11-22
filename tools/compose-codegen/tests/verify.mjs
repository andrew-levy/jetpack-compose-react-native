import assert from "node:assert/strict";
import { readFileSync } from "node:fs";
import { join } from "node:path";
import { verifyInventory } from "../inventory.mjs";

const read = (path) => JSON.parse(readFileSync(path, "utf8"));

function readManifest(path) {
  const manifest = read(path);
  assert.equal(manifest.schemaVersion, 4);
  const entries = new Map(manifest.coverage.map((entry) => [`${entry.kind}:${entry.signature}`, entry]));
  assert.equal(entries.size, manifest.coverage.length, "Every discovered signature appears once");
  return { ...manifest, entries };
}

function callForms(surface) {
  return new Set(["components", "modifiers"].flatMap((kind) => surface[kind]
    .flatMap(({ name, parameters, children = false, scope = null, masks }) => masks.map((mask) => {
      let bit = 0;
      const passed = parameters
        .filter(({ optional, kind: parameterKind }) => !optional || parameterKind === "modifier" || (mask & (1 << bit++)))
        .map(({ name, kind: parameterKind, nullable, optional }) =>
          [name, parameterKind, nullable, parameterKind === "modifier" && optional])
        .sort(([left], [right]) => left.localeCompare(right));
      return JSON.stringify([name, children, passed, kind, scope]);
    }))));
}

const [mode, first, second] = process.argv.slice(2);
if (mode === "audit") {
  const manifest = readManifest(first);
  const inventory = read(second);
  verifyInventory(manifest, inventory);

  const declaration = manifest.discovered.find(({ binary }) => binary);
  assert.ok(declaration);
  assert.throws(() => verifyInventory({
    ...manifest, discovered: manifest.discovered.filter((entry) => entry !== declaration),
  }, inventory), /KSP missed/);
  assert.throws(() => verifyInventory({
    ...manifest, coverage: manifest.coverage.filter(({ signature, kind }) =>
      signature !== declaration.signature || kind !== declaration.kind),
  }, inventory), /Missing coverage outcome/);
  assert.ok(manifest.discovered.some(({ signature }) => signature.startsWith("androidx.compose.foundation.lazy.LazyColumn(")));
  assert.ok(manifest.modifiers.some(({ scope, name }) => scope?.endsWith(".RowScope") && name === "weight"));
  const sheet = manifest.components.find(({ name, parameters }) => name === "ModalBottomSheet" &&
    parameters.some(({ name }) => name === "sheetState"));
  assert.ok(sheet, "A native-owned SheetState is generated");
  assert.ok(sheet.parameters.some(({ name }) => name === "dragHandle"), "The previous optional cap no longer drops dragHandle");
  assert.ok(manifest.components.some(({ name }) => name === "BoxWithConstraints"));
  assert.ok(!manifest.components.some(({ kotlinFunction }) => kotlinFunction.startsWith("androidx.compose.ui.graphics.vector.")));
  assert.ok(manifest.components.some(({ name, parameters }) => name === "BottomAppBar" &&
    parameters.some(({ kind }) => kind === "paddingValues")));
  const pager = manifest.components.find(({ name }) => name === "HorizontalPager");
  assert.equal(pager?.childrenParameter, "pageContent");
  assert.ok(pager.parameters.some(({ kind }) => kind === "pagerState"));
  assert.ok(manifest.components.some(({ name, childrenScope }) =>
    name === "LazyColumn" && childrenScope?.endsWith(".LazyListScope")));
  assert.ok(manifest.components.some(({ name, ownerScope }) =>
    name === "ExposedDropdownMenu" && ownerScope?.endsWith(".ExposedDropdownMenuBoxScope")));
  assert.ok(manifest.modifiers.some(({ name, parameters }) =>
    name === "onSizeChanged" && parameters.some(({ kind }) => kind === "eventLayoutSize")));
  for (const [name, kind] of [
    ["focusRequester", "focusRequester"],
    ["bringIntoViewRequester", "bringIntoViewRequester"],
    ["hoverable", "interactionSource"],
    ["nestedScroll", "nestedScrollConnection"],
    ["onKeyEvent", "keyPolicy"],
    ["animateContentSize", "animationSpec"],
    ["animateItem", "animationSpec"],
    ["styleable", "foundationStyle"],
    ["styleable", "foundationStyleState"],
    ["styleable", "foundationStyles"],
    ["anchoredDraggable", "anchoredDragState"],
    ["draggable", "dragState"],
    ["scrollable2D", "scrollable2DState"],
    ["transformable", "transformableState"],
    ["layoutBounds", "layoutBoundsHolder"],
    ["sharedElement", "sharedContentState"],
    ["drawWithCache", "cachedDrawing"],
    ["dropShadow", "shadowValue"],
    ["layout", "layoutModifierMeasure"],
    ["pointerInteropFilter", "touchPolicy"],
    ["onRotaryScrollEvent", "rotaryPolicy"],
  ]) {
    assert.ok(manifest.modifiers.some(modifier => modifier.name === name &&
      modifier.parameters.some(parameter => parameter.kind === kind)), name + " must use the shared adapter");
  }
  assert.ok(manifest.components.some(component => component.name === "TextField" &&
    component.parameters.some(parameter => parameter.kind === "eventTextFieldValue")));
  for (const [name, kind] of [
    ["Grid", "gridConfig"],
    ["VerticalSlider", "sliderState"],
    ["HorizontalMultiBrowseCarousel", "carouselState"],
    ["Canvas", "drawing"],
    ["TextField", "keyboardOptions"],
    ["TextField", "eventKeyboardAction"],
    ["HorizontalPager", "pageSize"],
  ]) {
    assert.ok(manifest.components.some(component => component.name === name &&
      component.parameters.some(parameter => parameter.kind === kind)), name + " must use the shared adapter");
  }
  assert.ok(manifest.components.some(({ name, ownerScope, parameters, masks }) =>
    name === "AnimatedVisibility" && !ownerScope && masks.includes(0) &&
    parameters.some(({ name }) => name === "visible")),
    "AnimatedVisibility can render without a native RowScope");
  assert.ok(manifest.components.some(({ name, children, parameters }) => name === "Layout" && children &&
    parameters.some(({ kind }) => kind === "layoutMeasurePolicy")));
  const forms = [...callForms(manifest)].map(JSON.parse);
  for (const name of ["BasicTextField", "TextField", "OutlinedTextField"]) {
    const fields = forms.filter(([component]) => component === name).map(([, , props]) =>
      new Set(props.map(([prop]) => prop)));
    assert.ok(fields.some(props => ["state", "inputTransformation", "outputTransformation", "keyboardOptions", "lineLimits"]
      .every(prop => props.has(prop))), name + " must combine native input/output transformations with keyboard options");
    assert.ok(fields.some(props => ["value", "onValueChange", "visualTransformation"].every(prop => props.has(prop))),
      name + " must support visual transformations for the controlled overload");
  }
  assert.ok(manifest.components.some(({ name, parameters }) => name === "DecorationBox" &&
    parameters.some(({ kind }) => kind === "visualTransformation")));
  assert.ok(manifest.components.some(({ name, childrenScope }) => name === "Crossfade" && childrenScope === "indexed:"));
  assert.ok(manifest.modifiers.some(({ name, parameters }) => name === "animateContentSize" &&
    parameters.some(({ name, kind }) => name === "finishedListener" &&
      kind === "eventTuple:androidx.compose.ui.unit.IntSize,androidx.compose.ui.unit.IntSize")));
  assert.ok(manifest.components.some(({ name }) => name === "MaterialExpressiveTheme"));
  assert.ok(manifest.components.some(({ name, ownerScope }) => name === "NavigationBarItem" && ownerScope?.endsWith(".RowScope")));
  assert.ok(manifest.components.some(component => component.name === "Text" &&
    component.parameters.some(parameter => parameter.name === "composeTextStyle" && parameter.nativeName === "style")));
  assert.ok(manifest.records.some(record => record.name === "ComposeTransformOrigin"));
  assert.ok(manifest.styleProperties.some(property => property.name === "translation" &&
    property.kind === "record:ComposeOffset"));
  assert.ok(manifest.styleProperties.some(property => property.name === "contentPadding" &&
    property.kind === "dp"));
} else if (mode === "surface") {
  const baseline = callForms(read(first));
  const actual = callForms(read(second));
  const lost = [...baseline].filter((form) => !actual.has(form));
  assert.deepEqual(lost.slice(0, 30), [], `${lost.length} previously supported Compose call forms disappeared`);
} else if (mode === "upgrade") {
  const original = readManifest(first);
  const newer = readManifest(second);
  const additions = newer.coverage.filter(({ kind, signature }) => !original.entries.has(`${kind}:${signature}`));
  const removals = original.coverage.filter(({ kind, signature }) => !newer.entries.has(`${kind}:${signature}`));
  const changes = newer.coverage.filter(({ kind, signature, status }) => {
    const previous = original.entries.get(`${kind}:${signature}`);
    return previous && previous.status !== status;
  });
  for (const entry of additions) console.log(`Added (${entry.status}) ${entry.signature}`);
  for (const entry of removals) console.log(`Removed upstream (${entry.status}) ${entry.signature}`);
  for (const entry of changes) console.log(`Changed to ${entry.status} ${entry.signature}`);

  assert.ok(additions.some(({ status }) => status === "generated"), "Discover a new bridgeable overload");
  assert.ok(additions.some(({ status }) => status === "unsupported" || status === "adapterRequired"), "Report new unsupported signatures");

  const upgradedForms = callForms(newer);
  const lost = [...callForms(original)].filter((form) => !upgradedForms.has(form));
  // Material 3 1.5.0-alpha01 hides the previous WideNavigationRailItem
  // overload and replaces it with one that requires railExpanded.
  const tooltipNames = new Set(["PlainTooltip", "RichTooltip"]);
  const newCaretShape = new Set(newer.components.filter(({ name, parameters }) =>
    tooltipNames.has(name) && parameters.some(({ name }) => name === "caretShape")
  ).map(({ name }) => name));
  const unexpected = lost.filter((form) => {
    const [name, children, props, kind, scope] = JSON.parse(form);
    const names = props.map(([prop]) => prop);
    // Material 3 replaces tooltip caretSize with caretShape. Verify that the
    // rest of each call still resolves after removing the replaced prop.
    if (newCaretShape.has(name) && names.includes("caretSize")) {
      return !upgradedForms.has(JSON.stringify([name, children,
        props.filter(([prop]) => prop !== "caretSize"), kind, scope]));
    }
    if (name !== "WideNavigationRailItem" || children) return true;
    const replacement = [...props, ["railExpanded", "boolean", false, false]]
      .sort(([left], [right]) => left.localeCompare(right));
    return !upgradedForms.has(JSON.stringify([name, children, replacement, kind, scope]));
  });
  for (const form of lost) console.log(`Removed JSX call form ${form}`);
  assert.deepEqual(unexpected, [], "A Compose upgrade unexpectedly dropped a JSX call form");
} else if (mode === "probe") {
  const original = readManifest(first);
  const readOutput = (name) => readFileSync(join(second, name), "utf8");
  const name = "com.jetpackcomposereactnative.codegen";
  const overloads = original.components.filter(({ name }) => name === "DiscoveryProbe");
  assert.equal(overloads.length, 2);
  assert.deepEqual(overloads.find(({ parameters }) => parameters[0].name === "label").optIns,
    [`${name}.BridgeLayoutPreview`, `${name}.BridgePreview`]);
  assert.ok(original.coverage.some(({ status, omittedParameters }) => status === "generated" &&
    omittedParameters.some(({ name, required }) => name === "optionalMetadata" && !required)));
  assert.ok(original.coverage.some(({ status, omittedParameters }) => status === "adapterRequired" &&
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
  const nested = original.components.find(({ name }) => name === "NestedValueProbe");
  assert.ok(nested?.children, "Nested values work alongside composable content");
  assert.deepEqual(nested.parameters.map(({ kind }) => kind),
    ["record:ComposeProbeConfigurationValue", "record:ComposeProbeShapeValue"]);
  assert.ok(original.modifiers.some(({ name, parameters }) => name === "nestedValueProbe" &&
    parameters[0].kind === "record:ComposeProbeConfigurationValue"));
  const records = readOutput("records.ts");
  assert.match(records, /inset: ComposeProbeInsetValue; fallback\?: ComposeProbeInsetValue \| null/);
  assert.match(records, /direction\?: ComposeProbeDirectionOption/);
  assert.match(readOutput("values.ts"), /ComposeProbeDirectionOption = "end" \| "start"/);
  const recordKotlin = readOutput("ComposeRecords.kt");
  assert.match(recordKotlin, /0 -> .*ProbeConfiguration\(`inset` = getJSONObject\("inset"\)\.decodeComposeProbeInsetValue\(\)\)/);
  assert.match(recordKotlin, /if \(get\("fallback"\) === JSONObject.NULL\) null else getJSONObject\("fallback"\)\.decodeComposeProbeInsetValue\(\)/);
  const modifiers = readOutput("modifiers.ts");
  assert.ok(modifiers.includes("(values: readonly [value1: string | null, value2: number]) => void"));
  assert.ok(readOutput("ModifierRegistry.kt").includes(
    "org.json.JSONArray().put(value1 ?: org.json.JSONObject.NULL).put(value2)"));
  assert.ok(original.coverage.some(({ signature, status, omittedParameters }) =>
    signature.includes(".UnsupportedValueProbe(") && status === "adapterRequired" &&
    omittedParameters.every(({ required }) => required) && omittedParameters.length === 2));
  assert.match(readOutput("modifiers.ts"), /discoveryProbe\(inset: number\)/);
  assert.ok(readOutput("ModifierRegistry.kt").includes(`import ${name}.discoveryProbe as `));
} else {
  throw Error("Expected audit, surface, upgrade, or probe verification mode");
}
