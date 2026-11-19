package com.jetpackcomposereactnative.views.icon

import android.content.Context
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.ComposeView
import com.jetpackcomposereactnative.common.ModifierProp
import com.jetpackcomposereactnative.common.toModifier
import com.jetpackcomposereactnative.common.LegacyComposeView

data class IconProps(
    var name: String = "",
    var theme: String = "Filled",
    var contentDescription: String = "",
    var modifier: ModifierProp = emptyList()
)

class IconView(context: Context) : LegacyComposeView(context) {
    private var props = mutableStateOf(IconProps())

    init {
        ComposeView(context).also {
            it.layoutParams = LayoutParams(WRAP_CONTENT, WRAP_CONTENT)
            it.setContent {
                IconComposable(props = props.value)
            }
            addView(it)
        }
    }

    fun updateModifier(modifier: ModifierProp) {
        props.value = props.value.copy(modifier = modifier)
    }

    fun updateName(name: String) {
        props.value = props.value.copy(name = name)
    }

    fun updateTheme(theme: String) {
        props.value = props.value.copy(theme = theme)
    }
}

@Composable
fun IconComposable(props: IconProps) {
    getIcon(props.name, props.theme)?.let {
        Icon(
            it,
            contentDescription = props.contentDescription,
            modifier = props.modifier.toModifier()
        )
    }
}

fun getIcon(name: String, theme: String): ImageVector? =
    try {
        val iconsPackage = "androidx.compose.material.icons."
        val iconName = snakeToPascalCase(name)
        val themeName = kebabToPascalCase(theme)
        val className = buildString {
            append(iconsPackage)
            append(themeName.lowercase())
            append('.')
            append(iconName)
            append("Kt")
        }

        val typeClass: Any = when (themeName) {
            "Filled" -> Icons.Filled
            "Outlined" -> Icons.Outlined
            "Rounded" -> Icons.Rounded
            "TwoTone" -> Icons.TwoTone
            "Sharp" -> Icons.Sharp
            else -> Icons.Filled
        }

        Class.forName(className).getDeclaredMethod("get$iconName", typeClass.javaClass).invoke(
            null,
            typeClass
        ) as ImageVector
    } catch (e: Throwable) {
        println("icons ${e.message}")
        null
    }

fun snakeToPascalCase(input: String): String {
    return input.split('_').joinToString("") { word ->
        word.replaceFirstChar { if (it.isLowerCase()) it.titlecase() else it.toString() }
    }.let {
        if (it.first().isDigit()) "_$it" else it
    }
}

fun kebabToPascalCase(input: String): String {
    return input.split('-').joinToString("") { word ->
        word.replaceFirstChar { if (it.isLowerCase()) it.titlecase() else it.toString() }
    }.let {
        if (it.first().isDigit()) "_$it" else it
    }
}
