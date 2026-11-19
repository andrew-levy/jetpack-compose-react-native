package com.jetpackcomposereactnative.views.dialog

import com.facebook.react.bridge.ReadableArray
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.ViewGroupManager
import com.facebook.react.uimanager.annotations.ReactProp
import com.jetpackcomposereactnative.common.asModifierProp

class DialogManager : ViewGroupManager<DialogView>() {
    override fun getName(): String = "DialogView"
    override fun createViewInstance(context: ThemedReactContext): DialogView = DialogView(context)

    override fun getExportedCustomDirectEventTypeConstants(): Map<String, Any> =
        mapOf("topConfirm" to mapOf("registrationName" to "onConfirm"), "topDismiss" to mapOf("registrationName" to "onDismiss"))

    @ReactProp(name = "title")
    fun setTitle(view: DialogView, prop: String?) {
        if (prop != null) view.updateTitle(prop)
    }

    @ReactProp(name = "text")
    fun setText(view: DialogView, prop: String?) {
        if (prop != null) view.updateText(prop)
    }

    @ReactProp(name = "icon")
    fun setIcon(view: DialogView, prop: String?) {
        if (prop != null) view.updateIcon(prop)
    }

    @ReactProp(name = "tonalElevation")
    fun setTonalElevation(view: DialogView, prop: Int) {
        view.updateTonalElevation(prop)
    }

    @ReactProp(name = "confirmText")
    fun setConfirmText(view: DialogView, prop: String?) {
        if (prop != null) view.updateConfirmText(prop)
    }

    @ReactProp(name = "dismissText")
    fun setDismissText(view: DialogView, prop: String?) {
        if (prop != null) view.updateDismissText(prop)
    }

    @ReactProp(name = "modifier")
    fun setModifier(view: DialogView, prop: ReadableArray?) {
        view.updateModifier(prop.asModifierProp())
    }
}
