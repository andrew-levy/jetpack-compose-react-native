import assert from "node:assert/strict";
import { readdirSync, readFileSync } from "node:fs";
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
  return new Set(callFormEntries(surface).map(({ form }) => form));
}

function callFormEntries(surface) {
  return ["components", "modifiers"].flatMap((kind) => surface[kind]
    .flatMap(({ name, signature, parameters, children = false, scope = null, masks }) => masks.map((mask) => {
      let bit = 0;
      const passed = parameters
        .filter(({ optional, kind: parameterKind }) => !optional || parameterKind === "modifier" || (mask & (1 << bit++)))
        .map(({ name, kind: parameterKind, nullable, optional }) =>
          [name, parameterKind.startsWith("animationSpec:") ? "animationSpec" : parameterKind,
            nullable, parameterKind === "modifier" && optional])
        .sort(([left], [right]) => left.localeCompare(right));
      return { form: JSON.stringify([name, children, passed, kind, scope]), signature, kind };
    })));
}

// Upstream changed a published overload when its Kotlin signature is gone (a parameter was added, removed
// or retyped) or is now skipped as deprecated. Kotlin callers of that overload break the same way.
function changedUpstream(entries, kind, signature) {
  if (!signature) return false;
  const entry = entries.get(`${kind === "components" ? "component" : "modifier"}:${signature}`);
  return !entry || entry.status === "skipped" && entry.reason === "Deprecated Kotlin declaration";
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
    ["animateContentSize", "animationSpec:size"],
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
    ["pointerInput", "pointerPolicy"],
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
  for (const [name, scope] of [["decorator", "decoration:textField"], ["decorationBox", "decoration:lambda"]]) {
    assert.ok(manifest.components.some(component => component.name === "BasicTextField" &&
      component.parameters.some(parameter => parameter.name === name && parameter.scope === scope)),
      `BasicTextField must expose its ${name} slot`);
  }
  // Material 3 stabilizes types between releases, so check the rule rather than one class.
  assert.ok(manifest.records.some(({ kotlinType, optIns }) => kotlinType.startsWith("androidx.compose.material3.") &&
    optIns.includes("androidx.compose.material3.ExperimentalMaterial3Api")),
    "Discover public value types with a public Compose opt-in");
  const elevation = manifest.records.find(({ kotlinType }) => kotlinType === "androidx.compose.material3.ButtonElevation");
  assert.ok(elevation?.factories.some(({ name, fields }) =>
    name === "ButtonDefaults.buttonElevation" && fields.some(({ name }) => name === "defaultElevation")),
    "Discover Material defaults factories for value types with internal constructors");
  // Icons are looked up by name at run time, so only their styles (themes and packages) are discovered.
  assert.ok(manifest.icons.some(({ style, packageName, theme }) => style === "autoMirroredOutlined" &&
    packageName === "androidx.compose.material.icons.automirrored.outlined" && theme === "AutoMirrored.Outlined"),
    "Discover directional Material icon styles from the Compose classpath");
  for (const [name, slots] of [["Slider", ["thumb", "track"]], ["RangeSlider", ["startThumb", "endThumb", "track"]]]) {
    assert.ok(manifest.components.some(component => component.name === name && slots.every(slot =>
      component.parameters.some(({ name, scope }) => name === slot && scope?.startsWith("argument:")))),
      `${name} must expose native-state content slots`);
  }
  const labelPosition = manifest.records.find(({ kotlinType }) =>
    kotlinType === "androidx.compose.material3.TextFieldLabelPosition");
  const variants = labelPosition?.factories.map(({ name }) => name) ?? [];
  assert.ok(variants.length > 1 && variants.every((name) => name.startsWith("TextFieldLabelPosition.")),
    "Discover public variants of a closed Compose value");
  for (const [name, kind] of [["AlertDialog", "dialogProperties"], ["DropdownMenu", "popupProperties"]]) {
    assert.ok(manifest.components.some(component => component.name === name &&
      component.parameters.some(parameter => parameter.name === "properties" && parameter.kind === kind)),
      `${name} must expose its window properties`);
  }
  assert.ok(manifest.modifiers.some(({ name, parameters }) => name === "animateContentSize" &&
    parameters.some(({ name, kind }) => name === "finishedListener" &&
      kind === "eventTuple:androidx.compose.ui.unit.IntSize,androidx.compose.ui.unit.IntSize")));
  // Callback arguments are payload types derived from Kotlin declarations, such as a discovered enum.
  const dismissValue = "androidx.compose.material3.SwipeToDismissBoxValue";
  assert.ok(manifest.components.some(({ name, parameters }) => name === "SwipeToDismissBox" &&
    parameters.some(({ name, kind }) => name === "onDismiss" && kind === `eventPayload:${dismissValue}`)),
    "SwipeToDismissBox must report its dismissed value");
  const dismissPayload = manifest.payloads.find(({ kotlinType }) => kotlinType === dismissValue);
  assert.ok(dismissPayload?.value && manifest.values.some(({ name }) => name === dismissPayload.name),
    "Enum payloads must use a generated value type");
  // Slots that Compose calls with values render React content for each argument list.
  assert.ok(manifest.components.some(({ name, parameters }) => name === "TwoRowsTopAppBar" &&
    parameters.some(({ name, kind, scope }) => name === "title" && kind === "slot" && scope === "arguments::kotlin.Boolean")),
    "Argument slots must cross as payloads");
  // Pages take their keys from the children's React keys.
  assert.ok(manifest.components.some(({ name, childKeys, childrenScope }) => name === "HorizontalPager" &&
    childKeys === "key" && childrenScope?.startsWith("items:")));
  // State made by a public `remember*` factory.
  assert.ok(manifest.components.some(({ name, parameters }) => name === "ScrollField" &&
    parameters.some(({ name, kind }) => name === "state" && kind.startsWith("record:"))));
  // Pure mappings and `fun interface` producers.
  assert.ok(manifest.components.some(({ name, parameters }) => name === "LinearWavyProgressIndicator" &&
    parameters.some(({ name, kind }) => name === "amplitude" && kind === "interpolation:float")));
  assert.ok(manifest.components.some(({ name, parameters }) => name === "Text" &&
    parameters.some(({ kind }) => kind === "sam:androidx.compose.ui.graphics.ColorProducer:color")));
  // Snapshot handles: a SnackbarHost slot passes SnackbarData, which Snackbar takes back.
  assert.ok(manifest.components.some(({ name, parameters }) => name === "Snackbar" &&
    parameters.some(({ name, kind }) => name === "snackbarData" && kind === "handle:androidx.compose.material3.SnackbarData")));
  // A state without public data crosses as a handle: the pane drag handle passes it to paneExpansionDraggable.
  assert.ok(manifest.components.some(({ name, parameters }) => name === "ListDetailPaneScaffold" &&
    parameters.some(({ name, scope }) => name === "paneExpansionDragHandle" && scope?.startsWith("arguments:"))));
  assert.ok(manifest.modifiers.some(({ name, parameters }) => name === "paneExpansionDraggable" &&
    parameters.some(({ kind }) => kind === "handle:androidx.compose.material3.adaptive.layout.PaneExpansionState")));
  // Generic receivers resolve to the scope that implements them.
  assert.ok(manifest.components.some(({ name, ownerScope }) => name === "AnimatedPane" && ownerScope?.endsWith(".ThreePaneScaffoldPaneScope")));
  // Supertypes of scopes, discovered CompositionLocals, lists, and scope member factories.
  assert.ok(manifest.modifiers.some(({ name, scope }) => name === "preferredWidth" && scope?.endsWith(".PaneScaffoldScope")));
  assert.ok(manifest.compositionLocals.some(({ name, kind }) => name === "LocalContentColor" && kind === "color"));
  assert.ok(manifest.components.some(({ name, parameters }) => name === "CompositionLocalProvider" &&
    parameters.some(({ kind }) => kind === "providedValues")));
  assert.ok(manifest.components.some(({ name, parameters }) => name === "LoadingIndicator" &&
    parameters.some(({ name, kind }) => name === "polygons" && kind.startsWith("list:"))));
  assert.ok(manifest.records.some(({ kotlinType, scope }) => kotlinType.endsWith("SharedTransitionScope.OverlayClip") && scope));
  assert.ok(manifest.modifiers.some(({ name, parameters }) => name === "nonInteractiveScrollbar" &&
    parameters.some(({ kind }) => kind === "scrollIndicatorState")));
  assert.ok(manifest.components.some(({ name }) => name === "MaterialExpressiveTheme"));
  for (const name of ["ButtonGroup", "AppBarRow", "AppBarColumn"]) {
    assert.ok(manifest.components.some(component => component.name === name &&
      component.parameters.some(parameter => parameter.name === "items" && parameter.nativeName === "content") &&
      component.parameters.some(parameter => parameter.name === "overflowIndicator" && parameter.optional)),
      name + " must expose native overflow actions");
  }
  assert.ok(manifest.components.some(({ name, parameters }) => name === "MediumTopAppBar" &&
    parameters.some(({ kind }) => kind === "topAppBarScrollBehavior")));
  assert.ok(manifest.components.some(({ name, parameters }) => name === "AnimatedContent" &&
    parameters.some(({ kind }) => kind === "contentTransition")));
  assert.ok(manifest.components.some(({ name, parameters }) => name === "BasicTextField" &&
    parameters.some(({ kind }) => kind === "eventTextLayoutProvider") &&
    parameters.some(({ kind }) => kind === "scrollState")));
  assert.ok(manifest.components.some(({ name, ownerScope }) => name === "NavigationBarItem" && ownerScope?.endsWith(".RowScope")));
  assert.ok(manifest.components.some(component => component.name === "Text" &&
    component.parameters.some(parameter => parameter.name === "composeTextStyle" && parameter.nativeName === "style")));
  assert.ok(manifest.records.some(record => record.name === "ComposeTransformOrigin"));
  assert.ok(manifest.styleProperties.some(property => property.name === "translation" &&
    property.kind === "record:ComposeOffset"));
  assert.ok(manifest.styleProperties.some(property => property.name === "contentPadding" &&
    property.kind === "dp"));
} else if (mode === "surface") {
  const actual = callForms(read(second));
  let lost = callFormEntries(read(first)).filter(({ form }) => !actual.has(form));
  // With the current manifest, a form is excused when upstream changed its Kotlin overload: the published
  // signature is gone (a parameter was added, removed or retyped) or is now skipped as deprecated. A form
  // of an overload that still exists and is still bound must not disappear.
  const manifestPath = process.argv[5];
  if (manifestPath) {
    const { entries } = readManifest(manifestPath);
    const upstream = lost.filter(({ kind, signature }) => changedUpstream(entries, kind, signature));
    const changed = new Set(upstream.map(({ signature }) => signature));
    if (upstream.length) console.log(`${upstream.length} call forms follow upstream changes to ${changed.size} Kotlin overloads`);
    for (const signature of [...changed].sort()) console.log(`  Changed upstream: ${signature}`);
    lost = lost.filter((entry) => !upstream.includes(entry));
  }
  assert.deepEqual(lost.slice(0, 30).map(({ form }) => form), [],
    `${lost.length} previously supported Compose call forms disappeared`);
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
  const lost = callFormEntries(original).filter(({ form }) => !upgradedForms.has(form));
  const unexpected = lost.filter(({ kind, signature }) => !changedUpstream(newer.entries, kind, signature));
  for (const { form } of lost) console.log(`Removed JSX call form ${form}`);
  assert.deepEqual(unexpected.map(({ form }) => form), [], "A Compose upgrade unexpectedly dropped a JSX call form");
} else if (mode === "probe") {
  const original = readManifest(first);
  // COMPOSE_GENERATED_OUTPUT mirrors the repository layout (src/generated and the Android generated package).
  const android = "android/src/main/java/com/jetpackcomposereactnative/generated";
  const readTree = (directory) => readdirSync(join(second, directory)).filter((file) => /\.tsx?$/.test(file)).sort()
    .map((file) => readFileSync(join(second, directory, file), "utf8")).join("\n");
  const outputs = {
    "components.tsx": () => readTree("src/generated/components"),
    "modifiers.ts": () => readTree("src/generated/modifiers"),
    "values.ts": () => readFileSync(join(second, "src/generated/values/enums.ts"), "utf8"),
  };
  const readOutput = (name) => outputs[name]?.() ?? readFileSync(join(second, name.endsWith(".kt") ? android
    : "src/generated/values", name), "utf8");
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
