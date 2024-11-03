package expo.modules.jetpackcomposereactnative.views.modal_bottom_sheet

import expo.modules.jetpackcomposereactnative.common.ModifierProp
import expo.modules.kotlin.modules.Module
import expo.modules.kotlin.modules.ModuleDefinition

class ModalBottomSheetModule : Module() {
    override fun definition() = ModuleDefinition {
        Name("ModalBottomSheetView")

        View(ModalBottomSheetView::class) {
            Events("onDismiss")
            
            Prop("isVisible") { view: ModalBottomSheetView, prop: Boolean ->
                view.updateIsVisible(prop)
            }
            
            Prop("modifier") { view: ModalBottomSheetView, prop: ModifierProp ->
                view.updateModifier(prop)
            }
        }
    }
} 