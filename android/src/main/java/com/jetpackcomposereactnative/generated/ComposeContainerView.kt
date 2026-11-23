package com.jetpackcomposereactnative.generated

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.IntSize
import com.facebook.react.bridge.Arguments
import com.facebook.react.bridge.WritableMap
import com.facebook.react.uimanager.ReactStylesDiffMap
import com.facebook.react.uimanager.StateWrapper
import com.facebook.react.uimanager.ViewGroupManager

internal abstract class ComposeContainerView(context: Context) : ViewGroup(context) {
    private var entries by mutableStateOf<List<Pair<View, ComposeChild>>>(emptyList())
    private var stateWrapper: StateWrapper? = null
    private var updatePending = false
    private var lastLayout: LayoutState? = null
    private var measurement: Measurement? = null

    val composeChildren: List<ComposeChild> get() = entries.map { it.second }
    val reactChildCount: Int get() = entries.size

    fun getReactChild(index: Int): View = entries[index].first

    fun addReactChild(child: View, index: Int) {
        val entry = if (child is GeneratedComposeNodeView) {
            addView(child)
            child
        } else {
            ReactChildSlot(context, child, ::requestFabricLayout)
        }
        entries = entries.toMutableList().apply { add(index, child to entry) }
        requestFabricLayout()
    }

    fun removeReactChild(index: Int) {
        val (view, child) = entries[index]
        entries = entries.toMutableList().apply { removeAt(index) }
        when (child) {
            is ReactChildSlot -> child.release()
            is View -> removeView(view)
        }
        requestFabricLayout()
    }

    fun setFabricState(wrapper: StateWrapper) {
        stateWrapper = wrapper
        requestFabricLayout()
    }

    protected fun reportMeasurement(size: IntSize, fittedWidth: Int) {
        val measured = Measurement(size, fittedWidth)
        if (measurement != measured) {
            measurement = measured
            requestFabricLayout()
        }
    }

    private fun requestFabricLayout() {
        if (updatePending || stateWrapper == null || !isAttachedToWindow) return
        updatePending = true
        post {
            updatePending = false
            if (!isAttachedToWindow) return@post
            val wrapper = stateWrapper ?: return@post
            val proposals = entries.mapNotNull { (view, child) ->
                (child as? ReactChildSlot)?.proposal?.let { ProposedSize(view.id, it) }
            }
            val layout = LayoutState(measurement, proposals)
            if (lastLayout == layout) return@post
            val density = resources.displayMetrics.density.toDouble()
            val data = Arguments.createMap()
            measurement?.let {
                data.putDouble("measuredWidth", it.size.width / density)
                data.putDouble("measuredHeight", it.size.height / density)
                data.putDouble("fittedWidth", it.fittedWidth / density)
            }
            data.putArray("childProposals", Arguments.createArray().apply {
                for ((tag, size) in proposals) {
                    pushMap(Arguments.createMap().apply {
                        putInt("tag", tag)
                        putDouble("width", size.width.asProposal(density))
                        putDouble("height", size.height.asProposal(density))
                    })
                }
            })
            lastLayout = layout
            wrapper.updateState(data)
        }
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        requestFabricLayout()
    }

    fun releaseFabricState() {
        stateWrapper = null
        lastLayout = null
    }

    private fun Int.asProposal(density: Double): Double =
        if (this == Constraints.Infinity) -1.0 else this / density

    private data class Measurement(val size: IntSize, val fittedWidth: Int)
    private data class ProposedSize(val tag: Int, val size: IntSize)
    private data class LayoutState(val measurement: Measurement?, val proposals: List<ProposedSize>)
}

internal abstract class ComposeContainerManager<T : ComposeContainerView> : ViewGroupManager<T>() {
    override fun addView(parent: T, child: View, index: Int) = parent.addReactChild(child, index)
    override fun getChildCount(parent: T): Int = parent.reactChildCount
    override fun getChildAt(parent: T, index: Int): View = parent.getReactChild(index)
    override fun removeViewAt(parent: T, index: Int) = parent.removeReactChild(index)

    override fun updateState(view: T, props: ReactStylesDiffMap, stateWrapper: StateWrapper): Any? {
        view.setFabricState(stateWrapper)
        return null
    }

    override fun onDropViewInstance(view: T) {
        view.releaseFabricState()
        super.onDropViewInstance(view)
    }
}
