// Generated from Compose value factories by generate.mjs.
package com.jetpackcomposereactnative.generated

import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jetpackcomposereactnative.common.parseComposeColor
import org.json.JSONObject

internal fun JSONObject.decodeComposeMarqueeSpacingValue(): androidx.compose.foundation.MarqueeSpacing = androidx.compose.foundation.MarqueeSpacing(
  `spacing` = getDouble("spacing").dp,
)

internal fun JSONObject.decodeComposeTextSelectionColorsValue(): androidx.compose.foundation.text.selection.TextSelectionColors = androidx.compose.foundation.text.selection.TextSelectionColors(
  `handleColor` = parseComposeColor(getString("handleColor")),
  `backgroundColor` = parseComposeColor(getString("backgroundColor")),
)

internal fun JSONObject.decodeComposeButtonColorsValue(): androidx.compose.material3.ButtonColors = androidx.compose.material3.ButtonColors(
  `containerColor` = parseComposeColor(getString("containerColor")),
  `contentColor` = parseComposeColor(getString("contentColor")),
  `disabledContainerColor` = parseComposeColor(getString("disabledContainerColor")),
  `disabledContentColor` = parseComposeColor(getString("disabledContentColor")),
)

internal fun JSONObject.decodeComposeCardColorsValue(): androidx.compose.material3.CardColors = androidx.compose.material3.CardColors(
  `containerColor` = parseComposeColor(getString("containerColor")),
  `contentColor` = parseComposeColor(getString("contentColor")),
  `disabledContainerColor` = parseComposeColor(getString("disabledContainerColor")),
  `disabledContentColor` = parseComposeColor(getString("disabledContentColor")),
)

internal fun JSONObject.decodeComposeCheckboxColorsValue(): androidx.compose.material3.CheckboxColors = androidx.compose.material3.CheckboxColors(
  `checkedCheckmarkColor` = parseComposeColor(getString("checkedCheckmarkColor")),
  `uncheckedCheckmarkColor` = parseComposeColor(getString("uncheckedCheckmarkColor")),
  `checkedBoxColor` = parseComposeColor(getString("checkedBoxColor")),
  `uncheckedBoxColor` = parseComposeColor(getString("uncheckedBoxColor")),
  `disabledCheckedBoxColor` = parseComposeColor(getString("disabledCheckedBoxColor")),
  `disabledUncheckedBoxColor` = parseComposeColor(getString("disabledUncheckedBoxColor")),
  `disabledIndeterminateBoxColor` = parseComposeColor(getString("disabledIndeterminateBoxColor")),
  `checkedBorderColor` = parseComposeColor(getString("checkedBorderColor")),
  `uncheckedBorderColor` = parseComposeColor(getString("uncheckedBorderColor")),
  `disabledBorderColor` = parseComposeColor(getString("disabledBorderColor")),
  `disabledUncheckedBorderColor` = parseComposeColor(getString("disabledUncheckedBorderColor")),
  `disabledIndeterminateBorderColor` = parseComposeColor(getString("disabledIndeterminateBorderColor")),
)

internal fun JSONObject.decodeComposeChipColorsValue(): androidx.compose.material3.ChipColors = androidx.compose.material3.ChipColors(
  `containerColor` = parseComposeColor(getString("containerColor")),
  `labelColor` = parseComposeColor(getString("labelColor")),
  `leadingIconContentColor` = parseComposeColor(getString("leadingIconContentColor")),
  `trailingIconContentColor` = parseComposeColor(getString("trailingIconContentColor")),
  `disabledContainerColor` = parseComposeColor(getString("disabledContainerColor")),
  `disabledLabelColor` = parseComposeColor(getString("disabledLabelColor")),
  `disabledLeadingIconContentColor` = parseComposeColor(getString("disabledLeadingIconContentColor")),
  `disabledTrailingIconContentColor` = parseComposeColor(getString("disabledTrailingIconContentColor")),
)

internal fun JSONObject.decodeComposeChipElevationValue(): androidx.compose.material3.ChipElevation = androidx.compose.material3.ChipElevation(
  `elevation` = getDouble("elevation").dp,
  `pressedElevation` = getDouble("pressedElevation").dp,
  `focusedElevation` = getDouble("focusedElevation").dp,
  `hoveredElevation` = getDouble("hoveredElevation").dp,
  `draggedElevation` = getDouble("draggedElevation").dp,
  `disabledElevation` = getDouble("disabledElevation").dp,
)

