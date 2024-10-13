package expo.modules.jetpackcomposereactnative.views.card

import expo.modules.jetpackcomposereactnative.common.ModifierProp
import expo.modules.kotlin.modules.Module
import expo.modules.kotlin.modules.ModuleDefinition

class CardModule : Module() {
    override fun definition() = ModuleDefinition {
        Name("CardView")

        View(CardView::class) {
            Prop("variant") { view: CardView, prop: String ->
                view.updateVariant(prop)
            }
            Prop("modifier") { view: CardView, prop: ModifierProp ->
                view.updateModifier(prop)
            }
        }
    }
}