// Generated from Compose declarations by generate.mjs.
package expo.modules.jetpackcomposereactnative.generated

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
internal fun RenderComposable(node: ComposeNode) {
  when (node.name) {
    "AlertDialog" -> renderAlertDialog(node)
    "AssistChip" -> renderAssistChip(node)
    "Badge" -> renderBadge(node)
    "BadgedBox" -> renderBadgedBox(node)
    "Box" -> renderBox(node)
    "Button" -> renderButton(node)
    "Card" -> renderCard(node)
    "Checkbox" -> renderCheckbox(node)
    "CircularProgressIndicator" -> renderCircularProgressIndicator(node)
    "Column" -> renderColumn(node)
    "DismissibleDrawerSheet" -> renderDismissibleDrawerSheet(node)
    "DismissibleNavigationDrawer" -> renderDismissibleNavigationDrawer(node)
    "DropdownMenu" -> renderDropdownMenu(node)
    "DropdownMenuItem" -> renderDropdownMenuItem(node)
    "ElevatedAssistChip" -> renderElevatedAssistChip(node)
    "ElevatedButton" -> renderElevatedButton(node)
    "ElevatedCard" -> renderElevatedCard(node)
    "ElevatedFilterChip" -> renderElevatedFilterChip(node)
    "ElevatedSuggestionChip" -> renderElevatedSuggestionChip(node)
    "ExtendedFloatingActionButton" -> renderExtendedFloatingActionButton(node)
    "FilledIconButton" -> renderFilledIconButton(node)
    "FilledIconToggleButton" -> renderFilledIconToggleButton(node)
    "FilledTonalButton" -> renderFilledTonalButton(node)
    "FilledTonalIconButton" -> renderFilledTonalIconButton(node)
    "FilledTonalIconToggleButton" -> renderFilledTonalIconToggleButton(node)
    "FilterChip" -> renderFilterChip(node)
    "FloatingActionButton" -> renderFloatingActionButton(node)
    "HorizontalDivider" -> renderHorizontalDivider(node)
    "IconButton" -> renderIconButton(node)
    "IconToggleButton" -> renderIconToggleButton(node)
    "InputChip" -> renderInputChip(node)
    "LargeFloatingActionButton" -> renderLargeFloatingActionButton(node)
    "LeadingIconTab" -> renderLeadingIconTab(node)
    "LinearProgressIndicator" -> renderLinearProgressIndicator(node)
    "ListItem" -> renderListItem(node)
    "MaterialTheme" -> renderMaterialTheme(node)
    "ModalDrawerSheet" -> renderModalDrawerSheet(node)
    "ModalNavigationDrawer" -> renderModalNavigationDrawer(node)
    "NavigationBar" -> renderNavigationBar(node)
    "NavigationDrawerItem" -> renderNavigationDrawerItem(node)
    "NavigationRail" -> renderNavigationRail(node)
    "NavigationRailItem" -> renderNavigationRailItem(node)
    "OutlinedButton" -> renderOutlinedButton(node)
    "OutlinedCard" -> renderOutlinedCard(node)
    "OutlinedIconButton" -> renderOutlinedIconButton(node)
    "OutlinedIconToggleButton" -> renderOutlinedIconToggleButton(node)
    "OutlinedTextField" -> renderOutlinedTextField(node)
    "PermanentDrawerSheet" -> renderPermanentDrawerSheet(node)
    "PermanentNavigationDrawer" -> renderPermanentNavigationDrawer(node)
    "RadioButton" -> renderRadioButton(node)
    "Row" -> renderRow(node)
    "ScrollableTabRow" -> renderScrollableTabRow(node)
    "SmallFloatingActionButton" -> renderSmallFloatingActionButton(node)
    "Snackbar" -> renderSnackbar(node)
    "Spacer" -> renderSpacer(node)
    "SuggestionChip" -> renderSuggestionChip(node)
    "Surface" -> renderSurface(node)
    "Switch" -> renderSwitch(node)
    "Tab" -> renderTab(node)
    "TabRow" -> renderTabRow(node)
    "Text" -> renderText(node)
    "TextButton" -> renderTextButton(node)
    "TextField" -> renderTextField(node)
    "VerticalDivider" -> renderVerticalDivider(node)
    else -> error("Unknown generated Compose component: " + node.name)
  }
}

