// Generated from Compose declarations by generate.mjs.
package com.jetpackcomposereactnative.generated

internal fun toComposeAlignment(value: String): androidx.compose.ui.Alignment = when (value) {
  "bottomCenter" -> androidx.compose.ui.Alignment.BottomCenter
  "bottomEnd" -> androidx.compose.ui.Alignment.BottomEnd
  "bottomStart" -> androidx.compose.ui.Alignment.BottomStart
  "center" -> androidx.compose.ui.Alignment.Center
  "centerEnd" -> androidx.compose.ui.Alignment.CenterEnd
  "centerStart" -> androidx.compose.ui.Alignment.CenterStart
  "topCenter" -> androidx.compose.ui.Alignment.TopCenter
  "topEnd" -> androidx.compose.ui.Alignment.TopEnd
  "topStart" -> androidx.compose.ui.Alignment.TopStart
  else -> error("Unknown ComposeAlignment: " + value)
}

internal fun toComposeHorizontalAlignment(value: String): androidx.compose.ui.Alignment.Horizontal = when (value) {
  "centerHorizontally" -> androidx.compose.ui.Alignment.CenterHorizontally
  "end" -> androidx.compose.ui.Alignment.End
  "start" -> androidx.compose.ui.Alignment.Start
  else -> error("Unknown ComposeHorizontalAlignment: " + value)
}

internal fun toComposeVerticalAlignment(value: String): androidx.compose.ui.Alignment.Vertical = when (value) {
  "bottom" -> androidx.compose.ui.Alignment.Bottom
  "centerVertically" -> androidx.compose.ui.Alignment.CenterVertically
  "top" -> androidx.compose.ui.Alignment.Top
  else -> error("Unknown ComposeVerticalAlignment: " + value)
}

internal fun toComposeHorizontalArrangement(value: String): androidx.compose.foundation.layout.Arrangement.Horizontal = when (value) {
  "center" -> androidx.compose.foundation.layout.Arrangement.Center
  "end" -> androidx.compose.foundation.layout.Arrangement.End
  "spaceAround" -> androidx.compose.foundation.layout.Arrangement.SpaceAround
  "spaceBetween" -> androidx.compose.foundation.layout.Arrangement.SpaceBetween
  "spaceEvenly" -> androidx.compose.foundation.layout.Arrangement.SpaceEvenly
  "start" -> androidx.compose.foundation.layout.Arrangement.Start
  else -> error("Unknown ComposeHorizontalArrangement: " + value)
}

internal fun toComposeVerticalArrangement(value: String): androidx.compose.foundation.layout.Arrangement.Vertical = when (value) {
  "bottom" -> androidx.compose.foundation.layout.Arrangement.Bottom
  "center" -> androidx.compose.foundation.layout.Arrangement.Center
  "spaceAround" -> androidx.compose.foundation.layout.Arrangement.SpaceAround
  "spaceBetween" -> androidx.compose.foundation.layout.Arrangement.SpaceBetween
  "spaceEvenly" -> androidx.compose.foundation.layout.Arrangement.SpaceEvenly
  "top" -> androidx.compose.foundation.layout.Arrangement.Top
  else -> error("Unknown ComposeVerticalArrangement: " + value)
}

internal fun toComposeTextAlign(value: String): androidx.compose.ui.text.style.TextAlign = when (value) {
  "center" -> androidx.compose.ui.text.style.TextAlign.Center
  "end" -> androidx.compose.ui.text.style.TextAlign.End
  "justify" -> androidx.compose.ui.text.style.TextAlign.Justify
  "left" -> androidx.compose.ui.text.style.TextAlign.Left
  "right" -> androidx.compose.ui.text.style.TextAlign.Right
  "start" -> androidx.compose.ui.text.style.TextAlign.Start
  "unspecified" -> androidx.compose.ui.text.style.TextAlign.Unspecified
  else -> error("Unknown ComposeTextAlign: " + value)
}

internal fun toComposeTextOverflow(value: String): androidx.compose.ui.text.style.TextOverflow = when (value) {
  "clip" -> androidx.compose.ui.text.style.TextOverflow.Clip
  "ellipsis" -> androidx.compose.ui.text.style.TextOverflow.Ellipsis
  "middleEllipsis" -> androidx.compose.ui.text.style.TextOverflow.MiddleEllipsis
  "startEllipsis" -> androidx.compose.ui.text.style.TextOverflow.StartEllipsis
  "visible" -> androidx.compose.ui.text.style.TextOverflow.Visible
  else -> error("Unknown ComposeTextOverflow: " + value)
}

internal fun toComposeFontWeight(value: String): androidx.compose.ui.text.font.FontWeight = when (value) {
  "black" -> androidx.compose.ui.text.font.FontWeight.Black
  "bold" -> androidx.compose.ui.text.font.FontWeight.Bold
  "extraBold" -> androidx.compose.ui.text.font.FontWeight.ExtraBold
  "extraLight" -> androidx.compose.ui.text.font.FontWeight.ExtraLight
  "light" -> androidx.compose.ui.text.font.FontWeight.Light
  "medium" -> androidx.compose.ui.text.font.FontWeight.Medium
  "normal" -> androidx.compose.ui.text.font.FontWeight.Normal
  "semiBold" -> androidx.compose.ui.text.font.FontWeight.SemiBold
  "thin" -> androidx.compose.ui.text.font.FontWeight.Thin
  "w100" -> androidx.compose.ui.text.font.FontWeight.W100
  "w200" -> androidx.compose.ui.text.font.FontWeight.W200
  "w300" -> androidx.compose.ui.text.font.FontWeight.W300
  "w400" -> androidx.compose.ui.text.font.FontWeight.W400
  "w500" -> androidx.compose.ui.text.font.FontWeight.W500
  "w600" -> androidx.compose.ui.text.font.FontWeight.W600
  "w700" -> androidx.compose.ui.text.font.FontWeight.W700
  "w800" -> androidx.compose.ui.text.font.FontWeight.W800
  "w900" -> androidx.compose.ui.text.font.FontWeight.W900
  else -> error("Unknown ComposeFontWeight: " + value)
}

internal fun toComposeRole(value: String): androidx.compose.ui.semantics.Role = when (value) {
  "button" -> androidx.compose.ui.semantics.Role.Button
  "carousel" -> androidx.compose.ui.semantics.Role.Carousel
  "checkbox" -> androidx.compose.ui.semantics.Role.Checkbox
  "dropdownList" -> androidx.compose.ui.semantics.Role.DropdownList
  "image" -> androidx.compose.ui.semantics.Role.Image
  "radioButton" -> androidx.compose.ui.semantics.Role.RadioButton
  "switch" -> androidx.compose.ui.semantics.Role.Switch
  "tab" -> androidx.compose.ui.semantics.Role.Tab
  "valuePicker" -> androidx.compose.ui.semantics.Role.ValuePicker
  else -> error("Unknown ComposeRole: " + value)
}
