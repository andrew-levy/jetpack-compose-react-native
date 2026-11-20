// Generated from Compose declarations by generate.mjs.
package com.jetpackcomposereactnative.generated

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
internal fun RenderComposable(node: ComposeNode, scope: Any?) {
  when (node.name) {
    "AlertDialog" -> renderAlertDialog(node, scope)
    "AssistChip" -> renderAssistChip(node, scope)
    "Badge" -> renderBadge(node, scope)
    "BadgedBox" -> renderBadgedBox(node, scope)
    "Box" -> renderBox(node, scope)
    "Button" -> renderButton(node, scope)
    "Card" -> renderCard(node, scope)
    "Checkbox" -> renderCheckbox(node, scope)
    "CircularProgressIndicator" -> renderCircularProgressIndicator(node, scope)
    "Column" -> renderColumn(node, scope)
    "DismissibleDrawerSheet" -> renderDismissibleDrawerSheet(node, scope)
    "DismissibleNavigationDrawer" -> renderDismissibleNavigationDrawer(node, scope)
    "DropdownMenu" -> renderDropdownMenu(node, scope)
    "DropdownMenuItem" -> renderDropdownMenuItem(node, scope)
    "ElevatedAssistChip" -> renderElevatedAssistChip(node, scope)
    "ElevatedButton" -> renderElevatedButton(node, scope)
    "ElevatedCard" -> renderElevatedCard(node, scope)
    "ElevatedFilterChip" -> renderElevatedFilterChip(node, scope)
    "ElevatedSuggestionChip" -> renderElevatedSuggestionChip(node, scope)
    "ExtendedFloatingActionButton" -> renderExtendedFloatingActionButton(node, scope)
    "FilledIconButton" -> renderFilledIconButton(node, scope)
    "FilledIconToggleButton" -> renderFilledIconToggleButton(node, scope)
    "FilledTonalButton" -> renderFilledTonalButton(node, scope)
    "FilledTonalIconButton" -> renderFilledTonalIconButton(node, scope)
    "FilledTonalIconToggleButton" -> renderFilledTonalIconToggleButton(node, scope)
    "FilterChip" -> renderFilterChip(node, scope)
    "FloatingActionButton" -> renderFloatingActionButton(node, scope)
    "HorizontalDivider" -> renderHorizontalDivider(node, scope)
    "IconButton" -> renderIconButton(node, scope)
    "IconToggleButton" -> renderIconToggleButton(node, scope)
    "InputChip" -> renderInputChip(node, scope)
    "LargeFloatingActionButton" -> renderLargeFloatingActionButton(node, scope)
    "LeadingIconTab" -> renderLeadingIconTab(node, scope)
    "LinearProgressIndicator" -> renderLinearProgressIndicator(node, scope)
    "ListItem" -> renderListItem(node, scope)
    "MaterialTheme" -> renderMaterialTheme(node)
    "ModalDrawerSheet" -> renderModalDrawerSheet(node, scope)
    "ModalNavigationDrawer" -> renderModalNavigationDrawer(node, scope)
    "NavigationBar" -> renderNavigationBar(node, scope)
    "NavigationDrawerItem" -> renderNavigationDrawerItem(node, scope)
    "NavigationRail" -> renderNavigationRail(node, scope)
    "NavigationRailItem" -> renderNavigationRailItem(node, scope)
    "OutlinedButton" -> renderOutlinedButton(node, scope)
    "OutlinedCard" -> renderOutlinedCard(node, scope)
    "OutlinedIconButton" -> renderOutlinedIconButton(node, scope)
    "OutlinedIconToggleButton" -> renderOutlinedIconToggleButton(node, scope)
    "OutlinedTextField" -> renderOutlinedTextField(node, scope)
    "PermanentDrawerSheet" -> renderPermanentDrawerSheet(node, scope)
    "PermanentNavigationDrawer" -> renderPermanentNavigationDrawer(node, scope)
    "RadioButton" -> renderRadioButton(node, scope)
    "Row" -> renderRow(node, scope)
    "ScrollableTabRow" -> renderScrollableTabRow(node, scope)
    "SmallFloatingActionButton" -> renderSmallFloatingActionButton(node, scope)
    "Snackbar" -> renderSnackbar(node, scope)
    "Spacer" -> renderSpacer(node, scope)
    "SuggestionChip" -> renderSuggestionChip(node, scope)
    "Surface" -> renderSurface(node, scope)
    "Switch" -> renderSwitch(node, scope)
    "Tab" -> renderTab(node, scope)
    "TabRow" -> renderTabRow(node, scope)
    "Text" -> renderText(node, scope)
    "TextButton" -> renderTextButton(node, scope)
    "TextField" -> renderTextField(node, scope)
    "VerticalDivider" -> renderVerticalDivider(node, scope)
    else -> error("Unknown generated Compose component: " + node.name)
  }
}

@Composable
private fun renderAlertDialog(node: ComposeNode, scope: Any?) {
  val mask = (if (node.has("dismissButton")) 1 else 0) +
    (if (node.has("icon")) 2 else 0) +
    (if (node.has("title")) 4 else 0) +
    (if (node.has("text")) 8 else 0)
  when (mask) {
    0 -> androidx.compose.material3.AlertDialog(
      `onDismissRequest` = { node.emit("onDismissRequest") },
      `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
      `modifier` = node.modifier("modifier", scope),
    )
    1 -> androidx.compose.material3.AlertDialog(
      `onDismissRequest` = { node.emit("onDismissRequest") },
      `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
      `modifier` = node.modifier("modifier", scope),
      `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
    )
    2 -> androidx.compose.material3.AlertDialog(
      `onDismissRequest` = { node.emit("onDismissRequest") },
      `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
      `modifier` = node.modifier("modifier", scope),
      `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
    )
    3 -> androidx.compose.material3.AlertDialog(
      `onDismissRequest` = { node.emit("onDismissRequest") },
      `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
      `modifier` = node.modifier("modifier", scope),
      `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
      `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
    )
    4 -> androidx.compose.material3.AlertDialog(
      `onDismissRequest` = { node.emit("onDismissRequest") },
      `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
      `modifier` = node.modifier("modifier", scope),
      `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
    )
    5 -> androidx.compose.material3.AlertDialog(
      `onDismissRequest` = { node.emit("onDismissRequest") },
      `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
      `modifier` = node.modifier("modifier", scope),
      `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
      `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
    )
    6 -> androidx.compose.material3.AlertDialog(
      `onDismissRequest` = { node.emit("onDismissRequest") },
      `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
      `modifier` = node.modifier("modifier", scope),
      `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
      `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
    )
    7 -> androidx.compose.material3.AlertDialog(
      `onDismissRequest` = { node.emit("onDismissRequest") },
      `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
      `modifier` = node.modifier("modifier", scope),
      `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
      `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
      `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
    )
    8 -> androidx.compose.material3.AlertDialog(
      `onDismissRequest` = { node.emit("onDismissRequest") },
      `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
      `modifier` = node.modifier("modifier", scope),
      `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
    )
    9 -> androidx.compose.material3.AlertDialog(
      `onDismissRequest` = { node.emit("onDismissRequest") },
      `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
      `modifier` = node.modifier("modifier", scope),
      `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
      `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
    )
    10 -> androidx.compose.material3.AlertDialog(
      `onDismissRequest` = { node.emit("onDismissRequest") },
      `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
      `modifier` = node.modifier("modifier", scope),
      `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
      `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
    )
    11 -> androidx.compose.material3.AlertDialog(
      `onDismissRequest` = { node.emit("onDismissRequest") },
      `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
      `modifier` = node.modifier("modifier", scope),
      `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
      `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
      `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
    )
    12 -> androidx.compose.material3.AlertDialog(
      `onDismissRequest` = { node.emit("onDismissRequest") },
      `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
      `modifier` = node.modifier("modifier", scope),
      `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
      `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
    )
    13 -> androidx.compose.material3.AlertDialog(
      `onDismissRequest` = { node.emit("onDismissRequest") },
      `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
      `modifier` = node.modifier("modifier", scope),
      `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
      `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
      `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
    )
    14 -> androidx.compose.material3.AlertDialog(
      `onDismissRequest` = { node.emit("onDismissRequest") },
      `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
      `modifier` = node.modifier("modifier", scope),
      `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
      `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
      `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
    )
    else -> androidx.compose.material3.AlertDialog(
      `onDismissRequest` = { node.emit("onDismissRequest") },
      `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
      `modifier` = node.modifier("modifier", scope),
      `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
      `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
      `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
      `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
    )
  }
}

@Composable
private fun renderAssistChip(node: ComposeNode, scope: Any?) {
  val mask = (if (node.has("enabled")) 1 else 0) +
    (if (node.has("leadingIcon")) 2 else 0) +
    (if (node.has("trailingIcon")) 4 else 0)
  when (mask) {
    0 -> androidx.compose.material3.AssistChip(
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier", scope),
    )
    1 -> androidx.compose.material3.AssistChip(
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier", scope),
      `enabled` = node.boolean("enabled"),
    )
    2 -> androidx.compose.material3.AssistChip(
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier", scope),
      `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
    )
    3 -> androidx.compose.material3.AssistChip(
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier", scope),
      `enabled` = node.boolean("enabled"),
      `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
    )
    4 -> androidx.compose.material3.AssistChip(
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier", scope),
      `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
    )
    5 -> androidx.compose.material3.AssistChip(
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier", scope),
      `enabled` = node.boolean("enabled"),
      `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
    )
    6 -> androidx.compose.material3.AssistChip(
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier", scope),
      `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
    )
    else -> androidx.compose.material3.AssistChip(
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier", scope),
      `enabled` = node.boolean("enabled"),
      `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
    )
  }
}

@Composable
private fun renderBadge(node: ComposeNode, scope: Any?) {
  val mask = (if (node.has("containerColor")) 1 else 0) +
    (if (node.has("contentColor")) 2 else 0) +
    (if (node.has("content")) 4 else 0)
  when (mask) {
    0 -> androidx.compose.material3.Badge(
      `modifier` = node.modifier("modifier", scope),
    )
    1 -> androidx.compose.material3.Badge(
      `modifier` = node.modifier("modifier", scope),
      `containerColor` = node.color("containerColor"),
    )
    2 -> androidx.compose.material3.Badge(
      `modifier` = node.modifier("modifier", scope),
      `contentColor` = node.color("contentColor"),
    )
    3 -> androidx.compose.material3.Badge(
      `modifier` = node.modifier("modifier", scope),
      `containerColor` = node.color("containerColor"),
      `contentColor` = node.color("contentColor"),
    )
    4 -> androidx.compose.material3.Badge(
      `modifier` = node.modifier("modifier", scope),
      `content` = if (node.isNull("content")) null else ({ RenderComposeChildren(node.slot("content"), this) }),
    )
    5 -> androidx.compose.material3.Badge(
      `modifier` = node.modifier("modifier", scope),
      `containerColor` = node.color("containerColor"),
      `content` = if (node.isNull("content")) null else ({ RenderComposeChildren(node.slot("content"), this) }),
    )
    6 -> androidx.compose.material3.Badge(
      `modifier` = node.modifier("modifier", scope),
      `contentColor` = node.color("contentColor"),
      `content` = if (node.isNull("content")) null else ({ RenderComposeChildren(node.slot("content"), this) }),
    )
    else -> androidx.compose.material3.Badge(
      `modifier` = node.modifier("modifier", scope),
      `containerColor` = node.color("containerColor"),
      `contentColor` = node.color("contentColor"),
      `content` = if (node.isNull("content")) null else ({ RenderComposeChildren(node.slot("content"), this) }),
    )
  }
}

@Composable
private fun renderBadgedBox(node: ComposeNode, scope: Any?) {
  androidx.compose.material3.BadgedBox(
    `badge` = { RenderComposeChildren(node.slot("badge"), this) },
    `modifier` = node.modifier("modifier", scope),
    content = { RenderComposeChildren(node.children, this) },
  )
}

@Composable
private fun renderBox(node: ComposeNode, scope: Any?) {
  val mask = (if (node.has("propagateMinConstraints")) 1 else 0) +
    (if (node.has("contentAlignment")) 2 else 0)
  when (mask) {
    0 -> androidx.compose.foundation.layout.Box(
      `modifier` = node.modifier("modifier", scope),
      content = { RenderComposeChildren(node.children, this) },
    )
    1 -> androidx.compose.foundation.layout.Box(
      `modifier` = node.modifier("modifier", scope),
      `propagateMinConstraints` = node.boolean("propagateMinConstraints"),
      content = { RenderComposeChildren(node.children, this) },
    )
    2 -> androidx.compose.foundation.layout.Box(
      `modifier` = node.modifier("modifier", scope),
      `contentAlignment` = toComposeAlignment(node.string("contentAlignment")),
      content = { RenderComposeChildren(node.children, this) },
    )
    else -> androidx.compose.foundation.layout.Box(
      `modifier` = node.modifier("modifier", scope),
      `propagateMinConstraints` = node.boolean("propagateMinConstraints"),
      `contentAlignment` = toComposeAlignment(node.string("contentAlignment")),
      content = { RenderComposeChildren(node.children, this) },
    )
  }
}

@Composable
private fun renderButton(node: ComposeNode, scope: Any?) {
  val mask = (if (node.has("enabled")) 1 else 0)
  when (mask) {
    0 -> androidx.compose.material3.Button(
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier", scope),
      content = { RenderComposeChildren(node.children, this) },
    )
    else -> androidx.compose.material3.Button(
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier", scope),
      `enabled` = node.boolean("enabled"),
      content = { RenderComposeChildren(node.children, this) },
    )
  }
}

@Composable
private fun renderCard(node: ComposeNode, scope: Any?) {
  androidx.compose.material3.Card(
    `modifier` = node.modifier("modifier", scope),
    content = { RenderComposeChildren(node.children, this) },
  )
}

@Composable
private fun renderCheckbox(node: ComposeNode, scope: Any?) {
  val mask = (if (node.has("enabled")) 1 else 0)
  when (mask) {
    0 -> androidx.compose.material3.Checkbox(
      `checked` = node.boolean("checked"),
      `onCheckedChange` = if (node.isNull("onCheckedChange")) null else ({ value: Boolean -> node.emit("onCheckedChange", value) }),
      `modifier` = node.modifier("modifier", scope),
    )
    else -> androidx.compose.material3.Checkbox(
      `checked` = node.boolean("checked"),
      `onCheckedChange` = if (node.isNull("onCheckedChange")) null else ({ value: Boolean -> node.emit("onCheckedChange", value) }),
      `modifier` = node.modifier("modifier", scope),
      `enabled` = node.boolean("enabled"),
    )
  }
}

