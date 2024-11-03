package expo.modules.jetpackcomposereactnative.views.textfield

import expo.modules.kotlin.modules.Module
import expo.modules.kotlin.modules.ModuleDefinition

class TextFieldModule : Module() {
    override fun definition() = ModuleDefinition {
        Name("TextFieldView")

        View(TextFieldView::class) {
            Events("onValueChange")
            Prop("value") { view: TextFieldView, value: String ->
                view.setValue(value)
            }
            Prop("label") { view: TextFieldView, label: String? ->
                view.setLabel(label)
            }
        }
    }
} 