// Generated from Compose value factories by generate.mjs.
import type { ComposeBlendModeValue, ComposeBlurredEdgeTreatmentValue, ComposeBreadthValue, ComposeCompositingStrategyValue, ComposeFillValue, ComposeFloatingToolbarExitDirectionValue, ComposeFontStyleValue, ComposeFontSynthesisValue, ComposeFontWeight, ComposeHorizontalAlignment, ComposeHyphensValue, ComposeImageBitmapConfigValue, ComposeLineBreakValue, ComposeLineHeightStyleModeValue, ComposeLineHeightStyleTrimValue, ComposeMenuAnchorPositionValue, ComposeNavigationSuiteScaffoldValueOption, ComposePaneAdaptedValueValue, ComposePaneExpansionStateKeyValue, ComposePlatformParagraphStyleValue, ComposePlatformSpanStyleValue, ComposeSecureFlagPolicyOption, ComposeShadowsValue, ComposeStrokeCapValue, ComposeStrokeJoinValue, ComposeTextAlign, ComposeTextDecorationValue, ComposeTextDirectionValue, ComposeTextMotionValue, ComposeTileModeValue } from "./enums";
import type { ComposeBrush, ComposeShape } from "../../utils/modifier";
import type { ComposeDpSize, ComposeTextStyle } from "../../utils/composeValues";

export type ComposeSharedTransitionScopeOverlayClipValue =
  | { factory: "OverlayClip"; clipShape: ComposeShape }
;

export type ComposeMarqueeSpacingValue = { spacing: number };

export type ComposeLazyLayoutCacheWindowValue =
  | { factory: "LazyLayoutCacheWindow"; ahead?: number; behind?: number; isNonScrollCachingEnabled?: boolean }
  | { factory: "LazyLayoutCacheWindow"; aheadFraction?: number; behindFraction?: number; isNonScrollCachingEnabled?: boolean }
;

export type ComposeCornerBasedShapeValue =
  | { factory: "AbsoluteCutCornerShape"; corner: ComposeCornerSizeValue }
  | { factory: "AbsoluteCutCornerShape"; size: number }
  | { factory: "AbsoluteCutCornerShape"; percent: number }
  | { factory: "AbsoluteCutCornerShape"; topLeft?: number; topRight?: number; bottomRight?: number; bottomLeft?: number }
  | { factory: "AbsoluteCutCornerShape"; topLeftPercent?: number; topRightPercent?: number; bottomRightPercent?: number; bottomLeftPercent?: number }
  | { factory: "AbsoluteRoundedCornerShape"; corner: ComposeCornerSizeValue }
  | { factory: "AbsoluteRoundedCornerShape"; size: number }
  | { factory: "AbsoluteRoundedCornerShape"; percent: number }
  | { factory: "AbsoluteRoundedCornerShape"; topLeft?: number; topRight?: number; bottomRight?: number; bottomLeft?: number }
  | { factory: "AbsoluteRoundedCornerShape"; topLeftPercent?: number; topRightPercent?: number; bottomRightPercent?: number; bottomLeftPercent?: number }
  | { factory: "CutCornerShape"; corner: ComposeCornerSizeValue }
  | { factory: "CutCornerShape"; size: number }
  | { factory: "CutCornerShape"; percent: number }
  | { factory: "CutCornerShape"; topStart?: number; topEnd?: number; bottomEnd?: number; bottomStart?: number }
  | { factory: "CutCornerShape"; topStartPercent?: number; topEndPercent?: number; bottomEndPercent?: number; bottomStartPercent?: number }
  | { factory: "RoundedCornerShape"; corner: ComposeCornerSizeValue }
  | { factory: "RoundedCornerShape"; size: number }
  | { factory: "RoundedCornerShape"; percent: number }
  | { factory: "RoundedCornerShape"; topStart?: number; topEnd?: number; bottomEnd?: number; bottomStart?: number }
  | { factory: "RoundedCornerShape"; topStartPercent?: number; topEndPercent?: number; bottomEndPercent?: number; bottomStartPercent?: number }
;

export type ComposeCornerSizeValue =
  | { factory: "CornerSize"; size: number }
  | { factory: "CornerSize"; percent: number }
;

export type ComposeAppearanceScopeBlock = { background?: ComposeFillValue; border?: ComposeFillValue; borderWidth?: number; dropShadow?: ComposeShadowsValue; foreground?: ComposeFillValue; innerShadow?: ComposeShadowsValue; shape?: ComposeShape };

