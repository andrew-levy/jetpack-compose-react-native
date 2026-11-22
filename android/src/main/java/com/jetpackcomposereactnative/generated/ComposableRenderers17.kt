// Generated from Compose declarations by generate.mjs.
package com.jetpackcomposereactnative.generated

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material3.FloatingActionButtonMenuItem as composeScoped0
import androidx.compose.material3.NavigationBarItem as composeScoped1
import androidx.compose.material3.PlainTooltip as composeScoped2
import androidx.compose.material3.RichTooltip as composeScoped3
import androidx.compose.material3.SegmentedButton as composeScoped4

// androidx.compose.material3.Scaffold(modifier: androidx.compose.ui.Modifier, topBar: kotlin.Function0<kotlin.Unit>, bottomBar: kotlin.Function0<kotlin.Unit>, snackbarHost: kotlin.Function0<kotlin.Unit>, floatingActionButton: kotlin.Function0<kotlin.Unit>, floatingActionButtonPosition: androidx.compose.material3.FabPosition, containerColor: androidx.compose.ui.graphics.Color, contentColor: androidx.compose.ui.graphics.Color, contentWindowInsets: androidx.compose.foundation.layout.WindowInsets, content: kotlin.Function1<androidx.compose.foundation.layout.PaddingValues, kotlin.Unit>)
internal object RendererScaffold {
  private fun decode_containerColor(node: ComposeNode) = node.color("containerColor")
  private fun decode_contentColor(node: ComposeNode) = node.color("contentColor")

  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val slot_topBar: @Composable () -> Unit = { RenderComposeChildren(node.slot("topBar")) }
    val slot_bottomBar: @Composable () -> Unit = { RenderComposeChildren(node.slot("bottomBar")) }
    val slot_snackbarHost: @Composable () -> Unit = { RenderComposeChildren(node.slot("snackbarHost")) }
    val slot_floatingActionButton: @Composable () -> Unit = { RenderComposeChildren(node.slot("floatingActionButton")) }
    val mask = (if (node.has("topBar")) 1 else 0) +
      (if (node.has("bottomBar")) 2 else 0) +
      (if (node.has("snackbarHost")) 4 else 0) +
      (if (node.has("floatingActionButton")) 8 else 0) +
      (if (node.has("floatingActionButtonPosition")) 16 else 0) +
      (if (node.has("containerColor")) 32 else 0) +
      (if (node.has("contentColor")) 64 else 0) +
      (if (node.has("contentWindowInsets")) 128 else 0)
    when (mask / 32) {
      0 -> renderScaffoldGroup0(node, scope, mask, slot_topBar, slot_bottomBar, slot_snackbarHost, slot_floatingActionButton)
      1 -> renderScaffoldGroup1(node, scope, mask, slot_topBar, slot_bottomBar, slot_snackbarHost, slot_floatingActionButton)
      2 -> renderScaffoldGroup2(node, scope, mask, slot_topBar, slot_bottomBar, slot_snackbarHost, slot_floatingActionButton)
      3 -> renderScaffoldGroup3(node, scope, mask, slot_topBar, slot_bottomBar, slot_snackbarHost, slot_floatingActionButton)
      4 -> renderScaffoldGroup4(node, scope, mask, slot_topBar, slot_bottomBar, slot_snackbarHost, slot_floatingActionButton)
      5 -> renderScaffoldGroup5(node, scope, mask, slot_topBar, slot_bottomBar, slot_snackbarHost, slot_floatingActionButton)
      6 -> renderScaffoldGroup6(node, scope, mask, slot_topBar, slot_bottomBar, slot_snackbarHost, slot_floatingActionButton)
      7 -> renderScaffoldGroup7(node, scope, mask, slot_topBar, slot_bottomBar, slot_snackbarHost, slot_floatingActionButton)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderScaffoldGroup0(node: ComposeNode, scope: Any?, mask: Int, slot_topBar: @Composable () -> Unit, slot_bottomBar: @Composable () -> Unit, slot_snackbarHost: @Composable () -> Unit, slot_floatingActionButton: @Composable () -> Unit) {
    when (mask) {
      0 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      1 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      2 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      3 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      4 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `snackbarHost` = slot_snackbarHost, content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      5 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `snackbarHost` = slot_snackbarHost, content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      6 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      7 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      8 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `floatingActionButton` = slot_floatingActionButton, content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      9 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `floatingActionButton` = slot_floatingActionButton, content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      10 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `floatingActionButton` = slot_floatingActionButton, content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      11 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `floatingActionButton` = slot_floatingActionButton, content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      12 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      13 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      14 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      15 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      16 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      17 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      18 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      19 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      20 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `snackbarHost` = slot_snackbarHost, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      21 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `snackbarHost` = slot_snackbarHost, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      22 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      23 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      24 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      25 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      26 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      27 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      28 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      29 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      30 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      31 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderScaffoldGroup1(node: ComposeNode, scope: Any?, mask: Int, slot_topBar: @Composable () -> Unit, slot_bottomBar: @Composable () -> Unit, slot_snackbarHost: @Composable () -> Unit, slot_floatingActionButton: @Composable () -> Unit) {
    when (mask) {
      32 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      33 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      34 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      35 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      36 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `snackbarHost` = slot_snackbarHost, `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      37 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `snackbarHost` = slot_snackbarHost, `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      38 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      39 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      40 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      41 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      42 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      43 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      44 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      45 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      46 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      47 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      48 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      49 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      50 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      51 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      52 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `snackbarHost` = slot_snackbarHost, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      53 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `snackbarHost` = slot_snackbarHost, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      54 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      55 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      56 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      57 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      58 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      59 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      60 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      61 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      62 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      63 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderScaffoldGroup2(node: ComposeNode, scope: Any?, mask: Int, slot_topBar: @Composable () -> Unit, slot_bottomBar: @Composable () -> Unit, slot_snackbarHost: @Composable () -> Unit, slot_floatingActionButton: @Composable () -> Unit) {
    when (mask) {
      64 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      65 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      66 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      67 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      68 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `snackbarHost` = slot_snackbarHost, `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      69 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `snackbarHost` = slot_snackbarHost, `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      70 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      71 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      72 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `floatingActionButton` = slot_floatingActionButton, `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      73 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `floatingActionButton` = slot_floatingActionButton, `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      74 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `floatingActionButton` = slot_floatingActionButton, `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      75 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `floatingActionButton` = slot_floatingActionButton, `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      76 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      77 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      78 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      79 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      80 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      81 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      82 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      83 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      84 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `snackbarHost` = slot_snackbarHost, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      85 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `snackbarHost` = slot_snackbarHost, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      86 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      87 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      88 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      89 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      90 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      91 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      92 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      93 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      94 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      95 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderScaffoldGroup3(node: ComposeNode, scope: Any?, mask: Int, slot_topBar: @Composable () -> Unit, slot_bottomBar: @Composable () -> Unit, slot_snackbarHost: @Composable () -> Unit, slot_floatingActionButton: @Composable () -> Unit) {
    when (mask) {
      96 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      97 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      98 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      99 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      100 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `snackbarHost` = slot_snackbarHost, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      101 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `snackbarHost` = slot_snackbarHost, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      102 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      103 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      104 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      105 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      106 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      107 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      108 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      109 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      110 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      111 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      112 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      113 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      114 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      115 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      116 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `snackbarHost` = slot_snackbarHost, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      117 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `snackbarHost` = slot_snackbarHost, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      118 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      119 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      120 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      121 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      122 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      123 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      124 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      125 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      126 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      127 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderScaffoldGroup4(node: ComposeNode, scope: Any?, mask: Int, slot_topBar: @Composable () -> Unit, slot_bottomBar: @Composable () -> Unit, slot_snackbarHost: @Composable () -> Unit, slot_floatingActionButton: @Composable () -> Unit) {
    when (mask) {
      128 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      129 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      130 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      131 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      132 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `snackbarHost` = slot_snackbarHost, `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      133 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `snackbarHost` = slot_snackbarHost, `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      134 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      135 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      136 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `floatingActionButton` = slot_floatingActionButton, `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      137 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `floatingActionButton` = slot_floatingActionButton, `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      138 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `floatingActionButton` = slot_floatingActionButton, `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      139 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `floatingActionButton` = slot_floatingActionButton, `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      140 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      141 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      142 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      143 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      144 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      145 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      146 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      147 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      148 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `snackbarHost` = slot_snackbarHost, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      149 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `snackbarHost` = slot_snackbarHost, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      150 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      151 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      152 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      153 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      154 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      155 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      156 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      157 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      158 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      159 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderScaffoldGroup5(node: ComposeNode, scope: Any?, mask: Int, slot_topBar: @Composable () -> Unit, slot_bottomBar: @Composable () -> Unit, slot_snackbarHost: @Composable () -> Unit, slot_floatingActionButton: @Composable () -> Unit) {
    when (mask) {
      160 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      161 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `containerColor` = decode_containerColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      162 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `containerColor` = decode_containerColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      163 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `containerColor` = decode_containerColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      164 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `snackbarHost` = slot_snackbarHost, `containerColor` = decode_containerColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      165 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `snackbarHost` = slot_snackbarHost, `containerColor` = decode_containerColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      166 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `containerColor` = decode_containerColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      167 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `containerColor` = decode_containerColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      168 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      169 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      170 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      171 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      172 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      173 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      174 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      175 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      176 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      177 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      178 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      179 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      180 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `snackbarHost` = slot_snackbarHost, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      181 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `snackbarHost` = slot_snackbarHost, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      182 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      183 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      184 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      185 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      186 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      187 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      188 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      189 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      190 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      191 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderScaffoldGroup6(node: ComposeNode, scope: Any?, mask: Int, slot_topBar: @Composable () -> Unit, slot_bottomBar: @Composable () -> Unit, slot_snackbarHost: @Composable () -> Unit, slot_floatingActionButton: @Composable () -> Unit) {
    when (mask) {
      192 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      193 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      194 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      195 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      196 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `snackbarHost` = slot_snackbarHost, `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      197 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `snackbarHost` = slot_snackbarHost, `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      198 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      199 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      200 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `floatingActionButton` = slot_floatingActionButton, `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      201 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `floatingActionButton` = slot_floatingActionButton, `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      202 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `floatingActionButton` = slot_floatingActionButton, `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      203 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `floatingActionButton` = slot_floatingActionButton, `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      204 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      205 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      206 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      207 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      208 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      209 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      210 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      211 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      212 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `snackbarHost` = slot_snackbarHost, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      213 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `snackbarHost` = slot_snackbarHost, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      214 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      215 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      216 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      217 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      218 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      219 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      220 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      221 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      222 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      223 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderScaffoldGroup7(node: ComposeNode, scope: Any?, mask: Int, slot_topBar: @Composable () -> Unit, slot_bottomBar: @Composable () -> Unit, slot_snackbarHost: @Composable () -> Unit, slot_floatingActionButton: @Composable () -> Unit) {
    when (mask) {
      224 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      225 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      226 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      227 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      228 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `snackbarHost` = slot_snackbarHost, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      229 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `snackbarHost` = slot_snackbarHost, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      230 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      231 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      232 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      233 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      234 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      235 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      236 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      237 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      238 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      239 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      240 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      241 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      242 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      243 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      244 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `snackbarHost` = slot_snackbarHost, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      245 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `snackbarHost` = slot_snackbarHost, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      246 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      247 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      248 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      249 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      250 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      251 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      252 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      253 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      254 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      255 -> androidx.compose.material3.Scaffold(`modifier` = node.modifier("modifier", scope), `topBar` = slot_topBar, `bottomBar` = slot_bottomBar, `snackbarHost` = slot_snackbarHost, `floatingActionButton` = slot_floatingActionButton, `floatingActionButtonPosition` = toComposeFabPositionValue(node.string("floatingActionButtonPosition")), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `contentWindowInsets` = node.jsonObject("contentWindowInsets").toWindowInsets(), content = { padding -> RenderPaddedComposeChildren(node.children, padding) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.ScrollableTabRow(selectedTabIndex: kotlin.Int, modifier: androidx.compose.ui.Modifier, containerColor: androidx.compose.ui.graphics.Color, contentColor: androidx.compose.ui.graphics.Color, edgePadding: androidx.compose.ui.unit.Dp, indicator: kotlin.Function1<kotlin.collections.List<androidx.compose.material3.TabPosition>, kotlin.Unit>, divider: kotlin.Function0<kotlin.Unit>, tabs: kotlin.Function0<kotlin.Unit>)
internal object RendererScrollableTabRow {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
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
      15 -> androidx.compose.material3.ScrollableTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `edgePadding` = node.number("edgePadding").dp,
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.SearchBar(state: androidx.compose.material3.SearchBarState, inputField: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.SearchBarColors, tonalElevation: androidx.compose.ui.unit.Dp, shadowElevation: androidx.compose.ui.unit.Dp)
internal object RendererSearchBar {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val stateValue = if (node.has("state") && !node.isNull("state")) node.jsonObject("state").rememberComposeSearchBarState() else null
    val mask = (if (node.has("shape")) 1 else 0) +
      (if (node.has("colors")) 2 else 0) +
      (if (node.has("tonalElevation")) 4 else 0) +
      (if (node.has("shadowElevation")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.material3.SearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.SearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
      )
      2 -> androidx.compose.material3.SearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
      )
      3 -> androidx.compose.material3.SearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
      )
      4 -> androidx.compose.material3.SearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      5 -> androidx.compose.material3.SearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      6 -> androidx.compose.material3.SearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      7 -> androidx.compose.material3.SearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        `tonalElevation` = node.number("tonalElevation").dp,
      )
      8 -> androidx.compose.material3.SearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      9 -> androidx.compose.material3.SearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      10 -> androidx.compose.material3.SearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      11 -> androidx.compose.material3.SearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      12 -> androidx.compose.material3.SearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      13 -> androidx.compose.material3.SearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      14 -> androidx.compose.material3.SearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      15 -> androidx.compose.material3.SearchBar(
        `state` = requireNotNull(stateValue),
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.SearchBar(inputField: kotlin.Function0<kotlin.Unit>, expanded: kotlin.Boolean, onExpandedChange: kotlin.Function1<kotlin.Boolean, kotlin.Unit>, modifier: androidx.compose.ui.Modifier, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.SearchBarColors, tonalElevation: androidx.compose.ui.unit.Dp, shadowElevation: androidx.compose.ui.unit.Dp, windowInsets: androidx.compose.foundation.layout.WindowInsets, content: kotlin.Function1<androidx.compose.foundation.layout.ColumnScope, kotlin.Unit>)
internal object RendererSearchBar_1 {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("shape")) 1 else 0) +
      (if (node.has("colors")) 2 else 0) +
      (if (node.has("tonalElevation")) 4 else 0) +
      (if (node.has("shadowElevation")) 8 else 0) +
      (if (node.has("windowInsets")) 16 else 0)
    when (mask) {
      0 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      2 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      4 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        `tonalElevation` = node.number("tonalElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      8 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      9 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      10 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      11 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      12 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      13 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      14 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      15 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      16 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      17 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      18 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      19 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      20 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      21 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      22 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        `tonalElevation` = node.number("tonalElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      23 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        `tonalElevation` = node.number("tonalElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      24 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shadowElevation` = node.number("shadowElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      25 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `shadowElevation` = node.number("shadowElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      26 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        `shadowElevation` = node.number("shadowElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      27 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        `shadowElevation` = node.number("shadowElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      28 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      29 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      30 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      31 -> androidx.compose.material3.SearchBar(
        `inputField` = { RenderComposeChildren(node.slot("inputField")) },
        `expanded` = node.boolean("expanded"),
        `onExpandedChange` = { value: Boolean -> node.emit("onExpandedChange", value) },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `colors` = node.jsonObject("colors").decodeComposeSearchBarColorsValue(),
        `tonalElevation` = node.number("tonalElevation").dp,
        `shadowElevation` = node.number("shadowElevation").dp,
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.TabRowDefaults.SecondaryIndicator(modifier: androidx.compose.ui.Modifier, height: androidx.compose.ui.unit.Dp, color: androidx.compose.ui.graphics.Color)
internal object RendererSecondaryIndicator {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("height")) 1 else 0) +
      (if (node.has("color")) 2 else 0)
    when (mask) {
      0 -> androidx.compose.material3.TabRowDefaults.SecondaryIndicator(
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.TabRowDefaults.SecondaryIndicator(
        `modifier` = node.modifier("modifier", scope),
        `height` = node.number("height").dp,
      )
      2 -> androidx.compose.material3.TabRowDefaults.SecondaryIndicator(
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
      )
      3 -> androidx.compose.material3.TabRowDefaults.SecondaryIndicator(
        `modifier` = node.modifier("modifier", scope),
        `height` = node.number("height").dp,
        `color` = node.color("color"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.SecondaryScrollableTabRow(selectedTabIndex: kotlin.Int, modifier: androidx.compose.ui.Modifier, scrollState: androidx.compose.foundation.ScrollState, containerColor: androidx.compose.ui.graphics.Color, contentColor: androidx.compose.ui.graphics.Color, edgePadding: androidx.compose.ui.unit.Dp, indicator: kotlin.Function1<androidx.compose.material3.TabIndicatorScope, kotlin.Unit>, divider: kotlin.Function0<kotlin.Unit>, minTabWidth: androidx.compose.ui.unit.Dp, tabs: kotlin.Function0<kotlin.Unit>)
internal object RendererSecondaryScrollableTabRow {
  private fun decode_selectedTabIndex(node: ComposeNode) = node.number("selectedTabIndex").toInt()
  private fun decode_containerColor(node: ComposeNode) = node.color("containerColor")
  private fun decode_contentColor(node: ComposeNode) = node.color("contentColor")
  private fun decode_edgePadding(node: ComposeNode) = node.number("edgePadding").dp
  private fun decode_minTabWidth(node: ComposeNode) = node.number("minTabWidth").dp

  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val scrollStateValue = if (node.has("scrollState") && !node.isNull("scrollState")) node.jsonObject("scrollState").rememberComposeScrollState(node.arguments()) else null
    val slot_divider: @Composable () -> Unit = { RenderComposeChildren(node.slot("divider")) }
    val slot_tabs: @Composable () -> Unit = { RenderComposeChildren(node.slot("tabs")) }
    val mask = (if (node.has("scrollState")) 1 else 0) +
      (if (node.has("containerColor")) 2 else 0) +
      (if (node.has("contentColor")) 4 else 0) +
      (if (node.has("edgePadding")) 8 else 0) +
      (if (node.has("indicator")) 16 else 0) +
      (if (node.has("divider")) 32 else 0) +
      (if (node.has("minTabWidth")) 64 else 0)
    when (mask / 32) {
      0 -> renderSecondaryScrollableTabRowGroup0(node, scope, mask, scrollStateValue, slot_divider, slot_tabs)
      1 -> renderSecondaryScrollableTabRowGroup1(node, scope, mask, scrollStateValue, slot_divider, slot_tabs)
      2 -> renderSecondaryScrollableTabRowGroup2(node, scope, mask, scrollStateValue, slot_divider, slot_tabs)
      3 -> renderSecondaryScrollableTabRowGroup3(node, scope, mask, scrollStateValue, slot_divider, slot_tabs)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecondaryScrollableTabRowGroup0(node: ComposeNode, scope: Any?, mask: Int, scrollStateValue: androidx.compose.foundation.ScrollState?, slot_divider: @Composable () -> Unit, slot_tabs: @Composable () -> Unit) {
    when (mask) {
      0 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `tabs` = slot_tabs)
      1 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `tabs` = slot_tabs)
      2 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `tabs` = slot_tabs)
      3 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), `tabs` = slot_tabs)
      4 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `tabs` = slot_tabs)
      5 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `contentColor` = decode_contentColor(node), `tabs` = slot_tabs)
      6 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `tabs` = slot_tabs)
      7 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `tabs` = slot_tabs)
      8 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `edgePadding` = decode_edgePadding(node), `tabs` = slot_tabs)
      9 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `edgePadding` = decode_edgePadding(node), `tabs` = slot_tabs)
      10 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `edgePadding` = decode_edgePadding(node), `tabs` = slot_tabs)
      11 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), `edgePadding` = decode_edgePadding(node), `tabs` = slot_tabs)
      12 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `tabs` = slot_tabs)
      13 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `tabs` = slot_tabs)
      14 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `tabs` = slot_tabs)
      15 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `tabs` = slot_tabs)
      16 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `tabs` = slot_tabs)
      17 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `tabs` = slot_tabs)
      18 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `tabs` = slot_tabs)
      19 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `tabs` = slot_tabs)
      20 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `tabs` = slot_tabs)
      21 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `contentColor` = decode_contentColor(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `tabs` = slot_tabs)
      22 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `tabs` = slot_tabs)
      23 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `tabs` = slot_tabs)
      24 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `tabs` = slot_tabs)
      25 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `tabs` = slot_tabs)
      26 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `tabs` = slot_tabs)
      27 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `tabs` = slot_tabs)
      28 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `tabs` = slot_tabs)
      29 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `tabs` = slot_tabs)
      30 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `tabs` = slot_tabs)
      31 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `tabs` = slot_tabs)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecondaryScrollableTabRowGroup1(node: ComposeNode, scope: Any?, mask: Int, scrollStateValue: androidx.compose.foundation.ScrollState?, slot_divider: @Composable () -> Unit, slot_tabs: @Composable () -> Unit) {
    when (mask) {
      32 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `divider` = slot_divider, `tabs` = slot_tabs)
      33 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `divider` = slot_divider, `tabs` = slot_tabs)
      34 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `divider` = slot_divider, `tabs` = slot_tabs)
      35 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), `divider` = slot_divider, `tabs` = slot_tabs)
      36 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `divider` = slot_divider, `tabs` = slot_tabs)
      37 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `contentColor` = decode_contentColor(node), `divider` = slot_divider, `tabs` = slot_tabs)
      38 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `divider` = slot_divider, `tabs` = slot_tabs)
      39 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `divider` = slot_divider, `tabs` = slot_tabs)
      40 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `edgePadding` = decode_edgePadding(node), `divider` = slot_divider, `tabs` = slot_tabs)
      41 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `edgePadding` = decode_edgePadding(node), `divider` = slot_divider, `tabs` = slot_tabs)
      42 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `edgePadding` = decode_edgePadding(node), `divider` = slot_divider, `tabs` = slot_tabs)
      43 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), `edgePadding` = decode_edgePadding(node), `divider` = slot_divider, `tabs` = slot_tabs)
      44 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `divider` = slot_divider, `tabs` = slot_tabs)
      45 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `divider` = slot_divider, `tabs` = slot_tabs)
      46 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `divider` = slot_divider, `tabs` = slot_tabs)
      47 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `divider` = slot_divider, `tabs` = slot_tabs)
      48 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `tabs` = slot_tabs)
      49 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `tabs` = slot_tabs)
      50 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `tabs` = slot_tabs)
      51 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `tabs` = slot_tabs)
      52 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `tabs` = slot_tabs)
      53 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `contentColor` = decode_contentColor(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `tabs` = slot_tabs)
      54 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `tabs` = slot_tabs)
      55 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `tabs` = slot_tabs)
      56 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `tabs` = slot_tabs)
      57 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `tabs` = slot_tabs)
      58 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `tabs` = slot_tabs)
      59 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `tabs` = slot_tabs)
      60 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `tabs` = slot_tabs)
      61 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `tabs` = slot_tabs)
      62 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `tabs` = slot_tabs)
      63 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `tabs` = slot_tabs)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecondaryScrollableTabRowGroup2(node: ComposeNode, scope: Any?, mask: Int, scrollStateValue: androidx.compose.foundation.ScrollState?, slot_divider: @Composable () -> Unit, slot_tabs: @Composable () -> Unit) {
    when (mask) {
      64 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      65 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      66 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      67 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      68 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      69 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `contentColor` = decode_contentColor(node), `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      70 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      71 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      72 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `edgePadding` = decode_edgePadding(node), `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      73 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `edgePadding` = decode_edgePadding(node), `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      74 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `edgePadding` = decode_edgePadding(node), `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      75 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), `edgePadding` = decode_edgePadding(node), `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      76 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      77 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      78 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      79 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      80 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      81 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      82 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      83 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      84 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      85 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `contentColor` = decode_contentColor(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      86 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      87 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      88 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      89 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      90 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      91 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      92 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      93 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      94 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      95 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecondaryScrollableTabRowGroup3(node: ComposeNode, scope: Any?, mask: Int, scrollStateValue: androidx.compose.foundation.ScrollState?, slot_divider: @Composable () -> Unit, slot_tabs: @Composable () -> Unit) {
    when (mask) {
      96 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      97 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      98 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      99 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      100 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      101 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `contentColor` = decode_contentColor(node), `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      102 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      103 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      104 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `edgePadding` = decode_edgePadding(node), `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      105 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `edgePadding` = decode_edgePadding(node), `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      106 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `edgePadding` = decode_edgePadding(node), `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      107 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), `edgePadding` = decode_edgePadding(node), `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      108 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      109 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      110 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      111 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      112 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      113 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      114 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      115 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      116 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      117 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `contentColor` = decode_contentColor(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      118 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      119 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      120 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      121 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      122 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      123 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      124 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      125 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      126 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      127 -> androidx.compose.material3.SecondaryScrollableTabRow(`selectedTabIndex` = decode_selectedTabIndex(node), `modifier` = node.modifier("modifier", scope), `scrollState` = requireNotNull(scrollStateValue), `containerColor` = decode_containerColor(node), `contentColor` = decode_contentColor(node), `edgePadding` = decode_edgePadding(node), `indicator` = { RenderComposeChildren(node.slot("indicator"), this) }, `divider` = slot_divider, `minTabWidth` = decode_minTabWidth(node), `tabs` = slot_tabs)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.SecondaryTabRow(selectedTabIndex: kotlin.Int, modifier: androidx.compose.ui.Modifier, containerColor: androidx.compose.ui.graphics.Color, contentColor: androidx.compose.ui.graphics.Color, indicator: kotlin.Function1<androidx.compose.material3.TabIndicatorScope, kotlin.Unit>, divider: kotlin.Function0<kotlin.Unit>, tabs: kotlin.Function0<kotlin.Unit>)
internal object RendererSecondaryTabRow {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("containerColor")) 1 else 0) +
      (if (node.has("contentColor")) 2 else 0) +
      (if (node.has("indicator")) 4 else 0) +
      (if (node.has("divider")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.material3.SecondaryTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      1 -> androidx.compose.material3.SecondaryTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      2 -> androidx.compose.material3.SecondaryTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      3 -> androidx.compose.material3.SecondaryTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      4 -> androidx.compose.material3.SecondaryTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      5 -> androidx.compose.material3.SecondaryTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      6 -> androidx.compose.material3.SecondaryTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      7 -> androidx.compose.material3.SecondaryTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      8 -> androidx.compose.material3.SecondaryTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      9 -> androidx.compose.material3.SecondaryTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      10 -> androidx.compose.material3.SecondaryTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      11 -> androidx.compose.material3.SecondaryTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      12 -> androidx.compose.material3.SecondaryTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      13 -> androidx.compose.material3.SecondaryTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      14 -> androidx.compose.material3.SecondaryTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      15 -> androidx.compose.material3.SecondaryTabRow(
        `selectedTabIndex` = node.number("selectedTabIndex").toInt(),
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `indicator` = { RenderComposeChildren(node.slot("indicator"), this) },
        `divider` = { RenderComposeChildren(node.slot("divider")) },
        `tabs` = { RenderComposeChildren(node.slot("tabs")) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.SecureTextField(state: androidx.compose.foundation.text.input.TextFieldState, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, textStyle: androidx.compose.ui.text.TextStyle, labelPosition: androidx.compose.material3.TextFieldLabelPosition, label: kotlin.Function1<androidx.compose.material3.TextFieldLabelScope, kotlin.Unit>?, placeholder: kotlin.Function0<kotlin.Unit>?, leadingIcon: kotlin.Function0<kotlin.Unit>?, trailingIcon: kotlin.Function0<kotlin.Unit>?, prefix: kotlin.Function0<kotlin.Unit>?, suffix: kotlin.Function0<kotlin.Unit>?, supportingText: kotlin.Function0<kotlin.Unit>?, isError: kotlin.Boolean, inputTransformation: androidx.compose.foundation.text.input.InputTransformation?, textObfuscationMode: androidx.compose.foundation.text.input.TextObfuscationMode, textObfuscationCharacter: kotlin.Char, keyboardOptions: androidx.compose.foundation.text.KeyboardOptions, onKeyboardAction: androidx.compose.foundation.text.input.KeyboardActionHandler?, onTextLayout: kotlin.Function2<androidx.compose.ui.unit.Density, kotlin.Function0<androidx.compose.ui.text.TextLayoutResult?>, kotlin.Unit>?, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.TextFieldColors, contentPadding: androidx.compose.foundation.layout.PaddingValues, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?)
internal object RendererSecureTextField {
  private fun decode_enabled(node: ComposeNode) = node.boolean("enabled")
  private fun decode_isError(node: ComposeNode) = node.boolean("isError")
  private fun decode_textObfuscationCharacter(node: ComposeNode) = node.string("textObfuscationCharacter").single()

  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val stateValue = if (node.has("state") && !node.isNull("state")) node.jsonObject("state").rememberComposeTextFieldState() else null
    val content_placeholder: @Composable () -> Unit = { RenderComposeChildren(node.slot("placeholder")) }
    val slot_placeholder = if (node.isNull("placeholder")) null else content_placeholder
    val content_leadingIcon: @Composable () -> Unit = { RenderComposeChildren(node.slot("leadingIcon")) }
    val slot_leadingIcon = if (node.isNull("leadingIcon")) null else content_leadingIcon
    val content_trailingIcon: @Composable () -> Unit = { RenderComposeChildren(node.slot("trailingIcon")) }
    val slot_trailingIcon = if (node.isNull("trailingIcon")) null else content_trailingIcon
    val content_prefix: @Composable () -> Unit = { RenderComposeChildren(node.slot("prefix")) }
    val slot_prefix = if (node.isNull("prefix")) null else content_prefix
    val content_suffix: @Composable () -> Unit = { RenderComposeChildren(node.slot("suffix")) }
    val slot_suffix = if (node.isNull("suffix")) null else content_suffix
    val content_supportingText: @Composable () -> Unit = { RenderComposeChildren(node.slot("supportingText")) }
    val slot_supportingText = if (node.isNull("supportingText")) null else content_supportingText
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("textStyle")) 2 else 0) +
      (if (node.has("placeholder")) 4 else 0) +
      (if (node.has("leadingIcon")) 8 else 0) +
      (if (node.has("trailingIcon")) 16 else 0) +
      (if (node.has("prefix")) 32 else 0) +
      (if (node.has("suffix")) 64 else 0) +
      (if (node.has("supportingText")) 128 else 0) +
      (if (node.has("isError")) 256 else 0) +
      (if (node.has("inputTransformation")) 512 else 0) +
      (if (node.has("textObfuscationMode")) 1024 else 0) +
      (if (node.has("textObfuscationCharacter")) 2048 else 0) +
      (if (node.has("keyboardOptions")) 4096 else 0) +
      (if (node.has("onKeyboardAction")) 8192 else 0) +
      (if (node.has("onTextLayout")) 16384 else 0) +
      (if (node.has("shape")) 32768 else 0) +
      (if (node.has("colors")) 65536 else 0) +
      (if (node.has("contentPadding")) 131072 else 0) +
      (if (node.has("interactionSource")) 262144 else 0)
    when (mask / 32) {
      0 -> renderSecureTextFieldGroup0(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      1 -> renderSecureTextFieldGroup1(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      2 -> renderSecureTextFieldGroup2(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      4 -> renderSecureTextFieldGroup4(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      8 -> renderSecureTextFieldGroup8(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      16 -> renderSecureTextFieldGroup16(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      32 -> renderSecureTextFieldGroup32(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      64 -> renderSecureTextFieldGroup64(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      96 -> renderSecureTextFieldGroup96(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      128 -> renderSecureTextFieldGroup128(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      144 -> renderSecureTextFieldGroup144(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      256 -> renderSecureTextFieldGroup256(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      272 -> renderSecureTextFieldGroup272(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      384 -> renderSecureTextFieldGroup384(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      400 -> renderSecureTextFieldGroup400(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      512 -> renderSecureTextFieldGroup512(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      1024 -> renderSecureTextFieldGroup1024(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      2048 -> renderSecureTextFieldGroup2048(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      2080 -> renderSecureTextFieldGroup2080(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      2112 -> renderSecureTextFieldGroup2112(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      4096 -> renderSecureTextFieldGroup4096(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      5135 -> renderSecureTextFieldGroup5135(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      5519 -> renderSecureTextFieldGroup5519(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      5535 -> renderSecureTextFieldGroup5535(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      7679 -> renderSecureTextFieldGroup7679(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      8191 -> renderSecureTextFieldGroup8191(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      8192 -> renderSecureTextFieldGroup8192(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      8193 -> renderSecureTextFieldGroup8193(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      9231 -> renderSecureTextFieldGroup9231(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      9615 -> renderSecureTextFieldGroup9615(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      9631 -> renderSecureTextFieldGroup9631(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      11775 -> renderSecureTextFieldGroup11775(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      12287 -> renderSecureTextFieldGroup12287(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      12303 -> renderSecureTextFieldGroup12303(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      12687 -> renderSecureTextFieldGroup12687(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      12703 -> renderSecureTextFieldGroup12703(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      13319 -> renderSecureTextFieldGroup13319(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      13323 -> renderSecureTextFieldGroup13323(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      13325 -> renderSecureTextFieldGroup13325(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      13326 -> renderSecureTextFieldGroup13326(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      13327 -> renderSecureTextFieldGroup13327(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      13455 -> renderSecureTextFieldGroup13455(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      13471 -> renderSecureTextFieldGroup13471(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      13583 -> renderSecureTextFieldGroup13583(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      13599 -> renderSecureTextFieldGroup13599(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      13703 -> renderSecureTextFieldGroup13703(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      13707 -> renderSecureTextFieldGroup13707(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      13709 -> renderSecureTextFieldGroup13709(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      13710 -> renderSecureTextFieldGroup13710(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      13711 -> renderSecureTextFieldGroup13711(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      13719 -> renderSecureTextFieldGroup13719(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      13723 -> renderSecureTextFieldGroup13723(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      13725 -> renderSecureTextFieldGroup13725(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      13726 -> renderSecureTextFieldGroup13726(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      13727 -> renderSecureTextFieldGroup13727(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      13759 -> renderSecureTextFieldGroup13759(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      13791 -> renderSecureTextFieldGroup13791(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      13823 -> renderSecureTextFieldGroup13823(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      14239 -> renderSecureTextFieldGroup14239(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      14271 -> renderSecureTextFieldGroup14271(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      14303 -> renderSecureTextFieldGroup14303(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      14335 -> renderSecureTextFieldGroup14335(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      14847 -> renderSecureTextFieldGroup14847(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      15359 -> renderSecureTextFieldGroup15359(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      15615 -> renderSecureTextFieldGroup15615(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      15743 -> renderSecureTextFieldGroup15743(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      15775 -> renderSecureTextFieldGroup15775(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      15807 -> renderSecureTextFieldGroup15807(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      15839 -> renderSecureTextFieldGroup15839(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      15855 -> renderSecureTextFieldGroup15855(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      15863 -> renderSecureTextFieldGroup15863(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      15867 -> renderSecureTextFieldGroup15867(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      15869 -> renderSecureTextFieldGroup15869(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      15870 -> renderSecureTextFieldGroup15870(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      15871 -> renderSecureTextFieldGroup15871(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      16127 -> renderSecureTextFieldGroup16127(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      16255 -> renderSecureTextFieldGroup16255(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      16287 -> renderSecureTextFieldGroup16287(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      16319 -> renderSecureTextFieldGroup16319(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      16351 -> renderSecureTextFieldGroup16351(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      16367 -> renderSecureTextFieldGroup16367(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      16375 -> renderSecureTextFieldGroup16375(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      16379 -> renderSecureTextFieldGroup16379(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      16381 -> renderSecureTextFieldGroup16381(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      16382 -> renderSecureTextFieldGroup16382(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      16383 -> renderSecureTextFieldGroup16383(node, scope, mask, stateValue, slot_placeholder, slot_leadingIcon, slot_trailingIcon, slot_prefix, slot_suffix, slot_supportingText)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup0(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      0 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope))
      1 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node))
      2 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle())
      3 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle())
      4 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder)
      5 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder)
      6 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder)
      7 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder)
      8 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon)
      9 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon)
      10 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon)
      11 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon)
      12 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon)
      13 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon)
      14 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon)
      15 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon)
      16 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon)
      17 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon)
      18 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `trailingIcon` = slot_trailingIcon)
      19 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `trailingIcon` = slot_trailingIcon)
      20 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon)
      21 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon)
      22 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon)
      23 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon)
      24 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon)
      25 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon)
      26 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon)
      27 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon)
      28 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon)
      29 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon)
      30 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon)
      31 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup1(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      32 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `prefix` = slot_prefix)
      33 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `prefix` = slot_prefix)
      36 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `prefix` = slot_prefix)
      37 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `prefix` = slot_prefix)
      40 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `prefix` = slot_prefix)
      41 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `prefix` = slot_prefix)
      44 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `prefix` = slot_prefix)
      45 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `prefix` = slot_prefix)
      48 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix)
      49 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix)
      52 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix)
      53 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix)
      56 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix)
      57 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix)
      60 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix)
      61 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup2(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      64 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `suffix` = slot_suffix)
      65 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `suffix` = slot_suffix)
      68 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `suffix` = slot_suffix)
      69 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `suffix` = slot_suffix)
      72 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `suffix` = slot_suffix)
      73 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `suffix` = slot_suffix)
      76 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `suffix` = slot_suffix)
      77 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `suffix` = slot_suffix)
      80 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `suffix` = slot_suffix)
      81 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `suffix` = slot_suffix)
      84 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `suffix` = slot_suffix)
      85 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `suffix` = slot_suffix)
      88 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `suffix` = slot_suffix)
      89 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `suffix` = slot_suffix)
      92 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `suffix` = slot_suffix)
      93 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `suffix` = slot_suffix)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup4(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      128 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `supportingText` = slot_supportingText)
      129 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `supportingText` = slot_supportingText)
      132 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `supportingText` = slot_supportingText)
      133 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `supportingText` = slot_supportingText)
      136 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `supportingText` = slot_supportingText)
      137 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `supportingText` = slot_supportingText)
      140 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `supportingText` = slot_supportingText)
      141 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `supportingText` = slot_supportingText)
      144 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `supportingText` = slot_supportingText)
      145 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `supportingText` = slot_supportingText)
      148 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `supportingText` = slot_supportingText)
      149 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `supportingText` = slot_supportingText)
      152 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `supportingText` = slot_supportingText)
      153 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `supportingText` = slot_supportingText)
      156 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `supportingText` = slot_supportingText)
      157 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `supportingText` = slot_supportingText)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup8(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      256 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `isError` = decode_isError(node))
      257 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `isError` = decode_isError(node))
      260 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `isError` = decode_isError(node))
      261 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `isError` = decode_isError(node))
      264 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `isError` = decode_isError(node))
      265 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `isError` = decode_isError(node))
      268 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `isError` = decode_isError(node))
      269 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `isError` = decode_isError(node))
      272 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `isError` = decode_isError(node))
      273 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `isError` = decode_isError(node))
      276 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `isError` = decode_isError(node))
      277 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `isError` = decode_isError(node))
      280 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `isError` = decode_isError(node))
      281 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `isError` = decode_isError(node))
      284 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `isError` = decode_isError(node))
      285 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `isError` = decode_isError(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup16(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      512 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()))
      513 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()))
      514 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()))
      515 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup32(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      1024 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")))
      1025 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")))
      1026 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")))
      1027 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")))
      1028 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")))
      1029 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")))
      1030 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")))
      1031 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")))
      1032 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")))
      1033 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")))
      1034 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")))
      1035 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")))
      1036 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")))
      1037 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")))
      1038 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")))
      1039 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")))
      1040 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")))
      1041 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")))
      1042 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `trailingIcon` = slot_trailingIcon, `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")))
      1043 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `trailingIcon` = slot_trailingIcon, `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")))
      1044 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")))
      1045 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")))
      1046 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")))
      1047 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")))
      1048 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")))
      1049 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")))
      1050 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")))
      1051 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")))
      1052 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")))
      1053 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")))
      1054 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")))
      1055 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup64(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      2048 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textObfuscationCharacter` = decode_textObfuscationCharacter(node))
      2049 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textObfuscationCharacter` = decode_textObfuscationCharacter(node))
      2050 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `textObfuscationCharacter` = decode_textObfuscationCharacter(node))
      2051 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `textObfuscationCharacter` = decode_textObfuscationCharacter(node))
      2052 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `textObfuscationCharacter` = decode_textObfuscationCharacter(node))
      2053 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `textObfuscationCharacter` = decode_textObfuscationCharacter(node))
      2054 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `textObfuscationCharacter` = decode_textObfuscationCharacter(node))
      2055 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `textObfuscationCharacter` = decode_textObfuscationCharacter(node))
      2056 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `textObfuscationCharacter` = decode_textObfuscationCharacter(node))
      2057 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `textObfuscationCharacter` = decode_textObfuscationCharacter(node))
      2058 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `textObfuscationCharacter` = decode_textObfuscationCharacter(node))
      2059 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `textObfuscationCharacter` = decode_textObfuscationCharacter(node))
      2060 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `textObfuscationCharacter` = decode_textObfuscationCharacter(node))
      2061 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `textObfuscationCharacter` = decode_textObfuscationCharacter(node))
      2062 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `textObfuscationCharacter` = decode_textObfuscationCharacter(node))
      2063 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `textObfuscationCharacter` = decode_textObfuscationCharacter(node))
      2064 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `textObfuscationCharacter` = decode_textObfuscationCharacter(node))
      2065 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `textObfuscationCharacter` = decode_textObfuscationCharacter(node))
      2066 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `trailingIcon` = slot_trailingIcon, `textObfuscationCharacter` = decode_textObfuscationCharacter(node))
      2067 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `trailingIcon` = slot_trailingIcon, `textObfuscationCharacter` = decode_textObfuscationCharacter(node))
      2068 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `textObfuscationCharacter` = decode_textObfuscationCharacter(node))
      2069 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `textObfuscationCharacter` = decode_textObfuscationCharacter(node))
      2070 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `textObfuscationCharacter` = decode_textObfuscationCharacter(node))
      2071 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `textObfuscationCharacter` = decode_textObfuscationCharacter(node))
      2072 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `textObfuscationCharacter` = decode_textObfuscationCharacter(node))
      2073 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `textObfuscationCharacter` = decode_textObfuscationCharacter(node))
      2074 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `textObfuscationCharacter` = decode_textObfuscationCharacter(node))
      2075 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `textObfuscationCharacter` = decode_textObfuscationCharacter(node))
      2076 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `textObfuscationCharacter` = decode_textObfuscationCharacter(node))
      2077 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `textObfuscationCharacter` = decode_textObfuscationCharacter(node))
      2078 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `textObfuscationCharacter` = decode_textObfuscationCharacter(node))
      2079 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `textObfuscationCharacter` = decode_textObfuscationCharacter(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup96(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      3072 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")), `textObfuscationCharacter` = decode_textObfuscationCharacter(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup128(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      4096 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      4097 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      4100 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      4101 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      4104 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      4105 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      4108 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      4109 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      4112 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      4113 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      4116 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      4117 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      4120 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      4121 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      4124 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      4125 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup144(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      4608 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      4609 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      4610 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      4611 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup256(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      8192 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      8193 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      8196 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      8197 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      8200 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      8201 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      8204 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      8205 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      8208 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      8209 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      8212 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      8213 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      8216 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      8217 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      8220 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      8221 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup272(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      8704 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      8705 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      8706 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      8707 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup384(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      12288 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup400(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      12800 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      12801 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      12802 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      12803 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup512(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      16384 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }))
      16385 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }))
      16386 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }))
      16387 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }))
      16388 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }))
      16389 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }))
      16390 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }))
      16391 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }))
      16392 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }))
      16393 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }))
      16394 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }))
      16395 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }))
      16396 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }))
      16397 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }))
      16398 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }))
      16399 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }))
      16400 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }))
      16401 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }))
      16402 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `trailingIcon` = slot_trailingIcon, `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }))
      16403 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `trailingIcon` = slot_trailingIcon, `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }))
      16404 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }))
      16405 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }))
      16406 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }))
      16407 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }))
      16408 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }))
      16409 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }))
      16410 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }))
      16411 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }))
      16412 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }))
      16413 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }))
      16414 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }))
      16415 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup1024(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      32768 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"))
      32769 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"))
      32772 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `shape` = node.arguments().shape("shape"))
      32773 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `shape` = node.arguments().shape("shape"))
      32776 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"))
      32777 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"))
      32780 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"))
      32781 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `shape` = node.arguments().shape("shape"))
      32784 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"))
      32785 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"))
      32788 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"))
      32789 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"))
      32792 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"))
      32793 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"))
      32796 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"))
      32797 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `shape` = node.arguments().shape("shape"))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup2048(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      65536 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65537 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65538 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65539 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65540 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65541 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65542 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65543 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65544 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65545 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65546 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65547 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65548 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65549 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65550 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65551 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65552 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65553 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65554 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65555 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65556 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65557 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65558 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65559 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65560 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65561 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65562 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65563 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65564 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65565 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65566 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      65567 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup2080(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      66560 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup2112(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      67584 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textObfuscationCharacter` = decode_textObfuscationCharacter(node), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup4096(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      131072 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      131073 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      131076 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      131077 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      131080 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      131081 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      131084 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      131085 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      131088 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      131089 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      131092 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      131093 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      131096 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      131097 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      131100 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      131101 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup5135(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      164351 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup5519(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      176639 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup5535(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      177151 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup7679(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      245759 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")), `textObfuscationCharacter` = decode_textObfuscationCharacter(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup8191(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      262143 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")), `textObfuscationCharacter` = decode_textObfuscationCharacter(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup8192(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      262144 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262145 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262146 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262147 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262148 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262149 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262150 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262151 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262152 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262153 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262154 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262155 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262156 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262157 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262158 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262159 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262160 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262161 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262162 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262163 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262164 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262165 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262166 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262167 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262168 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262169 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262170 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262171 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262172 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262173 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262174 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262175 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup8193(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      262176 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262177 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262178 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262179 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262180 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262181 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262182 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262183 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262184 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262185 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262186 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262187 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262188 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262189 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262190 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262191 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262192 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262193 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262194 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262195 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262196 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262197 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262198 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262199 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262200 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262201 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262202 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262203 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262204 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262205 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262206 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      262207 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup9231(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      295423 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup9615(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      307711 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup9631(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      308223 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup11775(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      376831 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")), `textObfuscationCharacter` = decode_textObfuscationCharacter(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup12287(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      393215 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")), `textObfuscationCharacter` = decode_textObfuscationCharacter(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup12303(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      393727 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup12687(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      406015 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup12703(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      406527 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup13319(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      426239 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup13323(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      426367 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `isError` = decode_isError(node), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup13325(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      426431 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup13326(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      426463 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup13327(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      426479 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      426487 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      426491 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      426493 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      426494 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      426495 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup13455(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      430591 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup13471(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      431103 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup13583(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      434687 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup13599(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      435199 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup13703(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      438527 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup13707(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      438655 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `isError` = decode_isError(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup13709(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      438719 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup13710(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      438751 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup13711(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      438767 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      438775 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      438779 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      438781 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      438782 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      438783 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup13719(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      439039 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup13723(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      439167 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `isError` = decode_isError(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup13725(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      439231 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup13726(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      439263 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup13727(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      439279 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      439287 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      439291 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      439293 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      439294 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      439295 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup13759(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      440319 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup13791(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      441343 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `textObfuscationCharacter` = decode_textObfuscationCharacter(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup13823(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      442367 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")), `textObfuscationCharacter` = decode_textObfuscationCharacter(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup14239(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      455679 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup14271(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      456703 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup14303(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      457727 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `textObfuscationCharacter` = decode_textObfuscationCharacter(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup14335(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      458751 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")), `textObfuscationCharacter` = decode_textObfuscationCharacter(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup14847(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      475135 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")), `textObfuscationCharacter` = decode_textObfuscationCharacter(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup15359(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      491519 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")), `textObfuscationCharacter` = decode_textObfuscationCharacter(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup15615(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      499711 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")), `textObfuscationCharacter` = decode_textObfuscationCharacter(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup15743(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      503807 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")), `textObfuscationCharacter` = decode_textObfuscationCharacter(node), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup15775(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      504831 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup15807(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      505855 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup15839(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      506879 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `textObfuscationCharacter` = decode_textObfuscationCharacter(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup15855(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      507391 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")), `textObfuscationCharacter` = decode_textObfuscationCharacter(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup15863(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      507647 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")), `textObfuscationCharacter` = decode_textObfuscationCharacter(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup15867(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      507775 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `isError` = decode_isError(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")), `textObfuscationCharacter` = decode_textObfuscationCharacter(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup15869(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      507839 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")), `textObfuscationCharacter` = decode_textObfuscationCharacter(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup15870(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      507871 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")), `textObfuscationCharacter` = decode_textObfuscationCharacter(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup15871(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      507887 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")), `textObfuscationCharacter` = decode_textObfuscationCharacter(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      507895 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")), `textObfuscationCharacter` = decode_textObfuscationCharacter(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      507899 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")), `textObfuscationCharacter` = decode_textObfuscationCharacter(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      507901 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")), `textObfuscationCharacter` = decode_textObfuscationCharacter(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      507902 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")), `textObfuscationCharacter` = decode_textObfuscationCharacter(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      507903 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")), `textObfuscationCharacter` = decode_textObfuscationCharacter(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup16127(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      516095 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")), `textObfuscationCharacter` = decode_textObfuscationCharacter(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup16255(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      520191 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")), `textObfuscationCharacter` = decode_textObfuscationCharacter(node), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup16287(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      521215 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup16319(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      522239 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup16351(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      523263 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `textObfuscationCharacter` = decode_textObfuscationCharacter(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup16367(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      523775 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")), `textObfuscationCharacter` = decode_textObfuscationCharacter(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup16375(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      524031 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")), `textObfuscationCharacter` = decode_textObfuscationCharacter(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup16379(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      524159 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `isError` = decode_isError(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")), `textObfuscationCharacter` = decode_textObfuscationCharacter(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup16381(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      524223 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")), `textObfuscationCharacter` = decode_textObfuscationCharacter(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup16382(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      524255 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")), `textObfuscationCharacter` = decode_textObfuscationCharacter(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSecureTextFieldGroup16383(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?, slot_placeholder: (@Composable () -> Unit)?, slot_leadingIcon: (@Composable () -> Unit)?, slot_trailingIcon: (@Composable () -> Unit)?, slot_prefix: (@Composable () -> Unit)?, slot_suffix: (@Composable () -> Unit)?, slot_supportingText: (@Composable () -> Unit)?) {
    when (mask) {
      524271 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")), `textObfuscationCharacter` = decode_textObfuscationCharacter(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      524279 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")), `textObfuscationCharacter` = decode_textObfuscationCharacter(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      524283 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")), `textObfuscationCharacter` = decode_textObfuscationCharacter(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      524285 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")), `textObfuscationCharacter` = decode_textObfuscationCharacter(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      524286 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")), `textObfuscationCharacter` = decode_textObfuscationCharacter(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      524287 -> androidx.compose.material3.SecureTextField(`state` = requireNotNull(stateValue), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `textStyle` = node.jsonObject("textStyle").toTextStyle(), `placeholder` = slot_placeholder, `leadingIcon` = slot_leadingIcon, `trailingIcon` = slot_trailingIcon, `prefix` = slot_prefix, `suffix` = slot_suffix, `supportingText` = slot_supportingText, `isError` = decode_isError(node), `inputTransformation` = if (node.isNull("inputTransformation")) null else (node.jsonObject("inputTransformation").toComposeInputTransformation()), `textObfuscationMode` = toComposeTextObfuscationModeValue(node.string("textObfuscationMode")), `textObfuscationCharacter` = decode_textObfuscationCharacter(node), `keyboardOptions` = node.jsonObject("keyboardOptions").toComposeKeyboardOptions(), `onKeyboardAction` = if (node.isNull("onKeyboardAction")) null else (androidx.compose.foundation.text.input.KeyboardActionHandler { defaultAction -> defaultAction(); node.emit("onKeyboardAction") }), `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ result -> result()?.let { node.emit("onTextLayout", it.toComposeSnapshot()) } }), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeTextFieldColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.SegmentedButton [receiver: androidx.compose.material3.MultiChoiceSegmentedButtonRowScope](checked: kotlin.Boolean, onCheckedChange: kotlin.Function1<kotlin.Boolean, kotlin.Unit>, shape: androidx.compose.ui.graphics.Shape, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, colors: androidx.compose.material3.SegmentedButtonColors, border: androidx.compose.foundation.BorderStroke, contentPadding: androidx.compose.foundation.layout.PaddingValues, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, icon: kotlin.Function0<kotlin.Unit>, label: kotlin.Function0<kotlin.Unit>)
internal object RendererSegmentedButton {
  private fun decode_checked(node: ComposeNode) = node.boolean("checked")
  private fun decode_enabled(node: ComposeNode) = node.boolean("enabled")

  @Composable
  fun render(node: ComposeNode, scope: androidx.compose.material3.MultiChoiceSegmentedButtonRowScope) {
    val slot_icon: @Composable () -> Unit = { RenderComposeChildren(node.slot("icon")) }
    val slot_label: @Composable () -> Unit = { RenderComposeChildren(node.slot("label")) }
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("colors")) 2 else 0) +
      (if (node.has("border")) 4 else 0) +
      (if (node.has("contentPadding")) 8 else 0) +
      (if (node.has("interactionSource")) 16 else 0) +
      (if (node.has("icon")) 32 else 0)
    when (mask / 32) {
      0 -> renderSegmentedButtonGroup0(node, scope, mask, slot_icon, slot_label)
      1 -> renderSegmentedButtonGroup1(node, scope, mask, slot_icon, slot_label)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSegmentedButtonGroup0(node: ComposeNode, scope: androidx.compose.material3.MultiChoiceSegmentedButtonRowScope, mask: Int, slot_icon: @Composable () -> Unit, slot_label: @Composable () -> Unit) {
    when (mask) {
      0 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `label` = slot_label)
      1 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `label` = slot_label)
      2 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `label` = slot_label)
      3 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `label` = slot_label)
      4 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `border` = node.jsonObject("border").toComposeBorderStroke(), `label` = slot_label)
      5 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = node.jsonObject("border").toComposeBorderStroke(), `label` = slot_label)
      6 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `label` = slot_label)
      7 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `label` = slot_label)
      8 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `label` = slot_label)
      9 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `label` = slot_label)
      10 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `label` = slot_label)
      11 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `label` = slot_label)
      12 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `border` = node.jsonObject("border").toComposeBorderStroke(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `label` = slot_label)
      13 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = node.jsonObject("border").toComposeBorderStroke(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `label` = slot_label)
      14 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `label` = slot_label)
      15 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `label` = slot_label)
      16 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `label` = slot_label)
      17 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `label` = slot_label)
      18 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `label` = slot_label)
      19 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `label` = slot_label)
      20 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `border` = node.jsonObject("border").toComposeBorderStroke(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `label` = slot_label)
      21 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = node.jsonObject("border").toComposeBorderStroke(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `label` = slot_label)
      22 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `label` = slot_label)
      23 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `label` = slot_label)
      24 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `label` = slot_label)
      25 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `label` = slot_label)
      26 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `label` = slot_label)
      27 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `label` = slot_label)
      28 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `border` = node.jsonObject("border").toComposeBorderStroke(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `label` = slot_label)
      29 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = node.jsonObject("border").toComposeBorderStroke(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `label` = slot_label)
      30 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `label` = slot_label)
      31 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `label` = slot_label)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSegmentedButtonGroup1(node: ComposeNode, scope: androidx.compose.material3.MultiChoiceSegmentedButtonRowScope, mask: Int, slot_icon: @Composable () -> Unit, slot_label: @Composable () -> Unit) {
    when (mask) {
      32 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `label` = slot_label)
      33 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `label` = slot_label)
      34 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `icon` = slot_icon, `label` = slot_label)
      35 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `icon` = slot_icon, `label` = slot_label)
      36 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `border` = node.jsonObject("border").toComposeBorderStroke(), `icon` = slot_icon, `label` = slot_label)
      37 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = node.jsonObject("border").toComposeBorderStroke(), `icon` = slot_icon, `label` = slot_label)
      38 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `icon` = slot_icon, `label` = slot_label)
      39 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `icon` = slot_icon, `label` = slot_label)
      40 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `icon` = slot_icon, `label` = slot_label)
      41 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `icon` = slot_icon, `label` = slot_label)
      42 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `icon` = slot_icon, `label` = slot_label)
      43 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `icon` = slot_icon, `label` = slot_label)
      44 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `border` = node.jsonObject("border").toComposeBorderStroke(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `icon` = slot_icon, `label` = slot_label)
      45 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = node.jsonObject("border").toComposeBorderStroke(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `icon` = slot_icon, `label` = slot_label)
      46 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `icon` = slot_icon, `label` = slot_label)
      47 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `icon` = slot_icon, `label` = slot_label)
      48 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `icon` = slot_icon, `label` = slot_label)
      49 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `icon` = slot_icon, `label` = slot_label)
      50 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `icon` = slot_icon, `label` = slot_label)
      51 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `icon` = slot_icon, `label` = slot_label)
      52 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `border` = node.jsonObject("border").toComposeBorderStroke(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `icon` = slot_icon, `label` = slot_label)
      53 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = node.jsonObject("border").toComposeBorderStroke(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `icon` = slot_icon, `label` = slot_label)
      54 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `icon` = slot_icon, `label` = slot_label)
      55 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `icon` = slot_icon, `label` = slot_label)
      56 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `icon` = slot_icon, `label` = slot_label)
      57 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `icon` = slot_icon, `label` = slot_label)
      58 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `icon` = slot_icon, `label` = slot_label)
      59 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `icon` = slot_icon, `label` = slot_label)
      60 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `border` = node.jsonObject("border").toComposeBorderStroke(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `icon` = slot_icon, `label` = slot_label)
      61 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = node.jsonObject("border").toComposeBorderStroke(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `icon` = slot_icon, `label` = slot_label)
      62 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `icon` = slot_icon, `label` = slot_label)
      63 -> scope.composeScoped4(`checked` = decode_checked(node), `onCheckedChange` = { value: Boolean -> node.emit("onCheckedChange", value) }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `icon` = slot_icon, `label` = slot_label)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.SegmentedButton [receiver: androidx.compose.material3.SingleChoiceSegmentedButtonRowScope](selected: kotlin.Boolean, onClick: kotlin.Function0<kotlin.Unit>, shape: androidx.compose.ui.graphics.Shape, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, colors: androidx.compose.material3.SegmentedButtonColors, border: androidx.compose.foundation.BorderStroke, contentPadding: androidx.compose.foundation.layout.PaddingValues, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, icon: kotlin.Function0<kotlin.Unit>, label: kotlin.Function0<kotlin.Unit>)
