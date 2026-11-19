package com.jetpackcomposereactnative.views.textfield

import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.ViewGroupManager
import com.facebook.react.uimanager.annotations.ReactProp

class TextFieldManager : ViewGroupManager<TextFieldView>() {
    override fun getName(): String = "TextFieldView"
    override fun createViewInstance(context: ThemedReactContext): TextFieldView = TextFieldView(context)

    override fun getExportedCustomDirectEventTypeConstants(): Map<String, Any> =
        mapOf("topValueChange" to mapOf("registrationName" to "onValueChange"))

    @ReactProp(name = "value")
    fun setValue(view: TextFieldView, value: String?) {
        if (value != null) view.setValue(value)
    }

    @ReactProp(name = "label")
    fun setLabel(view: TextFieldView, label: String?) {
        view.setLabel(label)
    }
}
