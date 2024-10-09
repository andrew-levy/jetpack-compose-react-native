package expo.modules.jetpackcomposereactnative.views.slider

import expo.modules.jetpackcomposereactnative.common.ModifierProp
import expo.modules.jetpackcomposereactnative.views.slider.SliderView
import expo.modules.kotlin.modules.Module
import expo.modules.kotlin.modules.ModuleDefinition

class SliderModule : Module() {
  override fun definition() = ModuleDefinition {
    Name("SliderView")

    View(SliderView::class) {
      Events("onValueChange")
      Prop("value") { view: SliderView, prop: Float ->
        view.updateValue(prop)
      }
      Prop("modifier") { view: SliderView, prop: ModifierProp ->
        view.updateModifier(prop)
      }
    }
  }
}