@Composable
private fun renderAlertDialog(node: ComposeNode) {
  val mask = (if (node.has("dismissButton")) 1 else 0) +
    (if (node.has("icon")) 2 else 0) +
    (if (node.has("title")) 4 else 0) +
    (if (node.has("text")) 8 else 0)
  when (mask) {
    0 -> androidx.compose.material3.AlertDialog(
      `onDismissRequest` = { node.emit("onDismissRequest") },
      `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
      `modifier` = node.modifier("modifier"),
    )
    1 -> androidx.compose.material3.AlertDialog(
      `onDismissRequest` = { node.emit("onDismissRequest") },
      `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
      `modifier` = node.modifier("modifier"),
      `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
    )
    2 -> androidx.compose.material3.AlertDialog(
      `onDismissRequest` = { node.emit("onDismissRequest") },
      `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
      `modifier` = node.modifier("modifier"),
      `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
    )
    3 -> androidx.compose.material3.AlertDialog(
      `onDismissRequest` = { node.emit("onDismissRequest") },
      `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
      `modifier` = node.modifier("modifier"),
      `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
      `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
    )
    4 -> androidx.compose.material3.AlertDialog(
      `onDismissRequest` = { node.emit("onDismissRequest") },
      `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
      `modifier` = node.modifier("modifier"),
      `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
    )
    5 -> androidx.compose.material3.AlertDialog(
      `onDismissRequest` = { node.emit("onDismissRequest") },
      `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
      `modifier` = node.modifier("modifier"),
      `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
      `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
    )
    6 -> androidx.compose.material3.AlertDialog(
      `onDismissRequest` = { node.emit("onDismissRequest") },
      `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
      `modifier` = node.modifier("modifier"),
      `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
      `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
    )
    7 -> androidx.compose.material3.AlertDialog(
      `onDismissRequest` = { node.emit("onDismissRequest") },
      `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
      `modifier` = node.modifier("modifier"),
      `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
      `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
      `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
    )
    8 -> androidx.compose.material3.AlertDialog(
      `onDismissRequest` = { node.emit("onDismissRequest") },
      `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
      `modifier` = node.modifier("modifier"),
      `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
    )
    9 -> androidx.compose.material3.AlertDialog(
      `onDismissRequest` = { node.emit("onDismissRequest") },
      `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
      `modifier` = node.modifier("modifier"),
      `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
      `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
    )
    10 -> androidx.compose.material3.AlertDialog(
      `onDismissRequest` = { node.emit("onDismissRequest") },
      `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
      `modifier` = node.modifier("modifier"),
      `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
      `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
    )
    11 -> androidx.compose.material3.AlertDialog(
      `onDismissRequest` = { node.emit("onDismissRequest") },
      `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
      `modifier` = node.modifier("modifier"),
      `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
      `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
      `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
    )
    12 -> androidx.compose.material3.AlertDialog(
      `onDismissRequest` = { node.emit("onDismissRequest") },
      `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
      `modifier` = node.modifier("modifier"),
      `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
      `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
    )
    13 -> androidx.compose.material3.AlertDialog(
      `onDismissRequest` = { node.emit("onDismissRequest") },
      `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
      `modifier` = node.modifier("modifier"),
      `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
      `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
      `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
    )
    14 -> androidx.compose.material3.AlertDialog(
      `onDismissRequest` = { node.emit("onDismissRequest") },
      `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
      `modifier` = node.modifier("modifier"),
      `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
      `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
      `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
    )
    else -> androidx.compose.material3.AlertDialog(
      `onDismissRequest` = { node.emit("onDismissRequest") },
      `confirmButton` = { RenderComposeChildren(node.slot("confirmButton")) },
      `modifier` = node.modifier("modifier"),
      `dismissButton` = if (node.isNull("dismissButton")) null else ({ RenderComposeChildren(node.slot("dismissButton")) }),
      `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
      `title` = if (node.isNull("title")) null else ({ RenderComposeChildren(node.slot("title")) }),
      `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
    )
  }
}

@Composable
private fun renderAssistChip(node: ComposeNode) {
  val mask = (if (node.has("enabled")) 1 else 0) +
    (if (node.has("leadingIcon")) 2 else 0) +
    (if (node.has("trailingIcon")) 4 else 0)
  when (mask) {
    0 -> androidx.compose.material3.AssistChip(
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier"),
    )
    1 -> androidx.compose.material3.AssistChip(
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier"),
      `enabled` = node.boolean("enabled"),
    )
    2 -> androidx.compose.material3.AssistChip(
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier"),
      `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
    )
    3 -> androidx.compose.material3.AssistChip(
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier"),
      `enabled` = node.boolean("enabled"),
      `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
    )
    4 -> androidx.compose.material3.AssistChip(
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier"),
      `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
    )
    5 -> androidx.compose.material3.AssistChip(
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier"),
      `enabled` = node.boolean("enabled"),
      `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
    )
    6 -> androidx.compose.material3.AssistChip(
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier"),
      `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
    )
    else -> androidx.compose.material3.AssistChip(
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier"),
      `enabled` = node.boolean("enabled"),
      `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
    )
  }
}

@Composable
private fun renderBadge(node: ComposeNode) {
  val mask = (if (node.has("containerColor")) 1 else 0) +
    (if (node.has("contentColor")) 2 else 0) +
    (if (node.has("content")) 4 else 0)
  when (mask) {
    0 -> androidx.compose.material3.Badge(
      `modifier` = node.modifier("modifier"),
    )
    1 -> androidx.compose.material3.Badge(
      `modifier` = node.modifier("modifier"),
      `containerColor` = node.color("containerColor"),
    )
    2 -> androidx.compose.material3.Badge(
      `modifier` = node.modifier("modifier"),
      `contentColor` = node.color("contentColor"),
    )
    3 -> androidx.compose.material3.Badge(
      `modifier` = node.modifier("modifier"),
      `containerColor` = node.color("containerColor"),
      `contentColor` = node.color("contentColor"),
    )
    4 -> androidx.compose.material3.Badge(
      `modifier` = node.modifier("modifier"),
      `content` = if (node.isNull("content")) null else ({ RenderComposeChildren(node.slot("content")) }),
    )
    5 -> androidx.compose.material3.Badge(
      `modifier` = node.modifier("modifier"),
      `containerColor` = node.color("containerColor"),
      `content` = if (node.isNull("content")) null else ({ RenderComposeChildren(node.slot("content")) }),
    )
    6 -> androidx.compose.material3.Badge(
      `modifier` = node.modifier("modifier"),
      `contentColor` = node.color("contentColor"),
      `content` = if (node.isNull("content")) null else ({ RenderComposeChildren(node.slot("content")) }),
    )
    else -> androidx.compose.material3.Badge(
      `modifier` = node.modifier("modifier"),
      `containerColor` = node.color("containerColor"),
      `contentColor` = node.color("contentColor"),
      `content` = if (node.isNull("content")) null else ({ RenderComposeChildren(node.slot("content")) }),
    )
  }
}

@Composable
private fun renderBadgedBox(node: ComposeNode) {
  androidx.compose.material3.BadgedBox(
    `badge` = { RenderComposeChildren(node.slot("badge")) },
    `modifier` = node.modifier("modifier"),
    content = { RenderComposeChildren(node.children) },
  )
}

@Composable
private fun renderBox(node: ComposeNode) {
  val mask = (if (node.has("propagateMinConstraints")) 1 else 0)
  when (mask) {
    0 -> androidx.compose.foundation.layout.Box(
      `modifier` = node.modifier("modifier"),
      content = { RenderComposeChildren(node.children) },
    )
    else -> androidx.compose.foundation.layout.Box(
      `modifier` = node.modifier("modifier"),
      `propagateMinConstraints` = node.boolean("propagateMinConstraints"),
      content = { RenderComposeChildren(node.children) },
    )
  }
}

@Composable
private fun renderButton(node: ComposeNode) {
  val mask = (if (node.has("enabled")) 1 else 0)
  when (mask) {
    0 -> androidx.compose.material3.Button(
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier"),
      content = { RenderComposeChildren(node.children) },
    )
    else -> androidx.compose.material3.Button(
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier"),
      `enabled` = node.boolean("enabled"),
      content = { RenderComposeChildren(node.children) },
    )
  }
}

@Composable
private fun renderCard(node: ComposeNode) {
  androidx.compose.material3.Card(
    `modifier` = node.modifier("modifier"),
    content = { RenderComposeChildren(node.children) },
  )
}

@Composable
private fun renderCheckbox(node: ComposeNode) {
  val mask = (if (node.has("enabled")) 1 else 0)
  when (mask) {
    0 -> androidx.compose.material3.Checkbox(
      `checked` = node.boolean("checked"),
      `onCheckedChange` = if (node.isNull("onCheckedChange")) null else ({ value: Boolean -> node.emit("onCheckedChange", value) }),
      `modifier` = node.modifier("modifier"),
    )
    else -> androidx.compose.material3.Checkbox(
      `checked` = node.boolean("checked"),
      `onCheckedChange` = if (node.isNull("onCheckedChange")) null else ({ value: Boolean -> node.emit("onCheckedChange", value) }),
      `modifier` = node.modifier("modifier"),
      `enabled` = node.boolean("enabled"),
    )
  }
}

@Composable
private fun renderCircularProgressIndicator(node: ComposeNode) {
  val mask = (if (node.has("color")) 1 else 0) +
    (if (node.has("strokeWidth")) 2 else 0) +
    (if (node.has("trackColor")) 4 else 0)
  when (mask) {
    0 -> androidx.compose.material3.CircularProgressIndicator(
      `modifier` = node.modifier("modifier"),
    )
    1 -> androidx.compose.material3.CircularProgressIndicator(
      `modifier` = node.modifier("modifier"),
      `color` = node.color("color"),
    )
    2 -> androidx.compose.material3.CircularProgressIndicator(
      `modifier` = node.modifier("modifier"),
      `strokeWidth` = node.number("strokeWidth").dp,
    )
    3 -> androidx.compose.material3.CircularProgressIndicator(
      `modifier` = node.modifier("modifier"),
      `color` = node.color("color"),
      `strokeWidth` = node.number("strokeWidth").dp,
    )
    4 -> androidx.compose.material3.CircularProgressIndicator(
      `modifier` = node.modifier("modifier"),
      `trackColor` = node.color("trackColor"),
    )
    5 -> androidx.compose.material3.CircularProgressIndicator(
      `modifier` = node.modifier("modifier"),
      `color` = node.color("color"),
      `trackColor` = node.color("trackColor"),
    )
    6 -> androidx.compose.material3.CircularProgressIndicator(
      `modifier` = node.modifier("modifier"),
      `strokeWidth` = node.number("strokeWidth").dp,
      `trackColor` = node.color("trackColor"),
    )
    else -> androidx.compose.material3.CircularProgressIndicator(
      `modifier` = node.modifier("modifier"),
      `color` = node.color("color"),
      `strokeWidth` = node.number("strokeWidth").dp,
      `trackColor` = node.color("trackColor"),
    )
  }
}

@Composable
private fun renderColumn(node: ComposeNode) {
  androidx.compose.foundation.layout.Column(
    `modifier` = node.modifier("modifier"),
    content = { RenderComposeChildren(node.children) },
  )
}

@Composable
private fun renderDismissibleDrawerSheet(node: ComposeNode) {
  val mask = (if (node.has("drawerContainerColor")) 1 else 0) +
    (if (node.has("drawerContentColor")) 2 else 0) +
    (if (node.has("drawerTonalElevation")) 4 else 0)
  when (mask) {
    0 -> androidx.compose.material3.DismissibleDrawerSheet(
      `modifier` = node.modifier("modifier"),
      content = { RenderComposeChildren(node.children) },
    )
    1 -> androidx.compose.material3.DismissibleDrawerSheet(
      `modifier` = node.modifier("modifier"),
      `drawerContainerColor` = node.color("drawerContainerColor"),
      content = { RenderComposeChildren(node.children) },
    )
    2 -> androidx.compose.material3.DismissibleDrawerSheet(
      `modifier` = node.modifier("modifier"),
      `drawerContentColor` = node.color("drawerContentColor"),
      content = { RenderComposeChildren(node.children) },
    )
    3 -> androidx.compose.material3.DismissibleDrawerSheet(
      `modifier` = node.modifier("modifier"),
      `drawerContainerColor` = node.color("drawerContainerColor"),
      `drawerContentColor` = node.color("drawerContentColor"),
      content = { RenderComposeChildren(node.children) },
    )
    4 -> androidx.compose.material3.DismissibleDrawerSheet(
      `modifier` = node.modifier("modifier"),
      `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
      content = { RenderComposeChildren(node.children) },
    )
    5 -> androidx.compose.material3.DismissibleDrawerSheet(
      `modifier` = node.modifier("modifier"),
      `drawerContainerColor` = node.color("drawerContainerColor"),
      `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
      content = { RenderComposeChildren(node.children) },
    )
    6 -> androidx.compose.material3.DismissibleDrawerSheet(
      `modifier` = node.modifier("modifier"),
      `drawerContentColor` = node.color("drawerContentColor"),
      `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
      content = { RenderComposeChildren(node.children) },
    )
    else -> androidx.compose.material3.DismissibleDrawerSheet(
      `modifier` = node.modifier("modifier"),
      `drawerContainerColor` = node.color("drawerContainerColor"),
      `drawerContentColor` = node.color("drawerContentColor"),
      `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
      content = { RenderComposeChildren(node.children) },
    )
  }
}

@Composable
private fun renderDismissibleNavigationDrawer(node: ComposeNode) {
  val mask = (if (node.has("gesturesEnabled")) 1 else 0)
  when (mask) {
    0 -> androidx.compose.material3.DismissibleNavigationDrawer(
      `drawerContent` = { RenderComposeChildren(node.slot("drawerContent")) },
      `modifier` = node.modifier("modifier"),
      content = { RenderComposeChildren(node.children) },
    )
    else -> androidx.compose.material3.DismissibleNavigationDrawer(
      `drawerContent` = { RenderComposeChildren(node.slot("drawerContent")) },
      `modifier` = node.modifier("modifier"),
      `gesturesEnabled` = node.boolean("gesturesEnabled"),
      content = { RenderComposeChildren(node.children) },
    )
  }
}

@Composable
private fun renderDropdownMenu(node: ComposeNode) {
  val mask = (if (node.has("containerColor")) 1 else 0) +
    (if (node.has("tonalElevation")) 2 else 0) +
    (if (node.has("shadowElevation")) 4 else 0)
  when (mask) {
    0 -> androidx.compose.material3.DropdownMenu(
      `expanded` = node.boolean("expanded"),
      `onDismissRequest` = { node.emit("onDismissRequest") },
      `modifier` = node.modifier("modifier"),
      content = { RenderComposeChildren(node.children) },
    )
    1 -> androidx.compose.material3.DropdownMenu(
      `expanded` = node.boolean("expanded"),
      `onDismissRequest` = { node.emit("onDismissRequest") },
      `modifier` = node.modifier("modifier"),
      `containerColor` = node.color("containerColor"),
      content = { RenderComposeChildren(node.children) },
    )
    2 -> androidx.compose.material3.DropdownMenu(
      `expanded` = node.boolean("expanded"),
      `onDismissRequest` = { node.emit("onDismissRequest") },
      `modifier` = node.modifier("modifier"),
      `tonalElevation` = node.number("tonalElevation").dp,
      content = { RenderComposeChildren(node.children) },
    )
    3 -> androidx.compose.material3.DropdownMenu(
      `expanded` = node.boolean("expanded"),
      `onDismissRequest` = { node.emit("onDismissRequest") },
      `modifier` = node.modifier("modifier"),
      `containerColor` = node.color("containerColor"),
      `tonalElevation` = node.number("tonalElevation").dp,
      content = { RenderComposeChildren(node.children) },
    )
    4 -> androidx.compose.material3.DropdownMenu(
      `expanded` = node.boolean("expanded"),
      `onDismissRequest` = { node.emit("onDismissRequest") },
      `modifier` = node.modifier("modifier"),
      `shadowElevation` = node.number("shadowElevation").dp,
      content = { RenderComposeChildren(node.children) },
    )
    5 -> androidx.compose.material3.DropdownMenu(
      `expanded` = node.boolean("expanded"),
      `onDismissRequest` = { node.emit("onDismissRequest") },
      `modifier` = node.modifier("modifier"),
      `containerColor` = node.color("containerColor"),
      `shadowElevation` = node.number("shadowElevation").dp,
      content = { RenderComposeChildren(node.children) },
    )
    6 -> androidx.compose.material3.DropdownMenu(
      `expanded` = node.boolean("expanded"),
      `onDismissRequest` = { node.emit("onDismissRequest") },
      `modifier` = node.modifier("modifier"),
      `tonalElevation` = node.number("tonalElevation").dp,
      `shadowElevation` = node.number("shadowElevation").dp,
      content = { RenderComposeChildren(node.children) },
    )
    else -> androidx.compose.material3.DropdownMenu(
      `expanded` = node.boolean("expanded"),
      `onDismissRequest` = { node.emit("onDismissRequest") },
      `modifier` = node.modifier("modifier"),
      `containerColor` = node.color("containerColor"),
      `tonalElevation` = node.number("tonalElevation").dp,
      `shadowElevation` = node.number("shadowElevation").dp,
      content = { RenderComposeChildren(node.children) },
    )
  }
}

@Composable
private fun renderDropdownMenuItem(node: ComposeNode) {
  val mask = (if (node.has("leadingIcon")) 1 else 0) +
    (if (node.has("trailingIcon")) 2 else 0) +
    (if (node.has("enabled")) 4 else 0)
  when (mask) {
    0 -> androidx.compose.material3.DropdownMenuItem(
      `text` = { RenderComposeChildren(node.slot("text")) },
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier"),
    )
    1 -> androidx.compose.material3.DropdownMenuItem(
      `text` = { RenderComposeChildren(node.slot("text")) },
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier"),
      `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
    )
    2 -> androidx.compose.material3.DropdownMenuItem(
      `text` = { RenderComposeChildren(node.slot("text")) },
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier"),
      `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
    )
    3 -> androidx.compose.material3.DropdownMenuItem(
      `text` = { RenderComposeChildren(node.slot("text")) },
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier"),
      `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
    )
    4 -> androidx.compose.material3.DropdownMenuItem(
      `text` = { RenderComposeChildren(node.slot("text")) },
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier"),
      `enabled` = node.boolean("enabled"),
    )
    5 -> androidx.compose.material3.DropdownMenuItem(
      `text` = { RenderComposeChildren(node.slot("text")) },
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier"),
      `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      `enabled` = node.boolean("enabled"),
    )
    6 -> androidx.compose.material3.DropdownMenuItem(
      `text` = { RenderComposeChildren(node.slot("text")) },
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier"),
      `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      `enabled` = node.boolean("enabled"),
    )
    else -> androidx.compose.material3.DropdownMenuItem(
      `text` = { RenderComposeChildren(node.slot("text")) },
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier"),
      `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      `enabled` = node.boolean("enabled"),
    )
  }
}

@Composable
private fun renderElevatedAssistChip(node: ComposeNode) {
  val mask = (if (node.has("enabled")) 1 else 0) +
    (if (node.has("leadingIcon")) 2 else 0) +
    (if (node.has("trailingIcon")) 4 else 0)
  when (mask) {
    0 -> androidx.compose.material3.ElevatedAssistChip(
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier"),
    )
    1 -> androidx.compose.material3.ElevatedAssistChip(
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier"),
      `enabled` = node.boolean("enabled"),
    )
    2 -> androidx.compose.material3.ElevatedAssistChip(
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier"),
      `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
    )
    3 -> androidx.compose.material3.ElevatedAssistChip(
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier"),
      `enabled` = node.boolean("enabled"),
      `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
    )
    4 -> androidx.compose.material3.ElevatedAssistChip(
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier"),
      `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
    )
    5 -> androidx.compose.material3.ElevatedAssistChip(
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier"),
      `enabled` = node.boolean("enabled"),
      `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
    )
    6 -> androidx.compose.material3.ElevatedAssistChip(
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier"),
      `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
    )
    else -> androidx.compose.material3.ElevatedAssistChip(
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier"),
      `enabled` = node.boolean("enabled"),
      `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
    )
  }
}

@Composable
private fun renderElevatedButton(node: ComposeNode) {
  val mask = (if (node.has("enabled")) 1 else 0)
  when (mask) {
    0 -> androidx.compose.material3.ElevatedButton(
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier"),
      content = { RenderComposeChildren(node.children) },
    )
    else -> androidx.compose.material3.ElevatedButton(
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier"),
      `enabled` = node.boolean("enabled"),
      content = { RenderComposeChildren(node.children) },
    )
  }
}

@Composable
private fun renderElevatedCard(node: ComposeNode) {
  androidx.compose.material3.ElevatedCard(
    `modifier` = node.modifier("modifier"),
    content = { RenderComposeChildren(node.children) },
  )
}

@Composable
private fun renderElevatedFilterChip(node: ComposeNode) {
  val mask = (if (node.has("enabled")) 1 else 0) +
    (if (node.has("leadingIcon")) 2 else 0) +
    (if (node.has("trailingIcon")) 4 else 0)
  when (mask) {
    0 -> androidx.compose.material3.ElevatedFilterChip(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier"),
    )
    1 -> androidx.compose.material3.ElevatedFilterChip(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier"),
      `enabled` = node.boolean("enabled"),
    )
    2 -> androidx.compose.material3.ElevatedFilterChip(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier"),
      `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
    )
    3 -> androidx.compose.material3.ElevatedFilterChip(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier"),
      `enabled` = node.boolean("enabled"),
      `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
    )
    4 -> androidx.compose.material3.ElevatedFilterChip(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier"),
      `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
    )
    5 -> androidx.compose.material3.ElevatedFilterChip(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier"),
      `enabled` = node.boolean("enabled"),
      `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
    )
    6 -> androidx.compose.material3.ElevatedFilterChip(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier"),
      `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
    )
    else -> androidx.compose.material3.ElevatedFilterChip(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier"),
      `enabled` = node.boolean("enabled"),
      `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
    )
  }
}

@Composable
private fun renderElevatedSuggestionChip(node: ComposeNode) {
  val mask = (if (node.has("enabled")) 1 else 0) +
    (if (node.has("icon")) 2 else 0)
  when (mask) {
    0 -> androidx.compose.material3.ElevatedSuggestionChip(
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier"),
    )
    1 -> androidx.compose.material3.ElevatedSuggestionChip(
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier"),
      `enabled` = node.boolean("enabled"),
    )
    2 -> androidx.compose.material3.ElevatedSuggestionChip(
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier"),
      `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
    )
    else -> androidx.compose.material3.ElevatedSuggestionChip(
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier"),
      `enabled` = node.boolean("enabled"),
      `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
    )
  }
}

@Composable
private fun renderExtendedFloatingActionButton(node: ComposeNode) {
  val mask = (if (node.has("containerColor")) 1 else 0) +
    (if (node.has("contentColor")) 2 else 0)
  when (mask) {
    0 -> androidx.compose.material3.ExtendedFloatingActionButton(
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier"),
      content = { RenderComposeChildren(node.children) },
    )
    1 -> androidx.compose.material3.ExtendedFloatingActionButton(
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier"),
      `containerColor` = node.color("containerColor"),
      content = { RenderComposeChildren(node.children) },
    )
    2 -> androidx.compose.material3.ExtendedFloatingActionButton(
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier"),
      `contentColor` = node.color("contentColor"),
      content = { RenderComposeChildren(node.children) },
    )
    else -> androidx.compose.material3.ExtendedFloatingActionButton(
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier"),
      `containerColor` = node.color("containerColor"),
      `contentColor` = node.color("contentColor"),
      content = { RenderComposeChildren(node.children) },
    )
  }
}

@Composable
private fun renderFilledIconButton(node: ComposeNode) {
  val mask = (if (node.has("enabled")) 1 else 0)
  when (mask) {
    0 -> androidx.compose.material3.FilledIconButton(
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier"),
      content = { RenderComposeChildren(node.children) },
    )
    else -> androidx.compose.material3.FilledIconButton(
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier"),
      `enabled` = node.boolean("enabled"),
      content = { RenderComposeChildren(node.children) },
    )
  }
}

@Composable
private fun renderFilledIconToggleButton(node: ComposeNode) {
  val mask = (if (node.has("enabled")) 1 else 0)
  when (mask) {
    0 -> androidx.compose.material3.FilledIconToggleButton(
      `checked` = node.boolean("checked"),
      `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
      `modifier` = node.modifier("modifier"),
      content = { RenderComposeChildren(node.children) },
    )
    else -> androidx.compose.material3.FilledIconToggleButton(
      `checked` = node.boolean("checked"),
      `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
      `modifier` = node.modifier("modifier"),
      `enabled` = node.boolean("enabled"),
      content = { RenderComposeChildren(node.children) },
    )
  }
}

@Composable
private fun renderFilledTonalButton(node: ComposeNode) {
  val mask = (if (node.has("enabled")) 1 else 0)
  when (mask) {
    0 -> androidx.compose.material3.FilledTonalButton(
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier"),
      content = { RenderComposeChildren(node.children) },
    )
    else -> androidx.compose.material3.FilledTonalButton(
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier"),
      `enabled` = node.boolean("enabled"),
      content = { RenderComposeChildren(node.children) },
    )
  }
}

@Composable
private fun renderFilledTonalIconButton(node: ComposeNode) {
  val mask = (if (node.has("enabled")) 1 else 0)
  when (mask) {
    0 -> androidx.compose.material3.FilledTonalIconButton(
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier"),
      content = { RenderComposeChildren(node.children) },
    )
    else -> androidx.compose.material3.FilledTonalIconButton(
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier"),
      `enabled` = node.boolean("enabled"),
      content = { RenderComposeChildren(node.children) },
    )
  }
}

@Composable
private fun renderFilledTonalIconToggleButton(node: ComposeNode) {
  val mask = (if (node.has("enabled")) 1 else 0)
  when (mask) {
    0 -> androidx.compose.material3.FilledTonalIconToggleButton(
      `checked` = node.boolean("checked"),
      `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
      `modifier` = node.modifier("modifier"),
      content = { RenderComposeChildren(node.children) },
    )
    else -> androidx.compose.material3.FilledTonalIconToggleButton(
      `checked` = node.boolean("checked"),
      `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
      `modifier` = node.modifier("modifier"),
      `enabled` = node.boolean("enabled"),
      content = { RenderComposeChildren(node.children) },
    )
  }
}

@Composable
private fun renderFilterChip(node: ComposeNode) {
  val mask = (if (node.has("enabled")) 1 else 0) +
    (if (node.has("leadingIcon")) 2 else 0) +
    (if (node.has("trailingIcon")) 4 else 0)
  when (mask) {
    0 -> androidx.compose.material3.FilterChip(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier"),
    )
    1 -> androidx.compose.material3.FilterChip(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier"),
      `enabled` = node.boolean("enabled"),
    )
    2 -> androidx.compose.material3.FilterChip(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier"),
      `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
    )
    3 -> androidx.compose.material3.FilterChip(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier"),
      `enabled` = node.boolean("enabled"),
      `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
    )
    4 -> androidx.compose.material3.FilterChip(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier"),
      `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
    )
    5 -> androidx.compose.material3.FilterChip(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier"),
      `enabled` = node.boolean("enabled"),
      `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
    )
    6 -> androidx.compose.material3.FilterChip(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier"),
      `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
    )
    else -> androidx.compose.material3.FilterChip(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier"),
      `enabled` = node.boolean("enabled"),
      `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
    )
  }
}

@Composable
private fun renderFloatingActionButton(node: ComposeNode) {
  val mask = (if (node.has("containerColor")) 1 else 0) +
    (if (node.has("contentColor")) 2 else 0)
  when (mask) {
    0 -> androidx.compose.material3.FloatingActionButton(
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier"),
      content = { RenderComposeChildren(node.children) },
    )
    1 -> androidx.compose.material3.FloatingActionButton(
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier"),
      `containerColor` = node.color("containerColor"),
      content = { RenderComposeChildren(node.children) },
    )
    2 -> androidx.compose.material3.FloatingActionButton(
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier"),
      `contentColor` = node.color("contentColor"),
      content = { RenderComposeChildren(node.children) },
    )
    else -> androidx.compose.material3.FloatingActionButton(
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier"),
      `containerColor` = node.color("containerColor"),
      `contentColor` = node.color("contentColor"),
      content = { RenderComposeChildren(node.children) },
    )
  }
}

@Composable
private fun renderHorizontalDivider(node: ComposeNode) {
  val mask = (if (node.has("thickness")) 1 else 0) +
    (if (node.has("color")) 2 else 0)
  when (mask) {
    0 -> androidx.compose.material3.HorizontalDivider(
      `modifier` = node.modifier("modifier"),
    )
    1 -> androidx.compose.material3.HorizontalDivider(
      `modifier` = node.modifier("modifier"),
      `thickness` = node.number("thickness").dp,
    )
    2 -> androidx.compose.material3.HorizontalDivider(
      `modifier` = node.modifier("modifier"),
      `color` = node.color("color"),
    )
    else -> androidx.compose.material3.HorizontalDivider(
      `modifier` = node.modifier("modifier"),
      `thickness` = node.number("thickness").dp,
      `color` = node.color("color"),
    )
  }
}

@Composable
private fun renderIconButton(node: ComposeNode) {
  val mask = (if (node.has("enabled")) 1 else 0)
  when (mask) {
    0 -> androidx.compose.material3.IconButton(
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier"),
      content = { RenderComposeChildren(node.children) },
    )
    else -> androidx.compose.material3.IconButton(
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier"),
      `enabled` = node.boolean("enabled"),
      content = { RenderComposeChildren(node.children) },
    )
  }
}

@Composable
private fun renderIconToggleButton(node: ComposeNode) {
  val mask = (if (node.has("enabled")) 1 else 0)
  when (mask) {
    0 -> androidx.compose.material3.IconToggleButton(
      `checked` = node.boolean("checked"),
      `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
      `modifier` = node.modifier("modifier"),
      content = { RenderComposeChildren(node.children) },
    )
    else -> androidx.compose.material3.IconToggleButton(
      `checked` = node.boolean("checked"),
      `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
      `modifier` = node.modifier("modifier"),
      `enabled` = node.boolean("enabled"),
      content = { RenderComposeChildren(node.children) },
    )
  }
}

@Composable
private fun renderInputChip(node: ComposeNode) {
  val mask = (if (node.has("enabled")) 1 else 0) +
    (if (node.has("leadingIcon")) 2 else 0) +
    (if (node.has("avatar")) 4 else 0) +
    (if (node.has("trailingIcon")) 8 else 0)
  when (mask) {
    0 -> androidx.compose.material3.InputChip(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier"),
    )
    1 -> androidx.compose.material3.InputChip(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier"),
      `enabled` = node.boolean("enabled"),
    )
    2 -> androidx.compose.material3.InputChip(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier"),
      `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
    )
    3 -> androidx.compose.material3.InputChip(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier"),
      `enabled` = node.boolean("enabled"),
      `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
    )
    4 -> androidx.compose.material3.InputChip(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier"),
      `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
    )
    5 -> androidx.compose.material3.InputChip(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier"),
      `enabled` = node.boolean("enabled"),
      `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
    )
    6 -> androidx.compose.material3.InputChip(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier"),
      `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
    )
    7 -> androidx.compose.material3.InputChip(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier"),
      `enabled` = node.boolean("enabled"),
      `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
    )
    8 -> androidx.compose.material3.InputChip(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier"),
      `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
    )
    9 -> androidx.compose.material3.InputChip(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier"),
      `enabled` = node.boolean("enabled"),
      `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
    )
    10 -> androidx.compose.material3.InputChip(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier"),
      `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
    )
    11 -> androidx.compose.material3.InputChip(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier"),
      `enabled` = node.boolean("enabled"),
      `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
    )
    12 -> androidx.compose.material3.InputChip(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier"),
      `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
      `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
    )
    13 -> androidx.compose.material3.InputChip(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier"),
      `enabled` = node.boolean("enabled"),
      `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
      `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
    )
    14 -> androidx.compose.material3.InputChip(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier"),
      `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
      `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
    )
    else -> androidx.compose.material3.InputChip(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier"),
      `enabled` = node.boolean("enabled"),
      `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      `avatar` = if (node.isNull("avatar")) null else ({ RenderComposeChildren(node.slot("avatar")) }),
      `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
    )
  }
}

@Composable
private fun renderLargeFloatingActionButton(node: ComposeNode) {
  val mask = (if (node.has("containerColor")) 1 else 0) +
    (if (node.has("contentColor")) 2 else 0)
  when (mask) {
    0 -> androidx.compose.material3.LargeFloatingActionButton(
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier"),
      content = { RenderComposeChildren(node.children) },
    )
    1 -> androidx.compose.material3.LargeFloatingActionButton(
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier"),
      `containerColor` = node.color("containerColor"),
      content = { RenderComposeChildren(node.children) },
    )
    2 -> androidx.compose.material3.LargeFloatingActionButton(
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier"),
      `contentColor` = node.color("contentColor"),
      content = { RenderComposeChildren(node.children) },
    )
    else -> androidx.compose.material3.LargeFloatingActionButton(
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier"),
      `containerColor` = node.color("containerColor"),
      `contentColor` = node.color("contentColor"),
      content = { RenderComposeChildren(node.children) },
    )
  }
}

@Composable
private fun renderLeadingIconTab(node: ComposeNode) {
  val mask = (if (node.has("enabled")) 1 else 0) +
    (if (node.has("selectedContentColor")) 2 else 0) +
    (if (node.has("unselectedContentColor")) 4 else 0)
  when (mask) {
    0 -> androidx.compose.material3.LeadingIconTab(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `text` = { RenderComposeChildren(node.slot("text")) },
      `icon` = { RenderComposeChildren(node.slot("icon")) },
      `modifier` = node.modifier("modifier"),
    )
    1 -> androidx.compose.material3.LeadingIconTab(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `text` = { RenderComposeChildren(node.slot("text")) },
      `icon` = { RenderComposeChildren(node.slot("icon")) },
      `modifier` = node.modifier("modifier"),
      `enabled` = node.boolean("enabled"),
    )
    2 -> androidx.compose.material3.LeadingIconTab(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `text` = { RenderComposeChildren(node.slot("text")) },
      `icon` = { RenderComposeChildren(node.slot("icon")) },
      `modifier` = node.modifier("modifier"),
      `selectedContentColor` = node.color("selectedContentColor"),
    )
    3 -> androidx.compose.material3.LeadingIconTab(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `text` = { RenderComposeChildren(node.slot("text")) },
      `icon` = { RenderComposeChildren(node.slot("icon")) },
      `modifier` = node.modifier("modifier"),
      `enabled` = node.boolean("enabled"),
      `selectedContentColor` = node.color("selectedContentColor"),
    )
    4 -> androidx.compose.material3.LeadingIconTab(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `text` = { RenderComposeChildren(node.slot("text")) },
      `icon` = { RenderComposeChildren(node.slot("icon")) },
      `modifier` = node.modifier("modifier"),
      `unselectedContentColor` = node.color("unselectedContentColor"),
    )
    5 -> androidx.compose.material3.LeadingIconTab(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `text` = { RenderComposeChildren(node.slot("text")) },
      `icon` = { RenderComposeChildren(node.slot("icon")) },
      `modifier` = node.modifier("modifier"),
      `enabled` = node.boolean("enabled"),
      `unselectedContentColor` = node.color("unselectedContentColor"),
    )
    6 -> androidx.compose.material3.LeadingIconTab(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `text` = { RenderComposeChildren(node.slot("text")) },
      `icon` = { RenderComposeChildren(node.slot("icon")) },
      `modifier` = node.modifier("modifier"),
      `selectedContentColor` = node.color("selectedContentColor"),
      `unselectedContentColor` = node.color("unselectedContentColor"),
    )
    else -> androidx.compose.material3.LeadingIconTab(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `text` = { RenderComposeChildren(node.slot("text")) },
      `icon` = { RenderComposeChildren(node.slot("icon")) },
      `modifier` = node.modifier("modifier"),
      `enabled` = node.boolean("enabled"),
      `selectedContentColor` = node.color("selectedContentColor"),
      `unselectedContentColor` = node.color("unselectedContentColor"),
    )
  }
}

@Composable
private fun renderLinearProgressIndicator(node: ComposeNode) {
  val mask = (if (node.has("color")) 1 else 0) +
    (if (node.has("trackColor")) 2 else 0) +
    (if (node.has("gapSize")) 4 else 0)
  when (mask) {
    0 -> androidx.compose.material3.LinearProgressIndicator(
      `modifier` = node.modifier("modifier"),
    )
    1 -> androidx.compose.material3.LinearProgressIndicator(
      `modifier` = node.modifier("modifier"),
      `color` = node.color("color"),
    )
    2 -> androidx.compose.material3.LinearProgressIndicator(
      `modifier` = node.modifier("modifier"),
      `trackColor` = node.color("trackColor"),
    )
    3 -> androidx.compose.material3.LinearProgressIndicator(
      `modifier` = node.modifier("modifier"),
      `color` = node.color("color"),
      `trackColor` = node.color("trackColor"),
    )
    4 -> androidx.compose.material3.LinearProgressIndicator(
      `modifier` = node.modifier("modifier"),
      `gapSize` = node.number("gapSize").dp,
    )
    5 -> androidx.compose.material3.LinearProgressIndicator(
      `modifier` = node.modifier("modifier"),
      `color` = node.color("color"),
      `gapSize` = node.number("gapSize").dp,
    )
    6 -> androidx.compose.material3.LinearProgressIndicator(
      `modifier` = node.modifier("modifier"),
      `trackColor` = node.color("trackColor"),
      `gapSize` = node.number("gapSize").dp,
    )
    else -> androidx.compose.material3.LinearProgressIndicator(
      `modifier` = node.modifier("modifier"),
      `color` = node.color("color"),
      `trackColor` = node.color("trackColor"),
      `gapSize` = node.number("gapSize").dp,
    )
  }
}

@Composable
private fun renderListItem(node: ComposeNode) {
  val mask = (if (node.has("overlineContent")) 1 else 0) +
    (if (node.has("supportingContent")) 2 else 0) +
    (if (node.has("leadingContent")) 4 else 0) +
    (if (node.has("trailingContent")) 8 else 0)
  when (mask) {
    0 -> androidx.compose.material3.ListItem(
      `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
      `modifier` = node.modifier("modifier"),
    )
    1 -> androidx.compose.material3.ListItem(
      `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
      `modifier` = node.modifier("modifier"),
      `overlineContent` = if (node.isNull("overlineContent")) null else ({ RenderComposeChildren(node.slot("overlineContent")) }),
    )
    2 -> androidx.compose.material3.ListItem(
      `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
      `modifier` = node.modifier("modifier"),
      `supportingContent` = if (node.isNull("supportingContent")) null else ({ RenderComposeChildren(node.slot("supportingContent")) }),
    )
    3 -> androidx.compose.material3.ListItem(
      `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
      `modifier` = node.modifier("modifier"),
      `overlineContent` = if (node.isNull("overlineContent")) null else ({ RenderComposeChildren(node.slot("overlineContent")) }),
      `supportingContent` = if (node.isNull("supportingContent")) null else ({ RenderComposeChildren(node.slot("supportingContent")) }),
    )
    4 -> androidx.compose.material3.ListItem(
      `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
      `modifier` = node.modifier("modifier"),
      `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent")) }),
    )
    5 -> androidx.compose.material3.ListItem(
      `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
      `modifier` = node.modifier("modifier"),
      `overlineContent` = if (node.isNull("overlineContent")) null else ({ RenderComposeChildren(node.slot("overlineContent")) }),
      `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent")) }),
    )
    6 -> androidx.compose.material3.ListItem(
      `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
      `modifier` = node.modifier("modifier"),
      `supportingContent` = if (node.isNull("supportingContent")) null else ({ RenderComposeChildren(node.slot("supportingContent")) }),
      `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent")) }),
    )
    7 -> androidx.compose.material3.ListItem(
      `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
      `modifier` = node.modifier("modifier"),
      `overlineContent` = if (node.isNull("overlineContent")) null else ({ RenderComposeChildren(node.slot("overlineContent")) }),
      `supportingContent` = if (node.isNull("supportingContent")) null else ({ RenderComposeChildren(node.slot("supportingContent")) }),
      `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent")) }),
    )
    8 -> androidx.compose.material3.ListItem(
      `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
      `modifier` = node.modifier("modifier"),
      `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent")) }),
    )
    9 -> androidx.compose.material3.ListItem(
      `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
      `modifier` = node.modifier("modifier"),
      `overlineContent` = if (node.isNull("overlineContent")) null else ({ RenderComposeChildren(node.slot("overlineContent")) }),
      `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent")) }),
    )
    10 -> androidx.compose.material3.ListItem(
      `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
      `modifier` = node.modifier("modifier"),
      `supportingContent` = if (node.isNull("supportingContent")) null else ({ RenderComposeChildren(node.slot("supportingContent")) }),
      `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent")) }),
    )
    11 -> androidx.compose.material3.ListItem(
      `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
      `modifier` = node.modifier("modifier"),
      `overlineContent` = if (node.isNull("overlineContent")) null else ({ RenderComposeChildren(node.slot("overlineContent")) }),
      `supportingContent` = if (node.isNull("supportingContent")) null else ({ RenderComposeChildren(node.slot("supportingContent")) }),
      `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent")) }),
    )
    12 -> androidx.compose.material3.ListItem(
      `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
      `modifier` = node.modifier("modifier"),
      `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent")) }),
      `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent")) }),
    )
    13 -> androidx.compose.material3.ListItem(
      `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
      `modifier` = node.modifier("modifier"),
      `overlineContent` = if (node.isNull("overlineContent")) null else ({ RenderComposeChildren(node.slot("overlineContent")) }),
      `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent")) }),
      `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent")) }),
    )
    14 -> androidx.compose.material3.ListItem(
      `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
      `modifier` = node.modifier("modifier"),
      `supportingContent` = if (node.isNull("supportingContent")) null else ({ RenderComposeChildren(node.slot("supportingContent")) }),
      `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent")) }),
      `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent")) }),
    )
    else -> androidx.compose.material3.ListItem(
      `headlineContent` = { RenderComposeChildren(node.slot("headlineContent")) },
      `modifier` = node.modifier("modifier"),
      `overlineContent` = if (node.isNull("overlineContent")) null else ({ RenderComposeChildren(node.slot("overlineContent")) }),
      `supportingContent` = if (node.isNull("supportingContent")) null else ({ RenderComposeChildren(node.slot("supportingContent")) }),
      `leadingContent` = if (node.isNull("leadingContent")) null else ({ RenderComposeChildren(node.slot("leadingContent")) }),
      `trailingContent` = if (node.isNull("trailingContent")) null else ({ RenderComposeChildren(node.slot("trailingContent")) }),
    )
  }
}

