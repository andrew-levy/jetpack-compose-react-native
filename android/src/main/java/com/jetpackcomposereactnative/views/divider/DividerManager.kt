package com.jetpackcomposereactnative.views.divider

import com.facebook.react.bridge.ReadableArray
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.ViewGroupManager
import com.facebook.react.uimanager.annotations.ReactProp
import com.jetpackcomposereactnative.common.asModifierProp

class DividerManager : ViewGroupManager<DividerView>() {
    override fun getName(): String = "DividerView"
    override fun createViewInstance(context: ThemedReactContext): DividerView = DividerView(context)

    @ReactProp(name = "direction")
    fun setDirection(view: DividerView, prop: String?) {
        if (prop != null) view.updateDirection(prop)
    }

    @ReactProp(name = "color")
    fun setColor(view: DividerView, prop: String?) {
        if (prop != null) view.updateColor(prop)
    }

    @ReactProp(name = "thickness")
    fun setThickness(view: DividerView, prop: Double) {
        view.updateThickness(prop)
    }

    @ReactProp(name = "modifier")
    fun setModifier(view: DividerView, prop: ReadableArray?) {
        view.updateModifier(prop.asModifierProp())
    }
}
