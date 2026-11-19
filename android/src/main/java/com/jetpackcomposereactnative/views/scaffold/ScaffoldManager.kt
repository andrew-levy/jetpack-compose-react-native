package com.jetpackcomposereactnative.views.scaffold

import com.facebook.react.bridge.ReadableArray
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.ViewGroupManager
import com.facebook.react.uimanager.annotations.ReactProp
import com.jetpackcomposereactnative.common.asModifierProp

class ScaffoldManager : ViewGroupManager<ScaffoldView>() {
    override fun getName(): String = "ScaffoldView"
    override fun createViewInstance(context: ThemedReactContext): ScaffoldView = ScaffoldView(context)

    @ReactProp(name = "modifier")
    fun setModifier(view: ScaffoldView, prop: ReadableArray?) {
        view.updateModifier(prop.asModifierProp())
    }
}
