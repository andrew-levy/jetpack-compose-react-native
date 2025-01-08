package expo.modules.jetpackcomposereactnative.views.column

import expo.modules.jetpackcomposereactnative.common.ModifierProp
import expo.modules.kotlin.modules.Module
import expo.modules.kotlin.modules.ModuleDefinition

class ColumnModule : Module() {
    override fun definition() = ModuleDefinition {
        Name("ColumnView")

        View(ColumnView::class) {
            Prop("lazy") { view: ColumnView, prop: Boolean ->
                view.updateLazy(prop)
            }
            Prop("modifier") { view: ColumnView, prop: ModifierProp ->
                view.updateModifier(prop)
            }
        }
    }
}