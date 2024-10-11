package expo.modules.jetpackcomposereactnative.views.icon

import android.content.Context
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.ComposeView
import expo.modules.jetpackcomposereactnative.common.ModifierProp
import expo.modules.jetpackcomposereactnative.common.toModifier
import expo.modules.kotlin.AppContext
import expo.modules.kotlin.views.ExpoView

data class IconProps(
    var name: String = "",
    var theme: String = "Filled",
    var contentDescription: String = "",
    var modifier: ModifierProp = emptyList()
)

class IconView(context: Context, appContext: AppContext) : ExpoView(context, appContext) {
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

fun getIcon(
    name: String,
    theme: String,
): ImageVector? =
    try {
        val iconsPackage = "androidx.compose.material.icons."
        val className = buildString {
            append(iconsPackage)
            append(theme.lowercase())
            append('.')
            append(name)
            append("Kt")
        }

        val typeName = "Icons.$theme"

        val typeClass: Any = when (typeName) {
            "Icons.Filled" -> Icons.Filled
            "Icons.Outlined" -> Icons.Outlined
            "Icons.Rounded" -> Icons.Rounded
            "Icons.TwoTone" -> Icons.TwoTone
            "Icons.Sharp" -> Icons.Sharp
            else -> Icons.Filled
        }

        Class.forName(className).getDeclaredMethod("get$name", typeClass.javaClass).invoke(
            null,
            typeClass
        ) as ImageVector
    } catch (e: Throwable) {
        println("icons ${e.message}")
        null
    }

