# `{ icon: "Edit", style: "outlined" }` resolves `Icons.Outlined.Edit` by name (ComposeMaterialIcons.kt), which is
# compiled to the static getter `androidx.compose.material.icons.outlined.EditKt.getEdit(Icons.Outlined)`.
-keep class androidx.compose.material.icons.**Kt {
    public static androidx.compose.ui.graphics.vector.ImageVector get*(...);
}
-keep class androidx.compose.material.icons.Icons$** { *; }
