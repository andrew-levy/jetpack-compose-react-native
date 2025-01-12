package expo.modules.jetpackcomposereactnative.views.text

import expo.modules.jetpackcomposereactnative.common.ModifierProp
import expo.modules.kotlin.modules.Module
import expo.modules.kotlin.modules.ModuleDefinition

class TextModule : Module() {
    override fun definition() = ModuleDefinition {
        Name("TextView")

        View(TextView::class) {
            Prop("text") { view: TextView, prop: String ->
                view.updateText(prop)
            }
            Prop("modifier") { view: TextView, prop: ModifierProp ->
                view.updateModifier(prop)
            }
            Prop("color") { view: TextView, prop: String? ->
                view.updateColor(prop)
            }
            Prop("fontSize") { view: TextView, prop: Int? ->
                view.updateFontSize(prop)
            }
            Prop("fontStyle") { view: TextView, prop: String? ->
                view.updateFontStyle(prop)
            }
            Prop("fontWeight") { view: TextView, prop: String? ->
                view.updateFontWeight(prop)
            }
            Prop("fontFamily") { view: TextView, prop: String? ->
                view.updateFontFamily(prop)
            }
            Prop("letterSpacing") { view: TextView, prop: Int? ->
                view.updateLetterSpacing(prop)
            }
            Prop("textDecoration") { view: TextView, prop: String? ->
                view.updateTextDecoration(prop)
            }
            Prop("textAlign") { view: TextView, prop: String? ->
                view.updateTextAlign(prop)
            }
            Prop("lineHeight") { view: TextView, prop: Int? ->
                view.updateLineHeight(prop)
            }
            Prop("overflow") { view: TextView, prop: String? ->
                view.updateOverflow(prop)
            }
            Prop("softWrap") { view: TextView, prop: Boolean? ->
                view.updateSoftWrap(prop)
            }
            Prop("maxLines") { view: TextView, prop: Int? ->
                view.updateMaxLines(prop)
            }
            Prop("minLines") { view: TextView, prop: Int? ->
                view.updateMinLines(prop)
            }
        }
    }
}
