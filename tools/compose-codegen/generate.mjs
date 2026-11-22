import fs from "node:fs";
import path from "node:path";
import { fileURLToPath } from "node:url";
import { modifierKinds, modifierOutputs, typeImports } from "./modifiers.mjs";
import { valueOutputs } from "./values.mjs";
import { factoryOutputs } from "./factories.mjs";
import { recordOutputs } from "./records.mjs";
import { scalarKinds } from "./scalars.mjs";
import { eventTupleDescriptor } from "./events.mjs";
import { styleOutputs } from "./styles.mjs";
import { iconOutputs } from "./icons.mjs";
import { verifyInventory } from "./inventory.mjs";

const repo = fileURLToPath(new URL("../../", import.meta.url));
const input = process.env.COMPOSE_API_MANIFEST ??
  path.join(repo, "tools/compose-codegen/build/generated/ksp/debug/resources/compose-api-manifest.json");
const output = process.env.COMPOSE_GENERATED_OUTPUT;
const manifest = JSON.parse(fs.readFileSync(input, "utf8"));
const check = process.argv.includes("--check");
const candidateDir = process.env.COMPOSE_KOTLIN_CANDIDATES;
const approvedDir = process.env.COMPOSE_APPROVED_KOTLIN;
const quote = JSON.stringify;

const sharedTypes = {
  indication: ["ComposeIndication", "toComposeIndication"],
  rectRulers: ["ComposeRectRulers", "toComposeRectRulers"],

  drawing: ["ComposeDrawing", "toComposeDrawing"],
  borderStroke: ["ComposeBorderStroke", "toComposeBorderStroke"],
  contentDrawing: ["ComposeContentDrawing", "toComposeContentDrawing"],
  cachedDrawing: ["ComposeContentDrawing", "toComposeCachedDrawing"],
  keyboardOptions: ["ComposeKeyboardOptions", "toComposeKeyboardOptions"],
  textFieldLineLimits: ["ComposeTextFieldLineLimits", "toComposeTextFieldLineLimits"],
  inputTransformation: ["ComposeInputTransformation", "toComposeInputTransformation"],
  outputTransformation: ["ComposeOutputTransformation", "toComposeOutputTransformation"],
  visualTransformation: ["ComposeVisualTransformation", "toComposeVisualTransformation"],
  pageSize: ["ComposePageSize", "toComposePageSize"],
  shadowValue: ["ComposeShadow", "toComposeShadow"],
  gridConfig: ["ComposeGridConfig", "toComposeGridConfig"],
  flexBoxConfig: ["ComposeFlexBoxConfig", "toComposeFlexBoxConfig"],
  flexConfig: ["ComposeFlexConfig", "toComposeFlexConfig"],
  dpSize: ["ComposeDpSize", "toDpSize"],
  paddingValues: ["ComposePaddingValues", "toPaddingValues"],
  windowInsets: ["ComposeWindowInsets", "toWindowInsets"],
  annotatedString: ["ComposeAnnotatedString", "toAnnotatedString"],
  textStyle: ["ComposeTextStyle", "toTextStyle"],
  gridCells: ["ComposeGridCells", "toGridCells"],
  staggeredGridCells: ["ComposeGridCells", "toStaggeredGridCells"],
  focusProperties: ["ComposeFocusProperties", "toFocusProperties"],
  dateFormatter: ["ComposeDatePickerFormatter", "toDatePickerFormatter"],
  textFieldValue: ["ComposeTextFieldValue", "toComposeTextFieldValue"],

  keyPolicy: ["ComposeKeyPolicy", "toComposeKeyPolicy"],
  animationSpec: ["ComposeAnimationSpec", "toComposeFloatAnimationSpec"],
  enterTransition: ["ComposeVisibilityTransition", "toComposeEnterTransition"],
  exitTransition: ["ComposeVisibilityTransition", "toComposeExitTransition"],
};

const stateKinds = {
  scrollState: ["ComposeScrollState", "androidx.compose.foundation.ScrollState", "rememberComposeScrollState", "node.arguments()"],
  topAppBarScrollBehavior: ["ComposeTopAppBarScrollBehavior", "androidx.compose.material3.TopAppBarScrollBehavior", "rememberComposeTopAppBarScrollBehavior"],
  sheetState: ["ComposeSheetState", "androidx.compose.material3.SheetState", "rememberComposeSheetState", "node.arguments()"],
  datePickerState: ["ComposeDatePickerState", "androidx.compose.material3.DatePickerState", "rememberComposeDatePickerState"],
  dateRangePickerState: ["ComposeDateRangePickerState", "androidx.compose.material3.DateRangePickerState", "rememberComposeDateRangePickerState"],
  timePickerState: ["ComposeTimePickerState", "androidx.compose.material3.TimePickerState", "rememberComposeTimePickerState"],
  swipeToDismissState: ["ComposeSwipeToDismissState", "androidx.compose.material3.SwipeToDismissBoxState", "rememberComposeSwipeToDismissState"],
  bottomSheetScaffoldState: ["ComposeBottomSheetScaffoldState", "androidx.compose.material3.BottomSheetScaffoldState", "rememberComposeBottomSheetScaffoldState", "node.arguments()"],
  lazyListState: ["ComposeLazyState", "androidx.compose.foundation.lazy.LazyListState", "rememberComposeLazyListState", "node.arguments()"],
  lazyGridState: ["ComposeLazyState", "androidx.compose.foundation.lazy.grid.LazyGridState", "rememberComposeLazyGridState", "node.arguments()"],
  lazyStaggeredGridState: ["ComposeLazyState", "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState", "rememberComposeLazyStaggeredGridState", "node.arguments()"],
  pagerState: ["ComposePagerState", "androidx.compose.foundation.pager.PagerState", "rememberComposePagerState", "node"],
  carouselState: ["ComposeCarouselState", "androidx.compose.material3.carousel.CarouselState", "rememberComposeCarouselState", "node"],
  textFieldState: ["ComposeTextFieldState", "androidx.compose.foundation.text.input.TextFieldState", "rememberComposeTextFieldState"],
  searchBarState: ["ComposeSearchBarState", "androidx.compose.material3.SearchBarState", "rememberComposeSearchBarState"],
  basicTooltipState: ["ComposeTooltipState", "androidx.compose.foundation.BasicTooltipState", "rememberComposeBasicTooltipState"],
  tooltipState: ["ComposeTooltipState", "androidx.compose.material3.TooltipState", "rememberComposeTooltipState"],
  popupPosition: ["ComposePopupPosition", "androidx.compose.ui.window.PopupPositionProvider", "rememberComposePopupPosition"],
  snackbarHostState: ["ComposeSnackbarHostState", "androidx.compose.material3.SnackbarHostState", "rememberComposeSnackbarHostState"],
};