export type ComposePlacementModifierScopeBlock = { bottom?: number; height?: ComposeBreadthValue; left?: number; maxHeight?: number; maxWidth?: number; minHeight?: number; minWidth?: number; right?: number; top?: number; width?: ComposeBreadthValue };

export type ComposeTextAutoSizeValue =
  | { factory: "TextAutoSize.StepBased"; minFontSize?: number; maxFontSize?: number; stepSize?: number }
;

export type ComposeSelectionStateValue =
  | { factory: "rememberSelectionState" }
;

export type ComposeTextSelectionColorsValue = { handleColor: string; backgroundColor: string };

export type ComposeAppBarWithSearchColorsValue = { searchBarColors: ComposeSearchBarColorsValue; scrolledSearchBarContainerColor: string; appBarContainerColor: string; scrolledAppBarContainerColor: string; appBarNavigationIconColor: string; appBarActionIconColor: string };

export type ComposeBottomAppBarScrollBehaviorValue =
  | { factory: "BottomAppBarDefaults.exitAlwaysScrollBehavior"; state?: ComposeBottomAppBarStateValue }
;

export type ComposeBottomAppBarStateValue = { initialHeightOffsetLimit?: number; initialHeightOffset?: number; initialContentOffset?: number };

export type ComposeButtonColorsValue = { containerColor: string; contentColor: string; disabledContainerColor: string; disabledContentColor: string };

export type ComposeButtonElevationValue =
  | { factory: "ButtonDefaults.buttonElevation"; defaultElevation?: number; pressedElevation?: number; focusedElevation?: number; hoveredElevation?: number; disabledElevation?: number }
  | { factory: "ButtonDefaults.elevatedButtonElevation"; defaultElevation?: number; pressedElevation?: number; focusedElevation?: number; hoveredElevation?: number; disabledElevation?: number }
  | { factory: "ButtonDefaults.filledTonalButtonElevation"; defaultElevation?: number; pressedElevation?: number; focusedElevation?: number; hoveredElevation?: number; disabledElevation?: number }
;

export type ComposeButtonShapesValue = { shape: ComposeShape; pressedShape: ComposeShape };

export type ComposeCardColorsValue = { containerColor: string; contentColor: string; disabledContainerColor: string; disabledContentColor: string };

export type ComposeCardElevationValue =
  | { factory: "CardDefaults.cardElevation"; defaultElevation?: number; pressedElevation?: number; focusedElevation?: number; hoveredElevation?: number; draggedElevation?: number; disabledElevation?: number }
  | { factory: "CardDefaults.elevatedCardElevation"; defaultElevation?: number; pressedElevation?: number; focusedElevation?: number; hoveredElevation?: number; draggedElevation?: number; disabledElevation?: number }
  | { factory: "CardDefaults.outlinedCardElevation"; defaultElevation?: number; pressedElevation?: number; focusedElevation?: number; hoveredElevation?: number; draggedElevation?: number; disabledElevation?: number }
;

export type ComposeCheckboxColorsValue = { checkedCheckmarkColor: string; uncheckedCheckmarkColor: string; checkedBoxColor: string; uncheckedBoxColor: string; disabledCheckedBoxColor: string; disabledUncheckedBoxColor: string; disabledIndeterminateBoxColor: string; checkedBorderColor: string; uncheckedBorderColor: string; disabledBorderColor: string; disabledUncheckedBorderColor: string; disabledIndeterminateBorderColor: string; disabledCheckmarkColor: string };

export type ComposeChipColorsValue = { containerColor: string; labelColor: string; leadingIconContentColor: string; trailingIconContentColor: string; disabledContainerColor: string; disabledLabelColor: string; disabledLeadingIconContentColor: string; disabledTrailingIconContentColor: string };

export type ComposeChipElevationValue = { elevation: number; pressedElevation: number; focusedElevation: number; hoveredElevation: number; draggedElevation: number; disabledElevation: number };

export type ComposeChipShapesValue = { shape: ComposeShape; selectedShape: ComposeShape; pressedShape?: ComposeShape };

export type ComposeDatePickerColorsValue = { containerColor: string; titleContentColor: string; headlineContentColor: string; weekdayContentColor: string; subheadContentColor: string; navigationContentColor: string; yearContentColor: string; disabledYearContentColor: string; currentYearContentColor: string; selectedYearContentColor: string; disabledSelectedYearContentColor: string; selectedYearContainerColor: string; disabledSelectedYearContainerColor: string; dayContentColor: string; disabledDayContentColor: string; selectedDayContentColor: string; disabledSelectedDayContentColor: string; selectedDayContainerColor: string; disabledSelectedDayContainerColor: string; todayContentColor: string; todayDateBorderColor: string; dayInSelectionRangeContainerColor: string; dayInSelectionRangeContentColor: string; dividerColor: string; dateTextFieldColors: ComposeTextFieldColorsValue };

