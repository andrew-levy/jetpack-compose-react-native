// Generated from Compose declarations by generate.mjs.
package com.jetpackcomposereactnative.generated

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material3.adaptive.layout.AnimatedPane as composeScoped0
import androidx.compose.material3.ExposedDropdownMenu as composeScoped1
import androidx.compose.material3.FloatingActionButtonMenuItem as composeScoped2
import androidx.compose.material3.NavigationBarItem as composeScoped3
import androidx.compose.material3.PlainTooltip as composeScoped4
import androidx.compose.material3.RichTooltip as composeScoped5
import androidx.compose.material3.SegmentedButton as composeScoped6

// androidx.compose.material3.Text(text: androidx.compose.ui.text.AnnotatedString, modifier: androidx.compose.ui.Modifier, color: androidx.compose.ui.graphics.Color, autoSize: androidx.compose.foundation.text.TextAutoSize?, fontSize: androidx.compose.ui.unit.TextUnit, fontStyle: androidx.compose.ui.text.font.FontStyle?, fontWeight: androidx.compose.ui.text.font.FontWeight?, fontFamily: androidx.compose.ui.text.font.FontFamily?, letterSpacing: androidx.compose.ui.unit.TextUnit, textDecoration: androidx.compose.ui.text.style.TextDecoration?, textAlign: androidx.compose.ui.text.style.TextAlign?, lineHeight: androidx.compose.ui.unit.TextUnit, overflow: androidx.compose.ui.text.style.TextOverflow, softWrap: kotlin.Boolean, maxLines: kotlin.Int, minLines: kotlin.Int, inlineContent: kotlin.collections.Map<kotlin.String, androidx.compose.foundation.text.InlineTextContent>, onTextLayout: kotlin.Function1<androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>, style: androidx.compose.ui.text.TextStyle)
internal object RendererText_1 {
  private fun decode_color(node: ComposeNode) = node.color("color")
  private fun decode_fontSize(node: ComposeNode) = node.number("fontSize").sp
  private fun decode_letterSpacing(node: ComposeNode) = node.number("letterSpacing").sp
  private fun decode_lineHeight(node: ComposeNode) = node.number("lineHeight").sp
  private fun decode_softWrap(node: ComposeNode) = node.boolean("softWrap")
  private fun decode_maxLines(node: ComposeNode) = node.number("maxLines").toInt()
  private fun decode_minLines(node: ComposeNode) = node.number("minLines").toInt()

  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("color")) 1 else 0) +
      (if (node.has("autoSize")) 2 else 0) +
      (if (node.has("fontSize")) 4 else 0) +
      (if (node.has("fontStyle")) 8 else 0) +
      (if (node.has("fontWeight")) 16 else 0) +
      (if (node.has("fontFamily")) 32 else 0) +
      (if (node.has("letterSpacing")) 64 else 0) +
      (if (node.has("textDecoration")) 128 else 0) +
      (if (node.has("textAlign")) 256 else 0) +
      (if (node.has("lineHeight")) 512 else 0) +
      (if (node.has("overflow")) 1024 else 0) +
      (if (node.has("softWrap")) 2048 else 0) +
      (if (node.has("maxLines")) 4096 else 0) +
      (if (node.has("minLines")) 8192 else 0) +
      (if (node.has("onTextLayout")) 16384 else 0) +
      (if (node.has("composeTextStyle")) 32768 else 0)
    when (mask / 32) {
      0 -> renderText_1Group0(node, scope, mask)
      1 -> renderText_1Group1(node, scope, mask)
      2 -> renderText_1Group2(node, scope, mask)
      3 -> renderText_1Group3(node, scope, mask)
      4 -> renderText_1Group4(node, scope, mask)
      5 -> renderText_1Group5(node, scope, mask)
      6 -> renderText_1Group6(node, scope, mask)
      8 -> renderText_1Group8(node, scope, mask)
      10 -> renderText_1Group10(node, scope, mask)
      16 -> renderText_1Group16(node, scope, mask)
      17 -> renderText_1Group17(node, scope, mask)
      18 -> renderText_1Group18(node, scope, mask)
      19 -> renderText_1Group19(node, scope, mask)
      20 -> renderText_1Group20(node, scope, mask)
      22 -> renderText_1Group22(node, scope, mask)
      24 -> renderText_1Group24(node, scope, mask)
      26 -> renderText_1Group26(node, scope, mask)
      32 -> renderText_1Group32(node, scope, mask)
      34 -> renderText_1Group34(node, scope, mask)
      48 -> renderText_1Group48(node, scope, mask)
      50 -> renderText_1Group50(node, scope, mask)
      64 -> renderText_1Group64(node, scope, mask)
      66 -> renderText_1Group66(node, scope, mask)
      80 -> renderText_1Group80(node, scope, mask)
      82 -> renderText_1Group82(node, scope, mask)
      128 -> renderText_1Group128(node, scope, mask)
      130 -> renderText_1Group130(node, scope, mask)
      144 -> renderText_1Group144(node, scope, mask)
      146 -> renderText_1Group146(node, scope, mask)
      256 -> renderText_1Group256(node, scope, mask)
      258 -> renderText_1Group258(node, scope, mask)
      272 -> renderText_1Group272(node, scope, mask)
      274 -> renderText_1Group274(node, scope, mask)
      506 -> renderText_1Group506(node, scope, mask)
      510 -> renderText_1Group510(node, scope, mask)
      511 -> renderText_1Group511(node, scope, mask)
      512 -> renderText_1Group512(node, scope, mask)
      514 -> renderText_1Group514(node, scope, mask)
      528 -> renderText_1Group528(node, scope, mask)
      530 -> renderText_1Group530(node, scope, mask)
      1022 -> renderText_1Group1022(node, scope, mask)
      1023 -> renderText_1Group1023(node, scope, mask)
      1024 -> renderText_1Group1024(node, scope, mask)
      1026 -> renderText_1Group1026(node, scope, mask)
      1032 -> renderText_1Group1032(node, scope, mask)
      1034 -> renderText_1Group1034(node, scope, mask)
      1040 -> renderText_1Group1040(node, scope, mask)
      1042 -> renderText_1Group1042(node, scope, mask)
      1048 -> renderText_1Group1048(node, scope, mask)
      1050 -> renderText_1Group1050(node, scope, mask)
      1274 -> renderText_1Group1274(node, scope, mask)
      1278 -> renderText_1Group1278(node, scope, mask)
      1279 -> renderText_1Group1279(node, scope, mask)
      1402 -> renderText_1Group1402(node, scope, mask)
      1406 -> renderText_1Group1406(node, scope, mask)
      1407 -> renderText_1Group1407(node, scope, mask)
      1466 -> renderText_1Group1466(node, scope, mask)
      1470 -> renderText_1Group1470(node, scope, mask)
      1471 -> renderText_1Group1471(node, scope, mask)
      1498 -> renderText_1Group1498(node, scope, mask)
      1502 -> renderText_1Group1502(node, scope, mask)
      1503 -> renderText_1Group1503(node, scope, mask)
      1514 -> renderText_1Group1514(node, scope, mask)
      1518 -> renderText_1Group1518(node, scope, mask)
      1519 -> renderText_1Group1519(node, scope, mask)
      1522 -> renderText_1Group1522(node, scope, mask)
      1526 -> renderText_1Group1526(node, scope, mask)
      1527 -> renderText_1Group1527(node, scope, mask)
      1528 -> renderText_1Group1528(node, scope, mask)
      1530 -> renderText_1Group1530(node, scope, mask)
      1531 -> renderText_1Group1531(node, scope, mask)
      1532 -> renderText_1Group1532(node, scope, mask)
      1533 -> renderText_1Group1533(node, scope, mask)
      1534 -> renderText_1Group1534(node, scope, mask)
      1535 -> renderText_1Group1535(node, scope, mask)
      1790 -> renderText_1Group1790(node, scope, mask)
      1791 -> renderText_1Group1791(node, scope, mask)
      1918 -> renderText_1Group1918(node, scope, mask)
      1919 -> renderText_1Group1919(node, scope, mask)
      1982 -> renderText_1Group1982(node, scope, mask)
      1983 -> renderText_1Group1983(node, scope, mask)
      2014 -> renderText_1Group2014(node, scope, mask)
      2015 -> renderText_1Group2015(node, scope, mask)
      2030 -> renderText_1Group2030(node, scope, mask)
      2031 -> renderText_1Group2031(node, scope, mask)
      2038 -> renderText_1Group2038(node, scope, mask)
      2039 -> renderText_1Group2039(node, scope, mask)
      2042 -> renderText_1Group2042(node, scope, mask)
      2043 -> renderText_1Group2043(node, scope, mask)
      2044 -> renderText_1Group2044(node, scope, mask)
      2045 -> renderText_1Group2045(node, scope, mask)
      2046 -> renderText_1Group2046(node, scope, mask)
      2047 -> renderText_1Group2047(node, scope, mask)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group0(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      0 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope))
      1 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node))
      2 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()))
      3 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()))
      4 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node))
      5 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node))
      6 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node))
      7 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node))
      8 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))))
      9 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))))
      10 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))))
      12 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))))
      13 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))))
      16 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))))
      17 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))))
      18 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))))
      19 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))))
      20 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))))
      21 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))))
      22 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))))
      23 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))))
      24 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))))
      25 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))))
      28 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))))
      29 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group1(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()))
      33 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()))
      34 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()))
      36 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()))
      37 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()))
      40 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()))
      48 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()))
      49 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()))
      52 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()))
      53 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group2(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      64 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node))
      65 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `letterSpacing` = decode_letterSpacing(node))
      66 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `letterSpacing` = decode_letterSpacing(node))
      67 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `letterSpacing` = decode_letterSpacing(node))
      68 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node))
      69 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node))
      70 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node))
      71 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node))
      72 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `letterSpacing` = decode_letterSpacing(node))
      73 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `letterSpacing` = decode_letterSpacing(node))
      76 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `letterSpacing` = decode_letterSpacing(node))
      77 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `letterSpacing` = decode_letterSpacing(node))
      80 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node))
      81 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node))
      82 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node))
      83 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node))
      84 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node))
      85 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node))
      86 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node))
      87 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node))
      88 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node))
      89 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node))
      92 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node))
      93 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group3(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      96 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `letterSpacing` = decode_letterSpacing(node))
      97 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `letterSpacing` = decode_letterSpacing(node))
      100 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `letterSpacing` = decode_letterSpacing(node))
      101 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `letterSpacing` = decode_letterSpacing(node))
      112 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `letterSpacing` = decode_letterSpacing(node))
      113 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `letterSpacing` = decode_letterSpacing(node))
      116 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `letterSpacing` = decode_letterSpacing(node))
      117 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `letterSpacing` = decode_letterSpacing(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group4(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      128 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))))
      129 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))))
      130 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))))
      132 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))))
      133 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))))
      136 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))))
      144 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))))
      145 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))))
      148 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))))
      149 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group5(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      160 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group6(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      192 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))))
      193 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))))
      196 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))))
      197 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))))
      208 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))))
      209 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))))
      212 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))))
      213 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group8(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      256 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))))
      257 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))))
      260 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))))
      261 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group10(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      320 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))))
      321 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))))
      324 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))))
      325 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group16(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      512 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `lineHeight` = decode_lineHeight(node))
      513 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `lineHeight` = decode_lineHeight(node))
      514 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `lineHeight` = decode_lineHeight(node))
      515 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `lineHeight` = decode_lineHeight(node))
      516 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `lineHeight` = decode_lineHeight(node))
      517 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `lineHeight` = decode_lineHeight(node))
      518 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node), `lineHeight` = decode_lineHeight(node))
      519 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node), `lineHeight` = decode_lineHeight(node))
      520 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `lineHeight` = decode_lineHeight(node))
      521 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `lineHeight` = decode_lineHeight(node))
      524 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `lineHeight` = decode_lineHeight(node))
      525 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `lineHeight` = decode_lineHeight(node))
      528 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node))
      529 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node))
      530 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node))
      531 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node))
      532 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node))
      533 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node))
      534 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node))
      535 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node))
      536 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node))
      537 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node))
      540 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node))
      541 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group17(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      544 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `lineHeight` = decode_lineHeight(node))
      545 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `lineHeight` = decode_lineHeight(node))
      548 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `lineHeight` = decode_lineHeight(node))
      549 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `lineHeight` = decode_lineHeight(node))
      560 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `lineHeight` = decode_lineHeight(node))
      561 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `lineHeight` = decode_lineHeight(node))
      564 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `lineHeight` = decode_lineHeight(node))
      565 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `lineHeight` = decode_lineHeight(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group18(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      576 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node))
      577 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node))
      578 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node))
      579 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node))
      580 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node))
      581 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node))
      582 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node))
      583 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node))
      584 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node))
      585 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node))
      588 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node))
      589 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node))
      592 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node))
      593 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node))
      594 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node))
      595 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node))
      596 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node))
      597 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node))
      598 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node))
      599 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node))
      600 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node))
      601 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node))
      604 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node))
      605 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group19(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      608 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node))
      609 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node))
      612 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node))
      613 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node))
      624 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node))
      625 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node))
      628 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node))
      629 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group20(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      640 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `lineHeight` = decode_lineHeight(node))
      641 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `lineHeight` = decode_lineHeight(node))
      644 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `lineHeight` = decode_lineHeight(node))
      645 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `lineHeight` = decode_lineHeight(node))
      656 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `lineHeight` = decode_lineHeight(node))
      657 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `lineHeight` = decode_lineHeight(node))
      660 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `lineHeight` = decode_lineHeight(node))
      661 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `lineHeight` = decode_lineHeight(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group22(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      704 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `lineHeight` = decode_lineHeight(node))
      705 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `lineHeight` = decode_lineHeight(node))
      708 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `lineHeight` = decode_lineHeight(node))
      709 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `lineHeight` = decode_lineHeight(node))
      720 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `lineHeight` = decode_lineHeight(node))
      721 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `lineHeight` = decode_lineHeight(node))
      724 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `lineHeight` = decode_lineHeight(node))
      725 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `lineHeight` = decode_lineHeight(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group24(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      768 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node))
      769 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node))
      772 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node))
      773 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group26(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      832 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node))
      833 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node))
      836 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node))
      837 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group32(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1024 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `overflow` = toComposeTextOverflow(node.string("overflow")))
      1025 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `overflow` = toComposeTextOverflow(node.string("overflow")))
      1028 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `overflow` = toComposeTextOverflow(node.string("overflow")))
      1029 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `overflow` = toComposeTextOverflow(node.string("overflow")))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group34(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1088 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")))
      1089 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")))
      1092 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")))
      1093 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group48(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1536 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")))
      1537 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")))
      1540 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")))
      1541 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group50(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1600 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")))
      1601 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")))
      1604 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")))
      1605 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group64(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      2048 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `softWrap` = decode_softWrap(node))
      2049 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `softWrap` = decode_softWrap(node))
      2052 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `softWrap` = decode_softWrap(node))
      2053 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `softWrap` = decode_softWrap(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group66(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      2112 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `softWrap` = decode_softWrap(node))
      2113 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `letterSpacing` = decode_letterSpacing(node), `softWrap` = decode_softWrap(node))
      2116 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `softWrap` = decode_softWrap(node))
      2117 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `softWrap` = decode_softWrap(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group80(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      2560 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node))
      2561 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node))
      2564 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node))
      2565 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group82(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      2624 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node))
      2625 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node))
      2628 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node))
      2629 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group128(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      4096 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `maxLines` = decode_maxLines(node))
      4097 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `maxLines` = decode_maxLines(node))
      4100 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `maxLines` = decode_maxLines(node))
      4101 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `maxLines` = decode_maxLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group130(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      4160 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `maxLines` = decode_maxLines(node))
      4161 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `letterSpacing` = decode_letterSpacing(node), `maxLines` = decode_maxLines(node))
      4164 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `maxLines` = decode_maxLines(node))
      4165 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `maxLines` = decode_maxLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group144(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      4608 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node))
      4609 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node))
      4612 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node))
      4613 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group146(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      4672 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node))
      4673 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node))
      4676 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node))
      4677 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group256(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      8192 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `minLines` = decode_minLines(node))
      8193 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `minLines` = decode_minLines(node))
      8196 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `minLines` = decode_minLines(node))
      8197 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `minLines` = decode_minLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group258(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      8256 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `minLines` = decode_minLines(node))
      8257 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `letterSpacing` = decode_letterSpacing(node), `minLines` = decode_minLines(node))
      8260 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `minLines` = decode_minLines(node))
      8261 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `minLines` = decode_minLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group272(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      8704 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `lineHeight` = decode_lineHeight(node), `minLines` = decode_minLines(node))
      8705 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `lineHeight` = decode_lineHeight(node), `minLines` = decode_minLines(node))
      8708 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `lineHeight` = decode_lineHeight(node), `minLines` = decode_minLines(node))
      8709 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `lineHeight` = decode_lineHeight(node), `minLines` = decode_minLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group274(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      8768 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `minLines` = decode_minLines(node))
      8769 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `minLines` = decode_minLines(node))
      8772 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `minLines` = decode_minLines(node))
      8773 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `minLines` = decode_minLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group506(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      16213 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group510(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      16351 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group511(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      16383 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group512(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      16384 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) })
      16385 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) })
      16388 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) })
      16389 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) })
      16400 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) })
      16401 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) })
      16404 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) })
      16405 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group514(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      16448 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) })
      16449 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `letterSpacing` = decode_letterSpacing(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) })
      16452 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) })
      16453 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) })
      16464 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) })
      16465 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) })
      16468 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) })
      16469 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group528(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      16896 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `lineHeight` = decode_lineHeight(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) })
      16897 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `lineHeight` = decode_lineHeight(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) })
      16900 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `lineHeight` = decode_lineHeight(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) })
      16901 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `lineHeight` = decode_lineHeight(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) })
      16912 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) })
      16913 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) })
      16916 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) })
      16917 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group530(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      16960 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) })
      16961 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) })
      16964 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) })
      16965 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) })
      16976 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) })
      16977 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) })
      16980 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) })
      16981 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group1022(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32735 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group1023(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32767 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group1024(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32768 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      32769 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      32772 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      32773 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      32784 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      32785 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      32788 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      32789 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group1026(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32832 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      32833 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `letterSpacing` = decode_letterSpacing(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      32836 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      32837 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      32848 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      32849 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      32852 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      32853 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group1032(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      33024 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      33025 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      33028 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      33029 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      33040 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      33041 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      33044 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      33045 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group1034(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      33088 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      33089 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      33092 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      33093 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      33104 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      33105 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      33108 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      33109 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group1040(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      33280 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `lineHeight` = decode_lineHeight(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      33281 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `lineHeight` = decode_lineHeight(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      33284 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `lineHeight` = decode_lineHeight(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      33285 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `lineHeight` = decode_lineHeight(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      33296 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      33297 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      33300 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      33301 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group1042(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      33344 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      33345 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      33348 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      33349 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      33360 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      33361 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      33364 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      33365 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group1048(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      33536 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      33537 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      33540 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      33541 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      33552 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      33553 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      33556 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      33557 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group1050(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      33600 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      33601 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      33604 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      33605 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      33616 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      33617 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      33620 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      33621 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group1274(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      40789 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group1278(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      40927 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group1279(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      40959 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group1402(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      44885 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group1406(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      45023 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group1407(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      45055 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group1466(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      46933 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group1470(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      47071 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group1471(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      47103 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group1498(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      47957 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group1502(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      48095 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group1503(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      48127 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group1514(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      48469 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group1518(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      48607 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group1519(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      48639 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group1522(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      48725 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group1526(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      48863 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group1527(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      48895 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group1528(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      48917 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group1530(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      48965 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      48977 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      48980 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      48981 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      48983 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      48989 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      48991 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group1531(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      49013 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      49015 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      49021 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      49023 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group1532(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      49055 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group1533(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      49087 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group1534(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      49103 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      49109 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      49111 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      49115 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      49117 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      49118 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      49119 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group1535(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      49135 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      49141 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      49143 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      49147 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      49149 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      49150 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      49151 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group1790(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      57311 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) }, `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group1791(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      57343 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) }, `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group1918(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      61407 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) }, `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group1919(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      61439 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) }, `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group1982(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      63455 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) }, `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group1983(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      63487 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) }, `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group2014(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      64479 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) }, `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group2015(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      64511 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) }, `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group2030(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      64991 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) }, `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group2031(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      65023 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) }, `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group2038(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      65247 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) }, `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group2039(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      65279 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) }, `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group2042(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      65365 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) }, `style` = node.jsonObject("composeTextStyle").toTextStyle())
      65367 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) }, `style` = node.jsonObject("composeTextStyle").toTextStyle())
      65373 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) }, `style` = node.jsonObject("composeTextStyle").toTextStyle())
      65375 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) }, `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group2043(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      65397 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) }, `style` = node.jsonObject("composeTextStyle").toTextStyle())
      65399 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) }, `style` = node.jsonObject("composeTextStyle").toTextStyle())
      65405 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) }, `style` = node.jsonObject("composeTextStyle").toTextStyle())
      65407 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) }, `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group2044(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      65439 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) }, `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group2045(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      65471 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) }, `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group2046(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      65487 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) }, `style` = node.jsonObject("composeTextStyle").toTextStyle())
      65493 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) }, `style` = node.jsonObject("composeTextStyle").toTextStyle())
      65495 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) }, `style` = node.jsonObject("composeTextStyle").toTextStyle())
      65499 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) }, `style` = node.jsonObject("composeTextStyle").toTextStyle())
      65501 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) }, `style` = node.jsonObject("composeTextStyle").toTextStyle())
      65502 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) }, `style` = node.jsonObject("composeTextStyle").toTextStyle())
      65503 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) }, `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_1Group2047(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      65519 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) }, `style` = node.jsonObject("composeTextStyle").toTextStyle())
      65525 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) }, `style` = node.jsonObject("composeTextStyle").toTextStyle())
      65527 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) }, `style` = node.jsonObject("composeTextStyle").toTextStyle())
      65531 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) }, `style` = node.jsonObject("composeTextStyle").toTextStyle())
      65533 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) }, `style` = node.jsonObject("composeTextStyle").toTextStyle())
      65534 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) }, `style` = node.jsonObject("composeTextStyle").toTextStyle())
      65535 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `modifier` = node.modifier("modifier", scope), `color` = decode_color(node), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) }, `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.Text(text: kotlin.String, color: androidx.compose.ui.graphics.ColorProducer, modifier: androidx.compose.ui.Modifier, autoSize: androidx.compose.foundation.text.TextAutoSize?, fontSize: androidx.compose.ui.unit.TextUnit, fontStyle: androidx.compose.ui.text.font.FontStyle?, fontWeight: androidx.compose.ui.text.font.FontWeight?, fontFamily: androidx.compose.ui.text.font.FontFamily?, letterSpacing: androidx.compose.ui.unit.TextUnit, textDecoration: androidx.compose.ui.text.style.TextDecoration?, textAlign: androidx.compose.ui.text.style.TextAlign?, lineHeight: androidx.compose.ui.unit.TextUnit, overflow: androidx.compose.ui.text.style.TextOverflow, softWrap: kotlin.Boolean, maxLines: kotlin.Int, minLines: kotlin.Int, onTextLayout: kotlin.Function1<androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>?, style: androidx.compose.ui.text.TextStyle)
internal object RendererText_2 {
  private fun decode_text(node: ComposeNode) = node.string("text")
  private fun decode_fontSize(node: ComposeNode) = node.number("fontSize").sp
  private fun decode_letterSpacing(node: ComposeNode) = node.number("letterSpacing").sp
  private fun decode_lineHeight(node: ComposeNode) = node.number("lineHeight").sp
  private fun decode_softWrap(node: ComposeNode) = node.boolean("softWrap")
  private fun decode_maxLines(node: ComposeNode) = node.number("maxLines").toInt()
  private fun decode_minLines(node: ComposeNode) = node.number("minLines").toInt()

  @Composable
  fun render(node: ComposeNode, scope: Any?) {
    val mask = (if (node.has("autoSize")) 1 else 0) +
      (if (node.has("fontSize")) 2 else 0) +
      (if (node.has("fontStyle")) 4 else 0) +
      (if (node.has("fontWeight")) 8 else 0) +
      (if (node.has("fontFamily")) 16 else 0) +
      (if (node.has("letterSpacing")) 32 else 0) +
      (if (node.has("textDecoration")) 64 else 0) +
      (if (node.has("textAlign")) 128 else 0) +
      (if (node.has("lineHeight")) 256 else 0) +
      (if (node.has("overflow")) 512 else 0) +
      (if (node.has("softWrap")) 1024 else 0) +
      (if (node.has("maxLines")) 2048 else 0) +
      (if (node.has("minLines")) 4096 else 0) +
      (if (node.has("onTextLayout")) 8192 else 0) +
      (if (node.has("composeTextStyle")) 16384 else 0)
    when (mask / 32) {
      0 -> renderText_2Group0(node, scope, mask)
      2 -> renderText_2Group2(node, scope, mask)
      32 -> renderText_2Group32(node, scope, mask)
      33 -> renderText_2Group33(node, scope, mask)
      34 -> renderText_2Group34(node, scope, mask)
      35 -> renderText_2Group35(node, scope, mask)
      40 -> renderText_2Group40(node, scope, mask)
      41 -> renderText_2Group41(node, scope, mask)
      42 -> renderText_2Group42(node, scope, mask)
      43 -> renderText_2Group43(node, scope, mask)
      288 -> renderText_2Group288(node, scope, mask)
      289 -> renderText_2Group289(node, scope, mask)
      296 -> renderText_2Group296(node, scope, mask)
      297 -> renderText_2Group297(node, scope, mask)
      528 -> renderText_2Group528(node, scope, mask)
      529 -> renderText_2Group529(node, scope, mask)
      532 -> renderText_2Group532(node, scope, mask)
      533 -> renderText_2Group533(node, scope, mask)
      536 -> renderText_2Group536(node, scope, mask)
      537 -> renderText_2Group537(node, scope, mask)
      540 -> renderText_2Group540(node, scope, mask)
      541 -> renderText_2Group541(node, scope, mask)
      544 -> renderText_2Group544(node, scope, mask)
      545 -> renderText_2Group545(node, scope, mask)
      548 -> renderText_2Group548(node, scope, mask)
      549 -> renderText_2Group549(node, scope, mask)
      552 -> renderText_2Group552(node, scope, mask)
      553 -> renderText_2Group553(node, scope, mask)
      556 -> renderText_2Group556(node, scope, mask)
      557 -> renderText_2Group557(node, scope, mask)
      560 -> renderText_2Group560(node, scope, mask)
      561 -> renderText_2Group561(node, scope, mask)
      564 -> renderText_2Group564(node, scope, mask)
      565 -> renderText_2Group565(node, scope, mask)
      568 -> renderText_2Group568(node, scope, mask)
      569 -> renderText_2Group569(node, scope, mask)
      572 -> renderText_2Group572(node, scope, mask)
      573 -> renderText_2Group573(node, scope, mask)
      576 -> renderText_2Group576(node, scope, mask)
      577 -> renderText_2Group577(node, scope, mask)
      580 -> renderText_2Group580(node, scope, mask)
      581 -> renderText_2Group581(node, scope, mask)
      584 -> renderText_2Group584(node, scope, mask)
      585 -> renderText_2Group585(node, scope, mask)
      588 -> renderText_2Group588(node, scope, mask)
      589 -> renderText_2Group589(node, scope, mask)
      592 -> renderText_2Group592(node, scope, mask)
      593 -> renderText_2Group593(node, scope, mask)
      596 -> renderText_2Group596(node, scope, mask)
      597 -> renderText_2Group597(node, scope, mask)
      600 -> renderText_2Group600(node, scope, mask)
      601 -> renderText_2Group601(node, scope, mask)
      604 -> renderText_2Group604(node, scope, mask)
      605 -> renderText_2Group605(node, scope, mask)
      608 -> renderText_2Group608(node, scope, mask)
      609 -> renderText_2Group609(node, scope, mask)
      612 -> renderText_2Group612(node, scope, mask)
      613 -> renderText_2Group613(node, scope, mask)
      616 -> renderText_2Group616(node, scope, mask)
      617 -> renderText_2Group617(node, scope, mask)
      620 -> renderText_2Group620(node, scope, mask)
      621 -> renderText_2Group621(node, scope, mask)
      624 -> renderText_2Group624(node, scope, mask)
      625 -> renderText_2Group625(node, scope, mask)
      628 -> renderText_2Group628(node, scope, mask)
      629 -> renderText_2Group629(node, scope, mask)
      632 -> renderText_2Group632(node, scope, mask)
      633 -> renderText_2Group633(node, scope, mask)
      636 -> renderText_2Group636(node, scope, mask)
      637 -> renderText_2Group637(node, scope, mask)
      640 -> renderText_2Group640(node, scope, mask)
      641 -> renderText_2Group641(node, scope, mask)
      644 -> renderText_2Group644(node, scope, mask)
      645 -> renderText_2Group645(node, scope, mask)
      648 -> renderText_2Group648(node, scope, mask)
      649 -> renderText_2Group649(node, scope, mask)
      652 -> renderText_2Group652(node, scope, mask)
      653 -> renderText_2Group653(node, scope, mask)
      656 -> renderText_2Group656(node, scope, mask)
      657 -> renderText_2Group657(node, scope, mask)
      660 -> renderText_2Group660(node, scope, mask)
      661 -> renderText_2Group661(node, scope, mask)
      664 -> renderText_2Group664(node, scope, mask)
      665 -> renderText_2Group665(node, scope, mask)
      668 -> renderText_2Group668(node, scope, mask)
      669 -> renderText_2Group669(node, scope, mask)
      672 -> renderText_2Group672(node, scope, mask)
      673 -> renderText_2Group673(node, scope, mask)
      676 -> renderText_2Group676(node, scope, mask)
      677 -> renderText_2Group677(node, scope, mask)
      680 -> renderText_2Group680(node, scope, mask)
      681 -> renderText_2Group681(node, scope, mask)
      684 -> renderText_2Group684(node, scope, mask)
      685 -> renderText_2Group685(node, scope, mask)
      688 -> renderText_2Group688(node, scope, mask)
      689 -> renderText_2Group689(node, scope, mask)
      692 -> renderText_2Group692(node, scope, mask)
      693 -> renderText_2Group693(node, scope, mask)
      696 -> renderText_2Group696(node, scope, mask)
      697 -> renderText_2Group697(node, scope, mask)
      700 -> renderText_2Group700(node, scope, mask)
      701 -> renderText_2Group701(node, scope, mask)
      704 -> renderText_2Group704(node, scope, mask)
      705 -> renderText_2Group705(node, scope, mask)
      708 -> renderText_2Group708(node, scope, mask)
      709 -> renderText_2Group709(node, scope, mask)
      712 -> renderText_2Group712(node, scope, mask)
      713 -> renderText_2Group713(node, scope, mask)
      716 -> renderText_2Group716(node, scope, mask)
      717 -> renderText_2Group717(node, scope, mask)
      720 -> renderText_2Group720(node, scope, mask)
      721 -> renderText_2Group721(node, scope, mask)
      724 -> renderText_2Group724(node, scope, mask)
      725 -> renderText_2Group725(node, scope, mask)
      728 -> renderText_2Group728(node, scope, mask)
      729 -> renderText_2Group729(node, scope, mask)
      732 -> renderText_2Group732(node, scope, mask)
      733 -> renderText_2Group733(node, scope, mask)
      736 -> renderText_2Group736(node, scope, mask)
      737 -> renderText_2Group737(node, scope, mask)
      740 -> renderText_2Group740(node, scope, mask)
      741 -> renderText_2Group741(node, scope, mask)
      744 -> renderText_2Group744(node, scope, mask)
      745 -> renderText_2Group745(node, scope, mask)
      748 -> renderText_2Group748(node, scope, mask)
      749 -> renderText_2Group749(node, scope, mask)
      752 -> renderText_2Group752(node, scope, mask)
      753 -> renderText_2Group753(node, scope, mask)
      756 -> renderText_2Group756(node, scope, mask)
      757 -> renderText_2Group757(node, scope, mask)
      760 -> renderText_2Group760(node, scope, mask)
      761 -> renderText_2Group761(node, scope, mask)
      764 -> renderText_2Group764(node, scope, mask)
      765 -> renderText_2Group765(node, scope, mask)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group0(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      5 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))))
      17 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()))
      20 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group2(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      65 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))))
      68 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))))
      80 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group32(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1025 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `softWrap` = decode_softWrap(node))
      1027 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node), `softWrap` = decode_softWrap(node))
      1028 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `softWrap` = decode_softWrap(node))
      1030 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `softWrap` = decode_softWrap(node))
      1033 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `softWrap` = decode_softWrap(node))
      1035 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `softWrap` = decode_softWrap(node))
      1036 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `softWrap` = decode_softWrap(node))
      1038 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `softWrap` = decode_softWrap(node))
      1040 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `softWrap` = decode_softWrap(node))
      1042 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `softWrap` = decode_softWrap(node))
      1048 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `softWrap` = decode_softWrap(node))
      1050 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `softWrap` = decode_softWrap(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group33(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1057 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `letterSpacing` = decode_letterSpacing(node), `softWrap` = decode_softWrap(node))
      1059 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `softWrap` = decode_softWrap(node))
      1060 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `letterSpacing` = decode_letterSpacing(node), `softWrap` = decode_softWrap(node))
      1062 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `letterSpacing` = decode_letterSpacing(node), `softWrap` = decode_softWrap(node))
      1065 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `softWrap` = decode_softWrap(node))
      1067 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `softWrap` = decode_softWrap(node))
      1068 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `softWrap` = decode_softWrap(node))
      1070 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `softWrap` = decode_softWrap(node))
      1072 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `letterSpacing` = decode_letterSpacing(node), `softWrap` = decode_softWrap(node))
      1074 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `letterSpacing` = decode_letterSpacing(node), `softWrap` = decode_softWrap(node))
      1080 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `letterSpacing` = decode_letterSpacing(node), `softWrap` = decode_softWrap(node))
      1082 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `letterSpacing` = decode_letterSpacing(node), `softWrap` = decode_softWrap(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group34(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1088 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `softWrap` = decode_softWrap(node))
      1090 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `softWrap` = decode_softWrap(node))
      1096 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `softWrap` = decode_softWrap(node))
      1098 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `softWrap` = decode_softWrap(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group35(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1120 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `softWrap` = decode_softWrap(node))
      1122 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `softWrap` = decode_softWrap(node))
      1128 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `softWrap` = decode_softWrap(node))
      1130 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `softWrap` = decode_softWrap(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group40(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1281 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node))
      1283 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node))
      1284 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node))
      1286 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node))
      1289 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node))
      1291 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node))
      1292 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node))
      1294 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node))
      1296 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node))
      1298 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node))
      1304 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node))
      1306 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group41(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1313 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node))
      1315 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node))
      1316 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node))
      1318 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node))
      1321 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node))
      1323 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node))
      1324 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node))
      1326 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node))
      1328 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node))
      1330 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node))
      1336 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node))
      1338 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group42(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1344 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node))
      1346 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node))
      1352 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node))
      1354 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group43(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1376 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node))
      1378 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node))
      1384 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node))
      1386 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group288(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      9216 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `softWrap` = decode_softWrap(node), `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) }))
      9218 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `softWrap` = decode_softWrap(node), `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) }))
      9224 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `softWrap` = decode_softWrap(node), `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) }))
      9226 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `softWrap` = decode_softWrap(node), `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) }))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group289(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      9248 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `softWrap` = decode_softWrap(node), `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) }))
      9250 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `softWrap` = decode_softWrap(node), `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) }))
      9256 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `softWrap` = decode_softWrap(node), `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) }))
      9258 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `softWrap` = decode_softWrap(node), `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) }))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group296(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      9472 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) }))
      9474 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) }))
      9480 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) }))
      9482 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) }))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group297(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      9504 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) }))
      9506 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) }))
      9512 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) }))
      9514 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `onTextLayout` = if (node.isNull("onTextLayout")) null else ({ value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) }))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group528(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      16896 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `overflow` = toComposeTextOverflow(node.string("overflow")), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      16898 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      16904 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      16906 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group529(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      16928 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      16930 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      16936 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      16938 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group532(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      17024 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17026 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17032 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17034 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group533(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      17056 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17058 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17064 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17066 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group536(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      17152 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17154 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17160 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17162 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group537(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      17184 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17186 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17192 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17194 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group540(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      17280 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17282 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17288 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17290 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group541(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      17312 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17314 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17320 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17322 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group544(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      17408 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17410 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17416 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17418 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group545(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      17440 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17442 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17448 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17450 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group548(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      17536 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17538 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17544 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17546 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group549(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      17568 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17570 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17576 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17578 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group552(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      17664 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17666 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17672 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17674 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group553(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      17696 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17698 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17704 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17706 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group556(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      17792 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17794 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17800 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17802 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group557(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      17824 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17826 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17832 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17834 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group560(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      17920 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17922 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17928 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17930 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group561(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      17952 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17954 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17960 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17962 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group564(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      18048 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18050 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18056 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18058 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group565(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      18080 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18082 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18088 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18090 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group568(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      18176 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18178 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18184 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18186 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group569(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      18208 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18210 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18216 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18218 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group572(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      18304 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18306 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18312 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18314 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group573(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      18336 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18338 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18344 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18346 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group576(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      18432 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18434 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18440 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18442 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group577(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      18464 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18466 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18472 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18474 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group580(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      18560 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18562 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18568 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18570 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group581(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      18592 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18594 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18600 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18602 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group584(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      18688 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18690 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18696 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18698 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group585(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      18720 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18722 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18728 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18730 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group588(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      18816 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18818 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18824 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18826 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group589(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      18848 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18850 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18856 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18858 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group592(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      18944 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18946 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18952 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18954 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group593(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      18976 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18978 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18984 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18986 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group596(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      19072 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19074 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19080 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19082 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group597(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      19104 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19106 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19112 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19114 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group600(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      19200 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19202 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19208 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19210 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group601(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      19232 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19234 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19240 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19242 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group604(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      19328 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19330 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19336 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19338 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group605(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      19360 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19362 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19368 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19370 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group608(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      19456 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19458 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19464 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19466 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group609(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      19488 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19490 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19496 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19498 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group612(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      19584 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19586 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19592 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19594 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group613(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      19616 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19618 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19624 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19626 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group616(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      19712 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19714 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19720 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19722 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group617(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      19744 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19746 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19752 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19754 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group620(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      19840 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19842 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19848 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19850 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group621(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      19872 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19874 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19880 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19882 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group624(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      19968 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19970 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19976 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19978 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group625(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      20000 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20002 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20008 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20010 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group628(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      20096 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20098 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20104 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20106 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group629(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      20128 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20130 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20136 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20138 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group632(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      20224 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20226 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20232 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20234 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group633(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      20256 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20258 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20264 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20266 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group636(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      20352 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20354 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20360 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20362 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group637(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      20384 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20386 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20392 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group640(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      20480 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20482 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20488 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20490 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group641(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      20512 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20514 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20520 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20522 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group644(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      20608 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20610 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20616 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20618 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group645(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      20640 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20642 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20648 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20650 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group648(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      20736 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `lineHeight` = decode_lineHeight(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20738 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `lineHeight` = decode_lineHeight(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20744 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20746 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group649(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      20768 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20770 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20776 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20778 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group652(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      20864 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20866 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20872 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20874 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group653(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      20896 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20898 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20904 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20906 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group656(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      20992 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20994 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21000 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21002 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group657(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      21024 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21026 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21032 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21034 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group660(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      21120 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21122 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21128 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21130 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group661(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      21152 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21154 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21160 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21162 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group664(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      21248 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21250 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21256 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21258 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group665(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      21280 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21282 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21288 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21290 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group668(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      21376 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21378 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21384 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21386 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group669(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      21408 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21410 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21416 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21418 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group672(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      21504 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21506 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21512 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21514 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group673(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      21536 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21538 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21544 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21546 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group676(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      21632 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21634 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21640 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21642 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group677(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      21664 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21666 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21672 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21674 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group680(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      21760 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21762 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21768 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21770 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group681(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      21792 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21794 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21800 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21802 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group684(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      21888 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21890 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21896 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21898 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group685(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      21920 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21922 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21928 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21930 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group688(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      22016 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22018 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22024 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22026 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group689(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      22048 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22050 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22056 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22058 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group692(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      22144 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22146 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22152 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22154 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group693(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      22176 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22178 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22184 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22186 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group696(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      22272 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22274 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22280 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22282 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group697(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      22304 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22306 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22312 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22314 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group700(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      22400 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22402 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22408 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22410 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group701(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      22432 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22434 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22440 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group704(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      22528 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22530 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22536 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22538 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group705(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      22560 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22562 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22568 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22570 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group708(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      22656 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22658 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22664 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22666 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group709(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      22688 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22690 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22696 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22698 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group712(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      22784 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22786 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22792 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22794 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group713(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      22816 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22818 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22824 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22826 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group716(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      22912 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22914 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22920 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22922 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group717(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      22944 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22946 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22952 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22954 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group720(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      23040 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23042 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23048 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23050 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group721(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      23072 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23074 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23080 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23082 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group724(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      23168 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23170 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23176 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23178 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group725(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      23200 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23202 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23208 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23210 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group728(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      23296 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23298 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23304 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23306 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group729(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      23328 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23330 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23336 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23338 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group732(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      23424 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23426 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23432 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23434 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group733(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      23456 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23458 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23464 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group736(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      23552 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23554 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23560 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23562 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group737(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      23584 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23586 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23592 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23594 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group740(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      23680 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23682 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23688 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23690 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group741(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      23712 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23714 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23720 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23722 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group744(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      23808 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23810 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23816 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23818 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group745(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      23840 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23842 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23848 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23850 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group748(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      23936 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23938 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23944 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23946 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group749(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      23968 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23970 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23976 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group752(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      24064 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      24066 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      24072 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      24074 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group753(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      24096 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      24098 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      24104 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      24106 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group756(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      24192 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      24194 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      24200 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      24202 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group757(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      24224 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      24226 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      24232 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group760(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      24320 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      24322 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      24328 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      24330 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group761(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      24352 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      24354 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      24360 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group764(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      24448 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      24450 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      24456 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_2Group765(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      24480 -> androidx.compose.material3.Text(`text` = decode_text(node), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}
