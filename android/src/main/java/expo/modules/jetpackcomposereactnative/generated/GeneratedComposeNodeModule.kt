package expo.modules.jetpackcomposereactnative.generated

import android.content.Context
import android.view.View
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import expo.modules.jetpackcomposereactnative.common.parseComposeColor
import expo.modules.jetpackcomposereactnative.common.toModifier
import expo.modules.kotlin.AppContext
import expo.modules.kotlin.modules.Module
import expo.modules.kotlin.modules.ModuleDefinition
import com.facebook.react.bridge.Arguments
import org.json.JSONArray
import org.json.JSONObject

class GeneratedComposeNodeModule : Module() {
  override fun definition() = ModuleDefinition {
    Name("GeneratedComposeNode")

    View(GeneratedComposeNodeView::class) {
      Events("onComposeEvent")
      Prop("componentName") { view: GeneratedComposeNodeView, name: String -> view.name = name }
      Prop("slotName") { view: GeneratedComposeNodeView, name: String? -> view.slotName = name }
      Prop("values") { view: GeneratedComposeNodeView, values: String -> view.updateValues(values) }
      composeChildren()
    }
  }
}

internal class GeneratedComposeNodeView(context: Context, appContext: AppContext) :
  ComposeContainerView(context, appContext), ComposeNode {
  private var values by mutableStateOf(JSONObject())
  override var name by mutableStateOf("")
  internal var slotName by mutableStateOf<String?>(null)
  override val children: List<ComposeNode> get() = composeChildren.filter { it.slotName == null }
  override fun slot(name: String): List<ComposeNode> =
    composeChildren.firstOrNull { it.slotName == name }?.children.orEmpty()

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
    dispatchComposeEvent("topComposeEvent", Arguments.createMap().apply {
      putString("name", name)
      when (value) {
        is String -> putString("value", value)
        is Boolean -> putBoolean("value", value)
        is Number -> putDouble("value", value.toDouble())
      }
    })
  }
}

private fun JSONArray.toList(): List<Any> = List(length()) { index -> get(index) }

private fun JSONObject.toMap(): Map<String, Any> = keys().asSequence().associateWith { key ->
  when (val value = get(key)) {
    is JSONObject -> value.toMap()
    is Number -> value.toDouble()
    else -> value
  }
}
