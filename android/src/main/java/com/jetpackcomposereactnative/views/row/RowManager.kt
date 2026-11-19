package com.jetpackcomposereactnative.views.row

import com.facebook.react.bridge.ReadableArray
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.ViewGroupManager
import com.facebook.react.uimanager.annotations.ReactProp
import com.jetpackcomposereactnative.common.asModifierProp

class RowManager : ViewGroupManager<RowView>() {
    override fun getName(): String = "RowView"
    override fun createViewInstance(context: ThemedReactContext): RowView = RowView(context)

    @ReactProp(name = "lazy")
    fun setLazy(view: RowView, prop: Boolean) {
        view.updateLazy(prop)
    }

    @ReactProp(name = "modifier")
    fun setModifier(view: RowView, prop: ReadableArray?) {
        view.updateModifier(prop.asModifierProp())
    }
}