const handleKinds = {
  sliderState: ["ComposeSliderState", "rememberComposeSliderHandle"],
  rangeSliderState: ["ComposeRangeSliderState", "rememberComposeRangeSliderHandle"],
  layoutBoundsHolder: ["ComposeLayoutBoundsHolder", "rememberComposeLayoutBoundsHolder"],
  pullToRefreshState: ["ComposePullToRefreshState", "rememberComposePullToRefreshHandle"],
  focusRequester: ["ComposeFocusRequester", "rememberComposeFocusRequester"],
  bringIntoViewRequester: ["ComposeBringIntoViewRequester", "rememberComposeBringIntoViewRequester"],
  interactionSource: ["ComposeInteractionSource", "rememberComposeInteractionSource"],
};

const gestureStateKinds = {
  dragState: ["ComposeDragState", "rememberComposeDragState"],
  drag2DState: ["ComposeDrag2DState", "rememberComposeDrag2DState"],
  scrollableState: ["ComposeScrollableState", "rememberComposeScrollableState"],
  scrollable2DState: ["ComposeScrollable2DState", "rememberComposeScrollable2DState"],
  transformableState: ["ComposeTransformableState", "rememberComposeTransformableState"],
  anchoredDragState: ["ComposeAnchoredDragState", "rememberComposeAnchoredDragState"],
};