@Composable
private fun renderCircularProgressIndicator(node: ComposeNode, scope: Any?) {
  val mask = (if (node.has("color")) 1 else 0) +
    (if (node.has("strokeWidth")) 2 else 0) +
    (if (node.has("trackColor")) 4 else 0)
  when (mask) {
    0 -> androidx.compose.material3.CircularProgressIndicator(
      `modifier` = node.modifier("modifier", scope),
    )
    1 -> androidx.compose.material3.CircularProgressIndicator(
      `modifier` = node.modifier("modifier", scope),
      `color` = node.color("color"),
    )
    2 -> androidx.compose.material3.CircularProgressIndicator(
      `modifier` = node.modifier("modifier", scope),
      `strokeWidth` = node.number("strokeWidth").dp,
    )
    3 -> androidx.compose.material3.CircularProgressIndicator(
      `modifier` = node.modifier("modifier", scope),
      `color` = node.color("color"),
      `strokeWidth` = node.number("strokeWidth").dp,
    )
    4 -> androidx.compose.material3.CircularProgressIndicator(
      `modifier` = node.modifier("modifier", scope),
      `trackColor` = node.color("trackColor"),
    )
    5 -> androidx.compose.material3.CircularProgressIndicator(
      `modifier` = node.modifier("modifier", scope),
      `color` = node.color("color"),
      `trackColor` = node.color("trackColor"),
    )
    6 -> androidx.compose.material3.CircularProgressIndicator(
      `modifier` = node.modifier("modifier", scope),
      `strokeWidth` = node.number("strokeWidth").dp,
      `trackColor` = node.color("trackColor"),
    )
    else -> androidx.compose.material3.CircularProgressIndicator(
      `modifier` = node.modifier("modifier", scope),
      `color` = node.color("color"),
      `strokeWidth` = node.number("strokeWidth").dp,
      `trackColor` = node.color("trackColor"),
    )
  }
}

@Composable
private fun renderColumn(node: ComposeNode, scope: Any?) {
  val mask = (if (node.has("verticalArrangement")) 1 else 0) +
    (if (node.has("horizontalAlignment")) 2 else 0)
  when (mask) {
    0 -> androidx.compose.foundation.layout.Column(
      `modifier` = node.modifier("modifier", scope),
      content = { RenderComposeChildren(node.children, this) },
    )
    1 -> androidx.compose.foundation.layout.Column(
      `modifier` = node.modifier("modifier", scope),
      `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
      content = { RenderComposeChildren(node.children, this) },
    )
    2 -> androidx.compose.foundation.layout.Column(
      `modifier` = node.modifier("modifier", scope),
      `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
      content = { RenderComposeChildren(node.children, this) },
    )
    else -> androidx.compose.foundation.layout.Column(
      `modifier` = node.modifier("modifier", scope),
      `verticalArrangement` = toComposeVerticalArrangement(node.string("verticalArrangement")),
      `horizontalAlignment` = toComposeHorizontalAlignment(node.string("horizontalAlignment")),
      content = { RenderComposeChildren(node.children, this) },
    )
  }
}

@Composable
private fun renderDismissibleDrawerSheet(node: ComposeNode, scope: Any?) {
  val mask = (if (node.has("drawerContainerColor")) 1 else 0) +
    (if (node.has("drawerContentColor")) 2 else 0) +
    (if (node.has("drawerTonalElevation")) 4 else 0)
  when (mask) {
    0 -> androidx.compose.material3.DismissibleDrawerSheet(
      `modifier` = node.modifier("modifier", scope),
      content = { RenderComposeChildren(node.children, this) },
    )
    1 -> androidx.compose.material3.DismissibleDrawerSheet(
      `modifier` = node.modifier("modifier", scope),
      `drawerContainerColor` = node.color("drawerContainerColor"),
      content = { RenderComposeChildren(node.children, this) },
    )
    2 -> androidx.compose.material3.DismissibleDrawerSheet(
      `modifier` = node.modifier("modifier", scope),
      `drawerContentColor` = node.color("drawerContentColor"),
      content = { RenderComposeChildren(node.children, this) },
    )
    3 -> androidx.compose.material3.DismissibleDrawerSheet(
      `modifier` = node.modifier("modifier", scope),
      `drawerContainerColor` = node.color("drawerContainerColor"),
      `drawerContentColor` = node.color("drawerContentColor"),
      content = { RenderComposeChildren(node.children, this) },
    )
    4 -> androidx.compose.material3.DismissibleDrawerSheet(
      `modifier` = node.modifier("modifier", scope),
      `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
      content = { RenderComposeChildren(node.children, this) },
    )
    5 -> androidx.compose.material3.DismissibleDrawerSheet(
      `modifier` = node.modifier("modifier", scope),
      `drawerContainerColor` = node.color("drawerContainerColor"),
      `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
      content = { RenderComposeChildren(node.children, this) },
    )
    6 -> androidx.compose.material3.DismissibleDrawerSheet(
      `modifier` = node.modifier("modifier", scope),
      `drawerContentColor` = node.color("drawerContentColor"),
      `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
      content = { RenderComposeChildren(node.children, this) },
    )
    else -> androidx.compose.material3.DismissibleDrawerSheet(
      `modifier` = node.modifier("modifier", scope),
      `drawerContainerColor` = node.color("drawerContainerColor"),
      `drawerContentColor` = node.color("drawerContentColor"),
      `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
      content = { RenderComposeChildren(node.children, this) },
    )
  }
}

@Composable
private fun renderDismissibleNavigationDrawer(node: ComposeNode, scope: Any?) {
  val mask = (if (node.has("gesturesEnabled")) 1 else 0)
  when (mask) {
    0 -> androidx.compose.material3.DismissibleNavigationDrawer(
      `drawerContent` = { RenderComposeChildren(node.slot("drawerContent")) },
      `modifier` = node.modifier("modifier", scope),
      content = { RenderComposeChildren(node.children) },
    )
    else -> androidx.compose.material3.DismissibleNavigationDrawer(
      `drawerContent` = { RenderComposeChildren(node.slot("drawerContent")) },
      `modifier` = node.modifier("modifier", scope),
      `gesturesEnabled` = node.boolean("gesturesEnabled"),
      content = { RenderComposeChildren(node.children) },
    )
  }
}

@Composable
private fun renderDropdownMenu(node: ComposeNode, scope: Any?) {
  val mask = (if (node.has("containerColor")) 1 else 0) +
    (if (node.has("tonalElevation")) 2 else 0) +
    (if (node.has("shadowElevation")) 4 else 0)
  when (mask) {
    0 -> androidx.compose.material3.DropdownMenu(
      `expanded` = node.boolean("expanded"),
      `onDismissRequest` = { node.emit("onDismissRequest") },
      `modifier` = node.modifier("modifier", scope),
      content = { RenderComposeChildren(node.children, this) },
    )
    1 -> androidx.compose.material3.DropdownMenu(
      `expanded` = node.boolean("expanded"),
      `onDismissRequest` = { node.emit("onDismissRequest") },
      `modifier` = node.modifier("modifier", scope),
      `containerColor` = node.color("containerColor"),
      content = { RenderComposeChildren(node.children, this) },
    )
    2 -> androidx.compose.material3.DropdownMenu(
      `expanded` = node.boolean("expanded"),
      `onDismissRequest` = { node.emit("onDismissRequest") },
      `modifier` = node.modifier("modifier", scope),
      `tonalElevation` = node.number("tonalElevation").dp,
      content = { RenderComposeChildren(node.children, this) },
    )
    3 -> androidx.compose.material3.DropdownMenu(
      `expanded` = node.boolean("expanded"),
      `onDismissRequest` = { node.emit("onDismissRequest") },
      `modifier` = node.modifier("modifier", scope),
      `containerColor` = node.color("containerColor"),
      `tonalElevation` = node.number("tonalElevation").dp,
      content = { RenderComposeChildren(node.children, this) },
    )
    4 -> androidx.compose.material3.DropdownMenu(
      `expanded` = node.boolean("expanded"),
      `onDismissRequest` = { node.emit("onDismissRequest") },
      `modifier` = node.modifier("modifier", scope),
      `shadowElevation` = node.number("shadowElevation").dp,
      content = { RenderComposeChildren(node.children, this) },
    )
    5 -> androidx.compose.material3.DropdownMenu(
      `expanded` = node.boolean("expanded"),
      `onDismissRequest` = { node.emit("onDismissRequest") },
      `modifier` = node.modifier("modifier", scope),
      `containerColor` = node.color("containerColor"),
      `shadowElevation` = node.number("shadowElevation").dp,
      content = { RenderComposeChildren(node.children, this) },
    )
    6 -> androidx.compose.material3.DropdownMenu(
      `expanded` = node.boolean("expanded"),
      `onDismissRequest` = { node.emit("onDismissRequest") },
      `modifier` = node.modifier("modifier", scope),
      `tonalElevation` = node.number("tonalElevation").dp,
      `shadowElevation` = node.number("shadowElevation").dp,
      content = { RenderComposeChildren(node.children, this) },
    )
    else -> androidx.compose.material3.DropdownMenu(
      `expanded` = node.boolean("expanded"),
      `onDismissRequest` = { node.emit("onDismissRequest") },
      `modifier` = node.modifier("modifier", scope),
      `containerColor` = node.color("containerColor"),
      `tonalElevation` = node.number("tonalElevation").dp,
      `shadowElevation` = node.number("shadowElevation").dp,
      content = { RenderComposeChildren(node.children, this) },
    )
  }
}

@Composable
private fun renderDropdownMenuItem(node: ComposeNode, scope: Any?) {
  val mask = (if (node.has("leadingIcon")) 1 else 0) +
    (if (node.has("trailingIcon")) 2 else 0) +
    (if (node.has("enabled")) 4 else 0)
  when (mask) {
    0 -> androidx.compose.material3.DropdownMenuItem(
      `text` = { RenderComposeChildren(node.slot("text")) },
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier", scope),
    )
    1 -> androidx.compose.material3.DropdownMenuItem(
      `text` = { RenderComposeChildren(node.slot("text")) },
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier", scope),
      `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
    )
    2 -> androidx.compose.material3.DropdownMenuItem(
      `text` = { RenderComposeChildren(node.slot("text")) },
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier", scope),
      `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
    )
    3 -> androidx.compose.material3.DropdownMenuItem(
      `text` = { RenderComposeChildren(node.slot("text")) },
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier", scope),
      `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
    )
    4 -> androidx.compose.material3.DropdownMenuItem(
      `text` = { RenderComposeChildren(node.slot("text")) },
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier", scope),
      `enabled` = node.boolean("enabled"),
    )
    5 -> androidx.compose.material3.DropdownMenuItem(
      `text` = { RenderComposeChildren(node.slot("text")) },
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier", scope),
      `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      `enabled` = node.boolean("enabled"),
    )
    6 -> androidx.compose.material3.DropdownMenuItem(
      `text` = { RenderComposeChildren(node.slot("text")) },
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier", scope),
      `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      `enabled` = node.boolean("enabled"),
    )
    else -> androidx.compose.material3.DropdownMenuItem(
      `text` = { RenderComposeChildren(node.slot("text")) },
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier", scope),
      `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      `enabled` = node.boolean("enabled"),
    )
  }
}

@Composable
private fun renderElevatedAssistChip(node: ComposeNode, scope: Any?) {
  val mask = (if (node.has("enabled")) 1 else 0) +
    (if (node.has("leadingIcon")) 2 else 0) +
    (if (node.has("trailingIcon")) 4 else 0)
  when (mask) {
    0 -> androidx.compose.material3.ElevatedAssistChip(
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier", scope),
    )
    1 -> androidx.compose.material3.ElevatedAssistChip(
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier", scope),
      `enabled` = node.boolean("enabled"),
    )
    2 -> androidx.compose.material3.ElevatedAssistChip(
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier", scope),
      `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
    )
    3 -> androidx.compose.material3.ElevatedAssistChip(
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier", scope),
      `enabled` = node.boolean("enabled"),
      `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
    )
    4 -> androidx.compose.material3.ElevatedAssistChip(
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier", scope),
      `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
    )
    5 -> androidx.compose.material3.ElevatedAssistChip(
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier", scope),
      `enabled` = node.boolean("enabled"),
      `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
    )
    6 -> androidx.compose.material3.ElevatedAssistChip(
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier", scope),
      `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
    )
    else -> androidx.compose.material3.ElevatedAssistChip(
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier", scope),
      `enabled` = node.boolean("enabled"),
      `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
    )
  }
}

@Composable
private fun renderElevatedButton(node: ComposeNode, scope: Any?) {
  val mask = (if (node.has("enabled")) 1 else 0)
  when (mask) {
    0 -> androidx.compose.material3.ElevatedButton(
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier", scope),
      content = { RenderComposeChildren(node.children, this) },
    )
    else -> androidx.compose.material3.ElevatedButton(
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier", scope),
      `enabled` = node.boolean("enabled"),
      content = { RenderComposeChildren(node.children, this) },
    )
  }
}

@Composable
private fun renderElevatedCard(node: ComposeNode, scope: Any?) {
  androidx.compose.material3.ElevatedCard(
    `modifier` = node.modifier("modifier", scope),
    content = { RenderComposeChildren(node.children, this) },
  )
}

@Composable
private fun renderElevatedFilterChip(node: ComposeNode, scope: Any?) {
  val mask = (if (node.has("enabled")) 1 else 0) +
    (if (node.has("leadingIcon")) 2 else 0) +
    (if (node.has("trailingIcon")) 4 else 0)
  when (mask) {
    0 -> androidx.compose.material3.ElevatedFilterChip(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier", scope),
    )
    1 -> androidx.compose.material3.ElevatedFilterChip(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier", scope),
      `enabled` = node.boolean("enabled"),
    )
    2 -> androidx.compose.material3.ElevatedFilterChip(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier", scope),
      `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
    )
    3 -> androidx.compose.material3.ElevatedFilterChip(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier", scope),
      `enabled` = node.boolean("enabled"),
      `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
    )
    4 -> androidx.compose.material3.ElevatedFilterChip(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier", scope),
      `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
    )
    5 -> androidx.compose.material3.ElevatedFilterChip(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier", scope),
      `enabled` = node.boolean("enabled"),
      `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
    )
    6 -> androidx.compose.material3.ElevatedFilterChip(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier", scope),
      `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
    )
    else -> androidx.compose.material3.ElevatedFilterChip(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier", scope),
      `enabled` = node.boolean("enabled"),
      `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
    )
  }
}

@Composable
private fun renderElevatedSuggestionChip(node: ComposeNode, scope: Any?) {
  val mask = (if (node.has("enabled")) 1 else 0) +
    (if (node.has("icon")) 2 else 0)
  when (mask) {
    0 -> androidx.compose.material3.ElevatedSuggestionChip(
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier", scope),
    )
    1 -> androidx.compose.material3.ElevatedSuggestionChip(
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier", scope),
      `enabled` = node.boolean("enabled"),
    )
    2 -> androidx.compose.material3.ElevatedSuggestionChip(
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier", scope),
      `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
    )
    else -> androidx.compose.material3.ElevatedSuggestionChip(
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier", scope),
      `enabled` = node.boolean("enabled"),
      `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
    )
  }
}

@Composable
private fun renderExtendedFloatingActionButton(node: ComposeNode, scope: Any?) {
  val mask = (if (node.has("containerColor")) 1 else 0) +
    (if (node.has("contentColor")) 2 else 0)
  when (mask) {
    0 -> androidx.compose.material3.ExtendedFloatingActionButton(
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier", scope),
      content = { RenderComposeChildren(node.children, this) },
    )
    1 -> androidx.compose.material3.ExtendedFloatingActionButton(
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier", scope),
      `containerColor` = node.color("containerColor"),
      content = { RenderComposeChildren(node.children, this) },
    )
    2 -> androidx.compose.material3.ExtendedFloatingActionButton(
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier", scope),
      `contentColor` = node.color("contentColor"),
      content = { RenderComposeChildren(node.children, this) },
    )
    else -> androidx.compose.material3.ExtendedFloatingActionButton(
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier", scope),
      `containerColor` = node.color("containerColor"),
      `contentColor` = node.color("contentColor"),
      content = { RenderComposeChildren(node.children, this) },
    )
  }
}

