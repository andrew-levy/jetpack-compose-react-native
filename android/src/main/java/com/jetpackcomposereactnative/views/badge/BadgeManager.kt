package com.jetpackcomposereactnative.views.badge

import com.facebook.react.bridge.ReadableArray
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.ViewGroupManager
import com.facebook.react.uimanager.annotations.ReactProp
import com.jetpackcomposereactnative.common.asModifierProp

class BadgeManager : ViewGroupManager<BadgeView>() {
    override fun getName(): String = "BadgeView"
    override fun createViewInstance(context: ThemedReactContext): BadgeView = BadgeView(context)

    @ReactProp(name = "content")
    fun setContent(view: BadgeView, prop: String?) {
        if (prop != null) view.updateContent(prop)
    }

    @ReactProp(name = "modifier")
    fun setModifier(view: BadgeView, prop: ReadableArray?) {
        view.updateModifier(prop.asModifierProp())
    }
}
