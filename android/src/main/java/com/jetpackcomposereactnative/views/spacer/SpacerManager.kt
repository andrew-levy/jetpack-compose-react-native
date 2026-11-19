package com.jetpackcomposereactnative.views.spacer

import com.facebook.react.bridge.ReadableArray
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.ViewGroupManager
import com.facebook.react.uimanager.annotations.ReactProp
import com.jetpackcomposereactnative.common.asModifierProp

class SpacerManager : ViewGroupManager<SpacerView>() {
    override fun getName(): String = "SpacerView"
    override fun createViewInstance(context: ThemedReactContext): SpacerView = SpacerView(context)

    @ReactProp(name = "modifier")
    fun setModifier(view: SpacerView, prop: ReadableArray?) {
        view.updateModifier(prop.asModifierProp())
    }
}
