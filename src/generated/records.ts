// Generated from Compose value factories by generate.mjs.
import type { ComposeBlendModeValue } from "./values";

export type ComposeMarqueeSpacingValue = { spacing: number };

export type ComposeTextAutoSizeValue =
  | { factory: "TextAutoSize.StepBased"; minFontSize?: number; maxFontSize?: number; stepSize?: number }
;

export type ComposeTextSelectionColorsValue = { handleColor: string; backgroundColor: string };

export type ComposeButtonColorsValue = { containerColor: string; contentColor: string; disabledContainerColor: string; disabledContentColor: string };

export type ComposeButtonElevationValue =
  | { factory: "ButtonDefaults.buttonElevation"; defaultElevation?: number; pressedElevation?: number; focusedElevation?: number; hoveredElevation?: number; disabledElevation?: number }
  | { factory: "ButtonDefaults.elevatedButtonElevation"; defaultElevation?: number; pressedElevation?: number; focusedElevation?: number; hoveredElevation?: number; disabledElevation?: number }
  | { factory: "ButtonDefaults.filledTonalButtonElevation"; defaultElevation?: number; pressedElevation?: number; focusedElevation?: number; hoveredElevation?: number; disabledElevation?: number }
;

export type ComposeButtonShapesValue =
  | { factory: "ButtonDefaults.shapesFor"; buttonHeight: number }
;

export type ComposeCardColorsValue = { containerColor: string; contentColor: string; disabledContainerColor: string; disabledContentColor: string };

export type ComposeCardElevationValue =
  | { factory: "CardDefaults.cardElevation"; defaultElevation?: number; pressedElevation?: number; focusedElevation?: number; hoveredElevation?: number; draggedElevation?: number; disabledElevation?: number }
  | { factory: "CardDefaults.elevatedCardElevation"; defaultElevation?: number; pressedElevation?: number; focusedElevation?: number; hoveredElevation?: number; draggedElevation?: number; disabledElevation?: number }
  | { factory: "CardDefaults.outlinedCardElevation"; defaultElevation?: number; pressedElevation?: number; focusedElevation?: number; hoveredElevation?: number; draggedElevation?: number; disabledElevation?: number }
;

export type ComposeCheckboxColorsValue = { checkedCheckmarkColor: string; uncheckedCheckmarkColor: string; checkedBoxColor: string; uncheckedBoxColor: string; disabledCheckedBoxColor: string; disabledUncheckedBoxColor: string; disabledIndeterminateBoxColor: string; checkedBorderColor: string; uncheckedBorderColor: string; disabledBorderColor: string; disabledUncheckedBorderColor: string; disabledIndeterminateBorderColor: string };

export type ComposeChipColorsValue = { containerColor: string; labelColor: string; leadingIconContentColor: string; trailingIconContentColor: string; disabledContainerColor: string; disabledLabelColor: string; disabledLeadingIconContentColor: string; disabledTrailingIconContentColor: string };

export type ComposeChipElevationValue = { elevation: number; pressedElevation: number; focusedElevation: number; hoveredElevation: number; draggedElevation: number; disabledElevation: number };

export type ComposeDatePickerColorsValue = { containerColor: string; titleContentColor: string; headlineContentColor: string; weekdayContentColor: string; subheadContentColor: string; navigationContentColor: string; yearContentColor: string; disabledYearContentColor: string; currentYearContentColor: string; selectedYearContentColor: string; disabledSelectedYearContentColor: string; selectedYearContainerColor: string; disabledSelectedYearContainerColor: string; dayContentColor: string; disabledDayContentColor: string; selectedDayContentColor: string; disabledSelectedDayContentColor: string; selectedDayContainerColor: string; disabledSelectedDayContainerColor: string; todayContentColor: string; todayDateBorderColor: string; dayInSelectionRangeContainerColor: string; dayInSelectionRangeContentColor: string; dividerColor: string; dateTextFieldColors: ComposeTextFieldColorsValue };

export type ComposeDragHandleColorsValue = { color: string; pressedColor: string; draggedColor: string };

