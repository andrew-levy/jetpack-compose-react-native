package expo.modules.jetpackcomposereactnative.views.snackbar

import expo.modules.jetpackcomposereactnative.common.ModifierProp
import expo.modules.kotlin.modules.Module
import expo.modules.kotlin.modules.ModuleDefinition

class SnackbarModule : Module() {
    override fun definition() = ModuleDefinition {
        Name("SnackbarView")

        View(SnackbarView::class) {
            Prop("modifier") { view: SnackbarView, prop: ModifierProp ->
                view.updateModifier(prop)
            }
        }
    }
}
