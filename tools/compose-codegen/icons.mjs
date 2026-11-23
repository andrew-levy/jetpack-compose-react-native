export function iconOutputs(icons) {
  if (!icons.length) throw Error("No built-in Material icons were discovered on the Compose classpath");
  const styles = Map.groupBy(icons, ({ style }) => style);
  const typescript = [
    "// Generated from AndroidX Material icons by generate.mjs.",
    "export type ComposeMaterialIcon =",
    ...[...styles].map(([style, entries]) =>
      `  | { style${style === "filled" ? "?" : ""}: ${JSON.stringify(style)}; icon: ${entries.map(({ name }) => JSON.stringify(name)).join(" | ")} }`
    ),
    ";",
    "",
  ].join("\n");
  const kotlin = [
    "// Generated from AndroidX Material icons by generate.mjs.",
    '@file:Suppress("DEPRECATION")',
    "",
    "package com.jetpackcomposereactnative.generated",
    "",
    "import androidx.compose.material.icons.Icons",
    "import androidx.compose.ui.graphics.vector.ImageVector",
    ...icons.map(({ property, style, name }) => `import ${property} as ${style}_${name}`),
    "",
    "internal fun composeMaterialIcon(style: String, name: String): ImageVector =",
    '  when ("$style/$name") {',
    ...icons.map(({ name, style, theme }) => `    "${style}/${name}" -> Icons.${theme}.${style}_${name}`),
    '    else -> error("Unknown Compose Material icon: $style/$name")',
    "  }",
    "",
  ].join("\n");
  return [typescript, kotlin];
}
