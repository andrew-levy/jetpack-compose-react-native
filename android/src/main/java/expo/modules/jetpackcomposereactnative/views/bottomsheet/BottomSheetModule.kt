package expo.modules.jetpackcomposereactnative.views.bottomsheet

import expo.modules.jetpackcomposereactnative.common.ModifierProp
import expo.modules.kotlin.modules.Module
import expo.modules.kotlin.modules.ModuleDefinition

class BottomSheetModule : Module() {
    override fun definition() = ModuleDefinition {
        Name("BottomSheetView")
        View(BottomSheetView::class) {
            Events("onDismiss")
            Prop("modifier") { view: BottomSheetView, prop: ModifierProp ->
                view.updateModifier(prop)
            }
        }
    }
}
