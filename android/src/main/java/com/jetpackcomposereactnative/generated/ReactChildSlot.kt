package com.jetpackcomposereactnative.generated

import android.content.Context
import android.view.View
import android.widget.FrameLayout
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.constrainHeight
import androidx.compose.ui.unit.constrainWidth
import androidx.compose.ui.viewinterop.AndroidView

/** Fabric owns the child and its layout. Compose places the slot around that child. */
internal class ReactChildSlot(
    context: Context,
    private val child: View,
    private val onProposalChanged: () -> Unit
) : FrameLayout(context), ComposeChild {
    var size by mutableStateOf(IntSize(child.width, child.height))
        private set
    var proposal: IntSize? = null
        private set
    private val listener = OnLayoutChangeListener { _, left, top, right, bottom, _, _, _, _ ->
        size = IntSize(right - left, bottom - top)
    }

    init {
        addView(child)
        child.addOnLayoutChangeListener(listener)
    }

    fun propose(constraints: Constraints) {
        val next = IntSize(constraints.maxWidth, constraints.maxHeight)
        if (proposal == next) return
        proposal = next
        onProposalChanged()
    }

    fun release() {
        child.removeOnLayoutChangeListener(listener)
        removeView(child)
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        setMeasuredDimension(MeasureSpec.getSize(widthMeasureSpec), MeasureSpec.getSize(heightMeasureSpec))
    }

    override fun onLayout(changed: Boolean, left: Int, top: Int, right: Int, bottom: Int) = Unit
}

@Composable
internal fun RenderReactChild(slot: ReactChildSlot) {
    Layout(content = { AndroidView(factory = { slot }) }) { measurables, constraints ->
        slot.propose(constraints)
        val width = constraints.constrainWidth(slot.size.width)
        val height = constraints.constrainHeight(slot.size.height)
        val nativeView = measurables.single().measure(Constraints.fixed(width, height))
        layout(width, height) { nativeView.placeRelative(0, 0) }
    }
}
