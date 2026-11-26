// Generated from AndroidX Material icons by generate.mjs.
package com.jetpackcomposereactnative.generated

import androidx.compose.material.icons.Icons
import androidx.compose.ui.graphics.vector.ImageVector
import java.util.concurrent.ConcurrentHashMap
import org.json.JSONObject

// `Icons.Outlined.Edit` is a top-level property compiled to `EditKt.getEdit(Icons.Outlined)`.
private class ComposeIconTheme(val packageName: String, val receiver: Any)

private val composeIconThemes = mapOf(
  "autoMirroredFilled" to ComposeIconTheme("androidx.compose.material.icons.automirrored.filled", Icons.AutoMirrored.Filled),
  "autoMirroredOutlined" to ComposeIconTheme("androidx.compose.material.icons.automirrored.outlined", Icons.AutoMirrored.Outlined),
  "autoMirroredRounded" to ComposeIconTheme("androidx.compose.material.icons.automirrored.rounded", Icons.AutoMirrored.Rounded),
  "autoMirroredSharp" to ComposeIconTheme("androidx.compose.material.icons.automirrored.sharp", Icons.AutoMirrored.Sharp),
  "autoMirroredTwoTone" to ComposeIconTheme("androidx.compose.material.icons.automirrored.twotone", Icons.AutoMirrored.TwoTone),
  "filled" to ComposeIconTheme("androidx.compose.material.icons.filled", Icons.Filled),
  "outlined" to ComposeIconTheme("androidx.compose.material.icons.outlined", Icons.Outlined),
  "rounded" to ComposeIconTheme("androidx.compose.material.icons.rounded", Icons.Rounded),
  "sharp" to ComposeIconTheme("androidx.compose.material.icons.sharp", Icons.Sharp),
  "twoTone" to ComposeIconTheme("androidx.compose.material.icons.twotone", Icons.TwoTone),
)

private val composeIcons = ConcurrentHashMap<String, ImageVector>()

internal fun composeMaterialIcon(style: String, name: String): ImageVector = composeIcons.getOrPut("$style/$name") {
  val theme = composeIconThemes[style] ?: error("Unknown Compose Material icon style: $style")
  val getter = try {
    Class.forName("${theme.packageName}.${name}Kt").getMethod("get$name", theme.receiver.javaClass)
  } catch (error: ReflectiveOperationException) {
    throw IllegalArgumentException(
      "Unknown Compose Material icon: $style/$name. Icons outside the core set need " +
        "androidx.compose.material:material-icons-extended.", error,
    )
  }
  getter.invoke(null, theme.receiver) as ImageVector
}

internal fun JSONObject.toComposeMaterialIcon(): ImageVector =
  composeMaterialIcon(optString("style", "filled"), getString("icon"))
