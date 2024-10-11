package expo.modules.jetpackcomposereactnative.views.progress_indicator

import expo.modules.jetpackcomposereactnative.common.ModifierProp
import expo.modules.kotlin.modules.Module
import expo.modules.kotlin.modules.ModuleDefinition

class ProgressIndicatorModule : Module() {
    override fun definition() = ModuleDefinition {
        Name("ProgressIndicatorView")

        View(ProgressIndicatorView::class) {
            Prop("progress") { view: ProgressIndicatorView, prop: Float ->
                view.updateProgress(prop)
            }
            Prop("variant") { view: ProgressIndicatorView, prop: String ->
                view.updateVariant(prop)
            }
            Prop("modifier") { view: ProgressIndicatorView, prop: ModifierProp ->
                view.updateModifier(prop)
            }
        }
    }
}
