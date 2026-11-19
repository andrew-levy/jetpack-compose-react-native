package com.jetpackcomposereactnative.views.column

import com.facebook.react.bridge.ReadableArray
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.ViewGroupManager
import com.facebook.react.uimanager.annotations.ReactProp
import com.jetpackcomposereactnative.common.asModifierProp

class ColumnManager : ViewGroupManager<ColumnView>() {
    override fun getName(): String = "ColumnView"
    override fun createViewInstance(context: ThemedReactContext): ColumnView = ColumnView(context)

    @ReactProp(name = "lazy")
    fun setLazy(view: ColumnView, prop: Boolean) {
        view.updateLazy(prop)
    }

    @ReactProp(name = "modifier")
    fun setModifier(view: ColumnView, prop: ReadableArray?) {
        view.updateModifier(prop.asModifierProp())
    }
}