export type ComposeFloatingActionButtonElevationValue =
  | { factory: "FloatingActionButtonDefaults.bottomAppBarFabElevation"; defaultElevation?: number; pressedElevation?: number; focusedElevation?: number; hoveredElevation?: number }
  | { factory: "FloatingActionButtonDefaults.elevation"; defaultElevation?: number; pressedElevation?: number; focusedElevation?: number; hoveredElevation?: number }
  | { factory: "FloatingActionButtonDefaults.loweredElevation"; defaultElevation?: number; pressedElevation?: number; focusedElevation?: number; hoveredElevation?: number }
;

export type ComposeFloatingToolbarColorsValue = { toolbarContainerColor: string; toolbarContentColor: string; fabContainerColor: string; fabContentColor: string };

export type ComposeIconButtonColorsValue = { containerColor: string; contentColor: string; disabledContainerColor: string; disabledContentColor: string };

export type ComposeIconToggleButtonColorsValue = { containerColor: string; contentColor: string; disabledContainerColor: string; disabledContentColor: string; checkedContainerColor: string; checkedContentColor: string };

export type ComposeListItemColorsValue = { containerColor: string; headlineColor: string; leadingIconColor: string; overlineColor: string; supportingTextColor: string; trailingIconColor: string; disabledHeadlineColor: string; disabledLeadingIconColor: string; disabledTrailingIconColor: string };

export type ComposeMenuItemColorsValue = { textColor: string; leadingIconColor: string; trailingIconColor: string; disabledTextColor: string; disabledLeadingIconColor: string; disabledTrailingIconColor: string };

export type ComposeMotionSchemeValue =
  | { factory: "MotionScheme.expressive" }
  | { factory: "MotionScheme.standard" }
;

export type ComposeNavigationBarItemColorsValue = { selectedIconColor: string; selectedTextColor: string; selectedIndicatorColor: string; unselectedIconColor: string; unselectedTextColor: string; disabledIconColor: string; disabledTextColor: string };

export type ComposeNavigationItemColorsValue = { selectedIconColor: string; selectedTextColor: string; selectedIndicatorColor: string; unselectedIconColor: string; unselectedTextColor: string; disabledIconColor: string; disabledTextColor: string };

export type ComposeNavigationRailItemColorsValue = { selectedIconColor: string; selectedTextColor: string; selectedIndicatorColor: string; unselectedIconColor: string; unselectedTextColor: string; disabledIconColor: string; disabledTextColor: string };

export type ComposeRadioButtonColorsValue = { selectedColor: string; unselectedColor: string; disabledSelectedColor: string; disabledUnselectedColor: string };

export type ComposeRichTooltipColorsValue = { containerColor: string; contentColor: string; titleContentColor: string; actionContentColor: string };

export type ComposeSearchBarColorsValue = { containerColor: string; dividerColor: string; inputFieldColors: ComposeTextFieldColorsValue };

export type ComposeSegmentedButtonColorsValue = { activeContainerColor: string; activeContentColor: string; activeBorderColor: string; inactiveContainerColor: string; inactiveContentColor: string; inactiveBorderColor: string; disabledActiveContainerColor: string; disabledActiveContentColor: string; disabledActiveBorderColor: string; disabledInactiveContainerColor: string; disabledInactiveContentColor: string; disabledInactiveBorderColor: string };

export type ComposeSelectableChipElevationValue = { elevation: number; pressedElevation: number; focusedElevation: number; hoveredElevation: number; draggedElevation: number; disabledElevation: number };

export type ComposeSliderColorsValue = { thumbColor: string; activeTrackColor: string; activeTickColor: string; inactiveTrackColor: string; inactiveTickColor: string; disabledThumbColor: string; disabledActiveTrackColor: string; disabledActiveTickColor: string; disabledInactiveTrackColor: string; disabledInactiveTickColor: string };

export type ComposeSplitButtonShapesValue =
  | { factory: "SplitButtonDefaults.leadingButtonShapesFor"; buttonHeight: number }
  | { factory: "SplitButtonDefaults.trailingButtonShapesFor"; buttonHeight: number }
