import { useCallback, useId, useMemo, useState } from "react";

import type {
  ComposeBottomSheetScaffoldState, ComposeLazyState, ComposeModalSheetState, ComposePagerState, ComposeScrollState,
  ComposeTopAppBarScrollBehavior, ComposeTopAppBarScrollMode,
} from "./composeValues";

type HandleCommand<Operation extends string> = {
  revision: number;
  operation: Operation;
  target?: number;
  offsetPx?: number;
};

type NativeHandle<Kind extends string, Operation extends string> = {
  readonly kind: Kind;
  readonly token: string;
  readonly command?: HandleCommand<Operation>;
};

function useNativeHandle<Kind extends string, Operation extends string>(kind: Kind) {
  const token = useId();
  const [command, setCommand] = useState<HandleCommand<Operation>>();
  const send = useCallback((operation: Operation, target?: number, offsetPx?: number) => {
    setCommand(previous => ({ revision: (previous?.revision ?? 0) + 1, operation, target, offsetPx }));
  }, []);
  const value = useMemo<NativeHandle<Kind, Operation>>(() => ({ kind, token, command }), [kind, token, command]);
  return [value, send] as const;
}

type FocusCommand = "request" | "capture" | "free";
export type ComposeFocusRequester = NativeHandle<"focusRequester", FocusCommand> & {
  requestFocus(): void;
  captureFocus(): void;
  freeFocus(): void;
};

/** Pass the current handle to Modifier.focusRequester before the focus target. */
export function useFocusRequester(): ComposeFocusRequester {
  const [value, send] = useNativeHandle<"focusRequester", FocusCommand>("focusRequester");
  return useMemo(() => ({
    ...value,
    requestFocus: () => send("request"),
    captureFocus: () => send("capture"),
    freeFocus: () => send("free"),
  }), [value, send]);
}

export type ComposeBringIntoViewRequester = NativeHandle<"bringIntoViewRequester", "bringIntoView"> & {
  bringIntoView(): void;
};

/** Pass the current handle to Modifier.bringIntoViewRequester on a scrollable descendant. */
export function useBringIntoViewRequester(): ComposeBringIntoViewRequester {
  const [value, send] = useNativeHandle<"bringIntoViewRequester", "bringIntoView">("bringIntoViewRequester");
  return useMemo(() => ({ ...value, bringIntoView: () => send("bringIntoView") }), [value, send]);
}

export type ComposeInteractionSource = NativeHandle<"interactionSource", never>;

/** Share one native interaction source between modifiers and components in a Compose host. */
export function useInteractionSource(): ComposeInteractionSource {
  return useHandleToken("interactionSource");
}

export type ComposeLayoutBoundsHolder = NativeHandle<"layoutBoundsHolder", never>;
export type ComposePullToRefreshState = NativeHandle<"pullToRefreshState", never>;

export type ComposeSliderOptions = {
  initialValue?: number;
  valueRange?: readonly [number, number];
  steps?: number;
};
export type ComposeSliderState = NativeHandle<"sliderState", never> & ComposeSliderOptions;
export type ComposeRangeSliderOptions = {
  initialRange?: readonly [number, number];
  valueRange?: readonly [number, number];
  steps?: number;
};
export type ComposeRangeSliderState = NativeHandle<"rangeSliderState", never> & ComposeRangeSliderOptions;

function useHandleToken<Kind extends string>(kind: Kind): NativeHandle<Kind, never> {
  const token = useId();
  return useMemo(() => ({ kind, token }), [kind, token]);
}

/** Attach the same holder to a viewport and the visibility observer, within one host. */
export function useLayoutBoundsHolder(): ComposeLayoutBoundsHolder {
  return useHandleToken("layoutBoundsHolder");
}

/** Share pull-to-refresh state between a gesture modifier and its indicator. */
export function usePullToRefreshState(): ComposePullToRefreshState {
  return useHandleToken("pullToRefreshState");
}

/** The initial options are applied when the native state first mounts. */
export function useSliderState(options: ComposeSliderOptions = {}): ComposeSliderState {
  const handle = useHandleToken("sliderState");
  return { ...handle, ...options };
}

/** The initial options are applied when the native state first mounts. */
export function useRangeSliderState(options: ComposeRangeSliderOptions = {}): ComposeRangeSliderState {
  const handle = useHandleToken("rangeSliderState");
  return { ...handle, ...options };
}

type ScrollCommand = "scroll" | "animate";
type SheetCommand = "show" | "hide" | "expand" | "partialExpand";

export type ComposeLazyStateHandle = ComposeLazyState & NativeHandle<"lazy", ScrollCommand> & {
  scrollToItem(index: number, offsetPx?: number): void;
  animateScrollToItem(index: number, offsetPx?: number): void;
};
export type ComposePagerStateHandle = ComposePagerState & NativeHandle<"pager", ScrollCommand> & {
  scrollToPage(index: number): void;
  animateScrollToPage(index: number): void;
};
export type ComposeScrollStateHandle = ComposeScrollState & NativeHandle<"scroll", ScrollCommand> & {
  scrollTo(offsetPx: number): void;
  animateScrollTo(offsetPx: number): void;
};

function scrollPosition(value: number): number {
  if (!Number.isInteger(value) || value < 0 || value > 0x7fffffff) {
    throw new RangeError("Compose scroll positions must be nonnegative 32-bit integers");
  }
  return value;
}

