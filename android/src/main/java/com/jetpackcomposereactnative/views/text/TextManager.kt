package com.jetpackcomposereactnative.views.text

import com.facebook.react.bridge.ReadableArray
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.ViewGroupManager
import com.facebook.react.uimanager.annotations.ReactProp
import com.jetpackcomposereactnative.common.asModifierProp

class TextManager : ViewGroupManager<TextView>() {
    override fun getName(): String = "TextView"
    override fun createViewInstance(context: ThemedReactContext): TextView = TextView(context)

    @ReactProp(name = "text")
    fun setText(view: TextView, prop: String?) {
        if (prop != null) view.updateText(prop)
    }

    @ReactProp(name = "modifier")
    fun setModifier(view: TextView, prop: ReadableArray?) {
        view.updateModifier(prop.asModifierProp())
    }

    @ReactProp(name = "color")
    fun setColor(view: TextView, prop: String?) {
        view.updateColor(prop)
    }

    @ReactProp(name = "fontSize")
    fun setFontSize(view: TextView, prop: Int?) {
        view.updateFontSize(prop)
    }

    @ReactProp(name = "fontStyle")
    fun setFontStyle(view: TextView, prop: String?) {
        view.updateFontStyle(prop)
    }

    @ReactProp(name = "fontWeight")
    fun setFontWeight(view: TextView, prop: String?) {
        view.updateFontWeight(prop)
    }

    @ReactProp(name = "fontFamily")
    fun setFontFamily(view: TextView, prop: String?) {
        view.updateFontFamily(prop)
    }

    @ReactProp(name = "letterSpacing")
    fun setLetterSpacing(view: TextView, prop: Int?) {
        view.updateLetterSpacing(prop)
    }

    @ReactProp(name = "textDecoration")
    fun setTextDecoration(view: TextView, prop: String?) {
        view.updateTextDecoration(prop)
    }

    @ReactProp(name = "textAlign")
    fun setTextAlign(view: TextView, prop: String?) {
        view.updateTextAlign(prop)
    }

    @ReactProp(name = "lineHeight")
    fun setLineHeight(view: TextView, prop: Int?) {
        view.updateLineHeight(prop)
    }

    @ReactProp(name = "overflow")
    fun setOverflow(view: TextView, prop: String?) {
        view.updateOverflow(prop)
    }

    @ReactProp(name = "softWrap")
    fun setSoftWrap(view: TextView, prop: Boolean?) {
        view.updateSoftWrap(prop)
    }

    @ReactProp(name = "maxLines")
    fun setMaxLines(view: TextView, prop: Int?) {
        view.updateMaxLines(prop)
    }

    @ReactProp(name = "minLines")
    fun setMinLines(view: TextView, prop: Int?) {
        view.updateMinLines(prop)
    }
}
