package expo.modules.jetpackcomposereactnative.views.grid

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.viewinterop.AndroidView
import expo.modules.jetpackcomposereactnative.common.ModifierProp
import expo.modules.jetpackcomposereactnative.common.toModifier
import expo.modules.kotlin.AppContext
import expo.modules.kotlin.views.ExpoView
import androidx.compose.material3.Text

data class GridProps (
    var children: List<View> = emptyList(),
    var modifier: ModifierProp = emptyList(),
    var vertical: Boolean? = null,
    var horizontal: Boolean? = null,
    var staggered: Boolean = false,
    var size: Int? = null,
    var gridCellsType: String? = null,
    var verticalItemSpacing: Int? = null,
    var spacedBy: Int? = null,
    var lastItem: View? = null,
)

class GridView(context: Context, appContext: AppContext) : ExpoView(context, appContext) {
    private var props = mutableStateOf(GridProps())

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
                if(props.value.vertical == true) {
                    if(props.value.staggered) {
                        VerticalStaggeredGridComposable(props = props.value)
                    } else {
                        VerticalGridComposable(props = props.value)
                    }
                } else {
                    if(props.value.staggered) {
                        HorizontalStaggeredGridComposable(props = props.value)
                    } else {
                        HorizontalGridComposable(props = props.value)
                    }
                }
            }
            addView(it)
        }
    }

    fun updateVertical(vertical: Boolean) {
        props.value = props.value.copy(vertical = vertical)
    }

    fun updateHorizontal(horizontal: Boolean) {
        props.value = props.value.copy(horizontal = horizontal)
    }

    fun updateStaggered(staggered: Boolean) {
        props.value = props.value.copy(staggered = staggered)
    }

    fun updateGridCellsType(gridCellsType: String) {
        props.value = props.value.copy(gridCellsType = gridCellsType)
    }

    fun updateSize(size: Int) {
        props.value = props.value.copy(size = size)
    }

    fun updateVerticalItemSpacing(verticalItemSpacing: Int) {
        props.value = props.value.copy(verticalItemSpacing = verticalItemSpacing)
    }

    fun updateSpacedBy(spacedBy: Int) {
        props.value = props.value.copy(spacedBy = spacedBy)
    }

    fun updateModifier(modifier: ModifierProp) {
        props.value = props.value.copy(modifier = modifier)
    }
}

@Composable
fun VerticalGridComposable(props: GridProps) {
    val totalItems = props.children.size
    val gridCellsType = when(props.gridCellsType) {
        "fixed" -> GridCells.Fixed(props.size ?: 2)
        "fixedSize" -> GridCells.FixedSize(props.size?.dp ?: 30.dp)
        "adaptive" -> GridCells.Adaptive(props.size?.dp ?: 30.dp)
        else -> GridCells.Adaptive(props.size?.dp ?: 30.dp)
    }

    LazyVerticalGrid(
        columns = gridCellsType,
        modifier = props.modifier.toModifier()
    ) {
        items(totalItems) { index -> 
            AndroidView(
                modifier = Modifier.fillMaxWidth(),
                factory = { context -> 
                    props.children[index].apply {
                        layoutParams = ViewGroup.LayoutParams(WRAP_CONTENT, WRAP_CONTENT)
                    }                    
                },
            ) 
        }
        // To be added soon...
        item {}
    }
}

@Composable
fun VerticalStaggeredGridComposable(props: GridProps) {
    val totalItems = props.children.size
    val gridCellsType = when(props.gridCellsType) {
        "fixed" -> StaggeredGridCells.Fixed(props.size ?: 2)
        "fixedSize" -> StaggeredGridCells.FixedSize(props.size?.dp ?: 30.dp)
        "adaptive" -> StaggeredGridCells.Adaptive(props.size?.dp ?: 30.dp)
        else -> StaggeredGridCells.Adaptive(props.size?.dp ?: 30.dp)
    }

    LazyVerticalStaggeredGrid(
        columns = gridCellsType,
        verticalItemSpacing = props.verticalItemSpacing?.dp ?: 4.dp,
        horizontalArrangement = Arrangement.spacedBy(props.spacedBy?.dp ?: 4.dp),
        modifier = props.modifier.toModifier()
    ) {
        items(totalItems) { index -> 
            AndroidView(
                modifier = Modifier.fillMaxWidth(),
                factory = { context -> 
                    props.children[index].apply {
                        layoutParams = ViewGroup.LayoutParams(WRAP_CONTENT, WRAP_CONTENT)
                    }                    
                },
            ) 
        }
        // To be added soon...
        item {}
    }
}

@Composable
fun HorizontalGridComposable(props: GridProps) {
    val totalItems = props.children.size
    val gridCellsType = when(props.gridCellsType) {
        "fixed" -> GridCells.Fixed(props.size ?: 2)
        "fixedSize" -> GridCells.FixedSize(props.size?.dp ?: 30.dp)
        "adaptive" -> GridCells.Adaptive(props.size?.dp ?: 30.dp)
        else -> GridCells.Adaptive(props.size?.dp ?: 30.dp)
    }

    LazyHorizontalGrid(
        rows = gridCellsType,
        modifier = props.modifier.toModifier()
    ) {
        items(totalItems) { index -> 
            AndroidView(
                modifier = Modifier.fillMaxWidth(),
                factory = { context -> 
                    props.children[index].apply {
                        layoutParams = ViewGroup.LayoutParams(WRAP_CONTENT, WRAP_CONTENT)
                    }                    
                },
            ) 
        }
        // To be added soon...
        item {}
    }
}

@Composable
fun HorizontalStaggeredGridComposable(props: GridProps) {
    val totalItems = props.children.size
    val gridCellsType = when(props.gridCellsType) {
        "fixed" -> StaggeredGridCells.Fixed(props.size ?: 2)
        "fixedSize" -> StaggeredGridCells.FixedSize(props.size?.dp ?: 30.dp)
        "adaptive" -> StaggeredGridCells.Adaptive(props.size?.dp ?: 30.dp)
        else -> StaggeredGridCells.Adaptive(props.size?.dp ?: 30.dp)
    }

    LazyHorizontalStaggeredGrid(
        rows = gridCellsType,
        horizontalItemSpacing = props.verticalItemSpacing?.dp ?: 4.dp,
        verticalArrangement = Arrangement.spacedBy(props.spacedBy?.dp ?: 4.dp),
        modifier = props.modifier.toModifier()
    ) {
        items(totalItems) { index -> 
            AndroidView(
                modifier = Modifier.fillMaxWidth(),
                factory = { context -> 
                    props.children[index].apply {
                        layoutParams = ViewGroup.LayoutParams(WRAP_CONTENT, WRAP_CONTENT)
                    }                    
                },
            ) 
        }
        // To be added soon...
        item {}
    }
}