@Composable
private fun renderMaterialTheme(node: ComposeNode) {
  androidx.compose.material3.MaterialTheme(
    content = { RenderComposeChildren(node.children) },
  )
}

@Composable
private fun renderModalDrawerSheet(node: ComposeNode) {
  val mask = (if (node.has("drawerContainerColor")) 1 else 0) +
    (if (node.has("drawerContentColor")) 2 else 0) +
    (if (node.has("drawerTonalElevation")) 4 else 0)
  when (mask) {
    0 -> androidx.compose.material3.ModalDrawerSheet(
      `modifier` = node.modifier("modifier"),
      content = { RenderComposeChildren(node.children) },
    )
    1 -> androidx.compose.material3.ModalDrawerSheet(
      `modifier` = node.modifier("modifier"),
      `drawerContainerColor` = node.color("drawerContainerColor"),
      content = { RenderComposeChildren(node.children) },
    )
    2 -> androidx.compose.material3.ModalDrawerSheet(
      `modifier` = node.modifier("modifier"),
      `drawerContentColor` = node.color("drawerContentColor"),
      content = { RenderComposeChildren(node.children) },
    )
    3 -> androidx.compose.material3.ModalDrawerSheet(
      `modifier` = node.modifier("modifier"),
      `drawerContainerColor` = node.color("drawerContainerColor"),
      `drawerContentColor` = node.color("drawerContentColor"),
      content = { RenderComposeChildren(node.children) },
    )
    4 -> androidx.compose.material3.ModalDrawerSheet(
      `modifier` = node.modifier("modifier"),
      `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
      content = { RenderComposeChildren(node.children) },
    )
    5 -> androidx.compose.material3.ModalDrawerSheet(
      `modifier` = node.modifier("modifier"),
      `drawerContainerColor` = node.color("drawerContainerColor"),
      `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
      content = { RenderComposeChildren(node.children) },
    )
    6 -> androidx.compose.material3.ModalDrawerSheet(
      `modifier` = node.modifier("modifier"),
      `drawerContentColor` = node.color("drawerContentColor"),
      `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
      content = { RenderComposeChildren(node.children) },
    )
    else -> androidx.compose.material3.ModalDrawerSheet(
      `modifier` = node.modifier("modifier"),
      `drawerContainerColor` = node.color("drawerContainerColor"),
      `drawerContentColor` = node.color("drawerContentColor"),
      `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
      content = { RenderComposeChildren(node.children) },
    )
  }
}

