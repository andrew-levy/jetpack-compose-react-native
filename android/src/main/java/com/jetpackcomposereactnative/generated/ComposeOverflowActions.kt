package com.jetpackcomposereactnative.generated

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.AppBarScope
import androidx.compose.material3.ButtonGroupScope
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExperimentalMaterial3ExpressiveApi
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics

@Composable
internal fun RenderComposeOverflowIndicator(children: List<ComposeChild>, open: () -> Unit) {
  if (children.isEmpty()) {
    IconButton(onClick = open, modifier = Modifier.semantics { contentDescription = "More actions" }) {
      Text("⋯")
    }
  } else {
    Box(Modifier.clickable(onClick = open)) { RenderComposeChildren(children) }
  }
}

@OptIn(ExperimentalMaterial3ExpressiveApi::class)
internal fun ComposeModifierArguments.toComposeButtonGroupItems(name: String): ButtonGroupScope.() -> Unit = {
  val items = jsonArray(name)
  for (index in 0 until items.length()) {
    val item = items.getJSONObject(index)
    val label = item.getString("label")
    val enabled = item.optBoolean("enabled", true)
    val weight = item.optDouble("weight", Double.NaN).toFloat()
    val painter = item.optJSONObject("icon")
    val icon: (@Composable () -> Unit)? = painter?.let {
      val content: @Composable () -> Unit = { Icon(it.rememberComposePainter(), contentDescription = null) }
      content
    }
    if (item.has("checked")) {
      toggleableItem(item.getBoolean("checked"), label,
        { emitValueEvent(item, "onCheckedChange", it) }, icon, weight, enabled)
    } else {
      clickableItem({ emitValueEvent(item, "onClick", null) }, label, icon, weight, enabled)
    }
  }
}

@OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterial3ExpressiveApi::class)
internal fun <Scope : AppBarScope> ComposeModifierArguments.toComposeAppBarItems(name: String): Scope.() -> Unit = {
  val items = jsonArray(name)
  for (index in 0 until items.length()) {
    val item = items.getJSONObject(index)
    val label = item.getString("label")
    val enabled = item.optBoolean("enabled", true)
    val painter = item.getJSONObject("icon")
    val icon: @Composable () -> Unit = { Icon(painter.rememberComposePainter(), contentDescription = null) }
    if (item.has("checked")) {
      toggleableItem(item.getBoolean("checked"), { emitValueEvent(item, "onCheckedChange", it) }, icon, label, enabled)
    } else {
      clickableItem({ emitValueEvent(item, "onClick", null) }, icon, label, enabled)
    }
  }
}
