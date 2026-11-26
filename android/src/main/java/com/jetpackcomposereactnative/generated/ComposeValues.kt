// Generated from Compose declarations by generate.mjs.
package com.jetpackcomposereactnative.generated

internal fun toComposeFrameRateCategory(value: String): androidx.compose.ui.FrameRateCategory = when (value) {
  "default" -> androidx.compose.ui.FrameRateCategory.Default
  "high" -> androidx.compose.ui.FrameRateCategory.High
  "normal" -> androidx.compose.ui.FrameRateCategory.Normal
  else -> error("Unknown ComposeFrameRateCategory: " + value)
}

internal fun toComposeAutofillContentType(value: String): androidx.compose.ui.autofill.ContentType = when (value) {
  "addressAuxiliaryDetails" -> androidx.compose.ui.autofill.ContentType.AddressAuxiliaryDetails
  "addressCountry" -> androidx.compose.ui.autofill.ContentType.AddressCountry
  "addressLocality" -> androidx.compose.ui.autofill.ContentType.AddressLocality
  "addressRegion" -> androidx.compose.ui.autofill.ContentType.AddressRegion
  "addressStreet" -> androidx.compose.ui.autofill.ContentType.AddressStreet
  "birthDateDay" -> androidx.compose.ui.autofill.ContentType.BirthDateDay
  "birthDateFull" -> androidx.compose.ui.autofill.ContentType.BirthDateFull
  "birthDateMonth" -> androidx.compose.ui.autofill.ContentType.BirthDateMonth
  "birthDateYear" -> androidx.compose.ui.autofill.ContentType.BirthDateYear
  "creditCardExpirationDate" -> androidx.compose.ui.autofill.ContentType.CreditCardExpirationDate
  "creditCardExpirationDay" -> androidx.compose.ui.autofill.ContentType.CreditCardExpirationDay
  "creditCardExpirationMonth" -> androidx.compose.ui.autofill.ContentType.CreditCardExpirationMonth
  "creditCardExpirationYear" -> androidx.compose.ui.autofill.ContentType.CreditCardExpirationYear
  "creditCardNumber" -> androidx.compose.ui.autofill.ContentType.CreditCardNumber
  "creditCardSecurityCode" -> androidx.compose.ui.autofill.ContentType.CreditCardSecurityCode
  "emailAddress" -> androidx.compose.ui.autofill.ContentType.EmailAddress
  "gender" -> androidx.compose.ui.autofill.ContentType.Gender
  "newPassword" -> androidx.compose.ui.autofill.ContentType.NewPassword
  "newUsername" -> androidx.compose.ui.autofill.ContentType.NewUsername
  "password" -> androidx.compose.ui.autofill.ContentType.Password
  "personFirstName" -> androidx.compose.ui.autofill.ContentType.PersonFirstName
  "personFullName" -> androidx.compose.ui.autofill.ContentType.PersonFullName
  "personLastName" -> androidx.compose.ui.autofill.ContentType.PersonLastName
  "personMiddleInitial" -> androidx.compose.ui.autofill.ContentType.PersonMiddleInitial
  "personMiddleName" -> androidx.compose.ui.autofill.ContentType.PersonMiddleName
  "personNamePrefix" -> androidx.compose.ui.autofill.ContentType.PersonNamePrefix
  "personNameSuffix" -> androidx.compose.ui.autofill.ContentType.PersonNameSuffix
  "phoneCountryCode" -> androidx.compose.ui.autofill.ContentType.PhoneCountryCode
  "phoneNumber" -> androidx.compose.ui.autofill.ContentType.PhoneNumber
  "phoneNumberDevice" -> androidx.compose.ui.autofill.ContentType.PhoneNumberDevice
  "phoneNumberNational" -> androidx.compose.ui.autofill.ContentType.PhoneNumberNational
  "postalAddress" -> androidx.compose.ui.autofill.ContentType.PostalAddress
  "postalCode" -> androidx.compose.ui.autofill.ContentType.PostalCode
  "postalCodeExtended" -> androidx.compose.ui.autofill.ContentType.PostalCodeExtended
  "smsOtpCode" -> androidx.compose.ui.autofill.ContentType.SmsOtpCode
  "username" -> androidx.compose.ui.autofill.ContentType.Username
  else -> error("Unknown ComposeAutofillContentType: " + value)
}