internal fun JSONObject.decodeComposeDragHandleColorsValue(): androidx.compose.material3.DragHandleColors = androidx.compose.material3.DragHandleColors(
  `color` = parseComposeColor(getString("color")),
  `pressedColor` = parseComposeColor(getString("pressedColor")),
  `draggedColor` = parseComposeColor(getString("draggedColor")),
)

internal fun JSONObject.decodeComposeIconButtonColorsValue(): androidx.compose.material3.IconButtonColors = androidx.compose.material3.IconButtonColors(
  `containerColor` = parseComposeColor(getString("containerColor")),
  `contentColor` = parseComposeColor(getString("contentColor")),
  `disabledContainerColor` = parseComposeColor(getString("disabledContainerColor")),
  `disabledContentColor` = parseComposeColor(getString("disabledContentColor")),
)

internal fun JSONObject.decodeComposeIconToggleButtonColorsValue(): androidx.compose.material3.IconToggleButtonColors = androidx.compose.material3.IconToggleButtonColors(
  `containerColor` = parseComposeColor(getString("containerColor")),
  `contentColor` = parseComposeColor(getString("contentColor")),
  `disabledContainerColor` = parseComposeColor(getString("disabledContainerColor")),
  `disabledContentColor` = parseComposeColor(getString("disabledContentColor")),
  `checkedContainerColor` = parseComposeColor(getString("checkedContainerColor")),
  `checkedContentColor` = parseComposeColor(getString("checkedContentColor")),
)

internal fun JSONObject.decodeComposeListItemColorsValue(): androidx.compose.material3.ListItemColors = androidx.compose.material3.ListItemColors(
  `containerColor` = parseComposeColor(getString("containerColor")),
  `headlineColor` = parseComposeColor(getString("headlineColor")),
  `leadingIconColor` = parseComposeColor(getString("leadingIconColor")),
  `overlineColor` = parseComposeColor(getString("overlineColor")),
  `supportingTextColor` = parseComposeColor(getString("supportingTextColor")),
  `trailingIconColor` = parseComposeColor(getString("trailingIconColor")),
  `disabledHeadlineColor` = parseComposeColor(getString("disabledHeadlineColor")),
  `disabledLeadingIconColor` = parseComposeColor(getString("disabledLeadingIconColor")),
  `disabledTrailingIconColor` = parseComposeColor(getString("disabledTrailingIconColor")),
)

internal fun JSONObject.decodeComposeMenuItemColorsValue(): androidx.compose.material3.MenuItemColors = androidx.compose.material3.MenuItemColors(
  `textColor` = parseComposeColor(getString("textColor")),
  `leadingIconColor` = parseComposeColor(getString("leadingIconColor")),
  `trailingIconColor` = parseComposeColor(getString("trailingIconColor")),
  `disabledTextColor` = parseComposeColor(getString("disabledTextColor")),
  `disabledLeadingIconColor` = parseComposeColor(getString("disabledLeadingIconColor")),
  `disabledTrailingIconColor` = parseComposeColor(getString("disabledTrailingIconColor")),
)

internal fun JSONObject.decodeComposeNavigationBarItemColorsValue(): androidx.compose.material3.NavigationBarItemColors = androidx.compose.material3.NavigationBarItemColors(
  `selectedIconColor` = parseComposeColor(getString("selectedIconColor")),
  `selectedTextColor` = parseComposeColor(getString("selectedTextColor")),
  `selectedIndicatorColor` = parseComposeColor(getString("selectedIndicatorColor")),
  `unselectedIconColor` = parseComposeColor(getString("unselectedIconColor")),
  `unselectedTextColor` = parseComposeColor(getString("unselectedTextColor")),
  `disabledIconColor` = parseComposeColor(getString("disabledIconColor")),
  `disabledTextColor` = parseComposeColor(getString("disabledTextColor")),
)

internal fun JSONObject.decodeComposeNavigationItemColorsValue(): androidx.compose.material3.NavigationItemColors = androidx.compose.material3.NavigationItemColors(
  `selectedIconColor` = parseComposeColor(getString("selectedIconColor")),
  `selectedTextColor` = parseComposeColor(getString("selectedTextColor")),
  `selectedIndicatorColor` = parseComposeColor(getString("selectedIndicatorColor")),
  `unselectedIconColor` = parseComposeColor(getString("unselectedIconColor")),
  `unselectedTextColor` = parseComposeColor(getString("unselectedTextColor")),
  `disabledIconColor` = parseComposeColor(getString("disabledIconColor")),
  `disabledTextColor` = parseComposeColor(getString("disabledTextColor")),
)

