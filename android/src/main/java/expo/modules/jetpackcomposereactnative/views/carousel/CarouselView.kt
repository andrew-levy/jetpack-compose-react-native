package expo.modules.jetpackcomposereactnative.views.carousel

import android.content.Context
import android.graphics.drawable.Drawable
import android.view.ViewGroup.LayoutParams.MATCH_PARENT
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.carousel.HorizontalUncontainedCarousel
import androidx.compose.material3.carousel.rememberCarouselState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.unit.dp
import coil3.compose.rememberAsyncImagePainter
import expo.modules.jetpackcomposereactnative.common.ModifierProp
import expo.modules.kotlin.AppContext
import expo.modules.kotlin.views.ExpoView

data class CarouselProps(
    val items: List<String> = emptyList(),
    val drawables: List<Drawable> = emptyList(),
    val modifier: ModifierProp = emptyList()
)

class CarouselView(context: Context, appContext: AppContext) : ExpoView(context, appContext) {
    private var props = mutableStateOf(CarouselProps())

    init {
        ComposeView(context).also {
            it.layoutParams = LayoutParams(WRAP_CONTENT, WRAP_CONTENT) // Allow the content to wrap
            it.setContent {
                CarouselView(props = props.value)
            }
            addView(it)
        }
    }

    fun updateItems(items: List<String>) {
        props.value = props.value.copy(items = items)
    }

    fun updateModifier(modifier: ModifierProp) {
        props.value = props.value.copy(modifier = modifier)
    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CarouselView(props: CarouselProps) {
    if (props.items.isNotEmpty()) {
        HorizontalUncontainedCarousel(
            state = rememberCarouselState { props.items.count() },
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(top = 16.dp, bottom = 16.dp),
            itemWidth = 186.dp,
            itemSpacing = 8.dp,
            contentPadding = PaddingValues(horizontal = 16.dp)
        ) { i ->
            val painter = rememberAsyncImagePainter(model = props.items[i] )
            Image(painter = painter, contentDescription = null,
                modifier = Modifier
                .height(205.dp)
                .maskClip(MaterialTheme.shapes.extraLarge),
                contentScale = ContentScale.Crop
            )
        }
    }
}