export type ComposeDragHandleColorsValue = { color: string; pressedColor: string; draggedColor: string };

export type ComposeDragHandleShapesValue = { shape: ComposeShape; pressedShape: ComposeShape; draggedShape: ComposeShape };

export type ComposeDragHandleSizesValue = { size: ComposeDpSize; pressedSize: ComposeDpSize; draggedSize: ComposeDpSize };

export type ComposeDropdownMenuPopupPositionProviderValue =
  | { factory: "MenuDefaults.rememberDropdownMenuPopupPositionProvider"; dropdownMenuAnchorPosition: ComposeMenuAnchorPositionValue; offset?: ComposeDpOffset }
;

export type ComposeFloatingActionButtonElevationValue =
  | { factory: "FloatingActionButtonDefaults.bottomAppBarFabElevation"; defaultElevation?: number; pressedElevation?: number; focusedElevation?: number; hoveredElevation?: number }
  | { factory: "FloatingActionButtonDefaults.elevation"; defaultElevation?: number; pressedElevation?: number; focusedElevation?: number; hoveredElevation?: number }
  | { factory: "FloatingActionButtonDefaults.loweredElevation"; defaultElevation?: number; pressedElevation?: number; focusedElevation?: number; hoveredElevation?: number }
;

export type ComposeFloatingToolbarColorsValue = { toolbarContainerColor: string; toolbarContentColor: string; fabContainerColor: string; fabContentColor: string };

export type ComposeFloatingToolbarScrollBehaviorValue =
  | { factory: "FloatingToolbarDefaults.exitAlwaysScrollBehavior"; exitDirection: ComposeFloatingToolbarExitDirectionValue; state?: ComposeFloatingToolbarStateValue }
;

export type ComposeFloatingToolbarStateValue = { initialOffsetLimit: number; initialOffset: number; initialContentOffset: number };

export type ComposeIconButtonColorsValue = { containerColor: string; contentColor: string; disabledContainerColor: string; disabledContentColor: string };

export type ComposeIconButtonShapesValue = { shape: ComposeShape; pressedShape?: ComposeShape };

export type ComposeIconToggleButtonColorsValue = { containerColor: string; contentColor: string; disabledContainerColor: string; disabledContentColor: string; checkedContainerColor: string; checkedContentColor: string };

export type ComposeIconToggleButtonShapesValue = { shape: ComposeShape; pressedShape?: ComposeShape; checkedShape?: ComposeShape };

export type ComposeListItemColorsValue = { containerColor: string; contentColor: string; leadingContentColor: string; trailingContentColor: string; overlineContentColor: string; supportingContentColor: string; disabledContainerColor: string; disabledContentColor: string; disabledLeadingContentColor: string; disabledTrailingContentColor: string; disabledOverlineContentColor: string; disabledSupportingContentColor: string; selectedContainerColor: string; selectedContentColor: string; selectedLeadingContentColor: string; selectedTrailingContentColor: string; selectedOverlineContentColor: string; selectedSupportingContentColor: string; draggedContainerColor: string; draggedContentColor: string; draggedLeadingContentColor: string; draggedTrailingContentColor: string; draggedOverlineContentColor: string; draggedSupportingContentColor: string };

export type ComposeListItemElevationValue = { elevation: number; draggedElevation: number };

export type ComposeListItemShapesValue = { shape: ComposeShape; selectedShape: ComposeShape; pressedShape: ComposeShape; focusedShape: ComposeShape; hoveredShape: ComposeShape; draggedShape: ComposeShape };

export type ComposeMenuGroupShapesValue = { shape: ComposeShape; inactiveShape: ComposeShape };

export type ComposeMenuItemColorsValue =
  | { factory: "MenuDefaults.itemColors"; textColor?: string; leadingIconColor?: string; trailingIconColor?: string; disabledTextColor?: string; disabledLeadingIconColor?: string; disabledTrailingIconColor?: string }
  | { factory: "MenuDefaults.itemVibrantColors"; textColor?: string; leadingIconColor?: string; trailingIconColor?: string; disabledTextColor?: string; disabledLeadingIconColor?: string; disabledTrailingIconColor?: string }
;

export type ComposeMenuItemShapesValue = { shape: ComposeShape; selectedShape: ComposeShape };