@Composable
private fun renderModalNavigationDrawer(node: ComposeNode) {
  val mask = (if (node.has("gesturesEnabled")) 1 else 0) +
    (if (node.has("scrimColor")) 2 else 0)
  when (mask) {
    0 -> androidx.compose.material3.ModalNavigationDrawer(
      `drawerContent` = { RenderComposeChildren(node.slot("drawerContent")) },
      `modifier` = node.modifier("modifier"),
      content = { RenderComposeChildren(node.children) },
    )
    1 -> androidx.compose.material3.ModalNavigationDrawer(
      `drawerContent` = { RenderComposeChildren(node.slot("drawerContent")) },
      `modifier` = node.modifier("modifier"),
      `gesturesEnabled` = node.boolean("gesturesEnabled"),
      content = { RenderComposeChildren(node.children) },
    )
    2 -> androidx.compose.material3.ModalNavigationDrawer(
      `drawerContent` = { RenderComposeChildren(node.slot("drawerContent")) },
      `modifier` = node.modifier("modifier"),
      `scrimColor` = node.color("scrimColor"),
      content = { RenderComposeChildren(node.children) },
    )
    else -> androidx.compose.material3.ModalNavigationDrawer(
      `drawerContent` = { RenderComposeChildren(node.slot("drawerContent")) },
      `modifier` = node.modifier("modifier"),
      `gesturesEnabled` = node.boolean("gesturesEnabled"),
      `scrimColor` = node.color("scrimColor"),
      content = { RenderComposeChildren(node.children) },
    )
  }
}