@Composable
private fun renderFilledIconButton(node: ComposeNode, scope: Any?) {
  val mask = (if (node.has("enabled")) 1 else 0)
  when (mask) {
    0 -> androidx.compose.material3.FilledIconButton(
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier", scope),
      content = { RenderComposeChildren(node.children) },
    )
    else -> androidx.compose.material3.FilledIconButton(
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier", scope),
      `enabled` = node.boolean("enabled"),
      content = { RenderComposeChildren(node.children) },
    )
  }
}

@Composable
private fun renderFilledIconToggleButton(node: ComposeNode, scope: Any?) {
  val mask = (if (node.has("enabled")) 1 else 0)
  when (mask) {
    0 -> androidx.compose.material3.FilledIconToggleButton(
      `checked` = node.boolean("checked"),
      `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
      `modifier` = node.modifier("modifier", scope),
      content = { RenderComposeChildren(node.children) },
    )
    else -> androidx.compose.material3.FilledIconToggleButton(
      `checked` = node.boolean("checked"),
      `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
      `modifier` = node.modifier("modifier", scope),
      `enabled` = node.boolean("enabled"),
      content = { RenderComposeChildren(node.children) },
    )
  }
}

@Composable
private fun renderFilledTonalButton(node: ComposeNode, scope: Any?) {
  val mask = (if (node.has("enabled")) 1 else 0)
  when (mask) {
    0 -> androidx.compose.material3.FilledTonalButton(
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier", scope),
      content = { RenderComposeChildren(node.children, this) },
    )
    else -> androidx.compose.material3.FilledTonalButton(
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier", scope),
      `enabled` = node.boolean("enabled"),
      content = { RenderComposeChildren(node.children, this) },
    )
  }
}

@Composable
private fun renderFilledTonalIconButton(node: ComposeNode, scope: Any?) {
  val mask = (if (node.has("enabled")) 1 else 0)
  when (mask) {
    0 -> androidx.compose.material3.FilledTonalIconButton(
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier", scope),
      content = { RenderComposeChildren(node.children) },
    )
    else -> androidx.compose.material3.FilledTonalIconButton(
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier", scope),
      `enabled` = node.boolean("enabled"),
      content = { RenderComposeChildren(node.children) },
    )
  }
}

@Composable
private fun renderFilledTonalIconToggleButton(node: ComposeNode, scope: Any?) {
  val mask = (if (node.has("enabled")) 1 else 0)
  when (mask) {
    0 -> androidx.compose.material3.FilledTonalIconToggleButton(
      `checked` = node.boolean("checked"),
      `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
      `modifier` = node.modifier("modifier", scope),
      content = { RenderComposeChildren(node.children) },
    )
    else -> androidx.compose.material3.FilledTonalIconToggleButton(
      `checked` = node.boolean("checked"),
      `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
      `modifier` = node.modifier("modifier", scope),
      `enabled` = node.boolean("enabled"),
      content = { RenderComposeChildren(node.children) },
    )
  }
}

@Composable
private fun renderFilterChip(node: ComposeNode, scope: Any?) {
  val mask = (if (node.has("enabled")) 1 else 0) +
    (if (node.has("leadingIcon")) 2 else 0) +
    (if (node.has("trailingIcon")) 4 else 0)
  when (mask) {
    0 -> androidx.compose.material3.FilterChip(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier", scope),
    )
    1 -> androidx.compose.material3.FilterChip(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier", scope),
      `enabled` = node.boolean("enabled"),
    )
    2 -> androidx.compose.material3.FilterChip(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier", scope),
      `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
    )
    3 -> androidx.compose.material3.FilterChip(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier", scope),
      `enabled` = node.boolean("enabled"),
      `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
    )
    4 -> androidx.compose.material3.FilterChip(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier", scope),
      `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
    )
    5 -> androidx.compose.material3.FilterChip(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier", scope),
      `enabled` = node.boolean("enabled"),
      `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
    )
    6 -> androidx.compose.material3.FilterChip(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier", scope),
      `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
    )
    else -> androidx.compose.material3.FilterChip(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier", scope),
      `enabled` = node.boolean("enabled"),
      `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
    )
  }
}

@Composable
private fun renderFloatingActionButton(node: ComposeNode, scope: Any?) {
  val mask = (if (node.has("containerColor")) 1 else 0) +
    (if (node.has("contentColor")) 2 else 0)
  when (mask) {
    0 -> androidx.compose.material3.FloatingActionButton(
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier", scope),
      content = { RenderComposeChildren(node.children) },
    )
    1 -> androidx.compose.material3.FloatingActionButton(
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier", scope),
      `containerColor` = node.color("containerColor"),
      content = { RenderComposeChildren(node.children) },
    )
    2 -> androidx.compose.material3.FloatingActionButton(
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier", scope),
      `contentColor` = node.color("contentColor"),
      content = { RenderComposeChildren(node.children) },
    )
    else -> androidx.compose.material3.FloatingActionButton(
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier", scope),
      `containerColor` = node.color("containerColor"),
      `contentColor` = node.color("contentColor"),
      content = { RenderComposeChildren(node.children) },
    )
  }
}

@Composable
private fun renderHorizontalDivider(node: ComposeNode, scope: Any?) {
  val mask = (if (node.has("thickness")) 1 else 0) +
    (if (node.has("color")) 2 else 0)
  when (mask) {
    0 -> androidx.compose.material3.HorizontalDivider(
      `modifier` = node.modifier("modifier", scope),
    )
    1 -> androidx.compose.material3.HorizontalDivider(
      `modifier` = node.modifier("modifier", scope),
      `thickness` = node.number("thickness").dp,
    )
    2 -> androidx.compose.material3.HorizontalDivider(
      `modifier` = node.modifier("modifier", scope),
      `color` = node.color("color"),
    )
    else -> androidx.compose.material3.HorizontalDivider(
      `modifier` = node.modifier("modifier", scope),
      `thickness` = node.number("thickness").dp,
      `color` = node.color("color"),
    )
  }
}

@Composable
private fun renderIconButton(node: ComposeNode, scope: Any?) {
  val mask = (if (node.has("enabled")) 1 else 0)
  when (mask) {
    0 -> androidx.compose.material3.IconButton(
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier", scope),
      content = { RenderComposeChildren(node.children) },
    )
    else -> androidx.compose.material3.IconButton(
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier", scope),
      `enabled` = node.boolean("enabled"),
      content = { RenderComposeChildren(node.children) },
    )
  }
}

@Composable
private fun renderIconToggleButton(node: ComposeNode, scope: Any?) {
  val mask = (if (node.has("enabled")) 1 else 0)
  when (mask) {
    0 -> androidx.compose.material3.IconToggleButton(
      `checked` = node.boolean("checked"),
      `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
      `modifier` = node.modifier("modifier", scope),
      content = { RenderComposeChildren(node.children) },
    )
    else -> androidx.compose.material3.IconToggleButton(
      `checked` = node.boolean("checked"),
      `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
      `modifier` = node.modifier("modifier", scope),
      `enabled` = node.boolean("enabled"),
      content = { RenderComposeChildren(node.children) },
    )
  }
}

@Composable
private fun renderInputChip(node: ComposeNode, scope: Any?) {
  val mask = (if (node.has("enabled")) 1 else 0) +
    (if (node.has("leadingIcon")) 2 else 0) +
    (if (node.has("avatar")) 4 else 0) +
    (if (node.has("trailingIcon")) 8 else 0)
  when (mask) {
    0 -> androidx.compose.material3.InputChip(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier", scope),
    )
    1 -> androidx.compose.material3.InputChip(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier", scope),
      `enabled` = node.boolean("enabled"),
    )
    2 -> androidx.compose.material3.InputChip(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier", scope),
      `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
    )
    3 -> androidx.compose.material3.InputChip(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier", scope),
      `enabled` = node.boolean("enabled"),
      `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
    )
    4 -> androidx.compose.material3.InputChip(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier", scope),
      `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
    )
    5 -> androidx.compose.material3.InputChip(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier", scope),
      `enabled` = node.boolean("enabled"),
      `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
    )
    6 -> androidx.compose.material3.InputChip(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier", scope),
      `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
    )
    7 -> androidx.compose.material3.InputChip(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier", scope),
      `enabled` = node.boolean("enabled"),
      `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
    )
    8 -> androidx.compose.material3.InputChip(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier", scope),
      `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
    )
    9 -> androidx.compose.material3.InputChip(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier", scope),
      `enabled` = node.boolean("enabled"),
      `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
    )
    10 -> androidx.compose.material3.InputChip(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier", scope),
      `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
    )
    11 -> androidx.compose.material3.InputChip(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier", scope),
      `enabled` = node.boolean("enabled"),
      `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
    )
    12 -> androidx.compose.material3.InputChip(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier", scope),
      `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
      `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
    )
    13 -> androidx.compose.material3.InputChip(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier", scope),
      `enabled` = node.boolean("enabled"),
      `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
      `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
    )
    14 -> androidx.compose.material3.InputChip(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier", scope),
      `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
      `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
    )
    else -> androidx.compose.material3.InputChip(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier", scope),
      `enabled` = node.boolean("enabled"),
      `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
      `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
    )
  }
}

@Composable
private fun renderLargeFloatingActionButton(node: ComposeNode, scope: Any?) {
  val mask = (if (node.has("containerColor")) 1 else 0) +
    (if (node.has("contentColor")) 2 else 0)
  when (mask) {
    0 -> androidx.compose.material3.LargeFloatingActionButton(
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier", scope),
      content = { RenderComposeChildren(node.children) },
    )
    1 -> androidx.compose.material3.LargeFloatingActionButton(
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier", scope),
      `containerColor` = node.color("containerColor"),
      content = { RenderComposeChildren(node.children) },
    )
    2 -> androidx.compose.material3.LargeFloatingActionButton(
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier", scope),
      `contentColor` = node.color("contentColor"),
      content = { RenderComposeChildren(node.children) },
    )
    else -> androidx.compose.material3.LargeFloatingActionButton(
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier", scope),
      `containerColor` = node.color("containerColor"),
      `contentColor` = node.color("contentColor"),
      content = { RenderComposeChildren(node.children) },
    )
  }
}

@Composable
private fun renderLeadingIconTab(node: ComposeNode, scope: Any?) {
  val mask = (if (node.has("enabled")) 1 else 0) +
    (if (node.has("selectedContentColor")) 2 else 0) +
    (if (node.has("unselectedContentColor")) 4 else 0)
  when (mask) {
    0 -> androidx.compose.material3.LeadingIconTab(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `text` = { RenderComposeChildren(node.slot("text")) },
      `icon` = { RenderComposeChildren(node.slot("icon")) },
      `modifier` = node.modifier("modifier", scope),
    )
    1 -> androidx.compose.material3.LeadingIconTab(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `text` = { RenderComposeChildren(node.slot("text")) },
      `icon` = { RenderComposeChildren(node.slot("icon")) },
      `modifier` = node.modifier("modifier", scope),
      `enabled` = node.boolean("enabled"),
    )
    2 -> androidx.compose.material3.LeadingIconTab(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `text` = { RenderComposeChildren(node.slot("text")) },
      `icon` = { RenderComposeChildren(node.slot("icon")) },
      `modifier` = node.modifier("modifier", scope),
      `selectedContentColor` = node.color("selectedContentColor"),
    )
    3 -> androidx.compose.material3.LeadingIconTab(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `text` = { RenderComposeChildren(node.slot("text")) },
      `icon` = { RenderComposeChildren(node.slot("icon")) },
      `modifier` = node.modifier("modifier", scope),
      `enabled` = node.boolean("enabled"),
      `selectedContentColor` = node.color("selectedContentColor"),
    )
    4 -> androidx.compose.material3.LeadingIconTab(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `text` = { RenderComposeChildren(node.slot("text")) },
      `icon` = { RenderComposeChildren(node.slot("icon")) },
      `modifier` = node.modifier("modifier", scope),
      `unselectedContentColor` = node.color("unselectedContentColor"),
    )
    5 -> androidx.compose.material3.LeadingIconTab(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `text` = { RenderComposeChildren(node.slot("text")) },
      `icon` = { RenderComposeChildren(node.slot("icon")) },
      `modifier` = node.modifier("modifier", scope),
      `enabled` = node.boolean("enabled"),
      `unselectedContentColor` = node.color("unselectedContentColor"),
    )
    6 -> androidx.compose.material3.LeadingIconTab(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `text` = { RenderComposeChildren(node.slot("text")) },
      `icon` = { RenderComposeChildren(node.slot("icon")) },
      `modifier` = node.modifier("modifier", scope),
      `selectedContentColor` = node.color("selectedContentColor"),
      `unselectedContentColor` = node.color("unselectedContentColor"),
    )
    else -> androidx.compose.material3.LeadingIconTab(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `text` = { RenderComposeChildren(node.slot("text")) },
      `icon` = { RenderComposeChildren(node.slot("icon")) },
      `modifier` = node.modifier("modifier", scope),
      `enabled` = node.boolean("enabled"),
      `selectedContentColor` = node.color("selectedContentColor"),
      `unselectedContentColor` = node.color("unselectedContentColor"),
    )
  }
}

@Composable
private fun renderLinearProgressIndicator(node: ComposeNode, scope: Any?) {
  val mask = (if (node.has("color")) 1 else 0) +
    (if (node.has("trackColor")) 2 else 0) +
    (if (node.has("gapSize")) 4 else 0)
  when (mask) {
    0 -> androidx.compose.material3.LinearProgressIndicator(
      `modifier` = node.modifier("modifier", scope),
    )
    1 -> androidx.compose.material3.LinearProgressIndicator(
      `modifier` = node.modifier("modifier", scope),
      `color` = node.color("color"),
    )
    2 -> androidx.compose.material3.LinearProgressIndicator(
      `modifier` = node.modifier("modifier", scope),
      `trackColor` = node.color("trackColor"),
    )
    3 -> androidx.compose.material3.LinearProgressIndicator(
      `modifier` = node.modifier("modifier", scope),
      `color` = node.color("color"),
      `trackColor` = node.color("trackColor"),
    )
    4 -> androidx.compose.material3.LinearProgressIndicator(
      `modifier` = node.modifier("modifier", scope),
      `gapSize` = node.number("gapSize").dp,
    )
    5 -> androidx.compose.material3.LinearProgressIndicator(
      `modifier` = node.modifier("modifier", scope),
      `color` = node.color("color"),
      `gapSize` = node.number("gapSize").dp,
    )
    6 -> androidx.compose.material3.LinearProgressIndicator(
      `modifier` = node.modifier("modifier", scope),
      `trackColor` = node.color("trackColor"),
      `gapSize` = node.number("gapSize").dp,
    )
    else -> androidx.compose.material3.LinearProgressIndicator(
      `modifier` = node.modifier("modifier", scope),
      `color` = node.color("color"),
      `trackColor` = node.color("trackColor"),
      `gapSize` = node.number("gapSize").dp,
    )
  }
}