internal object RendererSegmentedButton_1 {
  private fun decode_selected(node: ComposeNode) = node.boolean("selected")
  private fun decode_enabled(node: ComposeNode) = node.boolean("enabled")

  @Composable
  fun render(node: ComposeNode, scope: androidx.compose.material3.SingleChoiceSegmentedButtonRowScope) {
    val slot_icon: @Composable () -> Unit = { RenderComposeChildren(node.slot("icon")) }
    val slot_label: @Composable () -> Unit = { RenderComposeChildren(node.slot("label")) }
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("colors")) 2 else 0) +
      (if (node.has("border")) 4 else 0) +
      (if (node.has("contentPadding")) 8 else 0) +
      (if (node.has("interactionSource")) 16 else 0) +
      (if (node.has("icon")) 32 else 0)
    when (mask / 32) {
      0 -> renderSegmentedButton_1Group0(node, scope, mask, slot_icon, slot_label)
      1 -> renderSegmentedButton_1Group1(node, scope, mask, slot_icon, slot_label)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSegmentedButton_1Group0(node: ComposeNode, scope: androidx.compose.material3.SingleChoiceSegmentedButtonRowScope, mask: Int, slot_icon: @Composable () -> Unit, slot_label: @Composable () -> Unit) {
    when (mask) {
      0 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `label` = slot_label)
      1 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `label` = slot_label)
      2 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `label` = slot_label)
      3 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `label` = slot_label)
      4 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `border` = node.jsonObject("border").toComposeBorderStroke(), `label` = slot_label)
      5 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = node.jsonObject("border").toComposeBorderStroke(), `label` = slot_label)
      6 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `label` = slot_label)
      7 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `label` = slot_label)
      8 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `label` = slot_label)
      9 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `label` = slot_label)
      10 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `label` = slot_label)
      11 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `label` = slot_label)
      12 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `border` = node.jsonObject("border").toComposeBorderStroke(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `label` = slot_label)
      13 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = node.jsonObject("border").toComposeBorderStroke(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `label` = slot_label)
      14 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `label` = slot_label)
      15 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `label` = slot_label)
      16 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `label` = slot_label)
      17 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `label` = slot_label)
      18 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `label` = slot_label)
      19 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `label` = slot_label)
      20 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `border` = node.jsonObject("border").toComposeBorderStroke(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `label` = slot_label)
      21 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = node.jsonObject("border").toComposeBorderStroke(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `label` = slot_label)
      22 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `label` = slot_label)
      23 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `label` = slot_label)
      24 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `label` = slot_label)
      25 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `label` = slot_label)
      26 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `label` = slot_label)
      27 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `label` = slot_label)
      28 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `border` = node.jsonObject("border").toComposeBorderStroke(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `label` = slot_label)
      29 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = node.jsonObject("border").toComposeBorderStroke(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `label` = slot_label)
      30 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `label` = slot_label)
      31 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `label` = slot_label)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSegmentedButton_1Group1(node: ComposeNode, scope: androidx.compose.material3.SingleChoiceSegmentedButtonRowScope, mask: Int, slot_icon: @Composable () -> Unit, slot_label: @Composable () -> Unit) {
    when (mask) {
      32 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `icon` = slot_icon, `label` = slot_label)
      33 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `icon` = slot_icon, `label` = slot_label)
      34 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `icon` = slot_icon, `label` = slot_label)
      35 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `icon` = slot_icon, `label` = slot_label)
      36 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `border` = node.jsonObject("border").toComposeBorderStroke(), `icon` = slot_icon, `label` = slot_label)
      37 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = node.jsonObject("border").toComposeBorderStroke(), `icon` = slot_icon, `label` = slot_label)
      38 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `icon` = slot_icon, `label` = slot_label)
      39 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `icon` = slot_icon, `label` = slot_label)
      40 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `icon` = slot_icon, `label` = slot_label)
      41 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `icon` = slot_icon, `label` = slot_label)
      42 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `icon` = slot_icon, `label` = slot_label)
      43 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `icon` = slot_icon, `label` = slot_label)
      44 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `border` = node.jsonObject("border").toComposeBorderStroke(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `icon` = slot_icon, `label` = slot_label)
      45 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = node.jsonObject("border").toComposeBorderStroke(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `icon` = slot_icon, `label` = slot_label)
      46 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `icon` = slot_icon, `label` = slot_label)
      47 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `icon` = slot_icon, `label` = slot_label)
      48 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `icon` = slot_icon, `label` = slot_label)
      49 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `icon` = slot_icon, `label` = slot_label)
      50 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `icon` = slot_icon, `label` = slot_label)
      51 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `icon` = slot_icon, `label` = slot_label)
      52 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `border` = node.jsonObject("border").toComposeBorderStroke(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `icon` = slot_icon, `label` = slot_label)
      53 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = node.jsonObject("border").toComposeBorderStroke(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `icon` = slot_icon, `label` = slot_label)
      54 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `icon` = slot_icon, `label` = slot_label)
      55 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `icon` = slot_icon, `label` = slot_label)
      56 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `icon` = slot_icon, `label` = slot_label)
      57 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `icon` = slot_icon, `label` = slot_label)
      58 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `icon` = slot_icon, `label` = slot_label)
      59 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `icon` = slot_icon, `label` = slot_label)
      60 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `border` = node.jsonObject("border").toComposeBorderStroke(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `icon` = slot_icon, `label` = slot_label)
      61 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = node.jsonObject("border").toComposeBorderStroke(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `icon` = slot_icon, `label` = slot_label)
      62 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `icon` = slot_icon, `label` = slot_label)
      63 -> scope.composeScoped4(`selected` = decode_selected(node), `onClick` = { node.emit("onClick") }, `shape` = node.arguments().shape("shape"), `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSegmentedButtonColorsValue(), `border` = node.jsonObject("border").toComposeBorderStroke(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), `icon` = slot_icon, `label` = slot_label)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.foundation.text.selection.SelectionContainer(modifier: androidx.compose.ui.Modifier, content: kotlin.Function0<kotlin.Unit>)
internal object RendererSelectionContainer {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    androidx.compose.foundation.text.selection.SelectionContainer(
      `modifier` = node.modifier("modifier", scope),
      content = { RenderComposeChildren(node.children) },
    )
  }
}

// androidx.compose.animation.SharedTransitionLayout(modifier: androidx.compose.ui.Modifier, content: kotlin.Function1<androidx.compose.animation.SharedTransitionScope, kotlin.Unit>)
internal object RendererSharedTransitionLayout {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    androidx.compose.animation.SharedTransitionLayout(
      `modifier` = node.modifier("modifier", scope),
      content = { RenderComposeChildren(node.children, this) },
    )
  }
}

// androidx.compose.material3.ShortNavigationBar(modifier: androidx.compose.ui.Modifier, containerColor: androidx.compose.ui.graphics.Color, contentColor: androidx.compose.ui.graphics.Color, windowInsets: androidx.compose.foundation.layout.WindowInsets, arrangement: androidx.compose.material3.ShortNavigationBarArrangement, content: kotlin.Function0<kotlin.Unit>)
internal object RendererShortNavigationBar {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("containerColor")) 1 else 0) +
      (if (node.has("contentColor")) 2 else 0) +
      (if (node.has("windowInsets")) 4 else 0) +
      (if (node.has("arrangement")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.material3.ShortNavigationBar(
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children) },
      )
      1 -> androidx.compose.material3.ShortNavigationBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children) },
      )
      2 -> androidx.compose.material3.ShortNavigationBar(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      3 -> androidx.compose.material3.ShortNavigationBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children) },
      )
      4 -> androidx.compose.material3.ShortNavigationBar(
        `modifier` = node.modifier("modifier", scope),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children) },
      )
      5 -> androidx.compose.material3.ShortNavigationBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children) },
      )
      6 -> androidx.compose.material3.ShortNavigationBar(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children) },
      )
      7 -> androidx.compose.material3.ShortNavigationBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        content = { RenderComposeChildren(node.children) },
      )
      8 -> androidx.compose.material3.ShortNavigationBar(
        `modifier` = node.modifier("modifier", scope),
        `arrangement` = toComposeShortNavigationBarArrangementValue(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      9 -> androidx.compose.material3.ShortNavigationBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `arrangement` = toComposeShortNavigationBarArrangementValue(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      10 -> androidx.compose.material3.ShortNavigationBar(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `arrangement` = toComposeShortNavigationBarArrangementValue(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      11 -> androidx.compose.material3.ShortNavigationBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `arrangement` = toComposeShortNavigationBarArrangementValue(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      12 -> androidx.compose.material3.ShortNavigationBar(
        `modifier` = node.modifier("modifier", scope),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        `arrangement` = toComposeShortNavigationBarArrangementValue(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      13 -> androidx.compose.material3.ShortNavigationBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        `arrangement` = toComposeShortNavigationBarArrangementValue(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      14 -> androidx.compose.material3.ShortNavigationBar(
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        `arrangement` = toComposeShortNavigationBarArrangementValue(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      15 -> androidx.compose.material3.ShortNavigationBar(
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `windowInsets` = node.jsonObject("windowInsets").toWindowInsets(),
        `arrangement` = toComposeShortNavigationBarArrangementValue(node.string("arrangement")),
        content = { RenderComposeChildren(node.children) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.ShortNavigationBarItem(selected: kotlin.Boolean, onClick: kotlin.Function0<kotlin.Unit>, icon: kotlin.Function0<kotlin.Unit>, label: kotlin.Function0<kotlin.Unit>?, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, iconPosition: androidx.compose.material3.NavigationItemIconPosition, colors: androidx.compose.material3.NavigationItemColors, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?)
internal object RendererShortNavigationBarItem {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("iconPosition")) 2 else 0) +
      (if (node.has("colors")) 4 else 0) +
      (if (node.has("interactionSource")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.material3.ShortNavigationBarItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.ShortNavigationBarItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
      )
      2 -> androidx.compose.material3.ShortNavigationBarItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `iconPosition` = toComposeNavigationItemIconPositionValue(node.string("iconPosition")),
      )
      3 -> androidx.compose.material3.ShortNavigationBarItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `iconPosition` = toComposeNavigationItemIconPositionValue(node.string("iconPosition")),
      )
      4 -> androidx.compose.material3.ShortNavigationBarItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeNavigationItemColorsValue(),
      )
      5 -> androidx.compose.material3.ShortNavigationBarItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeNavigationItemColorsValue(),
      )
      6 -> androidx.compose.material3.ShortNavigationBarItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `iconPosition` = toComposeNavigationItemIconPositionValue(node.string("iconPosition")),
        `colors` = node.jsonObject("colors").decodeComposeNavigationItemColorsValue(),
      )
      7 -> androidx.compose.material3.ShortNavigationBarItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `iconPosition` = toComposeNavigationItemIconPositionValue(node.string("iconPosition")),
        `colors` = node.jsonObject("colors").decodeComposeNavigationItemColorsValue(),
      )
      8 -> androidx.compose.material3.ShortNavigationBarItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      9 -> androidx.compose.material3.ShortNavigationBarItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      10 -> androidx.compose.material3.ShortNavigationBarItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `iconPosition` = toComposeNavigationItemIconPositionValue(node.string("iconPosition")),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      11 -> androidx.compose.material3.ShortNavigationBarItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `iconPosition` = toComposeNavigationItemIconPositionValue(node.string("iconPosition")),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      12 -> androidx.compose.material3.ShortNavigationBarItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeNavigationItemColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      13 -> androidx.compose.material3.ShortNavigationBarItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeNavigationItemColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      14 -> androidx.compose.material3.ShortNavigationBarItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `iconPosition` = toComposeNavigationItemIconPositionValue(node.string("iconPosition")),
        `colors` = node.jsonObject("colors").decodeComposeNavigationItemColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      15 -> androidx.compose.material3.ShortNavigationBarItem(
        `selected` = node.boolean("selected"),
        `onClick` = { node.emit("onClick") },
        `icon` = { RenderComposeChildren(node.slot("icon")) },
        `label` = if (node.isNull("label")) null else ({ RenderComposeChildren(node.slot("label")) }),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `iconPosition` = toComposeNavigationItemIconPositionValue(node.string("iconPosition")),
        `colors` = node.jsonObject("colors").decodeComposeNavigationItemColorsValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.SingleChoiceSegmentedButtonRow(modifier: androidx.compose.ui.Modifier, space: androidx.compose.ui.unit.Dp, content: kotlin.Function1<androidx.compose.material3.SingleChoiceSegmentedButtonRowScope, kotlin.Unit>)
internal object RendererSingleChoiceSegmentedButtonRow {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("space")) 1 else 0)
    when (mask) {
      0 -> androidx.compose.material3.SingleChoiceSegmentedButtonRow(
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.material3.SingleChoiceSegmentedButtonRow(
        `modifier` = node.modifier("modifier", scope),
        `space` = node.number("space").dp,
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.Slider(state: androidx.compose.material3.SliderState, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, colors: androidx.compose.material3.SliderColors, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource, thumb: kotlin.Function1<androidx.compose.material3.SliderState, kotlin.Unit>, track: kotlin.Function1<androidx.compose.material3.SliderState, kotlin.Unit>)
internal object RendererSlider {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("colors")) 2 else 0) +
      (if (node.has("interactionSource")) 4 else 0)
    when (mask) {
      0 -> androidx.compose.material3.Slider(
        `state` = node.jsonObject("state").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.Slider(
        `state` = node.jsonObject("state").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
      )
      2 -> androidx.compose.material3.Slider(
        `state` = node.jsonObject("state").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
      )
      3 -> androidx.compose.material3.Slider(
        `state` = node.jsonObject("state").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
      )
      4 -> androidx.compose.material3.Slider(
        `state` = node.jsonObject("state").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
      )
      5 -> androidx.compose.material3.Slider(
        `state` = node.jsonObject("state").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
      )
      6 -> androidx.compose.material3.Slider(
        `state` = node.jsonObject("state").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
      )
      7 -> androidx.compose.material3.Slider(
        `state` = node.jsonObject("state").rememberComposeSliderHandle(),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(),
        `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.Slider(value: kotlin.Float, onValueChange: kotlin.Function1<kotlin.Float, kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, valueRange: kotlin.ranges.ClosedFloatingPointRange<kotlin.Float>, steps: kotlin.Int, onValueChangeFinished: kotlin.Function0<kotlin.Unit>?, colors: androidx.compose.material3.SliderColors, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource)
internal object RendererSlider_1 {
  private fun decode_value(node: ComposeNode) = node.number("value").toFloat()
  private fun decode_enabled(node: ComposeNode) = node.boolean("enabled")
  private fun decode_steps(node: ComposeNode) = node.number("steps").toInt()

  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("valueRange")) 2 else 0) +
      (if (node.has("steps")) 4 else 0) +
      (if (node.has("onValueChangeFinished")) 8 else 0) +
      (if (node.has("colors")) 16 else 0) +
      (if (node.has("interactionSource")) 32 else 0)
    when (mask / 32) {
      0 -> renderSlider_1Group0(node, scope, mask)
      1 -> renderSlider_1Group1(node, scope, mask)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSlider_1Group0(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      0 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope))
      1 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node))
      2 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `valueRange` = node.arguments().floatRange("valueRange"))
      3 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `valueRange` = node.arguments().floatRange("valueRange"))
      4 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `steps` = decode_steps(node))
      5 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `steps` = decode_steps(node))
      6 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `valueRange` = node.arguments().floatRange("valueRange"), `steps` = decode_steps(node))
      7 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `valueRange` = node.arguments().floatRange("valueRange"), `steps` = decode_steps(node))
      8 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }))
      9 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }))
      10 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `valueRange` = node.arguments().floatRange("valueRange"), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }))
      11 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `valueRange` = node.arguments().floatRange("valueRange"), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }))
      12 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `steps` = decode_steps(node), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }))
      13 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `steps` = decode_steps(node), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }))
      14 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `valueRange` = node.arguments().floatRange("valueRange"), `steps` = decode_steps(node), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }))
      15 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `valueRange` = node.arguments().floatRange("valueRange"), `steps` = decode_steps(node), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }))
      16 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue())
      17 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue())
      18 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `valueRange` = node.arguments().floatRange("valueRange"), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue())
      19 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `valueRange` = node.arguments().floatRange("valueRange"), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue())
      20 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `steps` = decode_steps(node), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue())
      21 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `steps` = decode_steps(node), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue())
      22 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `valueRange` = node.arguments().floatRange("valueRange"), `steps` = decode_steps(node), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue())
      23 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `valueRange` = node.arguments().floatRange("valueRange"), `steps` = decode_steps(node), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue())
      24 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue())
      25 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue())
      26 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `valueRange` = node.arguments().floatRange("valueRange"), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue())
      27 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `valueRange` = node.arguments().floatRange("valueRange"), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue())
      28 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `steps` = decode_steps(node), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue())
      29 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `steps` = decode_steps(node), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue())
      30 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `valueRange` = node.arguments().floatRange("valueRange"), `steps` = decode_steps(node), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue())
      31 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `valueRange` = node.arguments().floatRange("valueRange"), `steps` = decode_steps(node), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderSlider_1Group1(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource())
      33 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource())
      34 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `valueRange` = node.arguments().floatRange("valueRange"), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource())
      35 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `valueRange` = node.arguments().floatRange("valueRange"), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource())
      36 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `steps` = decode_steps(node), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource())
      37 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `steps` = decode_steps(node), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource())
      38 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `valueRange` = node.arguments().floatRange("valueRange"), `steps` = decode_steps(node), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource())
      39 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `valueRange` = node.arguments().floatRange("valueRange"), `steps` = decode_steps(node), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource())
      40 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource())
      41 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource())
      42 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `valueRange` = node.arguments().floatRange("valueRange"), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource())
      43 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `valueRange` = node.arguments().floatRange("valueRange"), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource())
      44 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `steps` = decode_steps(node), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource())
      45 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `steps` = decode_steps(node), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource())
      46 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `valueRange` = node.arguments().floatRange("valueRange"), `steps` = decode_steps(node), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource())
      47 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `valueRange` = node.arguments().floatRange("valueRange"), `steps` = decode_steps(node), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource())
      48 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource())
      49 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource())
      50 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `valueRange` = node.arguments().floatRange("valueRange"), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource())
      51 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `valueRange` = node.arguments().floatRange("valueRange"), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource())
      52 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `steps` = decode_steps(node), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource())
      53 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `steps` = decode_steps(node), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource())
      54 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `valueRange` = node.arguments().floatRange("valueRange"), `steps` = decode_steps(node), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource())
      55 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `valueRange` = node.arguments().floatRange("valueRange"), `steps` = decode_steps(node), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource())
      56 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource())
      57 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource())
      58 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `valueRange` = node.arguments().floatRange("valueRange"), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource())
      59 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `valueRange` = node.arguments().floatRange("valueRange"), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource())
      60 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `steps` = decode_steps(node), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource())
      61 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `steps` = decode_steps(node), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource())
      62 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `valueRange` = node.arguments().floatRange("valueRange"), `steps` = decode_steps(node), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource())
      63 -> androidx.compose.material3.Slider(`value` = decode_value(node), `onValueChange` = { value: Float -> node.emit("onValueChange", value) }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `valueRange` = node.arguments().floatRange("valueRange"), `steps` = decode_steps(node), `onValueChangeFinished` = if (node.isNull("onValueChangeFinished")) null else ({ node.emit("onValueChangeFinished") }), `colors` = node.jsonObject("colors").decodeComposeSliderColorsValue(), `interactionSource` = node.jsonObject("interactionSource").rememberComposeInteractionSource())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.SmallExtendedFloatingActionButton(onClick: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, shape: androidx.compose.ui.graphics.Shape, containerColor: androidx.compose.ui.graphics.Color, contentColor: androidx.compose.ui.graphics.Color, elevation: androidx.compose.material3.FloatingActionButtonElevation, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>)
internal object RendererSmallExtendedFloatingActionButton {
  @OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("shape")) 1 else 0) +
      (if (node.has("containerColor")) 2 else 0) +
      (if (node.has("contentColor")) 4 else 0) +
      (if (node.has("elevation")) 8 else 0) +
      (if (node.has("interactionSource")) 16 else 0)
    when (mask) {
      0 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      2 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      4 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        content = { RenderComposeChildren(node.children, this) },
      )
      8 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      9 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      10 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      11 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      12 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      13 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      14 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      15 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        content = { RenderComposeChildren(node.children, this) },
      )
      16 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      17 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      18 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      19 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      20 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      21 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      22 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      23 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      24 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      25 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      26 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      27 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      28 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentColor` = node.color("contentColor"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      29 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentColor` = node.color("contentColor"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      30 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      31 -> androidx.compose.material3.SmallExtendedFloatingActionButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `containerColor` = node.color("containerColor"),
        `contentColor` = node.color("contentColor"),
        `elevation` = node.jsonObject("elevation").decodeComposeFloatingActionButtonElevationValue(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}
