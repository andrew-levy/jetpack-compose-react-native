package expo.modules.jetpackcomposereactnative.views.carousel

import expo.modules.jetpackcomposereactnative.common.ModifierProp
import expo.modules.kotlin.modules.Module
import expo.modules.kotlin.modules.ModuleDefinition

class CarouselModule : Module() {
    override fun definition() = ModuleDefinition {
        Name("CarouselView")

        View(CarouselView::class) {
            Prop("items") { view: CarouselView, prop: List<String> ->
                view.updateItems(prop)
            }
            Prop("modifier") { view: CarouselView, prop: ModifierProp ->
                view.updateModifier(prop)
            }
        }
    }
}