const kinds = {
  pointerPolicy: { type: "ComposePointerPolicy", input: "object", module: "../utils/composeValues",
    modifierExpression: () => "pointerPolicy",
    composition: { value: "pointerPolicy", nativeExpression: (key) => `args.rememberComposePointerPolicy(${key})` } },
  pointerKeys: { type: "readonly (string | null)[]", input: "tuple", spread: true,
    expression: (key) => `args.jsonArray(${key}).toComposePointerKeys()` },
  semantics: { type: "ComposeSemantics", input: "object", module: "../utils/composeValues",
    modifierExpression: (key) => `args.jsonObject(${key}).toSemantics(args)` },
  contentTransition: { type: "ComposeContentTransition", input: "object", module: "../utils/composeValues",
    expression: (key) => `{ node.jsonObject(${key}).toComposeContentTransition() }` },
  buttonGroupItems: { type: "readonly ComposeButtonGroupItem[]", input: "tuple", module: "../utils/composeValues",
    imports: ["ComposeButtonGroupItem"], expression: (key) => `node.arguments().toComposeButtonGroupItems(${key})` },
  appBarItems: { type: "readonly ComposeAppBarItem[]", input: "tuple", module: "../utils/composeValues",
    imports: ["ComposeAppBarItem"], expression: (key) => `node.arguments().toComposeAppBarItems(${key})` },
  layoutMeasurePolicy: { type: "ComposeLayoutMeasurePolicy", input: "object", module: "../utils/composeValues",
    expression: (key) => `node.jsonObject(${key}).toComposeLayoutMeasurePolicy()` },
  layoutModifierMeasure: { type: "ComposeLayoutModifierMeasure", input: "object", module: "../utils/composeValues",
    modifierExpression: (key) => `args.jsonObject(${key}).toComposeLayoutModifierMeasure()` },
  ...Object.fromEntries(Object.entries(gestureStateKinds).map(([kind, [type, factory]]) => [
    kind, { type, input: "object", module: "../utils/composeValues",
      modifierExpression: () => kind, composition: { value: kind, factory, emitsEvents: true } },
  ])),
  sharedContentState: { type: "ComposeSharedContent", input: "object", module: "../utils/composeValues",
    modifierExpression: () => "sharedContentState",
    composition: { value: "sharedContentState", factory: "rememberComposeSharedContentState" } },
  boundsTransform: { type: "ComposeAnimationSpec<ComposeAnimationRect>", input: "object", module: "../utils/composeValues",
    imports: ["ComposeAnimationSpec", "ComposeAnimationRect"],
    modifierExpression: (key) => "args.jsonObject(" + key + ").toComposeBoundsTransform()" },
  visibilityScope: { type: '"current"', input: "string",
    modifierExpression: () => "visibilityScope",
    composition: { value: "visibilityScope", nativeExpression: () => "currentComposeVisibilityScope()" } },
  lookaheadScope: { type: '"current"', input: "string",
    modifierExpression: () => "lookaheadScope",
    composition: { value: "lookaheadScope", nativeExpression: () => "currentComposeLookaheadScope()" } },
  dpPoint: { type: "ComposeOffset", input: "object", module: "./records",
    modifierExpression: (key) => "args.jsonObject(" + key + ").toComposeDpPoint()" },
  keyboardActions: { type: "ComposeKeyboardActions", input: "object", module: "../utils/composeValues",
    expression: (key) => "node.jsonObject(" + key + ").toComposeKeyboardActions(node.arguments())" },
  eventKeyboardAction: { type: "() => void", input: "function",
    expression: (key) => "androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit(" + key + ") }" },
  ...Object.fromEntries([
    ["touchPolicy", "ComposeTouchPolicy", "toComposeTouchPolicy"],
    ["rotaryPolicy", "ComposeRotaryPolicy", "toComposeRotaryPolicy"],
    ["receiveContent", "ComposeReceiveContent", "toComposeReceiveContent"],
    ["dragTarget", "ComposeDragTarget", "toComposeDragTarget"],
  ].map(([kind, type, decoder]) => [kind, { type, input: "object", module: "../utils/composeValues",
    modifierExpression: (key) => "args.jsonObject(" + key + ")." + decoder + "(args)" }])),
  dragTypePolicy: { type: "ComposeDragTypes", input: "object", module: "../utils/composeValues",
    modifierExpression: (key) => "args.jsonObject(" + key + ").toComposeDragTypePolicy()" },
  dragTransfer: { type: "ComposeDragTransfer", input: "object", module: "../utils/composeValues",
    modifierExpression: (key) => "args.jsonObject(" + key + ").toComposeDragTransfer()" },
  eventInsets: { type: "(insets: ComposeWindowInsets) => void", input: "function", module: "../utils/composeValues",
    imports: ["ComposeWindowInsets"],
    modifierExpression: () => "eventInsets",
    composition: { value: "eventInsets", nativeExpression: (key) => "args.rememberComposeInsetsEvent(" + key + ")" } },
  overscrollEffect: { type: "ComposeOverscrollEffect", input: "object", module: "../utils/composeValues",
    expression: (key) => `node.jsonObject(${key}).rememberComposeOverscrollEffect()`,
    modifierExpression: () => "overscrollEffect",
    composition: { value: "overscrollEffect", factory: "rememberComposeOverscrollEffect" } },
  flingBehavior: { type: "ComposeFlingBehavior", input: "object", module: "../utils/composeValues",
    expression: (key) => `node.jsonObject(${key}).rememberComposeFlingBehavior()`,
    modifierExpression: () => "flingBehavior",
    composition: { value: "flingBehavior", factory: "rememberComposeFlingBehavior" } },
  foundationStyle: { type: "ComposeFoundationStyle", input: "object", module: "./styles",
    expression: (key) => "node.jsonObject(" + key + ").toComposeFoundationStyle()" },
  foundationStyles: { type: "readonly ComposeFoundationStyle[]", input: "tuple", module: "./styles",
    imports: ["ComposeFoundationStyle"], spread: true,
    expression: (key) => `args.jsonArray(${key}).toComposeFoundationStyles()` },
  foundationStyleState: { type: "ComposeFoundationStyleState", input: "object", module: "./styles",
    expression: (key) => `node.jsonObject(${key}).rememberComposeFoundationStyleState()`,
    modifierExpression: () => "styleState",
    composition: { value: "styleState", factory: "rememberComposeFoundationStyleState" } },
  ...Object.fromEntries(Object.entries(handleKinds).map(([kind, [type, factory]]) => [
    kind, { type, input: "object", module: "../utils/nativeHandles",
      expression: (key) => `node.jsonObject(${key}).${factory}()`,
      modifierExpression: () => kind, composition: { value: kind, factory } },
  ])),
  ...Object.fromEntries(Object.entries(stateKinds).map(([kind, [type]]) => [
    kind, { type, input: "object", module: kind === "sheetState" ? "./components" : "../utils/composeValues" },
  ])),
  alignmentLine: { type: "ComposeAlignmentLine", input: "string", module: "../utils/composeValues",
    expression: (key) => `toComposeAlignmentLine(node.string(${key}))` },
  nestedScrollConnection: { type: "ComposeNestedScrollBehavior", input: "object", module: "../utils/composeValues",
    expression: (key) => `node.jsonObject(${key}).rememberComposeNestedScrollConnection()`,
    modifierExpression: () => "nestedScrollConnection",
    composition: { value: "nestedScrollConnection", factory: "rememberComposeNestedScrollConnection" } },
  scrollState: { type: "ComposeScrollState", input: "object", module: "../utils/composeValues",
    expression: () => "scrollState", composition: { value: "scrollState", factory: "rememberComposeScrollState", emitsEvents: true } },
  ...Object.fromEntries(Object.entries(sharedTypes).map(([kind, [type, decoder]]) => [
    kind, { type, input: "object", module: "../utils/composeValues", expression: (key) => `node.jsonObject(${key}).${decoder}()`,
      ...((kind === "paddingValues" || kind === "windowInsets") && { modifierInput: kind }) },
  ])),
  ...Object.fromEntries([
    ["animationSpec:size", "ComposeLayoutSize", "toComposeSizeAnimationSpec"],
    ["animationSpec:offset", "ComposeAnimationOffset", "toComposeOffsetAnimationSpec"],
  ].map(([kind, value, decoder]) => [
    kind, { type: `ComposeAnimationSpec<${value}>`, input: "object", module: "../utils/composeValues",
      imports: ["ComposeAnimationSpec", value],
      expression: (key) => `node.jsonObject(${key}).${decoder}()` },
  ])),
  ...modifierKinds,
  ...scalarKinds,
  colorScheme: { type: "ColorScheme", input: "object", expression: (key) => `node.jsonObject(${key}).toColorScheme()` },
  windowInsetsProducer: { type: "ComposeWindowInsets", input: "object", module: "../utils/composeValues", expression: (key) => `{ node.jsonObject(${key}).toWindowInsets() }` },
  painter: { type: "ComposePainter", input: "object", module: "../utils/composeValues",
    expression: (key) => `node.jsonObject(${key}).rememberComposePainter()`,
    modifierExpression: () => "painter",
    composition: { value: "painter", factory: "rememberComposePainter" } },
  shape: { ...modifierKinds.shape, expression: (key) => `node.arguments().shape(${key})` },
  brush: { ...modifierKinds.brush, expression: (key) => `node.arguments().brush(${key})` },
  floatRange: { type: "ComposeFloatRange", input: "tuple", module: "./components", expression: (key) => `node.arguments().floatRange(${key})`,
    modifierExpression: (key) => `args.floatRange(${key})` },
  floatProducer: { type: "number", expression: (key) => `{ node.number(${key}).toFloat() }` },
  modifier: { type: "ComposeModifier", expression: (key) => `node.modifier(${key}, scope)` },
  event: { type: "() => void", input: "function", expression: (key) => `{ node.emit(${key}) }` },
  eventString: { type: "(value: string) => void", input: "function", expression: emitValue("String") },
  eventBoolean: { type: "(value: boolean) => void", input: "function", expression: emitValue("Boolean") },
  eventFloat: { type: "(value: number) => void", input: "function", expression: emitValue("Float") },
  eventDouble: { type: "(value: number) => void", input: "function", expression: emitValue("Double") },
  eventFloatRange: { type: "(value: ComposeFloatRange) => void", input: "function", module: "./components", imports: ["ComposeFloatRange"],
    expression: (key) => `{ value: ClosedFloatingPointRange<Float> -> node.emit(${key}, org.json.JSONArray().put(value.start.toDouble()).put(value.endInclusive.toDouble())) }` },
  eventLayoutBounds: eventSnapshot("ComposeLayoutPosition", "androidx.compose.ui.spatial.RelativeLayoutBounds"),
  eventLayoutSize: eventSnapshot("ComposeLayoutSize", "androidx.compose.ui.unit.IntSize"),
  eventLayoutPosition: eventSnapshot("ComposeLayoutPosition", "androidx.compose.ui.layout.LayoutCoordinates"),
  eventNullableLayoutPosition: eventSnapshot("ComposeLayoutPosition", "androidx.compose.ui.layout.LayoutCoordinates", true),
  eventMotion: eventSnapshot("ComposeMotionEvent", "android.view.MotionEvent"),
  eventDpSize: eventSnapshot("ComposeDpSize", "androidx.compose.ui.unit.DpSize"),
  eventOffset: eventSnapshot("ComposeOffset", "androidx.compose.ui.geometry.Offset", false, "./records"),
  eventVelocity: eventSnapshot("ComposeOffset", "androidx.compose.ui.unit.Velocity", false, "./records"),
  eventFocusState: eventSnapshot("ComposeFocusState", "androidx.compose.ui.focus.FocusState"),
  eventTextLayout: eventSnapshot("ComposeTextLayout", "androidx.compose.ui.text.TextLayoutResult"),
  eventTextLayoutProvider: { type: "(value: ComposeTextLayout) => void", input: "function", module: "../utils/composeValues",
    imports: ["ComposeTextLayout"],
    expression: (key) => `{ result -> result()?.let { node.emit(${key}, it.toComposeSnapshot()) } }` },
  eventTextFieldValue: eventSnapshot("ComposeTextFieldSnapshot", "androidx.compose.ui.text.input.TextFieldValue"),
  eventInt: { type: "(value: number) => void", input: "function", expression: emitValue("Int") },
  slot: { type: "ReactNode", expression: (key) => `{ RenderComposeChildren(node.slot(${key})) }` },
};