export type ComposeModalBottomSheetPropertiesValue = { isAppearanceLightStatusBars: boolean; isAppearanceLightNavigationBars: boolean; securePolicy?: ComposeSecureFlagPolicyOption; shouldDismissOnBackPress?: boolean; shouldDismissOnClickOutside?: boolean };

export type ComposeModalWideNavigationRailPropertiesValue = { securePolicy?: ComposeSecureFlagPolicyOption; shouldDismissOnBackPress?: boolean };

export type ComposeMotionSchemeValue =
  | { factory: "MotionScheme.expressive" }
  | { factory: "MotionScheme.standard" }
;

export type ComposeNavigationBarItemColorsValue = { selectedIconColor: string; selectedTextColor: string; selectedIndicatorColor: string; unselectedIconColor: string; unselectedTextColor: string; disabledIconColor: string; disabledTextColor: string };

export type ComposeNavigationItemColorsValue = { selectedIconColor: string; selectedTextColorTopIconPosition: string; selectedTextColorStartIconPosition: string; selectedIndicatorColor: string; unselectedIconColor: string; unselectedTextColor: string; disabledIconColor: string; disabledTextColor: string };

export type ComposeNavigationRailItemColorsValue = { selectedIconColor: string; selectedTextColor: string; selectedIndicatorColor: string; unselectedIconColor: string; unselectedTextColor: string; disabledIconColor: string; disabledTextColor: string };

export type ComposeRadioButtonColorsValue = { selectedColor: string; unselectedColor: string; disabledSelectedColor: string; disabledUnselectedColor: string };

export type ComposeRichTooltipColorsValue = { containerColor: string; contentColor: string; titleContentColor: string; actionContentColor: string };

export type ComposeRippleConfigurationValue = { color?: string };

export type ComposeScrollFieldColorsValue = { containerColor: string; contentColor: string; selectedContentColor: string; disabledContainerColor: string; disabledContentColor: string; disabledSelectedContentColor: string };

export type ComposeScrollFieldStateValue =
  | { factory: "rememberScrollFieldState"; itemCount: number; index?: number }
;

export type ComposeSearchBarColorsValue = { containerColor: string; dividerColor: string; inputFieldColors: ComposeTextFieldColorsValue };

export type ComposeSearchBarScrollBehaviorValue =
  | { factory: "SearchBarDefaults.enterAlwaysSearchBarScrollBehavior"; reverseLayout?: boolean }
;

export type ComposeSegmentedButtonColorsValue = { activeContainerColor: string; activeContentColor: string; activeBorderColor: string; inactiveContainerColor: string; inactiveContentColor: string; inactiveBorderColor: string; disabledActiveContainerColor: string; disabledActiveContentColor: string; disabledActiveBorderColor: string; disabledInactiveContainerColor: string; disabledInactiveContentColor: string; disabledInactiveBorderColor: string };

export type ComposeSelectableChipColorsValue = { containerColor: string; labelColor: string; leadingIconColor: string; trailingIconColor: string; disabledContainerColor: string; disabledLabelColor: string; disabledLeadingIconColor: string; disabledTrailingIconColor: string; selectedContainerColor: string; disabledSelectedContainerColor: string; selectedLabelColor: string; selectedLeadingIconColor: string; selectedTrailingIconColor: string };

export type ComposeSelectableChipElevationValue = { elevation: number; pressedElevation: number; focusedElevation: number; hoveredElevation: number; draggedElevation: number; disabledElevation: number };

export type ComposeSelectableMenuItemColorsValue = { textColor: string; containerColor: string; leadingIconColor: string; trailingContentColor: string; disabledTextColor: string; disabledContainerColor: string; disabledLeadingIconColor: string; disabledTrailingContentColor: string; selectedTextColor: string; selectedContainerColor: string; selectedLeadingIconColor: string; selectedTrailingContentColor: string };

export type ComposeShapesValue = { extraSmall?: ComposeCornerBasedShapeValue; small?: ComposeCornerBasedShapeValue; medium?: ComposeCornerBasedShapeValue; large?: ComposeCornerBasedShapeValue; extraLarge?: ComposeCornerBasedShapeValue; largeIncreased?: ComposeCornerBasedShapeValue; extraLargeIncreased?: ComposeCornerBasedShapeValue; extraExtraLarge?: ComposeCornerBasedShapeValue };

export type ComposeSliderColorsValue = { thumbColor: string; activeTrackColor: string; activeTickColor: string; inactiveTrackColor: string; inactiveTickColor: string; disabledThumbColor: string; disabledActiveTrackColor: string; disabledActiveTickColor: string; disabledInactiveTrackColor: string; disabledInactiveTickColor: string };