internal fun toComposeSnapPosition(value: String): androidx.compose.foundation.gestures.snapping.SnapPosition = when (value) {
  "center" -> androidx.compose.foundation.gestures.snapping.SnapPosition.Center
  "end" -> androidx.compose.foundation.gestures.snapping.SnapPosition.End
  "start" -> androidx.compose.foundation.gestures.snapping.SnapPosition.Start
  else -> error("Unknown ComposeSnapPosition: " + value)
}

internal fun toComposeMenuAnchorType(value: String): androidx.compose.material3.ExposedDropdownMenuAnchorType = when (value) {
  "primaryEditable" -> androidx.compose.material3.ExposedDropdownMenuAnchorType.PrimaryEditable
  "primaryNotEditable" -> androidx.compose.material3.ExposedDropdownMenuAnchorType.PrimaryNotEditable
  "secondaryEditable" -> androidx.compose.material3.ExposedDropdownMenuAnchorType.SecondaryEditable
  else -> error("Unknown ComposeMenuAnchorType: " + value)
}

internal fun toComposeTimePickerDisplayMode(value: String): androidx.compose.material3.TimePickerDisplayMode = when (value) {
  "input" -> androidx.compose.material3.TimePickerDisplayMode.Input
  "picker" -> androidx.compose.material3.TimePickerDisplayMode.Picker
  "scroll" -> androidx.compose.material3.TimePickerDisplayMode.Scroll
  else -> error("Unknown ComposeTimePickerDisplayMode: " + value)
}

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

internal fun toComposeToggleableState(value: String): androidx.compose.ui.state.ToggleableState = when (value) {
  "indeterminate" -> androidx.compose.ui.state.ToggleableState.Indeterminate
  "off" -> androidx.compose.ui.state.ToggleableState.Off
  "on" -> androidx.compose.ui.state.ToggleableState.On
  else -> error("Unknown ComposeToggleableState: " + value)
}

internal fun toComposeOrientation(value: String): androidx.compose.foundation.gestures.Orientation = when (value) {
  "horizontal" -> androidx.compose.foundation.gestures.Orientation.Horizontal
  "vertical" -> androidx.compose.foundation.gestures.Orientation.Vertical
  else -> error("Unknown ComposeOrientation: " + value)
}

internal fun toComposeIntrinsicSize(value: String): androidx.compose.foundation.layout.IntrinsicSize = when (value) {
  "max" -> androidx.compose.foundation.layout.IntrinsicSize.Max
  "min" -> androidx.compose.foundation.layout.IntrinsicSize.Min
  else -> error("Unknown ComposeIntrinsicSize: " + value)
}

internal fun toComposeContentScale(value: String): androidx.compose.ui.layout.ContentScale = when (value) {
  "crop" -> androidx.compose.ui.layout.ContentScale.Crop
  "fillBounds" -> androidx.compose.ui.layout.ContentScale.FillBounds
  "fillHeight" -> androidx.compose.ui.layout.ContentScale.FillHeight
  "fillWidth" -> androidx.compose.ui.layout.ContentScale.FillWidth
  "fit" -> androidx.compose.ui.layout.ContentScale.Fit
  "inside" -> androidx.compose.ui.layout.ContentScale.Inside
  "none" -> androidx.compose.ui.layout.ContentScale.None
  else -> error("Unknown ComposeContentScale: " + value)
}

internal fun toComposePointerIcon(value: String): androidx.compose.ui.input.pointer.PointerIcon = when (value) {
  "crosshair" -> androidx.compose.ui.input.pointer.PointerIcon.Crosshair
  "default" -> androidx.compose.ui.input.pointer.PointerIcon.Default
  "hand" -> androidx.compose.ui.input.pointer.PointerIcon.Hand
  "text" -> androidx.compose.ui.input.pointer.PointerIcon.Text
  else -> error("Unknown ComposePointerIcon: " + value)
}

