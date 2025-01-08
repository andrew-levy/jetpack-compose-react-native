package expo.modules.jetpackcomposereactnative.views.lazycolumn

import expo.modules.jetpackcomposereactnative.common.ModifierProp
import expo.modules.kotlin.modules.Module
import expo.modules.kotlin.modules.ModuleDefinition

class LazyColumnModule : Module() {
    override fun definition() = ModuleDefinition {
        Name("LazyColumnView")

        View(LazyColumnView::class) {
            Prop("modifier") { view: LazyColumnView, prop: ModifierProp ->
                view.updateModifier(prop)
            }
        }
    }
}