export type ComposeSplitButtonShapesValue = { shape: ComposeShape; pressedShape: ComposeShape | null; checkedShape: ComposeShape | null };

export type ComposeSwitchColorsValue = { checkedThumbColor: string; checkedTrackColor: string; checkedBorderColor: string; checkedIconColor: string; uncheckedThumbColor: string; uncheckedTrackColor: string; uncheckedBorderColor: string; uncheckedIconColor: string; disabledCheckedThumbColor: string; disabledCheckedTrackColor: string; disabledCheckedBorderColor: string; disabledCheckedIconColor: string; disabledUncheckedThumbColor: string; disabledUncheckedTrackColor: string; disabledUncheckedBorderColor: string; disabledUncheckedIconColor: string };

export type ComposeTextFieldColorsValue = { focusedTextColor: string; unfocusedTextColor: string; disabledTextColor: string; errorTextColor: string; focusedContainerColor: string; unfocusedContainerColor: string; disabledContainerColor: string; errorContainerColor: string; cursorColor: string; errorCursorColor: string; textSelectionColors: ComposeTextSelectionColorsValue; focusedIndicatorColor: string; unfocusedIndicatorColor: string; disabledIndicatorColor: string; errorIndicatorColor: string; focusedLeadingIconColor: string; unfocusedLeadingIconColor: string; disabledLeadingIconColor: string; errorLeadingIconColor: string; focusedTrailingIconColor: string; unfocusedTrailingIconColor: string; disabledTrailingIconColor: string; errorTrailingIconColor: string; focusedLabelColor: string; unfocusedLabelColor: string; disabledLabelColor: string; errorLabelColor: string; focusedPlaceholderColor: string; unfocusedPlaceholderColor: string; disabledPlaceholderColor: string; errorPlaceholderColor: string; focusedSupportingTextColor: string; unfocusedSupportingTextColor: string; disabledSupportingTextColor: string; errorSupportingTextColor: string; focusedPrefixColor: string; unfocusedPrefixColor: string; disabledPrefixColor: string; errorPrefixColor: string; focusedSuffixColor: string; unfocusedSuffixColor: string; disabledSuffixColor: string; errorSuffixColor: string };

export type ComposeTextFieldLabelPositionValue =
  | { factory: "TextFieldLabelPosition.Above"; alignment?: ComposeHorizontalAlignment }
  | { factory: "TextFieldLabelPosition.Cutout"; isAlwaysMinimized?: boolean; minimizedAlignment?: ComposeHorizontalAlignment; expandedAlignment?: ComposeHorizontalAlignment }
  | { factory: "TextFieldLabelPosition.Inside"; isAlwaysMinimized?: boolean; minimizedAlignment?: ComposeHorizontalAlignment; expandedAlignment?: ComposeHorizontalAlignment }
;

export type ComposeTimeInputColorsValue = { containerColor: string; periodSelectorBorderColor: string; periodSelectorSelectedContainerColor: string; periodSelectorContainerColor: string; periodSelectorSelectedContentColor: string; periodSelectorContentColor: string; timeTextFieldColors: ComposeTextFieldColorsValue };

export type ComposeTimePickerColorsValue = { clockDialColor: string; selectorColor: string; containerColor: string; periodSelectorBorderColor: string; clockDialSelectedContentColor: string; clockDialContentColor: string; periodSelectorSelectedContainerColor: string; periodSelectorContainerColor: string; periodSelectorSelectedContentColor: string; periodSelectorContentColor: string; timeSelectorSelectedContainerColor: string; timeSelectorContainerColor: string; timeSelectorSelectedContentColor: string; timeSelectorContentColor: string };

export type ComposeTimePickerShapesValue = { timeFieldShape: ComposeShape; periodSelectorShape: ComposeShape };

export type ComposeToggleButtonColorsValue = { containerColor: string; contentColor: string; disabledContainerColor: string; disabledContentColor: string; checkedContainerColor: string; checkedContentColor: string };

export type ComposeToggleButtonElevationValue =
  | { factory: "ElevatedToggleButtonDefaults.elevation"; defaultElevation?: number; pressedElevation?: number; focusedElevation?: number; hoveredElevation?: number; disabledElevation?: number }
  | { factory: "FilledTonalToggleButtonDefaults.elevation"; defaultElevation?: number; pressedElevation?: number; focusedElevation?: number; hoveredElevation?: number; disabledElevation?: number }
  | { factory: "ToggleButtonDefaults.elevation"; defaultElevation?: number; pressedElevation?: number; focusedElevation?: number; hoveredElevation?: number; disabledElevation?: number }
