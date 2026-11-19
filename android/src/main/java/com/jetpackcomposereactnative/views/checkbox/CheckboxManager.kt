package com.jetpackcomposereactnative.views.checkbox

import com.facebook.react.bridge.ReadableArray
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.ViewGroupManager
import com.facebook.react.uimanager.annotations.ReactProp
import com.jetpackcomposereactnative.common.asModifierProp

class CheckboxManager : ViewGroupManager<CheckboxView>() {
    override fun getName(): String = "CheckboxView"
    override fun createViewInstance(context: ThemedReactContext): CheckboxView = CheckboxView(context)

    override fun getExportedCustomDirectEventTypeConstants(): Map<String, Any> =
        mapOf("topCheckedChange" to mapOf("registrationName" to "onCheckedChange"))

    @ReactProp(name = "checked")
    fun setChecked(view: CheckboxView, prop: Boolean) {
        view.updateChecked(prop)
    }

    @ReactProp(name = "modifier")
    fun setModifier(view: CheckboxView, prop: ReadableArray?) {
        view.updateModifier(prop.asModifierProp())
    }
}
