package com.jetpackcomposereactnative.views.snackbar

import com.facebook.react.bridge.ReadableArray
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.ViewGroupManager
import com.facebook.react.uimanager.annotations.ReactProp
import com.jetpackcomposereactnative.common.asModifierProp

class SnackbarManager : ViewGroupManager<SnackbarView>() {
    override fun getName(): String = "SnackbarView"
    override fun createViewInstance(context: ThemedReactContext): SnackbarView = SnackbarView(context)

    override fun getExportedCustomDirectEventTypeConstants(): Map<String, Any> =
        mapOf("topActionPerformed" to mapOf("registrationName" to "onActionPerformed"), "topDismissed" to mapOf("registrationName" to "onDismissed"))

    @ReactProp(name = "message")
    fun setMessage(view: SnackbarView, prop: String?) {
        if (prop != null) view.updateMessage(prop)
    }

    @ReactProp(name = "show")
    fun setShow(view: SnackbarView, prop: Boolean) {
        view.updateShow(prop)
    }

    @ReactProp(name = "actionLabel")
    fun setActionLabel(view: SnackbarView, prop: String?) {
        if (prop != null) view.updateActionLabel(prop)
    }

    @ReactProp(name = "modifier")
    fun setModifier(view: SnackbarView, prop: ReadableArray?) {
        view.updateModifier(prop.asModifierProp())
    }
}