for (const { name } of manifest.records ?? []) {
  kinds["record:" + name] = { type: name, input: "object", module: "./records",
    expression: (key) => "node.jsonObject(" + key + ").decode" + name + "()" };
}

for (const { name } of manifest.values ?? []) {
  kinds[name] = { type: name, input: "string", expression: (key) => `to${name}(node.string(${key}))` };
}

for (const { kind } of [...manifest.components, ...manifest.modifiers].flatMap(({ parameters }) => parameters)) {
  if (kind.startsWith("eventTuple:") && !Object.hasOwn(kinds, kind)) kinds[kind] = eventTupleDescriptor(kind);
}

function eventSnapshot(snapshot, native, nullable = false, module = "../utils/composeValues") {
  return {
    type: `(value: ${snapshot}${nullable ? " | null" : ""}) => void`,
    input: "function",
    module,
    imports: [snapshot],
    expression: (key) => `{ value: ${native}${nullable ? "?" : ""} -> node.emit(${key}, ${nullable ? "value?.toComposeSnapshot() ?: org.json.JSONObject.NULL" : "value.toComposeSnapshot()"}) }`,
  };
}

function emitValue(type) {
  return (key) => `{ value: ${type} -> node.emit(${key}, value) }`;
}

function validate({ schemaVersion, components, modifiers, values, factories, coverage }) {
  if (schemaVersion !== 4 || !Array.isArray(components) || !components.length ||
      !Array.isArray(modifiers) || !Array.isArray(values) || !Array.isArray(factories) || !Array.isArray(coverage)) {
    throw Error("Expected a nonempty Compose API manifest with schema version 4.");
  }
  for (const { name, kotlinFunction, parameters, children } of components) {
    if (!/^[A-Z]\w*$/.test(name)) throw Error(`Invalid component: ${name}`);
    if (!/^\w+(\.\w+)+$/.test(kotlinFunction)) throw Error(`Invalid Kotlin function: ${kotlinFunction}`);
    if (typeof children !== "boolean") throw Error(`Missing children flag for ${name}`);

    const props = new Set();
    for (const { name: prop, kind, optional, nullable } of parameters) {
      if (!/^[A-Za-z_]\w*$/.test(prop) || props.has(prop) || !Object.hasOwn(kinds, kind) ||
          typeof optional !== "boolean" || typeof nullable !== "boolean") {
        throw Error(`Invalid or duplicate prop: ${name}.${prop} (${kind})`);
      }
      props.add(prop);
    }
  }
}