;

export type ComposeToggleButtonShapesValue = { shape: ComposeShape; pressedShape: ComposeShape; checkedShape: ComposeShape };

export type ComposeTopAppBarColorsValue = { containerColor: string; scrolledContainerColor: string; navigationIconContentColor: string; titleContentColor: string; actionIconContentColor: string; subtitleContentColor: string };

export type ComposeTypographyValue = { displayLarge?: ComposeTextStyle; displayMedium?: ComposeTextStyle; displaySmall?: ComposeTextStyle; headlineLarge?: ComposeTextStyle; headlineMedium?: ComposeTextStyle; headlineSmall?: ComposeTextStyle; titleLarge?: ComposeTextStyle; titleMedium?: ComposeTextStyle; titleSmall?: ComposeTextStyle; bodyLarge?: ComposeTextStyle; bodyMedium?: ComposeTextStyle; bodySmall?: ComposeTextStyle; labelLarge?: ComposeTextStyle; labelMedium?: ComposeTextStyle; labelSmall?: ComposeTextStyle; displayLargeEmphasized?: ComposeTextStyle; displayMediumEmphasized?: ComposeTextStyle; displaySmallEmphasized?: ComposeTextStyle; headlineLargeEmphasized?: ComposeTextStyle; headlineMediumEmphasized?: ComposeTextStyle; headlineSmallEmphasized?: ComposeTextStyle; titleLargeEmphasized?: ComposeTextStyle; titleMediumEmphasized?: ComposeTextStyle; titleSmallEmphasized?: ComposeTextStyle; bodyLargeEmphasized?: ComposeTextStyle; bodyMediumEmphasized?: ComposeTextStyle; bodySmallEmphasized?: ComposeTextStyle; labelLargeEmphasized?: ComposeTextStyle; labelMediumEmphasized?: ComposeTextStyle; labelSmallEmphasized?: ComposeTextStyle };

export type ComposeWideNavigationRailColorsValue = { containerColor: string; contentColor: string; modalContainerColor: string; modalScrimColor: string; modalContentColor: string };

export type ComposePaneExpansionStateValue =
  | { factory: "rememberPaneExpansionState"; key?: ComposePaneExpansionStateKeyValue; initialAnchoredIndex?: number }
;

export type ComposePaneScaffoldDirectiveValue = { maxHorizontalPartitions: number; horizontalPartitionSpacerSize: number; maxVerticalPartitions: number; verticalPartitionSpacerSize: number; defaultPanePreferredWidth: number; defaultPanePreferredHeight: number; excludedBounds: readonly ComposeRectValue[]; shouldAutoFocusCurrentDestination: boolean };

export type ComposeThreePaneScaffoldValueValue = { primary: ComposePaneAdaptedValueValue; secondary: ComposePaneAdaptedValueValue; tertiary: ComposePaneAdaptedValueValue };

export type ComposeNavigationSuiteScaffoldStateValue =
  | { factory: "rememberNavigationSuiteScaffoldState"; initialValue?: ComposeNavigationSuiteScaffoldValueOption }
;

export type ComposeBlurScopeBlock = { alpha?: number; blurRadiusSpec?: ComposeBlurRadiusSpecValue; edgeTreatment?: ComposeBlurredEdgeTreatmentValue };

export type ComposeDropShadowScopeBlock = { alpha?: number; blendMode?: ComposeBlendModeValue; brush?: ComposeBrush | null; color?: string; offset?: ComposeOffset; radius?: number; spread?: number };

export type ComposeInnerShadowScopeBlock = { alpha?: number; blendMode?: ComposeBlendModeValue; brush?: ComposeBrush | null; color?: string; offset?: ComposeOffset; radius?: number; spread?: number };

export type ComposeOffset = { x: number; y: number };

export type ComposeRectValue = { left: number; top: number; right: number; bottom: number };

export type ComposeBrushValue =
  | { factory: "Brush.composite"; dstBrush: ComposeBrush; srcBrush: ComposeBrush; blendMode: ComposeBlendModeValue }
  | { factory: "Brush.horizontalGradient"; colors: readonly string[]; startX?: number; endX?: number; tileMode?: ComposeTileModeValue }
  | { factory: "Brush.linearGradient"; colors: readonly string[]; start?: ComposeOffset; end?: ComposeOffset; tileMode?: ComposeTileModeValue }
  | { factory: "Brush.radialGradient"; colors: readonly string[]; center?: ComposeOffset; radius?: number; tileMode?: ComposeTileModeValue }
  | { factory: "Brush.sweepGradient"; colors: readonly string[]; center?: ComposeOffset }
  | { factory: "Brush.verticalGradient"; colors: readonly string[]; startY?: number; endY?: number; tileMode?: ComposeTileModeValue }