@Composable
private fun renderListItem(node: ComposeNode, scope: Any?) {
  val mask = (if (node.has("overlineContent")) 1 else 0) +
    (if (node.has("supportingContent")) 2 else 0) +
    (if (node.has("leadingContent")) 4 else 0) +
    (if (node.has("trailingContent")) 8 else 0)
  when (mask) {
    0 -> androidx.compose.material3.ListItem(
      `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
      `modifier` = node.modifier("modifier", scope),
    )
    1 -> androidx.compose.material3.ListItem(
      `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
      `modifier` = node.modifier("modifier", scope),
      `overlineContent` = if (node.isNull("overlineContent")) null else ({ RenderComposeChildren(node.slot("overlineContent")) }),
    )
    2 -> androidx.compose.material3.ListItem(
      `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
      `modifier` = node.modifier("modifier", scope),
      `supportingContent` = if (node.isNull("supportingContent")) null else ({ RenderComposeChildren(node.slot("supportingContent")) }),
    )
    3 -> androidx.compose.material3.ListItem(
      `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
      `modifier` = node.modifier("modifier", scope),
      `overlineContent` = if (node.isNull("overlineContent")) null else ({ RenderComposeChildren(node.slot("overlineContent")) }),
      `supportingContent` = if (node.isNull("supportingContent")) null else ({ RenderComposeChildren(node.slot("supportingContent")) }),
    )
    4 -> androidx.compose.material3.ListItem(
      `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
      `modifier` = node.modifier("modifier", scope),
      `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent")) }),
    )
    5 -> androidx.compose.material3.ListItem(
      `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
      `modifier` = node.modifier("modifier", scope),
      `overlineContent` = if (node.isNull("overlineContent")) null else ({ RenderComposeChildren(node.slot("overlineContent")) }),
      `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent")) }),
    )
    6 -> androidx.compose.material3.ListItem(
      `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
      `modifier` = node.modifier("modifier", scope),
      `supportingContent` = if (node.isNull("supportingContent")) null else ({ RenderComposeChildren(node.slot("supportingContent")) }),
      `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent")) }),
    )
    7 -> androidx.compose.material3.ListItem(
      `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
      `modifier` = node.modifier("modifier", scope),
      `overlineContent` = if (node.isNull("overlineContent")) null else ({ RenderComposeChildren(node.slot("overlineContent")) }),
      `supportingContent` = if (node.isNull("supportingContent")) null else ({ RenderComposeChildren(node.slot("supportingContent")) }),
      `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent")) }),
    )
    8 -> androidx.compose.material3.ListItem(
      `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
      `modifier` = node.modifier("modifier", scope),
      `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent")) }),
    )
    9 -> androidx.compose.material3.ListItem(
      `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
      `modifier` = node.modifier("modifier", scope),
      `overlineContent` = if (node.isNull("overlineContent")) null else ({ RenderComposeChildren(node.slot("overlineContent")) }),
      `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent")) }),
    )
    10 -> androidx.compose.material3.ListItem(
      `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
      `modifier` = node.modifier("modifier", scope),
      `supportingContent` = if (node.isNull("supportingContent")) null else ({ RenderComposeChildren(node.slot("supportingContent")) }),
      `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent")) }),
    )
    11 -> androidx.compose.material3.ListItem(
      `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
      `modifier` = node.modifier("modifier", scope),
      `overlineContent` = if (node.isNull("overlineContent")) null else ({ RenderComposeChildren(node.slot("overlineContent")) }),
      `supportingContent` = if (node.isNull("supportingContent")) null else ({ RenderComposeChildren(node.slot("supportingContent")) }),
      `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent")) }),
    )
    12 -> androidx.compose.material3.ListItem(
      `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
      `modifier` = node.modifier("modifier", scope),
      `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent")) }),
      `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent")) }),
    )
    13 -> androidx.compose.material3.ListItem(
      `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
      `modifier` = node.modifier("modifier", scope),
      `overlineContent` = if (node.isNull("overlineContent")) null else ({ RenderComposeChildren(node.slot("overlineContent")) }),
      `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent")) }),
      `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent")) }),
    )
    14 -> androidx.compose.material3.ListItem(
      `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
      `modifier` = node.modifier("modifier", scope),
      `supportingContent` = if (node.isNull("supportingContent")) null else ({ RenderComposeChildren(node.slot("supportingContent")) }),
      `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent")) }),
      `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent")) }),
    )
    else -> androidx.compose.material3.ListItem(
      `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
      `modifier` = node.modifier("modifier", scope),
      `overlineContent` = if (node.isNull("overlineContent")) null else ({ RenderComposeChildren(node.slot("overlineContent")) }),
      `supportingContent` = if (node.isNull("supportingContent")) null else ({ RenderComposeChildren(node.slot("supportingContent")) }),
      `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent")) }),
      `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent")) }),
    )
  }
}

@Composable
private fun renderMaterialTheme(node: ComposeNode) {
  val mask = (if (node.has("colorScheme")) 1 else 0)
  when (mask) {
    0 -> androidx.compose.material3.MaterialTheme(
      content = { RenderComposeChildren(node.children) },
    )
    else -> androidx.compose.material3.MaterialTheme(
      `colorScheme` = node.colorScheme("colorScheme"),
      content = { RenderComposeChildren(node.children) },
    )
  }
}

@Composable
private fun renderModalDrawerSheet(node: ComposeNode, scope: Any?) {
  val mask = (if (node.has("drawerContainerColor")) 1 else 0) +
    (if (node.has("drawerContentColor")) 2 else 0) +
    (if (node.has("drawerTonalElevation")) 4 else 0)
  when (mask) {
    0 -> androidx.compose.material3.ModalDrawerSheet(
      `modifier` = node.modifier("modifier", scope),
      content = { RenderComposeChildren(node.children, this) },
    )
    1 -> androidx.compose.material3.ModalDrawerSheet(
      `modifier` = node.modifier("modifier", scope),
      `drawerContainerColor` = node.color("drawerContainerColor"),
      content = { RenderComposeChildren(node.children, this) },
    )
    2 -> androidx.compose.material3.ModalDrawerSheet(
      `modifier` = node.modifier("modifier", scope),
      `drawerContentColor` = node.color("drawerContentColor"),
      content = { RenderComposeChildren(node.children, this) },
    )
    3 -> androidx.compose.material3.ModalDrawerSheet(
      `modifier` = node.modifier("modifier", scope),
      `drawerContainerColor` = node.color("drawerContainerColor"),
      `drawerContentColor` = node.color("drawerContentColor"),
      content = { RenderComposeChildren(node.children, this) },
    )
    4 -> androidx.compose.material3.ModalDrawerSheet(
      `modifier` = node.modifier("modifier", scope),
      `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
      content = { RenderComposeChildren(node.children, this) },
    )
    5 -> androidx.compose.material3.ModalDrawerSheet(
      `modifier` = node.modifier("modifier", scope),
      `drawerContainerColor` = node.color("drawerContainerColor"),
      `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
      content = { RenderComposeChildren(node.children, this) },
    )
    6 -> androidx.compose.material3.ModalDrawerSheet(
      `modifier` = node.modifier("modifier", scope),
      `drawerContentColor` = node.color("drawerContentColor"),
      `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
      content = { RenderComposeChildren(node.children, this) },
    )
    else -> androidx.compose.material3.ModalDrawerSheet(
      `modifier` = node.modifier("modifier", scope),
      `drawerContainerColor` = node.color("drawerContainerColor"),
      `drawerContentColor` = node.color("drawerContentColor"),
      `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
      content = { RenderComposeChildren(node.children, this) },
    )
  }
}

@Composable
private fun renderModalNavigationDrawer(node: ComposeNode, scope: Any?) {
  val mask = (if (node.has("gesturesEnabled")) 1 else 0) +
    (if (node.has("scrimColor")) 2 else 0)
  when (mask) {
    0 -> androidx.compose.material3.ModalNavigationDrawer(
      `drawerContent` = { RenderComposeChildren(node.slot("drawerContent")) },
      `modifier` = node.modifier("modifier", scope),
      content = { RenderComposeChildren(node.children) },
    )
    1 -> androidx.compose.material3.ModalNavigationDrawer(
      `drawerContent` = { RenderComposeChildren(node.slot("drawerContent")) },
      `modifier` = node.modifier("modifier", scope),
      `gesturesEnabled` = node.boolean("gesturesEnabled"),
      content = { RenderComposeChildren(node.children) },
    )
    2 -> androidx.compose.material3.ModalNavigationDrawer(
      `drawerContent` = { RenderComposeChildren(node.slot("drawerContent")) },
      `modifier` = node.modifier("modifier", scope),
      `scrimColor` = node.color("scrimColor"),
      content = { RenderComposeChildren(node.children) },
    )
    else -> androidx.compose.material3.ModalNavigationDrawer(
      `drawerContent` = { RenderComposeChildren(node.slot("drawerContent")) },
      `modifier` = node.modifier("modifier", scope),
      `gesturesEnabled` = node.boolean("gesturesEnabled"),
      `scrimColor` = node.color("scrimColor"),
      content = { RenderComposeChildren(node.children) },
    )
  }
}

@Composable
private fun renderNavigationBar(node: ComposeNode, scope: Any?) {
  val mask = (if (node.has("containerColor")) 1 else 0) +
    (if (node.has("contentColor")) 2 else 0) +
    (if (node.has("tonalElevation")) 4 else 0)
  when (mask) {
    0 -> androidx.compose.material3.NavigationBar(
      `modifier` = node.modifier("modifier", scope),
      content = { RenderComposeChildren(node.children, this) },
    )
    1 -> androidx.compose.material3.NavigationBar(
      `modifier` = node.modifier("modifier", scope),
      `containerColor` = node.color("containerColor"),
      content = { RenderComposeChildren(node.children, this) },
    )
    2 -> androidx.compose.material3.NavigationBar(
      `modifier` = node.modifier("modifier", scope),
      `contentColor` = node.color("contentColor"),
      content = { RenderComposeChildren(node.children, this) },
    )
    3 -> androidx.compose.material3.NavigationBar(
      `modifier` = node.modifier("modifier", scope),
      `containerColor` = node.color("containerColor"),
      `contentColor` = node.color("contentColor"),
      content = { RenderComposeChildren(node.children, this) },
    )
    4 -> androidx.compose.material3.NavigationBar(
      `modifier` = node.modifier("modifier", scope),
      `tonalElevation` = node.number("tonalElevation").dp,
      content = { RenderComposeChildren(node.children, this) },
    )
    5 -> androidx.compose.material3.NavigationBar(
      `modifier` = node.modifier("modifier", scope),
      `containerColor` = node.color("containerColor"),
      `tonalElevation` = node.number("tonalElevation").dp,
      content = { RenderComposeChildren(node.children, this) },
    )
    6 -> androidx.compose.material3.NavigationBar(
      `modifier` = node.modifier("modifier", scope),
      `contentColor` = node.color("contentColor"),
      `tonalElevation` = node.number("tonalElevation").dp,
      content = { RenderComposeChildren(node.children, this) },
    )
    else -> androidx.compose.material3.NavigationBar(
      `modifier` = node.modifier("modifier", scope),
      `containerColor` = node.color("containerColor"),
      `contentColor` = node.color("contentColor"),
      `tonalElevation` = node.number("tonalElevation").dp,
      content = { RenderComposeChildren(node.children, this) },
    )
  }
}

@Composable
private fun renderNavigationDrawerItem(node: ComposeNode, scope: Any?) {
  val mask = (if (node.has("icon")) 1 else 0) +
    (if (node.has("badge")) 2 else 0)
  when (mask) {
    0 -> androidx.compose.material3.NavigationDrawerItem(
      `label` = { RenderComposeChildren(node.slot("label")) },
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier", scope),
    )
    1 -> androidx.compose.material3.NavigationDrawerItem(
      `label` = { RenderComposeChildren(node.slot("label")) },
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier", scope),
      `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
    )
    2 -> androidx.compose.material3.NavigationDrawerItem(
      `label` = { RenderComposeChildren(node.slot("label")) },
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier", scope),
      `badge` = if (node.isNull("badge")) null else ({ RenderComposeChildren(node.slot("badge")) }),
    )
    else -> androidx.compose.material3.NavigationDrawerItem(
      `label` = { RenderComposeChildren(node.slot("label")) },
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier", scope),
      `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
      `badge` = if (node.isNull("badge")) null else ({ RenderComposeChildren(node.slot("badge")) }),
    )
  }
}

@Composable
private fun renderNavigationRail(node: ComposeNode, scope: Any?) {
  val mask = (if (node.has("containerColor")) 1 else 0) +
    (if (node.has("contentColor")) 2 else 0) +
    (if (node.has("header")) 4 else 0)
  when (mask) {
    0 -> androidx.compose.material3.NavigationRail(
      `modifier` = node.modifier("modifier", scope),
      content = { RenderComposeChildren(node.children, this) },
    )
    1 -> androidx.compose.material3.NavigationRail(
      `modifier` = node.modifier("modifier", scope),
      `containerColor` = node.color("containerColor"),
      content = { RenderComposeChildren(node.children, this) },
    )
    2 -> androidx.compose.material3.NavigationRail(
      `modifier` = node.modifier("modifier", scope),
      `contentColor` = node.color("contentColor"),
      content = { RenderComposeChildren(node.children, this) },
    )
    3 -> androidx.compose.material3.NavigationRail(
      `modifier` = node.modifier("modifier", scope),
      `containerColor` = node.color("containerColor"),
      `contentColor` = node.color("contentColor"),
      content = { RenderComposeChildren(node.children, this) },
    )
    4 -> androidx.compose.material3.NavigationRail(
      `modifier` = node.modifier("modifier", scope),
      `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header"), this) }),
      content = { RenderComposeChildren(node.children, this) },
    )
    5 -> androidx.compose.material3.NavigationRail(
      `modifier` = node.modifier("modifier", scope),
      `containerColor` = node.color("containerColor"),
      `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header"), this) }),
      content = { RenderComposeChildren(node.children, this) },
    )
    6 -> androidx.compose.material3.NavigationRail(
      `modifier` = node.modifier("modifier", scope),
      `contentColor` = node.color("contentColor"),
      `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header"), this) }),
      content = { RenderComposeChildren(node.children, this) },
    )
    else -> androidx.compose.material3.NavigationRail(
      `modifier` = node.modifier("modifier", scope),
      `containerColor` = node.color("containerColor"),
      `contentColor` = node.color("contentColor"),
      `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header"), this) }),
      content = { RenderComposeChildren(node.children, this) },
    )
  }
}

@Composable
private fun renderNavigationRailItem(node: ComposeNode, scope: Any?) {
  val mask = (if (node.has("enabled")) 1 else 0) +
    (if (node.has("label")) 2 else 0) +
    (if (node.has("alwaysShowLabel")) 4 else 0)
  when (mask) {
    0 -> androidx.compose.material3.NavigationRailItem(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `icon` = { RenderComposeChildren(node.slot("icon")) },
      `modifier` = node.modifier("modifier", scope),
    )
    1 -> androidx.compose.material3.NavigationRailItem(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `icon` = { RenderComposeChildren(node.slot("icon")) },
      `modifier` = node.modifier("modifier", scope),
      `enabled` = node.boolean("enabled"),
    )
    2 -> androidx.compose.material3.NavigationRailItem(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `icon` = { RenderComposeChildren(node.slot("icon")) },
      `modifier` = node.modifier("modifier", scope),
      `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
    )
    3 -> androidx.compose.material3.NavigationRailItem(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `icon` = { RenderComposeChildren(node.slot("icon")) },
      `modifier` = node.modifier("modifier", scope),
      `enabled` = node.boolean("enabled"),
      `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
    )
    4 -> androidx.compose.material3.NavigationRailItem(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `icon` = { RenderComposeChildren(node.slot("icon")) },
      `modifier` = node.modifier("modifier", scope),
      `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
    )
    5 -> androidx.compose.material3.NavigationRailItem(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `icon` = { RenderComposeChildren(node.slot("icon")) },
      `modifier` = node.modifier("modifier", scope),
      `enabled` = node.boolean("enabled"),
      `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
    )
    6 -> androidx.compose.material3.NavigationRailItem(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `icon` = { RenderComposeChildren(node.slot("icon")) },
      `modifier` = node.modifier("modifier", scope),
      `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
      `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
    )
    else -> androidx.compose.material3.NavigationRailItem(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `icon` = { RenderComposeChildren(node.slot("icon")) },
      `modifier` = node.modifier("modifier", scope),
      `enabled` = node.boolean("enabled"),
      `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
      `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
    )
  }
}

