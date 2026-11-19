package com.jetpackcomposereactnative.views.badged_box

import com.facebook.react.bridge.ReadableArray
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.ViewGroupManager
import com.facebook.react.uimanager.annotations.ReactProp
import com.jetpackcomposereactnative.common.asModifierProp

class BadgedBoxManager : ViewGroupManager<BadgedBoxView>() {
    override fun getName(): String = "BadgedBoxView"
    override fun createViewInstance(context: ThemedReactContext): BadgedBoxView = BadgedBoxView(context)

    @ReactProp(name = "modifier")
    fun setModifier(view: BadgedBoxView, prop: ReadableArray?) {
        view.updateModifier(prop.asModifierProp())
    }
}
