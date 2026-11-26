// Generated from Compose CompositionLocals by generate.mjs.
import type { ComposeDensityValue, ComposeLocaleListValue, ComposeRippleConfigurationValue, ComposeTextSelectionColorsValue } from "./records";
import type { ComposeTextStyle } from "../../utils/composeValues";
import type { ComposeLayoutDirectionOption } from "./enums";

/** A value for one CompositionLocal, named by its Kotlin property. */
export type ComposeProvidedValue =
  | { local: "LocalTextSelectionColors"; value: ComposeTextSelectionColorsValue }
  | { local: "LocalAbsoluteTonalElevation"; value: number }
  | { local: "LocalContentColor"; value: string }
  | { local: "LocalMinimumInteractiveComponentSize"; value: number }
  | { local: "LocalRippleConfiguration"; value: ComposeRippleConfigurationValue | null }
  | { local: "LocalTextStyle"; value: ComposeTextStyle }
  | { local: "LocalTonalElevationEnabled"; value: boolean }
  | { local: "LocalCursorBlinkEnabled"; value: boolean }
  | { local: "LocalDensity"; value: ComposeDensityValue }
  | { local: "LocalInspectionMode"; value: boolean }
  | { local: "LocalLayoutDirection"; value: ComposeLayoutDirectionOption }
  | { local: "LocalProvidableLocaleList"; value: ComposeLocaleListValue }
;
