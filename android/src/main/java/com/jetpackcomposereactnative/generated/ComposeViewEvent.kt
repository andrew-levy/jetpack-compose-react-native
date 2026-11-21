package com.jetpackcomposereactnative.generated

import android.view.View
import com.facebook.react.bridge.ReactContext
import com.facebook.react.bridge.WritableMap
import com.facebook.react.uimanager.UIManagerHelper
import com.facebook.react.uimanager.events.Event

internal fun View.dispatchComposeEvent(name: String, payload: WritableMap) {
  val reactContext = context as? ReactContext ?: return
  if (id == View.NO_ID) return
  UIManagerHelper.getEventDispatcherForReactTag(reactContext, id)?.dispatchEvent(
    ComposeViewEvent(UIManagerHelper.getSurfaceId(this), id, name, payload)
  )
}

private class ComposeViewEvent(
  surfaceId: Int,
  viewTag: Int,
  private val name: String,
  private val payload: WritableMap
) : Event<ComposeViewEvent>(surfaceId, viewTag) {
  override fun getEventName(): String = name
  override fun getEventData(): WritableMap = payload
  override fun canCoalesce(): Boolean = false
}
