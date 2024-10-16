package expo.modules.jetpackcomposereactnative.views.chip

import expo.modules.jetpackcomposereactnative.common.ModifierProp
import expo.modules.kotlin.modules.Module
import expo.modules.kotlin.modules.ModuleDefinition

class ChipModule : Module() {
    override fun definition() = ModuleDefinition {
        Name("ChipView")

        View(ChipView::class) {
            Events("onChipClick")
            Prop("labelText") { view: ChipView, prop: String ->
                view.updateLabelText(prop)
            }
            Prop("selected") { view: ChipView, prop: Boolean ->
                view.updateSelected(prop)
            }
            Prop("enabled") { view: ChipView, prop: Boolean ->
                view.updateEnabled(prop)
            }
            Prop("leadingIcon") { view: ChipView, prop: String? ->
                view.updateLeadingIcon(prop)
            }
            Prop("trailingIcon") { view: ChipView, prop: String? ->
                view.updateTrailingIcon(prop)
            }
            Prop("variant") { view: ChipView, prop: String ->
                view.updateVariant(prop)
            }
            Prop("modifier") { view: ChipView, prop: ModifierProp ->
                view.updateModifier(prop)
            }
        }
    }
}
