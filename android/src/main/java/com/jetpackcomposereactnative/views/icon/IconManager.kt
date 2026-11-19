package com.jetpackcomposereactnative.views.icon

import com.facebook.react.bridge.ReadableArray
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.ViewGroupManager
import com.facebook.react.uimanager.annotations.ReactProp
import com.jetpackcomposereactnative.common.asModifierProp

class IconManager : ViewGroupManager<IconView>() {
    override fun getName(): String = "IconView"
    override fun createViewInstance(context: ThemedReactContext): IconView = IconView(context)

    @ReactProp(name = "name")
    fun setName(view: IconView, prop: String?) {
        if (prop != null) view.updateName(prop)
    }

    @ReactProp(name = "theme")
    fun setTheme(view: IconView, prop: String?) {
        if (prop != null) view.updateTheme(prop)
    }

    @ReactProp(name = "modifier")
    fun setModifier(view: IconView, prop: ReadableArray?) {
        view.updateModifier(prop.asModifierProp())
    }
}