/** Attach a handle to a single lazy list or grid via its state prop. */
export function useLazyListState(options: ComposeLazyState = {}): ComposeLazyStateHandle {
  const [handle, send] = useNativeHandle<"lazy", ScrollCommand>("lazy");
  const actions = useMemo(() => ({
    scrollToItem: (index: number, offsetPx = 0) => send("scroll", scrollPosition(index), scrollPosition(offsetPx)),
    animateScrollToItem: (index: number, offsetPx = 0) => send("animate", scrollPosition(index), scrollPosition(offsetPx)),
  }), [send]);
  return { ...options, ...handle, ...actions };
}

export function usePagerState(options: ComposePagerState = {}): ComposePagerStateHandle {
  const [handle, send] = useNativeHandle<"pager", ScrollCommand>("pager");
  const actions = useMemo(() => ({
    scrollToPage: (index: number) => send("scroll", scrollPosition(index)),
    animateScrollToPage: (index: number) => send("animate", scrollPosition(index)),
  }), [send]);
  return { ...options, ...handle, ...actions };
}

export function useScrollState(options: ComposeScrollState = {}): ComposeScrollStateHandle {
  const [handle, send] = useNativeHandle<"scroll", ScrollCommand>("scroll");
  const actions = useMemo(() => ({
    scrollTo: (offsetPx: number) => send("scroll", scrollPosition(offsetPx)),
    animateScrollTo: (offsetPx: number) => send("animate", scrollPosition(offsetPx)),
  }), [send]);
  return { ...options, ...handle, ...actions };
}

type SheetActions = {
  show(): void;
  hide(): void;
  expand(): void;
  partialExpand(): void;
};
export type ComposeModalSheetStateHandle = ComposeModalSheetState & NativeHandle<"sheet", SheetCommand> & SheetActions;
export type ComposeBottomSheetScaffoldStateHandle = ComposeBottomSheetScaffoldState &
  NativeHandle<"sheetScaffold", SheetCommand> & SheetActions;

function useSheetCommands<Kind extends "sheet" | "sheetScaffold">(kind: Kind) {
  const [handle, send] = useNativeHandle<Kind, SheetCommand>(kind);
  const actions = useMemo(() => ({
    show: () => send("show"),
    hide: () => send("hide"),
    expand: () => send("expand"),
    partialExpand: () => send("partialExpand"),
  }), [send]);
  return { ...handle, ...actions };
}

export function useModalBottomSheetState(options: ComposeModalSheetState = {}): ComposeModalSheetStateHandle {
  return { ...options, ...useSheetCommands("sheet") };
}

export function useBottomSheetScaffoldState(options: ComposeBottomSheetScaffoldState = {}): ComposeBottomSheetScaffoldStateHandle {
  return { ...options, ...useSheetCommands("sheetScaffold") };
}

export type ComposeValueSnapshot<Value extends string> = { currentValue: Value; targetValue: Value };
type ObservedValue<Value extends string> = { onStateChange?: (state: ComposeValueSnapshot<Value>) => void };

export type ComposeDrawerValue = "closed" | "open";
export type ComposeDrawerStateOptions = ObservedValue<ComposeDrawerValue> & { initialValue?: ComposeDrawerValue };
export type ComposeDrawerStateHandle = ComposeDrawerStateOptions & NativeHandle<"drawer", "open" | "close"> & {
  open(): void;
  close(): void;
};

/** A navigation drawer's state: pass it to ModalNavigationDrawer, DismissibleNavigationDrawer or a drawer sheet. */
export function useDrawerState(options: ComposeDrawerStateOptions = {}): ComposeDrawerStateHandle {
  const [handle, send] = useNativeHandle<"drawer", "open" | "close">("drawer");
  const actions = useMemo(() => ({ open: () => send("open"), close: () => send("close") }), [send]);
  return { ...options, ...handle, ...actions };
}

export type ComposeWideNavigationRailValue = "collapsed" | "expanded";
export type ComposeWideNavigationRailStateOptions = ObservedValue<ComposeWideNavigationRailValue> & {
  initialValue?: ComposeWideNavigationRailValue;
};
type RailCommand = "expand" | "collapse" | "toggle";
export type ComposeWideNavigationRailStateHandle = ComposeWideNavigationRailStateOptions &
  NativeHandle<"wideNavigationRail", RailCommand> & { expand(): void; collapse(): void; toggle(): void };

export function useWideNavigationRailState(
  options: ComposeWideNavigationRailStateOptions = {},
): ComposeWideNavigationRailStateHandle {
  const [handle, send] = useNativeHandle<"wideNavigationRail", RailCommand>("wideNavigationRail");
  const actions = useMemo(() => ({
    expand: () => send("expand"), collapse: () => send("collapse"), toggle: () => send("toggle"),
  }), [send]);
  return { ...options, ...handle, ...actions };
}

/** Pass the same behavior to a top app bar and Modifier.nestedScroll in one Compose host. */
export function useTopAppBarScrollBehavior(mode: ComposeTopAppBarScrollMode = "enterAlways"): ComposeTopAppBarScrollBehavior {
  const token = useId();
  return useMemo(() => ({ kind: "topAppBarScroll", token, mode }), [token, mode]);
}
