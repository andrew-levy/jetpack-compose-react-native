package expo.modules.jetpackcomposereactnative.views.grid

import expo.modules.jetpackcomposereactnative.common.ModifierProp
import expo.modules.kotlin.modules.Module
import expo.modules.kotlin.modules.ModuleDefinition

class GridModule : Module() {
    override fun definition() = ModuleDefinition {
        Name("GridView")

        View(GridView::class) {
            Prop("vertical") { view: GridView, prop: Boolean ->
                view.updateVertical(prop)
            }
            Prop("horizontal") { view: GridView, prop: Boolean ->
                view.updateHorizontal(prop)
            }
            Prop("staggered") { view: VerticalGridView, prop: Boolean ->
                view.updateStaggered(prop)
            }
            Prop("gridCellsType") { view: VerticalGridView, prop: String ->
                view.updateGridCellsType(prop)
            }
            Prop("size") { view: VerticalGridView, prop: Int ->
                view.updateSize(prop)
            }
            Prop("verticalItemSpacing") { view: VerticalGridView, prop: Int ->
                view.updateVerticalItemSpacing(prop)
            }
            Prop("spacedBy") { view: VerticalGridView, prop: Int ->
                view.updateSpacedBy(prop)
            }
            Prop("modifier") { view: VerticalGridView, prop: ModifierProp ->
                view.updateModifier(prop)
            }
        }
    }
}