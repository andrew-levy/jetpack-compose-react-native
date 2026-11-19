package com.jetpackcomposereactnative.generated

import android.content.Context
import android.view.View
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import com.jetpackcomposereactnative.common.parseComposeColor
import com.jetpackcomposereactnative.common.toModifier
import com.facebook.react.bridge.Arguments
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.annotations.ReactProp
import org.json.JSONArray
import org.json.JSONObject

internal class ComposeNodeManager : ComposeContainerManager<GeneratedComposeNodeView>() {
  override fun getName(): String = "JpcComposeNode"
  override fun createViewInstance(context: ThemedReactContext): GeneratedComposeNodeView =
    GeneratedComposeNodeView(context)

  @ReactProp(name = "componentName")
  fun setName(view: GeneratedComposeNodeView, name: String?) { view.name = name.orEmpty() }

  @ReactProp(name = "slotName")
  fun setSlot(view: GeneratedComposeNodeView, name: String?) { view.slotName = name }

  @ReactProp(name = "values")
  fun setValues(view: GeneratedComposeNodeView, values: String?) { view.updateValues(values ?: "{}") }

  override fun getExportedCustomDirectEventTypeConstants(): Map<String, Any> =
    mapOf("topComposeEvent" to mapOf("registrationName" to "onComposeEvent"))
}

internal class GeneratedComposeNodeView(context: Context) :
  ComposeContainerView(context), ComposeNode {
  private var values by mutableStateOf(JSONObject())
  override var name by mutableStateOf("")
  internal var slotName by mutableStateOf<String?>(null)
  override val children: List<ComposeChild>
    get() = composeChildren.filter { (it as? GeneratedComposeNodeView)?.slotName == null }

  override fun slot(name: String): List<ComposeChild> =
    composeChildren.filterIsInstance<GeneratedComposeNodeView>()
      .firstOrNull { it.slotName == name }?.children.orEmpty()

  override fun isNull(name: String): Boolean = values.isNull(name)

  init {
    visibility = View.GONE
    importantForAccessibility = View.IMPORTANT_FOR_ACCESSIBILITY_NO_HIDE_DESCENDANTS
  }

  internal fun updateValues(json: String) {
    values = JSONObject(json)
  }

  override fun has(name: String): Boolean = values.has(name)
  override fun string(name: String): String = values.getString(name)
  override fun boolean(name: String): Boolean = values.getBoolean(name)
  override fun number(name: String): Double = values.getDouble(name)
  override fun color(name: String) = parseComposeColor(string(name))

  override fun modifier(name: String) =
    (values.optJSONArray(name)?.toList().orEmpty()).map { entry ->
      requireNotNull(entry as? JSONObject).toMap()
    }.toModifier()

  override fun emit(name: String, value: Any?) {
    val payload = JSONObject().put("name", name).put("value", value).toString()
    dispatchComposeEvent("topComposeEvent", Arguments.createMap().apply {
      putString("payload", payload)
    })
  }

  override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
    setMeasuredDimension(0, 0)
  }

  override fun onLayout(changed: Boolean, left: Int, top: Int, right: Int, bottom: Int) = Unit
}

private fun JSONArray.toList(): List<Any> = List(length()) { index -> get(index) }

private fun JSONObject.toMap(): Map<String, Any> = keys().asSequence().associateWith { key ->
  when (val value = get(key)) {
    is JSONObject -> value.toMap()
    is Number -> value.toDouble()
    else -> value
  }
}
