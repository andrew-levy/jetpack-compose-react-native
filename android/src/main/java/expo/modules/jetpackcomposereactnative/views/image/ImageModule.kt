package expo.modules.jetpackcomposereactnative.views.image

import expo.modules.jetpackcomposereactnative.common.ModifierProp
import expo.modules.kotlin.modules.Module
import expo.modules.kotlin.modules.ModuleDefinition

class ImageModule : Module() {
    override fun definition() = ModuleDefinition {
        Name("ComposeImageView")

        View(ImageView::class) {
            Prop("source") { view: ImageView, prop: String ->
                view.updateSource(prop)
            }
            Prop("modifier") { view: ImageView, prop: ModifierProp ->
                view.updateModifier(prop)
            }

        }
    }
}
