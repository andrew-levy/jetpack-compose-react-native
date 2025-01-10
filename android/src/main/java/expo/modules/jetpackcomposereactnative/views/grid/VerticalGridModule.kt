package expo.modules.jetpackcomposereactnative.views.verticalgrid

import expo.modules.jetpackcomposereactnative.common.ModifierProp
import expo.modules.kotlin.modules.Module
import expo.modules.kotlin.modules.ModuleDefinition

class VerticalGridModule : Module() {
    override fun definition() = ModuleDefinition {
        Name("VerticalGridView")

        View(VerticalGridView::class) {
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