@Composable
private fun renderNavigationBar(node: ComposeNode) {
  val mask = (if (node.has("containerColor")) 1 else 0) +
    (if (node.has("contentColor")) 2 else 0) +
    (if (node.has("tonalElevation")) 4 else 0)
  when (mask) {
    0 -> androidx.compose.material3.NavigationBar(
      `modifier` = node.modifier("modifier"),
      content = { RenderComposeChildren(node.children) },
    )
    1 -> androidx.compose.material3.NavigationBar(
      `modifier` = node.modifier("modifier"),
      `containerColor` = node.color("containerColor"),
      content = { RenderComposeChildren(node.children) },
    )
    2 -> androidx.compose.material3.NavigationBar(
      `modifier` = node.modifier("modifier"),
      `contentColor` = node.color("contentColor"),
      content = { RenderComposeChildren(node.children) },
    )
    3 -> androidx.compose.material3.NavigationBar(
      `modifier` = node.modifier("modifier"),
      `containerColor` = node.color("containerColor"),
      `contentColor` = node.color("contentColor"),
      content = { RenderComposeChildren(node.children) },
    )
    4 -> androidx.compose.material3.NavigationBar(
      `modifier` = node.modifier("modifier"),
      `tonalElevation` = node.number("tonalElevation").dp,
      content = { RenderComposeChildren(node.children) },
    )
    5 -> androidx.compose.material3.NavigationBar(
      `modifier` = node.modifier("modifier"),
      `containerColor` = node.color("containerColor"),
      `tonalElevation` = node.number("tonalElevation").dp,
      content = { RenderComposeChildren(node.children) },
    )
    6 -> androidx.compose.material3.NavigationBar(
      `modifier` = node.modifier("modifier"),
      `contentColor` = node.color("contentColor"),
      `tonalElevation` = node.number("tonalElevation").dp,
      content = { RenderComposeChildren(node.children) },
    )
    else -> androidx.compose.material3.NavigationBar(
      `modifier` = node.modifier("modifier"),
      `containerColor` = node.color("containerColor"),
      `contentColor` = node.color("contentColor"),
      `tonalElevation` = node.number("tonalElevation").dp,
      content = { RenderComposeChildren(node.children) },
    )
  }
}

@Composable
private fun renderNavigationDrawerItem(node: ComposeNode) {
  val mask = (if (node.has("icon")) 1 else 0) +
    (if (node.has("badge")) 2 else 0)
  when (mask) {
    0 -> androidx.compose.material3.NavigationDrawerItem(
      `label` = { RenderComposeChildren(node.slot("label")) },
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier"),
    )
    1 -> androidx.compose.material3.NavigationDrawerItem(
      `label` = { RenderComposeChildren(node.slot("label")) },
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier"),
      `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
    )
    2 -> androidx.compose.material3.NavigationDrawerItem(
      `label` = { RenderComposeChildren(node.slot("label")) },
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier"),
      `badge` = if (node.isNull("badge")) null else ({ RenderComposeChildren(node.slot("badge")) }),
    )
    else -> androidx.compose.material3.NavigationDrawerItem(
      `label` = { RenderComposeChildren(node.slot("label")) },
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier"),
      `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
      `badge` = if (node.isNull("badge")) null else ({ RenderComposeChildren(node.slot("badge")) }),
    )
  }
}

@Composable
private fun renderNavigationRail(node: ComposeNode) {
  val mask = (if (node.has("containerColor")) 1 else 0) +
    (if (node.has("contentColor")) 2 else 0) +
    (if (node.has("header")) 4 else 0)
  when (mask) {
    0 -> androidx.compose.material3.NavigationRail(
      `modifier` = node.modifier("modifier"),
      content = { RenderComposeChildren(node.children) },
    )
    1 -> androidx.compose.material3.NavigationRail(
      `modifier` = node.modifier("modifier"),
      `containerColor` = node.color("containerColor"),
      content = { RenderComposeChildren(node.children) },
    )
    2 -> androidx.compose.material3.NavigationRail(
      `modifier` = node.modifier("modifier"),
      `contentColor` = node.color("contentColor"),
      content = { RenderComposeChildren(node.children) },
    )
    3 -> androidx.compose.material3.NavigationRail(
      `modifier` = node.modifier("modifier"),
      `containerColor` = node.color("containerColor"),
      `contentColor` = node.color("contentColor"),
      content = { RenderComposeChildren(node.children) },
    )
    4 -> androidx.compose.material3.NavigationRail(
      `modifier` = node.modifier("modifier"),
      `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
      content = { RenderComposeChildren(node.children) },
    )
    5 -> androidx.compose.material3.NavigationRail(
      `modifier` = node.modifier("modifier"),
      `containerColor` = node.color("containerColor"),
      `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
      content = { RenderComposeChildren(node.children) },
    )
    6 -> androidx.compose.material3.NavigationRail(
      `modifier` = node.modifier("modifier"),
      `contentColor` = node.color("contentColor"),
      `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
      content = { RenderComposeChildren(node.children) },
    )
    else -> androidx.compose.material3.NavigationRail(
      `modifier` = node.modifier("modifier"),
      `containerColor` = node.color("containerColor"),
      `contentColor` = node.color("contentColor"),
      `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header")) }),
      content = { RenderComposeChildren(node.children) },
    )
  }
}

@Composable
private fun renderNavigationRailItem(node: ComposeNode) {
  val mask = (if (node.has("enabled")) 1 else 0) +
    (if (node.has("label")) 2 else 0) +
    (if (node.has("alwaysShowLabel")) 4 else 0)
  when (mask) {
    0 -> androidx.compose.material3.NavigationRailItem(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `icon` = { RenderComposeChildren(node.slot("icon")) },
      `modifier` = node.modifier("modifier"),
    )
    1 -> androidx.compose.material3.NavigationRailItem(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `icon` = { RenderComposeChildren(node.slot("icon")) },
      `modifier` = node.modifier("modifier"),
      `enabled` = node.boolean("enabled"),
    )
    2 -> androidx.compose.material3.NavigationRailItem(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `icon` = { RenderComposeChildren(node.slot("icon")) },
      `modifier` = node.modifier("modifier"),
      `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
    )
    3 -> androidx.compose.material3.NavigationRailItem(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `icon` = { RenderComposeChildren(node.slot("icon")) },
      `modifier` = node.modifier("modifier"),
      `enabled` = node.boolean("enabled"),
      `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
    )
    4 -> androidx.compose.material3.NavigationRailItem(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `icon` = { RenderComposeChildren(node.slot("icon")) },
      `modifier` = node.modifier("modifier"),
      `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
    )
    5 -> androidx.compose.material3.NavigationRailItem(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `icon` = { RenderComposeChildren(node.slot("icon")) },
      `modifier` = node.modifier("modifier"),
      `enabled` = node.boolean("enabled"),
      `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
    )
    6 -> androidx.compose.material3.NavigationRailItem(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `icon` = { RenderComposeChildren(node.slot("icon")) },
      `modifier` = node.modifier("modifier"),
      `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
      `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
    )
    else -> androidx.compose.material3.NavigationRailItem(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `icon` = { RenderComposeChildren(node.slot("icon")) },
      `modifier` = node.modifier("modifier"),
      `enabled` = node.boolean("enabled"),
      `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
      `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
    )
  }
}

@Composable
private fun renderOutlinedButton(node: ComposeNode) {
  val mask = (if (node.has("enabled")) 1 else 0)
  when (mask) {
    0 -> androidx.compose.material3.OutlinedButton(
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier"),
      content = { RenderComposeChildren(node.children) },
    )
    else -> androidx.compose.material3.OutlinedButton(
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier"),
      `enabled` = node.boolean("enabled"),
      content = { RenderComposeChildren(node.children) },
    )
  }
}

@Composable
private fun renderOutlinedCard(node: ComposeNode) {
  androidx.compose.material3.OutlinedCard(
    `modifier` = node.modifier("modifier"),
    content = { RenderComposeChildren(node.children) },
  )
}

@Composable
private fun renderOutlinedIconButton(node: ComposeNode) {
  val mask = (if (node.has("enabled")) 1 else 0)
  when (mask) {
    0 -> androidx.compose.material3.OutlinedIconButton(
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier"),
      content = { RenderComposeChildren(node.children) },
    )
    else -> androidx.compose.material3.OutlinedIconButton(
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier"),
      `enabled` = node.boolean("enabled"),
      content = { RenderComposeChildren(node.children) },
    )
  }
}

@Composable
private fun renderOutlinedIconToggleButton(node: ComposeNode) {
  val mask = (if (node.has("enabled")) 1 else 0)
  when (mask) {
    0 -> androidx.compose.material3.OutlinedIconToggleButton(
      `checked` = node.boolean("checked"),
      `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
      `modifier` = node.modifier("modifier"),
      content = { RenderComposeChildren(node.children) },
    )
    else -> androidx.compose.material3.OutlinedIconToggleButton(
      `checked` = node.boolean("checked"),
      `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
      `modifier` = node.modifier("modifier"),
      `enabled` = node.boolean("enabled"),
      content = { RenderComposeChildren(node.children) },
    )
  }
}

