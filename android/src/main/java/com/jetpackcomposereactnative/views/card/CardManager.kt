package com.jetpackcomposereactnative.views.card

import com.facebook.react.bridge.ReadableArray
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.ViewGroupManager
import com.facebook.react.uimanager.annotations.ReactProp
import com.jetpackcomposereactnative.common.asModifierProp

class CardManager : ViewGroupManager<CardView>() {
    override fun getName(): String = "CardView"
    override fun createViewInstance(context: ThemedReactContext): CardView = CardView(context)

    @ReactProp(name = "variant")
    fun setVariant(view: CardView, prop: String?) {
        if (prop != null) view.updateVariant(prop)
    }

    @ReactProp(name = "modifier")
    fun setModifier(view: CardView, prop: ReadableArray?) {
        view.updateModifier(prop.asModifierProp())
    }
}
