package com.jetpackcomposereactnative.generated

import android.content.Context
import android.os.SystemClock
import android.view.View
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.facebook.react.bridge.Arguments
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.annotations.ReactProp
import com.jetpackcomposereactnative.common.parseComposeColor
import org.json.JSONObject

internal class ComposeNodeManager : ComposeContainerManager<GeneratedComposeNodeView>() {
  override fun getName(): String = "JpcComposeNode"
  override fun createViewInstance(context: ThemedReactContext): GeneratedComposeNodeView =
    GeneratedComposeNodeView(context)

  @ReactProp(name = "componentName")
  fun setName(view: GeneratedComposeNodeView, name: String?) { view.componentName = name.orEmpty() }

  @ReactProp(name = "slotName")
  fun setSlot(view: GeneratedComposeNodeView, name: String?) { view.slotName = name }

  @ReactProp(name = "values")
  fun setValues(view: GeneratedComposeNodeView, values: String?) { view.updateValues(values ?: "{}") }

  override fun getExportedCustomDirectEventTypeConstants(): Map<String, Any> =
    mapOf("topComposeEvent" to mapOf("registrationName" to "onComposeEvent"))
}

internal class GeneratedComposeNodeView(context: Context) :
  ComposeContainerView(context), ComposeNode {
  override val composeChildId = nextComposeChildId()
  private var values by mutableStateOf(JSONObject())
  // Controlled text fields report the full new string before React sends it back. Keep that
  // edit on screen until the prop catches up, so a keystroke is not replaced by the stale value.
  private var pendingText by mutableStateOf<String?>(null)
  private val createdUptime = SystemClock.uptimeMillis()
  internal var componentName by mutableStateOf("")
  override val name: String get() = values.optString("\$overload", componentName)
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
    val next = JSONObject(json)
    reconcilePendingText(values.optStringValue("value"), next.optStringValue("value"))
    values = next
  }

  private fun reconcilePendingText(previous: String?, incoming: String?) {
    val pending = pendingText ?: return
    if (incoming == null || incoming == previous) return
    // A longer local edit still starts with each value React confirms. Anything else is a new
    // value from the app, including clearing the field, and replaces the pending edit.
    val catchingUp = incoming.isNotEmpty() && pending.startsWith(incoming)
    if (incoming == pending || !catchingUp) pendingText = null
  }

  override fun has(name: String): Boolean = values.has(name)
  override fun string(name: String): String {
    val actual = values.getString(name)
    if (name == "value") {
      val pending = pendingText
      if (pending != null && pending != actual) return pending
    }
    return actual
  }
  override fun boolean(name: String): Boolean = values.getBoolean(name)
  override fun number(name: String): Double = values.getDouble(name)
  override fun color(name: String) = parseComposeColor(string(name))
  override fun jsonObject(name: String): JSONObject = values.getJSONObject(name)
  override fun arguments() = ComposeModifierArguments(values) { name, value -> emit(name, value) }

  override fun modifier(name: String, scope: Any?): Modifier {
    val steps = values.optJSONArray(name) ?: return Modifier
    var modifier: Modifier = Modifier
    for (i in 0 until steps.length()) {
      val step = steps.getJSONObject(i)
      val arguments = ComposeModifierArguments(step.getJSONObject("args"), ::emit)
      val candidates = step.getJSONArray("ids")
      val applied = (0 until candidates.length()).firstNotNullOfOrNull { candidate ->
        applyComposeModifier(candidates.getInt(candidate), modifier, arguments, scope)
      }
      modifier = checkNotNull(applied) {
        "${step.getString("name")} is unavailable in the current Compose layout scope"
      }
    }
    return modifier
  }

  override fun emit(name: String, value: Any?) {
    if (name == "onValueChange" && value is String) pendingText = value
    // The tap that opens a dialog or sheet is delivered to the new window as an outside touch,
    // and Material calls onDismissRequest for it. Ignore that opening tap.
    if (name == "onDismissRequest" && SystemClock.uptimeMillis() - createdUptime < 400) return
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

private fun JSONObject.optStringValue(name: String): String? {
  if (!has(name) || isNull(name)) return null
  return opt(name) as? String
}