internal fun JSONObject.decodeComposeNavigationRailItemColorsValue(): androidx.compose.material3.NavigationRailItemColors = androidx.compose.material3.NavigationRailItemColors(
  `selectedIconColor` = parseComposeColor(getString("selectedIconColor")),
  `selectedTextColor` = parseComposeColor(getString("selectedTextColor")),
  `selectedIndicatorColor` = parseComposeColor(getString("selectedIndicatorColor")),
  `unselectedIconColor` = parseComposeColor(getString("unselectedIconColor")),
  `unselectedTextColor` = parseComposeColor(getString("unselectedTextColor")),
  `disabledIconColor` = parseComposeColor(getString("disabledIconColor")),
  `disabledTextColor` = parseComposeColor(getString("disabledTextColor")),
)

internal fun JSONObject.decodeComposeRadioButtonColorsValue(): androidx.compose.material3.RadioButtonColors = androidx.compose.material3.RadioButtonColors(
  `selectedColor` = parseComposeColor(getString("selectedColor")),
  `unselectedColor` = parseComposeColor(getString("unselectedColor")),
  `disabledSelectedColor` = parseComposeColor(getString("disabledSelectedColor")),
  `disabledUnselectedColor` = parseComposeColor(getString("disabledUnselectedColor")),
)

internal fun JSONObject.decodeComposeSegmentedButtonColorsValue(): androidx.compose.material3.SegmentedButtonColors = androidx.compose.material3.SegmentedButtonColors(
  `activeContainerColor` = parseComposeColor(getString("activeContainerColor")),
  `activeContentColor` = parseComposeColor(getString("activeContentColor")),
  `activeBorderColor` = parseComposeColor(getString("activeBorderColor")),
  `inactiveContainerColor` = parseComposeColor(getString("inactiveContainerColor")),
  `inactiveContentColor` = parseComposeColor(getString("inactiveContentColor")),
  `inactiveBorderColor` = parseComposeColor(getString("inactiveBorderColor")),
  `disabledActiveContainerColor` = parseComposeColor(getString("disabledActiveContainerColor")),
  `disabledActiveContentColor` = parseComposeColor(getString("disabledActiveContentColor")),
  `disabledActiveBorderColor` = parseComposeColor(getString("disabledActiveBorderColor")),
  `disabledInactiveContainerColor` = parseComposeColor(getString("disabledInactiveContainerColor")),
  `disabledInactiveContentColor` = parseComposeColor(getString("disabledInactiveContentColor")),
  `disabledInactiveBorderColor` = parseComposeColor(getString("disabledInactiveBorderColor")),
)

internal fun JSONObject.decodeComposeSelectableChipElevationValue(): androidx.compose.material3.SelectableChipElevation = androidx.compose.material3.SelectableChipElevation(
  `elevation` = getDouble("elevation").dp,
  `pressedElevation` = getDouble("pressedElevation").dp,
  `focusedElevation` = getDouble("focusedElevation").dp,
  `hoveredElevation` = getDouble("hoveredElevation").dp,
  `draggedElevation` = getDouble("draggedElevation").dp,
  `disabledElevation` = getDouble("disabledElevation").dp,
)

internal fun JSONObject.decodeComposeSliderColorsValue(): androidx.compose.material3.SliderColors = androidx.compose.material3.SliderColors(
  `thumbColor` = parseComposeColor(getString("thumbColor")),
  `activeTrackColor` = parseComposeColor(getString("activeTrackColor")),
  `activeTickColor` = parseComposeColor(getString("activeTickColor")),
  `inactiveTrackColor` = parseComposeColor(getString("inactiveTrackColor")),
  `inactiveTickColor` = parseComposeColor(getString("inactiveTickColor")),
  `disabledThumbColor` = parseComposeColor(getString("disabledThumbColor")),
  `disabledActiveTrackColor` = parseComposeColor(getString("disabledActiveTrackColor")),
  `disabledActiveTickColor` = parseComposeColor(getString("disabledActiveTickColor")),
  `disabledInactiveTrackColor` = parseComposeColor(getString("disabledInactiveTrackColor")),
  `disabledInactiveTickColor` = parseComposeColor(getString("disabledInactiveTickColor")),
)

