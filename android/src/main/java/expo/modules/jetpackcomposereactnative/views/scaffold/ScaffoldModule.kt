package expo.modules.jetpackcomposereactnative.views.scaffold

import expo.modules.jetpackcomposereactnative.common.ModifierProp
import expo.modules.kotlin.modules.Module
import expo.modules.kotlin.modules.ModuleDefinition

class ScaffoldModule : Module() {
    override fun definition() = ModuleDefinition {
        Name("ScaffoldView")

        View(ScaffoldView::class) {
            Prop("modifier") { view: ScaffoldView, prop: ModifierProp ->
                view.updateModifier(prop)
            }
        }
    }
}
