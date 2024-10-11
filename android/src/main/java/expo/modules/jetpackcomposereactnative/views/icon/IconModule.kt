package expo.modules.jetpackcomposereactnative.views.icon

import expo.modules.jetpackcomposereactnative.common.ModifierProp
import expo.modules.kotlin.modules.Module
import expo.modules.kotlin.modules.ModuleDefinition

class IconModule : Module() {
    override fun definition() = ModuleDefinition {
        Name("IconView")

        View(IconView::class) {
            Prop("name") { view: IconView, prop: String ->
                view.updateName(prop)
            }
            Prop("theme") { view: IconView, prop: String ->
                view.updateTheme(prop)
            }
            Prop("modifier") { view: IconView, prop: ModifierProp ->
                view.updateModifier(prop)
            }
        }
    }
}