@Composable
private fun renderOutlinedTextField(node: ComposeNode) {
  val mask = (if (node.has("enabled")) 1 else 0) +
    (if (node.has("readOnly")) 2 else 0) +
    (if (node.has("label")) 4 else 0) +
    (if (node.has("placeholder")) 8 else 0)
  when (mask) {
    0 -> androidx.compose.material3.OutlinedTextField(
      `value` = node.string("value"),
      `onValueChange` = { value: String -> node.emit("onValueChange", value) },
      `modifier` = node.modifier("modifier"),
    )
    1 -> androidx.compose.material3.OutlinedTextField(
      `value` = node.string("value"),
      `onValueChange` = { value: String -> node.emit("onValueChange", value) },
      `modifier` = node.modifier("modifier"),
      `enabled` = node.boolean("enabled"),
    )
    2 -> androidx.compose.material3.OutlinedTextField(
      `value` = node.string("value"),
      `onValueChange` = { value: String -> node.emit("onValueChange", value) },
      `modifier` = node.modifier("modifier"),
      `readOnly` = node.boolean("readOnly"),
    )
    3 -> androidx.compose.material3.OutlinedTextField(
      `value` = node.string("value"),
      `onValueChange` = { value: String -> node.emit("onValueChange", value) },
      `modifier` = node.modifier("modifier"),
      `enabled` = node.boolean("enabled"),
      `readOnly` = node.boolean("readOnly"),
    )
    4 -> androidx.compose.material3.OutlinedTextField(
      `value` = node.string("value"),
      `onValueChange` = { value: String -> node.emit("onValueChange", value) },
      `modifier` = node.modifier("modifier"),
      `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
    )
    5 -> androidx.compose.material3.OutlinedTextField(
      `value` = node.string("value"),
      `onValueChange` = { value: String -> node.emit("onValueChange", value) },
      `modifier` = node.modifier("modifier"),
      `enabled` = node.boolean("enabled"),
      `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
    )
    6 -> androidx.compose.material3.OutlinedTextField(
      `value` = node.string("value"),
      `onValueChange` = { value: String -> node.emit("onValueChange", value) },
      `modifier` = node.modifier("modifier"),
      `readOnly` = node.boolean("readOnly"),
      `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
    )
    7 -> androidx.compose.material3.OutlinedTextField(
      `value` = node.string("value"),
      `onValueChange` = { value: String -> node.emit("onValueChange", value) },
      `modifier` = node.modifier("modifier"),
      `enabled` = node.boolean("enabled"),
      `readOnly` = node.boolean("readOnly"),
      `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
    )
    8 -> androidx.compose.material3.OutlinedTextField(
      `value` = node.string("value"),
      `onValueChange` = { value: String -> node.emit("onValueChange", value) },
      `modifier` = node.modifier("modifier"),
      `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
    )
    9 -> androidx.compose.material3.OutlinedTextField(
      `value` = node.string("value"),
      `onValueChange` = { value: String -> node.emit("onValueChange", value) },
      `modifier` = node.modifier("modifier"),
      `enabled` = node.boolean("enabled"),
      `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
    )
    10 -> androidx.compose.material3.OutlinedTextField(
      `value` = node.string("value"),
      `onValueChange` = { value: String -> node.emit("onValueChange", value) },
      `modifier` = node.modifier("modifier"),
      `readOnly` = node.boolean("readOnly"),
      `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
    )
    11 -> androidx.compose.material3.OutlinedTextField(
      `value` = node.string("value"),
      `onValueChange` = { value: String -> node.emit("onValueChange", value) },
      `modifier` = node.modifier("modifier"),
      `enabled` = node.boolean("enabled"),
      `readOnly` = node.boolean("readOnly"),
      `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
    )
    12 -> androidx.compose.material3.OutlinedTextField(
      `value` = node.string("value"),
      `onValueChange` = { value: String -> node.emit("onValueChange", value) },
      `modifier` = node.modifier("modifier"),
      `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
      `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
    )
    13 -> androidx.compose.material3.OutlinedTextField(
      `value` = node.string("value"),
      `onValueChange` = { value: String -> node.emit("onValueChange", value) },
      `modifier` = node.modifier("modifier"),
      `enabled` = node.boolean("enabled"),
      `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
      `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
    )
    14 -> androidx.compose.material3.OutlinedTextField(
      `value` = node.string("value"),
      `onValueChange` = { value: String -> node.emit("onValueChange", value) },
      `modifier` = node.modifier("modifier"),
      `readOnly` = node.boolean("readOnly"),
      `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
      `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
    )
    else -> androidx.compose.material3.OutlinedTextField(
      `value` = node.string("value"),
      `onValueChange` = { value: String -> node.emit("onValueChange", value) },
      `modifier` = node.modifier("modifier"),
      `enabled` = node.boolean("enabled"),
      `readOnly` = node.boolean("readOnly"),
      `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
      `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
    )
  }
}

@Composable
private fun renderPermanentDrawerSheet(node: ComposeNode) {
  val mask = (if (node.has("drawerContainerColor")) 1 else 0) +
    (if (node.has("drawerContentColor")) 2 else 0) +
    (if (node.has("drawerTonalElevation")) 4 else 0)
  when (mask) {
    0 -> androidx.compose.material3.PermanentDrawerSheet(
      `modifier` = node.modifier("modifier"),
      content = { RenderComposeChildren(node.children) },
    )
    1 -> androidx.compose.material3.PermanentDrawerSheet(
      `modifier` = node.modifier("modifier"),
      `drawerContainerColor` = node.color("drawerContainerColor"),
      content = { RenderComposeChildren(node.children) },
    )
    2 -> androidx.compose.material3.PermanentDrawerSheet(
      `modifier` = node.modifier("modifier"),
      `drawerContentColor` = node.color("drawerContentColor"),
      content = { RenderComposeChildren(node.children) },
    )
    3 -> androidx.compose.material3.PermanentDrawerSheet(
      `modifier` = node.modifier("modifier"),
      `drawerContainerColor` = node.color("drawerContainerColor"),
      `drawerContentColor` = node.color("drawerContentColor"),
      content = { RenderComposeChildren(node.children) },
    )
    4 -> androidx.compose.material3.PermanentDrawerSheet(
      `modifier` = node.modifier("modifier"),
      `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
      content = { RenderComposeChildren(node.children) },
    )
    5 -> androidx.compose.material3.PermanentDrawerSheet(
      `modifier` = node.modifier("modifier"),
      `drawerContainerColor` = node.color("drawerContainerColor"),
      `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
      content = { RenderComposeChildren(node.children) },
    )
    6 -> androidx.compose.material3.PermanentDrawerSheet(
      `modifier` = node.modifier("modifier"),
      `drawerContentColor` = node.color("drawerContentColor"),
      `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
      content = { RenderComposeChildren(node.children) },
    )
    else -> androidx.compose.material3.PermanentDrawerSheet(
      `modifier` = node.modifier("modifier"),
      `drawerContainerColor` = node.color("drawerContainerColor"),
      `drawerContentColor` = node.color("drawerContentColor"),
      `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
      content = { RenderComposeChildren(node.children) },
    )
  }
}

@Composable
private fun renderPermanentNavigationDrawer(node: ComposeNode) {
  androidx.compose.material3.PermanentNavigationDrawer(
    `drawerContent` = { RenderComposeChildren(node.slot("drawerContent")) },
    `modifier` = node.modifier("modifier"),
    content = { RenderComposeChildren(node.children) },
  )
}

@Composable
private fun renderRadioButton(node: ComposeNode) {
  val mask = (if (node.has("enabled")) 1 else 0)
  when (mask) {
    0 -> androidx.compose.material3.RadioButton(
      `selected` = node.boolean("selected"),
      `onClick` = if (node.isNull("onClick")) null else ({ node.emit("onClick") }),
      `modifier` = node.modifier("modifier"),
    )
    else -> androidx.compose.material3.RadioButton(
      `selected` = node.boolean("selected"),
      `onClick` = if (node.isNull("onClick")) null else ({ node.emit("onClick") }),
      `modifier` = node.modifier("modifier"),
      `enabled` = node.boolean("enabled"),
    )
  }
}

@Composable
private fun renderRow(node: ComposeNode) {
  androidx.compose.foundation.layout.Row(
    `modifier` = node.modifier("modifier"),
    content = { RenderComposeChildren(node.children) },
  )
}

@Composable
private fun renderScrollableTabRow(node: ComposeNode) {
  val mask = (if (node.has("containerColor")) 1 else 0) +
    (if (node.has("contentColor")) 2 else 0) +
    (if (node.has("edgePadding")) 4 else 0) +
    (if (node.has("divider")) 8 else 0)
  when (mask) {
    0 -> androidx.compose.material3.ScrollableTabRow(
      `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
      `modifier` = node.modifier("modifier"),
      `tabs` = { RenderComposeChildren(node.slot("tabs")) },
    )
    1 -> androidx.compose.material3.ScrollableTabRow(
      `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
      `modifier` = node.modifier("modifier"),
      `containerColor` = node.color("containerColor"),
      `tabs` = { RenderComposeChildren(node.slot("tabs")) },
    )
    2 -> androidx.compose.material3.ScrollableTabRow(
      `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
      `modifier` = node.modifier("modifier"),
      `contentColor` = node.color("contentColor"),
      `tabs` = { RenderComposeChildren(node.slot("tabs")) },
    )
    3 -> androidx.compose.material3.ScrollableTabRow(
      `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
      `modifier` = node.modifier("modifier"),
      `containerColor` = node.color("containerColor"),
      `contentColor` = node.color("contentColor"),
      `tabs` = { RenderComposeChildren(node.slot("tabs")) },
    )
    4 -> androidx.compose.material3.ScrollableTabRow(
      `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
      `modifier` = node.modifier("modifier"),
      `edgePadding` = node.number("edgePadding").dp,
      `tabs` = { RenderComposeChildren(node.slot("tabs")) },
    )
    5 -> androidx.compose.material3.ScrollableTabRow(
      `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
      `modifier` = node.modifier("modifier"),
      `containerColor` = node.color("containerColor"),
      `edgePadding` = node.number("edgePadding").dp,
      `tabs` = { RenderComposeChildren(node.slot("tabs")) },
    )
    6 -> androidx.compose.material3.ScrollableTabRow(
      `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
      `modifier` = node.modifier("modifier"),
      `contentColor` = node.color("contentColor"),
      `edgePadding` = node.number("edgePadding").dp,
      `tabs` = { RenderComposeChildren(node.slot("tabs")) },
    )
    7 -> androidx.compose.material3.ScrollableTabRow(
      `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
      `modifier` = node.modifier("modifier"),
      `containerColor` = node.color("containerColor"),
      `contentColor` = node.color("contentColor"),
      `edgePadding` = node.number("edgePadding").dp,
      `tabs` = { RenderComposeChildren(node.slot("tabs")) },
    )
    8 -> androidx.compose.material3.ScrollableTabRow(
      `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
      `modifier` = node.modifier("modifier"),
      `divider` = { RenderComposeChildren(node.slot("divider")) },
      `tabs` = { RenderComposeChildren(node.slot("tabs")) },
    )
    9 -> androidx.compose.material3.ScrollableTabRow(
      `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
      `modifier` = node.modifier("modifier"),
      `containerColor` = node.color("containerColor"),
      `divider` = { RenderComposeChildren(node.slot("divider")) },
      `tabs` = { RenderComposeChildren(node.slot("tabs")) },
    )
    10 -> androidx.compose.material3.ScrollableTabRow(
      `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
      `modifier` = node.modifier("modifier"),
      `contentColor` = node.color("contentColor"),
      `divider` = { RenderComposeChildren(node.slot("divider")) },
      `tabs` = { RenderComposeChildren(node.slot("tabs")) },
    )
    11 -> androidx.compose.material3.ScrollableTabRow(
      `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
      `modifier` = node.modifier("modifier"),
      `containerColor` = node.color("containerColor"),
      `contentColor` = node.color("contentColor"),
      `divider` = { RenderComposeChildren(node.slot("divider")) },
      `tabs` = { RenderComposeChildren(node.slot("tabs")) },
    )
    12 -> androidx.compose.material3.ScrollableTabRow(
      `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
      `modifier` = node.modifier("modifier"),
      `edgePadding` = node.number("edgePadding").dp,
      `divider` = { RenderComposeChildren(node.slot("divider")) },
      `tabs` = { RenderComposeChildren(node.slot("tabs")) },
    )
    13 -> androidx.compose.material3.ScrollableTabRow(
      `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
      `modifier` = node.modifier("modifier"),
      `containerColor` = node.color("containerColor"),
      `edgePadding` = node.number("edgePadding").dp,
      `divider` = { RenderComposeChildren(node.slot("divider")) },
      `tabs` = { RenderComposeChildren(node.slot("tabs")) },
    )
    14 -> androidx.compose.material3.ScrollableTabRow(
      `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
      `modifier` = node.modifier("modifier"),
      `contentColor` = node.color("contentColor"),
      `edgePadding` = node.number("edgePadding").dp,
      `divider` = { RenderComposeChildren(node.slot("divider")) },
      `tabs` = { RenderComposeChildren(node.slot("tabs")) },
    )
    else -> androidx.compose.material3.ScrollableTabRow(
      `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
      `modifier` = node.modifier("modifier"),
      `containerColor` = node.color("containerColor"),
      `contentColor` = node.color("contentColor"),
      `edgePadding` = node.number("edgePadding").dp,
      `divider` = { RenderComposeChildren(node.slot("divider")) },
      `tabs` = { RenderComposeChildren(node.slot("tabs")) },
    )
  }
}

@Composable
private fun renderSmallFloatingActionButton(node: ComposeNode) {
  val mask = (if (node.has("containerColor")) 1 else 0) +
    (if (node.has("contentColor")) 2 else 0)
  when (mask) {
    0 -> androidx.compose.material3.SmallFloatingActionButton(
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier"),
      content = { RenderComposeChildren(node.children) },
    )
    1 -> androidx.compose.material3.SmallFloatingActionButton(
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier"),
      `containerColor` = node.color("containerColor"),
      content = { RenderComposeChildren(node.children) },
    )
    2 -> androidx.compose.material3.SmallFloatingActionButton(
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier"),
      `contentColor` = node.color("contentColor"),
      content = { RenderComposeChildren(node.children) },
    )
    else -> androidx.compose.material3.SmallFloatingActionButton(
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier"),
      `containerColor` = node.color("containerColor"),
      `contentColor` = node.color("contentColor"),
      content = { RenderComposeChildren(node.children) },
    )
  }
}

