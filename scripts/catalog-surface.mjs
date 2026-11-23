import { readFileSync } from "fs";
import { createRequire } from "module";
import { dirname, join } from "path";
import { fileURLToPath } from "url";

const root = join(dirname(fileURLToPath(import.meta.url)), "..");
const require = createRequire(import.meta.url);

const NAME_SCOPE = {
  animateEnterExit: "visibility",
  renderInSharedTransitionScopeOverlay: "shared",
  sharedBounds: "shared",
  sharedElement: "shared",
  sharedElementWithCallerManagedVisibility: "shared",
  skipToLookaheadPosition: "shared",
  skipToLookaheadSize: "shared",
  animateBounds: "lookahead",
};

const SCOPE_PREFERENCE = [
  "box", "row", "column", "flex", "flowRow", "flowColumn", "grid", "lazy",
  "lazyGrid", "lazyStaggered", "menu", "tab", "carousel", "visibility",
];

function read(path) {
  return readFileSync(join(root, path), "utf8");
}

function sliceBalanced(source, openIndex) {
  let depth = 0;
  let quote = null;
  for (let index = openIndex; index < source.length; index++) {
    const char = source[index];
    if (quote) {
      if (char === "\\") {
        index++;
        continue;
      }
      if (char === quote) quote = null;
      continue;
    }
    if (char === "\"" || char === "'" || char === "`") {
      quote = char;
      continue;
    }
    if (char === "{") depth++;
    else if (char === "}") {
      depth--;
      if (depth === 0) return source.slice(openIndex, index + 1);
    }
  }
  throw new Error("Unbalanced brace");
}

