// Material icons are looked up by name at run time, so every icon on the app's classpath is available:
// material-icons-core, and material-icons-extended when the app includes it. Only the styles are generated.
export function iconOutputs(styles) {
  if (!styles.length) throw Error("No Material icon styles were discovered on the Compose classpath");
  const typescript = [
    "// Generated from AndroidX Material icons by generate.mjs.",
    `export type ComposeMaterialIconStyle = ${styles.map(({ style }) => JSON.stringify(style)).join(" | ")};`,
    "",
    "/**",
    " * A Material icon by its Kotlin name, such as `Edit` or `_3dRotation`. Omit `style` for filled icons.",
    " * Any icon in material-icons-core or material-icons-extended works.",
    " */",
    "export type ComposeMaterialIcon = { icon: string; style?: ComposeMaterialIconStyle };",
    "",
  ].join("\n");
  const kotlin = [
    "// Generated from AndroidX Material icons by generate.mjs.",
    "package com.jetpackcomposereactnative.generated",
    "",
    "import androidx.compose.material.icons.Icons",
    "import androidx.compose.ui.graphics.vector.ImageVector",
    "import java.util.concurrent.ConcurrentHashMap",
    "import org.json.JSONObject",
    "",
    "// `Icons.Outlined.Edit` is a top-level property compiled to `EditKt.getEdit(Icons.Outlined)`.",
    "private class ComposeIconTheme(val packageName: String, val receiver: Any)",
    "",
    "private val composeIconThemes = mapOf(",
    ...styles.map(({ style, packageName, theme }) =>
      `  ${JSON.stringify(style)} to ComposeIconTheme(${JSON.stringify(packageName)}, Icons.${theme}),`),
    ")",
    "",
    "private val composeIcons = ConcurrentHashMap<String, ImageVector>()",
    "",
    "internal fun composeMaterialIcon(style: String, name: String): ImageVector = composeIcons.getOrPut(\"$style/$name\") {",
    '  val theme = composeIconThemes[style] ?: error("Unknown Compose Material icon style: $style")',
    "  val getter = try {",
    '    Class.forName("${theme.packageName}.${name}Kt").getMethod("get$name", theme.receiver.javaClass)',
    "  } catch (error: ReflectiveOperationException) {",
    "    throw IllegalArgumentException(",
    '      "Unknown Compose Material icon: $style/$name. Icons outside the core set need " +',
    '        "androidx.compose.material:material-icons-extended.", error,',
    "    )",
    "  }",
    "  getter.invoke(null, theme.receiver) as ImageVector",
    "}",
    "",
    "internal fun JSONObject.toComposeMaterialIcon(): ImageVector =",
    '  composeMaterialIcon(optString("style", "filled"), getString("icon"))',
    "",
  ].join("\n");
  return [typescript, kotlin];
}