@Composable
private fun renderSnackbar(node: ComposeNode) {
  val mask = (if (node.has("action")) 1 else 0) +
    (if (node.has("dismissAction")) 2 else 0) +
    (if (node.has("actionOnNewLine")) 4 else 0) +
    (if (node.has("containerColor")) 8 else 0)
  when (mask) {
    0 -> androidx.compose.material3.Snackbar(
      `modifier` = node.modifier("modifier"),
      content = { RenderComposeChildren(node.children) },
    )
    1 -> androidx.compose.material3.Snackbar(
      `modifier` = node.modifier("modifier"),
      `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
      content = { RenderComposeChildren(node.children) },
    )
    2 -> androidx.compose.material3.Snackbar(
      `modifier` = node.modifier("modifier"),
      `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
      content = { RenderComposeChildren(node.children) },
    )
    3 -> androidx.compose.material3.Snackbar(
      `modifier` = node.modifier("modifier"),
      `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
      `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
      content = { RenderComposeChildren(node.children) },
    )
    4 -> androidx.compose.material3.Snackbar(
      `modifier` = node.modifier("modifier"),
      `actionOnNewLine` = node.boolean("actionOnNewLine"),
      content = { RenderComposeChildren(node.children) },
    )
    5 -> androidx.compose.material3.Snackbar(
      `modifier` = node.modifier("modifier"),
      `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
      `actionOnNewLine` = node.boolean("actionOnNewLine"),
      content = { RenderComposeChildren(node.children) },
    )
    6 -> androidx.compose.material3.Snackbar(
      `modifier` = node.modifier("modifier"),
      `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
      `actionOnNewLine` = node.boolean("actionOnNewLine"),
      content = { RenderComposeChildren(node.children) },
    )
    7 -> androidx.compose.material3.Snackbar(
      `modifier` = node.modifier("modifier"),
      `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
      `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
      `actionOnNewLine` = node.boolean("actionOnNewLine"),
      content = { RenderComposeChildren(node.children) },
    )
    8 -> androidx.compose.material3.Snackbar(
      `modifier` = node.modifier("modifier"),
      `containerColor` = node.color("containerColor"),
      content = { RenderComposeChildren(node.children) },
    )
    9 -> androidx.compose.material3.Snackbar(
      `modifier` = node.modifier("modifier"),
      `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
      `containerColor` = node.color("containerColor"),
      content = { RenderComposeChildren(node.children) },
    )
    10 -> androidx.compose.material3.Snackbar(
      `modifier` = node.modifier("modifier"),
      `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
      `containerColor` = node.color("containerColor"),
      content = { RenderComposeChildren(node.children) },
    )
    11 -> androidx.compose.material3.Snackbar(
      `modifier` = node.modifier("modifier"),
      `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
      `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
      `containerColor` = node.color("containerColor"),
      content = { RenderComposeChildren(node.children) },
    )
    12 -> androidx.compose.material3.Snackbar(
      `modifier` = node.modifier("modifier"),
      `actionOnNewLine` = node.boolean("actionOnNewLine"),
      `containerColor` = node.color("containerColor"),
      content = { RenderComposeChildren(node.children) },
    )
    13 -> androidx.compose.material3.Snackbar(
      `modifier` = node.modifier("modifier"),
      `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
      `actionOnNewLine` = node.boolean("actionOnNewLine"),
      `containerColor` = node.color("containerColor"),
      content = { RenderComposeChildren(node.children) },
    )
    14 -> androidx.compose.material3.Snackbar(
      `modifier` = node.modifier("modifier"),
      `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
      `actionOnNewLine` = node.boolean("actionOnNewLine"),
      `containerColor` = node.color("containerColor"),
      content = { RenderComposeChildren(node.children) },
    )
    else -> androidx.compose.material3.Snackbar(
      `modifier` = node.modifier("modifier"),
      `action` = if (node.isNull("action")) null else ({ RenderComposeChildren(node.slot("action")) }),
      `dismissAction` = if (node.isNull("dismissAction")) null else ({ RenderComposeChildren(node.slot("dismissAction")) }),
      `actionOnNewLine` = node.boolean("actionOnNewLine"),
      `containerColor` = node.color("containerColor"),
      content = { RenderComposeChildren(node.children) },
    )
  }
}

@Composable
private fun renderSpacer(node: ComposeNode) {
  androidx.compose.foundation.layout.Spacer(
    `modifier` = node.modifier("modifier"),
  )
}

@Composable
private fun renderSuggestionChip(node: ComposeNode) {
  val mask = (if (node.has("enabled")) 1 else 0) +
    (if (node.has("icon")) 2 else 0)
  when (mask) {
    0 -> androidx.compose.material3.SuggestionChip(
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier"),
    )
    1 -> androidx.compose.material3.SuggestionChip(
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier"),
      `enabled` = node.boolean("enabled"),
    )
    2 -> androidx.compose.material3.SuggestionChip(
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier"),
      `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
    )
    else -> androidx.compose.material3.SuggestionChip(
      `onClick` = { node.emit("onClick") },
      `label` = { RenderComposeChildren(node.slot("label")) },
      `modifier` = node.modifier("modifier"),
      `enabled` = node.boolean("enabled"),
      `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
    )
  }
}

@Composable
private fun renderSurface(node: ComposeNode) {
  val mask = (if (node.has("color")) 1 else 0) +
    (if (node.has("contentColor")) 2 else 0) +
    (if (node.has("tonalElevation")) 4 else 0) +
    (if (node.has("shadowElevation")) 8 else 0)
  when (mask) {
    0 -> androidx.compose.material3.Surface(
      `modifier` = node.modifier("modifier"),
      content = { RenderComposeChildren(node.children) },
    )
    1 -> androidx.compose.material3.Surface(
      `modifier` = node.modifier("modifier"),
      `color` = node.color("color"),
      content = { RenderComposeChildren(node.children) },
    )
    2 -> androidx.compose.material3.Surface(
      `modifier` = node.modifier("modifier"),
      `contentColor` = node.color("contentColor"),
      content = { RenderComposeChildren(node.children) },
    )
    3 -> androidx.compose.material3.Surface(
      `modifier` = node.modifier("modifier"),
      `color` = node.color("color"),
      `contentColor` = node.color("contentColor"),
      content = { RenderComposeChildren(node.children) },
    )
    4 -> androidx.compose.material3.Surface(
      `modifier` = node.modifier("modifier"),
      `tonalElevation` = node.number("tonalElevation").dp,
      content = { RenderComposeChildren(node.children) },
    )
    5 -> androidx.compose.material3.Surface(
      `modifier` = node.modifier("modifier"),
      `color` = node.color("color"),
      `tonalElevation` = node.number("tonalElevation").dp,
      content = { RenderComposeChildren(node.children) },
    )
    6 -> androidx.compose.material3.Surface(
      `modifier` = node.modifier("modifier"),
      `contentColor` = node.color("contentColor"),
      `tonalElevation` = node.number("tonalElevation").dp,
      content = { RenderComposeChildren(node.children) },
    )
    7 -> androidx.compose.material3.Surface(
      `modifier` = node.modifier("modifier"),
      `color` = node.color("color"),
      `contentColor` = node.color("contentColor"),
      `tonalElevation` = node.number("tonalElevation").dp,
      content = { RenderComposeChildren(node.children) },
    )
    8 -> androidx.compose.material3.Surface(
      `modifier` = node.modifier("modifier"),
      `shadowElevation` = node.number("shadowElevation").dp,
      content = { RenderComposeChildren(node.children) },
    )
    9 -> androidx.compose.material3.Surface(
      `modifier` = node.modifier("modifier"),
      `color` = node.color("color"),
      `shadowElevation` = node.number("shadowElevation").dp,
      content = { RenderComposeChildren(node.children) },
    )
    10 -> androidx.compose.material3.Surface(
      `modifier` = node.modifier("modifier"),
      `contentColor` = node.color("contentColor"),
      `shadowElevation` = node.number("shadowElevation").dp,
      content = { RenderComposeChildren(node.children) },
    )
    11 -> androidx.compose.material3.Surface(
      `modifier` = node.modifier("modifier"),
      `color` = node.color("color"),
      `contentColor` = node.color("contentColor"),
      `shadowElevation` = node.number("shadowElevation").dp,
      content = { RenderComposeChildren(node.children) },
    )
    12 -> androidx.compose.material3.Surface(
      `modifier` = node.modifier("modifier"),
      `tonalElevation` = node.number("tonalElevation").dp,
      `shadowElevation` = node.number("shadowElevation").dp,
      content = { RenderComposeChildren(node.children) },
    )
    13 -> androidx.compose.material3.Surface(
      `modifier` = node.modifier("modifier"),
      `color` = node.color("color"),
      `tonalElevation` = node.number("tonalElevation").dp,
      `shadowElevation` = node.number("shadowElevation").dp,
      content = { RenderComposeChildren(node.children) },
    )
    14 -> androidx.compose.material3.Surface(
      `modifier` = node.modifier("modifier"),
      `contentColor` = node.color("contentColor"),
      `tonalElevation` = node.number("tonalElevation").dp,
      `shadowElevation` = node.number("shadowElevation").dp,
      content = { RenderComposeChildren(node.children) },
    )
    else -> androidx.compose.material3.Surface(
      `modifier` = node.modifier("modifier"),
      `color` = node.color("color"),
      `contentColor` = node.color("contentColor"),
      `tonalElevation` = node.number("tonalElevation").dp,
      `shadowElevation` = node.number("shadowElevation").dp,
      content = { RenderComposeChildren(node.children) },
    )
  }
}

@Composable
private fun renderSwitch(node: ComposeNode) {
  val mask = (if (node.has("thumbContent")) 1 else 0) +
    (if (node.has("enabled")) 2 else 0)
  when (mask) {
    0 -> androidx.compose.material3.Switch(
      `checked` = node.boolean("checked"),
      `onCheckedChange` = if (node.isNull("onCheckedChange")) null else ({ value: Boolean -> node.emit("onCheckedChange", value) }),
      `modifier` = node.modifier("modifier"),
    )
    1 -> androidx.compose.material3.Switch(
      `checked` = node.boolean("checked"),
      `onCheckedChange` = if (node.isNull("onCheckedChange")) null else ({ value: Boolean -> node.emit("onCheckedChange", value) }),
      `modifier` = node.modifier("modifier"),
      `thumbContent` = if (node.isNull("thumbContent")) null else ({ RenderComposeChildren(node.slot("thumbContent")) }),
    )
    2 -> androidx.compose.material3.Switch(
      `checked` = node.boolean("checked"),
      `onCheckedChange` = if (node.isNull("onCheckedChange")) null else ({ value: Boolean -> node.emit("onCheckedChange", value) }),
      `modifier` = node.modifier("modifier"),
      `enabled` = node.boolean("enabled"),
    )
    else -> androidx.compose.material3.Switch(
      `checked` = node.boolean("checked"),
      `onCheckedChange` = if (node.isNull("onCheckedChange")) null else ({ value: Boolean -> node.emit("onCheckedChange", value) }),
      `modifier` = node.modifier("modifier"),
      `thumbContent` = if (node.isNull("thumbContent")) null else ({ RenderComposeChildren(node.slot("thumbContent")) }),
      `enabled` = node.boolean("enabled"),
    )
  }
}