;

export type ComposeColorFilterValue =
  | { factory: "ColorFilter.lighting"; multiply: string; add: string }
  | { factory: "ColorFilter.tint"; color: string; blendMode?: ComposeBlendModeValue }
;

export type ComposeGraphicsLayerScopeBlock = { alpha?: number; ambientShadowColor?: string; blendMode?: ComposeBlendModeValue; cameraDistance?: number; clip?: boolean; colorFilter?: ComposeColorFilterValue | null; compositingStrategy?: ComposeCompositingStrategyValue; outsets?: ComposeLayerOutsetsValue; rotationX?: number; rotationY?: number; rotationZ?: number; scaleX?: number; scaleY?: number; shadowElevation?: number; shape?: ComposeShape; spotShadowColor?: string; transformOrigin?: ComposeTransformOrigin; translationX?: number; translationY?: number };

export type ComposeImageBitmapValue = { width: number; height: number; config?: ComposeImageBitmapConfigValue; hasAlpha?: boolean };

export type ComposeLayerOutsetsValue = { left?: number; top?: number; right?: number; bottom?: number };

export type ComposeShadowValue = { color?: string; offset?: ComposeOffset; blurRadius?: number };

export type ComposeShapeValue =
  | { factory: "AbsoluteCutCornerShape"; corner: ComposeCornerSizeValue }
  | { factory: "AbsoluteCutCornerShape"; size: number }
  | { factory: "AbsoluteCutCornerShape"; percent: number }
  | { factory: "AbsoluteCutCornerShape"; topLeft?: number; topRight?: number; bottomRight?: number; bottomLeft?: number }
  | { factory: "AbsoluteCutCornerShape"; topLeftPercent?: number; topRightPercent?: number; bottomRightPercent?: number; bottomLeftPercent?: number }
  | { factory: "AbsoluteRoundedCornerShape"; corner: ComposeCornerSizeValue }
  | { factory: "AbsoluteRoundedCornerShape"; size: number }
  | { factory: "AbsoluteRoundedCornerShape"; percent: number }
  | { factory: "AbsoluteRoundedCornerShape"; topLeft?: number; topRight?: number; bottomRight?: number; bottomLeft?: number }
  | { factory: "AbsoluteRoundedCornerShape"; topLeftPercent?: number; topRightPercent?: number; bottomRightPercent?: number; bottomLeftPercent?: number }
  | { factory: "CutCornerShape"; corner: ComposeCornerSizeValue }
  | { factory: "CutCornerShape"; size: number }
  | { factory: "CutCornerShape"; percent: number }
  | { factory: "CutCornerShape"; topStart?: number; topEnd?: number; bottomEnd?: number; bottomStart?: number }
  | { factory: "CutCornerShape"; topStartPercent?: number; topEndPercent?: number; bottomEndPercent?: number; bottomStartPercent?: number }
  | { factory: "RoundedCornerShape"; corner: ComposeCornerSizeValue }
  | { factory: "RoundedCornerShape"; size: number }
  | { factory: "RoundedCornerShape"; percent: number }
  | { factory: "RoundedCornerShape"; topStart?: number; topEnd?: number; bottomEnd?: number; bottomStart?: number }
  | { factory: "RoundedCornerShape"; topStartPercent?: number; topEndPercent?: number; bottomEndPercent?: number; bottomStartPercent?: number }
;

export type ComposeTransformOrigin = { pivotFractionX: number; pivotFractionY: number };

export type ComposeBlurRadiusSpecValue =
  | { factory: "BlurRadiusSpec.horizontalGradient"; startRadius: number; endRadius: number }
  | { factory: "BlurRadiusSpec.horizontalGradient"; stops: readonly ComposeBlurStopValue[] }
  | { factory: "BlurRadiusSpec.linearGradient"; start: ComposeDpOffset; end: ComposeDpOffset; startRadius: number; endRadius: number }
  | { factory: "BlurRadiusSpec.linearGradient"; start: ComposeDpOffset; end: ComposeDpOffset; stops: readonly ComposeBlurStopValue[] }
  | { factory: "BlurRadiusSpec.radialGradient"; startRadius: number; endRadius: number; center?: ComposeDpOffset; fallOffRadius?: number }
  | { factory: "BlurRadiusSpec.radialGradient"; stops: readonly ComposeBlurStopValue[]; center?: ComposeDpOffset; fallOffRadius?: number }
  | { factory: "BlurRadiusSpec.uniform"; radius: number }
  | { factory: "BlurRadiusSpec.verticalGradient"; startRadius: number; endRadius: number }
  | { factory: "BlurRadiusSpec.verticalGradient"; stops: readonly ComposeBlurStopValue[] }
