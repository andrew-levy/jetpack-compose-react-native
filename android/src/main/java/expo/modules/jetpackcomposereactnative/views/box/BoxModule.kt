package expo.modules.jetpackcomposereactnative.views.divider

import expo.modules.jetpackcomposereactnative.common.ModifierProp
import expo.modules.kotlin.modules.Module
import expo.modules.kotlin.modules.ModuleDefinition

class BoxModule : Module() {
    override fun definition() = ModuleDefinition {
        Name("BoxView")

        View(BoxView::class) {
            Prop("contentAlignment") { view: BoxView, prop: String ->
                view.updateContentAlignment(prop)
            }
            Prop("modifier") { view: DividerView, prop: ModifierProp ->
                view.updateModifier(prop)
            }
        }
    }
}
