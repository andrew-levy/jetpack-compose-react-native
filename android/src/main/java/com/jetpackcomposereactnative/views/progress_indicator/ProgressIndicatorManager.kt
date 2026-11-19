package com.jetpackcomposereactnative.views.progress_indicator

import com.facebook.react.bridge.ReadableArray
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.ViewGroupManager
import com.facebook.react.uimanager.annotations.ReactProp
import com.jetpackcomposereactnative.common.asModifierProp

class ProgressIndicatorManager : ViewGroupManager<ProgressIndicatorView>() {
    override fun getName(): String = "ProgressIndicatorView"
    override fun createViewInstance(context: ThemedReactContext): ProgressIndicatorView = ProgressIndicatorView(context)

    @ReactProp(name = "progress")
    fun setProgress(view: ProgressIndicatorView, prop: Float) {
        view.updateProgress(prop)
    }

    @ReactProp(name = "variant")
    fun setVariant(view: ProgressIndicatorView, prop: String?) {
        if (prop != null) view.updateVariant(prop)
    }

    @ReactProp(name = "modifier")
    fun setModifier(view: ProgressIndicatorView, prop: ReadableArray?) {
        view.updateModifier(prop.asModifierProp())
    }
}