internal fun JSONObject.decodeComposeSwitchColorsValue(): androidx.compose.material3.SwitchColors = androidx.compose.material3.SwitchColors(
  `checkedThumbColor` = parseComposeColor(getString("checkedThumbColor")),
  `checkedTrackColor` = parseComposeColor(getString("checkedTrackColor")),
  `checkedBorderColor` = parseComposeColor(getString("checkedBorderColor")),
  `checkedIconColor` = parseComposeColor(getString("checkedIconColor")),
  `uncheckedThumbColor` = parseComposeColor(getString("uncheckedThumbColor")),
  `uncheckedTrackColor` = parseComposeColor(getString("uncheckedTrackColor")),
  `uncheckedBorderColor` = parseComposeColor(getString("uncheckedBorderColor")),
  `uncheckedIconColor` = parseComposeColor(getString("uncheckedIconColor")),
  `disabledCheckedThumbColor` = parseComposeColor(getString("disabledCheckedThumbColor")),
  `disabledCheckedTrackColor` = parseComposeColor(getString("disabledCheckedTrackColor")),
  `disabledCheckedBorderColor` = parseComposeColor(getString("disabledCheckedBorderColor")),
  `disabledCheckedIconColor` = parseComposeColor(getString("disabledCheckedIconColor")),
  `disabledUncheckedThumbColor` = parseComposeColor(getString("disabledUncheckedThumbColor")),
  `disabledUncheckedTrackColor` = parseComposeColor(getString("disabledUncheckedTrackColor")),
  `disabledUncheckedBorderColor` = parseComposeColor(getString("disabledUncheckedBorderColor")),
  `disabledUncheckedIconColor` = parseComposeColor(getString("disabledUncheckedIconColor")),
)

internal fun JSONObject.decodeComposeTextFieldColorsValue(): androidx.compose.material3.TextFieldColors = androidx.compose.material3.TextFieldColors(
  `focusedTextColor` = parseComposeColor(getString("focusedTextColor")),
  `unfocusedTextColor` = parseComposeColor(getString("unfocusedTextColor")),
  `disabledTextColor` = parseComposeColor(getString("disabledTextColor")),
  `errorTextColor` = parseComposeColor(getString("errorTextColor")),
  `focusedContainerColor` = parseComposeColor(getString("focusedContainerColor")),
  `unfocusedContainerColor` = parseComposeColor(getString("unfocusedContainerColor")),
  `disabledContainerColor` = parseComposeColor(getString("disabledContainerColor")),
  `errorContainerColor` = parseComposeColor(getString("errorContainerColor")),
  `cursorColor` = parseComposeColor(getString("cursorColor")),
  `errorCursorColor` = parseComposeColor(getString("errorCursorColor")),
  `textSelectionColors` = getJSONObject("textSelectionColors").decodeComposeTextSelectionColorsValue(),
  `focusedIndicatorColor` = parseComposeColor(getString("focusedIndicatorColor")),
  `unfocusedIndicatorColor` = parseComposeColor(getString("unfocusedIndicatorColor")),
  `disabledIndicatorColor` = parseComposeColor(getString("disabledIndicatorColor")),
  `errorIndicatorColor` = parseComposeColor(getString("errorIndicatorColor")),
  `focusedLeadingIconColor` = parseComposeColor(getString("focusedLeadingIconColor")),
  `unfocusedLeadingIconColor` = parseComposeColor(getString("unfocusedLeadingIconColor")),
  `disabledLeadingIconColor` = parseComposeColor(getString("disabledLeadingIconColor")),
  `errorLeadingIconColor` = parseComposeColor(getString("errorLeadingIconColor")),
  `focusedTrailingIconColor` = parseComposeColor(getString("focusedTrailingIconColor")),
  `unfocusedTrailingIconColor` = parseComposeColor(getString("unfocusedTrailingIconColor")),
  `disabledTrailingIconColor` = parseComposeColor(getString("disabledTrailingIconColor")),
  `errorTrailingIconColor` = parseComposeColor(getString("errorTrailingIconColor")),
  `focusedLabelColor` = parseComposeColor(getString("focusedLabelColor")),
  `unfocusedLabelColor` = parseComposeColor(getString("unfocusedLabelColor")),
  `disabledLabelColor` = parseComposeColor(getString("disabledLabelColor")),
  `errorLabelColor` = parseComposeColor(getString("errorLabelColor")),
  `focusedPlaceholderColor` = parseComposeColor(getString("focusedPlaceholderColor")),
  `unfocusedPlaceholderColor` = parseComposeColor(getString("unfocusedPlaceholderColor")),
  `disabledPlaceholderColor` = parseComposeColor(getString("disabledPlaceholderColor")),
  `errorPlaceholderColor` = parseComposeColor(getString("errorPlaceholderColor")),
  `focusedSupportingTextColor` = parseComposeColor(getString("focusedSupportingTextColor")),
  `unfocusedSupportingTextColor` = parseComposeColor(getString("unfocusedSupportingTextColor")),
  `disabledSupportingTextColor` = parseComposeColor(getString("disabledSupportingTextColor")),
  `errorSupportingTextColor` = parseComposeColor(getString("errorSupportingTextColor")),
  `focusedPrefixColor` = parseComposeColor(getString("focusedPrefixColor")),
  `unfocusedPrefixColor` = parseComposeColor(getString("unfocusedPrefixColor")),
  `disabledPrefixColor` = parseComposeColor(getString("disabledPrefixColor")),
  `errorPrefixColor` = parseComposeColor(getString("errorPrefixColor")),
  `focusedSuffixColor` = parseComposeColor(getString("focusedSuffixColor")),
  `unfocusedSuffixColor` = parseComposeColor(getString("unfocusedSuffixColor")),
  `disabledSuffixColor` = parseComposeColor(getString("disabledSuffixColor")),
  `errorSuffixColor` = parseComposeColor(getString("errorSuffixColor")),
)

