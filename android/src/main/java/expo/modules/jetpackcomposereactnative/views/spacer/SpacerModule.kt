package expo.modules.jetpackcomposereactnative.views.spacer

import expo.modules.jetpackcomposereactnative.common.ModifierProp
import expo.modules.kotlin.modules.Module
import expo.modules.kotlin.modules.ModuleDefinition

class SpacerModule : Module() {
    override fun definition() = ModuleDefinition {
        Name("SpacerView")

        View(SpacerView::class) {
            Prop("modifier") { view: SpacerView, prop: ModifierProp ->
                view.updateModifier(prop)
            }
        }
    }
}
