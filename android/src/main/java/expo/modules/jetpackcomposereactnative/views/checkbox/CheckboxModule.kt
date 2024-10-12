package expo.modules.jetpackcomposereactnative.views.checkbox

import expo.modules.jetpackcomposereactnative.common.ModifierProp
import expo.modules.kotlin.modules.Module
import expo.modules.kotlin.modules.ModuleDefinition

class CheckboxModule : Module() {
    override fun definition() = ModuleDefinition {
        Name("CheckboxView")

        View(CheckboxView::class) {
            Events("onCheckedChange")
            Prop("checked") { view: CheckboxView, prop: Boolean ->
                view.updateChecked(prop)
            }
            Prop("modifier") { view: CheckboxView, prop: ModifierProp ->
                view.updateModifier(prop)
            }
        }
    }
}