function passedParameters({ parameters }, mask) {
  let bit = 0;
  return parameters.filter(({ optional, kind }) => !optional || kind === "modifier" || (mask & (1 << bit++)));
}

function fieldType({ kind, nullable }) {
  const type = kinds[kind].type;
  const value = nullable && kind.startsWith("event") ? `(${type})` : type;
  return `${value}${nullable && kind !== "slot" ? " | null" : ""}`;
}

function animationTarget(component, name) {
  return name === "targetState" && component.childrenScope?.startsWith("indexed:");
}

function componentFields(component, parameters, reserved = []) {
  const fields = parameters.flatMap((parameter) => {
    const { name, optional, kind } = parameter;
    const type = animationTarget(component, name) ? "number | string" : fieldType(parameter);
    if (kind === "modifier") return [
      `  modifiers${optional ? "?" : ""}: ${type};`,
      "  /** @deprecated Use the modifiers prop. */",
      `  modifier?: ${type};`,
    ];
    return [`  ${name}${optional ? "?" : ""}: ${type};`];
  });
  if (component.children) fields.push("  children?: ReactNode;");
  const names = new Set(parameters.map(({ name }) => name));
  if (component.children) names.add("children");
  for (const name of reserved) {
    if (!names.has(name)) {
      fields.push(`  ${name}?: never;`);
      if (name === "modifier") fields.push("  modifiers?: never;");
    }
  }
  return fields;
}

// Merge sibling masks into optional TypeScript fields while keeping the accepted forms exact.
function propForms({ masks, parameters }) {
  const optionals = parameters.filter(({ optional, kind }) => optional && kind !== "modifier");
  const all = (1 << optionals.length) - 1;
  function compact(forms, bit) {
    if (forms.length === 0) return [];
    const remaining = all & ~(bit - 1);
    if (forms.length === 2 ** (optionals.length - Math.log2(bit))) return [[0, remaining]];
    if (bit > all) return [[0, 0]];
    const without = compact(forms.filter((mask) => !(mask & bit)), bit * 2);
    const withProp = new Map(compact(forms.filter((mask) => mask & bit), bit * 2)
      .map(([required, optional]) => [`${required}:${optional}`, [required, optional]]));
    const result = without.map(([required, optional]) =>
      withProp.delete(`${required}:${optional}`) ? [required, optional | bit] : [required, optional]);
    return [...result, ...[...withProp.values()].map(([required, optional]) => [required | bit, optional])];
  }
  return compact(masks, 1).map(([required, optional]) => parameters.flatMap((parameter) => {
    if (!parameter.optional || parameter.kind === "modifier") return [parameter];
    const bit = 1 << optionals.indexOf(parameter);
    if (required & bit) return [{ ...parameter, optional: false }];
    return optional & bit ? [parameter] : [];
  }));
}

function typeScript({ components, values, factories }) {
  const usedKinds = new Set(components.flatMap(({ parameters }) => parameters.map(({ kind }) => kind)));
  const types = values.map(({ name }) => name).filter((name) => usedKinds.has(name));
  const declarations = [...Map.groupBy(components, ({ name }) => name)].map(([name, overloads]) => {
    const first = overloads[0];
    const exhaustive = ({ parameters, masks }) =>
      masks.length === (1 << parameters.filter(({ optional, kind }) => optional && kind !== "modifier").length);
    const allProps = [...new Set(overloads.flatMap(({ parameters, children }) =>
      [...parameters.map(({ name }) => name), ...(children ? ["children"] : [])]))];
    const simple = overloads.length === 1 && exhaustive(first);
    const fields = simple
      ? [`export interface ${name}Props {`, ...componentFields(first, first.parameters), "}"]
      : [
        `export type ${name}Props =`,
        ...overloads.flatMap((component) => {
          return propForms(component).flatMap((parameters) => [
            "  | {",
            ...componentFields(component, parameters, allProps).map((line) => `  ${line}`),
            "    }",
          ]);
        }),
        ";",
      ];
    const namesOf = (predicate) => [...new Set(overloads.flatMap(({ parameters }) =>
      parameters.filter(predicate).map(({ name }) => name)))];
    const props = namesOf(({ kind }) => kind !== "slot" && !kind.startsWith("event"));
    const objectProps = namesOf(({ kind }) => ["object", "tuple", "shape", "brush"].includes(kinds[kind].input));
    const events = namesOf(({ kind }) => kind.startsWith("event"));
    const slots = namesOf(({ kind }) => kind === "slot");
    return [
      ...fields,
      `export const ${name} = createComposableComponent<${name}Props>({`,
      `  name: ${quote(name)},`,
      `  props: ${quote(props)},`,
      ...(objectProps.length ? [`  objectProps: ${quote(objectProps)},`] : []),
      ...(slots.length ? [`  slots: ${quote(slots)},`] : []),
      ...(events.length ? [`  events: ${quote(events)},`] : []),
      ...(simple && animationTarget(first, "targetState") ? ["  keyedChildren: true,"] : []),
      `  children: ${overloads.some(({ children }) => children)},`,
      ...(!simple ? [
        "  overloads: [",
        ...overloads.map((component) => {
          const { id, children, masks, parameters } = component;
          const asInput = ({ name, kind, optional, nullable }) => [
            name, animationTarget(component, name) ? "animationTarget" : kinds[kind].input ?? kinds[kind].type, optional, nullable,
          ];
          const keyed = animationTarget(component, "targetState") ? ", keyedChildren: true" : "";
          return `    { id: ${quote(id)}, children: ${children}${keyed}, parameters: ${quote(parameters.map(asInput))}, masks: ${quote(masks)} },`;
        }),
        "  ],",
      ] : []),
      "});",
    ].join("\n");
  });
  return [
    "// Generated from Compose declarations by generate.mjs.",
    'import type { ReactNode } from "react";',
    'import { createComposableComponent, type ComposeModifier } from "./runtime/createComposableComponent";',
    ...(usedKinds.has("colorScheme") && factories.length ? ['import type { ColorScheme } from "./factories";'] : []),
    ...(usedKinds.has("shape") || usedKinds.has("brush") ? [
      `import type { ${[usedKinds.has("shape") && "ComposeShape", usedKinds.has("brush") && "ComposeBrush"].filter(Boolean).join(", ")} } from "../utils/modifier";`,
    ] : []),
    ...(usedKinds.has("floatRange") || usedKinds.has("eventFloatRange") ? [
      "export type ComposeFloatRange = readonly [start: number, endInclusive: number];",
    ] : []),
    ...typeImports([...usedKinds].map((kind) => kinds[kind]), "./components"),
    'export type { ComposePaddingValues, ComposeWindowInsets } from "../utils/composeValues";',
    ...(usedKinds.has("sheetState") ? [
      'import type { ComposeModalSheetState } from "../utils/composeValues";',
      "export type ComposeSheetState = ComposeModalSheetState;",
    ] : []),
    ...(types.length ? [`import type { ${types.join(", ")} } from "./values";`] : []),
    "",
    ...declarations.flatMap((declaration) => [declaration, ""]),
  ].join("\n");
}

