package com.jetpackcomposereactnative.views.switch_

import com.facebook.react.bridge.ReadableArray
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.ViewGroupManager
import com.facebook.react.uimanager.annotations.ReactProp
import com.jetpackcomposereactnative.common.asModifierProp

class SwitchManager : ViewGroupManager<SwitchView>() {
    override fun getName(): String = "SwitchView"
    override fun createViewInstance(context: ThemedReactContext): SwitchView = SwitchView(context)

    override fun getExportedCustomDirectEventTypeConstants(): Map<String, Any> =
        mapOf("topCheckedChange" to mapOf("registrationName" to "onCheckedChange"))

    @ReactProp(name = "checked")
    fun setChecked(view: SwitchView, prop: Boolean) {
        view.updateChecked(prop)
    }

    @ReactProp(name = "modifier")
    fun setModifier(view: SwitchView, prop: ReadableArray?) {
        view.updateModifier(prop.asModifierProp())
    }
}
