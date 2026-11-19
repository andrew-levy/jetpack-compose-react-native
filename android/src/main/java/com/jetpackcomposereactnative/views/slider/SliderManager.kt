package com.jetpackcomposereactnative.views.slider

import com.facebook.react.bridge.ReadableArray
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.ViewGroupManager
import com.facebook.react.uimanager.annotations.ReactProp
import com.jetpackcomposereactnative.common.asModifierProp

class SliderManager : ViewGroupManager<SliderView>() {
    override fun getName(): String = "SliderView"
    override fun createViewInstance(context: ThemedReactContext): SliderView = SliderView(context)

    override fun getExportedCustomDirectEventTypeConstants(): Map<String, Any> =
        mapOf("topValueChange" to mapOf("registrationName" to "onValueChange"))

    @ReactProp(name = "value")
    fun setValue(view: SliderView, prop: Float) {
        view.updateValue(prop)
    }

    @ReactProp(name = "modifier")
    fun setModifier(view: SliderView, prop: ReadableArray?) {
        view.updateModifier(prop.asModifierProp())
    }
}
