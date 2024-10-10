package expo.modules.jetpackcomposereactnative.views.button

import expo.modules.jetpackcomposereactnative.common.ModifierProp
import expo.modules.kotlin.modules.Module
import expo.modules.kotlin.modules.ModuleDefinition

class ButtonModule : Module() {
  override fun definition() = ModuleDefinition {
    Name("ButtonView")

    View(ButtonView::class) {
      Events("onButtonClick")
      Prop("text") { view: ButtonView, prop: String ->
        view.updateText(prop)
      }
      Prop("modifier") { view: ButtonView, prop: ModifierProp ->
        view.updateModifier(prop)
      }
    }
  }
}
