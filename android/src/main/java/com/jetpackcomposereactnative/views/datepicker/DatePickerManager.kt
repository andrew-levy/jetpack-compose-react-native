package com.jetpackcomposereactnative.views.datepicker

import com.facebook.react.bridge.ReadableArray
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.ViewGroupManager
import com.facebook.react.uimanager.annotations.ReactProp
import com.jetpackcomposereactnative.common.asModifierProp

class DatePickerManager : ViewGroupManager<DatePickerView>() {
    override fun getName(): String = "DatePickerView"
    override fun createViewInstance(context: ThemedReactContext): DatePickerView = DatePickerView(context)

    override fun getExportedCustomDirectEventTypeConstants(): Map<String, Any> =
        mapOf("topConfirm" to mapOf("registrationName" to "onConfirm"), "topDismiss" to mapOf("registrationName" to "onDismiss"))

    @ReactProp(name = "showModeToggle")
    fun setShowModeToggle(view: DatePickerView, prop: Boolean) {
        view.updateShowModeToggle(prop)
    }

    @ReactProp(name = "tonalElevation")
    fun setTonalElevation(view: DatePickerView, prop: Int) {
        view.updateTonalElevation(prop)
    }

    @ReactProp(name = "confirmText")
    fun setConfirmText(view: DatePickerView, prop: String?) {
        if (prop != null) view.updateConfirmText(prop)
    }

    @ReactProp(name = "dismissText")
    fun setDismissText(view: DatePickerView, prop: String?) {
        if (prop != null) view.updateDismissText(prop)
    }

    @ReactProp(name = "modifier")
    fun setModifier(view: DatePickerView, prop: ReadableArray?) {
        view.updateModifier(prop.asModifierProp())
    }
}
