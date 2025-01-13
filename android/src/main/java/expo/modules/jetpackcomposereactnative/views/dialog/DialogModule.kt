package expo.modules.jetpackcomposereactnative.views.dialog

import expo.modules.jetpackcomposereactnative.common.ModifierProp
import expo.modules.kotlin.modules.Module
import expo.modules.kotlin.modules.ModuleDefinition

class DialogModule : Module() {
    override fun definition() = ModuleDefinition {
        Name("DialogView")

        View(DialogView::class) {
            Events("onConfirm", "onDismiss")
            Prop("title") { view: DialogView, prop: String ->
                view.updateTitle(prop)
            }
            Prop("text") { view: DialogView, prop: String ->
                view.updateText(prop)
            }
            Prop("icon") { view: DialogView, prop: String ->
                view.updateIcon(prop)
            }
            Prop("tonalElevation") { view: DialogView, prop: Int ->
                view.updateTonalElevation(prop)
            }
            Prop("confirmText") { view: DialogView, prop: String ->
                view.updateConfirmText(prop)
            }
            Prop("dismissText") { view: DialogView, prop: String ->
                view.updateDismissText(prop)
            }
            Prop("modifier") { view: DialogView, prop: ModifierProp ->
                view.updateModifier(prop)
            }
        }
    }
}
