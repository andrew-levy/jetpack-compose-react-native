package com.jetpackcomposereactnative.views.chip

import com.facebook.react.bridge.ReadableArray
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.ViewGroupManager
import com.facebook.react.uimanager.annotations.ReactProp
import com.jetpackcomposereactnative.common.asModifierProp

class ChipManager : ViewGroupManager<ChipView>() {
    override fun getName(): String = "ChipView"
    override fun createViewInstance(context: ThemedReactContext): ChipView = ChipView(context)

    override fun getExportedCustomDirectEventTypeConstants(): Map<String, Any> =
        mapOf("topChipClick" to mapOf("registrationName" to "onChipClick"))

    @ReactProp(name = "labelText")
    fun setLabelText(view: ChipView, prop: String?) {
        if (prop != null) view.updateLabelText(prop)
    }

    @ReactProp(name = "selected")
    fun setSelected(view: ChipView, prop: Boolean) {
        view.updateSelected(prop)
    }

    @ReactProp(name = "enabled")
    fun setEnabled(view: ChipView, prop: Boolean) {
        view.updateEnabled(prop)
    }

    @ReactProp(name = "leadingIcon")
    fun setLeadingIcon(view: ChipView, prop: String?) {
        view.updateLeadingIcon(prop)
    }

    @ReactProp(name = "trailingIcon")
    fun setTrailingIcon(view: ChipView, prop: String?) {
        view.updateTrailingIcon(prop)
    }

    @ReactProp(name = "variant")
    fun setVariant(view: ChipView, prop: String?) {
        if (prop != null) view.updateVariant(prop)
    }

    @ReactProp(name = "modifier")
    fun setModifier(view: ChipView, prop: ReadableArray?) {
        view.updateModifier(prop.asModifierProp())
    }
}
