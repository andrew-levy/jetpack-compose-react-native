package com.jetpackcomposereactnative.generated

import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import org.json.JSONObject
import java.util.concurrent.atomic.AtomicInteger

private val composeChildIds = AtomicInteger()

internal fun nextComposeChildId(): Int = composeChildIds.incrementAndGet()

internal interface ComposeChild {
  val composeChildId: Int
}

internal interface ComposeNode : ComposeChild {
  val name: String
  val children: List<ComposeChild>
  fun slot(name: String): List<ComposeChild>
  fun isNull(name: String): Boolean
  fun has(name: String): Boolean
  fun string(name: String): String
  fun boolean(name: String): Boolean
  fun number(name: String): Double
  fun modifier(name: String, scope: Any?): Modifier
  fun color(name: String): Color
  fun jsonObject(name: String): JSONObject
  fun arguments(): ComposeModifierArguments
  fun emit(name: String, value: Any? = null, revision: Int? = null)
}