;

export type ComposeSwitchColorsValue = { checkedThumbColor: string; checkedTrackColor: string; checkedBorderColor: string; checkedIconColor: string; uncheckedThumbColor: string; uncheckedTrackColor: string; uncheckedBorderColor: string; uncheckedIconColor: string; disabledCheckedThumbColor: string; disabledCheckedTrackColor: string; disabledCheckedBorderColor: string; disabledCheckedIconColor: string; disabledUncheckedThumbColor: string; disabledUncheckedTrackColor: string; disabledUncheckedBorderColor: string; disabledUncheckedIconColor: string };

export type ComposeTextFieldColorsValue = { focusedTextColor: string; unfocusedTextColor: string; disabledTextColor: string; errorTextColor: string; focusedContainerColor: string; unfocusedContainerColor: string; disabledContainerColor: string; errorContainerColor: string; cursorColor: string; errorCursorColor: string; textSelectionColors: ComposeTextSelectionColorsValue; focusedIndicatorColor: string; unfocusedIndicatorColor: string; disabledIndicatorColor: string; errorIndicatorColor: string; focusedLeadingIconColor: string; unfocusedLeadingIconColor: string; disabledLeadingIconColor: string; errorLeadingIconColor: string; focusedTrailingIconColor: string; unfocusedTrailingIconColor: string; disabledTrailingIconColor: string; errorTrailingIconColor: string; focusedLabelColor: string; unfocusedLabelColor: string; disabledLabelColor: string; errorLabelColor: string; focusedPlaceholderColor: string; unfocusedPlaceholderColor: string; disabledPlaceholderColor: string; errorPlaceholderColor: string; focusedSupportingTextColor: string; unfocusedSupportingTextColor: string; disabledSupportingTextColor: string; errorSupportingTextColor: string; focusedPrefixColor: string; unfocusedPrefixColor: string; disabledPrefixColor: string; errorPrefixColor: string; focusedSuffixColor: string; unfocusedSuffixColor: string; disabledSuffixColor: string; errorSuffixColor: string };

export type ComposeTimePickerColorsValue = { clockDialColor: string; selectorColor: string; containerColor: string; periodSelectorBorderColor: string; clockDialSelectedContentColor: string; clockDialUnselectedContentColor: string; periodSelectorSelectedContainerColor: string; periodSelectorUnselectedContainerColor: string; periodSelectorSelectedContentColor: string; periodSelectorUnselectedContentColor: string; timeSelectorSelectedContainerColor: string; timeSelectorUnselectedContainerColor: string; timeSelectorSelectedContentColor: string; timeSelectorUnselectedContentColor: string };

export type ComposeToggleButtonColorsValue = { containerColor: string; contentColor: string; disabledContainerColor: string; disabledContentColor: string; checkedContainerColor: string; checkedContentColor: string };

export type ComposeToggleButtonShapesValue =
  | { factory: "ToggleButtonDefaults.shapesFor"; buttonHeight: number }
;

export type ComposeTopAppBarColorsValue = { containerColor: string; scrolledContainerColor: string; navigationIconContentColor: string; titleContentColor: string; actionIconContentColor: string; subtitleContentColor: string };

export type ComposeWideNavigationRailColorsValue = { containerColor: string; contentColor: string; modalContainerColor: string; modalScrimColor: string };

export type ComposeOffset = { x: number; y: number };

export type ComposeColorFilterValue =
  | { factory: "ColorFilter.lighting"; multiply: string; add: string }
  | { factory: "ColorFilter.tint"; color: string; blendMode?: ComposeBlendModeValue }
;

export type ComposeTransformOrigin = { pivotFractionX: number; pivotFractionY: number };

export type ComposeDpTouchBoundsExpansionValue = { start: number; top: number; end: number; bottom: number; isLayoutDirectionAware: boolean };

export type ComposeBaselineShiftValue = { multiplier: number };

export type ComposeTextIndentValue = { firstLine?: number; restLine?: number };

export type ComposeDpOffset = { x: number; y: number };

export type ComposeIntOffset = { x: number; y: number };
