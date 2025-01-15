package expo.modules.jetpackcomposereactnative.views.snackbar

import expo.modules.jetpackcomposereactnative.common.ModifierProp
import expo.modules.kotlin.modules.Module
import expo.modules.kotlin.modules.ModuleDefinition

class SnackbarModule : Module() {
    override fun definition() = ModuleDefinition {
        Name("SnackbarView")

        View(SnackbarView::class) {
            Events("onAction", "onDismiss")
            Prop("message") { view: SnackbarView, prop: String ->
                view.updateMessage(prop)
            }
            Prop("actionLabel") { view: SnackbarView, prop: String ->
                view.updateActionLabel(prop)
            }
            Prop("modifier") { view: SnackbarView, prop: ModifierProp ->
                view.updateModifier(prop)
            }
        }
    }
}
