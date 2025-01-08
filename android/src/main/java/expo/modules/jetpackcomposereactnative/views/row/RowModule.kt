package expo.modules.jetpackcomposereactnative.views.row

import expo.modules.jetpackcomposereactnative.common.ModifierProp
import expo.modules.kotlin.modules.Module
import expo.modules.kotlin.modules.ModuleDefinition

class RowModule : Module() {
    override fun definition() = ModuleDefinition {
        Name("RowView")

        View(RowView::class) {
            Prop("lazy") { view: RowView, prop: Boolean ->
                view.updateLazy(prop)
            }
            Prop("modifier") { view: RowView, prop: ModifierProp ->
                view.updateModifier(prop)
            }
        }
    }
}