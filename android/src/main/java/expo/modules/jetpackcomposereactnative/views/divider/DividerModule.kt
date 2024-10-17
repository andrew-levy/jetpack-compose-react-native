package expo.modules.jetpackcomposereactnative.views.divider

import expo.modules.jetpackcomposereactnative.common.ModifierProp
import expo.modules.kotlin.modules.Module
import expo.modules.kotlin.modules.ModuleDefinition

class DividerModule : Module() {
    override fun definition() = ModuleDefinition {
        Name("DividerView")

        View(DividerView::class) {
            Prop("direction") { view: DividerView, prop: String ->
                view.updateDirection(prop)
            }
            Prop("color") { view: DividerView, prop: String ->
                view.updateColor(prop)
            }
            Prop("thickness") { view: DividerView, prop: Double ->
                view.updateThickness(prop)
            }
            Prop("modifier") { view: DividerView, prop: ModifierProp ->
                view.updateModifier(prop)
            }
        }
    }
}