const indexedSlotScopes = new Set([
  "androidx.compose.foundation.pager.PagerScope",
  "androidx.compose.material3.carousel.CarouselItemScope",
]);
const lazyBuilderScopes = new Set([
  "androidx.compose.foundation.lazy.LazyListScope",
  "androidx.compose.foundation.lazy.grid.LazyGridScope",
  "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope",
]);

const overflowMenuScopes = new Set([
  "androidx.compose.material3.ButtonGroupMenuState",
  "androidx.compose.material3.AppBarMenuState",
]);

function renderSlot(children, scope) {
  if (scope === "decoration:textField") {
    return `androidx.compose.foundation.text.input.TextFieldDecorator { inner -> RenderComposeDecoration(${children}, inner) }`;
  }
  if (scope === "decoration:lambda") return `{ inner -> RenderComposeDecoration(${children}, inner) }`;
  if (overflowMenuScopes.has(scope)) return `{ menu -> RenderComposeOverflowIndicator(${children}, menu::show) }`;
  if (lazyBuilderScopes.has(scope)) return `{ renderLazyComposeChildren(${children}) }`;
  if (scope?.startsWith("indexed:")) {
    return `{ state -> RenderComposeAnimationChild(node, state${scope === "indexed:" ? "" : ", this"}) }`;
  }
  if (indexedSlotScopes.has(scope)) {
    return `{ index -> ${children}.getOrNull(index)?.let { RenderComposeChild(it, this) } }`;
  }
  if (scope === "androidx.compose.foundation.layout.PaddingValues") {
    return `{ padding -> RenderPaddedComposeChildren(${children}, padding) }`;
  }
  return `{ RenderComposeChildren(${children}${scope ? ", this" : ""}) }`;
}

