// Generated from Compose declarations by generate.mjs.
package com.jetpackcomposereactnative.generated

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material3.PlainTooltip as composeScoped0
import androidx.compose.material3.RichTooltip as composeScoped1
import androidx.compose.material3.SegmentedButton as composeScoped2

// androidx.compose.material3.Text(text: kotlin.String, modifier: androidx.compose.ui.Modifier, color: androidx.compose.ui.graphics.Color, autoSize: androidx.compose.foundation.text.TextAutoSize?, fontSize: androidx.compose.ui.unit.TextUnit, fontStyle: androidx.compose.ui.text.font.FontStyle?, fontWeight: androidx.compose.ui.text.font.FontWeight?, fontFamily: androidx.compose.ui.text.font.FontFamily?, letterSpacing: androidx.compose.ui.unit.TextUnit, textDecoration: androidx.compose.ui.text.style.TextDecoration?, textAlign: androidx.compose.ui.text.style.TextAlign?, lineHeight: androidx.compose.ui.unit.TextUnit, overflow: androidx.compose.ui.text.style.TextOverflow, softWrap: kotlin.Boolean, maxLines: kotlin.Int, minLines: kotlin.Int, onTextLayout: kotlin.Function1<androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>?, style: androidx.compose.ui.text.TextStyle)
internal object RendererText {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("color")) 1 else 0) +
      (if (node.has("fontSize")) 2 else 0) +
      (if (node.has("fontWeight")) 4 else 0) +
      (if (node.has("letterSpacing")) 8 else 0) +
      (if (node.has("textAlign")) 16 else 0) +
      (if (node.has("lineHeight")) 32 else 0) +
      (if (node.has("overflow")) 64 else 0) +
      (if (node.has("softWrap")) 128 else 0) +
      (if (node.has("maxLines")) 256 else 0) +
      (if (node.has("minLines")) 512 else 0) +
      (if (node.has("composeTextStyle")) 1024 else 0)
    when (mask / 32) {
      0 -> renderTextGroup0(node, scope, mask)
      1 -> renderTextGroup1(node, scope, mask)
      2 -> renderTextGroup2(node, scope, mask)
      3 -> renderTextGroup3(node, scope, mask)
      4 -> renderTextGroup4(node, scope, mask)
      5 -> renderTextGroup5(node, scope, mask)
      6 -> renderTextGroup6(node, scope, mask)
      7 -> renderTextGroup7(node, scope, mask)
      8 -> renderTextGroup8(node, scope, mask)
      9 -> renderTextGroup9(node, scope, mask)
      10 -> renderTextGroup10(node, scope, mask)
      11 -> renderTextGroup11(node, scope, mask)
      12 -> renderTextGroup12(node, scope, mask)
      13 -> renderTextGroup13(node, scope, mask)
      14 -> renderTextGroup14(node, scope, mask)
      15 -> renderTextGroup15(node, scope, mask)
      16 -> renderTextGroup16(node, scope, mask)
      17 -> renderTextGroup17(node, scope, mask)
      18 -> renderTextGroup18(node, scope, mask)
      19 -> renderTextGroup19(node, scope, mask)
      20 -> renderTextGroup20(node, scope, mask)
      21 -> renderTextGroup21(node, scope, mask)
      22 -> renderTextGroup22(node, scope, mask)
      23 -> renderTextGroup23(node, scope, mask)
      24 -> renderTextGroup24(node, scope, mask)
      25 -> renderTextGroup25(node, scope, mask)
      26 -> renderTextGroup26(node, scope, mask)
      27 -> renderTextGroup27(node, scope, mask)
      28 -> renderTextGroup28(node, scope, mask)
      29 -> renderTextGroup29(node, scope, mask)
      30 -> renderTextGroup30(node, scope, mask)
      31 -> renderTextGroup31(node, scope, mask)
      32 -> renderTextGroup32(node, scope, mask)
      33 -> renderTextGroup33(node, scope, mask)
      63 -> renderTextGroup63(node, scope, mask)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderTextGroup0(node: ComposeNode, scope: Any?, mask: Int) {
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
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
      )
      5 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
      )
      6 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
      )
      7 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
      )
      8 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `letterSpacing` = node.number("letterSpacing").sp,
      )
      9 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `letterSpacing` = node.number("letterSpacing").sp,
      )
      10 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
      )
      11 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
      )
      12 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
      )
      13 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
      )
      14 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
      )
      15 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
      )
      16 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
      )
      17 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
      )
      18 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
      )
      19 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
      )
      20 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
      )
      21 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
      )
      22 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
      )
      23 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
      )
      24 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
      )
      25 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
      )
      26 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
      )
      27 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
      )
      28 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
      )
      29 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
      )
      30 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
      )
      31 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderTextGroup1(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `lineHeight` = node.number("lineHeight").sp,
      )
      33 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `lineHeight` = node.number("lineHeight").sp,
      )
      34 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `lineHeight` = node.number("lineHeight").sp,
      )
      35 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `lineHeight` = node.number("lineHeight").sp,
      )
      36 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `lineHeight` = node.number("lineHeight").sp,
      )
      37 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `lineHeight` = node.number("lineHeight").sp,
      )
      38 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `lineHeight` = node.number("lineHeight").sp,
      )
      39 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `lineHeight` = node.number("lineHeight").sp,
      )
      40 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
      )
      41 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
      )
      42 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
      )
      43 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
      )
      44 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
      )
      45 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
      )
      46 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
      )
      47 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
      )
      48 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
      )
      49 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
      )
      50 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
      )
      51 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
      )
      52 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
      )
      53 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
      )
      54 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
      )
      55 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
      )
      56 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
      )
      57 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
      )
      58 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
      )
      59 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
      )
      60 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
      )
      61 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
      )
      62 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
      )
      63 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderTextGroup2(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
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
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
      )
      69 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
      )
      70 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
      )
      71 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
      )
      72 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `letterSpacing` = node.number("letterSpacing").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
      )
      73 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `letterSpacing` = node.number("letterSpacing").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
      )
      74 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
      )
      75 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
      )
      76 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
      )
      77 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
      )
      78 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
      )
      79 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
      )
      80 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
      )
      81 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
      )
      82 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
      )
      83 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
      )
      84 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
      )
      85 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
      )
      86 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
      )
      87 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
      )
      88 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
      )
      89 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
      )
      90 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
      )
      91 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
      )
      92 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
      )
      93 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
      )
      94 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
      )
      95 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderTextGroup3(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      96 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
      )
      97 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
      )
      98 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
      )
      99 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
      )
      100 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
      )
      101 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
      )
      102 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
      )
      103 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
      )
      104 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
      )
      105 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
      )
      106 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
      )
      107 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
      )
      108 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
      )
      109 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
      )
      110 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
      )
      111 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
      )
      112 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
      )
      113 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
      )
      114 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
      )
      115 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
      )
      116 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
      )
      117 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
      )
      118 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
      )
      119 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
      )
      120 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
      )
      121 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
      )
      122 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
      )
      123 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
      )
      124 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
      )
      125 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
      )
      126 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
      )
      127 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderTextGroup4(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      128 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `softWrap` = node.boolean("softWrap"),
      )
      129 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `softWrap` = node.boolean("softWrap"),
      )
      130 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `softWrap` = node.boolean("softWrap"),
      )
      131 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `softWrap` = node.boolean("softWrap"),
      )
      132 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `softWrap` = node.boolean("softWrap"),
      )
      133 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `softWrap` = node.boolean("softWrap"),
      )
      134 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `softWrap` = node.boolean("softWrap"),
      )
      135 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `softWrap` = node.boolean("softWrap"),
      )
      136 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `letterSpacing` = node.number("letterSpacing").sp,
        `softWrap` = node.boolean("softWrap"),
      )
      137 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `letterSpacing` = node.number("letterSpacing").sp,
        `softWrap` = node.boolean("softWrap"),
      )
      138 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `softWrap` = node.boolean("softWrap"),
      )
      139 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `softWrap` = node.boolean("softWrap"),
      )
      140 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `softWrap` = node.boolean("softWrap"),
      )
      141 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `softWrap` = node.boolean("softWrap"),
      )
      142 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `softWrap` = node.boolean("softWrap"),
      )
      143 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `softWrap` = node.boolean("softWrap"),
      )
      144 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `softWrap` = node.boolean("softWrap"),
      )
      145 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `softWrap` = node.boolean("softWrap"),
      )
      146 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `softWrap` = node.boolean("softWrap"),
      )
      147 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `softWrap` = node.boolean("softWrap"),
      )
      148 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `softWrap` = node.boolean("softWrap"),
      )
      149 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `softWrap` = node.boolean("softWrap"),
      )
      150 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `softWrap` = node.boolean("softWrap"),
      )
      151 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `softWrap` = node.boolean("softWrap"),
      )
      152 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `softWrap` = node.boolean("softWrap"),
      )
      153 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `softWrap` = node.boolean("softWrap"),
      )
      154 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `softWrap` = node.boolean("softWrap"),
      )
      155 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `softWrap` = node.boolean("softWrap"),
      )
      156 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `softWrap` = node.boolean("softWrap"),
      )
      157 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `softWrap` = node.boolean("softWrap"),
      )
      158 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `softWrap` = node.boolean("softWrap"),
      )
      159 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `softWrap` = node.boolean("softWrap"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderTextGroup5(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      160 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
      )
      161 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
      )
      162 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
      )
      163 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
      )
      164 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
      )
      165 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
      )
      166 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
      )
      167 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
      )
      168 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
      )
      169 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
      )
      170 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
      )
      171 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
      )
      172 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
      )
      173 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
      )
      174 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
      )
      175 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
      )
      176 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
      )
      177 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
      )
      178 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
      )
      179 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
      )
      180 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
      )
      181 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
      )
      182 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
      )
      183 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
      )
      184 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
      )
      185 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
      )
      186 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
      )
      187 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
      )
      188 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
      )
      189 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
      )
      190 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
      )
      191 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderTextGroup6(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      192 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
      )
      193 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
      )
      194 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
      )
      195 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
      )
      196 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
      )
      197 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
      )
      198 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
      )
      199 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
      )
      200 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `letterSpacing` = node.number("letterSpacing").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
      )
      201 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `letterSpacing` = node.number("letterSpacing").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
      )
      202 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
      )
      203 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
      )
      204 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
      )
      205 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
      )
      206 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
      )
      207 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
      )
      208 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
      )
      209 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
      )
      210 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
      )
      211 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
      )
      212 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
      )
      213 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
      )
      214 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
      )
      215 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
      )
      216 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
      )
      217 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
      )
      218 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
      )
      219 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
      )
      220 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
      )
      221 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
      )
      222 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
      )
      223 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderTextGroup7(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      224 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
      )
      225 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
      )
      226 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
      )
      227 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
      )
      228 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
      )
      229 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
      )
      230 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
      )
      231 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
      )
      232 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
      )
      233 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
      )
      234 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
      )
      235 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
      )
      236 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
      )
      237 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
      )
      238 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
      )
      239 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
      )
      240 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
      )
      241 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
      )
      242 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
      )
      243 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
      )
      244 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
      )
      245 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
      )
      246 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
      )
      247 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
      )
      248 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
      )
      249 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
      )
      250 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
      )
      251 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
      )
      252 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
      )
      253 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
      )
      254 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
      )
      255 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderTextGroup8(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      256 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `maxLines` = node.number("maxLines").toInt(),
      )
      257 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      258 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `maxLines` = node.number("maxLines").toInt(),
      )
      259 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `maxLines` = node.number("maxLines").toInt(),
      )
      260 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `maxLines` = node.number("maxLines").toInt(),
      )
      261 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `maxLines` = node.number("maxLines").toInt(),
      )
      262 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `maxLines` = node.number("maxLines").toInt(),
      )
      263 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `maxLines` = node.number("maxLines").toInt(),
      )
      264 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `letterSpacing` = node.number("letterSpacing").sp,
        `maxLines` = node.number("maxLines").toInt(),
      )
      265 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `letterSpacing` = node.number("letterSpacing").sp,
        `maxLines` = node.number("maxLines").toInt(),
      )
      266 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `maxLines` = node.number("maxLines").toInt(),
      )
      267 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `maxLines` = node.number("maxLines").toInt(),
      )
      268 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `maxLines` = node.number("maxLines").toInt(),
      )
      269 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `maxLines` = node.number("maxLines").toInt(),
      )
      270 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `maxLines` = node.number("maxLines").toInt(),
      )
      271 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `maxLines` = node.number("maxLines").toInt(),
      )
      272 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `maxLines` = node.number("maxLines").toInt(),
      )
      273 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `maxLines` = node.number("maxLines").toInt(),
      )
      274 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `maxLines` = node.number("maxLines").toInt(),
      )
      275 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `maxLines` = node.number("maxLines").toInt(),
      )
      276 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `maxLines` = node.number("maxLines").toInt(),
      )
      277 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `maxLines` = node.number("maxLines").toInt(),
      )
      278 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `maxLines` = node.number("maxLines").toInt(),
      )
      279 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `maxLines` = node.number("maxLines").toInt(),
      )
      280 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `maxLines` = node.number("maxLines").toInt(),
      )
      281 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `maxLines` = node.number("maxLines").toInt(),
      )
      282 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `maxLines` = node.number("maxLines").toInt(),
      )
      283 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `maxLines` = node.number("maxLines").toInt(),
      )
      284 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `maxLines` = node.number("maxLines").toInt(),
      )
      285 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `maxLines` = node.number("maxLines").toInt(),
      )
      286 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `maxLines` = node.number("maxLines").toInt(),
      )
      287 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `maxLines` = node.number("maxLines").toInt(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderTextGroup9(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      288 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `lineHeight` = node.number("lineHeight").sp,
        `maxLines` = node.number("maxLines").toInt(),
      )
      289 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `lineHeight` = node.number("lineHeight").sp,
        `maxLines` = node.number("maxLines").toInt(),
      )
      290 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `maxLines` = node.number("maxLines").toInt(),
      )
      291 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `maxLines` = node.number("maxLines").toInt(),
      )
      292 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `lineHeight` = node.number("lineHeight").sp,
        `maxLines` = node.number("maxLines").toInt(),
      )
      293 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `lineHeight` = node.number("lineHeight").sp,
        `maxLines` = node.number("maxLines").toInt(),
      )
      294 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `lineHeight` = node.number("lineHeight").sp,
        `maxLines` = node.number("maxLines").toInt(),
      )
      295 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `lineHeight` = node.number("lineHeight").sp,
        `maxLines` = node.number("maxLines").toInt(),
      )
      296 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `maxLines` = node.number("maxLines").toInt(),
      )
      297 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `maxLines` = node.number("maxLines").toInt(),
      )
      298 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `maxLines` = node.number("maxLines").toInt(),
      )
      299 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `maxLines` = node.number("maxLines").toInt(),
      )
      300 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `maxLines` = node.number("maxLines").toInt(),
      )
      301 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `maxLines` = node.number("maxLines").toInt(),
      )
      302 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `maxLines` = node.number("maxLines").toInt(),
      )
      303 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `maxLines` = node.number("maxLines").toInt(),
      )
      304 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `maxLines` = node.number("maxLines").toInt(),
      )
      305 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `maxLines` = node.number("maxLines").toInt(),
      )
      306 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `maxLines` = node.number("maxLines").toInt(),
      )
      307 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `maxLines` = node.number("maxLines").toInt(),
      )
      308 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `maxLines` = node.number("maxLines").toInt(),
      )
      309 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `maxLines` = node.number("maxLines").toInt(),
      )
      310 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `maxLines` = node.number("maxLines").toInt(),
      )
      311 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `maxLines` = node.number("maxLines").toInt(),
      )
      312 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `maxLines` = node.number("maxLines").toInt(),
      )
      313 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `maxLines` = node.number("maxLines").toInt(),
      )
      314 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `maxLines` = node.number("maxLines").toInt(),
      )
      315 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `maxLines` = node.number("maxLines").toInt(),
      )
      316 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `maxLines` = node.number("maxLines").toInt(),
      )
      317 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `maxLines` = node.number("maxLines").toInt(),
      )
      318 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `maxLines` = node.number("maxLines").toInt(),
      )
      319 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `maxLines` = node.number("maxLines").toInt(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderTextGroup10(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      320 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
      )
      321 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
      )
      322 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
      )
      323 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
      )
      324 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
      )
      325 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
      )
      326 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
      )
      327 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
      )
      328 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `letterSpacing` = node.number("letterSpacing").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
      )
      329 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `letterSpacing` = node.number("letterSpacing").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
      )
      330 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
      )
      331 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
      )
      332 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
      )
      333 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
      )
      334 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
      )
      335 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
      )
      336 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
      )
      337 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
      )
      338 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
      )
      339 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
      )
      340 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
      )
      341 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
      )
      342 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
      )
      343 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
      )
      344 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
      )
      345 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
      )
      346 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
      )
      347 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
      )
      348 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
      )
      349 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
      )
      350 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
      )
      351 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderTextGroup11(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      352 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
      )
      353 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
      )
      354 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
      )
      355 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
      )
      356 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
      )
      357 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
      )
      358 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
      )
      359 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
      )
      360 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
      )
      361 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
      )
      362 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
      )
      363 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
      )
      364 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
      )
      365 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
      )
      366 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
      )
      367 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
      )
      368 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
      )
      369 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
      )
      370 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
      )
      371 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
      )
      372 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
      )
      373 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
      )
      374 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
      )
      375 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
      )
      376 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
      )
      377 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
      )
      378 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
      )
      379 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
      )
      380 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
      )
      381 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
      )
      382 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
      )
      383 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderTextGroup12(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      384 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      385 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      386 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      387 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      388 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      389 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      390 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      391 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      392 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `letterSpacing` = node.number("letterSpacing").sp,
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      393 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `letterSpacing` = node.number("letterSpacing").sp,
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      394 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      395 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      396 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      397 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      398 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      399 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      400 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      401 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      402 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      403 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      404 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      405 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      406 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      407 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      408 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      409 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      410 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      411 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      412 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      413 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      414 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      415 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderTextGroup13(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      416 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      417 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      418 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      419 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      420 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      421 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      422 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      423 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      424 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      425 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      426 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      427 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      428 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      429 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      430 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      431 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      432 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      433 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      434 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      435 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      436 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      437 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      438 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      439 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      440 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      441 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      442 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      443 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      444 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      445 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      446 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      447 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderTextGroup14(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      448 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      449 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      450 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      451 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      452 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      453 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      454 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      455 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      456 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `letterSpacing` = node.number("letterSpacing").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      457 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `letterSpacing` = node.number("letterSpacing").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      458 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      459 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      460 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      461 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      462 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      463 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      464 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      465 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      466 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      467 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      468 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      469 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      470 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      471 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      472 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      473 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      474 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      475 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      476 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      477 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      478 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      479 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderTextGroup15(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      480 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      481 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      482 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      483 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      484 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      485 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      486 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      487 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      488 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      489 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      490 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      491 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      492 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      493 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      494 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      495 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      496 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      497 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      498 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      499 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      500 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      501 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      502 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      503 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      504 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      505 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      506 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      507 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      508 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      509 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      510 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      511 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderTextGroup16(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      512 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `minLines` = node.number("minLines").toInt(),
      )
      513 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `minLines` = node.number("minLines").toInt(),
      )
      514 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `minLines` = node.number("minLines").toInt(),
      )
      515 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `minLines` = node.number("minLines").toInt(),
      )
      516 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `minLines` = node.number("minLines").toInt(),
      )
      517 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `minLines` = node.number("minLines").toInt(),
      )
      518 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `minLines` = node.number("minLines").toInt(),
      )
      519 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `minLines` = node.number("minLines").toInt(),
      )
      520 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `letterSpacing` = node.number("letterSpacing").sp,
        `minLines` = node.number("minLines").toInt(),
      )
      521 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `letterSpacing` = node.number("letterSpacing").sp,
        `minLines` = node.number("minLines").toInt(),
      )
      522 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `minLines` = node.number("minLines").toInt(),
      )
      523 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `minLines` = node.number("minLines").toInt(),
      )
      524 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `minLines` = node.number("minLines").toInt(),
      )
      525 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `minLines` = node.number("minLines").toInt(),
      )
      526 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `minLines` = node.number("minLines").toInt(),
      )
      527 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `minLines` = node.number("minLines").toInt(),
      )
      528 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `minLines` = node.number("minLines").toInt(),
      )
      529 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `minLines` = node.number("minLines").toInt(),
      )
      530 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `minLines` = node.number("minLines").toInt(),
      )
      531 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `minLines` = node.number("minLines").toInt(),
      )
      532 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `minLines` = node.number("minLines").toInt(),
      )
      533 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `minLines` = node.number("minLines").toInt(),
      )
      534 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `minLines` = node.number("minLines").toInt(),
      )
      535 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `minLines` = node.number("minLines").toInt(),
      )
      536 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `minLines` = node.number("minLines").toInt(),
      )
      537 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `minLines` = node.number("minLines").toInt(),
      )
      538 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `minLines` = node.number("minLines").toInt(),
      )
      539 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `minLines` = node.number("minLines").toInt(),
      )
      540 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `minLines` = node.number("minLines").toInt(),
      )
      541 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `minLines` = node.number("minLines").toInt(),
      )
      542 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `minLines` = node.number("minLines").toInt(),
      )
      543 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `minLines` = node.number("minLines").toInt(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderTextGroup17(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      544 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `lineHeight` = node.number("lineHeight").sp,
        `minLines` = node.number("minLines").toInt(),
      )
      545 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `lineHeight` = node.number("lineHeight").sp,
        `minLines` = node.number("minLines").toInt(),
      )
      546 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `minLines` = node.number("minLines").toInt(),
      )
      547 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `minLines` = node.number("minLines").toInt(),
      )
      548 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `lineHeight` = node.number("lineHeight").sp,
        `minLines` = node.number("minLines").toInt(),
      )
      549 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `lineHeight` = node.number("lineHeight").sp,
        `minLines` = node.number("minLines").toInt(),
      )
      550 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `lineHeight` = node.number("lineHeight").sp,
        `minLines` = node.number("minLines").toInt(),
      )
      551 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `lineHeight` = node.number("lineHeight").sp,
        `minLines` = node.number("minLines").toInt(),
      )
      552 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `minLines` = node.number("minLines").toInt(),
      )
      553 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `minLines` = node.number("minLines").toInt(),
      )
      554 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `minLines` = node.number("minLines").toInt(),
      )
      555 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `minLines` = node.number("minLines").toInt(),
      )
      556 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `minLines` = node.number("minLines").toInt(),
      )
      557 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `minLines` = node.number("minLines").toInt(),
      )
      558 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `minLines` = node.number("minLines").toInt(),
      )
      559 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `minLines` = node.number("minLines").toInt(),
      )
      560 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `minLines` = node.number("minLines").toInt(),
      )
      561 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `minLines` = node.number("minLines").toInt(),
      )
      562 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `minLines` = node.number("minLines").toInt(),
      )
      563 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `minLines` = node.number("minLines").toInt(),
      )
      564 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `minLines` = node.number("minLines").toInt(),
      )
      565 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `minLines` = node.number("minLines").toInt(),
      )
      566 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `minLines` = node.number("minLines").toInt(),
      )
      567 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `minLines` = node.number("minLines").toInt(),
      )
      568 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `minLines` = node.number("minLines").toInt(),
      )
      569 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `minLines` = node.number("minLines").toInt(),
      )
      570 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `minLines` = node.number("minLines").toInt(),
      )
      571 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `minLines` = node.number("minLines").toInt(),
      )
      572 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `minLines` = node.number("minLines").toInt(),
      )
      573 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `minLines` = node.number("minLines").toInt(),
      )
      574 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `minLines` = node.number("minLines").toInt(),
      )
      575 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `minLines` = node.number("minLines").toInt(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderTextGroup18(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      576 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `minLines` = node.number("minLines").toInt(),
      )
      577 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `minLines` = node.number("minLines").toInt(),
      )
      578 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `minLines` = node.number("minLines").toInt(),
      )
      579 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `minLines` = node.number("minLines").toInt(),
      )
      580 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `minLines` = node.number("minLines").toInt(),
      )
      581 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `minLines` = node.number("minLines").toInt(),
      )
      582 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `minLines` = node.number("minLines").toInt(),
      )
      583 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `minLines` = node.number("minLines").toInt(),
      )
      584 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `letterSpacing` = node.number("letterSpacing").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `minLines` = node.number("minLines").toInt(),
      )
      585 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `letterSpacing` = node.number("letterSpacing").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `minLines` = node.number("minLines").toInt(),
      )
      586 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `minLines` = node.number("minLines").toInt(),
      )
      587 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `minLines` = node.number("minLines").toInt(),
      )
      588 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `minLines` = node.number("minLines").toInt(),
      )
      589 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `minLines` = node.number("minLines").toInt(),
      )
      590 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `minLines` = node.number("minLines").toInt(),
      )
      591 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `minLines` = node.number("minLines").toInt(),
      )
      592 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `minLines` = node.number("minLines").toInt(),
      )
      593 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `minLines` = node.number("minLines").toInt(),
      )
      594 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `minLines` = node.number("minLines").toInt(),
      )
      595 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `minLines` = node.number("minLines").toInt(),
      )
      596 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `minLines` = node.number("minLines").toInt(),
      )
      597 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `minLines` = node.number("minLines").toInt(),
      )
      598 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `minLines` = node.number("minLines").toInt(),
      )
      599 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `minLines` = node.number("minLines").toInt(),
      )
      600 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `minLines` = node.number("minLines").toInt(),
      )
      601 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `minLines` = node.number("minLines").toInt(),
      )
      602 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `minLines` = node.number("minLines").toInt(),
      )
      603 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `minLines` = node.number("minLines").toInt(),
      )
      604 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `minLines` = node.number("minLines").toInt(),
      )
      605 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `minLines` = node.number("minLines").toInt(),
      )
      606 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `minLines` = node.number("minLines").toInt(),
      )
      607 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `minLines` = node.number("minLines").toInt(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderTextGroup19(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      608 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `minLines` = node.number("minLines").toInt(),
      )
      609 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `minLines` = node.number("minLines").toInt(),
      )
      610 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `minLines` = node.number("minLines").toInt(),
      )
      611 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `minLines` = node.number("minLines").toInt(),
      )
      612 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `minLines` = node.number("minLines").toInt(),
      )
      613 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `minLines` = node.number("minLines").toInt(),
      )
      614 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `minLines` = node.number("minLines").toInt(),
      )
      615 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `minLines` = node.number("minLines").toInt(),
      )
      616 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `minLines` = node.number("minLines").toInt(),
      )
      617 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `minLines` = node.number("minLines").toInt(),
      )
      618 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `minLines` = node.number("minLines").toInt(),
      )
      619 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `minLines` = node.number("minLines").toInt(),
      )
      620 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `minLines` = node.number("minLines").toInt(),
      )
      621 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `minLines` = node.number("minLines").toInt(),
      )
      622 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `minLines` = node.number("minLines").toInt(),
      )
      623 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `minLines` = node.number("minLines").toInt(),
      )
      624 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `minLines` = node.number("minLines").toInt(),
      )
      625 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `minLines` = node.number("minLines").toInt(),
      )
      626 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `minLines` = node.number("minLines").toInt(),
      )
      627 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `minLines` = node.number("minLines").toInt(),
      )
      628 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `minLines` = node.number("minLines").toInt(),
      )
      629 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `minLines` = node.number("minLines").toInt(),
      )
      630 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `minLines` = node.number("minLines").toInt(),
      )
      631 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `minLines` = node.number("minLines").toInt(),
      )
      632 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `minLines` = node.number("minLines").toInt(),
      )
      633 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `minLines` = node.number("minLines").toInt(),
      )
      634 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `minLines` = node.number("minLines").toInt(),
      )
      635 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `minLines` = node.number("minLines").toInt(),
      )
      636 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `minLines` = node.number("minLines").toInt(),
      )
      637 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `minLines` = node.number("minLines").toInt(),
      )
      638 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `minLines` = node.number("minLines").toInt(),
      )
      639 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `minLines` = node.number("minLines").toInt(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderTextGroup20(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      640 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      641 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      642 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      643 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      644 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      645 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      646 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      647 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      648 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `letterSpacing` = node.number("letterSpacing").sp,
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      649 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `letterSpacing` = node.number("letterSpacing").sp,
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      650 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      651 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      652 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      653 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      654 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      655 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      656 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      657 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      658 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      659 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      660 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      661 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      662 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      663 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      664 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      665 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      666 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      667 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      668 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      669 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      670 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      671 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderTextGroup21(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      672 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      673 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      674 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      675 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      676 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      677 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      678 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      679 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      680 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      681 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      682 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      683 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      684 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      685 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      686 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      687 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      688 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      689 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      690 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      691 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      692 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      693 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      694 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      695 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      696 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      697 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      698 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      699 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      700 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      701 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      702 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      703 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderTextGroup22(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      704 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      705 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      706 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      707 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      708 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      709 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      710 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      711 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      712 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `letterSpacing` = node.number("letterSpacing").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      713 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `letterSpacing` = node.number("letterSpacing").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      714 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      715 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      716 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      717 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      718 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      719 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      720 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      721 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      722 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      723 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      724 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      725 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      726 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      727 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      728 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      729 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      730 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      731 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      732 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      733 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      734 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      735 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderTextGroup23(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      736 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      737 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      738 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      739 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      740 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      741 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      742 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      743 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      744 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      745 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      746 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      747 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      748 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      749 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      750 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      751 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      752 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      753 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      754 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      755 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      756 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      757 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      758 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      759 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      760 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      761 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      762 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      763 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      764 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      765 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      766 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      767 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `minLines` = node.number("minLines").toInt(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderTextGroup24(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      768 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      769 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      770 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      771 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      772 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      773 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      774 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      775 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      776 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `letterSpacing` = node.number("letterSpacing").sp,
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      777 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `letterSpacing` = node.number("letterSpacing").sp,
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      778 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      779 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      780 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      781 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      782 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      783 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      784 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      785 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      786 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      787 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      788 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      789 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      790 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      791 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      792 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      793 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      794 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      795 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      796 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      797 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      798 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      799 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderTextGroup25(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      800 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `lineHeight` = node.number("lineHeight").sp,
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      801 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `lineHeight` = node.number("lineHeight").sp,
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      802 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      803 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      804 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `lineHeight` = node.number("lineHeight").sp,
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      805 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `lineHeight` = node.number("lineHeight").sp,
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      806 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `lineHeight` = node.number("lineHeight").sp,
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      807 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `lineHeight` = node.number("lineHeight").sp,
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      808 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      809 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      810 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      811 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      812 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      813 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      814 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      815 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      816 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      817 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      818 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      819 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      820 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      821 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      822 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      823 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      824 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      825 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      826 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      827 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      828 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      829 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      830 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      831 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderTextGroup26(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      832 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      833 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      834 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      835 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      836 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      837 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      838 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      839 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      840 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `letterSpacing` = node.number("letterSpacing").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      841 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `letterSpacing` = node.number("letterSpacing").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      842 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      843 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      844 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      845 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      846 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      847 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      848 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      849 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      850 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      851 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      852 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      853 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      854 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      855 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      856 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      857 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      858 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      859 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      860 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      861 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      862 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      863 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderTextGroup27(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      864 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      865 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      866 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      867 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      868 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      869 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      870 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      871 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      872 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      873 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      874 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      875 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      876 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      877 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      878 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      879 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      880 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      881 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      882 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      883 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      884 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      885 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      886 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      887 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      888 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      889 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      890 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      891 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      892 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      893 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      894 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      895 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderTextGroup28(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      896 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      897 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      898 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      899 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      900 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      901 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      902 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      903 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      904 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `letterSpacing` = node.number("letterSpacing").sp,
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      905 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `letterSpacing` = node.number("letterSpacing").sp,
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      906 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      907 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      908 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      909 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      910 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      911 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      912 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      913 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      914 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      915 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      916 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      917 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      918 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      919 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      920 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      921 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      922 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      923 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      924 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      925 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      926 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      927 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderTextGroup29(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      928 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      929 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      930 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      931 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      932 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      933 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      934 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      935 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      936 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      937 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      938 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      939 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      940 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      941 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      942 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      943 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      944 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      945 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      946 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      947 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      948 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      949 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      950 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      951 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      952 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      953 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      954 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      955 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      956 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      957 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      958 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      959 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderTextGroup30(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      960 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      961 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      962 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      963 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      964 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      965 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      966 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      967 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      968 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `letterSpacing` = node.number("letterSpacing").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      969 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `letterSpacing` = node.number("letterSpacing").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      970 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      971 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      972 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      973 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      974 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      975 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      976 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      977 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      978 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      979 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      980 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      981 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      982 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      983 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      984 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      985 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      986 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      987 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      988 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      989 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      990 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      991 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderTextGroup31(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      992 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      993 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      994 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      995 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      996 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      997 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      998 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      999 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      1000 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      1001 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      1002 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      1003 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      1004 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      1005 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      1006 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      1007 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      1008 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      1009 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      1010 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      1011 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      1012 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      1013 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      1014 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      1015 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      1016 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      1017 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      1018 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      1019 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      1020 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      1021 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      1022 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      1023 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderTextGroup32(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1024 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1025 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1026 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1027 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1028 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1029 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1030 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1031 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1032 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `letterSpacing` = node.number("letterSpacing").sp,
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1033 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `letterSpacing` = node.number("letterSpacing").sp,
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1034 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1035 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1036 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1037 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1038 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1039 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1040 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1041 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1042 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1043 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1044 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1045 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1046 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1047 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1048 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1049 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1050 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1051 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1052 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1053 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1054 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1055 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderTextGroup33(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1056 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `lineHeight` = node.number("lineHeight").sp,
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1057 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `lineHeight` = node.number("lineHeight").sp,
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1058 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1059 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1060 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `lineHeight` = node.number("lineHeight").sp,
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1061 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `lineHeight` = node.number("lineHeight").sp,
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1062 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `lineHeight` = node.number("lineHeight").sp,
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1063 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `lineHeight` = node.number("lineHeight").sp,
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1064 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1065 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1066 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1067 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1068 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1069 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1070 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1071 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1072 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1073 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1074 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1075 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1076 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1077 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1078 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1079 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1080 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1081 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1082 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1083 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1084 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1085 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1086 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1087 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderTextGroup63(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      2047 -> androidx.compose.material3.Text(
        `text` = node.string("text"),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.Text(text: androidx.compose.ui.text.AnnotatedString, modifier: androidx.compose.ui.Modifier, color: androidx.compose.ui.graphics.Color, autoSize: androidx.compose.foundation.text.TextAutoSize?, fontSize: androidx.compose.ui.unit.TextUnit, fontStyle: androidx.compose.ui.text.font.FontStyle?, fontWeight: androidx.compose.ui.text.font.FontWeight?, fontFamily: androidx.compose.ui.text.font.FontFamily?, letterSpacing: androidx.compose.ui.unit.TextUnit, textDecoration: androidx.compose.ui.text.style.TextDecoration?, textAlign: androidx.compose.ui.text.style.TextAlign?, lineHeight: androidx.compose.ui.unit.TextUnit, overflow: androidx.compose.ui.text.style.TextOverflow, softWrap: kotlin.Boolean, maxLines: kotlin.Int, minLines: kotlin.Int, inlineContent: kotlin.collections.Map<kotlin.String, androidx.compose.foundation.text.InlineTextContent>, onTextLayout: kotlin.Function1<androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>, style: androidx.compose.ui.text.TextStyle)
internal object RendererText_1 {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("color")) 1 else 0) +
      (if (node.has("fontSize")) 2 else 0) +
      (if (node.has("fontWeight")) 4 else 0) +
      (if (node.has("letterSpacing")) 8 else 0) +
      (if (node.has("textAlign")) 16 else 0) +
      (if (node.has("lineHeight")) 32 else 0) +
      (if (node.has("overflow")) 64 else 0) +
      (if (node.has("softWrap")) 128 else 0) +
      (if (node.has("maxLines")) 256 else 0) +
      (if (node.has("minLines")) 512 else 0) +
      (if (node.has("composeTextStyle")) 1024 else 0)
    when (mask / 32) {
      0 -> renderText_1Group0(node, scope, mask)
      1 -> renderText_1Group1(node, scope, mask)
      2 -> renderText_1Group2(node, scope, mask)
      3 -> renderText_1Group3(node, scope, mask)
      4 -> renderText_1Group4(node, scope, mask)
      5 -> renderText_1Group5(node, scope, mask)
      8 -> renderText_1Group8(node, scope, mask)
      9 -> renderText_1Group9(node, scope, mask)
      16 -> renderText_1Group16(node, scope, mask)
      17 -> renderText_1Group17(node, scope, mask)
      31 -> renderText_1Group31(node, scope, mask)
      32 -> renderText_1Group32(node, scope, mask)
      33 -> renderText_1Group33(node, scope, mask)
      63 -> renderText_1Group63(node, scope, mask)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group0(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      0 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
      )
      2 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
      )
      3 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
      )
      4 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
      )
      5 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
      )
      6 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
      )
      7 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
      )
      8 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `letterSpacing` = node.number("letterSpacing").sp,
      )
      9 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `letterSpacing` = node.number("letterSpacing").sp,
      )
      10 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
      )
      11 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
      )
      12 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
      )
      13 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
      )
      14 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
      )
      15 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
      )
      16 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
      )
      17 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
      )
      18 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
      )
      19 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
      )
      24 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
      )
      25 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
      )
      26 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
      )
      27 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group1(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `lineHeight` = node.number("lineHeight").sp,
      )
      33 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `lineHeight` = node.number("lineHeight").sp,
      )
      34 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `lineHeight` = node.number("lineHeight").sp,
      )
      35 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `lineHeight` = node.number("lineHeight").sp,
      )
      36 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `lineHeight` = node.number("lineHeight").sp,
      )
      37 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `lineHeight` = node.number("lineHeight").sp,
      )
      38 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `lineHeight` = node.number("lineHeight").sp,
      )
      39 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `lineHeight` = node.number("lineHeight").sp,
      )
      40 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
      )
      41 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
      )
      42 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
      )
      43 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
      )
      44 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
      )
      45 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
      )
      46 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
      )
      47 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
      )
      48 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
      )
      49 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
      )
      50 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
      )
      51 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
      )
      56 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
      )
      57 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
      )
      58 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
      )
      59 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group2(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      64 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
      )
      65 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `overflow` = toComposeTextOverflow(node.string("overflow")),
      )
      66 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
      )
      67 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
      )
      72 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `letterSpacing` = node.number("letterSpacing").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
      )
      73 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `letterSpacing` = node.number("letterSpacing").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
      )
      74 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
      )
      75 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group3(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      96 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
      )
      97 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
      )
      98 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
      )
      99 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
      )
      104 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
      )
      105 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
      )
      106 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
      )
      107 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group4(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      128 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `softWrap` = node.boolean("softWrap"),
      )
      129 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `softWrap` = node.boolean("softWrap"),
      )
      130 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `softWrap` = node.boolean("softWrap"),
      )
      131 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `softWrap` = node.boolean("softWrap"),
      )
      136 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `letterSpacing` = node.number("letterSpacing").sp,
        `softWrap` = node.boolean("softWrap"),
      )
      137 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `letterSpacing` = node.number("letterSpacing").sp,
        `softWrap` = node.boolean("softWrap"),
      )
      138 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `softWrap` = node.boolean("softWrap"),
      )
      139 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `softWrap` = node.boolean("softWrap"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group5(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      160 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
      )
      161 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
      )
      162 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
      )
      163 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
      )
      168 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
      )
      169 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
      )
      170 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
      )
      171 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `softWrap` = node.boolean("softWrap"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group8(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      256 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `maxLines` = node.number("maxLines").toInt(),
      )
      257 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `maxLines` = node.number("maxLines").toInt(),
      )
      258 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `maxLines` = node.number("maxLines").toInt(),
      )
      259 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `maxLines` = node.number("maxLines").toInt(),
      )
      264 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `letterSpacing` = node.number("letterSpacing").sp,
        `maxLines` = node.number("maxLines").toInt(),
      )
      265 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `letterSpacing` = node.number("letterSpacing").sp,
        `maxLines` = node.number("maxLines").toInt(),
      )
      266 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `maxLines` = node.number("maxLines").toInt(),
      )
      267 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `maxLines` = node.number("maxLines").toInt(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group9(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      288 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `lineHeight` = node.number("lineHeight").sp,
        `maxLines` = node.number("maxLines").toInt(),
      )
      289 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `lineHeight` = node.number("lineHeight").sp,
        `maxLines` = node.number("maxLines").toInt(),
      )
      290 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `maxLines` = node.number("maxLines").toInt(),
      )
      291 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `maxLines` = node.number("maxLines").toInt(),
      )
      296 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `maxLines` = node.number("maxLines").toInt(),
      )
      297 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `maxLines` = node.number("maxLines").toInt(),
      )
      298 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `maxLines` = node.number("maxLines").toInt(),
      )
      299 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `maxLines` = node.number("maxLines").toInt(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group16(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      512 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `minLines` = node.number("minLines").toInt(),
      )
      513 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `minLines` = node.number("minLines").toInt(),
      )
      514 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `minLines` = node.number("minLines").toInt(),
      )
      515 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `minLines` = node.number("minLines").toInt(),
      )
      520 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `letterSpacing` = node.number("letterSpacing").sp,
        `minLines` = node.number("minLines").toInt(),
      )
      521 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `letterSpacing` = node.number("letterSpacing").sp,
        `minLines` = node.number("minLines").toInt(),
      )
      522 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `minLines` = node.number("minLines").toInt(),
      )
      523 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `minLines` = node.number("minLines").toInt(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group17(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      544 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `lineHeight` = node.number("lineHeight").sp,
        `minLines` = node.number("minLines").toInt(),
      )
      545 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `lineHeight` = node.number("lineHeight").sp,
        `minLines` = node.number("minLines").toInt(),
      )
      546 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `minLines` = node.number("minLines").toInt(),
      )
      547 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `minLines` = node.number("minLines").toInt(),
      )
      552 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `minLines` = node.number("minLines").toInt(),
      )
      553 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `minLines` = node.number("minLines").toInt(),
      )
      554 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `minLines` = node.number("minLines").toInt(),
      )
      555 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `minLines` = node.number("minLines").toInt(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group31(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1023 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group32(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1024 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1025 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1026 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1027 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1028 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1029 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1030 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1031 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1032 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `letterSpacing` = node.number("letterSpacing").sp,
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1033 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `letterSpacing` = node.number("letterSpacing").sp,
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1034 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1035 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1036 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1037 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1038 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1039 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1040 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1041 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1042 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1043 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1044 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1045 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1046 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1047 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1048 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1049 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1050 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1051 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1052 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1053 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1054 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1055 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group33(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1056 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `lineHeight` = node.number("lineHeight").sp,
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1057 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `lineHeight` = node.number("lineHeight").sp,
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1058 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1059 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1060 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `lineHeight` = node.number("lineHeight").sp,
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1061 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `lineHeight` = node.number("lineHeight").sp,
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1062 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `lineHeight` = node.number("lineHeight").sp,
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1063 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `lineHeight` = node.number("lineHeight").sp,
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1064 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1065 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1066 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1067 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1068 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1069 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1070 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1071 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `lineHeight` = node.number("lineHeight").sp,
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1072 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1073 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1074 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1075 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1076 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1077 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1078 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1079 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1080 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1081 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1082 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1083 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1084 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1085 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1086 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      1087 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group63(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      2047 -> androidx.compose.material3.Text(
        `text` = node.jsonObject("text").toAnnotatedString(),
        `modifier` = node.modifier("modifier", scope),
        `color` = node.color("color"),
        `fontSize` = node.number("fontSize").sp,
        `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))),
        `letterSpacing` = node.number("letterSpacing").sp,
        `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))),
        `lineHeight` = node.number("lineHeight").sp,
        `overflow` = toComposeTextOverflow(node.string("overflow")),
        `softWrap` = node.boolean("softWrap"),
        `maxLines` = node.number("maxLines").toInt(),
        `minLines` = node.number("minLines").toInt(),
        `style` = node.jsonObject("composeTextStyle").toTextStyle(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.TextButton(onClick: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.ButtonColors, elevation: androidx.compose.material3.ButtonElevation?, border: androidx.compose.foundation.BorderStroke?, contentPadding: androidx.compose.foundation.layout.PaddingValues, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>)
internal object RendererTextButton {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("shape")) 2 else 0) +
      (if (node.has("contentPadding")) 4 else 0) +
      (if (node.has("interactionSource")) 8 else 0)
    when (mask) {
      0 -> androidx.compose.material3.TextButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        content = { RenderComposeChildren(node.children, this) },
      )
      1 -> androidx.compose.material3.TextButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        content = { RenderComposeChildren(node.children, this) },
      )
      2 -> androidx.compose.material3.TextButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      3 -> androidx.compose.material3.TextButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        content = { RenderComposeChildren(node.children, this) },
      )
      4 -> androidx.compose.material3.TextButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      5 -> androidx.compose.material3.TextButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      6 -> androidx.compose.material3.TextButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      7 -> androidx.compose.material3.TextButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        content = { RenderComposeChildren(node.children, this) },
      )
      8 -> androidx.compose.material3.TextButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      9 -> androidx.compose.material3.TextButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      10 -> androidx.compose.material3.TextButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      11 -> androidx.compose.material3.TextButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      12 -> androidx.compose.material3.TextButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      13 -> androidx.compose.material3.TextButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      14 -> androidx.compose.material3.TextButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      15 -> androidx.compose.material3.TextButton(
        `onClick` = { node.emit("onClick") },
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
        content = { RenderComposeChildren(node.children, this) },
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.TextField(state: androidx.compose.foundation.text.input.TextFieldState, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, readOnly: kotlin.Boolean, textStyle: androidx.compose.ui.text.TextStyle, labelPosition: androidx.compose.material3.TextFieldLabelPosition, label: kotlin.Function1<androidx.compose.material3.TextFieldLabelScope, kotlin.Unit>?, placeholder: kotlin.Function0<kotlin.Unit>?, leadingIcon: kotlin.Function0<kotlin.Unit>?, trailingIcon: kotlin.Function0<kotlin.Unit>?, prefix: kotlin.Function0<kotlin.Unit>?, suffix: kotlin.Function0<kotlin.Unit>?, supportingText: kotlin.Function0<kotlin.Unit>?, isError: kotlin.Boolean, inputTransformation: androidx.compose.foundation.text.input.InputTransformation?, outputTransformation: androidx.compose.foundation.text.input.OutputTransformation?, keyboardOptions: androidx.compose.foundation.text.KeyboardOptions, onKeyboardAction: androidx.compose.foundation.text.input.KeyboardActionHandler?, lineLimits: androidx.compose.foundation.text.input.TextFieldLineLimits, onTextLayout: kotlin.Function2<androidx.compose.ui.unit.Density, kotlin.Function0<androidx.compose.ui.text.TextLayoutResult?>, kotlin.Unit>?, scrollState: androidx.compose.foundation.ScrollState, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.TextFieldColors, contentPadding: androidx.compose.foundation.layout.PaddingValues, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?)
internal object RendererTextField {
  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val stateValue = if (node.has("state") && !node.isNull("state")) node.jsonObject("state").rememberComposeTextFieldState() else null
    val mask = (if (node.has("enabled")) 1 else 0) +
      (if (node.has("readOnly")) 2 else 0) +
      (if (node.has("textStyle")) 4 else 0) +
      (if (node.has("placeholder")) 8 else 0) +
      (if (node.has("leadingIcon")) 16 else 0) +
      (if (node.has("trailingIcon")) 32 else 0) +
      (if (node.has("prefix")) 64 else 0) +
      (if (node.has("suffix")) 128 else 0) +
      (if (node.has("supportingText")) 256 else 0) +
      (if (node.has("isError")) 512 else 0) +
      (if (node.has("shape")) 1024 else 0) +
      (if (node.has("contentPadding")) 2048 else 0) +
      (if (node.has("interactionSource")) 4096 else 0)
    when (mask / 32) {
      0 -> renderTextFieldGroup0(node, scope, mask, stateValue)
      1 -> renderTextFieldGroup1(node, scope, mask, stateValue)
      2 -> renderTextFieldGroup2(node, scope, mask, stateValue)
      4 -> renderTextFieldGroup4(node, scope, mask, stateValue)
      8 -> renderTextFieldGroup8(node, scope, mask, stateValue)
      16 -> renderTextFieldGroup16(node, scope, mask, stateValue)
      32 -> renderTextFieldGroup32(node, scope, mask, stateValue)
      64 -> renderTextFieldGroup64(node, scope, mask, stateValue)
      127 -> renderTextFieldGroup127(node, scope, mask, stateValue)
      128 -> renderTextFieldGroup128(node, scope, mask, stateValue)
      129 -> renderTextFieldGroup129(node, scope, mask, stateValue)
      255 -> renderTextFieldGroup255(node, scope, mask, stateValue)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderTextFieldGroup0(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      0 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
      )
      1 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
      )
      2 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
      )
      3 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
      )
      4 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
      )
      5 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
      )
      6 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
      )
      7 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
      )
      8 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
      )
      9 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
      )
      10 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
      )
      11 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
      )
      12 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
      )
      13 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
      )
      14 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
      )
      15 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
      )
      16 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      17 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      18 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      19 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      20 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      21 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      22 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      23 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      24 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      25 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      26 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      27 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      28 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      29 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      30 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      31 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderTextFieldGroup1(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      32 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      33 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      34 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      35 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      40 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      41 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      42 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      43 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      48 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      49 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      50 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      51 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      56 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      57 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      58 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      59 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderTextFieldGroup2(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      64 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      65 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      66 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      67 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      72 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      73 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      74 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      75 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      80 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      81 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      82 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      83 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      88 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      89 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      90 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      91 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderTextFieldGroup4(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      128 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      129 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      130 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      131 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      136 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      137 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      138 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      139 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      144 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      145 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      146 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      147 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      152 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      153 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      154 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      155 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderTextFieldGroup8(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      256 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      257 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      258 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      259 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      264 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      265 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      266 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      267 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      272 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      273 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      274 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      275 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      280 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      281 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      282 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      283 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderTextFieldGroup16(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      512 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `isError` = node.boolean("isError"),
      )
      513 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `isError` = node.boolean("isError"),
      )
      514 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `isError` = node.boolean("isError"),
      )
      515 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `isError` = node.boolean("isError"),
      )
      520 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `isError` = node.boolean("isError"),
      )
      521 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `isError` = node.boolean("isError"),
      )
      522 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `isError` = node.boolean("isError"),
      )
      523 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `isError` = node.boolean("isError"),
      )
      528 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      529 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      530 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      531 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      536 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      537 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      538 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      539 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `isError` = node.boolean("isError"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderTextFieldGroup32(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      1024 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `shape` = node.arguments().shape("shape"),
      )
      1025 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `shape` = node.arguments().shape("shape"),
      )
      1026 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `shape` = node.arguments().shape("shape"),
      )
      1027 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `shape` = node.arguments().shape("shape"),
      )
      1032 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `shape` = node.arguments().shape("shape"),
      )
      1033 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `shape` = node.arguments().shape("shape"),
      )
      1034 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `shape` = node.arguments().shape("shape"),
      )
      1035 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `shape` = node.arguments().shape("shape"),
      )
      1040 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      1041 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      1042 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      1043 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      1048 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      1049 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      1050 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      1051 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `shape` = node.arguments().shape("shape"),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderTextFieldGroup64(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      2048 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      2049 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      2050 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      2051 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      2056 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      2057 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      2058 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      2059 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      2064 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      2065 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      2066 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      2067 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      2072 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      2073 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      2074 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      2075 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderTextFieldGroup127(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      4095 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
        `isError` = node.boolean("isError"),
        `shape` = node.arguments().shape("shape"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderTextFieldGroup128(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      4096 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      4097 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      4098 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      4099 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      4100 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      4101 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      4102 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      4103 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      4104 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      4105 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      4106 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      4107 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      4108 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      4109 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      4110 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      4111 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      4112 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      4113 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      4114 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      4115 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      4116 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      4117 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      4118 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      4119 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      4120 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      4121 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      4122 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      4123 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      4124 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      4125 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      4126 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      4127 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderTextFieldGroup129(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      4128 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      4129 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      4130 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      4131 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      4132 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      4133 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      4134 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      4135 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      4136 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      4137 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      4138 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      4139 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      4140 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      4141 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      4142 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      4143 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      4144 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      4145 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      4146 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      4147 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      4148 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      4149 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      4150 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      4151 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      4152 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      4153 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      4154 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      4155 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      4156 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      4157 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      4158 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      4159 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderTextFieldGroup255(node: ComposeNode, scope: Any?, mask: Int, stateValue: androidx.compose.foundation.text.input.TextFieldState?) {
    when (mask) {
      8191 -> androidx.compose.material3.TextField(
        `state` = requireNotNull(stateValue),
        `modifier` = node.modifier("modifier", scope),
        `enabled` = node.boolean("enabled"),
        `readOnly` = node.boolean("readOnly"),
        `textStyle` = node.jsonObject("textStyle").toTextStyle(),
        `placeholder` = if (node.isNull("placeholder")) null else ({ RenderComposeChildren(node.slot("placeholder")) }),
        `leadingIcon` = if (node.isNull("leadingIcon")) null else ({ RenderComposeChildren(node.slot("leadingIcon")) }),
        `trailingIcon` = if (node.isNull("trailingIcon")) null else ({ RenderComposeChildren(node.slot("trailingIcon")) }),
        `prefix` = if (node.isNull("prefix")) null else ({ RenderComposeChildren(node.slot("prefix")) }),
        `suffix` = if (node.isNull("suffix")) null else ({ RenderComposeChildren(node.slot("suffix")) }),
        `supportingText` = if (node.isNull("supportingText")) null else ({ RenderComposeChildren(node.slot("supportingText")) }),
        `isError` = node.boolean("isError"),
        `shape` = node.arguments().shape("shape"),
        `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(),
        `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()),
      )
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}
