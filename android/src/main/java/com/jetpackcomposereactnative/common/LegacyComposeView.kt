package com.jetpackcomposereactnative.common

import android.content.Context
import android.widget.LinearLayout
import com.facebook.react.bridge.Arguments
import com.facebook.react.bridge.ReadableArray
import com.jetpackcomposereactnative.generated.dispatchComposeEvent

abstract class LegacyComposeView(context: Context) : LinearLayout(context) {
    protected fun legacyEvent(name: String): (Map<String, Any>) -> Unit =
        { dispatchComposeEvent(name, Arguments.makeNativeMap(it)) }
}

@Suppress("UNCHECKED_CAST")
internal fun ReadableArray?.asModifierProp(): ModifierProp =
    this?.toArrayList()?.mapNotNull { it as? Map<String, Any> }.orEmpty()

internal fun ReadableArray?.asStringList(): List<String> =
    this?.toArrayList()?.filterIsInstance<String>().orEmpty()