internal fun toComposeDisplayMode(value: String): androidx.compose.material3.DisplayMode = when (value) {
  "input" -> androidx.compose.material3.DisplayMode.Input
  "picker" -> androidx.compose.material3.DisplayMode.Picker
  else -> error("Unknown ComposeDisplayMode: " + value)
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

@OptIn(androidx.compose.material3.ExperimentalMaterial3ExpressiveApi::class)
internal fun toComposeMaterialShape(value: String): androidx.graphics.shapes.RoundedPolygon = when (value) {
  "arch" -> androidx.compose.material3.MaterialShapes.Arch
  "arrow" -> androidx.compose.material3.MaterialShapes.Arrow
  "boom" -> androidx.compose.material3.MaterialShapes.Boom
  "bun" -> androidx.compose.material3.MaterialShapes.Bun
  "burst" -> androidx.compose.material3.MaterialShapes.Burst
  "circle" -> androidx.compose.material3.MaterialShapes.Circle
  "clamShell" -> androidx.compose.material3.MaterialShapes.ClamShell
  "clover4Leaf" -> androidx.compose.material3.MaterialShapes.Clover4Leaf
  "clover8Leaf" -> androidx.compose.material3.MaterialShapes.Clover8Leaf
  "cookie12Sided" -> androidx.compose.material3.MaterialShapes.Cookie12Sided
  "cookie4Sided" -> androidx.compose.material3.MaterialShapes.Cookie4Sided
  "cookie6Sided" -> androidx.compose.material3.MaterialShapes.Cookie6Sided
  "cookie7Sided" -> androidx.compose.material3.MaterialShapes.Cookie7Sided
  "cookie9Sided" -> androidx.compose.material3.MaterialShapes.Cookie9Sided
  "diamond" -> androidx.compose.material3.MaterialShapes.Diamond
  "fan" -> androidx.compose.material3.MaterialShapes.Fan
  "flower" -> androidx.compose.material3.MaterialShapes.Flower
  "gem" -> androidx.compose.material3.MaterialShapes.Gem
  "ghostish" -> androidx.compose.material3.MaterialShapes.Ghostish
  "heart" -> androidx.compose.material3.MaterialShapes.Heart
  "oval" -> androidx.compose.material3.MaterialShapes.Oval
  "pentagon" -> androidx.compose.material3.MaterialShapes.Pentagon
  "pill" -> androidx.compose.material3.MaterialShapes.Pill
  "pixelCircle" -> androidx.compose.material3.MaterialShapes.PixelCircle
  "pixelTriangle" -> androidx.compose.material3.MaterialShapes.PixelTriangle
  "puffy" -> androidx.compose.material3.MaterialShapes.Puffy
  "puffyDiamond" -> androidx.compose.material3.MaterialShapes.PuffyDiamond
  "semiCircle" -> androidx.compose.material3.MaterialShapes.SemiCircle
  "slanted" -> androidx.compose.material3.MaterialShapes.Slanted
  "softBoom" -> androidx.compose.material3.MaterialShapes.SoftBoom
  "softBurst" -> androidx.compose.material3.MaterialShapes.SoftBurst
  "square" -> androidx.compose.material3.MaterialShapes.Square
  "sunny" -> androidx.compose.material3.MaterialShapes.Sunny
  "triangle" -> androidx.compose.material3.MaterialShapes.Triangle
  "verySunny" -> androidx.compose.material3.MaterialShapes.VerySunny
  else -> error("Unknown ComposeMaterialShape: " + value)
}

internal fun toComposeSharedTransitionScopePlaceholderSizeValue(value: String): androidx.compose.animation.SharedTransitionScope.PlaceholderSize = when (value) {
  "animatedSize" -> androidx.compose.animation.SharedTransitionScope.PlaceholderSize.`AnimatedSize`
  "contentSize" -> androidx.compose.animation.SharedTransitionScope.PlaceholderSize.`ContentSize`
  else -> error("Unknown ComposeSharedTransitionScopePlaceholderSizeValue: " + value)
}

internal fun toComposeSharedTransitionScopeResizeModeValue(value: String): androidx.compose.animation.SharedTransitionScope.ResizeMode = when (value) {
  "remeasureToBounds" -> androidx.compose.animation.SharedTransitionScope.ResizeMode.`RemeasureToBounds`
  else -> error("Unknown ComposeSharedTransitionScopeResizeModeValue: " + value)
}

internal fun toComposeMarqueeAnimationModeValue(value: String): androidx.compose.foundation.MarqueeAnimationMode = when (value) {
  "immediately" -> androidx.compose.foundation.MarqueeAnimationMode.`Immediately`
  "whileFocused" -> androidx.compose.foundation.MarqueeAnimationMode.`WhileFocused`
  else -> error("Unknown ComposeMarqueeAnimationModeValue: " + value)
}

@OptIn(androidx.compose.foundation.style.ExperimentalFoundationStyleApi::class)
internal fun toComposeBreadthValue(value: String): androidx.compose.foundation.style.Breadth = when (value) {
  "none" -> androidx.compose.foundation.style.Breadth.`None`
  else -> error("Unknown ComposeBreadthValue: " + value)
}

@OptIn(androidx.compose.foundation.style.ExperimentalFoundationStyleApi::class)
internal fun toComposeFillValue(value: String): androidx.compose.foundation.style.Fill = when (value) {
  "none" -> androidx.compose.foundation.style.Fill.`None`
  else -> error("Unknown ComposeFillValue: " + value)
}

@OptIn(androidx.compose.foundation.style.ExperimentalFoundationStyleApi::class)
internal fun toComposeShadowsValue(value: String): androidx.compose.foundation.style.Shadows = when (value) {
  "none" -> androidx.compose.foundation.style.Shadows.`None`
  else -> error("Unknown ComposeShadowsValue: " + value)
}

internal fun toComposeTextObfuscationModeValue(value: String): androidx.compose.foundation.text.input.TextObfuscationMode = when (value) {
  "hidden" -> androidx.compose.foundation.text.input.TextObfuscationMode.`Hidden`
  "revealLastTyped" -> androidx.compose.foundation.text.input.TextObfuscationMode.`RevealLastTyped`
  "system" -> androidx.compose.foundation.text.input.TextObfuscationMode.`System`
  "visible" -> androidx.compose.foundation.text.input.TextObfuscationMode.`Visible`
  else -> error("Unknown ComposeTextObfuscationModeValue: " + value)
}

internal fun toComposeFabPositionValue(value: String): androidx.compose.material3.FabPosition = when (value) {
  "center" -> androidx.compose.material3.FabPosition.`Center`
  "end" -> androidx.compose.material3.FabPosition.`End`
  "endOverlay" -> androidx.compose.material3.FabPosition.`EndOverlay`
  "start" -> androidx.compose.material3.FabPosition.`Start`
  else -> error("Unknown ComposeFabPositionValue: " + value)
}

internal fun toComposeFloatingToolbarExitDirectionValue(value: String): androidx.compose.material3.FloatingToolbarExitDirection = when (value) {
  "bottom" -> androidx.compose.material3.FloatingToolbarExitDirection.`Bottom`
  "end" -> androidx.compose.material3.FloatingToolbarExitDirection.`End`
  "start" -> androidx.compose.material3.FloatingToolbarExitDirection.`Start`
  "top" -> androidx.compose.material3.FloatingToolbarExitDirection.`Top`
  else -> error("Unknown ComposeFloatingToolbarExitDirectionValue: " + value)
}

internal fun toComposeFloatingToolbarHorizontalFabPositionValue(value: String): androidx.compose.material3.FloatingToolbarHorizontalFabPosition = when (value) {
  "end" -> androidx.compose.material3.FloatingToolbarHorizontalFabPosition.`End`
  "start" -> androidx.compose.material3.FloatingToolbarHorizontalFabPosition.`Start`
  else -> error("Unknown ComposeFloatingToolbarHorizontalFabPositionValue: " + value)
}

internal fun toComposeFloatingToolbarVerticalFabPositionValue(value: String): androidx.compose.material3.FloatingToolbarVerticalFabPosition = when (value) {
  "bottom" -> androidx.compose.material3.FloatingToolbarVerticalFabPosition.`Bottom`
  "top" -> androidx.compose.material3.FloatingToolbarVerticalFabPosition.`Top`
  else -> error("Unknown ComposeFloatingToolbarVerticalFabPositionValue: " + value)
}

internal fun toComposeMenuAnchorPositionValue(value: String): androidx.compose.material3.MenuAnchorPosition = when (value) {
  "above" -> androidx.compose.material3.MenuAnchorPosition.`Above`
  "below" -> androidx.compose.material3.MenuAnchorPosition.`Below`
  "end" -> androidx.compose.material3.MenuAnchorPosition.`End`
  "left" -> androidx.compose.material3.MenuAnchorPosition.`Left`
  "right" -> androidx.compose.material3.MenuAnchorPosition.`Right`
  "start" -> androidx.compose.material3.MenuAnchorPosition.`Start`
  else -> error("Unknown ComposeMenuAnchorPositionValue: " + value)
}

internal fun toComposeNavigationItemIconPositionValue(value: String): androidx.compose.material3.NavigationItemIconPosition = when (value) {
  "start" -> androidx.compose.material3.NavigationItemIconPosition.`Start`
  "top" -> androidx.compose.material3.NavigationItemIconPosition.`Top`
  else -> error("Unknown ComposeNavigationItemIconPositionValue: " + value)
}

internal fun toComposeShortNavigationBarArrangementValue(value: String): androidx.compose.material3.ShortNavigationBarArrangement = when (value) {
  "centered" -> androidx.compose.material3.ShortNavigationBarArrangement.`Centered`
  "equalWeight" -> androidx.compose.material3.ShortNavigationBarArrangement.`EqualWeight`
  else -> error("Unknown ComposeShortNavigationBarArrangementValue: " + value)
}

internal fun toComposeSwipeToDismissBoxValueOption(value: String): androidx.compose.material3.SwipeToDismissBoxValue = when (value) {
  "endToStart" -> androidx.compose.material3.SwipeToDismissBoxValue.`EndToStart`
  "settled" -> androidx.compose.material3.SwipeToDismissBoxValue.`Settled`
  "startToEnd" -> androidx.compose.material3.SwipeToDismissBoxValue.`StartToEnd`
  else -> error("Unknown ComposeSwipeToDismissBoxValueOption: " + value)
}

internal fun toComposeTimePickerLayoutTypeValue(value: String): androidx.compose.material3.TimePickerLayoutType = when (value) {
  "horizontal" -> androidx.compose.material3.TimePickerLayoutType.`Horizontal`
  "vertical" -> androidx.compose.material3.TimePickerLayoutType.`Vertical`
  else -> error("Unknown ComposeTimePickerLayoutTypeValue: " + value)
}

internal fun toComposeToggleButtonSizeValue(value: String): androidx.compose.material3.ToggleButtonSize = when (value) {
  "extraLarge" -> androidx.compose.material3.ToggleButtonSize.`ExtraLarge`
  "extraSmall" -> androidx.compose.material3.ToggleButtonSize.`ExtraSmall`
  "large" -> androidx.compose.material3.ToggleButtonSize.`Large`
  "medium" -> androidx.compose.material3.ToggleButtonSize.`Medium`
  "small" -> androidx.compose.material3.ToggleButtonSize.`Small`
  else -> error("Unknown ComposeToggleButtonSizeValue: " + value)
}

internal fun toComposeBlurredEdgeTreatmentValue(value: String): androidx.compose.ui.draw.BlurredEdgeTreatment = when (value) {
  "rectangle" -> androidx.compose.ui.draw.BlurredEdgeTreatment.`Rectangle`
  "unbounded" -> androidx.compose.ui.draw.BlurredEdgeTreatment.`Unbounded`
  else -> error("Unknown ComposeBlurredEdgeTreatmentValue: " + value)
}

internal fun toComposeBlendModeValue(value: String): androidx.compose.ui.graphics.BlendMode = when (value) {
  "clear" -> androidx.compose.ui.graphics.BlendMode.`Clear`
  "color" -> androidx.compose.ui.graphics.BlendMode.`Color`
  "colorBurn" -> androidx.compose.ui.graphics.BlendMode.`ColorBurn`
  "colorDodge" -> androidx.compose.ui.graphics.BlendMode.`ColorDodge`
  "darken" -> androidx.compose.ui.graphics.BlendMode.`Darken`
  "difference" -> androidx.compose.ui.graphics.BlendMode.`Difference`
  "dst" -> androidx.compose.ui.graphics.BlendMode.`Dst`
  "dstAtop" -> androidx.compose.ui.graphics.BlendMode.`DstAtop`
  "dstIn" -> androidx.compose.ui.graphics.BlendMode.`DstIn`
  "dstOut" -> androidx.compose.ui.graphics.BlendMode.`DstOut`
  "dstOver" -> androidx.compose.ui.graphics.BlendMode.`DstOver`
  "exclusion" -> androidx.compose.ui.graphics.BlendMode.`Exclusion`
  "hardlight" -> androidx.compose.ui.graphics.BlendMode.`Hardlight`
  "hue" -> androidx.compose.ui.graphics.BlendMode.`Hue`
  "lighten" -> androidx.compose.ui.graphics.BlendMode.`Lighten`
  "luminosity" -> androidx.compose.ui.graphics.BlendMode.`Luminosity`
  "modulate" -> androidx.compose.ui.graphics.BlendMode.`Modulate`
  "multiply" -> androidx.compose.ui.graphics.BlendMode.`Multiply`
  "overlay" -> androidx.compose.ui.graphics.BlendMode.`Overlay`
  "plus" -> androidx.compose.ui.graphics.BlendMode.`Plus`
  "saturation" -> androidx.compose.ui.graphics.BlendMode.`Saturation`
  "screen" -> androidx.compose.ui.graphics.BlendMode.`Screen`
  "softlight" -> androidx.compose.ui.graphics.BlendMode.`Softlight`
  "src" -> androidx.compose.ui.graphics.BlendMode.`Src`
  "srcAtop" -> androidx.compose.ui.graphics.BlendMode.`SrcAtop`
  "srcIn" -> androidx.compose.ui.graphics.BlendMode.`SrcIn`
  "srcOut" -> androidx.compose.ui.graphics.BlendMode.`SrcOut`
  "srcOver" -> androidx.compose.ui.graphics.BlendMode.`SrcOver`
  "xor" -> androidx.compose.ui.graphics.BlendMode.`Xor`
  else -> error("Unknown ComposeBlendModeValue: " + value)
}

internal fun toComposeCompositingStrategyValue(value: String): androidx.compose.ui.graphics.CompositingStrategy = when (value) {
  "auto" -> androidx.compose.ui.graphics.CompositingStrategy.`Auto`
  "modulateAlpha" -> androidx.compose.ui.graphics.CompositingStrategy.`ModulateAlpha`
  "offscreen" -> androidx.compose.ui.graphics.CompositingStrategy.`Offscreen`
  else -> error("Unknown ComposeCompositingStrategyValue: " + value)
}

internal fun toComposeFilterQualityValue(value: String): androidx.compose.ui.graphics.FilterQuality = when (value) {
  "high" -> androidx.compose.ui.graphics.FilterQuality.`High`
  "low" -> androidx.compose.ui.graphics.FilterQuality.`Low`
  "medium" -> androidx.compose.ui.graphics.FilterQuality.`Medium`
  "none" -> androidx.compose.ui.graphics.FilterQuality.`None`
  else -> error("Unknown ComposeFilterQualityValue: " + value)
}

internal fun toComposeImageBitmapConfigValue(value: String): androidx.compose.ui.graphics.ImageBitmapConfig = when (value) {
  "alpha8" -> androidx.compose.ui.graphics.ImageBitmapConfig.`Alpha8`
  "argb8888" -> androidx.compose.ui.graphics.ImageBitmapConfig.`Argb8888`
  "f16" -> androidx.compose.ui.graphics.ImageBitmapConfig.`F16`
  "gpu" -> androidx.compose.ui.graphics.ImageBitmapConfig.`Gpu`
  "rgb565" -> androidx.compose.ui.graphics.ImageBitmapConfig.`Rgb565`
  else -> error("Unknown ComposeImageBitmapConfigValue: " + value)
}

internal fun toComposeStrokeCapValue(value: String): androidx.compose.ui.graphics.StrokeCap = when (value) {
  "butt" -> androidx.compose.ui.graphics.StrokeCap.`Butt`
  "round" -> androidx.compose.ui.graphics.StrokeCap.`Round`
  "square" -> androidx.compose.ui.graphics.StrokeCap.`Square`
  else -> error("Unknown ComposeStrokeCapValue: " + value)
}

internal fun toComposeStrokeJoinValue(value: String): androidx.compose.ui.graphics.StrokeJoin = when (value) {
  "bevel" -> androidx.compose.ui.graphics.StrokeJoin.`Bevel`
  "miter" -> androidx.compose.ui.graphics.StrokeJoin.`Miter`
  "round" -> androidx.compose.ui.graphics.StrokeJoin.`Round`
  else -> error("Unknown ComposeStrokeJoinValue: " + value)
}

internal fun toComposeTileModeValue(value: String): androidx.compose.ui.graphics.TileMode = when (value) {
  "clamp" -> androidx.compose.ui.graphics.TileMode.`Clamp`
  "decal" -> androidx.compose.ui.graphics.TileMode.`Decal`
  "mirror" -> androidx.compose.ui.graphics.TileMode.`Mirror`
  "repeated" -> androidx.compose.ui.graphics.TileMode.`Repeated`
  else -> error("Unknown ComposeTileModeValue: " + value)
}

internal fun toComposePlatformParagraphStyleValue(value: String): androidx.compose.ui.text.PlatformParagraphStyle = when (value) {
  "default" -> androidx.compose.ui.text.PlatformParagraphStyle.`Default`
  else -> error("Unknown ComposePlatformParagraphStyleValue: " + value)
}

internal fun toComposePlatformSpanStyleValue(value: String): androidx.compose.ui.text.PlatformSpanStyle = when (value) {
  "default" -> androidx.compose.ui.text.PlatformSpanStyle.`Default`
  else -> error("Unknown ComposePlatformSpanStyleValue: " + value)
}

internal fun toComposeFontStyleValue(value: String): androidx.compose.ui.text.font.FontStyle = when (value) {
  "italic" -> androidx.compose.ui.text.font.FontStyle.`Italic`
  "normal" -> androidx.compose.ui.text.font.FontStyle.`Normal`
  else -> error("Unknown ComposeFontStyleValue: " + value)
}

internal fun toComposeFontSynthesisValue(value: String): androidx.compose.ui.text.font.FontSynthesis = when (value) {
  "all" -> androidx.compose.ui.text.font.FontSynthesis.`All`
  "none" -> androidx.compose.ui.text.font.FontSynthesis.`None`
  "style" -> androidx.compose.ui.text.font.FontSynthesis.`Style`
  "weight" -> androidx.compose.ui.text.font.FontSynthesis.`Weight`
  else -> error("Unknown ComposeFontSynthesisValue: " + value)
}

internal fun toComposeLocaleListValue(value: String): androidx.compose.ui.text.intl.LocaleList = when (value) {
  "empty" -> androidx.compose.ui.text.intl.LocaleList.`Empty`
  else -> error("Unknown ComposeLocaleListValue: " + value)
}

internal fun toComposeHyphensValue(value: String): androidx.compose.ui.text.style.Hyphens = when (value) {
  "auto" -> androidx.compose.ui.text.style.Hyphens.`Auto`
  "none" -> androidx.compose.ui.text.style.Hyphens.`None`
  "unspecified" -> androidx.compose.ui.text.style.Hyphens.`Unspecified`
  else -> error("Unknown ComposeHyphensValue: " + value)
}

internal fun toComposeLineBreakValue(value: String): androidx.compose.ui.text.style.LineBreak = when (value) {
  "heading" -> androidx.compose.ui.text.style.LineBreak.`Heading`
  "paragraph" -> androidx.compose.ui.text.style.LineBreak.`Paragraph`
  "simple" -> androidx.compose.ui.text.style.LineBreak.`Simple`
  "unspecified" -> androidx.compose.ui.text.style.LineBreak.`Unspecified`
  else -> error("Unknown ComposeLineBreakValue: " + value)
}

internal fun toComposeLineHeightStyleModeValue(value: String): androidx.compose.ui.text.style.LineHeightStyle.Mode = when (value) {
  "fixed" -> androidx.compose.ui.text.style.LineHeightStyle.Mode.`Fixed`
  "minimum" -> androidx.compose.ui.text.style.LineHeightStyle.Mode.`Minimum`
  "perLine" -> androidx.compose.ui.text.style.LineHeightStyle.Mode.`PerLine`
  "tight" -> androidx.compose.ui.text.style.LineHeightStyle.Mode.`Tight`
  else -> error("Unknown ComposeLineHeightStyleModeValue: " + value)
}

internal fun toComposeLineHeightStyleTrimValue(value: String): androidx.compose.ui.text.style.LineHeightStyle.Trim = when (value) {
  "both" -> androidx.compose.ui.text.style.LineHeightStyle.Trim.`Both`
  "firstLineTop" -> androidx.compose.ui.text.style.LineHeightStyle.Trim.`FirstLineTop`
  "lastLineBottom" -> androidx.compose.ui.text.style.LineHeightStyle.Trim.`LastLineBottom`
  "none" -> androidx.compose.ui.text.style.LineHeightStyle.Trim.`None`
  else -> error("Unknown ComposeLineHeightStyleTrimValue: " + value)
}

internal fun toComposeTextDecorationValue(value: String): androidx.compose.ui.text.style.TextDecoration = when (value) {
  "lineThrough" -> androidx.compose.ui.text.style.TextDecoration.`LineThrough`
  "none" -> androidx.compose.ui.text.style.TextDecoration.`None`
  "underline" -> androidx.compose.ui.text.style.TextDecoration.`Underline`
  else -> error("Unknown ComposeTextDecorationValue: " + value)
}

internal fun toComposeTextDirectionValue(value: String): androidx.compose.ui.text.style.TextDirection = when (value) {
  "content" -> androidx.compose.ui.text.style.TextDirection.`Content`
  "contentOrLtr" -> androidx.compose.ui.text.style.TextDirection.`ContentOrLtr`
  "contentOrRtl" -> androidx.compose.ui.text.style.TextDirection.`ContentOrRtl`
  "ltr" -> androidx.compose.ui.text.style.TextDirection.`Ltr`
  "rtl" -> androidx.compose.ui.text.style.TextDirection.`Rtl`
  "unspecified" -> androidx.compose.ui.text.style.TextDirection.`Unspecified`
  else -> error("Unknown ComposeTextDirectionValue: " + value)
}

internal fun toComposeTextMotionValue(value: String): androidx.compose.ui.text.style.TextMotion = when (value) {
  "animated" -> androidx.compose.ui.text.style.TextMotion.`Animated`
  "static" -> androidx.compose.ui.text.style.TextMotion.`Static`
  else -> error("Unknown ComposeTextMotionValue: " + value)
}
