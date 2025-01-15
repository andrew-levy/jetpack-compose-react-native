package expo.modules.jetpackcomposereactnative.views.carousel

import android.content.Context
import android.view.View
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.carousel.HorizontalUncontainedCarousel
import androidx.compose.material3.carousel.rememberCarouselState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import expo.modules.jetpackcomposereactnative.common.ModifierProp
import expo.modules.kotlin.AppContext
import expo.modules.kotlin.views.ExpoView

data class CarouselProps(
    val children: List<View> = emptyList(),
    val modifier: ModifierProp = emptyList()
)

class CarouselView(context: Context, appContext: AppContext) : ExpoView(context, appContext) {
    private var props = mutableStateOf(CarouselProps())

    override fun addView(child: View?, index: Int) {
        if (child is ComposeView) {
            super.addView(child, index)
        } else {
            if (child != null) {
                props.value = props.value.copy(children = props.value.children + child)
            }
        }
    }

    init {
        ComposeView(context).also {
            it.layoutParams = LayoutParams(WRAP_CONTENT, WRAP_CONTENT) // Allow the content to wrap
            it.setContent {
                CarouselView(props = props.value, context)
            }
            addView(it)
        }
    }

    fun updateModifier(modifier: ModifierProp) {
        props.value = props.value.copy(modifier = modifier)
    }

}



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CarouselView(props: CarouselProps, ctx: Context) {
    HorizontalUncontainedCarousel(
        state = rememberCarouselState { props.children.count() },
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(top = 16.dp, bottom = 16.dp),
        itemWidth = 186.dp,
        itemSpacing = 8.dp,
        contentPadding = PaddingValues(start = 16.dp)
    ) { i ->
        val item = props.children[i]
        AndroidView(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            factory = { item },
        )
    }
}