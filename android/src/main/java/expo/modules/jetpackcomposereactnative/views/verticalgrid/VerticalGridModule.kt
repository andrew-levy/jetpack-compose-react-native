package expo.modules.jetpackcomposereactnative.views.lazyverticalgrid

import expo.modules.jetpackcomposereactnative.common.ModifierProp
import expo.modules.kotlin.modules.Module
import expo.modules.kotlin.modules.ModuleDefinition

class LazyVerticalGridModule : Module() {
    override fun definition() = ModuleDefinition {
        Name("VerticalGridView")

        View(VerticalGridView::class) {
            Prop("modifier") { view: VerticalGridView, prop: ModifierProp ->
                view.updateModifier(prop)
            }
        }
    }
}