package expo.modules.jetpackcomposereactnative.views.switch_

import expo.modules.jetpackcomposereactnative.common.ModifierProp
import expo.modules.kotlin.modules.Module
import expo.modules.kotlin.modules.ModuleDefinition

class SwitchModule : Module() {
  override fun definition() = ModuleDefinition {
    Name("SwitchView")

    View(SwitchView::class) {
      Events("onCheckedChange")
      Prop("checked") { view: SwitchView, prop: Boolean ->
        view.updateChecked(prop)
      }
      Prop("modifier") { view: SwitchView, prop: ModifierProp ->
        view.updateModifier(prop)
      }
    }
  }
}