@Composable
private fun renderOutlinedButton(node: ComposeNode, scope: Any?) {
  val mask = (if (node.has("enabled")) 1 else 0)
  when (mask) {
    0 -> androidx.compose.material3.OutlinedButton(
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier", scope),
      content = { RenderComposeChildren(node.children, this) },
    )
    else -> androidx.compose.material3.OutlinedButton(
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier", scope),
      `enabled` = node.boolean("enabled"),
      content = { RenderComposeChildren(node.children, this) },
    )
  }
}

@Composable
private fun renderOutlinedCard(node: ComposeNode, scope: Any?) {
  androidx.compose.material3.OutlinedCard(
    `modifier` = node.modifier("modifier", scope),
    content = { RenderComposeChildren(node.children, this) },
  )
}

@Composable
private fun renderOutlinedIconButton(node: ComposeNode, scope: Any?) {
  val mask = (if (node.has("enabled")) 1 else 0)
  when (mask) {
    0 -> androidx.compose.material3.OutlinedIconButton(
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier", scope),
      content = { RenderComposeChildren(node.children) },
    )
    else -> androidx.compose.material3.OutlinedIconButton(
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier", scope),
      `enabled` = node.boolean("enabled"),
      content = { RenderComposeChildren(node.children) },
    )
  }
}

@Composable
private fun renderOutlinedIconToggleButton(node: ComposeNode, scope: Any?) {
  val mask = (if (node.has("enabled")) 1 else 0)
  when (mask) {
    0 -> androidx.compose.material3.OutlinedIconToggleButton(
      `checked` = node.boolean("checked"),
      `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
      `modifier` = node.modifier("modifier", scope),
      content = { RenderComposeChildren(node.children) },
    )
    else -> androidx.compose.material3.OutlinedIconToggleButton(
      `checked` = node.boolean("checked"),
      `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
      `modifier` = node.modifier("modifier", scope),
      `enabled` = node.boolean("enabled"),
      content = { RenderComposeChildren(node.children) },
    )
  }
}

@Composable
private fun renderOutlinedTextField(node: ComposeNode, scope: Any?) {
  val mask = (if (node.has("enabled")) 1 else 0) +
    (if (node.has("readOnly")) 2 else 0) +
    (if (node.has("label")) 4 else 0) +
    (if (node.has("placeholder")) 8 else 0)
  when (mask) {
    0 -> androidx.compose.material3.OutlinedTextField(
      `value` = node.string("value"),
      `onValueChange` = { value: String -> node.emit("onValueChange", value) },
      `modifier` = node.modifier("modifier", scope),
    )
    1 -> androidx.compose.material3.OutlinedTextField(
      `value` = node.string("value"),
      `onValueChange` = { value: String -> node.emit("onValueChange", value) },
      `modifier` = node.modifier("modifier", scope),
      `enabled` = node.boolean("enabled"),
    )
    2 -> androidx.compose.material3.OutlinedTextField(
      `value` = node.string("value"),
      `onValueChange` = { value: String -> node.emit("onValueChange", value) },
      `modifier` = node.modifier("modifier", scope),
      `readOnly` = node.boolean("readOnly"),
    )
    3 -> androidx.compose.material3.OutlinedTextField(
      `value` = node.string("value"),
      `onValueChange` = { value: String -> node.emit("onValueChange", value) },
      `modifier` = node.modifier("modifier", scope),
      `enabled` = node.boolean("enabled"),
      `readOnly` = node.boolean("readOnly"),
    )
    4 -> androidx.compose.material3.OutlinedTextField(
      `value` = node.string("value"),
      `onValueChange` = { value: String -> node.emit("onValueChange", value) },
      `modifier` = node.modifier("modifier", scope),
      `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
    )
    5 -> androidx.compose.material3.OutlinedTextField(
      `value` = node.string("value"),
      `onValueChange` = { value: String -> node.emit("onValueChange", value) },
      `modifier` = node.modifier("modifier", scope),
      `enabled` = node.boolean("enabled"),
      `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
    )
    6 -> androidx.compose.material3.OutlinedTextField(
      `value` = node.string("value"),
      `onValueChange` = { value: String -> node.emit("onValueChange", value) },
      `modifier` = node.modifier("modifier", scope),
      `readOnly` = node.boolean("readOnly"),
      `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
    )
    7 -> androidx.compose.material3.OutlinedTextField(
      `value` = node.string("value"),
      `onValueChange` = { value: String -> node.emit("onValueChange", value) },
      `modifier` = node.modifier("modifier", scope),
      `enabled` = node.boolean("enabled"),
      `readOnly` = node.boolean("readOnly"),
      `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
    )
    8 -> androidx.compose.material3.OutlinedTextField(
      `value` = node.string("value"),
      `onValueChange` = { value: String -> node.emit("onValueChange", value) },
      `modifier` = node.modifier("modifier", scope),
      `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
    )
    9 -> androidx.compose.material3.OutlinedTextField(
      `value` = node.string("value"),
      `onValueChange` = { value: String -> node.emit("onValueChange", value) },
      `modifier` = node.modifier("modifier", scope),
      `enabled` = node.boolean("enabled"),
      `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
    )
    10 -> androidx.compose.material3.OutlinedTextField(
      `value` = node.string("value"),
      `onValueChange` = { value: String -> node.emit("onValueChange", value) },
      `modifier` = node.modifier("modifier", scope),
      `readOnly` = node.boolean("readOnly"),
      `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
    )
    11 -> androidx.compose.material3.OutlinedTextField(
      `value` = node.string("value"),
      `onValueChange` = { value: String -> node.emit("onValueChange", value) },
      `modifier` = node.modifier("modifier", scope),
      `enabled` = node.boolean("enabled"),
      `readOnly` = node.boolean("readOnly"),
      `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
    )
    12 -> androidx.compose.material3.OutlinedTextField(
      `value` = node.string("value"),
      `onValueChange` = { value: String -> node.emit("onValueChange", value) },
      `modifier` = node.modifier("modifier", scope),
      `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
      `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
    )
    13 -> androidx.compose.material3.OutlinedTextField(
      `value` = node.string("value"),
      `onValueChange` = { value: String -> node.emit("onValueChange", value) },
      `modifier` = node.modifier("modifier", scope),
      `enabled` = node.boolean("enabled"),
      `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
      `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
    )
    14 -> androidx.compose.material3.OutlinedTextField(
      `value` = node.string("value"),
      `onValueChange` = { value: String -> node.emit("onValueChange", value) },
      `modifier` = node.modifier("modifier", scope),
      `readOnly` = node.boolean("readOnly"),
      `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
      `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
    )
    else -> androidx.compose.material3.OutlinedTextField(
      `value` = node.string("value"),
      `onValueChange` = { value: String -> node.emit("onValueChange", value) },
      `modifier` = node.modifier("modifier", scope),
      `enabled` = node.boolean("enabled"),
      `readOnly` = node.boolean("readOnly"),
      `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
      `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
    )
  }
}

@Composable
private fun renderPermanentDrawerSheet(node: ComposeNode, scope: Any?) {
  val mask = (if (node.has("drawerContainerColor")) 1 else 0) +
    (if (node.has("drawerContentColor")) 2 else 0) +
    (if (node.has("drawerTonalElevation")) 4 else 0)
  when (mask) {
    0 -> androidx.compose.material3.PermanentDrawerSheet(
      `modifier` = node.modifier("modifier", scope),
      content = { RenderComposeChildren(node.children, this) },
    )
    1 -> androidx.compose.material3.PermanentDrawerSheet(
      `modifier` = node.modifier("modifier", scope),
      `drawerContainerColor` = node.color("drawerContainerColor"),
      content = { RenderComposeChildren(node.children, this) },
    )
    2 -> androidx.compose.material3.PermanentDrawerSheet(
      `modifier` = node.modifier("modifier", scope),
      `drawerContentColor` = node.color("drawerContentColor"),
      content = { RenderComposeChildren(node.children, this) },
    )
    3 -> androidx.compose.material3.PermanentDrawerSheet(
      `modifier` = node.modifier("modifier", scope),
      `drawerContainerColor` = node.color("drawerContainerColor"),
      `drawerContentColor` = node.color("drawerContentColor"),
      content = { RenderComposeChildren(node.children, this) },
    )
    4 -> androidx.compose.material3.PermanentDrawerSheet(
      `modifier` = node.modifier("modifier", scope),
      `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
      content = { RenderComposeChildren(node.children, this) },
    )
    5 -> androidx.compose.material3.PermanentDrawerSheet(
      `modifier` = node.modifier("modifier", scope),
      `drawerContainerColor` = node.color("drawerContainerColor"),
      `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
      content = { RenderComposeChildren(node.children, this) },
    )
    6 -> androidx.compose.material3.PermanentDrawerSheet(
      `modifier` = node.modifier("modifier", scope),
      `drawerContentColor` = node.color("drawerContentColor"),
      `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
      content = { RenderComposeChildren(node.children, this) },
    )
    else -> androidx.compose.material3.PermanentDrawerSheet(
      `modifier` = node.modifier("modifier", scope),
      `drawerContainerColor` = node.color("drawerContainerColor"),
      `drawerContentColor` = node.color("drawerContentColor"),
      `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
      content = { RenderComposeChildren(node.children, this) },
    )
  }
}

@Composable
private fun renderPermanentNavigationDrawer(node: ComposeNode, scope: Any?) {
  androidx.compose.material3.PermanentNavigationDrawer(
    `drawerContent` = { RenderComposeChildren(node.slot("drawerContent")) },
    `modifier` = node.modifier("modifier", scope),
    content = { RenderComposeChildren(node.children) },
  )
}

@Composable
private fun renderRadioButton(node: ComposeNode, scope: Any?) {
  val mask = (if (node.has("enabled")) 1 else 0)
  when (mask) {
    0 -> androidx.compose.material3.RadioButton(
      `selected` = node.boolean("selected"),
      `onClick` = if (node.isNull("onClick")) null else ({ node.emit("onClick") }),
      `modifier` = node.modifier("modifier", scope),
    )
    else -> androidx.compose.material3.RadioButton(
      `selected` = node.boolean("selected"),
      `onClick` = if (node.isNull("onClick")) null else ({ node.emit("onClick") }),
      `modifier` = node.modifier("modifier", scope),
      `enabled` = node.boolean("enabled"),
    )
  }
}

@Composable
private fun renderRow(node: ComposeNode, scope: Any?) {
  val mask = (if (node.has("horizontalArrangement")) 1 else 0) +
    (if (node.has("verticalAlignment")) 2 else 0)
  when (mask) {
    0 -> androidx.compose.foundation.layout.Row(
      `modifier` = node.modifier("modifier", scope),
      content = { RenderComposeChildren(node.children, this) },
    )
    1 -> androidx.compose.foundation.layout.Row(
      `modifier` = node.modifier("modifier", scope),
      `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
      content = { RenderComposeChildren(node.children, this) },
    )
    2 -> androidx.compose.foundation.layout.Row(
      `modifier` = node.modifier("modifier", scope),
      `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
      content = { RenderComposeChildren(node.children, this) },
    )
    else -> androidx.compose.foundation.layout.Row(
      `modifier` = node.modifier("modifier", scope),
      `horizontalArrangement` = toComposeHorizontalArrangement(node.string("horizontalArrangement")),
      `verticalAlignment` = toComposeVerticalAlignment(node.string("verticalAlignment")),
      content = { RenderComposeChildren(node.children, this) },
    )
  }
}

@Composable
private fun renderScrollableTabRow(node: ComposeNode, scope: Any?) {
  val mask = (if (node.has("containerColor")) 1 else 0) +
    (if (node.has("contentColor")) 2 else 0) +
    (if (node.has("edgePadding")) 4 else 0) +
    (if (node.has("divider")) 8 else 0)
  when (mask) {
    0 -> androidx.compose.material3.ScrollableTabRow(
      `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
      `modifier` = node.modifier("modifier", scope),
      `tabs` = { RenderComposeChildren(node.slot("tabs")) },
    )
    1 -> androidx.compose.material3.ScrollableTabRow(
      `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
      `modifier` = node.modifier("modifier", scope),
      `containerColor` = node.color("containerColor"),
      `tabs` = { RenderComposeChildren(node.slot("tabs")) },
    )
    2 -> androidx.compose.material3.ScrollableTabRow(
      `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
      `modifier` = node.modifier("modifier", scope),
      `contentColor` = node.color("contentColor"),
      `tabs` = { RenderComposeChildren(node.slot("tabs")) },
    )
    3 -> androidx.compose.material3.ScrollableTabRow(
      `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
      `modifier` = node.modifier("modifier", scope),
      `containerColor` = node.color("containerColor"),
      `contentColor` = node.color("contentColor"),
      `tabs` = { RenderComposeChildren(node.slot("tabs")) },
    )
    4 -> androidx.compose.material3.ScrollableTabRow(
      `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
      `modifier` = node.modifier("modifier", scope),
      `edgePadding` = node.number("edgePadding").dp,
      `tabs` = { RenderComposeChildren(node.slot("tabs")) },
    )
    5 -> androidx.compose.material3.ScrollableTabRow(
      `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
      `modifier` = node.modifier("modifier", scope),
      `containerColor` = node.color("containerColor"),
      `edgePadding` = node.number("edgePadding").dp,
      `tabs` = { RenderComposeChildren(node.slot("tabs")) },
    )
    6 -> androidx.compose.material3.ScrollableTabRow(
      `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
      `modifier` = node.modifier("modifier", scope),
      `contentColor` = node.color("contentColor"),
      `edgePadding` = node.number("edgePadding").dp,
      `tabs` = { RenderComposeChildren(node.slot("tabs")) },
    )
    7 -> androidx.compose.material3.ScrollableTabRow(
      `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
      `modifier` = node.modifier("modifier", scope),
      `containerColor` = node.color("containerColor"),
      `contentColor` = node.color("contentColor"),
      `edgePadding` = node.number("edgePadding").dp,
      `tabs` = { RenderComposeChildren(node.slot("tabs")) },
    )
    8 -> androidx.compose.material3.ScrollableTabRow(
      `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
      `modifier` = node.modifier("modifier", scope),
      `divider` = { RenderComposeChildren(node.slot("divider")) },
      `tabs` = { RenderComposeChildren(node.slot("tabs")) },
    )
    9 -> androidx.compose.material3.ScrollableTabRow(
      `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
      `modifier` = node.modifier("modifier", scope),
      `containerColor` = node.color("containerColor"),
      `divider` = { RenderComposeChildren(node.slot("divider")) },
      `tabs` = { RenderComposeChildren(node.slot("tabs")) },
    )
    10 -> androidx.compose.material3.ScrollableTabRow(
      `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
      `modifier` = node.modifier("modifier", scope),
      `contentColor` = node.color("contentColor"),
      `divider` = { RenderComposeChildren(node.slot("divider")) },
      `tabs` = { RenderComposeChildren(node.slot("tabs")) },
    )
    11 -> androidx.compose.material3.ScrollableTabRow(
      `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
      `modifier` = node.modifier("modifier", scope),
      `containerColor` = node.color("containerColor"),
      `contentColor` = node.color("contentColor"),
      `divider` = { RenderComposeChildren(node.slot("divider")) },
      `tabs` = { RenderComposeChildren(node.slot("tabs")) },
    )
    12 -> androidx.compose.material3.ScrollableTabRow(
      `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
      `modifier` = node.modifier("modifier", scope),
      `edgePadding` = node.number("edgePadding").dp,
      `divider` = { RenderComposeChildren(node.slot("divider")) },
      `tabs` = { RenderComposeChildren(node.slot("tabs")) },
    )
    13 -> androidx.compose.material3.ScrollableTabRow(
      `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
      `modifier` = node.modifier("modifier", scope),
      `containerColor` = node.color("containerColor"),
      `edgePadding` = node.number("edgePadding").dp,
      `divider` = { RenderComposeChildren(node.slot("divider")) },
      `tabs` = { RenderComposeChildren(node.slot("tabs")) },
    )
    14 -> androidx.compose.material3.ScrollableTabRow(
      `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
      `modifier` = node.modifier("modifier", scope),
      `contentColor` = node.color("contentColor"),
      `edgePadding` = node.number("edgePadding").dp,
      `divider` = { RenderComposeChildren(node.slot("divider")) },
      `tabs` = { RenderComposeChildren(node.slot("tabs")) },
    )
    else -> androidx.compose.material3.ScrollableTabRow(
      `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
      `modifier` = node.modifier("modifier", scope),
      `containerColor` = node.color("containerColor"),
      `contentColor` = node.color("contentColor"),
      `edgePadding` = node.number("edgePadding").dp,
      `divider` = { RenderComposeChildren(node.slot("divider")) },
      `tabs` = { RenderComposeChildren(node.slot("tabs")) },
    )
  }
}