function stripComments(source) {
  return source.replace(/\/\*[\s\S]*?\*\//g, "");
}

function evaluate(expression) {
  return Function(`"use strict"; return (${expression});`)();
}

function stringTypes() {
  return new Set([...read("src/generated/values.ts").matchAll(/export type (\w+)/g)].map((match) => match[1]));
}

function kindOf(type, enums) {
  const base = type
    .replace(/\s*\|\s*null\b/g, "")
    .replace(/\s*\|\s*undefined\b/g, "")
    .replace(/\s*\|\s*never\b/g, "")
    .trim();
  if (base === "string" || base.includes("\"")) return "string";
  if (base === "number") return "number";
  if (base === "boolean") return "boolean";
  if (base === "ReactNode") return "ReactNode";
  const parts = base.split(/\s*\|\s*/).filter(Boolean);
  if (parts.length && parts.every((part) => part === "string" || part === "number")) {
    return parts.includes("string") && parts.includes("number") ? "animationTarget" : parts[0];
  }
  if (base.includes("=>")) return "function";
  if (base === "ComposeModifier") return "ComposeModifier";
  if (base === "ComposeShape") return "shape";
  if (base === "ComposeBrush") return "brush";
  if (base === "ComposeFloatRange" || base.startsWith("readonly [") || base.startsWith("[")) return "tuple";
  if (base.includes("[]") || base.startsWith("readonly ")) return "array";
  const ident = base.match(/^(\w+)/)?.[1];
  if (ident && enums.has(ident)) return "string";
  return "object";
}

function sampleString(name) {
  const exact = {
    alignment: "center",
    contentAlignment: "center",
    horizontalAlignment: "start",
    itemHorizontalAlignment: "start",
    verticalAlignment: "top",
    itemVerticalAlignment: "top",
    horizontalArrangement: "start",
    verticalArrangement: "top",
    orientation: "horizontal",
    animatedVisibilityScope: "current",
    lookaheadScope: "current",
    resizeMode: "remeasureToBounds",
    placeholderSize: "contentSize",
    animationMode: "immediately",
    overflow: "ellipsis",
    textAlign: "start",
    fontWeight: "normal",
    fontStyle: "normal",
    contentScale: "fit",
    strokeCap: "round",
    role: "image",
    displayMode: "picker",
    iconPosition: "top",
    textObfuscationMode: "visible",
    direction: "row",
    flow: "row",
    wrap: "wrap",
    label: "Label",
    text: "Sample",
    title: "Title",
    message: "Saved",
    contentDescription: "Sample",
    placeholder: "Text",
    key: "demo",
    tag: "demo",
    alignmentLine: "firstBaseline",
    intrinsicSize: "max",
    icon: "hand",
    contentType: "username",
    type: "primaryNotEditable",
    state: "off",
  };
  if (exact[name]) return exact[name];
  if (/color/i.test(name)) return "#6750a4";
  if (/horizontalAlignment/.test(name)) return "start";
  if (/verticalAlignment/.test(name)) return "top";
  if (/align/i.test(name)) return "center";
  if (/arrangement/i.test(name)) return "start";
  if (/orientation/i.test(name)) return "horizontal";
  return "Sample";
}

function sampleNumber(name) {
  if (/progress|fraction|alpha|scale|ratio|percent/i.test(name)) return 0.5;
  if (/index|page|targetState|count/i.test(name)) return name === "maxItemCount" ? 2 : 0;
  return 8;
}

function sampleObject(name, owner = "") {
  if (/^on(?:KeyEvent|PreviewKeyEvent|InterceptKeyBeforeSoftKeyboard|PreInterceptKeyBeforeSoftKeyboard)$/.test(name)) {
    return { keyCodes: [4], event: "up" };
  }
  switch (name) {
    case "border": return { width: 2, color: "#6750a4" };
    case "shadow": return { radius: 4, color: "#6750a4" };
    case "rulers": return { type: "safeDrawing" };
    case "scope": return { canFocus: true };
    case "sourceCenter": return { x: 16, y: 16 };
    case "bringIntoViewRequester": return "$bringIntoViewRequester";
    case "focusRequester": return "$focusRequester";
    case "holder": return "$layoutBoundsHolder";
    case "transferData": return { text: "Sample" };
    case "shouldStartDragAndDrop": return { mimeTypes: ["text/plain"] };
    case "target": return owner === "dragAndDropTarget" ? { onDrop: "$fn" } : {};
    case "onTouchEvent": return { actions: [0, 1] };
    case "indication": return { type: "ripple" };
    case "overscrollEffect": return { type: "platform" };
    case "receiveContentListener": return { onText: "$fn" };
    case "sharedContentState": return { key: "demo" };
    case "measurePolicy": return { height: 48, children: [{}] };
    case "onDraw": return { commands: [] };
    case "config": return { columns: ["auto"], rows: ["auto"] };
    case "columns":
    case "rows": return { count: 2 };
    case "painter": return { color: "#6750a4" };
    case "text": return { text: "Sample" };
    case "visualTransformation": return { type: "none" };
    case "sliderState": return "$sliderState";
    case "rangeSliderState": return "$rangeSliderState";
    case "state":
      if (owner === "RangeSlider") return "$rangeSliderState";
      if (owner === "Slider" || owner === "VerticalSlider") return "$sliderState";
      if (["Indicator", "IndicatorBox", "PullToRefreshBox", "pullToRefresh"].includes(owner)) return "$pullToRefreshState";
      if (owner === "anchoredDraggable") return { anchors: { start: 0, end: 100 }, initialValue: "start" };
      if (owner === "draggable" || owner === "draggable2D") return { onDelta: "$fn" };
      if (owner === "transformable") return { onTransform: "$fn" };
      if (/^[a-z]/.test(owner)) return {};
      return { initialText: "Hello" };
    case "positionProvider": return {};
    case "interactionSource": return "$interactionSource";
    case "items": return { label: "Action", onClick: "$fn" };
    default: return {};
  }
}

function sampleArray(name) {
  if (name === "items") return [{ label: "Action", icon: { icon: "Settings" }, onClick: "$fn" }];
  return [];
}

function revive(value) {
  if (value === "$fn") return () => {};
  if (Array.isArray(value)) return value.map(revive);
  if (value && typeof value === "object") {
    return Object.fromEntries(Object.entries(value).map(([key, item]) => [key, revive(item)]));
  }
  return value;
}

function sampleValue(kind, name, owner = "") {
  switch (kind) {
    case "function": return { live: () => {}, json: "$fn" };
    case "ComposeModifier": return { live: { build: () => [] }, json: "$modifier" };
    case "ReactNode": return { live: "node", json: "$node" };
    case "string": {
      const value = sampleString(name);
      return { live: value, json: value };
    }
    case "number": {
      const value = sampleNumber(name);
      return { live: value, json: value };
    }
    case "boolean": return { live: true, json: true };
    case "shape": return { live: "rect", json: "rect" };
    case "brush": return { live: "#6750a4", json: "#6750a4" };
    case "tuple": return { live: [0, 1], json: [0, 1] };
    case "animationTarget": return { live: 0, json: 0 };
    case "paddingValues": return { live: { all: 8 }, json: { all: 8 } };
    case "windowInsets": {
      const value = { left: 0, top: 0, right: 0, bottom: 0 };
      return { live: value, json: value };
    }
    case "array": {
      const json = sampleArray(name);
      return { live: revive(json), json };
    }
    case "object": {
      const json = sampleObject(name, owner);
      if (typeof json === "string") return { live: {}, json };
      return { live: revive(json), json };
    }
    default: return { live: {}, json: {} };
  }
}

function splitPair(entries) {
  return {
    live: Object.fromEntries(entries.map(([key, value]) => [key, value.live])),
    json: Object.fromEntries(entries.map(([key, value]) => [key, value.json])),
  };
}

function componentDescriptions(source) {
  const descriptions = [];
  const pattern = /export const (\w+) = createComposableComponent</g;
  for (const match of source.matchAll(pattern)) {
    const open = source.indexOf("({", match.index);
    const body = sliceBalanced(source, open + 1);
    descriptions.push({ description: evaluate(body), index: match.index });
  }
  return descriptions;
}

function topBlocks(text) {
  const blocks = [];
  let quote = null;
  let depth = 0;
  let start = -1;
  for (let index = 0; index < text.length; index++) {
    const char = text[index];
    if (quote) {
      if (char === "\\") {
        index++;
        continue;
      }
      if (char === quote) quote = null;
      continue;
    }
    if (char === "\"" || char === "'" || char === "`") {
      quote = char;
      continue;
    }
    if (char === "{") {
      if (depth === 0) start = index;
      depth++;
    } else if (char === "}") {
      depth--;
      if (depth === 0 && start >= 0) {
        blocks.push(text.slice(start, index + 1));
        start = -1;
      }
    }
  }
  return blocks;
}

function hideNested(body) {
  let result = "";
  let depth = 0;
  let quote = null;
  for (let index = 0; index < body.length; index++) {
    const char = body[index];
    if (quote) {
      if (depth === 0) result += char;
      if (char === "\\") {
        index++;
        if (depth === 0 && index < body.length) result += body[index];
        continue;
      }
      if (char === quote) quote = null;
      continue;
    }
    if (char === "\"" || char === "'" || char === "`") {
      quote = char;
      if (depth === 0) result += char;
      continue;
    }
    if (char === "{") {
      if (depth === 0) result += "Nested";
      depth++;
      continue;
    }
    if (char === "}") {
      depth--;
      continue;
    }
    if (depth === 0) result += char;
  }
  return result;
}

function requiredFields(block, enums) {
  const hidden = hideNested(block.slice(1, -1));
  const fields = [];
  for (const match of hidden.matchAll(/(\w+)(\??):\s*([^;]+);/g)) {
    const [, name, optional, type] = match;
    if (optional || name === "children" || name === "modifier" || name === "modifiers") continue;
    fields.push({ name, kind: kindOf(type.trim(), enums) });
  }
  return fields;
}

function interfaceFields(source, name, componentIndex, enums) {
  const interfaceAt = source.lastIndexOf(`export interface ${name}Props`, componentIndex);
  const typeAt = source.lastIndexOf(`export type ${name}Props`, componentIndex);
  const at = Math.max(interfaceAt, typeAt);
  if (at < 0) return [];
  const next = source.indexOf("\nexport ", at + 10);
  const text = source.slice(at, next === -1 ? componentIndex : next);
  const blocks = topBlocks(text);
  if (!blocks.length) return [];
  return blocks
    .map((block) => requiredFields(block, enums))
    .sort((left, right) => left.length - right.length)[0];
}

function maskNames(parameters, mask) {
  const names = [];
  let bit = 0;
  for (const [name, , optional] of parameters) {
    if (optional && name !== "modifier") {
      if ((mask & (1 << bit)) !== 0) names.push(name);
      bit++;
    }
  }
  return names;
}

function propsFor(description, parameters, include) {
  const entries = [];
  const slots = [];
  const slotNames = new Set(description.slots ?? []);
  for (const [name, kind] of parameters) {
    if (!include.has(name)) continue;
    if (kind === "ReactNode" && slotNames.has(name)) {
      slots.push(name);
      continue;
    }
    entries.push([name, sampleValue(kind, name, description.name)]);
  }
  const pair = splitPair(entries);
  for (const slot of slots) pair.live[slot] = "node";
  return { ...pair, slots };
}

function overloadProps(description, overload) {
  const minMask = Math.min(...overload.masks);
  const include = new Set([
    ...overload.parameters.filter(([, , optional]) => !optional).map(([name]) => name),
    ...maskNames(overload.parameters, minMask),
  ]);
  return propsFor(description, overload.parameters, include);
}

function namesOf(description) {
  return new Set([...(description.props ?? []), ...(description.events ?? []), ...(description.slots ?? [])]);
}

function parentFor(name, props) {
  switch (name) {
    case "ExposedDropdownMenu": return "ExposedDropdownMenuBox";
    case "FloatingActionButtonMenuItem": return "FloatingActionButtonMenu";
    case "NavigationBarItem": return "NavigationBar";
    case "PlainTooltip":
    case "RichTooltip": return "TooltipBox";
    case "SegmentedButton":
      return props.selected !== undefined && props.checked === undefined
        ? "SingleChoiceSegmentedButtonRow"
        : "MultiChoiceSegmentedButtonRow";
    default: return null;
  }
}

function liveFor(overload, built) {
  const live = { ...built.live };
  if (overload.children) live.children = "node";
  return live;
}

function score(overload) {
  const required = overload.parameters.filter(([name, , optional]) => !optional && name !== "modifier").length;
  return required * 100000 + Math.min(...overload.masks);
}

function loadModifier() {
  const source = read("src/generated/modifiers.ts");
  const marker = "export const Modifier = createModifier(";
  const open = source.indexOf("{", source.indexOf(marker));
  const table = evaluate(sliceBalanced(source, open));
  const { createModifier } = require(join(root, "build/utils/modifier.js"));
  return { Modifier: createModifier(table), table };
}

function scopeKind(className) {
  switch (className) {
    case "BoxScope": return "box";
    case "RowScope": return "row";
    case "ColumnScope": return "column";
    case "FlexBoxScope": return "flex";
    case "FlowRowScope": return "flowRow";
    case "FlowColumnScope": return "flowColumn";
    case "GridScope": return "grid";
    case "LazyItemScope": return "lazy";
    case "LazyGridItemScope": return "lazyGrid";
    case "LazyStaggeredGridItemScope": return "lazyStaggered";
    case "ExposedDropdownMenuBoxScope": return "menu";
    case "TabIndicatorScope": return "tab";
    case "CarouselItemScope": return "carousel";
    case "AnimatedVisibilityScope": return "visibility";
    default: return className;
  }
}

function modifierScopeMap(text) {
  const start = text.indexOf("internal fun applyComposeModifier");
  const end = text.indexOf("\nprivate fun ", start);
  const head = text.slice(start, end);
  const map = new Map();
  for (const match of head.matchAll(/^\s+(\d+) -> if \(scope is [\w.]+\.(\w+)\)/gm)) {
    map.set(Number(match[1]), scopeKind(match[2]));
  }
  return { map, ids: new Set([...head.matchAll(/^\s+(\d+) ->/gm)].map((match) => Number(match[1]))) };
}

function chooseScope(name, ids, scopeById) {
  if (NAME_SCOPE[name]) return NAME_SCOPE[name];
  const scopes = ids.map((id) => scopeById.get(id) ?? null);
  if (scopes.includes(null)) return null;
  return SCOPE_PREFERENCE.find((scope) => scopes.includes(scope)) ?? scopes[0] ?? null;
}

function formArgs(name, form, labels) {
  const entries = form.map(([key, type]) => [labels?.[key] ?? key, sampleValue(type, key, name)]);
  return splitPair(entries);
}

function callForm(Modifier, name, form, labels) {
  const args = formArgs(name, form, labels);
  const chain = form.length === 0 ? Modifier[name]() : Modifier[name](args.live);
  return { call: chain.build().at(-1), json: args.json };
}

function registryNames(text) {
  const start = text.indexOf("internal fun RenderComposable");
  const end = text.indexOf("else -> error(\"Unknown generated Compose component", start);
  return new Set([...text.slice(start, end).matchAll(/^\s+"([^"]+)" ->/gm)].map((match) => match[1]));
}

export function assembleSurface() {
  const { selectOverload } = require(join(root, "build/utils/overloads.js"));
  const enums = stringTypes();
  const source = stripComments(read("src/generated/components.tsx"));
  const problems = [];
  const components = [];

  for (const { description, index } of componentDescriptions(source)) {
    const names = namesOf(description);
    const overloads = description.overloads ?? [];
    let chosen = null;
    for (const overload of [...overloads].sort((left, right) => score(left) - score(right))) {
      const built = overloadProps(description, overload);
      try {
        const selected = selectOverload(description, names, liveFor(overload, built));
        if (selected.id === overload.id) {
          chosen = { overload, built };
          break;
        }
      } catch {
        // The per-overload loop records the failure.
      }
    }
    for (const overload of overloads) {
      const built = overloadProps(description, overload);
      try {
        const selected = selectOverload(description, names, liveFor(overload, built));
        if (selected.id !== overload.id) {
          problems.push(`${description.name} ${overload.id} resolved to ${selected.id}`);
        }
      } catch (error) {
        problems.push(`${description.name} ${overload.id}: ${error.message}`);
      }
    }

    if (overloads.length) {
      if (!chosen) {
        problems.push(`${description.name} has no selectable preview`);
        continue;
      }
      components.push({
        name: description.name,
        overload: chosen.overload.id,
        props: chosen.built.json,
        slots: chosen.built.slots,
        children: Boolean(chosen.overload.children),
        keyedChildren: Boolean(chosen.overload.keyedChildren ?? description.keyedChildren),
        parent: parentFor(description.name, chosen.built.json),
      });
      continue;
    }

    const fields = interfaceFields(source, description.name, index, enums);
    const built = propsFor(description, fields.map((field) => [field.name, field.kind, false, false]), new Set(fields.map((field) => field.name)));
    components.push({
      name: description.name,
      overload: null,
      props: built.json,
      slots: built.slots,
      children: Boolean(description.children),
      keyedChildren: Boolean(description.keyedChildren),
      parent: parentFor(description.name, built.json),
    });
  }

  const { Modifier, table } = loadModifier();
  const { map: scopeById, ids: registryIds } = modifierScopeMap(read("android/src/main/java/com/jetpackcomposereactnative/generated/ModifierRegistry.kt"));
  const seenIds = new Set();
  const modifiers = [];
  for (const [name, overloads] of Object.entries(table)) {
    let preview = null;
    for (const overload of overloads) {
      seenIds.add(overload.id);
      const forms = [...overload.forms].sort((left, right) => left.length - right.length);
      let matched = null;
      let last = "no form resolved";
      for (const form of forms) {
        try {
          const result = callForm(Modifier, name, form, overload.labels);
          if (result.call.ids.includes(overload.id)) {
            matched = result;
            break;
          }
          last = `resolved ids ${result.call.ids.join(", ")}`;
        } catch (error) {
          last = error.message;
        }
      }
      if (!matched) problems.push(`${name}#${overload.id}: ${last}`);
      else if (!preview || Object.keys(matched.json).length < Object.keys(preview.json).length) preview = matched;
    }
    if (!preview) continue;
    modifiers.push({
      name,
      args: preview.json,
      scope: chooseScope(name, preview.call.ids, scopeById),
    });
  }

  for (const [name, args] of [
    ["backgroundColor", { color: "#6750a4" }],
    ["backgroundBrush", { brush: { colors: ["#c7b2fa", "#f5c6e4"] } }],
  ]) {
    try {
      const call = Modifier[name](args).build().at(-1);
      modifiers.push({ name, args, scope: chooseScope(name, call.ids, scopeById) });
    } catch (error) {
      problems.push(`${name}: ${error.message}`);
    }
  }

  for (const id of registryIds) {
    if (!seenIds.has(id)) problems.push(`Kotlin modifier ${id} has no JavaScript overload`);
  }
  for (const id of seenIds) {
    if (!registryIds.has(id)) problems.push(`JavaScript modifier ${id} is missing from ModifierRegistry.kt`);
  }

  const kotlinComponents = registryNames(read("android/src/main/java/com/jetpackcomposereactnative/generated/ComposableRegistry.kt"));
  const componentNames = new Set(components.map((component) => component.name));
  const overloadIds = new Set();
  for (const { description } of componentDescriptions(source)) {
    componentNames.add(description.name);
    for (const overload of description.overloads ?? []) overloadIds.add(overload.id);
  }
  for (const name of kotlinComponents) {
    if (!componentNames.has(name) && !overloadIds.has(name)) problems.push(`Kotlin component ${name} is missing from JavaScript`);
  }
  for (const name of componentNames) {
    if (!kotlinComponents.has(name)) problems.push(`JavaScript component ${name} is missing from ComposableRegistry.kt`);
  }
  for (const id of overloadIds) {
    if (!kotlinComponents.has(id)) problems.push(`JavaScript overload ${id} is missing from ComposableRegistry.kt`);
  }

  components.sort((left, right) => left.name.localeCompare(right.name));
  modifiers.sort((left, right) => left.name.localeCompare(right.name));
  return { catalog: { components, modifiers }, problems };
}

export function buildCatalog() {
  const { catalog, problems } = assembleSurface();
  const blocking = problems.filter((problem) => problem !== "Box Box#1 resolved to Box");
  if (blocking.length) {
    const head = blocking.slice(0, 40).join("\n");
    const extra = blocking.length > 40 ? `\n... ${blocking.length - 40} more` : "";
    throw new Error(head + extra);
  }
  return catalog;
}

export { loadModifier };
