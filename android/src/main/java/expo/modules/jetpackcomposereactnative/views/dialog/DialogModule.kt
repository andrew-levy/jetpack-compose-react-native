package expo.modules.jetpackcomposereactnative.views.dialog

import expo.modules.jetpackcomposereactnative.common.ModifierProp
import expo.modules.kotlin.modules.Module
import expo.modules.kotlin.modules.ModuleDefinition

class DialogModule : Module() {
    override fun definition() = ModuleDefinition {
        Name("DialogView")

        View(DialogView::class) {
            Prop("modifier") { view: DialogView, prop: ModifierProp ->
                view.updateModifier(prop)
            }
        }
    }
}