@Composable
private fun renderSmallFloatingActionButton(node: ComposeNode, scope: Any?) {
  val mask = (if (node.has("containerColor")) 1 else 0) +
    (if (node.has("contentColor")) 2 else 0)
  when (mask) {
    0 -> androidx.compose.material3.SmallFloatingActionButton(
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier", scope),
      content = { RenderComposeChildren(node.children) },
    )
    1 -> androidx.compose.material3.SmallFloatingActionButton(
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier", scope),
      `containerColor` = node.color("containerColor"),
      content = { RenderComposeChildren(node.children) },
    )
    2 -> androidx.compose.material3.SmallFloatingActionButton(
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier", scope),
      `contentColor` = node.color("contentColor"),
      content = { RenderComposeChildren(node.children) },
    )
    else -> androidx.compose.material3.SmallFloatingActionButton(
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier", scope),
      `containerColor` = node.color("containerColor"),
      `contentColor` = node.color("contentColor"),
      content = { RenderComposeChildren(node.children) },
    )
  }
}

@Composable
private fun renderSnackbar(node: ComposeNode, scope: Any?) {
  val mask = (if (node.has("action")) 1 else 0) +
    (if (node.has("dismissAction")) 2 else 0) +
    (if (node.has("actionOnNewLine")) 4 else 0) +
    (if (node.has("containerColor")) 8 else 0)
  when (mask) {
    0 -> androidx.compose.material3.Snackbar(
      `modifier` = node.modifier("modifier", scope),
      content = { RenderComposeChildren(node.children) },
    )
    1 -> androidx.compose.material3.Snackbar(
      `modifier` = node.modifier("modifier", scope),
      `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
      content = { RenderComposeChildren(node.children) },
    )
    2 -> androidx.compose.material3.Snackbar(
      `modifier` = node.modifier("modifier", scope),
      `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
      content = { RenderComposeChildren(node.children) },
    )
    3 -> androidx.compose.material3.Snackbar(
      `modifier` = node.modifier("modifier", scope),
      `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
      `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
      content = { RenderComposeChildren(node.children) },
    )
    4 -> androidx.compose.material3.Snackbar(
      `modifier` = node.modifier("modifier", scope),
      `actionOnNewLine` = node.boolean("actionOnNewLine"),
      content = { RenderComposeChildren(node.children) },
    )
    5 -> androidx.compose.material3.Snackbar(
      `modifier` = node.modifier("modifier", scope),
      `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
      `actionOnNewLine` = node.boolean("actionOnNewLine"),
      content = { RenderComposeChildren(node.children) },
    )
    6 -> androidx.compose.material3.Snackbar(
      `modifier` = node.modifier("modifier", scope),
      `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
      `actionOnNewLine` = node.boolean("actionOnNewLine"),
      content = { RenderComposeChildren(node.children) },
    )
    7 -> androidx.compose.material3.Snackbar(
      `modifier` = node.modifier("modifier", scope),
      `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
      `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
      `actionOnNewLine` = node.boolean("actionOnNewLine"),
      content = { RenderComposeChildren(node.children) },
    )
    8 -> androidx.compose.material3.Snackbar(
      `modifier` = node.modifier("modifier", scope),
      `containerColor` = node.color("containerColor"),
      content = { RenderComposeChildren(node.children) },
    )
    9 -> androidx.compose.material3.Snackbar(
      `modifier` = node.modifier("modifier", scope),
      `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
      `containerColor` = node.color("containerColor"),
      content = { RenderComposeChildren(node.children) },
    )
    10 -> androidx.compose.material3.Snackbar(
      `modifier` = node.modifier("modifier", scope),
      `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
      `containerColor` = node.color("containerColor"),
      content = { RenderComposeChildren(node.children) },
    )
    11 -> androidx.compose.material3.Snackbar(
      `modifier` = node.modifier("modifier", scope),
      `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
      `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
      `containerColor` = node.color("containerColor"),
      content = { RenderComposeChildren(node.children) },
    )
    12 -> androidx.compose.material3.Snackbar(
      `modifier` = node.modifier("modifier", scope),
      `actionOnNewLine` = node.boolean("actionOnNewLine"),
      `containerColor` = node.color("containerColor"),
      content = { RenderComposeChildren(node.children) },
    )
    13 -> androidx.compose.material3.Snackbar(
      `modifier` = node.modifier("modifier", scope),
      `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
      `actionOnNewLine` = node.boolean("actionOnNewLine"),
      `containerColor` = node.color("containerColor"),
      content = { RenderComposeChildren(node.children) },
    )
    14 -> androidx.compose.material3.Snackbar(
      `modifier` = node.modifier("modifier", scope),
      `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
      `actionOnNewLine` = node.boolean("actionOnNewLine"),
      `containerColor` = node.color("containerColor"),
      content = { RenderComposeChildren(node.children) },
    )
    else -> androidx.compose.material3.Snackbar(
      `modifier` = node.modifier("modifier", scope),
      `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
      `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
      `actionOnNewLine` = node.boolean("actionOnNewLine"),
      `containerColor` = node.color("containerColor"),
      content = { RenderComposeChildren(node.children) },
    )
  }
}

@Composable
private fun renderSpacer(node: ComposeNode, scope: Any?) {
  androidx.compose.foundation.layout.Spacer(
    `modifier` = node.modifier("modifier", scope),
  )
}

@Composable
private fun renderSuggestionChip(node: ComposeNode, scope: Any?) {
  val mask = (if (node.has("enabled")) 1 else 0) +
    (if (node.has("icon")) 2 else 0)
  when (mask) {
    0 -> androidx.compose.material3.SuggestionChip(
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier", scope),
    )
    1 -> androidx.compose.material3.SuggestionChip(
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier", scope),
      `enabled` = node.boolean("enabled"),
    )
    2 -> androidx.compose.material3.SuggestionChip(
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier", scope),
      `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
    )
    else -> androidx.compose.material3.SuggestionChip(
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier", scope),
      `enabled` = node.boolean("enabled"),
      `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
    )
  }
}

@Composable
private fun renderSurface(node: ComposeNode, scope: Any?) {
  val mask = (if (node.has("color")) 1 else 0) +
    (if (node.has("contentColor")) 2 else 0) +
    (if (node.has("tonalElevation")) 4 else 0) +
    (if (node.has("shadowElevation")) 8 else 0)
  when (mask) {
    0 -> androidx.compose.material3.Surface(
      `modifier` = node.modifier("modifier", scope),
      content = { RenderComposeChildren(node.children) },
    )
    1 -> androidx.compose.material3.Surface(
      `modifier` = node.modifier("modifier", scope),
      `color` = node.color("color"),
      content = { RenderComposeChildren(node.children) },
    )
    2 -> androidx.compose.material3.Surface(
      `modifier` = node.modifier("modifier", scope),
      `contentColor` = node.color("contentColor"),
      content = { RenderComposeChildren(node.children) },
    )
    3 -> androidx.compose.material3.Surface(
      `modifier` = node.modifier("modifier", scope),
      `color` = node.color("color"),
      `contentColor` = node.color("contentColor"),
      content = { RenderComposeChildren(node.children) },
    )
    4 -> androidx.compose.material3.Surface(
      `modifier` = node.modifier("modifier", scope),
      `tonalElevation` = node.number("tonalElevation").dp,
      content = { RenderComposeChildren(node.children) },
    )
    5 -> androidx.compose.material3.Surface(
      `modifier` = node.modifier("modifier", scope),
      `color` = node.color("color"),
      `tonalElevation` = node.number("tonalElevation").dp,
      content = { RenderComposeChildren(node.children) },
    )
    6 -> androidx.compose.material3.Surface(
      `modifier` = node.modifier("modifier", scope),
      `contentColor` = node.color("contentColor"),
      `tonalElevation` = node.number("tonalElevation").dp,
      content = { RenderComposeChildren(node.children) },
    )
    7 -> androidx.compose.material3.Surface(
      `modifier` = node.modifier("modifier", scope),
      `color` = node.color("color"),
      `contentColor` = node.color("contentColor"),
      `tonalElevation` = node.number("tonalElevation").dp,
      content = { RenderComposeChildren(node.children) },
    )
    8 -> androidx.compose.material3.Surface(
      `modifier` = node.modifier("modifier", scope),
      `shadowElevation` = node.number("shadowElevation").dp,
      content = { RenderComposeChildren(node.children) },
    )
    9 -> androidx.compose.material3.Surface(
      `modifier` = node.modifier("modifier", scope),
      `color` = node.color("color"),
      `shadowElevation` = node.number("shadowElevation").dp,
      content = { RenderComposeChildren(node.children) },
    )
    10 -> androidx.compose.material3.Surface(
      `modifier` = node.modifier("modifier", scope),
      `contentColor` = node.color("contentColor"),
      `shadowElevation` = node.number("shadowElevation").dp,
      content = { RenderComposeChildren(node.children) },
    )
    11 -> androidx.compose.material3.Surface(
      `modifier` = node.modifier("modifier", scope),
      `color` = node.color("color"),
      `contentColor` = node.color("contentColor"),
      `shadowElevation` = node.number("shadowElevation").dp,
      content = { RenderComposeChildren(node.children) },
    )
    12 -> androidx.compose.material3.Surface(
      `modifier` = node.modifier("modifier", scope),
      `tonalElevation` = node.number("tonalElevation").dp,
      `shadowElevation` = node.number("shadowElevation").dp,
      content = { RenderComposeChildren(node.children) },
    )
    13 -> androidx.compose.material3.Surface(
      `modifier` = node.modifier("modifier", scope),
      `color` = node.color("color"),
      `tonalElevation` = node.number("tonalElevation").dp,
      `shadowElevation` = node.number("shadowElevation").dp,
      content = { RenderComposeChildren(node.children) },
    )
    14 -> androidx.compose.material3.Surface(
      `modifier` = node.modifier("modifier", scope),
      `contentColor` = node.color("contentColor"),
      `tonalElevation` = node.number("tonalElevation").dp,
      `shadowElevation` = node.number("shadowElevation").dp,
      content = { RenderComposeChildren(node.children) },
    )
    else -> androidx.compose.material3.Surface(
      `modifier` = node.modifier("modifier", scope),
      `color` = node.color("color"),
      `contentColor` = node.color("contentColor"),
      `tonalElevation` = node.number("tonalElevation").dp,
      `shadowElevation` = node.number("shadowElevation").dp,
      content = { RenderComposeChildren(node.children) },
    )
  }
}

@Composable
private fun renderSwitch(node: ComposeNode, scope: Any?) {
  val mask = (if (node.has("thumbContent")) 1 else 0) +
    (if (node.has("enabled")) 2 else 0)
  when (mask) {
    0 -> androidx.compose.material3.Switch(
      `checked` = node.boolean("checked"),
      `onCheckedChange` = if (node.isNull("onCheckedChange")) null else ({ value: Boolean -> node.emit("onCheckedChange", value) }),
      `modifier` = node.modifier("modifier", scope),
    )
    1 -> androidx.compose.material3.Switch(
      `checked` = node.boolean("checked"),
      `onCheckedChange` = if (node.isNull("onCheckedChange")) null else ({ value: Boolean -> node.emit("onCheckedChange", value) }),
      `modifier` = node.modifier("modifier", scope),
      `thumbContent` = if (node.isNull("thumbContent")) null else ({ RenderComposeChildren(node.slot("thumbContent")) }),
    )
    2 -> androidx.compose.material3.Switch(
      `checked` = node.boolean("checked"),
      `onCheckedChange` = if (node.isNull("onCheckedChange")) null else ({ value: Boolean -> node.emit("onCheckedChange", value) }),
      `modifier` = node.modifier("modifier", scope),
      `enabled` = node.boolean("enabled"),
    )
    else -> androidx.compose.material3.Switch(
      `checked` = node.boolean("checked"),
      `onCheckedChange` = if (node.isNull("onCheckedChange")) null else ({ value: Boolean -> node.emit("onCheckedChange", value) }),
      `modifier` = node.modifier("modifier", scope),
      `thumbContent` = if (node.isNull("thumbContent")) null else ({ RenderComposeChildren(node.slot("thumbContent")) }),
      `enabled` = node.boolean("enabled"),
    )
  }
}

