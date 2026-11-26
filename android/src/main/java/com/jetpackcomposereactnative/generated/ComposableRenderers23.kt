// Generated from Compose declarations by generate.mjs.
package com.jetpackcomposereactnative.generated

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material3.ExposedDropdownMenu as composeScoped0
import androidx.compose.material3.FloatingActionButtonMenuItem as composeScoped1
import androidx.compose.material3.NavigationBarItem as composeScoped2
import androidx.compose.material3.PlainTooltip as composeScoped3
import androidx.compose.material3.RichTooltip as composeScoped4
import androidx.compose.material3.SegmentedButton as composeScoped5

// androidx.compose.material3.ModalDrawerSheet(drawerState: androidx.compose.material3.DrawerState, modifier: androidx.compose.ui.Modifier, drawerShape: androidx.compose.ui.graphics.Shape, drawerContainerColor: androidx.compose.ui.graphics.Color, drawerContentColor: androidx.compose.ui.graphics.Color, drawerTonalElevation: androidx.compose.ui.unit.Dp, windowInsets: androidx.compose.foundation.layout.WindowInsets, content: kotlin.Function1<androidx.compose.foundation.layout.ColumnScope, kotlin.Unit>)
internal object RendererModalDrawerSheet_1 {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val drawerStateValue = if (node.has("drawerState") && !node.isNull("drawerState")) node.jsonObject("drawerState").rememberComposeDrawerState(node.arguments()) else null
    val mask = (if (node.has("drawerShape")) 1 else 0) +
      (if (node.has("drawerContainerColor")) 2 else 0) +
      (if (node.has("drawerContentColor")) 4 else 0) +
      (if (node.has("drawerTonalElevation")) 8 else 0) +
      (if (node.has("windowInsets")) 16 else 0)
    when (mask) {
      0 -> androidx.compose.material3.ModalDrawerSheet(
        `drawerState` = requireNotNull(drawerStateValue),
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.material3.ModalDrawerSheet(
        `drawerState` = requireNotNull(drawerStateValue),
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      2 -> androidx.compose.material3.ModalDrawerSheet(
        `drawerState` = requireNotNull(drawerStateValue),
        `modifier` = node.modifier("modifier", scope),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.ModalDrawerSheet(
        `drawerState` = requireNotNull(drawerStateValue),
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      4 -> androidx.compose.material3.ModalDrawerSheet(
        `drawerState` = requireNotNull(drawerStateValue),
        `modifier` = node.modifier("modifier", scope),
        `drawerContentColor` = node.color("drawerContentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.material3.ModalDrawerSheet(
        `drawerState` = requireNotNull(drawerStateValue),
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        `drawerContentColor` = node.color("drawerContentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.material3.ModalDrawerSheet(
        `drawerState` = requireNotNull(drawerStateValue),
        `modifier` = node.modifier("modifier", scope),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        `drawerContentColor` = node.color("drawerContentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.material3.ModalDrawerSheet(
        `drawerState` = requireNotNull(drawerStateValue),
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        `drawerContentColor` = node.color("drawerContentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      8 -> androidx.compose.material3.ModalDrawerSheet(
        `drawerState` = requireNotNull(drawerStateValue),
        `modifier` = node.modifier("modifier", scope),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      9 -> androidx.compose.material3.ModalDrawerSheet(
        `drawerState` = requireNotNull(drawerStateValue),
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      10 -> androidx.compose.material3.ModalDrawerSheet(
        `drawerState` = requireNotNull(drawerStateValue),
        `modifier` = node.modifier("modifier", scope),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      11 -> androidx.compose.material3.ModalDrawerSheet(
        `drawerState` = requireNotNull(drawerStateValue),
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      12 -> androidx.compose.material3.ModalDrawerSheet(
        `drawerState` = requireNotNull(drawerStateValue),
        `modifier` = node.modifier("modifier", scope),
        `drawerContentColor` = node.color("drawerContentColor"),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      13 -> androidx.compose.material3.ModalDrawerSheet(
        `drawerState` = requireNotNull(drawerStateValue),
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        `drawerContentColor` = node.color("drawerContentColor"),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      14 -> androidx.compose.material3.ModalDrawerSheet(
        `drawerState` = requireNotNull(drawerStateValue),
        `modifier` = node.modifier("modifier", scope),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        `drawerContentColor` = node.color("drawerContentColor"),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      15 -> androidx.compose.material3.ModalDrawerSheet(
        `drawerState` = requireNotNull(drawerStateValue),
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        `drawerContentColor` = node.color("drawerContentColor"),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      16 -> androidx.compose.material3.ModalDrawerSheet(
        `drawerState` = requireNotNull(drawerStateValue),
        `modifier` = node.modifier("modifier", scope),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      17 -> androidx.compose.material3.ModalDrawerSheet(
        `drawerState` = requireNotNull(drawerStateValue),
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      18 -> androidx.compose.material3.ModalDrawerSheet(
        `drawerState` = requireNotNull(drawerStateValue),
        `modifier` = node.modifier("modifier", scope),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      19 -> androidx.compose.material3.ModalDrawerSheet(
        `drawerState` = requireNotNull(drawerStateValue),
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      20 -> androidx.compose.material3.ModalDrawerSheet(
        `drawerState` = requireNotNull(drawerStateValue),
        `modifier` = node.modifier("modifier", scope),
        `drawerContentColor` = node.color("drawerContentColor"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      21 -> androidx.compose.material3.ModalDrawerSheet(
        `drawerState` = requireNotNull(drawerStateValue),
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        `drawerContentColor` = node.color("drawerContentColor"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      22 -> androidx.compose.material3.ModalDrawerSheet(
        `drawerState` = requireNotNull(drawerStateValue),
        `modifier` = node.modifier("modifier", scope),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        `drawerContentColor` = node.color("drawerContentColor"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      23 -> androidx.compose.material3.ModalDrawerSheet(
        `drawerState` = requireNotNull(drawerStateValue),
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        `drawerContentColor` = node.color("drawerContentColor"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      24 -> androidx.compose.material3.ModalDrawerSheet(
        `drawerState` = requireNotNull(drawerStateValue),
        `modifier` = node.modifier("modifier", scope),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      25 -> androidx.compose.material3.ModalDrawerSheet(
        `drawerState` = requireNotNull(drawerStateValue),
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      26 -> androidx.compose.material3.ModalDrawerSheet(
        `drawerState` = requireNotNull(drawerStateValue),
        `modifier` = node.modifier("modifier", scope),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      27 -> androidx.compose.material3.ModalDrawerSheet(
        `drawerState` = requireNotNull(drawerStateValue),
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      28 -> androidx.compose.material3.ModalDrawerSheet(
        `drawerState` = requireNotNull(drawerStateValue),
        `modifier` = node.modifier("modifier", scope),
        `drawerContentColor` = node.color("drawerContentColor"),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      29 -> androidx.compose.material3.ModalDrawerSheet(
        `drawerState` = requireNotNull(drawerStateValue),
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        `drawerContentColor` = node.color("drawerContentColor"),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      30 -> androidx.compose.material3.ModalDrawerSheet(
        `drawerState` = requireNotNull(drawerStateValue),
        `modifier` = node.modifier("modifier", scope),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        `drawerContentColor` = node.color("drawerContentColor"),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      31 -> androidx.compose.material3.ModalDrawerSheet(
        `drawerState` = requireNotNull(drawerStateValue),
        `modifier` = node.modifier("modifier", scope),
        `drawerShape` = node.arguments().shape("drawerShape"),
        `drawerContainerColor` = node.color("drawerContainerColor"),
        `drawerContentColor` = node.color("drawerContentColor"),
        `drawerTonalElevation` = node.number("drawerTonalElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.ModalNavigationDrawer(drawerContent: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, drawerState: androidx.compose.material3.DrawerState, gesturesEnabled: kotlin.Boolean, scrimColor: androidx.compose.ui.graphics.Color, content: kotlin.Function0<kotlin.Unit>)
internal object RendererModalNavigationDrawer {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val drawerStateValue = if (node.has("drawerState") && !node.isNull("drawerState")) node.jsonObject("drawerState").rememberComposeDrawerState(node.arguments()) else null
    val mask = (if (node.has("drawerState")) 1 else 0) +
      (if (node.has("gesturesEnabled")) 2 else 0) +
      (if (node.has("scrimColor")) 4 else 0)
    when (mask) {
      0 -> androidx.compose.material3.ModalNavigationDrawer(
        `drawerContent` = { RenderComposeChildren(node.slot("drawerContent")) },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children) },
      )
      1 -> androidx.compose.material3.ModalNavigationDrawer(
        `drawerContent` = { RenderComposeChildren(node.slot("drawerContent")) },
        `modifier` = node.modifier("modifier", scope),
        `drawerState` = requireNotNull(drawerStateValue),
        content = { RenderComposeChildren(node.children) },
      )
      2 -> androidx.compose.material3.ModalNavigationDrawer(
        `drawerContent` = { RenderComposeChildren(node.slot("drawerContent")) },
        `modifier` = node.modifier("modifier", scope),
        `gesturesEnabled` = node.boolean("gesturesEnabled"),
        content = { RenderComposeChildren(node.children) },
      )
      3 -> androidx.compose.material3.ModalNavigationDrawer(
        `drawerContent` = { RenderComposeChildren(node.slot("drawerContent")) },
        `modifier` = node.modifier("modifier", scope),
        `drawerState` = requireNotNull(drawerStateValue),
        `gesturesEnabled` = node.boolean("gesturesEnabled"),
        content = { RenderComposeChildren(node.children) },
      )
      4 -> androidx.compose.material3.ModalNavigationDrawer(
        `drawerContent` = { RenderComposeChildren(node.slot("drawerContent")) },
        `modifier` = node.modifier("modifier", scope),
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children) },
      )
      5 -> androidx.compose.material3.ModalNavigationDrawer(
        `drawerContent` = { RenderComposeChildren(node.slot("drawerContent")) },
        `modifier` = node.modifier("modifier", scope),
        `drawerState` = requireNotNull(drawerStateValue),
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children) },
      )
      6 -> androidx.compose.material3.ModalNavigationDrawer(
        `drawerContent` = { RenderComposeChildren(node.slot("drawerContent")) },
        `modifier` = node.modifier("modifier", scope),
        `gesturesEnabled` = node.boolean("gesturesEnabled"),
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children) },
      )
      7 -> androidx.compose.material3.ModalNavigationDrawer(
        `drawerContent` = { RenderComposeChildren(node.slot("drawerContent")) },
        `modifier` = node.modifier("modifier", scope),
        `drawerState` = requireNotNull(drawerStateValue),
        `gesturesEnabled` = node.boolean("gesturesEnabled"),
        `scrimColor` = node.color("scrimColor"),
        content = { RenderComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.ModalWideNavigationRail(modifier: androidx.compose.ui.Modifier, state: androidx.compose.material3.WideNavigationRailState, hideOnCollapse: kotlin.Boolean, collapsedShape: androidx.compose.ui.graphics.Shape, expandedShape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.WideNavigationRailColors, header: kotlin.Function0<kotlin.Unit>?, expandedHeaderTopPadding: androidx.compose.ui.unit.Dp, windowInsets: androidx.compose.foundation.layout.WindowInsets, arrangement: androidx.compose.foundation.layout.Arrangement.Vertical, expandedProperties: androidx.compose.material3.ModalWideNavigationRailProperties, contentPadding: androidx.compose.foundation.layout.PaddingValues, content: kotlin.Function0<kotlin.Unit>)
internal object RendererModalWideNavigationRail {
  private fun decode_hideOnCollapse(node: ComposeNode) = node.boolean("hideOnCollapse")
  private fun decode_expandedHeaderTopPadding(node: ComposeNode) = node.number("expandedHeaderTopPadding").dp

  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val stateValue = if (node.has("state") && !node.isNull("state")) node.jsonObject("state").rememberComposeWideNavigationRailState(node.arguments()) else null
    val content_header: @Composable () -> Unit = { RenderComposeChildren(node.slot("header")) }
    val slot_header = if (node.isNull("header")) null else content_header
    val renderChildren: @Composable () -> Unit = { RenderComposeChildren(node.children) }
    val mask = (if (node.has("state")) 1 else 0) +
      (if (node.has("hideOnCollapse")) 2 else 0) +
      (if (node.has("collapsedShape")) 4 else 0) +
      (if (node.has("expandedShape")) 8 else 0) +
      (if (node.has("colors")) 16 else 0) +
      (if (node.has("header")) 32 else 0) +
      (if (node.has("expandedHeaderTopPadding")) 64 else 0) +
      (if (node.has("windowInsets")) 128 else 0) +
      (if (node.has("arrangement")) 256 else 0) +
      (if (node.has("contentPadding")) 512 else 0)
    when (mask / 32) {
      0 -> renderModalWideNavigationRailGroup0(node, scope, mask, stateValue, renderChildren, slot_header)
      1 -> renderModalWideNavigationRailGroup1(node, scope, mask, stateValue, renderChildren, slot_header)
      2 -> renderModalWideNavigationRailGroup2(node, scope, mask, stateValue, renderChildren, slot_header)
      3 -> renderModalWideNavigationRailGroup3(node, scope, mask, stateValue, renderChildren, slot_header)
      4 -> renderModalWideNavigationRailGroup4(node, scope, mask, stateValue, renderChildren, slot_header)
      5 -> renderModalWideNavigationRailGroup5(node, scope, mask, stateValue, renderChildren, slot_header)
      6 -> renderModalWideNavigationRailGroup6(node, scope, mask, stateValue, renderChildren, slot_header)
      7 -> renderModalWideNavigationRailGroup7(node, scope, mask, stateValue, renderChildren, slot_header)
      8 -> renderModalWideNavigationRailGroup8(node, scope, mask, stateValue, renderChildren, slot_header)
      9 -> renderModalWideNavigationRailGroup9(node, scope, mask, stateValue, renderChildren, slot_header)
      10 -> renderModalWideNavigationRailGroup10(node, scope, mask, stateValue, renderChildren, slot_header)
      11 -> renderModalWideNavigationRailGroup11(node, scope, mask, stateValue, renderChildren, slot_header)
      12 -> renderModalWideNavigationRailGroup12(node, scope, mask, stateValue, renderChildren, slot_header)
      13 -> renderModalWideNavigationRailGroup13(node, scope, mask, stateValue, renderChildren, slot_header)
      14 -> renderModalWideNavigationRailGroup14(node, scope, mask, stateValue, renderChildren, slot_header)
      15 -> renderModalWideNavigationRailGroup15(node, scope, mask, stateValue, renderChildren, slot_header)
      16 -> renderModalWideNavigationRailGroup16(node, scope, mask, stateValue, renderChildren, slot_header)
      17 -> renderModalWideNavigationRailGroup17(node, scope, mask, stateValue, renderChildren, slot_header)
      18 -> renderModalWideNavigationRailGroup18(node, scope, mask, stateValue, renderChildren, slot_header)
      19 -> renderModalWideNavigationRailGroup19(node, scope, mask, stateValue, renderChildren, slot_header)
      20 -> renderModalWideNavigationRailGroup20(node, scope, mask, stateValue, renderChildren, slot_header)
      21 -> renderModalWideNavigationRailGroup21(node, scope, mask, stateValue, renderChildren, slot_header)
      22 -> renderModalWideNavigationRailGroup22(node, scope, mask, stateValue, renderChildren, slot_header)
      23 -> renderModalWideNavigationRailGroup23(node, scope, mask, stateValue, renderChildren, slot_header)
      24 -> renderModalWideNavigationRailGroup24(node, scope, mask, stateValue, renderChildren, slot_header)
      25 -> renderModalWideNavigationRailGroup25(node, scope, mask, stateValue, renderChildren, slot_header)
      26 -> renderModalWideNavigationRailGroup26(node, scope, mask, stateValue, renderChildren, slot_header)
      27 -> renderModalWideNavigationRailGroup27(node, scope, mask, stateValue, renderChildren, slot_header)
      28 -> renderModalWideNavigationRailGroup28(node, scope, mask, stateValue, renderChildren, slot_header)
      29 -> renderModalWideNavigationRailGroup29(node, scope, mask, stateValue, renderChildren, slot_header)
      30 -> renderModalWideNavigationRailGroup30(node, scope, mask, stateValue, renderChildren, slot_header)
      31 -> renderModalWideNavigationRailGroup31(node, scope, mask, stateValue, renderChildren, slot_header)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderModalWideNavigationRailGroup0(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.WideNavigationRailState?, renderChildren: @Composable () -> Unit, slot_header: (@Composable () -> Unit)?) {
    when (mask) {
      0 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), content = renderChildren)
      1 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), content = renderChildren)
      2 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), content = renderChildren)
      3 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), content = renderChildren)
      4 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), content = renderChildren)
      5 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), content = renderChildren)
      6 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), content = renderChildren)
      7 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), content = renderChildren)
      8 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), content = renderChildren)
      9 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `expandedShape` = node.arguments().shape("expandedShape"), content = renderChildren)
      10 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), content = renderChildren)
      11 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), content = renderChildren)
      12 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), content = renderChildren)
      13 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), content = renderChildren)
      14 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), content = renderChildren)
      15 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), content = renderChildren)
      16 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), content = renderChildren)
      17 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), content = renderChildren)
      18 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), content = renderChildren)
      19 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), content = renderChildren)
      20 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), content = renderChildren)
      21 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), content = renderChildren)
      22 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), content = renderChildren)
      23 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), content = renderChildren)
      24 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), content = renderChildren)
      26 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), content = renderChildren)
      28 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), content = renderChildren)
      30 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderModalWideNavigationRailGroup1(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.WideNavigationRailState?, renderChildren: @Composable () -> Unit, slot_header: (@Composable () -> Unit)?) {
    when (mask) {
      32 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `header` = slot_header, content = renderChildren)
      33 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `header` = slot_header, content = renderChildren)
      34 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `header` = slot_header, content = renderChildren)
      35 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `header` = slot_header, content = renderChildren)
      36 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, content = renderChildren)
      37 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, content = renderChildren)
      38 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, content = renderChildren)
      39 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, content = renderChildren)
      40 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, content = renderChildren)
      41 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, content = renderChildren)
      42 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, content = renderChildren)
      43 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, content = renderChildren)
      44 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, content = renderChildren)
      45 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, content = renderChildren)
      46 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, content = renderChildren)
      47 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, content = renderChildren)
      48 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, content = renderChildren)
      49 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, content = renderChildren)
      50 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, content = renderChildren)
      51 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, content = renderChildren)
      52 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, content = renderChildren)
      53 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, content = renderChildren)
      54 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, content = renderChildren)
      55 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, content = renderChildren)
      56 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, content = renderChildren)
      58 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, content = renderChildren)
      60 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, content = renderChildren)
      62 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderModalWideNavigationRailGroup2(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.WideNavigationRailState?, renderChildren: @Composable () -> Unit, slot_header: (@Composable () -> Unit)?) {
    when (mask) {
      64 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      65 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      66 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      67 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      68 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      69 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      70 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      71 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      72 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      73 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      74 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      75 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      76 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      77 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      78 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      79 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      80 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      81 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      82 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      83 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      84 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      85 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      86 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      87 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      88 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      90 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      92 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      94 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderModalWideNavigationRailGroup3(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.WideNavigationRailState?, renderChildren: @Composable () -> Unit, slot_header: (@Composable () -> Unit)?) {
    when (mask) {
      96 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      97 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      98 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      99 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      100 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      101 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      102 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      103 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      104 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      105 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      106 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      107 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      108 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      109 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      110 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      111 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      112 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      113 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      114 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      115 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      116 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      117 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      118 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      119 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      120 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      122 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      124 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      126 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderModalWideNavigationRailGroup4(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.WideNavigationRailState?, renderChildren: @Composable () -> Unit, slot_header: (@Composable () -> Unit)?) {
    when (mask) {
      128 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      129 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      130 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      131 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      132 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      133 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      134 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      135 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      136 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      137 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `expandedShape` = node.arguments().shape("expandedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      138 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      139 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      140 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      141 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      142 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      143 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      144 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      146 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      148 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      150 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      152 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      154 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      156 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      158 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderModalWideNavigationRailGroup5(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.WideNavigationRailState?, renderChildren: @Composable () -> Unit, slot_header: (@Composable () -> Unit)?) {
    when (mask) {
      160 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      161 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      162 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      163 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      164 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      165 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      166 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      167 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      168 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      169 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      170 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      171 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      172 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      173 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      174 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      175 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      176 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      178 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      180 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      182 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      184 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      186 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      188 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      190 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderModalWideNavigationRailGroup6(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.WideNavigationRailState?, renderChildren: @Composable () -> Unit, slot_header: (@Composable () -> Unit)?) {
    when (mask) {
      192 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      193 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      194 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      195 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      196 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      197 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      198 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      199 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      200 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      201 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      202 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      203 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      204 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      205 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      206 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      207 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      208 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      210 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      212 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      214 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      216 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      218 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      220 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      222 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderModalWideNavigationRailGroup7(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.WideNavigationRailState?, renderChildren: @Composable () -> Unit, slot_header: (@Composable () -> Unit)?) {
    when (mask) {
      224 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      225 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      226 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      227 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      228 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      229 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      230 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      231 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      232 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      233 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      234 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      235 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      236 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      237 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      238 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      239 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      240 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      242 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      244 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      246 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      248 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      250 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      252 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      254 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderModalWideNavigationRailGroup8(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.WideNavigationRailState?, renderChildren: @Composable () -> Unit, slot_header: (@Composable () -> Unit)?) {
    when (mask) {
      256 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      257 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      258 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      259 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      260 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      261 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      262 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      263 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      264 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      265 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `expandedShape` = node.arguments().shape("expandedShape"), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      266 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      267 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      268 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      269 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      270 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      271 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      272 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      274 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      276 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      278 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      280 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      282 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      284 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      286 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderModalWideNavigationRailGroup9(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.WideNavigationRailState?, renderChildren: @Composable () -> Unit, slot_header: (@Composable () -> Unit)?) {
    when (mask) {
      288 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      289 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      290 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      291 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      292 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      293 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      294 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      295 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      296 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      297 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      298 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      299 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      300 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      301 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      302 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      303 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      304 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      306 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      308 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      310 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      312 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      314 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      316 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      318 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderModalWideNavigationRailGroup10(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.WideNavigationRailState?, renderChildren: @Composable () -> Unit, slot_header: (@Composable () -> Unit)?) {
    when (mask) {
      320 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      321 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      322 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      323 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      324 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      325 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      326 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      327 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      328 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      329 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      330 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      331 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      332 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      333 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      334 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      335 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      336 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      338 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      340 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      342 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      344 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      346 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      348 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      350 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderModalWideNavigationRailGroup11(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.WideNavigationRailState?, renderChildren: @Composable () -> Unit, slot_header: (@Composable () -> Unit)?) {
    when (mask) {
      352 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      353 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      354 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      355 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      356 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      357 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      358 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      359 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      360 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      361 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      362 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      363 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      364 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      365 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      366 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      367 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      368 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      370 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      372 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      374 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      376 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      378 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      380 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      382 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderModalWideNavigationRailGroup12(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.WideNavigationRailState?, renderChildren: @Composable () -> Unit, slot_header: (@Composable () -> Unit)?) {
    when (mask) {
      384 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      385 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      386 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      387 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      388 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      389 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      390 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      391 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      392 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      393 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `expandedShape` = node.arguments().shape("expandedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      394 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      395 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      396 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      397 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      398 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      399 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      400 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      402 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      404 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      406 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      408 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      410 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      412 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      414 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderModalWideNavigationRailGroup13(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.WideNavigationRailState?, renderChildren: @Composable () -> Unit, slot_header: (@Composable () -> Unit)?) {
    when (mask) {
      416 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      417 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      418 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      419 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      420 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      421 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      422 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      423 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      424 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      425 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      426 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      427 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      428 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      429 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      430 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      431 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      432 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      434 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      436 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      438 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      440 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      442 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      444 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      446 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderModalWideNavigationRailGroup14(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.WideNavigationRailState?, renderChildren: @Composable () -> Unit, slot_header: (@Composable () -> Unit)?) {
    when (mask) {
      448 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      449 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      450 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      451 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      452 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      453 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      454 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      455 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      456 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      457 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      458 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      459 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      460 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      461 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      462 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      463 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      464 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      466 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      468 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      470 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      472 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      474 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      476 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      478 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderModalWideNavigationRailGroup15(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.WideNavigationRailState?, renderChildren: @Composable () -> Unit, slot_header: (@Composable () -> Unit)?) {
    when (mask) {
      480 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      481 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      482 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      483 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      484 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      485 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      486 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      487 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      488 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      489 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      490 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      491 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      492 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      493 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      494 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      495 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      496 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      498 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      500 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      502 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      504 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      506 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      508 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      510 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      511 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderModalWideNavigationRailGroup16(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.WideNavigationRailState?, renderChildren: @Composable () -> Unit, slot_header: (@Composable () -> Unit)?) {
    when (mask) {
      512 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      513 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      514 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      515 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      516 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      517 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      518 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      519 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      520 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      521 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `expandedShape` = node.arguments().shape("expandedShape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      522 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      523 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      524 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      525 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      526 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      527 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderModalWideNavigationRailGroup17(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.WideNavigationRailState?, renderChildren: @Composable () -> Unit, slot_header: (@Composable () -> Unit)?) {
    when (mask) {
      544 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `header` = slot_header, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      545 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `header` = slot_header, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      546 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `header` = slot_header, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      547 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `header` = slot_header, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      548 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      549 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      550 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      551 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      552 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      553 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      554 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      555 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      556 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      557 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      558 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      559 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderModalWideNavigationRailGroup18(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.WideNavigationRailState?, renderChildren: @Composable () -> Unit, slot_header: (@Composable () -> Unit)?) {
    when (mask) {
      576 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      577 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      578 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      579 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      580 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      581 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      582 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      583 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      584 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      585 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      586 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      587 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      588 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      589 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      590 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      591 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderModalWideNavigationRailGroup19(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.WideNavigationRailState?, renderChildren: @Composable () -> Unit, slot_header: (@Composable () -> Unit)?) {
    when (mask) {
      608 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      609 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      610 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      611 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      612 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      613 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      614 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      615 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      616 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      617 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      618 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      619 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      620 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      621 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      622 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      623 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderModalWideNavigationRailGroup20(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.WideNavigationRailState?, renderChildren: @Composable () -> Unit, slot_header: (@Composable () -> Unit)?) {
    when (mask) {
      640 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      641 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      642 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      643 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      644 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      645 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      646 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      647 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      648 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      649 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `expandedShape` = node.arguments().shape("expandedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      650 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      651 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      652 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      653 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      654 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      655 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderModalWideNavigationRailGroup21(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.WideNavigationRailState?, renderChildren: @Composable () -> Unit, slot_header: (@Composable () -> Unit)?) {
    when (mask) {
      672 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      673 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      674 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      675 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      676 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      677 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      678 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      679 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      680 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      681 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      682 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      683 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      684 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      685 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      686 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      687 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderModalWideNavigationRailGroup22(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.WideNavigationRailState?, renderChildren: @Composable () -> Unit, slot_header: (@Composable () -> Unit)?) {
    when (mask) {
      704 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      705 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      706 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      707 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      708 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      709 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      710 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      711 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      712 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      713 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      714 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      715 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      716 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      717 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      718 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      719 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderModalWideNavigationRailGroup23(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.WideNavigationRailState?, renderChildren: @Composable () -> Unit, slot_header: (@Composable () -> Unit)?) {
    when (mask) {
      736 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      737 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      738 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      739 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      740 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      741 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      742 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      743 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      744 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      745 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      746 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      747 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      748 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      749 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      750 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      751 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      766 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      767 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderModalWideNavigationRailGroup24(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.WideNavigationRailState?, renderChildren: @Composable () -> Unit, slot_header: (@Composable () -> Unit)?) {
    when (mask) {
      768 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      769 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      770 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      771 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      772 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      773 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      774 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      775 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      776 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      777 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `expandedShape` = node.arguments().shape("expandedShape"), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      778 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      779 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      780 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      781 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      782 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      783 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderModalWideNavigationRailGroup25(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.WideNavigationRailState?, renderChildren: @Composable () -> Unit, slot_header: (@Composable () -> Unit)?) {
    when (mask) {
      800 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      801 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      802 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      803 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      804 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      805 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      806 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      807 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      808 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      809 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      810 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      811 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      812 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      813 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      814 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      815 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderModalWideNavigationRailGroup26(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.WideNavigationRailState?, renderChildren: @Composable () -> Unit, slot_header: (@Composable () -> Unit)?) {
    when (mask) {
      832 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      833 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      834 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      835 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      836 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      837 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      838 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      839 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      840 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      841 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      842 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      843 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      844 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      845 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      846 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      847 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderModalWideNavigationRailGroup27(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.WideNavigationRailState?, renderChildren: @Composable () -> Unit, slot_header: (@Composable () -> Unit)?) {
    when (mask) {
      864 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      865 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      866 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      867 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      868 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      869 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      870 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      871 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      872 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      873 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      874 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      875 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      876 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      877 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      878 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      879 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      894 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      895 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderModalWideNavigationRailGroup28(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.WideNavigationRailState?, renderChildren: @Composable () -> Unit, slot_header: (@Composable () -> Unit)?) {
    when (mask) {
      896 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      897 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      898 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      899 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      900 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      901 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      902 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      903 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      904 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      905 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `expandedShape` = node.arguments().shape("expandedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      906 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      907 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      908 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      909 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      910 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      911 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderModalWideNavigationRailGroup29(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.WideNavigationRailState?, renderChildren: @Composable () -> Unit, slot_header: (@Composable () -> Unit)?) {
    when (mask) {
      928 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      929 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      930 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      931 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      932 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      933 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      934 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      935 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      936 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      937 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      938 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      939 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      940 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      941 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      942 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      943 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      958 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      959 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderModalWideNavigationRailGroup30(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.WideNavigationRailState?, renderChildren: @Composable () -> Unit, slot_header: (@Composable () -> Unit)?) {
    when (mask) {
      960 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      961 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      962 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      963 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      964 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      965 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      966 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      967 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      968 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      969 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      970 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      971 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      972 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      973 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      974 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      975 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      990 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      991 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderModalWideNavigationRailGroup31(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.material3.WideNavigationRailState?, renderChildren: @Composable () -> Unit, slot_header: (@Composable () -> Unit)?) {
    when (mask) {
      992 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      993 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      994 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      995 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      996 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      997 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      998 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      999 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1000 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1001 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1002 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1003 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1004 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1005 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1006 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1007 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1014 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1015 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1018 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1019 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1020 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1021 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1022 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      1023 -> androidx.compose.material3.ModalWideNavigationRail(`modifier` = node.modifier("modifier", scope), `state` = requireNotNull(stateValue), `hideOnCollapse` = decode_hideOnCollapse(node), `collapsedShape` = node.arguments().shape("collapsedShape"), `expandedShape` = node.arguments().shape("expandedShape"), `colors` = node.jsonObject("colors").decodeComposeWideNavigationRailColorsValue(), `header` = slot_header, `expandedHeaderTopPadding` = decode_expandedHeaderTopPadding(node), `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(), `arrangement` = toComposeVerticalArrangement(node.string("arrangement")), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = renderChildren)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.MultiChoiceSegmentedButtonRow(modifier: androidx.compose.ui.Modifier, space: androidx.compose.ui.unit.Dp, content: kotlin.Function1<androidx.compose.material3.MultiChoiceSegmentedButtonRowScope, kotlin.Unit>)
internal object RendererMultiChoiceSegmentedButtonRow {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("space")) 1 else 0)
    when (mask) {
      0 -> androidx.compose.material3.MultiChoiceSegmentedButtonRow(
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.material3.MultiChoiceSegmentedButtonRow(
        `modifier` = node.modifier("modifier", scope),
        `space` = node.number("space").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.ui.layout.MultiMeasureLayout(modifier: androidx.compose.ui.Modifier, content: kotlin.Function0<kotlin.Unit>, measurePolicy: androidx.compose.ui.layout.MeasurePolicy)
internal object RendererMultiMeasureLayout {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    androidx.compose.ui.layout.MultiMeasureLayout(
      `modifier` = node.modifier("modifier", scope),
      `measurePolicy` = node.jsonObject("measurePolicy").toComposeLayoutMeasurePolicy(),
      content = { RenderComposeChildren(node.children) },
    )
  }
}

// androidx.compose.material3.NavigationBar(modifier: androidx.compose.ui.Modifier, containerColor: androidx.compose.ui.graphics.Color, contentColor: androidx.compose.ui.graphics.Color, tonalElevation: androidx.compose.ui.unit.Dp, windowInsets: androidx.compose.foundation.layout.WindowInsets, content: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>)
internal object RendererNavigationBar {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("containerColor")) 1 else 0) +
      (if (node.has("contentColor")) 2 else 0) +
      (if (node.has("tonalElevation")) 4 else 0) +
      (if (node.has("windowInsets")) 8 else 0)
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
      7 -> androidx.compose.material3.NavigationBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      8 -> androidx.compose.material3.NavigationBar(
        `modifier` = node.modifier("modifier", scope),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      9 -> androidx.compose.material3.NavigationBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      10 -> androidx.compose.material3.NavigationBar(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      11 -> androidx.compose.material3.NavigationBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      12 -> androidx.compose.material3.NavigationBar(
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      13 -> androidx.compose.material3.NavigationBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      14 -> androidx.compose.material3.NavigationBar(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      15 -> androidx.compose.material3.NavigationBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.NavigationBarItem [receiver: androidx.compose.foundation.layout.RowScope](selected: kotlin.Boolean, onClick: kotlin.Function0<kotlin.Unit>, icon: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, label: kotlin.Function0<kotlin.Unit>?, alwaysShowLabel: kotlin.Boolean, colors: androidx.compose.material3.NavigationBarItemColors, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?)
internal object RendererNavigationBarItem {
  @Composable
  fun render(node: ComposeNode, scope: androidx.compose.foundation.layout.RowScope) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("label")) 2 else 0) +
      (if (node.has("alwaysShowLabel")) 4 else 0) +
      (if (node.has("colors")) 8 else 0) +
      (if (node.has("interactionSource")) 16 else 0)
    when (mask) {
      0 -> scope.composeScoped2(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> scope.composeScoped2(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
      )
      2 -> scope.composeScoped2(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
      )
      3 -> scope.composeScoped2(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
      )
      4 -> scope.composeScoped2(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
      )
      5 -> scope.composeScoped2(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
      )
      6 -> scope.composeScoped2(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
      )
      7 -> scope.composeScoped2(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
      )
      8 -> scope.composeScoped2(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeNavigationBarItemColorsValue(),
      )
      9 -> scope.composeScoped2(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeNavigationBarItemColorsValue(),
      )
      10 -> scope.composeScoped2(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `colors` = node.jsonObject("colors").decodeComposeNavigationBarItemColorsValue(),
      )
      11 -> scope.composeScoped2(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `colors` = node.jsonObject("colors").decodeComposeNavigationBarItemColorsValue(),
      )
      12 -> scope.composeScoped2(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
        `colors` = node.jsonObject("colors").decodeComposeNavigationBarItemColorsValue(),
      )
      13 -> scope.composeScoped2(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
        `colors` = node.jsonObject("colors").decodeComposeNavigationBarItemColorsValue(),
      )
      14 -> scope.composeScoped2(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
        `colors` = node.jsonObject("colors").decodeComposeNavigationBarItemColorsValue(),
      )
      15 -> scope.composeScoped2(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
        `colors` = node.jsonObject("colors").decodeComposeNavigationBarItemColorsValue(),
      )
      16 -> scope.composeScoped2(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      17 -> scope.composeScoped2(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      18 -> scope.composeScoped2(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      19 -> scope.composeScoped2(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      20 -> scope.composeScoped2(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      21 -> scope.composeScoped2(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      22 -> scope.composeScoped2(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      23 -> scope.composeScoped2(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      24 -> scope.composeScoped2(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeNavigationBarItemColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      25 -> scope.composeScoped2(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeNavigationBarItemColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      26 -> scope.composeScoped2(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `colors` = node.jsonObject("colors").decodeComposeNavigationBarItemColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      27 -> scope.composeScoped2(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `colors` = node.jsonObject("colors").decodeComposeNavigationBarItemColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      28 -> scope.composeScoped2(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
        `colors` = node.jsonObject("colors").decodeComposeNavigationBarItemColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      29 -> scope.composeScoped2(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
        `colors` = node.jsonObject("colors").decodeComposeNavigationBarItemColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      30 -> scope.composeScoped2(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
        `colors` = node.jsonObject("colors").decodeComposeNavigationBarItemColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      31 -> scope.composeScoped2(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
        `colors` = node.jsonObject("colors").decodeComposeNavigationBarItemColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.NavigationDrawerItem(label: kotlin.Function0<kotlin.Unit>, selected: kotlin.Boolean, onClick: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, icon: kotlin.Function0<kotlin.Unit>?, badge: kotlin.Function0<kotlin.Unit>?, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.NavigationDrawerItemColors, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?)
internal object RendererNavigationDrawerItem {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("icon")) 1 else 0) +
      (if (node.has("badge")) 2 else 0) +
      (if (node.has("shape")) 4 else 0) +
      (if (node.has("interactionSource")) 8 else 0)
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
      3 -> androidx.compose.material3.NavigationDrawerItem(
        `label` = { RenderComposeChildren(node.slot("label")) },
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `badge` = if (node.isNull("badge")) null else ({ RenderComposeChildren(node.slot("badge")) }),
      )
      4 -> androidx.compose.material3.NavigationDrawerItem(
        `label` = { RenderComposeChildren(node.slot("label")) },
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
      )
      5 -> androidx.compose.material3.NavigationDrawerItem(
        `label` = { RenderComposeChildren(node.slot("label")) },
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      6 -> androidx.compose.material3.NavigationDrawerItem(
        `label` = { RenderComposeChildren(node.slot("label")) },
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `badge` = if (node.isNull("badge")) null else ({ RenderComposeChildren(node.slot("badge")) }),
        `shape` = node.arguments().shape("shape"),
      )
      7 -> androidx.compose.material3.NavigationDrawerItem(
        `label` = { RenderComposeChildren(node.slot("label")) },
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `badge` = if (node.isNull("badge")) null else ({ RenderComposeChildren(node.slot("badge")) }),
        `shape` = node.arguments().shape("shape"),
      )
      8 -> androidx.compose.material3.NavigationDrawerItem(
        `label` = { RenderComposeChildren(node.slot("label")) },
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      9 -> androidx.compose.material3.NavigationDrawerItem(
        `label` = { RenderComposeChildren(node.slot("label")) },
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      10 -> androidx.compose.material3.NavigationDrawerItem(
        `label` = { RenderComposeChildren(node.slot("label")) },
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `badge` = if (node.isNull("badge")) null else ({ RenderComposeChildren(node.slot("badge")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      11 -> androidx.compose.material3.NavigationDrawerItem(
        `label` = { RenderComposeChildren(node.slot("label")) },
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `badge` = if (node.isNull("badge")) null else ({ RenderComposeChildren(node.slot("badge")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      12 -> androidx.compose.material3.NavigationDrawerItem(
        `label` = { RenderComposeChildren(node.slot("label")) },
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      13 -> androidx.compose.material3.NavigationDrawerItem(
        `label` = { RenderComposeChildren(node.slot("label")) },
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      14 -> androidx.compose.material3.NavigationDrawerItem(
        `label` = { RenderComposeChildren(node.slot("label")) },
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `badge` = if (node.isNull("badge")) null else ({ RenderComposeChildren(node.slot("badge")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      15 -> androidx.compose.material3.NavigationDrawerItem(
        `label` = { RenderComposeChildren(node.slot("label")) },
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `icon` = if (node.isNull("icon")) null else ({ RenderComposeChildren(node.slot("icon")) }),
        `badge` = if (node.isNull("badge")) null else ({ RenderComposeChildren(node.slot("badge")) }),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.NavigationRail(modifier: androidx.compose.ui.Modifier, containerColor: androidx.compose.ui.graphics.Color, contentColor: androidx.compose.ui.graphics.Color, header: kotlin.Function1<androidx.compose.foundation.layout.ColumnScope, kotlin.Unit>?, windowInsets: androidx.compose.foundation.layout.WindowInsets, content: kotlin.Function1<androidx.compose.foundation.layout.ColumnScope, kotlin.Unit>)
internal object RendererNavigationRail {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("containerColor")) 1 else 0) +
      (if (node.has("contentColor")) 2 else 0) +
      (if (node.has("header")) 4 else 0) +
      (if (node.has("windowInsets")) 8 else 0)
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
      7 -> androidx.compose.material3.NavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header"), this) }),
        content = { RenderComposeChildren(node.children, this) },
      )
      8 -> androidx.compose.material3.NavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      9 -> androidx.compose.material3.NavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      10 -> androidx.compose.material3.NavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      11 -> androidx.compose.material3.NavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      12 -> androidx.compose.material3.NavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header"), this) }),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      13 -> androidx.compose.material3.NavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header"), this) }),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      14 -> androidx.compose.material3.NavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header"), this) }),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      15 -> androidx.compose.material3.NavigationRail(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `header` = if (node.isNull("header")) null else ({ RenderComposeChildren(node.slot("header"), this) }),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.NavigationRailItem(selected: kotlin.Boolean, onClick: kotlin.Function0<kotlin.Unit>, icon: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, label: kotlin.Function0<kotlin.Unit>?, alwaysShowLabel: kotlin.Boolean, colors: androidx.compose.material3.NavigationRailItemColors, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?)
internal object RendererNavigationRailItem {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("label")) 2 else 0) +
      (if (node.has("alwaysShowLabel")) 4 else 0) +
      (if (node.has("colors")) 8 else 0) +
      (if (node.has("interactionSource")) 16 else 0)
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
      7 -> androidx.compose.material3.NavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
      )
      8 -> androidx.compose.material3.NavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeNavigationRailItemColorsValue(),
      )
      9 -> androidx.compose.material3.NavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeNavigationRailItemColorsValue(),
      )
      10 -> androidx.compose.material3.NavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `colors` = node.jsonObject("colors").decodeComposeNavigationRailItemColorsValue(),
      )
      11 -> androidx.compose.material3.NavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `colors` = node.jsonObject("colors").decodeComposeNavigationRailItemColorsValue(),
      )
      12 -> androidx.compose.material3.NavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
        `colors` = node.jsonObject("colors").decodeComposeNavigationRailItemColorsValue(),
      )
      13 -> androidx.compose.material3.NavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
        `colors` = node.jsonObject("colors").decodeComposeNavigationRailItemColorsValue(),
      )
      14 -> androidx.compose.material3.NavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
        `colors` = node.jsonObject("colors").decodeComposeNavigationRailItemColorsValue(),
      )
      15 -> androidx.compose.material3.NavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
        `colors` = node.jsonObject("colors").decodeComposeNavigationRailItemColorsValue(),
      )
      16 -> androidx.compose.material3.NavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      17 -> androidx.compose.material3.NavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      18 -> androidx.compose.material3.NavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      19 -> androidx.compose.material3.NavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      20 -> androidx.compose.material3.NavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      21 -> androidx.compose.material3.NavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      22 -> androidx.compose.material3.NavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      23 -> androidx.compose.material3.NavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      24 -> androidx.compose.material3.NavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeNavigationRailItemColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      25 -> androidx.compose.material3.NavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeNavigationRailItemColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      26 -> androidx.compose.material3.NavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `colors` = node.jsonObject("colors").decodeComposeNavigationRailItemColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      27 -> androidx.compose.material3.NavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `colors` = node.jsonObject("colors").decodeComposeNavigationRailItemColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      28 -> androidx.compose.material3.NavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
        `colors` = node.jsonObject("colors").decodeComposeNavigationRailItemColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      29 -> androidx.compose.material3.NavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
        `colors` = node.jsonObject("colors").decodeComposeNavigationRailItemColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      30 -> androidx.compose.material3.NavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
        `colors` = node.jsonObject("colors").decodeComposeNavigationRailItemColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      31 -> androidx.compose.material3.NavigationRailItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `alwaysShowLabel` = node.boolean("alwaysShowLabel"),
        `colors` = node.jsonObject("colors").decodeComposeNavigationRailItemColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.OutlinedButton(onClick: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.ButtonColors, elevation: androidx.compose.material3.ButtonElevation?, border: androidx.compose.foundation.BorderStroke?, contentPadding: androidx.compose.foundation.layout.PaddingValues, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>)
internal object RendererOutlinedButton {
  private fun decode_enabled(node: ComposeNode) = node.boolean("enabled")

  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("shape")) 2 else 0) +
      (if (node.has("colors")) 4 else 0) +
      (if (node.has("elevation")) 8 else 0) +
      (if (node.has("border")) 16 else 0) +
      (if (node.has("contentPadding")) 32 else 0) +
      (if (node.has("interactionSource")) 64 else 0)
    when (mask / 32) {
      0 -> renderOutlinedButtonGroup0(node, scope, mask)
      1 -> renderOutlinedButtonGroup1(node, scope, mask)
      2 -> renderOutlinedButtonGroup2(node, scope, mask)
      3 -> renderOutlinedButtonGroup3(node, scope, mask)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedButtonGroup0(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      0 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), content = { RenderComposeChildren(node.children, this) })
      1 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), content = { RenderComposeChildren(node.children, this) })
      2 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), content = { RenderComposeChildren(node.children, this) })
      3 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), content = { RenderComposeChildren(node.children, this) })
      4 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), content = { RenderComposeChildren(node.children, this) })
      5 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), content = { RenderComposeChildren(node.children, this) })
      6 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), content = { RenderComposeChildren(node.children, this) })
      7 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), content = { RenderComposeChildren(node.children, this) })
      8 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), content = { RenderComposeChildren(node.children, this) })
      9 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), content = { RenderComposeChildren(node.children, this) })
      10 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), content = { RenderComposeChildren(node.children, this) })
      11 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), content = { RenderComposeChildren(node.children, this) })
      12 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), content = { RenderComposeChildren(node.children, this) })
      13 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), content = { RenderComposeChildren(node.children, this) })
      14 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), content = { RenderComposeChildren(node.children, this) })
      15 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), content = { RenderComposeChildren(node.children, this) })
      16 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      17 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      18 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      19 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      20 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      21 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      22 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      23 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      24 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      25 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      26 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      27 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      28 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      29 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      30 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      31 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedButtonGroup1(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      33 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      34 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      35 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      36 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      37 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      38 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      39 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      40 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      41 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      42 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      43 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      44 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      45 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      46 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      47 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      48 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      49 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      50 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      51 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      52 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      53 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      54 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      55 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      56 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      57 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      58 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      59 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      60 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      61 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      62 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      63 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedButtonGroup2(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      64 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      65 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      66 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      67 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      68 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      69 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      70 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      71 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      72 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      73 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      74 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      75 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      76 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      77 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      78 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      79 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      80 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      81 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      82 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      83 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      84 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      85 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      86 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      87 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      88 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      89 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      90 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      91 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      92 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      93 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      94 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      95 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedButtonGroup3(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      96 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      97 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      98 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      99 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      100 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      101 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      102 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      103 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      104 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      105 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      106 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      107 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      108 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      109 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      110 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      111 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      112 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      113 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      114 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      115 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      116 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      117 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      118 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      119 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      120 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      121 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      122 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      123 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      124 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      125 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      126 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      127 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.OutlinedButton(onClick: kotlin.Function0<kotlin.Unit>, shapes: androidx.compose.material3.ButtonShapes, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, colors: androidx.compose.material3.ButtonColors, elevation: androidx.compose.material3.ButtonElevation?, border: androidx.compose.foundation.BorderStroke?, contentPadding: androidx.compose.foundation.layout.PaddingValues, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>)
internal object RendererOutlinedButton_1 {
  private fun decode_enabled(node: ComposeNode) = node.boolean("enabled")

  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("colors")) 2 else 0) +
      (if (node.has("elevation")) 4 else 0) +
      (if (node.has("border")) 8 else 0) +
      (if (node.has("contentPadding")) 16 else 0) +
      (if (node.has("interactionSource")) 32 else 0)
    when (mask / 32) {
      0 -> renderOutlinedButton_1Group0(node, scope, mask)
      1 -> renderOutlinedButton_1Group1(node, scope, mask)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedButton_1Group0(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      0 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), content = { RenderComposeChildren(node.children, this) })
      1 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), content = { RenderComposeChildren(node.children, this) })
      2 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), content = { RenderComposeChildren(node.children, this) })
      3 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), content = { RenderComposeChildren(node.children, this) })
      4 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), content = { RenderComposeChildren(node.children, this) })
      5 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), content = { RenderComposeChildren(node.children, this) })
      6 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), content = { RenderComposeChildren(node.children, this) })
      7 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), content = { RenderComposeChildren(node.children, this) })
      8 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      9 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      10 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      11 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      12 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      13 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      14 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      15 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      16 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      17 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      18 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      19 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      20 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      21 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      22 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      23 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      24 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      25 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      26 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      27 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      28 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      29 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      30 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      31 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedButton_1Group1(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      33 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      34 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      35 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      36 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      37 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      38 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      39 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      40 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      41 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      42 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      43 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      44 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      45 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      46 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      47 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      48 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      49 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      50 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      51 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      52 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      53 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      54 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      55 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      56 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      57 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      58 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      59 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      60 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      61 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      62 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      63 -> androidx.compose.material3.OutlinedButton(`onClick` = { node.emit("onClick") }, `shapes` = node.jsonObject("shapes").decodeComposeButtonShapesValue(), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.OutlinedCard(modifier: androidx.compose.ui.Modifier, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.CardColors, elevation: androidx.compose.material3.CardElevation, border: androidx.compose.foundation.BorderStroke, content: kotlin.Function1<androidx.compose.foundation.layout.ColumnScope, kotlin.Unit>)
internal object RendererOutlinedCard {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("shape")) 1 else 0) +
      (if (node.has("colors")) 2 else 0) +
      (if (node.has("elevation")) 4 else 0) +
      (if (node.has("border")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.material3.OutlinedCard(
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.material3.OutlinedCard(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      2 -> androidx.compose.material3.OutlinedCard(
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.OutlinedCard(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      4 -> androidx.compose.material3.OutlinedCard(
        `modifier` = node.modifier("modifier", scope),
        `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.material3.OutlinedCard(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.material3.OutlinedCard(
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(),
        `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.material3.OutlinedCard(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(),
        `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      8 -> androidx.compose.material3.OutlinedCard(
        `modifier` = node.modifier("modifier", scope),
        `border` = node.jsonObject("border").toComposeBorderStroke(),
        content = { RenderComposeChildren(node.children, this) },
      )
      9 -> androidx.compose.material3.OutlinedCard(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `border` = node.jsonObject("border").toComposeBorderStroke(),
        content = { RenderComposeChildren(node.children, this) },
      )
      10 -> androidx.compose.material3.OutlinedCard(
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(),
        `border` = node.jsonObject("border").toComposeBorderStroke(),
        content = { RenderComposeChildren(node.children, this) },
      )
      11 -> androidx.compose.material3.OutlinedCard(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(),
        `border` = node.jsonObject("border").toComposeBorderStroke(),
        content = { RenderComposeChildren(node.children, this) },
      )
      12 -> androidx.compose.material3.OutlinedCard(
        `modifier` = node.modifier("modifier", scope),
        `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(),
        `border` = node.jsonObject("border").toComposeBorderStroke(),
        content = { RenderComposeChildren(node.children, this) },
      )
      13 -> androidx.compose.material3.OutlinedCard(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(),
        `border` = node.jsonObject("border").toComposeBorderStroke(),
        content = { RenderComposeChildren(node.children, this) },
      )
      14 -> androidx.compose.material3.OutlinedCard(
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(),
        `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(),
        `border` = node.jsonObject("border").toComposeBorderStroke(),
        content = { RenderComposeChildren(node.children, this) },
      )
      15 -> androidx.compose.material3.OutlinedCard(
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(),
        `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(),
        `border` = node.jsonObject("border").toComposeBorderStroke(),
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.OutlinedCard(onClick: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.CardColors, elevation: androidx.compose.material3.CardElevation, border: androidx.compose.foundation.BorderStroke, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function1<androidx.compose.foundation.layout.ColumnScope, kotlin.Unit>)
internal object RendererOutlinedCard_1 {
  private fun decode_enabled(node: ComposeNode) = node.boolean("enabled")

  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("shape")) 2 else 0) +
      (if (node.has("colors")) 4 else 0) +
      (if (node.has("elevation")) 8 else 0) +
      (if (node.has("border")) 16 else 0) +
      (if (node.has("interactionSource")) 32 else 0)
    when (mask / 32) {
      0 -> renderOutlinedCard_1Group0(node, scope, mask)
      1 -> renderOutlinedCard_1Group1(node, scope, mask)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedCard_1Group0(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      0 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), content = { RenderComposeChildren(node.children, this) })
      1 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), content = { RenderComposeChildren(node.children, this) })
      2 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), content = { RenderComposeChildren(node.children, this) })
      3 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), content = { RenderComposeChildren(node.children, this) })
      4 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), content = { RenderComposeChildren(node.children, this) })
      5 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), content = { RenderComposeChildren(node.children, this) })
      6 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), content = { RenderComposeChildren(node.children, this) })
      7 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), content = { RenderComposeChildren(node.children, this) })
      8 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), content = { RenderComposeChildren(node.children, this) })
      9 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), content = { RenderComposeChildren(node.children, this) })
      10 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), content = { RenderComposeChildren(node.children, this) })
      11 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), content = { RenderComposeChildren(node.children, this) })
      12 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), content = { RenderComposeChildren(node.children, this) })
      13 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), content = { RenderComposeChildren(node.children, this) })
      14 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), content = { RenderComposeChildren(node.children, this) })
      15 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), content = { RenderComposeChildren(node.children, this) })
      16 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `border` = node.jsonObject("border").toComposeBorderStroke(), content = { RenderComposeChildren(node.children, this) })
      17 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = node.jsonObject("border").toComposeBorderStroke(), content = { RenderComposeChildren(node.children, this) })
      18 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `border` = node.jsonObject("border").toComposeBorderStroke(), content = { RenderComposeChildren(node.children, this) })
      19 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `border` = node.jsonObject("border").toComposeBorderStroke(), content = { RenderComposeChildren(node.children, this) })
      20 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), content = { RenderComposeChildren(node.children, this) })
      21 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), content = { RenderComposeChildren(node.children, this) })
      22 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), content = { RenderComposeChildren(node.children, this) })
      23 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), content = { RenderComposeChildren(node.children, this) })
      24 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), content = { RenderComposeChildren(node.children, this) })
      25 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), content = { RenderComposeChildren(node.children, this) })
      26 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), content = { RenderComposeChildren(node.children, this) })
      27 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), content = { RenderComposeChildren(node.children, this) })
      28 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), content = { RenderComposeChildren(node.children, this) })
      29 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), content = { RenderComposeChildren(node.children, this) })
      30 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), content = { RenderComposeChildren(node.children, this) })
      31 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderOutlinedCard_1Group1(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      33 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      34 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      35 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      36 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      37 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      38 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      39 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      40 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      41 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      42 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      43 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      44 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      45 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      46 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      47 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      48 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `border` = node.jsonObject("border").toComposeBorderStroke(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      49 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = node.jsonObject("border").toComposeBorderStroke(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      50 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `border` = node.jsonObject("border").toComposeBorderStroke(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      51 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `border` = node.jsonObject("border").toComposeBorderStroke(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      52 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      53 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      54 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      55 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      56 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      57 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      58 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      59 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      60 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      61 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      62 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      63 -> androidx.compose.material3.OutlinedCard(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeCardColorsValue(), `elevation` = node.jsonObject("elevation").decodeComposeCardElevationValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.OutlinedIconButton(onClick: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.IconButtonColors, border: androidx.compose.foundation.BorderStroke?, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function0<kotlin.Unit>)
internal object RendererOutlinedIconButton {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("shape")) 2 else 0) +
      (if (node.has("colors")) 4 else 0) +
      (if (node.has("border")) 8 else 0) +
      (if (node.has("interactionSource")) 16 else 0)
    when (mask) {
      0 -> androidx.compose.material3.OutlinedIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children) },
      )
      1 -> androidx.compose.material3.OutlinedIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        content = { RenderComposeChildren(node.children) },
      )
      2 -> androidx.compose.material3.OutlinedIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      3 -> androidx.compose.material3.OutlinedIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      4 -> androidx.compose.material3.OutlinedIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        content = { RenderComposeChildren(node.children) },
      )
      5 -> androidx.compose.material3.OutlinedIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        content = { RenderComposeChildren(node.children) },
      )
      6 -> androidx.compose.material3.OutlinedIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        content = { RenderComposeChildren(node.children) },
      )
      7 -> androidx.compose.material3.OutlinedIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        content = { RenderComposeChildren(node.children) },
      )
      8 -> androidx.compose.material3.OutlinedIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      9 -> androidx.compose.material3.OutlinedIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      10 -> androidx.compose.material3.OutlinedIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      11 -> androidx.compose.material3.OutlinedIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      12 -> androidx.compose.material3.OutlinedIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      13 -> androidx.compose.material3.OutlinedIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      14 -> androidx.compose.material3.OutlinedIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      15 -> androidx.compose.material3.OutlinedIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      16 -> androidx.compose.material3.OutlinedIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      17 -> androidx.compose.material3.OutlinedIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      18 -> androidx.compose.material3.OutlinedIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      19 -> androidx.compose.material3.OutlinedIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      20 -> androidx.compose.material3.OutlinedIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      21 -> androidx.compose.material3.OutlinedIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      22 -> androidx.compose.material3.OutlinedIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      23 -> androidx.compose.material3.OutlinedIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      24 -> androidx.compose.material3.OutlinedIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      25 -> androidx.compose.material3.OutlinedIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      26 -> androidx.compose.material3.OutlinedIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      27 -> androidx.compose.material3.OutlinedIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      28 -> androidx.compose.material3.OutlinedIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      29 -> androidx.compose.material3.OutlinedIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      30 -> androidx.compose.material3.OutlinedIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      31 -> androidx.compose.material3.OutlinedIconButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.OutlinedIconButton(onClick: kotlin.Function0<kotlin.Unit>, shapes: androidx.compose.material3.IconButtonShapes, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, colors: androidx.compose.material3.IconButtonColors, border: androidx.compose.foundation.BorderStroke?, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function0<kotlin.Unit>)
internal object RendererOutlinedIconButton_1 {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("colors")) 2 else 0) +
      (if (node.has("border")) 4 else 0) +
      (if (node.has("interactionSource")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.material3.OutlinedIconButton(
        `onClick` = { node.emit("onClick") },
        `shapes` = node.jsonObject("shapes").decodeComposeIconButtonShapesValue(),
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children) },
      )
      1 -> androidx.compose.material3.OutlinedIconButton(
        `onClick` = { node.emit("onClick") },
        `shapes` = node.jsonObject("shapes").decodeComposeIconButtonShapesValue(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        content = { RenderComposeChildren(node.children) },
      )
      2 -> androidx.compose.material3.OutlinedIconButton(
        `onClick` = { node.emit("onClick") },
        `shapes` = node.jsonObject("shapes").decodeComposeIconButtonShapesValue(),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        content = { RenderComposeChildren(node.children) },
      )
      3 -> androidx.compose.material3.OutlinedIconButton(
        `onClick` = { node.emit("onClick") },
        `shapes` = node.jsonObject("shapes").decodeComposeIconButtonShapesValue(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        content = { RenderComposeChildren(node.children) },
      )
      4 -> androidx.compose.material3.OutlinedIconButton(
        `onClick` = { node.emit("onClick") },
        `shapes` = node.jsonObject("shapes").decodeComposeIconButtonShapesValue(),
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      5 -> androidx.compose.material3.OutlinedIconButton(
        `onClick` = { node.emit("onClick") },
        `shapes` = node.jsonObject("shapes").decodeComposeIconButtonShapesValue(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      6 -> androidx.compose.material3.OutlinedIconButton(
        `onClick` = { node.emit("onClick") },
        `shapes` = node.jsonObject("shapes").decodeComposeIconButtonShapesValue(),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      7 -> androidx.compose.material3.OutlinedIconButton(
        `onClick` = { node.emit("onClick") },
        `shapes` = node.jsonObject("shapes").decodeComposeIconButtonShapesValue(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      8 -> androidx.compose.material3.OutlinedIconButton(
        `onClick` = { node.emit("onClick") },
        `shapes` = node.jsonObject("shapes").decodeComposeIconButtonShapesValue(),
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      9 -> androidx.compose.material3.OutlinedIconButton(
        `onClick` = { node.emit("onClick") },
        `shapes` = node.jsonObject("shapes").decodeComposeIconButtonShapesValue(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      10 -> androidx.compose.material3.OutlinedIconButton(
        `onClick` = { node.emit("onClick") },
        `shapes` = node.jsonObject("shapes").decodeComposeIconButtonShapesValue(),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      11 -> androidx.compose.material3.OutlinedIconButton(
        `onClick` = { node.emit("onClick") },
        `shapes` = node.jsonObject("shapes").decodeComposeIconButtonShapesValue(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      12 -> androidx.compose.material3.OutlinedIconButton(
        `onClick` = { node.emit("onClick") },
        `shapes` = node.jsonObject("shapes").decodeComposeIconButtonShapesValue(),
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      13 -> androidx.compose.material3.OutlinedIconButton(
        `onClick` = { node.emit("onClick") },
        `shapes` = node.jsonObject("shapes").decodeComposeIconButtonShapesValue(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      14 -> androidx.compose.material3.OutlinedIconButton(
        `onClick` = { node.emit("onClick") },
        `shapes` = node.jsonObject("shapes").decodeComposeIconButtonShapesValue(),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      15 -> androidx.compose.material3.OutlinedIconButton(
        `onClick` = { node.emit("onClick") },
        `shapes` = node.jsonObject("shapes").decodeComposeIconButtonShapesValue(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeIconButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.OutlinedIconToggleButton(checked: kotlin.Boolean, onCheckedChange: kotlin.Function1<kotlin.Boolean, kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.IconToggleButtonColors, border: androidx.compose.foundation.BorderStroke?, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function0<kotlin.Unit>)
internal object RendererOutlinedIconToggleButton {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("shape")) 2 else 0) +
      (if (node.has("colors")) 4 else 0) +
      (if (node.has("border")) 8 else 0) +
      (if (node.has("interactionSource")) 16 else 0)
    when (mask) {
      0 -> androidx.compose.material3.OutlinedIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children) },
      )
      1 -> androidx.compose.material3.OutlinedIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        content = { RenderComposeChildren(node.children) },
      )
      2 -> androidx.compose.material3.OutlinedIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      3 -> androidx.compose.material3.OutlinedIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children) },
      )
      4 -> androidx.compose.material3.OutlinedIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        content = { RenderComposeChildren(node.children) },
      )
      5 -> androidx.compose.material3.OutlinedIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        content = { RenderComposeChildren(node.children) },
      )
      6 -> androidx.compose.material3.OutlinedIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        content = { RenderComposeChildren(node.children) },
      )
      7 -> androidx.compose.material3.OutlinedIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        content = { RenderComposeChildren(node.children) },
      )
      8 -> androidx.compose.material3.OutlinedIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      9 -> androidx.compose.material3.OutlinedIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      10 -> androidx.compose.material3.OutlinedIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      11 -> androidx.compose.material3.OutlinedIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      12 -> androidx.compose.material3.OutlinedIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      13 -> androidx.compose.material3.OutlinedIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      14 -> androidx.compose.material3.OutlinedIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      15 -> androidx.compose.material3.OutlinedIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      16 -> androidx.compose.material3.OutlinedIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      17 -> androidx.compose.material3.OutlinedIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      18 -> androidx.compose.material3.OutlinedIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      19 -> androidx.compose.material3.OutlinedIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      20 -> androidx.compose.material3.OutlinedIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      21 -> androidx.compose.material3.OutlinedIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      22 -> androidx.compose.material3.OutlinedIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      23 -> androidx.compose.material3.OutlinedIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      24 -> androidx.compose.material3.OutlinedIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      25 -> androidx.compose.material3.OutlinedIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      26 -> androidx.compose.material3.OutlinedIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      27 -> androidx.compose.material3.OutlinedIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      28 -> androidx.compose.material3.OutlinedIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      29 -> androidx.compose.material3.OutlinedIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      30 -> androidx.compose.material3.OutlinedIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      31 -> androidx.compose.material3.OutlinedIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.OutlinedIconToggleButton(checked: kotlin.Boolean, onCheckedChange: kotlin.Function1<kotlin.Boolean, kotlin.Unit>, shapes: androidx.compose.material3.IconToggleButtonShapes, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, colors: androidx.compose.material3.IconToggleButtonColors, border: androidx.compose.foundation.BorderStroke?, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function0<kotlin.Unit>)
internal object RendererOutlinedIconToggleButton_1 {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("colors")) 2 else 0) +
      (if (node.has("border")) 4 else 0) +
      (if (node.has("interactionSource")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.material3.OutlinedIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `shapes` = node.jsonObject("shapes").decodeComposeIconToggleButtonShapesValue(),
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children) },
      )
      1 -> androidx.compose.material3.OutlinedIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `shapes` = node.jsonObject("shapes").decodeComposeIconToggleButtonShapesValue(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        content = { RenderComposeChildren(node.children) },
      )
      2 -> androidx.compose.material3.OutlinedIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `shapes` = node.jsonObject("shapes").decodeComposeIconToggleButtonShapesValue(),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        content = { RenderComposeChildren(node.children) },
      )
      3 -> androidx.compose.material3.OutlinedIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `shapes` = node.jsonObject("shapes").decodeComposeIconToggleButtonShapesValue(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        content = { RenderComposeChildren(node.children) },
      )
      4 -> androidx.compose.material3.OutlinedIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `shapes` = node.jsonObject("shapes").decodeComposeIconToggleButtonShapesValue(),
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      5 -> androidx.compose.material3.OutlinedIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `shapes` = node.jsonObject("shapes").decodeComposeIconToggleButtonShapesValue(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      6 -> androidx.compose.material3.OutlinedIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `shapes` = node.jsonObject("shapes").decodeComposeIconToggleButtonShapesValue(),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      7 -> androidx.compose.material3.OutlinedIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `shapes` = node.jsonObject("shapes").decodeComposeIconToggleButtonShapesValue(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        content = { RenderComposeChildren(node.children) },
      )
      8 -> androidx.compose.material3.OutlinedIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `shapes` = node.jsonObject("shapes").decodeComposeIconToggleButtonShapesValue(),
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      9 -> androidx.compose.material3.OutlinedIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `shapes` = node.jsonObject("shapes").decodeComposeIconToggleButtonShapesValue(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      10 -> androidx.compose.material3.OutlinedIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `shapes` = node.jsonObject("shapes").decodeComposeIconToggleButtonShapesValue(),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      11 -> androidx.compose.material3.OutlinedIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `shapes` = node.jsonObject("shapes").decodeComposeIconToggleButtonShapesValue(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      12 -> androidx.compose.material3.OutlinedIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `shapes` = node.jsonObject("shapes").decodeComposeIconToggleButtonShapesValue(),
        `modifier` = node.modifier("modifier", scope),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      13 -> androidx.compose.material3.OutlinedIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `shapes` = node.jsonObject("shapes").decodeComposeIconToggleButtonShapesValue(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      14 -> androidx.compose.material3.OutlinedIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `shapes` = node.jsonObject("shapes").decodeComposeIconToggleButtonShapesValue(),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      15 -> androidx.compose.material3.OutlinedIconToggleButton(
        `checked` = node.boolean("checked"),
        `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) },
        `shapes` = node.jsonObject("shapes").decodeComposeIconToggleButtonShapesValue(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeIconToggleButtonColorsValue(),
        `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}
