import { typeImports } from "./modifiers.mjs";

const states = ["disabled", "checked", "selected", "focused", "hovered", "pressed"];

export function styleOutputs(properties, kinds) {
  const ts = ["// Generated from Compose Foundation StyleScope by generate.mjs."];
  const kt = [
    "// Generated from Compose Foundation StyleScope by generate.mjs.",
    "package com.jetpackcomposereactnative.generated",
  ];
  if (properties.length === 0) return [ts.concat("", "export {};", "").join("\n"), kt.join("\n") + "\n"];
  const descriptors = properties.map(({ kind }) => kinds[kind]);
  const enums = [...new Set(properties.map(({ kind }) => kind))].filter((kind) => kind.startsWith("Compose"));
  ts.push(
    ...typeImports([...descriptors, kinds.animationSpec], "./styles"),
    "import type { ComposeInteractionSource } from '../utils/nativeHandles';",
    ...(enums.length ? ["import type { " + enums.join(", ") + " } from './values';"] : []),
    ...(properties.some(({ kind }) => kind === "shape" || kind === "brush")
      ? ["import type { ComposeShape, ComposeBrush } from '../utils/modifier';"] : []),
    "",
    "export interface ComposeFoundationStyle {",
    ...properties.map(({ name, kind }) => "  " + name + "?: " + kinds[kind].type + ";"),
    ...states.map((name) => "  when" + name[0].toUpperCase() + name.slice(1) + "?: ComposeFoundationStyle;"),
    "  animationSpec?: ComposeAnimationSpec;",
    "}",
    "",
    "export interface ComposeFoundationStyleState {",
    "  interactionSource?: ComposeInteractionSource;",
    "  enabled?: boolean;",
    "  selected?: boolean;",
    "  checked?: boolean;",
    "}",
  );
  const bindings = properties.map(({ name, kind }) => {
    const expression = (kinds[kind].modifierExpression ?? kinds[kind].expression)(JSON.stringify(name))
      .replaceAll("node.", "args.");
    return { name, expression };
  });
  kt.push(
    "",
    "import androidx.compose.runtime.Composable",
    "import androidx.compose.foundation.style.ExperimentalFoundationStyleApi",
    "import androidx.compose.foundation.style.Style",
    "import androidx.compose.foundation.style.StyleState",
    "import androidx.compose.foundation.style.rememberUpdatedStyleState",
    ...states.map((name) => "import androidx.compose.foundation.style." + name),
    "import androidx.compose.ui.unit.dp",
    "import androidx.compose.ui.unit.sp",
    "import org.json.JSONArray",
    "import org.json.JSONObject",
    "",
    "@OptIn(ExperimentalFoundationStyleApi::class)",
    "internal fun JSONObject.toComposeFoundationStyle(): Style {",
    "  val args = ComposeModifierArguments(this) { _, _ -> }",
    ...bindings.map(({ name, expression }) => "  val " + name + "Value = if (args.isNull(" + JSON.stringify(name) + ")) null else " + expression),
    ...states.map((name) => "  val " + name + "Value = optJSONObject(" + JSON.stringify("when" + name[0].toUpperCase() + name.slice(1)) + ")?.toComposeFoundationStyle()"),
    "  val style = Style {",
    ...bindings.map(({ name }) => "    " + name + "Value?.let { " + name + "(it) }"),
    ...states.map((name) => "    " + name + "Value?.let { " + name + "(it) }"),
    "  }",
    '  val animation = optJSONObject("animationSpec")?.toComposeFloatAnimationSpec() ?: return style',
    "  return Style { animate(animation, style) }",
    "}",
    "",
    "@OptIn(ExperimentalFoundationStyleApi::class)",
    "internal fun JSONArray.toComposeFoundationStyles(): Array<Style> =",
    "  Array(length()) { getJSONObject(it).toComposeFoundationStyle() }",
    "",
    "@OptIn(ExperimentalFoundationStyleApi::class)",
    "@Composable",
    "internal fun JSONObject.rememberComposeFoundationStyleState(): StyleState {",
    '  val source = optJSONObject("interactionSource")?.rememberComposeInteractionSource()',
    "  return rememberUpdatedStyleState(source) { state ->",
    '    state.isEnabled = optBoolean("enabled", true)',
    '    state.isSelected = optBoolean("selected")',
    '    state.isChecked = optBoolean("checked")',
    "  }",
    "}",
  );
  return [ts.join("\n") + "\n", kt.join("\n") + "\n"];
}
