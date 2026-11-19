package com.jetpackcomposereactnative.views.carousel

import com.facebook.react.bridge.ReadableArray
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.ViewGroupManager
import com.facebook.react.uimanager.annotations.ReactProp
import com.jetpackcomposereactnative.common.asModifierProp
import com.jetpackcomposereactnative.common.asStringList

class CarouselManager : ViewGroupManager<CarouselView>() {
    override fun getName(): String = "CarouselView"
    override fun createViewInstance(context: ThemedReactContext): CarouselView = CarouselView(context)

    @ReactProp(name = "items")
    fun setItems(view: CarouselView, prop: ReadableArray?) {
        view.updateItems(prop.asStringList())
    }

    @ReactProp(name = "modifier")
    fun setModifier(view: CarouselView, prop: ReadableArray?) {
        view.updateModifier(prop.asModifierProp())
    }
}
