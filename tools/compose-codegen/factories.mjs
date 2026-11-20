const quote = JSON.stringify;

// The supported factory category is a value with public Color fields and a copy function.
// Their names and the matching Kotlin factories come from KSP.
export function factoryOutputs(factories) {
  const groups = Map.groupBy(factories, ({ kotlinType }) => kotlinType);
  const typescript = ["// Generated from Compose declarations by generate.mjs.", ""];
  const kotlin = [
    "// Generated from Compose declarations by generate.mjs.",
    "package com.jetpackcomposereactnative.generated",
    "",
    "import androidx.compose.ui.graphics.Color",
    "import com.jetpackcomposereactnative.common.parseComposeColor",
    "import org.json.JSONObject",
    "",
  ];

  for (const [kotlinType, declarations] of groups) {
    const type = kotlinType.split(".").at(-1);
    const fields = [...new Set(declarations.flatMap((factory) => factory.fields))];
    const palettes = declarations.map((factory) => factory.name.slice(0, -type.length));
    typescript.push(
      `export interface ${type}Colors {`,
      ...fields.map((field) => `  ${field}?: string;`),
      "}",
      "",
      `export interface ${type} {`,
      `  readonly palette: ${palettes.map(quote).join(" | ")};`,
      `  readonly colors: Readonly<${type}Colors>;`,
      "}",
      "",
    );

    kotlin.push(
      `internal fun JSONObject.to${type}(): ${kotlinType} {`,
      '  val colors = getJSONObject("colors")',
      '  return when (val palette = getString("palette")) {',
      ...declarations.map(({ name }, i) => `    ${quote(palettes[i])} -> decode${capitalize(name)}(${declarations[i].fields.length ? "colors" : ""})`),
      '    else -> error("Unknown Compose factory palette: " + palette)',
      "  }",
      "}",
      "",
    );

    for (const [i, factory] of declarations.entries()) {
      const { name, kotlinFunction, fields: roles, optIns } = factory;
      const hasAllFields = roles.length === fields.length;
      const input = hasAllFields ? `${type}Colors` : `Pick<${type}Colors, ${roles.map(quote).join(" | ") || "never"}>`;
      typescript.push(
        `export function ${name}(${roles.length ? `colors: ${input} = {}` : ""}): ${type} {`,
        `  return { palette: ${quote(palettes[i])}, colors: ${roles.length ? "{ ...colors }" : "{}"} };`,
        "}",
        "",
      );

      if (optIns.length) kotlin.push(`@OptIn(${optIns.map((marker) => `${marker}::class`).join(", ")})`);
      if (!roles.length) {
        kotlin.push(`private fun decode${capitalize(name)}(): ${kotlinType} = ${kotlinFunction}()`, "");
        continue;
      }
      kotlin.push(
        `private fun decode${capitalize(name)}(colors: JSONObject): ${kotlinType} {`,
        `  val base = ${kotlinFunction}()`,
        ...roles.map((role, index) => `  val color${index} = colors.colorOverride(${quote(role)})`),
        "  // Let Kotlin supply defaults that depend on a color passed to the factory.",
        "  val defaults = listOfNotNull(",
        ...roles.map((role, index) =>
          `    color${index}?.let { ${kotlinFunction}(\`${role}\` = it) },`),
        "  )",
        "  if (defaults.isEmpty()) return base",
        "  return base.copy(",
        ...roles.map((role, index) =>
          `    \`${role}\` = color${index} ?: defaults.lastOrNull { it.\`${role}\` != base.\`${role}\` }?.\`${role}\` ?: base.\`${role}\`,`),
        "  )",
        "}",
        "",
      );
    }
  }

  if (factories.length) kotlin.push(
    "private fun JSONObject.colorOverride(role: String): Color? =",
    "  (opt(role) as? String)?.let(::parseComposeColor)?.takeUnless { it == Color.Unspecified }",
    "",
  );
  return [typescript.join("\n"), kotlin.join("\n")];
}

function capitalize(name) {
  return name[0].toUpperCase() + name.slice(1);
}
