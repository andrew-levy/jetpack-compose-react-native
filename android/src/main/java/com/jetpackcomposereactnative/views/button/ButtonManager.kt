package com.jetpackcomposereactnative.views.button

import com.facebook.react.bridge.ReadableArray
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.ViewGroupManager
import com.facebook.react.uimanager.annotations.ReactProp
import com.jetpackcomposereactnative.common.asModifierProp

class ButtonManager : ViewGroupManager<ButtonView>() {
    override fun getName(): String = "ButtonView"
    override fun createViewInstance(context: ThemedReactContext): ButtonView = ButtonView(context)

    override fun getExportedCustomDirectEventTypeConstants(): Map<String, Any> =
        mapOf("topButtonClick" to mapOf("registrationName" to "onButtonClick"))

    @ReactProp(name = "text")
    fun setText(view: ButtonView, prop: String?) {
        if (prop != null) view.updateText(prop)
    }

    @ReactProp(name = "variant")
    fun setVariant(view: ButtonView, prop: String?) {
        if (prop != null) view.updateVariant(prop)
    }

    @ReactProp(name = "modifier")
    fun setModifier(view: ButtonView, prop: ReadableArray?) {
        view.updateModifier(prop.asModifierProp())
    }
}