function kotlin({ components }) {
  const dispatch = components.flatMap(({ id, renderer, parameters, name, ownerScope }) => {
    if (ownerScope) return [
      `    ${quote(id)} -> {`,
      `      check(scope is ${ownerScope}) { ${quote(`${name} requires ${ownerScope.split(".").at(-1)}`)} }`,
      `      Renderer${renderer}.render(node, scope)`,
      "    }",
    ];
    return `    ${quote(id)} -> Renderer${renderer}.render(node${parameters.some(({ kind }) => kind === "modifier") ? ", scope" : ""})`;
  });
  const extensionImports = new Map();
  for (const { kotlinFunction, scopedExtension } of components) {
    if (scopedExtension && !extensionImports.has(kotlinFunction)) {
      extensionImports.set(kotlinFunction, `composeScoped${extensionImports.size}`);
    }
  }
  const ownerOptIns = [...new Set(components.filter(({ ownerScope }) => ownerScope).flatMap(({ optIns }) => optIns))].sort();
  const functions = components.map(({ signature, renderer, kotlinFunction, parameters, children, childrenScope, childrenParameter, optIns, masks, ownerScope, scopedExtension }) => {
    const modifierScope = ownerScope ? `, scope: ${ownerScope}` : parameters.some(({ kind }) => kind === "modifier") ? ", scope: Any?" : "";
    const nativeFunction = ownerScope
      ? `scope.${scopedExtension ? extensionImports.get(kotlinFunction) : kotlinFunction.split(".").at(-1)}`
      : kotlinFunction;
    const optionals = parameters.filter(({ optional, kind }) => optional && kind !== "modifier");
    const bits = new Map(optionals.map(({ name }, index) => [name, 1 << index]));
    // Each mask still makes a statically resolved call so the Kotlin compiler owns
    // the defaults. Reuse decoders and slot lambdas across masks without rendering omitted slots.
    const compact = masks.length > 32;
    const shareChildren = compact && children && !childrenScope;
    const sharedSlots = compact ? parameters.filter(({ kind, scope }) => kind === "slot" && !scope) : [];
    const slotNames = new Set(sharedSlots.map(({ name }) => name));
    const parameterValue = ({ name, kind, nullable, scope }) => {
      const key = quote(name);
      const value = animationTarget({ childrenScope }, name) ? `node.arguments().animationTarget(${key})`
        : Object.hasOwn(stateKinds, kind) ? `requireNotNull(${name}Value)`
        : kind === "slot" && scope ? renderSlot(`node.slot(${key})`, scope)
        : kinds[kind].expression(key);
      return nullable ? `if (node.isNull(${key})) null else (${value})` : value;
    };
    const shared = new Map(parameters.filter(({ kind, name }) =>
      compact && Object.hasOwn(scalarKinds, kind) && !animationTarget({ childrenScope }, name))
      .map((parameter) => [parameter.name, parameter]));
    const call = (mask, indent) => {
      const passed = passedParameters({ parameters }, mask);
      const overflow = parameters.find(({ scope }) => overflowMenuScopes.has(scope));
      if (overflow && !passed.includes(overflow)) passed.push(overflow);
      const args = passed.map((parameter) => {
        const { name, nativeName = name } = parameter;
        const value = slotNames.has(name) ? `slot_${name}`
          : shared.has(name) ? `decode_${name}(node)` : parameterValue(parameter);
        return `\`${nativeName}\` = ${value}`;
      });
      if (children) {
        const argument = childrenParameter ?? "content";
        const content = shareChildren ? "renderChildren" : renderSlot("node.children", childrenScope);
        args.push(`${argument} = ${content}`);
      }
      if (compact || !args.length) return `${nativeFunction}(${args.join(", ")})`;
      return [
        `${nativeFunction}(`,
        ...args.map((arg) => `${indent}  ${arg},`),
        `${indent})`,
      ].join("\n");
    };

    const maskValue = optionals.map(({ name }) =>
      `(if (node.has(${quote(name)})) ${bits.get(name)} else 0)`).join(" +\n    ");
    const state = parameters.filter(({ kind }) => Object.hasOwn(stateKinds, kind));
    const stateArguments = state.map(({ name }) => `, ${name}Value`).join("");
    const childrenArgument = shareChildren ? ", renderChildren" : "";
    const childrenType = shareChildren ? ", renderChildren: @Composable () -> Unit" : "";
    const slotType = (nullable) => nullable ? "(@Composable () -> Unit)?" : "@Composable () -> Unit";
    const slotArguments = sharedSlots.map(({ name }) => `, slot_${name}`).join("");
    const slotTypes = sharedSlots.map(({ name, nullable }) => `, slot_${name}: ${slotType(nullable)}`).join("");
    const slotValues = sharedSlots.flatMap(({ name, nullable }) => {
      const key = quote(name);
      const content = nullable ? `content_${name}` : `slot_${name}`;
      return [
        `  val ${content}: @Composable () -> Unit = { RenderComposeChildren(node.slot(${key})) }`,
        ...(nullable ? [`  val slot_${name} = if (node.isNull(${key})) null else ${content}`] : []),
      ];
    });
    const stateValues = state.map(({ name, kind }) =>
      `  val ${name}Value = if (node.has(${quote(name)}) && !node.isNull(${quote(name)})) node.jsonObject(${quote(name)}).${stateKinds[kind][2]}(${stateKinds[kind][3] ?? ""}) else null`
    );
    const invalid = '    else -> error("Invalid generated arguments for " + node.name)';
    const groupSize = 32;
    const groups = Map.groupBy(masks, (mask) => Math.floor(mask / groupSize));
    const split = masks.length > groupSize;
    const body = !optionals.length ? [`  ${call(0, "  ")}`] : [
      `  val mask = ${maskValue}`,
      split ? `  when (mask / ${groupSize}) {` : "  when (mask) {",
      ...(split ? [...groups.keys()].map((group) =>
        `    ${group} -> render${renderer}Group${group}(node${modifierScope ? ", scope" : ""}, mask${stateArguments}${childrenArgument}${slotArguments})`
      ) : masks.map((mask) => `    ${mask} -> ${call(mask, "    ")}`)),
      invalid,
      "  }",
    ];
    const annotations = [
      ...(optIns.length ? [`@OptIn(${optIns.map((marker) => `${marker}::class`).join(", ")})`] : []),
      "@Composable",
    ];
    const stateTypes = state.map(({ name, kind }) => `, ${name}Value: ${stateKinds[kind][1]}?`).join("");
    const methods = [
      ...[...shared.values()].map((parameter) =>
        `private fun decode_${parameter.name}(node: ComposeNode) = ${parameterValue(parameter)}`),
      ...(shared.size ? [""] : []),
      ...annotations,
      `fun render(node: ComposeNode${modifierScope}) {`,
      ...stateValues,
      ...slotValues,
      ...(shareChildren ? ["  val renderChildren: @Composable () -> Unit = { RenderComposeChildren(node.children) }"] : []),
      ...body,
      "}",
      "",
      ...(split ? [...groups].flatMap(([group, groupMasks]) => [
        ...annotations,
        `private fun render${renderer}Group${group}(node: ComposeNode${modifierScope}, mask: Int${stateTypes}${childrenType}${slotTypes}) {`,
        "  when (mask) {",
        ...groupMasks.map((mask) => `    ${mask} -> ${call(mask, "    ")}`),
        invalid,
        "  }",
        "}",
        "",
      ]) : []),
    ];
    return [
      `// ${signature}`,
      `private object Renderer${renderer} {`,
      ...methods.filter((line, index) => line || index !== methods.length - 1)
        .map((line) => line ? `  ${line.replaceAll("\n", "\n  ")}` : ""),
      "}",
      "",
    ].join("\n");
  });

  const preamble = [
    "// Generated from Compose declarations by generate.mjs.",
    "package com.jetpackcomposereactnative.generated",
    "",
    "import androidx.compose.runtime.Composable",
    "import androidx.compose.ui.unit.dp",
    "import androidx.compose.ui.unit.sp",
    ...[...extensionImports].map(([name, alias]) => `import ${name} as ${alias}`),
    "",
  ];
  const registry = [
    ...(ownerOptIns.length ? [`@OptIn(${ownerOptIns.map((marker) => `${marker}::class`).join(", ")})`] : []),
    "@Composable",
    "internal fun RenderComposable(node: ComposeNode, scope: Any?) {",
    "  when (node.name) {",
    ...dispatch,
    '    else -> error("Unknown generated Compose component: " + node.name)',
    "  }",
    "}",
    "",
  ];

  // Kotlin lowers IR one file at a time. Keep a large API inventory from turning
  // into a single compilation unit containing thousands of default-argument calls.
  const maxRendererBytes = 1_000_000;
  const maxCallsPerShard = 1_200;
  const shards = [];
  let shard = [];
  let size = 0;
  let calls = 0;
  for (const [index, renderer] of functions.entries()) {
    const bytes = Buffer.byteLength(renderer) + 1;
    const forms = components[index].masks.length;
    if (shard.length && (size + bytes > maxRendererBytes || calls + forms > maxCallsPerShard)) {
      shards.push(shard);
      shard = [];
      size = 0;
      calls = 0;
    }
    shard.push(renderer);
    size += bytes;
    calls += forms;
  }
  if (shard.length) shards.push(shard);
  if (shards.length <= 1) {
    return [["ComposableRegistry.kt", [...preamble, ...registry, ...functions].join("\n")]];
  }
  return [
    ["ComposableRegistry.kt", [...preamble, ...registry].join("\n")],
    ...shards.map((renderers, index) => [
      `ComposableRenderers${index}.kt`,
      [...preamble, ...renderers.map((renderer) =>
        renderer.replace(/^private object Renderer/m, "internal object Renderer"))].join("\n"),
    ]),
  ];
}

