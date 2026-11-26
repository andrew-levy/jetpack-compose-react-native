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

// androidx.compose.material3.Text(text: androidx.compose.ui.text.AnnotatedString, color: androidx.compose.ui.graphics.ColorProducer, modifier: androidx.compose.ui.Modifier, autoSize: androidx.compose.foundation.text.TextAutoSize?, fontSize: androidx.compose.ui.unit.TextUnit, fontStyle: androidx.compose.ui.text.font.FontStyle?, fontWeight: androidx.compose.ui.text.font.FontWeight?, fontFamily: androidx.compose.ui.text.font.FontFamily?, letterSpacing: androidx.compose.ui.unit.TextUnit, textDecoration: androidx.compose.ui.text.style.TextDecoration?, textAlign: androidx.compose.ui.text.style.TextAlign?, lineHeight: androidx.compose.ui.unit.TextUnit, overflow: androidx.compose.ui.text.style.TextOverflow, softWrap: kotlin.Boolean, maxLines: kotlin.Int, minLines: kotlin.Int, inlineContent: kotlin.collections.Map<kotlin.String, androidx.compose.foundation.text.InlineTextContent>, onTextLayout: kotlin.Function1<androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>, style: androidx.compose.ui.text.TextStyle)
internal object RendererText_3 {
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
      0 -> renderText_3Group0(node, scope, mask)
      2 -> renderText_3Group2(node, scope, mask)
      4 -> renderText_3Group4(node, scope, mask)
      5 -> renderText_3Group5(node, scope, mask)
      12 -> renderText_3Group12(node, scope, mask)
      13 -> renderText_3Group13(node, scope, mask)
      16 -> renderText_3Group16(node, scope, mask)
      17 -> renderText_3Group17(node, scope, mask)
      20 -> renderText_3Group20(node, scope, mask)
      21 -> renderText_3Group21(node, scope, mask)
      24 -> renderText_3Group24(node, scope, mask)
      25 -> renderText_3Group25(node, scope, mask)
      28 -> renderText_3Group28(node, scope, mask)
      29 -> renderText_3Group29(node, scope, mask)
      32 -> renderText_3Group32(node, scope, mask)
      33 -> renderText_3Group33(node, scope, mask)
      34 -> renderText_3Group34(node, scope, mask)
      35 -> renderText_3Group35(node, scope, mask)
      36 -> renderText_3Group36(node, scope, mask)
      37 -> renderText_3Group37(node, scope, mask)
      40 -> renderText_3Group40(node, scope, mask)
      41 -> renderText_3Group41(node, scope, mask)
      42 -> renderText_3Group42(node, scope, mask)
      43 -> renderText_3Group43(node, scope, mask)
      44 -> renderText_3Group44(node, scope, mask)
      45 -> renderText_3Group45(node, scope, mask)
      48 -> renderText_3Group48(node, scope, mask)
      49 -> renderText_3Group49(node, scope, mask)
      52 -> renderText_3Group52(node, scope, mask)
      53 -> renderText_3Group53(node, scope, mask)
      56 -> renderText_3Group56(node, scope, mask)
      57 -> renderText_3Group57(node, scope, mask)
      60 -> renderText_3Group60(node, scope, mask)
      61 -> renderText_3Group61(node, scope, mask)
      64 -> renderText_3Group64(node, scope, mask)
      65 -> renderText_3Group65(node, scope, mask)
      68 -> renderText_3Group68(node, scope, mask)
      69 -> renderText_3Group69(node, scope, mask)
      72 -> renderText_3Group72(node, scope, mask)
      73 -> renderText_3Group73(node, scope, mask)
      76 -> renderText_3Group76(node, scope, mask)
      77 -> renderText_3Group77(node, scope, mask)
      80 -> renderText_3Group80(node, scope, mask)
      81 -> renderText_3Group81(node, scope, mask)
      84 -> renderText_3Group84(node, scope, mask)
      85 -> renderText_3Group85(node, scope, mask)
      88 -> renderText_3Group88(node, scope, mask)
      89 -> renderText_3Group89(node, scope, mask)
      92 -> renderText_3Group92(node, scope, mask)
      93 -> renderText_3Group93(node, scope, mask)
      96 -> renderText_3Group96(node, scope, mask)
      97 -> renderText_3Group97(node, scope, mask)
      100 -> renderText_3Group100(node, scope, mask)
      101 -> renderText_3Group101(node, scope, mask)
      104 -> renderText_3Group104(node, scope, mask)
      105 -> renderText_3Group105(node, scope, mask)
      108 -> renderText_3Group108(node, scope, mask)
      109 -> renderText_3Group109(node, scope, mask)
      112 -> renderText_3Group112(node, scope, mask)
      113 -> renderText_3Group113(node, scope, mask)
      116 -> renderText_3Group116(node, scope, mask)
      117 -> renderText_3Group117(node, scope, mask)
      120 -> renderText_3Group120(node, scope, mask)
      121 -> renderText_3Group121(node, scope, mask)
      124 -> renderText_3Group124(node, scope, mask)
      125 -> renderText_3Group125(node, scope, mask)
      128 -> renderText_3Group128(node, scope, mask)
      129 -> renderText_3Group129(node, scope, mask)
      132 -> renderText_3Group132(node, scope, mask)
      133 -> renderText_3Group133(node, scope, mask)
      136 -> renderText_3Group136(node, scope, mask)
      137 -> renderText_3Group137(node, scope, mask)
      140 -> renderText_3Group140(node, scope, mask)
      141 -> renderText_3Group141(node, scope, mask)
      144 -> renderText_3Group144(node, scope, mask)
      145 -> renderText_3Group145(node, scope, mask)
      148 -> renderText_3Group148(node, scope, mask)
      149 -> renderText_3Group149(node, scope, mask)
      152 -> renderText_3Group152(node, scope, mask)
      153 -> renderText_3Group153(node, scope, mask)
      156 -> renderText_3Group156(node, scope, mask)
      157 -> renderText_3Group157(node, scope, mask)
      160 -> renderText_3Group160(node, scope, mask)
      161 -> renderText_3Group161(node, scope, mask)
      164 -> renderText_3Group164(node, scope, mask)
      165 -> renderText_3Group165(node, scope, mask)
      168 -> renderText_3Group168(node, scope, mask)
      169 -> renderText_3Group169(node, scope, mask)
      172 -> renderText_3Group172(node, scope, mask)
      173 -> renderText_3Group173(node, scope, mask)
      176 -> renderText_3Group176(node, scope, mask)
      177 -> renderText_3Group177(node, scope, mask)
      180 -> renderText_3Group180(node, scope, mask)
      181 -> renderText_3Group181(node, scope, mask)
      184 -> renderText_3Group184(node, scope, mask)
      185 -> renderText_3Group185(node, scope, mask)
      188 -> renderText_3Group188(node, scope, mask)
      189 -> renderText_3Group189(node, scope, mask)
      192 -> renderText_3Group192(node, scope, mask)
      193 -> renderText_3Group193(node, scope, mask)
      196 -> renderText_3Group196(node, scope, mask)
      197 -> renderText_3Group197(node, scope, mask)
      200 -> renderText_3Group200(node, scope, mask)
      201 -> renderText_3Group201(node, scope, mask)
      204 -> renderText_3Group204(node, scope, mask)
      205 -> renderText_3Group205(node, scope, mask)
      208 -> renderText_3Group208(node, scope, mask)
      209 -> renderText_3Group209(node, scope, mask)
      212 -> renderText_3Group212(node, scope, mask)
      213 -> renderText_3Group213(node, scope, mask)
      216 -> renderText_3Group216(node, scope, mask)
      217 -> renderText_3Group217(node, scope, mask)
      220 -> renderText_3Group220(node, scope, mask)
      221 -> renderText_3Group221(node, scope, mask)
      224 -> renderText_3Group224(node, scope, mask)
      225 -> renderText_3Group225(node, scope, mask)
      228 -> renderText_3Group228(node, scope, mask)
      229 -> renderText_3Group229(node, scope, mask)
      232 -> renderText_3Group232(node, scope, mask)
      233 -> renderText_3Group233(node, scope, mask)
      236 -> renderText_3Group236(node, scope, mask)
      237 -> renderText_3Group237(node, scope, mask)
      240 -> renderText_3Group240(node, scope, mask)
      241 -> renderText_3Group241(node, scope, mask)
      244 -> renderText_3Group244(node, scope, mask)
      245 -> renderText_3Group245(node, scope, mask)
      248 -> renderText_3Group248(node, scope, mask)
      249 -> renderText_3Group249(node, scope, mask)
      252 -> renderText_3Group252(node, scope, mask)
      253 -> renderText_3Group253(node, scope, mask)
      288 -> renderText_3Group288(node, scope, mask)
      289 -> renderText_3Group289(node, scope, mask)
      296 -> renderText_3Group296(node, scope, mask)
      297 -> renderText_3Group297(node, scope, mask)
      528 -> renderText_3Group528(node, scope, mask)
      529 -> renderText_3Group529(node, scope, mask)
      532 -> renderText_3Group532(node, scope, mask)
      533 -> renderText_3Group533(node, scope, mask)
      536 -> renderText_3Group536(node, scope, mask)
      537 -> renderText_3Group537(node, scope, mask)
      540 -> renderText_3Group540(node, scope, mask)
      541 -> renderText_3Group541(node, scope, mask)
      544 -> renderText_3Group544(node, scope, mask)
      545 -> renderText_3Group545(node, scope, mask)
      548 -> renderText_3Group548(node, scope, mask)
      549 -> renderText_3Group549(node, scope, mask)
      552 -> renderText_3Group552(node, scope, mask)
      553 -> renderText_3Group553(node, scope, mask)
      556 -> renderText_3Group556(node, scope, mask)
      557 -> renderText_3Group557(node, scope, mask)
      560 -> renderText_3Group560(node, scope, mask)
      561 -> renderText_3Group561(node, scope, mask)
      564 -> renderText_3Group564(node, scope, mask)
      565 -> renderText_3Group565(node, scope, mask)
      568 -> renderText_3Group568(node, scope, mask)
      569 -> renderText_3Group569(node, scope, mask)
      572 -> renderText_3Group572(node, scope, mask)
      573 -> renderText_3Group573(node, scope, mask)
      576 -> renderText_3Group576(node, scope, mask)
      577 -> renderText_3Group577(node, scope, mask)
      580 -> renderText_3Group580(node, scope, mask)
      581 -> renderText_3Group581(node, scope, mask)
      584 -> renderText_3Group584(node, scope, mask)
      585 -> renderText_3Group585(node, scope, mask)
      588 -> renderText_3Group588(node, scope, mask)
      589 -> renderText_3Group589(node, scope, mask)
      592 -> renderText_3Group592(node, scope, mask)
      593 -> renderText_3Group593(node, scope, mask)
      596 -> renderText_3Group596(node, scope, mask)
      597 -> renderText_3Group597(node, scope, mask)
      600 -> renderText_3Group600(node, scope, mask)
      601 -> renderText_3Group601(node, scope, mask)
      604 -> renderText_3Group604(node, scope, mask)
      605 -> renderText_3Group605(node, scope, mask)
      608 -> renderText_3Group608(node, scope, mask)
      609 -> renderText_3Group609(node, scope, mask)
      612 -> renderText_3Group612(node, scope, mask)
      613 -> renderText_3Group613(node, scope, mask)
      616 -> renderText_3Group616(node, scope, mask)
      617 -> renderText_3Group617(node, scope, mask)
      620 -> renderText_3Group620(node, scope, mask)
      621 -> renderText_3Group621(node, scope, mask)
      624 -> renderText_3Group624(node, scope, mask)
      625 -> renderText_3Group625(node, scope, mask)
      628 -> renderText_3Group628(node, scope, mask)
      629 -> renderText_3Group629(node, scope, mask)
      632 -> renderText_3Group632(node, scope, mask)
      633 -> renderText_3Group633(node, scope, mask)
      636 -> renderText_3Group636(node, scope, mask)
      637 -> renderText_3Group637(node, scope, mask)
      640 -> renderText_3Group640(node, scope, mask)
      641 -> renderText_3Group641(node, scope, mask)
      644 -> renderText_3Group644(node, scope, mask)
      645 -> renderText_3Group645(node, scope, mask)
      648 -> renderText_3Group648(node, scope, mask)
      649 -> renderText_3Group649(node, scope, mask)
      652 -> renderText_3Group652(node, scope, mask)
      653 -> renderText_3Group653(node, scope, mask)
      656 -> renderText_3Group656(node, scope, mask)
      657 -> renderText_3Group657(node, scope, mask)
      660 -> renderText_3Group660(node, scope, mask)
      661 -> renderText_3Group661(node, scope, mask)
      664 -> renderText_3Group664(node, scope, mask)
      665 -> renderText_3Group665(node, scope, mask)
      668 -> renderText_3Group668(node, scope, mask)
      669 -> renderText_3Group669(node, scope, mask)
      672 -> renderText_3Group672(node, scope, mask)
      673 -> renderText_3Group673(node, scope, mask)
      676 -> renderText_3Group676(node, scope, mask)
      677 -> renderText_3Group677(node, scope, mask)
      680 -> renderText_3Group680(node, scope, mask)
      681 -> renderText_3Group681(node, scope, mask)
      684 -> renderText_3Group684(node, scope, mask)
      685 -> renderText_3Group685(node, scope, mask)
      688 -> renderText_3Group688(node, scope, mask)
      689 -> renderText_3Group689(node, scope, mask)
      692 -> renderText_3Group692(node, scope, mask)
      693 -> renderText_3Group693(node, scope, mask)
      696 -> renderText_3Group696(node, scope, mask)
      697 -> renderText_3Group697(node, scope, mask)
      700 -> renderText_3Group700(node, scope, mask)
      701 -> renderText_3Group701(node, scope, mask)
      704 -> renderText_3Group704(node, scope, mask)
      705 -> renderText_3Group705(node, scope, mask)
      708 -> renderText_3Group708(node, scope, mask)
      709 -> renderText_3Group709(node, scope, mask)
      712 -> renderText_3Group712(node, scope, mask)
      713 -> renderText_3Group713(node, scope, mask)
      716 -> renderText_3Group716(node, scope, mask)
      717 -> renderText_3Group717(node, scope, mask)
      720 -> renderText_3Group720(node, scope, mask)
      721 -> renderText_3Group721(node, scope, mask)
      724 -> renderText_3Group724(node, scope, mask)
      725 -> renderText_3Group725(node, scope, mask)
      728 -> renderText_3Group728(node, scope, mask)
      729 -> renderText_3Group729(node, scope, mask)
      732 -> renderText_3Group732(node, scope, mask)
      733 -> renderText_3Group733(node, scope, mask)
      736 -> renderText_3Group736(node, scope, mask)
      737 -> renderText_3Group737(node, scope, mask)
      740 -> renderText_3Group740(node, scope, mask)
      741 -> renderText_3Group741(node, scope, mask)
      744 -> renderText_3Group744(node, scope, mask)
      745 -> renderText_3Group745(node, scope, mask)
      748 -> renderText_3Group748(node, scope, mask)
      749 -> renderText_3Group749(node, scope, mask)
      752 -> renderText_3Group752(node, scope, mask)
      753 -> renderText_3Group753(node, scope, mask)
      756 -> renderText_3Group756(node, scope, mask)
      757 -> renderText_3Group757(node, scope, mask)
      760 -> renderText_3Group760(node, scope, mask)
      761 -> renderText_3Group761(node, scope, mask)
      764 -> renderText_3Group764(node, scope, mask)
      765 -> renderText_3Group765(node, scope, mask)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group0(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      5 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))))
      17 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()))
      20 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group2(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      65 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))))
      68 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))))
      80 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group4(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      136 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))))
      138 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group5(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      168 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))))
      170 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group12(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      392 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node))
      394 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group13(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      424 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node))
      426 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group16(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      520 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `overflow` = toComposeTextOverflow(node.string("overflow")))
      522 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `overflow` = toComposeTextOverflow(node.string("overflow")))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group17(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      552 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")))
      554 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group20(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      640 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")))
      642 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")))
      648 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")))
      650 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group21(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      672 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")))
      674 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")))
      680 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")))
      682 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group24(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      776 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")))
      778 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group25(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      808 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")))
      810 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group28(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      896 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")))
      898 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")))
      904 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")))
      906 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group29(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      928 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")))
      930 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")))
      936 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")))
      938 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group32(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1025 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `softWrap` = decode_softWrap(node))
      1027 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node), `softWrap` = decode_softWrap(node))
      1028 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `softWrap` = decode_softWrap(node))
      1030 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `softWrap` = decode_softWrap(node))
      1032 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `softWrap` = decode_softWrap(node))
      1033 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `softWrap` = decode_softWrap(node))
      1034 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `softWrap` = decode_softWrap(node))
      1035 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `softWrap` = decode_softWrap(node))
      1036 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `softWrap` = decode_softWrap(node))
      1038 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `softWrap` = decode_softWrap(node))
      1040 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `softWrap` = decode_softWrap(node))
      1042 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `softWrap` = decode_softWrap(node))
      1048 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `softWrap` = decode_softWrap(node))
      1050 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `softWrap` = decode_softWrap(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group33(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1057 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `letterSpacing` = decode_letterSpacing(node), `softWrap` = decode_softWrap(node))
      1059 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `softWrap` = decode_softWrap(node))
      1060 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `letterSpacing` = decode_letterSpacing(node), `softWrap` = decode_softWrap(node))
      1062 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `letterSpacing` = decode_letterSpacing(node), `softWrap` = decode_softWrap(node))
      1064 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `softWrap` = decode_softWrap(node))
      1065 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `softWrap` = decode_softWrap(node))
      1066 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `softWrap` = decode_softWrap(node))
      1067 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `softWrap` = decode_softWrap(node))
      1068 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `softWrap` = decode_softWrap(node))
      1070 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `softWrap` = decode_softWrap(node))
      1072 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `letterSpacing` = decode_letterSpacing(node), `softWrap` = decode_softWrap(node))
      1074 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `letterSpacing` = decode_letterSpacing(node), `softWrap` = decode_softWrap(node))
      1080 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `letterSpacing` = decode_letterSpacing(node), `softWrap` = decode_softWrap(node))
      1082 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `letterSpacing` = decode_letterSpacing(node), `softWrap` = decode_softWrap(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group34(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1088 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `softWrap` = decode_softWrap(node))
      1090 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `softWrap` = decode_softWrap(node))
      1096 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `softWrap` = decode_softWrap(node))
      1098 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `softWrap` = decode_softWrap(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group35(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1120 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `softWrap` = decode_softWrap(node))
      1122 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `softWrap` = decode_softWrap(node))
      1128 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `softWrap` = decode_softWrap(node))
      1130 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `softWrap` = decode_softWrap(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group36(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1152 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node))
      1154 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node))
      1160 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node))
      1162 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group37(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1184 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node))
      1186 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node))
      1192 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node))
      1194 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group40(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1281 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node))
      1283 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node))
      1284 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node))
      1286 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node))
      1288 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node))
      1289 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node))
      1290 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node))
      1291 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node))
      1292 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node))
      1294 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node))
      1296 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node))
      1298 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node))
      1304 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node))
      1306 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group41(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1313 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node))
      1315 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node))
      1316 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node))
      1318 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node))
      1320 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node))
      1321 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node))
      1322 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node))
      1323 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `autoSize` = if (node.isNull("autoSize")) null else (node.jsonObject("autoSize").decodeComposeTextAutoSizeValue()), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node))
      1324 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node))
      1326 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontStyle` = if (node.isNull("fontStyle")) null else (toComposeFontStyleValue(node.string("fontStyle"))), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node))
      1328 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node))
      1330 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node))
      1336 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node))
      1338 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `fontFamily` = if (node.isNull("fontFamily")) null else (node.jsonObject("fontFamily").decodeComposeFontFamilyValue()), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group42(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1344 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node))
      1346 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node))
      1352 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node))
      1354 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group43(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1376 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node))
      1378 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node))
      1384 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node))
      1386 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textDecoration` = if (node.isNull("textDecoration")) null else (toComposeTextDecorationValue(node.string("textDecoration"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group44(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1408 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node))
      1410 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node))
      1416 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node))
      1418 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group45(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1440 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node))
      1442 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node))
      1448 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node))
      1450 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group48(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1536 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node))
      1538 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node))
      1544 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node))
      1546 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group49(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1568 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node))
      1570 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node))
      1576 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node))
      1578 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group52(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1664 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node))
      1666 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node))
      1672 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node))
      1674 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group53(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1696 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node))
      1698 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node))
      1704 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node))
      1706 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group56(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1792 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node))
      1794 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node))
      1800 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node))
      1802 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group57(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1824 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node))
      1826 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node))
      1832 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node))
      1834 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group60(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1920 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node))
      1922 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node))
      1928 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node))
      1930 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group61(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      1952 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node))
      1954 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node))
      1960 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node))
      1962 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group64(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      2056 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `maxLines` = decode_maxLines(node))
      2058 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `maxLines` = decode_maxLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group65(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      2088 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `maxLines` = decode_maxLines(node))
      2090 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `maxLines` = decode_maxLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group68(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      2176 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `maxLines` = decode_maxLines(node))
      2178 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `maxLines` = decode_maxLines(node))
      2184 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `maxLines` = decode_maxLines(node))
      2186 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `maxLines` = decode_maxLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group69(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      2208 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `maxLines` = decode_maxLines(node))
      2210 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `maxLines` = decode_maxLines(node))
      2216 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `maxLines` = decode_maxLines(node))
      2218 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `maxLines` = decode_maxLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group72(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      2312 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node))
      2314 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group73(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      2344 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node))
      2346 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group76(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      2432 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node))
      2434 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node))
      2440 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node))
      2442 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group77(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      2464 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node))
      2466 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node))
      2472 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node))
      2474 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group80(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      2560 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node))
      2562 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node))
      2568 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node))
      2570 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group81(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      2592 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node))
      2594 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node))
      2600 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node))
      2602 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group84(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      2688 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node))
      2690 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node))
      2696 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node))
      2698 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group85(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      2720 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node))
      2722 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node))
      2728 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node))
      2730 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group88(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      2816 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node))
      2818 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node))
      2824 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node))
      2826 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group89(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      2848 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node))
      2850 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node))
      2856 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node))
      2858 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group92(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      2944 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node))
      2946 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node))
      2952 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node))
      2954 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group93(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      2976 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node))
      2978 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node))
      2984 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node))
      2986 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group96(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      3072 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node))
      3074 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node))
      3080 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node))
      3082 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group97(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      3104 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node))
      3106 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node))
      3112 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node))
      3114 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group100(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      3200 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node))
      3202 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node))
      3208 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node))
      3210 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group101(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      3232 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node))
      3234 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node))
      3240 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node))
      3242 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group104(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      3328 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node))
      3330 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node))
      3336 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node))
      3338 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group105(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      3360 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node))
      3362 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node))
      3368 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node))
      3370 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group108(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      3456 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node))
      3458 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node))
      3464 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node))
      3466 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group109(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      3488 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node))
      3490 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node))
      3496 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node))
      3498 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group112(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      3584 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node))
      3586 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node))
      3592 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node))
      3594 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group113(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      3616 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node))
      3618 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node))
      3624 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node))
      3626 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group116(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      3712 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node))
      3714 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node))
      3720 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node))
      3722 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group117(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      3744 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node))
      3746 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node))
      3752 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node))
      3754 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group120(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      3840 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node))
      3842 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node))
      3848 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node))
      3850 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group121(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      3872 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node))
      3874 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node))
      3880 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node))
      3882 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group124(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      3968 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node))
      3970 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node))
      3976 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node))
      3978 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group125(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      4000 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node))
      4002 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node))
      4008 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node))
      4010 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group128(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      4104 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `minLines` = decode_minLines(node))
      4106 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `minLines` = decode_minLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group129(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      4136 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `minLines` = decode_minLines(node))
      4138 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `minLines` = decode_minLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group132(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      4224 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `minLines` = decode_minLines(node))
      4226 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `minLines` = decode_minLines(node))
      4232 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `minLines` = decode_minLines(node))
      4234 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `minLines` = decode_minLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group133(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      4256 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `minLines` = decode_minLines(node))
      4258 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `minLines` = decode_minLines(node))
      4264 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `minLines` = decode_minLines(node))
      4266 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `minLines` = decode_minLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group136(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      4360 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `minLines` = decode_minLines(node))
      4362 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `minLines` = decode_minLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group137(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      4392 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `minLines` = decode_minLines(node))
      4394 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `minLines` = decode_minLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group140(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      4480 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `minLines` = decode_minLines(node))
      4482 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `minLines` = decode_minLines(node))
      4488 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `minLines` = decode_minLines(node))
      4490 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `minLines` = decode_minLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group141(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      4512 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `minLines` = decode_minLines(node))
      4514 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `minLines` = decode_minLines(node))
      4520 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `minLines` = decode_minLines(node))
      4522 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `minLines` = decode_minLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group144(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      4608 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node))
      4610 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node))
      4616 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node))
      4618 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group145(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      4640 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node))
      4642 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node))
      4648 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node))
      4650 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group148(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      4736 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node))
      4738 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node))
      4744 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node))
      4746 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group149(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      4768 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node))
      4770 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node))
      4776 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node))
      4778 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group152(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      4864 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node))
      4866 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node))
      4872 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node))
      4874 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group153(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      4896 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node))
      4898 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node))
      4904 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node))
      4906 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group156(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      4992 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node))
      4994 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node))
      5000 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node))
      5002 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group157(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      5024 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node))
      5026 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node))
      5032 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node))
      5034 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group160(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      5120 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node))
      5122 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node))
      5128 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node))
      5130 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group161(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      5152 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node))
      5154 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node))
      5160 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node))
      5162 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group164(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      5248 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node))
      5250 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node))
      5256 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node))
      5258 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group165(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      5280 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node))
      5282 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node))
      5288 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node))
      5290 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group168(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      5376 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node))
      5378 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node))
      5384 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node))
      5386 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group169(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      5408 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node))
      5410 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node))
      5416 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node))
      5418 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group172(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      5504 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node))
      5506 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node))
      5512 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node))
      5514 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group173(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      5536 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node))
      5538 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node))
      5544 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node))
      5546 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group176(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      5632 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node))
      5634 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node))
      5640 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node))
      5642 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group177(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      5664 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node))
      5666 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node))
      5672 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node))
      5674 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group180(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      5760 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node))
      5762 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node))
      5768 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node))
      5770 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group181(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      5792 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node))
      5794 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node))
      5800 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node))
      5802 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group184(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      5888 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node))
      5890 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node))
      5896 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node))
      5898 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group185(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      5920 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node))
      5922 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node))
      5928 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node))
      5930 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group188(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      6016 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node))
      6018 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node))
      6024 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node))
      6026 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group189(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      6048 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node))
      6050 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node))
      6056 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node))
      6058 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group192(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      6144 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      6146 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      6152 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      6154 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group193(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      6176 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      6178 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      6184 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      6186 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group196(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      6272 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      6274 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      6280 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      6282 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group197(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      6304 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      6306 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      6312 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      6314 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group200(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      6400 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      6402 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      6408 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      6410 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group201(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      6432 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      6434 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      6440 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      6442 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group204(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      6528 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      6530 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      6536 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      6538 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group205(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      6560 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      6562 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      6568 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      6570 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group208(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      6656 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      6658 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      6664 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      6666 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group209(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      6688 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      6690 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      6696 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      6698 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group212(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      6784 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      6786 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      6792 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      6794 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group213(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      6816 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      6818 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      6824 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      6826 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group216(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      6912 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      6914 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      6920 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      6922 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group217(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      6944 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      6946 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      6952 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      6954 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group220(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      7040 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      7042 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      7048 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      7050 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group221(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      7072 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      7074 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      7080 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      7082 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group224(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      7168 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      7170 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      7176 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      7178 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group225(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      7200 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      7202 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      7208 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      7210 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group228(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      7296 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      7298 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      7304 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      7306 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group229(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      7328 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      7330 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      7336 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      7338 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group232(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      7424 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      7426 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      7432 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      7434 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group233(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      7456 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      7458 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      7464 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      7466 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group236(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      7552 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      7554 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      7560 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      7562 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group237(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      7584 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      7586 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      7592 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      7594 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group240(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      7680 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      7682 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      7688 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      7690 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group241(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      7712 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      7714 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      7720 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      7722 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group244(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      7808 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      7810 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      7816 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      7818 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group245(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      7840 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      7842 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      7848 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      7850 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group248(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      7936 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      7938 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      7944 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      7946 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group249(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      7968 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      7970 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      7976 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      7978 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group252(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      8064 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      8066 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      8072 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      8074 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group253(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      8096 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      8098 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      8104 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node))
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group288(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      9216 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `softWrap` = decode_softWrap(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) })
      9218 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `softWrap` = decode_softWrap(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) })
      9224 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `softWrap` = decode_softWrap(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) })
      9226 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `softWrap` = decode_softWrap(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group289(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      9248 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `softWrap` = decode_softWrap(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) })
      9250 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `softWrap` = decode_softWrap(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) })
      9256 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `softWrap` = decode_softWrap(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) })
      9258 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `softWrap` = decode_softWrap(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group296(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      9472 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) })
      9474 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) })
      9480 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) })
      9482 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group297(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      9504 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) })
      9506 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) })
      9512 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) })
      9514 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `onTextLayout` = { value: androidx.compose.ui.text.TextLayoutResult -> node.emit("onTextLayout", value.toComposeSnapshot()) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group528(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      16896 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `overflow` = toComposeTextOverflow(node.string("overflow")), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      16898 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      16904 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      16906 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group529(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      16928 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      16930 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      16936 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      16938 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group532(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      17024 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17026 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17032 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17034 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group533(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      17056 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17058 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17064 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17066 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group536(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      17152 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17154 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17160 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17162 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group537(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      17184 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17186 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17192 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17194 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group540(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      17280 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17282 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17288 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17290 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group541(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      17312 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17314 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17320 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17322 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group544(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      17408 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17410 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17416 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17418 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group545(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      17440 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17442 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17448 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17450 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group548(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      17536 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17538 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17544 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17546 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group549(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      17568 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17570 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17576 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17578 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group552(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      17664 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17666 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17672 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17674 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group553(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      17696 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17698 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17704 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17706 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group556(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      17792 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17794 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17800 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17802 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group557(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      17824 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17826 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17832 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17834 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group560(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      17920 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17922 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17928 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17930 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group561(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      17952 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17954 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17960 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      17962 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group564(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      18048 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18050 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18056 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18058 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group565(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      18080 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18082 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18088 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18090 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group568(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      18176 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18178 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18184 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18186 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group569(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      18208 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18210 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18216 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18218 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group572(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      18304 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18306 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18312 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18314 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group573(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      18336 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18338 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18344 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18346 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group576(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      18432 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18434 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18440 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18442 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group577(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      18464 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18466 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18472 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18474 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group580(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      18560 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18562 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18568 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18570 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group581(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      18592 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18594 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18600 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18602 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group584(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      18688 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18690 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18696 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18698 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group585(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      18720 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18722 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18728 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18730 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group588(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      18816 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18818 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18824 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18826 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group589(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      18848 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18850 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18856 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18858 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group592(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      18944 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18946 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18952 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18954 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group593(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      18976 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18978 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18984 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      18986 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group596(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      19072 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19074 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19080 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19082 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group597(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      19104 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19106 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19112 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19114 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group600(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      19200 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19202 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19208 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19210 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group601(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      19232 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19234 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19240 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19242 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group604(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      19328 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19330 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19336 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19338 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group605(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      19360 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19362 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19368 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19370 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group608(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      19456 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19458 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19464 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19466 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group609(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      19488 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19490 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19496 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19498 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group612(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      19584 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19586 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19592 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19594 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group613(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      19616 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19618 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19624 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19626 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group616(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      19712 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19714 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19720 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19722 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group617(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      19744 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19746 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19752 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19754 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group620(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      19840 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19842 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19848 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19850 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group621(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      19872 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19874 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19880 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19882 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group624(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      19968 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19970 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19976 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      19978 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group625(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      20000 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20002 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20008 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20010 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group628(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      20096 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20098 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20104 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20106 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group629(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      20128 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20130 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20136 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20138 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group632(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      20224 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20226 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20232 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20234 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group633(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      20256 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20258 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20264 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20266 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group636(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      20352 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20354 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20360 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20362 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group637(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      20384 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20386 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20392 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group640(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      20480 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20482 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20488 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20490 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group641(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      20512 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20514 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20520 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20522 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group644(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      20608 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20610 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20616 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20618 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group645(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      20640 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20642 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20648 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20650 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group648(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      20736 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `lineHeight` = decode_lineHeight(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20738 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `lineHeight` = decode_lineHeight(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20744 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20746 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group649(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      20768 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20770 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20776 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20778 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group652(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      20864 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20866 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20872 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20874 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group653(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      20896 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20898 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20904 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20906 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group656(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      20992 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      20994 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21000 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21002 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group657(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      21024 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21026 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21032 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21034 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group660(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      21120 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21122 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21128 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21130 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group661(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      21152 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21154 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21160 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21162 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group664(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      21248 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21250 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21256 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21258 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group665(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      21280 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21282 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21288 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21290 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group668(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      21376 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21378 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21384 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21386 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group669(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      21408 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21410 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21416 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21418 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group672(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      21504 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21506 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21512 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21514 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group673(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      21536 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21538 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21544 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21546 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group676(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      21632 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21634 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21640 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21642 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group677(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      21664 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21666 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21672 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21674 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group680(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      21760 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21762 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21768 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21770 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group681(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      21792 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21794 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21800 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21802 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group684(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      21888 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21890 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21896 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21898 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group685(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      21920 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21922 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21928 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      21930 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group688(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      22016 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22018 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22024 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22026 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group689(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      22048 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22050 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22056 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22058 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group692(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      22144 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22146 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22152 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22154 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group693(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      22176 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22178 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22184 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22186 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group696(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      22272 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22274 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22280 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22282 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group697(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      22304 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22306 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22312 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22314 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group700(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      22400 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22402 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22408 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22410 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group701(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      22432 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22434 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22440 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group704(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      22528 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22530 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22536 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22538 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group705(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      22560 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22562 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22568 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22570 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group708(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      22656 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22658 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22664 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22666 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group709(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      22688 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22690 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22696 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22698 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group712(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      22784 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22786 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22792 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22794 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group713(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      22816 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22818 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22824 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22826 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group716(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      22912 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22914 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22920 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22922 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group717(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      22944 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22946 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22952 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      22954 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group720(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      23040 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23042 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23048 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23050 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group721(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      23072 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23074 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23080 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23082 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group724(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      23168 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23170 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23176 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23178 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group725(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      23200 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23202 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23208 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23210 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group728(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      23296 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23298 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23304 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23306 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group729(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      23328 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23330 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23336 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23338 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group732(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      23424 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23426 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23432 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23434 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group733(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      23456 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23458 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23464 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group736(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      23552 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23554 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23560 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23562 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group737(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      23584 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23586 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23592 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23594 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group740(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      23680 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23682 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23688 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23690 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group741(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      23712 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23714 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23720 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23722 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group744(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      23808 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23810 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23816 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23818 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group745(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      23840 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23842 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23848 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23850 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group748(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      23936 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23938 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23944 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23946 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group749(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      23968 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23970 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      23976 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group752(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      24064 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      24066 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      24072 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      24074 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group753(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      24096 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      24098 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      24104 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      24106 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group756(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      24192 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      24194 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      24200 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      24202 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group757(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      24224 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      24226 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      24232 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group760(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      24320 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      24322 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      24328 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      24330 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group761(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      24352 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      24354 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      24360 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `letterSpacing` = decode_letterSpacing(node), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group764(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      24448 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      24450 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontSize` = decode_fontSize(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      24456 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `fontWeight` = if (node.isNull("fontWeight")) null else (toComposeFontWeight(node.string("fontWeight"))), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderText_3Group765(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      24480 -> androidx.compose.material3.Text(`text` = node.jsonObject("text").toAnnotatedString(), `color` = androidx.compose.ui.graphics.ColorProducer { node.color("color") }, `modifier` = node.modifier("modifier", scope), `letterSpacing` = decode_letterSpacing(node), `textAlign` = if (node.isNull("textAlign")) null else (toComposeTextAlign(node.string("textAlign"))), `lineHeight` = decode_lineHeight(node), `overflow` = toComposeTextOverflow(node.string("overflow")), `softWrap` = decode_softWrap(node), `maxLines` = decode_maxLines(node), `minLines` = decode_minLines(node), `style` = node.jsonObject("composeTextStyle").toTextStyle())
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}

// androidx.compose.material3.TextButton(onClick: kotlin.Function0<kotlin.Unit>, modifier: androidx.compose.ui.Modifier, enabled: kotlin.Boolean, shape: androidx.compose.ui.graphics.Shape, colors: androidx.compose.material3.ButtonColors, elevation: androidx.compose.material3.ButtonElevation?, border: androidx.compose.foundation.BorderStroke?, contentPadding: androidx.compose.foundation.layout.PaddingValues, interactionSource: androidx.compose.foundation.interaction.MutableInteractionSource?, content: kotlin.Function1<androidx.compose.foundation.layout.RowScope, kotlin.Unit>)
internal object RendererTextButton {
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
      0 -> renderTextButtonGroup0(node, scope, mask)
      1 -> renderTextButtonGroup1(node, scope, mask)
      2 -> renderTextButtonGroup2(node, scope, mask)
      3 -> renderTextButtonGroup3(node, scope, mask)
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderTextButtonGroup0(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      0 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), content = { RenderComposeChildren(node.children, this) })
      1 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), content = { RenderComposeChildren(node.children, this) })
      2 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), content = { RenderComposeChildren(node.children, this) })
      3 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), content = { RenderComposeChildren(node.children, this) })
      4 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), content = { RenderComposeChildren(node.children, this) })
      5 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), content = { RenderComposeChildren(node.children, this) })
      6 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), content = { RenderComposeChildren(node.children, this) })
      7 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), content = { RenderComposeChildren(node.children, this) })
      8 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), content = { RenderComposeChildren(node.children, this) })
      9 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), content = { RenderComposeChildren(node.children, this) })
      10 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), content = { RenderComposeChildren(node.children, this) })
      11 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), content = { RenderComposeChildren(node.children, this) })
      12 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), content = { RenderComposeChildren(node.children, this) })
      13 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), content = { RenderComposeChildren(node.children, this) })
      14 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), content = { RenderComposeChildren(node.children, this) })
      15 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), content = { RenderComposeChildren(node.children, this) })
      16 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      17 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      18 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      19 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      20 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      21 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      22 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      23 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      24 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      25 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      26 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      27 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      28 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      29 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      30 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      31 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderTextButtonGroup1(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      32 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      33 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      34 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      35 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      36 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      37 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      38 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      39 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      40 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      41 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      42 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      43 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      44 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      45 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      46 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      47 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      48 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      49 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      50 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      51 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      52 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      53 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      54 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      55 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      56 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      57 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      58 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      59 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      60 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      61 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      62 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      63 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderTextButtonGroup2(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      64 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      65 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      66 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      67 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      68 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      69 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      70 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      71 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      72 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      73 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      74 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      75 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      76 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      77 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      78 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      79 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      80 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      81 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      82 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      83 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      84 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      85 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      86 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      87 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      88 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      89 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      90 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      91 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      92 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      93 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      94 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      95 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }

  @Composable
  private fun renderTextButtonGroup3(node: ComposeNode, scope: Any?, mask: Int) {
    when (mask) {
      96 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      97 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      98 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      99 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      100 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      101 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      102 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      103 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      104 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      105 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      106 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      107 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      108 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      109 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      110 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      111 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      112 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      113 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      114 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      115 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      116 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      117 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      118 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      119 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      120 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      121 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      122 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      123 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      124 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      125 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      126 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      127 -> androidx.compose.material3.TextButton(`onClick` = { node.emit("onClick") }, `modifier` = node.modifier("modifier", scope), `enabled` = decode_enabled(node), `shape` = node.arguments().shape("shape"), `colors` = node.jsonObject("colors").decodeComposeButtonColorsValue(), `elevation` = if (node.isNull("elevation")) null else (node.jsonObject("elevation").decodeComposeButtonElevationValue()), `border` = if (node.isNull("border")) null else (node.jsonObject("border").toComposeBorderStroke()), `contentPadding` = node.jsonObject("contentPadding").toPaddingValues(), `interactionSource` = if (node.isNull("interactionSource")) null else (node.jsonObject("interactionSource").rememberComposeInteractionSource()), content = { RenderComposeChildren(node.children, this) })
      else -> error("Invalid generated arguments for " + node.name)
    }
  }
}
