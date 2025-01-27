package expo.modules.jetpackcomposereactnative.views.image

import android.content.Context
import android.view.ViewGroup.LayoutParams.MATCH_PARENT
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.platform.ComposeView
import coil3.compose.rememberAsyncImagePainter
import expo.modules.jetpackcomposereactnative.common.ModifierProp
import expo.modules.kotlin.AppContext
import expo.modules.kotlin.views.ExpoView
import expo.modules.jetpackcomposereactnative.common.toModifier

data class ImageProps(
    var source: String? = null,
    var modifier: ModifierProp = emptyList(),
)

class ImageView(context: Context, appContext: AppContext) : ExpoView(context, appContext) {
    private var props = mutableStateOf(ImageProps())
    private var composeView: ComposeView? = null

    init {
        ComposeView(context).also {
            it.layoutParams = LayoutParams(MATCH_PARENT, MATCH_PARENT)
            it.setContent {
                ImageComposable(props = props.value)
            }

            addView(it)
            composeView = it
        }
    }

    // http://10.0.2.1:8081/assets/?unstable_path=.%2Fassets/gingerbread.webp?platform=android&hash=3e0202d3694da5a068df36861901ee00
    fun updateSource(source: String) {
        props.value = props.value.copy(source = source)
    }

    fun updateModifier(modifier: ModifierProp) {
        props.value = props.value.copy(modifier = modifier)
    }

}

@Composable
fun ImageComposable(props: ImageProps) {
    props.source?.let {
        val painter = rememberAsyncImagePainter(model = it)
        Image(
            painter = painter,
            contentDescription = null,
            modifier = props.modifier
                .toModifier()
                .fillMaxWidth()
                .fillMaxWidth()
        )
    }
}