@Composable
private fun renderTab(node: ComposeNode) {
  val mask = (if (node.has("enabled")) 1 else 0) +
    (if (node.has("text")) 2 else 0) +
    (if (node.has("icon")) 4 else 0) +
    (if (node.has("selectedContentColor")) 8 else 0)
  when (mask) {
    0 -> androidx.compose.material3.Tab(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier"),
    )
    1 -> androidx.compose.material3.Tab(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier"),
      `enabled` = node.boolean("enabled"),
    )
    2 -> androidx.compose.material3.Tab(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier"),
      `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
    )
    3 -> androidx.compose.material3.Tab(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier"),
      `enabled` = node.boolean("enabled"),
      `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
    )
    4 -> androidx.compose.material3.Tab(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier"),
      `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
    )
    5 -> androidx.compose.material3.Tab(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier"),
      `enabled` = node.boolean("enabled"),
      `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
    )
    6 -> androidx.compose.material3.Tab(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier"),
      `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
      `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
    )
    7 -> androidx.compose.material3.Tab(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier"),
      `enabled` = node.boolean("enabled"),
      `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
      `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
    )
    8 -> androidx.compose.material3.Tab(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier"),
      `selectedContentColor` = node.color("selectedContentColor"),
    )
    9 -> androidx.compose.material3.Tab(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier"),
      `enabled` = node.boolean("enabled"),
      `selectedContentColor` = node.color("selectedContentColor"),
    )
    10 -> androidx.compose.material3.Tab(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier"),
      `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
      `selectedContentColor` = node.color("selectedContentColor"),
    )
    11 -> androidx.compose.material3.Tab(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier"),
      `enabled` = node.boolean("enabled"),
      `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
      `selectedContentColor` = node.color("selectedContentColor"),
    )
    12 -> androidx.compose.material3.Tab(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier"),
      `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
      `selectedContentColor` = node.color("selectedContentColor"),
    )
    13 -> androidx.compose.material3.Tab(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier"),
      `enabled` = node.boolean("enabled"),
      `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
      `selectedContentColor` = node.color("selectedContentColor"),
    )
    14 -> androidx.compose.material3.Tab(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier"),
      `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
      `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
      `selectedContentColor` = node.color("selectedContentColor"),
    )
    else -> androidx.compose.material3.Tab(
      `selected` = node.boolean("selected"),
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier"),
      `enabled` = node.boolean("enabled"),
      `text` = if (node.isNull("text")) null else ({ RenderComposeChildren(node.slot("text")) }),
      `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
      `selectedContentColor` = node.color("selectedContentColor"),
    )
  }
}

@Composable
private fun renderTabRow(node: ComposeNode) {
  val mask = (if (node.has("containerColor")) 1 else 0) +
    (if (node.has("contentColor")) 2 else 0) +
    (if (node.has("divider")) 4 else 0)
  when (mask) {
    0 -> androidx.compose.material3.TabRow(
      `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
      `modifier` = node.modifier("modifier"),
      `tabs` = { RenderComposeChildren(node.slot("tabs")) },
    )
    1 -> androidx.compose.material3.TabRow(
      `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
      `modifier` = node.modifier("modifier"),
      `containerColor` = node.color("containerColor"),
      `tabs` = { RenderComposeChildren(node.slot("tabs")) },
    )
    2 -> androidx.compose.material3.TabRow(
      `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
      `modifier` = node.modifier("modifier"),
      `contentColor` = node.color("contentColor"),
      `tabs` = { RenderComposeChildren(node.slot("tabs")) },
    )
    3 -> androidx.compose.material3.TabRow(
      `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
      `modifier` = node.modifier("modifier"),
      `containerColor` = node.color("containerColor"),
      `contentColor` = node.color("contentColor"),
      `tabs` = { RenderComposeChildren(node.slot("tabs")) },
    )
    4 -> androidx.compose.material3.TabRow(
      `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
      `modifier` = node.modifier("modifier"),
      `divider` = { RenderComposeChildren(node.slot("divider")) },
      `tabs` = { RenderComposeChildren(node.slot("tabs")) },
    )
    5 -> androidx.compose.material3.TabRow(
      `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
      `modifier` = node.modifier("modifier"),
      `containerColor` = node.color("containerColor"),
      `divider` = { RenderComposeChildren(node.slot("divider")) },
      `tabs` = { RenderComposeChildren(node.slot("tabs")) },
    )
    6 -> androidx.compose.material3.TabRow(
      `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
      `modifier` = node.modifier("modifier"),
      `contentColor` = node.color("contentColor"),
      `divider` = { RenderComposeChildren(node.slot("divider")) },
      `tabs` = { RenderComposeChildren(node.slot("tabs")) },
    )
    else -> androidx.compose.material3.TabRow(
      `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
      `modifier` = node.modifier("modifier"),
      `containerColor` = node.color("containerColor"),
      `contentColor` = node.color("contentColor"),
      `divider` = { RenderComposeChildren(node.slot("divider")) },
      `tabs` = { RenderComposeChildren(node.slot("tabs")) },
    )
  }
}

@Composable
private fun renderText(node: ComposeNode) {
  val mask = (if (node.has("color")) 1 else 0) +
    (if (node.has("fontSize")) 2 else 0) +
    (if (node.has("letterSpacing")) 4 else 0) +
    (if (node.has("lineHeight")) 8 else 0)
  when (mask) {
    0 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier"),
    )
    1 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier"),
      `color` = node.color("color"),
    )
    2 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier"),
      `fontSize` = node.number("fontSize").sp,
    )
    3 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier"),
      `color` = node.color("color"),
      `fontSize` = node.number("fontSize").sp,
    )
    4 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier"),
      `letterSpacing` = node.number("letterSpacing").sp,
    )
    5 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier"),
      `color` = node.color("color"),
      `letterSpacing` = node.number("letterSpacing").sp,
    )
    6 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier"),
      `fontSize` = node.number("fontSize").sp,
      `letterSpacing` = node.number("letterSpacing").sp,
    )
    7 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier"),
      `color` = node.color("color"),
      `fontSize` = node.number("fontSize").sp,
      `letterSpacing` = node.number("letterSpacing").sp,
    )
    8 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier"),
      `lineHeight` = node.number("lineHeight").sp,
    )
    9 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier"),
      `color` = node.color("color"),
      `lineHeight` = node.number("lineHeight").sp,
    )
    10 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier"),
      `fontSize` = node.number("fontSize").sp,
      `lineHeight` = node.number("lineHeight").sp,
    )
    11 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier"),
      `color` = node.color("color"),
      `fontSize` = node.number("fontSize").sp,
      `lineHeight` = node.number("lineHeight").sp,
    )
    12 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier"),
      `letterSpacing` = node.number("letterSpacing").sp,
      `lineHeight` = node.number("lineHeight").sp,
    )
    13 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier"),
      `color` = node.color("color"),
      `letterSpacing` = node.number("letterSpacing").sp,
      `lineHeight` = node.number("lineHeight").sp,
    )
    14 -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier"),
      `fontSize` = node.number("fontSize").sp,
      `letterSpacing` = node.number("letterSpacing").sp,
      `lineHeight` = node.number("lineHeight").sp,
    )
    else -> androidx.compose.material3.Text(
      `text` = node.string("text"),
      `modifier` = node.modifier("modifier"),
      `color` = node.color("color"),
      `fontSize` = node.number("fontSize").sp,
      `letterSpacing` = node.number("letterSpacing").sp,
      `lineHeight` = node.number("lineHeight").sp,
    )
  }
}

@Composable
private fun renderTextButton(node: ComposeNode) {
  val mask = (if (node.has("enabled")) 1 else 0)
  when (mask) {
    0 -> androidx.compose.material3.TextButton(
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier"),
      content = { RenderComposeChildren(node.children) },
    )
    else -> androidx.compose.material3.TextButton(
      `onClick` = { node.emit("onClick") },
      `modifier` = node.modifier("modifier"),
      `enabled` = node.boolean("enabled"),
      content = { RenderComposeChildren(node.children) },
    )
  }
}

@Composable
private fun renderTextField(node: ComposeNode) {
  val mask = (if (node.has("enabled")) 1 else 0) +
    (if (node.has("readOnly")) 2 else 0) +
    (if (node.has("label")) 4 else 0) +
    (if (node.has("placeholder")) 8 else 0)
  when (mask) {
    0 -> androidx.compose.material3.TextField(
      `value` = node.string("value"),
      `onValueChange` = { value: String -> node.emit("onValueChange", value) },
      `modifier` = node.modifier("modifier"),
    )
    1 -> androidx.compose.material3.TextField(
      `value` = node.string("value"),
      `onValueChange` = { value: String -> node.emit("onValueChange", value) },
      `modifier` = node.modifier("modifier"),
      `enabled` = node.boolean("enabled"),
    )
    2 -> androidx.compose.material3.TextField(
      `value` = node.string("value"),
      `onValueChange` = { value: String -> node.emit("onValueChange", value) },
      `modifier` = node.modifier("modifier"),
      `readOnly` = node.boolean("readOnly"),
    )
    3 -> androidx.compose.material3.TextField(
      `value` = node.string("value"),
      `onValueChange` = { value: String -> node.emit("onValueChange", value) },
      `modifier` = node.modifier("modifier"),
      `enabled` = node.boolean("enabled"),
      `readOnly` = node.boolean("readOnly"),
    )
    4 -> androidx.compose.material3.TextField(
      `value` = node.string("value"),
      `onValueChange` = { value: String -> node.emit("onValueChange", value) },
      `modifier` = node.modifier("modifier"),
      `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
    )
    5 -> androidx.compose.material3.TextField(
      `value` = node.string("value"),
      `onValueChange` = { value: String -> node.emit("onValueChange", value) },
      `modifier` = node.modifier("modifier"),
      `enabled` = node.boolean("enabled"),
      `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
    )
    6 -> androidx.compose.material3.TextField(
      `value` = node.string("value"),
      `onValueChange` = { value: String -> node.emit("onValueChange", value) },
      `modifier` = node.modifier("modifier"),
      `readOnly` = node.boolean("readOnly"),
      `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
    )
    7 -> androidx.compose.material3.TextField(
      `value` = node.string("value"),
      `onValueChange` = { value: String -> node.emit("onValueChange", value) },
      `modifier` = node.modifier("modifier"),
      `enabled` = node.boolean("enabled"),
      `readOnly` = node.boolean("readOnly"),
      `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
    )
    8 -> androidx.compose.material3.TextField(
      `value` = node.string("value"),
      `onValueChange` = { value: String -> node.emit("onValueChange", value) },
      `modifier` = node.modifier("modifier"),
      `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
    )
    9 -> androidx.compose.material3.TextField(
      `value` = node.string("value"),
      `onValueChange` = { value: String -> node.emit("onValueChange", value) },
      `modifier` = node.modifier("modifier"),
      `enabled` = node.boolean("enabled"),
      `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
    )
    10 -> androidx.compose.material3.TextField(
      `value` = node.string("value"),
      `onValueChange` = { value: String -> node.emit("onValueChange", value) },
      `modifier` = node.modifier("modifier"),
      `readOnly` = node.boolean("readOnly"),
      `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
    )
    11 -> androidx.compose.material3.TextField(
      `value` = node.string("value"),
      `onValueChange` = { value: String -> node.emit("onValueChange", value) },
      `modifier` = node.modifier("modifier"),
      `enabled` = node.boolean("enabled"),
      `readOnly` = node.boolean("readOnly"),
      `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
    )
    12 -> androidx.compose.material3.TextField(
      `value` = node.string("value"),
      `onValueChange` = { value: String -> node.emit("onValueChange", value) },
      `modifier` = node.modifier("modifier"),
      `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
      `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
    )
    13 -> androidx.compose.material3.TextField(
      `value` = node.string("value"),
      `onValueChange` = { value: String -> node.emit("onValueChange", value) },
      `modifier` = node.modifier("modifier"),
      `enabled` = node.boolean("enabled"),
      `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
      `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
    )
    14 -> androidx.compose.material3.TextField(
      `value` = node.string("value"),
      `onValueChange` = { value: String -> node.emit("onValueChange", value) },
      `modifier` = node.modifier("modifier"),
      `readOnly` = node.boolean("readOnly"),
      `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
      `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
    )
    else -> androidx.compose.material3.TextField(
      `value` = node.string("value"),
      `onValueChange` = { value: String -> node.emit("onValueChange", value) },
      `modifier` = node.modifier("modifier"),
      `enabled` = node.boolean("enabled"),
      `readOnly` = node.boolean("readOnly"),
      `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
      `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
    )
  }
}

@Composable
private fun renderVerticalDivider(node: ComposeNode) {
  val mask = (if (node.has("thickness")) 1 else 0) +
    (if (node.has("color")) 2 else 0)
  when (mask) {
    0 -> androidx.compose.material3.VerticalDivider(
      `modifier` = node.modifier("modifier"),
    )
    1 -> androidx.compose.material3.VerticalDivider(
      `modifier` = node.modifier("modifier"),
      `thickness` = node.number("thickness").dp,
    )
    2 -> androidx.compose.material3.VerticalDivider(
      `modifier` = node.modifier("modifier"),
      `color` = node.color("color"),
    )
    else -> androidx.compose.material3.VerticalDivider(
      `modifier` = node.modifier("modifier"),
      `thickness` = node.number("thickness").dp,
      `color` = node.color("color"),
    )
  }
}
