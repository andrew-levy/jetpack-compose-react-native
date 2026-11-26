// Generated from Compose declarations by generate.mjs.
import type { ComposeSnackbarDurationOption } from "./enums";

export type ComposeSnackbarDataSnapshot = { readonly $handle: number; visuals: ComposeSnackbarVisualsSnapshot };
export type ComposeSnackbarHostStateSnapshot = { readonly $handle: number; currentSnackbarData: ComposeSnackbarDataSnapshot | null };
export type ComposeSnackbarVisualsSnapshot = { readonly $handle: number; actionLabel: string | null; duration: ComposeSnackbarDurationOption; message: string; withDismissAction: boolean };
export type ComposeTabPositionSnapshot = { readonly $handle: number; contentWidth: number; left: number; right: number; width: number };
export type ComposeDragToResizeStateSnapshot = { readonly $handle: number;  };
export type ComposePaneExpansionAnchorSnapshot = { readonly $handle: number;  };
export type ComposePaneExpansionStateSnapshot = { readonly $handle: number; currentAnchor: ComposePaneExpansionAnchorSnapshot | null };
