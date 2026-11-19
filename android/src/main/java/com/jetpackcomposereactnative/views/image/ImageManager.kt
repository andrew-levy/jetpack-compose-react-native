package com.jetpackcomposereactnative.views.image

import com.facebook.react.bridge.ReadableArray
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.ViewGroupManager
import com.facebook.react.uimanager.annotations.ReactProp
import com.jetpackcomposereactnative.common.asModifierProp

class ImageManager : ViewGroupManager<ImageView>() {
    override fun getName(): String = "ComposeImageView"
    override fun createViewInstance(context: ThemedReactContext): ImageView = ImageView(context)

    @ReactProp(name = "source")
    fun setSource(view: ImageView, prop: String?) {
        if (prop != null) view.updateSource(prop)
    }

    @ReactProp(name = "modifier")
    fun setModifier(view: ImageView, prop: ReadableArray?) {
        view.updateModifier(prop.asModifierProp())
    }
}