validate(manifest);
const inventoryPath = process.env.COMPOSE_BINARY_INVENTORY ??
  path.join(repo, "tools/compose-codegen/build/compose-binary-inventory.json");
verifyInventory(manifest, JSON.parse(fs.readFileSync(inventoryPath, "utf8")));
const [factoryTypeScript, factoryKotlin] = factoryOutputs(manifest.factories);
for (const [name, overloads] of Map.groupBy(manifest.components, ({ name }) => name)) {
  overloads.forEach((component, index) => {
    component.id = index ? `${name}#${index}` : name;
    component.renderer = index ? `${name}_${index}` : name;
  });
}
const [modifierTypeScript, modifierKotlin] = modifierOutputs(manifest.modifiers, { ...kinds, ...modifierKinds });
const [valueTypeScript, valueKotlin] = valueOutputs(manifest.values);
const [recordTypeScript, recordKotlin] = recordOutputs(manifest.records ?? [], kinds);
const [styleTypeScript, styleKotlin] = styleOutputs(manifest.styleProperties ?? [], { ...kinds, ...modifierKinds });
const [iconTypeScript, iconKotlin] = iconOutputs(manifest.icons);
const android = "android/src/main/java/com/jetpackcomposereactnative/generated";
const nativeFiles = [
  [`${android}/ComposeMaterialIcons.kt`, iconKotlin],
  [`${android}/ComposeStyleValues.kt`, styleKotlin],
  [`${android}/ComposeRecords.kt`, recordKotlin],
  [`${android}/ComposeFactories.kt`, factoryKotlin],
  ...kotlin(manifest).map(([file, content]) => [`${android}/${file}`, content]),
  [`${android}/ModifierRegistry.kt`, modifierKotlin],
  [`${android}/ComposeValues.kt`, valueKotlin],
];

if (candidateDir) {
  fs.mkdirSync(candidateDir, { recursive: true });
  for (const [relative, content] of nativeFiles) fs.writeFileSync(path.join(candidateDir, path.basename(relative)), content);
  process.exit(0);
}
if (!approvedDir) throw Error("Run the generation pipeline so Kotlin compiles before writing package exports.");
for (const [relative, content] of nativeFiles) {
  if (fs.readFileSync(path.join(approvedDir, path.basename(relative)), "utf8") !== content) {
    throw Error(`Kotlin candidate changed after compilation: ${relative}`);
  }
}
const surface = {
  components: manifest.components.map(({ name, parameters, children, masks }) => ({ name, parameters, children, masks })),
  modifiers: manifest.modifiers.map(({ name, parameters, scope, masks }) => ({ name, parameters, scope, masks })),
};
const files = [
  ...nativeFiles,
  ["src/generated/components.tsx", typeScript(manifest)],
  ["src/generated/modifiers.ts", modifierTypeScript],
  ["src/generated/values.ts", valueTypeScript],
  ["src/generated/records.ts", recordTypeScript],
  ["src/generated/styles.ts", styleTypeScript],
  ["src/generated/icons.ts", iconTypeScript],
  ["src/generated/factories.ts", factoryTypeScript],
  ["tools/compose-codegen/api-surface.json", `{\n${Object.entries(surface).map(([kind, entries]) =>
    `  "${kind}": [\n${entries.map((entry) => `    ${JSON.stringify(entry)}`).join(",\n")}\n  ]`).join(",\n")}\n}\n`],
  ["tools/compose-codegen/coverage.json", `${JSON.stringify(manifest.coverage, null, 2)}\n`],
];
for (const [relative, content] of files) {
  const destination = output ? path.join(output, path.basename(relative)) : path.join(repo, relative);
  if (check) {
    if (fs.readFileSync(destination, "utf8") !== content) throw Error(`Stale generated file: ${destination}`);
  } else {
    fs.mkdirSync(path.dirname(destination), { recursive: true });
    fs.writeFileSync(destination, content);
  }
}
const nativeOutput = output ?? path.join(repo, android);
const expectedShards = new Set(nativeFiles.map(([relative]) => path.basename(relative)));
for (const file of fs.readdirSync(nativeOutput)) {
  if (!/^ComposableRenderers[0-9]+\.kt$/.test(file) || expectedShards.has(file)) continue;
  if (check) throw Error(`Stale generated file: ${path.join(nativeOutput, file)}`);
  fs.rmSync(path.join(nativeOutput, file));
}
console.log(`${check ? "Verified" : "Generated"} TypeScript and Kotlin for ${manifest.components.length} composable overloads and ${manifest.modifiers.length} modifier overloads`);