@Composable
private fun renderTab(node: ComposeNode, scope: Any?) {
  val mask = (if (node.has("enabled")) 1 else 0) +
    (if (node.has("text")) 2 else 0) +
    (if (node.has("icon")) 4 else 0) +
    (if (node.has("selectedContentColor")) 8 else 0)
  when (mask) {
    0 -> androidx.compose.material3.Tab(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier", scope),
    )
    1 -> androidx.compose.material3.Tab(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier", scope),
      `enabled` = node.boolean("enabled"),
    )
    2 -> androidx.compose.material3.Tab(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier", scope),
      `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
    )
    3 -> androidx.compose.material3.Tab(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier", scope),
      `enabled` = node.boolean("enabled"),
      `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
    )
    4 -> androidx.compose.material3.Tab(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier", scope),
      `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
    )
    5 -> androidx.compose.material3.Tab(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier", scope),
      `enabled` = node.boolean("enabled"),
      `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
    )
    6 -> androidx.compose.material3.Tab(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier", scope),
      `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
      `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
    )
    7 -> androidx.compose.material3.Tab(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier", scope),
      `enabled` = node.boolean("enabled"),
      `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
      `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
    )
    8 -> androidx.compose.material3.Tab(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier", scope),
      `selectedContentColor` = node.color("selectedContentColor"),
    )
    9 -> androidx.compose.material3.Tab(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier", scope),
      `enabled` = node.boolean("enabled"),
      `selectedContentColor` = node.color("selectedContentColor"),
    )
    10 -> androidx.compose.material3.Tab(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier", scope),
      `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
      `selectedContentColor` = node.color("selectedContentColor"),
    )
    11 -> androidx.compose.material3.Tab(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier", scope),
      `enabled` = node.boolean("enabled"),
      `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
      `selectedContentColor` = node.color("selectedContentColor"),
    )
    12 -> androidx.compose.material3.Tab(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier", scope),
      `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
      `selectedContentColor` = node.color("selectedContentColor"),
    )
    13 -> androidx.compose.material3.Tab(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier", scope),
      `enabled` = node.boolean("enabled"),
      `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
      `selectedContentColor` = node.color("selectedContentColor"),
    )
    14 -> androidx.compose.material3.Tab(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier", scope),
      `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
      `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
      `selectedContentColor` = node.color("selectedContentColor"),
    )
    else -> androidx.compose.material3.Tab(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier", scope),
      `enabled` = node.boolean("enabled"),
      `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
      `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
      `selectedContentColor` = node.color("selectedContentColor"),
    )
  }
}

@Composable
private fun renderTabRow(node: ComposeNode, scope: Any?) {
  val mask = (if (node.has("containerColor")) 1 else 0) +
    (if (node.has("contentColor")) 2 else 0) +
    (if (node.has("divider")) 4 else 0)
  when (mask) {
    0 -> androidx.compose.material3.TabRow(
      `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
      `modifier` = node.modifier("modifier", scope),
      `tabs` = { RenderComposeChildren(node.slot("tabs")) },
    )
    1 -> androidx.compose.material3.TabRow(
      `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
      `modifier` = node.modifier("modifier", scope),
      `containerColor` = node.color("containerColor"),
      `tabs` = { RenderComposeChildren(node.slot("tabs")) },
    )
    2 -> androidx.compose.material3.TabRow(
      `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
      `modifier` = node.modifier("modifier", scope),
      `contentColor` = node.color("contentColor"),
      `tabs` = { RenderComposeChildren(node.slot("tabs")) },
    )
    3 -> androidx.compose.material3.TabRow(
      `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
      `modifier` = node.modifier("modifier", scope),
      `containerColor` = node.color("containerColor"),
      `contentColor` = node.color("contentColor"),
      `tabs` = { RenderComposeChildren(node.slot("tabs")) },
    )
    4 -> androidx.compose.material3.TabRow(
      `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
      `modifier` = node.modifier("modifier", scope),
      `divider` = { RenderComposeChildren(node.slot("divider")) },
      `tabs` = { RenderComposeChildren(node.slot("tabs")) },
    )
    5 -> androidx.compose.material3.TabRow(
      `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
      `modifier` = node.modifier("modifier", scope),
      `containerColor` = node.color("containerColor"),
      `divider` = { RenderComposeChildren(node.slot("divider")) },
      `tabs` = { RenderComposeChildren(node.slot("tabs")) },
    )
    6 -> androidx.compose.material3.TabRow(
      `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
      `modifier` = node.modifier("modifier", scope),
      `contentColor` = node.color("contentColor"),
      `divider` = { RenderComposeChildren(node.slot("divider")) },
      `tabs` = { RenderComposeChildren(node.slot("tabs")) },
    )
    else -> androidx.compose.material3.TabRow(
      `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
      `modifier` = node.modifier("modifier", scope),
      `containerColor` = node.color("containerColor"),
      `contentColor` = node.color("contentColor"),
      `divider` = { RenderComposeChildren(node.slot("divider")) },
      `tabs` = { RenderComposeChildren(node.slot("tabs")) },
    )
  }
}

@Composable
private fun renderText(node: ComposeNode, scope: Any?) {
  val mask = (if (node.has("color")) 1 else 0) +
    (if (node.has("fontSize")) 2 else 0) +
    (if (node.has("letterSpacing")) 4 else 0) +
    (if (node.has("lineHeight")) 8 else 0) +
    (if (node.has("fontWeight")) 16 else 0) +
    (if (node.has("textAlign")) 32 else 0) +
    (if (node.has("overflow")) 64 else 0)
  when (mask) {
    0 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
    )
    1 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `color` = node.color("color"),
    )
    2 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `fontSize` = node.number("fontSize").sp,
    )
    3 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `color` = node.color("color"),
      `fontSize` = node.number("fontSize").sp,
    )
    4 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `letterSpacing` = node.number("letterSpacing").sp,
    )
    5 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `color` = node.color("color"),
      `letterSpacing` = node.number("letterSpacing").sp,
    )
    6 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `fontSize` = node.number("fontSize").sp,
      `letterSpacing` = node.number("letterSpacing").sp,
    )
    7 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `color` = node.color("color"),
      `fontSize` = node.number("fontSize").sp,
      `letterSpacing` = node.number("letterSpacing").sp,
    )
    8 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `lineHeight` = node.number("lineHeight").sp,
    )
    9 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `color` = node.color("color"),
      `lineHeight` = node.number("lineHeight").sp,
    )
    10 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `fontSize` = node.number("fontSize").sp,
      `lineHeight` = node.number("lineHeight").sp,
    )
    11 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `color` = node.color("color"),
      `fontSize` = node.number("fontSize").sp,
      `lineHeight` = node.number("lineHeight").sp,
    )
    12 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `letterSpacing` = node.number("letterSpacing").sp,
      `lineHeight` = node.number("lineHeight").sp,
    )
    13 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `color` = node.color("color"),
      `letterSpacing` = node.number("letterSpacing").sp,
      `lineHeight` = node.number("lineHeight").sp,
    )
    14 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `fontSize` = node.number("fontSize").sp,
      `letterSpacing` = node.number("letterSpacing").sp,
      `lineHeight` = node.number("lineHeight").sp,
    )
    15 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `color` = node.color("color"),
      `fontSize` = node.number("fontSize").sp,
      `letterSpacing` = node.number("letterSpacing").sp,
      `lineHeight` = node.number("lineHeight").sp,
    )
    16 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
    )
    17 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `color` = node.color("color"),
      `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
    )
    18 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `fontSize` = node.number("fontSize").sp,
      `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
    )
    19 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `color` = node.color("color"),
      `fontSize` = node.number("fontSize").sp,
      `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
    )
    20 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `letterSpacing` = node.number("letterSpacing").sp,
      `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
    )
    21 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `color` = node.color("color"),
      `letterSpacing` = node.number("letterSpacing").sp,
      `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
    )
    22 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `fontSize` = node.number("fontSize").sp,
      `letterSpacing` = node.number("letterSpacing").sp,
      `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
    )
    23 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `color` = node.color("color"),
      `fontSize` = node.number("fontSize").sp,
      `letterSpacing` = node.number("letterSpacing").sp,
      `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
    )
    24 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `lineHeight` = node.number("lineHeight").sp,
      `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
    )
    25 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `color` = node.color("color"),
      `lineHeight` = node.number("lineHeight").sp,
      `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
    )
    26 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `fontSize` = node.number("fontSize").sp,
      `lineHeight` = node.number("lineHeight").sp,
      `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
    )
    27 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `color` = node.color("color"),
      `fontSize` = node.number("fontSize").sp,
      `lineHeight` = node.number("lineHeight").sp,
      `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
    )
    28 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `letterSpacing` = node.number("letterSpacing").sp,
      `lineHeight` = node.number("lineHeight").sp,
      `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
    )
    29 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `color` = node.color("color"),
      `letterSpacing` = node.number("letterSpacing").sp,
      `lineHeight` = node.number("lineHeight").sp,
      `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
    )
    30 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `fontSize` = node.number("fontSize").sp,
      `letterSpacing` = node.number("letterSpacing").sp,
      `lineHeight` = node.number("lineHeight").sp,
      `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
    )
    31 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `color` = node.color("color"),
      `fontSize` = node.number("fontSize").sp,
      `letterSpacing` = node.number("letterSpacing").sp,
      `lineHeight` = node.number("lineHeight").sp,
      `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
    )
    32 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
    )
    33 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `color` = node.color("color"),
      `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
    )
    34 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `fontSize` = node.number("fontSize").sp,
      `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
    )
    35 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `color` = node.color("color"),
      `fontSize` = node.number("fontSize").sp,
      `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
    )
    36 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `letterSpacing` = node.number("letterSpacing").sp,
      `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
    )
    37 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `color` = node.color("color"),
      `letterSpacing` = node.number("letterSpacing").sp,
      `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
    )
    38 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `fontSize` = node.number("fontSize").sp,
      `letterSpacing` = node.number("letterSpacing").sp,
      `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
    )
    39 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `color` = node.color("color"),
      `fontSize` = node.number("fontSize").sp,
      `letterSpacing` = node.number("letterSpacing").sp,
      `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
    )
    40 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `lineHeight` = node.number("lineHeight").sp,
      `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
    )
    41 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `color` = node.color("color"),
      `lineHeight` = node.number("lineHeight").sp,
      `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
    )
    42 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `fontSize` = node.number("fontSize").sp,
      `lineHeight` = node.number("lineHeight").sp,
      `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
    )
    43 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `color` = node.color("color"),
      `fontSize` = node.number("fontSize").sp,
      `lineHeight` = node.number("lineHeight").sp,
      `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
    )
    44 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `letterSpacing` = node.number("letterSpacing").sp,
      `lineHeight` = node.number("lineHeight").sp,
      `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
    )
    45 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `color` = node.color("color"),
      `letterSpacing` = node.number("letterSpacing").sp,
      `lineHeight` = node.number("lineHeight").sp,
      `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
    )
    46 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `fontSize` = node.number("fontSize").sp,
      `letterSpacing` = node.number("letterSpacing").sp,
      `lineHeight` = node.number("lineHeight").sp,
      `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
    )
    47 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `color` = node.color("color"),
      `fontSize` = node.number("fontSize").sp,
      `letterSpacing` = node.number("letterSpacing").sp,
      `lineHeight` = node.number("lineHeight").sp,
      `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
    )
    48 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
      `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
    )
    49 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `color` = node.color("color"),
      `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
      `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
    )
    50 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `fontSize` = node.number("fontSize").sp,
      `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
      `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
    )
    51 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `color` = node.color("color"),
      `fontSize` = node.number("fontSize").sp,
      `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
      `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
    )
    52 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `letterSpacing` = node.number("letterSpacing").sp,
      `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
      `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
    )
    53 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `color` = node.color("color"),
      `letterSpacing` = node.number("letterSpacing").sp,
      `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
      `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
    )
    54 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `fontSize` = node.number("fontSize").sp,
      `letterSpacing` = node.number("letterSpacing").sp,
      `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
      `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
    )
    55 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `color` = node.color("color"),
      `fontSize` = node.number("fontSize").sp,
      `letterSpacing` = node.number("letterSpacing").sp,
      `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
      `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
    )
    56 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `lineHeight` = node.number("lineHeight").sp,
      `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
      `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
    )
    57 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `color` = node.color("color"),
      `lineHeight` = node.number("lineHeight").sp,
      `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
      `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
    )
    58 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `fontSize` = node.number("fontSize").sp,
      `lineHeight` = node.number("lineHeight").sp,
      `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
      `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
    )
    59 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `color` = node.color("color"),
      `fontSize` = node.number("fontSize").sp,
      `lineHeight` = node.number("lineHeight").sp,
      `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
      `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
    )
    60 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `letterSpacing` = node.number("letterSpacing").sp,
      `lineHeight` = node.number("lineHeight").sp,
      `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
      `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
    )
    61 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `color` = node.color("color"),
      `letterSpacing` = node.number("letterSpacing").sp,
      `lineHeight` = node.number("lineHeight").sp,
      `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
      `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
    )
    62 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `fontSize` = node.number("fontSize").sp,
      `letterSpacing` = node.number("letterSpacing").sp,
      `lineHeight` = node.number("lineHeight").sp,
      `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
      `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
    )
    63 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `color` = node.color("color"),
      `fontSize` = node.number("fontSize").sp,
      `letterSpacing` = node.number("letterSpacing").sp,
      `lineHeight` = node.number("lineHeight").sp,
      `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
      `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
    )
    64 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `overflow` = toComposeTextOverflow(node.string("overflow")),
    )
    65 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `color` = node.color("color"),
      `overflow` = toComposeTextOverflow(node.string("overflow")),
    )
    66 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `fontSize` = node.number("fontSize").sp,
      `overflow` = toComposeTextOverflow(node.string("overflow")),
    )
    67 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `color` = node.color("color"),
      `fontSize` = node.number("fontSize").sp,
      `overflow` = toComposeTextOverflow(node.string("overflow")),
    )
    68 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `letterSpacing` = node.number("letterSpacing").sp,
      `overflow` = toComposeTextOverflow(node.string("overflow")),
    )
    69 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `color` = node.color("color"),
      `letterSpacing` = node.number("letterSpacing").sp,
      `overflow` = toComposeTextOverflow(node.string("overflow")),
    )
    70 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `fontSize` = node.number("fontSize").sp,
      `letterSpacing` = node.number("letterSpacing").sp,
      `overflow` = toComposeTextOverflow(node.string("overflow")),
    )
    71 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `color` = node.color("color"),
      `fontSize` = node.number("fontSize").sp,
      `letterSpacing` = node.number("letterSpacing").sp,
      `overflow` = toComposeTextOverflow(node.string("overflow")),
    )
    72 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `lineHeight` = node.number("lineHeight").sp,
      `overflow` = toComposeTextOverflow(node.string("overflow")),
    )
    73 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `color` = node.color("color"),
      `lineHeight` = node.number("lineHeight").sp,
      `overflow` = toComposeTextOverflow(node.string("overflow")),
    )
    74 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `fontSize` = node.number("fontSize").sp,
      `lineHeight` = node.number("lineHeight").sp,
      `overflow` = toComposeTextOverflow(node.string("overflow")),
    )
    75 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `color` = node.color("color"),
      `fontSize` = node.number("fontSize").sp,
      `lineHeight` = node.number("lineHeight").sp,
      `overflow` = toComposeTextOverflow(node.string("overflow")),
    )
    76 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `letterSpacing` = node.number("letterSpacing").sp,
      `lineHeight` = node.number("lineHeight").sp,
      `overflow` = toComposeTextOverflow(node.string("overflow")),
    )
    77 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `color` = node.color("color"),
      `letterSpacing` = node.number("letterSpacing").sp,
      `lineHeight` = node.number("lineHeight").sp,
      `overflow` = toComposeTextOverflow(node.string("overflow")),
    )
    78 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `fontSize` = node.number("fontSize").sp,
      `letterSpacing` = node.number("letterSpacing").sp,
      `lineHeight` = node.number("lineHeight").sp,
      `overflow` = toComposeTextOverflow(node.string("overflow")),
    )
    79 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `color` = node.color("color"),
      `fontSize` = node.number("fontSize").sp,
      `letterSpacing` = node.number("letterSpacing").sp,
      `lineHeight` = node.number("lineHeight").sp,
      `overflow` = toComposeTextOverflow(node.string("overflow")),
    )
    80 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
      `overflow` = toComposeTextOverflow(node.string("overflow")),
    )
    81 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `color` = node.color("color"),
      `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
      `overflow` = toComposeTextOverflow(node.string("overflow")),
    )
    82 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `fontSize` = node.number("fontSize").sp,
      `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
      `overflow` = toComposeTextOverflow(node.string("overflow")),
    )
    83 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `color` = node.color("color"),
      `fontSize` = node.number("fontSize").sp,
      `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
      `overflow` = toComposeTextOverflow(node.string("overflow")),
    )
    84 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `letterSpacing` = node.number("letterSpacing").sp,
      `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
      `overflow` = toComposeTextOverflow(node.string("overflow")),
    )
    85 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `color` = node.color("color"),
      `letterSpacing` = node.number("letterSpacing").sp,
      `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
      `overflow` = toComposeTextOverflow(node.string("overflow")),
    )
    86 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `fontSize` = node.number("fontSize").sp,
      `letterSpacing` = node.number("letterSpacing").sp,
      `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
      `overflow` = toComposeTextOverflow(node.string("overflow")),
    )
    87 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `color` = node.color("color"),
      `fontSize` = node.number("fontSize").sp,
      `letterSpacing` = node.number("letterSpacing").sp,
      `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
      `overflow` = toComposeTextOverflow(node.string("overflow")),
    )
    88 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `lineHeight` = node.number("lineHeight").sp,
      `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
      `overflow` = toComposeTextOverflow(node.string("overflow")),
    )
    89 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `color` = node.color("color"),
      `lineHeight` = node.number("lineHeight").sp,
      `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
      `overflow` = toComposeTextOverflow(node.string("overflow")),
    )
    90 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `fontSize` = node.number("fontSize").sp,
      `lineHeight` = node.number("lineHeight").sp,
      `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
      `overflow` = toComposeTextOverflow(node.string("overflow")),
    )
    91 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `color` = node.color("color"),
      `fontSize` = node.number("fontSize").sp,
      `lineHeight` = node.number("lineHeight").sp,
      `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
      `overflow` = toComposeTextOverflow(node.string("overflow")),
    )
    92 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `letterSpacing` = node.number("letterSpacing").sp,
      `lineHeight` = node.number("lineHeight").sp,
      `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
      `overflow` = toComposeTextOverflow(node.string("overflow")),
    )
    93 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `color` = node.color("color"),
      `letterSpacing` = node.number("letterSpacing").sp,
      `lineHeight` = node.number("lineHeight").sp,
      `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
      `overflow` = toComposeTextOverflow(node.string("overflow")),
    )
    94 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `fontSize` = node.number("fontSize").sp,
      `letterSpacing` = node.number("letterSpacing").sp,
      `lineHeight` = node.number("lineHeight").sp,
      `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
      `overflow` = toComposeTextOverflow(node.string("overflow")),
    )
    95 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `color` = node.color("color"),
      `fontSize` = node.number("fontSize").sp,
      `letterSpacing` = node.number("letterSpacing").sp,
      `lineHeight` = node.number("lineHeight").sp,
      `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
      `overflow` = toComposeTextOverflow(node.string("overflow")),
    )
    96 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
      `overflow` = toComposeTextOverflow(node.string("overflow")),
    )
    97 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `color` = node.color("color"),
      `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
      `overflow` = toComposeTextOverflow(node.string("overflow")),
    )
    98 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `fontSize` = node.number("fontSize").sp,
      `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
      `overflow` = toComposeTextOverflow(node.string("overflow")),
    )
    99 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `color` = node.color("color"),
      `fontSize` = node.number("fontSize").sp,
      `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
      `overflow` = toComposeTextOverflow(node.string("overflow")),
    )
    100 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `letterSpacing` = node.number("letterSpacing").sp,
      `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
      `overflow` = toComposeTextOverflow(node.string("overflow")),
    )
    101 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `color` = node.color("color"),
      `letterSpacing` = node.number("letterSpacing").sp,
      `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
      `overflow` = toComposeTextOverflow(node.string("overflow")),
    )
    102 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `fontSize` = node.number("fontSize").sp,
      `letterSpacing` = node.number("letterSpacing").sp,
      `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
      `overflow` = toComposeTextOverflow(node.string("overflow")),
    )
    103 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `color` = node.color("color"),
      `fontSize` = node.number("fontSize").sp,
      `letterSpacing` = node.number("letterSpacing").sp,
      `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
      `overflow` = toComposeTextOverflow(node.string("overflow")),
    )
    104 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `lineHeight` = node.number("lineHeight").sp,
      `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
      `overflow` = toComposeTextOverflow(node.string("overflow")),
    )
    105 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `color` = node.color("color"),
      `lineHeight` = node.number("lineHeight").sp,
      `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
      `overflow` = toComposeTextOverflow(node.string("overflow")),
    )
    106 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `fontSize` = node.number("fontSize").sp,
      `lineHeight` = node.number("lineHeight").sp,
      `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
      `overflow` = toComposeTextOverflow(node.string("overflow")),
    )
    107 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `color` = node.color("color"),
      `fontSize` = node.number("fontSize").sp,
      `lineHeight` = node.number("lineHeight").sp,
      `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
      `overflow` = toComposeTextOverflow(node.string("overflow")),
    )
    108 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `letterSpacing` = node.number("letterSpacing").sp,
      `lineHeight` = node.number("lineHeight").sp,
      `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
      `overflow` = toComposeTextOverflow(node.string("overflow")),
    )
    109 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `color` = node.color("color"),
      `letterSpacing` = node.number("letterSpacing").sp,
      `lineHeight` = node.number("lineHeight").sp,
      `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
      `overflow` = toComposeTextOverflow(node.string("overflow")),
    )
    110 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `fontSize` = node.number("fontSize").sp,
      `letterSpacing` = node.number("letterSpacing").sp,
      `lineHeight` = node.number("lineHeight").sp,
      `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
      `overflow` = toComposeTextOverflow(node.string("overflow")),
    )
    111 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `color` = node.color("color"),
      `fontSize` = node.number("fontSize").sp,
      `letterSpacing` = node.number("letterSpacing").sp,
      `lineHeight` = node.number("lineHeight").sp,
      `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
      `overflow` = toComposeTextOverflow(node.string("overflow")),
    )
    112 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
      `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
      `overflow` = toComposeTextOverflow(node.string("overflow")),
    )
    113 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `color` = node.color("color"),
      `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
      `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
      `overflow` = toComposeTextOverflow(node.string("overflow")),
    )
    114 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `fontSize` = node.number("fontSize").sp,
      `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
      `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
      `overflow` = toComposeTextOverflow(node.string("overflow")),
    )
    115 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `color` = node.color("color"),
      `fontSize` = node.number("fontSize").sp,
      `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
      `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
      `overflow` = toComposeTextOverflow(node.string("overflow")),
    )
    116 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `letterSpacing` = node.number("letterSpacing").sp,
      `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
      `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
      `overflow` = toComposeTextOverflow(node.string("overflow")),
    )
    117 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `color` = node.color("color"),
      `letterSpacing` = node.number("letterSpacing").sp,
      `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
      `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
      `overflow` = toComposeTextOverflow(node.string("overflow")),
    )
    118 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `fontSize` = node.number("fontSize").sp,
      `letterSpacing` = node.number("letterSpacing").sp,
      `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
      `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
      `overflow` = toComposeTextOverflow(node.string("overflow")),
    )
    119 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `color` = node.color("color"),
      `fontSize` = node.number("fontSize").sp,
      `letterSpacing` = node.number("letterSpacing").sp,
      `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
      `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
      `overflow` = toComposeTextOverflow(node.string("overflow")),
    )
    120 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `lineHeight` = node.number("lineHeight").sp,
      `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
      `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
      `overflow` = toComposeTextOverflow(node.string("overflow")),
    )
    121 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `color` = node.color("color"),
      `lineHeight` = node.number("lineHeight").sp,
      `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
      `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
      `overflow` = toComposeTextOverflow(node.string("overflow")),
    )
    122 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `fontSize` = node.number("fontSize").sp,
      `lineHeight` = node.number("lineHeight").sp,
      `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
      `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
      `overflow` = toComposeTextOverflow(node.string("overflow")),
    )
    123 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `color` = node.color("color"),
      `fontSize` = node.number("fontSize").sp,
      `lineHeight` = node.number("lineHeight").sp,
      `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
      `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
      `overflow` = toComposeTextOverflow(node.string("overflow")),
    )
    124 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `letterSpacing` = node.number("letterSpacing").sp,
      `lineHeight` = node.number("lineHeight").sp,
      `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
      `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
      `overflow` = toComposeTextOverflow(node.string("overflow")),
    )
    125 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `color` = node.color("color"),
      `letterSpacing` = node.number("letterSpacing").sp,
      `lineHeight` = node.number("lineHeight").sp,
      `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
      `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
      `overflow` = toComposeTextOverflow(node.string("overflow")),
    )
    126 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `fontSize` = node.number("fontSize").sp,
      `letterSpacing` = node.number("letterSpacing").sp,
      `lineHeight` = node.number("lineHeight").sp,
      `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
      `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
      `overflow` = toComposeTextOverflow(node.string("overflow")),
    )
    else -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier", scope),
      `color` = node.color("color"),
      `fontSize` = node.number("fontSize").sp,
      `letterSpacing` = node.number("letterSpacing").sp,
      `lineHeight` = node.number("lineHeight").sp,
      `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
      `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
      `overflow` = toComposeTextOverflow(node.string("overflow")),
    )
  }
}

