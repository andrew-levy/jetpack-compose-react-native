package expo.modules.jetpackcomposereactnative.views.badge

import expo.modules.jetpackcomposereactnative.common.ModifierProp
import expo.modules.kotlin.modules.Module
import expo.modules.kotlin.modules.ModuleDefinition

class BadgeModule : Module() {
    override fun definition() = ModuleDefinition {
        Name("BadgeView")

        View(BadgeView::class) {
            Prop("content") { view: BadgeView, prop: String ->
                view.updateContent(prop)
            }
            Prop("modifier") { view: BadgeView, prop: ModifierProp ->
                view.updateModifier(prop)
            }
        }
    }
}