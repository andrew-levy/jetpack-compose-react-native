package com.jetpackcomposereactnative.views.box

import com.facebook.react.bridge.ReadableArray
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.ViewGroupManager
import com.facebook.react.uimanager.annotations.ReactProp
import com.jetpackcomposereactnative.common.asModifierProp

class BoxManager : ViewGroupManager<BoxView>() {
    override fun getName(): String = "BoxView"
    override fun createViewInstance(context: ThemedReactContext): BoxView = BoxView(context)

    @ReactProp(name = "contentAlignment")
    fun setContentAlignment(view: BoxView, prop: String?) {
        if (prop != null) view.updateContentAlignment(prop)
    }

    @ReactProp(name = "modifier")
    fun setModifier(view: BoxView, prop: ReadableArray?) {
        view.updateModifier(prop.asModifierProp())
    }
}