@Composable
private fun renderTextButton(node: ComposeNode, scope: Any?) {
  val mask = (if (node.has("enabled")) 1 else 0)
  when (mask) {
    0 -> androidx.compose.material3.TextButton(
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier", scope),
      content = { RenderComposeChildren(node.children, this) },
    )
    else -> androidx.compose.material3.TextButton(
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier", scope),
      `enabled` = node.boolean("enabled"),
      content = { RenderComposeChildren(node.children, this) },
    )
  }
}

@Composable
private fun renderTextField(node: ComposeNode, scope: Any?) {
  val mask = (if (node.has("enabled")) 1 else 0) +
    (if (node.has("readOnly")) 2 else 0) +
    (if (node.has("label")) 4 else 0) +
    (if (node.has("placeholder")) 8 else 0)
  when (mask) {
    0 -> androidx.compose.material3.TextField(
      `value` = node.string("value"),
      `onValueChange` = { value: String -> node.emit("onValueChange", value) },
      `modifier` = node.modifier("modifier", scope),
    )
    1 -> androidx.compose.material3.TextField(
      `value` = node.string("value"),
      `onValueChange` = { value: String -> node.emit("onValueChange", value) },
      `modifier` = node.modifier("modifier", scope),
      `enabled` = node.boolean("enabled"),
    )
    2 -> androidx.compose.material3.TextField(
      `value` = node.string("value"),
      `onValueChange` = { value: String -> node.emit("onValueChange", value) },
      `modifier` = node.modifier("modifier", scope),
      `readOnly` = node.boolean("readOnly"),
    )
    3 -> androidx.compose.material3.TextField(
      `value` = node.string("value"),
      `onValueChange` = { value: String -> node.emit("onValueChange", value) },
      `modifier` = node.modifier("modifier", scope),
      `enabled` = node.boolean("enabled"),
      `readOnly` = node.boolean("readOnly"),
    )
    4 -> androidx.compose.material3.TextField(
      `value` = node.string("value"),
      `onValueChange` = { value: String -> node.emit("onValueChange", value) },
      `modifier` = node.modifier("modifier", scope),
      `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
    )
    5 -> androidx.compose.material3.TextField(
      `value` = node.string("value"),
      `onValueChange` = { value: String -> node.emit("onValueChange", value) },
      `modifier` = node.modifier("modifier", scope),
      `enabled` = node.boolean("enabled"),
      `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
    )
    6 -> androidx.compose.material3.TextField(
      `value` = node.string("value"),
      `onValueChange` = { value: String -> node.emit("onValueChange", value) },
      `modifier` = node.modifier("modifier", scope),
      `readOnly` = node.boolean("readOnly"),
      `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
    )
    7 -> androidx.compose.material3.TextField(
      `value` = node.string("value"),
      `onValueChange` = { value: String -> node.emit("onValueChange", value) },
      `modifier` = node.modifier("modifier", scope),
      `enabled` = node.boolean("enabled"),
      `readOnly` = node.boolean("readOnly"),
      `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
    )
    8 -> androidx.compose.material3.TextField(
      `value` = node.string("value"),
      `onValueChange` = { value: String -> node.emit("onValueChange", value) },
      `modifier` = node.modifier("modifier", scope),
      `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
    )
    9 -> androidx.compose.material3.TextField(
      `value` = node.string("value"),
      `onValueChange` = { value: String -> node.emit("onValueChange", value) },
      `modifier` = node.modifier("modifier", scope),
      `enabled` = node.boolean("enabled"),
      `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
    )
    10 -> androidx.compose.material3.TextField(
      `value` = node.string("value"),
      `onValueChange` = { value: String -> node.emit("onValueChange", value) },
      `modifier` = node.modifier("modifier", scope),
      `readOnly` = node.boolean("readOnly"),
      `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
    )
    11 -> androidx.compose.material3.TextField(
      `value` = node.string("value"),
      `onValueChange` = { value: String -> node.emit("onValueChange", value) },
      `modifier` = node.modifier("modifier", scope),
      `enabled` = node.boolean("enabled"),
      `readOnly` = node.boolean("readOnly"),
      `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
    )
    12 -> androidx.compose.material3.TextField(
      `value` = node.string("value"),
      `onValueChange` = { value: String -> node.emit("onValueChange", value) },
      `modifier` = node.modifier("modifier", scope),
      `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
      `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
    )
    13 -> androidx.compose.material3.TextField(
      `value` = node.string("value"),
      `onValueChange` = { value: String -> node.emit("onValueChange", value) },
      `modifier` = node.modifier("modifier", scope),
      `enabled` = node.boolean("enabled"),
      `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
      `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
    )
    14 -> androidx.compose.material3.TextField(
      `value` = node.string("value"),
      `onValueChange` = { value: String -> node.emit("onValueChange", value) },
      `modifier` = node.modifier("modifier", scope),
      `readOnly` = node.boolean("readOnly"),
      `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
      `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
    )
    else -> androidx.compose.material3.TextField(
      `value` = node.string("value"),
      `onValueChange` = { value: String -> node.emit("onValueChange", value) },
      `modifier` = node.modifier("modifier", scope),
      `enabled` = node.boolean("enabled"),
      `readOnly` = node.boolean("readOnly"),
      `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
      `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
    )
  }
}

@Composable
private fun renderVerticalDivider(node: ComposeNode, scope: Any?) {
  val mask = (if (node.has("thickness")) 1 else 0) +
    (if (node.has("color")) 2 else 0)
  when (mask) {
    0 -> androidx.compose.material3.VerticalDivider(
      `modifier` = node.modifier("modifier", scope),
    )
    1 -> androidx.compose.material3.VerticalDivider(
      `modifier` = node.modifier("modifier", scope),
      `thickness` = node.number("thickness").dp,
    )
    2 -> androidx.compose.material3.VerticalDivider(
      `modifier` = node.modifier("modifier", scope),
      `color` = node.color("color"),
    )
    else -> androidx.compose.material3.VerticalDivider(
      `modifier` = node.modifier("modifier", scope),
      `thickness` = node.number("thickness").dp,
      `color` = node.color("color"),
    )
  }
}