;

export type ComposeBlurStopValue = { fraction: number; radius: number };

export type ComposeStrokeValue = { width?: number; miter?: number; cap?: ComposeStrokeCapValue; join?: ComposeStrokeJoinValue };

export type ComposeDpTouchBoundsExpansionValue = { start: number; top: number; end: number; bottom: number; isLayoutDirectionAware: boolean };

export type ComposeParagraphStyleValue = { textAlign?: ComposeTextAlign; textDirection?: ComposeTextDirectionValue; lineHeight?: number; textIndent?: ComposeTextIndentValue | null; platformStyle?: ComposePlatformParagraphStyleValue | null; lineHeightStyle?: ComposeLineHeightStyleValue | null; lineBreak?: ComposeLineBreakValue; hyphens?: ComposeHyphensValue; textMotion?: ComposeTextMotionValue | null };

export type ComposePlatformTextStyleValue = { spanStyle: ComposePlatformSpanStyleValue | null; paragraphStyle: ComposePlatformParagraphStyleValue | null };

export type ComposeSpanStyleValue = { color?: string; fontSize?: number; fontWeight?: ComposeFontWeight | null; fontStyle?: ComposeFontStyleValue | null; fontSynthesis?: ComposeFontSynthesisValue | null; fontFamily?: ComposeFontFamilyValue | null; fontFeatureSettings?: string | null; letterSpacing?: number; baselineShift?: ComposeBaselineShiftValue | null; textGeometricTransform?: ComposeTextGeometricTransformValue | null; localeList?: ComposeLocaleListValue | null; background?: string; textDecoration?: ComposeTextDecorationValue | null; shadow?: ComposeShadowValue | null; platformStyle?: ComposePlatformSpanStyleValue | null };

export type ComposeTextStyleValue = { color?: string; fontSize?: number; fontWeight?: ComposeFontWeight | null; fontStyle?: ComposeFontStyleValue | null; fontSynthesis?: ComposeFontSynthesisValue | null; fontFamily?: ComposeFontFamilyValue | null; fontFeatureSettings?: string | null; letterSpacing?: number; baselineShift?: ComposeBaselineShiftValue | null; textGeometricTransform?: ComposeTextGeometricTransformValue | null; localeList?: ComposeLocaleListValue | null; background?: string; textDecoration?: ComposeTextDecorationValue | null; shadow?: ComposeShadowValue | null; textAlign?: ComposeTextAlign; textDirection?: ComposeTextDirectionValue; lineHeight?: number; textIndent?: ComposeTextIndentValue | null; platformStyle?: ComposePlatformTextStyleValue | null; lineHeightStyle?: ComposeLineHeightStyleValue | null; lineBreak?: ComposeLineBreakValue; hyphens?: ComposeHyphensValue; textMotion?: ComposeTextMotionValue | null };

export type ComposeDeviceFontFamilyNameValue = { name: string };

export type ComposeFontValue = { familyName: ComposeDeviceFontFamilyNameValue; weight?: ComposeFontWeight; style?: ComposeFontStyleValue };

export type ComposeFontFamilyValue = { fonts: readonly ComposeFontValue[] };

export type ComposeLocaleValue = { languageTag: string };

export type ComposeLocaleListValue = { localeList: readonly ComposeLocaleValue[] };

export type ComposeBaselineShiftValue = { multiplier: number };

export type ComposeLineHeightStyleValue = { alignment: ComposeLineHeightStyleAlignmentValue; trim: ComposeLineHeightStyleTrimValue; mode: ComposeLineHeightStyleModeValue };

export type ComposeLineHeightStyleAlignmentValue = { topRatio: number };

export type ComposeTextGeometricTransformValue = { scaleX?: number; skewX?: number };

export type ComposeTextIndentValue = { firstLine?: number; restLine?: number };

export type ComposeDensityValue = { density: number; fontScale?: number };

export type ComposeDpOffset = { x: number; y: number };

export type ComposeIntOffset = { x: number; y: number };
