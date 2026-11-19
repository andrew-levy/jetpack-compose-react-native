package com.jetpackcomposereactnative.views.grid

import com.facebook.react.bridge.ReadableArray
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.ViewGroupManager
import com.facebook.react.uimanager.annotations.ReactProp
import com.jetpackcomposereactnative.common.asModifierProp

class GridManager : ViewGroupManager<GridView>() {
    override fun getName(): String = "GridView"
    override fun createViewInstance(context: ThemedReactContext): GridView = GridView(context)

    @ReactProp(name = "vertical")
    fun setVertical(view: GridView, prop: Boolean) {
        view.updateVertical(prop)
    }

    @ReactProp(name = "horizontal")
    fun setHorizontal(view: GridView, prop: Boolean) {
        view.updateHorizontal(prop)
    }

    @ReactProp(name = "staggered")
    fun setStaggered(view: GridView, prop: Boolean) {
        view.updateStaggered(prop)
    }

    @ReactProp(name = "gridCellsType")
    fun setGridCellsType(view: GridView, prop: String?) {
        if (prop != null) view.updateGridCellsType(prop)
    }

    @ReactProp(name = "size")
    fun setSize(view: GridView, prop: Int) {
        view.updateSize(prop)
    }

    @ReactProp(name = "verticalItemSpacing")
    fun setVerticalItemSpacing(view: GridView, prop: Int) {
        view.updateVerticalItemSpacing(prop)
    }

    @ReactProp(name = "spacedBy")
    fun setSpacedBy(view: GridView, prop: Int) {
        view.updateSpacedBy(prop)
    }

    @ReactProp(name = "modifier")
    fun setModifier(view: GridView, prop: ReadableArray?) {
        view.updateModifier(prop.asModifierProp())
    }
}
