package expo.modules.jetpackcomposereactnative.views.badged_box

import expo.modules.jetpackcomposereactnative.common.ModifierProp
import expo.modules.kotlin.modules.Module
import expo.modules.kotlin.modules.ModuleDefinition

class BadgedBoxModule : Module() {
    override fun definition() = ModuleDefinition {
        Name("BadgedBoxView")

        View(BadgedBoxView::class) {
            Prop("modifier") { view: BadgedBoxView, prop: ModifierProp ->
                view.updateModifier(prop)
            }
        }
    }
}