internal fun JSONObject.decodeComposeToggleButtonColorsValue(): androidx.compose.material3.ToggleButtonColors = androidx.compose.material3.ToggleButtonColors(
  `containerColor` = parseComposeColor(getString("containerColor")),
  `contentColor` = parseComposeColor(getString("contentColor")),
  `disabledContainerColor` = parseComposeColor(getString("disabledContainerColor")),
  `disabledContentColor` = parseComposeColor(getString("disabledContentColor")),
  `checkedContainerColor` = parseComposeColor(getString("checkedContainerColor")),
  `checkedContentColor` = parseComposeColor(getString("checkedContentColor")),
)

internal fun JSONObject.decodeComposeWideNavigationRailColorsValue(): androidx.compose.material3.WideNavigationRailColors = androidx.compose.material3.WideNavigationRailColors(
  `containerColor` = parseComposeColor(getString("containerColor")),
  `contentColor` = parseComposeColor(getString("contentColor")),
  `modalContainerColor` = parseComposeColor(getString("modalContainerColor")),
  `modalScrimColor` = parseComposeColor(getString("modalScrimColor")),
)

internal fun JSONObject.decodeComposeOffset(): androidx.compose.ui.geometry.Offset = androidx.compose.ui.geometry.Offset(
  `x` = getDouble("x").toFloat(),
  `y` = getDouble("y").toFloat(),
)

internal fun JSONObject.decodeComposeTransformOrigin(): androidx.compose.ui.graphics.TransformOrigin = androidx.compose.ui.graphics.TransformOrigin(
  `pivotFractionX` = getDouble("pivotFractionX").toFloat(),
  `pivotFractionY` = getDouble("pivotFractionY").toFloat(),
)

internal fun JSONObject.decodeComposeDpTouchBoundsExpansionValue(): androidx.compose.ui.node.DpTouchBoundsExpansion = androidx.compose.ui.node.DpTouchBoundsExpansion(
  `start` = getDouble("start").dp,
  `top` = getDouble("top").dp,
  `end` = getDouble("end").dp,
  `bottom` = getDouble("bottom").dp,
  `isLayoutDirectionAware` = getBoolean("isLayoutDirectionAware"),
)

internal fun JSONObject.decodeComposeBaselineShiftValue(): androidx.compose.ui.text.style.BaselineShift = androidx.compose.ui.text.style.BaselineShift(
  `multiplier` = getDouble("multiplier").toFloat(),
)

internal fun JSONObject.decodeComposeTextIndentValue(): androidx.compose.ui.text.style.TextIndent = when ((if (has("firstLine")) 1 else 0) + (if (has("restLine")) 2 else 0)) {
  0 -> androidx.compose.ui.text.style.TextIndent()
  1 -> androidx.compose.ui.text.style.TextIndent(`firstLine` = getDouble("firstLine").sp)
  2 -> androidx.compose.ui.text.style.TextIndent(`restLine` = getDouble("restLine").sp)
  3 -> androidx.compose.ui.text.style.TextIndent(`firstLine` = getDouble("firstLine").sp, `restLine` = getDouble("restLine").sp)
  else -> error("Invalid generated arguments for ComposeTextIndentValue")
}

internal fun JSONObject.decodeComposeDpOffset(): androidx.compose.ui.unit.DpOffset = androidx.compose.ui.unit.DpOffset(
  `x` = getDouble("x").dp,
  `y` = getDouble("y").dp,
)

internal fun JSONObject.decodeComposeIntOffset(): androidx.compose.ui.unit.IntOffset = androidx.compose.ui.unit.IntOffset(
  `x` = getInt("x"),
  `y` = getInt("y"),
)
